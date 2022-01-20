package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// 회원 서비스 구현체
@Component
public class MemberServiceImpl implements MemberService{

    // 해당 필드는 한번 선언 후 변경이 되면 안되기에 예를들어 갑자기 다른 구현체로 new ExternalMemeberRepository()를 하면
    // 비즈니스로직에 문제가 생기기에 final로 변경 못하게 못 박았음.
    // 이제는 memberRepository가 MeomoryMemberRepository를 몰라도 된다.
    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    // 테스트 용도
    public MemberRepository getMemberRepository(){
        return memberRepository;
    }
}

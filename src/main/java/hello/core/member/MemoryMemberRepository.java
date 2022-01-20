package hello.core.member;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

// 메모리 회원 저장소 구현체
@Component
public class MemoryMemberRepository implements MemberRepository{

    // static field로 선언하여 Class에서 바로 사용하게 할 수 있다.
    // 그리하여 해당 필드에 값을 계속 저장해서 꺼내 올 수도 있음 final이 아니라서.
    // db처럼 사용할 목적으로 만듬.
    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(),member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}

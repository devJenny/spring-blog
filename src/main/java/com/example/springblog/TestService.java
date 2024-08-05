package com.example.springblog;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TestService {

    private final MemberRepository memberRepository;

    public List<Member> getALlMembers() {
        return memberRepository.findAll();
    }
}

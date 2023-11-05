package com.mycompany.app.codeReuse;

import java.time.Duration;
import java.time.LocalDateTime;

/*
 * 개별 통화 기간을 저장하는 클래스
 */
public class Call {
    private LocalDateTime from; //통화 시작시간
    private LocalDateTime to; //통화 종료시간

    public Call(LocalDateTime from, LocalDateTime to){
        this.from = from;
        this.to = to;
    }

    public Duration getDuration(){
        return Duration.between(from, to);
    }

    public LocalDateTime getFrom(){
        return from;
    }
}

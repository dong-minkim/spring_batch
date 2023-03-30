package com.dutmdcjf.spring_boot_batch_service.core.advice.exception;

import com.dutmdcjf.spring_boot_batch_service.core.advice.code.ErrorCode;
import lombok.Getter;

@Getter
public class AdviceBaseException extends RuntimeException {
    private final ErrorCode errorCode;

    public AdviceBaseException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public AdviceBaseException(ErrorCode errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }
}

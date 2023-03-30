package com.dutmdcjf.spring_boot_batch_service.core.advice.exception;

import com.dutmdcjf.spring_boot_batch_service.core.advice.code.ErrorCode;

public class BatchJobException extends AdviseBaseException {
    public BatchJobException(ErrorCode errorCode) {
        super(errorCode);
    }

    public BatchJobException(ErrorCode errorCode, String message) {
        super(errorCode, message);
    }
}

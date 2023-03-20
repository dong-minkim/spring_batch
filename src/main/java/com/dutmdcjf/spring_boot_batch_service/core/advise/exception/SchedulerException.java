package com.dutmdcjf.spring_boot_batch_service.core.advise.exception;

import com.dutmdcjf.spring_boot_batch_service.core.advise.code.ErrorCode;

public class SchedulerException extends AdviseBaseException {
    public SchedulerException(ErrorCode errorCode) {
        super(errorCode);
    }

    public SchedulerException(ErrorCode errorCode, String message) {
        super(errorCode, message);
    }
}

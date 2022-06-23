package com.himart.backend.claim.utils.validator.concrete;

import com.himart.backend.claim.code.ClaimValidatorType;
import com.himart.backend.claim.dto.ClaimDto;
import com.himart.backend.claim.utils.validator.ClaimValidator;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class AcceptWithdrawalValidator extends ClaimValidator {

    @Override
    public void isValid(ClaimDto claimDto) throws Exception {
        log.info("파라미터 유효성 검증 로직을 진행한다.");

        super.isValidOrderdStatus(claimDto);
        super.isValidProductType(claimDto);
    }

    @Override
    public void verifyAmount(ClaimDto claimDto) throws Exception {
        log.info("금액검증 로직을 진행한다.");
        //UI 상의 취소 금액 = 주문금액 - 혜택금액 -배송비 = 취소금액
    }

    @Override
    public ClaimValidatorType getType() {
        return ClaimValidatorType.ACCEPT_WITHDRAWAL;
    }
}

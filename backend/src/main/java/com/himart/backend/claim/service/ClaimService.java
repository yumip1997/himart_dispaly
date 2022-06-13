package com.himart.backend.claim.service;

import com.himart.backend.claim.dto.ClaimDto;
import com.himart.backend.claim.utils.core.Claim;
import com.himart.backend.claim.utils.factory.ClaimFactory;
import com.himart.backend.claim.utils.factory.ClaimType;
import org.springframework.stereotype.Service;

@Service
public class ClaimService {
    /*
    요청 업무에 따른 클레임 객체를 생성한 후 클레임 로직을 수행한다.
     */
    public void claim(ClaimDto claimDto) throws Exception {
        Claim claim = ClaimFactory.getClaimByType(claimDto.getClaimType());
        claim.execute(claimDto);
    }
}

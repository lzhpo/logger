package com.lzhpo.logger.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author lzhpo
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ModifyOrderResponse implements Serializable {

    private Boolean success;
    private String orderId;
    private String userId;
    private String addressId;
}
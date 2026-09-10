package com.smartdigimkt.sdk.core.bridge.entity;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class LoadInfoEntity extends BaseInfoEntity {

    @DataField("bidding_result_info")
    private BiddingResultInfoEntity biddingResultInfoEntity;

    @DataField("offer_info")
    private OfferInfoEntity offerInfoEntity;

    @DataField("req_info")
    private RequestInfoEntity requestInfoEntity;
    private String validCheckMessage = null;

    public BiddingResultInfoEntity getBiddingResultInfoEntity() {
        return this.biddingResultInfoEntity;
    }

    public OfferInfoEntity getOfferInfoEntity() {
        return this.offerInfoEntity;
    }

    public RequestInfoEntity getRequestInfoEntity() {
        return this.requestInfoEntity;
    }

    public String getValidCheckMessage() {
        String str = this.validCheckMessage;
        if (str != null) {
            return str;
        }
        RequestInfoEntity requestInfoEntity = this.requestInfoEntity;
        if (requestInfoEntity == null) {
            this.validCheckMessage = "requestInfoEntity is empty";
            return "requestInfoEntity is empty";
        }
        int i2 = requestInfoEntity.networkFirmId;
        if (i2 == 66 || i2 == 67) {
            BiddingResultInfoEntity biddingResultInfoEntity = this.biddingResultInfoEntity;
            if (biddingResultInfoEntity == null) {
                this.validCheckMessage = "biddingResultInfoEntity is empty";
                return "biddingResultInfoEntity is empty";
            }
            if (TextUtils.isEmpty(biddingResultInfoEntity.token)) {
                this.validCheckMessage = "biddingResultInfoEntity.token is empty";
                return "biddingResultInfoEntity.token is empty";
            }
        }
        this.validCheckMessage = "";
        return "";
    }

    public boolean isValid() {
        return TextUtils.isEmpty(getValidCheckMessage());
    }
}

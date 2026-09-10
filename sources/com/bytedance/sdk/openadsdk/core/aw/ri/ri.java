package com.bytedance.sdk.openadsdk.core.aw.ri;

/* JADX INFO: loaded from: classes2.dex */
public enum ri {
    XML_PARSING_ERROR(100),
    SCHEMA_VALIDATION_ERROR(101),
    WRAPPER_TIMEOUT(301),
    NO_ADS_VAST_RESPONSE(303),
    GENERAL_LINEAR_AD_ERROR(400),
    GENERAL_COMPANION_AD_ERROR(600),
    UNDEFINED_ERROR(900);

    private final int mj;

    ri(int i) {
        this.mj = i;
    }

    public String ri() {
        return String.valueOf(this.mj);
    }
}

package com.bytedance.sdk.openadsdk.core.sLN.Lxb;

import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes2.dex */
public enum Lxb {
    XML_PARSING_ERROR(100),
    SCHEMA_VALIDATION_ERROR(101),
    WRAPPER_TIMEOUT(301),
    NO_ADS_VAST_RESPONSE(303),
    GENERAL_LINEAR_AD_ERROR(400),
    GENERAL_COMPANION_AD_ERROR(600),
    UNDEFINED_ERROR(TypedValues.Custom.TYPE_INT);

    private final int OY;

    Lxb(int i) {
        this.OY = i;
    }

    @NonNull
    public String Lxb() {
        return String.valueOf(this.OY);
    }
}

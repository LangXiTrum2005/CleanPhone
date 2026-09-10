package com.bytedance.sdk.openadsdk.core.fs.qdl;

import com.smartdigimkt.o1.b;
import com.smartdigimkt.sdk.basead.ui.BaseATView;

/* JADX INFO: loaded from: classes3.dex */
public enum qdl {
    XML_PARSING_ERROR(100),
    SCHEMA_VALIDATION_ERROR(101),
    WRAPPER_TIMEOUT(301),
    NO_ADS_VAST_RESPONSE(BaseATView.g.f38290N),
    GENERAL_LINEAR_AD_ERROR(400),
    GENERAL_COMPANION_AD_ERROR(600),
    UNDEFINED_ERROR(b.z1);

    private final int jpc;

    qdl(int i2) {
        this.jpc = i2;
    }

    public String qdl() {
        return String.valueOf(this.jpc);
    }
}

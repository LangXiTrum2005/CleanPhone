package com.bytedance.sdk.openadsdk.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
public interface PAGConstant {

    @Retention(RetentionPolicy.CLASS)
    public @interface PAGGDPRConsentType {
        public static final int PAG_GDPR_CONSENT_TYPE_CONSENT = 1;
        public static final int PAG_GDPR_CONSENT_TYPE_DEFAULT = -1;
        public static final int PAG_GDPR_CONSENT_TYPE_NO_CONSENT = 0;
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface PAGPAConsentType {
        public static final int PAG_PA_CONSENT_TYPE_CONSENT = 1;
        public static final int PAG_PA_CONSENT_TYPE_NO_CONSENT = 0;
    }
}

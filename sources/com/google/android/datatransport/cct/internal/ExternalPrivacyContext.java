package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ExternalPrivacyContext {

    public static abstract class Builder {
        public abstract ExternalPrivacyContext a();

        public abstract Builder b(ExternalPRequestContext externalPRequestContext);
    }

    public static Builder a() {
        return new AutoValue_ExternalPrivacyContext.Builder();
    }

    public abstract ExternalPRequestContext b();
}

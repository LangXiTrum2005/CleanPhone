package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ExperimentIds {

    public static abstract class Builder {
        public abstract ExperimentIds a();

        public abstract Builder b(byte[] bArr);

        public abstract Builder c(byte[] bArr);
    }

    public static Builder a() {
        return new AutoValue_ExperimentIds.Builder();
    }

    public abstract byte[] b();

    public abstract byte[] c();
}

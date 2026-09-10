package com.google.android.datatransport.runtime.backends;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BackendRequest {

    public static abstract class Builder {
        public abstract BackendRequest a();

        public abstract Builder b(ArrayList arrayList);

        public abstract Builder c(byte[] bArr);
    }

    public static Builder a() {
        return new AutoValue_BackendRequest.Builder();
    }

    public abstract Iterable b();

    public abstract byte[] c();
}

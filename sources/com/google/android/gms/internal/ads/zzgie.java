package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgie extends RuntimeException {
    public zzgie() {
        this(0);
    }

    public zzgie(int i2) {
        super(androidx.datastore.preferences.protobuf.a.g(i2, "r: ", new StringBuilder(String.valueOf(i2).length() + 3)));
    }

    public zzgie(int i2, Throwable th) {
        super("r: 2", th);
    }
}

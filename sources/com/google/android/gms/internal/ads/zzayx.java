package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzayx extends Exception {
    public zzayx(zzayy zzayyVar) {
        Objects.requireNonNull(zzayyVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzayx(zzayy zzayyVar, Throwable th) {
        super(th);
        Objects.requireNonNull(zzayyVar);
    }
}

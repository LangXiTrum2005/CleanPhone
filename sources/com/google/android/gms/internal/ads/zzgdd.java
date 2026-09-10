package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
final class zzgdd extends TimeoutException {
    public /* synthetic */ zzgdd(String str, zzgde zzgdeVar) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

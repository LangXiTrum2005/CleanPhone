package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class me1 extends TimeoutException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17405a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ me1(String str, int i10) {
        super(str);
        this.f17405a = i10;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int i10 = this.f17405a;
        synchronized (this) {
            switch (i10) {
                case 0:
                    setStackTrace(new StackTraceElement[0]);
                    return this;
                default:
                    setStackTrace(new StackTraceElement[0]);
                    return this;
            }
        }
    }
}

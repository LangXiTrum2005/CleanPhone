package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public e0(Throwable th2) {
        String simpleName = th2.getClass().getSimpleName();
        String strConcat = th2.getMessage() != null ? ": ".concat(String.valueOf(th2.getMessage())) : "";
        super(q4.a.j(new StringBuilder(strConcat.length() + simpleName.length() + 11), "Unexpected ", simpleName, strConcat), th2);
    }
}

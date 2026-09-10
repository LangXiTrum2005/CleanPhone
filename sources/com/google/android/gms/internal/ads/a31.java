package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f11819a;

    public a31(ExecutorService executorService) {
        this.f11819a = executorService;
    }

    public final z21 a(File file, byte[] bArr, d81 d81Var) {
        return new z21(file, this.f11819a, new o20(bArr), d81Var);
    }
}

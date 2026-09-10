package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f22476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f22477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y21 f22478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d81 f22479d;

    public z21(File file, ExecutorService executorService, y21 y21Var, d81 d81Var) {
        this.f22476a = file;
        this.f22477b = executorService;
        this.f22478c = y21Var;
        this.f22479d = d81Var;
    }

    public final pe1 a(Object obj) {
        return zw1.o(this.f22477b, new ze(10, this, obj));
    }
}

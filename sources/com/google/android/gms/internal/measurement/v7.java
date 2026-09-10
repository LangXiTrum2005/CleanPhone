package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v7 implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ v7 f24079b = new v7(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ v7 f24080c = new v7(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24081a;

    public /* synthetic */ v7(int i10) {
        this.f24081a = i10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f24081a) {
            case 0:
                qc qcVar = new qc("internal.platform", 4);
                qcVar.f23837b.put("getVersion", new qc("getVersion", 3));
                return qcVar;
            default:
                return null;
        }
    }
}

package com.ironsource;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f29768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f29769c;

    public /* synthetic */ mh(B b10, Map map, int i10) {
        this.f29767a = i10;
        this.f29768b = b10;
        this.f29769c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29767a) {
            case 0:
                B.a(this.f29768b, this.f29769c);
                break;
            default:
                B.b(this.f29768b, this.f29769c);
                break;
        }
    }
}

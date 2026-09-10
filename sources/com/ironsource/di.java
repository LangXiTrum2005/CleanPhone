package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class di implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ya f28486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LevelPlayAdInfo f28487c;

    public /* synthetic */ di(Ya ya2, LevelPlayAdInfo levelPlayAdInfo, int i10) {
        this.f28485a = i10;
        this.f28486b = ya2;
        this.f28487c = levelPlayAdInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28485a) {
            case 0:
                Ya.d(this.f28486b, this.f28487c);
                break;
            case 1:
                Ya.a(this.f28486b, this.f28487c);
                break;
            case 2:
                Ya.c(this.f28486b, this.f28487c);
                break;
            default:
                Ya.b(this.f28486b, this.f28487c);
                break;
        }
    }
}

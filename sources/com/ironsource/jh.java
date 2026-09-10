package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LevelPlayAdInfo f29006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Aa f29007c;

    public /* synthetic */ jh(LevelPlayAdInfo levelPlayAdInfo, Aa aa2, int i10) {
        this.f29005a = i10;
        this.f29006b = levelPlayAdInfo;
        this.f29007c = aa2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29005a) {
            case 0:
                Aa.a(this.f29006b, this.f29007c);
                break;
            case 1:
                Aa.d(this.f29006b, this.f29007c);
                break;
            case 2:
                Aa.b(this.f29006b, this.f29007c);
                break;
            case 3:
                Aa.e(this.f29006b, this.f29007c);
                break;
            default:
                Aa.c(this.f29006b, this.f29007c);
                break;
        }
    }
}

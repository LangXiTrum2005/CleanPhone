package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ei implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ya f28557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LevelPlayAdError f28558c;

    public /* synthetic */ ei(Ya ya2, LevelPlayAdError levelPlayAdError) {
        this.f28556a = 2;
        this.f28558c = levelPlayAdError;
        this.f28557b = ya2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28556a) {
            case 0:
                Ya.b(this.f28557b, this.f28558c);
                break;
            case 1:
                Ya.c(this.f28557b, this.f28558c);
                break;
            case 2:
                Ya.a(this.f28558c, this.f28557b);
                break;
            default:
                Ya.a(this.f28557b, this.f28558c);
                break;
        }
    }

    public /* synthetic */ ei(Ya ya2, LevelPlayAdError levelPlayAdError, int i10) {
        this.f28556a = i10;
        this.f28557b = ya2;
        this.f28558c = levelPlayAdError;
    }
}

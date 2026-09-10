package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ii implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0427kb f28915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LevelPlayAdInfo f28916c;

    public /* synthetic */ ii(C0427kb c0427kb, LevelPlayAdInfo levelPlayAdInfo, int i10) {
        this.f28914a = i10;
        this.f28915b = c0427kb;
        this.f28916c = levelPlayAdInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28914a) {
            case 0:
                C0427kb.b(this.f28915b, this.f28916c);
                break;
            default:
                C0427kb.a(this.f28915b, this.f28916c);
                break;
        }
    }
}

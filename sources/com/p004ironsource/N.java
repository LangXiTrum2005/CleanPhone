package com.p004ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class N implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ hm f24207Y;
    public final /* synthetic */ LevelPlayAdInfo Z;

    public /* synthetic */ N(hm hmVar, LevelPlayAdInfo levelPlayAdInfo, int i2) {
        this.X = i2;
        this.f24207Y = hmVar;
        this.Z = levelPlayAdInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                hm.b(this.f24207Y, this.Z);
                break;
            case 1:
                hm.c(this.f24207Y, this.Z);
                break;
            default:
                hm.a(this.f24207Y, this.Z);
                break;
        }
    }
}

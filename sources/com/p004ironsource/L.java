package com.p004ironsource;

import com.unity3d.mediation.LevelPlayAdError;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class L implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ LevelPlayAdError f24202Y;
    public final /* synthetic */ hm Z;

    public /* synthetic */ L(hm hmVar, LevelPlayAdError levelPlayAdError) {
        this.X = 1;
        this.f24202Y = levelPlayAdError;
        this.Z = hmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                hm.a(this.Z, this.f24202Y);
                break;
            case 1:
                hm.a(this.f24202Y, this.Z);
                break;
            case 2:
                hm.b(this.Z, this.f24202Y);
                break;
            default:
                hm.c(this.Z, this.f24202Y);
                break;
        }
    }

    public /* synthetic */ L(hm hmVar, LevelPlayAdError levelPlayAdError, int i2) {
        this.X = i2;
        this.Z = hmVar;
        this.f24202Y = levelPlayAdError;
    }
}

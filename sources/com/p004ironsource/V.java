package com.p004ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class V implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ LevelPlayAdInfo f24222Y;
    public final /* synthetic */ ml Z;

    public /* synthetic */ V(LevelPlayAdInfo levelPlayAdInfo, ml mlVar, int i2) {
        this.X = i2;
        this.f24222Y = levelPlayAdInfo;
        this.Z = mlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                ml.e(this.f24222Y, this.Z);
                break;
            case 1:
                ml.d(this.f24222Y, this.Z);
                break;
            case 2:
                ml.b(this.f24222Y, this.Z);
                break;
            case 3:
                ml.c(this.f24222Y, this.Z);
                break;
            default:
                ml.a(this.f24222Y, this.Z);
                break;
        }
    }
}

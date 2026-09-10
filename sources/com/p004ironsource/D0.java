package com.p004ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class D0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ qm f24188Y;
    public final /* synthetic */ LevelPlayAdInfo Z;

    public /* synthetic */ D0(qm qmVar, LevelPlayAdInfo levelPlayAdInfo, int i2) {
        this.X = i2;
        this.f24188Y = qmVar;
        this.Z = levelPlayAdInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                qm.b(this.f24188Y, this.Z);
                break;
            default:
                qm.a(this.f24188Y, this.Z);
                break;
        }
    }
}

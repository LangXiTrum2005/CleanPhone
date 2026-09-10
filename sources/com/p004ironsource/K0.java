package com.p004ironsource;

import android.content.Context;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.LevelPlayInitRequest;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class K0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ LevelPlayInitRequest f24201Y;
    public final /* synthetic */ ns Z;
    public final /* synthetic */ Context e0;
    public final /* synthetic */ ib f0;
    public final /* synthetic */ LevelPlayInitListener g0;

    public /* synthetic */ K0(LevelPlayInitRequest levelPlayInitRequest, ns nsVar, Context context, ib ibVar, LevelPlayInitListener levelPlayInitListener, int i2) {
        this.X = i2;
        this.f24201Y = levelPlayInitRequest;
        this.Z = nsVar;
        this.e0 = context;
        this.f0 = ibVar;
        this.g0 = levelPlayInitListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                wm.a.a(this.f24201Y, this.Z, this.e0, this.f0, this.g0);
                break;
            default:
                wm.b.a(this.f24201Y, this.Z, this.e0, this.f0, this.g0);
                break;
        }
    }
}

package com.p004ironsource;

import com.unity3d.mediation.LevelPlayInitListener;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class J0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ LevelPlayInitListener f24199Y;
    public final /* synthetic */ ib Z;
    public final /* synthetic */ ps e0;

    public /* synthetic */ J0(LevelPlayInitListener levelPlayInitListener, ib ibVar, ps psVar, int i2) {
        this.X = i2;
        this.f24199Y = levelPlayInitListener;
        this.Z = ibVar;
        this.e0 = psVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.X) {
            case 0:
                wm.a.a(this.f24199Y, this.Z, this.e0);
                break;
            default:
                wm.b.a(this.f24199Y, this.Z, this.e0);
                break;
        }
    }
}

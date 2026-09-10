package com.p004ironsource;

import com.p004ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.unity3d.mediation.LevelPlayInitListener;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class H0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f24196Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ H0(int i2, Object obj, Object obj2) {
        this.X = i2;
        this.f24196Y = obj;
        this.Z = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                tv.a((tv) this.f24196Y, (TestSuiteActivity) this.Z);
                break;
            case 1:
                wm.a((ps) this.f24196Y, (LevelPlayInitListener) this.Z);
                break;
            case 2:
                wm.a((LevelPlayInitListener) this.f24196Y, (fm) this.Z);
                break;
            case 3:
                wv.a((wv) this.f24196Y, (String) this.Z);
                break;
            default:
                x5.a((x5) this.f24196Y, (xw) this.Z);
                break;
        }
    }
}

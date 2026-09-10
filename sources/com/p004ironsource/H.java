package com.p004ironsource;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class H implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Context f24195Y;
    public final /* synthetic */ vs Z;
    public final /* synthetic */ ts e0;

    public /* synthetic */ H(Context context, vs vsVar, ts tsVar, int i2) {
        this.X = i2;
        this.f24195Y = context;
        this.Z = vsVar;
        this.e0 = tsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                ct.d(this.f24195Y, this.Z, this.e0);
                break;
            default:
                ct.b(this.f24195Y, this.Z, this.e0);
                break;
        }
    }
}

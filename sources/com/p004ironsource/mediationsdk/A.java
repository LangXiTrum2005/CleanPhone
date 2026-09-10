package com.p004ironsource.mediationsdk;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class A implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ AbstractAdapter f25706Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ List e0;

    public /* synthetic */ A(AbstractAdapter abstractAdapter, String str, List list, int i2) {
        this.X = i2;
        this.f25706Y = abstractAdapter;
        this.Z = str;
        this.e0 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                c.a(this.f25706Y, this.Z, this.e0);
                break;
            default:
                c.b(this.f25706Y, this.Z, this.e0);
                break;
        }
    }
}

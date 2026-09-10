package com.p004ironsource.mediationsdk;

import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class B implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ AdapterBaseInterface f25707Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ List e0;

    public /* synthetic */ B(AdapterBaseInterface adapterBaseInterface, String str, List list, int i2) {
        this.X = i2;
        this.f25707Y = adapterBaseInterface;
        this.Z = str;
        this.e0 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                c.a(this.f25707Y, this.Z, this.e0);
                break;
            default:
                c.b(this.f25707Y, this.Z, this.e0);
                break;
        }
    }
}

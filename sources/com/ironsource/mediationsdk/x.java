package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdapterBaseInterface f29763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f29764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f29765d;

    public /* synthetic */ x(AdapterBaseInterface adapterBaseInterface, String str, List list, int i10) {
        this.f29762a = i10;
        this.f29763b = adapterBaseInterface;
        this.f29764c = str;
        this.f29765d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29762a) {
            case 0:
                c.a(this.f29763b, this.f29764c, this.f29765d);
                break;
            default:
                c.b(this.f29763b, this.f29764c, this.f29765d);
                break;
        }
    }
}

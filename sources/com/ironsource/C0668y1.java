package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: renamed from: com.ironsource.y1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0668y1 extends AbstractC0437l3 {
    public C0668y1() {
        this.H = "outcome";
        this.G = 4;
        this.I = IronSourceConstants.APP_EVENT_TYPE;
        e();
    }

    @Override // com.ironsource.AbstractC0437l3
    public int c(C0654x5 c0654x5) {
        return 1;
    }

    @Override // com.ironsource.AbstractC0437l3
    public void d() {
    }

    @Override // com.ironsource.AbstractC0437l3
    public String e(int i10) {
        return "";
    }

    @Override // com.ironsource.AbstractC0437l3
    public boolean h(C0654x5 c0654x5) {
        return false;
    }

    @Override // com.ironsource.AbstractC0437l3
    public boolean j(C0654x5 c0654x5) {
        return false;
    }

    @Override // com.ironsource.AbstractC0437l3
    public boolean d(C0654x5 event) {
        kotlin.jvm.internal.n.f(event, "event");
        int iC = event.c();
        return iC == EnumC0672y5.FIRST_INSTANCE.b() || iC == EnumC0672y5.INIT_COMPLETE.b() || iC == EnumC0672y5.SDK_INIT_FAILED.b() || iC == EnumC0672y5.SDK_INIT_SUCCESS.b();
    }

    @Override // com.ironsource.AbstractC0437l3
    public void f(C0654x5 c0654x5) {
    }
}

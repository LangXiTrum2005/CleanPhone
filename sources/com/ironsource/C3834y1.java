package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3834y1 extends AbstractC3612l3 {
    public C3834y1() {
        this.H = "outcome";
        this.G = 4;
        this.I = IronSourceConstants.APP_EVENT_TYPE;
        e();
    }

    @Override // com.ironsource.AbstractC3612l3
    public int c(C3804w5 c3804w5) {
        return 1;
    }

    @Override // com.ironsource.AbstractC3612l3
    public void d() {
    }

    @Override // com.ironsource.AbstractC3612l3
    public String e(int i) {
        return "";
    }

    @Override // com.ironsource.AbstractC3612l3
    public boolean h(C3804w5 c3804w5) {
        return false;
    }

    @Override // com.ironsource.AbstractC3612l3
    public boolean j(C3804w5 c3804w5) {
        return false;
    }

    @Override // com.ironsource.AbstractC3612l3
    public boolean d(C3804w5 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int iC = event.c();
        return iC == EnumC3821x5.FIRST_INSTANCE.b() || iC == EnumC3821x5.INIT_COMPLETE.b() || iC == EnumC3821x5.SDK_INIT_FAILED.b() || iC == EnumC3821x5.SDK_INIT_SUCCESS.b();
    }

    @Override // com.ironsource.AbstractC3612l3
    public void f(C3804w5 c3804w5) {
    }
}

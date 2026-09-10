package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2013n6 implements InterfaceC0736Gg {
    public final /* synthetic */ N5 A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0736Gg
    public final void AAc() {
        String strA00 = this.A00.A03.A1e().A00();
        if (TextUtils.isEmpty(strA00)) {
            return;
        }
        C2.A0M(new C2(), this.A00.A04, C5.A00(strA00), this.A00.A7E());
    }

    public C2013n6(N5 n5) {
        this.A00 = n5;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0736Gg
    public final void AD1(LI li) {
        new Handler(Looper.getMainLooper()).postDelayed(new C2014n7(this, li), 1L);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0736Gg
    public final void ADH() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0736Gg
    public final void AFK(View view, MotionEvent motionEvent) {
    }
}

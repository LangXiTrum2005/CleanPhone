package com.facebook.ads.redexgen.core;

import android.content.Context;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@Deprecated
public final class C2795pE implements C5Y {
    public final Context A00;
    public final C5Y A01;
    public final InterfaceC11315t A02;

    public C2795pE(Context context, InterfaceC11315t interfaceC11315t, C5Y c5y) {
        this.A00 = context.getApplicationContext();
        this.A02 = interfaceC11315t;
        this.A01 = c5y;
    }

    public C2795pE(Context context, String str, InterfaceC11315t interfaceC11315t) {
        this(context, interfaceC11315t, new AO().A01(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.C5Y
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final AP A5I() {
        AP ap = new AP(this.A00, this.A01.A5I());
        if (this.A02 != null) {
            ap.A43(this.A02);
        }
        return ap;
    }
}

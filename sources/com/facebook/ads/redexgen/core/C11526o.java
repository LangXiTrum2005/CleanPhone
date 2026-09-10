package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C11526o extends E8 {
    public final /* synthetic */ C11446g A00;

    public C11526o(C11446g c11446g) {
        this.A00 = c11446g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.UN
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(E9 e9) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1857Yx(this));
    }
}

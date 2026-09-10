package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0704Fa implements View.OnClickListener {
    public final /* synthetic */ C0707Fd A00;

    public ViewOnClickListenerC0704Fa(C0707Fd c0707Fd) {
        this.A00 = c0707Fd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.A05.AE1();
            if (this.A00.A00 != null) {
                D3.A0J(this.A00.A00);
            }
            Iterator it = this.A00.A07.iterator();
            while (it.hasNext()) {
                D3.A0L((View) it.next(), 0);
            }
            D3.A0H(this.A00);
            if (this.A00.A06 == null) {
                return;
            }
            D3.A0L(this.A00.A06, 0);
            this.A00.A06.A0g(IP.A02, 14);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}

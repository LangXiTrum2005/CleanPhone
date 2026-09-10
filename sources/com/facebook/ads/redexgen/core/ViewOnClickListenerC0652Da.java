package com.facebook.ads.redexgen.core;

import android.view.View;
import com.facebook.ads.internal.view.FullScreenAdToolbar;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Da, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0652Da implements View.OnClickListener {
    public final /* synthetic */ FullScreenAdToolbar A00;

    public ViewOnClickListenerC0652Da(FullScreenAdToolbar fullScreenAdToolbar) {
        this.A00 = fullScreenAdToolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            if (this.A00.A02 == null || !this.A00.A09.A06()) {
                return;
            }
            this.A00.A02.AC5(this.A00);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}

package com.facebook.ads.redexgen.core;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2037fC implements View.OnClickListener {
    public final /* synthetic */ C1135Dd A00;

    public ViewOnClickListenerC2037fC(C1135Dd c1135Dd) {
        this.A00 = c1135Dd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A03.A04(VH.A0l, null);
            this.A00.A02.A0F().A3m();
            if (this.A00.A00 != null) {
                if (this.A00.A07()) {
                    this.A00.A00.setVolume(1.0f);
                } else {
                    this.A00.A00.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                this.A00.A09();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}

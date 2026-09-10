package com.facebook.ads.redexgen.core;

import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1139Dh implements InterfaceC2019eu {
    public View A00;
    public C1168Ek A01;
    public EnumC2034f9 A02;
    public boolean A03;
    public final Handler A04;
    public final EA A05;
    public final E4 A06;
    public final E2 A07;
    public final AbstractC1151Dt A08;
    public final boolean A09;
    public final boolean A0A;

    public C1139Dh(View view, EnumC2034f9 enumC2034f9, boolean z) {
        this(view, enumC2034f9, z, false);
    }

    public C1139Dh(View view, EnumC2034f9 enumC2034f9, boolean z, boolean z2) {
        this.A06 = new E4() { // from class: com.facebook.ads.redexgen.X.3p
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C4B c4b) {
                this.A00.A06(1, 0);
            }
        };
        this.A07 = new E2() { // from class: com.facebook.ads.redexgen.X.3n
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(E3 e3) {
                if (!this.A00.A03) {
                    return;
                }
                if (this.A00.A02 == EnumC2034f9.A02 || this.A00.A09) {
                    this.A00.A02 = null;
                    this.A00.A05();
                } else {
                    this.A00.A06(0, 8);
                }
            }
        };
        this.A05 = new EA() { // from class: com.facebook.ads.redexgen.X.3e
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C4K c4k) {
                if (this.A00.A02 == EnumC2034f9.A03) {
                    return;
                }
                this.A00.A00.setAlpha(1.0f);
                this.A00.A00.setVisibility(0);
            }
        };
        this.A08 = new C08953c(this);
        this.A03 = true;
        this.A04 = new Handler();
        this.A09 = z;
        this.A0A = z2;
        A08(view, enumC2034f9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        this.A00.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(500L).setListener(new C2033f8(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(int i, int i2) {
        this.A04.removeCallbacksAndMessages(null);
        this.A00.clearAnimation();
        this.A00.setAlpha(i);
        this.A00.setVisibility(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(AnimatorListenerAdapter animatorListenerAdapter) {
        this.A00.setVisibility(0);
        this.A00.animate().alpha(1.0f).setDuration(500L).setListener(animatorListenerAdapter);
    }

    private final void A08(View view, EnumC2034f9 enumC2034f9) {
        this.A02 = enumC2034f9;
        this.A00 = view;
        this.A00.clearAnimation();
        if (enumC2034f9 == EnumC2034f9.A03) {
            this.A00.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.A00.setVisibility(8);
        } else {
            this.A00.setAlpha(1.0f);
            this.A00.setVisibility(0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2019eu
    public final void AAv(C1168Ek c1168Ek) {
        this.A01 = c1168Ek;
        c1168Ek.getEventBus().A03(this.A06, this.A07, this.A08, this.A05);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2019eu
    public final void AKV(C1168Ek c1168Ek) {
        A06(1, 0);
        c1168Ek.getEventBus().A04(this.A05, this.A08, this.A07, this.A06);
        this.A01 = null;
    }
}

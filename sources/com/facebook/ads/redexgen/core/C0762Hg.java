package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.animation.AlphaAnimation;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0762Hg extends AbstractC1709i2<JL> implements AnonymousClass80 {
    public C1828k1 A00;
    public boolean A01;

    public C0762Hg(JL jl, C1828k1 c1828k1) {
        super(jl);
        this.A00 = c1828k1;
        this.A01 = false;
    }

    private void A01(int i) {
        if (!this.A01) {
            this.A00.A0F().A3l(i);
        }
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        JL jlA06 = A06();
        int iIntValue = 0;
        if (jlA06 == null) {
            A01(0);
            return;
        }
        View view = jlA06.A0C;
        JK jk = (JK) jlA06.A0E.get();
        int i = 1;
        boolean z = view == null;
        if (!z && jk != null) {
            JM jmA0E = JL.A0E(view, jlA06.A0A, this.A00);
            if (jmA0E.A04()) {
                JL.A05(jlA06);
            } else {
                jlA06.A00 = 0;
            }
            boolean z2 = jlA06.A00 > jlA06.A09;
            boolean wasViewable = jlA06.A05 != null && jlA06.A05.A04();
            if (z2 || !jmA0E.A04()) {
                jlA06.A05 = jmA0E;
            }
            String strValueOf = String.valueOf(jmA0E.A01());
            synchronized (jlA06) {
                if (jlA06.A06.containsKey(strValueOf)) {
                    iIntValue = ((Integer) jlA06.A06.get(strValueOf)).intValue();
                }
                jlA06.A06.put(strValueOf, Integer.valueOf(iIntValue + 1));
            }
            if (z2 && !wasViewable) {
                this.A01 = true;
                jlA06.A03 = System.currentTimeMillis();
                if (jlA06.A07) {
                    this.A00.A0F().A3m();
                }
                jk.A03();
                if (BuildConfigApi.isDebug() && AdInternalSettings.isVisibleAnimation()) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(500L);
                    view.startAnimation(alphaAnimation);
                }
                if (!jlA06.A0F) {
                    return;
                }
            } else if (!z2 && wasViewable) {
                this.A01 = true;
                if (jlA06.A07) {
                    this.A00.A0F().A3I(jmA0E.A02());
                }
                jk.A00();
            } else {
                jk.A02();
                if (!this.A01 && jlA06.A07) {
                    this.A00.A0F().A3k(jmA0E.A02());
                }
                this.A01 = true;
            }
            if (!jlA06.A08 && jlA06.A04 != null) {
                jlA06.A0B.postDelayed(jlA06.A04, jlA06.A02);
                return;
            }
            return;
        }
        if (jlA06.A07) {
            if (!z) {
                i = 2;
            }
            A01(i);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass80
    public final C1828k1 A6c() {
        return this.A00;
    }
}

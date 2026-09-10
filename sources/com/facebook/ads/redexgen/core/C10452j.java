package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.animation.AlphaAnimation;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C10452j extends Q9<C2245fp> implements T4 {
    public C2300gi A00;
    public boolean A01;

    public C10452j(C2245fp c2245fp, C2300gi c2300gi) {
        super(c2245fp);
        this.A00 = c2300gi;
        this.A01 = false;
    }

    private void A00(int i2) {
        if (!this.A01) {
            this.A00.A0F().A3v(i2);
        }
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1787Wc
    public final void A07() {
        C2245fp c2245fpA08 = A08();
        int iIntValue = 0;
        if (c2245fpA08 == null) {
            A00(0);
            return;
        }
        View view = c2245fpA08.A0C;
        AbstractC2244fo abstractC2244fo = (AbstractC2244fo) c2245fpA08.A0E.get();
        int i2 = 1;
        boolean z2 = view == null;
        if (!z2 && abstractC2244fo != null) {
            C2246fq c2246fqA0E = C2245fp.A0E(view, c2245fpA08.A0A, this.A00);
            if (c2246fqA0E.A04()) {
                C2245fp.A05(c2245fpA08);
            } else {
                c2245fpA08.A00 = 0;
            }
            boolean z3 = c2245fpA08.A00 > c2245fpA08.A09;
            boolean wasViewable = c2245fpA08.A05 != null && c2245fpA08.A05.A04();
            if (z3 || !c2246fqA0E.A04()) {
                c2245fpA08.A05 = c2246fqA0E;
            }
            String strValueOf = String.valueOf(c2246fqA0E.A01());
            synchronized (c2245fpA08) {
                if (c2245fpA08.A06.containsKey(strValueOf)) {
                    iIntValue = ((Integer) c2245fpA08.A06.get(strValueOf)).intValue();
                }
                c2245fpA08.A06.put(strValueOf, Integer.valueOf(iIntValue + 1));
            }
            if (z3 && !wasViewable) {
                this.A01 = true;
                c2245fpA08.A03 = System.currentTimeMillis();
                if (c2245fpA08.A07) {
                    this.A00.A0F().A3w();
                }
                abstractC2244fo.A03();
                if (BuildConfigApi.isDebug() && AdInternalSettings.isVisibleAnimation()) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(500L);
                    view.startAnimation(alphaAnimation);
                }
                if (!c2245fpA08.A0F) {
                    return;
                }
            } else if (!z3 && wasViewable) {
                this.A01 = true;
                if (c2245fpA08.A07) {
                    this.A00.A0F().A3S(c2246fqA0E.A02());
                }
                abstractC2244fo.A00();
            } else {
                abstractC2244fo.A02();
                if (!this.A01 && c2245fpA08.A07) {
                    this.A00.A0F().A3u(c2246fqA0E.A02());
                }
                this.A01 = true;
            }
            if (!c2245fpA08.A08 && c2245fpA08.A04 != null) {
                c2245fpA08.A0B.postDelayed(c2245fpA08.A04, c2245fpA08.A02);
                return;
            }
            return;
        }
        if (c2245fpA08.A07) {
            if (!z2) {
                i2 = 2;
            }
            A00(i2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.T4
    public final C2300gi A6m() {
        return this.A00;
    }
}

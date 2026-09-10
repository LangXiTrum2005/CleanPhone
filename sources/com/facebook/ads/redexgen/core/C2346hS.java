package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2346hS implements InterfaceC1841Yh {
    public static String[] A01 = {"8tOzOPKLz5DDIwqC88XBXxH90bmVDotF", "YCktuRbEMhZaz9U821mncTHWO05lwCqY", "Eq7g3criU65KDBPK", "XEHycrxPk7FQv1FkL381pmPNBNbKujpl", "niYnM4G6gzmxtC7fq", "sRQOtQAi", "8G5qrnHnaOtx52JqPPi", "6arHmIfqlBfM2iqNpfy3RxuQJelIt1eI"};
    public final WeakReference<C1662Re> A00;

    public C2346hS(C1662Re c1662Re) {
        this.A00 = new WeakReference<>(c1662Re);
    }

    private void A00(C1662Re c1662Re) {
        C2148eF c2148eFA07 = c1662Re.A07();
        if (c2148eFA07 != null && c1662Re.A04() != null) {
            c1662Re.A04().bringChildToFront(c2148eFA07);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1841Yh
    public void A44(View view, int i2, RelativeLayout.LayoutParams layoutParams) {
        C1662Re c1662Re = this.A00.get();
        if (c1662Re != null && c1662Re.A04() != null) {
            c1662Re.A04().addView(view, i2, layoutParams);
            A00(c1662Re);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1841Yh
    public void A45(View view, RelativeLayout.LayoutParams layoutParams) {
        C1662Re c1662Re = this.A00.get();
        if (c1662Re != null && c1662Re.A04() != null) {
            c1662Re.A04().addView(view, layoutParams);
            A00(c1662Re);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1841Yh
    public void A4j(String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0C(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1841Yh
    public void A4k(String str, UL ul) {
        if (this.A00.get() != null) {
            this.A00.get().A0E(str, ul);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1841Yh
    public void AAo(String str, C1570Nm c1570Nm) {
        if (this.A00.get() != null) {
            WeakReference<C1662Re> weakReference = this.A00;
            if (A01[4].length() == 0) {
                throw new RuntimeException();
            }
            A01[2] = "IO1gKUYJJG6YtU6JnI8y";
            weakReference.get().A0D(str, c1570Nm);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1841Yh
    public void ADJ(int i2) {
        C1662Re activityApi = this.A00.get();
        if (activityApi != null) {
            activityApi.finish(i2);
        }
    }
}

package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2177hS implements InterfaceC1672Yh {
    public static String[] A01 = {"8tOzOPKLz5DDIwqC88XBXxH90bmVDotF", "YCktuRbEMhZaz9U821mncTHWO05lwCqY", "Eq7g3criU65KDBPK", "XEHycrxPk7FQv1FkL381pmPNBNbKujpl", "niYnM4G6gzmxtC7fq", "sRQOtQAi", "8G5qrnHnaOtx52JqPPi", "6arHmIfqlBfM2iqNpfy3RxuQJelIt1eI"};
    public final WeakReference<C1493Re> A00;

    public C2177hS(C1493Re c1493Re) {
        this.A00 = new WeakReference<>(c1493Re);
    }

    private void A00(C1493Re c1493Re) {
        C1979eF c1979eFA07 = c1493Re.A07();
        if (c1979eFA07 != null && c1493Re.A04() != null) {
            c1493Re.A04().bringChildToFront(c1979eFA07);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1672Yh
    public void A44(View view, int i, RelativeLayout.LayoutParams layoutParams) {
        C1493Re c1493Re = this.A00.get();
        if (c1493Re != null && c1493Re.A04() != null) {
            c1493Re.A04().addView(view, i, layoutParams);
            A00(c1493Re);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1672Yh
    public void A45(View view, RelativeLayout.LayoutParams layoutParams) {
        C1493Re c1493Re = this.A00.get();
        if (c1493Re != null && c1493Re.A04() != null) {
            c1493Re.A04().addView(view, layoutParams);
            A00(c1493Re);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1672Yh
    public void A4j(String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0C(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1672Yh
    public void A4k(String str, UL ul) {
        if (this.A00.get() != null) {
            this.A00.get().A0E(str, ul);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1672Yh
    public void AAo(String str, C1401Nm c1401Nm) {
        if (this.A00.get() != null) {
            WeakReference<C1493Re> weakReference = this.A00;
            if (A01[4].length() == 0) {
                throw new RuntimeException();
            }
            A01[2] = "IO1gKUYJJG6YtU6JnI8y";
            weakReference.get().A0D(str, c1401Nm);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1672Yh
    public void ADJ(int i) {
        C1493Re activityApi = this.A00.get();
        if (activityApi != null) {
            activityApi.finish(i);
        }
    }
}

package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1873kk implements DR {
    public static String[] A01 = {"8tOzOPKLz5DDIwqC88XBXxH90bmVDotF", "YCktuRbEMhZaz9U821mncTHWO05lwCqY", "Eq7g3criU65KDBPK", "XEHycrxPk7FQv1FkL381pmPNBNbKujpl", "niYnM4G6gzmxtC7fq", "sRQOtQAi", "8G5qrnHnaOtx52JqPPi", "6arHmIfqlBfM2iqNpfy3RxuQJelIt1eI"};
    public final WeakReference<C04946e> A00;

    public C1873kk(C04946e c04946e) {
        this.A00 = new WeakReference<>(c04946e);
    }

    private void A00(C04946e c04946e) {
        C0767Hl c0767HlA07 = c04946e.A07();
        if (c0767HlA07 != null && c04946e.A04() != null) {
            c04946e.A04().bringChildToFront(c0767HlA07);
        }
    }

    @Override // com.facebook.ads.redexgen.core.DR
    public void A3u(View view, int i, RelativeLayout.LayoutParams layoutParams) {
        C04946e c04946e = this.A00.get();
        if (c04946e != null && c04946e.A04() != null) {
            c04946e.A04().addView(view, i, layoutParams);
            A00(c04946e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.DR
    public void A3v(View view, RelativeLayout.LayoutParams layoutParams) {
        C04946e c04946e = this.A00.get();
        if (c04946e != null && c04946e.A04() != null) {
            c04946e.A04().addView(view, layoutParams);
            A00(c04946e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.DR
    public void A4Z(String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0C(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.DR
    public void A4a(String str, C9I c9i) {
        if (this.A00.get() != null) {
            this.A00.get().A0E(str, c9i);
        }
    }

    @Override // com.facebook.ads.redexgen.core.DR
    public void AAd(String str, C04022n c04022n) {
        if (this.A00.get() != null) {
            WeakReference<C04946e> weakReference = this.A00;
            if (A01[4].length() == 0) {
                throw new RuntimeException();
            }
            A01[2] = "IO1gKUYJJG6YtU6JnI8y";
            weakReference.get().A0D(str, c04022n);
        }
    }

    @Override // com.facebook.ads.redexgen.core.DR
    public void ACY(int i) {
        C04946e activityApi = this.A00.get();
        if (activityApi != null) {
            activityApi.finish(i);
        }
    }
}

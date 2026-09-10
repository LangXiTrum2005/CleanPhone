package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import com.smartdigimkt.v0.p;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2163eU {
    public static int A00(DisplayMetrics displayMetrics) {
        int i2 = displayMetrics.widthPixels;
        if (i2 > 1700) {
            i2 = 1700;
        }
        int width = i2 / p.e.f39014a;
        return width;
    }

    public static void A01(@Nullable Context context, final View view, long j, final View view2) {
        if (view2 != null) {
            view2.setVisibility(0);
        }
        view.setVisibility(8);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.eT
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2163eU.A02(view2, view);
            }
        }, j);
    }

    public static /* synthetic */ void A02(View view, View view2) {
        if (view != null) {
            view.setVisibility(8);
        }
        view2.setVisibility(0);
    }
}

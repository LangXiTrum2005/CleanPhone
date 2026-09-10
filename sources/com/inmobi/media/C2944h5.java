package com.inmobi.media;

import android.content.Context;
import android.view.TextureView;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.h5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2944h5 extends TextureView {
    public float a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2944h5(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = 1.0f;
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size != 0 && size2 != 0) {
            float f = this.a;
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int i3 = (int) (size / f);
                if (i3 <= size2) {
                    setMeasuredDimension(size, i3);
                    return;
                } else {
                    setMeasuredDimension((int) (size2 * f), size2);
                    return;
                }
            }
        }
        super.onMeasure(i, i2);
    }

    public final void setAspectRatio(float f) {
        if (this.a <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        this.a = f;
        requestLayout();
    }
}

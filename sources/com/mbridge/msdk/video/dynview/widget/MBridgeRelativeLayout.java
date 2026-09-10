package com.mbridge.msdk.video.dynview.widget;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.mbridge.msdk.video.dynview.moffer.b;
import com.mbridge.msdk.video.dynview.moffer.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class MBridgeRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f37479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f37480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AnimatorSet f37481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f37482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f37483e;

    public MBridgeRelativeLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatorSet animatorSet = this.f37481c;
        if (animatorSet != null) {
            try {
                animatorSet.start();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        d dVar;
        super.onDetachedFromWindow();
        if (!this.f37480b && (dVar = this.f37479a) != null) {
            this.f37480b = true;
            dVar.a();
        }
        AnimatorSet animatorSet = this.f37481c;
        if (animatorSet != null) {
            try {
                animatorSet.cancel();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i10) {
        b bVar;
        super.onVisibilityChanged(view, i10);
        if (!(view instanceof MBridgeRelativeLayout) || i10 != 0 || (bVar = this.f37483e) == null || this.f37482d) {
            return;
        }
        this.f37482d = true;
        bVar.a();
    }

    public void setAnimatorSet(AnimatorSet animatorSet) {
        this.f37481c = animatorSet;
    }

    public void setMoreOfferCacheReportCallBack(b bVar) {
        this.f37483e = bVar;
    }

    public void setMoreOfferShowFailedCallBack(d dVar) {
        this.f37479a = dVar;
    }

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}

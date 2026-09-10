package com.mbridge.msdk.config.dynamic.baseview.rewardpopview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewConst;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBGradientAndShadowTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LinearGradient f32635e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f32637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f32638c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f32639d = 40;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f32640e = 3.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f32641f = 1.5f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f32642g = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context) {
        super(context);
        this.f32631a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f32632b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f32633c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f32634d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        a();
    }

    private void a() {
        setTextSize(this.f32634d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.f32635e = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getTextSize(), this.f32631a, this.f32632b, Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.f32633c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.f32635e);
        super.onDraw(canvas);
    }

    public MBGradientAndShadowTextView(Context context, a aVar) {
        super(context);
        this.f32631a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f32632b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f32633c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f32634d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (aVar != null) {
            this.f32631a = aVar.f32636a;
            this.f32632b = aVar.f32637b;
            this.f32633c = aVar.f32638c;
            this.f32634d = aVar.f32639d;
            this.mShadowRadius = aVar.f32640e;
            this.mShadowDx = aVar.f32641f;
            this.mShadowDy = aVar.f32642g;
        }
        a();
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32631a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f32632b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f32633c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f32634d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f32631a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f32632b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f32633c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f32634d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f32631a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f32632b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f32633c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f32634d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }
}

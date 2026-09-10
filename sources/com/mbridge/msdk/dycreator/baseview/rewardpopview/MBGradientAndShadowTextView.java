package com.mbridge.msdk.dycreator.baseview.rewardpopview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBGradientAndShadowTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LinearGradient f33103e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class GradientAndShadowParameters {
        public int gradientEndColor;
        public int gradientStartColor;
        public int shadowColor;
        public int textSize = 40;
        public float shadowRadius = 3.0f;
        public float shadowDx = 1.5f;
        public float shadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context) {
        super(context);
        this.f33099a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f33100b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f33101c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f33102d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        a();
    }

    private void a() {
        setTextSize(this.f33102d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.f33103e = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getTextSize(), this.f33099a, this.f33100b, Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.f33101c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.f33103e);
        super.onDraw(canvas);
    }

    public MBGradientAndShadowTextView(Context context, GradientAndShadowParameters gradientAndShadowParameters) {
        super(context);
        this.f33099a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f33100b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f33101c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f33102d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (gradientAndShadowParameters != null) {
            this.f33099a = gradientAndShadowParameters.gradientStartColor;
            this.f33100b = gradientAndShadowParameters.gradientEndColor;
            this.f33101c = gradientAndShadowParameters.shadowColor;
            this.f33102d = gradientAndShadowParameters.textSize;
            this.mShadowRadius = gradientAndShadowParameters.shadowRadius;
            this.mShadowDx = gradientAndShadowParameters.shadowDx;
            this.mShadowDy = gradientAndShadowParameters.shadowDy;
        }
        a();
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33099a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f33100b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f33101c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f33102d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f33099a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f33100b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f33101c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f33102d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f33099a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f33100b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f33101c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f33102d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }
}

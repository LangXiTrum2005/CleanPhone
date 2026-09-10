package com.smartdigimkt.expressad.widget.rewardpopview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public class ATGradientAndShadowTextView extends TextView {
    private int e0;
    private int f0;
    private int g0;
    private int h0;
    private LinearGradient i0;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f34945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f34946c;
        public int d = 40;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f34947e = 3.0f;
        public float f = 1.5f;
        public float g = 1.8f;
    }

    public ATGradientAndShadowTextView(Context context) {
        super(context);
        this.e0 = -1043;
        this.f0 = -17041;
        this.g0 = -1280767;
        this.h0 = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        a();
    }

    private void a() {
        setTextSize(this.h0);
        setTypeface(Typeface.defaultFromStyle(3));
        this.i0 = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.e0, this.f0, Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.g0);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.i0);
        super.onDraw(canvas);
    }

    public ATGradientAndShadowTextView(Context context, a aVar) {
        super(context);
        this.e0 = -1043;
        this.f0 = -17041;
        this.g0 = -1280767;
        this.h0 = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (aVar != null) {
            this.e0 = aVar.f34944a;
            this.f0 = aVar.f34945b;
            this.g0 = aVar.f34946c;
            this.h0 = aVar.d;
            this.mShadowRadius = aVar.f34947e;
            this.mShadowDx = aVar.f;
            this.mShadowDy = aVar.g;
        }
        a();
    }

    public ATGradientAndShadowTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e0 = -1043;
        this.f0 = -17041;
        this.g0 = -1280767;
        this.h0 = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public ATGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e0 = -1043;
        this.f0 = -17041;
        this.g0 = -1280767;
        this.h0 = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public ATGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.e0 = -1043;
        this.f0 = -17041;
        this.g0 = -1280767;
        this.h0 = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }
}

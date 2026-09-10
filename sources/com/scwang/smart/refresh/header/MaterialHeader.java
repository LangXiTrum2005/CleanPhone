package com.scwang.smart.refresh.header;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import com.scwang.smart.refresh.header.material.CircleImageView;
import com.scwang.smart.refresh.header.material.MaterialProgressDrawable;
import com.scwang.smart.refresh.header.material.R;
import com.scwang.smart.refresh.layout.api.RefreshHeader;
import com.scwang.smart.refresh.layout.api.RefreshKernel;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import com.scwang.smart.refresh.layout.constant.SpinnerStyle;
import com.scwang.smart.refresh.layout.simple.SimpleComponent;
import com.scwang.smart.refresh.layout.util.SmartUtil;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialHeader extends SimpleComponent implements RefreshHeader {
    public boolean h0;
    public final int i0;
    public final CircleImageView j0;
    public RefreshKernel k0;
    public final MaterialProgressDrawable l0;
    public int m0;
    public int n0;
    public int o0;
    public final Path p0;
    public final Paint q0;
    public RefreshState r0;
    public final boolean s0;

    /* JADX INFO: renamed from: com.scwang.smart.refresh.header.MaterialHeader$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33511a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f33511a = iArr;
            try {
                RefreshState refreshState = RefreshState.None;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f33511a;
                RefreshState refreshState2 = RefreshState.None;
                iArr2[5] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f33511a;
                RefreshState refreshState3 = RefreshState.None;
                iArr3[11] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f33511a;
                RefreshState refreshState4 = RefreshState.None;
                iArr4[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public MaterialHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.s0 = false;
        this.f0 = SpinnerStyle.g;
        setMinimumHeight(SmartUtil.c(100.0f));
        MaterialProgressDrawable materialProgressDrawable = new MaterialProgressDrawable(this);
        this.l0 = materialProgressDrawable;
        materialProgressDrawable.b(-16737844, -48060, -10053376, -5609780, -30720);
        CircleImageView circleImageView = new CircleImageView(context);
        float f = circleImageView.getResources().getDisplayMetrics().density;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        circleImageView.setElevation(f * 4.0f);
        shapeDrawable.getPaint().setColor(-328966);
        circleImageView.setBackground(shapeDrawable);
        this.j0 = circleImageView;
        circleImageView.setImageDrawable(materialProgressDrawable);
        circleImageView.setAlpha(0.0f);
        addView(circleImageView);
        this.i0 = (int) (getResources().getDisplayMetrics().density * 40.0f);
        this.p0 = new Path();
        Paint paint = new Paint();
        this.q0 = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f33524a);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.s0 = z2;
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        paint.setColor(typedArrayObtainStyledAttributes.getColor(5, -15614977));
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            paint.setShadowLayer(typedArrayObtainStyledAttributes.getDimensionPixelOffset(8, 0), 0.0f, 0.0f, typedArrayObtainStyledAttributes.getColor(2, -16777216));
            setLayerType(1, null);
        }
        this.s0 = typedArrayObtainStyledAttributes.getBoolean(4, z2);
        typedArrayObtainStyledAttributes.getBoolean(1, z3);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            paint.setColor(typedArrayObtainStyledAttributes.getColor(0, -15614977));
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            paint.setShadowLayer(typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0), 0.0f, 0.0f, typedArrayObtainStyledAttributes.getColor(2, -16777216));
            setLayerType(1, null);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, com.scwang.smart.refresh.layout.api.RefreshComponent
    public final boolean autoOpen(int i2, float f, final boolean z2) {
        if (this.s0) {
            return false;
        }
        final CircleImageView circleImageView = this.j0;
        circleImageView.setAlpha(1.0f);
        circleImageView.setScaleX(0.0f);
        circleImageView.setScaleY(0.0f);
        circleImageView.setTranslationY((this.i0 / 2.0f) + (this.o0 / 2.0f));
        circleImageView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(i2).setListener(new AnimatorListenerAdapter() { // from class: com.scwang.smart.refresh.header.MaterialHeader.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                circleImageView.animate().setListener(null);
                MaterialHeader materialHeader = MaterialHeader.this;
                materialHeader.l0.start();
                materialHeader.k0.onAutoRefreshAnimationEnd(animator, z2);
            }
        });
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.s0) {
            Path path = this.p0;
            path.reset();
            path.lineTo(0.0f, this.n0);
            path.quadTo(getMeasuredWidth() / 2.0f, (this.m0 * 1.9f) + this.n0, getMeasuredWidth(), this.n0);
            path.lineTo(getMeasuredWidth(), 0.0f);
            canvas.drawPath(path, this.q0);
        }
        super.dispatchDraw(canvas);
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, com.scwang.smart.refresh.layout.api.RefreshComponent
    public final int onFinish(RefreshLayout refreshLayout, boolean z2) {
        CircleImageView circleImageView = this.j0;
        this.l0.stop();
        circleImageView.animate().scaleX(0.0f).scaleY(0.0f);
        this.h0 = true;
        return 0;
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, com.scwang.smart.refresh.layout.api.RefreshComponent
    public final void onInitialized(RefreshKernel refreshKernel, int i2, int i3) {
        if (!this.s0) {
            refreshKernel.requestDefaultTranslationContentFor(this, false);
        }
        if (isInEditMode()) {
            int i4 = i2 / 2;
            this.n0 = i4;
            this.m0 = i4;
        }
        this.k0 = refreshKernel;
        this.o0 = i2;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        if (getChildCount() == 0) {
            return;
        }
        CircleImageView circleImageView = this.j0;
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = circleImageView.getMeasuredWidth();
        int measuredHeight = circleImageView.getMeasuredHeight();
        if (!isInEditMode() || (i6 = this.n0) <= 0) {
            int i7 = measuredWidth / 2;
            int i8 = measuredWidth2 / 2;
            circleImageView.layout(i7 - i8, -measuredHeight, i7 + i8, 0);
            return;
        }
        int i9 = i6 - (measuredHeight / 2);
        int i10 = measuredWidth / 2;
        int i11 = measuredWidth2 / 2;
        circleImageView.layout(i10 - i11, i9, i10 + i11, measuredHeight + i9);
        MaterialProgressDrawable materialProgressDrawable = this.l0;
        materialProgressDrawable.e(true);
        materialProgressDrawable.d(0.0f, 0.8f);
        materialProgressDrawable.a(1.0f);
        circleImageView.setAlpha(1.0f);
        circleImageView.setVisibility(0);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
        CircleImageView circleImageView = this.j0;
        int i4 = this.i0;
        circleImageView.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, com.scwang.smart.refresh.layout.api.RefreshComponent
    public final void onMoving(boolean z2, float f, int i2, int i3, int i4) {
        RefreshState refreshState = this.r0;
        RefreshState refreshState2 = RefreshState.Refreshing;
        if (refreshState == refreshState2) {
            return;
        }
        if (this.s0) {
            this.n0 = Math.min(i2, i3);
            this.m0 = Math.max(0, i2 - i3);
            postInvalidate();
        }
        MaterialProgressDrawable materialProgressDrawable = this.l0;
        if (z2 || !(materialProgressDrawable.j0 || this.h0)) {
            if (this.r0 != refreshState2) {
                float f2 = i3;
                float fMax = (((float) Math.max(((double) Math.min(1.0f, Math.abs((i2 * 1.0f) / f2))) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
                double dMax = Math.max(0.0f, Math.min(Math.abs(i2) - i3, f2 * 2.0f) / f2) / 4.0f;
                float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
                materialProgressDrawable.e(true);
                materialProgressDrawable.d(0.0f, Math.min(0.8f, fMax * 0.8f));
                materialProgressDrawable.a(Math.min(1.0f, fMax));
                materialProgressDrawable.c(((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f);
            }
            CircleImageView circleImageView = this.j0;
            float f3 = i2;
            float f4 = this.i0;
            circleImageView.setTranslationY(Math.min(f3, (f4 / 2.0f) + (f3 / 2.0f)));
            circleImageView.setAlpha(Math.min(1.0f, (f3 * 4.0f) / f4));
        }
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, com.scwang.smart.refresh.layout.api.RefreshComponent
    public final void onStartAnimator(RefreshLayout refreshLayout, int i2, int i3) {
        this.l0.start();
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, com.scwang.smart.refresh.layout.api.RefreshComponent, com.scwang.smart.refresh.layout.listener.OnStateChangedListener, com.scwang.smart.refresh.layout.api.RefreshFooter
    public final void onStateChanged(RefreshLayout refreshLayout, RefreshState refreshState, RefreshState refreshState2) {
        CircleImageView circleImageView = this.j0;
        this.r0 = refreshState2;
        if (refreshState2.ordinal() != 1) {
            return;
        }
        this.h0 = false;
        circleImageView.setVisibility(0);
        circleImageView.setTranslationY(0.0f);
        circleImageView.setScaleX(1.0f);
        circleImageView.setScaleY(1.0f);
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, com.scwang.smart.refresh.layout.api.RefreshComponent
    @Deprecated
    public void setPrimaryColors(int... iArr) {
        if (iArr.length > 0) {
            this.q0.setColor(iArr[0]);
        }
    }
}

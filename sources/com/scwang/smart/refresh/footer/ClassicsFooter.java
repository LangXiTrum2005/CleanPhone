package com.scwang.smart.refresh.footer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.charging.screenshow.battery.animations.themes.R;
import com.scwang.smart.drawable.ProgressDrawable;
import com.scwang.smart.refresh.classics.ArrowDrawable;
import com.scwang.smart.refresh.classics.ClassicsAbstract;
import com.scwang.smart.refresh.layout.api.RefreshFooter;
import com.scwang.smart.refresh.layout.api.RefreshKernel;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import com.scwang.smart.refresh.layout.constant.SpinnerStyle;
import com.scwang.smart.refresh.layout.util.SmartUtil;
import com.smartdigimkt.o1.b;

/* JADX INFO: loaded from: classes5.dex */
public class ClassicsFooter extends ClassicsAbstract<ClassicsFooter> implements RefreshFooter {
    public final String A0;
    public boolean B0;
    public final String u0;
    public final String v0;
    public final String w0;
    public final String x0;
    public final String y0;
    public final String z0;

    /* JADX INFO: renamed from: com.scwang.smart.refresh.footer.ClassicsFooter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33508a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f33508a = iArr;
            try {
                RefreshState refreshState = RefreshState.None;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f33508a;
                RefreshState refreshState2 = RefreshState.None;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f33508a;
                RefreshState refreshState3 = RefreshState.None;
                iArr3[12] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f33508a;
                RefreshState refreshState4 = RefreshState.None;
                iArr4[10] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = f33508a;
                RefreshState refreshState5 = RefreshState.None;
                iArr5[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = f33508a;
                RefreshState refreshState6 = RefreshState.None;
                iArr6[11] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ClassicsFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.q0 = 500;
        this.r0 = 20;
        this.s0 = 20;
        this.t0 = 0;
        this.f0 = SpinnerStyle.d;
        this.B0 = false;
        View.inflate(context, R.layout.srl_classics_footer, this);
        ImageView imageView = (ImageView) findViewById(R.id.srl_classics_arrow);
        this.i0 = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.srl_classics_progress);
        this.j0 = imageView2;
        this.h0 = (TextView) findViewById(R.id.srl_classics_title);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.scwang.smart.refresh.footer.classics.R.styleable.f33509a);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, SmartUtil.c(20.0f));
        layoutParams2.rightMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(3, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(3, layoutParams.height);
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(6, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(6, layoutParams2.height);
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(7, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(7, layoutParams.height);
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(7, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(7, layoutParams2.height);
        this.q0 = typedArrayObtainStyledAttributes.getInt(8, this.q0);
        this.f0 = SpinnerStyle.f33546h[typedArrayObtainStyledAttributes.getInt(1, this.f0.f33547a)];
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.i0.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(2));
        } else if (this.i0.getDrawable() == null) {
            ArrowDrawable arrowDrawable = new ArrowDrawable();
            this.l0 = arrowDrawable;
            arrowDrawable.X.setColor(-10066330);
            this.i0.setImageDrawable(this.l0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            this.j0.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(5));
        } else if (this.j0.getDrawable() == null) {
            ProgressDrawable progressDrawable = new ProgressDrawable();
            progressDrawable.f33506Y = 0;
            progressDrawable.Z = 0;
            progressDrawable.e0 = 0;
            progressDrawable.g0 = new Path();
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(30, b.l2);
            progressDrawable.f0 = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(10000L);
            valueAnimatorOfInt.setInterpolator(null);
            valueAnimatorOfInt.setRepeatCount(-1);
            valueAnimatorOfInt.setRepeatMode(1);
            this.m0 = progressDrawable;
            progressDrawable.X.setColor(-10066330);
            this.j0.setImageDrawable(this.m0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            this.h0.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(17, SmartUtil.c(16.0f)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(9)) {
            int color = typedArrayObtainStyledAttributes.getColor(9, 0);
            this.o0 = true;
            this.p0 = color;
            RefreshKernel refreshKernel = this.k0;
            if (refreshKernel != null) {
                refreshKernel.requestDrawBackgroundFor(this, color);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            a(typedArrayObtainStyledAttributes.getColor(0, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            this.u0 = typedArrayObtainStyledAttributes.getString(14);
        } else {
            this.u0 = context.getString(R.string.srl_footer_pulling);
        }
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            this.v0 = typedArrayObtainStyledAttributes.getString(16);
        } else {
            this.v0 = context.getString(R.string.srl_footer_release);
        }
        if (typedArrayObtainStyledAttributes.hasValue(12)) {
            this.w0 = typedArrayObtainStyledAttributes.getString(12);
        } else {
            this.w0 = context.getString(R.string.srl_footer_loading);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            this.x0 = typedArrayObtainStyledAttributes.getString(15);
        } else {
            this.x0 = context.getString(R.string.srl_footer_refreshing);
        }
        if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.y0 = typedArrayObtainStyledAttributes.getString(11);
        } else {
            this.y0 = context.getString(R.string.srl_footer_finish);
        }
        if (typedArrayObtainStyledAttributes.hasValue(10)) {
            this.z0 = typedArrayObtainStyledAttributes.getString(10);
        } else {
            this.z0 = context.getString(R.string.srl_footer_failed);
        }
        if (typedArrayObtainStyledAttributes.hasValue(13)) {
            this.A0 = typedArrayObtainStyledAttributes.getString(13);
        } else {
            this.A0 = context.getString(R.string.srl_footer_nothing);
        }
        typedArrayObtainStyledAttributes.recycle();
        imageView2.animate().setInterpolator(null);
        this.h0.setText(isInEditMode() ? this.w0 : this.u0);
        if (isInEditMode()) {
            imageView.setVisibility(8);
        } else {
            imageView2.setVisibility(8);
        }
    }

    @Override // com.scwang.smart.refresh.classics.ClassicsAbstract, com.scwang.smart.refresh.layout.simple.SimpleComponent, com.scwang.smart.refresh.layout.api.RefreshComponent
    public final int onFinish(RefreshLayout refreshLayout, boolean z2) {
        super.onFinish(refreshLayout, z2);
        if (this.B0) {
            return 0;
        }
        this.h0.setText(z2 ? this.y0 : this.z0);
        return this.q0;
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, com.scwang.smart.refresh.layout.api.RefreshComponent, com.scwang.smart.refresh.layout.listener.OnStateChangedListener, com.scwang.smart.refresh.layout.api.RefreshFooter
    public final void onStateChanged(RefreshLayout refreshLayout, RefreshState refreshState, RefreshState refreshState2) {
        ImageView imageView = this.i0;
        if (this.B0) {
            return;
        }
        int iOrdinal = refreshState2.ordinal();
        if (iOrdinal == 0) {
            imageView.setVisibility(0);
        } else if (iOrdinal != 2) {
            if (iOrdinal == 6) {
                this.h0.setText(this.v0);
                imageView.animate().rotation(0.0f);
                return;
            }
            switch (iOrdinal) {
                case 10:
                case 12:
                    imageView.setVisibility(8);
                    this.h0.setText(this.w0);
                    break;
                case 11:
                    this.h0.setText(this.x0);
                    imageView.setVisibility(8);
                    break;
            }
            return;
        }
        this.h0.setText(this.u0);
        imageView.animate().rotation(180.0f);
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, com.scwang.smart.refresh.layout.api.RefreshFooter
    public final boolean setNoMoreData(boolean z2) {
        if (this.B0 == z2) {
            return true;
        }
        this.B0 = z2;
        ImageView imageView = this.i0;
        if (z2) {
            this.h0.setText(this.A0);
            imageView.setVisibility(8);
            return true;
        }
        this.h0.setText(this.u0);
        imageView.setVisibility(0);
        return true;
    }

    @Override // com.scwang.smart.refresh.classics.ClassicsAbstract, com.scwang.smart.refresh.layout.simple.SimpleComponent, com.scwang.smart.refresh.layout.api.RefreshComponent
    @Deprecated
    public void setPrimaryColors(int... iArr) {
        if (this.f0 == SpinnerStyle.f33545e) {
            super.setPrimaryColors(iArr);
        }
    }
}

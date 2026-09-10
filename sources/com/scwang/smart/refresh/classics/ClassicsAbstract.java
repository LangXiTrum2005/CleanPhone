package com.scwang.smart.refresh.classics;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.scwang.smart.drawable.ProgressDrawable;
import com.scwang.smart.refresh.classics.ClassicsAbstract;
import com.scwang.smart.refresh.layout.api.RefreshComponent;
import com.scwang.smart.refresh.layout.api.RefreshKernel;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.simple.SimpleComponent;
import com.scwang.smart.refresh.layout.util.SmartUtil;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ClassicsAbstract<T extends ClassicsAbstract<?>> extends SimpleComponent implements RefreshComponent {
    public TextView h0;
    public ImageView i0;
    public ImageView j0;
    public RefreshKernel k0;
    public ArrowDrawable l0;
    public ProgressDrawable m0;
    public boolean n0;
    public boolean o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;

    public final void a(int i2) {
        this.n0 = true;
        this.h0.setTextColor(i2);
        ArrowDrawable arrowDrawable = this.l0;
        if (arrowDrawable != null) {
            arrowDrawable.X.setColor(i2);
            this.i0.invalidateDrawable(this.l0);
        }
        ProgressDrawable progressDrawable = this.m0;
        if (progressDrawable != null) {
            progressDrawable.X.setColor(i2);
            this.j0.invalidateDrawable(this.m0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ImageView imageView = this.i0;
        ImageView imageView2 = this.j0;
        imageView.animate().cancel();
        imageView2.animate().cancel();
        Object drawable = this.j0.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        }
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, com.scwang.smart.refresh.layout.api.RefreshComponent
    public int onFinish(RefreshLayout refreshLayout, boolean z2) {
        ImageView imageView = this.j0;
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        } else {
            imageView.animate().rotation(0.0f).setDuration(0L);
        }
        imageView.setVisibility(8);
        return this.q0;
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, com.scwang.smart.refresh.layout.api.RefreshComponent
    public final void onInitialized(RefreshKernel refreshKernel, int i2, int i3) {
        this.k0 = refreshKernel;
        refreshKernel.requestDrawBackgroundFor(this, this.p0);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (this.t0 == 0) {
            this.r0 = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            this.s0 = paddingBottom;
            if (this.r0 == 0 || paddingBottom == 0) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int iC = this.r0;
                if (iC == 0) {
                    iC = SmartUtil.c(20.0f);
                }
                this.r0 = iC;
                int iC2 = this.s0;
                if (iC2 == 0) {
                    iC2 = SmartUtil.c(20.0f);
                }
                this.s0 = iC2;
                setPadding(paddingLeft, this.r0, paddingRight, iC2);
            }
            setClipToPadding(false);
        }
        if (View.MeasureSpec.getMode(i3) == 1073741824) {
            int size = View.MeasureSpec.getSize(i3);
            int i4 = this.t0;
            if (size < i4) {
                int i5 = (size - i4) / 2;
                setPadding(getPaddingLeft(), i5, getPaddingRight(), i5);
            } else {
                setPadding(getPaddingLeft(), 0, getPaddingRight(), 0);
            }
        } else {
            setPadding(getPaddingLeft(), this.r0, getPaddingRight(), this.s0);
        }
        super.onMeasure(i2, i3);
        if (this.t0 == 0) {
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                int measuredHeight = getChildAt(i6).getMeasuredHeight();
                if (this.t0 < measuredHeight) {
                    this.t0 = measuredHeight;
                }
            }
        }
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, com.scwang.smart.refresh.layout.api.RefreshComponent
    public final void onReleased(RefreshLayout refreshLayout, int i2, int i3) {
        onStartAnimator(refreshLayout, i2, i3);
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, com.scwang.smart.refresh.layout.api.RefreshComponent
    public final void onStartAnimator(RefreshLayout refreshLayout, int i2, int i3) {
        ImageView imageView = this.j0;
        if (imageView.getVisibility() != 0) {
            imageView.setVisibility(0);
            Object drawable = this.j0.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).start();
            } else {
                imageView.animate().rotation(36000.0f).setDuration(100000L);
            }
        }
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, com.scwang.smart.refresh.layout.api.RefreshComponent
    public void setPrimaryColors(int... iArr) {
        if (iArr.length > 0) {
            if (!(getBackground() instanceof BitmapDrawable) && !this.o0) {
                int i2 = iArr[0];
                this.o0 = true;
                this.p0 = i2;
                RefreshKernel refreshKernel = this.k0;
                if (refreshKernel != null) {
                    refreshKernel.requestDrawBackgroundFor(this, i2);
                }
                this.o0 = false;
            }
            if (this.n0) {
                return;
            }
            if (iArr.length > 1) {
                a(iArr[1]);
            }
            this.n0 = false;
        }
    }
}

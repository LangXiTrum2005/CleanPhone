package com.scwang.smart.refresh.layout.simple;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.api.RefreshComponent;
import com.scwang.smart.refresh.layout.api.RefreshFooter;
import com.scwang.smart.refresh.layout.api.RefreshHeader;
import com.scwang.smart.refresh.layout.api.RefreshKernel;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import com.scwang.smart.refresh.layout.constant.SpinnerStyle;

/* JADX INFO: loaded from: classes5.dex */
public abstract class SimpleComponent extends RelativeLayout implements RefreshComponent {
    public final View e0;
    public SpinnerStyle f0;
    public final RefreshComponent g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SimpleComponent(View view) {
        super(view.getContext(), null, 0);
        RefreshComponent refreshComponent = view instanceof RefreshComponent ? (RefreshComponent) view : null;
        this.e0 = view;
        this.g0 = refreshComponent;
        boolean z2 = this instanceof RefreshFooter;
        SpinnerStyle spinnerStyle = SpinnerStyle.g;
        if (z2 && (refreshComponent instanceof RefreshHeader) && refreshComponent.getSpinnerStyle() == spinnerStyle) {
            refreshComponent.getView().setScaleY(-1.0f);
        } else if ((this instanceof RefreshHeader) && (refreshComponent instanceof RefreshFooter) && refreshComponent.getSpinnerStyle() == spinnerStyle) {
            refreshComponent.getView().setScaleY(-1.0f);
        }
    }

    public boolean autoOpen(int i2, float f, boolean z2) {
        return false;
    }

    public final boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        return (obj instanceof RefreshComponent) && getView() == ((RefreshComponent) obj).getView();
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshComponent
    public SpinnerStyle getSpinnerStyle() {
        int i2;
        SpinnerStyle spinnerStyle = this.f0;
        if (spinnerStyle != null) {
            return spinnerStyle;
        }
        RefreshComponent refreshComponent = this.g0;
        if (refreshComponent != null && refreshComponent != this) {
            return refreshComponent.getSpinnerStyle();
        }
        View view = this.e0;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.LayoutParams) {
                SpinnerStyle spinnerStyle2 = ((SmartRefreshLayout.LayoutParams) layoutParams).f33536b;
                this.f0 = spinnerStyle2;
                if (spinnerStyle2 != null) {
                    return spinnerStyle2;
                }
            }
            if (layoutParams != null && ((i2 = layoutParams.height) == 0 || i2 == -1)) {
                SpinnerStyle[] spinnerStyleArr = SpinnerStyle.f33546h;
                for (int i3 = 0; i3 < 5; i3++) {
                    SpinnerStyle spinnerStyle3 = spinnerStyleArr[i3];
                    if (spinnerStyle3.f33549c) {
                        this.f0 = spinnerStyle3;
                        return spinnerStyle3;
                    }
                }
            }
        }
        SpinnerStyle spinnerStyle4 = SpinnerStyle.d;
        this.f0 = spinnerStyle4;
        return spinnerStyle4;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshComponent
    public View getView() {
        View view = this.e0;
        return view == null ? this : view;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshComponent
    public final boolean isSupportHorizontalDrag() {
        RefreshComponent refreshComponent = this.g0;
        return (refreshComponent == null || refreshComponent == this || !refreshComponent.isSupportHorizontalDrag()) ? false : true;
    }

    public int onFinish(RefreshLayout refreshLayout, boolean z2) {
        RefreshComponent refreshComponent = this.g0;
        if (refreshComponent == null || refreshComponent == this) {
            return 0;
        }
        return refreshComponent.onFinish(refreshLayout, z2);
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshComponent
    public final void onHorizontalDrag(float f, int i2, int i3) {
        RefreshComponent refreshComponent = this.g0;
        if (refreshComponent == null || refreshComponent == this) {
            return;
        }
        refreshComponent.onHorizontalDrag(f, i2, i3);
    }

    public void onInitialized(RefreshKernel refreshKernel, int i2, int i3) {
        RefreshComponent refreshComponent = this.g0;
        if (refreshComponent != null && refreshComponent != this) {
            refreshComponent.onInitialized(refreshKernel, i2, i3);
            return;
        }
        View view = this.e0;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.LayoutParams) {
                refreshKernel.requestDrawBackgroundFor(this, ((SmartRefreshLayout.LayoutParams) layoutParams).f33535a);
            }
        }
    }

    public void onMoving(boolean z2, float f, int i2, int i3, int i4) {
        RefreshComponent refreshComponent = this.g0;
        if (refreshComponent == null || refreshComponent == this) {
            return;
        }
        refreshComponent.onMoving(z2, f, i2, i3, i4);
    }

    public void onReleased(RefreshLayout refreshLayout, int i2, int i3) {
        RefreshComponent refreshComponent = this.g0;
        if (refreshComponent == null || refreshComponent == this) {
            return;
        }
        refreshComponent.onReleased(refreshLayout, i2, i3);
    }

    public void onStartAnimator(RefreshLayout refreshLayout, int i2, int i3) {
        RefreshComponent refreshComponent = this.g0;
        if (refreshComponent == null || refreshComponent == this) {
            return;
        }
        refreshComponent.onStartAnimator(refreshLayout, i2, i3);
    }

    public void onStateChanged(RefreshLayout refreshLayout, RefreshState refreshState, RefreshState refreshState2) {
        RefreshComponent refreshComponent = this.g0;
        if (refreshComponent == null || refreshComponent == this) {
            return;
        }
        if ((this instanceof RefreshFooter) && (refreshComponent instanceof RefreshHeader)) {
            boolean z2 = refreshState.f33544Y;
            if (z2 && z2 && !refreshState.Z) {
                refreshState = RefreshState.values()[refreshState.ordinal() - 1];
            }
            boolean z3 = refreshState2.f33544Y;
            if (z3 && z3 && !refreshState2.Z) {
                refreshState2 = RefreshState.values()[refreshState2.ordinal() - 1];
            }
        } else if ((this instanceof RefreshHeader) && (refreshComponent instanceof RefreshFooter)) {
            boolean z4 = refreshState.X;
            if (z4 && z4 && !refreshState.Z) {
                refreshState = RefreshState.values()[refreshState.ordinal() + 1];
            }
            boolean z5 = refreshState2.X;
            if (z5 && z5 && !refreshState2.Z) {
                refreshState2 = RefreshState.values()[refreshState2.ordinal() + 1];
            }
        }
        refreshComponent.onStateChanged(refreshLayout, refreshState, refreshState2);
    }

    public boolean setNoMoreData(boolean z2) {
        RefreshComponent refreshComponent = this.g0;
        return (refreshComponent instanceof RefreshFooter) && ((RefreshFooter) refreshComponent).setNoMoreData(z2);
    }

    public void setPrimaryColors(int... iArr) {
        RefreshComponent refreshComponent = this.g0;
        if (refreshComponent == null || refreshComponent == this) {
            return;
        }
        refreshComponent.setPrimaryColors(iArr);
    }
}

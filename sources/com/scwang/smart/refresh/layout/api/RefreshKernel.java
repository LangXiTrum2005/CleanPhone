package com.scwang.smart.refresh.layout.api;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.scwang.smart.refresh.layout.constant.RefreshState;

/* JADX INFO: loaded from: classes5.dex */
public interface RefreshKernel {
    ValueAnimator animSpinner(int i2);

    RefreshKernel finishTwoLevel();

    RefreshContent getRefreshContent();

    RefreshLayout getRefreshLayout();

    RefreshKernel moveSpinner(int i2, boolean z2);

    RefreshKernel onAutoLoadMoreAnimationEnd(Animator animator, boolean z2);

    RefreshKernel onAutoRefreshAnimationEnd(Animator animator, boolean z2);

    RefreshKernel requestDefaultTranslationContentFor(RefreshComponent refreshComponent, boolean z2);

    RefreshKernel requestDrawBackgroundFor(RefreshComponent refreshComponent, int i2);

    RefreshKernel requestFloorBottomPullUpToCloseRate(float f);

    RefreshKernel requestFloorDuration(int i2);

    RefreshKernel requestNeedTouchEventFor(RefreshComponent refreshComponent, boolean z2);

    RefreshKernel requestRemeasureHeightFor(RefreshComponent refreshComponent);

    RefreshKernel setState(RefreshState refreshState);

    RefreshKernel startTwoLevel(boolean z2);
}

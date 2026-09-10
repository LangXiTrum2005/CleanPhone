package com.scwang.smart.refresh.layout.api;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import com.scwang.smart.refresh.layout.listener.OnLoadMoreListener;
import com.scwang.smart.refresh.layout.listener.OnMultiListener;
import com.scwang.smart.refresh.layout.listener.OnRefreshListener;
import com.scwang.smart.refresh.layout.listener.OnRefreshLoadMoreListener;
import com.scwang.smart.refresh.layout.listener.ScrollBoundaryDecider;

/* JADX INFO: loaded from: classes5.dex */
public interface RefreshLayout {
    boolean autoLoadMore();

    boolean autoLoadMore(int i2);

    boolean autoLoadMore(int i2, int i3, float f, boolean z2);

    boolean autoLoadMoreAnimationOnly();

    boolean autoRefresh();

    boolean autoRefresh(int i2);

    boolean autoRefresh(int i2, int i3, float f, boolean z2);

    boolean autoRefreshAnimationOnly();

    RefreshLayout closeHeaderOrFooter();

    RefreshLayout finishLoadMore();

    RefreshLayout finishLoadMore(int i2);

    RefreshLayout finishLoadMore(int i2, boolean z2, boolean z3);

    RefreshLayout finishLoadMore(boolean z2);

    RefreshLayout finishLoadMoreWithNoMoreData();

    RefreshLayout finishRefresh();

    RefreshLayout finishRefresh(int i2);

    RefreshLayout finishRefresh(int i2, boolean z2, Boolean bool);

    RefreshLayout finishRefresh(boolean z2);

    RefreshLayout finishRefreshWithNoMoreData();

    ViewGroup getLayout();

    RefreshFooter getRefreshFooter();

    RefreshHeader getRefreshHeader();

    RefreshState getState();

    boolean isLoading();

    boolean isRefreshing();

    RefreshLayout resetNoMoreData();

    RefreshLayout setDisableContentWhenLoading(boolean z2);

    RefreshLayout setDisableContentWhenRefresh(boolean z2);

    RefreshLayout setDragRate(float f);

    RefreshLayout setEnableAutoLoadMore(boolean z2);

    RefreshLayout setEnableClipFooterWhenFixedBehind(boolean z2);

    RefreshLayout setEnableClipHeaderWhenFixedBehind(boolean z2);

    RefreshLayout setEnableFooterFollowWhenNoMoreData(boolean z2);

    RefreshLayout setEnableFooterTranslationContent(boolean z2);

    RefreshLayout setEnableHeaderTranslationContent(boolean z2);

    RefreshLayout setEnableLoadMore(boolean z2);

    RefreshLayout setEnableLoadMoreWhenContentNotFull(boolean z2);

    RefreshLayout setEnableNestedScroll(boolean z2);

    RefreshLayout setEnableOverScrollBounce(boolean z2);

    RefreshLayout setEnableOverScrollDrag(boolean z2);

    RefreshLayout setEnablePureScrollMode(boolean z2);

    RefreshLayout setEnableRefresh(boolean z2);

    RefreshLayout setEnableScrollContentWhenLoaded(boolean z2);

    RefreshLayout setEnableScrollContentWhenRefreshed(boolean z2);

    RefreshLayout setFixedFooterViewId(int i2);

    RefreshLayout setFixedHeaderViewId(int i2);

    RefreshLayout setFooterHeight(float f);

    RefreshLayout setFooterHeightPx(int i2);

    RefreshLayout setFooterInsetStart(float f);

    RefreshLayout setFooterInsetStartPx(int i2);

    RefreshLayout setFooterMaxDragRate(float f);

    RefreshLayout setFooterTranslationViewId(int i2);

    RefreshLayout setFooterTriggerRate(float f);

    RefreshLayout setHeaderHeight(float f);

    RefreshLayout setHeaderHeightPx(int i2);

    RefreshLayout setHeaderInsetStart(float f);

    RefreshLayout setHeaderInsetStartPx(int i2);

    RefreshLayout setHeaderMaxDragRate(float f);

    RefreshLayout setHeaderTranslationViewId(int i2);

    RefreshLayout setHeaderTriggerRate(float f);

    RefreshLayout setNoMoreData(boolean z2);

    RefreshLayout setOnLoadMoreListener(OnLoadMoreListener onLoadMoreListener);

    RefreshLayout setOnMultiListener(OnMultiListener onMultiListener);

    RefreshLayout setOnRefreshListener(OnRefreshListener onRefreshListener);

    RefreshLayout setOnRefreshLoadMoreListener(OnRefreshLoadMoreListener onRefreshLoadMoreListener);

    RefreshLayout setPrimaryColors(int... iArr);

    RefreshLayout setPrimaryColorsId(int... iArr);

    RefreshLayout setReboundDuration(int i2);

    RefreshLayout setReboundInterpolator(Interpolator interpolator);

    RefreshLayout setRefreshContent(View view);

    RefreshLayout setRefreshContent(View view, int i2, int i3);

    RefreshLayout setRefreshFooter(RefreshFooter refreshFooter);

    RefreshLayout setRefreshFooter(RefreshFooter refreshFooter, int i2, int i3);

    RefreshLayout setRefreshHeader(RefreshHeader refreshHeader);

    RefreshLayout setRefreshHeader(RefreshHeader refreshHeader, int i2, int i3);

    RefreshLayout setScrollBoundaryDecider(ScrollBoundaryDecider scrollBoundaryDecider);
}

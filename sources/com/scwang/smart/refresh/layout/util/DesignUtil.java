package com.scwang.smart.refresh.layout.util;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.scwang.smart.refresh.layout.api.RefreshKernel;
import com.scwang.smart.refresh.layout.wrapper.RefreshContentWrapper;

/* JADX INFO: loaded from: classes5.dex */
public class DesignUtil {
    public static void a(View view, RefreshKernel refreshKernel, final RefreshContentWrapper refreshContentWrapper) {
        try {
            if (view instanceof CoordinatorLayout) {
                refreshKernel.getRefreshLayout().setEnableNestedScroll(false);
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroup.getChildAt(childCount);
                    if (childAt instanceof AppBarLayout) {
                        ((AppBarLayout) childAt).a(new AppBarLayout.OnOffsetChangedListener() { // from class: com.scwang.smart.refresh.layout.util.DesignUtil.1
                            @Override // com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
                            public final void a(AppBarLayout appBarLayout, int i2) {
                                boolean z2 = i2 >= 0;
                                boolean z3 = appBarLayout.getTotalScrollRange() + i2 <= 0;
                                RefreshContentWrapper refreshContentWrapper2 = refreshContentWrapper;
                                refreshContentWrapper2.h0 = z2;
                                refreshContentWrapper2.i0 = z3;
                            }
                        });
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

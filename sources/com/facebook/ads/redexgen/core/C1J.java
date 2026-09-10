package com.facebook.ads.redexgen.core;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1J, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1J extends C7M {
    public static String[] A00 = {"4mrgyhu5NuMSfoRJ7wvth", "0QrbVGKHuGc2eSGsbm7N10peHve4GVgP", "Meba3O6SWeMBrZzPyfP10SBJe7jX", "3Oa5wanHMWuCrkjHvXNfwyLB0ZtCKHr4", "YOQh7xYBrfW2123ECT3lDkRgUFpenV07", "JuO7BKBrPjkMVs4", "5m", "UWhmaXdvjdchgK72Wd2HML9QO634NCpp"};

    public C1J(C2300gi c2300gi) {
        super(c2300gi);
        setCarouselLayoutManager(c2300gi);
    }

    public AbstractC1371Ft getFullscreenCarouselRecyclerViewAdapter() {
        getAdapter();
        if (0 != 0) {
            getAdapter();
            return null;
        }
        if (A00[6].length() != 2) {
            throw new RuntimeException();
        }
        A00[2] = "XAsjP5XwQSgGjSaOGRXjEIyXW47w";
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.C7M
    public C2370hr getLayoutManager() {
        return (C2370hr) super.getLayoutManager();
    }

    public R7 getOnScrollListener() {
        return new PY(this);
    }

    private void setCarouselLayoutManager(C2300gi c2300gi) {
        C2370hr c2370hr = new C2370hr(c2300gi, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c2370hr.A1T(true);
        }
        super.setLayoutManager(c2370hr);
    }

    @Override // com.facebook.ads.redexgen.core.C7M
    public void setLayoutManager(R2 r2) {
    }
}

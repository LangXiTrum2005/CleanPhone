package com.thinkup.core.common.ooo.o;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o implements m {
    private static final int DEFAULT_IMPRESSION_MIN_PERCENTAGE_VIEWED = 50;
    private static final int DEFAULT_IMPRESSION_MIN_TIME_VIEWED_MS = 500;
    private boolean mImpressionRecorded;
    private int mImpressionMinTimeViewed = 500;
    private int mImpressionMinPercentageViewed = 50;
    private Integer mImpressionMinVisiblePx = null;

    @Override // com.thinkup.core.common.ooo.o.m
    public int getImpressionMinPercentageViewed() {
        return this.mImpressionMinPercentageViewed;
    }

    @Override // com.thinkup.core.common.ooo.o.m
    public int getImpressionMinTimeViewed() {
        return this.mImpressionMinTimeViewed;
    }

    @Override // com.thinkup.core.common.ooo.o.m
    public final Integer getImpressionMinVisiblePx() {
        return this.mImpressionMinVisiblePx;
    }

    @Override // com.thinkup.core.common.ooo.o.m
    public final boolean isImpressionRecorded() {
        return this.mImpressionRecorded;
    }

    @Override // com.thinkup.core.common.ooo.o.m
    public abstract void recordImpression(View view);

    @Override // com.thinkup.core.common.ooo.o.m
    public final void setImpressionRecorded() {
        this.mImpressionRecorded = true;
    }
}

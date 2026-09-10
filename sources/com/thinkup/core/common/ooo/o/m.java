package com.thinkup.core.common.ooo.o;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public interface m {
    int getImpressionMinPercentageViewed();

    int getImpressionMinTimeViewed();

    Integer getImpressionMinVisiblePx();

    boolean isImpressionRecorded();

    void recordImpression(View view);

    void setImpressionRecorded();
}

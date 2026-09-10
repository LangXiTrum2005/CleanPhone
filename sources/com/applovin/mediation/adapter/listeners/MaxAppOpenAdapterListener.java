package com.applovin.mediation.adapter.listeners;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.applovin.mediation.adapter.MaxAdapterError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface MaxAppOpenAdapterListener extends MaxAdapterListener {
    void onAppOpenAdClicked();

    void onAppOpenAdClicked(@Nullable Bundle bundle);

    void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError);

    void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError, @Nullable Bundle bundle);

    void onAppOpenAdDisplayed();

    void onAppOpenAdDisplayed(@Nullable Bundle bundle);

    void onAppOpenAdHidden();

    void onAppOpenAdHidden(@Nullable Bundle bundle);

    void onAppOpenAdLoadFailed(MaxAdapterError maxAdapterError);

    void onAppOpenAdLoaded();

    void onAppOpenAdLoaded(@Nullable Bundle bundle);
}

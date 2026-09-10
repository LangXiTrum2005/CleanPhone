package com.applovin.mediation.adapter;

import android.app.Activity;
import androidx.annotation.Nullable;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface MaxAdapter {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum InitializationStatus {
        NOT_INITIALIZED(-4),
        DOES_NOT_APPLY(-3),
        INITIALIZING(-2),
        INITIALIZED_UNKNOWN(-1),
        INITIALIZED_FAILURE(0),
        INITIALIZED_SUCCESS(1);

        private final int code;

        InitializationStatus(int i10) {
            this.code = i10;
        }

        public int getCode() {
            return this.code;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface OnCompletionListener {
        void onCompletion(InitializationStatus initializationStatus, String str);
    }

    String getAdapterVersion();

    String getSdkVersion();

    void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, OnCompletionListener onCompletionListener);

    boolean isBeta();

    void onDestroy();

    @Nullable
    Boolean shouldCollectSignalsOnUiThread();

    @Nullable
    Boolean shouldDestroyOnUiThread();

    @Nullable
    Boolean shouldInitializeOnUiThread();

    @Nullable
    Boolean shouldLoadAdsOnUiThread(MaxAdFormat maxAdFormat);

    @Nullable
    Boolean shouldShowAdsOnUiThread(MaxAdFormat maxAdFormat);
}

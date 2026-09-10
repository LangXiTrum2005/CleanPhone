package com.thinkup.core.api;

import android.content.Context;
import com.thinkup.core.common.on.ooo;

/* JADX INFO: loaded from: classes6.dex */
public interface IExHandlerBaseAd {

    public interface DataFetchListener {
        ooo getBaseAdContent();

        void onStatusChanged(String str);
    }

    void addDataFetchListener(DataFetchListener dataFetchListener);

    void onAdxAdDestroy(Context context);

    void pause(ooo oooVar);

    void removeDataFetchListener(DataFetchListener dataFetchListener);

    void updateOfferInfoWithDataInfo(ooo oooVar);
}

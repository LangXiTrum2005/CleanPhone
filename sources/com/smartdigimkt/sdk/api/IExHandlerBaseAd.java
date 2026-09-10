package com.smartdigimkt.sdk.api;

import android.content.Context;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes6.dex */
public interface IExHandlerBaseAd {

    public interface DataFetchListener {
        f getBaseAdContent();

        void onStatusChanged(String str);
    }

    void addDataFetchListener(DataFetchListener dataFetchListener);

    void onAdxAdDestroy(Context context);

    void pause(f fVar);

    void removeDataFetchListener(DataFetchListener dataFetchListener);

    void updateOfferInfoWithDataInfo(f fVar);
}

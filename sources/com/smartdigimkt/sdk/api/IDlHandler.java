package com.smartdigimkt.sdk.api;

import android.content.Context;
import com.smartdigimkt.c7.b;
import com.smartdigimkt.v6.a;
import com.smartdigimkt.w6.f;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public interface IDlHandler {
    int checkDataFetchType(f fVar, a aVar);

    void cleanExpiredInfo();

    SDMEventInterface createDataFetchListener(SDMEventInterface sDMEventInterface);

    void fillDataFetchStatus(Context context, f fVar, a aVar);

    void fillRequestDataForDl(JSONObject jSONObject);

    IExHandlerBaseAd getBaseAdHandler();

    void handleOfferClick(Context context, a aVar, f fVar, String str, String str2, Runnable runnable, b bVar);

    void onAppForegroundStatusChanged(boolean z2);

    void onApplicationBoot();

    void openDataConfirmDialog(Context context, f fVar, a aVar, com.smartdigimkt.c7.a aVar2);

    void registerMarketReceiver(f fVar);
}

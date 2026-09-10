package com.thinkup.core.api;

import android.content.Context;
import com.thinkup.core.common.mm.m;
import com.thinkup.core.common.mm.o;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.ooo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public interface IDlHandler {
    int checkDataFetchType(ooo oooVar, oom oomVar);

    void cleanExpiredInfo();

    void fillDataFetchStatus(Context context, ooo oooVar, oom oomVar);

    void fillRequestDataForDl(JSONObject jSONObject);

    IExHandlerBaseAd getBaseAdHandler();

    void handleOfferClick(Context context, oom oomVar, ooo oooVar, String str, String str2, Runnable runnable, m mVar);

    void onAppForegroundStatusChanged(boolean z2);

    void onApplicationBoot();

    void openDataConfirmDialog(Context context, ooo oooVar, oom oomVar, o oVar);
}

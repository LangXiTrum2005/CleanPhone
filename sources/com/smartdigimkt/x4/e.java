package com.smartdigimkt.x4;

import android.content.Context;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.m3.m;
import com.smartdigimkt.sdk.api.IOfferClickHandler;

/* JADX INFO: loaded from: classes6.dex */
public class e extends IOfferClickHandler {
    private com.smartdigimkt.v3.g a(com.smartdigimkt.w6.f fVar) {
        return h.a().a(fVar.O(), fVar.L());
    }

    @Override // com.smartdigimkt.sdk.api.IOfferClickHandler
    public boolean startDataFetchApp(Context context, com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, String str) {
        return com.smartdigimkt.m3.f.a(context, aVar, fVar, a(fVar), str, new m());
    }
}

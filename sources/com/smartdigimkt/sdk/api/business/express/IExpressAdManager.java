package com.smartdigimkt.sdk.api.business.express;

import android.content.Context;
import com.smartdigimkt.c5.b;
import com.smartdigimkt.c5.c;
import com.smartdigimkt.v6.a;
import com.smartdigimkt.w6.d;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes6.dex */
public abstract class IExpressAdManager {
    public abstract IExpressComponent createExpressComponent(Context context, a aVar, f fVar, b bVar);

    public abstract void handleExpressAdResourceRequest(d dVar, a aVar, c cVar);

    public abstract void initExpressSDK(d dVar);

    public abstract boolean isLocalResourceReady(d dVar, a aVar);
}

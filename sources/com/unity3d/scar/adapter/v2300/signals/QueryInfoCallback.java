package com.unity3d.scar.adapter.v2300.signals;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.unity3d.scar.adapter.common.signals.SignalCallbackListener;

/* JADX INFO: loaded from: classes6.dex */
public class QueryInfoCallback extends QueryInfoGenerationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SignalCallbackListener f42848b;

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        this.f42848b.a(str);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        this.f42848b.b(this.f42847a, queryInfo.getQuery());
    }
}

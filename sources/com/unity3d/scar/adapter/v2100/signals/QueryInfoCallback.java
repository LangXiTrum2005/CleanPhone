package com.unity3d.scar.adapter.v2100.signals;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.unity3d.scar.adapter.common.signals.SignalCallbackListener;

/* JADX INFO: loaded from: classes6.dex */
public class QueryInfoCallback extends QueryInfoGenerationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SignalCallbackListener f42823b;

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        this.f42823b.a(str);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        this.f42823b.b(this.f42822a, queryInfo.getQuery());
    }
}

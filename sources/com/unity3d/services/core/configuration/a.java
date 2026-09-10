package com.unity3d.services.core.configuration;

import ak.f;
import cn.a0;
import com.unity3d.ads.core.domain.HttpClientProvider;
import jk.c;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HttpClientProvider f38600b;

    public /* synthetic */ a(HttpClientProvider httpClientProvider, int i10) {
        this.f38599a = i10;
        this.f38600b = httpClientProvider;
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38599a;
        a0 a0Var = (a0) obj;
        f fVar = (f) obj2;
        HttpClientProvider httpClientProvider = this.f38600b;
        switch (i10) {
            case 0:
                return InitializeThread.InitializeStateConfig.lambda$executeWithLoader$0(httpClientProvider, a0Var, fVar);
            case 1:
                return InitializeThread.InitializeStateDownloadWebView.lambda$execute$0(httpClientProvider, a0Var, fVar);
            default:
                return InitializeThread.InitializeStateLoadWeb.lambda$execute$0(httpClientProvider, a0Var, fVar);
        }
    }
}

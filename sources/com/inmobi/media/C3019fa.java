package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: renamed from: com.inmobi.media.fa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3019fa implements Ja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G5 f23612a;

    public C3019fa(AdConfig.PingsV2Config pingsConfig) {
        Intrinsics.f(pingsConfig, "pingsConfig");
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setMaxRequests(pingsConfig.getMaxBatchSize().getHigh());
        this.f23612a = new G5(new Interceptor[0], dispatcher, new C3055he(pingsConfig.getConnectTimeout(), pingsConfig.getReadTimeout(), pingsConfig.getCallTimeout()));
    }

    @Override // com.inmobi.media.Ja
    public final Object a(C3338za ping) {
        Intrinsics.f(ping, "ping");
        HashMap map = new HashMap(ping.f24161c);
        map.put("user-agent", Uc.k());
        L9 l9 = new L9(ping.f24159a, map, ping.d);
        G5 g5 = this.f23612a;
        g5.getClass();
        C2962c3 c2962c3 = g5.f22841a;
        c2962c3.getClass();
        OkHttpClient okHttpClient = c2962c3.f23478a;
        Request.Builder builderUrl = new Request.Builder().url(l9.f22949a);
        for (Map.Entry entry : map.entrySet()) {
            builderUrl.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        builderUrl.get();
        return c2962c3.a(okHttpClient, builderUrl.build(), l9.f22949a);
    }
}

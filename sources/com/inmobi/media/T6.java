package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class T6 implements Ja {
    public T6(AdConfig.PingsV2Config pingsConfig) {
        Intrinsics.f(pingsConfig, "pingsConfig");
    }

    @Override // com.inmobi.media.Ja
    public final Object a(C3338za ping) {
        Intrinsics.f(ping, "ping");
        N9 n9 = new N9(ping.f24159a, null);
        HashMap map = new HashMap(ping.f24161c);
        map.put("user-agent", Uc.k());
        n9.f23010i.putAll(map);
        n9.x = false;
        n9.t = false;
        n9.f23014u = false;
        n9.r = ping.d;
        return n9.b();
    }
}

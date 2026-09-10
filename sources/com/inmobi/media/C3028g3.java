package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.SignalsConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3028g3 implements N2 {
    @Override // com.inmobi.media.N2
    public final void a(Config config) {
        Intrinsics.f(config, "config");
        synchronized (this) {
            C3044h3 c3044h3 = C3044h3.f23645a;
            SignalsConfig signalsConfig = (SignalsConfig) config;
            C3044h3.d = signalsConfig;
            C3044h3.f = AbstractC3077j4.a(signalsConfig.getKA());
            c3044h3.b();
        }
    }
}

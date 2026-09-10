package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Ea implements N2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fa f22800a;

    public Ea(Fa fa) {
        this.f22800a = fa;
    }

    @Override // com.inmobi.media.N2
    public final void a(Config config) {
        Intrinsics.f(config, "config");
        if (config instanceof AdConfig) {
            AdConfig.PingsV2Config pingV2 = ((AdConfig) config).getPingV2();
            Fa fa = this.f22800a;
            fa.getClass();
            Intrinsics.f(pingV2, "<set-?>");
            fa.f = pingV2;
        }
    }
}

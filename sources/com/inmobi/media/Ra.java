package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public class Ra extends lf {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AdConfig.ViewabilityConfig f23126n;
    public final int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ra(ff visibilityChecker, AdConfig.ViewabilityConfig viewabilityConfig, byte b2, InterfaceC3333z5 interfaceC3333z5) {
        super(visibilityChecker, b2, interfaceC3333z5);
        Intrinsics.f(visibilityChecker, "visibilityChecker");
        this.f23126n = viewabilityConfig;
        this.o = 100;
    }

    @Override // com.inmobi.media.lf
    public int c() {
        AdConfig.ViewabilityConfig viewabilityConfig = this.f23126n;
        return viewabilityConfig != null ? viewabilityConfig.getVisibilityThrottleMillis() : this.o;
    }

    @Override // com.inmobi.media.lf
    public final void d() {
        g();
    }
}

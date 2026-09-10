package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public class X4 extends Ra {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f23339p;

    /* JADX WARN: Illegal instructions before constructor call */
    public X4(AdConfig.ViewabilityConfig viewabilityConfig, byte b2, InterfaceC3333z5 interfaceC3333z5) {
        P4 visibilityChecker = S4.k;
        Intrinsics.f(visibilityChecker, "visibilityChecker");
        super(visibilityChecker, viewabilityConfig, b2, interfaceC3333z5);
        this.f23339p = 1000;
    }

    @Override // com.inmobi.media.Ra, com.inmobi.media.lf
    public int c() {
        AdConfig.ViewabilityConfig viewabilityConfig = this.f23126n;
        return viewabilityConfig != null ? viewabilityConfig.getWebVisibilityThrottleMillis() : this.f23339p;
    }
}

package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2862e0 {
    public final C3139p1 a;
    public final saran b;
    public final AdConfig c;
    public final Jg d;
    public final C3097n9 e;
    public final C2811c0 f;
    public final C3063m0 g;

    public AbstractC2862e0(C3114o1 adManagerComponent) {
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullExpressionValue(adManagerComponent.b.getApplicationContext(), "getApplicationContext(...)");
        C3139p1 c3139p1 = adManagerComponent.a;
        this.a = c3139p1;
        this.b = adManagerComponent.e;
        this.c = c3139p1.b;
        this.d = c3139p1.a;
        this.e = adManagerComponent.c;
        this.f = adManagerComponent.d;
        this.g = adManagerComponent.f;
    }
}

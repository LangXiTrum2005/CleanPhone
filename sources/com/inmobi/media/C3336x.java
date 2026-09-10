package com.inmobi.media;

import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3336x implements InterfaceC3320w8 {
    public final /* synthetic */ C3114o1 a;
    public final G b;

    public C3336x(C3114o1 adManagerComponent, G adContext) {
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(adContext, "adContext");
        this.a = adManagerComponent;
        this.b = adContext;
    }

    @Override // com.inmobi.media.InterfaceC3320w8
    public final saran a() {
        return this.a.e;
    }

    @Override // com.inmobi.media.InterfaceC3320w8
    public final C3063m0 b() {
        return this.a.f;
    }

    @Override // com.inmobi.media.InterfaceC3320w8
    public final InterfaceC3072m9 c() {
        return this.a.c;
    }
}

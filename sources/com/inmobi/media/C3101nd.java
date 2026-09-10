package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3101nd extends AbstractC2975ib {
    public final C3114o1 o;
    public final AbstractC3213s1 p;
    public final Hc q;
    public final Ac r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3101nd(byte[] bArr, C3114o1 adManagerComponent, AbstractC3213s1 adUnitTimeout, Hc nativeCallback, Ac stateMachine) {
        super(bArr, adManagerComponent, adUnitTimeout, nativeCallback, stateMachine);
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(nativeCallback, "nativeCallback");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.o = adManagerComponent;
        this.p = adUnitTimeout;
        this.q = nativeCallback;
        this.r = stateMachine;
    }

    @Override // com.inmobi.media.AbstractC2975ib
    public final void a(AdResponse obj) {
        Intrinsics.checkNotNullParameter(obj, "adResponse");
        C3097n9 c3097n9 = this.e;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            c3097n9.a("AUM-NativeLoadResponseState", "onAdResponseParseSuccess - ad response received: " + AbstractC3073ma.a(obj, AdResponse.class));
        }
        S0.a(this.o, obj, new C3051ld(this), new C3076md(this));
    }
}

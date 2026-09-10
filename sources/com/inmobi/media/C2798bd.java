package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2798bd extends R6 {
    public final C3114o1 o;
    public final AbstractC3213s1 p;
    public final Hc q;
    public final Ac r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2798bd(C3114o1 adManagerComponent, AbstractC3213s1 adUnitTimeout, Ac stateMachine, Hc nativeCallback) {
        super(adManagerComponent, adUnitTimeout, stateMachine, nativeCallback);
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(nativeCallback, "nativeCallback");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.o = adManagerComponent;
        this.p = adUnitTimeout;
        this.q = nativeCallback;
        this.r = stateMachine;
    }

    @Override // com.inmobi.media.R6
    public final void a(AdResponse obj) {
        Intrinsics.checkNotNullParameter(obj, "adResponse");
        C3097n9 c3097n9 = this.e;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            c3097n9.a("AUM-NativeFetchingState", "onAdResponseParseSuccess " + AbstractC3073ma.a(obj, AdResponse.class));
        }
        S0.a(this.o, obj, new Zc(this), new C2772ad(this));
    }
}

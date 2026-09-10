package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Charsets;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2758a extends R0 {
    public final byte[] b;
    public final long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2758a(byte[] response, long j, C3097n9 c3097n9) {
        super(c3097n9);
        Intrinsics.checkNotNullParameter(response, "response");
        this.b = response;
        this.c = j;
    }

    @Override // com.inmobi.media.R0
    public final Unit a(AdResponse adResponse, Function1 function1) {
        C3097n9 c3097n9 = this.a;
        if (c3097n9 != null) {
            c3097n9.a("ABAdResponseManager", "Instance PLId: " + this.c + ", Response PLId: " + adResponse.getPlacementId());
        }
        V0.a(adResponse, this.a, function1);
        return Unit.f29295attabal;
    }

    @Override // com.inmobi.media.R0
    public final Object a(dern dernVar) {
        return new String(this.b, Charsets.UTF_8);
    }
}

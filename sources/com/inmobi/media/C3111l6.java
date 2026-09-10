package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.l6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3111l6 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3127m6 f23768a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3111l6(C3127m6 c3127m6) {
        super(1);
        this.f23768a = c3127m6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EnumC3157o4 it = (EnumC3157o4) obj;
        Intrinsics.f(it, "it");
        this.f23768a.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE), true, AbstractC2939ae.a(it));
        return Unit.f43263a;
    }
}

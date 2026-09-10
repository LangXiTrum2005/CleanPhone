package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.b8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2950b8 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2967c8 f23462a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2950b8(C2967c8 c2967c8) {
        super(1);
        this.f23462a = c2967c8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EnumC3157o4 it = (EnumC3157o4) obj;
        Intrinsics.f(it, "it");
        this.f23462a.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE), true, AbstractC2939ae.a(it));
        return Unit.f43263a;
    }
}

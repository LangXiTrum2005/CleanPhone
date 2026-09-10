package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.vc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3276vc extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3276vc f24061a = new C3276vc();

    public C3276vc() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C3260uc _request = (C3260uc) obj;
        long jLongValue = ((Number) obj2).longValue();
        Intrinsics.f(_request, "_request");
        AbstractC3292wc.a(_request, jLongValue);
        return Unit.f43263a;
    }
}

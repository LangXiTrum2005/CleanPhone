package com.inmobi.media;

import java.util.concurrent.ScheduledFuture;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3184q extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f23904a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3184q(long j) {
        super(1);
        this.f23904a = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C2978d2 it = (C2978d2) obj;
        Intrinsics.f(it, "it");
        int i2 = it.f23507a;
        if (i2 != 101) {
            if (i2 == 102) {
                ScheduledFuture scheduledFuture = C3215s.f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                C3215s.f = null;
            }
        } else if (C3215s.f == null && C3215s.d.get()) {
            C3215s.a(this.f23904a);
        }
        return Unit.f43263a;
    }
}

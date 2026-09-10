package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ScheduledFuture;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3168p extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f23877a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3168p(Context context) {
        super(0);
        this.f23877a = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C3136n c3136n = C3215s.f23974c;
        if (c3136n != null) {
            C2.a(new C3152o(this.f23877a, c3136n));
            C3215s.f23974c = null;
        }
        ScheduledFuture scheduledFuture = C3215s.f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        C3184q c3184q = C3215s.f23976h;
        if (c3184q != null) {
            Uc.f().a(c3184q);
        }
        C3215s.f23976h = null;
        C3215s.f = null;
        return Unit.f43263a;
    }
}

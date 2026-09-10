package com.inmobi.media;

import java.util.concurrent.ScheduledFuture;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class G extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f22832a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(I i2) {
        super(0);
        this.f22832a = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ScheduledFuture scheduledFuture = this.f22832a.k;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        Df df = this.f22832a.f22872l;
        if (df != null) {
            df.a();
        }
        I i2 = this.f22832a;
        i2.f22872l = null;
        i2.k = null;
        i2.a(new A4(0.0f, null, null));
        return Unit.f43263a;
    }
}

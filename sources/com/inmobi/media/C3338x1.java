package com.inmobi.media;

import android.app.ApplicationExitInfo;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.yaounde;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3338x1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ C3363y1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3338x1(C3363y1 c3363y1, dern dernVar) {
        super(1, dernVar);
        this.a = c3363y1;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(dern dernVar) {
        return new C3338x1(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3338x1(this.a, (dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        C3363y1 c3363y1 = this.a;
        List historicalProcessExitReasons = c3363y1.e.getHistoricalProcessExitReasons(c3363y1.b.getPackageName(), 0, 10);
        Intrinsics.checkNotNullExpressionValue(historicalProcessExitReasons, "getHistoricalProcessExitReasons(...)");
        Ea ea = this.a.f;
        ea.getClass();
        Intrinsics.checkNotNullParameter("exitReasonTimestamp", com.ironsource.X3.i.W);
        long j = ea.a.getLong("exitReasonTimestamp", 0L);
        C3363y1 c3363y2 = this.a;
        Iterator it = historicalProcessExitReasons.iterator();
        long timestamp = j;
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoAttabal = yaounde.attabal(it.next());
            if (applicationExitInfoAttabal.getTimestamp() > j) {
                long j2 = c3363y2.c;
                C3313w1 runnable = new C3313w1(c3363y2, applicationExitInfoAttabal, null);
                saran saranVar = AbstractC2984il.a;
                Intrinsics.checkNotNullParameter(runnable, "runnable");
                cutely.wireman(AbstractC2984il.a, null, null, new C2909fl(j2, null, runnable), 3, null);
                if (applicationExitInfoAttabal.getTimestamp() > timestamp) {
                    timestamp = applicationExitInfoAttabal.getTimestamp();
                }
            }
        }
        this.a.f.a("exitReasonTimestamp", timestamp, false);
        return Unit.f29295attabal;
    }
}

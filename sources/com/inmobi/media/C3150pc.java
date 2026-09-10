package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;
import p002kotlin.text.Charsets;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3150pc extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C3175qc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3150pc(C3175qc c3175qc, dern dernVar) {
        super(2, dernVar);
        this.b = c3175qc;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3150pc(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3150pc(this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            C3175qc c3175qc = this.b;
            String str = c3175qc.a;
            int i2 = c3175qc.b;
            int i3 = c3175qc.c;
            IntRange intRange = Se.a;
            c3175qc.g = new Je(str, null, null, null, new Ai(i2, i3 * 1000, 0), false, 46);
            C3175qc c3175qc2 = this.b;
            Je je = c3175qc2.g;
            Context context = Ji.a;
            if (context != null) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter("mraid_js_store", "sharePrefFile");
                ConcurrentHashMap concurrentHashMap = Ea.b;
                Ea eaA = Da.a(context, "mraid_js_store");
                Intrinsics.checkNotNullParameter("last_ts", com.ironsource.X3.i.W);
                if ((System.currentTimeMillis() / ((long) 1000)) - eaA.a.getLong("last_ts", 0L) > c3175qc2.d && je != null) {
                    C3271u9 c3271u9 = (C3271u9) He.c.getValue();
                    this.a = 1;
                    objA = c3271u9.a.a(je, this);
                    if (objA == objBeachfront) {
                        return objBeachfront;
                    }
                }
            }
            return Unit.f29295attabal;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p002kotlin.dern.saneness(obj);
        objA = obj;
        Ne ne = (Ne) objA;
        Context context2 = Ji.a;
        if (!AbstractC2935gl.a(ne)) {
            C3175qc c3175qc3 = this.b;
            InterfaceC3072m9 interfaceC3072m9 = c3175qc3.e;
            if (interfaceC3072m9 != null) {
                String str2 = c3175qc3.f;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m9).b(str2, "Getting MRAID Js from server failed.");
            }
        } else if (context2 != null) {
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter("mraid_js_store", "sharePrefFile");
            ConcurrentHashMap concurrentHashMap2 = Ea.b;
            Ea eaA2 = Da.a(context2, "mraid_js_store");
            IntRange intRange2 = Se.a;
            Intrinsics.checkNotNullParameter(ne, "<this>");
            String value = ne.d().string(Charsets.UTF_8);
            Intrinsics.checkNotNullParameter("mraid_js_string", com.ironsource.X3.i.W);
            Intrinsics.checkNotNullParameter(value, "value");
            eaA2.a("mraid_js_string", value, false);
            eaA2.a("last_ts", System.currentTimeMillis() / ((long) 1000), false);
        }
        return Unit.f29295attabal;
    }
}

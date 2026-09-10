package ads_mobile_sdk;

import android.net.Uri;
import java.util.Map;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes.dex */
public final class og2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ qg2 b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ h1 d;
    public final /* synthetic */ ur e;
    public final /* synthetic */ e2 f;
    public final /* synthetic */ Boolean g;
    public final /* synthetic */ l13 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og2(qg2 qg2Var, Uri uri, h1 h1Var, ur urVar, e2 e2Var, Boolean bool, l13 l13Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = qg2Var;
        this.c = uri;
        this.d = h1Var;
        this.e = urVar;
        this.f = e2Var;
        this.g = bool;
        this.h = l13Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new og2(this.b, this.c, this.d, this.e, this.f, this.g, this.h, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((og2) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            qg2 qg2Var = this.b;
            Uri uri = this.c;
            ns1 ns1Var = this.d.t0;
            Intrinsics.beachfront(ns1Var);
            os1 os1Var = ns1Var.a;
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            long jMolybdenite = p002kotlin.time.dern.molybdenite(0, DurationUnit.MILLISECONDS);
            String str = this.e.h;
            qg2 qg2Var2 = this.b;
            Map mapA = qg2Var2.g.a(this.c);
            e2 e2Var = this.f;
            h1 h1Var = this.d;
            Boolean bool = this.g;
            l13 l13Var = this.h;
            this.a = 1;
            if (qg2Var.a(uri, os1Var, 1, jMolybdenite, str, mapA, e2Var, h1Var, bool, l13Var, this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return Unit.f29295attabal;
    }
}

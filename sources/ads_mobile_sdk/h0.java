package ads_mobile_sdk;

import com.google.common.base.triweekly;
import com.ironsource.X3;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.nestlike;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(String str, String str2, Object obj, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = str;
        this.b = str2;
        this.c = obj;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new h0(this.a, this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        triweekly triweeklyVar = kn0.a;
        kn0.b("Invoking function [" + this.a + "] on listener [" + this.b + X3.j.e, null);
        ((nestlike) this.c).d();
        return Unit.f29295attabal;
    }
}

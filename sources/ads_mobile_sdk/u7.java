package ads_mobile_sdk;

import com.google.common.base.triweekly;
import com.ironsource.X3;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.anaphylactin;

/* JADX INFO: loaded from: classes.dex */
public final class u7 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ m73 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(String str, String str2, Object obj, wretchedly.dern dernVar, m73 m73Var) {
        super(2, dernVar);
        this.b = str;
        this.c = str2;
        this.d = obj;
        this.e = m73Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new u7(this.b, this.c, this.d, dernVar, this.e);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u7) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            triweekly triweeklyVar = kn0.a;
            kn0.b("Invoking function [" + this.b + "] on listener [" + this.c + X3.j.e, null);
            anaphylactin anaphylactinVar = (anaphylactin) this.d;
            m73 m73Var = this.e;
            this.a = 1;
            if (anaphylactinVar.a(m73Var, this) == objBeachfront) {
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

package ads_mobile_sdk;

import com.google.common.base.triweekly;
import com.ironsource.X3;
import complexometry.ResponseInfo;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.basify;

/* JADX INFO: loaded from: classes.dex */
public final class z21 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ jm2 e;
    public final /* synthetic */ h1 f;
    public final /* synthetic */ ResponseInfo g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z21(String str, String str2, Object obj, wretchedly.dern dernVar, jm2 jm2Var, h1 h1Var, ResponseInfo responseInfo) {
        super(2, dernVar);
        this.b = str;
        this.c = str2;
        this.d = obj;
        this.e = jm2Var;
        this.f = h1Var;
        this.g = responseInfo;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new z21(this.b, this.c, this.d, dernVar, this.e, this.f, this.g);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z21) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            triweekly triweeklyVar = kn0.a;
            kn0.b("Invoking function [" + this.b + "] on listener [" + this.c + X3.j.e, null);
            basify basifyVar = (basify) this.d;
            jm2 jm2Var = this.e;
            h1 h1Var = this.f;
            ResponseInfo responseInfo = this.g;
            this.a = 1;
            if (basifyVar.a(jm2Var, h1Var, responseInfo, this) == objBeachfront) {
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

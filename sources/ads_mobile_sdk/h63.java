package ads_mobile_sdk;

import androidx.datastore.core.competently;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h63 extends SuspendLambda implements Function2 {
    public formularization.attabal a;
    public k63 b;
    public String c;
    public int d;
    public final /* synthetic */ k63 e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h63(k63 k63Var, String str, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.e = k63Var;
        this.f = str;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new h63(this.e, this.f, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new h63(this.e, this.f, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        k63 k63Var;
        formularization.attabal attabalVar;
        String str;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.d;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            sj0 sj0Var = this.e.c;
            String newUserAgent = this.f;
            Intrinsics.checkNotNullExpressionValue(newUserAgent, "$newUserAgent");
            this.d = 1;
            Object objAttabal = ((competently) sj0Var.a.get()).attabal(new nj0(newUserAgent, null), this);
            if (objAttabal != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                objAttabal = Unit.f29295attabal;
            }
            if (objAttabal != objBeachfront) {
            }
            return objBeachfront;
        }
        if (i == 1) {
            p002kotlin.dern.saneness(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.c;
            k63Var = this.b;
            attabalVar = this.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            Intrinsics.beachfront(str);
            int i2 = k63.f3287attabal;
            k63Var.a(str);
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
        k63Var = this.e;
        formularization.attabal attabalVar2 = k63Var.h;
        String str2 = this.f;
        this.a = attabalVar2;
        this.b = k63Var;
        this.c = str2;
        this.d = 2;
        if (attabalVar2.attabal(null, this) != objBeachfront) {
            attabalVar = attabalVar2;
            str = str2;
            Intrinsics.beachfront(str);
            int i3 = k63.f3287attabal;
            k63Var.a(str);
            return Unit.f29295attabal;
        }
        return objBeachfront;
    }
}

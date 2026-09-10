package ads_mobile_sdk;

import android.content.Context;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.conclusively;

/* JADX INFO: loaded from: classes.dex */
public final class u8 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ conclusively b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ j8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(conclusively conclusivelyVar, Context context, j8 j8Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = conclusivelyVar;
        this.c = context;
        this.d = j8Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new u8(this.b, this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u8) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
            return obj;
        }
        p002kotlin.dern.saneness(obj);
        conclusively conclusivelyVar = this.b;
        Context context = this.c;
        j8 j8Var = this.d;
        this.a = 1;
        Object objA = conclusivelyVar.a(context, j8Var, this);
        return objA == objBeachfront ? objBeachfront : objA;
    }
}

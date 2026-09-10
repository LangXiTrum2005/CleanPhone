package ads_mobile_sdk;

import android.database.sqlite.SQLiteDatabase;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class yt1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ au1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt1(au1 au1Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = au1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        yt1 yt1Var = new yt1(this.b, dernVar);
        yt1Var.a = obj;
        return yt1Var;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        yt1 yt1Var = new yt1(this.b, (wretchedly.dern) obj2);
        yt1Var.a = (SQLiteDatabase) obj;
        return yt1Var.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        au1.a(this.b, (SQLiteDatabase) this.a);
        return Unit.f29295attabal;
    }
}

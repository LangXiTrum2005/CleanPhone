package ads_mobile_sdk;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class wt1 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ au1 c;
    public final /* synthetic */ tt1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt1(au1 au1Var, tt1 tt1Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.c = au1Var;
        this.d = tt1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        wt1 wt1Var = new wt1(this.c, this.d, dernVar);
        wt1Var.b = obj;
        return wt1Var;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((wt1) create((SQLiteDatabase) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.b;
            ContentValues contentValues = new ContentValues();
            tt1 tt1Var = this.d;
            contentValues.put("timestamp", igo.attabal.marial(tt1Var.a));
            contentValues.put("gws_query_id", tt1Var.b);
            contentValues.put("url", tt1Var.c);
            st1 st1Var = st1.READY_TO_PING;
            contentValues.put("event_state", igo.attabal.wireman(1));
            sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
            mu1 mu1Var = this.c.c;
            this.a = 1;
            mu1Var.getClass();
            if (mu1.a(mu1Var, this) == objBeachfront) {
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

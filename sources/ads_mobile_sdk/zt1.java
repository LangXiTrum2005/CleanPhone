package ads_mobile_sdk;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class zt1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ au1 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt1(au1 au1Var, String str, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = au1Var;
        this.c = str;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        zt1 zt1Var = new zt1(this.b, this.c, dernVar);
        zt1Var.a = obj;
        return zt1Var;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((zt1) create((SQLiteDatabase) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.a;
        au1 au1Var = this.b;
        String str = this.c;
        String str2 = au1.f;
        au1Var.getClass();
        ContentValues contentValues = new ContentValues();
        st1 st1Var = st1.READY_TO_PING;
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        au1.a(this.b, sQLiteDatabase);
        return Unit.f29295attabal;
    }
}

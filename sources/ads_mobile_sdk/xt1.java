package ads_mobile_sdk;

import android.database.sqlite.SQLiteDatabase;
import com.google.common.base.triweekly;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xt1 extends SuspendLambda implements Function2 {
    public formularization.attabal a;
    public Function2 b;
    public au1 c;
    public int d;
    public final /* synthetic */ au1 e;
    public final /* synthetic */ Function2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt1(au1 au1Var, Function2 function2, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.e = au1Var;
        this.f = function2;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new xt1(this.e, this.f, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new xt1(this.e, this.f, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11, types: [formularization.attabal] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [formularization.attabal] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [formularization.attabal] */
    /* JADX WARN: Type inference failed for: r8v6, types: [formularization.attabal] */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        ?? r8;
        Function2 function2;
        au1 au1Var;
        ?? r0;
        Exception e;
        ?? Beachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.d;
        try {
            try {
                if (i == 0) {
                    p002kotlin.dern.saneness(obj);
                    formularization.attabal attabalVar = this.e.e;
                    Function2 function3 = this.f;
                    au1 au1Var2 = this.e;
                    this.a = attabalVar;
                    this.b = function3;
                    this.c = au1Var2;
                    this.d = 1;
                    if (attabalVar.attabal(null, this) != Beachfront) {
                        function2 = function3;
                        au1Var = au1Var2;
                        r8 = attabalVar;
                    }
                    return Beachfront;
                }
                if (i == 1) {
                    au1Var = this.c;
                    function2 = this.b;
                    formularization.attabal attabalVar2 = this.a;
                    p002kotlin.dern.saneness(obj);
                    r8 = attabalVar2;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r0 = this.a;
                    try {
                        p002kotlin.dern.saneness(obj);
                        Beachfront = r0;
                    } catch (Exception e2) {
                        e = e2;
                        triweekly triweeklyVar = kn0.a;
                        kn0.a("Error interacting with offline buffered ping database: " + e.getMessage(), (Throwable) null);
                        Beachfront = r0;
                    }
                }
                Unit unit = Unit.f29295attabal;
                Beachfront.wireman(null);
                return unit;
                SQLiteDatabase writableDatabase = au1Var.getWritableDatabase();
                Intrinsics.checkNotNullExpressionValue(writableDatabase, "getWritableDatabase(...)");
                this.a = r8;
                this.b = null;
                this.c = null;
                this.d = 2;
                if (function2.invoke(writableDatabase, this) != Beachfront) {
                    Beachfront = r8;
                    Unit unit2 = Unit.f29295attabal;
                    Beachfront.wireman(null);
                    return unit2;
                }
                return Beachfront;
            } catch (Exception e3) {
                r0 = r8;
                e = e3;
                triweekly triweeklyVar2 = kn0.a;
                kn0.a("Error interacting with offline buffered ping database: " + e.getMessage(), (Throwable) null);
                Beachfront = r0;
            } catch (Throwable th2) {
                th = th2;
                r8.wireman(null);
                throw th;
            }
        } catch (Throwable th3) {
            ?? r6 = Beachfront;
            th = th3;
            r8 = r6;
        }
    }
}

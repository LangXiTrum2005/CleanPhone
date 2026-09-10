package ads_mobile_sdk;

import com.google.gson.JsonObject;
import com.ironsource.Y3;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.evenfall;

/* JADX INFO: loaded from: classes.dex */
public final class mj1 extends SuspendLambda implements Function2 {
    public w03 a;
    public w03 b;
    public hj1 c;
    public int d;
    public final /* synthetic */ hj1 e;
    public final /* synthetic */ vj1 f;
    public final /* synthetic */ JsonObject g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj1(hj1 hj1Var, vj1 vj1Var, JsonObject jsonObject, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.e = hj1Var;
        this.f = vj1Var;
        this.g = jsonObject;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new mj1(this.e, this.f, this.g, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mj1) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:23:0x005a, B:25:0x0061, B:27:0x0068, B:29:0x006c, B:31:0x0070, B:34:0x0073, B:35:0x0078, B:36:0x0079, B:37:0x0080, B:38:0x0081, B:39:0x0088, B:40:0x0089), top: B:45:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0068 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:23:0x005a, B:25:0x0061, B:27:0x0068, B:29:0x006c, B:31:0x0070, B:34:0x0073, B:35:0x0078, B:36:0x0079, B:37:0x0080, B:38:0x0081, B:39:0x0088, B:40:0x0089), top: B:45:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:29:0x006c A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:23:0x005a, B:25:0x0061, B:27:0x0068, B:29:0x006c, B:31:0x0070, B:34:0x0073, B:35:0x0078, B:36:0x0079, B:37:0x0080, B:38:0x0081, B:39:0x0088, B:40:0x0089), top: B:45:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0070 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:23:0x005a, B:25:0x0061, B:27:0x0068, B:29:0x006c, B:31:0x0070, B:34:0x0073, B:35:0x0078, B:36:0x0079, B:37:0x0080, B:38:0x0081, B:39:0x0088, B:40:0x0089), top: B:45:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0073 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:23:0x005a, B:25:0x0061, B:27:0x0068, B:29:0x006c, B:31:0x0070, B:34:0x0073, B:35:0x0078, B:36:0x0079, B:37:0x0080, B:38:0x0081, B:39:0x0088, B:40:0x0089), top: B:45:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0079 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:23:0x005a, B:25:0x0061, B:27:0x0068, B:29:0x006c, B:31:0x0070, B:34:0x0073, B:35:0x0078, B:36:0x0079, B:37:0x0080, B:38:0x0081, B:39:0x0088, B:40:0x0089), top: B:45:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0081 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:23:0x005a, B:25:0x0061, B:27:0x0068, B:29:0x006c, B:31:0x0070, B:34:0x0073, B:35:0x0078, B:36:0x0079, B:37:0x0080, B:38:0x0081, B:39:0x0088, B:40:0x0089), top: B:45:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0089 A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:23:0x005a, B:25:0x0061, B:27:0x0068, B:29:0x006c, B:31:0x0070, B:34:0x0073, B:35:0x0078, B:36:0x0079, B:37:0x0080, B:38:0x0081, B:39:0x0088, B:40:0x0089), top: B:45:0x005a }] */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        w03 w03VarA;
        w03 w03Var;
        hj1 hj1Var;
        w03 w03Var2;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.d;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            hj1 hj1Var2 = this.e;
            no0 no0Var = no0.CUI_NAME_LOAD_NATIVE_ATTRIBUTION_INFO;
            vj1 vj1Var = this.f;
            JsonObject jsonObject = this.g;
            WeakHashMap weakHashMap = j13.a;
            w03VarA = j13.a(no0Var, adultoid.formularize(), true);
            try {
                hn1 hn1Var = vj1Var.c;
                this.a = w03VarA;
                this.b = w03VarA;
                this.c = hj1Var2;
                this.d = 1;
                Object objA = hn1Var.a(jsonObject, Y3.c, this);
                if (objA == objBeachfront) {
                    return objBeachfront;
                }
                hj1Var = hj1Var2;
                obj = objA;
                w03Var2 = w03VarA;
            } catch (Throwable th) {
                th = th;
                w03Var = w03VarA;
                w03VarA.b(th);
                if (!(th instanceof evenfall)) {
                    throw th;
                }
                w03VarA.a(th);
                if (!(th instanceof TimeoutCancellationException)) {
                    throw new cp0(th);
                }
                if (!(th instanceof CancellationException)) {
                    throw new bn0(th);
                }
                if (th instanceof yn0) {
                    throw th;
                }
                throw new gn0(th);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hj1Var = this.c;
            w03VarA = this.b;
            w03Var2 = this.a;
            try {
                p002kotlin.dern.saneness(obj);
            } catch (Throwable th2) {
                th = th2;
                w03Var = w03VarA;
                w03VarA = w03Var2;
                try {
                    w03VarA.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    w03VarA.a(th);
                    if (!(th instanceof TimeoutCancellationException)) {
                        throw new cp0(th);
                    }
                    if (!(th instanceof CancellationException)) {
                        throw new bn0(th);
                    }
                    if (th instanceof yn0) {
                        throw th;
                    }
                    throw new gn0(th);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        interaction.saneness.attabal(w03Var, th3);
                        throw th4;
                    }
                }
            }
        }
        b41 b41Var = (b41) obj;
        interaction.saneness.attabal(w03VarA, null);
        hj1Var.h = b41Var;
        return Unit.f29295attabal;
    }
}

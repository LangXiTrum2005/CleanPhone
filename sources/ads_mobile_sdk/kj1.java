package ads_mobile_sdk;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
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
public final class kj1 extends SuspendLambda implements Function2 {
    public w03 a;
    public w03 b;
    public hj1 c;
    public int d;
    public final /* synthetic */ hj1 e;
    public final /* synthetic */ vj1 f;
    public final /* synthetic */ JsonObject g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj1(hj1 hj1Var, vj1 vj1Var, JsonObject jsonObject, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.e = hj1Var;
        this.f = vj1Var;
        this.g = jsonObject;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new kj1(this.e, this.f, this.g, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kj1) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0082 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:30:0x007b, B:32:0x0082, B:34:0x0089, B:36:0x008d, B:38:0x0091, B:41:0x0094, B:42:0x0099, B:43:0x009a, B:44:0x00a1, B:45:0x00a2, B:46:0x00a9, B:47:0x00aa), top: B:52:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0089 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:30:0x007b, B:32:0x0082, B:34:0x0089, B:36:0x008d, B:38:0x0091, B:41:0x0094, B:42:0x0099, B:43:0x009a, B:44:0x00a1, B:45:0x00a2, B:46:0x00a9, B:47:0x00aa), top: B:52:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x008d A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:30:0x007b, B:32:0x0082, B:34:0x0089, B:36:0x008d, B:38:0x0091, B:41:0x0094, B:42:0x0099, B:43:0x009a, B:44:0x00a1, B:45:0x00a2, B:46:0x00a9, B:47:0x00aa), top: B:52:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0091 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:30:0x007b, B:32:0x0082, B:34:0x0089, B:36:0x008d, B:38:0x0091, B:41:0x0094, B:42:0x0099, B:43:0x009a, B:44:0x00a1, B:45:0x00a2, B:46:0x00a9, B:47:0x00aa), top: B:52:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0094 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:30:0x007b, B:32:0x0082, B:34:0x0089, B:36:0x008d, B:38:0x0091, B:41:0x0094, B:42:0x0099, B:43:0x009a, B:44:0x00a1, B:45:0x00a2, B:46:0x00a9, B:47:0x00aa), top: B:52:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:43:0x009a A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:30:0x007b, B:32:0x0082, B:34:0x0089, B:36:0x008d, B:38:0x0091, B:41:0x0094, B:42:0x0099, B:43:0x009a, B:44:0x00a1, B:45:0x00a2, B:46:0x00a9, B:47:0x00aa), top: B:52:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a2 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:30:0x007b, B:32:0x0082, B:34:0x0089, B:36:0x008d, B:38:0x0091, B:41:0x0094, B:42:0x0099, B:43:0x009a, B:44:0x00a1, B:45:0x00a2, B:46:0x00a9, B:47:0x00aa), top: B:52:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00aa A[Catch: all -> 0x0092, TRY_LEAVE, TryCatch #0 {all -> 0x0092, blocks: (B:30:0x007b, B:32:0x0082, B:34:0x0089, B:36:0x008d, B:38:0x0091, B:41:0x0094, B:42:0x0099, B:43:0x009a, B:44:0x00a1, B:45:0x00a2, B:46:0x00a9, B:47:0x00aa), top: B:52:0x007b }] */
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
            no0 no0Var = no0.CUI_NAME_LOAD_NATIVE_IMAGE;
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
                hn1Var.getClass();
                JsonArray jsonArrayD = cb1.d(jsonObject, "images");
                Object objA = (jsonArrayD == null || jsonArrayD.isEmpty()) ? null : hn1Var.a(cb1.a(jsonArrayD.get(0)), hn1Var.a.getIsImageLoadingDisabled(), this);
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
        g61 g61Var = (g61) obj;
        interaction.saneness.attabal(w03VarA, null);
        hj1Var.f = g61Var;
        return Unit.f29295attabal;
    }
}

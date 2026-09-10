package ads_mobile_sdk;

import com.google.gson.JsonObject;
import com.ironsource.X3;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.evenfall;

/* JADX INFO: loaded from: classes.dex */
public final class lj1 extends SuspendLambda implements Function2 {
    public w03 a;
    public w03 b;
    public hj1 c;
    public int d;
    public final /* synthetic */ hj1 e;
    public final /* synthetic */ vj1 f;
    public final /* synthetic */ JsonObject g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj1(hj1 hj1Var, vj1 vj1Var, JsonObject jsonObject, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.e = hj1Var;
        this.f = vj1Var;
        this.g = jsonObject;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new lj1(this.e, this.f, this.g, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((lj1) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0078 A[Catch: all -> 0x0088, TryCatch #2 {all -> 0x0088, blocks: (B:29:0x0071, B:31:0x0078, B:33:0x007f, B:35:0x0083, B:37:0x0087, B:40:0x008a, B:41:0x008f, B:42:0x0090, B:43:0x0097, B:44:0x0098, B:45:0x009f, B:46:0x00a0), top: B:56:0x0071 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x007f A[Catch: all -> 0x0088, TryCatch #2 {all -> 0x0088, blocks: (B:29:0x0071, B:31:0x0078, B:33:0x007f, B:35:0x0083, B:37:0x0087, B:40:0x008a, B:41:0x008f, B:42:0x0090, B:43:0x0097, B:44:0x0098, B:45:0x009f, B:46:0x00a0), top: B:56:0x0071 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0083 A[Catch: all -> 0x0088, TryCatch #2 {all -> 0x0088, blocks: (B:29:0x0071, B:31:0x0078, B:33:0x007f, B:35:0x0083, B:37:0x0087, B:40:0x008a, B:41:0x008f, B:42:0x0090, B:43:0x0097, B:44:0x0098, B:45:0x009f, B:46:0x00a0), top: B:56:0x0071 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0087 A[Catch: all -> 0x0088, TryCatch #2 {all -> 0x0088, blocks: (B:29:0x0071, B:31:0x0078, B:33:0x007f, B:35:0x0083, B:37:0x0087, B:40:0x008a, B:41:0x008f, B:42:0x0090, B:43:0x0097, B:44:0x0098, B:45:0x009f, B:46:0x00a0), top: B:56:0x0071 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x008a A[Catch: all -> 0x0088, TryCatch #2 {all -> 0x0088, blocks: (B:29:0x0071, B:31:0x0078, B:33:0x007f, B:35:0x0083, B:37:0x0087, B:40:0x008a, B:41:0x008f, B:42:0x0090, B:43:0x0097, B:44:0x0098, B:45:0x009f, B:46:0x00a0), top: B:56:0x0071 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0090 A[Catch: all -> 0x0088, TryCatch #2 {all -> 0x0088, blocks: (B:29:0x0071, B:31:0x0078, B:33:0x007f, B:35:0x0083, B:37:0x0087, B:40:0x008a, B:41:0x008f, B:42:0x0090, B:43:0x0097, B:44:0x0098, B:45:0x009f, B:46:0x00a0), top: B:56:0x0071 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0098 A[Catch: all -> 0x0088, TryCatch #2 {all -> 0x0088, blocks: (B:29:0x0071, B:31:0x0078, B:33:0x007f, B:35:0x0083, B:37:0x0087, B:40:0x008a, B:41:0x008f, B:42:0x0090, B:43:0x0097, B:44:0x0098, B:45:0x009f, B:46:0x00a0), top: B:56:0x0071 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a0 A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #2 {all -> 0x0088, blocks: (B:29:0x0071, B:31:0x0078, B:33:0x007f, B:35:0x0083, B:37:0x0087, B:40:0x008a, B:41:0x008f, B:42:0x0090, B:43:0x0097, B:44:0x0098, B:45:0x009f, B:46:0x00a0), top: B:56:0x0071 }] */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        w03 w03VarA;
        w03 w03Var;
        JsonObject asJsonObject;
        hj1 hj1Var;
        w03 w03Var2;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.d;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            hj1 hj1Var2 = this.e;
            no0 no0Var = no0.CUI_NAME_LOAD_NATIVE_ICON;
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
                Intrinsics.checkNotNullParameter("app_icon", X3.i.W);
                if (jsonObject == null) {
                    asJsonObject = null;
                } else {
                    try {
                        asJsonObject = jsonObject.getAsJsonObject("app_icon");
                    } catch (Exception unused) {
                        asJsonObject = null;
                    }
                }
                Object objA = hn1Var.a(asJsonObject, hn1Var.a.getIsImageLoadingDisabled(), this);
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
        hj1Var.g = g61Var;
        return Unit.f29295attabal;
    }
}

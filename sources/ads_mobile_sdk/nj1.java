package ads_mobile_sdk;

import com.google.gson.JsonObject;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.evenfall;
import saneness.immediately;

/* JADX INFO: loaded from: classes.dex */
public final class nj1 extends SuspendLambda implements Function2 {
    public hj1 a;
    public w03 b;
    public w03 c;
    public int d;
    public final /* synthetic */ vj1 e;
    public final /* synthetic */ JsonObject f;
    public final /* synthetic */ hj1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj1(hj1 hj1Var, vj1 vj1Var, JsonObject jsonObject, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.e = vj1Var;
        this.f = jsonObject;
        this.g = hj1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new nj1(this.g, this.e, this.f, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nj1) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0096 A[Catch: all -> 0x00a6, TryCatch #2 {all -> 0x00a6, blocks: (B:31:0x008f, B:33:0x0096, B:35:0x009d, B:37:0x00a1, B:39:0x00a5, B:42:0x00a8, B:43:0x00ad, B:44:0x00ae, B:45:0x00b5, B:46:0x00b6, B:47:0x00bd, B:48:0x00be), top: B:57:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:35:0x009d A[Catch: all -> 0x00a6, TryCatch #2 {all -> 0x00a6, blocks: (B:31:0x008f, B:33:0x0096, B:35:0x009d, B:37:0x00a1, B:39:0x00a5, B:42:0x00a8, B:43:0x00ad, B:44:0x00ae, B:45:0x00b5, B:46:0x00b6, B:47:0x00bd, B:48:0x00be), top: B:57:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1 A[Catch: all -> 0x00a6, TryCatch #2 {all -> 0x00a6, blocks: (B:31:0x008f, B:33:0x0096, B:35:0x009d, B:37:0x00a1, B:39:0x00a5, B:42:0x00a8, B:43:0x00ad, B:44:0x00ae, B:45:0x00b5, B:46:0x00b6, B:47:0x00bd, B:48:0x00be), top: B:57:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5 A[Catch: all -> 0x00a6, TryCatch #2 {all -> 0x00a6, blocks: (B:31:0x008f, B:33:0x0096, B:35:0x009d, B:37:0x00a1, B:39:0x00a5, B:42:0x00a8, B:43:0x00ad, B:44:0x00ae, B:45:0x00b5, B:46:0x00b6, B:47:0x00bd, B:48:0x00be), top: B:57:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8 A[Catch: all -> 0x00a6, TryCatch #2 {all -> 0x00a6, blocks: (B:31:0x008f, B:33:0x0096, B:35:0x009d, B:37:0x00a1, B:39:0x00a5, B:42:0x00a8, B:43:0x00ad, B:44:0x00ae, B:45:0x00b5, B:46:0x00b6, B:47:0x00bd, B:48:0x00be), top: B:57:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ae A[Catch: all -> 0x00a6, TryCatch #2 {all -> 0x00a6, blocks: (B:31:0x008f, B:33:0x0096, B:35:0x009d, B:37:0x00a1, B:39:0x00a5, B:42:0x00a8, B:43:0x00ad, B:44:0x00ae, B:45:0x00b5, B:46:0x00b6, B:47:0x00bd, B:48:0x00be), top: B:57:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b6 A[Catch: all -> 0x00a6, TryCatch #2 {all -> 0x00a6, blocks: (B:31:0x008f, B:33:0x0096, B:35:0x009d, B:37:0x00a1, B:39:0x00a5, B:42:0x00a8, B:43:0x00ad, B:44:0x00ae, B:45:0x00b5, B:46:0x00b6, B:47:0x00bd, B:48:0x00be), top: B:57:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00be A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #2 {all -> 0x00a6, blocks: (B:31:0x008f, B:33:0x0096, B:35:0x009d, B:37:0x00a1, B:39:0x00a5, B:42:0x00a8, B:43:0x00ad, B:44:0x00ae, B:45:0x00b5, B:46:0x00b6, B:47:0x00bd, B:48:0x00be), top: B:57:0x008f }] */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        w03 w03Var;
        TimeoutCancellationException th;
        w03 w03Var2;
        hj1 hj1Var;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.d;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            no0 no0Var = no0.CUI_NAME_LOAD_NATIVE_CUSTOM_ASSETS;
            vj1 vj1Var = this.e;
            JsonObject jsonObject = this.f;
            hj1 hj1Var2 = this.g;
            WeakHashMap weakHashMap = j13.a;
            w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
            try {
                sn1 sn1Var = vj1Var.d;
                this.a = hj1Var2;
                this.b = w03VarA;
                this.c = w03VarA;
                this.d = 1;
                Object objA = sn1Var.a(jsonObject, "custom_assets", this);
                if (objA == objBeachfront) {
                    return objBeachfront;
                }
                w03Var2 = w03VarA;
                hj1Var = hj1Var2;
                obj = objA;
                w03Var = w03Var2;
            } catch (Throwable th2) {
                w03Var = w03VarA;
                th = th2;
                w03Var2 = w03Var;
                w03Var.b(th);
                if (!(th instanceof evenfall)) {
                    throw th;
                }
                w03Var.a(th);
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
            w03Var2 = this.c;
            w03Var = this.b;
            hj1Var = this.a;
            try {
                p002kotlin.dern.saneness(obj);
            } catch (Throwable th3) {
                th = th3;
                try {
                    w03Var.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    w03Var.a(th);
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
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        interaction.saneness.attabal(w03Var2, th4);
                        throw th5;
                    }
                }
            }
        }
        for (immediately immediatelyVar : (List) obj) {
            if (immediatelyVar instanceof b30) {
                hj1Var.d.put(((b30) immediatelyVar).a, ((b30) immediatelyVar).b);
            } else if (immediatelyVar instanceof a30) {
                hj1Var.i.put(((a30) immediatelyVar).a, ((a30) immediatelyVar).b);
            }
        }
        Unit unit = Unit.f29295attabal;
        interaction.saneness.attabal(w03Var2, null);
        return unit;
    }
}

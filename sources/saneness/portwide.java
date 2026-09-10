package saneness;

import ads_mobile_sdk.bn0;
import ads_mobile_sdk.cp0;
import ads_mobile_sdk.gn0;
import ads_mobile_sdk.gr2;
import ads_mobile_sdk.j13;
import ads_mobile_sdk.mo0;
import ads_mobile_sdk.nn0;
import ads_mobile_sdk.no0;
import ads_mobile_sdk.to0;
import ads_mobile_sdk.w03;
import ads_mobile_sdk.wq2;
import ads_mobile_sdk.y13;
import ads_mobile_sdk.yn0;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes.dex */
public interface portwide {
    /* JADX WARN: Code duplicated, block: B:32:0x0087 A[Catch: all -> 0x0097, TryCatch #1 {all -> 0x0097, blocks: (B:30:0x0080, B:32:0x0087, B:34:0x008e, B:36:0x0092, B:38:0x0096, B:41:0x0099, B:42:0x009e, B:43:0x009f, B:44:0x00a6, B:45:0x00a7, B:46:0x00ae, B:47:0x00af), top: B:54:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008e A[Catch: all -> 0x0097, TryCatch #1 {all -> 0x0097, blocks: (B:30:0x0080, B:32:0x0087, B:34:0x008e, B:36:0x0092, B:38:0x0096, B:41:0x0099, B:42:0x009e, B:43:0x009f, B:44:0x00a6, B:45:0x00a7, B:46:0x00ae, B:47:0x00af), top: B:54:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0092 A[Catch: all -> 0x0097, TryCatch #1 {all -> 0x0097, blocks: (B:30:0x0080, B:32:0x0087, B:34:0x008e, B:36:0x0092, B:38:0x0096, B:41:0x0099, B:42:0x009e, B:43:0x009f, B:44:0x00a6, B:45:0x00a7, B:46:0x00ae, B:47:0x00af), top: B:54:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0096 A[Catch: all -> 0x0097, TryCatch #1 {all -> 0x0097, blocks: (B:30:0x0080, B:32:0x0087, B:34:0x008e, B:36:0x0092, B:38:0x0096, B:41:0x0099, B:42:0x009e, B:43:0x009f, B:44:0x00a6, B:45:0x00a7, B:46:0x00ae, B:47:0x00af), top: B:54:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0099 A[Catch: all -> 0x0097, TryCatch #1 {all -> 0x0097, blocks: (B:30:0x0080, B:32:0x0087, B:34:0x008e, B:36:0x0092, B:38:0x0096, B:41:0x0099, B:42:0x009e, B:43:0x009f, B:44:0x00a6, B:45:0x00a7, B:46:0x00ae, B:47:0x00af), top: B:54:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x009f A[Catch: all -> 0x0097, TryCatch #1 {all -> 0x0097, blocks: (B:30:0x0080, B:32:0x0087, B:34:0x008e, B:36:0x0092, B:38:0x0096, B:41:0x0099, B:42:0x009e, B:43:0x009f, B:44:0x00a6, B:45:0x00a7, B:46:0x00ae, B:47:0x00af), top: B:54:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a7 A[Catch: all -> 0x0097, TryCatch #1 {all -> 0x0097, blocks: (B:30:0x0080, B:32:0x0087, B:34:0x008e, B:36:0x0092, B:38:0x0096, B:41:0x0099, B:42:0x009e, B:43:0x009f, B:44:0x00a6, B:45:0x00a7, B:46:0x00ae, B:47:0x00af), top: B:54:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00af A[Catch: all -> 0x0097, TRY_LEAVE, TryCatch #1 {all -> 0x0097, blocks: (B:30:0x0080, B:32:0x0087, B:34:0x008e, B:36:0x0092, B:38:0x0096, B:41:0x0099, B:42:0x009e, B:43:0x009f, B:44:0x00a6, B:45:0x00a7, B:46:0x00ae, B:47:0x00af), top: B:54:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ Object attabal(portwide portwideVar, wretchedly.dern dernVar) {
        gr2 gr2Var;
        w03 w03Var;
        TimeoutCancellationException th;
        w03 w03Var2;
        if (dernVar instanceof gr2) {
            gr2Var = (gr2) dernVar;
            int i = gr2Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                gr2Var.e = i - Integer.MIN_VALUE;
            } else {
                gr2Var = new gr2(portwideVar, dernVar);
            }
        } else {
            gr2Var = new gr2(portwideVar, dernVar);
        }
        Object obj = gr2Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = gr2Var.e;
        mo0 mo0Var = null;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            no0 no0Var = no0.CUI_NAME_SIGNAL;
            WeakHashMap weakHashMap = j13.a;
            w03 w03VarA = j13.a(no0Var, p002kotlin.collections.adultoid.formularize(), true);
            try {
                j13.a().e().t = new wq2(portwideVar.a(), mo0Var, 6);
                gr2Var.a = w03VarA;
                gr2Var.b = w03VarA;
                gr2Var.e = 1;
                Object objC = portwideVar.c(gr2Var);
                if (objC == objBeachfront) {
                    return objBeachfront;
                }
                w03Var = w03VarA;
                obj = objC;
                w03Var2 = w03Var;
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
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w03Var2 = gr2Var.b;
            w03Var = gr2Var.a;
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
        spartacist spartacistVar = (spartacist) obj;
        if (spartacistVar instanceof nn0) {
            y13.a((nn0) spartacistVar, false);
        }
        interaction.saneness.attabal(w03Var2, null);
        return spartacistVar;
    }

    to0 a();

    default Object a(wretchedly.dern dernVar) {
        return attabal(this, dernVar);
    }

    Object c(wretchedly.dern dernVar);
}

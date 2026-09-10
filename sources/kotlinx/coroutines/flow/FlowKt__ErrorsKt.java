package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3414a2;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.monroe;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: Errors.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001aS\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012.\u0010\b\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002¢\u0006\u0004\b\t\u0010\n\u001a0\u0010\f\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0014\u001a\u00020\u0010*\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/dern;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/wireman;", "", "Lwretchedly/dern;", "", "", "action", "attabal", "(Lkotlinx/coroutines/flow/dern;Ltetrahedral/triweekly;)Lkotlinx/coroutines/flow/dern;", "collector", "saneness", "(Lkotlinx/coroutines/flow/dern;Lkotlinx/coroutines/flow/wireman;Lwretchedly/dern;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "dern", "(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)Z", C3414a2.d, "wireman", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__ErrorsKt {
    public static final <T> dern<T> attabal(dern<? extends T> dernVar, tetrahedral.triweekly<? super wireman<? super T>, ? super Throwable, ? super wretchedly.dern<? super Unit>, ? extends Object> triweeklyVar) {
        return new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(dernVar, triweeklyVar);
    }

    public static final boolean dern(Throwable th, CoroutineContext coroutineContext) {
        monroe monroeVar = (monroe) coroutineContext.get(monroe.INSTANCE);
        if (monroeVar == null || !monroeVar.isCancelled()) {
            return false;
        }
        return wireman(th, monroeVar.rotuma());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object saneness(dern<? extends T> dernVar, wireman<? super T> wiremanVar, wretchedly.dern<? super Throwable> dernVar2) throws Throwable {
        FlowKt__ErrorsKt$catchImpl$1 flowKt__ErrorsKt$catchImpl$1;
        Ref$ObjectRef ref$ObjectRef;
        if (dernVar2 instanceof FlowKt__ErrorsKt$catchImpl$1) {
            flowKt__ErrorsKt$catchImpl$1 = (FlowKt__ErrorsKt$catchImpl$1) dernVar2;
            int i = flowKt__ErrorsKt$catchImpl$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ErrorsKt$catchImpl$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(dernVar2);
            }
        } else {
            flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(dernVar2);
        }
        Object obj = flowKt__ErrorsKt$catchImpl$1.result;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = flowKt__ErrorsKt$catchImpl$1.label;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            try {
                wireman<? super Object> flowKt__ErrorsKt$catchImpl$2 = new FlowKt__ErrorsKt$catchImpl$2<>(wiremanVar, ref$ObjectRef2);
                flowKt__ErrorsKt$catchImpl$1.L$0 = ref$ObjectRef2;
                flowKt__ErrorsKt$catchImpl$1.label = 1;
                if (dernVar.collect(flowKt__ErrorsKt$catchImpl$2, flowKt__ErrorsKt$catchImpl$1) == objBeachfront) {
                    return objBeachfront;
                }
                return null;
            } catch (Throwable th) {
                th = th;
                ref$ObjectRef = ref$ObjectRef2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef = (Ref$ObjectRef) flowKt__ErrorsKt$catchImpl$1.L$0;
            try {
                p002kotlin.dern.saneness(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        Throwable th3 = (Throwable) ref$ObjectRef.element;
        if (wireman(th, th3) || dern(th, flowKt__ErrorsKt$catchImpl$1.getContext())) {
            throw th;
        }
        if (th3 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            patroclinal.marial.attabal(th3, th);
            throw th3;
        }
        patroclinal.marial.attabal(th, th3);
        throw th;
    }

    public static final boolean wireman(Throwable th, Throwable th2) {
        return th2 != null && Intrinsics.wireman(th2, th);
    }
}

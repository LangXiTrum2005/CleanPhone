package kotlinx.coroutines.flow.internal;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p002kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.rotuma;
import pigboat.restrictive;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001aZ\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00028\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000bH\u0080@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/wireman;", "Lkotlin/coroutines/CoroutineContext;", "emitContext", "wireman", "(Lkotlinx/coroutines/flow/wireman;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/wireman;", "V", "newContext", "value", "", "countOrElement", "Lkotlin/Function2;", "Lwretchedly/dern;", "block", "saneness", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lwretchedly/dern;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class wireman {
    public static /* synthetic */ Object dern(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, wretchedly.dern dernVar, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = restrictive.competently(coroutineContext);
        }
        return saneness(coroutineContext, obj, obj2, function2, dernVar);
    }

    public static final <T, V> Object saneness(CoroutineContext coroutineContext, V v, Object obj, Function2<? super V, ? super wretchedly.dern<? super T>, ? extends Object> function2, wretchedly.dern<? super T> dernVar) {
        Object objTaiyuan = restrictive.taiyuan(coroutineContext, obj);
        try {
            polloi polloiVar = new polloi(dernVar, coroutineContext);
            Object objWireman = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.wireman(function2, v, polloiVar) : ((Function2) rotuma.beachfront(function2, 2)).invoke(v, polloiVar);
            restrictive.beachfront(coroutineContext, objTaiyuan);
            if (objWireman == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                igo.beachfront.dern(dernVar);
            }
            return objWireman;
        } catch (Throwable th) {
            restrictive.beachfront(coroutineContext, objTaiyuan);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlinx.coroutines.flow.wireman<T> wireman(kotlinx.coroutines.flow.wireman<? super T> wiremanVar, CoroutineContext coroutineContext) {
        return ((wiremanVar instanceof monoploid) || (wiremanVar instanceof formularize)) ? wiremanVar : new UndispatchedContextCollector(wiremanVar, coroutineContext);
    }
}

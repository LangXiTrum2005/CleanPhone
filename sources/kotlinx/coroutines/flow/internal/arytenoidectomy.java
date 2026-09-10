package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.monroe;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import pigboat.rotuma;

/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\b\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0080\u0010¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", "Lkotlin/coroutines/CoroutineContext;", "currentContext", "", "saneness", "(Lkotlinx/coroutines/flow/internal/SafeCollector;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlinx/coroutines/monroe;", "collectJob", "wireman", "(Lkotlinx/coroutines/monroe;Lkotlinx/coroutines/monroe;)Lkotlinx/coroutines/monroe;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class arytenoidectomy {
    public static final int dern(SafeCollector safeCollector, int i, CoroutineContext.Element element) {
        CoroutineContext.saneness<?> key = element.getKey();
        CoroutineContext.Element element2 = safeCollector.collectContext.get(key);
        if (key != monroe.INSTANCE) {
            if (element != element2) {
                return Integer.MIN_VALUE;
            }
            return i + 1;
        }
        monroe monroeVar = (monroe) element2;
        Intrinsics.competently(element, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        monroe monroeVarWireman = wireman((monroe) element, monroeVar);
        if (monroeVarWireman == monroeVar) {
            return monroeVar == null ? i : i + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + monroeVarWireman + ", expected child of " + monroeVar + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    public static final void saneness(final SafeCollector<?> safeCollector, CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.fold(0, new Function2() { // from class: kotlinx.coroutines.flow.internal.kowloon
            @Override // p002kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(arytenoidectomy.dern(safeCollector, ((Integer) obj).intValue(), (CoroutineContext.Element) obj2));
            }
        })).intValue() == safeCollector.collectContextSize) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector.collectContext + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final monroe wireman(monroe monroeVar, monroe monroeVar2) {
        while (monroeVar != null) {
            if (monroeVar == monroeVar2 || !(monroeVar instanceof rotuma)) {
                return monroeVar;
            }
            monroeVar = ((rotuma) monroeVar).itchy();
        }
        return null;
    }
}

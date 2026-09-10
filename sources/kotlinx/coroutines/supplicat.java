package kotlinx.coroutines;

import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013*\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001a\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013*\u00020\u0016H\u0080\u0010¢\u0006\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u0019*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/saran;", "Lkotlin/coroutines/CoroutineContext;", "context", "apical", "(Lkotlinx/coroutines/saran;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "addedContext", "cutely", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "", "impromptu", "(Lkotlin/coroutines/CoroutineContext;)Z", "originalContext", "appendContext", "isNewCoroutine", "wireman", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Z)Lkotlin/coroutines/CoroutineContext;", "Lwretchedly/dern;", "", "oldValue", "Lkotlinx/coroutines/osteal;", "impassible", "(Lwretchedly/dern;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Lkotlinx/coroutines/osteal;", "Ligo/dern;", "formularize", "(Ligo/dern;)Lkotlinx/coroutines/osteal;", "", "competently", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "coroutineName", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class supplicat {
    public static final CoroutineContext apical(saran saranVar, CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextWireman = wireman(saranVar.getCoroutineContext(), coroutineContext, true);
        return (coroutineContextWireman == premeiotic.attabal() || coroutineContextWireman.get(p002kotlin.coroutines.dern.INSTANCE) != null) ? coroutineContextWireman : coroutineContextWireman.plus(premeiotic.attabal());
    }

    public static final CoroutineContext beachfront(CoroutineContext coroutineContext, CoroutineContext.Element element) {
        return element instanceof oilcan ? coroutineContext.plus(((oilcan) element).copyForChild()) : coroutineContext.plus(element);
    }

    public static final String competently(CoroutineContext coroutineContext) {
        return null;
    }

    public static final CoroutineContext cutely(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        return !impromptu(coroutineContext2) ? coroutineContext.plus(coroutineContext2) : wireman(coroutineContext, coroutineContext2, false);
    }

    public static final osteal<?> formularize(igo.dern dernVar) {
        while (!(dernVar instanceof clubfoot) && (dernVar = dernVar.getCallerFrame()) != null) {
            if (dernVar instanceof osteal) {
                return (osteal) dernVar;
            }
        }
        return null;
    }

    public static final osteal<?> impassible(wretchedly.dern<?> dernVar, CoroutineContext coroutineContext, Object obj) {
        if (!(dernVar instanceof igo.dern) || coroutineContext.get(licking.f32351kowloon) == null) {
            return null;
        }
        osteal<?> ostealVarFormularize = formularize((igo.dern) dernVar);
        if (ostealVarFormularize != null) {
            ostealVarFormularize.licking(coroutineContext, obj);
        }
        return ostealVarFormularize;
    }

    public static final boolean impromptu(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(Boolean.FALSE, new Function2() { // from class: kotlinx.coroutines.yemenite
            @Override // p002kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(supplicat.taiyuan(((Boolean) obj).booleanValue(), (CoroutineContext.Element) obj2));
            }
        })).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, kotlin.coroutines.CoroutineContext] */
    public static final CoroutineContext marial(Ref$ObjectRef ref$ObjectRef, boolean z, CoroutineContext coroutineContext, CoroutineContext.Element element) {
        if (!(element instanceof oilcan)) {
            return coroutineContext.plus(element);
        }
        CoroutineContext.Element element2 = ((CoroutineContext) ref$ObjectRef.element).get(element.getKey());
        if (element2 == null) {
            return coroutineContext.plus(z ? ((oilcan) element).copyForChild() : (oilcan) element);
        }
        ref$ObjectRef.element = ((CoroutineContext) ref$ObjectRef.element).minusKey(element.getKey());
        return coroutineContext.plus(((oilcan) element).mergeForChild(element2));
    }

    public static final boolean taiyuan(boolean z, CoroutineContext.Element element) {
        return z || (element instanceof oilcan);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final CoroutineContext wireman(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z) {
        boolean zImpromptu = impromptu(coroutineContext);
        boolean zImpromptu2 = impromptu(coroutineContext2);
        if (!zImpromptu && !zImpromptu2) {
            return coroutineContext.plus(coroutineContext2);
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, new Function2() { // from class: kotlinx.coroutines.sealless
            @Override // p002kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return supplicat.marial(ref$ObjectRef, z, (CoroutineContext) obj, (CoroutineContext.Element) obj2);
            }
        });
        if (zImpromptu2) {
            ref$ObjectRef.element = ((CoroutineContext) ref$ObjectRef.element).fold(emptyCoroutineContext, new Function2() { // from class: kotlinx.coroutines.kattegat
                @Override // p002kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return supplicat.beachfront((CoroutineContext) obj, (CoroutineContext.Element) obj2);
                }
            });
        }
        return coroutineContext3.plus((CoroutineContext) ref$ObjectRef.element);
    }
}

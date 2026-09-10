package pigboat;

import kotlinx.coroutines.immediately;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"*\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"2\u0010\u0017\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00150\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013\"&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013¨\u0006\u001b"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "competently", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "countOrElement", "taiyuan", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Ljava/lang/Object;", "oldState", "", "beachfront", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Lpigboat/stratoscope;", "attabal", "Lpigboat/stratoscope;", "NO_THREAD_ELEMENTS", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "saneness", "Lkotlin/jvm/functions/Function2;", "countAll", "Lkotlinx/coroutines/immediately;", "dern", "findOne", "Lpigboat/grimness;", "wireman", "updateState", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class restrictive {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final stratoscope f35371attabal = new stratoscope("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Function2<Object, CoroutineContext.Element, Object> f35373saneness = new Function2() { // from class: pigboat.sealless
        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return restrictive.wireman(obj, (CoroutineContext.Element) obj2);
        }
    };

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Function2<immediately<?>, CoroutineContext.Element, immediately<?>> f35372dern = new Function2() { // from class: pigboat.kattegat
        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return restrictive.marial((immediately) obj, (CoroutineContext.Element) obj2);
        }
    };

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Function2<grimness, CoroutineContext.Element, grimness> f35374wireman = new Function2() { // from class: pigboat.supplicat
        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return restrictive.impromptu((grimness) obj, (CoroutineContext.Element) obj2);
        }
    };

    public static final void beachfront(CoroutineContext coroutineContext, Object obj) {
        if (obj == f35371attabal) {
            return;
        }
        if (obj instanceof grimness) {
            ((grimness) obj).saneness(coroutineContext);
            return;
        }
        Object objFold = coroutineContext.fold(null, f35372dern);
        Intrinsics.competently(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((immediately) objFold).restoreThreadContext(coroutineContext, obj);
    }

    public static final Object competently(CoroutineContext coroutineContext) {
        Object objFold = coroutineContext.fold(0, f35373saneness);
        Intrinsics.beachfront(objFold);
        return objFold;
    }

    public static final grimness impromptu(grimness grimnessVar, CoroutineContext.Element element) {
        if (element instanceof immediately) {
            immediately<?> immediatelyVar = (immediately) element;
            grimnessVar.attabal(immediatelyVar, immediatelyVar.updateThreadContext(grimnessVar.context));
        }
        return grimnessVar;
    }

    public static final immediately<?> marial(immediately<?> immediatelyVar, CoroutineContext.Element element) {
        if (immediatelyVar != null) {
            return immediatelyVar;
        }
        if (element instanceof immediately) {
            return (immediately) element;
        }
        return null;
    }

    public static final Object taiyuan(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = competently(coroutineContext);
        }
        if (obj == 0) {
            return f35371attabal;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new grimness(coroutineContext, ((Number) obj).intValue()), f35374wireman);
        }
        Intrinsics.competently(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((immediately) obj).updateThreadContext(coroutineContext);
    }

    public static final Object wireman(Object obj, CoroutineContext.Element element) {
        if (!(element instanceof immediately)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? element : Integer.valueOf(iIntValue + 1);
    }
}

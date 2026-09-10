package pigboat;

import com.ironsource.A5;
import kotlinx.coroutines.immediately;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R$\u0010\u0014\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lpigboat/grimness;", "", "Lkotlin/coroutines/CoroutineContext;", "context", "", A5.q, "<init>", "(Lkotlin/coroutines/CoroutineContext;I)V", "Lkotlinx/coroutines/immediately;", "element", "value", "", "attabal", "(Lkotlinx/coroutines/immediately;Ljava/lang/Object;)V", "saneness", "(Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/coroutines/CoroutineContext;", "", "[Ljava/lang/Object;", "values", "elements", "[Lkotlinx/coroutines/immediately;", "dern", "I", "i", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class grimness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final CoroutineContext context;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public int i;
    private final immediately<Object>[] elements;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Object[] values;

    public grimness(CoroutineContext coroutineContext, int i) {
        this.context = coroutineContext;
        this.values = new Object[i];
        this.elements = new immediately[i];
    }

    public final void attabal(immediately<?> element, Object value) {
        Object[] objArr = this.values;
        int i = this.i;
        objArr[i] = value;
        immediately<Object>[] immediatelyVarArr = this.elements;
        this.i = i + 1;
        Intrinsics.competently(element, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        immediatelyVarArr[i] = element;
    }

    public final void saneness(CoroutineContext context) {
        int length = this.elements.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            immediately<Object> immediatelyVar = this.elements[length];
            Intrinsics.beachfront(immediatelyVar);
            immediatelyVar.restoreThreadContext(context, this.values[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}

package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ThreadContextElement;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ThreadContextKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Symbol f45048a = new Symbol("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f45049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f45050c;
    public static final b d;

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.internal.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlinx.coroutines.internal.b] */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlinx.coroutines.internal.b] */
    static {
        final int i2 = 1;
        f45049b = new Function2() { // from class: kotlinx.coroutines.internal.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ThreadState threadState = (ThreadState) obj;
                        CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                        if (element instanceof ThreadContextElement) {
                            ThreadContextElement threadContextElement = (ThreadContextElement) element;
                            Object objT = threadContextElement.T(threadState.f45054a);
                            int i3 = threadState.d;
                            threadState.f45055b[i3] = objT;
                            threadState.d = i3 + 1;
                            threadState.f45056c[i3] = threadContextElement;
                        }
                        return threadState;
                    case 1:
                        CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                        if (!(element2 instanceof ThreadContextElement)) {
                            return obj;
                        }
                        Integer num = obj instanceof Integer ? (Integer) obj : null;
                        int iIntValue = num != null ? num.intValue() : 1;
                        return iIntValue == 0 ? element2 : Integer.valueOf(iIntValue + 1);
                    default:
                        ThreadContextElement threadContextElement2 = (ThreadContextElement) obj;
                        CoroutineContext.Element element3 = (CoroutineContext.Element) obj2;
                        if (threadContextElement2 != null) {
                            return threadContextElement2;
                        }
                        if (element3 instanceof ThreadContextElement) {
                            return (ThreadContextElement) element3;
                        }
                        return null;
                }
            }
        };
        final int i3 = 2;
        f45050c = new Function2() { // from class: kotlinx.coroutines.internal.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                switch (i3) {
                    case 0:
                        ThreadState threadState = (ThreadState) obj;
                        CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                        if (element instanceof ThreadContextElement) {
                            ThreadContextElement threadContextElement = (ThreadContextElement) element;
                            Object objT = threadContextElement.T(threadState.f45054a);
                            int i4 = threadState.d;
                            threadState.f45055b[i4] = objT;
                            threadState.d = i4 + 1;
                            threadState.f45056c[i4] = threadContextElement;
                        }
                        return threadState;
                    case 1:
                        CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                        if (!(element2 instanceof ThreadContextElement)) {
                            return obj;
                        }
                        Integer num = obj instanceof Integer ? (Integer) obj : null;
                        int iIntValue = num != null ? num.intValue() : 1;
                        return iIntValue == 0 ? element2 : Integer.valueOf(iIntValue + 1);
                    default:
                        ThreadContextElement threadContextElement2 = (ThreadContextElement) obj;
                        CoroutineContext.Element element3 = (CoroutineContext.Element) obj2;
                        if (threadContextElement2 != null) {
                            return threadContextElement2;
                        }
                        if (element3 instanceof ThreadContextElement) {
                            return (ThreadContextElement) element3;
                        }
                        return null;
                }
            }
        };
        final int i4 = 0;
        d = new Function2() { // from class: kotlinx.coroutines.internal.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                switch (i4) {
                    case 0:
                        ThreadState threadState = (ThreadState) obj;
                        CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                        if (element instanceof ThreadContextElement) {
                            ThreadContextElement threadContextElement = (ThreadContextElement) element;
                            Object objT = threadContextElement.T(threadState.f45054a);
                            int i5 = threadState.d;
                            threadState.f45055b[i5] = objT;
                            threadState.d = i5 + 1;
                            threadState.f45056c[i5] = threadContextElement;
                        }
                        return threadState;
                    case 1:
                        CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                        if (!(element2 instanceof ThreadContextElement)) {
                            return obj;
                        }
                        Integer num = obj instanceof Integer ? (Integer) obj : null;
                        int iIntValue = num != null ? num.intValue() : 1;
                        return iIntValue == 0 ? element2 : Integer.valueOf(iIntValue + 1);
                    default:
                        ThreadContextElement threadContextElement2 = (ThreadContextElement) obj;
                        CoroutineContext.Element element3 = (CoroutineContext.Element) obj2;
                        if (threadContextElement2 != null) {
                            return threadContextElement2;
                        }
                        if (element3 instanceof ThreadContextElement) {
                            return (ThreadContextElement) element3;
                        }
                        return null;
                }
            }
        };
    }

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == f45048a) {
            return;
        }
        if (!(obj instanceof ThreadState)) {
            Object objFold = coroutineContext.fold(null, f45050c);
            Intrinsics.d(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((ThreadContextElement) objFold).J(obj);
            return;
        }
        ThreadState threadState = (ThreadState) obj;
        ThreadContextElement[] threadContextElementArr = threadState.f45056c;
        int length = threadContextElementArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            ThreadContextElement threadContextElement = threadContextElementArr[length];
            Intrinsics.c(threadContextElement);
            threadContextElement.J(threadState.f45055b[length]);
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object objFold = coroutineContext.fold(0, f45049b);
        Intrinsics.c(objFold);
        return objFold;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        if (obj == 0) {
            return f45048a;
        }
        return obj instanceof Integer ? coroutineContext.fold(new ThreadState(((Number) obj).intValue(), coroutineContext), d) : ((ThreadContextElement) obj).T(coroutineContext);
    }
}

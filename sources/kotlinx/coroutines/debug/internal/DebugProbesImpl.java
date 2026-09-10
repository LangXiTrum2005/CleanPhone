package kotlinx.coroutines.debug.internal;

import _COROUTINE.CoroutineDebuggingKt;
import com.google.android.gms.ads.RequestConfiguration;
import java.text.SimpleDateFormat;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0006R\u000b\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004R\u000b\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl;", "", "Lkotlinx/atomicfu/AtomicInt;", "installations", "Lkotlinx/atomicfu/AtomicLong;", "sequenceNumber", "CoroutineOwner", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DebugProbesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DebugProbesImpl f44852a = new DebugProbesImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentWeakMap f44853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Function1 f44854c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003R\u000b\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlin/coroutines/CoroutineContext;", "context", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CoroutineOwner<T> implements Continuation<T>, CoroutineStackFrame {
        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public final CoroutineStackFrame getCallerFrame() {
            throw null;
        }

        @Override // kotlin.coroutines.Continuation
        /* JADX INFO: renamed from: getContext */
        public final CoroutineContext getF45023Y() {
            throw null;
        }

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(Object obj) {
            DebugProbesImpl.f44852a.getClass();
            DebugProbesImpl.f44853b.remove(this);
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    static {
        Object objA;
        CoroutineDebuggingKt.a(new Exception(), "_CREATION");
        new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        f44853b = new ConcurrentWeakMap(false);
        try {
            Object objNewInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new Object[0]);
            Intrinsics.d(objNewInstance, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            TypeIntrinsics.d(1, objNewInstance);
            objA = (Function1) objNewInstance;
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        if (objA instanceof Result.Failure) {
            objA = null;
        }
        f44854c = (Function1) objA;
        new ConcurrentWeakMap(true);
    }
}

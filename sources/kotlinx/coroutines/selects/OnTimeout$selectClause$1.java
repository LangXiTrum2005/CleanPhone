package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class OnTimeout$selectClause$1 extends FunctionReferenceImpl implements Function3<OnTimeout, SelectInstance<?>, Object, Unit> {
    public static final OnTimeout$selectClause$1 X = new OnTimeout$selectClause$1(3, OnTimeout.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        final OnTimeout onTimeout = (OnTimeout) obj;
        final SelectInstance selectInstance = (SelectInstance) obj2;
        long j = onTimeout.f45075a;
        Unit unit = Unit.f43263a;
        if (j <= 0) {
            selectInstance.c(unit);
            return unit;
        }
        Runnable runnable = new Runnable() { // from class: kotlinx.coroutines.selects.OnTimeout$register$$inlined$Runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                selectInstance.e(onTimeout, Unit.f43263a);
            }
        };
        Intrinsics.d(selectInstance, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        SelectImplementation selectImplementation = (SelectImplementation) selectInstance;
        CoroutineContext coroutineContext = selectImplementation.X;
        selectImplementation.Z = DelayKt.b(coroutineContext).i(j, runnable, coroutineContext);
        return unit;
    }
}

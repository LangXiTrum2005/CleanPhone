package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0006\u0018\u00010\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/collections/IndexedValue;", "Landroidx/paging/PageEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.CachedPageEventFlow$sharedForDownstream$1", f = "CachedPageEventFlow.kt", l = {62, 67}, m = "invokeSuspend")
final class CachedPageEventFlow$sharedForDownstream$1 extends SuspendLambda implements Function2<FlowCollector<? super IndexedValue<? extends PageEvent<Object>>>, Continuation<? super Unit>, Object> {
    public Iterator X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f7776Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ CachedPageEventFlow e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$sharedForDownstream$1(CachedPageEventFlow cachedPageEventFlow, Continuation continuation) {
        super(2, continuation);
        this.e0 = cachedPageEventFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CachedPageEventFlow$sharedForDownstream$1 cachedPageEventFlow$sharedForDownstream$1 = new CachedPageEventFlow$sharedForDownstream$1(this.e0, continuation);
        cachedPageEventFlow$sharedForDownstream$1.Z = obj;
        return cachedPageEventFlow$sharedForDownstream$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CachedPageEventFlow$sharedForDownstream$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.f7776Y;
        CachedPageEventFlow cachedPageEventFlow = this.e0;
        if (i2 == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.Z;
            cachedPageEventFlow.getClass();
            this.Z = flowCollector;
            this.f7776Y = 1;
            throw null;
        }
        if (i2 == 1) {
            ResultKt.b(obj);
            cachedPageEventFlow.getClass();
            throw null;
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterator it = this.X;
        FlowCollector flowCollector2 = (FlowCollector) this.Z;
        ResultKt.b(obj);
        while (it.hasNext()) {
            IndexedValue indexedValue = (IndexedValue) it.next();
            this.Z = flowCollector2;
            this.X = it;
            this.f7776Y = 2;
            if (flowCollector2.emit(indexedValue, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.f43263a;
    }
}

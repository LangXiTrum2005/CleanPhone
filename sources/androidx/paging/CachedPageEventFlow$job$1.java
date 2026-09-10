package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.CachedPageEventFlow$job$1", f = "CachedPageEventFlow.kt", l = {76}, m = "invokeSuspend")
final class CachedPageEventFlow$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Flow f7774Y;
    public final /* synthetic */ CachedPageEventFlow Z;

    /* JADX INFO: renamed from: androidx.paging.CachedPageEventFlow$job$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00060\u0005H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "it", "Lkotlin/collections/IndexedValue;", "Landroidx/paging/PageEvent;", "emit", "(Lkotlin/collections/IndexedValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    final class AnonymousClass1<T> implements FlowCollector {
        public final /* synthetic */ CachedPageEventFlow X;

        public AnonymousClass1(CachedPageEventFlow cachedPageEventFlow) {
            this.X = cachedPageEventFlow;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object emit(IndexedValue indexedValue, Continuation continuation) {
            CachedPageEventFlow$job$1$1$emit$1 cachedPageEventFlow$job$1$1$emit$1;
            if (continuation instanceof CachedPageEventFlow$job$1$1$emit$1) {
                cachedPageEventFlow$job$1$1$emit$1 = (CachedPageEventFlow$job$1$1$emit$1) continuation;
                int i2 = cachedPageEventFlow$job$1$1$emit$1.e0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cachedPageEventFlow$job$1$1$emit$1.e0 = i2 - Integer.MIN_VALUE;
                } else {
                    cachedPageEventFlow$job$1$1$emit$1 = new CachedPageEventFlow$job$1$1$emit$1(this, continuation);
                }
            } else {
                cachedPageEventFlow$job$1$1$emit$1 = new CachedPageEventFlow$job$1$1$emit$1(this, continuation);
            }
            Object obj = cachedPageEventFlow$job$1$1$emit$1.f7775Y;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i3 = cachedPageEventFlow$job$1$1$emit$1.e0;
            if (i3 == 0) {
                ResultKt.b(obj);
                this.X.getClass();
                cachedPageEventFlow$job$1$1$emit$1.X = this;
                cachedPageEventFlow$job$1$1$emit$1.e0 = 1;
                throw null;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return Unit.f43263a;
            }
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) cachedPageEventFlow$job$1$1$emit$1.X;
            ResultKt.b(obj);
            anonymousClass1.X.getClass();
            cachedPageEventFlow$job$1$1$emit$1.X = null;
            cachedPageEventFlow$job$1$1$emit$1.e0 = 2;
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$job$1(Flow flow, CachedPageEventFlow cachedPageEventFlow, Continuation continuation) {
        super(2, continuation);
        this.f7774Y = flow;
        this.Z = cachedPageEventFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CachedPageEventFlow$job$1(this.f7774Y, this.Z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CachedPageEventFlow$job$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.X;
        if (i2 == 0) {
            ResultKt.b(obj);
            final Flow flow = this.f7774Y;
            Flow<IndexedValue<Object>> flow2 = new Flow<IndexedValue<Object>>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$$inlined$unsafeFlow$1
                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = flow.collect(new FlowKt__TransformKt$withIndex$1$1(new Ref.IntRef(), flowCollector), continuation);
                    return objCollect == CoroutineSingletons.X ? objCollect : Unit.f43263a;
                }
            };
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.Z);
            this.X = 1;
            if (flow2.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f43263a;
    }
}

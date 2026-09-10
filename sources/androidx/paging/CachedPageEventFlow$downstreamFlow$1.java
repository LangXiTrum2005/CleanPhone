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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/paging/PageEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", f = "CachedPageEventFlow.kt", l = {102}, m = "invokeSuspend")
final class CachedPageEventFlow$downstreamFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super PageEvent<Object>>, Continuation<? super Unit>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f7771Y;
    public final /* synthetic */ CachedPageEventFlow Z;

    /* JADX INFO: renamed from: androidx.paging.CachedPageEventFlow$downstreamFlow$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0006\u0018\u00010\u0005H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "it", "Lkotlin/collections/IndexedValue;", "Landroidx/paging/PageEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$1", f = "CachedPageEventFlow.kt", l = {}, m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements Function2<IndexedValue<? extends PageEvent<Object>>, Continuation<? super Boolean>, Object> {
        public /* synthetic */ Object X;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation);
            anonymousClass1.X = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((IndexedValue) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            ResultKt.b(obj);
            return Boolean.valueOf(((IndexedValue) this.X) != null);
        }
    }

    /* JADX INFO: renamed from: androidx.paging.CachedPageEventFlow$downstreamFlow$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0006\u0018\u00010\u0005H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "indexedValue", "Lkotlin/collections/IndexedValue;", "Landroidx/paging/PageEvent;", "emit", "(Lkotlin/collections/IndexedValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    final class AnonymousClass2<T> implements FlowCollector {
        public final /* synthetic */ Ref.IntRef X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ FlowCollector f7772Y;

        public AnonymousClass2(Ref.IntRef intRef, FlowCollector flowCollector) {
            this.X = intRef;
            this.f7772Y = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object emit(IndexedValue indexedValue, Continuation continuation) {
            CachedPageEventFlow$downstreamFlow$1$2$emit$1 cachedPageEventFlow$downstreamFlow$1$2$emit$1;
            AnonymousClass2<T> anonymousClass2;
            if (continuation instanceof CachedPageEventFlow$downstreamFlow$1$2$emit$1) {
                cachedPageEventFlow$downstreamFlow$1$2$emit$1 = (CachedPageEventFlow$downstreamFlow$1$2$emit$1) continuation;
                int i2 = cachedPageEventFlow$downstreamFlow$1$2$emit$1.f0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cachedPageEventFlow$downstreamFlow$1$2$emit$1.f0 = i2 - Integer.MIN_VALUE;
                } else {
                    cachedPageEventFlow$downstreamFlow$1$2$emit$1 = new CachedPageEventFlow$downstreamFlow$1$2$emit$1(this, continuation);
                }
            } else {
                cachedPageEventFlow$downstreamFlow$1$2$emit$1 = new CachedPageEventFlow$downstreamFlow$1$2$emit$1(this, continuation);
            }
            Object obj = cachedPageEventFlow$downstreamFlow$1$2$emit$1.Z;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i3 = cachedPageEventFlow$downstreamFlow$1$2$emit$1.f0;
            if (i3 == 0) {
                ResultKt.b(obj);
                Intrinsics.c(indexedValue);
                if (indexedValue.f43274a > this.X.X) {
                    cachedPageEventFlow$downstreamFlow$1$2$emit$1.X = this;
                    cachedPageEventFlow$downstreamFlow$1$2$emit$1.f7773Y = indexedValue;
                    cachedPageEventFlow$downstreamFlow$1$2$emit$1.f0 = 1;
                    if (this.f7772Y.emit(indexedValue.f43275b, cachedPageEventFlow$downstreamFlow$1$2$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    anonymousClass2 = this;
                }
                return Unit.f43263a;
            }
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            indexedValue = cachedPageEventFlow$downstreamFlow$1$2$emit$1.f7773Y;
            anonymousClass2 = (AnonymousClass2) cachedPageEventFlow$downstreamFlow$1$2$emit$1.X;
            ResultKt.b(obj);
            anonymousClass2.X.X = indexedValue.f43274a;
            return Unit.f43263a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$downstreamFlow$1(CachedPageEventFlow cachedPageEventFlow, Continuation continuation) {
        super(2, continuation);
        this.Z = cachedPageEventFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CachedPageEventFlow$downstreamFlow$1 cachedPageEventFlow$downstreamFlow$1 = new CachedPageEventFlow$downstreamFlow$1(this.Z, continuation);
        cachedPageEventFlow$downstreamFlow$1.f7771Y = obj;
        return cachedPageEventFlow$downstreamFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CachedPageEventFlow$downstreamFlow$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.X;
        if (i2 == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f7771Y;
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.X = Integer.MIN_VALUE;
            this.Z.getClass();
            FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 = new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(new AnonymousClass1(2, null), null);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(intRef, flowCollector);
            this.X = 1;
            if (flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.collect(anonymousClass2, this) == coroutineSingletons) {
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

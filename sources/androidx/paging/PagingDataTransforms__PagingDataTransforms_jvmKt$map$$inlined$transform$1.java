package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "androidx/paging/PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1 implements Flow<PageEvent<Object>> {

    /* JADX INFO: renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "androidx/paging/PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public final class AnonymousClass2<T> implements FlowCollector {

        /* JADX INFO: renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2$1, reason: invalid class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2", f = "PagingDataTransforms.jvm.kt", l = {Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
        public final class AnonymousClass1 extends ContinuationImpl {
            public /* synthetic */ Object X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public int f7858Y;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.X = obj;
                this.f7858Y |= Integer.MIN_VALUE;
                AnonymousClass2.this.emit(null, this);
                return Unit.f43263a;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            if (continuation instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) continuation;
                int i2 = anonymousClass1.f7858Y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.f7858Y = i2 - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(continuation);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
            Object obj2 = anonymousClass1.X;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i3 = anonymousClass1.f7858Y;
            if (i3 == 0) {
                ResultKt.b(obj2);
                throw null;
            }
            if (i3 == 1) {
                ResultKt.b(obj2);
                anonymousClass1.f7858Y = 2;
                throw null;
            }
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj2);
            return Unit.f43263a;
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        throw null;
    }
}

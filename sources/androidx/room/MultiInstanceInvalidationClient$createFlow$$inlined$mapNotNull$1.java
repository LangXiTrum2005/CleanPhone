package androidx.room;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1 implements Flow<Set<? extends String>> {

    /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public final class AnonymousClass2<T> implements FlowCollector {
        public final /* synthetic */ FlowCollector X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ String[] f8196Y;

        /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2", f = "MultiInstanceInvalidationClient.android.kt", l = {235}, m = "emit")
        public final class AnonymousClass1 extends ContinuationImpl {
            public /* synthetic */ Object X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public int f8197Y;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.X = obj;
                this.f8197Y |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(FlowCollector flowCollector, String[] strArr) {
            this.X = flowCollector;
            this.f8196Y = strArr;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            if (continuation instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) continuation;
                int i2 = anonymousClass1.f8197Y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.f8197Y = i2 - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(continuation);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
            Object obj2 = anonymousClass1.X;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i3 = anonymousClass1.f8197Y;
            if (i3 == 0) {
                ResultKt.b(obj2);
                Set set = (Set) obj;
                SetBuilder setBuilder = new SetBuilder();
                for (String str : this.f8196Y) {
                    Iterator<T> it = set.iterator();
                    while (it.hasNext()) {
                        if (StringsKt.r(str, (String) it.next(), true)) {
                            setBuilder.add(str);
                        }
                    }
                }
                SetBuilder setBuilderA = SetsKt.a(setBuilder);
                if (setBuilderA.X.isEmpty()) {
                    setBuilderA = null;
                }
                if (setBuilderA != null) {
                    anonymousClass1.f8197Y = 1;
                    if (this.X.emit(setBuilderA, anonymousClass1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj2);
            }
            return Unit.f43263a;
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        new AnonymousClass2(flowCollector, null);
        throw null;
    }
}

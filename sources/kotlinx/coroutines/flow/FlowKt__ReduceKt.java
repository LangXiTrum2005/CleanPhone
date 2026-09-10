package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.NoSuchElementException;
import kotlinx.coroutines.achondroplasia;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: Reduce.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a \u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0003\u001aD\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001a\"\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\f\u0010\u0003¨\u0006\r"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/dern;", "wireman", "(Lkotlinx/coroutines/flow/dern;Lwretchedly/dern;)Ljava/lang/Object;", "saneness", "Lkotlin/Function2;", "Lwretchedly/dern;", "", "", "predicate", "attabal", "(Lkotlinx/coroutines/flow/dern;Lkotlin/jvm/functions/Function2;Lwretchedly/dern;)Ljava/lang/Object;", "dern", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__ReduceKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__ReduceKt$attabal", "Lkotlinx/coroutines/flow/wireman;", "value", "", "emit", "(Ljava/lang/Object;Lwretchedly/dern;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class attabal<T> implements wireman<T> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f32228kowloon;

        public attabal(Ref$ObjectRef ref$ObjectRef) {
            this.f32228kowloon = ref$ObjectRef;
        }

        @Override // kotlinx.coroutines.flow.wireman
        public Object emit(T t, wretchedly.dern<? super Unit> dernVar) {
            this.f32228kowloon.element = t;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class dern<T> implements wireman {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<Object> f32229kowloon;

        public dern(Ref$ObjectRef<Object> ref$ObjectRef) {
            this.f32229kowloon = ref$ObjectRef;
        }

        @Override // kotlinx.coroutines.flow.wireman
        public final Object emit(T t, wretchedly.dern<? super Unit> dernVar) {
            Ref$ObjectRef<Object> ref$ObjectRef = this.f32229kowloon;
            if (ref$ObjectRef.element != kotlinx.coroutines.flow.internal.impassible.f32306attabal) {
                throw new IllegalArgumentException("Flow has more than one element");
            }
            ref$ObjectRef.element = t;
            return Unit.f29295attabal;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__ReduceKt$saneness", "Lkotlinx/coroutines/flow/wireman;", "value", "", "emit", "(Ljava/lang/Object;Lwretchedly/dern;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class saneness<T> implements wireman<T> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f32232kowloon;

        public saneness(Ref$ObjectRef ref$ObjectRef) {
            this.f32232kowloon = ref$ObjectRef;
        }

        @Override // kotlinx.coroutines.flow.wireman
        public Object emit(T t, wretchedly.dern<? super Unit> dernVar) {
            this.f32232kowloon.element = t;
            throw new AbortFlowException(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object attabal(kotlinx.coroutines.flow.dern<? extends T> dernVar, Function2<? super T, ? super wretchedly.dern<? super Boolean>, ? extends Object> function2, wretchedly.dern<? super T> dernVar2) {
        FlowKt__ReduceKt$first$3 flowKt__ReduceKt$first$3;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e;
        wireman<? super Object> wiremanVar;
        if (dernVar2 instanceof FlowKt__ReduceKt$first$3) {
            flowKt__ReduceKt$first$3 = (FlowKt__ReduceKt$first$3) dernVar2;
            int i = flowKt__ReduceKt$first$3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$3.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(dernVar2);
            }
        } else {
            flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(dernVar2);
        }
        Object obj = flowKt__ReduceKt$first$3.result;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = flowKt__ReduceKt$first$3.label;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.element = (T) kotlinx.coroutines.flow.internal.impassible.f32306attabal;
            wireman<? super Object> flowKt__ReduceKt$first$$inlined$collectWhile$2 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2<>(function2, ref$ObjectRef2);
            try {
                flowKt__ReduceKt$first$3.L$0 = ref$ObjectRef2;
                flowKt__ReduceKt$first$3.L$1 = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                flowKt__ReduceKt$first$3.label = 1;
                if (dernVar.collect(flowKt__ReduceKt$first$$inlined$collectWhile$2, flowKt__ReduceKt$first$3) == objBeachfront) {
                    return objBeachfront;
                }
                ref$ObjectRef = ref$ObjectRef2;
            } catch (AbortFlowException e2) {
                ref$ObjectRef = ref$ObjectRef2;
                e = e2;
                wiremanVar = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                kotlinx.coroutines.flow.internal.taiyuan.attabal(e, wiremanVar);
                achondroplasia.impromptu(flowKt__ReduceKt$first$3.getContext());
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wiremanVar = (FlowKt__ReduceKt$first$$inlined$collectWhile$2) flowKt__ReduceKt$first$3.L$1;
            ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$first$3.L$0;
            try {
                p002kotlin.dern.saneness(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                kotlinx.coroutines.flow.internal.taiyuan.attabal(e, wiremanVar);
                achondroplasia.impromptu(flowKt__ReduceKt$first$3.getContext());
            }
        }
        T t = ref$ObjectRef.element;
        if (t != kotlinx.coroutines.flow.internal.impassible.f32306attabal) {
            return t;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object dern(kotlinx.coroutines.flow.dern<? extends T> dernVar, wretchedly.dern<? super T> dernVar2) {
        FlowKt__ReduceKt$firstOrNull$1 flowKt__ReduceKt$firstOrNull$1;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e;
        wireman<? super Object> wiremanVar;
        if (dernVar2 instanceof FlowKt__ReduceKt$firstOrNull$1) {
            flowKt__ReduceKt$firstOrNull$1 = (FlowKt__ReduceKt$firstOrNull$1) dernVar2;
            int i = flowKt__ReduceKt$firstOrNull$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$firstOrNull$1 = new FlowKt__ReduceKt$firstOrNull$1(dernVar2);
            }
        } else {
            flowKt__ReduceKt$firstOrNull$1 = new FlowKt__ReduceKt$firstOrNull$1(dernVar2);
        }
        Object obj = flowKt__ReduceKt$firstOrNull$1.result;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = flowKt__ReduceKt$firstOrNull$1.label;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            wireman<? super Object> sanenessVar = new saneness<>(ref$ObjectRef2);
            try {
                flowKt__ReduceKt$firstOrNull$1.L$0 = ref$ObjectRef2;
                flowKt__ReduceKt$firstOrNull$1.L$1 = sanenessVar;
                flowKt__ReduceKt$firstOrNull$1.label = 1;
                if (dernVar.collect(sanenessVar, flowKt__ReduceKt$firstOrNull$1) == objBeachfront) {
                    return objBeachfront;
                }
                ref$ObjectRef = ref$ObjectRef2;
            } catch (AbortFlowException e2) {
                ref$ObjectRef = ref$ObjectRef2;
                e = e2;
                wiremanVar = sanenessVar;
                kotlinx.coroutines.flow.internal.taiyuan.attabal(e, wiremanVar);
                achondroplasia.impromptu(flowKt__ReduceKt$firstOrNull$1.getContext());
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wiremanVar = (saneness) flowKt__ReduceKt$firstOrNull$1.L$1;
            ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$firstOrNull$1.L$0;
            try {
                p002kotlin.dern.saneness(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                kotlinx.coroutines.flow.internal.taiyuan.attabal(e, wiremanVar);
                achondroplasia.impromptu(flowKt__ReduceKt$firstOrNull$1.getContext());
            }
        }
        return ref$ObjectRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object saneness(kotlinx.coroutines.flow.dern<? extends T> dernVar, wretchedly.dern<? super T> dernVar2) {
        FlowKt__ReduceKt$first$1 flowKt__ReduceKt$first$1;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e;
        wireman<? super Object> wiremanVar;
        if (dernVar2 instanceof FlowKt__ReduceKt$first$1) {
            flowKt__ReduceKt$first$1 = (FlowKt__ReduceKt$first$1) dernVar2;
            int i = flowKt__ReduceKt$first$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(dernVar2);
            }
        } else {
            flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(dernVar2);
        }
        Object obj = flowKt__ReduceKt$first$1.result;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = flowKt__ReduceKt$first$1.label;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.element = (T) kotlinx.coroutines.flow.internal.impassible.f32306attabal;
            wireman<? super Object> attabalVar = new attabal<>(ref$ObjectRef2);
            try {
                flowKt__ReduceKt$first$1.L$0 = ref$ObjectRef2;
                flowKt__ReduceKt$first$1.L$1 = attabalVar;
                flowKt__ReduceKt$first$1.label = 1;
                if (dernVar.collect(attabalVar, flowKt__ReduceKt$first$1) == objBeachfront) {
                    return objBeachfront;
                }
                ref$ObjectRef = ref$ObjectRef2;
            } catch (AbortFlowException e2) {
                ref$ObjectRef = ref$ObjectRef2;
                e = e2;
                wiremanVar = attabalVar;
                kotlinx.coroutines.flow.internal.taiyuan.attabal(e, wiremanVar);
                achondroplasia.impromptu(flowKt__ReduceKt$first$1.getContext());
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wiremanVar = (attabal) flowKt__ReduceKt$first$1.L$1;
            ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$first$1.L$0;
            try {
                p002kotlin.dern.saneness(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                kotlinx.coroutines.flow.internal.taiyuan.attabal(e, wiremanVar);
                achondroplasia.impromptu(flowKt__ReduceKt$first$1.getContext());
            }
        }
        T t = ref$ObjectRef.element;
        if (t != kotlinx.coroutines.flow.internal.impassible.f32306attabal) {
            return t;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object wireman(kotlinx.coroutines.flow.dern<? extends T> dernVar, wretchedly.dern<? super T> dernVar2) {
        FlowKt__ReduceKt$single$1 flowKt__ReduceKt$single$1;
        Ref$ObjectRef ref$ObjectRef;
        if (dernVar2 instanceof FlowKt__ReduceKt$single$1) {
            flowKt__ReduceKt$single$1 = (FlowKt__ReduceKt$single$1) dernVar2;
            int i = flowKt__ReduceKt$single$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$single$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$single$1 = new FlowKt__ReduceKt$single$1(dernVar2);
            }
        } else {
            flowKt__ReduceKt$single$1 = new FlowKt__ReduceKt$single$1(dernVar2);
        }
        Object obj = flowKt__ReduceKt$single$1.result;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = flowKt__ReduceKt$single$1.label;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.element = (T) kotlinx.coroutines.flow.internal.impassible.f32306attabal;
            wireman<? super Object> dernVar3 = new dern<>(ref$ObjectRef2);
            flowKt__ReduceKt$single$1.L$0 = ref$ObjectRef2;
            flowKt__ReduceKt$single$1.label = 1;
            if (dernVar.collect(dernVar3, flowKt__ReduceKt$single$1) == objBeachfront) {
                return objBeachfront;
            }
            ref$ObjectRef = ref$ObjectRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$single$1.L$0;
            p002kotlin.dern.saneness(obj);
        }
        T t = ref$ObjectRef.element;
        if (t != kotlinx.coroutines.flow.internal.impassible.f32306attabal) {
            return t;
        }
        throw new NoSuchElementException("Flow is empty");
    }
}

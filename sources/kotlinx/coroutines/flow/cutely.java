package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Distinct.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u001a#\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001aY\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\"$\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\"*\u0010\u0011\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/dern;", "marial", "(Lkotlinx/coroutines/flow/dern;)Lkotlinx/coroutines/flow/dern;", "Lkotlin/Function1;", "", "keySelector", "Lkotlin/Function2;", "", "areEquivalent", "beachfront", "(Lkotlinx/coroutines/flow/dern;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/dern;", "attabal", "Lkotlin/jvm/functions/Function1;", "defaultKeySelector", "saneness", "Lkotlin/jvm/functions/Function2;", "defaultAreEquivalent", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Function1<Object, Object> f32272attabal = new Function1() { // from class: kotlinx.coroutines.flow.impromptu
        @Override // p002kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return cutely.wireman(obj);
        }
    };

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Function2<Object, Object, Boolean> f32273saneness = new Function2() { // from class: kotlinx.coroutines.flow.taiyuan
        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(cutely.dern(obj, obj2));
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> dern<T> beachfront(dern<? extends T> dernVar, Function1<? super T, ? extends Object> function1, Function2<Object, Object, Boolean> function2) {
        if (dernVar instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) dernVar;
            if (distinctFlowImpl.keySelector == function1 && distinctFlowImpl.areEquivalent == function2) {
                return dernVar;
            }
        }
        return new DistinctFlowImpl(dernVar, function1, function2);
    }

    public static final boolean dern(Object obj, Object obj2) {
        return Intrinsics.wireman(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> dern<T> marial(dern<? extends T> dernVar) {
        return dernVar instanceof dovishness ? dernVar : beachfront(dernVar, f32272attabal, f32273saneness);
    }

    public static final Object wireman(Object obj) {
        return obj;
    }
}

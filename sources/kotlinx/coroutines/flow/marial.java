package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"kotlinx/coroutines/flow/beachfront", "kotlinx/coroutines/flow/FlowKt__ChannelsKt", "kotlinx/coroutines/flow/FlowKt__CollectKt", "kotlinx/coroutines/flow/competently", "kotlinx/coroutines/flow/cutely", "kotlinx/coroutines/flow/FlowKt__EmittersKt", "kotlinx/coroutines/flow/FlowKt__ErrorsKt", "kotlinx/coroutines/flow/FlowKt__LimitKt", "kotlinx/coroutines/flow/FlowKt__MergeKt", "kotlinx/coroutines/flow/FlowKt__ReduceKt", "kotlinx/coroutines/flow/FlowKt__ShareKt", "kotlinx/coroutines/flow/FlowKt__TransformKt", "kotlinx/coroutines/flow/FlowKt__ZipKt"}, d2 = {}, k = 4, mv = {2, 1, 0}, xi = 48)
public final class marial {
    public static final <T> dern<T> adultoid(Function2<? super wireman<? super T>, ? super wretchedly.dern<? super Unit>, ? extends Object> function2) {
        return beachfront.dern(function2);
    }

    public static final <T> dern<T> apical(dern<? extends T> dernVar) {
        return competently.wireman(dernVar);
    }

    public static final void arytenoidectomy(wireman<?> wiremanVar) {
        FlowKt__EmittersKt.saneness(wiremanVar);
    }

    public static final <T> arytenoidectomy<T> attabal(apical<T> apicalVar) {
        return FlowKt__ShareKt.attabal(apicalVar);
    }

    public static final <T> dern<T> beachfront(dern<? extends T> dernVar, tetrahedral.triweekly<? super wireman<? super T>, ? super Throwable, ? super wretchedly.dern<? super Unit>, ? extends Object> triweeklyVar) {
        return FlowKt__ErrorsKt.attabal(dernVar, triweeklyVar);
    }

    public static final <T> Object competently(dern<? extends T> dernVar, wireman<? super T> wiremanVar, wretchedly.dern<? super Throwable> dernVar2) {
        return FlowKt__ErrorsKt.saneness(dernVar, wiremanVar, dernVar2);
    }

    public static final <T, R> dern<R> cord(dern<? extends T> dernVar, Function2<? super T, ? super wretchedly.dern<? super R>, ? extends Object> function2) {
        return FlowKt__MergeKt.attabal(dernVar, function2);
    }

    public static final <T> dern<T> cuirassed(dern<? extends T> dernVar, tetrahedral.triweekly<? super wireman<? super T>, ? super Throwable, ? super wretchedly.dern<? super Unit>, ? extends Object> triweeklyVar) {
        return FlowKt__EmittersKt.wireman(dernVar, triweeklyVar);
    }

    public static final <T> Object cutely(dern<? extends T> dernVar, Function2<? super T, ? super wretchedly.dern<? super Unit>, ? extends Object> function2, wretchedly.dern<? super Unit> dernVar2) {
        return FlowKt__CollectKt.saneness(dernVar, function2, dernVar2);
    }

    public static final <T> dern<T> dern(dern<? extends T> dernVar, int i, BufferOverflow bufferOverflow) {
        return competently.attabal(dernVar, i, bufferOverflow);
    }

    public static final <T1, T2, R> dern<R> dovishness(dern<? extends T1> dernVar, dern<? extends T2> dernVar2, tetrahedral.triweekly<? super T1, ? super T2, ? super wretchedly.dern<? super R>, ? extends Object> triweeklyVar) {
        return FlowKt__ZipKt.saneness(dernVar, dernVar2, triweeklyVar);
    }

    public static final <T> dern<T> formularize(dern<? extends T> dernVar) {
        return cutely.marial(dernVar);
    }

    public static final <T> dern<T> gintrap(T t) {
        return beachfront.wireman(t);
    }

    public static final <T> Object graveside(dern<? extends T> dernVar, wretchedly.dern<? super T> dernVar2) {
        return FlowKt__ReduceKt.dern(dernVar, dernVar2);
    }

    public static final <T, R> dern<R> grimness(dern<? extends T> dernVar, tetrahedral.triweekly<? super wireman<? super R>, ? super T, ? super wretchedly.dern<? super Boolean>, ? extends Object> triweeklyVar) {
        return FlowKt__LimitKt.beachfront(dernVar, triweeklyVar);
    }

    public static final <T> dern<T> impassible(dern<? extends T> dernVar, Function2<? super T, ? super wretchedly.dern<? super Boolean>, ? extends Object> function2) {
        return FlowKt__LimitKt.saneness(dernVar, function2);
    }

    public static final <T> dern<T> impromptu(Function2<? super kotlinx.coroutines.channels.kowloon<? super T>, ? super wretchedly.dern<? super Unit>, ? extends Object> function2) {
        return beachfront.saneness(function2);
    }

    public static final <T> Object kowloon(wireman<? super T> wiremanVar, dern<? extends T> dernVar, wretchedly.dern<? super Unit> dernVar2) {
        return FlowKt__CollectKt.dern(wiremanVar, dernVar, dernVar2);
    }

    public static final <T> dern<T> marial(Function2<? super kotlinx.coroutines.channels.kowloon<? super T>, ? super wretchedly.dern<? super Unit>, ? extends Object> function2) {
        return beachfront.attabal(function2);
    }

    public static final <T> dern<T> merc(dern<? extends T> dernVar, int i) {
        return FlowKt__LimitKt.wireman(dernVar, i);
    }

    public static final <T> Object molybdenite(dern<? extends T> dernVar, wretchedly.dern<? super T> dernVar2) {
        return FlowKt__ReduceKt.saneness(dernVar, dernVar2);
    }

    public static final <T> dern<T> monoploid(dern<? extends T> dernVar) {
        return FlowKt__TransformKt.attabal(dernVar);
    }

    public static final <T> arytenoidectomy<T> oilcan(arytenoidectomy<? extends T> arytenoidectomyVar, Function2<? super wireman<? super T>, ? super wretchedly.dern<? super Unit>, ? extends Object> function2) {
        return FlowKt__ShareKt.marial(arytenoidectomyVar, function2);
    }

    public static final <T> dern<T> polder(dern<? extends T> dernVar, Function2<? super T, ? super wretchedly.dern<? super Boolean>, ? extends Object> function2) {
        return FlowKt__LimitKt.marial(dernVar, function2);
    }

    public static final <T> Object polloi(dern<? extends T> dernVar, Function2<? super T, ? super wretchedly.dern<? super Boolean>, ? extends Object> function2, wretchedly.dern<? super T> dernVar2) {
        return FlowKt__ReduceKt.attabal(dernVar, function2, dernVar2);
    }

    public static final <T> monroe preprohormone(dern<? extends T> dernVar, saran saranVar) {
        return FlowKt__CollectKt.wireman(dernVar, saranVar);
    }

    public static final <T> dovishness<T> restrictive(dern<? extends T> dernVar, saran saranVar, graveside gravesideVar, T t) {
        return FlowKt__ShareKt.impromptu(dernVar, saranVar, gravesideVar, t);
    }

    public static final <T> dern<T> rotuma(dern<? extends T> dernVar, CoroutineContext coroutineContext) {
        return competently.marial(dernVar, coroutineContext);
    }

    public static final <T> dovishness<T> saneness(formularize<T> formularizeVar) {
        return FlowKt__ShareKt.saneness(formularizeVar);
    }

    public static final <T> arytenoidectomy<T> sealless(dern<? extends T> dernVar, saran saranVar, graveside gravesideVar, int i) {
        return FlowKt__ShareKt.beachfront(dernVar, saranVar, gravesideVar, i);
    }

    public static final <T, R> dern<R> seminary(dern<? extends T> dernVar, tetrahedral.triweekly<? super wireman<? super R>, ? super T, ? super wretchedly.dern<? super Unit>, ? extends Object> triweeklyVar) {
        return FlowKt__MergeKt.saneness(dernVar, triweeklyVar);
    }

    public static final <T> dern<T> stratoscope(dern<? extends T> dernVar, Function2<? super T, ? super wretchedly.dern<? super Unit>, ? extends Object> function2) {
        return FlowKt__TransformKt.saneness(dernVar, function2);
    }

    public static final <T> Object supplicat(dern<? extends T> dernVar, wretchedly.dern<? super T> dernVar2) {
        return FlowKt__ReduceKt.wireman(dernVar, dernVar2);
    }

    public static final Object taiyuan(dern<?> dernVar, wretchedly.dern<? super Unit> dernVar2) {
        return FlowKt__CollectKt.attabal(dernVar, dernVar2);
    }

    public static final <T> Object triweekly(wireman<? super T> wiremanVar, kotlinx.coroutines.channels.monoploid<? extends T> monoploidVar, wretchedly.dern<? super Unit> dernVar) {
        return FlowKt__ChannelsKt.saneness(wiremanVar, monoploidVar, dernVar);
    }

    public static final <T> dern<T> trm(dern<? extends T> dernVar, Function2<? super wireman<? super T>, ? super wretchedly.dern<? super Unit>, ? extends Object> function2) {
        return FlowKt__EmittersKt.marial(dernVar, function2);
    }

    public static final <T> dern<T> yemenite(kotlinx.coroutines.channels.monoploid<? extends T> monoploidVar) {
        return FlowKt__ChannelsKt.wireman(monoploidVar);
    }
}

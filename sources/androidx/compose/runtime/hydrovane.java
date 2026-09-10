package androidx.compose.runtime;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a=\u0010\r\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00000\tH\u0007¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0011"}, d2 = {"", "key1", "Lkotlin/Function1;", "Landroidx/compose/runtime/privatdozent;", "Landroidx/compose/runtime/saran;", "effect", "", "attabal", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/taiyuan;I)V", "Lkotlin/Function2;", "Lkotlinx/coroutines/saran;", "Lwretchedly/dern;", "block", "saneness", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/taiyuan;I)V", "Landroidx/compose/runtime/privatdozent;", "InternalDisposableEffectScope", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class hydrovane {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final privatdozent f5989attabal = new privatdozent();

    public static final void attabal(Object obj, Function1<? super privatdozent, ? extends saran> function1, taiyuan taiyuanVar, int i) {
        if (polloi.grimness()) {
            polloi.mathsort(-1371986847, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:153)");
        }
        boolean zMolybdenite = taiyuanVar.molybdenite(obj);
        Object objApical = taiyuanVar.apical();
        if (zMolybdenite || objApical == taiyuan.INSTANCE.attabal()) {
            objApical = new grimness(function1);
            taiyuanVar.competently(objApical);
        }
        if (polloi.grimness()) {
            polloi.peridotite();
        }
    }

    public static final void saneness(Object obj, Function2<? super kotlinx.coroutines.saran, ? super wretchedly.dern<? super Unit>, ? extends Object> function2, taiyuan taiyuanVar, int i) {
        if (polloi.grimness()) {
            polloi.mathsort(1179185413, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:341)");
        }
        CoroutineContext coroutineContextBeachfront = taiyuanVar.beachfront();
        boolean zMolybdenite = taiyuanVar.molybdenite(obj);
        Object objApical = taiyuanVar.apical();
        if (zMolybdenite || objApical == taiyuan.INSTANCE.attabal()) {
            objApical = new premeiotic(coroutineContextBeachfront, function2);
            taiyuanVar.competently(objApical);
        }
        if (polloi.grimness()) {
            polloi.peridotite();
        }
    }
}

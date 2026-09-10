package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: ValueHolders.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u000e\u001a\u00028\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/timberyard;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/hydromechanics;", "Lkotlin/Function0;", "valueProducer", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/palmyra;", "map", "attabal", "(Landroidx/compose/runtime/palmyra;)Ljava/lang/Object;", "Lpatroclinal/taiyuan;", "saneness", "()Ljava/lang/Object;", "current", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class timberyard<T> implements hydromechanics<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan current;

    public timberyard(Function0<? extends T> function0) {
        this.current = p002kotlin.saneness.saneness(function0);
    }

    @Override // androidx.compose.runtime.hydromechanics
    public T attabal(palmyra map) {
        return saneness();
    }

    public final T saneness() {
        return (T) this.current.getValue();
    }
}

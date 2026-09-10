package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.runtime.kattegat, reason: from toString */
/* JADX INFO: compiled from: ValueHolders.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/kattegat;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/hydromechanics;", "Lkotlin/Function1;", "", "compute", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/runtime/palmyra;", "map", "attabal", "(Landroidx/compose/runtime/palmyra;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/jvm/functions/Function1;", "saneness", "()Lkotlin/jvm/functions/Function1;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ComputedValueHolder<T> implements hydromechanics<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    public final Function1<Object, T> compute;

    /* JADX WARN: Multi-variable type inference failed */
    public ComputedValueHolder(Function1<Object, ? extends T> function1) {
        this.compute = function1;
    }

    @Override // androidx.compose.runtime.hydromechanics
    public T attabal(palmyra map) {
        return this.compute.invoke(map);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ComputedValueHolder) && Intrinsics.wireman(this.compute, ((ComputedValueHolder) other).compute);
    }

    public int hashCode() {
        return this.compute.hashCode();
    }

    public final Function1<Object, T> saneness() {
        return this.compute;
    }

    public String toString() {
        return "ComputedValueHolder(compute=" + this.compute + ')';
    }
}

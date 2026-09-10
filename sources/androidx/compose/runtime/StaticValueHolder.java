package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.runtime.ethene, reason: from toString */
/* JADX INFO: compiled from: ValueHolders.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/ethene;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/hydromechanics;", "value", "<init>", "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/palmyra;", "map", "attabal", "(Landroidx/compose/runtime/palmyra;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "saneness", "()Ljava/lang/Object;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StaticValueHolder<T> implements hydromechanics<T> {
    private final T value;

    public StaticValueHolder(T t) {
        this.value = t;
    }

    @Override // androidx.compose.runtime.hydromechanics
    public T attabal(palmyra map) {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StaticValueHolder) && Intrinsics.wireman(this.value, ((StaticValueHolder) other).value);
    }

    public int hashCode() {
        T t = this.value;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final T saneness() {
        return this.value;
    }

    public String toString() {
        return "StaticValueHolder(value=" + this.value + ')';
    }
}

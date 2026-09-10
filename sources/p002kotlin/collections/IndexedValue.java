package p002kotlin.collections;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IndexedValue.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"Lkotlin/collections/IndexedValue;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "index", "value", "<init>", "(ILjava/lang/Object;)V", "attabal", "()I", "saneness", "()Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "hashCode", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "I", "dern", "Ljava/lang/Object;", "wireman", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IndexedValue<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    public final int index;
    private final T value;

    public IndexedValue(int i, T t) {
        this.index = i;
        this.value = t;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    public final int dern() {
        return this.index;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndexedValue)) {
            return false;
        }
        IndexedValue indexedValue = (IndexedValue) other;
        return this.index == indexedValue.index && Intrinsics.wireman(this.value, indexedValue.value);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.index) * 31;
        T t = this.value;
        return iHashCode + (t == null ? 0 : t.hashCode());
    }

    public final T saneness() {
        return this.value;
    }

    public String toString() {
        return "IndexedValue(index=" + this.index + ", value=" + this.value + ')';
    }

    public final T wireman() {
        return this.value;
    }
}

package cord;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: cord.saneness, reason: from toString */
/* JADX INFO: compiled from: MutableCounter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0014\u0010\u0005¨\u0006\u0015"}, d2 = {"Lcord/saneness;", "", "", "count", "<init>", "(I)V", "that", "", "saneness", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "attabal", "I", "dern", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeltaCounter {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    public int count;

    public DeltaCounter(int i) {
        this.count = i;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public final void dern(int i) {
        this.count = i;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeltaCounter) && this.count == ((DeltaCounter) other).count;
    }

    public int hashCode() {
        return Integer.hashCode(this.count);
    }

    public final void saneness(int that) {
        this.count += that;
    }

    public String toString() {
        return "DeltaCounter(count=" + this.count + ')';
    }

    public /* synthetic */ DeltaCounter(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}

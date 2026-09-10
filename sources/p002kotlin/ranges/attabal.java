package p002kotlin.ranges;

import co.wireman;
import com.ironsource.C3414a2;
import dessertspoon.dern;
import p002kotlin.Metadata;
import p002kotlin.collections.kattegat;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Progressions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0016\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u0013¨\u0006\""}, d2 = {"Lkotlin/ranges/attabal;", "", "", "start", "endInclusive", "step", "<init>", "(III)V", "Lkotlin/collections/kattegat;", "taiyuan", "()Lkotlin/collections/kattegat;", "", "isEmpty", "()Z", "", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "kowloon", "I", "beachfront", "first", "arytenoidectomy", "competently", "last", "monoploid", "impromptu", "polloi", "attabal", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class attabal implements Iterable<Integer>, unready.attabal {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final int last;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final int first;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final int step;

    /* JADX INFO: renamed from: kotlin.ranges.attabal$attabal, reason: collision with other inner class name and from kotlin metadata */
    /* JADX INFO: compiled from: Progressions.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/ranges/attabal$attabal;", "", "<init>", "()V", "", "rangeStart", "rangeEnd", "step", "Lkotlin/ranges/attabal;", "attabal", "(III)Lkotlin/ranges/attabal;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final attabal attabal(int rangeStart, int rangeEnd, int step) {
            return new attabal(rangeStart, rangeEnd, step);
        }

        public Companion() {
        }
    }

    public attabal(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = i;
        this.last = dern.dern(i, i2, i3);
        this.step = i3;
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final int getFirst() {
        return this.first;
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final int getLast() {
        return this.last;
    }

    public boolean equals(Object other) {
        if (!(other instanceof attabal)) {
            return false;
        }
        if (isEmpty() && ((attabal) other).isEmpty()) {
            return true;
        }
        attabal attabalVar = (attabal) other;
        return this.first == attabalVar.first && this.last == attabalVar.last && this.step == attabalVar.step;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.first * 31) + this.last) * 31) + this.step;
    }

    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public final int getStep() {
        return this.step;
    }

    public boolean isEmpty() {
        if (this.step > 0) {
            return this.first > this.last;
        }
        return this.first < this.last;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
    public kattegat iterator() {
        return new wireman(this.first, this.last, this.step);
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.step > 0) {
            sb = new StringBuilder();
            sb.append(this.first);
            sb.append("..");
            sb.append(this.last);
            sb.append(" step ");
            i = this.step;
        } else {
            sb = new StringBuilder();
            sb.append(this.first);
            sb.append(" downTo ");
            sb.append(this.last);
            sb.append(" step ");
            i = -this.step;
        }
        sb.append(i);
        return sb.toString();
    }
}

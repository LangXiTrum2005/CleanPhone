package p002kotlin.ranges;

import co.marial;
import dessertspoon.dern;
import p002kotlin.Metadata;
import p002kotlin.collections.supplicat;
import unready.attabal;

/* JADX INFO: compiled from: Progressions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0017"}, d2 = {"Lkotlin/ranges/saneness;", "", "", "start", "endInclusive", "step", "<init>", "(JJJ)V", "Lkotlin/collections/supplicat;", "impromptu", "()Lkotlin/collections/supplicat;", "kowloon", "J", "beachfront", "()J", "first", "arytenoidectomy", "competently", "last", "monoploid", "getStep", "polloi", "attabal", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class saneness implements Iterable<Long>, attabal {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final long last;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final long first;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final long step;

    public saneness(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = j;
        this.last = dern.wireman(j, j2, j3);
        this.step = j3;
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final long getFirst() {
        return this.first;
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final long getLast() {
        return this.last;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
    public supplicat iterator() {
        return new marial(this.first, this.last, this.step);
    }
}

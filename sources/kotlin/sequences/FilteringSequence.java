package kotlin.sequences;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/sequences/FilteringSequence;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FilteringSequence<T> implements Sequence<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f44658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f44660c;

    /* JADX INFO: renamed from: kotlin.sequences.FilteringSequence$iterator$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/sequences/FilteringSequence$iterator$1", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class AnonymousClass1 implements Iterator<Object>, KMappedMarker {
        public final Iterator X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f44661Y = -1;
        public Object Z;

        public AnonymousClass1() {
            this.X = FilteringSequence.this.f44658a.iterator();
        }

        public final void a() {
            Object next;
            FilteringSequence filteringSequence;
            do {
                Iterator it = this.X;
                if (!it.hasNext()) {
                    this.f44661Y = 0;
                    return;
                } else {
                    next = it.next();
                    filteringSequence = FilteringSequence.this;
                }
            } while (((Boolean) filteringSequence.f44660c.invoke(next)).booleanValue() != filteringSequence.f44659b);
            this.Z = next;
            this.f44661Y = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f44661Y == -1) {
                a();
            }
            return this.f44661Y == 1;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f44661Y == -1) {
                a();
            }
            if (this.f44661Y == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.Z;
            this.Z = null;
            this.f44661Y = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public FilteringSequence(Sequence sequence, boolean z2, Function1 predicate) {
        Intrinsics.f(sequence, "sequence");
        Intrinsics.f(predicate, "predicate");
        this.f44658a = sequence;
        this.f44659b = z2;
        this.f44660c = predicate;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new AnonymousClass1();
    }
}

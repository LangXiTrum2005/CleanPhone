package kotlin.sequences;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/sequences/DropSequence;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DropSequence<T> implements Sequence<T>, DropTakeSequence<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f44654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44655b;

    /* JADX INFO: renamed from: kotlin.sequences.DropSequence$iterator$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/sequences/DropSequence$iterator$1", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class AnonymousClass1 implements Iterator<Object>, KMappedMarker {
        public final Iterator X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f44656Y;

        public AnonymousClass1(DropSequence dropSequence) {
            this.X = dropSequence.f44654a.iterator();
            this.f44656Y = dropSequence.f44655b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Iterator it;
            while (true) {
                int i2 = this.f44656Y;
                it = this.X;
                if (i2 <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f44656Y--;
            }
            return it.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Iterator it;
            while (true) {
                int i2 = this.f44656Y;
                it = this.X;
                if (i2 <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f44656Y--;
            }
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public DropSequence(Sequence sequence, int i2) {
        this.f44654a = sequence;
        this.f44655b = i2;
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i2 + '.').toString());
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final Sequence a(int i2) {
        int i3 = this.f44655b + i2;
        return i3 < 0 ? new DropSequence(this, i2) : new DropSequence(this.f44654a, i3);
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final Sequence b(int i2) {
        int i3 = this.f44655b;
        int i4 = i3 + i2;
        return i4 < 0 ? new TakeSequence(this, i2) : new SubSequence(this.f44654a, i3, i4);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new AnonymousClass1(this);
    }
}

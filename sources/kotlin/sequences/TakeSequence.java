package kotlin.sequences;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/sequences/TakeSequence;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TakeSequence<T> implements Sequence<T>, DropTakeSequence<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f44679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44680b;

    /* JADX INFO: renamed from: kotlin.sequences.TakeSequence$iterator$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/sequences/TakeSequence$iterator$1", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class AnonymousClass1 implements Iterator<Object>, KMappedMarker {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Iterator f44681Y;

        public AnonymousClass1(TakeSequence takeSequence) {
            this.X = takeSequence.f44680b;
            this.f44681Y = takeSequence.f44679a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.X > 0 && this.f44681Y.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            int i2 = this.X;
            if (i2 == 0) {
                throw new NoSuchElementException();
            }
            this.X = i2 - 1;
            return this.f44681Y.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public TakeSequence(Sequence sequence, int i2) {
        this.f44679a = sequence;
        this.f44680b = i2;
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i2 + '.').toString());
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final Sequence a(int i2) {
        int i3 = this.f44680b;
        return i2 >= i3 ? EmptySequence.f44657a : new SubSequence(this.f44679a, i2, i3);
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final Sequence b(int i2) {
        return i2 >= this.f44680b ? this : new TakeSequence(this.f44679a, i2);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new AnonymousClass1(this);
    }
}

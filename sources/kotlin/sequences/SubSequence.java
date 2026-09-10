package kotlin.sequences;

import android.support.v4.media.a;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/sequences/SubSequence;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SubSequence<T> implements Sequence<T>, DropTakeSequence<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f44675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44677c;

    /* JADX INFO: renamed from: kotlin.sequences.SubSequence$iterator$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/sequences/SubSequence$iterator$1", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class AnonymousClass1 implements Iterator<Object>, KMappedMarker {
        public final Iterator X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f44678Y;

        public AnonymousClass1() {
            this.X = SubSequence.this.f44675a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            SubSequence subSequence;
            Iterator it;
            while (true) {
                int i2 = this.f44678Y;
                subSequence = SubSequence.this;
                int i3 = subSequence.f44676b;
                it = this.X;
                if (i2 >= i3 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f44678Y++;
            }
            return this.f44678Y < subSequence.f44677c && it.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            SubSequence subSequence;
            Iterator it;
            while (true) {
                int i2 = this.f44678Y;
                subSequence = SubSequence.this;
                int i3 = subSequence.f44676b;
                it = this.X;
                if (i2 >= i3 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f44678Y++;
            }
            int i4 = this.f44678Y;
            if (i4 >= subSequence.f44677c) {
                throw new NoSuchElementException();
            }
            this.f44678Y = i4 + 1;
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public SubSequence(Sequence sequence, int i2, int i3) {
        this.f44675a = sequence;
        this.f44676b = i2;
        this.f44677c = i3;
        if (i2 < 0) {
            throw new IllegalArgumentException(a.h(i2, "startIndex should be non-negative, but is ").toString());
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(a.h(i3, "endIndex should be non-negative, but is ").toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(a.g(i3, i2, "endIndex should be not less than startIndex, but was ", " < ").toString());
        }
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final Sequence a(int i2) {
        int i3 = this.f44677c;
        int i4 = this.f44676b;
        if (i2 >= i3 - i4) {
            return EmptySequence.f44657a;
        }
        return new SubSequence(this.f44675a, i4 + i2, i3);
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final Sequence b(int i2) {
        int i3 = this.f44677c;
        int i4 = this.f44676b;
        if (i2 >= i3 - i4) {
            return this;
        }
        return new SubSequence(this.f44675a, i4, i2 + i4);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new AnonymousClass1();
    }
}

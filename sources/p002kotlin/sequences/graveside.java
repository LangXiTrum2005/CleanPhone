package p002kotlin.sequences;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.A5;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/sequences/graveside;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/dern;", "sequence", "", "count", "<init>", "(Lkotlin/sequences/Sequence;I)V", A5.q, "attabal", "(I)Lkotlin/sequences/Sequence;", "saneness", "", "iterator", "()Ljava/util/Iterator;", "Lkotlin/sequences/Sequence;", "I", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class graveside<T> implements Sequence<T>, dern<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Sequence<T> sequence;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final int count;

    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"kotlin/sequences/graveside$attabal", "", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "", "kowloon", "I", "getLeft", "()I", "setLeft", "(I)V", TtmlNode.LEFT, "arytenoidectomy", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal implements Iterator<T>, unready.attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public final Iterator<T> iterator;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public int left;

        public attabal(graveside<T> gravesideVar) {
            this.left = gravesideVar.count;
            this.iterator = gravesideVar.sequence.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.left > 0 && this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            int i = this.left;
            if (i == 0) {
                throw new NoSuchElementException();
            }
            this.left = i - 1;
            return this.iterator.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public graveside(Sequence<? extends T> sequence, int i) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.sequence = sequence;
        this.count = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // p002kotlin.sequences.dern
    public Sequence<T> attabal(int n) {
        int i = this.count;
        return n >= i ? arytenoidectomy.taiyuan() : new molybdenite(this.sequence, n, i);
    }

    @Override // p002kotlin.sequences.Sequence
    public Iterator<T> iterator() {
        return new attabal(this);
    }

    @Override // p002kotlin.sequences.dern
    public Sequence<T> saneness(int n) {
        return n >= this.count ? this : new graveside(this.sequence, n);
    }
}

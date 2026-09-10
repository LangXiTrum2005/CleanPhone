package p002kotlin.sequences;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/sequences/marial;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/sequences/Sequence;", "sequence", "", "sendWhen", "Lkotlin/Function1;", "predicate", "<init>", "(Lkotlin/sequences/Sequence;ZLkotlin/jvm/functions/Function1;)V", "", "iterator", "()Ljava/util/Iterator;", "attabal", "Lkotlin/sequences/Sequence;", "saneness", "Z", "dern", "Lkotlin/jvm/functions/Function1;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class marial<T> implements Sequence<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Sequence<T> sequence;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final Function1<T, Boolean> predicate;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final boolean sendWhen;

    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0003\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"kotlin/sequences/marial$attabal", "", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "", "saneness", "()V", "kowloon", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", "arytenoidectomy", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "monoploid", "Ljava/lang/Object;", "getNextItem", "setNextItem", "(Ljava/lang/Object;)V", "nextItem", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal implements Iterator<T>, unready.attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public int nextState = -1;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final Iterator<T> iterator;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public T nextItem;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public final /* synthetic */ marial<T> f31984polloi;

        public attabal(marial<T> marialVar) {
            this.f31984polloi = marialVar;
            this.iterator = marialVar.sequence.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextState == -1) {
                saneness();
            }
            return this.nextState == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.nextState == -1) {
                saneness();
            }
            if (this.nextState == 0) {
                throw new NoSuchElementException();
            }
            T t = this.nextItem;
            this.nextItem = null;
            this.nextState = -1;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void saneness() {
            while (this.iterator.hasNext()) {
                T next = this.iterator.next();
                if (((Boolean) this.f31984polloi.predicate.invoke(next)).booleanValue() == this.f31984polloi.sendWhen) {
                    this.nextItem = next;
                    this.nextState = 1;
                    return;
                }
            }
            this.nextState = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public marial(Sequence<? extends T> sequence, boolean z, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.sequence = sequence;
        this.sendWhen = z;
        this.predicate = predicate;
    }

    @Override // p002kotlin.sequences.Sequence
    public Iterator<T> iterator() {
        return new attabal(this);
    }
}

package p002kotlin.sequences;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B-\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/sequences/competently;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/sequences/Sequence;", "Lkotlin/Function0;", "getInitialValue", "Lkotlin/Function1;", "getNextValue", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "", "iterator", "()Ljava/util/Iterator;", "attabal", "Lkotlin/jvm/functions/Function0;", "saneness", "Lkotlin/jvm/functions/Function1;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class competently<T> implements Sequence<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Function0<T> getInitialValue;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Function1<T, T> getNextValue;

    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR$\u0010\u000f\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"kotlin/sequences/competently$attabal", "", "", "saneness", "()V", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "kowloon", "Ljava/lang/Object;", "getNextItem", "setNextItem", "(Ljava/lang/Object;)V", "nextItem", "", "arytenoidectomy", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal implements Iterator<T>, unready.attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public int nextState = -2;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public T nextItem;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ competently<T> f31962monoploid;

        public attabal(competently<T> competentlyVar) {
            this.f31962monoploid = competentlyVar;
        }

        private final void saneness() {
            T t;
            if (this.nextState == -2) {
                t = (T) this.f31962monoploid.getInitialValue.invoke();
            } else {
                Function1 function1 = this.f31962monoploid.getNextValue;
                T t2 = this.nextItem;
                Intrinsics.beachfront(t2);
                t = (T) function1.invoke(t2);
            }
            this.nextItem = t;
            this.nextState = t == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextState < 0) {
                saneness();
            }
            return this.nextState == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.nextState < 0) {
                saneness();
            }
            if (this.nextState == 0) {
                throw new NoSuchElementException();
            }
            T t = this.nextItem;
            Intrinsics.competently(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.nextState = -1;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public competently(Function0<? extends T> getInitialValue, Function1<? super T, ? extends T> getNextValue) {
        Intrinsics.checkNotNullParameter(getInitialValue, "getInitialValue");
        Intrinsics.checkNotNullParameter(getNextValue, "getNextValue");
        this.getInitialValue = getInitialValue;
        this.getNextValue = getNextValue;
    }

    @Override // p002kotlin.sequences.Sequence
    public Iterator<T> iterator() {
        return new attabal(this);
    }
}

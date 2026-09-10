package p002kotlin.sequences;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p002kotlin.Metadata;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005\"\u00028\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\t\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001aE\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0015\u0010\u000f\u001a-\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00162\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0017¢\u0006\u0004\b\u0019\u0010\u001a\u001a?\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00018\u00002\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0011H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001aC\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00162\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00172\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0011¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlin/sequences/Sequence;", "competently", "(Ljava/util/Iterator;)Lkotlin/sequences/Sequence;", "", "elements", "graveside", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "element", "molybdenite", "(Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "taiyuan", "()Lkotlin/sequences/Sequence;", "cutely", "(Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;", "R", "Lkotlin/Function1;", "iterator", "apical", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "impromptu", "", "Lkotlin/Function0;", "nextFunction", "kowloon", "(Lkotlin/jvm/functions/Function0;)Lkotlin/sequences/Sequence;", "seed", "triweekly", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "seedFunction", "arytenoidectomy", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
public class arytenoidectomy extends apical {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kotlin/sequences/arytenoidectomy$attabal", "Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal<T> implements Sequence<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Iterator f31946attabal;

        public attabal(Iterator it) {
            this.f31946attabal = it;
        }

        @Override // p002kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            return this.f31946attabal;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"kotlin/sequences/arytenoidectomy$dern", "", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "kowloon", "Z", "_hasNext", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class dern<T> implements Iterator<T>, unready.attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ T f31947arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public boolean _hasNext = true;

        public dern(T t) {
            this.f31947arytenoidectomy = t;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this._hasNext;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this._hasNext) {
                throw new NoSuchElementException();
            }
            this._hasNext = false;
            return this.f31947arytenoidectomy;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kotlin/sequences/arytenoidectomy$saneness", "Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class saneness<T> implements Sequence<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Object f31949attabal;

        public saneness(Object obj) {
            this.f31949attabal = obj;
        }

        @Override // p002kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            return new dern(this.f31949attabal);
        }
    }

    public static final <T, R> Sequence<R> apical(Sequence<? extends T> sequence, Function1<? super T, ? extends Iterator<? extends R>> function1) {
        return sequence instanceof dovishness ? ((dovishness) sequence).marial(function1) : new beachfront(sequence, new Function1() { // from class: kotlin.sequences.kowloon
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return arytenoidectomy.impassible(obj);
            }
        }, function1);
    }

    public static <T> Sequence<T> arytenoidectomy(Function0<? extends T> seedFunction, Function1<? super T, ? extends T> nextFunction) {
        Intrinsics.checkNotNullParameter(seedFunction, "seedFunction");
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return new competently(seedFunction, nextFunction);
    }

    public static <T> Sequence<T> competently(Iterator<? extends T> it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        return impromptu(new attabal(it));
    }

    public static final <T> Sequence<T> cutely(Sequence<? extends Sequence<? extends T>> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return apical(sequence, new Function1() { // from class: kotlin.sequences.triweekly
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return arytenoidectomy.formularize((Sequence) obj);
            }
        });
    }

    public static final Iterator formularize(Sequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.iterator();
    }

    public static final <T> Sequence<T> graveside(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return polloi.sealless(elements);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Sequence<T> impromptu(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return sequence instanceof p002kotlin.sequences.attabal ? sequence : new p002kotlin.sequences.attabal(sequence);
    }

    public static <T> Sequence<T> kowloon(final Function0<? extends T> nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return impromptu(new competently(nextFunction, new Function1() { // from class: kotlin.sequences.impassible
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return arytenoidectomy.monoploid(nextFunction, obj);
            }
        }));
    }

    public static final <T> Sequence<T> molybdenite(T t) {
        return new saneness(t);
    }

    public static final Object monoploid(Function0 function0, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return function0.invoke();
    }

    public static <T> Sequence<T> taiyuan() {
        return wireman.f31995attabal;
    }

    public static <T> Sequence<T> triweekly(final T t, Function1<? super T, ? extends T> nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return t == null ? wireman.f31995attabal : new competently(new Function0() { // from class: kotlin.sequences.formularize
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return arytenoidectomy.polloi(t);
            }
        }, nextFunction);
    }

    public static final Object impassible(Object obj) {
        return obj;
    }

    public static final Object polloi(Object obj) {
        return obj;
    }
}

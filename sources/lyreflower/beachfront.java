package lyreflower;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import p002kotlin.collections.creditor;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.rotuma;

/* JADX INFO: compiled from: SmartSet.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class beachfront<T> extends AbstractSet<T> {

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final saneness f33195monoploid = new saneness(null);

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public int f33196arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public Object f33197kowloon;

    /* JADX INFO: compiled from: SmartSet.kt */
    public static final class attabal<T> implements Iterator<T>, unready.attabal {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final Iterator<T> f33198kowloon;

        public attabal(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f33198kowloon = p002kotlin.jvm.internal.saneness.attabal(array);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33198kowloon.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f33198kowloon.next();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: SmartSet.kt */
    public static final class dern<T> implements Iterator<T>, unready.attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public boolean f33199arytenoidectomy = true;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final T f33200kowloon;

        public dern(T t) {
            this.f33200kowloon = t;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33199arytenoidectomy;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f33199arytenoidectomy) {
                throw new NoSuchElementException();
            }
            this.f33199arytenoidectomy = false;
            return this.f33200kowloon;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: SmartSet.kt */
    public static final class saneness {
        public /* synthetic */ saneness(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> beachfront<T> attabal() {
            return new beachfront<>(null);
        }

        public final <T> beachfront<T> saneness(Collection<? extends T> set) {
            Intrinsics.checkNotNullParameter(set, "set");
            beachfront<T> beachfrontVar = new beachfront<>(null);
            beachfrontVar.addAll(set);
            return beachfrontVar;
        }

        public saneness() {
        }
    }

    public /* synthetic */ beachfront(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final <T> beachfront<T> saneness() {
        return f33195monoploid.attabal();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t) {
        Object obj;
        if (size() == 0) {
            this.f33197kowloon = t;
        } else if (size() == 1) {
            if (Intrinsics.wireman(this.f33197kowloon, t)) {
                return false;
            }
            this.f33197kowloon = new Object[]{this.f33197kowloon, t};
        } else if (size() < 5) {
            Object obj2 = this.f33197kowloon;
            Intrinsics.competently(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr = (Object[]) obj2;
            if (polloi.polder(objArr, t)) {
                return false;
            }
            if (size() == 4) {
                LinkedHashSet linkedHashSetBeachfront = creditor.beachfront(Arrays.copyOf(objArr, objArr.length));
                linkedHashSetBeachfront.add(t);
                obj = linkedHashSetBeachfront;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                objArrCopyOf[objArrCopyOf.length - 1] = t;
                obj = objArrCopyOf;
            }
            this.f33197kowloon = obj;
        } else {
            Object obj3 = this.f33197kowloon;
            Intrinsics.competently(obj3, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!rotuma.marial(obj3).add(t)) {
                return false;
            }
        }
        wireman(size() + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f33197kowloon = null;
        wireman(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return Intrinsics.wireman(this.f33197kowloon, obj);
        }
        if (size() < 5) {
            Object obj2 = this.f33197kowloon;
            Intrinsics.competently(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return polloi.polder((Object[]) obj2, obj);
        }
        Object obj3 = this.f33197kowloon;
        Intrinsics.competently(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    public int dern() {
        return this.f33196arytenoidectomy;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (size() == 1) {
            return new dern(this.f33197kowloon);
        }
        if (size() < 5) {
            Object obj = this.f33197kowloon;
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new attabal((Object[]) obj);
        }
        Object obj2 = this.f33197kowloon;
        Intrinsics.competently(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return rotuma.marial(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return dern();
    }

    public void wireman(int i) {
        this.f33196arytenoidectomy = i;
    }

    public beachfront() {
    }
}

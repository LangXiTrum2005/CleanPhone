package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3414a2;
import com.ironsource.X3;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ArraySet.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0015\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001HB\u0013\b\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0007J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u0010J\u0015\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0017J\u0015\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d\"\u0004\b\u0001\u0010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d¢\u0006\u0004\b\u001e\u0010\"J\u001a\u0010$\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b$\u0010\u0010J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u001d\u0010/\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b1\u00100J\u001d\u00102\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b2\u00100J\u001d\u00103\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b3\u00100R\"\u0010;\u001a\u0002048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R*\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\u001f\"\u0004\b?\u0010@R\"\u0010E\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010&\"\u0004\bD\u0010\u0007R\u0014\u0010G\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010&¨\u0006I"}, d2 = {"Landroidx/collection/saneness;", "E", "", "", "", "capacity", "<init>", "(I)V", "", "clear", "()V", "minimumCapacity", "saneness", "element", "", "contains", "(Ljava/lang/Object;)Z", "", X3.i.W, "indexOf", "(Ljava/lang/Object;)I", "index", "triweekly", "(I)Ljava/lang/Object;", "isEmpty", "()Z", "add", "remove", "impromptu", "", "toArray", "()[Ljava/lang/Object;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", C3414a2.d, "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "iterator", "()Ljava/util/Iterator;", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "addAll", "removeAll", "retainAll", "", "kowloon", "[I", "marial", "()[I", "cutely", "([I)V", "hashes", "arytenoidectomy", "[Ljava/lang/Object;", "wireman", "taiyuan", "([Ljava/lang/Object;)V", "monoploid", "I", "competently", "impassible", "_size", "beachfront", "size", "attabal", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class saneness<E> implements Collection<E>, Set<E>, unready.saneness, unready.beachfront {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public Object[] array;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public int[] hashes;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public int _size;

    /* JADX INFO: compiled from: ArraySet.jvm.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/collection/saneness$attabal;", "Landroidx/collection/apical;", "<init>", "(Landroidx/collection/saneness;)V", "", "index", "saneness", "(I)Ljava/lang/Object;", "", "wireman", "(I)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class attabal extends apical<E> {
        public attabal() {
            super(saneness.this.competently());
        }

        @Override // androidx.collection.apical
        public E saneness(int index) {
            return saneness.this.triweekly(index);
        }

        @Override // androidx.collection.apical
        public void wireman(int index) {
            saneness.this.impromptu(index);
        }
    }

    public saneness() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E element) {
        int i;
        int iDern;
        int iCompetently = competently();
        if (element == null) {
            iDern = wireman.wireman(this);
            i = 0;
        } else {
            int iHashCode = element.hashCode();
            i = iHashCode;
            iDern = wireman.dern(this, element, iHashCode);
        }
        if (iDern >= 0) {
            return false;
        }
        int i2 = ~iDern;
        if (iCompetently >= getHashes().length) {
            int i3 = 8;
            if (iCompetently >= 8) {
                i3 = (iCompetently >> 1) + iCompetently;
            } else if (iCompetently < 4) {
                i3 = 4;
            }
            int[] hashes = getHashes();
            Object[] array = getArray();
            wireman.attabal(this, i3);
            if (iCompetently != competently()) {
                throw new ConcurrentModificationException();
            }
            if (!(getHashes().length == 0)) {
                p002kotlin.collections.arytenoidectomy.formularize(hashes, getHashes(), 0, 0, hashes.length, 6, null);
                p002kotlin.collections.arytenoidectomy.triweekly(array, getArray(), 0, 0, array.length, 6, null);
            }
        }
        if (i2 < iCompetently) {
            int i4 = i2 + 1;
            p002kotlin.collections.arytenoidectomy.competently(getHashes(), getHashes(), i4, i2, iCompetently);
            p002kotlin.collections.arytenoidectomy.taiyuan(getArray(), getArray(), i4, i2, iCompetently);
        }
        if (iCompetently != competently() || i2 >= getHashes().length) {
            throw new ConcurrentModificationException();
        }
        getHashes()[i2] = i;
        getArray()[i2] = element;
        impassible(competently() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        saneness(competently() + elements.size());
        Iterator<? extends E> it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public int get_size() {
        return this._size;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (competently() != 0) {
            cutely(molybdenite.attabal.f33567attabal);
            taiyuan(molybdenite.attabal.f33568dern);
            impassible(0);
        }
        if (competently() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final int competently() {
        return this._size;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object element) {
        return indexOf(element) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void cutely(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.hashes = iArr;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Set) || size() != ((Set) other).size()) {
            return false;
        }
        try {
            int iCompetently = competently();
            for (int i = 0; i < iCompetently; i++) {
                if (!((Set) other).contains(triweekly(i))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] hashes = getHashes();
        int iCompetently = competently();
        int i = 0;
        for (int i2 = 0; i2 < iCompetently; i2++) {
            i += hashes[i2];
        }
        return i;
    }

    public final void impassible(int i) {
        this._size = i;
    }

    public final E impromptu(int index) {
        int i;
        Object[] objArr;
        int iCompetently = competently();
        E e = (E) getArray()[index];
        if (iCompetently <= 1) {
            clear();
            return e;
        }
        int i2 = iCompetently - 1;
        if (getHashes().length <= 8 || competently() >= getHashes().length / 3) {
            if (index < i2) {
                int i3 = index + 1;
                p002kotlin.collections.arytenoidectomy.competently(getHashes(), getHashes(), index, i3, iCompetently);
                p002kotlin.collections.arytenoidectomy.taiyuan(getArray(), getArray(), index, i3, iCompetently);
            }
            getArray()[i2] = null;
        } else {
            int iCompetently2 = competently() > 8 ? competently() + (competently() >> 1) : 8;
            int[] hashes = getHashes();
            Object[] array = getArray();
            wireman.attabal(this, iCompetently2);
            if (index > 0) {
                p002kotlin.collections.arytenoidectomy.formularize(hashes, getHashes(), 0, 0, index, 6, null);
                objArr = array;
                p002kotlin.collections.arytenoidectomy.triweekly(objArr, getArray(), 0, 0, index, 6, null);
                i = index;
            } else {
                i = index;
                objArr = array;
            }
            if (i < i2) {
                int i4 = i + 1;
                p002kotlin.collections.arytenoidectomy.competently(hashes, getHashes(), i, i4, iCompetently);
                p002kotlin.collections.arytenoidectomy.taiyuan(objArr, getArray(), i, i4, iCompetently);
            }
        }
        if (iCompetently != competently()) {
            throw new ConcurrentModificationException();
        }
        impassible(i2);
        return e;
    }

    public final int indexOf(Object key) {
        return key == null ? wireman.wireman(this) : wireman.dern(this, key, key.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return competently() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new attabal();
    }

    /* JADX INFO: renamed from: marial, reason: from getter */
    public final int[] getHashes() {
        return this.hashes;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf < 0) {
            return false;
        }
        impromptu(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z = false;
        for (int iCompetently = competently() - 1; -1 < iCompetently; iCompetently--) {
            if (!CollectionsKt.permissivist(elements, getArray()[iCompetently])) {
                impromptu(iCompetently);
                z = true;
            }
        }
        return z;
    }

    public final void saneness(int minimumCapacity) {
        int iCompetently = competently();
        if (getHashes().length < minimumCapacity) {
            int[] hashes = getHashes();
            Object[] array = getArray();
            wireman.attabal(this, minimumCapacity);
            if (competently() > 0) {
                p002kotlin.collections.arytenoidectomy.formularize(hashes, getHashes(), 0, 0, competently(), 6, null);
                p002kotlin.collections.arytenoidectomy.triweekly(array, getArray(), 0, 0, competently(), 6, null);
            }
        }
        if (competently() != iCompetently) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return get_size();
    }

    public final void taiyuan(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.array = objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return p002kotlin.collections.arytenoidectomy.arytenoidectomy(this.array, 0, this._size);
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(competently() * 14);
        sb.append('{');
        int iCompetently = competently();
        for (int i = 0; i < iCompetently; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E eTriweekly = triweekly(i);
            if (eTriweekly != this) {
                sb.append(eTriweekly);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final E triweekly(int index) {
        return (E) getArray()[index];
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final Object[] getArray() {
        return this.array;
    }

    public saneness(int i) {
        this.hashes = molybdenite.attabal.f33567attabal;
        this.array = molybdenite.attabal.f33568dern;
        if (i > 0) {
            wireman.attabal(this, i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        T[] tArr = (T[]) dern.attabal(array, this._size);
        p002kotlin.collections.arytenoidectomy.taiyuan(this.array, tArr, 0, 0, this._size);
        Intrinsics.beachfront(tArr);
        return tArr;
    }

    public /* synthetic */ saneness(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}

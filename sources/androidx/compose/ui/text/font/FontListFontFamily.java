package androidx.compose.ui.text.font;

import com.ironsource.C3414a2;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.formularize, reason: from toString */
/* JADX INFO: compiled from: FontFamily.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0096\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u0096\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0011J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001bJ&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b.\u0010%¨\u00060"}, d2 = {"Landroidx/compose/ui/text/font/formularize;", "Landroidx/compose/ui/text/font/competently;", "", "Landroidx/compose/ui/text/font/impromptu;", "element", "", "saneness", "(Landroidx/compose/ui/text/font/impromptu;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "wireman", "(I)Landroidx/compose/ui/text/font/impromptu;", "competently", "(Landroidx/compose/ui/text/font/impromptu;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "impromptu", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "dovishness", "Ljava/util/List;", "marial", "()Ljava/util/List;", "fonts", "beachfront", "size", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FontListFontFamily extends competently implements List<impromptu>, unready.attabal {

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata and from toString */
    public final List<impromptu> fonts;

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, impromptu impromptuVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends impromptu> collection2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int beachfront() {
        return this.fonts.size();
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int competently(impromptu element) {
        return this.fonts.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof impromptu) {
            return saneness((impromptu) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        return this.fonts.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FontListFontFamily) && Intrinsics.wireman(this.fonts, ((FontListFontFamily) other).fonts);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.fonts.hashCode();
    }

    public int impromptu(impromptu element) {
        return this.fonts.lastIndexOf(element);
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof impromptu) {
            return competently((impromptu) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.fonts.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<impromptu> iterator() {
        return this.fonts.iterator();
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof impromptu) {
            return impromptu((impromptu) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<impromptu> listIterator() {
        return this.fonts.listIterator();
    }

    public final List<impromptu> marial() {
        return this.fonts;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ impromptu remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<impromptu> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean saneness(impromptu element) {
        return this.fonts.contains(element);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ impromptu set(int i, impromptu impromptuVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return beachfront();
    }

    @Override // java.util.List
    public void sort(Comparator<? super impromptu> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<impromptu> subList(int fromIndex, int toIndex) {
        return this.fonts.subList(fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return p002kotlin.jvm.internal.impromptu.attabal(this);
    }

    public String toString() {
        return "FontListFontFamily(fonts=" + this.fonts + ')';
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public impromptu get(int index) {
        return this.fonts.get(index);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends impromptu> collection2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator<impromptu> listIterator(int index) {
        return this.fonts.listIterator(index);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) p002kotlin.jvm.internal.impromptu.saneness(this, tArr);
    }
}

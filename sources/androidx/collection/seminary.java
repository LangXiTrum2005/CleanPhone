package androidx.collection;

import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ObjectList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003562B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u00020\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u0019\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001b\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010#\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00032\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 H\u0001¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b%\u0010\rJ\u001b\u0010&\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b&\u0010\u0018J\u001e\u0010'\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0086\u0002¢\u0006\u0004\b'\u0010\u001cJ\u0017\u0010(\u001a\u00028\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b*\u0010+J\"\u0010,\u001a\u00028\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b,\u0010-J\u0013\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.¢\u0006\u0004\b/\u00100R\u001e\u00104\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00067"}, d2 = {"Landroidx/collection/seminary;", "E", "Landroidx/collection/ObjectList;", "", "initialCapacity", "<init>", "(I)V", "index", "", "trm", "element", "", "triweekly", "(Ljava/lang/Object;)Z", "impassible", "(ILjava/lang/Object;)V", "", "elements", "kowloon", "(ILjava/util/Collection;)Z", "arytenoidectomy", "(Landroidx/collection/ObjectList;)Z", "", "monoploid", "(Ljava/lang/Iterable;)Z", "adultoid", "(Landroidx/collection/ObjectList;)V", "dovishness", "(Ljava/lang/Iterable;)V", "molybdenite", "()V", "capacity", "", "", "oldContent", "cord", "(I[Ljava/lang/Object;)V", "gintrap", "rotuma", "graveside", "preprohormone", "(I)Ljava/lang/Object;", "cuirassed", "(Ljava/util/Collection;)Z", "stratoscope", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "polloi", "()Ljava/util/List;", "Landroidx/collection/seminary$saneness;", "dern", "Landroidx/collection/seminary$saneness;", "list", "attabal", "saneness", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class seminary<E> extends ObjectList<E> {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public saneness<E> list;

    /* JADX INFO: compiled from: ObjectList.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/collection/seminary$attabal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "list", "", "index", "<init>", "(Ljava/util/List;I)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "remove", "()V", "hasPrevious", "nextIndex", "()I", "previous", "previousIndex", "element", "add", "(Ljava/lang/Object;)V", "set", "kowloon", "Ljava/util/List;", "arytenoidectomy", "I", "prevIndex", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class attabal<T> implements ListIterator<T>, unready.attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public int prevIndex;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final List<T> list;

        public attabal(List<T> list, int i) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.prevIndex = i - 1;
        }

        @Override // java.util.ListIterator
        public void add(T element) {
            List<T> list = this.list;
            int i = this.prevIndex + 1;
            this.prevIndex = i;
            list.add(i, element);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.prevIndex < this.list.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.prevIndex >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i = this.prevIndex + 1;
            this.prevIndex = i;
            return list.get(i);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.prevIndex + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            List<T> list = this.list;
            int i = this.prevIndex;
            this.prevIndex = i - 1;
            return list.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.prevIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.list.remove(this.prevIndex);
            this.prevIndex--;
        }

        @Override // java.util.ListIterator
        public void set(T element) {
            this.list.set(this.prevIndex, element);
        }
    }

    /* JADX INFO: compiled from: ObjectList.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0016\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\fJ\u001f\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ%\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u001f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010\u0010J\u000f\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\b$\u0010%J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010&J\u0017\u0010'\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b'\u0010\fJ\u001d\u0010(\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b(\u0010\u0010J\u0017\u0010)\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u0013J\u001d\u0010*\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b*\u0010\u0010J \u0010+\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b+\u0010,J%\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0014\u00108\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Landroidx/collection/seminary$dern;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "list", "", "start", TtmlNode.END, "<init>", "(Ljava/util/List;II)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "wireman", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "kowloon", "Ljava/util/List;", "arytenoidectomy", "I", "monoploid", "saneness", "()I", "size", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class dern<T> implements List<T>, unready.wireman {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public final int start;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final List<T> list;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public int end;

        public dern(List<T> list, int i, int i2) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            List<T> list = this.list;
            int i = this.end;
            this.end = i + 1;
            list.add(i, element);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.list.addAll(index + this.start, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i = this.end - 1;
            int i2 = this.start;
            if (i2 <= i) {
                while (true) {
                    this.list.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (Intrinsics.wireman(this.list.get(i2), element)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int index) {
            hydrovane.wireman(this, index);
            return this.list.get(index + this.start);
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (Intrinsics.wireman(this.list.get(i2), element)) {
                    return i2 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new attabal(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            int i = this.end - 1;
            int i2 = this.start;
            if (i2 > i) {
                return -1;
            }
            while (!Intrinsics.wireman(this.list.get(i), element)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.start;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new attabal(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return wireman(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            int i = this.end;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.end;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            int i = this.end;
            int i2 = i - 1;
            int i3 = this.start;
            if (i3 <= i2) {
                while (true) {
                    if (!elements.contains(this.list.get(i2))) {
                        this.list.remove(i2);
                        this.end--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.end;
        }

        public int saneness() {
            return this.end - this.start;
        }

        @Override // java.util.List
        public T set(int index, T element) {
            hydrovane.wireman(this, index);
            return this.list.set(index + this.start, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return saneness();
        }

        @Override // java.util.List
        public List<T> subList(int fromIndex, int toIndex) {
            hydrovane.marial(this, fromIndex, toIndex);
            return new dern(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return p002kotlin.jvm.internal.impromptu.attabal(this);
        }

        public T wireman(int index) {
            hydrovane.wireman(this, index);
            T tRemove = this.list.remove(index + this.start);
            this.end--;
            return tRemove;
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.list.add(index + this.start, element);
            this.end++;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int index) {
            return new attabal(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (Intrinsics.wireman(this.list.get(i2), element)) {
                    this.list.remove(i2);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) p002kotlin.jvm.internal.impromptu.saneness(this, array);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.list.addAll(this.end, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }
    }

    /* JADX INFO: compiled from: ObjectList.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0013\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\nJ\u001f\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ%\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\u001e\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010 \u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010%J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b&\u0010\nJ\u001d\u0010'\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b'\u0010\u000eJ\u0017\u0010(\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b(\u0010\u0012J\u001d\u0010)\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b)\u0010\u000eJ \u0010*\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b*\u0010+J%\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Landroidx/collection/seminary$saneness;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Landroidx/collection/seminary;", "objectList", "<init>", "(Landroidx/collection/seminary;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "wireman", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "kowloon", "Landroidx/collection/seminary;", "saneness", "()I", "size", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class saneness<T> implements List<T>, unready.wireman {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final seminary<T> objectList;

        public saneness(seminary<T> objectList) {
            Intrinsics.checkNotNullParameter(objectList, "objectList");
            this.objectList = objectList;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            return this.objectList.triweekly(element);
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.objectList.kowloon(index, elements);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.objectList.molybdenite();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            return this.objectList.attabal(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.objectList.saneness(elements);
        }

        @Override // java.util.List
        public T get(int index) {
            hydrovane.wireman(this, index);
            return this.objectList.wireman(index);
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            return this.objectList.beachfront(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.objectList.competently();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new attabal(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            return this.objectList.apical(element);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new attabal(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return wireman(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.objectList.rotuma(elements);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.objectList.cuirassed(elements);
        }

        public int saneness() {
            return this.objectList.get_size();
        }

        @Override // java.util.List
        public T set(int index, T element) {
            hydrovane.wireman(this, index);
            return this.objectList.stratoscope(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return saneness();
        }

        @Override // java.util.List
        public List<T> subList(int fromIndex, int toIndex) {
            hydrovane.marial(this, fromIndex, toIndex);
            return new dern(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return p002kotlin.jvm.internal.impromptu.attabal(this);
        }

        public T wireman(int index) {
            hydrovane.wireman(this, index);
            return this.objectList.preprohormone(index);
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.objectList.impassible(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.objectList.monoploid(elements);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int index) {
            return new attabal(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            return this.objectList.gintrap(element);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) p002kotlin.jvm.internal.impromptu.saneness(this, array);
        }
    }

    public seminary() {
        this(0, 1, null);
    }

    public final void adultoid(ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.competently()) {
            return;
        }
        int i = this._size + elements._size;
        Object[] objArr = this.content;
        if (objArr.length < i) {
            cord(i, objArr);
        }
        p002kotlin.collections.arytenoidectomy.taiyuan(elements.content, this.content, this._size, 0, elements._size);
        this._size += elements._size;
    }

    public final boolean arytenoidectomy(ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i = this._size;
        adultoid(elements);
        return i != this._size;
    }

    public final void cord(int capacity, Object[] oldContent) {
        Intrinsics.checkNotNullParameter(oldContent, "oldContent");
        int length = oldContent.length;
        this.content = p002kotlin.collections.arytenoidectomy.taiyuan(oldContent, new Object[Math.max(capacity, (length * 3) / 2)], 0, 0, length);
    }

    public final boolean cuirassed(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i = this._size;
        Object[] objArr = this.content;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!elements.contains(objArr[i2])) {
                preprohormone(i2);
            }
        }
        return i != this._size;
    }

    public final void dovishness(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            triweekly(it.next());
        }
    }

    public final boolean gintrap(E element) {
        int iBeachfront = beachfront(element);
        if (iBeachfront < 0) {
            return false;
        }
        preprohormone(iBeachfront);
        return true;
    }

    public final void graveside(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            gintrap(it.next());
        }
    }

    public final void impassible(int index, E element) {
        if (index < 0 || index > this._size) {
            trm(index);
        }
        int i = this._size + 1;
        Object[] objArr = this.content;
        if (objArr.length < i) {
            cord(i, objArr);
        }
        Object[] objArr2 = this.content;
        int i2 = this._size;
        if (index != i2) {
            p002kotlin.collections.arytenoidectomy.taiyuan(objArr2, objArr2, index + 1, index, i2);
        }
        objArr2[index] = element;
        this._size++;
    }

    public final boolean kowloon(int index, Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (index < 0 || index > this._size) {
            trm(index);
        }
        int i = 0;
        if (elements.isEmpty()) {
            return false;
        }
        int size = this._size + elements.size();
        Object[] objArr = this.content;
        if (objArr.length < size) {
            cord(size, objArr);
        }
        Object[] objArr2 = this.content;
        if (index != this._size) {
            p002kotlin.collections.arytenoidectomy.taiyuan(objArr2, objArr2, elements.size() + index, index, this._size);
        }
        for (Object obj : elements) {
            int i2 = i + 1;
            if (i < 0) {
                p002kotlin.collections.adultoid.dovishness();
            }
            objArr2[i + index] = obj;
            i = i2;
        }
        this._size += elements.size();
        return true;
    }

    public final void molybdenite() {
        p002kotlin.collections.arytenoidectomy.molybdenite(this.content, null, 0, this._size);
        this._size = 0;
    }

    public final boolean monoploid(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i = this._size;
        dovishness(elements);
        return i != this._size;
    }

    public final List<E> polloi() {
        saneness<E> sanenessVar = this.list;
        if (sanenessVar != null) {
            return sanenessVar;
        }
        saneness<E> sanenessVar2 = new saneness<>(this);
        this.list = sanenessVar2;
        return sanenessVar2;
    }

    public final E preprohormone(int index) {
        if (index < 0 || index >= this._size) {
            formularize(index);
        }
        Object[] objArr = this.content;
        E e = (E) objArr[index];
        int i = this._size;
        if (index != i - 1) {
            p002kotlin.collections.arytenoidectomy.taiyuan(objArr, objArr, index, index + 1, i);
        }
        int i2 = this._size - 1;
        this._size = i2;
        objArr[i2] = null;
        return e;
    }

    public final boolean rotuma(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i = this._size;
        graveside(elements);
        return i != this._size;
    }

    public final E stratoscope(int index, E element) {
        if (index < 0 || index >= this._size) {
            formularize(index);
        }
        Object[] objArr = this.content;
        E e = (E) objArr[index];
        objArr[index] = element;
        return e;
    }

    public final boolean triweekly(E element) {
        int i = this._size + 1;
        Object[] objArr = this.content;
        if (objArr.length < i) {
            cord(i, objArr);
        }
        Object[] objArr2 = this.content;
        int i2 = this._size;
        objArr2[i2] = element;
        this._size = i2 + 1;
        return true;
    }

    public final void trm(int index) {
        molybdenite.wireman.dern("Index " + index + " must be in 0.." + this._size);
    }

    public seminary(int i) {
        super(i, null);
    }

    public /* synthetic */ seminary(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }
}

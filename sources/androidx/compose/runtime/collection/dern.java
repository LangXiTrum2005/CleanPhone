package androidx.compose.runtime.collection;

import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p002kotlin.Metadata;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.arytenoidectomy;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.impromptu;

/* JADX INFO: compiled from: MutableVector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003\u0018\u0012\u000eB!\b\u0001\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b$\u0010\u000fJ\u001b\u0010%\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b%\u0010\u001eJ\u0017\u0010'\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0006H\u0001¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\rH\u0086\b¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\rH\u0086\b¢\u0006\u0004\b-\u0010,J\u0015\u0010.\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b.\u0010*J\u0015\u0010/\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b/\u0010\u000fJ\u001b\u00100\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b0\u0010\u001eJ\u0015\u00101\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b1\u00102J\u001d\u00105\u001a\u00020\u00112\u0006\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0006¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u0006H\u0001¢\u0006\u0004\b8\u0010(J\u001b\u00109\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b9\u0010\u001eJ \u0010:\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b:\u0010;J%\u0010?\u001a\u00020\u00112\u0016\u0010>\u001a\u0012\u0012\u0004\u0012\u00028\u00000<j\b\u0012\u0004\u0012\u00028\u0000`=¢\u0006\u0004\b?\u0010@R$\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b-\u0010A\u0012\u0004\bB\u0010#R\u001e\u0010D\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010CR$\u0010\u0007\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u0010F\u001a\u0004\bG\u0010H¨\u0006I"}, d2 = {"Landroidx/compose/runtime/collection/dern;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "content", "", "size", "<init>", "([Ljava/lang/Object;I)V", "apical", "()[Ljava/lang/Object;", "element", "", "saneness", "(Ljava/lang/Object;)Z", "index", "", "attabal", "(ILjava/lang/Object;)V", "", "elements", "marial", "(ILjava/util/List;)Z", "dern", "(ILandroidx/compose/runtime/collection/dern;)Z", "", "wireman", "(ILjava/util/Collection;)Z", "beachfront", "(Ljava/util/Collection;)Z", "", "competently", "()Ljava/util/List;", "impromptu", "()V", "taiyuan", "cutely", "capacity", "adultoid", "(I)V", "impassible", "(Ljava/lang/Object;)I", "triweekly", "()Z", "kowloon", "arytenoidectomy", "monoploid", "polloi", "molybdenite", "(I)Ljava/lang/Object;", "start", TtmlNode.END, "graveside", "(II)V", "newSize", "rotuma", "dovishness", "gintrap", "(ILjava/lang/Object;)Ljava/lang/Object;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "preprohormone", "(Ljava/util/Comparator;)V", "[Ljava/lang/Object;", "getContent$annotations", "Ljava/util/List;", "list", "value", "I", "formularize", "()I", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class dern<T> implements RandomAccess {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final int f5875polloi = 8;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public List<T> list;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public T[] content;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public int size;

    /* JADX INFO: compiled from: MutableVector.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0013\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\nJ\u001f\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ%\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\u001e\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010 \u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010%J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b&\u0010\nJ\u001d\u0010'\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b'\u0010\u000eJ\u0017\u0010(\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b(\u0010\u0012J\u001d\u0010)\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b)\u0010\u000eJ \u0010*\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b*\u0010+J%\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Landroidx/compose/runtime/collection/dern$attabal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Landroidx/compose/runtime/collection/dern;", "vector", "<init>", "(Landroidx/compose/runtime/collection/dern;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "wireman", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "kowloon", "Landroidx/compose/runtime/collection/dern;", "saneness", "()I", "size", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal<T> implements List<T>, unready.wireman {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final dern<T> vector;

        public attabal(dern<T> dernVar) {
            this.vector = dernVar;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            return this.vector.saneness(element);
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection<? extends T> elements) {
            return this.vector.wireman(index, elements);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.vector.impromptu();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            return this.vector.taiyuan(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<?> elements) {
            return this.vector.cutely(elements);
        }

        @Override // java.util.List
        public T get(int index) {
            wireman.attabal(this, index);
            return this.vector.content[index];
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            return this.vector.impassible(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.vector.getSize() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new C0036dern(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            return this.vector.arytenoidectomy(element);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new C0036dern(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return wireman(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<?> elements) {
            return this.vector.polloi(elements);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<?> elements) {
            return this.vector.dovishness(elements);
        }

        public int saneness() {
            return this.vector.getSize();
        }

        @Override // java.util.List
        public T set(int index, T element) {
            wireman.attabal(this, index);
            return this.vector.gintrap(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return saneness();
        }

        @Override // java.util.List
        public List<T> subList(int fromIndex, int toIndex) {
            wireman.saneness(this, fromIndex, toIndex);
            return new saneness(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return impromptu.attabal(this);
        }

        public T wireman(int index) {
            wireman.attabal(this, index);
            return this.vector.molybdenite(index);
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.vector.attabal(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            return this.vector.beachfront(elements);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int index) {
            return new C0036dern(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            return this.vector.monoploid(element);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) impromptu.saneness(this, tArr);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.collection.dern$dern, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MutableVector.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/collection/dern$dern;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "list", "", "index", "<init>", "(Ljava/util/List;I)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "remove", "()V", "hasPrevious", "nextIndex", "()I", "previous", "previousIndex", "element", "add", "(Ljava/lang/Object;)V", "set", "kowloon", "Ljava/util/List;", "arytenoidectomy", "I", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0036dern<T> implements ListIterator<T>, unready.attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public int index;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final List<T> list;

        public C0036dern(List<T> list, int i) {
            this.list = list;
            this.index = i;
        }

        @Override // java.util.ListIterator
        public void add(T element) {
            this.list.add(this.index, element);
            this.index++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.list.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i = this.index;
            this.index = i + 1;
            return list.get(i);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i = this.index - 1;
            this.index = i;
            return this.list.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i = this.index - 1;
            this.index = i;
            this.list.remove(i);
        }

        @Override // java.util.ListIterator
        public void set(T element) {
            this.list.set(this.index, element);
        }
    }

    /* JADX INFO: compiled from: MutableVector.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0016\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\fJ\u001f\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ%\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u001f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010\u0010J\u000f\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\b$\u0010%J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010&J\u0017\u0010'\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b'\u0010\fJ\u001d\u0010(\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b(\u0010\u0010J\u0017\u0010)\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u0013J\u001d\u0010*\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b*\u0010\u0010J \u0010+\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b+\u0010,J%\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0014\u00108\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Landroidx/compose/runtime/collection/dern$saneness;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "list", "", "start", TtmlNode.END, "<init>", "(Ljava/util/List;II)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "wireman", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "kowloon", "Ljava/util/List;", "arytenoidectomy", "I", "monoploid", "saneness", "()I", "size", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class saneness<T> implements List<T>, unready.wireman {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public final int start;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final List<T> list;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public int end;

        public saneness(List<T> list, int i, int i2) {
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
            this.list.addAll(index + this.start, elements);
            int size = elements.size();
            this.end += size;
            return size > 0;
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
        public boolean containsAll(Collection<?> elements) {
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
            wireman.attabal(this, index);
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
            return new C0036dern(this, 0);
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
            return new C0036dern(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return wireman(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<?> elements) {
            int i = this.end;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.end;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<?> elements) {
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
            wireman.attabal(this, index);
            return this.list.set(index + this.start, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return saneness();
        }

        @Override // java.util.List
        public List<T> subList(int fromIndex, int toIndex) {
            wireman.saneness(this, fromIndex, toIndex);
            return new saneness(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return impromptu.attabal(this);
        }

        public T wireman(int index) {
            wireman.attabal(this, index);
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
            return new C0036dern(this, index);
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
        public <T> T[] toArray(T[] tArr) {
            return (T[]) impromptu.saneness(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            this.list.addAll(this.end, elements);
            int size = elements.size();
            this.end += size;
            return size > 0;
        }
    }

    public dern(T[] tArr, int i) {
        this.content = tArr;
        this.size = i;
    }

    public final void adultoid(int capacity) {
        T[] tArr = this.content;
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[Math.max(capacity, length * 2)];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        this.content = tArr2;
    }

    public final T[] apical() {
        return this.content;
    }

    public final int arytenoidectomy(T element) {
        T[] tArr = this.content;
        for (int i = this.size - 1; i >= 0; i--) {
            if (Intrinsics.wireman(element, tArr[i])) {
                return i;
            }
        }
        return -1;
    }

    public final void attabal(int index, T element) {
        int i = this.size + 1;
        if (this.content.length < i) {
            adultoid(i);
        }
        T[] tArr = this.content;
        int i2 = this.size;
        if (index != i2) {
            System.arraycopy(tArr, index, tArr, index + 1, i2 - index);
        }
        tArr[index] = element;
        this.size++;
    }

    public final boolean beachfront(Collection<? extends T> elements) {
        return wireman(this.size, elements);
    }

    public final List<T> competently() {
        List<T> list = this.list;
        if (list != null) {
            return list;
        }
        attabal attabalVar = new attabal(this);
        this.list = attabalVar;
        return attabalVar;
    }

    public final boolean cutely(Collection<? extends T> elements) {
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!taiyuan(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean dern(int index, dern<T> elements) {
        int i = elements.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size + i;
        if (this.content.length < i2) {
            adultoid(i2);
        }
        T[] tArr = this.content;
        int i3 = this.size;
        if (index != i3) {
            System.arraycopy(tArr, index, tArr, index + i, i3 - index);
        }
        System.arraycopy(elements.content, 0, tArr, index, i);
        this.size += i;
        return true;
    }

    public final boolean dovishness(Collection<? extends T> elements) {
        int i = this.size;
        for (int size = getSize() - 1; -1 < size; size--) {
            if (!elements.contains(this.content[size])) {
                molybdenite(size);
            }
        }
        return i != this.size;
    }

    /* JADX INFO: renamed from: formularize, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final T gintrap(int index, T element) {
        T[] tArr = this.content;
        T t = tArr[index];
        tArr[index] = element;
        return t;
    }

    public final void graveside(int start, int end) {
        if (end > start) {
            int i = this.size;
            if (end < i) {
                T[] tArr = this.content;
                System.arraycopy(tArr, end, tArr, start, i - end);
            }
            int i2 = this.size - (end - start);
            int size = getSize() - 1;
            if (i2 <= size) {
                int i3 = i2;
                while (true) {
                    this.content[i3] = null;
                    if (i3 == size) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.size = i2;
        }
    }

    public final int impassible(T element) {
        T[] tArr = this.content;
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (Intrinsics.wireman(element, tArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final void impromptu() {
        T[] tArr = this.content;
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            tArr[i2] = null;
        }
        this.size = 0;
    }

    public final boolean kowloon() {
        return getSize() != 0;
    }

    public final boolean marial(int index, List<? extends T> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        int size = elements.size();
        int i = this.size + size;
        if (this.content.length < i) {
            adultoid(i);
        }
        T[] tArr = this.content;
        int i2 = this.size;
        if (index != i2) {
            System.arraycopy(tArr, index, tArr, index + size, i2 - index);
        }
        int size2 = elements.size();
        for (int i3 = 0; i3 < size2; i3++) {
            tArr[index + i3] = elements.get(i3);
        }
        this.size += size;
        return true;
    }

    public final T molybdenite(int index) {
        T[] tArr = this.content;
        T t = tArr[index];
        if (index != getSize() - 1) {
            int i = index + 1;
            System.arraycopy(tArr, i, tArr, index, this.size - i);
        }
        int i2 = this.size - 1;
        this.size = i2;
        tArr[i2] = null;
        return t;
    }

    public final boolean monoploid(T element) {
        int iImpassible = impassible(element);
        if (iImpassible < 0) {
            return false;
        }
        molybdenite(iImpassible);
        return true;
    }

    public final boolean polloi(Collection<? extends T> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        int i = this.size;
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            monoploid(it.next());
        }
        return i != this.size;
    }

    public final void preprohormone(Comparator<T> comparator) {
        arytenoidectomy.trm(this.content, comparator, 0, this.size);
    }

    public final void rotuma(int newSize) {
        this.size = newSize;
    }

    public final boolean saneness(T element) {
        int i = this.size + 1;
        if (this.content.length < i) {
            adultoid(i);
        }
        T[] tArr = this.content;
        int i2 = this.size;
        tArr[i2] = element;
        this.size = i2 + 1;
        return true;
    }

    public final boolean taiyuan(T element) {
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i = 0; !Intrinsics.wireman(this.content[i], element); i++) {
                if (i != size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean triweekly() {
        return getSize() == 0;
    }

    public final boolean wireman(int index, Collection<? extends T> elements) {
        int i = 0;
        if (elements.isEmpty()) {
            return false;
        }
        int size = elements.size();
        int i2 = this.size + size;
        if (this.content.length < i2) {
            adultoid(i2);
        }
        T[] tArr = this.content;
        int i3 = this.size;
        if (index != i3) {
            System.arraycopy(tArr, index, tArr, index + size, i3 - index);
        }
        for (T t : elements) {
            int i4 = i + 1;
            if (i < 0) {
                adultoid.dovishness();
            }
            tArr[i + index] = t;
            i = i4;
        }
        this.size += size;
        return true;
    }
}

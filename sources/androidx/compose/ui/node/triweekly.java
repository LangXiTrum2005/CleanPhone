package androidx.compose.ui.node;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HitTestResult.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u000f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002I\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0015\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0004J\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u0004J\u001d\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u001b\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u000b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0018\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010\rJ\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b-\u0010(J\u0015\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020.2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b/\u00101J%\u00104\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u00102\u001a\u00020#2\u0006\u00103\u001a\u00020#H\u0016¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0005¢\u0006\u0004\b6\u0010\u0004R\u001e\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u000108078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00109R\u0016\u0010=\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010<R\u0016\u0010?\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010>R$\u0010C\u001a\u00020#2\u0006\u0010@\u001a\u00020#8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b'\u0010>\u001a\u0004\bA\u0010BR\"\u0010H\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010D\u001a\u0004\bE\u0010\r\"\u0004\bF\u0010G\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006J"}, d2 = {"Landroidx/compose/ui/node/triweekly;", "", "Landroidx/compose/ui/attabal$dern;", "<init>", "()V", "", "adultoid", "Landroidx/compose/ui/node/cutely;", "taiyuan", "()J", "impromptu", "", "kowloon", "()Z", "saneness", "", "distanceFromEdge", "isInLayer", "molybdenite", "(FZ)Z", "node", "Lkotlin/Function0;", "childHitTest", "arytenoidectomy", "(Landroidx/compose/ui/attabal$dern;ZLkotlin/jvm/functions/Function0;)V", "monoploid", "(Landroidx/compose/ui/attabal$dern;FZLkotlin/jvm/functions/Function0;)V", "dovishness", "element", "competently", "(Landroidx/compose/ui/attabal$dern;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "cutely", "(I)Landroidx/compose/ui/attabal$dern;", "polloi", "(Landroidx/compose/ui/attabal$dern;)I", "isEmpty", "", "iterator", "()Ljava/util/Iterator;", "graveside", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "clear", "", "", "[Ljava/lang/Object;", "values", "", "[J", "distanceFromEdgeAndInLayer", "I", "hitDepth", "<set-?>", "triweekly", "()I", "size", "Z", "impassible", "setShouldSharePointerInputWithSibling", "(Z)V", "shouldSharePointerInputWithSibling", "attabal", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class triweekly implements List<androidx.compose.ui.attabal.dern>, unready.attabal {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public int size;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public Object[] values = new Object[16];

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public long[] distanceFromEdgeAndInLayer = new long[16];

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public int hitDepth = -1;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public boolean shouldSharePointerInputWithSibling = true;

    /* JADX INFO: compiled from: HitTestResult.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u0010\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ%\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0014\u0010*\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010&¨\u0006+"}, d2 = {"Landroidx/compose/ui/node/triweekly$saneness;", "", "Landroidx/compose/ui/attabal$dern;", "", "minIndex", "maxIndex", "<init>", "(Landroidx/compose/ui/node/triweekly;II)V", "element", "", "saneness", "(Landroidx/compose/ui/attabal$dern;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "wireman", "(I)Landroidx/compose/ui/attabal$dern;", "beachfront", "(Landroidx/compose/ui/attabal$dern;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "competently", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "kowloon", "I", "getMinIndex", "()I", "arytenoidectomy", "getMaxIndex", "marial", "size", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class saneness implements List<androidx.compose.ui.attabal.dern>, unready.attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public final int maxIndex;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final int minIndex;

        public saneness(int i, int i2) {
            this.minIndex = i;
            this.maxIndex = i2;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i, androidx.compose.ui.attabal.dern dernVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends androidx.compose.ui.attabal.dern> collection2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public int beachfront(androidx.compose.ui.attabal.dern element) {
            int i = this.minIndex;
            int i2 = this.maxIndex;
            if (i > i2) {
                return -1;
            }
            while (!Intrinsics.wireman(triweekly.this.values[i], element)) {
                if (i == i2) {
                    return -1;
                }
                i++;
            }
            return i - this.minIndex;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public int competently(androidx.compose.ui.attabal.dern element) {
            int i = this.maxIndex;
            int i2 = this.minIndex;
            if (i2 > i) {
                return -1;
            }
            while (!Intrinsics.wireman(triweekly.this.values[i], element)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.minIndex;
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof androidx.compose.ui.attabal.dern) {
                return saneness((androidx.compose.ui.attabal.dern) obj);
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains((androidx.compose.ui.attabal.dern) it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof androidx.compose.ui.attabal.dern) {
                return beachfront((androidx.compose.ui.attabal.dern) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<androidx.compose.ui.attabal.dern> iterator() {
            triweekly triweeklyVar = triweekly.this;
            int i = this.minIndex;
            return triweeklyVar.new attabal(i, i, this.maxIndex);
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof androidx.compose.ui.attabal.dern) {
                return competently((androidx.compose.ui.attabal.dern) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator<androidx.compose.ui.attabal.dern> listIterator() {
            triweekly triweeklyVar = triweekly.this;
            int i = this.minIndex;
            return triweeklyVar.new attabal(i, i, this.maxIndex);
        }

        public int marial() {
            return this.maxIndex - this.minIndex;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ androidx.compose.ui.attabal.dern remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator<androidx.compose.ui.attabal.dern> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean saneness(androidx.compose.ui.attabal.dern element) {
            return indexOf(element) != -1;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ androidx.compose.ui.attabal.dern set(int i, androidx.compose.ui.attabal.dern dernVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return marial();
        }

        @Override // java.util.List
        public void sort(Comparator<? super androidx.compose.ui.attabal.dern> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public List<androidx.compose.ui.attabal.dern> subList(int fromIndex, int toIndex) {
            triweekly triweeklyVar = triweekly.this;
            int i = this.minIndex;
            return triweeklyVar.new saneness(fromIndex + i, i + toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return p002kotlin.jvm.internal.impromptu.attabal(this);
        }

        @Override // java.util.List
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public androidx.compose.ui.attabal.dern get(int index) {
            Object obj = triweekly.this.values[index + this.minIndex];
            Intrinsics.competently(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (androidx.compose.ui.attabal.dern) obj;
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends androidx.compose.ui.attabal.dern> collection2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public ListIterator<androidx.compose.ui.attabal.dern> listIterator(int index) {
            triweekly triweeklyVar = triweekly.this;
            int i = this.minIndex;
            return triweeklyVar.new attabal(index + i, i, this.maxIndex);
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

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, androidx.compose.ui.attabal.dern dernVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends androidx.compose.ui.attabal.dern> collection2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void adultoid() {
        int i = this.hitDepth + 1;
        int iTriweekly = p002kotlin.collections.adultoid.triweekly(this);
        if (i <= iTriweekly) {
            while (true) {
                this.values[i] = null;
                if (i == iTriweekly) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.size = this.hitDepth + 1;
    }

    public final void arytenoidectomy(androidx.compose.ui.attabal.dern node, boolean isInLayer, Function0<Unit> childHitTest) {
        monoploid(node, -1.0f, isInLayer, childHitTest);
        NodeCoordinator coordinator = node.getCoordinator();
        if (coordinator == null || coordinator.crock()) {
            return;
        }
        this.shouldSharePointerInputWithSibling = false;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.hitDepth = -1;
        adultoid();
        this.shouldSharePointerInputWithSibling = true;
    }

    public boolean competently(androidx.compose.ui.attabal.dern element) {
        return indexOf(element) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof androidx.compose.ui.attabal.dern) {
            return competently((androidx.compose.ui.attabal.dern) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains((androidx.compose.ui.attabal.dern) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: cutely, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.attabal.dern get(int index) {
        Object obj = this.values[index];
        Intrinsics.competently(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (androidx.compose.ui.attabal.dern) obj;
    }

    public final void dovishness(androidx.compose.ui.attabal.dern node, float distanceFromEdge, boolean isInLayer, Function0<Unit> childHitTest) {
        if (this.hitDepth == p002kotlin.collections.adultoid.triweekly(this)) {
            monoploid(node, distanceFromEdge, isInLayer, childHitTest);
            if (this.hitDepth + 1 == p002kotlin.collections.adultoid.triweekly(this)) {
                adultoid();
                return;
            }
            return;
        }
        long jTaiyuan = taiyuan();
        int i = this.hitDepth;
        this.hitDepth = p002kotlin.collections.adultoid.triweekly(this);
        monoploid(node, distanceFromEdge, isInLayer, childHitTest);
        if (this.hitDepth + 1 < p002kotlin.collections.adultoid.triweekly(this) && cutely.attabal(jTaiyuan, taiyuan()) > 0) {
            int i2 = this.hitDepth + 1;
            int i3 = i + 1;
            Object[] objArr = this.values;
            p002kotlin.collections.arytenoidectomy.taiyuan(objArr, objArr, i3, i2, size());
            long[] jArr = this.distanceFromEdgeAndInLayer;
            p002kotlin.collections.arytenoidectomy.impromptu(jArr, jArr, i3, i2, size());
            this.hitDepth = ((size() + i) - this.hitDepth) - 1;
        }
        adultoid();
        this.hitDepth = i;
    }

    public int graveside(androidx.compose.ui.attabal.dern element) {
        for (int iTriweekly = p002kotlin.collections.adultoid.triweekly(this); -1 < iTriweekly; iTriweekly--) {
            if (Intrinsics.wireman(this.values[iTriweekly], element)) {
                return iTriweekly;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: impassible, reason: from getter */
    public final boolean getShouldSharePointerInputWithSibling() {
        return this.shouldSharePointerInputWithSibling;
    }

    public final void impromptu() {
        int i = this.hitDepth;
        Object[] objArr = this.values;
        if (i >= objArr.length) {
            int length = objArr.length + 16;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.values = objArrCopyOf;
            long[] jArrCopyOf = Arrays.copyOf(this.distanceFromEdgeAndInLayer, length);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            this.distanceFromEdgeAndInLayer = jArrCopyOf;
        }
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof androidx.compose.ui.attabal.dern) {
            return polloi((androidx.compose.ui.attabal.dern) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<androidx.compose.ui.attabal.dern> iterator() {
        return new attabal(this, 0, 0, 0, 7, null);
    }

    public final boolean kowloon() {
        long jTaiyuan = taiyuan();
        return cutely.dern(jTaiyuan) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && cutely.wireman(jTaiyuan);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof androidx.compose.ui.attabal.dern) {
            return graveside((androidx.compose.ui.attabal.dern) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<androidx.compose.ui.attabal.dern> listIterator() {
        return new attabal(this, 0, 0, 0, 7, null);
    }

    public final boolean molybdenite(float distanceFromEdge, boolean isInLayer) {
        if (this.hitDepth == p002kotlin.collections.adultoid.triweekly(this)) {
            return true;
        }
        return cutely.attabal(taiyuan(), kowloon.attabal(distanceFromEdge, isInLayer)) > 0;
    }

    public final void monoploid(androidx.compose.ui.attabal.dern node, float distanceFromEdge, boolean isInLayer, Function0<Unit> childHitTest) {
        int i = this.hitDepth;
        this.hitDepth = i + 1;
        impromptu();
        Object[] objArr = this.values;
        int i2 = this.hitDepth;
        objArr[i2] = node;
        this.distanceFromEdgeAndInLayer[i2] = kowloon.attabal(distanceFromEdge, isInLayer);
        adultoid();
        childHitTest.invoke();
        this.hitDepth = i;
    }

    public int polloi(androidx.compose.ui.attabal.dern element) {
        int iTriweekly = p002kotlin.collections.adultoid.triweekly(this);
        if (iTriweekly < 0) {
            return -1;
        }
        int i = 0;
        while (!Intrinsics.wireman(this.values[i], element)) {
            if (i == iTriweekly) {
                return -1;
            }
            i++;
        }
        return i;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ androidx.compose.ui.attabal.dern remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<androidx.compose.ui.attabal.dern> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void saneness() {
        this.hitDepth = size() - 1;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ androidx.compose.ui.attabal.dern set(int i, androidx.compose.ui.attabal.dern dernVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super androidx.compose.ui.attabal.dern> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<androidx.compose.ui.attabal.dern> subList(int fromIndex, int toIndex) {
        return new saneness(fromIndex, toIndex);
    }

    public final long taiyuan() {
        long jAttabal = kowloon.attabal(Float.POSITIVE_INFINITY, false);
        int i = this.hitDepth + 1;
        int iTriweekly = p002kotlin.collections.adultoid.triweekly(this);
        if (i <= iTriweekly) {
            while (true) {
                long jSaneness = cutely.saneness(this.distanceFromEdgeAndInLayer[i]);
                if (cutely.attabal(jSaneness, jAttabal) < 0) {
                    jAttabal = jSaneness;
                }
                if ((cutely.dern(jAttabal) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && cutely.wireman(jAttabal)) || i == iTriweekly) {
                    break;
                }
                i++;
            }
        }
        return jAttabal;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return p002kotlin.jvm.internal.impromptu.attabal(this);
    }

    /* JADX INFO: renamed from: triweekly, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends androidx.compose.ui.attabal.dern> collection2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator<androidx.compose.ui.attabal.dern> listIterator(int index) {
        return new attabal(this, index, 0, 0, 6, null);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) p002kotlin.jvm.internal.impromptu.saneness(this, tArr);
    }

    /* JADX INFO: compiled from: HitTestResult.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/node/triweekly$attabal;", "", "Landroidx/compose/ui/attabal$dern;", "", "index", "minIndex", "maxIndex", "<init>", "(Landroidx/compose/ui/node/triweekly;III)V", "", "hasNext", "()Z", "hasPrevious", "saneness", "()Landroidx/compose/ui/attabal$dern;", "nextIndex", "()I", "wireman", "previousIndex", "kowloon", "I", "getIndex", "setIndex", "(I)V", "arytenoidectomy", "getMinIndex", "monoploid", "getMaxIndex", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class attabal implements ListIterator<androidx.compose.ui.attabal.dern>, unready.attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public final int minIndex;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public int index;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public final int maxIndex;

        public attabal(int i, int i2, int i3) {
            this.index = i;
            this.minIndex = i2;
            this.maxIndex = i3;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(androidx.compose.ui.attabal.dern dernVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.maxIndex;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > this.minIndex;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index - this.minIndex;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.index - this.minIndex) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public androidx.compose.ui.attabal.dern next() {
            Object[] objArr = triweekly.this.values;
            int i = this.index;
            this.index = i + 1;
            Object obj = objArr[i];
            Intrinsics.competently(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (androidx.compose.ui.attabal.dern) obj;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(androidx.compose.ui.attabal.dern dernVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public androidx.compose.ui.attabal.dern previous() {
            Object[] objArr = triweekly.this.values;
            int i = this.index - 1;
            this.index = i;
            Object obj = objArr[i];
            Intrinsics.competently(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (androidx.compose.ui.attabal.dern) obj;
        }

        public /* synthetic */ attabal(triweekly triweeklyVar, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? triweeklyVar.size() : i3);
        }
    }
}

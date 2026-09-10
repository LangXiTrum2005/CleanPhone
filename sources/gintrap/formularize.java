package gintrap;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p002kotlin.Metadata;
import p002kotlin.collections.arytenoidectomy;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SmallPersistentVector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\u000f\b\u0001\u0018\u0000 .*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001/B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\u0018J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00162\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010\u001fJ\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0096\u0002¢\u0006\u0004\b$\u0010%J%\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b&\u0010\u0018J\u001f\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010'\u001a\u00020\u0016H\u0002¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010'\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lgintrap/formularize;", "E", "Ldovishness/dern;", "Lgintrap/dern;", "", "", "buffer", "<init>", "([Ljava/lang/Object;)V", "element", "Ldovishness/marial;", "add", "(Ljava/lang/Object;)Ldovishness/marial;", "", "elements", "addAll", "(Ljava/util/Collection;)Ldovishness/marial;", "Lkotlin/Function1;", "", "predicate", "timberyard", "(Lkotlin/jvm/functions/Function1;)Ldovishness/marial;", "", "index", "(ILjava/lang/Object;)Ldovishness/marial;", "formularize", "(I)Ldovishness/marial;", "Ldovishness/marial$attabal;", "builder", "()Ldovishness/marial$attabal;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "(I)Ljava/util/ListIterator;", "get", "(I)Ljava/lang/Object;", "set", "size", "competently", "(I)[Ljava/lang/Object;", "kowloon", "[Ljava/lang/Object;", "getSize", "()I", "arytenoidectomy", "attabal", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class formularize<E> extends dern<E> implements dovishness.dern<E> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final int f27165monoploid = 8;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final formularize f27166polloi = new formularize(new Object[0]);

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final Object[] buffer;

    /* JADX INFO: renamed from: gintrap.formularize$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SmallPersistentVector.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lgintrap/formularize$attabal;", "", "<init>", "()V", "Lgintrap/formularize;", "", "EMPTY", "Lgintrap/formularize;", "attabal", "()Lgintrap/formularize;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final formularize attabal() {
            return formularize.f27166polloi;
        }

        public Companion() {
        }
    }

    public formularize(Object[] objArr) {
        this.buffer = objArr;
        cord.attabal.attabal(objArr.length <= 32);
    }

    @Override // java.util.Collection, java.util.List, dovishness.marial
    public dovishness.marial<E> add(E element) {
        if (size() >= 32) {
            return new beachfront(this.buffer, triweekly.dern(element), size() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() + 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[size()] = element;
        return new formularize(objArrCopyOf);
    }

    @Override // gintrap.dern, java.util.Collection, java.util.List, dovishness.marial
    public dovishness.marial<E> addAll(Collection<? extends E> elements) {
        if (size() + elements.size() > 32) {
            dovishness.marial.attabal<E> attabalVarBuilder = builder();
            attabalVarBuilder.addAll(elements);
            return attabalVarBuilder.build();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() + elements.size());
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        int size = size();
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new formularize(objArrCopyOf);
    }

    @Override // dovishness.marial
    public dovishness.marial.attabal<E> builder() {
        return new impromptu(this, null, this.buffer, 0);
    }

    public final Object[] competently(int size) {
        return new Object[size];
    }

    @Override // dovishness.marial
    public dovishness.marial<E> formularize(int index) {
        cord.wireman.attabal(index, size());
        if (size() == 1) {
            return f27166polloi;
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() - 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        arytenoidectomy.taiyuan(this.buffer, objArrCopyOf, index, index + 1, size());
        return new formularize(objArrCopyOf);
    }

    @Override // p002kotlin.collections.wireman, java.util.List
    public E get(int index) {
        cord.wireman.attabal(index, size());
        return (E) this.buffer[index];
    }

    @Override // p002kotlin.collections.wireman, p002kotlin.collections.saneness
    public int getSize() {
        return this.buffer.length;
    }

    @Override // p002kotlin.collections.wireman, java.util.List
    public int indexOf(Object element) {
        return polloi.permissivist(this.buffer, element);
    }

    @Override // p002kotlin.collections.wireman, java.util.List
    public int lastIndexOf(Object element) {
        return polloi.sayid(this.buffer, element);
    }

    @Override // p002kotlin.collections.wireman, java.util.List
    public ListIterator<E> listIterator(int index) {
        cord.wireman.saneness(index, size());
        return new wireman(this.buffer, index, size());
    }

    @Override // p002kotlin.collections.wireman, java.util.List, dovishness.marial
    public dovishness.marial<E> set(int index, E element) {
        cord.wireman.attabal(index, size());
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[index] = element;
        return new formularize(objArrCopyOf);
    }

    @Override // dovishness.marial
    public dovishness.marial<E> timberyard(Function1<? super E, Boolean> predicate) {
        Object[] objArrCopyOf = this.buffer;
        int size = size();
        int size2 = size();
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = this.buffer[i];
            if (predicate.invoke(obj).booleanValue()) {
                if (!z) {
                    Object[] objArr = this.buffer;
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        return size == 0 ? f27166polloi : new formularize(arytenoidectomy.arytenoidectomy(objArrCopyOf, 0, size));
    }

    @Override // java.util.List, dovishness.marial
    public dovishness.marial<E> add(int index, E element) {
        cord.wireman.saneness(index, size());
        if (index == size()) {
            return add((Object) element);
        }
        if (size() < 32) {
            Object[] objArrCompetently = competently(size() + 1);
            arytenoidectomy.triweekly(this.buffer, objArrCompetently, 0, 0, index, 6, null);
            arytenoidectomy.taiyuan(this.buffer, objArrCompetently, index + 1, index, size());
            objArrCompetently[index] = element;
            return new formularize(objArrCompetently);
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        arytenoidectomy.taiyuan(this.buffer, objArrCopyOf, index + 1, index, size() - 1);
        objArrCopyOf[index] = element;
        return new beachfront(objArrCopyOf, triweekly.dern(this.buffer[31]), size() + 1, 0);
    }
}

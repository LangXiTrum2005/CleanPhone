package gintrap;

import androidx.compose.runtime.lightstruck;
import java.util.Arrays;
import java.util.ListIterator;
import p002kotlin.Metadata;
import p002kotlin.collections.arytenoidectomy;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PersistentVector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u0011J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J%\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\u0011J\u000f\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010#JE\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b&\u0010'JA\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u0006\u0010(\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b)\u0010*J7\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010+\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b,\u0010-JI\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010(\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J=\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u00102\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b3\u00104J5\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u00102\u001a\u00020\b2\u0006\u0010(\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u00106JA\u00108\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010(\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u00107\u001a\u00020.H\u0002¢\u0006\u0004\b8\u00109J?\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010(\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u00107\u001a\u00020.H\u0002¢\u0006\u0004\b:\u00109J\u001f\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b;\u0010<JA\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010(\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\b\u0010=\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b>\u0010?R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010@R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010@R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010A\u001a\u0004\bB\u0010#R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010A¨\u0006C"}, d2 = {"Lgintrap/beachfront;", "E", "Ldovishness/marial;", "Lgintrap/dern;", "", "", "root", "tail", "", "size", "rootShift", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;II)V", "element", "add", "(Ljava/lang/Object;)Ldovishness/marial;", "index", "(ILjava/lang/Object;)Ldovishness/marial;", "formularize", "(I)Ldovishness/marial;", "Lkotlin/Function1;", "", "predicate", "timberyard", "(Lkotlin/jvm/functions/Function1;)Ldovishness/marial;", "Lgintrap/impromptu;", "competently", "()Lgintrap/impromptu;", "", "listIterator", "(I)Ljava/util/ListIterator;", "get", "(I)Ljava/lang/Object;", "set", "polloi", "()I", "filledTail", "newTail", "triweekly", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)Lgintrap/beachfront;", "shift", "kowloon", "([Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "tailIndex", "taiyuan", "([Ljava/lang/Object;ILjava/lang/Object;)Lgintrap/beachfront;", "Lgintrap/marial;", "elementCarry", "impromptu", "([Ljava/lang/Object;IILjava/lang/Object;Lgintrap/marial;)[Ljava/lang/Object;", "rootSize", "monoploid", "([Ljava/lang/Object;III)Ldovishness/marial;", "impassible", "([Ljava/lang/Object;II)Ldovishness/marial;", "tailCarry", "cutely", "([Ljava/lang/Object;IILgintrap/marial;)[Ljava/lang/Object;", "arytenoidectomy", "beachfront", "(I)[Ljava/lang/Object;", "e", "molybdenite", "([Ljava/lang/Object;IILjava/lang/Object;)[Ljava/lang/Object;", "[Ljava/lang/Object;", "I", "getSize", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class beachfront<E> extends dern<E> implements dovishness.marial<E> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final Object[] tail;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final Object[] root;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final int size;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final int rootShift;

    public beachfront(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.root = objArr;
        this.tail = objArr2;
        this.size = i;
        this.rootShift = i2;
        if (!(size() > 32)) {
            lightstruck.attabal("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        cord.attabal.attabal(size() - triweekly.wireman(size()) <= p002kotlin.ranges.wireman.competently(objArr2.length, 32));
    }

    @Override // java.util.Collection, java.util.List, dovishness.marial
    public dovishness.marial<E> add(E element) {
        int size = size() - polloi();
        if (size >= 32) {
            return triweekly(this.root, this.tail, triweekly.dern(element));
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[size] = element;
        return new beachfront(this.root, objArrCopyOf, size() + 1, this.rootShift);
    }

    public final Object[] arytenoidectomy(Object[] root, int shift, int index, marial tailCarry) {
        Object[] objArrCopyOf;
        int iAttabal = triweekly.attabal(index, shift);
        if (shift == 0) {
            if (iAttabal == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(root, 32);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            }
            arytenoidectomy.taiyuan(root, objArrCopyOf, iAttabal, iAttabal + 1, 32);
            objArrCopyOf[31] = tailCarry.getValue();
            tailCarry.saneness(root[iAttabal]);
            return objArrCopyOf;
        }
        int iAttabal2 = root[31] == null ? triweekly.attabal(polloi() - 1, shift) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(root, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
        int i = shift - 5;
        int i2 = iAttabal + 1;
        if (i2 <= iAttabal2) {
            while (true) {
                Object obj = objArrCopyOf2[iAttabal2];
                Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iAttabal2] = arytenoidectomy((Object[]) obj, i, 0, tailCarry);
                if (iAttabal2 == i2) {
                    break;
                }
                iAttabal2--;
            }
        }
        Object obj2 = objArrCopyOf2[iAttabal];
        Intrinsics.competently(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iAttabal] = arytenoidectomy((Object[]) obj2, i, index, tailCarry);
        return objArrCopyOf2;
    }

    public final Object[] beachfront(int index) {
        if (polloi() <= index) {
            return this.tail;
        }
        Object[] objArr = this.root;
        for (int i = this.rootShift; i > 0; i -= 5) {
            Object[] objArr2 = objArr[triweekly.attabal(index, i)];
            Intrinsics.competently(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    @Override // dovishness.marial
    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public impromptu<E> builder() {
        return new impromptu<>(this, this.root, this.tail, this.rootShift);
    }

    public final Object[] cutely(Object[] root, int shift, int index, marial tailCarry) {
        Object[] objArrCutely;
        int iAttabal = triweekly.attabal(index, shift);
        if (shift == 5) {
            tailCarry.saneness(root[iAttabal]);
            objArrCutely = null;
        } else {
            Object obj = root[iAttabal];
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCutely = cutely((Object[]) obj, shift - 5, index, tailCarry);
        }
        if (objArrCutely == null && iAttabal == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(root, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iAttabal] = objArrCutely;
        return objArrCopyOf;
    }

    @Override // dovishness.marial
    public dovishness.marial<E> formularize(int index) {
        cord.wireman.attabal(index, size());
        int iPolloi = polloi();
        return index >= iPolloi ? monoploid(this.root, iPolloi, this.rootShift, index - iPolloi) : monoploid(arytenoidectomy(this.root, this.rootShift, index, new marial(this.tail[0])), iPolloi, this.rootShift, 0);
    }

    @Override // p002kotlin.collections.wireman, java.util.List
    public E get(int index) {
        cord.wireman.attabal(index, size());
        return (E) beachfront(index)[index & 31];
    }

    @Override // p002kotlin.collections.wireman, p002kotlin.collections.saneness
    public int getSize() {
        return this.size;
    }

    public final dovishness.marial<E> impassible(Object[] root, int rootSize, int shift) {
        if (shift == 0) {
            if (root.length == 33) {
                root = Arrays.copyOf(root, 32);
                Intrinsics.checkNotNullExpressionValue(root, "copyOf(...)");
            }
            return new formularize(root);
        }
        marial marialVar = new marial(null);
        Object[] objArrCutely = cutely(root, shift, rootSize - 1, marialVar);
        Intrinsics.beachfront(objArrCutely);
        Object value = marialVar.getValue();
        Intrinsics.competently(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        if (objArrCutely[1] != null) {
            return new beachfront(objArrCutely, objArr, rootSize, shift);
        }
        Object obj = objArrCutely[0];
        Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new beachfront((Object[]) obj, objArr, rootSize, shift - 5);
    }

    public final Object[] impromptu(Object[] root, int shift, int index, Object element, marial elementCarry) {
        Object[] objArrCopyOf;
        int iAttabal = triweekly.attabal(index, shift);
        if (shift == 0) {
            if (iAttabal == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(root, 32);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            }
            arytenoidectomy.taiyuan(root, objArrCopyOf, iAttabal + 1, iAttabal, 31);
            elementCarry.saneness(root[31]);
            objArrCopyOf[iAttabal] = element;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(root, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
        int i = shift - 5;
        Object obj = root[iAttabal];
        Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iAttabal] = impromptu((Object[]) obj, i, index, element, elementCarry);
        while (true) {
            iAttabal++;
            if (iAttabal >= 32 || objArrCopyOf2[iAttabal] == null) {
                break;
            }
            Object obj2 = root[iAttabal];
            Intrinsics.competently(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iAttabal] = impromptu((Object[]) obj2, i, 0, elementCarry.getValue(), elementCarry);
        }
        return objArrCopyOf2;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    public final Object[] kowloon(Object[] root, int shift, Object[] tail) {
        Object[] objArrCopyOf;
        int iAttabal = triweekly.attabal(size() - 1, shift);
        if (root != null) {
            objArrCopyOf = Arrays.copyOf(root, 32);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            if (objArrCopyOf == null) {
                objArrCopyOf = new Object[32];
            }
        } else {
            objArrCopyOf = new Object[32];
        }
        if (shift == 5) {
            objArrCopyOf[iAttabal] = tail;
            return objArrCopyOf;
        }
        objArrCopyOf[iAttabal] = kowloon((Object[]) objArrCopyOf[iAttabal], shift - 5, tail);
        return objArrCopyOf;
    }

    @Override // p002kotlin.collections.wireman, java.util.List
    public ListIterator<E> listIterator(int index) {
        cord.wireman.saneness(index, size());
        return new taiyuan(this.root, this.tail, index, size(), (this.rootShift / 5) + 1);
    }

    public final Object[] molybdenite(Object[] root, int shift, int index, Object e) {
        int iAttabal = triweekly.attabal(index, shift);
        Object[] objArrCopyOf = Arrays.copyOf(root, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        if (shift == 0) {
            objArrCopyOf[iAttabal] = e;
            return objArrCopyOf;
        }
        Object obj = objArrCopyOf[iAttabal];
        Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[iAttabal] = molybdenite((Object[]) obj, shift - 5, index, e);
        return objArrCopyOf;
    }

    public final dovishness.marial<E> monoploid(Object[] root, int rootSize, int shift, int index) {
        int size = size() - rootSize;
        cord.attabal.attabal(index < size);
        if (size == 1) {
            return impassible(root, rootSize, shift);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        int i = size - 1;
        if (index < i) {
            arytenoidectomy.taiyuan(this.tail, objArrCopyOf, index, index + 1, size);
        }
        objArrCopyOf[i] = null;
        return new beachfront(root, objArrCopyOf, (rootSize + size) - 1, shift);
    }

    public final int polloi() {
        return triweekly.wireman(size());
    }

    @Override // p002kotlin.collections.wireman, java.util.List, dovishness.marial
    public dovishness.marial<E> set(int index, E element) {
        cord.wireman.attabal(index, size());
        if (polloi() > index) {
            return new beachfront(molybdenite(this.root, this.rootShift, index, element), this.tail, size(), this.rootShift);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[index & 31] = element;
        return new beachfront(this.root, objArrCopyOf, size(), this.rootShift);
    }

    public final beachfront<E> taiyuan(Object[] root, int tailIndex, Object element) {
        int size = size() - polloi();
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        if (size < 32) {
            arytenoidectomy.taiyuan(this.tail, objArrCopyOf, tailIndex + 1, tailIndex, size);
            objArrCopyOf[tailIndex] = element;
            return new beachfront<>(root, objArrCopyOf, size() + 1, this.rootShift);
        }
        Object[] objArr = this.tail;
        Object obj = objArr[31];
        arytenoidectomy.taiyuan(objArr, objArrCopyOf, tailIndex + 1, tailIndex, size - 1);
        objArrCopyOf[tailIndex] = element;
        return triweekly(root, objArrCopyOf, triweekly.dern(obj));
    }

    @Override // dovishness.marial
    public dovishness.marial<E> timberyard(Function1<? super E, Boolean> predicate) {
        impromptu<E> impromptuVarBuilder = builder();
        impromptuVarBuilder.kattegat(predicate);
        return impromptuVarBuilder.build();
    }

    public final beachfront<E> triweekly(Object[] root, Object[] filledTail, Object[] newTail) {
        int size = size() >> 5;
        int i = this.rootShift;
        if (size <= (1 << i)) {
            return new beachfront<>(kowloon(root, i, filledTail), newTail, size() + 1, this.rootShift);
        }
        Object[] objArrDern = triweekly.dern(root);
        int i2 = this.rootShift + 5;
        return new beachfront<>(kowloon(objArrDern, i2, filledTail), newTail, size() + 1, i2);
    }

    @Override // java.util.List, dovishness.marial
    public dovishness.marial<E> add(int index, E element) {
        cord.wireman.saneness(index, size());
        if (index == size()) {
            return add((Object) element);
        }
        int iPolloi = polloi();
        if (index >= iPolloi) {
            return taiyuan(this.root, index - iPolloi, element);
        }
        marial marialVar = new marial(null);
        return taiyuan(impromptu(this.root, this.rootShift, index, element, marialVar), 0, marialVar.getValue());
    }
}

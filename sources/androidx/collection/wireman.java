package androidx.collection;

import com.ironsource.X3;
import java.util.ConcurrentModificationException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ArraySet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"E", "Landroidx/collection/saneness;", "", "hash", "saneness", "(Landroidx/collection/saneness;I)I", "", X3.i.W, "dern", "(Landroidx/collection/saneness;Ljava/lang/Object;I)I", "wireman", "(Landroidx/collection/saneness;)I", "size", "", "attabal", "(Landroidx/collection/saneness;I)V", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class wireman {
    public static final <E> void attabal(saneness<E> sanenessVar, int i) {
        Intrinsics.checkNotNullParameter(sanenessVar, "<this>");
        sanenessVar.cutely(new int[i]);
        sanenessVar.taiyuan(new Object[i]);
    }

    public static final <E> int dern(saneness<E> sanenessVar, Object obj, int i) {
        Intrinsics.checkNotNullParameter(sanenessVar, "<this>");
        int iCompetently = sanenessVar.competently();
        if (iCompetently == 0) {
            return -1;
        }
        int iSaneness = saneness(sanenessVar, i);
        if (iSaneness < 0 || Intrinsics.wireman(obj, sanenessVar.getArray()[iSaneness])) {
            return iSaneness;
        }
        int i2 = iSaneness + 1;
        while (i2 < iCompetently && sanenessVar.getHashes()[i2] == i) {
            if (Intrinsics.wireman(obj, sanenessVar.getArray()[i2])) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iSaneness - 1; i3 >= 0 && sanenessVar.getHashes()[i3] == i; i3--) {
            if (Intrinsics.wireman(obj, sanenessVar.getArray()[i3])) {
                return i3;
            }
        }
        return ~i2;
    }

    public static final <E> int saneness(saneness<E> sanenessVar, int i) {
        Intrinsics.checkNotNullParameter(sanenessVar, "<this>");
        try {
            return molybdenite.attabal.attabal(sanenessVar.getHashes(), sanenessVar.competently(), i);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> int wireman(saneness<E> sanenessVar) {
        Intrinsics.checkNotNullParameter(sanenessVar, "<this>");
        return dern(sanenessVar, null, 0);
    }
}

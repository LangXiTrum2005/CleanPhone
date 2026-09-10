package androidx.collection;

import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SparseArrayCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a)\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"E", "Landroidx/collection/overspeculate;", "", X3.i.W, "dern", "(Landroidx/collection/overspeculate;I)Ljava/lang/Object;", "", "wireman", "(Landroidx/collection/overspeculate;)V", "", "attabal", "Ljava/lang/Object;", "DELETED", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class clubfoot {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Object f5669attabal = new Object();

    public static final <E> E dern(overspeculate<E> overspeculateVar, int i) {
        E e;
        Intrinsics.checkNotNullParameter(overspeculateVar, "<this>");
        int iAttabal = molybdenite.attabal.attabal(overspeculateVar.f5717arytenoidectomy, overspeculateVar.f5720polloi, i);
        if (iAttabal < 0 || (e = (E) overspeculateVar.f5719monoploid[iAttabal]) == f5669attabal) {
            return null;
        }
        return e;
    }

    public static final <E> void wireman(overspeculate<E> overspeculateVar) {
        int i = overspeculateVar.f5720polloi;
        int[] iArr = overspeculateVar.f5717arytenoidectomy;
        Object[] objArr = overspeculateVar.f5719monoploid;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f5669attabal) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        overspeculateVar.f5718kowloon = false;
        overspeculateVar.f5720polloi = i2;
    }
}

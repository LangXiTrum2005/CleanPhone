package x;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f53502a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f53503b = new Object();

    public static final void a(f fVar, int i10) {
        fVar.f53495a = new int[i10];
        fVar.f53496b = new Object[i10];
    }

    public static final int b(f fVar, Object obj, int i10) {
        int i11 = fVar.f53497c;
        if (i11 == 0) {
            return -1;
        }
        try {
            int iA = y.a.a(i11, i10, fVar.f53495a);
            if (iA < 0 || n.a(obj, fVar.f53496b[iA])) {
                return iA;
            }
            int i12 = iA + 1;
            while (i12 < i11 && fVar.f53495a[i12] == i10) {
                if (n.a(obj, fVar.f53496b[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = iA - 1; i13 >= 0 && fVar.f53495a[i13] == i10; i13--) {
                if (n.a(obj, fVar.f53496b[i13])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}

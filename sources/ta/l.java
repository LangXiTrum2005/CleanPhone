package ta;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class l {
    public static /* synthetic */ boolean a(Unsafe unsafe, r rVar, long j10, q qVar, q qVar2) {
        while (!unsafe.compareAndSwapObject(rVar, j10, qVar, qVar2)) {
            if (unsafe.getObject(rVar, j10) != qVar) {
                return false;
            }
        }
        return true;
    }
}

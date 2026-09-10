package l1;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f44824b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f44825a;

    public w(Handler handler) {
        this.f44825a = handler;
    }

    public static v b() {
        v vVar;
        ArrayList arrayList = f44824b;
        synchronized (arrayList) {
            try {
                vVar = arrayList.isEmpty() ? new v() : (v) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return vVar;
    }

    public final v a(int i10, Object obj) {
        v vVarB = b();
        vVarB.f44823a = this.f44825a.obtainMessage(i10, obj);
        return vVarB;
    }

    public final boolean c(Runnable runnable) {
        return this.f44825a.post(runnable);
    }

    public final void d(int i10) {
        go.k.i(i10 != 0);
        this.f44825a.removeMessages(i10);
    }

    public final boolean e(int i10) {
        return this.f44825a.sendEmptyMessage(i10);
    }
}

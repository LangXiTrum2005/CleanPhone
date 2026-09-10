package saneness;

import ads_mobile_sdk.i13;
import ads_mobile_sdk.j13;
import android.os.SystemClock;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class kabul extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        WeakHashMap weakHashMap = j13.a;
        i13 i13Var = new i13(null, SystemClock.currentThreadTimeMillis(), null);
        Thread threadCurrentThread = Thread.currentThread();
        WeakHashMap weakHashMap2 = j13.a;
        synchronized (weakHashMap2) {
        }
        return i13Var;
    }
}

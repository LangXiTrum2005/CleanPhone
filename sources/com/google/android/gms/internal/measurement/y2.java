package com.google.android.gms.internal.measurement;

import android.util.Log;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24166a;

    public abstract Object a();

    public abstract void b(Object obj, long j10, byte b10);

    public Object c(jh jhVar, h hVar) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f24166a;
        Object obj = concurrentHashMap.get(jhVar);
        if (obj != null) {
            return obj;
        }
        Object objA = a();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(jhVar, objA);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        int iA = hVar.a();
        for (int i10 = 0; i10 < iA; i10++) {
            if (eh.f23441f.equals(hVar.h(i10))) {
                hVar.i(i10);
            }
        }
        return objA;
    }

    public abstract boolean d(long j10, Object obj);

    public abstract boolean e(Level level);

    public abstract void f(bh bhVar);

    public abstract void g(Object obj, long j10, boolean z10);

    public abstract float h(long j10, Object obj);

    public void i(RuntimeException runtimeException, bh bhVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }

    public abstract void j(Object obj, long j10, float f10);

    public abstract double k(long j10, Object obj);

    public abstract void l(Object obj, long j10, double d10);

    public y2() {
        this.f24166a = new ConcurrentHashMap();
    }
}

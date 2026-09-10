package com.google.android.gms.internal.measurement;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f23365a = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f23366b = new WeakHashMap();

    public static void a(Throwable th2) {
        Throwable cause;
        f1 f1Var;
        Closeable closeable;
        WeakHashMap weakHashMap = f23366b;
        synchronized (weakHashMap) {
            cause = th2;
            while (cause != null) {
                try {
                    if (weakHashMap.containsKey(cause)) {
                        break;
                    } else {
                        cause = cause.getCause();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            weakHashMap.put(th2, Boolean.valueOf(cause != null));
        }
        if (cause != null) {
            return;
        }
        WeakHashMap weakHashMap2 = f23365a;
        synchronized (weakHashMap2) {
            Throwable cause2 = th2;
            while (cause2 != null) {
                try {
                    if (weakHashMap2.containsKey(cause2)) {
                        break;
                    } else {
                        cause2 = cause2.getCause();
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            if (cause2 == null) {
                f1Var = null;
            } else {
                weakHashMap2.put(th2, (zf) weakHashMap2.get(cause2));
                f1Var = new f1(17);
            }
        }
        if (f1Var != null || (closeable = dg.c().f23944b) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (closeable = dg.c().f23944b; closeable != null; closeable = ((yf) closeable).f24177a) {
            arrayList.add(closeable);
        }
        UUID uuid = ((yf) ((sg) arrayList.get(0))).f24178b;
        if (uuid == null) {
            throw new NullPointerException("Null rootTraceId");
        }
        ((sg) arrayList.get(0)).getClass();
        oa.e0 e0VarV = oa.j0.v(arrayList.size());
        oa.e0 e0VarV2 = oa.j0.v(arrayList.size());
        for (sg sgVar : oa.q.t(arrayList)) {
            e0VarV2.b(((yf) sgVar).f24180d);
            e0VarV.b(sgVar.zzh());
        }
        WeakHashMap weakHashMap3 = f23365a;
        synchronized (weakHashMap3) {
            try {
                oa.n1 n1VarG = e0VarV2.g();
                if (n1VarG == null) {
                    throw new NullPointerException("Null spansNames");
                }
                oa.n1 n1VarG2 = e0VarV.g();
                if (n1VarG2 == null) {
                    throw new NullPointerException("Null extras");
                }
                weakHashMap3.put(th2, new zf(n1VarG, n1VarG2, uuid));
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }
}

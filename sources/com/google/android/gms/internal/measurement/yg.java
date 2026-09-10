package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.X3;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bi f24182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ci f24183b;

    static {
        int i10 = 1;
        f24182a = new bi(i10);
        f24183b = new ci(i10);
    }

    public static di a(Set set) {
        di diVar = new di();
        diVar.f23401d = f24183b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            mh mhVar = (mh) it.next();
            gb.b(mhVar, X3.i.W);
            boolean z10 = mhVar.f23755c;
            HashMap map = diVar.f23399b;
            HashMap map2 = diVar.f23398a;
            if (!z10) {
                map.remove(mhVar);
                map2.put(mhVar, di.f23396e);
            } else {
                if (!z10) {
                    throw new IllegalArgumentException("key must be repeating");
                }
                map2.remove(mhVar);
                map.put(mhVar, di.f23397f);
            }
        }
        return diVar;
    }

    public static final File b(Uri uri) throws b2.z {
        if (!uri.getScheme().equals(X3.i.f27782b)) {
            throw new b2.z("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new b2.z("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new b2.z("Did not expect uri to have authority");
    }

    public static void c(int i10, String str, List list) {
        if (list.size() == i10) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i10 + " parameters found " + list.size());
    }

    public static /* synthetic */ boolean e(int i10, ih ihVar, StringBuilder sb2) {
        if (i10 - 1 != 0 || ihVar == ih.f23598a) {
            return false;
        }
        sb2.append(ihVar.a());
        sb2.append('.');
        sb2.append(ihVar.b());
        sb2.append(':');
        sb2.append(ihVar.c());
        return true;
    }

    public static void f(int i10, String str, List list) {
        if (list.size() >= i10) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i10 + " parameters found " + list.size());
    }

    public static void g(int i10, String str, ArrayList arrayList) {
        if (arrayList.size() <= i10) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i10 + " parameters found " + arrayList.size());
    }

    public static boolean h(b6 b6Var) {
        if (b6Var == null) {
            return false;
        }
        Double dZzd = b6Var.zzd();
        return !dZzd.isNaN() && dZzd.doubleValue() >= 0.0d && dZzd.equals(Double.valueOf(Math.floor(dZzd.doubleValue())));
    }

    public static k6 i(String str) {
        k6 k6Var = null;
        if (str != null && !str.isEmpty()) {
            k6Var = (k6) k6.f23657l0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (k6Var != null) {
            return k6Var;
        }
        throw new IllegalArgumentException(defpackage.e.n("Unsupported commandId ", str));
    }

    public static boolean j(b6 b6Var, b6 b6Var2) {
        if (!b6Var.getClass().equals(b6Var2.getClass())) {
            return false;
        }
        if ((b6Var instanceof f6) || (b6Var instanceof z5)) {
            return true;
        }
        if (b6Var instanceof o3) {
            if (Double.isNaN(b6Var.zzd().doubleValue()) || Double.isNaN(b6Var2.zzd().doubleValue())) {
                return false;
            }
            return b6Var.zzd().equals(b6Var2.zzd());
        }
        if (b6Var instanceof e6) {
            return b6Var.zzc().equals(b6Var2.zzc());
        }
        if (b6Var instanceof c2) {
            return b6Var.zze().equals(b6Var2.zze());
        }
        return b6Var == b6Var2;
    }

    public static int k(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d10 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d10))) % 4.294967296E9d);
    }

    public static double l(double d10) {
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || d10 == 0.0d) {
            return d10;
        }
        return ((double) (d10 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d10));
    }

    public static Object m(b6 b6Var) {
        if (b6.T8.equals(b6Var)) {
            return null;
        }
        if (b6.S8.equals(b6Var)) {
            return "";
        }
        if (b6Var instanceof y5) {
            return n((y5) b6Var);
        }
        if (!(b6Var instanceof m1)) {
            return !b6Var.zzd().isNaN() ? b6Var.zzd() : b6Var.zzc();
        }
        ArrayList arrayList = new ArrayList();
        m1 m1Var = (m1) b6Var;
        int i10 = 0;
        while (i10 < m1Var.q()) {
            if (i10 >= m1Var.q()) {
                throw new NoSuchElementException(l1.d.k(new StringBuilder(String.valueOf(i10).length() + 21), "Out of bounds index: ", i10));
            }
            int i11 = i10 + 1;
            Object objM = m(m1Var.r(i10));
            if (objM != null) {
                arrayList.add(objM);
            }
            i10 = i11;
        }
        return arrayList;
    }

    public static HashMap n(y5 y5Var) {
        HashMap map = new HashMap();
        for (String str : new ArrayList(y5Var.f24170a.keySet())) {
            Object objM = m(y5Var.zzk(str));
            if (objM != null) {
                map.put(str, objM);
            }
        }
        return map;
    }

    public static void o(d8 d8Var) {
        int iK = k(d8Var.h("runtime.counter").zzd().doubleValue() + 1.0d);
        if (iK > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        d8Var.f("runtime.counter", new o3(Double.valueOf(iK)));
    }

    public abstract void d(byte[] bArr, int i10, int i11);
}

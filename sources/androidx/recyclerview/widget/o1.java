package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f4855g;

    public o1() {
        this.f4849a = 1;
        this.f4855g = new com.google.android.gms.internal.ads.f0[5];
        this.f4850b = new ArrayList();
        this.f4851c = -1;
    }

    public static void l(Object key, Object value) {
        kotlin.jvm.internal.n.f(key, "key");
        kotlin.jvm.internal.n.f(value, "value");
    }

    public void a() {
        View view = (View) l1.d.d((ArrayList) this.f4850b, 1);
        l1 l1Var = (l1) view.getLayoutParams();
        this.f4852d = ((StaggeredGridLayoutManager) this.f4855g).f4692r.b(view);
        l1Var.getClass();
    }

    public void b() {
        ((ArrayList) this.f4850b).clear();
        this.f4851c = Integer.MIN_VALUE;
        this.f4852d = Integer.MIN_VALUE;
        this.f4853e = 0;
    }

    public Object c(Object key) {
        kotlin.jvm.internal.n.f(key, "key");
        return null;
    }

    public int d() {
        ArrayList arrayList = (ArrayList) this.f4850b;
        return ((StaggeredGridLayoutManager) this.f4855g).f4697w ? f(arrayList.size() - 1, -1) : f(0, arrayList.size());
    }

    public int e() {
        ArrayList arrayList = (ArrayList) this.f4850b;
        return ((StaggeredGridLayoutManager) this.f4855g).f4697w ? f(0, arrayList.size()) : f(arrayList.size() - 1, -1);
    }

    public int f(int i10, int i11) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f4855g;
        int iK = staggeredGridLayoutManager.f4692r.k();
        int iG = staggeredGridLayoutManager.f4692r.g();
        int i12 = i11 > i10 ? 1 : -1;
        while (i10 != i11) {
            View view = (View) ((ArrayList) this.f4850b).get(i10);
            int iE = staggeredGridLayoutManager.f4692r.e(view);
            int iB = staggeredGridLayoutManager.f4692r.b(view);
            boolean z10 = iE <= iG;
            boolean z11 = iB >= iK;
            if (z10 && z11 && (iE < iK || iB > iG)) {
                return r0.C(view);
            }
            i10 += i12;
        }
        return -1;
    }

    public Object g(Object key) {
        Object objPut;
        kotlin.jvm.internal.n.f(key, "key");
        synchronized (((v1.j) this.f4855g)) {
            xf.e eVar = (xf.e) this.f4850b;
            eVar.getClass();
            Object obj = eVar.f53792a.get(key);
            if (obj != null) {
                this.f4853e++;
                return obj;
            }
            this.f4854f++;
            Object objC = c(key);
            if (objC == null) {
                return null;
            }
            synchronized (((v1.j) this.f4855g)) {
                xf.e eVar2 = (xf.e) this.f4850b;
                eVar2.getClass();
                objPut = eVar2.f53792a.put(key, objC);
                if (objPut != null) {
                    xf.e eVar3 = (xf.e) this.f4850b;
                    eVar3.getClass();
                    eVar3.f53792a.put(key, objPut);
                } else {
                    int i10 = this.f4852d;
                    l(key, objC);
                    this.f4852d = i10 + 1;
                }
            }
            if (objPut != null) {
                return objPut;
            }
            m(this.f4851c);
            return objC;
        }
    }

    public int h(int i10) {
        int i11 = this.f4852d;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (((ArrayList) this.f4850b).size() == 0) {
            return i10;
        }
        a();
        return this.f4852d;
    }

    public View i(int i10, int i11) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f4855g;
        ArrayList arrayList = (ArrayList) this.f4850b;
        View view = null;
        if (i11 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f4697w && r0.C(view2) >= i10) || ((!staggeredGridLayoutManager.f4697w && r0.C(view2) <= i10) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            View view3 = (View) arrayList.get(i12);
            if ((staggeredGridLayoutManager.f4697w && r0.C(view3) <= i10) || ((!staggeredGridLayoutManager.f4697w && r0.C(view3) >= i10) || !view3.hasFocusable())) {
                break;
            }
            i12++;
            view = view3;
        }
        return view;
    }

    public int j(int i10) {
        ArrayList arrayList = (ArrayList) this.f4850b;
        int i11 = this.f4851c;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (arrayList.size() == 0) {
            return i10;
        }
        View view = (View) arrayList.get(0);
        l1 l1Var = (l1) view.getLayoutParams();
        this.f4851c = ((StaggeredGridLayoutManager) this.f4855g).f4692r.e(view);
        l1Var.getClass();
        return this.f4851c;
    }

    public Object k(Object key, Object obj) {
        Object objPut;
        kotlin.jvm.internal.n.f(key, "key");
        synchronized (((v1.j) this.f4855g)) {
            int i10 = this.f4852d;
            l(key, obj);
            this.f4852d = i10 + 1;
            xf.e eVar = (xf.e) this.f4850b;
            eVar.getClass();
            objPut = eVar.f53792a.put(key, obj);
            if (objPut != null) {
                int i11 = this.f4852d;
                l(key, objPut);
                this.f4852d = i11 - 1;
            }
        }
        m(this.f4851c);
        return objPut;
    }

    public void m(int i10) {
        Object oldValue;
        while (true) {
            synchronized (((v1.j) this.f4855g)) {
                try {
                    if (this.f4852d < 0 || (((xf.e) this.f4850b).f53792a.isEmpty() && this.f4852d != 0)) {
                        break;
                    }
                    if (this.f4852d > i10 && !((xf.e) this.f4850b).f53792a.isEmpty()) {
                        Set setEntrySet = ((xf.e) this.f4850b).f53792a.entrySet();
                        kotlin.jvm.internal.n.e(setEntrySet, "map.entries");
                        Map.Entry entry = (Map.Entry) xj.n.p0(setEntrySet);
                        if (entry == null) {
                            return;
                        }
                        Object key = entry.getKey();
                        oldValue = entry.getValue();
                        xf.e eVar = (xf.e) this.f4850b;
                        eVar.getClass();
                        kotlin.jvm.internal.n.f(key, "key");
                        eVar.f53792a.remove(key);
                        int i11 = this.f4852d;
                        l(key, oldValue);
                        this.f4852d = i11 - 1;
                    }
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            kotlin.jvm.internal.n.f(oldValue, "oldValue");
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public void n(float f10, int i10) {
        com.google.android.gms.internal.ads.f0 f0Var;
        com.google.android.gms.internal.ads.f0[] f0VarArr = (com.google.android.gms.internal.ads.f0[]) this.f4855g;
        ArrayList arrayList = (ArrayList) this.f4850b;
        if (this.f4851c != 1) {
            Collections.sort(arrayList, com.google.android.gms.internal.ads.b.l);
            this.f4851c = 1;
        }
        int i11 = this.f4854f;
        if (i11 > 0) {
            int i12 = i11 - 1;
            this.f4854f = i12;
            f0Var = f0VarArr[i12];
        } else {
            f0Var = new com.google.android.gms.internal.ads.f0();
        }
        int i13 = this.f4852d;
        this.f4852d = i13 + 1;
        f0Var.f14126a = i13;
        f0Var.f14127b = i10;
        f0Var.f14128c = f10;
        arrayList.add(f0Var);
        this.f4853e += i10;
        while (true) {
            int i14 = this.f4853e;
            if (i14 <= 2000) {
                return;
            }
            int i15 = i14 - 2000;
            com.google.android.gms.internal.ads.f0 f0Var2 = (com.google.android.gms.internal.ads.f0) arrayList.get(0);
            int i16 = f0Var2.f14127b;
            if (i16 <= i15) {
                this.f4853e -= i16;
                arrayList.remove(0);
                int i17 = this.f4854f;
                if (i17 < 5) {
                    this.f4854f = i17 + 1;
                    f0VarArr[i17] = f0Var2;
                }
            } else {
                f0Var2.f14127b = i16 - i15;
                this.f4853e -= i15;
            }
        }
    }

    public float o() {
        ArrayList arrayList = (ArrayList) this.f4850b;
        if (this.f4851c != 0) {
            Collections.sort(arrayList, com.google.android.gms.internal.ads.b.f12566k);
            this.f4851c = 0;
        }
        float f10 = this.f4853e;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            float f11 = 0.5f * f10;
            com.google.android.gms.internal.ads.f0 f0Var = (com.google.android.gms.internal.ads.f0) arrayList.get(i11);
            i10 += f0Var.f14127b;
            if (i10 >= f11) {
                return f0Var.f14128c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((com.google.android.gms.internal.ads.f0) arrayList.get(arrayList.size() - 1)).f14128c;
    }

    public String toString() {
        String str;
        switch (this.f4849a) {
            case 2:
                synchronized (((v1.j) this.f4855g)) {
                    try {
                        int i10 = this.f4853e;
                        int i11 = this.f4854f + i10;
                        str = "LruCache[maxSize=" + this.f4851c + ",hits=" + this.f4853e + ",misses=" + this.f4854f + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public o1(int i10) {
        this.f4849a = 2;
        this.f4851c = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f4850b = new xf.e(1);
        this.f4855g = new v1.j(10);
    }

    public o1(StaggeredGridLayoutManager staggeredGridLayoutManager, int i10) {
        this.f4849a = 0;
        this.f4855g = staggeredGridLayoutManager;
        this.f4850b = new ArrayList();
        this.f4851c = Integer.MIN_VALUE;
        this.f4852d = Integer.MIN_VALUE;
        this.f4853e = 0;
        this.f4854f = i10;
    }
}

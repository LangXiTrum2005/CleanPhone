package androidx.fragment.app;

import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.storage.androidcleaner.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g1 {
    public final y0 A;
    public final rc.d B;
    public h.g C;
    public h.g D;
    public h.g E;
    public ArrayDeque F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public k1 O;
    public final s P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4323b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f4326e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f.t f4328g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f4334n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m0 f4335o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f4336p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u0 f4337q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u0 f4338r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final u0 f4339s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u0 f4340t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final x0 f4341u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4342v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public q0 f4343w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public o0 f4344x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Fragment f4345y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Fragment f4346z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4322a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1 f4324c = new p1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f4325d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s0 f4327f = new s0(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f4329h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4330i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w0 f4331j = new w0(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f4332k = new AtomicInteger();
    public final Map l = defpackage.e.w();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map f4333m = defpackage.e.w();

    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.u0] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.u0] */
    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.fragment.app.u0] */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.fragment.app.u0] */
    public g1() {
        Collections.synchronizedMap(new HashMap());
        this.f4334n = new ArrayList();
        this.f4335o = new m0(this);
        this.f4336p = new CopyOnWriteArrayList();
        final int i10 = 0;
        this.f4337q = new l0.a(this) { // from class: androidx.fragment.app.u0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g1 f4476b;

            {
                this.f4476b = this;
            }

            @Override // l0.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        g1 g1Var = this.f4476b;
                        if (g1Var.L()) {
                            g1Var.i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        g1 g1Var2 = this.f4476b;
                        if (g1Var2.L() && num.intValue() == 80) {
                            g1Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        b0.e eVar = (b0.e) obj;
                        g1 g1Var3 = this.f4476b;
                        if (g1Var3.L()) {
                            g1Var3.n(eVar.f5090a, false);
                        }
                        break;
                    default:
                        b0.p0 p0Var = (b0.p0) obj;
                        g1 g1Var4 = this.f4476b;
                        if (g1Var4.L()) {
                            g1Var4.s(p0Var.f5191a, false);
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f4338r = new l0.a(this) { // from class: androidx.fragment.app.u0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g1 f4476b;

            {
                this.f4476b = this;
            }

            @Override // l0.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        g1 g1Var = this.f4476b;
                        if (g1Var.L()) {
                            g1Var.i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        g1 g1Var2 = this.f4476b;
                        if (g1Var2.L() && num.intValue() == 80) {
                            g1Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        b0.e eVar = (b0.e) obj;
                        g1 g1Var3 = this.f4476b;
                        if (g1Var3.L()) {
                            g1Var3.n(eVar.f5090a, false);
                        }
                        break;
                    default:
                        b0.p0 p0Var = (b0.p0) obj;
                        g1 g1Var4 = this.f4476b;
                        if (g1Var4.L()) {
                            g1Var4.s(p0Var.f5191a, false);
                        }
                        break;
                }
            }
        };
        final int i12 = 2;
        this.f4339s = new l0.a(this) { // from class: androidx.fragment.app.u0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g1 f4476b;

            {
                this.f4476b = this;
            }

            @Override // l0.a
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        g1 g1Var = this.f4476b;
                        if (g1Var.L()) {
                            g1Var.i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        g1 g1Var2 = this.f4476b;
                        if (g1Var2.L() && num.intValue() == 80) {
                            g1Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        b0.e eVar = (b0.e) obj;
                        g1 g1Var3 = this.f4476b;
                        if (g1Var3.L()) {
                            g1Var3.n(eVar.f5090a, false);
                        }
                        break;
                    default:
                        b0.p0 p0Var = (b0.p0) obj;
                        g1 g1Var4 = this.f4476b;
                        if (g1Var4.L()) {
                            g1Var4.s(p0Var.f5191a, false);
                        }
                        break;
                }
            }
        };
        final int i13 = 3;
        this.f4340t = new l0.a(this) { // from class: androidx.fragment.app.u0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g1 f4476b;

            {
                this.f4476b = this;
            }

            @Override // l0.a
            public final void accept(Object obj) {
                switch (i13) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        g1 g1Var = this.f4476b;
                        if (g1Var.L()) {
                            g1Var.i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        g1 g1Var2 = this.f4476b;
                        if (g1Var2.L() && num.intValue() == 80) {
                            g1Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        b0.e eVar = (b0.e) obj;
                        g1 g1Var3 = this.f4476b;
                        if (g1Var3.L()) {
                            g1Var3.n(eVar.f5090a, false);
                        }
                        break;
                    default:
                        b0.p0 p0Var = (b0.p0) obj;
                        g1 g1Var4 = this.f4476b;
                        if (g1Var4.L()) {
                            g1Var4.s(p0Var.f5191a, false);
                        }
                        break;
                }
            }
        };
        this.f4341u = new x0(this);
        this.f4342v = -1;
        this.A = new y0(this);
        int i14 = 2;
        this.B = new rc.d(i14);
        this.F = new ArrayDeque();
        this.P = new s(this, i14);
    }

    public static HashSet E(a aVar) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < aVar.f4226a.size(); i10++) {
            Fragment fragment = ((q1) aVar.f4226a.get(i10)).f4447b;
            if (fragment != null && aVar.f4232g) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public static boolean J(int i10) {
        return Log.isLoggable("FragmentManager", i10);
    }

    public static boolean K(Fragment fragment) {
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        boolean zK = false;
        for (Fragment fragment2 : fragment.mChildFragmentManager.f4324c.e()) {
            if (fragment2 != null) {
                zK = K(fragment2);
            }
            if (zK) {
                return true;
            }
        }
        return false;
    }

    public static boolean M(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        g1 g1Var = fragment.mFragmentManager;
        return fragment.equals(g1Var.f4346z) && M(g1Var.f4345y);
    }

    public static void c0(Fragment fragment) {
        if (J(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x021e A[PHI: r15
  0x021e: PHI (r15v14 int) = (r15v13 int), (r15v16 int) binds: [B:103:0x020b, B:107:0x0215] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x016e  */
    public final void A(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        int i14;
        int i15;
        int i16 = i10;
        boolean z12 = ((a) arrayList.get(i16)).f4239o;
        ArrayList arrayList3 = this.N;
        if (arrayList3 == null) {
            this.N = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.N;
        p1 p1Var = this.f4324c;
        arrayList4.addAll(p1Var.f());
        Fragment fragment = this.f4346z;
        int i17 = i16;
        boolean z13 = false;
        while (true) {
            int i18 = 1;
            if (i17 >= i11) {
                boolean z14 = z12;
                boolean z15 = z13;
                this.N.clear();
                if (!z14 && this.f4342v >= 1) {
                    for (int i19 = i16; i19 < i11; i19++) {
                        Iterator it = ((a) arrayList.get(i19)).f4226a.iterator();
                        while (it.hasNext()) {
                            Fragment fragment2 = ((q1) it.next()).f4447b;
                            if (fragment2 != null && fragment2.mFragmentManager != null) {
                                p1Var.g(g(fragment2));
                            }
                        }
                    }
                }
                int i20 = i16;
                while (i20 < i11) {
                    a aVar = (a) arrayList.get(i20);
                    if (((Boolean) arrayList2.get(i20)).booleanValue()) {
                        aVar.c(-1);
                        g1 g1Var = aVar.f4241q;
                        ArrayList arrayList5 = aVar.f4226a;
                        boolean z16 = true;
                        for (int size = arrayList5.size() - 1; size >= 0; size--) {
                            q1 q1Var = (q1) arrayList5.get(size);
                            Fragment fragment3 = q1Var.f4447b;
                            if (fragment3 != null) {
                                fragment3.mBeingSaved = false;
                                fragment3.setPopDirection(z16);
                                int i21 = aVar.f4231f;
                                int i22 = 8194;
                                int i23 = 4097;
                                if (i21 != 4097) {
                                    if (i21 != 8194) {
                                        i22 = 4100;
                                        if (i21 != 8197) {
                                            i23 = 4099;
                                            if (i21 != 4099) {
                                                i22 = i21 != 4100 ? 0 : 8197;
                                            } else {
                                                i22 = i23;
                                            }
                                        }
                                    } else {
                                        i22 = i23;
                                    }
                                }
                                fragment3.setNextTransition(i22);
                                fragment3.setSharedElementNames(aVar.f4238n, aVar.f4237m);
                            }
                            switch (q1Var.f4446a) {
                                case 1:
                                    fragment3.setAnimations(q1Var.f4449d, q1Var.f4450e, q1Var.f4451f, q1Var.f4452g);
                                    z16 = true;
                                    g1Var.Y(fragment3, true);
                                    g1Var.T(fragment3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + q1Var.f4446a);
                                case 3:
                                    fragment3.setAnimations(q1Var.f4449d, q1Var.f4450e, q1Var.f4451f, q1Var.f4452g);
                                    g1Var.a(fragment3);
                                    z16 = true;
                                    break;
                                case 4:
                                    fragment3.setAnimations(q1Var.f4449d, q1Var.f4450e, q1Var.f4451f, q1Var.f4452g);
                                    g1Var.getClass();
                                    c0(fragment3);
                                    z16 = true;
                                    break;
                                case 5:
                                    fragment3.setAnimations(q1Var.f4449d, q1Var.f4450e, q1Var.f4451f, q1Var.f4452g);
                                    g1Var.Y(fragment3, true);
                                    g1Var.I(fragment3);
                                    z16 = true;
                                    break;
                                case 6:
                                    fragment3.setAnimations(q1Var.f4449d, q1Var.f4450e, q1Var.f4451f, q1Var.f4452g);
                                    g1Var.c(fragment3);
                                    z16 = true;
                                    break;
                                case 7:
                                    fragment3.setAnimations(q1Var.f4449d, q1Var.f4450e, q1Var.f4451f, q1Var.f4452g);
                                    g1Var.Y(fragment3, true);
                                    g1Var.h(fragment3);
                                    z16 = true;
                                    break;
                                case 8:
                                    g1Var.a0(null);
                                    z16 = true;
                                    break;
                                case 9:
                                    g1Var.a0(fragment3);
                                    z16 = true;
                                    break;
                                case 10:
                                    q1Var.f4454i = fragment3.mMaxState;
                                    g1Var.Z(fragment3, q1Var.f4453h);
                                    z16 = true;
                                    break;
                            }
                        }
                    } else {
                        aVar.c(1);
                        g1 g1Var2 = aVar.f4241q;
                        ArrayList arrayList6 = aVar.f4226a;
                        int size2 = arrayList6.size();
                        int i24 = 0;
                        while (i24 < size2) {
                            q1 q1Var2 = (q1) arrayList6.get(i24);
                            Fragment fragment4 = q1Var2.f4447b;
                            if (fragment4 != null) {
                                fragment4.mBeingSaved = false;
                                fragment4.setPopDirection(false);
                                fragment4.setNextTransition(aVar.f4231f);
                                fragment4.setSharedElementNames(aVar.f4237m, aVar.f4238n);
                            }
                            switch (q1Var2.f4446a) {
                                case 1:
                                    fragment4.setAnimations(q1Var2.f4449d, q1Var2.f4450e, q1Var2.f4451f, q1Var2.f4452g);
                                    g1Var2.Y(fragment4, false);
                                    g1Var2.a(fragment4);
                                    i24++;
                                    i20 = i20;
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + q1Var2.f4446a);
                                case 3:
                                    fragment4.setAnimations(q1Var2.f4449d, q1Var2.f4450e, q1Var2.f4451f, q1Var2.f4452g);
                                    g1Var2.T(fragment4);
                                    i24++;
                                    i20 = i20;
                                    break;
                                case 4:
                                    fragment4.setAnimations(q1Var2.f4449d, q1Var2.f4450e, q1Var2.f4451f, q1Var2.f4452g);
                                    g1Var2.I(fragment4);
                                    i24++;
                                    i20 = i20;
                                    break;
                                case 5:
                                    fragment4.setAnimations(q1Var2.f4449d, q1Var2.f4450e, q1Var2.f4451f, q1Var2.f4452g);
                                    g1Var2.Y(fragment4, false);
                                    c0(fragment4);
                                    i24++;
                                    i20 = i20;
                                    break;
                                case 6:
                                    fragment4.setAnimations(q1Var2.f4449d, q1Var2.f4450e, q1Var2.f4451f, q1Var2.f4452g);
                                    g1Var2.h(fragment4);
                                    i24++;
                                    i20 = i20;
                                    break;
                                case 7:
                                    fragment4.setAnimations(q1Var2.f4449d, q1Var2.f4450e, q1Var2.f4451f, q1Var2.f4452g);
                                    g1Var2.Y(fragment4, false);
                                    g1Var2.c(fragment4);
                                    i24++;
                                    i20 = i20;
                                    break;
                                case 8:
                                    g1Var2.a0(fragment4);
                                    i24++;
                                    i20 = i20;
                                    break;
                                case 9:
                                    g1Var2.a0(null);
                                    i24++;
                                    i20 = i20;
                                    break;
                                case 10:
                                    q1Var2.f4453h = fragment4.mMaxState;
                                    g1Var2.Z(fragment4, q1Var2.f4454i);
                                    i24++;
                                    i20 = i20;
                                    break;
                            }
                        }
                    }
                    i20++;
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i11 - 1)).booleanValue();
                ArrayList arrayList7 = this.f4334n;
                if (z15 && !arrayList7.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(E((a) it2.next()));
                    }
                    if (this.f4329h == null) {
                        Iterator it3 = arrayList7.iterator();
                        while (it3.hasNext()) {
                            if (it3.next() != null) {
                                throw new ClassCastException();
                            }
                            Iterator it4 = linkedHashSet.iterator();
                            if (it4.hasNext()) {
                                throw null;
                            }
                        }
                        Iterator it5 = arrayList7.iterator();
                        while (it5.hasNext()) {
                            if (it5.next() != null) {
                                throw new ClassCastException();
                            }
                            Iterator it6 = linkedHashSet.iterator();
                            if (it6.hasNext()) {
                                throw null;
                            }
                        }
                    }
                }
                for (int i25 = i16; i25 < i11; i25++) {
                    a aVar2 = (a) arrayList.get(i25);
                    if (zBooleanValue) {
                        for (int size3 = aVar2.f4226a.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment5 = ((q1) aVar2.f4226a.get(size3)).f4447b;
                            if (fragment5 != null) {
                                g(fragment5).k();
                            }
                        }
                    } else {
                        Iterator it7 = aVar2.f4226a.iterator();
                        while (it7.hasNext()) {
                            Fragment fragment6 = ((q1) it7.next()).f4447b;
                            if (fragment6 != null) {
                                g(fragment6).k();
                            }
                        }
                    }
                }
                O(this.f4342v, true);
                for (r rVar : f(arrayList, i16, i11)) {
                    rVar.f4459e = zBooleanValue;
                    rVar.l();
                    rVar.e();
                }
                while (i16 < i11) {
                    a aVar3 = (a) arrayList.get(i16);
                    if (((Boolean) arrayList2.get(i16)).booleanValue() && aVar3.f4243s >= 0) {
                        aVar3.f4243s = -1;
                    }
                    if (aVar3.f4240p != null) {
                        for (int i26 = 0; i26 < aVar3.f4240p.size(); i26++) {
                            ((Runnable) aVar3.f4240p.get(i26)).run();
                        }
                        aVar3.f4240p = null;
                    }
                    i16++;
                }
                if (!z15 || arrayList7.size() <= 0) {
                    return;
                }
                arrayList7.get(0).getClass();
                throw new ClassCastException();
            }
            a aVar4 = (a) arrayList.get(i17);
            if (((Boolean) arrayList2.get(i17)).booleanValue()) {
                z10 = z12;
                i12 = i17;
                z11 = z13;
                int i27 = 1;
                ArrayList arrayList8 = this.N;
                ArrayList arrayList9 = aVar4.f4226a;
                int size4 = arrayList9.size() - 1;
                while (size4 >= 0) {
                    q1 q1Var3 = (q1) arrayList9.get(size4);
                    int i28 = q1Var3.f4446a;
                    if (i28 != i27) {
                        if (i28 != 3) {
                            switch (i28) {
                                case 6:
                                    arrayList8.add(q1Var3.f4447b);
                                    break;
                                case 8:
                                    fragment = null;
                                    break;
                                case 9:
                                    fragment = q1Var3.f4447b;
                                    break;
                                case 10:
                                    q1Var3.f4454i = q1Var3.f4453h;
                                    break;
                            }
                        } else {
                            arrayList8.add(q1Var3.f4447b);
                        }
                        size4--;
                        i27 = 1;
                    }
                    arrayList8.remove(q1Var3.f4447b);
                    size4--;
                    i27 = 1;
                }
            } else {
                ArrayList arrayList10 = this.N;
                ArrayList arrayList11 = aVar4.f4226a;
                int i29 = 0;
                while (i29 < arrayList11.size()) {
                    q1 q1Var4 = (q1) arrayList11.get(i29);
                    boolean z17 = z12;
                    int i30 = q1Var4.f4446a;
                    if (i30 != i18) {
                        i13 = i17;
                        if (i30 != 2) {
                            if (i30 == 3 || i30 == 6) {
                                arrayList10.remove(q1Var4.f4447b);
                                Fragment fragment7 = q1Var4.f4447b;
                                if (fragment7 == fragment) {
                                    arrayList11.add(i29, new q1(fragment7, 9));
                                    i29++;
                                    fragment = null;
                                }
                                i14 = 1;
                            } else if (i30 == 7) {
                                i14 = 1;
                            } else if (i30 == 8) {
                                arrayList11.add(i29, new q1(9, fragment, 0));
                                q1Var4.f4448c = true;
                                i29++;
                                fragment = q1Var4.f4447b;
                            }
                            i14 = 1;
                        } else {
                            Fragment fragment8 = q1Var4.f4447b;
                            int i31 = fragment8.mContainerId;
                            int size5 = arrayList10.size() - 1;
                            boolean z18 = false;
                            while (size5 >= 0) {
                                int i32 = size5;
                                Fragment fragment9 = (Fragment) arrayList10.get(size5);
                                boolean z19 = z13;
                                if (fragment9.mContainerId != i31) {
                                    i31 = i31;
                                } else if (fragment9 == fragment8) {
                                    i31 = i31;
                                    z18 = true;
                                } else {
                                    if (fragment9 == fragment) {
                                        i15 = 0;
                                        arrayList11.add(i29, new q1(9, fragment9, 0));
                                        i29++;
                                        fragment = null;
                                    } else {
                                        i15 = 0;
                                    }
                                    q1 q1Var5 = new q1(3, fragment9, i15);
                                    q1Var5.f4449d = q1Var4.f4449d;
                                    q1Var5.f4451f = q1Var4.f4451f;
                                    q1Var5.f4450e = q1Var4.f4450e;
                                    q1Var5.f4452g = q1Var4.f4452g;
                                    arrayList11.add(i29, q1Var5);
                                    arrayList10.remove(fragment9);
                                    i29++;
                                    fragment = fragment;
                                }
                                size5 = i32 - 1;
                                i31 = i31;
                                z13 = z19;
                            }
                            z13 = z13;
                            i14 = 1;
                            if (z18) {
                                arrayList11.remove(i29);
                                i29--;
                            } else {
                                q1Var4.f4446a = 1;
                                q1Var4.f4448c = true;
                                arrayList10.add(fragment8);
                            }
                        }
                        i29 += i14;
                        i18 = i14;
                        z12 = z17;
                        i17 = i13;
                        z13 = z13;
                    } else {
                        i13 = i17;
                        i14 = i18;
                    }
                    z13 = z13;
                    arrayList10.add(q1Var4.f4447b);
                    i29 += i14;
                    i18 = i14;
                    z12 = z17;
                    i17 = i13;
                    z13 = z13;
                }
                z10 = z12;
                i12 = i17;
                z11 = z13;
            }
            z13 = z11 || aVar4.f4232g;
            i17 = i12 + 1;
            z12 = z10;
        }
    }

    public final Fragment B(int i10) {
        p1 p1Var = this.f4324c;
        ArrayList arrayList = p1Var.f4435a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i10) {
                return fragment;
            }
        }
        for (o1 o1Var : p1Var.f4436b.values()) {
            if (o1Var != null) {
                Fragment fragment2 = o1Var.f4414c;
                if (fragment2.mFragmentId == i10) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final Fragment C(String str) {
        p1 p1Var = this.f4324c;
        ArrayList arrayList = p1Var.f4435a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && str.equals(fragment.mTag)) {
                return fragment;
            }
        }
        for (o1 o1Var : p1Var.f4436b.values()) {
            if (o1Var != null) {
                Fragment fragment2 = o1Var.f4414c;
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final void D() {
        for (r rVar : e()) {
            if (rVar.f4460f) {
                if (J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                rVar.f4460f = false;
                rVar.e();
            }
        }
    }

    public final ViewGroup F(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId <= 0 || !this.f4344x.c()) {
            return null;
        }
        View viewB = this.f4344x.b(fragment.mContainerId);
        if (viewB instanceof ViewGroup) {
            return (ViewGroup) viewB;
        }
        return null;
    }

    public final y0 G() {
        Fragment fragment = this.f4345y;
        return fragment != null ? fragment.mFragmentManager.G() : this.A;
    }

    public final rc.d H() {
        Fragment fragment = this.f4345y;
        return fragment != null ? fragment.mFragmentManager.H() : this.B;
    }

    public final void I(Fragment fragment) {
        if (J(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        b0(fragment);
    }

    public final boolean L() {
        Fragment fragment = this.f4345y;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f4345y.getParentFragmentManager().L();
    }

    public final boolean N() {
        return this.H || this.I;
    }

    public final void O(int i10, boolean z10) {
        q0 q0Var;
        if (this.f4343w == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f4342v) {
            this.f4342v = i10;
            p1 p1Var = this.f4324c;
            HashMap map = p1Var.f4436b;
            Iterator it = p1Var.f4435a.iterator();
            while (it.hasNext()) {
                o1 o1Var = (o1) map.get(((Fragment) it.next()).mWho);
                if (o1Var != null) {
                    o1Var.k();
                }
            }
            for (o1 o1Var2 : map.values()) {
                if (o1Var2 != null) {
                    o1Var2.k();
                    Fragment fragment = o1Var2.f4414c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !p1Var.f4437c.containsKey(fragment.mWho)) {
                            p1Var.i(o1Var2.n(), fragment.mWho);
                        }
                        p1Var.h(o1Var2);
                    }
                }
            }
            d0();
            if (this.G && (q0Var = this.f4343w) != null && this.f4342v == 7) {
                ((l0) q0Var).f4380e.invalidateMenu();
                this.G = false;
            }
        }
    }

    public final void P() {
        if (this.f4343w == null) {
            return;
        }
        this.H = false;
        this.I = false;
        this.O.f4378i = false;
        for (Fragment fragment : this.f4324c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final boolean Q() {
        return R(-1, 0);
    }

    public final boolean R(int i10, int i11) {
        z(false);
        y(true);
        Fragment fragment = this.f4346z;
        if (fragment != null && i10 < 0 && fragment.getChildFragmentManager().Q()) {
            return true;
        }
        boolean zS = S(this.L, this.M, i10, i11);
        if (zS) {
            this.f4323b = true;
            try {
                U(this.L, this.M);
                d();
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
        f0();
        if (this.K) {
            this.K = false;
            d0();
        }
        this.f4324c.f4436b.values().removeAll(Collections.singleton(null));
        return zS;
    }

    public final boolean S(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        boolean z10 = (i11 & 1) != 0;
        int size = -1;
        if (!this.f4325d.isEmpty()) {
            if (i10 < 0) {
                size = z10 ? 0 : this.f4325d.size() - 1;
            } else {
                int size2 = this.f4325d.size() - 1;
                while (size2 >= 0) {
                    a aVar = (a) this.f4325d.get(size2);
                    if (i10 >= 0 && i10 == aVar.f4243s) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z10) {
                    size = size2;
                    while (size > 0) {
                        a aVar2 = (a) this.f4325d.get(size - 1);
                        if (i10 < 0 || i10 != aVar2.f4243s) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f4325d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f4325d.size() - 1; size3 >= size; size3--) {
            arrayList.add((a) this.f4325d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void T(Fragment fragment) {
        if (J(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        p1 p1Var = this.f4324c;
        synchronized (p1Var.f4435a) {
            p1Var.f4435a.remove(fragment);
        }
        fragment.mAdded = false;
        if (K(fragment)) {
            this.G = true;
        }
        fragment.mRemoving = true;
        b0(fragment);
    }

    public final void U(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!((a) arrayList.get(i10)).f4239o) {
                if (i11 != i10) {
                    A(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                    while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((a) arrayList.get(i11)).f4239o) {
                        i11++;
                    }
                }
                A(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            A(arrayList, arrayList2, i11, size);
        }
    }

    public final void V(Bundle bundle) {
        m0 m0Var;
        int i10;
        boolean z10;
        int i11;
        o1 o1Var;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f4343w.f4443b.getClassLoader());
                this.f4333m.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f4343w.f4443b.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        p1 p1Var = this.f4324c;
        HashMap map2 = p1Var.f4437c;
        HashMap map3 = p1Var.f4436b;
        map2.clear();
        map2.putAll(map);
        i1 i1Var = (i1) bundle.getParcelable("state");
        if (i1Var == null) {
            return;
        }
        map3.clear();
        Iterator it = i1Var.f4357a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            m0Var = this.f4335o;
            i10 = 2;
            if (!zHasNext) {
                break;
            }
            Bundle bundleI = p1Var.i(null, (String) it.next());
            if (bundleI != null) {
                Fragment fragment = (Fragment) this.O.f4373d.get(((m1) bundleI.getParcelable("state")).f4387b);
                if (fragment != null) {
                    if (J(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    o1Var = new o1(m0Var, p1Var, fragment, bundleI);
                } else {
                    o1Var = new o1(this.f4335o, this.f4324c, this.f4343w.f4443b.getClassLoader(), G(), bundleI);
                }
                Fragment fragment2 = o1Var.f4414c;
                fragment2.mSavedFragmentState = bundleI;
                fragment2.mFragmentManager = this;
                if (J(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragment2.mWho + "): " + fragment2);
                }
                o1Var.l(this.f4343w.f4443b.getClassLoader());
                p1Var.g(o1Var);
                o1Var.f4416e = this.f4342v;
            }
        }
        k1 k1Var = this.O;
        k1Var.getClass();
        Iterator it2 = new ArrayList(k1Var.f4373d.values()).iterator();
        while (true) {
            z10 = true;
            if (!it2.hasNext()) {
                break;
            }
            Fragment fragment3 = (Fragment) it2.next();
            if (map3.get(fragment3.mWho) == null) {
                if (J(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + i1Var.f4357a);
                }
                this.O.g(fragment3);
                fragment3.mFragmentManager = this;
                o1 o1Var2 = new o1(m0Var, p1Var, fragment3);
                o1Var2.f4416e = 1;
                o1Var2.k();
                fragment3.mRemoving = true;
                o1Var2.k();
            }
        }
        ArrayList<String> arrayList = i1Var.f4358b;
        p1Var.f4435a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment fragmentB = p1Var.b(str3);
                if (fragmentB == null) {
                    throw new IllegalStateException(defpackage.e.o("No instantiated fragment for (", str3, ")"));
                }
                if (J(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + fragmentB);
                }
                p1Var.a(fragmentB);
            }
        }
        if (i1Var.f4359c != null) {
            this.f4325d = new ArrayList(i1Var.f4359c.length);
            int i12 = 0;
            while (true) {
                b[] bVarArr = i1Var.f4359c;
                if (i12 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i12];
                ArrayList arrayList2 = bVar.f4250b;
                a aVar = new a(this);
                int[] iArr = bVar.f4249a;
                int i13 = 0;
                int i14 = 0;
                while (i13 < iArr.length) {
                    q1 q1Var = new q1();
                    int i15 = i13 + 1;
                    int i16 = i10;
                    q1Var.f4446a = iArr[i13];
                    if (J(i16)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i14 + " base fragment #" + iArr[i15]);
                    }
                    q1Var.f4453h = androidx.lifecycle.n.values()[bVar.f4251c[i14]];
                    q1Var.f4454i = androidx.lifecycle.n.values()[bVar.f4252d[i14]];
                    int i17 = i13 + 2;
                    q1Var.f4448c = iArr[i15] != 0 ? z10 : false;
                    int i18 = iArr[i17];
                    q1Var.f4449d = i18;
                    int i19 = iArr[i13 + 3];
                    q1Var.f4450e = i19;
                    int i20 = i13 + 5;
                    int i21 = iArr[i13 + 4];
                    q1Var.f4451f = i21;
                    i13 += 6;
                    int[] iArr2 = iArr;
                    int i22 = iArr2[i20];
                    q1Var.f4452g = i22;
                    aVar.f4227b = i18;
                    aVar.f4228c = i19;
                    aVar.f4229d = i21;
                    aVar.f4230e = i22;
                    aVar.b(q1Var);
                    i14++;
                    i10 = i16;
                    iArr = iArr2;
                    z10 = true;
                }
                int i23 = i10;
                aVar.f4231f = bVar.f4253e;
                aVar.f4233h = bVar.f4254f;
                aVar.f4232g = true;
                aVar.f4234i = bVar.f4256h;
                aVar.f4235j = bVar.f4257i;
                aVar.f4236k = bVar.f4258j;
                aVar.l = bVar.f4259k;
                aVar.f4237m = bVar.l;
                aVar.f4238n = bVar.f4260m;
                aVar.f4239o = bVar.f4261n;
                aVar.f4243s = bVar.f4255g;
                for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                    String str4 = (String) arrayList2.get(i24);
                    if (str4 != null) {
                        ((q1) aVar.f4226a.get(i24)).f4447b = p1Var.b(str4);
                    }
                }
                aVar.c(1);
                if (J(i23)) {
                    StringBuilder sbU = defpackage.e.u(i12, "restoreAllState: back stack #", " (index ");
                    sbU.append(aVar.f4243s);
                    sbU.append("): ");
                    sbU.append(aVar);
                    Log.v("FragmentManager", sbU.toString());
                    PrintWriter printWriter = new PrintWriter(new ae.t());
                    aVar.h("  ", printWriter, false);
                    printWriter.close();
                }
                this.f4325d.add(aVar);
                i12++;
                i10 = i23;
                z10 = true;
            }
            i11 = 0;
        } else {
            i11 = 0;
            this.f4325d = new ArrayList();
        }
        this.f4332k.set(i1Var.f4360d);
        String str5 = i1Var.f4361e;
        if (str5 != null) {
            Fragment fragmentB2 = p1Var.b(str5);
            this.f4346z = fragmentB2;
            r(fragmentB2);
        }
        ArrayList arrayList3 = i1Var.f4362f;
        if (arrayList3 != null) {
            for (int i25 = i11; i25 < arrayList3.size(); i25++) {
                this.l.put((String) arrayList3.get(i25), (c) i1Var.f4363g.get(i25));
            }
        }
        this.F = new ArrayDeque(i1Var.f4364h);
    }

    public final Bundle W() {
        ArrayList arrayList;
        b[] bVarArr;
        Bundle bundle = new Bundle();
        D();
        w();
        z(true);
        this.H = true;
        this.O.f4378i = true;
        p1 p1Var = this.f4324c;
        p1Var.getClass();
        HashMap map = p1Var.f4436b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (o1 o1Var : map.values()) {
            if (o1Var != null) {
                Fragment fragment = o1Var.f4414c;
                p1Var.i(o1Var.n(), fragment.mWho);
                arrayList2.add(fragment.mWho);
                if (J(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        HashMap map2 = this.f4324c.f4437c;
        if (!map2.isEmpty()) {
            p1 p1Var2 = this.f4324c;
            synchronized (p1Var2.f4435a) {
                try {
                    if (p1Var2.f4435a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(p1Var2.f4435a.size());
                        for (Fragment fragment2 : p1Var2.f4435a) {
                            arrayList.add(fragment2.mWho);
                            if (J(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment2.mWho + "): " + fragment2);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int size = this.f4325d.size();
            if (size > 0) {
                bVarArr = new b[size];
                for (int i10 = 0; i10 < size; i10++) {
                    bVarArr[i10] = new b((a) this.f4325d.get(i10));
                    if (J(2)) {
                        StringBuilder sbU = defpackage.e.u(i10, "saveAllState: adding back stack #", ": ");
                        sbU.append(this.f4325d.get(i10));
                        Log.v("FragmentManager", sbU.toString());
                    }
                }
            } else {
                bVarArr = null;
            }
            i1 i1Var = new i1();
            i1Var.f4361e = null;
            ArrayList arrayList3 = new ArrayList();
            i1Var.f4362f = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            i1Var.f4363g = arrayList4;
            i1Var.f4357a = arrayList2;
            i1Var.f4358b = arrayList;
            i1Var.f4359c = bVarArr;
            i1Var.f4360d = this.f4332k.get();
            Fragment fragment3 = this.f4346z;
            if (fragment3 != null) {
                i1Var.f4361e = fragment3.mWho;
            }
            arrayList3.addAll(this.l.keySet());
            arrayList4.addAll(this.l.values());
            i1Var.f4364h = new ArrayList(this.F);
            bundle.putParcelable("state", i1Var);
            for (String str : this.f4333m.keySet()) {
                bundle.putBundle(defpackage.e.n("result_", str), (Bundle) this.f4333m.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(defpackage.e.n("fragment_", str2), (Bundle) map2.get(str2));
            }
        } else if (J(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void X() {
        synchronized (this.f4322a) {
            try {
                if (this.f4322a.size() == 1) {
                    this.f4343w.f4444c.removeCallbacks(this.P);
                    this.f4343w.f4444c.post(this.P);
                    f0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void Y(Fragment fragment, boolean z10) {
        ViewGroup viewGroupF = F(fragment);
        if (viewGroupF == null || !(viewGroupF instanceof p0)) {
            return;
        }
        ((p0) viewGroupF).setDrawDisappearingViewsLast(!z10);
    }

    public final void Z(Fragment fragment, androidx.lifecycle.n nVar) {
        if (fragment.equals(this.f4324c.b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = nVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final o1 a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            c1.c.c(fragment, str);
        }
        if (J(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        o1 o1VarG = g(fragment);
        fragment.mFragmentManager = this;
        p1 p1Var = this.f4324c;
        p1Var.g(o1VarG);
        if (!fragment.mDetached) {
            p1Var.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (K(fragment)) {
                this.G = true;
            }
        }
        return o1VarG;
    }

    public final void a0(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.f4324c.b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
            }
        }
        Fragment fragment2 = this.f4346z;
        this.f4346z = fragment;
        r(fragment2);
        r(this.f4346z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(q0 q0Var, o0 o0Var, Fragment fragment) {
        String strQ;
        androidx.lifecycle.v vVar;
        if (this.f4343w != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f4343w = q0Var;
        this.f4344x = o0Var;
        this.f4345y = fragment;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4336p;
        if (fragment != null) {
            copyOnWriteArrayList.add(new z0(fragment));
        } else if (q0Var instanceof l1) {
            copyOnWriteArrayList.add((l1) q0Var);
        }
        if (this.f4345y != null) {
            f0();
        }
        if (q0Var instanceof f.v) {
            f.v vVar2 = (f.v) q0Var;
            f.t onBackPressedDispatcher = vVar2.getOnBackPressedDispatcher();
            this.f4328g = onBackPressedDispatcher;
            if (fragment != null) {
                vVar = vVar2;
                vVar = fragment;
            }
            vVar = vVar2;
            onBackPressedDispatcher.a(vVar, this.f4331j);
        }
        if (fragment != null) {
            k1 k1Var = fragment.mFragmentManager.O;
            HashMap map = k1Var.f4374e;
            k1 k1Var2 = (k1) map.get(fragment.mWho);
            if (k1Var2 == null) {
                k1Var2 = new k1(k1Var.f4376g);
                map.put(fragment.mWho, k1Var2);
            }
            this.O = k1Var2;
        } else if (q0Var instanceof androidx.lifecycle.d1) {
            this.O = (k1) new g9.k(((androidx.lifecycle.d1) q0Var).getViewModelStore(), k1.f4372j).n(k1.class);
        } else {
            this.O = new k1(false);
        }
        this.O.f4378i = N();
        this.f4324c.f4438d = this.O;
        Object obj = this.f4343w;
        if ((obj instanceof j4.g) && fragment == null) {
            j4.e savedStateRegistry = ((j4.g) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new i0(this, 1));
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                V(bundleA);
            }
        }
        Object obj2 = this.f4343w;
        if (obj2 instanceof h.i) {
            h.h activityResultRegistry = ((h.i) obj2).getActivityResultRegistry();
            if (fragment != null) {
                strQ = defpackage.e.q(fragment.mWho, ":", new StringBuilder());
            } else {
                strQ = "";
            }
            String strN = defpackage.e.n("FragmentManager:", strQ);
            this.C = activityResultRegistry.d(wi.d.h(strN, "StartActivityForResult"), new a1(3), new v0(this, 1));
            this.D = activityResultRegistry.d(wi.d.h(strN, "StartIntentSenderForResult"), new a1(0), new v0(this, 2));
            this.E = activityResultRegistry.d(wi.d.h(strN, "RequestPermissions"), new a1(2), new v0(this, 0));
        }
        Object obj3 = this.f4343w;
        if (obj3 instanceof c0.d) {
            ((c0.d) obj3).addOnConfigurationChangedListener(this.f4337q);
        }
        Object obj4 = this.f4343w;
        if (obj4 instanceof c0.e) {
            ((c0.e) obj4).addOnTrimMemoryListener(this.f4338r);
        }
        Object obj5 = this.f4343w;
        if (obj5 instanceof b0.m0) {
            ((b0.m0) obj5).addOnMultiWindowModeChangedListener(this.f4339s);
        }
        Object obj6 = this.f4343w;
        if (obj6 instanceof b0.n0) {
            ((b0.n0) obj6).addOnPictureInPictureModeChangedListener(this.f4340t);
        }
        Object obj7 = this.f4343w;
        if ((obj7 instanceof m0.n) && fragment == null) {
            ((m0.n) obj7).addMenuProvider(this.f4341u);
        }
    }

    public final void b0(Fragment fragment) {
        ViewGroup viewGroupF = F(fragment);
        if (viewGroupF != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (viewGroupF.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupF.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) viewGroupF.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final void c(Fragment fragment) {
        if (J(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f4324c.a(fragment);
            if (J(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (K(fragment)) {
                this.G = true;
            }
        }
    }

    public final void d() {
        this.f4323b = false;
        this.M.clear();
        this.L.clear();
    }

    public final void d0() {
        for (o1 o1Var : this.f4324c.d()) {
            Fragment fragment = o1Var.f4414c;
            if (fragment.mDeferStart) {
                if (this.f4323b) {
                    this.K = true;
                } else {
                    fragment.mDeferStart = false;
                    o1Var.k();
                }
            }
        }
    }

    public final HashSet e() {
        r rVar;
        HashSet hashSet = new HashSet();
        Iterator it = this.f4324c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((o1) it.next()).f4414c.mContainer;
            if (viewGroup != null) {
                rc.d factory = H();
                kotlin.jvm.internal.n.f(factory, "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof r) {
                    rVar = (r) tag;
                } else {
                    rVar = new r(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, rVar);
                }
                hashSet.add(rVar);
            }
        }
        return hashSet;
    }

    public final void e0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new ae.t());
        q0 q0Var = this.f4343w;
        if (q0Var == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw illegalStateException;
            }
        }
        try {
            ((l0) q0Var).f4380e.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw illegalStateException;
        }
    }

    public final HashSet f(ArrayList arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator it = ((a) arrayList.get(i10)).f4226a.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((q1) it.next()).f4447b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(r.j(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    public final void f0() {
        synchronized (this.f4322a) {
            try {
                if (!this.f4322a.isEmpty()) {
                    this.f4331j.e(true);
                    if (J(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z10 = this.f4325d.size() + (this.f4329h != null ? 1 : 0) > 0 && M(this.f4345y);
                if (J(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z10);
                }
                this.f4331j.e(z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final o1 g(Fragment fragment) {
        String str = fragment.mWho;
        p1 p1Var = this.f4324c;
        o1 o1Var = (o1) p1Var.f4436b.get(str);
        if (o1Var != null) {
            return o1Var;
        }
        o1 o1Var2 = new o1(this.f4335o, p1Var, fragment);
        o1Var2.l(this.f4343w.f4443b.getClassLoader());
        o1Var2.f4416e = this.f4342v;
        return o1Var2;
    }

    public final void h(Fragment fragment) {
        if (J(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (J(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            p1 p1Var = this.f4324c;
            synchronized (p1Var.f4435a) {
                p1Var.f4435a.remove(fragment);
            }
            fragment.mAdded = false;
            if (K(fragment)) {
                this.G = true;
            }
            b0(fragment);
        }
    }

    public final void i(boolean z10, Configuration configuration) {
        if (z10 && (this.f4343w instanceof c0.d)) {
            e0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f4324c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z10) {
                    fragment.mChildFragmentManager.i(true, configuration);
                }
            }
        }
    }

    public final boolean j(MenuItem menuItem) {
        if (this.f4342v < 1) {
            return false;
        }
        for (Fragment fragment : this.f4324c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(Menu menu, MenuInflater menuInflater) {
        if (this.f4342v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f4324c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f4326e != null) {
            for (int i10 = 0; i10 < this.f4326e.size(); i10++) {
                Fragment fragment2 = (Fragment) this.f4326e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f4326e = arrayList;
        return z10;
    }

    public final void l() {
        boolean z10;
        boolean zIsTerminated;
        this.J = true;
        z(true);
        w();
        q0 q0Var = this.f4343w;
        boolean z11 = q0Var instanceof androidx.lifecycle.d1;
        p1 p1Var = this.f4324c;
        if (z11) {
            z10 = p1Var.f4438d.f4377h;
        } else {
            FragmentActivity fragmentActivity = q0Var.f4443b;
            z10 = fragmentActivity != null ? !fragmentActivity.isChangingConfigurations() : true;
        }
        if (z10) {
            Iterator it = this.l.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((c) it.next()).f4265a.iterator();
                while (it2.hasNext()) {
                    p1Var.f4438d.e((String) it2.next(), false);
                }
            }
        }
        u(-1);
        Object obj = this.f4343w;
        if (obj instanceof c0.e) {
            ((c0.e) obj).removeOnTrimMemoryListener(this.f4338r);
        }
        Object obj2 = this.f4343w;
        if (obj2 instanceof c0.d) {
            ((c0.d) obj2).removeOnConfigurationChangedListener(this.f4337q);
        }
        Object obj3 = this.f4343w;
        if (obj3 instanceof b0.m0) {
            ((b0.m0) obj3).removeOnMultiWindowModeChangedListener(this.f4339s);
        }
        Object obj4 = this.f4343w;
        if (obj4 instanceof b0.n0) {
            ((b0.n0) obj4).removeOnPictureInPictureModeChangedListener(this.f4340t);
        }
        Object obj5 = this.f4343w;
        if ((obj5 instanceof m0.n) && this.f4345y == null) {
            ((m0.n) obj5).removeMenuProvider(this.f4341u);
        }
        this.f4343w = null;
        this.f4344x = null;
        this.f4345y = null;
        if (this.f4328g != null) {
            w0 w0Var = this.f4331j;
            ArrayList arrayList = w0Var.f40241a;
            CopyOnWriteArrayList copyOnWriteArrayList = w0Var.f40243c;
            Iterator it3 = copyOnWriteArrayList.iterator();
            kotlin.jvm.internal.n.e(it3, "iterator(...)");
            while (it3.hasNext()) {
                AutoCloseable autoCloseable = (AutoCloseable) it3.next();
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z12 = false;
                        while (!zIsTerminated) {
                            try {
                                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z12) {
                                    executorService.shutdownNow();
                                    z12 = true;
                                }
                            }
                        }
                        if (z12) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else {
                    if (!(autoCloseable instanceof TypedArray)) {
                        throw new IllegalArgumentException();
                    }
                    ((TypedArray) autoCloseable).recycle();
                }
            }
            copyOnWriteArrayList.clear();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                ((f.n) it4.next()).a();
            }
            arrayList.clear();
            this.f4328g = null;
        }
        h.g gVar = this.C;
        if (gVar != null) {
            gVar.b();
            this.D.b();
            this.E.b();
        }
    }

    public final void m(boolean z10) {
        if (z10 && (this.f4343w instanceof c0.e)) {
            e0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f4324c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z10) {
                    fragment.mChildFragmentManager.m(true);
                }
            }
        }
    }

    public final void n(boolean z10, boolean z11) {
        if (z11 && (this.f4343w instanceof b0.m0)) {
            e0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f4324c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.n(z10, true);
                }
            }
        }
    }

    public final void o() {
        for (Fragment fragment : this.f4324c.e()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.o();
            }
        }
    }

    public final boolean p(MenuItem menuItem) {
        if (this.f4342v < 1) {
            return false;
        }
        for (Fragment fragment : this.f4324c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void q(Menu menu) {
        if (this.f4342v < 1) {
            return;
        }
        for (Fragment fragment : this.f4324c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void r(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.f4324c.b(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void s(boolean z10, boolean z11) {
        if (z11 && (this.f4343w instanceof b0.n0)) {
            e0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f4324c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.s(z10, true);
                }
            }
        }
    }

    public final boolean t(Menu menu) {
        boolean z10 = false;
        if (this.f4342v < 1) {
            return false;
        }
        for (Fragment fragment : this.f4324c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f4345y;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f4345y)));
            sb2.append("}");
        } else {
            q0 q0Var = this.f4343w;
            if (q0Var != null) {
                sb2.append(q0Var.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f4343w)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u(int i10) {
        try {
            this.f4323b = true;
            for (o1 o1Var : this.f4324c.f4436b.values()) {
                if (o1Var != null) {
                    o1Var.f4416e = i10;
                }
            }
            O(i10, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((r) it.next()).i();
            }
            this.f4323b = false;
            z(true);
        } catch (Throwable th2) {
            this.f4323b = false;
            throw th2;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strH = wi.d.h(str, "    ");
        p1 p1Var = this.f4324c;
        ArrayList arrayList = p1Var.f4435a;
        String strH2 = wi.d.h(str, "    ");
        HashMap map = p1Var.f4436b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (o1 o1Var : map.values()) {
                printWriter.print(str);
                if (o1Var != null) {
                    Fragment fragment = o1Var.f4414c;
                    printWriter.println(fragment);
                    fragment.dump(strH2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size2; i10++) {
                Fragment fragment2 = (Fragment) arrayList.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList arrayList2 = this.f4326e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size; i11++) {
                Fragment fragment3 = (Fragment) this.f4326e.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        int size3 = this.f4325d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size3; i12++) {
                a aVar = (a) this.f4325d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.h(strH, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f4332k.get());
        synchronized (this.f4322a) {
            try {
                int size4 = this.f4322a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i13 = 0; i13 < size4; i13++) {
                        Object obj = (d1) this.f4322a.get(i13);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i13);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f4343w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f4344x);
        if (this.f4345y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f4345y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f4342v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final void w() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((r) it.next()).i();
        }
    }

    public final void x(d1 d1Var, boolean z10) {
        if (!z10) {
            if (this.f4343w == null) {
                if (!this.J) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (N()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f4322a) {
            try {
                if (this.f4343w == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f4322a.add(d1Var);
                    X();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void y(boolean z10) {
        if (this.f4323b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f4343w == null) {
            if (!this.J) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f4343w.f4444c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10 && N()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.L == null) {
            this.L = new ArrayList();
            this.M = new ArrayList();
        }
    }

    public final boolean z(boolean z10) {
        boolean zA;
        a aVar;
        y(z10);
        if (!this.f4330i && (aVar = this.f4329h) != null) {
            aVar.f4242r = false;
            aVar.d();
            if (J(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f4329h + " as part of execPendingActions for actions " + this.f4322a);
            }
            this.f4329h.f(false, false);
            this.f4322a.add(0, this.f4329h);
            Iterator it = this.f4329h.f4226a.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((q1) it.next()).f4447b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.f4329h = null;
        }
        boolean z11 = false;
        while (true) {
            ArrayList arrayList = this.L;
            ArrayList arrayList2 = this.M;
            synchronized (this.f4322a) {
                if (this.f4322a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f4322a.size();
                        zA = false;
                        for (int i10 = 0; i10 < size; i10++) {
                            zA |= ((d1) this.f4322a.get(i10)).a(arrayList, arrayList2);
                        }
                        this.f4322a.clear();
                        this.f4343w.f4444c.removeCallbacks(this.P);
                    } catch (Throwable th2) {
                        this.f4322a.clear();
                        this.f4343w.f4444c.removeCallbacks(this.P);
                        throw th2;
                    }
                }
            }
            if (!zA) {
                break;
            }
            z11 = true;
            this.f4323b = true;
            try {
                U(this.L, this.M);
                d();
            } catch (Throwable th3) {
                d();
                throw th3;
            }
        }
        f0();
        if (this.K) {
            this.K = false;
            d0();
        }
        this.f4324c.f4436b.values().removeAll(Collections.singleton(null));
        return z11;
    }
}

package com.smartdigimkt.w5;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.smartdigimkt.n8.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected static final String f39399i = "key_has_endcard_improve";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ViewGroup f39401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    com.smartdigimkt.w6.f f39402c;
    com.smartdigimkt.v6.a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f39403e;
    private List<c> f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f39404h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f39400a = getClass().getSimpleName();
    private Map<String, Object> g = new HashMap();

    /* JADX INFO: renamed from: com.smartdigimkt.w5.a$a, reason: collision with other inner class name */
    public class RunnableC0635a implements Runnable {
        final /* synthetic */ k X;

        public RunnableC0635a(k kVar) {
            this.X = kVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup.LayoutParams layoutParamsD = a.this.d();
            if (this.X == null || a.this.d() == null) {
                return;
            }
            this.X.a(layoutParamsD);
        }
    }

    public class b implements Runnable {
        final /* synthetic */ int X;

        public b(int i2) {
            this.X = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b(this.X);
        }
    }

    public a(ViewGroup viewGroup, com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, int i2, c.a aVar2) {
        this.f39404h = false;
        this.f39401b = viewGroup;
        this.f39402c = fVar;
        this.d = aVar;
        this.f39403e = i2;
        this.f = g.a(e(), this.f39401b.getContext(), fVar, aVar, viewGroup, this.f39403e, aVar2);
        this.f39404h = c(this.f39403e);
        k kVarB = b();
        if (kVarB != null) {
            viewGroup.post(new RunnableC0635a(kVarB));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i2) {
        List<c> list = this.f;
        if (list == null || list.size() <= 0) {
            return;
        }
        if (!com.smartdigimkt.l7.b.a().f()) {
            com.smartdigimkt.l7.b.a().e(new b(i2));
            return;
        }
        HashMap map = new HashMap();
        Map<String, Object> map2 = this.g;
        if (map2 != null) {
            map.putAll(map2);
        }
        map.put(f39399i, Boolean.valueOf(this.f39404h));
        Iterator<c> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().a(i2, map);
        }
    }

    private boolean c(int i2) {
        if (i2 == 2) {
            return this.d.t.V() == 5;
        }
        if (i2 != 1) {
            return false;
        }
        int iV = this.d.t.V();
        if (iV != 2 && iV != 3 && iV != 4) {
            return iV == 5;
        }
        boolean zB = com.smartdigimkt.m3.i.b(this.f39402c, this.d);
        boolean zD = !zB;
        if (this.d.t.V() == 4 && !zB) {
            if (TextUtils.isEmpty(this.d.t.H0())) {
                zD = false;
            } else {
                zD = com.smartdigimkt.d7.d.c().e(3, l.b(this.d.t.H0()));
                this.d.t.H0();
            }
        }
        if (zD) {
            if (this.d.t.V() == 3) {
                zD = com.smartdigimkt.j5.a.a().d("ec_rp_top");
            }
            if (this.d.t.V() == 2) {
                zD = com.smartdigimkt.j5.a.a().d("g2c_finger_icon");
            }
            if (this.d.t.V() == 4) {
                zD = com.smartdigimkt.j5.a.a().d("ec_sec_poster");
            }
        }
        if (zD && TextUtils.equals(String.valueOf(this.d.f39164b), "1") && TextUtils.isEmpty(this.f39402c.k0())) {
            if (this.d.t.X0() == 1) {
                zD = false;
            }
            if (this.d.t.W0() == 1) {
                return false;
            }
        }
        return zD;
    }

    private int e() {
        int i2 = 0;
        if (!this.f39402c.w0()) {
            int i3 = this.f39403e;
            if (i3 != 100) {
                switch (i3) {
                    case 1:
                    case 2:
                        if (c(i3)) {
                            i2 = 16;
                        }
                        break;
                }
                if (k()) {
                    i2 |= 4;
                }
                int i4 = this.f39403e;
                if ((i4 == 1 || i4 == 2 || i4 == 3 || i4 == 5 || i4 == 6) && j()) {
                    i2 |= 1;
                }
                int i5 = this.f39403e;
                if ((i5 == 1 || i5 == 3) && h()) {
                    i2 |= 2;
                }
                if (g()) {
                    i2 |= 8;
                }
                if (this.d.f39164b == 1 && i()) {
                    i2 |= 32;
                }
                return f() ? i2 | 64 : i2;
            }
            if (com.smartdigimkt.m3.i.a(this.d)) {
                return 1;
            }
        }
        return 0;
    }

    private boolean f() {
        if (this.d.t.f() != 1) {
            com.smartdigimkt.v6.a aVar = this.d;
            int i2 = aVar.f39164b;
            if (i2 != 3) {
                if (i2 == 4 && aVar.t.f() == 2 && !com.smartdigimkt.m3.i.a(this.d)) {
                    return !(TextUtils.isEmpty(this.f39402c.k()) && TextUtils.isEmpty(this.f39402c.q())) && com.smartdigimkt.j5.a.a().d("am_bubble");
                }
                return false;
            }
            if (aVar.t.f() == 2) {
                if (com.smartdigimkt.m3.i.a(this.d)) {
                    return false;
                }
                return !(TextUtils.isEmpty(this.f39402c.k()) && TextUtils.isEmpty(this.f39402c.q())) && com.smartdigimkt.j5.a.a().d("am_bubble");
            }
            if (this.d.t.f() == 3 && this.f39403e == 2 && this.d.t.E() != 1) {
                return true;
            }
        }
        return false;
    }

    private boolean g() {
        return this.d.t.y() == 1;
    }

    private boolean h() {
        return this.d.t.p1() == 1 && com.smartdigimkt.j5.a.a().d("g2c_finger_icon");
    }

    private boolean i() {
        com.smartdigimkt.v6.a aVar = this.d;
        boolean z2 = aVar.f39164b == 1 && (aVar.t.y() != 1 || TextUtils.isEmpty(this.d.t.v())) && this.d.t.m0() != 1;
        if (z2 && this.d.t.m0() == 2) {
            return com.smartdigimkt.n8.h.a() ? com.smartdigimkt.j5.a.a().d("rv_task_complete_cn") : com.smartdigimkt.j5.a.a().d("rv_task_complete");
        }
        return z2;
    }

    private boolean j() {
        return com.smartdigimkt.m3.i.a(this.d) && !com.smartdigimkt.m3.i.e(this.f39402c, this.d);
    }

    private boolean k() {
        com.smartdigimkt.w6.g gVar = this.d.t;
        return gVar.v1() || gVar.y1() || gVar.u1();
    }

    public abstract ViewGroup.LayoutParams d();

    public void a(long j) {
        k kVarB = b();
        if (kVarB != null) {
            kVarB.a(j);
        }
    }

    public void a(int i2) {
        if ((i2 == 103 || i2 == 118) && !this.f39404h && !com.smartdigimkt.m3.i.b(this.f39402c, this.d)) {
            com.smartdigimkt.i7.d.a(this.f39402c, this.d, com.smartdigimkt.m3.i.a(this.d, this.f39401b.getContext()));
        }
        b(i2);
    }

    private d a() {
        List<c> list = this.f;
        if (list == null || list.size() <= 0) {
            return null;
        }
        for (c cVar : this.f) {
            if (cVar instanceof d) {
                return (d) cVar;
            }
        }
        return null;
    }

    private k b() {
        List<c> list = this.f;
        if (list == null || list.size() <= 0) {
            return null;
        }
        for (c cVar : this.f) {
            if (cVar instanceof k) {
                return (k) cVar;
            }
        }
        return null;
    }

    public void a(d.a aVar) {
        d dVarA = a();
        if (dVarA != null) {
            dVarA.a(aVar);
        }
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            this.g.putAll(map);
        }
    }

    public Map<String, Object> c() {
        return this.g;
    }
}

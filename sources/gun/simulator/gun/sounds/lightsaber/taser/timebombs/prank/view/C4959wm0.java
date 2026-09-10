package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4959wm0 {
    public static volatile C4959wm0 k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile int f5197a = 163840;
    public final SparseArray b;
    public final C4344pm0 c;
    public final ThreadPoolExecutor d;
    public volatile Vo0 e;
    public volatile No0 f;
    public final HashSet g;
    public final Wm0 h;
    public volatile String i;
    public volatile boolean j;

    public C4959wm0() {
        int i = 2;
        SparseArray sparseArray = new SparseArray(2);
        this.b = sparseArray;
        this.g = new HashSet();
        this.h = new Wm0(this, 12);
        C4344pm0 c4344pm0 = new C4344pm0();
        this.c = c4344pm0;
        Handler handler = PK.f3546a;
        int iMax = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, iMax <= 0 ? 1 : iMax > 4 ? 4 : iMax, 60L, TimeUnit.SECONDS, c4344pm0, new ThreadFactoryC4448r0(i), new RejectedExecutionHandlerC4168nm0(c4344pm0));
        this.d = threadPoolExecutor;
        synchronized (c4344pm0) {
            if (c4344pm0.f4849a != null) {
                throw new IllegalStateException("You can only call setExecutor() once!");
            }
            c4344pm0.f4849a = threadPoolExecutor;
        }
        sparseArray.put(0, new HashMap());
        sparseArray.put(1, new HashMap());
    }

    public static C4959wm0 c() {
        if (k == null) {
            synchronized (C4959wm0.class) {
                try {
                    if (k == null) {
                        k = new C4959wm0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return k;
    }

    public final void a(boolean z, String str) throws Throwable {
        UG ug;
        this.i = str;
        this.j = z;
        if (AbstractC4648tE.c) {
            "setCurrentPlayKey, ".concat(String.valueOf(str));
        }
        HashSet hashSet = null;
        HashSet<C4519rm0> hashSet2 = null;
        if (str == null) {
            synchronized (this.g) {
                try {
                    if (!this.g.isEmpty()) {
                        hashSet2 = new HashSet(this.g);
                        this.g.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (hashSet2 != null) {
                for (C4519rm0 c4519rm0 : hashSet2) {
                    b(c4519rm0.f4945a, c4519rm0.b, c4519rm0.c, c4519rm0.d, c4519rm0.e, c4519rm0.f);
                    No0 no0 = AbstractC4648tE.f5026a;
                }
                return;
            }
            return;
        }
        int i = AbstractC4648tE.h;
        if (i != 3 && i != 2) {
            if (i == 1) {
                synchronized (this.b) {
                    try {
                        Map map = (Map) this.b.get(z ? 1 : 0);
                        ug = map != null ? (UG) map.remove(str) : null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (ug != null) {
                    ug.d();
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this.b) {
            try {
                int size = this.b.size();
                for (int i2 = 0; i2 < size; i2++) {
                    SparseArray sparseArray = this.b;
                    Map map2 = (Map) sparseArray.get(sparseArray.keyAt(i2));
                    if (map2 != null) {
                        Collection collectionValues = map2.values();
                        if (collectionValues != null && !collectionValues.isEmpty()) {
                            if (hashSet == null) {
                                hashSet = new HashSet();
                            }
                            hashSet.addAll(collectionValues);
                        }
                        map2.clear();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (hashSet == null || hashSet.isEmpty()) {
            return;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((UG) it.next()).d();
            No0 no1 = AbstractC4648tE.f5026a;
        }
        if (i == 3) {
            synchronized (this.g) {
                try {
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        C4519rm0 c4519rm1 = (C4519rm0) ((UG) it2.next()).p;
                        if (c4519rm1 != null) {
                            this.g.add(c4519rm1);
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    public final void b(boolean z, boolean z2, int i, String str, Map map, String... strArr) throws Throwable {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z3 = AbstractC4648tE.c;
        No0 no0 = z ? null : this.f;
        Vo0 vo0 = this.e;
        if (no0 == null || vo0 == null || TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            return;
        }
        int i2 = i <= 0 ? this.f5197a : i;
        String strA = z2 ? str : SG.a(str);
        File fileG = no0.g(strA);
        if (fileG != null && fileG.length() >= i2) {
            if (z3) {
                fileG.length();
                return;
            }
            return;
        }
        if (C4963wo0.b().c(z ? 1 : 0, strA)) {
            if (z3) {
                "has running proxy task, skip preload for key: ".concat(String.valueOf(str));
                return;
            }
            return;
        }
        SparseArray sparseArray2 = this.b;
        synchronized (sparseArray2) {
            try {
                Map map2 = (Map) this.b.get(z ? 1 : 0);
                if (!map2.containsKey(strA)) {
                    sparseArray = sparseArray2;
                    try {
                        C4519rm0 c4519rm0 = new C4519rm0(z, z2, i2, str, map, strArr);
                        String str2 = this.i;
                        if (str2 != null) {
                            int i3 = AbstractC4648tE.h;
                            if (i3 == 3) {
                                synchronized (this.g) {
                                    this.g.add(c4519rm0);
                                }
                                return;
                            } else if (i3 == 2) {
                                if (z3) {
                                    "cancel preload: ".concat(String.valueOf(str));
                                }
                                return;
                            } else if (i3 == 1 && this.j == z && str2.equals(strA)) {
                                return;
                            }
                        }
                        List listI = PK.i(PK.g(map));
                        if (listI != null) {
                            arrayList = new ArrayList(listI.size());
                            int size = listI.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                IW iw = (IW) listI.get(i4);
                                if (iw != null) {
                                    arrayList.add(new IW(iw.f3220a, iw.b));
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        JG jg = new JG();
                        jg.d = no0;
                        jg.e = vo0;
                        if (TextUtils.isEmpty(str)) {
                            throw new IllegalArgumentException("rawKey == null");
                        }
                        jg.f3259a = str;
                        if (TextUtils.isEmpty(strA)) {
                            throw new IllegalArgumentException("key == null");
                        }
                        jg.b = strA;
                        jg.c = new Yo0(PK.h(strArr));
                        jg.f = arrayList;
                        jg.g = i2;
                        jg.i = this.h;
                        jg.j = c4519rm0;
                        UG ugA = jg.a();
                        map2.put(strA, ugA);
                        this.d.execute(ugA);
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                sparseArray = sparseArray2;
            }
        }
    }
}

package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.util.Base64;
import android.util.SparseArray;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4963wo0 {
    public static volatile C4963wo0 j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile ServerSocket f5198a;
    public volatile int b;
    public final AtomicInteger c = new AtomicInteger(0);
    public volatile Vo0 d;
    public volatile No0 e;
    public final SparseArray f;
    public final Wm0 g;
    public final TY h;
    public final AtomicBoolean i;

    public C4963wo0() {
        SparseArray sparseArray = new SparseArray(2);
        this.f = sparseArray;
        this.g = new Wm0(this, 13);
        this.h = new TY(this, 4);
        this.i = new AtomicBoolean();
        sparseArray.put(0, new HashSet());
        sparseArray.put(1, new HashSet());
    }

    public static C4963wo0 b() {
        if (j == null) {
            synchronized (C4963wo0.class) {
                try {
                    if (j == null) {
                        j = new C4963wo0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return j;
    }

    public static String d() {
        return new String(Base64.decode("MTI3LjAuMC4x".getBytes(), 0));
    }

    public final void a() {
        if (this.c.compareAndSet(1, 2) || this.c.compareAndSet(0, 2)) {
            ServerSocket serverSocket = this.f5198a;
            Handler handler = PK.f3546a;
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (Throwable unused) {
                }
            }
            ArrayList arrayList = new ArrayList();
            synchronized (this.f) {
                try {
                    int size = this.f.size();
                    for (int i = 0; i < size; i++) {
                        SparseArray sparseArray = this.f;
                        Set set = (Set) sparseArray.get(sparseArray.keyAt(i));
                        if (set != null) {
                            arrayList.addAll(set);
                            set.clear();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C4172no0) it.next()).d();
            }
        }
    }

    public final boolean c(int i, String str) {
        if (str == null) {
            return false;
        }
        synchronized (this.f) {
            Set<C4172no0> set = (Set) this.f.get(i);
            if (set != null) {
                for (C4172no0 c4172no0 : set) {
                    if (c4172no0 != null && str.equals(c4172no0.g)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}

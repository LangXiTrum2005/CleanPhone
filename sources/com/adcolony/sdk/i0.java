package com.adcolony.sdk;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<Integer, k0> f9173a = new LinkedHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9174b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, ArrayList<j0>> f9175c = new HashMap<>();
    private int d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinkedBlockingQueue<f1> f9176e = new LinkedBlockingQueue<>();
    private boolean f = false;
    private final ScheduledExecutorService g = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f9177h = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ScheduledFuture<?> f9178i;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f9179a;

        public a(Context context) {
            this.f9179a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            f1 f1VarB = com.adcolony.sdk.a.b().u().b();
            f1 f1VarB2 = c0.b();
            c0.a(f1VarB, "os_name", "android");
            c0.a(f1VarB2, "filepath", android.support.v4.media.a.r(new StringBuilder(), com.adcolony.sdk.a.b().z().a(), "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5"));
            c0.a(f1VarB2, "info", f1VarB);
            c0.b(f1VarB2, "m_origin", 0);
            c0.b(f1VarB2, "m_id", i0.a(i0.this));
            c0.a(f1VarB2, "m_type", "Controller.create");
            try {
                l.b(this.f9179a, new h0(f1VarB2));
            } catch (RuntimeException e2) {
                new e0.a().a(e2.toString() + ": during WebView initialization.").a(" Disabling AdColony.").a(e0.f9131h);
                AdColony.disable();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    f1 f1Var = (f1) i0.this.f9176e.poll(60L, TimeUnit.SECONDS);
                    if (f1Var != null) {
                        i0.this.b(f1Var);
                    } else {
                        synchronized (i0.this.f9176e) {
                            try {
                                if (i0.this.f9176e.peek() == null) {
                                    i0.this.f = false;
                                    return;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            new e0.a().a("Native messages thread was interrupted: ").a(e.toString()).a(e0.f9132i);
                        }
                    }
                } catch (InterruptedException e2) {
                    new e0.a().a("Native messages thread was interrupted: ").a(e2.toString()).a(e0.f9132i);
                }
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.adcolony.sdk.a.f();
            if (i0.this.f()) {
                return;
            }
            i0.this.i();
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f9183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f1 f9184b;

        public d(String str, f1 f1Var) {
            this.f9183a = str;
            this.f9184b = f1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            i0.this.a(this.f9183a, this.f9184b);
        }
    }

    public static /* synthetic */ int a(i0 i0Var) {
        int i2 = i0Var.d;
        i0Var.d = i2 + 1;
        return i2;
    }

    private void g() {
        if (this.f9178i == null) {
            try {
                this.f9178i = this.g.scheduleAtFixedRate(new c(), 0L, 17L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                new e0.a().a("Error when scheduling message pumping").a(e2.toString()).a(e0.f9132i);
            }
        }
    }

    public void c(f1 f1Var) {
        try {
            if (f1Var.c("m_id", this.d)) {
                this.d++;
            }
            f1Var.c("m_origin", 0);
            int iB = f1Var.b("m_target");
            if (iB == 0) {
                a(f1Var);
                return;
            }
            k0 k0Var = this.f9173a.get(Integer.valueOf(iB));
            if (k0Var != null) {
                k0Var.a(f1Var);
            }
        } catch (JSONException e2) {
            new e0.a().a("JSON error in ADCMessageDispatcher's sendMessage(): ").a(e2.toString()).a(e0.f9132i);
        }
    }

    public LinkedHashMap<Integer, k0> d() {
        return this.f9173a;
    }

    public int e() {
        int i2 = this.f9174b;
        this.f9174b = i2 + 1;
        return i2;
    }

    public boolean f() {
        Iterator<k0> it = this.f9173a.values().iterator();
        while (it.hasNext()) {
            if (it.next().a()) {
                return true;
            }
        }
        return false;
    }

    public void h() {
        if (f()) {
            g();
        }
    }

    public void i() {
        ScheduledFuture<?> scheduledFuture = this.f9178i;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isCancelled()) {
                this.f9178i.cancel(false);
            }
            this.f9178i = null;
        }
    }

    public void j() {
        synchronized (this.f9173a) {
            try {
                ArrayList arrayList = new ArrayList(this.f9173a.values());
                Collections.reverse(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((k0) it.next()).b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(String str, j0 j0Var) {
        synchronized (this.f9175c) {
            try {
                ArrayList<j0> arrayList = this.f9175c.get(str);
                if (arrayList != null) {
                    arrayList.remove(j0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(String str, j0 j0Var) {
        ArrayList<j0> arrayList = this.f9175c.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f9175c.put(str, arrayList);
        }
        arrayList.add(j0Var);
    }

    public boolean b(k0 k0Var) {
        return b(k0Var.getAdcModuleId());
    }

    public boolean b(int i2) {
        synchronized (this.f9173a) {
            try {
                k0 k0VarRemove = this.f9173a.remove(Integer.valueOf(i2));
                if (k0VarRemove == null) {
                    return false;
                }
                k0VarRemove.c();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        Context contextA;
        k kVarB = com.adcolony.sdk.a.b();
        if (kVarB.E() || kVarB.F() || (contextA = com.adcolony.sdk.a.a()) == null) {
            return;
        }
        b();
        z0.b(new a(contextA));
    }

    public l c() {
        k0 k0VarA = a(1);
        if (k0VarA instanceof l) {
            return (l) k0VarA;
        }
        return null;
    }

    private void b() {
        if (this.f) {
            return;
        }
        synchronized (this.f9176e) {
            try {
                if (this.f) {
                    return;
                }
                this.f = true;
                new Thread(new b()).start();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public k0 a(k0 k0Var) {
        synchronized (this.f9173a) {
            this.f9173a.put(Integer.valueOf(k0Var.getAdcModuleId()), k0Var);
            h();
        }
        return k0Var;
    }

    private void a(f1 f1Var) {
        b();
        this.f9176e.add(f1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, f1 f1Var) {
        synchronized (this.f9175c) {
            try {
                ArrayList<j0> arrayList = this.f9175c.get(str);
                if (arrayList == null) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                h0 h0Var = new h0(f1Var);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    try {
                        ((j0) it.next()).a(h0Var);
                    } catch (RuntimeException e2) {
                        new e0.a().a(e2).a(e0.f9132i);
                        e2.printStackTrace();
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(f1 f1Var) {
        try {
            String strE = f1Var.e("m_type");
            int iB = f1Var.b("m_origin");
            d dVar = new d(strE, f1Var);
            if (iB >= 2) {
                z0.b(dVar);
            } else {
                this.f9177h.execute(dVar);
            }
        } catch (RejectedExecutionException e2) {
            new e0.a().a("RejectedExecutionException from message dispatcher's dispatchNativeMessage(): ").a(e2.toString()).a(e0.f9132i);
        } catch (JSONException e3) {
            new e0.a().a("JSON error from message dispatcher's dispatchNativeMessage(): ").a(e3.toString()).a(e0.f9132i);
        }
    }

    public k0 a(int i2) {
        return this.f9173a.get(Integer.valueOf(i2));
    }
}

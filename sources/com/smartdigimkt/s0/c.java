package com.smartdigimkt.s0;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ThreadPoolExecutor f38161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    HashMap<Long, com.smartdigimkt.s0.a> f38162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    WeakReference<Context> f38163c;

    public class a implements com.smartdigimkt.s0.a.InterfaceC0579a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.s0.a f38164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.s0.a.InterfaceC0579a f38165b;

        public a(com.smartdigimkt.s0.a aVar, com.smartdigimkt.s0.a.InterfaceC0579a interfaceC0579a) {
            this.f38164a = aVar;
            this.f38165b = interfaceC0579a;
        }

        @Override // com.smartdigimkt.s0.a.InterfaceC0579a
        public void a(com.smartdigimkt.s0.a.b bVar) {
            if (bVar == com.smartdigimkt.s0.a.b.CANCEL || bVar == com.smartdigimkt.s0.a.b.FINISH) {
                c.this.f38162b.remove(Long.valueOf(this.f38164a.d()));
            } else if (bVar == com.smartdigimkt.s0.a.b.RUNNING && c.this.f38163c.get() == null) {
                c.this.b();
            }
            com.smartdigimkt.s0.a.InterfaceC0579a interfaceC0579a = this.f38165b;
            if (interfaceC0579a != null) {
                interfaceC0579a.a(bVar);
            }
        }
    }

    public c(Context context, int i2) {
        if (i2 == 0) {
            this.f38161a = new ThreadPoolExecutor(1, 5, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        } else {
            this.f38161a = new ThreadPoolExecutor(i2, (i2 * 2) + 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        }
        this.f38161a.allowCoreThreadTimeOut(true);
        this.f38162b = new HashMap<>();
        this.f38163c = new WeakReference<>(context);
    }

    public synchronized void a(com.smartdigimkt.s0.a aVar) {
        if (aVar != null) {
            try {
                if (this.f38162b.containsKey(Long.valueOf(aVar.d()))) {
                    com.smartdigimkt.s0.a aVar2 = this.f38162b.get(Long.valueOf(aVar.d()));
                    if (aVar2 != null) {
                        aVar2.b();
                    }
                    this.f38162b.remove(Long.valueOf(aVar.d()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void b() {
        try {
            Iterator<Map.Entry<Long, com.smartdigimkt.s0.a>> it = this.f38162b.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().b();
            }
            this.f38162b.clear();
        } catch (Exception unused) {
        } catch (Throwable th) {
            throw th;
        }
    }

    public c(Context context) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        this.f38161a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f38162b = new HashMap<>();
        this.f38163c = new WeakReference<>(context);
    }

    private synchronized void a(com.smartdigimkt.s0.a aVar, com.smartdigimkt.s0.a.InterfaceC0579a interfaceC0579a) {
        this.f38162b.put(Long.valueOf(aVar.d()), aVar);
        aVar.a(new a(aVar, interfaceC0579a));
    }

    public void b(com.smartdigimkt.s0.a aVar) {
        a(aVar, null);
        this.f38161a.execute(aVar);
    }

    public void b(com.smartdigimkt.s0.a aVar, com.smartdigimkt.s0.a.InterfaceC0579a interfaceC0579a) {
        a(aVar, interfaceC0579a);
        this.f38161a.execute(aVar);
    }

    public void a() {
        Iterator<Map.Entry<Long, com.smartdigimkt.s0.a>> it = this.f38162b.entrySet().iterator();
        while (it.hasNext()) {
            com.smartdigimkt.s0.a value = it.next().getValue();
            if (value.e() == com.smartdigimkt.s0.a.b.PAUSE) {
                value.b(false);
            } else if (value.e() == com.smartdigimkt.s0.a.b.READY) {
                this.f38161a.execute(value);
            }
        }
    }

    public c(Context context, String str) {
        int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 1L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        this.f38161a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f38162b = new HashMap<>();
        this.f38163c = new WeakReference<>(context);
    }
}

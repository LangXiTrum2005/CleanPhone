package sg.bigo.ads.core.player;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    c f48730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Map<String, b> f48731b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Map<String, RunnableC0878a> f48732c = new HashMap();

    /* JADX INFO: renamed from: sg.bigo.ads.core.player.a$a, reason: collision with other inner class name */
    public class RunnableC0878a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<sg.bigo.ads.common.h.a> f48733a;

        public RunnableC0878a(sg.bigo.ads.common.h.a aVar) {
            this.f48733a = new WeakReference<>(aVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    WeakReference<sg.bigo.ads.common.h.a> weakReference = RunnableC0878a.this.f48733a;
                    if (weakReference == null || weakReference.get() == null) {
                        return;
                    }
                    RunnableC0878a runnableC0878a = RunnableC0878a.this;
                    a.this.f48732c.remove(runnableC0878a.f48733a.get().f47251a);
                    RunnableC0878a runnableC0878a2 = RunnableC0878a.this;
                    a.this.f48730a.c(runnableC0878a2.f48733a.get());
                }
            });
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        sg.bigo.ads.common.h.a f48736a;

        public b(sg.bigo.ads.common.h.a aVar) {
            this.f48736a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.a.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    b bVar = b.this;
                    sg.bigo.ads.common.h.a aVar = bVar.f48736a;
                    if (aVar != null) {
                        a.this.f48731b.remove(aVar.f47251a);
                        b bVar2 = b.this;
                        a.this.f48730a.b(bVar2.f48736a);
                        str = "call onDownloadFillTime";
                    } else {
                        str = "downloadInfo is null, not call onDownloadFillTime";
                    }
                    sg.bigo.ads.common.t.a.a(0, 3, "AdFillStrategyManager", str);
                }
            });
        }
    }

    public interface c {
        void b(sg.bigo.ads.common.h.a aVar);

        void c(sg.bigo.ads.common.h.a aVar);
    }

    public a(c cVar) {
        this.f48730a = cVar;
    }

    public final void a(sg.bigo.ads.common.h.a aVar) {
        if (aVar.c()) {
            if (aVar.e() > 0) {
                c(aVar);
            }
            if (aVar.f() > 0) {
                if (this.f48732c.containsKey(aVar.f47251a)) {
                    sg.bigo.ads.common.n.d.a(this.f48732c.remove(aVar.f47251a));
                }
                RunnableC0878a runnableC0878a = new RunnableC0878a(aVar);
                this.f48732c.put(aVar.f47251a, runnableC0878a);
                sg.bigo.ads.common.n.d.a(3, runnableC0878a, ((long) aVar.f()) * 1000);
            }
        }
    }

    public final void b(sg.bigo.ads.common.h.a aVar) {
        if (this.f48732c.containsKey(aVar.f47251a)) {
            sg.bigo.ads.common.n.d.a(this.f48732c.get(aVar.f47251a));
            this.f48732c.remove(aVar.f47251a);
        }
    }

    public final void c(sg.bigo.ads.common.h.a aVar) {
        if (this.f48731b.containsKey(aVar.f47251a)) {
            sg.bigo.ads.common.n.d.a(this.f48731b.remove(aVar.f47251a));
            p005e.a.f(new StringBuilder("fillTimeRunnableList.containsKey: "), 0, aVar.f47251a, 3, "AdFillStrategyManager");
        }
        b bVar = new b(aVar);
        this.f48731b.put(aVar.f47251a, bVar);
        sg.bigo.ads.common.n.d.a(3, bVar, ((long) aVar.e()) * 1000);
        sg.bigo.ads.common.t.a.a(0, 3, "AdFillStrategyManager", "startFillTimeRunnable at: " + aVar.e());
    }
}

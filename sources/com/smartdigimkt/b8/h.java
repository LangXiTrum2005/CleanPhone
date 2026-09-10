package com.smartdigimkt.b8;

import com.smartdigimkt.sdk.api.AdError;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes5.dex */
public abstract class h extends com.smartdigimkt.b8.a {
    private volatile Set<com.smartdigimkt.w7.c> t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Object f33983u;

    public h(com.smartdigimkt.c8.d dVar) {
        super(dVar);
        this.f33983u = new Object();
    }

    public void f(int i2) {
        a(i2, (com.smartdigimkt.w7.c) new a());
    }

    public void a(com.smartdigimkt.w7.c cVar) {
        if (cVar == null) {
            return;
        }
        synchronized (this.f33983u) {
            try {
                if (this.t == null) {
                    this.t = new CopyOnWriteArraySet();
                }
                this.t.add(cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public class a implements com.smartdigimkt.w7.c {
        public a() {
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, Object obj) {
            synchronized (h.this.f33983u) {
                if (h.this.t != null) {
                    try {
                        Iterator it = h.this.t.iterator();
                        while (it.hasNext()) {
                            ((com.smartdigimkt.w7.c) it.next()).a(i2, obj);
                        }
                        h.this.t.clear();
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        @Override // com.smartdigimkt.w7.c
        public void b(int i2) {
            synchronized (h.this.f33983u) {
                if (h.this.t != null) {
                    try {
                        Iterator it = h.this.t.iterator();
                        while (it.hasNext()) {
                            ((com.smartdigimkt.w7.c) it.next()).b(i2);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, String str, AdError adError) {
            synchronized (h.this.f33983u) {
                if (h.this.t != null) {
                    try {
                        Iterator it = h.this.t.iterator();
                        while (it.hasNext()) {
                            ((com.smartdigimkt.w7.c) it.next()).a(i2, str, adError);
                        }
                        h.this.t.clear();
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2) {
            synchronized (h.this.f33983u) {
                if (h.this.t != null) {
                    try {
                        Iterator it = h.this.t.iterator();
                        while (it.hasNext()) {
                            ((com.smartdigimkt.w7.c) it.next()).a(i2);
                        }
                        h.this.t.clear();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }
}

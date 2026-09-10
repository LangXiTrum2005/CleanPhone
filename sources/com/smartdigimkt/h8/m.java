package com.smartdigimkt.h8;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, a> f35779a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReferenceQueue<Object> f35780b = new ReferenceQueue<>();

    public static class a extends WeakReference<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f35781a;

        public a(String str, Object obj, ReferenceQueue<Object> referenceQueue) {
            super(obj, referenceQueue);
            this.f35781a = str;
        }
    }

    public synchronized Object a(String str) {
        a aVar;
        a();
        aVar = this.f35779a.get(str);
        return aVar != null ? aVar.get() : null;
    }

    public synchronized void b(String str) {
        this.f35779a.remove(str);
    }

    public synchronized void b() {
        this.f35779a.clear();
        a();
    }

    public synchronized void a(String str, Object obj) {
        a aVar;
        try {
            a();
            if (obj != null && ((aVar = this.f35779a.get(str)) == null || aVar.get() != obj)) {
                this.f35779a.put(str, new a(str, obj, this.f35780b));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a() {
        a aVar = (a) this.f35780b.poll();
        while (aVar != null) {
            a aVar2 = this.f35779a.get(aVar.f35781a);
            if (aVar2 != null && aVar2.get() == null) {
                this.f35779a.remove(aVar.f35781a);
            }
            aVar = (a) this.f35780b.poll();
        }
    }
}

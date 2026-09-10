package com.smartdigimkt.d8;

/* JADX INFO: loaded from: classes5.dex */
public class d {
    private static d d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f34518e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34519a = getClass().getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile com.smartdigimkt.e8.c f34520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile com.smartdigimkt.e8.c f34521c;

    private d() {
    }

    public static d a() {
        if (d == null) {
            synchronized (d.class) {
                try {
                    if (d == null) {
                        d = new d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public void a(c cVar, c.a aVar) {
        com.smartdigimkt.e8.c cVar2;
        if (cVar == null) {
            return;
        }
        int iA = cVar.a();
        synchronized (f34518e) {
            try {
                if (iA == 6) {
                    if (this.f34521c == null) {
                        this.f34521c = new com.smartdigimkt.e8.b();
                    }
                    cVar2 = this.f34521c;
                } else {
                    if (this.f34520b == null) {
                        this.f34520b = new com.smartdigimkt.e8.a();
                    }
                    cVar2 = this.f34520b;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cVar2 != null) {
            cVar2.b(cVar, aVar);
        } else if (aVar != null) {
            aVar.a((Throwable) new Exception("socketUploadData is null."));
        }
    }
}

package com.smartdigimkt.h7;

/* JADX INFO: loaded from: classes5.dex */
public class e implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile e f35699b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f35700a = new d();

    private e() {
    }

    private a a() {
        return this.f35700a;
    }

    public static e b() {
        if (f35699b == null) {
            synchronized (e.class) {
                try {
                    if (f35699b == null) {
                        f35699b = new e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f35699b;
    }

    public static a c() {
        return b().a();
    }

    @Override // com.smartdigimkt.h7.a
    public void a(b bVar, long j) {
        this.f35700a.a(bVar, j);
    }

    @Override // com.smartdigimkt.h7.a
    public void a(b bVar) {
        if (bVar != null) {
            this.f35700a.a(bVar);
        }
    }
}

package gd;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import ld.g;
import md.h;
import nd.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final fd.a f41848f = fd.a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f41849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f41850b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f41853e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f41852d = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f41851c = new ConcurrentHashMap();

    public e(String str, String str2, g gVar, h hVar) {
        this.f41853e = false;
        this.f41850b = hVar;
        f fVar = new f(gVar);
        fVar.j(str);
        fVar.c(str2);
        this.f41849a = fVar;
        fVar.f41862h = true;
        if (dd.a.e().o()) {
            return;
        }
        f41848f.e("HttpMetric feature is disabled. URL %s", str);
        this.f41853e = true;
    }

    public final void a(String str, String str2) {
        boolean z10;
        ConcurrentHashMap concurrentHashMap = this.f41851c;
        fd.a aVar = f41848f;
        try {
            str = str.trim();
            str2 = str2.trim();
            if (this.f41852d) {
                throw new IllegalArgumentException("HttpMetric has been logged already so unable to modify attributes");
            }
            if (!concurrentHashMap.containsKey(str) && concurrentHashMap.size() >= 5) {
                Locale locale = Locale.ENGLISH;
                throw new IllegalArgumentException("Exceeds max limit of number of attributes - 5");
            }
            hd.e.b(str, str2);
            aVar.b("Setting attribute '%s' to %s on network request '%s'", str, str2, this.f41849a.f41858d.getUrl());
            z10 = true;
            if (z10) {
                concurrentHashMap.put(str, str2);
            }
        } catch (Exception e10) {
            aVar.c("Cannot set attribute '%s' with value '%s' (%s)", str, str2, e10.getMessage());
            z10 = false;
        }
    }

    public final void b() {
        if (this.f41853e) {
            return;
        }
        long jB = this.f41850b.b();
        f fVar = this.f41849a;
        fVar.i(jB);
        w wVar = fVar.f41858d;
        wVar.i();
        wVar.o(this.f41851c);
        fVar.b();
        this.f41852d = true;
    }
}

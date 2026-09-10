package com.mbridge.msdk.foundation.same.directory;

import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.t0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile e f33777c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f33778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<a> f33779b = new ArrayList<>();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public File f33780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f33781b;

        public a(c cVar, File file) {
            this.f33781b = cVar;
            this.f33780a = file;
        }
    }

    private e(b bVar) {
        this.f33778a = bVar;
    }

    public static File a(c cVar) {
        try {
            if (b() == null || b().f33779b == null || b().f33779b.isEmpty()) {
                return null;
            }
            for (a aVar : b().f33779b) {
                if (aVar.f33781b.equals(cVar)) {
                    return aVar.f33780a;
                }
            }
            return null;
        } catch (Throwable th2) {
            q0.b("MBridgeDirManager", th2.getMessage(), th2);
            return null;
        }
    }

    public static String b(c cVar) {
        File fileA = a(cVar);
        if (fileA != null) {
            return fileA.getAbsolutePath();
        }
        return null;
    }

    public static synchronized e b() {
        try {
            if (f33777c == null && com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                t0.a(com.mbridge.msdk.foundation.controller.c.n().d());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f33777c;
    }

    public static synchronized void a(b bVar) {
        if (f33777c == null) {
            f33777c = new e(bVar);
        }
    }

    public boolean a() {
        return a(this.f33778a.a());
    }

    private boolean a(com.mbridge.msdk.foundation.same.directory.a aVar) {
        String strB;
        com.mbridge.msdk.foundation.same.directory.a aVarC = aVar.c();
        if (aVarC == null) {
            strB = aVar.b();
        } else {
            File fileA = a(aVarC.d());
            if (fileA == null) {
                return false;
            }
            strB = fileA.getAbsolutePath() + File.separator + aVar.b();
        }
        File file = new File(strB);
        if (!(!file.exists() ? file.mkdirs() : true)) {
            return false;
        }
        this.f33779b.add(new a(aVar.d(), file));
        List<com.mbridge.msdk.foundation.same.directory.a> listA = aVar.a();
        if (listA != null) {
            Iterator<com.mbridge.msdk.foundation.same.directory.a> it = listA.iterator();
            while (it.hasNext()) {
                if (!a(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }
}

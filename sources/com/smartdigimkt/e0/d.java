package com.smartdigimkt.e0;

import android.util.Log;
import com.smartdigimkt.v0.t;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f34594c = "AnythinkDirManager";
    private static d d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f34595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<a> f34596b = new ArrayList<>();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.smartdigimkt.e0.a f34597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public File f34598b;

        public a(com.smartdigimkt.e0.a aVar, File file) {
            this.f34597a = aVar;
            this.f34598b = file;
        }
    }

    private d(f fVar) {
        this.f34595a = fVar;
    }

    public static synchronized void a(f fVar) {
        if (d == null) {
            d = new d(fVar);
        }
    }

    public static synchronized d b() {
        try {
            if (d == null && com.smartdigimkt.u.a.f().d() != null) {
                t.c(com.smartdigimkt.u.a.f().d());
            }
            if (d == null) {
                Log.e(f34594c, "mDirectoryManager == null");
            }
        } catch (Throwable th) {
            throw th;
        }
        return d;
    }

    public static File a(com.smartdigimkt.e0.a aVar) {
        try {
            if (b() == null || b().f34596b == null || b().f34596b.size() <= 0) {
                return null;
            }
            for (a aVar2 : b().f34596b) {
                if (aVar2.f34597a.equals(aVar)) {
                    return aVar2.f34598b;
                }
            }
            return null;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static String b(com.smartdigimkt.e0.a aVar) {
        File fileA = a(aVar);
        if (fileA != null) {
            return fileA.getAbsolutePath();
        }
        return null;
    }

    public boolean a() {
        return a(this.f34595a.a());
    }

    private boolean a(e eVar) {
        String strB;
        e eVarC = eVar.c();
        if (eVarC == null) {
            strB = eVar.b();
        } else {
            File fileA = a(eVarC.d());
            if (fileA == null) {
                return false;
            }
            strB = fileA.getAbsolutePath() + File.separator + eVar.b();
        }
        File file = new File(strB);
        if (!file.exists() && !file.mkdirs()) {
            return false;
        }
        this.f34596b.add(new a(eVar.d(), file));
        List<e> listA = eVar.a();
        if (listA == null) {
            return true;
        }
        Iterator<e> it = listA.iterator();
        while (it.hasNext()) {
            if (!a(it.next())) {
                return false;
            }
        }
        return true;
    }
}

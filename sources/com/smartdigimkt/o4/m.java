package com.smartdigimkt.o4;

import android.os.ConditionVariable;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements com.smartdigimkt.o4.a {
    private static final String g = "SimpleCache";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final HashSet<File> f37449h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f37450i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f37451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f37452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f37453c;
    private final HashMap<String, ArrayList<com.smartdigimkt.o4.a.b>> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f37454e;
    private boolean f;

    public class a extends Thread {
        final /* synthetic */ ConditionVariable X;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.X = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (m.this) {
                this.X.open();
                m.this.d();
                m.this.f37452b.a();
            }
        }
    }

    public m(File file, d dVar) {
        this(file, dVar, null, false);
    }

    private n d(String str, long j) throws Throwable {
        n nVarA;
        g gVarC = this.f37453c.c(str);
        if (gVarC == null) {
            return n.b(str, j);
        }
        while (true) {
            nVarA = gVarC.a(j);
            if (!nVarA.d || nVarA.f37425e.exists()) {
                break;
            }
            e();
        }
        return nVarA;
    }

    @Override // com.smartdigimkt.o4.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized n b(String str, long j) throws InterruptedException, com.smartdigimkt.o4.a.C0559a {
        n nVarC;
        while (true) {
            nVarC = c(str, j);
            if (nVarC == null) {
                wait();
            }
        }
        return nVarC;
    }

    @Override // com.smartdigimkt.o4.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public synchronized n c(String str, long j) throws com.smartdigimkt.o4.a.C0559a {
        com.smartdigimkt.p4.a.b(!this.f);
        n nVarD = d(str, j);
        if (nVarD.d) {
            n nVarB = this.f37453c.c(str).b(nVarD);
            a(nVarD, nVarB);
            return nVarB;
        }
        g gVarE = this.f37453c.e(str);
        if (gVarE.d()) {
            return null;
        }
        gVarE.a(true);
        return nVarD;
    }

    @Override // com.smartdigimkt.o4.a
    public synchronized void release() throws com.smartdigimkt.o4.a.C0559a {
        if (this.f) {
            return;
        }
        this.d.clear();
        try {
            e();
            d(this.f37451a);
            this.f = true;
        } catch (Throwable th) {
            d(this.f37451a);
            this.f = true;
            throw th;
        }
    }

    public m(File file, d dVar, byte[] bArr) {
        this(file, dVar, bArr, bArr != null);
    }

    @Deprecated
    public static synchronized void c() {
        f37450i = true;
        f37449h.clear();
    }

    @Override // com.smartdigimkt.o4.a
    public synchronized void a(String str, com.smartdigimkt.o4.a.b bVar) {
        if (this.f) {
            return;
        }
        ArrayList<com.smartdigimkt.o4.a.b> arrayList = this.d.get(str);
        if (arrayList != null) {
            arrayList.remove(bVar);
            if (arrayList.isEmpty()) {
                this.d.remove(str);
            }
        }
    }

    public m(File file, d dVar, byte[] bArr, boolean z2) {
        this(file, dVar, new h(file, bArr, z2));
    }

    public static synchronized boolean b(File file) {
        return f37449h.contains(file.getAbsoluteFile());
    }

    private void e() throws Throwable {
        ArrayList arrayList = new ArrayList();
        Iterator<g> it = this.f37453c.a().iterator();
        while (it.hasNext()) {
            for (n nVar : it.next().b()) {
                if (!nVar.f37425e.exists()) {
                    arrayList.add(nVar);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            a((e) arrayList.get(i2), false);
        }
        this.f37453c.f();
        this.f37453c.g();
    }

    public m(File file, d dVar, h hVar) {
        if (c(file)) {
            this.f37451a = file;
            this.f37452b = dVar;
            this.f37453c = hVar;
            this.d = new HashMap<>();
            ConditionVariable conditionVariable = new ConditionVariable();
            new a("SimpleCache.initialize()", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(android.support.v4.media.a.l(file, "Another SimpleCache instance uses the folder: "));
    }

    @Override // com.smartdigimkt.o4.a
    public synchronized NavigableSet<e> b(String str, com.smartdigimkt.o4.a.b bVar) {
        try {
            com.smartdigimkt.p4.a.b(!this.f);
            ArrayList<com.smartdigimkt.o4.a.b> arrayList = this.d.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.d.put(str, arrayList);
            }
            arrayList.add(bVar);
        } catch (Throwable th) {
            throw th;
        }
        return c(str);
    }

    @Override // com.smartdigimkt.o4.a
    public synchronized NavigableSet<e> c(String str) {
        TreeSet treeSet;
        try {
            com.smartdigimkt.p4.a.b(!this.f);
            g gVarC = this.f37453c.c(str);
            if (gVarC != null && !gVarC.c()) {
                treeSet = new TreeSet((Collection) gVarC.b());
            } else {
                treeSet = new TreeSet();
            }
        } catch (Throwable th) {
            throw th;
        }
        return treeSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() throws Throwable {
        if (!this.f37451a.exists()) {
            this.f37451a.mkdirs();
            return;
        }
        this.f37453c.d();
        File[] fileArrListFiles = this.f37451a.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (!file.getName().equals("cached_content_index.exi")) {
                n nVarA = file.length() > 0 ? n.a(file, this.f37453c) : null;
                if (nVarA != null) {
                    a(nVarA);
                } else {
                    file.delete();
                }
            }
        }
        this.f37453c.f();
        try {
            this.f37453c.g();
        } catch (com.smartdigimkt.o4.a.C0559a e2) {
            Log.e(g, "Storing index file failed", e2);
        }
    }

    @Override // com.smartdigimkt.o4.a
    public synchronized long a() {
        com.smartdigimkt.p4.a.b(!this.f);
        return this.f37454e;
    }

    @Override // com.smartdigimkt.o4.a
    public synchronized File a(String str, long j, long j2) throws Throwable {
        Throwable th;
        try {
            try {
                com.smartdigimkt.p4.a.b(!this.f);
                g gVarC = this.f37453c.c(str);
                com.smartdigimkt.p4.a.a(gVarC);
                com.smartdigimkt.p4.a.b(gVarC.d());
                if (!this.f37451a.exists()) {
                    try {
                        this.f37451a.mkdirs();
                        e();
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.f37452b.a(this, str, j, j2);
                return n.a(this.f37451a, gVarC.f37430a, j, System.currentTimeMillis());
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // com.smartdigimkt.o4.a
    public synchronized long c(String str, long j, long j2) {
        g gVarC;
        com.smartdigimkt.p4.a.b(!this.f);
        gVarC = this.f37453c.c(str);
        return gVarC != null ? gVarC.a(j, j2) : -j2;
    }

    @Override // com.smartdigimkt.o4.a
    public synchronized Set<String> b() {
        com.smartdigimkt.p4.a.b(!this.f);
        return new HashSet(this.f37453c.c());
    }

    private void c(e eVar) {
        ArrayList<com.smartdigimkt.o4.a.b> arrayList = this.d.get(eVar.f37422a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).b(this, eVar);
            }
        }
        this.f37452b.b(this, eVar);
    }

    @Override // com.smartdigimkt.o4.a
    public synchronized void b(e eVar) {
        com.smartdigimkt.p4.a.b(!this.f);
        g gVarC = this.f37453c.c(eVar.f37422a);
        com.smartdigimkt.p4.a.a(gVarC);
        com.smartdigimkt.p4.a.b(gVarC.d());
        gVarC.a(false);
        this.f37453c.f(gVarC.f37431b);
        notifyAll();
    }

    private static synchronized boolean c(File file) {
        if (f37450i) {
            return true;
        }
        return f37449h.add(file.getAbsoluteFile());
    }

    private static synchronized void d(File file) {
        if (!f37450i) {
            f37449h.remove(file.getAbsoluteFile());
        }
    }

    @Override // com.smartdigimkt.o4.a
    public synchronized boolean b(String str, long j, long j2) {
        g gVarC;
        com.smartdigimkt.p4.a.b(!this.f);
        gVarC = this.f37453c.c(str);
        return gVarC != null && gVarC.a(j, j2) >= j2;
    }

    @Override // com.smartdigimkt.o4.a
    public synchronized void a(File file) throws com.smartdigimkt.o4.a.C0559a {
        boolean z2 = true;
        com.smartdigimkt.p4.a.b(!this.f);
        n nVarA = n.a(file, this.f37453c);
        com.smartdigimkt.p4.a.b(nVarA != null);
        g gVarC = this.f37453c.c(nVarA.f37422a);
        com.smartdigimkt.p4.a.a(gVarC);
        com.smartdigimkt.p4.a.b(gVarC.d());
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            long jA = j.a(gVarC.a());
            if (jA != -1) {
                if (nVarA.f37423b + nVarA.f37424c > jA) {
                    z2 = false;
                }
                com.smartdigimkt.p4.a.b(z2);
            }
            a(nVarA);
            this.f37453c.g();
            notifyAll();
        }
    }

    @Override // com.smartdigimkt.o4.a
    public synchronized long b(String str) {
        return j.a(a(str));
    }

    private void b(n nVar) {
        ArrayList<com.smartdigimkt.o4.a.b> arrayList = this.d.get(nVar.f37422a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).a(this, nVar);
            }
        }
        this.f37452b.a(this, nVar);
    }

    @Override // com.smartdigimkt.o4.a
    public synchronized void a(e eVar) throws com.smartdigimkt.o4.a.C0559a {
        com.smartdigimkt.p4.a.b(!this.f);
        a(eVar, true);
    }

    @Override // com.smartdigimkt.o4.a
    public synchronized void a(String str, long j) throws com.smartdigimkt.o4.a.C0559a {
        k kVar = new k();
        j.a(kVar, j);
        a(str, kVar);
    }

    @Override // com.smartdigimkt.o4.a
    public synchronized void a(String str, k kVar) throws com.smartdigimkt.o4.a.C0559a {
        com.smartdigimkt.p4.a.b(!this.f);
        this.f37453c.a(str, kVar);
        this.f37453c.g();
    }

    @Override // com.smartdigimkt.o4.a
    public synchronized i a(String str) {
        com.smartdigimkt.p4.a.b(!this.f);
        return this.f37453c.d(str);
    }

    private void a(n nVar) {
        this.f37453c.e(nVar.f37422a).a(nVar);
        this.f37454e += nVar.f37424c;
        b(nVar);
    }

    private void a(e eVar, boolean z2) throws com.smartdigimkt.o4.a.C0559a {
        g gVarC = this.f37453c.c(eVar.f37422a);
        if (gVarC == null || !gVarC.a(eVar)) {
            return;
        }
        this.f37454e -= eVar.f37424c;
        if (z2) {
            try {
                this.f37453c.f(gVarC.f37431b);
                this.f37453c.g();
            } finally {
                c(eVar);
            }
        }
    }

    private void a(n nVar, e eVar) {
        ArrayList<com.smartdigimkt.o4.a.b> arrayList = this.d.get(nVar.f37422a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).a(this, nVar, eVar);
            }
        }
        this.f37452b.a(this, nVar, eVar);
    }
}

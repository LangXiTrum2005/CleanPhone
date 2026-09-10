package com.smartdigimkt.b1;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.smartdigimkt.a1.d;
import com.smartdigimkt.a1.f;
import com.smartdigimkt.c3.i;
import com.smartdigimkt.v0.l;
import com.smartdigimkt.v0.s;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.v0.y;
import com.smartdigimkt.v0.z;
import com.smartdigimkt.z0.e;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f33852n = "b";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f33853a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f33855c;
    private com.smartdigimkt.c1.a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.smartdigimkt.a1.b f33856e;
    private d f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33854b = 0;
    private volatile boolean g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Timer f33857h = new Timer();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile List<String> f33858i = new ArrayList();
    private volatile boolean j = false;
    private volatile boolean k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile boolean f33859l = false;
    private String m = "";

    public class a extends TimerTask {
        final /* synthetic */ String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.x.d f33860Y;

        public a(String str, com.smartdigimkt.x.d dVar) {
            this.X = str;
            this.f33860Y = dVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (b.this.g) {
                return;
            }
            b.this.g = true;
            b.this.a(this.X, -1, "", false, this.f33860Y);
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.b1.b$b, reason: collision with other inner class name */
    public class RunnableC0441b implements Runnable {
        final /* synthetic */ com.smartdigimkt.x.e X;

        public RunnableC0441b(com.smartdigimkt.x.e eVar) {
            this.X = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            String unused = b.f33852n;
            com.smartdigimkt.x.e eVar = this.X;
            if (eVar != null && eVar.f() != null && this.X.f().size() > 0) {
                com.smartdigimkt.c1.b.a(b.this.f33853a, this.X.f());
            }
            String unused2 = b.f33852n;
        }
    }

    public b(Context context, e eVar, com.smartdigimkt.a1.b bVar, com.smartdigimkt.c1.a aVar) {
        this.f33853a = context.getApplicationContext();
        this.f33855c = eVar;
        this.f33856e = bVar;
        this.d = aVar;
    }

    private void c(String str) {
        this.f33855c.a(str);
    }

    public static class c implements com.smartdigimkt.f0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f33862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f33863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.smartdigimkt.x.d f33864c;

        public c(b bVar, String str, com.smartdigimkt.x.d dVar) {
            this.f33862a = bVar;
            this.f33863b = str;
            this.f33864c = dVar;
        }

        @Override // com.smartdigimkt.f0.c
        public void a(Bitmap bitmap, String str) {
            b bVar = this.f33862a;
            if (bVar != null) {
                bVar.a(this.f33863b, 1, str, true, this.f33864c);
            }
        }

        @Override // com.smartdigimkt.f0.c
        public void a(String str, String str2) {
            b bVar = this.f33862a;
            if (bVar != null) {
                bVar.a(this.f33863b, 1, str2, false, this.f33864c);
            }
        }
    }

    private void b(String str) {
        if (this.f33859l) {
            return;
        }
        if ((this.j || this.k) && this.f33858i.size() == 0) {
            this.g = true;
            this.f33859l = true;
            this.f33857h.cancel();
            this.d.a(this.f33856e, str);
            this.f.a(str);
        }
    }

    private void a(String str, com.smartdigimkt.x.d dVar) {
        this.g = true;
        com.smartdigimkt.y.c cVar = new com.smartdigimkt.y.c(com.smartdigimkt.y.b.f39977A);
        cVar.k(str);
        cVar.a(dVar);
        this.d.b(this.f33856e, cVar);
        this.f.a(str);
    }

    private void b(String str, List<com.smartdigimkt.x.d> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (com.smartdigimkt.x.d dVar : list) {
            if (!TextUtils.isEmpty(dVar.k())) {
                this.f33858i.add(dVar.k());
                com.smartdigimkt.f0.b.a(this.f33853a).a(dVar.k(), new c(this, str, dVar));
            }
        }
    }

    public void a(String str, int i2, String str2, boolean z2, com.smartdigimkt.x.d dVar) {
        if (!z2) {
            this.f33857h.cancel();
            a(str, dVar);
            return;
        }
        if (i2 == 1) {
            synchronized (this) {
                try {
                    this.f33858i.remove(str2);
                    if (this.f33858i.size() == 0) {
                        b(str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (i2 == 2) {
            this.k = true;
            b(str);
        } else if (i2 == 3) {
            this.j = true;
            b(str);
        }
    }

    private void b(String str, String str2, com.smartdigimkt.x.d dVar) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        f fVar = new f(this, str, dVar);
        new com.smartdigimkt.q0.e().a(dVar);
        i.a().a(str2, fVar);
    }

    private String b() {
        return this.f33855c.c();
    }

    private void a(String str, int i2, com.smartdigimkt.x.d dVar) {
        this.f33857h.schedule(new a(str, dVar), i2);
    }

    public void a(String str, com.smartdigimkt.x.e eVar, d dVar) throws Throwable {
        com.smartdigimkt.y.c cVar;
        com.smartdigimkt.x.d dVar2;
        this.f = dVar;
        if (eVar == null) {
            com.smartdigimkt.y.c cVar2 = new com.smartdigimkt.y.c(com.smartdigimkt.y.b.d);
            cVar2.k(str);
            this.d.a(this.f33856e, cVar2);
            this.f.a(str);
            return;
        }
        List<com.smartdigimkt.x.d> listA = a(str, eVar);
        a(eVar);
        int i2 = 0;
        if (listA != null && listA.size() != 0) {
            com.smartdigimkt.x.d dVar3 = listA.get(0);
            a(str, 60000, dVar3);
            c(eVar.A());
            a(str, listA);
            String strTrim = dVar3.d0().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                b(str, strTrim, dVar3);
                if (listA.size() > 0) {
                    while (i2 < listA.size()) {
                        listA.get(i2).D(dVar3.d0());
                        listA.get(i2).h(true);
                        i2++;
                    }
                }
            } else {
                String strTrim2 = dVar3.c0().trim();
                if (!TextUtils.isEmpty(strTrim2)) {
                    String strA = a(str, strTrim2, dVar3);
                    if (listA.size() > 0) {
                        while (i2 < listA.size()) {
                            listA.get(i2).C(strA);
                            listA.get(i2).h(strTrim2.contains("<MBTPLMARK>"));
                            i2++;
                        }
                    }
                } else {
                    this.k = true;
                    this.j = true;
                }
            }
            b(str, listA);
            return;
        }
        if (this.m.contains("INSTALLED")) {
            cVar = new com.smartdigimkt.y.c(com.smartdigimkt.y.b.f40002u, com.smartdigimkt.g1.d.f35347U);
        } else {
            cVar = new com.smartdigimkt.y.c(com.smartdigimkt.y.b.d);
        }
        cVar.k(str);
        if (eVar.f() != null && eVar.f().size() > 0 && (dVar2 = eVar.f().get(0)) != null) {
            cVar.a(dVar2);
        }
        this.d.a(this.f33856e, cVar);
        this.f.a(str);
    }

    private List<com.smartdigimkt.x.d> a(String str, com.smartdigimkt.x.e eVar) {
        ArrayList arrayList = new ArrayList();
        if (eVar != null) {
            try {
                if (eVar.f() != null && eVar.f().size() > 0) {
                    ArrayList<com.smartdigimkt.x.d> arrayListF = eVar.f();
                    arrayListF.size();
                    for (int i2 = 0; i2 < arrayListF.size(); i2++) {
                        com.smartdigimkt.x.d dVar = arrayListF.get(i2);
                        if (dVar != null && dVar.w1() != 99 && (!TextUtils.isEmpty(dVar.d0()) || !TextUtils.isEmpty(dVar.c0()) || !TextUtils.isEmpty(dVar.k()))) {
                            if (v.b(dVar)) {
                                dVar.h0(v.a(this.f33853a, dVar.n()) ? 1 : 2);
                            }
                            if (l.a(this.f33853a, dVar)) {
                                arrayList.add(dVar);
                            } else {
                                this.m = com.smartdigimkt.g1.d.f35347U;
                            }
                        }
                    }
                    arrayList.size();
                    return arrayList;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    private String a(String str, String str2, com.smartdigimkt.x.d dVar) throws Throwable {
        File file;
        Throwable th;
        FileOutputStream fileOutputStream;
        String absolutePath = "";
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    String strB = com.smartdigimkt.e0.d.b(com.smartdigimkt.e0.a.ANYTHINK_700_HTML);
                    String strA = s.a(z.b(str2));
                    if (TextUtils.isEmpty(strA)) {
                        strA = String.valueOf(System.currentTimeMillis());
                    }
                    File file2 = new File(strB, strA.concat(".html"));
                    Uri.parse(str2).getPath();
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        fileOutputStream.write(str2.getBytes());
                        fileOutputStream.flush();
                        absolutePath = file2.getAbsolutePath();
                        fileOutputStream.close();
                    } catch (Exception e2) {
                        e = e2;
                        fileOutputStream2 = fileOutputStream;
                        e.printStackTrace();
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        file = new File(absolutePath);
                        if (!file.exists()) {
                            a(str, 2, str2, false, dVar);
                        } else {
                            a(str, 2, str2, false, dVar);
                        }
                        return absolutePath;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                                throw th;
                            } catch (Exception e3) {
                                e3.printStackTrace();
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                }
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        file = new File(absolutePath);
        if (!file.exists() && file.isFile() && file.canRead()) {
            a(str, 2, str2, true, dVar);
        } else {
            a(str, 2, str2, false, dVar);
        }
        return absolutePath;
    }

    private void a(com.smartdigimkt.x.e eVar) {
        new Thread(new RunnableC0441b(eVar)).start();
    }

    private int a(String str) {
        try {
            int iB = this.f33855c.b();
            if (iB > this.f33855c.a()) {
                return 0;
            }
            return iB;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    private void a(String str, List<com.smartdigimkt.x.d> list) {
        int size = this.f33854b;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    size += list.size();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        if (size > this.f33855c.a()) {
            size = 0;
        }
        if (y.b(str)) {
            this.f33855c.b(size);
        }
    }
}

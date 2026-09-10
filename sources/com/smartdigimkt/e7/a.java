package com.smartdigimkt.e7;

import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.n8.l;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class a {
    private static final String d = "H5TemplateLoader";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile a f34634e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f34635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, List<d>> f34636b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap<String, Long> f34637c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.smartdigimkt.e7.a$a, reason: collision with other inner class name */
    public class RunnableC0467a implements Runnable {
        final /* synthetic */ String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ d f34638Y;
        final /* synthetic */ String Z;
        final /* synthetic */ long e0;

        public RunnableC0467a(String str, d dVar, String str2, long j) {
            this.X = str;
            this.f34638Y = dVar;
            this.Z = str2;
            this.e0 = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TextUtils.isEmpty(this.X)) {
                this.f34638Y.a(this.Z, 3, "H5Template load fail:h5TemplateFilePath is empty");
            } else {
                this.f34638Y.a(this.Z, this.X, this.e0);
            }
        }
    }

    public class b implements Runnable {
        final /* synthetic */ d X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f34639Y;
        final /* synthetic */ int Z;
        final /* synthetic */ String e0;

        public b(d dVar, String str, int i2, String str2) {
            this.X = dVar;
            this.f34639Y = str;
            this.Z = i2;
            this.e0 = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.a(this.f34639Y, this.Z, this.e0);
        }
    }

    public interface d {
        void a(String str, int i2, String str2);

        void a(String str, String str2, long j);
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f34642a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f34643b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f34644c = 3;
        public static final int d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f34645e = 5;
        public static final int f = 6;
        public static final int g = 7;
    }

    private a(Context context) {
        if (context != null) {
            this.f34635a = context.getApplicationContext();
        } else {
            this.f34635a = com.smartdigimkt.m6.b.p().k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        String strB = l.b(str);
        String strD = com.smartdigimkt.d7.d.c().d(5, strB);
        String strD2 = com.smartdigimkt.d7.d.c().d(6, strB);
        File file = new File(strD2);
        if (file.exists()) {
            file.delete();
        }
        if (new com.smartdigimkt.o8.a().a(strD, strD2) == 0) {
            a(str);
        } else {
            a(str, 2, "H5temp url unzip fail");
        }
    }

    public class c implements com.smartdigimkt.e7.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.d7.e f34640a;

        public c(com.smartdigimkt.d7.e eVar) {
            this.f34640a = eVar;
        }

        @Override // com.smartdigimkt.e7.b.a
        public void a(com.smartdigimkt.d7.e eVar) {
            String str = eVar.f34508b;
            a.this.b(this.f34640a.f34508b);
        }

        @Override // com.smartdigimkt.e7.b.a
        public void a(com.smartdigimkt.d7.e eVar, String str) {
            a.this.a(eVar.f34508b, 1, str);
        }
    }

    public static a a(Context context) {
        if (f34634e == null) {
            synchronized (a.class) {
                try {
                    if (f34634e == null) {
                        f34634e = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f34634e;
    }

    private void a(String str, String str2) {
        synchronized (this.f34636b) {
            File file = new File(com.smartdigimkt.d7.d.c().d(5, l.b(str)));
            if (file.exists()) {
                file.delete();
            }
            try {
                LinkedList<d> linkedList = (LinkedList) this.f34636b.remove(str);
                if (linkedList != null) {
                    Long l2 = this.f34637c.get(str);
                    long jCurrentTimeMillis = l2 != null ? System.currentTimeMillis() - l2.longValue() : 0L;
                    for (d dVar : linkedList) {
                        if (dVar != null) {
                            String str3 = str;
                            String str4 = str2;
                            com.smartdigimkt.l7.b.a().e(new RunnableC0467a(str4, dVar, str3, jCurrentTimeMillis));
                            str2 = str4;
                            str = str3;
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i2, String str2) {
        synchronized (this.f34636b) {
            try {
                String strB = l.b(str);
                File file = new File(com.smartdigimkt.d7.d.c().d(5, strB));
                if (file.exists()) {
                    file.delete();
                }
                File file2 = new File(com.smartdigimkt.d7.d.c().d(6, strB));
                if (file2.exists()) {
                    file2.delete();
                }
                LinkedList<d> linkedList = (LinkedList) this.f34636b.remove(str);
                if (linkedList != null) {
                    for (d dVar : linkedList) {
                        if (dVar != null) {
                            String str3 = str;
                            int i3 = i2;
                            String str4 = str2;
                            com.smartdigimkt.l7.b.a().e(new b(dVar, str3, i3, str4));
                            str = str3;
                            i2 = i3;
                            str2 = str4;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(String str, d dVar) {
        if (dVar == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            dVar.a(str, 1, "No url info.");
            return;
        }
        if (!str.endsWith(".zip")) {
            dVar.a(str, 1, "Not zip file url");
            return;
        }
        String strA = com.smartdigimkt.d7.d.c().a(str);
        if (!TextUtils.isEmpty(strA)) {
            dVar.a(str, strA, 0L);
            return;
        }
        synchronized (this.f34636b) {
            try {
                if (!this.f34637c.contains(str)) {
                    this.f34637c.put(str, Long.valueOf(System.currentTimeMillis()));
                }
                if (!this.f34636b.containsKey(str)) {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(dVar);
                    this.f34636b.put(str, linkedList);
                    if (com.smartdigimkt.d7.d.c().e(5, l.b(str))) {
                        b(str);
                    } else {
                        a(new com.smartdigimkt.d7.e(5, str), dVar);
                    }
                    return;
                }
                LinkedList linkedList2 = (LinkedList) this.f34636b.get(str);
                if (linkedList2 != null && !linkedList2.contains(dVar)) {
                    linkedList2.add(dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(com.smartdigimkt.d7.e eVar, d dVar) {
        com.smartdigimkt.e7.b bVar = new com.smartdigimkt.e7.b(eVar);
        bVar.a(new c(eVar));
        bVar.f();
    }

    private void a(String str) {
        String strA = com.smartdigimkt.d7.d.c().a(str);
        if (!TextUtils.isEmpty(strA)) {
            a(str, strA);
        } else {
            a(str, 3, "h5temp html file not exist");
        }
    }

    public void a() {
        try {
            ConcurrentHashMap<String, List<d>> concurrentHashMap = this.f34636b;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
        } catch (Throwable unused) {
        }
    }
}

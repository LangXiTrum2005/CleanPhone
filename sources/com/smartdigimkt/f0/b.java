package com.smartdigimkt.f0;

import android.content.Context;
import android.graphics.Bitmap;
import com.smartdigimkt.v0.u;
import com.smartdigimkt.v0.v;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class b {
    private static final String d = "ImageLoader";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f34958e = 1;
    private static final int f = 2;
    private static final String g = "message_key";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f34959h = "message_bitmap";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f34960i = "message_message";
    private static b j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.smartdigimkt.s0.c f34961a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedHashMap<String, List<com.smartdigimkt.f0.c>> f34963c = new LinkedHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.smartdigimkt.c0.e<String, Bitmap> f34962b = new com.smartdigimkt.c0.c(((int) Runtime.getRuntime().maxMemory()) / 5);

    public class a implements Runnable {
        final /* synthetic */ String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f34964Y;
        final /* synthetic */ String Z;
        final /* synthetic */ com.smartdigimkt.f0.c e0;
        final /* synthetic */ boolean f0;

        public a(String str, String str2, String str3, com.smartdigimkt.f0.c cVar, boolean z2) {
            this.X = str;
            this.f34964Y = str2;
            this.Z = str3;
            this.e0 = cVar;
            this.f0 = z2;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            File file = new File(this.X);
            Bitmap bitmapB = b.this.b(this.f34964Y);
            if (bitmapB != null && !bitmapB.isRecycled()) {
                b.this.a(this.Z, bitmapB, this.e0);
                return;
            }
            if (file.length() <= 0) {
                b.this.a(this.Z, this.f34964Y, this.X, false, this.f0, this.e0);
                return;
            }
            Bitmap bitmapA = com.smartdigimkt.f0.a.a(this.X);
            if (bitmapA == null || bitmapA.isRecycled()) {
                b.this.a(this.Z, this.f34964Y, this.X, true, this.f0, this.e0);
            } else {
                b.this.a(this.f34964Y, bitmapA);
                b.this.a(this.Z, bitmapA, this.e0);
            }
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.f0.b$b, reason: collision with other inner class name */
    public class C0478b implements com.smartdigimkt.f0.d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f34965a;

        /* JADX INFO: renamed from: com.smartdigimkt.f0.b$b$a */
        public class a extends com.smartdigimkt.l7.d {
            final /* synthetic */ String j0;
            final /* synthetic */ String k0;

            public a(String str, String str2) {
                this.j0 = str;
                this.k0 = str2;
            }

            @Override // com.smartdigimkt.l7.d
            public void d() {
                synchronized (b.this.f34963c) {
                    try {
                        Bitmap bitmapA = com.smartdigimkt.f0.a.a(this.j0);
                        b.this.a(this.k0, bitmapA);
                        LinkedList<com.smartdigimkt.f0.c> linkedList = (LinkedList) b.this.f34963c.remove(this.k0);
                        if (linkedList != null) {
                            for (com.smartdigimkt.f0.c cVar : linkedList) {
                                C0478b c0478b = C0478b.this;
                                b.this.a(c0478b.f34965a, bitmapA, cVar);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.smartdigimkt.f0.b$b$b, reason: collision with other inner class name */
        public class C0479b extends com.smartdigimkt.l7.d {
            final /* synthetic */ String j0;
            final /* synthetic */ String k0;

            public C0479b(String str, String str2) {
                this.j0 = str;
                this.k0 = str2;
            }

            @Override // com.smartdigimkt.l7.d
            public void d() {
                synchronized (b.this.f34963c) {
                    try {
                        LinkedList<com.smartdigimkt.f0.c> linkedList = (LinkedList) b.this.f34963c.remove(this.j0);
                        if (linkedList != null) {
                            for (com.smartdigimkt.f0.c cVar : linkedList) {
                                C0478b c0478b = C0478b.this;
                                b.this.a(c0478b.f34965a, this.k0, cVar);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public C0478b(String str) {
            this.f34965a = str;
        }

        @Override // com.smartdigimkt.f0.d.b
        public void a(String str, String str2) {
            com.smartdigimkt.l7.b.a().g(new a(str2, str));
        }

        @Override // com.smartdigimkt.f0.d.b
        public void b(String str, String str2) {
            com.smartdigimkt.l7.b.a().g(new C0479b(str, str2));
        }
    }

    public class c implements Runnable {
        final /* synthetic */ com.smartdigimkt.f0.c X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ Bitmap f34967Y;
        final /* synthetic */ String Z;

        public c(com.smartdigimkt.f0.c cVar, Bitmap bitmap, String str) {
            this.X = cVar;
            this.f34967Y = bitmap;
            this.Z = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.X != null) {
                Bitmap bitmap = this.f34967Y;
                if (bitmap == null || bitmap.isRecycled()) {
                    this.X.a("bitmap no available", this.Z);
                } else {
                    this.X.a(this.f34967Y, this.Z);
                }
            }
        }
    }

    public class d implements Runnable {
        final /* synthetic */ com.smartdigimkt.f0.c X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f34968Y;
        final /* synthetic */ String Z;

        public d(com.smartdigimkt.f0.c cVar, String str, String str2) {
            this.X = cVar;
            this.f34968Y = str;
            this.Z = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.smartdigimkt.f0.c cVar = this.X;
            if (cVar != null) {
                cVar.a(this.f34968Y, this.Z);
            }
        }
    }

    public b(Context context) {
        this.f34961a = new com.smartdigimkt.s0.c(context);
    }

    public Bitmap b(String str) {
        return this.f34962b.get(str);
    }

    public Bitmap c(String str) {
        Bitmap bitmapA;
        if (v.g(str)) {
            return null;
        }
        String strA = u.a(str);
        File file = new File(strA);
        if (b(str) != null) {
            return b(str);
        }
        if (!file.exists() || (bitmapA = com.smartdigimkt.f0.a.a(strA)) == null) {
            return null;
        }
        a(str, bitmapA);
        return bitmapA;
    }

    public boolean d(String str) {
        if (v.g(str)) {
            return false;
        }
        return b(str) != null || new File(u.a(str)).exists();
    }

    public static void b() {
        j.c();
    }

    public void a(String str, Bitmap bitmap) {
        if (b(str) != null || bitmap == null) {
            return;
        }
        this.f34962b.put(str, bitmap);
    }

    public static b a(Context context) {
        if (j == null) {
            j = new b(context);
        }
        return j;
    }

    public void c() {
        com.smartdigimkt.c0.e<String, Bitmap> eVar = this.f34962b;
        if (eVar != null) {
            eVar.clear();
        }
    }

    public void a() {
        this.f34962b.clear();
        LinkedHashMap<String, List<com.smartdigimkt.f0.c>> linkedHashMap = this.f34963c;
        if (linkedHashMap != null) {
            linkedHashMap.clear();
        }
    }

    public void a(String str, com.smartdigimkt.f0.c cVar) {
        a(str, str, u.a(str), false, cVar);
    }

    public void a(String str, String str2, String str3, boolean z2, com.smartdigimkt.f0.c cVar) {
        if (v.g(str) || v.g(str2) || v.g(str3)) {
            return;
        }
        com.smartdigimkt.l7.b.a().g(new a(str3, str2, str, cVar, z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3, boolean z2, boolean z3, com.smartdigimkt.f0.c cVar) throws Throwable {
        Throwable th;
        synchronized (this.f34963c) {
            try {
                try {
                    if (!this.f34963c.containsKey(str2)) {
                        if (cVar != null) {
                            try {
                                LinkedList linkedList = new LinkedList();
                                linkedList.add(cVar);
                                this.f34963c.put(str2, linkedList);
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        this.f34961a.b(a(str, str2, str3, z2, z3));
                    } else {
                        LinkedList linkedList2 = (LinkedList) this.f34963c.get(str2);
                        if (linkedList2 != null && cVar != null && !linkedList2.contains(cVar)) {
                            linkedList2.add(cVar);
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public com.smartdigimkt.f0.d a(String str, String str2, String str3, boolean z2, boolean z3) {
        C0478b c0478b = new C0478b(str);
        com.smartdigimkt.f0.d dVar = new com.smartdigimkt.f0.d(str, str2, str3);
        dVar.c(z2);
        dVar.a(c0478b);
        return dVar;
    }

    public void a(String str) {
        try {
            com.smartdigimkt.c0.e<String, Bitmap> eVar = this.f34962b;
            if (eVar == null || !eVar.a().contains(str)) {
                return;
            }
            this.f34962b.remove(str);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Bitmap bitmap, com.smartdigimkt.f0.c cVar) {
        com.smartdigimkt.l7.b.a().e(new c(cVar, bitmap, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, com.smartdigimkt.f0.c cVar) {
        com.smartdigimkt.l7.b.a().e(new d(cVar, str2, str));
    }
}

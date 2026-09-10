package com.smartdigimkt.r3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import android.webkit.WebView;
import com.smartdigimkt.n8.l;
import com.smartdigimkt.sdk.basead.mraid.MraidWebView;
import com.smartdigimkt.sdk.basead.webtemplet.WTWebView;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public class c implements com.smartdigimkt.r3.e.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f38028p = "c";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f38029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38031c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<String> f38032e;
    private h f;
    com.smartdigimkt.w6.f g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    com.smartdigimkt.w6.g f38033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    com.smartdigimkt.v6.a f38034i;
    private com.smartdigimkt.n3.e<Void, com.smartdigimkt.v3.h> j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile boolean f38035l;
    com.smartdigimkt.h7.b k = new a();
    private boolean m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f38036n = false;
    private boolean o = false;

    public class a implements com.smartdigimkt.h7.b {
        public a() {
        }

        @Override // com.smartdigimkt.h7.b
        public boolean a() {
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a(com.smartdigimkt.v3.i.a("20001", "Load timeout!"));
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String strS = c.this.g.s();
            String strA = com.smartdigimkt.i7.b.b().a(c.this.f38034i);
            com.smartdigimkt.i7.b.b().c(strA, System.currentTimeMillis());
            c.this.a(strS);
            com.smartdigimkt.i7.b.b().b(strA, System.currentTimeMillis());
            c.this.g.F();
            c.this.g.D();
            com.smartdigimkt.i7.b.b().a(strA).b();
            c.this.a(3);
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.r3.c$c, reason: collision with other inner class name */
    public class RunnableC0575c implements Runnable {

        /* JADX INFO: renamed from: com.smartdigimkt.r3.c$c$a */
        public class a implements Runnable {
            final /* synthetic */ ExecutorService X;

            public a(ExecutorService executorService) {
                this.X = executorService;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    String strD = com.smartdigimkt.d7.d.c().d(4, l.b(c.this.g.k0()));
                    if (new File(strD).exists()) {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(strD);
                        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
                        mediaMetadataRetriever.release();
                        c.this.g.o(Integer.parseInt(strExtractMetadata));
                        c.this.g.n(Integer.parseInt(strExtractMetadata2));
                        c.this.g.a(Long.parseLong(strExtractMetadata3));
                        String strA = com.smartdigimkt.i7.b.b().a(c.this.f38034i);
                        com.smartdigimkt.i7.b.b().d(strA, System.currentTimeMillis());
                        com.smartdigimkt.i7.b.b().a(strA).e();
                    }
                    synchronized (this.X) {
                        this.X.notifyAll();
                    }
                } catch (Throwable unused) {
                    c.this.a(4);
                }
            }
        }

        public RunnableC0575c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2);
            executorServiceNewFixedThreadPool.submit(new a(executorServiceNewFixedThreadPool));
            try {
                synchronized (executorServiceNewFixedThreadPool) {
                    executorServiceNewFixedThreadPool.wait(2000L);
                }
                executorServiceNewFixedThreadPool.shutdownNow();
                c.this.a(4);
            } catch (Throwable unused) {
                c.this.a(4);
            }
        }
    }

    public class d implements Runnable {
        final /* synthetic */ String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f38038Y;

        public class a implements com.smartdigimkt.g5.i.b {
            public a() {
            }

            @Override // com.smartdigimkt.g5.i.b
            public void a(com.smartdigimkt.v3.h hVar) {
                c.this.a(hVar);
            }

            @Override // com.smartdigimkt.g5.i.b
            public void onPageFinished(WebView webView, String str) {
                c.this.a(2);
            }
        }

        public d(String str, String str2) {
            this.X = str;
            this.f38038Y = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String str = this.X;
                String str2 = this.f38038Y;
                MraidWebView mraidWebView = new MraidWebView(com.smartdigimkt.m6.b.p().k());
                a aVar = new a();
                c cVar = c.this;
                com.smartdigimkt.g5.i.a(str, str2, mraidWebView, aVar, cVar.g, cVar.f38034i, 5, false);
            } catch (Throwable th) {
                c.this.a(com.smartdigimkt.v3.i.a("Incomplete resource allocation!", "Mraid preload fail with exception:" + th.getMessage()));
            }
        }
    }

    public class e implements com.smartdigimkt.d7.b.f {
        public e() {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }
    }

    public class f implements com.smartdigimkt.e7.a.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile boolean f38041a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.smartdigimkt.h7.b f38042b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f38043c;
        final /* synthetic */ long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f38044e;

        public class a implements com.smartdigimkt.h7.b {
            public a() {
            }

            @Override // com.smartdigimkt.h7.b
            public boolean a() {
                return false;
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.a(false, com.smartdigimkt.v3.i.a("Adx template zip url load fail:", "h5 template load timeout"), 7, "h5 template load timeout", 0L);
            }
        }

        public class b implements Runnable {
            final /* synthetic */ String X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            final /* synthetic */ String f38045Y;
            final /* synthetic */ long Z;

            public class a implements com.smartdigimkt.sdk.basead.webtemplet.b.InterfaceC0613b {
                public a() {
                }

                @Override // com.smartdigimkt.sdk.basead.webtemplet.b.InterfaceC0613b
                public void a(WebView webView) {
                    b bVar = b.this;
                    f.this.a(true, bVar.X, bVar.Z);
                }

                @Override // com.smartdigimkt.sdk.basead.webtemplet.b.InterfaceC0613b
                public void a(com.smartdigimkt.v3.h hVar) {
                    f.this.a(false, hVar, TextUtils.equals(hVar.a(), "30010") ? 5 : 4, hVar.c(), b.this.Z);
                }
            }

            public b(String str, String str2, long j) {
                this.X = str;
                this.f38045Y = str2;
                this.Z = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                Object aVar;
                try {
                    WTWebView wTWebView = new WTWebView(com.smartdigimkt.m6.b.p().k());
                    try {
                        int i2 = c.this.f38034i.f39164b;
                        if (i2 == 1 || i2 == 3) {
                            aVar = new com.smartdigimkt.i6.a();
                        } else {
                            aVar = i2 != 4 ? null : new com.smartdigimkt.j6.a();
                        }
                        Object obj = aVar;
                        String str = this.X;
                        String string = new File(this.f38045Y).toURI().toString();
                        a aVar2 = new a();
                        c cVar = c.this;
                        com.smartdigimkt.sdk.basead.webtemplet.b.a(str, string, wTWebView, aVar2, cVar.g, cVar.f38034i, 1, obj);
                    } catch (Throwable th) {
                        f.this.a(false, com.smartdigimkt.v3.i.a("Incomplete resource allocation!", "Adx template preload fail with exception:" + th.getMessage()), 6, androidx.datastore.preferences.protobuf.a.o(th, new StringBuilder("Mraid preload fail with exception:")), 0L);
                    }
                } catch (Throwable th2) {
                    f.this.a(false, com.smartdigimkt.v3.i.a("Incomplete resource allocation!", "Adx template preload fail with exception:" + th2.getMessage()), 6, androidx.datastore.preferences.protobuf.a.o(th2, new StringBuilder("Mraid preload fail with exception:")), 0L);
                }
            }
        }

        public f(long j, long j2, boolean z2) {
            this.f38043c = j;
            this.d = j2;
            this.f38044e = z2;
            a();
        }

        private void b() {
            com.smartdigimkt.h7.e.b().a(this.f38042b);
        }

        private void a() {
            com.smartdigimkt.h7.e.b().a(this.f38042b, this.f38043c);
        }

        @Override // com.smartdigimkt.e7.a.d
        public void a(String str, String str2, long j) {
            if (TextUtils.isEmpty(str) || !TextUtils.equals(c.this.g.v(), str)) {
                return;
            }
            if (c.this.f38033h.b0() == 1) {
                com.smartdigimkt.l7.b.a().e(new b(com.smartdigimkt.r3.d.a((com.smartdigimkt.v6.a) null, c.this.g, 3), str2, j));
            } else {
                a(false, (String) null, j);
            }
        }

        @Override // com.smartdigimkt.e7.a.d
        public void a(String str, int i2, String str2) {
            if (TextUtils.equals(c.this.g.v(), str)) {
                a(false, com.smartdigimkt.v3.i.a("Adx template zip url load fail:", "Adx template zip url load fail:" + str2), i2, str2, 0L);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(boolean z2, String str, long j) {
            if (this.f38041a && z2 && !TextUtils.isEmpty(str)) {
                com.smartdigimkt.r3.d.d(str);
            }
            a(true, z2, (com.smartdigimkt.v3.h) null, 0, "", j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(boolean z2, com.smartdigimkt.v3.h hVar, int i2, String str, long j) {
            a(z2, false, hVar, i2, str, j);
        }

        private void a(boolean z2, boolean z3, com.smartdigimkt.v3.h hVar, int i2, String str, long j) {
            if (this.f38041a) {
                return;
            }
            this.f38041a = true;
            b();
            if (!z2) {
                c cVar = c.this;
                com.smartdigimkt.i7.d.a(cVar.g, cVar.f38034i, false, System.currentTimeMillis() - this.d, i2, str, 0L);
                if (!this.f38044e) {
                    c.this.a(hVar);
                    return;
                } else {
                    c.this.a(5);
                    return;
                }
            }
            c cVar2 = c.this;
            com.smartdigimkt.i7.d.a(cVar2.g, cVar2.f38034i, System.currentTimeMillis() - this.d, j);
            c.this.a(5);
        }
    }

    public class g implements com.smartdigimkt.n3.d<Void, com.smartdigimkt.v3.h> {
        private g() {
        }

        public /* synthetic */ g(c cVar, a aVar) {
            this();
        }

        @Override // com.smartdigimkt.n3.d
        public void a(Void r1) {
            if (c.this.f != null) {
                String unused = c.this.d;
                c.this.f.a();
            }
            c.this.i();
        }

        @Override // com.smartdigimkt.n3.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(com.smartdigimkt.v3.h hVar) {
            if (c.this.f != null) {
                String unused = c.this.d;
                c.this.f.a(hVar);
            }
            c.this.i();
        }
    }

    public interface h {
        void a();

        void a(com.smartdigimkt.v3.h hVar);
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f38048a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f38049b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f38050c = 3;
        static final int d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f38051e = 5;

        private i() {
        }
    }

    public c(String str, boolean z2, com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar) {
        this.f38029a = str;
        this.f38030b = z2;
        this.g = fVar;
        this.f38034i = aVar;
        if (fVar.i() != null) {
            this.f38033h = this.g.i();
        } else {
            this.f38033h = this.f38034i.t;
        }
        this.f38031c = this.f38033h.C0();
        com.smartdigimkt.r3.b bVar = new com.smartdigimkt.r3.b();
        this.j = bVar;
        bVar.a((com.smartdigimkt.n3.d) new g(this, null));
    }

    private void d() {
        List<String> listC = this.g.c(this.f38033h, this.f38034i.f39173w);
        if (listC == null) {
            a(com.smartdigimkt.v3.i.a("30003", "Incomplete resource allocation! MissResource: " + this.g.B()));
            return;
        }
        int size = listC.size();
        if (size == 0) {
            c();
            a(1);
            return;
        }
        this.f38032e = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String str = listC.get(i2);
            if (!TextUtils.isEmpty(str)) {
                if (this.g.b(str)) {
                    if (!com.smartdigimkt.r3.d.a(this.g, this.f38033h) && !this.f38032e.contains(str)) {
                        this.f38033h.F0();
                        this.f38032e.add(str);
                    }
                } else if (!com.smartdigimkt.r3.d.b(str) && !this.f38032e.contains(str)) {
                    this.f38032e.add(str);
                }
            }
        }
        if (com.smartdigimkt.m3.i.c(this.g, this.f38034i) && this.g.r0() && com.smartdigimkt.r3.d.a(this.g, this.f38033h) && !TextUtils.isEmpty(this.g.s())) {
            this.f38032e.remove(this.g.s());
        }
        int size2 = this.f38032e.size();
        if (size2 == 0) {
            c();
            a(1);
            return;
        }
        synchronized (this) {
            try {
                com.smartdigimkt.r3.e.a().a(this);
                ArrayList arrayList = new ArrayList(this.f38032e);
                for (int i3 = 0; i3 < size2; i3++) {
                    String str2 = (String) arrayList.get(i3);
                    boolean zB = this.g.b(str2);
                    int iF0 = this.f38033h.F0();
                    if (zB) {
                        if (com.smartdigimkt.r3.d.a(this.g, this.f38033h)) {
                            com.smartdigimkt.r3.e.a().a(str2, iF0);
                        } else {
                            new com.smartdigimkt.r3.g(this.f38029a, this.g, this.f38033h, this.f38034i).a();
                        }
                    } else if (!com.smartdigimkt.r3.d.c(str2)) {
                        if (com.smartdigimkt.r3.d.b(str2)) {
                            com.smartdigimkt.r3.d.b(str2, 100);
                            com.smartdigimkt.r3.e.a().a(str2, 100);
                        } else {
                            com.smartdigimkt.r3.d.b(str2, 0);
                            new com.smartdigimkt.r3.f(this.f38029a, this.f38030b, this.g, str2).f();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c();
    }

    private void e() {
        if (!com.smartdigimkt.r3.d.a(this.g, this.f38033h)) {
            a(4);
            return;
        }
        if (this.g.l0() <= 0 || this.g.j0() <= 0) {
            com.smartdigimkt.i7.b.b().e(com.smartdigimkt.i7.b.b().a(this.f38034i), System.currentTimeMillis());
            com.smartdigimkt.l7.b.a().g(new RunnableC0575c());
        } else {
            this.g.l0();
            this.g.j0();
            a(4);
        }
    }

    private boolean f() {
        com.smartdigimkt.v6.a aVar = this.f38034i;
        if (!aVar.v || !String.valueOf(aVar.f39164b).equals("0")) {
            return false;
        }
        com.smartdigimkt.w6.f fVar = this.g;
        return (((fVar instanceof com.smartdigimkt.w6.d) && !TextUtils.isEmpty(((com.smartdigimkt.w6.d) fVar).W0())) || this.f38034i.f39173w || TextUtils.isEmpty(this.g.s())) ? false : true;
    }

    private boolean g() {
        if (!this.g.r0() || !String.valueOf(this.f38034i.f39164b).equals("0")) {
            return false;
        }
        com.smartdigimkt.w6.f fVar = this.g;
        if (((fVar instanceof com.smartdigimkt.w6.d) && !TextUtils.isEmpty(((com.smartdigimkt.w6.d) fVar).W0())) || this.f38034i.f39173w) {
            return false;
        }
        com.smartdigimkt.r3.d.a(this.g, this.f38033h);
        return true;
    }

    private void h() {
        int iMin;
        List<String> listO;
        com.smartdigimkt.v6.a aVar = this.f38034i;
        if (aVar != null && aVar.t != null) {
            Context contextK = com.smartdigimkt.m6.b.p().k();
            try {
                iMin = Math.min(contextK.getResources().getDisplayMetrics().widthPixels, contextK.getResources().getDisplayMetrics().heightPixels) / 2;
            } catch (Throwable unused) {
                iMin = 0;
            }
            if (String.valueOf(this.f38034i.f39164b).equals("1") && !this.g.r0() && this.f38034i.t.X0() != 1) {
                com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
                int iW0 = this.f38034i.t.W0();
                if (iW0 == 2) {
                    listO = aVarB.o();
                } else if (iW0 != 3) {
                    listO = iW0 != 5 ? null : aVarB.q();
                } else {
                    listO = aVarB.s();
                }
                if (listO != null && listO.size() > 0) {
                    for (String str : listO) {
                        if (!TextUtils.isEmpty(str) && !com.smartdigimkt.r3.d.a(str, 3)) {
                            com.smartdigimkt.d7.b.a(contextK).a(new com.smartdigimkt.d7.e(3, str), iMin, iMin, null);
                        }
                    }
                }
            }
            if (this.f38034i.t.l1() == 1 && !TextUtils.isEmpty(this.f38034i.t.d1())) {
                com.smartdigimkt.d7.b.a(contextK).a(new com.smartdigimkt.d7.e(3, this.f38034i.t.d1()), iMin, iMin, null);
            }
            if (this.f38034i.t.V() == 4 && !TextUtils.isEmpty(this.f38034i.t.H0()) && !com.smartdigimkt.d7.d.c().e(3, l.b(this.f38034i.t.H0()))) {
                this.f38034i.t.H0();
                new com.smartdigimkt.r3.a(this.f38034i.t.H0()).f();
            }
        }
        List<String> listB = this.g.b(this.f38033h, this.f38034i.f39173w);
        if (listB == null || listB.isEmpty()) {
            return;
        }
        for (String str2 : listB) {
            if (!TextUtils.isEmpty(str2)) {
                com.smartdigimkt.r3.d.a(str2, 3);
                if (!com.smartdigimkt.r3.d.a(str2, 3)) {
                    com.google.firebase.crashlytics.internal.model.a.g().a(new com.smartdigimkt.d7.e(3, str2), new e());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        com.smartdigimkt.r3.e.a().b(this);
        com.smartdigimkt.h7.e.b().a(this.k);
    }

    private void j() {
        com.smartdigimkt.h7.e.b().a(this.k, this.f38031c);
    }

    private void b() {
        if (this.g.F() <= 0 && this.g.D() <= 0) {
            com.smartdigimkt.l7.b.a().b((Runnable) new b(), 4);
            return;
        }
        this.g.F();
        this.g.D();
        a(3);
    }

    public void c() {
        List<String> listA = this.g.a(this.f38033h, this.f38034i.f39173w);
        listA.size();
        if (listA.size() > 0) {
            for (int i2 = 0; i2 < listA.size(); i2++) {
                String str = listA.get(i2);
                if (!com.smartdigimkt.r3.d.b(str)) {
                    new com.smartdigimkt.r3.f(this.f38029a, this.f38030b, this.g, str).f();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    public void a(h hVar) {
        int i2;
        boolean zG;
        com.smartdigimkt.w6.f fVar = this.g;
        if (fVar != null && this.j != null) {
            this.d = fVar.L();
            this.f = hVar;
            j();
            int iN = this.g.N();
            int i3 = this.f38034i.f39164b;
            if (iN == 1) {
                boolean zF = f();
                this.f38036n = zF;
                i2 = zF ? 2 : 1;
                zG = g();
                this.o = zG;
                if (zG) {
                    i2++;
                }
                if ((i3 != 1 || i3 == 3 || i3 == 4) && iN == 3) {
                    i2++;
                    a();
                }
                this.j.a(i2);
                d();
            } else if (iN == 2) {
                this.f38035l = false;
                if (this.f38033h != null) {
                    boolean z2 = i3 == 1 || i3 == 3;
                    this.j.a(1);
                    if (z2) {
                        this.j.a(2);
                        d();
                    }
                    if (this.f38035l) {
                        return;
                    } else {
                        a(this.f38033h.Q1());
                    }
                }
            } else if (iN == 3) {
                boolean zF2 = f();
                this.f38036n = zF2;
                if (zF2) {
                }
                zG = g();
                this.o = zG;
                if (zG) {
                    i2++;
                }
                if (i3 != 1) {
                    i2++;
                    a();
                } else {
                    i2++;
                    a();
                }
                this.j.a(i2);
                d();
            }
            h();
            return;
        }
        a(com.smartdigimkt.v3.i.a("-9999", "mraid params error!"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:42:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void a(String str) {
        int i2;
        int i3;
        IOException e2;
        int i4;
        InputStream inputStream = null;
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(2000);
            uRLConnectionOpenConnection.setReadTimeout(5000);
            InputStream inputStream2 = uRLConnectionOpenConnection.getInputStream();
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStream2, null, options);
                i3 = options.outWidth;
                try {
                    i4 = options.outHeight;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e3) {
                            e2 = e3;
                            e2.printStackTrace();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream = inputStream2;
                    i2 = i3;
                    try {
                        th.getMessage();
                        th.printStackTrace();
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e4) {
                                i3 = i2;
                                e2 = e4;
                                i4 = 0;
                                e2.printStackTrace();
                            }
                        }
                        i3 = i2;
                        i4 = 0;
                    } catch (Throwable th2) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = inputStream2;
                i2 = 0;
                th.getMessage();
                th.printStackTrace();
                if (inputStream != null) {
                    inputStream.close();
                }
                i3 = i2;
                i4 = 0;
                if (i3 < 0) {
                    i3 = 0;
                }
                int i5 = i4 >= 0 ? i4 : 0;
                this.g.f(i3);
                this.g.e(i5);
            }
        } catch (Throwable th4) {
            th = th4;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i4 >= 0) {
        }
        this.g.f(i3);
        this.g.e(i5);
    }

    private void a(boolean z2) {
        String strA = com.smartdigimkt.g5.i.a(this.f38034i, this.g);
        if (TextUtils.isEmpty(strA)) {
            a(com.smartdigimkt.v3.i.a("Incomplete resource allocation!", "Mraid Html or url is empty."));
        } else if (!z2) {
            a(2);
        } else {
            com.smartdigimkt.l7.b.a().e(new d(com.smartdigimkt.r3.d.a(this.f38034i, this.g), strA));
        }
    }

    @Override // com.smartdigimkt.r3.e.a
    public void a(String str, int i2) {
        this.f38032e.size();
        synchronized (this) {
            try {
                com.smartdigimkt.r3.d.b(str, i2);
                List<String> list = this.f38032e;
                if (list != null && list.contains(str) && (!this.g.b(str) || this.f38033h.F0() <= i2)) {
                    this.f38032e.remove(str);
                    if (this.g.b(str)) {
                        com.smartdigimkt.r3.h.a(this.g, this.f38033h);
                    }
                    if (this.f38032e.isEmpty()) {
                        a(1);
                        return;
                    }
                    if (com.smartdigimkt.m3.i.c(this.g, this.f38034i)) {
                        String strS = this.g.s();
                        if (TextUtils.equals(String.valueOf(this.f38034i.t.Z()), "2")) {
                            strS = this.g.a(this.f38033h);
                        }
                        if (this.g.b(str) && !TextUtils.isEmpty(strS)) {
                            this.f38032e.remove(strS);
                            if (this.f38032e.isEmpty()) {
                                a(1);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.smartdigimkt.r3.e.a
    public void a(String str, com.smartdigimkt.v3.h hVar) {
        this.f38032e.size();
        hVar.c();
        synchronized (this) {
            byte b2 = -1;
            try {
                com.smartdigimkt.r3.d.b(str, -1);
                List<String> list = this.f38032e;
                if (list != null) {
                    list.remove(str);
                }
                if (this.g.b(str) && com.smartdigimkt.m3.i.c(this.g, this.f38034i)) {
                    com.smartdigimkt.i7.d.a(this.f38034i, this.g, 1, hVar.c());
                }
                String strValueOf = String.valueOf(this.f38034i.t.Z());
                switch (strValueOf.hashCode()) {
                    case 48:
                        if (strValueOf.equals("0")) {
                            b2 = 2;
                        }
                        break;
                    case 49:
                        if (strValueOf.equals("1")) {
                            b2 = 0;
                        }
                        break;
                    case 50:
                        if (strValueOf.equals("2")) {
                            b2 = 4;
                        }
                        break;
                    case AD_REWARD_USER_VALUE:
                        if (strValueOf.equals("3")) {
                            b2 = 1;
                        }
                        break;
                    case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                        if (strValueOf.equals("4")) {
                            b2 = 3;
                        }
                        break;
                }
                if (b2 == 0 || b2 == 1) {
                    a(hVar);
                } else if (b2 == 2) {
                    a(1);
                } else if (b2 == 3 || b2 == 4) {
                    String strS = this.g.s();
                    if (TextUtils.equals(String.valueOf(this.f38034i.t.Z()), "2")) {
                        strS = this.g.a(this.f38033h);
                    }
                    if (!this.g.b(str) && (TextUtils.isEmpty(strS) || !TextUtils.equals(strS, str))) {
                        a(hVar);
                        return;
                    }
                    if (TextUtils.isEmpty(strS)) {
                        a(hVar);
                        return;
                    }
                    if (this.g.b(str) && this.f38032e.size() == 0) {
                        a(1);
                        return;
                    }
                    List<String> list2 = this.f38032e;
                    if (list2 == null || (!list2.contains(this.g.k0()) && !this.f38032e.contains(this.g.s()))) {
                        a(hVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2) {
        boolean z2 = this.f38036n;
        if (i2 == 1 && !this.m) {
            this.m = true;
            if (z2) {
                b();
            }
            if (this.o) {
                e();
            }
        }
        com.smartdigimkt.n3.e<Void, com.smartdigimkt.v3.h> eVar = this.j;
        if (eVar != null) {
            eVar.a(null, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.smartdigimkt.v3.h hVar) {
        hVar.c();
        this.f38035l = true;
        com.smartdigimkt.n3.e<Void, com.smartdigimkt.v3.h> eVar = this.j;
        if (eVar != null) {
            eVar.a(hVar);
        }
    }

    private void a() {
        String strV = this.g.v();
        if (TextUtils.isEmpty(strV)) {
            a(5);
            return;
        }
        com.smartdigimkt.e7.a.a(com.smartdigimkt.m6.b.p().k()).a(strV, new f(this.f38033h.d0(), System.currentTimeMillis(), this.f38033h.f0() == 1));
    }
}

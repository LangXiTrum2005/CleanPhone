package sg.bigo.ads.common.p;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.p004ironsource.cs;
import com.thinkup.core.common.om.n;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected sg.bigo.ads.common.h.a.a f47365b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<String, C0847a> f47364a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<C0847a> f47367e = new CopyOnWriteArrayList();
    private long f = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Handler f47366c = new Handler(Looper.getMainLooper());
    final byte[] d = new byte[0];

    /* JADX INFO: renamed from: sg.bigo.ads.common.p.a$a, reason: collision with other inner class name */
    public class C0847a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f47389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f47390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile boolean f47391c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f47392e;
        private final List<g> f;

        private C0847a(String str, String str2, boolean z2, g gVar) {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            this.f47391c = false;
            this.f47389a = str;
            this.f47390b = str2;
            this.f47392e = z2;
            arrayList.add(gVar);
        }

        public final void a(Executor executor, final Context context) {
            if (this.f47391c) {
                return;
            }
            this.f47391c = true;
            sg.bigo.ads.common.u.b.a aVar = new sg.bigo.ads.common.u.b.a(sg.bigo.ads.common.y.a.a(), new sg.bigo.ads.common.u.b.d(this.f47389a), this.f47392e, context);
            if (executor == null) {
                executor = sg.bigo.ads.common.u.a.e.h();
            }
            aVar.k = executor;
            sg.bigo.ads.common.u.g.a(aVar, new sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.a, sg.bigo.ads.common.u.c.a>() { // from class: sg.bigo.ads.common.p.a.a.2
                @Override // sg.bigo.ads.common.u.b
                public final /* bridge */ /* synthetic */ sg.bigo.ads.common.u.c.c a(sg.bigo.ads.common.u.c.a aVar2) {
                    return aVar2;
                }

                @Override // sg.bigo.ads.common.u.b
                public final /* synthetic */ void a(sg.bigo.ads.common.u.b.c cVar, sg.bigo.ads.common.u.c.c cVar2) {
                    sg.bigo.ads.common.u.c.a aVar2 = (sg.bigo.ads.common.u.c.a) cVar2;
                    C0847a.this.f47391c = false;
                    String strA = aVar2.a("Content-Type");
                    p005e.a.d(0, 4, strA, "Content-Type:", a.this.a());
                    if (Build.VERSION.SDK_INT == 28 && "image/webp".equalsIgnoreCase(strA)) {
                        C0847a.a(C0847a.this, context, 1303, "Not support parsing webp images in Android P.", strA);
                        return;
                    }
                    C0847a c0847a = C0847a.this;
                    String strA2 = a.a(c0847a.f47389a, c0847a.f47390b);
                    a aVar3 = a.this;
                    Context context2 = context;
                    InputStream inputStream = aVar2.f47478b;
                    sg.bigo.ads.common.c cVarA = inputStream == null ? null : aVar3.a(aVar3.a(inputStream, strA2, context2).getPath(), context2);
                    if (cVarA == null) {
                        C0847a.a(C0847a.this, context, 1304, "Failed to parse image.", strA);
                        return;
                    }
                    p005e.a.f(new StringBuilder("mimeType:"), 0, cVarA.f47117b, 4, a.this.a());
                    if (q.a((CharSequence) cVarA.f47117b)) {
                        cVarA.f47117b = strA;
                    }
                    a.this.a(context, strA2, cVarA);
                    C0847a.a(C0847a.this, context, cVarA.f47116a, cVarA.f47117b, sg.bigo.ads.common.utils.f.a(a.this.c(context, strA2), 2), cVarA.f47118c);
                    a.this.d(context);
                }

                @Override // sg.bigo.ads.common.u.b
                public final /* synthetic */ void a(sg.bigo.ads.common.u.b.c cVar, sg.bigo.ads.common.u.h hVar) {
                    C0847a.this.f47391c = false;
                    C0847a.a(C0847a.this, context, hVar.f47491a, hVar.getMessage(), "");
                }
            });
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0847a.class != obj.getClass()) {
                return false;
            }
            return this.f47389a.equals(((C0847a) obj).f47389a);
        }

        public /* synthetic */ C0847a(a aVar, String str, String str2, boolean z2, g gVar, byte b2) {
            this(str, str2, z2, gVar);
        }

        public static /* synthetic */ void a(C0847a c0847a, Context context, int i2, String str, String str2) {
            synchronized (a.this.d) {
                try {
                    sg.bigo.ads.common.t.a.a(0, 5, a.this.a(), "Failed to download image: " + c0847a.f47389a);
                    Iterator<g> it = c0847a.f.iterator();
                    while (it.hasNext()) {
                        it.next().a(i2, str, str2);
                    }
                    a.this.f47364a.remove(c0847a.f47389a);
                    a.this.c(context);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public static /* synthetic */ void a(C0847a c0847a, Context context, final Bitmap bitmap, final String str, final long j, final String str2) {
            synchronized (a.this.d) {
                try {
                    sg.bigo.ads.common.t.a.a(0, 4, a.this.a(), "Succeed to download image: " + c0847a.f47389a);
                    for (final g gVar : c0847a.f) {
                        a.this.f47366c.post(new Runnable() { // from class: sg.bigo.ads.common.p.a.a.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                gVar.a(bitmap, new f(1, str, j, str2, C0847a.this.f47389a));
                            }
                        });
                    }
                    a.this.f47364a.remove(c0847a.f47389a);
                    a.this.c(context);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void a(g gVar) {
            synchronized (a.this.d) {
                this.f.add(gVar);
            }
        }
    }

    public final File a(InputStream inputStream, String str, Context context) throws Throwable {
        FileOutputStream fileOutputStream;
        Throwable th;
        String strB = b(context);
        sg.bigo.ads.common.utils.f.a(strB, str);
        File file = new File(strB, str);
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i2 = inputStream.read(bArr);
                    if (i2 == -1) {
                        fileOutputStream.flush();
                        sg.bigo.ads.common.utils.g.a((Closeable) inputStream);
                        sg.bigo.ads.common.utils.g.a(fileOutputStream);
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i2);
                }
            } catch (IOException unused) {
                fileOutputStream2 = fileOutputStream;
                sg.bigo.ads.common.utils.g.a((Closeable) inputStream);
                sg.bigo.ads.common.utils.g.a(fileOutputStream2);
                return file;
            } catch (Throwable th2) {
                th = th2;
                sg.bigo.ads.common.utils.g.a((Closeable) inputStream);
                sg.bigo.ads.common.utils.g.a(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            fileOutputStream = null;
            th = th3;
        }
    }

    public abstract String a();

    public abstract sg.bigo.ads.common.c a(Context context, String str);

    public abstract void a(Context context);

    public abstract void a(Context context, String str, sg.bigo.ads.common.c cVar);

    public abstract int b();

    public abstract String b(Context context);

    public abstract void b(Context context, String str);

    public abstract String c(Context context, String str);

    public final synchronized void c(final Context context) {
        try {
            if (this.f47367e.isEmpty()) {
                return;
            }
            sg.bigo.ads.common.t.a.a(0, 3, a(), "scheduleDownload");
            while (this.f47364a.size() < this.f47365b.f47262a) {
                if (this.f47367e.isEmpty()) {
                    return;
                }
                final C0847a c0847aRemove = this.f47367e.remove(0);
                this.f47364a.put(c0847aRemove.f47389a, c0847aRemove);
                sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.common.p.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        c0847aRemove.a(null, context);
                    }
                });
            }
            sg.bigo.ads.common.t.a.a(0, 3, a(), "Current size of waiting list: " + this.f47367e.size());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(final Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f > n.m) {
            this.f = jCurrentTimeMillis;
            sg.bigo.ads.common.n.d.a(0, new Runnable() { // from class: sg.bigo.ads.common.p.a.5
                @Override // java.lang.Runnable
                public final void run() {
                    a.a(a.this, context);
                }
            });
        }
    }

    public final void e(Context context) {
        synchronized (this.d) {
            this.f47367e.clear();
            this.f47364a.clear();
            a(context);
        }
    }

    public static String a(String str, String str2) {
        return !TextUtils.isEmpty(str2) ? str2 : String.valueOf(str.hashCode());
    }

    public final boolean d(Context context, String str) {
        String strA = a(str, (String) null);
        return a(context, strA) != null || sg.bigo.ads.common.utils.f.b(c(context, strA));
    }

    public final sg.bigo.ads.common.c a(String str, Context context) {
        return this instanceof d ? sg.bigo.ads.common.utils.d.b(str) : sg.bigo.ads.common.utils.d.b(str, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, Executor executor, String str, String str2, boolean z2, g gVar) {
        String str3;
        String str4;
        int i2;
        if (!URLUtil.isNetworkUrl(str)) {
            str3 = "Unknown scheme.";
            str4 = "";
            i2 = cs.c.INSTANCE_AUCTION_FAILED;
        } else {
            if (!this.f47365b.b()) {
                sg.bigo.ads.common.t.a.a(0, 3, a(), "Obtain the bitmap through network.");
                synchronized (this.d) {
                    try {
                        if (this.f47364a.containsKey(str)) {
                            sg.bigo.ads.common.t.a.a(0, 3, a(), "The target url is already in the requesting list: ".concat(String.valueOf(str)));
                            C0847a c0847a = this.f47364a.get(str);
                            if (c0847a != null) {
                                c0847a.a(gVar);
                            }
                        } else {
                            C0847a c0847a2 = new C0847a(this, str, str2, z2, gVar, (byte) 0);
                            int iIndexOf = this.f47367e.indexOf(c0847a2);
                            if (iIndexOf >= 0) {
                                sg.bigo.ads.common.t.a.a(0, 3, a(), "The target url is already in the waiting list: ".concat(String.valueOf(str)));
                                C0847a c0847a3 = this.f47367e.get(iIndexOf);
                                c0847a3.a(gVar);
                                if (executor != null) {
                                    this.f47367e.remove(c0847a3);
                                    a(context, executor, c0847a3);
                                }
                            } else if (executor != null) {
                                a(context, executor, c0847a2);
                            } else {
                                this.f47367e.add(c0847a2);
                                c(context);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            str3 = "Unable to download image.";
            str4 = "";
            i2 = com.smartdigimkt.d2.a.n0;
        }
        gVar.a(i2, str3, str4);
    }

    public final void a(final Context context, final Executor executor, final String str, final boolean z2, final g gVar) {
        String strA = a(str, (String) null);
        final sg.bigo.ads.common.c cVarA = a(context, strA);
        if (cVarA != null) {
            if (!cVarA.f47116a.isRecycled()) {
                p005e.a.f(new StringBuilder("Get bitmap from cache, mimeType="), 0, cVarA.f47117b, 3, a());
                this.f47366c.post(new Runnable() { // from class: sg.bigo.ads.common.p.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        g gVar2 = gVar;
                        sg.bigo.ads.common.c cVar = cVarA;
                        gVar2.a(cVar.f47116a, new f(2, cVar.f47117b, 0L, cVar.f47118c, str));
                    }
                });
                return;
            }
            b(context, strA);
        }
        if (!sg.bigo.ads.common.utils.f.b(c(context, strA))) {
            a(context, executor, str, null, z2, gVar);
            return;
        }
        final String strA2 = a(str, (String) null);
        final String strC = c(context, strA2);
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.common.p.a.2
            final /* synthetic */ String g = null;

            @Override // java.lang.Runnable
            public final void run() {
                final sg.bigo.ads.common.c cVarA2 = a.this.a(strC, context);
                if (cVarA2 == null) {
                    a.this.a(context, executor, str, this.g, z2, gVar);
                    return;
                }
                a.this.a(context, strA2, cVarA2);
                final long jA = sg.bigo.ads.common.utils.f.a(strC, 2);
                p005e.a.f(new StringBuilder("Obtain the bitmap from local file, mimeType="), 0, cVarA2.f47117b, 3, a.this.a());
                a.this.f47366c.post(new Runnable() { // from class: sg.bigo.ads.common.p.a.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        g gVar2 = gVar;
                        sg.bigo.ads.common.c cVar = cVarA2;
                        gVar2.a(cVar.f47116a, new f(0, cVar.f47117b, jA, cVar.f47118c, str));
                    }
                });
                new File(strC).setLastModified(System.currentTimeMillis());
                a.this.d(context);
            }
        });
    }

    private synchronized void a(final Context context, final Executor executor, final C0847a c0847a) {
        if (executor == null || c0847a == null) {
            return;
        }
        this.f47364a.put(c0847a.f47389a, c0847a);
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.common.p.a.3
            @Override // java.lang.Runnable
            public final void run() {
                c0847a.a(executor, context);
            }
        });
    }

    public final void a(sg.bigo.ads.common.h.a.a aVar) {
        this.f47365b = aVar;
    }

    public static /* synthetic */ void a(a aVar, Context context) {
        File[] fileArrListFiles;
        if (sg.bigo.ads.common.n.d.b()) {
            return;
        }
        sg.bigo.ads.common.t.a.a(0, 3, aVar.a(), "Start check and delete expired images.");
        File file = new File(aVar.b(context));
        if (!file.exists() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: sg.bigo.ads.common.p.a.6
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(File file2, File file3) {
                long jLastModified = file2.lastModified() - file3.lastModified();
                if (jLastModified > 0) {
                    return -1;
                }
                return jLastModified == 0 ? 0 : 1;
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis() - aVar.f47365b.d;
        for (int i2 = 0; i2 < fileArrListFiles.length; i2++) {
            File file2 = fileArrListFiles[i2];
            if (i2 >= aVar.b() || file2.lastModified() <= jCurrentTimeMillis) {
                file2.delete();
            }
        }
    }

    public final boolean a(String str) {
        boolean zContainsKey;
        synchronized (this.d) {
            try {
                zContainsKey = this.f47364a.containsKey(str);
                if (!zContainsKey) {
                    Iterator<C0847a> it = this.f47367e.iterator();
                    while (it.hasNext()) {
                        if (TextUtils.equals(it.next().f47389a, str)) {
                            zContainsKey = true;
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zContainsKey;
    }
}

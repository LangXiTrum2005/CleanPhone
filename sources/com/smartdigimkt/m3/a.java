package com.smartdigimkt.m3;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f36554b = "1";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile a f36555c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ConcurrentHashMap<String, List<d>> f36556a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.smartdigimkt.m3.a$a, reason: collision with other inner class name */
    public class RunnableC0536a implements Runnable {
        final /* synthetic */ String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ d f36557Y;

        public RunnableC0536a(String str, d dVar) {
            this.X = str;
            this.f36557Y = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (a.this) {
                try {
                    List<d> arrayList = a.this.f36556a.get(this.X);
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        a.this.f36556a.put(this.X, arrayList);
                    }
                    arrayList.add(this.f36557Y);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public class b implements Runnable {
        final /* synthetic */ String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ d f36558Y;

        public b(String str, d dVar) {
            this.X = str;
            this.f36558Y = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (a.this) {
                try {
                    List<d> list = a.this.f36556a.get(this.X);
                    if (list != null) {
                        list.remove(this.f36558Y);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public class c implements Runnable {
        final /* synthetic */ String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ Object f36559Y;

        public c(String str, Object obj) {
            this.X = str;
            this.f36559Y = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (a.this) {
                try {
                    List<d> list = a.this.f36556a.get(this.X);
                    if (list == null) {
                        return;
                    }
                    for (d dVar : list) {
                        if (dVar != null) {
                            dVar.a(this.X, this.f36559Y);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public interface d {
        void a(String str, Object obj);
    }

    private a() {
    }

    public static a a() {
        if (f36555c == null) {
            synchronized (a.class) {
                try {
                    if (f36555c == null) {
                        f36555c = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f36555c;
    }

    public synchronized void b(String str, d dVar) {
        if (!TextUtils.isEmpty(str) && dVar != null) {
            com.smartdigimkt.l7.b.a().g(new b(str, dVar));
        }
    }

    public synchronized void a(String str, d dVar) {
        if (!TextUtils.isEmpty(str) && dVar != null) {
            com.smartdigimkt.l7.b.a().g(new RunnableC0536a(str, dVar));
        }
    }

    public synchronized void a(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.smartdigimkt.l7.b.a().g(new c(str, obj));
    }
}

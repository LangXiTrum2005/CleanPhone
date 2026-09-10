package com.bykv.vk.openvk.preload.geckox;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b {
    private static IThreadPoolCallback r;
    private static ThreadPoolExecutor s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.geckox.a.a.c f12915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IStatisticMonitor f12916c;
    private final INetWork d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f12917e;
    private final List<String> f;
    private final com.bykv.vk.openvk.preload.geckox.a.a.a g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Long f12918h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f12919i;
    private final String j;
    private final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f12920l;
    private final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final File f12921n;
    private final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f12922p;
    private JSONObject q;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private INetWork f12923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<String> f12924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<String> f12925c;
        private Context d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.geckox.a.a.c f12926e;
        private IStatisticMonitor f;
        private boolean g = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.geckox.a.a.a f12927h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Long f12928i;
        private String j;
        private String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f12929l;
        private File m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f12930n;
        private String o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f12931p;

        public a(Context context) {
            this.d = context.getApplicationContext();
        }

        public final a a(String... strArr) {
            this.f12925c = Arrays.asList(strArr);
            return this;
        }

        public final a b(String... strArr) {
            this.f12924b = Arrays.asList(strArr);
            return this;
        }

        public final a c(String str) {
            this.f12929l = str;
            return this;
        }

        public final a a(INetWork iNetWork) {
            this.f12923a = iNetWork;
            return this;
        }

        public final a b() {
            this.f12928i = 38L;
            return this;
        }

        public final a a(long j) {
            this.f12931p = j;
            return this;
        }

        public final a b(String str) {
            this.k = str;
            return this;
        }

        public final a a(IStatisticMonitor iStatisticMonitor) {
            this.f = iStatisticMonitor;
            return this;
        }

        public final a a() {
            this.g = false;
            return this;
        }

        public final a a(com.bykv.vk.openvk.preload.geckox.a.a.a aVar) {
            this.f12927h = aVar;
            return this;
        }

        public final a a(String str) {
            this.j = str;
            return this;
        }

        public final a a(File file) {
            this.m = file;
            return this;
        }
    }

    public /* synthetic */ b(a aVar, byte b2) {
        this(aVar);
    }

    public static Executor g() {
        return t();
    }

    public static Executor h() {
        return t();
    }

    public static ExecutorService t() {
        IThreadPoolCallback iThreadPoolCallback = r;
        ExecutorService threadPool = iThreadPoolCallback != null ? iThreadPoolCallback.getThreadPool() : null;
        if (threadPool != null) {
            return threadPool;
        }
        if (s == null) {
            synchronized (b.class) {
                try {
                    if (s == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                        s = threadPoolExecutor;
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return s;
    }

    public final Context a() {
        return this.f12914a;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.a b() {
        return this.g;
    }

    public final boolean c() {
        return this.o;
    }

    public final List<String> d() {
        return this.f;
    }

    public final List<String> e() {
        return this.f12917e;
    }

    public final JSONObject f() {
        return this.q;
    }

    public final INetWork i() {
        return this.d;
    }

    public final String j() {
        return this.k;
    }

    public final long k() {
        return this.f12918h.longValue();
    }

    public final String l() {
        return this.m;
    }

    public final String m() {
        return this.f12920l;
    }

    public final File n() {
        return this.f12921n;
    }

    public final String o() {
        return this.f12919i;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.c p() {
        return this.f12915b;
    }

    public final IStatisticMonitor q() {
        return this.f12916c;
    }

    public final String r() {
        return this.j;
    }

    public final long s() {
        return this.f12922p;
    }

    private b(a aVar) {
        Context context = aVar.d;
        this.f12914a = context;
        if (context == null) {
            throw new IllegalArgumentException("context == null");
        }
        List<String> list = aVar.f12924b;
        this.f12917e = list;
        this.f = aVar.f12925c;
        this.f12915b = aVar.f12926e;
        this.g = aVar.f12927h;
        Long l2 = aVar.f12928i;
        this.f12918h = l2;
        if (TextUtils.isEmpty(aVar.j)) {
            this.f12919i = com.bykv.vk.openvk.preload.geckox.utils.a.a(context);
        } else {
            this.f12919i = aVar.j;
        }
        String str = aVar.k;
        this.j = str;
        this.f12920l = aVar.f12930n;
        this.m = aVar.o;
        this.f12922p = aVar.f12931p;
        if (aVar.m == null) {
            this.f12921n = new File(context.getFilesDir(), "gecko_offline_res_x");
        } else {
            this.f12921n = aVar.m;
        }
        String str2 = aVar.f12929l;
        this.k = str2;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("host == null");
        }
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("access key empty");
        }
        if (l2 == null) {
            throw new IllegalArgumentException("appId == null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("deviceId key empty");
        }
        this.d = aVar.f12923a;
        this.f12916c = aVar.f;
        this.o = aVar.g;
    }

    public final void a(JSONObject jSONObject) {
        this.q = jSONObject;
    }

    public static void a(IThreadPoolCallback iThreadPoolCallback) {
        r = iThreadPoolCallback;
    }
}

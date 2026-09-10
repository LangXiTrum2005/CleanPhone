package com.smartdigimkt.r7;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a {
    private static volatile a j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38118a = "a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38119b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f38120c = 2;
    private final int d = 60000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicLong f38121e = new AtomicLong(0);
    private final AtomicLong f = new AtomicLong(0);
    private final AtomicBoolean g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f38122h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f38123i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.smartdigimkt.r7.a$a, reason: collision with other inner class name */
    public class RunnableC0578a implements Runnable {
        final /* synthetic */ Context X;

        public RunnableC0578a(Context context) {
            this.X = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.smartdigimkt.s6.c cVarB = com.smartdigimkt.m6.b.p().b();
                if (cVarB != null) {
                    a.this.g.set(cVarB.initPlugin(this.X));
                    a.this.a(this.X);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public class b implements Runnable {
        final /* synthetic */ Context X;

        public b(Context context) {
            this.X = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String unused = a.this.f38118a;
                a.this.g.get();
                a.this.f38122h.get();
                a.this.f38123i.get();
                if (a.this.g.get() && a.this.f38123i.get() && a.this.f38122h.get()) {
                    Intent intentB = a.this.b(this.X);
                    intentB.putExtra("a", 1);
                    com.smartdigimkt.s6.b.a(this.X).a(intentB);
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public class c implements Runnable {
        final /* synthetic */ Context X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f38126Y;

        public c(Context context, String str) {
            this.X = context;
            this.f38126Y = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Intent intentB = a.this.b(this.X);
                intentB.putExtra("a", 2);
                intentB.putExtra("d", this.f38126Y);
                com.smartdigimkt.s6.b.a(this.X).a(intentB);
            } catch (Throwable unused) {
            }
        }
    }

    public class d implements Runnable {
        final /* synthetic */ Context X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f38127Y;

        public d(Context context, String str) {
            this.X = context;
            this.f38127Y = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Intent intentB = a.this.b(this.X);
                intentB.putExtra("a", 3);
                intentB.putExtra("d", this.f38127Y);
                com.smartdigimkt.s6.b.a(this.X).a(intentB);
            } catch (Throwable unused) {
            }
        }
    }

    public class e implements Runnable {
        final /* synthetic */ Context X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ boolean f38128Y;

        public e(Context context, boolean z2) {
            this.X = context;
            this.f38128Y = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.g.get()) {
                try {
                    Intent intentB = a.this.b(this.X);
                    intentB.putExtra("a", 4);
                    intentB.putExtra("d", this.f38128Y ? "1" : "2");
                    com.smartdigimkt.s6.b.a(this.X).a(intentB);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public class f implements Runnable {
        final /* synthetic */ int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ Context f38129Y;
        final /* synthetic */ Bundle Z;

        public f(int i2, Context context, Bundle bundle) {
            this.X = i2;
            this.f38129Y = context;
            this.Z = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (a.this.g.get() && a.this.f38123i.get()) {
                    int i2 = this.X;
                    if (i2 == 5 || i2 == 6 || i2 == 7) {
                        Intent intentB = a.this.b(this.f38129Y);
                        intentB.putExtra("a", this.X);
                        intentB.putExtra("b", this.Z);
                        com.smartdigimkt.s6.b.a(this.f38129Y).a(intentB);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private a() {
    }

    public void c(Context context) {
        com.smartdigimkt.l7.b.a().b((Runnable) new RunnableC0578a(context), 7);
    }

    public void d(Context context) {
        com.smartdigimkt.l8.a aVarB;
        if (context == null || (aVarB = com.smartdigimkt.k8.a.e().b()) == null || aVarB.M0()) {
            return;
        }
        this.f38123i.set(aVarB.i0() != 2);
        this.f38122h.set(true);
        a(context);
    }

    public static a a() {
        if (j == null) {
            synchronized (a.class) {
                try {
                    if (j == null) {
                        j = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return j;
    }

    public void b(Context context, JSONObject jSONObject) {
        String string;
        if (context == null || jSONObject == null || !this.g.get()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.f38121e.get();
        if (jCurrentTimeMillis - j2 <= ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS || !this.f38121e.compareAndSet(j2, jCurrentTimeMillis)) {
            return;
        }
        try {
            string = jSONObject.toString();
        } catch (Throwable unused) {
            string = "";
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        com.smartdigimkt.l7.b.a().g(new c(context, string));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        com.smartdigimkt.l7.b.a().g(new b(context));
    }

    public void a(Context context, JSONObject jSONObject) {
        String string;
        if (context == null || jSONObject == null || !this.g.get()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.f.get();
        if (jCurrentTimeMillis - j2 <= ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS || !this.f.compareAndSet(j2, jCurrentTimeMillis)) {
            return;
        }
        try {
            string = jSONObject.toString();
        } catch (Throwable unused) {
            string = "";
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        com.smartdigimkt.l7.b.a().g(new d(context, string));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Intent b(Context context) {
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(this.f38119b)) {
            String strM = "";
            for (int i2 = 0; i2 < 2; i2++) {
                strM = android.support.v4.media.a.m(strM, packageName);
            }
            this.f38119b = com.smartdigimkt.n8.e.a(com.smartdigimkt.n8.b.f(strM));
        }
        Intent intent = new Intent(this.f38119b);
        intent.setPackage(packageName);
        intent.putExtra("s", 2);
        return intent;
    }

    public void a(Context context, boolean z2) {
        com.smartdigimkt.l7.b.a().g(new e(context, z2));
    }

    public void a(Context context, int i2, Bundle bundle) {
        com.smartdigimkt.l7.b.a().g(new f(i2, context, bundle));
    }
}

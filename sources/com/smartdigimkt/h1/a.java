package com.smartdigimkt.h1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.smartdigimkt.c3.j;
import com.smartdigimkt.c3.n;
import com.smartdigimkt.v0.p;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.v0.x;
import com.smartdigimkt.v0.y;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a implements com.smartdigimkt.c5.b {
    private static final String U0 = "RewardVideoController";
    private static final int V0 = 25;
    public static final int W0 = 1;
    public static final int X0 = 8;
    public static final int Y0 = 9;
    public static final int Z0 = 16;
    public static final int a1 = 18;
    public static final int b1 = 17;
    public static final int c1 = 1001001;
    public static final int d1 = 1001002;
    public static String e1 = null;
    public static String f1 = "";
    private static ConcurrentHashMap<String, Integer> g1 = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<String, e> h1 = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, String> i1 = new ConcurrentHashMap<>();
    c C0;
    private Queue<Integer> D0;
    private String E0;
    private CopyOnWriteArrayList<com.smartdigimkt.x.d> N0;
    private List<com.smartdigimkt.x.d> O0;
    private Context X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private com.smartdigimkt.g1.d f35612Y;
    private com.smartdigimkt.f3.d Z;
    private com.smartdigimkt.f3.a e0;
    private volatile com.smartdigimkt.e3.a f0;
    private volatile d g0;
    private String h0;
    private String i0;
    private volatile String j0;
    private String k0;
    private String l0;
    private int p0;
    private int q0;
    private int r0;
    private boolean w0;
    private int m0 = 0;
    private int o0 = 2;
    private boolean s0 = false;
    private boolean t0 = false;
    private boolean u0 = false;
    private boolean v0 = false;
    private boolean x0 = false;
    private ArrayList<Integer> y0 = new ArrayList<>(7);
    private boolean z0 = false;
    public volatile boolean A0 = false;
    private final Object B0 = new Object();
    private com.smartdigimkt.v.c F0 = null;
    private volatile boolean G0 = true;
    private volatile boolean H0 = false;
    private volatile boolean I0 = false;
    private volatile boolean J0 = false;
    private volatile boolean K0 = false;
    private volatile boolean L0 = false;
    private volatile boolean M0 = false;
    volatile boolean P0 = false;
    volatile boolean Q0 = false;
    volatile boolean R0 = false;
    volatile boolean S0 = false;
    volatile boolean T0 = false;
    private Handler n0 = new com.smartdigimkt.h1.b(this);

    public class b implements Runnable {
        private com.smartdigimkt.g1.d X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        private int f35613Y;
        private boolean Z;
        private boolean e0 = false;

        public b(com.smartdigimkt.g1.d dVar, int i2, boolean z2) {
            this.X = dVar;
            this.f35613Y = i2;
            this.Z = z2;
            if (dVar != null) {
                dVar.c(false);
            }
        }

        public void b() {
            this.e0 = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.e0) {
                return;
            }
            com.smartdigimkt.g1.d dVar = this.X;
            if (dVar != null) {
                dVar.c(true);
            }
            a.this.b("v3 is timeout");
        }
    }

    public class c implements com.smartdigimkt.g1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.smartdigimkt.g1.d f35614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f35615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f35616c;

        public c(com.smartdigimkt.g1.d dVar, boolean z2) {
            this.f35614a = dVar;
            this.f35615b = z2;
        }

        public Runnable a() {
            return this.f35616c;
        }

        public void a(b bVar) {
            this.f35616c = bVar;
        }

        @Override // com.smartdigimkt.g1.b
        public void a(String str) {
            b bVar = this.f35616c;
            if (bVar != null) {
                bVar.b();
                a.this.n0.removeCallbacks(this.f35616c);
            }
            if (a.this.g0 != null) {
                a.this.g0.a(a.this.j0, a.this.i0);
            }
        }

        @Override // com.smartdigimkt.g1.b
        public void a(List<com.smartdigimkt.x.d> list) {
            if (this.f35616c != null) {
                a.this.n0.removeCallbacks(this.f35616c);
            }
            if (a.this.g0 != null) {
                a.this.g0.c(a.this.j0, a.this.i0);
            }
        }

        @Override // com.smartdigimkt.g1.b
        public void a(List<com.smartdigimkt.x.d> list, com.smartdigimkt.y.c cVar) {
            b bVar = this.f35616c;
            if (bVar != null) {
                bVar.b();
                a.this.n0.removeCallbacks(this.f35616c);
            }
            com.smartdigimkt.g1.d dVar = this.f35614a;
            if (dVar != null) {
                dVar.a((com.smartdigimkt.g1.b) null);
                this.f35614a = null;
            }
            if (a.this.g0 != null) {
                a.this.g0.a(cVar != null ? cVar.j() : "unknown reason");
            }
        }
    }

    public final class d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f35617h = "RewardVideoController_Listener";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f35618i = 0;
        private static final int j = 1;
        private static final int k = 2;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f35619l = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<com.smartdigimkt.e3.a> f35620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile AtomicInteger f35621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f35622c;
        private String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<com.smartdigimkt.x.d> f35623e;
        private boolean f;

        private void b(String str, String str2) {
            this.f35621b.get();
            boolean unused = a.this.I0;
            WeakReference<com.smartdigimkt.e3.a> weakReference = this.f35620a;
            com.smartdigimkt.e3.a aVar = weakReference != null ? weakReference.get() : null;
            if (this.f35622c != null) {
                if (a.this.I0) {
                    this.f35621b.get();
                    boolean unused2 = a.this.I0;
                    return;
                }
                this.f35621b.get();
                boolean unused3 = a.this.I0;
                a.this.I0 = true;
                if (aVar != null) {
                    Message messageObtain = Message.obtain();
                    Bundle bundle = new Bundle();
                    bundle.putString(com.smartdigimkt.b.b.f33814z, str);
                    bundle.putString("unit_id", str2);
                    bundle.putBoolean("is_cached_campaign", true);
                    messageObtain.setData(bundle);
                    messageObtain.obj = str2;
                    messageObtain.what = 17;
                    this.f35622c.sendMessage(messageObtain);
                }
            }
        }

        public void c(String str, String str2) {
            Handler handler = this.f35622c;
            if (handler != null) {
                handler.removeMessages(a.d1);
            }
            WeakReference<com.smartdigimkt.e3.a> weakReference = this.f35620a;
            com.smartdigimkt.e3.a aVar = weakReference != null ? weakReference.get() : null;
            this.f35621b.get();
            boolean unused = a.this.J0;
            if (this.f35621b.get() == 2 || this.f35622c == null) {
                return;
            }
            this.f35621b.set(2);
            if (a.this.J0) {
                this.f35621b.get();
                boolean unused2 = a.this.J0;
                return;
            }
            this.f35621b.get();
            boolean unused3 = a.this.J0;
            a.this.J0 = true;
            if (aVar != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(com.smartdigimkt.b.b.f33814z, str);
                bundle.putString("unit_id", str2);
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 9;
                this.f35622c.sendMessage(messageObtain);
            }
        }

        public void d(String str, String str2) {
            Handler handler = this.f35622c;
            if (handler != null) {
                handler.removeMessages(a.d1);
            }
            this.f35621b.get();
            boolean unused = a.this.J0;
            WeakReference<com.smartdigimkt.e3.a> weakReference = this.f35620a;
            com.smartdigimkt.e3.a aVar = weakReference != null ? weakReference.get() : null;
            if (this.f35621b.get() == 2 || this.f35622c == null) {
                return;
            }
            if (this.f35621b.get() == 1) {
                this.f35621b.set(3);
            }
            if (a.this.J0) {
                this.f35621b.get();
                boolean unused2 = a.this.J0;
                return;
            }
            this.f35621b.get();
            boolean unused3 = a.this.J0;
            a.this.J0 = true;
            if (aVar != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(com.smartdigimkt.b.b.f33814z, str);
                bundle.putString("unit_id", str2);
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 9;
                this.f35622c.sendMessage(messageObtain);
            }
            if (a.this.K0) {
                this.f35621b.set(2);
            }
        }

        private d(com.smartdigimkt.e3.a aVar, Handler handler, String str) {
            this.f35620a = new WeakReference<>(aVar);
            this.f35621b = new AtomicInteger(0);
            this.f35622c = handler;
            this.d = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int a() {
            return this.f35621b.get();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i2) {
            this.f35621b.set(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, String str2) {
            WeakReference<com.smartdigimkt.e3.a> weakReference = this.f35620a;
            com.smartdigimkt.e3.a aVar = weakReference != null ? weakReference.get() : null;
            this.f35621b.get();
            boolean unused = a.this.I0;
            if ((this.f35621b.get() == 1 || this.f35621b.get() == 3) && this.f35622c != null) {
                if (!a.this.I0) {
                    this.f35621b.get();
                    boolean unused2 = a.this.I0;
                    a.this.I0 = true;
                    if (aVar != null) {
                        Message messageObtain = Message.obtain();
                        Bundle bundle = new Bundle();
                        bundle.putString(com.smartdigimkt.b.b.f33814z, str);
                        bundle.putString("unit_id", str2);
                        bundle.putBoolean("is_cached_campaign", false);
                        messageObtain.setData(bundle);
                        messageObtain.obj = str2;
                        messageObtain.what = 17;
                        this.f35622c.sendMessage(messageObtain);
                        return;
                    }
                    return;
                }
                this.f35621b.get();
                boolean unused3 = a.this.I0;
            }
        }

        private void b(String str) {
            WeakReference<com.smartdigimkt.e3.a> weakReference = this.f35620a;
            com.smartdigimkt.e3.a aVar = weakReference != null ? weakReference.get() : null;
            this.f35621b.get();
            boolean unused = a.this.L0;
            if (this.f35621b.get() == 2 || this.f35622c == null) {
                return;
            }
            a.this.L0 = true;
            if (str.contains("resource load timeout")) {
                a.this.K0 = true;
            }
            if (a.this.L0 && a.this.K0 && !a.this.J0) {
                this.f35621b.set(2);
                if (aVar != null) {
                    this.f35621b.get();
                    boolean unused2 = a.this.L0;
                    Message messageObtain = Message.obtain();
                    messageObtain.obj = str;
                    messageObtain.what = 16;
                    this.f35622c.sendMessage(messageObtain);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(String str) {
            this.f35621b.set(2);
            d(str);
        }

        private void d(String str) {
            WeakReference<com.smartdigimkt.e3.a> weakReference = this.f35620a;
            if (weakReference != null) {
                weakReference.get();
            }
            if (this.f35622c != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 18;
                this.f35622c.sendMessage(messageObtain);
            }
        }

        public void a(String str) {
            Handler handler = this.f35622c;
            if (handler != null) {
                handler.removeMessages(a.d1);
            }
            this.f35621b.get();
            boolean unused = a.this.K0;
            WeakReference<com.smartdigimkt.e3.a> weakReference = this.f35620a;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            if ((this.f35621b.get() == 1 || this.f35621b.get() == 3) && this.f35622c != null) {
                a.this.K0 = true;
                if (!a.this.M0 || str.contains("resource load timeout")) {
                    a.this.L0 = true;
                }
                if (a.this.J0) {
                    this.f35621b.set(2);
                }
                if (a.this.K0 && a.this.L0 && !a.this.J0) {
                    this.f35621b.set(2);
                    this.f35621b.get();
                    boolean unused2 = a.this.K0;
                    Message messageObtain = Message.obtain();
                    messageObtain.obj = str;
                    messageObtain.what = 16;
                    this.f35622c.sendMessage(messageObtain);
                    return;
                }
                this.f35621b.get();
                boolean unused3 = a.this.K0;
            }
        }

        public void a(boolean z2) {
            this.f = z2;
        }
    }

    public final class e extends com.smartdigimkt.b2.c {
        private a d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Handler f35624e;
        private int f;

        public void a() {
            a.this.y0.clear();
            this.d = null;
        }

        @Override // com.smartdigimkt.b2.c, com.smartdigimkt.b2.h
        public void onAdCloseWithIVReward(boolean z2, int i2) {
            try {
                a aVar = this.d;
                if (aVar == null || aVar.f0 == null) {
                    return;
                }
                this.d.z0 = false;
                try {
                    this.d.f0.onAdCloseWithIVReward(z2, i2);
                } catch (Exception e2) {
                    if (com.smartdigimkt.b.b.f33800a) {
                        e2.printStackTrace();
                    }
                }
            } catch (Exception e3) {
                if (com.smartdigimkt.b.b.f33800a) {
                    e3.printStackTrace();
                }
            }
        }

        @Override // com.smartdigimkt.b2.c, com.smartdigimkt.b2.h
        public void onAdShow() {
            a.this.A0 = false;
            try {
                a aVar = this.d;
                if (aVar != null) {
                    aVar.z0 = true;
                    if (this.d.f35612Y != null) {
                        this.d.f35612Y.D = "";
                    }
                    this.f33891a = true;
                    if (this.d.f0 != null) {
                        if (a.this.t0) {
                            a.this.a();
                        }
                        this.d.f0.onAdShow();
                        this.f = 2;
                    }
                }
            } catch (Throwable th) {
                if (com.smartdigimkt.b.b.f33800a) {
                    th.printStackTrace();
                }
            }
        }

        @Override // com.smartdigimkt.b2.c, com.smartdigimkt.b2.h
        public void onEndcardShow() {
            try {
                a aVar = this.d;
                if (aVar == null || aVar.f0 == null) {
                    return;
                }
                try {
                    this.d.f0.onEndcardShow();
                    com.smartdigimkt.z.b.b().a("_2", 2);
                } catch (Exception e2) {
                    if (com.smartdigimkt.b.b.f33800a) {
                        e2.printStackTrace();
                    }
                }
                this.f = 6;
            } catch (Exception e3) {
                if (com.smartdigimkt.b.b.f33800a) {
                    e3.printStackTrace();
                }
            }
        }

        @Override // com.smartdigimkt.b2.c, com.smartdigimkt.b2.h
        public void onShowFail(String str) {
            a.this.A0 = false;
            try {
                if (this.d != null) {
                    if (a.this.t0) {
                        a.this.a();
                    }
                    this.d.z0 = false;
                    this.f33892b = true;
                    if (this.d.f0 != null) {
                        try {
                            if (a.this.N0 != null) {
                                a.this.N0.size();
                            }
                        } catch (Exception unused) {
                        }
                        try {
                            this.d.f0.onShowFail(str);
                        } catch (Exception e2) {
                            if (com.smartdigimkt.b.b.f33800a) {
                                e2.printStackTrace();
                            }
                        }
                        this.f = 4;
                    }
                }
            } catch (Exception e3) {
                this.f = 0;
                if (com.smartdigimkt.b.b.f33800a) {
                    e3.printStackTrace();
                }
            }
        }

        @Override // com.smartdigimkt.b2.c, com.smartdigimkt.b2.h
        public void onVideoAdClicked(com.smartdigimkt.x.d dVar) {
            try {
                a aVar = this.d;
                if (aVar == null || aVar.f0 == null) {
                    return;
                }
                try {
                    if (a.this.t0) {
                        a.this.a();
                    }
                    this.d.f0.onVideoAdClicked(dVar);
                } catch (Exception e2) {
                    if (com.smartdigimkt.b.b.f33800a) {
                        e2.printStackTrace();
                    }
                }
            } catch (Exception e3) {
                if (com.smartdigimkt.b.b.f33800a) {
                    e3.printStackTrace();
                }
            }
        }

        @Override // com.smartdigimkt.b2.c, com.smartdigimkt.b2.h
        public void onVideoComplete() {
            try {
                a aVar = this.d;
                if (aVar == null || aVar.f0 == null) {
                    return;
                }
                try {
                    this.d.f0.onVideoComplete();
                } catch (Exception e2) {
                    if (com.smartdigimkt.b.b.f33800a) {
                        e2.printStackTrace();
                    }
                }
                this.f = 5;
            } catch (Exception e3) {
                if (com.smartdigimkt.b.b.f33800a) {
                    e3.printStackTrace();
                }
            }
        }

        private e(a aVar, Handler handler) {
            this.f = 0;
            this.d = aVar;
            this.f35624e = handler;
        }

        @Override // com.smartdigimkt.b2.c, com.smartdigimkt.b2.h
        public void a(boolean z2, com.smartdigimkt.d3.c cVar) {
            try {
                a aVar = this.d;
                if (aVar == null || aVar.f0 == null) {
                    return;
                }
                if (cVar == null) {
                    cVar = com.smartdigimkt.d3.c.a(this.d.l0);
                }
                if (a.this.t0) {
                    a.this.a();
                    a.this.s();
                }
                this.d.f0.onAdClose(z2, cVar.c(), cVar.a());
                this.f = 7;
                this.d.z0 = false;
                a();
            } catch (Exception e2) {
                if (com.smartdigimkt.b.b.f33800a) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public void a() {
    }

    @Override // com.smartdigimkt.c5.b
    public boolean isReady() {
        try {
            if (!b() && !this.t0) {
                return c();
            }
            return false;
        } catch (Throwable th) {
            if (!com.smartdigimkt.b.b.f33800a) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    public boolean p() {
        return this.t0;
    }

    public boolean q() {
        return this.w0;
    }

    public boolean r() {
        return this.s0;
    }

    public void s() {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (!this.z0 || (concurrentHashMap = i1) == null || concurrentHashMap.containsKey(k())) {
            return;
        }
        i1.remove(k());
    }

    public List<com.smartdigimkt.x.d> f() {
        return this.O0;
    }

    public CopyOnWriteArrayList<com.smartdigimkt.x.d> g() {
        return this.N0;
    }

    public String h() {
        return "";
    }

    public d i() {
        return this.g0;
    }

    public String j() {
        return this.j0;
    }

    public String k() {
        com.smartdigimkt.g1.d dVar = this.f35612Y;
        return dVar != null ? dVar.a(this.z0) : "";
    }

    public com.smartdigimkt.g1.d l() {
        return this.f35612Y;
    }

    public com.smartdigimkt.f3.d m() {
        return this.Z;
    }

    public com.smartdigimkt.e3.a n() {
        return this.f0;
    }

    public String o() {
        return this.i0;
    }

    private void e() {
        com.smartdigimkt.g1.d dVar = new com.smartdigimkt.g1.d(this.X, this.j0, this.i0);
        this.f35612Y = dVar;
        dVar.d(this.s0);
        this.f35612Y.e(this.t0);
        if (this.s0) {
            this.f35612Y.a(this.p0, this.q0, this.r0);
        }
        this.f35612Y.a(this.Z);
    }

    public void b(boolean z2) {
        this.t0 = z2;
    }

    public void c(boolean z2) {
        this.x0 = z2;
    }

    public void d() {
        p.b();
    }

    private boolean c() {
        if (this.f35612Y == null) {
            e();
        }
        com.smartdigimkt.g1.d dVar = this.f35612Y;
        if (dVar != null) {
            return dVar.isReady();
        }
        return false;
    }

    public void b(int i2) {
        this.o0 = i2;
    }

    public void a(boolean z2) {
        this.s0 = z2;
    }

    public void b(String str, String str2) {
        try {
            this.X = com.smartdigimkt.m6.b.p().k();
            this.i0 = str2;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.j0 = str;
            this.e0 = com.smartdigimkt.f3.c.b().c();
            p.a();
            n.b().a();
            j.b().a();
            com.smartdigimkt.f3.c.b().a(this.i0, this.s0);
            p.a();
            if (this.F0 == null) {
                this.F0 = com.smartdigimkt.v.c.a(com.smartdigimkt.m6.b.p().k());
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            x.d(this.X, "Anythink_ConfirmTitle" + this.i0, str.trim());
        }
        if (!TextUtils.isEmpty(str2)) {
            x.d(this.X, "Anythink_ConfirmContent" + this.i0, str2.trim());
        }
        if (!TextUtils.isEmpty(str4)) {
            x.d(this.X, "Anythink_CancelText" + this.i0, str4.trim());
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        x.d(this.X, "Anythink_ConfirmText" + this.i0, str3.trim());
    }

    public void a(int i2, int i3, int i4) {
        this.p0 = i2;
        this.q0 = i3;
        if (i3 == com.smartdigimkt.b0.a.y2) {
            this.r0 = i4 < 0 ? 5 : i4;
        }
        if (i3 == com.smartdigimkt.b0.a.x2) {
            this.r0 = i4 < 0 ? 80 : i4;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ivRewardEnable", 1);
            jSONObject.put("ivRewardMode", i2 == com.smartdigimkt.b0.a.v2 ? 0 : 1);
            jSONObject.put("ivRewardPlayValueMode", i3 == com.smartdigimkt.b0.a.x2 ? 0 : 1);
            jSONObject.put("ivRewardPlayValue", i4);
            com.smartdigimkt.n1.b.b().g(this.i0, jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    private void b(com.smartdigimkt.x.e eVar) {
        try {
            a(eVar, 25);
        } catch (Exception e2) {
            try {
                b("load mv api error:" + e2.getMessage());
            } catch (Exception e3) {
                b(com.smartdigimkt.d0.b.f34376b);
                if (com.smartdigimkt.b.b.f33800a) {
                    e3.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (this.g0 != null) {
            this.L0 = true;
            this.g0.a(str);
        }
    }

    private boolean b() {
        try {
            if (this.F0 == null) {
                this.F0 = com.smartdigimkt.v.c.a(com.smartdigimkt.m6.b.p().k());
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static void a(String str, int i2) {
        try {
            if (g1 == null || !y.b(str)) {
                return;
            }
            g1.put(str, Integer.valueOf(i2));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static int a(String str) {
        ConcurrentHashMap<String, Integer> concurrentHashMap;
        Integer num;
        try {
            if (!y.b(str) || (concurrentHashMap = g1) == null || !concurrentHashMap.containsKey(str) || (num = g1.get(str)) == null) {
                return 0;
            }
            return num.intValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static void a(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (concurrentHashMap = i1) == null || concurrentHashMap.containsKey(str)) {
            return;
        }
        i1.put(str, str2);
    }

    public void a(com.smartdigimkt.e3.a aVar) {
        this.f0 = aVar;
        this.g0 = new d(aVar, this.n0, this.i0);
    }

    public void a(com.smartdigimkt.x.e eVar) {
        if (eVar == null) {
            this.g0.c(com.smartdigimkt.d0.b.f);
            return;
        }
        if (this.g0 != null && this.g0.a() == 3) {
            this.G0 = false;
        } else {
            this.G0 = true;
            this.g0.a(1);
        }
        this.w0 = true;
        this.n0.removeMessages(c1);
        this.J0 = false;
        this.I0 = false;
        this.K0 = false;
        this.L0 = false;
        com.smartdigimkt.g1.c.b().c();
        try {
            this.Z = com.smartdigimkt.f3.c.b().a(com.smartdigimkt.u.a.f().a(), this.i0, this.s0);
            if (!TextUtils.isEmpty(this.j0)) {
                this.Z.f(this.j0);
            }
            int iW = this.Z.w() * 1000;
            if (this.n0 != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = d1;
                this.n0.sendMessageDelayed(messageObtain, iW);
            }
            this.D0 = this.Z.O();
            b(eVar);
        } catch (Exception e2) {
            if (this.g0 != null) {
                this.g0.a("load exception");
            }
            if (com.smartdigimkt.b.b.f33800a) {
                e2.printStackTrace();
            }
        }
    }

    private List<com.smartdigimkt.x.d> a(String str, List<com.smartdigimkt.x.d> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0 && !TextUtils.isEmpty(str)) {
            for (com.smartdigimkt.x.d dVar : list) {
                if (dVar != null && str.equals(dVar.e0())) {
                    arrayList.add(dVar);
                }
            }
        }
        return arrayList;
    }

    private void a(com.smartdigimkt.x.e eVar, int i2) {
        try {
            com.smartdigimkt.g1.d dVar = this.f35612Y;
            if (dVar == null || !this.i0.equals(dVar.k())) {
                com.smartdigimkt.g1.d dVar2 = new com.smartdigimkt.g1.d(this.X, this.j0, this.i0);
                this.f35612Y = dVar2;
                dVar2.d(this.s0);
                this.f35612Y.e(this.t0);
            }
            if (this.s0) {
                this.f35612Y.a(this.p0, this.q0, this.r0);
            }
            this.f35612Y.a(this.o0);
            this.f35612Y.a(this.Z);
            b bVar = new b(this.f35612Y, 1, true);
            c cVar = new c(this.f35612Y, true);
            this.C0 = cVar;
            cVar.a(bVar);
            this.f35612Y.a(this.C0);
            this.f35612Y.a(eVar, i2);
        } catch (Exception e2) {
            b(e2.getMessage());
        }
    }

    public com.smartdigimkt.d3.b a(int i2) {
        com.smartdigimkt.f3.d dVar = this.Z;
        com.smartdigimkt.d3.b bVar = null;
        if (dVar != null) {
            int size = dVar.c().size();
            for (int i3 = 0; i3 < size; i3++) {
                if (this.Z.c().get(i3).a() == i2) {
                    bVar = this.Z.c().get(i3);
                }
            }
        }
        return bVar;
    }

    private void a(Activity activity, String str, com.smartdigimkt.v6.a aVar) {
        try {
            if (this.f35612Y == null) {
                e();
            }
            com.smartdigimkt.g1.d dVar = this.f35612Y;
            if (dVar != null && dVar.isReady()) {
                e eVar = new e(this, this.n0);
                h1.put(this.i0, eVar);
                this.f35612Y.a(activity, eVar, str, this.h0, this.o0, this.k0, aVar);
                this.A0 = false;
                return;
            }
            this.A0 = false;
            if (this.f0 != null) {
                try {
                    this.f0.onShowFail("can't show because load is failed");
                } catch (Exception e2) {
                    if (com.smartdigimkt.b.b.f33800a) {
                        e2.printStackTrace();
                    }
                }
            }
        } catch (Exception e3) {
            if (com.smartdigimkt.b.b.f33800a) {
                e3.getLocalizedMessage();
            }
            if (this.f0 != null) {
                try {
                    this.f0.onShowFail("show exception");
                } catch (Exception unused) {
                    if (com.smartdigimkt.b.b.f33800a) {
                        e3.printStackTrace();
                    }
                }
            }
            this.A0 = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void a(Activity activity, String str, String str2, String str3, com.smartdigimkt.v6.a aVar) {
        try {
            this.l0 = str;
            this.h0 = str2;
            this.k0 = str3;
            synchronized (this.B0) {
                if (this.A0) {
                    if (this.f0 != null) {
                        try {
                            this.f0.onShowFail(com.smartdigimkt.d0.b.g);
                        } catch (Exception e2) {
                            if (com.smartdigimkt.b.b.f33800a) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    return;
                }
                this.A0 = true;
                Context context = this.X;
                if (context == null) {
                    if (this.f0 != null) {
                        try {
                            this.f0.onShowFail(com.smartdigimkt.d0.b.f34375a);
                        } catch (Exception e3) {
                            if (com.smartdigimkt.b.b.f33800a) {
                                e3.printStackTrace();
                            }
                        }
                    }
                    this.A0 = false;
                    return;
                }
                if (this.s0 && !v.k(context)) {
                    if (this.f0 != null) {
                        try {
                            this.f0.onShowFail(com.smartdigimkt.d0.b.d);
                        } catch (Exception e4) {
                            if (com.smartdigimkt.b.b.f33800a) {
                                e4.printStackTrace();
                            }
                        }
                    }
                    this.A0 = false;
                    return;
                }
                if (b()) {
                    if (this.f0 != null) {
                        try {
                            this.f0.onShowFail(com.smartdigimkt.d0.b.f34378e);
                        } catch (Exception e5) {
                            if (com.smartdigimkt.b.b.f33800a) {
                                e5.printStackTrace();
                            }
                        }
                    }
                    this.A0 = false;
                    return;
                }
                try {
                    String str4 = new SimpleDateFormat("dd").format(new Date());
                    String str5 = (String) x.b(this.X, com.smartdigimkt.b0.a.O1, "0");
                    if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str4) && !str5.equals(str4)) {
                        x.d(this.X, com.smartdigimkt.b0.a.O1, str4);
                        x.d(this.X, this.j0 + "_1", 0);
                    }
                } catch (Exception unused) {
                }
                a(activity, str, aVar);
                return;
                if (com.smartdigimkt.b.b.f33800a) {
                    e.getLocalizedMessage();
                }
                if (this.f0 != null) {
                    try {
                        this.f0.onShowFail("show exception");
                    } catch (Exception unused2) {
                        if (com.smartdigimkt.b.b.f33800a) {
                            e.printStackTrace();
                        }
                    }
                }
                this.A0 = false;
            }
        } catch (Exception e6) {
            if (com.smartdigimkt.b.b.f33800a) {
                e6.getLocalizedMessage();
            }
            if (this.f0 != null) {
                this.f0.onShowFail("show exception");
            }
            this.A0 = false;
        }
    }

    public static void a(boolean z2, boolean z3) {
        try {
            ConcurrentHashMap<String, e> concurrentHashMap = h1;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
            if (z2) {
                if (z3) {
                    com.smartdigimkt.a3.a.a(287);
                } else {
                    com.smartdigimkt.a3.a.b(287);
                }
            } else if (z3) {
                com.smartdigimkt.a3.a.a(94);
            } else {
                com.smartdigimkt.a3.a.b(94);
            }
            com.smartdigimkt.a3.a.a();
            com.smartdigimkt.a3.a.b();
        } catch (Throwable unused) {
        }
    }

    public static void a(boolean z2, boolean z3, String str) {
        try {
            ConcurrentHashMap<String, e> concurrentHashMap = h1;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
            if (z2) {
                if (z3) {
                    com.smartdigimkt.a3.a.a(287);
                } else {
                    com.smartdigimkt.a3.a.b(287);
                }
            } else if (z3) {
                com.smartdigimkt.a3.a.a(94);
            } else {
                com.smartdigimkt.a3.a.b(94);
            }
            com.smartdigimkt.a3.a.a(str);
            com.smartdigimkt.a3.a.b();
        } catch (Throwable unused) {
        }
    }
}

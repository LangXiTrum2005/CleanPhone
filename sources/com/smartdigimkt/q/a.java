package com.smartdigimkt.q;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.p004ironsource.d9;
import com.smartdigimkt.v0.z;
import com.smartdigimkt.x.d;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f37737e = "RetryReportControl";
    public static String f = "mtg_retry_report=1";
    public static int g = 10000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f37738h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f37739i = 2;
    public static int j = 3;
    public static int k = 50;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f37740l = 600000;
    private static int m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f37741n = 0;
    public static int o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f37742p = 1;
    public static int q = 2;
    public static int r = 3;
    public static int s = 4;
    public static int t = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, com.smartdigimkt.q.b> f37743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.smartdigimkt.q.c f37744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f37745c;
    private final Handler d;

    /* JADX INFO: renamed from: com.smartdigimkt.q.a$a, reason: collision with other inner class name */
    public class C0569a extends BroadcastReceiver {
        public C0569a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                a.this.d.sendEmptyMessage(2);
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static a f37747a = new a(null);

        private b() {
        }
    }

    public static class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                a.b().c();
            } else {
                Object obj = message.obj;
                if (obj instanceof String) {
                    a.b().a((String) obj, com.smartdigimkt.q.b.k);
                }
            }
        }
    }

    public /* synthetic */ a(C0569a c0569a) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        com.smartdigimkt.q.c cVar = this.f37744b;
        if (cVar != null) {
            Iterator<String> it = cVar.a().iterator();
            while (it.hasNext()) {
                a(it.next(), com.smartdigimkt.q.b.f37748l);
            }
        }
    }

    public void d() {
        Context contextK;
        if (this.f37745c == null || (contextK = com.smartdigimkt.m6.b.p().k()) == null) {
            return;
        }
        contextK.unregisterReceiver(this.f37745c);
    }

    private a() {
        this.f37743a = new ConcurrentHashMap<>();
        this.f37744b = new com.smartdigimkt.q.c(k);
        this.d = new c(Looper.getMainLooper());
        com.smartdigimkt.n1.a aVarC = com.smartdigimkt.n1.b.b().c(com.smartdigimkt.u.a.f().a());
        j = aVarC.M0();
        g = aVarC.O0() * 1000;
        f37740l = aVarC.P0() * 1000;
        m = aVarC.L0();
        f37741n = aVarC.N0();
        a();
    }

    public static a b() {
        return b.f37747a;
    }

    private boolean b(int i2) {
        return i2 == f37742p || i2 == q;
    }

    public void a(String str, String str2, d dVar, String str3, boolean z2, boolean z3, int i2) {
        if (!c(i2) || TextUtils.isEmpty(str)) {
            return;
        }
        String strReplace = str.replace("?" + f, "").replace(d9.i.f24749c + f, "");
        if (this.f37743a == null) {
            this.f37743a = new ConcurrentHashMap<>();
        }
        com.smartdigimkt.q.b bVarRemove = this.f37743a.remove(strReplace);
        if (bVarRemove == null) {
            bVarRemove = new com.smartdigimkt.q.b(str, str2);
            bVarRemove.b(i2);
            bVarRemove.a(z2);
            bVarRemove.b(z3);
            bVarRemove.a(dVar);
            bVarRemove.b(str3);
        } else if (bVarRemove.d() != com.smartdigimkt.q.b.f37748l) {
            bVarRemove.a(str2);
        }
        if ((!a(i2) || m == 0) && ((!b(i2) || f37741n == 0) && i2 != t)) {
            return;
        }
        if (System.currentTimeMillis() < bVarRemove.c() + ((long) f37740l)) {
            a(strReplace, bVarRemove);
            if (bVarRemove.d() != com.smartdigimkt.q.b.k || bVarRemove.e() > j) {
                return;
            }
            a(strReplace);
            return;
        }
        bVarRemove.d();
    }

    private boolean c(int i2) {
        return a(i2) || b(i2) || i2 == t;
    }

    private void a(String str, com.smartdigimkt.q.b bVar) {
        if (this.f37744b == null) {
            this.f37744b = new com.smartdigimkt.q.c(k);
        }
        this.f37744b.put(str, bVar);
    }

    private void a(String str) {
        Message messageObtainMessage = this.d.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = str;
        this.d.sendMessageDelayed(messageObtainMessage, g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i2) {
        String string;
        com.smartdigimkt.q.c cVar = this.f37744b;
        if (cVar != null) {
            com.smartdigimkt.q.b bVar = cVar.get(str);
            this.f37744b.remove(str);
            if (bVar == null) {
                com.smartdigimkt.q.b bVar2 = this.f37743a.get(str);
                if (bVar2 == null || System.currentTimeMillis() > bVar2.c() + ((long) f37740l) || bVar2.e() >= j || i2 == com.smartdigimkt.q.b.f37748l) {
                    return;
                }
                a(str);
                return;
            }
            if (System.currentTimeMillis() <= bVar.c() + ((long) f37740l)) {
                bVar.a(i2);
                this.f37743a.put(str, bVar);
                if (z.c(str) == 0) {
                    StringBuilder sbX = android.support.v4.media.a.x(str, "?");
                    sbX.append(f);
                    string = sbX.toString();
                } else {
                    StringBuilder sbX2 = android.support.v4.media.a.x(str, d9.i.f24749c);
                    sbX2.append(f);
                    string = sbX2.toString();
                }
                String str2 = string;
                com.smartdigimkt.o.a.a(com.smartdigimkt.m6.b.p().k(), bVar.a(), bVar.f(), str2, bVar.i(), bVar.j(), bVar.h());
            }
        }
    }

    private void a() {
        try {
            if (this.f37745c == null) {
                this.f37745c = new C0569a();
                Context contextK = com.smartdigimkt.m6.b.p().k();
                if (contextK != null) {
                    contextK.registerReceiver(this.f37745c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private boolean a(int i2) {
        return i2 == s || i2 == r;
    }
}

package com.mbridge.msdk.click.retry;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.f;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import d5.u;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f31745e = "mtg_retry_report=1";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f31746f = 10000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f31747g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f31748h = 50;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f31749i = 600000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f31750j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f31751k = 0;
    public static int l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f31752m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f31753n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f31754o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f31755p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f31756q = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, com.mbridge.msdk.click.retry.b> f31757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.click.retry.c f31758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f31759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f31760d;

    /* JADX INFO: renamed from: com.mbridge.msdk.click.retry.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0101a extends BroadcastReceiver {
        public C0101a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                a.this.f31760d.sendEmptyMessage(2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static a f31762a = new a(null);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                a.b().c();
            } else {
                Object obj = message.obj;
                if (obj instanceof String) {
                    a.b().a((String) obj, com.mbridge.msdk.click.retry.b.f31763k);
                }
            }
        }
    }

    public /* synthetic */ a(C0101a c0101a) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        com.mbridge.msdk.click.retry.c cVar = this.f31758b;
        if (cVar != null) {
            Iterator<String> it = cVar.a().iterator();
            while (it.hasNext()) {
                a(it.next(), com.mbridge.msdk.click.retry.b.l);
            }
        }
    }

    private a() {
        this.f31757a = new ConcurrentHashMap<>();
        this.f31758b = new com.mbridge.msdk.click.retry.c(f31748h);
        this.f31760d = new c(Looper.getMainLooper());
        g gVarD = i.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        f31747g = gVarD.j0();
        f31746f = gVarD.l0() * 1000;
        f31749i = gVarD.m0() * 1000;
        f31750j = gVarD.i0();
        f31751k = gVarD.k0();
        a();
    }

    public static a b() {
        return b.f31762a;
    }

    private boolean b(int i10) {
        return i10 == f31752m || i10 == f31753n;
    }

    public void a(String str, String str2, CampaignEx campaignEx, String str3, boolean z10, boolean z11, int i10) {
        if (!c(i10) || TextUtils.isEmpty(str)) {
            return;
        }
        String strReplace = str.replace("?" + f31745e, "").replace(X3.j.f27832c + f31745e, "");
        if (this.f31757a == null) {
            this.f31757a = new ConcurrentHashMap<>();
        }
        com.mbridge.msdk.click.retry.b bVarRemove = this.f31757a.remove(strReplace);
        if (bVarRemove == null) {
            bVarRemove = new com.mbridge.msdk.click.retry.b(str, str2);
            bVarRemove.b(i10);
            bVarRemove.a(z10);
            bVarRemove.b(z11);
            bVarRemove.a(campaignEx);
            bVarRemove.b(str3);
        } else if (bVarRemove.d() != com.mbridge.msdk.click.retry.b.l) {
            bVarRemove.a(str2);
        }
        if ((!a(i10) || f31750j == 0) && ((!b(i10) || f31751k == 0) && i10 != f31756q)) {
            a(bVarRemove);
            return;
        }
        if (System.currentTimeMillis() < bVarRemove.c() + ((long) f31749i)) {
            a(strReplace, bVarRemove);
            if (bVarRemove.d() == com.mbridge.msdk.click.retry.b.f31763k) {
                if (bVarRemove.e() <= f31747g) {
                    a(strReplace);
                    return;
                } else {
                    a(bVarRemove);
                    return;
                }
            }
            return;
        }
        if (bVarRemove.d() == com.mbridge.msdk.click.retry.b.f31763k) {
            a(bVarRemove);
        }
    }

    private boolean c(int i10) {
        return a(i10) || b(i10) || i10 == f31756q;
    }

    private void a(com.mbridge.msdk.click.retry.b bVar) {
        String str;
        String requestIdNotice;
        try {
            CampaignEx campaignExA = bVar.a();
            if (campaignExA != null) {
                String requestId = campaignExA.getRequestId();
                requestIdNotice = campaignExA.getRequestIdNotice();
                str = requestId;
            } else {
                str = "";
                requestIdNotice = str;
            }
            a(com.mbridge.msdk.foundation.controller.c.n().d(), bVar.b().toString(), bVar.g(), str, requestIdNotice, bVar.h());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static void a(Context context, String str, String str2, String str3, String str4, int i10) {
        f.a().a(context, str, str2, str3, str4, i10);
    }

    private void a(String str, com.mbridge.msdk.click.retry.b bVar) {
        if (this.f31758b == null) {
            this.f31758b = new com.mbridge.msdk.click.retry.c(f31748h);
        }
        this.f31758b.a(str, bVar);
    }

    private void a(String str) {
        Message messageObtainMessage = this.f31760d.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = str;
        this.f31760d.sendMessageDelayed(messageObtainMessage, f31746f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10) {
        String string;
        com.mbridge.msdk.click.retry.c cVar = this.f31758b;
        if (cVar != null) {
            com.mbridge.msdk.click.retry.b bVarA = cVar.a(str);
            this.f31758b.b(str);
            if (bVarA == null) {
                com.mbridge.msdk.click.retry.b bVar = this.f31757a.get(str);
                if (bVar == null || System.currentTimeMillis() > bVar.c() + ((long) f31749i) || bVar.e() >= f31747g || i10 == com.mbridge.msdk.click.retry.b.l) {
                    return;
                }
                a(str);
                return;
            }
            if (System.currentTimeMillis() <= bVarA.c() + ((long) f31749i)) {
                bVarA.a(i10);
                this.f31757a.put(str, bVarA);
                if (c1.c(str) == 0) {
                    StringBuilder sbJ = u.j(str, "?");
                    sbJ.append(f31745e);
                    string = sbJ.toString();
                } else {
                    StringBuilder sbJ2 = u.j(str, X3.j.f27832c);
                    sbJ2.append(f31745e);
                    string = sbJ2.toString();
                }
                String str2 = string;
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), bVarA.a(), bVarA.f(), str2, bVarA.i(), bVarA.j(), bVarA.h());
                return;
            }
            if (i10 != com.mbridge.msdk.click.retry.b.l) {
                a(bVarA);
            }
        }
    }

    private void a() {
        try {
            if (this.f31759c == null) {
                this.f31759c = new C0101a();
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                if (contextD != null) {
                    contextD.registerReceiver(this.f31759c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private boolean a(int i10) {
        return i10 == f31755p || i10 == f31754o;
    }
}

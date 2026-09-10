package com.mbridge.msdk.interstitial.controller;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.out.InterstitialListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.setting.k;
import com.mbridge.msdk.setting.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static String f34301o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Map<String, Integer> f34302p = new HashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static Map<String, Integer> f34303q = new HashMap();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static Map<String, d> f34304r = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f34306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f34308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f34309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MBridgeIds f34310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f34311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private m f34312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterstitialListener f34313i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34305a = "InterstitialController";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f34314j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f34315k = "";
    private String l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f34316m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f34317n = false;

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.controller.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class HandlerC0135a extends Handler {
        public HandlerC0135a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                if (a.this.f34313i != null) {
                    a.this.f34313i.onInterstitialLoadSuccess(a.this.f34310f);
                    return;
                }
                return;
            }
            String str = "";
            if (i10 == 2) {
                if (a.this.f34313i != null) {
                    Object obj = message.obj;
                    if (obj != null && (obj instanceof String)) {
                        str = (String) obj;
                    }
                    a.this.f34313i.onInterstitialLoadFail(a.this.f34310f, TextUtils.isEmpty(str) ? "can't show because unknow error" : str);
                    return;
                }
                return;
            }
            if (i10 == 3) {
                a aVar = a.this;
                aVar.f34314j = true;
                if (aVar.f34313i != null) {
                    a.this.f34313i.onInterstitialShowSuccess(a.this.f34310f);
                    return;
                }
                return;
            }
            if (i10 == 4) {
                if (a.this.f34313i != null) {
                    Object obj2 = message.obj;
                    if (obj2 != null && (obj2 instanceof String)) {
                        str = (String) obj2;
                    }
                    a.this.f34313i.onInterstitialShowFail(a.this.f34310f, TextUtils.isEmpty(str) ? "can't show because unknow error" : str);
                    return;
                }
                return;
            }
            if (i10 == 6) {
                if (a.this.f34313i != null) {
                    a.this.f34313i.onInterstitialAdClick(a.this.f34310f);
                }
            } else {
                if (i10 != 7) {
                    return;
                }
                a aVar2 = a.this;
                aVar2.f34314j = false;
                if (aVar2.f34313i != null) {
                    a.this.f34313i.onInterstitialClosed(a.this.f34310f);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.interstitial.adapter.a f34319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f34320b;

        public b(com.mbridge.msdk.interstitial.adapter.a aVar, c cVar) {
            this.f34319a = aVar;
            this.f34320b = cVar;
        }

        public void a(boolean z10, String str) {
            try {
                com.mbridge.msdk.interstitial.adapter.a aVar = this.f34319a;
                if (aVar != null) {
                    aVar.a((b) null);
                    this.f34319a = null;
                }
                if (this.f34320b != null) {
                    if (a.this.f34311g != null) {
                        a.this.f34311g.removeCallbacks(this.f34320b);
                    }
                    if (z10) {
                        if (a.this.f34313i != null) {
                            a.this.c(str);
                        }
                    } else if (a.this.f34313i != null) {
                        a.this.b(str);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void b(boolean z10, String str) {
            try {
                a.this.f34315k = str;
                try {
                    ArrayList arrayList = new ArrayList();
                    com.mbridge.msdk.interstitial.adapter.a aVar = this.f34319a;
                    if (aVar != null && aVar.d() != null) {
                        arrayList.add(this.f34319a.d());
                    }
                    a.this.l = com.mbridge.msdk.foundation.same.c.b(arrayList);
                } catch (Exception e10) {
                    q0.b(a.this.f34305a, e10.getMessage());
                }
                if (this.f34320b != null) {
                    if (a.this.f34311g != null) {
                        a.this.f34311g.removeCallbacks(this.f34320b);
                    }
                    if (z10) {
                        a.this.b(false);
                    } else if (a.this.f34313i != null) {
                        a.this.h();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.interstitial.adapter.a f34322a;

        public c(com.mbridge.msdk.interstitial.adapter.a aVar) {
            this.f34322a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.interstitial.adapter.a aVar = this.f34322a;
                if (aVar != null) {
                    if (aVar.f()) {
                        a.this.c("load timeout");
                    } else if (a.this.f34313i != null) {
                        a.this.b("load timeout");
                    }
                    this.f34322a.a((b) null);
                    this.f34322a = null;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public a() {
        try {
            c();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Handler handler = this.f34311g;
        if (handler != null) {
            handler.sendEmptyMessage(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        Handler handler = this.f34311g;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
    }

    public void g() {
        try {
            new k().a(this.f34306b, (String) null, (String) null, this.f34307c);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void j() {
        try {
            if (this.f34306b == null) {
                c("context is null");
                return;
            }
            if (TextUtils.isEmpty(this.f34307c)) {
                c("unitid is null");
            } else if (!this.f34317n) {
                c("init error");
            } else {
                e();
                b(true);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            c("can't show because unknow error");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d {
        public d() {
        }

        public void a(String str) {
            try {
                a.this.c(str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void b() {
            try {
                if (a.this.f34311g != null) {
                    a.this.f34311g.sendEmptyMessage(7);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void c() {
            try {
                a.this.i();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void a() {
            try {
                if (a.this.f34311g != null) {
                    a.this.f34311g.sendEmptyMessage(6);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private void e() {
        try {
            g();
            m mVarE = i.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f34307c);
            this.f34312h = mVarE;
            if (mVarE == null) {
                this.f34312h = m.h(this.f34307c);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void f() {
        try {
            if (this.f34306b == null) {
                b("context is null");
                return;
            }
            if (TextUtils.isEmpty(this.f34307c)) {
                b("unitid is null");
            } else {
                if (!this.f34317n) {
                    b("init error");
                    return;
                }
                e();
                d();
                a(false);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            b("can't show because unknow error");
        }
    }

    private void c() {
        try {
            this.f34311g = new HandlerC0135a(Looper.getMainLooper());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void d() {
        try {
            m mVar = this.f34312h;
            if (mVar != null) {
                int iE = mVar.e();
                int iY = this.f34312h.y();
                if (iE <= 0) {
                    iE = 1;
                }
                if (iY <= 0) {
                    iY = 1;
                }
                int i10 = iY * iE;
                if (f34303q == null || TextUtils.isEmpty(this.f34307c)) {
                    return;
                }
                f34303q.put(this.f34307c, Integer.valueOf(i10));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String b() {
        if (this.f34314j) {
            return this.f34316m;
        }
        return this.f34315k;
    }

    public static void a(String str, int i10) {
        try {
            if (f34302p == null || TextUtils.isEmpty(str)) {
                return;
            }
            f34302p.put(str, Integer.valueOf(i10));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        try {
            if (this.f34311g != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 4;
                this.f34311g.sendMessage(messageObtain);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z10) {
        try {
            CampaignEx campaignExD = new com.mbridge.msdk.interstitial.adapter.a(this.f34306b, this.f34307c, this.f34308d, this.f34309e, true).d();
            if (campaignExD != null) {
                a(campaignExD);
            } else if (z10) {
                a(true);
            } else {
                c("no ads available can show");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            if (this.f34313i != null) {
                c("can't show because unknow error");
            }
        }
    }

    public static int a(String str) {
        Map<String, Integer> map;
        Integer num;
        try {
            if (TextUtils.isEmpty(str) || (map = f34302p) == null || !map.containsKey(str) || (num = f34302p.get(str)) == null) {
                return 0;
            }
            return num.intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public void a(InterstitialListener interstitialListener) {
        this.f34313i = interstitialListener;
    }

    public boolean a(Context context, Map<String, Object> map) {
        try {
            this.f34317n = false;
            if (map != null && context != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID) && (map.get(MBridgeConstans.PROPERTIES_UNIT_ID) instanceof String)) {
                if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY) && (map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY) instanceof String)) {
                    this.f34309e = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
                }
                this.f34307c = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                this.f34306b = context;
                if (map.containsKey(MBridgeConstans.PLACEMENT_ID) && map.get(MBridgeConstans.PLACEMENT_ID) != null) {
                    this.f34308d = (String) map.get(MBridgeConstans.PLACEMENT_ID);
                }
                this.f34310f = new MBridgeIds(this.f34308d, this.f34307c);
                this.f34317n = true;
                return this.f34317n;
            }
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f34317n = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        try {
            if (this.f34311g != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 2;
                this.f34311g.sendMessage(messageObtain);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String a() {
        return this.l;
    }

    public void a(boolean z10) {
        boolean z11;
        try {
            z11 = z10;
            try {
                com.mbridge.msdk.interstitial.adapter.a aVar = new com.mbridge.msdk.interstitial.adapter.a(this.f34306b, this.f34307c, this.f34308d, this.f34309e, z11);
                c cVar = new c(aVar);
                aVar.a(new b(aVar, cVar));
                Handler handler = this.f34311g;
                if (handler != null) {
                    handler.postDelayed(cVar, 30000L);
                }
                aVar.j();
            } catch (Exception e10) {
                e = e10;
                e.printStackTrace();
                if (z11) {
                    return;
                }
                b("can't show because unknow error");
            }
        } catch (Exception e11) {
            e = e11;
            z11 = z10;
        }
    }

    private void a(CampaignEx campaignEx) {
        d dVar = new d();
        if (f34304r != null && !TextUtils.isEmpty(this.f34307c)) {
            f34304r.put(this.f34307c, dVar);
        }
        Intent intent = new Intent(this.f34306b, (Class<?>) MBInterstitialActivity.class);
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(this.f34307c)) {
            intent.putExtra("unitId", this.f34307c);
        }
        if (campaignEx != null) {
            this.f34316m = campaignEx.getRequestId();
            intent.putExtra(MBInterstitialActivity.INTENT_CAMAPIGN, campaignEx);
        }
        Context context = this.f34306b;
        if (context != null) {
            context.startActivity(intent);
        }
    }
}

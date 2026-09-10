package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.k;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.PreloadListener;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.setting.m;
import com.mbridge.msdk.tracker.network.g;
import com.unity3d.services.core.fid.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d extends com.mbridge.msdk.mbnative.controller.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f34718r = "d";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static Map<String, Map<Long, Object>> f34719s = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Map<String, Boolean> f34720t = new HashMap();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static Map<String, k> f34721u = new HashMap();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static Map<String, Integer> f34722v = new HashMap();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static Map<String, Integer> f34723w = new HashMap();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static d f34724x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static int f34725y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static int f34726z = -2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.setting.k f34727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.click.a f34728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private m f34729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f34730e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Object> f34734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<Integer> f34735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected List<Integer> f34736k;
    private List<Integer> l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f34737m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f34738n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f34739o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f34740p;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Queue<Integer> f34731f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Queue<Long> f34732g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f34733h = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.task.b f34741q = new com.mbridge.msdk.foundation.same.task.b(com.mbridge.msdk.foundation.controller.c.n().d());

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends com.mbridge.msdk.mbnative.service.net.b implements com.mbridge.msdk.foundation.same.task.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f34743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f34744d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f34745e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f34746f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f34747g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Runnable f34750j;
        private com.mbridge.msdk.preload.listenter.a l;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private List<String> f34748h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f34749i = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f34751k = true;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f34753a;

            public a(CampaignUnit campaignUnit) {
                this.f34753a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z10;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (b.this.f34750j != null) {
                    b bVar = b.this;
                    d.this.f34706a.removeCallbacks(bVar.f34750j);
                }
                if (com.mbridge.msdk.util.b.a()) {
                    d.this.a(this.f34753a);
                }
                if (d.f34719s.containsKey("0_" + b.this.unitId)) {
                    d.f34719s.remove("0_" + b.this.unitId);
                }
                if (b.this.f34747g > 0) {
                    if (this.f34753a.ads.size() > b.this.f34747g) {
                        b bVar2 = b.this;
                        bVar2.f34744d = bVar2.f34747g;
                    } else {
                        b.this.f34744d = this.f34753a.ads.size();
                    }
                } else if (b.this.f34747g == -1) {
                    b.this.f34744d = 0;
                } else if (b.this.f34747g == -3) {
                    b.this.f34744d = this.f34753a.ads.size();
                } else if (b.this.f34747g == -2) {
                    if (this.f34753a.getTemplate() == 3) {
                        if (b.this.f34746f != 0) {
                            b bVar3 = b.this;
                            bVar3.f34744d = bVar3.f34746f;
                        }
                    } else if (b.this.f34745e != 0) {
                        b bVar4 = b.this;
                        bVar4.f34744d = bVar4.f34745e;
                    }
                    if (b.this.f34744d <= 0) {
                        b.this.f34744d = ((Integer) d.f34722v.get(b.this.unitId)).intValue();
                    }
                }
                if (this.f34753a.ads.size() < b.this.f34744d) {
                    b.this.f34744d = this.f34753a.ads.size();
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("adtp", 42);
                if (TextUtils.isEmpty(b.this.b())) {
                    eVar.a(CampaignEx.JSON_KEY_HB, 0);
                } else {
                    eVar.a(CampaignEx.JSON_KEY_HB, 1);
                }
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, b.this.b(), eVar, this.f34753a.getAds().get(0), b.this.unitId);
                for (int i10 = 0; i10 < this.f34753a.ads.size(); i10++) {
                    CampaignEx campaignEx = this.f34753a.ads.get(i10);
                    campaignEx.setLocalRequestId(cVarA.t());
                    campaignEx.setCampaignUnitId(b.this.unitId);
                    boolean zC = v0.c(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx.getPackageName());
                    d.this.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
                    if (arrayList.size() < b.this.f34744d && campaignEx.getOfferType() != 99) {
                        if (v0.c(campaignEx)) {
                            campaignEx.setRtinsType(zC ? 1 : 2);
                        }
                        if (com.mbridge.msdk.foundation.same.c.b(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx)) {
                            arrayList.add(campaignEx);
                            if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                arrayList2.add(campaignEx);
                            }
                        } else {
                            v0.a(b.this.unitId, campaignEx, com.mbridge.msdk.foundation.same.a.f33737x);
                        }
                        b.this.a(campaignEx, null, null);
                    }
                    d dVar = d.this;
                    dVar.a(dVar.f34737m, campaignEx);
                }
                b bVar5 = b.this;
                d.this.a(arrayList2, bVar5.unitId);
                com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(this.f34753a.getAds().get(0) != null ? this.f34753a.getAds().get(0).getType() : 1);
                if (bVarA != null) {
                    bVarA.a(b.this.unitId, arrayList);
                }
                d.a(b.this.f34743c, b.this.unitId);
                if (Looper.myLooper() != null && z10) {
                    Looper.loop();
                }
                if (this.f34753a.getAds().get(0) != null) {
                    com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f34753a.getAds().get(0).getMaitve(), this.f34753a.getAds().get(0).getMaitve_src());
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.d$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class C0146b extends com.mbridge.msdk.foundation.same.c.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignEx f34755a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f34756b;

            public C0146b(CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
                this.f34755a = campaignEx;
                this.f34756b = context;
            }

            @Override // com.mbridge.msdk.foundation.same.c.a
            public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
                com.mbridge.msdk.mbnative.report.a.a(str, cVar, this.f34755a, this.f34756b, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f34758a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f34759b;

            public c(String str, int i10) {
                this.f34758a = str;
                this.f34759b = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z10;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!b.this.f34749i) {
                    if (b.this.f34750j != null) {
                        b bVar = b.this;
                        d.this.f34706a.removeCallbacks(bVar.f34750j);
                    }
                    if (b.this.a() == 1 || b.this.f34751k) {
                        b bVar2 = b.this;
                        d dVar = d.this;
                        String str = this.f34758a;
                        int iA = bVar2.a();
                        b bVar3 = b.this;
                        dVar.a(str, iA, bVar3.unitId, bVar3.placementId, bVar3.l);
                    }
                } else if (b.this.f34751k) {
                    b bVar4 = b.this;
                    d dVar2 = d.this;
                    String str2 = this.f34758a;
                    int iA2 = bVar4.a();
                    b bVar5 = b.this;
                    dVar2.a(str2, iA2, bVar5.unitId, bVar5.placementId, bVar5.l);
                }
                if (this.f34759b == -1) {
                    d.b(b.this.f34743c, b.this.unitId);
                }
                if (Looper.myLooper() == null || !z10) {
                    return;
                }
                Looper.loop();
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.d$b$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class RunnableC0147d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f34761a;

            public RunnableC0147d(List list) {
                this.f34761a = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z10;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!b.this.f34749i && b.this.f34750j != null) {
                    b bVar = b.this;
                    d.this.f34706a.removeCallbacks(bVar.f34750j);
                }
                List list = this.f34761a;
                if (list != null && list.size() > 0) {
                    Iterator it = this.f34761a.iterator();
                    while (it.hasNext()) {
                        for (CampaignEx campaignEx : ((Frame) it.next()).getCampaigns()) {
                            d dVar = d.this;
                            dVar.a(dVar.f34737m, campaignEx);
                        }
                    }
                    HashMap map = new HashMap();
                    map.put(Long.valueOf(System.currentTimeMillis()), this.f34761a);
                    if (d.f34719s.containsKey("1_" + b.this.unitId)) {
                        d.f34719s.remove("1_" + b.this.unitId);
                    }
                    d.f34719s.put("1_" + b.this.unitId, map);
                }
                if (Looper.myLooper() == null || !z10) {
                    return;
                }
                Looper.loop();
            }
        }

        public b(int i10) {
            this.f34743c = i10;
        }

        public void b(List<String> list) {
            this.f34748h = list;
        }

        public void c(int i10) {
            this.f34745e = i10;
        }

        public void d(int i10) {
            this.f34744d = i10;
        }

        public void e(int i10) {
            this.f34746f = i10;
        }

        public void b(int i10) {
            this.f34747g = i10;
        }

        public void a(com.mbridge.msdk.preload.listenter.a aVar) {
            this.l = aVar;
        }

        public void b(boolean z10) {
            this.f34751k = z10;
        }

        @Override // com.mbridge.msdk.foundation.same.task.d
        public void a(boolean z10) {
            this.f34749i = z10;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<g> list, CampaignUnit campaignUnit) {
            d.this.f34738n = true;
            d.this.a(true, this.l, (String) null);
            d.this.a(new Thread(new a(campaignUnit)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            try {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                com.mbridge.msdk.foundation.same.c.a(campaignEx, contextD, cVar, new C0146b(campaignEx, contextD, aVar));
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(int i10, String str) {
            d.this.a(new Thread(new c(str, i10)));
        }

        public void a(Runnable runnable) {
            this.f34750j = runnable;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<Frame> list) {
            d.this.a(new Thread(new RunnableC0147d(list)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f34763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.task.d f34764b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f34765c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f34766d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f34767e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.mbridge.msdk.preload.listenter.a f34768f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f34769g = false;

        public c(int i10, com.mbridge.msdk.foundation.same.task.d dVar, int i11, String str, String str2) {
            this.f34763a = i10;
            this.f34764b = dVar;
            this.f34765c = i11;
            this.f34766d = str;
            this.f34767e = str2;
        }

        public void a(boolean z10) {
            this.f34769g = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34764b.a(true);
            int i10 = this.f34763a;
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                d.this.a("REQUEST_TIMEOUT", this.f34765c, this.f34766d, this.f34767e, this.f34768f);
            } else {
                d.this.f34738n = true;
                if (this.f34769g || this.f34765c == 1) {
                    d.this.a("REQUEST_TIMEOUT", this.f34765c, this.f34766d, this.f34767e, this.f34768f);
                }
            }
        }

        public void a(com.mbridge.msdk.preload.listenter.a aVar) {
            this.f34768f = aVar;
        }

        public void a(String str) {
            this.f34766d = str;
        }
    }

    public d() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.f34706a = new a();
    }

    public static Map<String, Integer> c() {
        return f34722v;
    }

    public static Map<String, Integer> d() {
        return f34723w;
    }

    public static Map<String, k> e() {
        return f34721u;
    }

    public static Map<String, Map<Long, Object>> f() {
        return f34719s;
    }

    public static Map<String, Boolean> g() {
        return f34720t;
    }

    public static void b(int i10, String str) {
        if (f34721u.containsKey(str)) {
            k kVar = f34721u.get(str);
            if (i10 == 1) {
                kVar.a(0);
            } else if (i10 == 2) {
                kVar.b(0);
            }
            f34721u.put(str, kVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x01fd  */
    public void a(Map<String, Object> map, int i10) {
        String str;
        String str2;
        int i11;
        int i12;
        com.mbridge.msdk.preload.listenter.a aVar;
        Object obj;
        try {
            this.f34734i = map;
            this.f34738n = false;
            if (map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                String str3 = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                if (f34719s.containsKey(((i10 + 1) % 2) + "_" + str3)) {
                    if (!f34719s.containsKey(i10 + "_" + str3)) {
                        return;
                    }
                }
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                if (map.containsKey(MBridgeConstans.PREIMAGE)) {
                    this.f34737m = ((Boolean) map.get(MBridgeConstans.PREIMAGE)).booleanValue();
                }
                com.mbridge.msdk.click.a aVar2 = this.f34728c;
                if (aVar2 == null) {
                    this.f34728c = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), str3);
                } else {
                    aVar2.a(str3);
                }
                if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM)) {
                    this.f34733h = ((Integer) map.get(MBridgeConstans.PROPERTIES_AD_FRAME_NUM)).intValue();
                }
                if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY)) {
                    this.f34730e = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
                }
                if (f34720t.containsKey(str3) && f34720t.get(str3).booleanValue()) {
                    Map<String, Map<Long, Object>> mapF = f();
                    Map<Long, Object> map2 = mapF.get(i10 + "_" + str3);
                    com.mbridge.msdk.setting.g gVarF = i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
                    if (map2 != null && map2.size() > 0) {
                        Long next = map2.keySet().iterator().next();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (gVarF == null) {
                            gVarF = i.b().a();
                        }
                        if (jCurrentTimeMillis - next.longValue() >= gVarF.c0() * 1000) {
                            mapF.remove(str3);
                        } else if (i10 == 1) {
                            return;
                        }
                    }
                }
                f34720t.put(str3, Boolean.TRUE);
                this.f34740p = 1;
                try {
                    if (map.containsKey("ad_num")) {
                        int iIntValue = ((Integer) map.get("ad_num")).intValue();
                        this.f34740p = iIntValue;
                        if (iIntValue < 1) {
                            this.f34740p = 1;
                        }
                        if (this.f34740p > 10) {
                            this.f34740p = 10;
                        }
                    }
                } catch (Exception unused) {
                    q0.b(f34718r, "ADNUM MUST BE INTEGER");
                }
                f34722v.put(str3, Integer.valueOf(this.f34740p));
                com.mbridge.msdk.preload.listenter.a aVar3 = (!map.containsKey(MBridgeConstans.PRELOAD_RESULT_LISTENER) || (obj = map.get(MBridgeConstans.PRELOAD_RESULT_LISTENER)) == null) ? null : new com.mbridge.msdk.preload.listenter.a((PreloadListener) obj);
                String strB = com.mbridge.msdk.foundation.controller.c.n().b();
                String strC = com.mbridge.msdk.foundation.controller.c.n().c();
                if (map.containsKey(MBridgeConstans.APP_ID) && map.containsKey(MBridgeConstans.APP_KEY) && map.containsKey(MBridgeConstans.KEY_WORD)) {
                    strB = (String) map.get(MBridgeConstans.APP_ID);
                    strC = (String) map.get(MBridgeConstans.APP_KEY);
                }
                a(strB, strC, str3);
                m mVarE = i.b().e(strB, str3);
                this.f34729d = mVarE;
                if (mVarE == null) {
                    this.f34729d = m.i(str3);
                }
                if (map.containsKey(MBridgeConstans.PLACEMENT_ID) && map.get(MBridgeConstans.PLACEMENT_ID) != null) {
                    str = (String) map.get(MBridgeConstans.PLACEMENT_ID);
                    if (TextUtils.isEmpty(str)) {
                        str = "";
                    }
                } else {
                    str = "";
                }
                String str4 = str;
                this.f34735j = this.f34729d.b();
                this.f34736k = this.f34729d.c();
                this.l = this.f34729d.c();
                List<Integer> list = this.f34735j;
                if (list == null || list.size() <= 0) {
                    com.mbridge.msdk.preload.listenter.a aVar4 = aVar3;
                    if (aVar4 != null) {
                        aVar4.onPreloadFaild("do not have sorceList");
                        return;
                    }
                    return;
                }
                this.f34731f = new LinkedList();
                Iterator<Integer> it = this.f34735j.iterator();
                while (it.hasNext()) {
                    this.f34731f.add(it.next());
                }
                List<Integer> list2 = this.l;
                if (list2 != null && list2.size() > 0) {
                    this.f34732g = new LinkedList();
                    Iterator<Integer> it2 = this.l.iterator();
                    while (it2.hasNext()) {
                        this.f34732g.add(Long.valueOf(it2.next().intValue() * 1000));
                    }
                }
                if (this.f34735j.contains(1) && i10 == 0) {
                    try {
                        str2 = str3;
                        aVar = aVar3;
                        try {
                            try {
                                a(1, this.f34736k.get(this.f34735j.indexOf(1)).intValue() * 1000, i10, this.f34729d, str2, str4, false, aVar);
                                str4 = str4;
                                i11 = 1;
                                try {
                                    com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(1);
                                    if (bVarA != null) {
                                        i12 = 0;
                                        try {
                                            List<Campaign> listA = bVarA.a(str2, 0);
                                            if (listA != null && listA.size() > 0) {
                                                a(true, aVar, (String) null);
                                            }
                                        } catch (Exception unused2) {
                                        }
                                    } else {
                                        i12 = 0;
                                    }
                                } catch (Exception unused3) {
                                }
                            } catch (Exception unused4) {
                                str4 = str4;
                                i11 = 1;
                            }
                        } catch (Exception unused5) {
                        }
                    } catch (Exception unused6) {
                        str2 = str3;
                        i11 = 1;
                        i12 = 0;
                        aVar = aVar3;
                    }
                } else {
                    str2 = str3;
                    i11 = 1;
                    i12 = 0;
                    aVar = aVar3;
                }
                String str5 = str2;
                a(i10, this.f34729d, str5, str4, aVar);
                m mVar = this.f34729d;
                d().put(str5, Integer.valueOf(mVar != null ? mVar.y() * this.f34740p : i11));
                try {
                    int i13 = MBMediaView.f35024p0;
                    e.a(com.mbridge.msdk.foundation.controller.c.n().d(), str5);
                    o0.a();
                    if (TextUtils.isEmpty(str5)) {
                        return;
                    }
                    com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).d();
                    int iA = a(map.containsKey(MBridgeConstans.NATIVE_INFO) ? (String) map.get(MBridgeConstans.NATIVE_INFO) : null);
                    if (iA <= 0) {
                        iA = this.f34740p;
                    }
                    List<Campaign> listA2 = a(str5, iA);
                    if (listA2 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (int i14 = i12; i14 < listA2.size(); i14++) {
                            CampaignEx campaignEx = (CampaignEx) listA2.get(i14);
                            if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                arrayList.add(campaignEx);
                            }
                        }
                        if (arrayList.size() > 0) {
                            Object objInvoke = com.mbridge.msdk.videocommon.download.b.class.getMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(objInvoke, com.mbridge.msdk.foundation.controller.c.n().d(), str5, new CopyOnWriteArrayList(arrayList), 1, null);
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(objInvoke, str5);
                        }
                    }
                } catch (Throwable unused7) {
                    q0.b(f34718r, "init cam cache failed");
                }
            }
        } catch (Exception e10) {
            q0.b(f34718r, com.mbridge.msdk.mbnative.common.a.a(e10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i10);
                    if (2 == jSONObject.optInt("id", 0)) {
                        return jSONObject.optInt("ad_num");
                    }
                }
            }
            return 0;
        } catch (Exception e10) {
            q0.b(f34718r, com.mbridge.msdk.mbnative.common.a.a(e10));
            return 0;
        }
    }

    public List<Campaign> a(String str, int i10) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA;
        m mVarE = i.b().e("", str);
        this.f34729d = mVarE;
        if (mVarE == null) {
            this.f34729d = m.i(str);
        }
        List<Integer> listB = this.f34729d.b();
        this.f34735j = listB;
        if (listB == null || listB.size() <= 0 || !this.f34735j.contains(1) || (bVarA = com.mbridge.msdk.mbnative.cache.c.a(1)) == null) {
            return null;
        }
        return bVarA.a(str, i10);
    }

    public void a(int i10, m mVar, String str, String str2, com.mbridge.msdk.preload.listenter.a aVar) {
        Queue<Integer> queue = this.f34731f;
        if (queue == null || queue.size() <= 0) {
            return;
        }
        try {
            int iIntValue = this.f34731f.poll().intValue();
            long jLongValue = MBridgeConstans.REQUEST_TIME_OUT;
            Queue<Long> queue2 = this.f34732g;
            if (queue2 != null && queue2.size() > 0) {
                jLongValue = this.f34732g.poll().longValue();
            }
            q0.c(f34718r, "preload start queue adsource = " + iIntValue);
            a(iIntValue, jLongValue, str, str2, this.f34734i, i10, mVar, aVar);
        } catch (Throwable unused) {
            q0.b(f34718r, "queue poll exception");
        }
    }

    public void a(int i10, long j10, String str, String str2, Map<String, Object> map, int i11, m mVar, com.mbridge.msdk.preload.listenter.a aVar) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA;
        List<Campaign> listA;
        if (i10 != 1 && (bVarA = com.mbridge.msdk.mbnative.cache.c.a(i10)) != null && (listA = bVarA.a(str, this.f34740p)) != null && listA.size() > 0) {
            a(true, aVar, (String) null);
            return;
        }
        if (i10 == 1) {
            a(i10, j10, i11, mVar, str, str2, true, aVar);
        } else if (i10 != 2) {
            a(i10, j10, i11, mVar, str, str2, aVar, false);
        } else {
            a(2, j10, i11, mVar, str, str2, aVar, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x028e A[Catch: Exception -> 0x0464, TryCatch #2 {Exception -> 0x0464, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:24:0x00bd, B:26:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:43:0x013f, B:46:0x0147, B:48:0x014f, B:50:0x0155, B:52:0x015a, B:54:0x015e, B:59:0x016b, B:61:0x0173, B:63:0x0179, B:68:0x0185, B:69:0x0197, B:71:0x019b, B:73:0x01b6, B:75:0x01be, B:77:0x01cd, B:78:0x01de, B:82:0x01ef, B:84:0x01f5, B:86:0x0209, B:88:0x020f, B:93:0x0218, B:95:0x021e, B:100:0x022e, B:107:0x0251, B:114:0x0265, B:116:0x028e, B:117:0x0295, B:119:0x029d, B:121:0x02af, B:122:0x02b8, B:124:0x02c3, B:130:0x02d3, B:135:0x02e4, B:140:0x02f1, B:144:0x031d, B:146:0x0358, B:147:0x035d, B:149:0x0365, B:151:0x036f, B:152:0x038f, B:154:0x0397, B:156:0x03a1, B:157:0x03c1, B:161:0x03f5, B:163:0x0421, B:167:0x0455, B:166:0x043e, B:160:0x03f2, B:143:0x0309, B:132:0x02d9, B:133:0x02de, B:106:0x0246, B:108:0x0255, B:168:0x045b), top: B:177:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x029d A[Catch: Exception -> 0x0464, TryCatch #2 {Exception -> 0x0464, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:24:0x00bd, B:26:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:43:0x013f, B:46:0x0147, B:48:0x014f, B:50:0x0155, B:52:0x015a, B:54:0x015e, B:59:0x016b, B:61:0x0173, B:63:0x0179, B:68:0x0185, B:69:0x0197, B:71:0x019b, B:73:0x01b6, B:75:0x01be, B:77:0x01cd, B:78:0x01de, B:82:0x01ef, B:84:0x01f5, B:86:0x0209, B:88:0x020f, B:93:0x0218, B:95:0x021e, B:100:0x022e, B:107:0x0251, B:114:0x0265, B:116:0x028e, B:117:0x0295, B:119:0x029d, B:121:0x02af, B:122:0x02b8, B:124:0x02c3, B:130:0x02d3, B:135:0x02e4, B:140:0x02f1, B:144:0x031d, B:146:0x0358, B:147:0x035d, B:149:0x0365, B:151:0x036f, B:152:0x038f, B:154:0x0397, B:156:0x03a1, B:157:0x03c1, B:161:0x03f5, B:163:0x0421, B:167:0x0455, B:166:0x043e, B:160:0x03f2, B:143:0x0309, B:132:0x02d9, B:133:0x02de, B:106:0x0246, B:108:0x0255, B:168:0x045b), top: B:177:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x02af A[Catch: Exception -> 0x0464, TryCatch #2 {Exception -> 0x0464, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:24:0x00bd, B:26:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:43:0x013f, B:46:0x0147, B:48:0x014f, B:50:0x0155, B:52:0x015a, B:54:0x015e, B:59:0x016b, B:61:0x0173, B:63:0x0179, B:68:0x0185, B:69:0x0197, B:71:0x019b, B:73:0x01b6, B:75:0x01be, B:77:0x01cd, B:78:0x01de, B:82:0x01ef, B:84:0x01f5, B:86:0x0209, B:88:0x020f, B:93:0x0218, B:95:0x021e, B:100:0x022e, B:107:0x0251, B:114:0x0265, B:116:0x028e, B:117:0x0295, B:119:0x029d, B:121:0x02af, B:122:0x02b8, B:124:0x02c3, B:130:0x02d3, B:135:0x02e4, B:140:0x02f1, B:144:0x031d, B:146:0x0358, B:147:0x035d, B:149:0x0365, B:151:0x036f, B:152:0x038f, B:154:0x0397, B:156:0x03a1, B:157:0x03c1, B:161:0x03f5, B:163:0x0421, B:167:0x0455, B:166:0x043e, B:160:0x03f2, B:143:0x0309, B:132:0x02d9, B:133:0x02de, B:106:0x0246, B:108:0x0255, B:168:0x045b), top: B:177:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x02c3 A[Catch: Exception -> 0x0464, TryCatch #2 {Exception -> 0x0464, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:24:0x00bd, B:26:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:43:0x013f, B:46:0x0147, B:48:0x014f, B:50:0x0155, B:52:0x015a, B:54:0x015e, B:59:0x016b, B:61:0x0173, B:63:0x0179, B:68:0x0185, B:69:0x0197, B:71:0x019b, B:73:0x01b6, B:75:0x01be, B:77:0x01cd, B:78:0x01de, B:82:0x01ef, B:84:0x01f5, B:86:0x0209, B:88:0x020f, B:93:0x0218, B:95:0x021e, B:100:0x022e, B:107:0x0251, B:114:0x0265, B:116:0x028e, B:117:0x0295, B:119:0x029d, B:121:0x02af, B:122:0x02b8, B:124:0x02c3, B:130:0x02d3, B:135:0x02e4, B:140:0x02f1, B:144:0x031d, B:146:0x0358, B:147:0x035d, B:149:0x0365, B:151:0x036f, B:152:0x038f, B:154:0x0397, B:156:0x03a1, B:157:0x03c1, B:161:0x03f5, B:163:0x0421, B:167:0x0455, B:166:0x043e, B:160:0x03f2, B:143:0x0309, B:132:0x02d9, B:133:0x02de, B:106:0x0246, B:108:0x0255, B:168:0x045b), top: B:177:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:140:0x02f1 A[Catch: Exception -> 0x0464, TRY_ENTER, TryCatch #2 {Exception -> 0x0464, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:24:0x00bd, B:26:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:43:0x013f, B:46:0x0147, B:48:0x014f, B:50:0x0155, B:52:0x015a, B:54:0x015e, B:59:0x016b, B:61:0x0173, B:63:0x0179, B:68:0x0185, B:69:0x0197, B:71:0x019b, B:73:0x01b6, B:75:0x01be, B:77:0x01cd, B:78:0x01de, B:82:0x01ef, B:84:0x01f5, B:86:0x0209, B:88:0x020f, B:93:0x0218, B:95:0x021e, B:100:0x022e, B:107:0x0251, B:114:0x0265, B:116:0x028e, B:117:0x0295, B:119:0x029d, B:121:0x02af, B:122:0x02b8, B:124:0x02c3, B:130:0x02d3, B:135:0x02e4, B:140:0x02f1, B:144:0x031d, B:146:0x0358, B:147:0x035d, B:149:0x0365, B:151:0x036f, B:152:0x038f, B:154:0x0397, B:156:0x03a1, B:157:0x03c1, B:161:0x03f5, B:163:0x0421, B:167:0x0455, B:166:0x043e, B:160:0x03f2, B:143:0x0309, B:132:0x02d9, B:133:0x02de, B:106:0x0246, B:108:0x0255, B:168:0x045b), top: B:177:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0306  */
    /* JADX WARN: Code duplicated, block: B:143:0x0309 A[Catch: Exception -> 0x0464, TryCatch #2 {Exception -> 0x0464, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:24:0x00bd, B:26:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:43:0x013f, B:46:0x0147, B:48:0x014f, B:50:0x0155, B:52:0x015a, B:54:0x015e, B:59:0x016b, B:61:0x0173, B:63:0x0179, B:68:0x0185, B:69:0x0197, B:71:0x019b, B:73:0x01b6, B:75:0x01be, B:77:0x01cd, B:78:0x01de, B:82:0x01ef, B:84:0x01f5, B:86:0x0209, B:88:0x020f, B:93:0x0218, B:95:0x021e, B:100:0x022e, B:107:0x0251, B:114:0x0265, B:116:0x028e, B:117:0x0295, B:119:0x029d, B:121:0x02af, B:122:0x02b8, B:124:0x02c3, B:130:0x02d3, B:135:0x02e4, B:140:0x02f1, B:144:0x031d, B:146:0x0358, B:147:0x035d, B:149:0x0365, B:151:0x036f, B:152:0x038f, B:154:0x0397, B:156:0x03a1, B:157:0x03c1, B:161:0x03f5, B:163:0x0421, B:167:0x0455, B:166:0x043e, B:160:0x03f2, B:143:0x0309, B:132:0x02d9, B:133:0x02de, B:106:0x0246, B:108:0x0255, B:168:0x045b), top: B:177:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0358 A[Catch: Exception -> 0x0464, TryCatch #2 {Exception -> 0x0464, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:24:0x00bd, B:26:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:43:0x013f, B:46:0x0147, B:48:0x014f, B:50:0x0155, B:52:0x015a, B:54:0x015e, B:59:0x016b, B:61:0x0173, B:63:0x0179, B:68:0x0185, B:69:0x0197, B:71:0x019b, B:73:0x01b6, B:75:0x01be, B:77:0x01cd, B:78:0x01de, B:82:0x01ef, B:84:0x01f5, B:86:0x0209, B:88:0x020f, B:93:0x0218, B:95:0x021e, B:100:0x022e, B:107:0x0251, B:114:0x0265, B:116:0x028e, B:117:0x0295, B:119:0x029d, B:121:0x02af, B:122:0x02b8, B:124:0x02c3, B:130:0x02d3, B:135:0x02e4, B:140:0x02f1, B:144:0x031d, B:146:0x0358, B:147:0x035d, B:149:0x0365, B:151:0x036f, B:152:0x038f, B:154:0x0397, B:156:0x03a1, B:157:0x03c1, B:161:0x03f5, B:163:0x0421, B:167:0x0455, B:166:0x043e, B:160:0x03f2, B:143:0x0309, B:132:0x02d9, B:133:0x02de, B:106:0x0246, B:108:0x0255, B:168:0x045b), top: B:177:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0365 A[Catch: Exception -> 0x0464, TryCatch #2 {Exception -> 0x0464, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:24:0x00bd, B:26:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:43:0x013f, B:46:0x0147, B:48:0x014f, B:50:0x0155, B:52:0x015a, B:54:0x015e, B:59:0x016b, B:61:0x0173, B:63:0x0179, B:68:0x0185, B:69:0x0197, B:71:0x019b, B:73:0x01b6, B:75:0x01be, B:77:0x01cd, B:78:0x01de, B:82:0x01ef, B:84:0x01f5, B:86:0x0209, B:88:0x020f, B:93:0x0218, B:95:0x021e, B:100:0x022e, B:107:0x0251, B:114:0x0265, B:116:0x028e, B:117:0x0295, B:119:0x029d, B:121:0x02af, B:122:0x02b8, B:124:0x02c3, B:130:0x02d3, B:135:0x02e4, B:140:0x02f1, B:144:0x031d, B:146:0x0358, B:147:0x035d, B:149:0x0365, B:151:0x036f, B:152:0x038f, B:154:0x0397, B:156:0x03a1, B:157:0x03c1, B:161:0x03f5, B:163:0x0421, B:167:0x0455, B:166:0x043e, B:160:0x03f2, B:143:0x0309, B:132:0x02d9, B:133:0x02de, B:106:0x0246, B:108:0x0255, B:168:0x045b), top: B:177:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0397 A[Catch: Exception -> 0x0464, TryCatch #2 {Exception -> 0x0464, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:24:0x00bd, B:26:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:43:0x013f, B:46:0x0147, B:48:0x014f, B:50:0x0155, B:52:0x015a, B:54:0x015e, B:59:0x016b, B:61:0x0173, B:63:0x0179, B:68:0x0185, B:69:0x0197, B:71:0x019b, B:73:0x01b6, B:75:0x01be, B:77:0x01cd, B:78:0x01de, B:82:0x01ef, B:84:0x01f5, B:86:0x0209, B:88:0x020f, B:93:0x0218, B:95:0x021e, B:100:0x022e, B:107:0x0251, B:114:0x0265, B:116:0x028e, B:117:0x0295, B:119:0x029d, B:121:0x02af, B:122:0x02b8, B:124:0x02c3, B:130:0x02d3, B:135:0x02e4, B:140:0x02f1, B:144:0x031d, B:146:0x0358, B:147:0x035d, B:149:0x0365, B:151:0x036f, B:152:0x038f, B:154:0x0397, B:156:0x03a1, B:157:0x03c1, B:161:0x03f5, B:163:0x0421, B:167:0x0455, B:166:0x043e, B:160:0x03f2, B:143:0x0309, B:132:0x02d9, B:133:0x02de, B:106:0x0246, B:108:0x0255, B:168:0x045b), top: B:177:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x03f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x03f2 A[Catch: Exception -> 0x0464, TryCatch #2 {Exception -> 0x0464, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:24:0x00bd, B:26:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:43:0x013f, B:46:0x0147, B:48:0x014f, B:50:0x0155, B:52:0x015a, B:54:0x015e, B:59:0x016b, B:61:0x0173, B:63:0x0179, B:68:0x0185, B:69:0x0197, B:71:0x019b, B:73:0x01b6, B:75:0x01be, B:77:0x01cd, B:78:0x01de, B:82:0x01ef, B:84:0x01f5, B:86:0x0209, B:88:0x020f, B:93:0x0218, B:95:0x021e, B:100:0x022e, B:107:0x0251, B:114:0x0265, B:116:0x028e, B:117:0x0295, B:119:0x029d, B:121:0x02af, B:122:0x02b8, B:124:0x02c3, B:130:0x02d3, B:135:0x02e4, B:140:0x02f1, B:144:0x031d, B:146:0x0358, B:147:0x035d, B:149:0x0365, B:151:0x036f, B:152:0x038f, B:154:0x0397, B:156:0x03a1, B:157:0x03c1, B:161:0x03f5, B:163:0x0421, B:167:0x0455, B:166:0x043e, B:160:0x03f2, B:143:0x0309, B:132:0x02d9, B:133:0x02de, B:106:0x0246, B:108:0x0255, B:168:0x045b), top: B:177:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x0421 A[Catch: Exception -> 0x0464, TryCatch #2 {Exception -> 0x0464, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:24:0x00bd, B:26:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:43:0x013f, B:46:0x0147, B:48:0x014f, B:50:0x0155, B:52:0x015a, B:54:0x015e, B:59:0x016b, B:61:0x0173, B:63:0x0179, B:68:0x0185, B:69:0x0197, B:71:0x019b, B:73:0x01b6, B:75:0x01be, B:77:0x01cd, B:78:0x01de, B:82:0x01ef, B:84:0x01f5, B:86:0x0209, B:88:0x020f, B:93:0x0218, B:95:0x021e, B:100:0x022e, B:107:0x0251, B:114:0x0265, B:116:0x028e, B:117:0x0295, B:119:0x029d, B:121:0x02af, B:122:0x02b8, B:124:0x02c3, B:130:0x02d3, B:135:0x02e4, B:140:0x02f1, B:144:0x031d, B:146:0x0358, B:147:0x035d, B:149:0x0365, B:151:0x036f, B:152:0x038f, B:154:0x0397, B:156:0x03a1, B:157:0x03c1, B:161:0x03f5, B:163:0x0421, B:167:0x0455, B:166:0x043e, B:160:0x03f2, B:143:0x0309, B:132:0x02d9, B:133:0x02de, B:106:0x0246, B:108:0x0255, B:168:0x045b), top: B:177:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x0435  */
    /* JADX WARN: Code duplicated, block: B:166:0x043e A[Catch: Exception -> 0x0464, TryCatch #2 {Exception -> 0x0464, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:24:0x00bd, B:26:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:43:0x013f, B:46:0x0147, B:48:0x014f, B:50:0x0155, B:52:0x015a, B:54:0x015e, B:59:0x016b, B:61:0x0173, B:63:0x0179, B:68:0x0185, B:69:0x0197, B:71:0x019b, B:73:0x01b6, B:75:0x01be, B:77:0x01cd, B:78:0x01de, B:82:0x01ef, B:84:0x01f5, B:86:0x0209, B:88:0x020f, B:93:0x0218, B:95:0x021e, B:100:0x022e, B:107:0x0251, B:114:0x0265, B:116:0x028e, B:117:0x0295, B:119:0x029d, B:121:0x02af, B:122:0x02b8, B:124:0x02c3, B:130:0x02d3, B:135:0x02e4, B:140:0x02f1, B:144:0x031d, B:146:0x0358, B:147:0x035d, B:149:0x0365, B:151:0x036f, B:152:0x038f, B:154:0x0397, B:156:0x03a1, B:157:0x03c1, B:161:0x03f5, B:163:0x0421, B:167:0x0455, B:166:0x043e, B:160:0x03f2, B:143:0x0309, B:132:0x02d9, B:133:0x02de, B:106:0x0246, B:108:0x0255, B:168:0x045b), top: B:177:0x0018 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:140:0x02f1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:143:0x0309, please report this as an issue */
    @Override // com.mbridge.msdk.mbnative.controller.b
    public void a(int i10, long j10, int i11, m mVar, String str, String str2, com.mbridge.msdk.preload.listenter.a aVar, boolean z10) {
        int i12;
        int iOptInt;
        int iOptInt2;
        int i13;
        int i14;
        String strA;
        b bVar;
        long j11;
        k kVar;
        int iA;
        JSONArray jSONArrayB;
        String str3;
        String string;
        int i15;
        List<Campaign> listA;
        List<Campaign> listA2;
        try {
            com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).d();
            int iF = this.f34729d.f();
            int iE = this.f34729d.e();
            com.mbridge.msdk.mbnative.service.net.a aVar2 = new com.mbridge.msdk.mbnative.service.net.a(com.mbridge.msdk.foundation.controller.c.n().d());
            com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
            String strB = com.mbridge.msdk.foundation.controller.c.n().b();
            String strC = com.mbridge.msdk.foundation.controller.c.n().c();
            Map<String, Object> map = this.f34734i;
            if (map != null && map.containsKey(MBridgeConstans.APP_ID) && this.f34734i.containsKey(MBridgeConstans.APP_KEY) && this.f34734i.containsKey(MBridgeConstans.KEY_WORD) && this.f34734i.get(MBridgeConstans.KEY_WORD) != null) {
                if (this.f34734i.get(MBridgeConstans.APP_ID) instanceof String) {
                    strB = (String) this.f34734i.get(MBridgeConstans.APP_ID);
                }
                if (this.f34734i.get(MBridgeConstans.APP_KEY) instanceof String) {
                    strC = (String) this.f34734i.get(MBridgeConstans.APP_KEY);
                }
                String str4 = this.f34734i.get(MBridgeConstans.KEY_WORD) instanceof String ? (String) this.f34734i.get(MBridgeConstans.KEY_WORD) : null;
                if (!TextUtils.isEmpty(str4)) {
                    eVar.a("smart", k0.b(str4));
                }
            }
            String str5 = strB;
            String str6 = strC;
            eVar.a(MBridgeConstans.APP_ID, str5);
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            eVar.a("req_type", "1");
            if (!TextUtils.isEmpty(this.f34730e)) {
                eVar.a("category", this.f34730e);
            }
            if (!TextUtils.isEmpty(str2)) {
                eVar.a(MBridgeConstans.PLACEMENT_ID, str2);
            }
            eVar.a("sign", SameMD5.getMD5(str5 + str6));
            eVar.a("only_impression", "1");
            String strD = v0.d(str);
            if (!TextUtils.isEmpty(strD)) {
                eVar.a("j", strD);
            }
            int iIntValue = f34722v.get(str).intValue();
            if (iF != f34725y && iF != 0 && iIntValue != 0) {
                if (i11 == 0) {
                    com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(i10);
                    if (z10) {
                        if (bVarA != null && (listA2 = bVarA.a(str, iIntValue)) != null && listA2.size() > 0) {
                            a(true, aVar, (String) null);
                            return;
                        } else {
                            if (this.f34738n) {
                                a("", i11, str, str2, aVar);
                                return;
                            }
                            return;
                        }
                    }
                    if (i10 != 1 && bVarA != null && (listA = bVarA.a(str, iIntValue)) != null && listA.size() > 0) {
                        a(true, aVar, (String) null);
                        return;
                    }
                }
                if (iIntValue != 0) {
                    eVar.a("ad_num", iIntValue + "");
                }
                if (this.f34733h != 0) {
                    eVar.a("frame_num", this.f34733h + "");
                }
                if (this.f34734i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                    String str7 = (String) this.f34734i.get(MBridgeConstans.NATIVE_INFO);
                    if (!TextUtils.isEmpty(str7)) {
                        q0.b(f34718r, "nativeinfo" + str7);
                        try {
                            JSONArray jSONArray = new JSONArray(str7);
                            str3 = str7;
                            if (jSONArray.length() > 0) {
                                int i16 = 0;
                                iOptInt = 0;
                                iOptInt2 = 0;
                                while (i16 < jSONArray.length()) {
                                    try {
                                        JSONObject jSONObject = (JSONObject) jSONArray.opt(i16);
                                        JSONArray jSONArray2 = jSONArray;
                                        int i17 = i16;
                                        int iOptInt3 = jSONObject.optInt("id", 0);
                                        if (2 == iOptInt3) {
                                            iOptInt = jSONObject.optInt("ad_num");
                                            if (iF > 0) {
                                                jSONObject.put("ad_num", iF);
                                            }
                                        } else if (3 == iOptInt3) {
                                            iOptInt2 = jSONObject.optInt("ad_num");
                                            if (iF > 0) {
                                                jSONObject.put("ad_num", iF);
                                            }
                                        }
                                        i16 = i17 + 1;
                                        jSONArray = jSONArray2;
                                    } catch (JSONException e10) {
                                        e = e10;
                                        q0.b(f34718r, com.mbridge.msdk.mbnative.common.a.a(e));
                                        string = str3;
                                        eVar.a(MBridgeConstans.NATIVE_INFO, string);
                                        iF = iIntValue;
                                        i12 = iOptInt2;
                                        eVar.a("ad_num", iF + "");
                                        eVar.a("ping_mode", "1");
                                        if (i.b().f(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                                            i.b().a();
                                        }
                                        if (!NativeController.b(this.f34734i)) {
                                            jSONArrayB = v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), str);
                                            if (jSONArrayB.length() > 0) {
                                                eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f33883h, v0.a(jSONArrayB));
                                            }
                                        }
                                        a(eVar, i10);
                                        if (f34721u.containsKey(str)) {
                                            i13 = 0;
                                        } else {
                                            i13 = 0;
                                        }
                                        if (this.f34734i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                                            i14 = 1;
                                            if (i10 == 1) {
                                                eVar.a("tnum", this.f34739o + "");
                                            }
                                            eVar.a("offset", i13 + "");
                                            eVar.a("ad_type", "42");
                                            eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
                                            strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, IronSourceConstants.EVENTS_NATIVE);
                                            if (!TextUtils.isEmpty(strA)) {
                                                eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f33882g, strA);
                                            }
                                            if (this.f34734i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                                                eVar.a("video_width", ((Integer) this.f34734i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                                            }
                                            if (this.f34734i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                                                eVar.a("video_height", ((Integer) this.f34734i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                                            }
                                            eVar.a("video_version", "2.0");
                                            bVar = new b(i10);
                                            bVar.setUnitId(str);
                                            bVar.setPlacementId(str2);
                                            bVar.setAdType(42);
                                            bVar.d(iIntValue);
                                            bVar.c(iOptInt);
                                            bVar.e(i12);
                                            bVar.b(iE);
                                            bVar.a(aVar);
                                            if (i10 == 1) {
                                                bVar.b(true);
                                            } else {
                                                bVar.b(true);
                                            }
                                            bVar.b(NativeController.a(this.f34734i));
                                            c cVar = new c(1, bVar, i11, str, str2);
                                            bVar.a(cVar);
                                            bVar.a(i11);
                                            cVar.a(aVar);
                                            cVar.a(z10);
                                            cVar.a(str);
                                            if (i11 == 0) {
                                                j11 = j10;
                                                aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                                            } else {
                                                j11 = j10;
                                                if (i11 == 1) {
                                                    aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f33848b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                                                }
                                            }
                                            this.f34706a.postDelayed(cVar, j11);
                                            return;
                                        }
                                        i14 = 1;
                                        if (i10 == i14) {
                                            eVar.a("tnum", this.f34740p + "");
                                        }
                                        eVar.a("offset", i13 + "");
                                        eVar.a("ad_type", "42");
                                        eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
                                        strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, IronSourceConstants.EVENTS_NATIVE);
                                        if (!TextUtils.isEmpty(strA)) {
                                            eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f33882g, strA);
                                        }
                                        if (this.f34734i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                                            eVar.a("video_width", ((Integer) this.f34734i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                                        }
                                        if (this.f34734i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                                            eVar.a("video_height", ((Integer) this.f34734i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                                        }
                                        eVar.a("video_version", "2.0");
                                        bVar = new b(i10);
                                        bVar.setUnitId(str);
                                        bVar.setPlacementId(str2);
                                        bVar.setAdType(42);
                                        bVar.d(iIntValue);
                                        bVar.c(iOptInt);
                                        bVar.e(i12);
                                        bVar.b(iE);
                                        bVar.a(aVar);
                                        if (i10 == 1) {
                                            bVar.b(true);
                                        } else {
                                            bVar.b(true);
                                        }
                                        bVar.b(NativeController.a(this.f34734i));
                                        c cVar2 = new c(1, bVar, i11, str, str2);
                                        bVar.a(cVar2);
                                        bVar.a(i11);
                                        cVar2.a(aVar);
                                        cVar2.a(z10);
                                        cVar2.a(str);
                                        if (i11 == 0) {
                                            j11 = j10;
                                            aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                                        } else {
                                            j11 = j10;
                                            if (i11 == 1) {
                                                aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f33848b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                                            }
                                        }
                                        this.f34706a.postDelayed(cVar2, j11);
                                        return;
                                    }
                                }
                                i15 = iOptInt2;
                            } else {
                                i15 = 0;
                                iOptInt = 0;
                            }
                            JSONArray jSONArray3 = jSONArray;
                            try {
                                this.f34739o = Math.max(iOptInt, i15);
                                iOptInt2 = i15;
                                string = jSONArray3.toString();
                            } catch (JSONException e11) {
                                e = e11;
                                iOptInt2 = i15;
                                q0.b(f34718r, com.mbridge.msdk.mbnative.common.a.a(e));
                                string = str3;
                            }
                        } catch (JSONException e12) {
                            e = e12;
                            str3 = str7;
                            iOptInt = 0;
                            iOptInt2 = 0;
                        }
                        eVar.a(MBridgeConstans.NATIVE_INFO, string);
                    }
                    iF = iIntValue;
                    i12 = iOptInt2;
                    eVar.a("ad_num", iF + "");
                    eVar.a("ping_mode", "1");
                    if (i.b().f(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                        i.b().a();
                    }
                    if (!NativeController.b(this.f34734i)) {
                        jSONArrayB = v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), str);
                        if (jSONArrayB.length() > 0) {
                            eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f33883h, v0.a(jSONArrayB));
                        }
                    }
                    a(eVar, i10);
                    if (f34721u.containsKey(str) || (kVar = f34721u.get(str)) == null) {
                        i13 = 0;
                    } else {
                        if (i10 == 1 || i10 != 2) {
                            iA = kVar.a();
                        } else {
                            iA = kVar.b();
                        }
                        i13 = iA;
                    }
                    if (this.f34734i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        i14 = 1;
                        if (i10 == 1) {
                            eVar.a("tnum", this.f34739o + "");
                        }
                        eVar.a("offset", i13 + "");
                        eVar.a("ad_type", "42");
                        eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
                        strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, IronSourceConstants.EVENTS_NATIVE);
                        if (!TextUtils.isEmpty(strA)) {
                            eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f33882g, strA);
                        }
                        if (this.f34734i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) && (this.f34734i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH) instanceof Integer)) {
                            eVar.a("video_width", ((Integer) this.f34734i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                        }
                        if (this.f34734i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) && (this.f34734i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT) instanceof Integer)) {
                            eVar.a("video_height", ((Integer) this.f34734i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                        }
                        eVar.a("video_version", "2.0");
                        bVar = new b(i10);
                        bVar.setUnitId(str);
                        bVar.setPlacementId(str2);
                        bVar.setAdType(42);
                        bVar.d(iIntValue);
                        bVar.c(iOptInt);
                        bVar.e(i12);
                        bVar.b(iE);
                        bVar.a(aVar);
                        if (i10 == 1 || z10) {
                            bVar.b(true);
                        }
                        bVar.b(NativeController.a(this.f34734i));
                        c cVar3 = new c(1, bVar, i11, str, str2);
                        bVar.a(cVar3);
                        bVar.a(i11);
                        cVar3.a(aVar);
                        cVar3.a(z10);
                        cVar3.a(str);
                        if (i11 == 0) {
                            j11 = j10;
                            aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                        } else {
                            j11 = j10;
                            if (i11 == 1) {
                                aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f33848b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                            }
                        }
                        this.f34706a.postDelayed(cVar3, j11);
                        return;
                    }
                    i14 = 1;
                    if (i10 == i14) {
                        eVar.a("tnum", this.f34740p + "");
                    }
                    eVar.a("offset", i13 + "");
                    eVar.a("ad_type", "42");
                    eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
                    strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, IronSourceConstants.EVENTS_NATIVE);
                    if (!TextUtils.isEmpty(strA)) {
                        eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f33882g, strA);
                    }
                    if (this.f34734i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                        eVar.a("video_width", ((Integer) this.f34734i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                    }
                    if (this.f34734i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                        eVar.a("video_height", ((Integer) this.f34734i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                    }
                    eVar.a("video_version", "2.0");
                    bVar = new b(i10);
                    bVar.setUnitId(str);
                    bVar.setPlacementId(str2);
                    bVar.setAdType(42);
                    bVar.d(iIntValue);
                    bVar.c(iOptInt);
                    bVar.e(i12);
                    bVar.b(iE);
                    bVar.a(aVar);
                    if (i10 == 1) {
                        bVar.b(true);
                    } else {
                        bVar.b(true);
                    }
                    bVar.b(NativeController.a(this.f34734i));
                    c cVar4 = new c(1, bVar, i11, str, str2);
                    bVar.a(cVar4);
                    bVar.a(i11);
                    cVar4.a(aVar);
                    cVar4.a(z10);
                    cVar4.a(str);
                    if (i11 == 0) {
                        j11 = j10;
                        aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                    } else {
                        j11 = j10;
                        if (i11 == 1) {
                            aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f33848b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                        }
                    }
                    this.f34706a.postDelayed(cVar4, j11);
                    return;
                }
                if (iF != f34726z && iF != 0) {
                    i12 = 0;
                    iOptInt = 0;
                }
                eVar.a("ad_num", iF + "");
                eVar.a("ping_mode", "1");
                if (i.b().f(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                    i.b().a();
                }
                if (!NativeController.b(this.f34734i)) {
                    jSONArrayB = v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), str);
                    if (jSONArrayB.length() > 0) {
                        eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f33883h, v0.a(jSONArrayB));
                    }
                }
                a(eVar, i10);
                if (f34721u.containsKey(str)) {
                    i13 = 0;
                } else {
                    i13 = 0;
                }
                if (this.f34734i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                    i14 = 1;
                    if (i10 == 1) {
                        eVar.a("tnum", this.f34739o + "");
                    }
                    eVar.a("offset", i13 + "");
                    eVar.a("ad_type", "42");
                    eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
                    strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, IronSourceConstants.EVENTS_NATIVE);
                    if (!TextUtils.isEmpty(strA)) {
                        eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f33882g, strA);
                    }
                    if (this.f34734i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                        eVar.a("video_width", ((Integer) this.f34734i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                    }
                    if (this.f34734i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                        eVar.a("video_height", ((Integer) this.f34734i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                    }
                    eVar.a("video_version", "2.0");
                    bVar = new b(i10);
                    bVar.setUnitId(str);
                    bVar.setPlacementId(str2);
                    bVar.setAdType(42);
                    bVar.d(iIntValue);
                    bVar.c(iOptInt);
                    bVar.e(i12);
                    bVar.b(iE);
                    bVar.a(aVar);
                    if (i10 == 1) {
                        bVar.b(true);
                    } else {
                        bVar.b(true);
                    }
                    bVar.b(NativeController.a(this.f34734i));
                    c cVar5 = new c(1, bVar, i11, str, str2);
                    bVar.a(cVar5);
                    bVar.a(i11);
                    cVar5.a(aVar);
                    cVar5.a(z10);
                    cVar5.a(str);
                    if (i11 == 0) {
                        j11 = j10;
                        aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                    } else {
                        j11 = j10;
                        if (i11 == 1) {
                            aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f33848b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                        }
                    }
                    this.f34706a.postDelayed(cVar5, j11);
                    return;
                }
                i14 = 1;
                if (i10 == i14) {
                    eVar.a("tnum", this.f34740p + "");
                }
                eVar.a("offset", i13 + "");
                eVar.a("ad_type", "42");
                eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
                strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, IronSourceConstants.EVENTS_NATIVE);
                if (!TextUtils.isEmpty(strA)) {
                    eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f33882g, strA);
                }
                if (this.f34734i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                    eVar.a("video_width", ((Integer) this.f34734i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                }
                if (this.f34734i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                    eVar.a("video_height", ((Integer) this.f34734i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                }
                eVar.a("video_version", "2.0");
                bVar = new b(i10);
                bVar.setUnitId(str);
                bVar.setPlacementId(str2);
                bVar.setAdType(42);
                bVar.d(iIntValue);
                bVar.c(iOptInt);
                bVar.e(i12);
                bVar.b(iE);
                bVar.a(aVar);
                if (i10 == 1) {
                    bVar.b(true);
                } else {
                    bVar.b(true);
                }
                bVar.b(NativeController.a(this.f34734i));
                c cVar6 = new c(1, bVar, i11, str, str2);
                bVar.a(cVar6);
                bVar.a(i11);
                cVar6.a(aVar);
                cVar6.a(z10);
                cVar6.a(str);
                if (i11 == 0) {
                    j11 = j10;
                    aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                } else {
                    j11 = j10;
                    if (i11 == 1) {
                        aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f33848b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                    }
                }
                this.f34706a.postDelayed(cVar6, j11);
                return;
                iOptInt = 0;
                iOptInt2 = 0;
                iF = iIntValue;
                i12 = iOptInt2;
                eVar.a("ad_num", iF + "");
                eVar.a("ping_mode", "1");
                if (i.b().f(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                    i.b().a();
                }
                if (!NativeController.b(this.f34734i)) {
                    jSONArrayB = v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), str);
                    if (jSONArrayB.length() > 0) {
                        eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f33883h, v0.a(jSONArrayB));
                    }
                }
                a(eVar, i10);
                if (f34721u.containsKey(str)) {
                    i13 = 0;
                } else {
                    i13 = 0;
                }
                if (this.f34734i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                    i14 = 1;
                    if (i10 == 1) {
                        eVar.a("tnum", this.f34739o + "");
                    }
                    eVar.a("offset", i13 + "");
                    eVar.a("ad_type", "42");
                    eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
                    strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, IronSourceConstants.EVENTS_NATIVE);
                    if (!TextUtils.isEmpty(strA)) {
                        eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f33882g, strA);
                    }
                    if (this.f34734i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                        eVar.a("video_width", ((Integer) this.f34734i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                    }
                    if (this.f34734i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                        eVar.a("video_height", ((Integer) this.f34734i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                    }
                    eVar.a("video_version", "2.0");
                    bVar = new b(i10);
                    bVar.setUnitId(str);
                    bVar.setPlacementId(str2);
                    bVar.setAdType(42);
                    bVar.d(iIntValue);
                    bVar.c(iOptInt);
                    bVar.e(i12);
                    bVar.b(iE);
                    bVar.a(aVar);
                    if (i10 == 1) {
                        bVar.b(true);
                    } else {
                        bVar.b(true);
                    }
                    bVar.b(NativeController.a(this.f34734i));
                    c cVar7 = new c(1, bVar, i11, str, str2);
                    bVar.a(cVar7);
                    bVar.a(i11);
                    cVar7.a(aVar);
                    cVar7.a(z10);
                    cVar7.a(str);
                    if (i11 == 0) {
                        j11 = j10;
                        aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                    } else {
                        j11 = j10;
                        if (i11 == 1) {
                            aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f33848b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                        }
                    }
                    this.f34706a.postDelayed(cVar7, j11);
                    return;
                }
                i14 = 1;
                if (i10 == i14) {
                    eVar.a("tnum", this.f34740p + "");
                }
                eVar.a("offset", i13 + "");
                eVar.a("ad_type", "42");
                eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
                strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, IronSourceConstants.EVENTS_NATIVE);
                if (!TextUtils.isEmpty(strA)) {
                    eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f33882g, strA);
                }
                if (this.f34734i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                    eVar.a("video_width", ((Integer) this.f34734i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                }
                if (this.f34734i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                    eVar.a("video_height", ((Integer) this.f34734i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                }
                eVar.a("video_version", "2.0");
                bVar = new b(i10);
                bVar.setUnitId(str);
                bVar.setPlacementId(str2);
                bVar.setAdType(42);
                bVar.d(iIntValue);
                bVar.c(iOptInt);
                bVar.e(i12);
                bVar.b(iE);
                bVar.a(aVar);
                if (i10 == 1) {
                    bVar.b(true);
                } else {
                    bVar.b(true);
                }
                bVar.b(NativeController.a(this.f34734i));
                c cVar8 = new c(1, bVar, i11, str, str2);
                bVar.a(cVar8);
                bVar.a(i11);
                cVar8.a(aVar);
                cVar8.a(z10);
                cVar8.a(str);
                if (i11 == 0) {
                    j11 = j10;
                    aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                } else {
                    j11 = j10;
                    if (i11 == 1) {
                        aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f33848b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j11, 30000L));
                    }
                }
                this.f34706a.postDelayed(cVar8, j11);
                return;
            }
            a("The request was refused", i11, str, str2, aVar);
        } catch (Exception e13) {
            String str8 = f34718r;
            q0.b(str8, com.mbridge.msdk.mbnative.common.a.a(e13));
            q0.b(str8, e13.getMessage());
        }
    }

    public static void a(int i10, String str) {
        k kVar;
        if (f34721u.containsKey(str)) {
            kVar = f34721u.get(str);
        } else {
            kVar = new k();
        }
        int iIntValue = f34722v.get(str).intValue();
        int iIntValue2 = d().containsKey(str) ? d().get(str).intValue() : 1;
        if (i10 == 1) {
            int iA = kVar.a() + iIntValue;
            kVar.a(iA <= iIntValue2 ? iA : 0);
        } else if (i10 == 2) {
            int iB = kVar.b() + iIntValue;
            kVar.b(iB <= iIntValue2 ? iB : 0);
        }
        f34721u.put(str, kVar);
    }

    public void a(String str, int i10, String str2, String str3, com.mbridge.msdk.preload.listenter.a aVar) {
        Log.e(f34718r, str);
        try {
            Queue<Integer> queue = this.f34731f;
            if ((queue != null && queue.size() <= 0) || this.f34731f == null) {
                a(false, aVar, str);
            } else {
                a(i10, this.f34729d, str2, str3, aVar);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(String str, String str2, String str3) {
        if (this.f34727b == null) {
            this.f34727b = new com.mbridge.msdk.setting.k();
        }
        this.f34727b.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, str2, str3);
    }

    public void a(boolean z10, com.mbridge.msdk.preload.listenter.a aVar, String str) {
        if (z10) {
            if (aVar == null || aVar.a()) {
                return;
            }
            aVar.a(true);
            aVar.onPreloadSucceed();
            return;
        }
        if (aVar == null || aVar.a()) {
            return;
        }
        aVar.a(true);
        aVar.onPreloadFaild(str);
    }

    public void a(boolean z10, Campaign campaign) {
        if (campaign == null) {
            return;
        }
        if (z10 && campaign.getIconDrawable() == null) {
            campaign.loadIconUrlAsyncWithBlock(null);
        }
        if (z10 && campaign.getBigDrawable() == null) {
            campaign.loadImageUrlAsyncWithBlock(null);
        }
    }

    public void a(Thread thread) {
        if (!MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD) {
            thread.run();
        } else {
            thread.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<CampaignEx> list, String str) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    try {
                        int i10 = MBMediaView.f35024p0;
                        Object objInvoke = com.mbridge.msdk.videocommon.download.b.class.getMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                        if (objInvoke != null) {
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(objInvoke, com.mbridge.msdk.foundation.controller.c.n().d(), str, new CopyOnWriteArrayList(list), 1, null);
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(objInvoke, str);
                        }
                    } catch (Exception unused) {
                        q0.b(f34718r, "please import the videocommon aar");
                    }
                }
            } catch (Exception e10) {
                q0.b(f34718r, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }
    }
}

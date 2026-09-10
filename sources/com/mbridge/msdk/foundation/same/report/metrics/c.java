package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c implements Serializable, Cloneable {
    private int A;
    private int B;
    private CampaignEx C;
    private CopyOnWriteArrayList<CampaignEx> D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f33976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Map<String, String>> f33977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Map<String, String>> f33978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Map<String, String>> f33979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Long> f33980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.foundation.error.b f33981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f33982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f33983h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f33984i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f33985j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f33986k;
    private String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f33987m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f33988n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f33989o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f33990p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f33991q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f33992r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f33993s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f33994t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f33995u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f33996v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f33997w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f33998x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f33999y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f34000z;

    public c() {
        this.f33976a = false;
        this.f33977b = new HashMap();
        this.f33978c = new HashMap();
        this.f33979d = new HashMap();
        this.f33980e = new HashMap();
        this.f33982g = "";
        this.f33983h = new CopyOnWriteArrayList<>();
        this.f33993s = -1;
        this.f33995u = false;
        this.f33997w = false;
        this.D = new CopyOnWriteArrayList<>();
    }

    public int A() {
        return this.B;
    }

    public String B() {
        Map<String, String> map;
        if (!TextUtils.isEmpty(this.f33984i)) {
            return this.f33984i;
        }
        try {
            if (TextUtils.isEmpty(this.f33984i)) {
                String str = this.f33982g + this.f33992r;
                Map<String, Map<String, String>> map2 = this.f33977b;
                if (map2 != null && map2.containsKey(str) && (map = this.f33977b.get(str)) != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                    this.f33984i = map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return this.f33984i;
    }

    public String C() {
        return this.f33988n;
    }

    public boolean D() {
        return this.f33995u;
    }

    public boolean E() {
        return this.f33997w;
    }

    public boolean F() {
        return this.f33996v;
    }

    public boolean G() {
        return this.f33976a;
    }

    public void a(boolean z10) {
        this.f33995u = z10;
    }

    public void b(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    if (!this.D.isEmpty()) {
                        this.D.clear();
                    }
                    this.D.addAll(list);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public Map<String, String> c(String str) {
        com.mbridge.msdk.foundation.error.b bVarU;
        com.mbridge.msdk.foundation.error.b bVarU2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        e eVar = new e();
        try {
            this.f33992r = str;
            eVar.a("ts", Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.isEmpty(B())) {
                eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, B());
            }
            if (this.f33985j != 0) {
                eVar.a("adtp", Integer.valueOf(g()));
            }
            if (!TextUtils.isEmpty(s())) {
                eVar.a(CampaignEx.JSON_KEY_HB, s());
            }
            if (!TextUtils.isEmpty(l())) {
                eVar.a("bid_tk", l());
            }
            if (!TextUtils.isEmpty(str)) {
                eVar.a(X3.i.W, str);
            }
            if (Arrays.asList(b.f33962a).contains(str)) {
                eVar.a("from_cache", D() ? "1" : "2");
            }
            if ("2000047".contains(str) && (bVarU2 = u()) != null) {
                eVar.a("type", Integer.valueOf(bVarU2.h()));
                eVar.a("reason", bVarU2.l());
                if (!TextUtils.isEmpty(bVarU2.m())) {
                    eVar.a("reason_d", bVarU2.m());
                    eVar.a("type_d", Integer.valueOf(bVarU2.n()));
                }
            }
            if ("2000048".contains(str) && (bVarU = u()) != null && !TextUtils.isEmpty(bVarU.m())) {
                eVar.a("type", Integer.valueOf(bVarU.n()));
                eVar.a("reason", bVarU.m());
            }
            if (this.f33985j == 296) {
                eVar.a("auto_load", j());
                eVar.a("auto_refresh", Integer.valueOf(i()));
                eVar.a("auto_refresh_interval", Integer.valueOf(k()));
                eVar.a("content_type", Integer.valueOf(p()));
                eVar.a("temp_display_type", Integer.valueOf(A()));
            }
            a(eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return eVar.a();
    }

    @NonNull
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void d(String str) {
        if (this.f33980e == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f33980e.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public void e(int i10) {
        this.f33993s = i10;
    }

    public void f(String str) {
        this.f33991q = str;
    }

    public int g() {
        return this.f33985j;
    }

    public void h(String str) {
        this.f33990p = str;
    }

    public void i(String str) {
        this.f33982g = str;
    }

    public void j(String str) {
        this.f33992r = str;
    }

    public void k(String str) {
        this.l = str;
    }

    public String l() {
        return this.f33986k;
    }

    public List<CampaignEx> m() {
        return this.f33983h;
    }

    public CampaignEx n() {
        return this.C;
    }

    public List<CampaignEx> o() {
        return this.D;
    }

    public int p() {
        return this.A;
    }

    public int q() {
        return this.f33993s;
    }

    public int r() {
        return this.f33994t;
    }

    public String s() {
        return this.f33990p;
    }

    public String t() {
        return this.f33982g;
    }

    public com.mbridge.msdk.foundation.error.b u() {
        return this.f33981f;
    }

    public Map<String, Map<String, String>> v() {
        return this.f33979d;
    }

    public Map<String, Map<String, String>> w() {
        return this.f33977b;
    }

    public String x() {
        return this.l;
    }

    public String y() {
        return this.f33989o;
    }

    public String z() {
        return this.f33987m;
    }

    public void a(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                if (!this.f33983h.isEmpty()) {
                    this.f33983h.clear();
                }
                this.f33983h.addAll(list);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = this.f33982g + str;
            Map<String, Map<String, String>> map = this.f33977b;
            if (map == null || !map.containsKey(str2)) {
                return;
            }
            this.f33977b.remove(str2);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void f(int i10) {
        this.f33994t = i10;
    }

    public void g(String str) {
        this.f33986k = str;
    }

    public int i() {
        return this.f33999y;
    }

    public String j() {
        return this.f33991q;
    }

    public int k() {
        return this.f34000z;
    }

    public void l(String str) {
        this.f33989o = str;
    }

    public void m(String str) {
        this.f33987m = str;
    }

    public void n(String str) {
        this.f33984i = str;
    }

    public void o(String str) {
        this.f33988n = str;
    }

    public void d(boolean z10) {
        this.f33998x = z10;
    }

    public void g(int i10) {
        this.B = i10;
    }

    public void d(int i10) {
        this.A = i10;
    }

    public void b(String str, e eVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || eVar == null) {
            return;
        }
        try {
            String str2 = this.f33982g + str;
            Map<String, Map<String, String>> map2 = this.f33978c;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f33978c.get(str2)) != null) {
                    map.putAll(eVar.a());
                } else {
                    this.f33978c.put(str2, eVar.a());
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(CampaignEx campaignEx) {
        this.C = campaignEx;
        if (campaignEx == null) {
            return;
        }
        try {
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.D;
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                for (int i10 = 0; i10 < this.D.size(); i10++) {
                    if (this.D.get(i10) != null && this.D.get(i10).getId().equals(campaignEx.getId())) {
                        this.D.set(i10, campaignEx);
                        break;
                    }
                }
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.f33983h;
            if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.isEmpty()) {
                return;
            }
            for (int i11 = 0; i11 < this.f33983h.size(); i11++) {
                if (this.f33983h.get(i11) != null && this.f33983h.get(i11).getId().equals(campaignEx.getId())) {
                    this.f33983h.set(i11, campaignEx);
                    return;
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public c(boolean z10) {
        this.f33976a = false;
        this.f33977b = new HashMap();
        this.f33978c = new HashMap();
        this.f33979d = new HashMap();
        this.f33980e = new HashMap();
        this.f33982g = "";
        this.f33983h = new CopyOnWriteArrayList<>();
        this.f33993s = -1;
        this.f33995u = false;
        this.f33997w = false;
        this.D = new CopyOnWriteArrayList<>();
        this.f33976a = z10;
    }

    public long b(String str) {
        Map<String, Long> map;
        try {
            if (!TextUtils.isEmpty(str) && (map = this.f33980e) != null && map.containsKey(str)) {
                Long l = this.f33980e.get(str);
                return System.currentTimeMillis() - (l != null ? l.longValue() : 0L);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return 0L;
    }

    public void a(int i10) {
        this.f33985j = i10;
    }

    public Map<String, String> a(String str) {
        return this.f33978c.containsKey(str) ? this.f33978c.remove(str) : new HashMap();
    }

    public void b(boolean z10) {
        this.f33997w = z10;
    }

    public void a(String str, e eVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || eVar == null) {
            return;
        }
        try {
            String str2 = this.f33982g + str;
            Map<String, Map<String, String>> map2 = this.f33977b;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f33977b.get(str2)) != null) {
                    map.putAll(eVar.a());
                } else {
                    this.f33977b.put(str2, eVar.a());
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void b(int i10) {
        this.f33999y = i10;
    }

    private void a(e eVar) {
        if ("2000126".equals(this.f33992r)) {
            String strA = com.mbridge.msdk.foundation.same.net.d.a(l());
            if (eVar != null) {
                eVar.a("dns_ty", Integer.valueOf(com.mbridge.msdk.setting.e.a().a(strA)));
                eVar.a("dns_hs", strA);
            }
        }
    }

    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        this.f33981f = bVar;
    }

    public void c(boolean z10) {
        this.f33996v = z10;
    }

    public void c(int i10) {
        this.f34000z = i10;
    }
}

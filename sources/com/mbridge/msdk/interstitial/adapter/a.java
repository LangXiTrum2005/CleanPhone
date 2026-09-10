package com.mbridge.msdk.interstitial.adapter;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.setting.m;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f34280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f34284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f34285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f34286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.interstitial.controller.a.b f34287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private m f34288i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Handler f34289j;

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.adapter.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class HandlerC0134a extends Handler {
        public HandlerC0134a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object obj;
            Object obj2;
            try {
                int i10 = message.what;
                if (i10 == 3) {
                    if (a.this.f34287h == null || (obj = message.obj) == null || !(obj instanceof String)) {
                        return;
                    }
                    a.this.f34287h.b(a.this.f34284e, (String) obj);
                    return;
                }
                if (i10 == 4 && a.this.f34287h != null && (obj2 = message.obj) != null && (obj2 instanceof String)) {
                    a.this.f34287h.a(a.this.f34284e, (String) obj2);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends com.mbridge.msdk.interstitial.request.b {
        public b() {
        }

        @Override // com.mbridge.msdk.interstitial.request.b
        public void a(CampaignUnit campaignUnit) {
            try {
                a.this.a(campaignUnit);
            } catch (Exception e10) {
                e10.printStackTrace();
                a.this.b("can't show because unknow error");
                a.this.m();
            }
        }

        @Override // com.mbridge.msdk.interstitial.request.b
        public void b(int i10, String str) {
            q0.b("IntersAdapter", str);
            a.this.b(str);
            a.this.m();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c extends com.mbridge.msdk.foundation.same.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f34292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f34293b;

        public c(CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            this.f34292a = campaignEx;
            this.f34293b = context;
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(str, cVar, this.f34292a, this.f34293b, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f34295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f34296b;

        public d(List list, List list2) {
            this.f34295a = list;
            this.f34296b = list2;
        }

        @Override // java.lang.Runnable
        public void run() {
            List list = this.f34295a;
            if (list == null || list.size() <= 0) {
                a.this.b("no ads available");
            } else {
                a aVar = a.this;
                aVar.a(aVar.f34281b, (List<CampaignEx>) a.this.a((List<CampaignEx>) this.f34295a));
                CampaignEx campaignEx = (CampaignEx) this.f34295a.get(0);
                a.this.c(campaignEx != null ? campaignEx.getRequestId() : "");
            }
            j.a(g.a(a.this.f34280a)).d();
            List list2 = this.f34296b;
            if (list2 == null || list2.size() <= 0) {
                return;
            }
            a.this.c((List<CampaignEx>) this.f34296b);
        }
    }

    public a(Context context, String str, String str2, String str3, boolean z10) {
        this.f34280a = context;
        this.f34281b = str;
        this.f34282c = str2;
        this.f34286g = str3;
        this.f34284e = z10;
        m mVarE = i.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), str);
        this.f34288i = mVarE;
        if (mVarE == null) {
            this.f34288i = m.h(this.f34281b);
        }
        i();
    }

    private int g() {
        try {
            Map<String, Integer> map = com.mbridge.msdk.interstitial.controller.a.f34303q;
            int iIntValue = (TextUtils.isEmpty(this.f34281b) || map == null || !map.containsKey(this.f34281b)) ? 1 : map.get(this.f34281b).intValue();
            if (iIntValue <= 0) {
                return 1;
            }
            return iIntValue;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 1;
        }
    }

    private String h() {
        try {
            return !TextUtils.isEmpty(com.mbridge.msdk.interstitial.controller.a.f34301o) ? com.mbridge.msdk.interstitial.controller.a.f34301o : "";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    private void i() {
        this.f34289j = new HandlerC0134a(Looper.getMainLooper());
    }

    private e l() {
        String strB = com.mbridge.msdk.foundation.controller.c.n().b();
        String md5 = SameMD5.getMD5(com.mbridge.msdk.foundation.controller.c.n().b() + com.mbridge.msdk.foundation.controller.c.n().c());
        int i10 = this.f34284e ? 3 : 2;
        this.f34285f = 1;
        if (this.f34288i.e() > 0) {
            this.f34285f = this.f34288i.e();
        }
        int iF = this.f34288i.f() > 0 ? this.f34288i.f() : 1;
        String strA = com.mbridge.msdk.foundation.same.buffer.b.a(this.f34281b, "interstitial");
        this.f34283d = b();
        String strH = h();
        if (TextUtils.isEmpty(this.f34286g)) {
            this.f34286g = "0";
        }
        e eVar = new e();
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, MBridgeConstans.APP_ID, strB);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, MBridgeConstans.PROPERTIES_UNIT_ID, this.f34281b);
        if (!TextUtils.isEmpty(this.f34282c)) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, MBridgeConstans.PLACEMENT_ID, this.f34282c);
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "sign", md5);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "category", this.f34286g);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "req_type", i10 + "");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ad_num", iF + "");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "tnum", this.f34285f + "");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "only_impression", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ping_mode", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, e.f33882g, strA);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, e.f33883h, c());
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, CampaignEx.JSON_KEY_AD_SOURCE_ID, "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, e.f33884i, strH);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ad_type", "279");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "offset", this.f34283d + "");
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        try {
            if (TextUtils.isEmpty(this.f34281b)) {
                return;
            }
            com.mbridge.msdk.interstitial.controller.a.a(this.f34281b, 0);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void n() {
        try {
            this.f34283d += this.f34285f;
            if (this.f34283d > g()) {
                this.f34283d = 0;
            }
            if (TextUtils.isEmpty(this.f34281b)) {
                return;
            }
            com.mbridge.msdk.interstitial.controller.a.a(this.f34281b, this.f34283d);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public boolean f() {
        return this.f34284e;
    }

    public void j() {
        if (this.f34280a == null) {
            b("context is null");
            return;
        }
        if (TextUtils.isEmpty(this.f34281b)) {
            b("unitid is null");
            return;
        }
        m mVar = this.f34288i;
        if (mVar == null) {
            b("unitSetting is null please call load");
            return;
        }
        if (mVar.f() <= 0) {
            b("controller don't request ad");
            return;
        }
        a();
        List<CampaignEx> listE = e();
        if (listE == null || listE.size() <= 0) {
            k();
        } else {
            CampaignEx campaignEx = listE.get(0);
            c(campaignEx != null ? campaignEx.getRequestId() : "");
        }
    }

    public void k() {
        try {
            if (this.f34280a == null) {
                b("context is null");
                return;
            }
            if (TextUtils.isEmpty(this.f34281b)) {
                b("unitid is null");
                return;
            }
            if (this.f34288i == null) {
                b("unitSetting is null please call load");
                return;
            }
            e eVarL = l();
            if (eVarL == null) {
                b("request parameter is null");
                return;
            }
            String strD = v0.d(this.f34281b);
            if (!TextUtils.isEmpty(strD)) {
                eVarL.a("j", strD);
            }
            com.mbridge.msdk.interstitial.request.a aVar = new com.mbridge.msdk.interstitial.request.a(this.f34280a);
            b bVar = new b();
            bVar.setUnitId(this.f34281b);
            bVar.setPlacementId(this.f34282c);
            bVar.setAdType(279);
            aVar.choiceV3OrV5BySetting(1, eVarL, bVar, "", 30000L);
        } catch (Exception e10) {
            e10.printStackTrace();
            b("can't show because unknow error");
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        if (this.f34289j != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = str;
            messageObtain.what = 3;
            this.f34289j.sendMessage(messageObtain);
        }
    }

    private List<CampaignEx> e() {
        try {
            if (com.mbridge.msdk.interstitial.cache.a.a() != null) {
                return com.mbridge.msdk.interstitial.cache.a.a().a(this.f34281b, 1);
            }
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public CampaignEx d() {
        try {
            if (TextUtils.isEmpty(this.f34281b)) {
                return null;
            }
            a();
            List<CampaignEx> listE = e();
            if (listE != null && listE.size() > 0) {
                for (int i10 = 0; i10 < listE.size(); i10++) {
                    CampaignEx campaignEx = listE.get(i10);
                    if (campaignEx != null && (!TextUtils.isEmpty(campaignEx.getHtmlUrl()) || !TextUtils.isEmpty(campaignEx.getMraid()))) {
                        return campaignEx;
                    }
                }
            }
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        try {
            if (this.f34289j != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 4;
                this.f34289j.sendMessage(messageObtain);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, List<CampaignEx> list) {
        if (com.mbridge.msdk.interstitial.cache.a.a() != null) {
            com.mbridge.msdk.interstitial.cache.a.a().a(str, list);
        }
    }

    private String c() {
        String strA = "";
        try {
            JSONArray jSONArrayB = v0.b(this.f34280a, this.f34281b);
            strA = jSONArrayB.length() > 0 ? v0.a(jSONArrayB) : "";
            q0.c("IntersAdapter", "get excludes:" + strA);
            return strA;
        } catch (Exception e10) {
            e10.printStackTrace();
            return strA;
        }
    }

    private void a() {
        try {
            if (com.mbridge.msdk.interstitial.cache.a.a() != null) {
                com.mbridge.msdk.setting.g gVarF = i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
                if (gVarF == null) {
                    gVarF = i.b().a();
                }
                com.mbridge.msdk.interstitial.cache.a.a().a(gVarF.c0() * 1000, this.f34281b);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private List<CampaignEx> b(List<CampaignEx> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    int iE = this.f34288i.e();
                    for (int i10 = 0; i10 < list.size() && i10 < this.f34285f && arrayList.size() < iE; i10++) {
                        CampaignEx campaignEx = list.get(i10);
                        int i11 = 1;
                        if ((campaignEx == null || campaignEx.getOfferType() != 1 || !TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) && campaignEx != null && ((!TextUtils.isEmpty(campaignEx.getHtmlUrl()) || campaignEx.isMraid()) && campaignEx.getOfferType() != 99)) {
                            if (v0.c(campaignEx)) {
                                if (!v0.c(this.f34280a, campaignEx.getPackageName())) {
                                    i11 = 2;
                                }
                                campaignEx.setRtinsType(i11);
                            }
                            if (com.mbridge.msdk.foundation.same.c.b(this.f34280a, campaignEx)) {
                                arrayList.add(campaignEx);
                            } else {
                                v0.a(this.f34281b, campaignEx, com.mbridge.msdk.foundation.same.a.f33737x);
                            }
                            a(campaignEx, null, this.f34280a, null);
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<CampaignEx> list) {
        if (this.f34280a == null || list == null || list.size() == 0) {
            return;
        }
        j jVarA = j.a(g.a(this.f34280a));
        for (int i10 = 0; i10 < list.size(); i10++) {
            CampaignEx campaignEx = list.get(i10);
            if (campaignEx != null && jVarA != null && !jVarA.a(campaignEx.getId())) {
                com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                gVar.a(campaignEx.getId());
                gVar.b(campaignEx.getFca());
                gVar.c(campaignEx.getFcb());
                gVar.a(0);
                gVar.d(0);
                gVar.a(System.currentTimeMillis());
                jVarA.b(gVar);
            }
        }
    }

    public void a(com.mbridge.msdk.interstitial.controller.a.b bVar) {
        this.f34287h = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignUnit campaignUnit) {
        if (campaignUnit != null && campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
            ArrayList<CampaignEx> ads = campaignUnit.getAds();
            List<CampaignEx> listB = b(ads);
            a(campaignUnit.getSessionId());
            n();
            a(ads, listB);
            return;
        }
        b("no server ads available");
    }

    private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, this.f34280a, cVar, new c(campaignEx, context, aVar));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    private void a(List<CampaignEx> list, List<CampaignEx> list2) {
        new Thread(new d(list2, list)).start();
    }

    private int b() {
        int i10 = 0;
        try {
            int iA = !TextUtils.isEmpty(this.f34281b) ? com.mbridge.msdk.interstitial.controller.a.a(this.f34281b) : 0;
            if (iA <= g()) {
                i10 = iA;
            }
            q0.c("IntersAdapter", "getCurrentOffset:" + i10);
            return i10;
        } catch (Exception e10) {
            e10.printStackTrace();
            return i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<CampaignEx> a(List<CampaignEx> list) throws Throwable {
        FileOutputStream fileOutputStream;
        ArrayList arrayList = new ArrayList(list.size());
        for (CampaignEx campaignEx : list) {
            if (campaignEx.isMraid() && !TextUtils.isEmpty(campaignEx.getMraid())) {
                com.mbridge.msdk.foundation.same.report.g.a("m_download_start", campaignEx, "", this.f34281b, CampaignEx.CLICKMODE_ON);
                FileOutputStream fileOutputStream2 = null;
                try {
                    try {
                        String strB = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML);
                        String md5 = SameMD5.getMD5(c1.b(campaignEx.getMraid()));
                        if (TextUtils.isEmpty(md5)) {
                            md5 = String.valueOf(System.currentTimeMillis());
                        }
                        File file = new File(strB, md5.concat(".html"));
                        fileOutputStream = new FileOutputStream(file);
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            String strB2 = com.mbridge.msdk.setting.util.a.a().b();
                            if (!TextUtils.isEmpty(strB2)) {
                                sb2.append("<script>");
                                sb2.append(strB2);
                                sb2.append("</script>");
                            }
                            sb2.append(campaignEx.getMraid());
                            fileOutputStream.write(sb2.toString().getBytes());
                            fileOutputStream.flush();
                            campaignEx.setMraid(file.getAbsolutePath());
                            com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, "", this.f34281b, CampaignEx.CLICKMODE_ON);
                            try {
                                fileOutputStream.close();
                            } catch (Exception e10) {
                                e10.printStackTrace();
                            }
                        } catch (Exception e11) {
                            e = e11;
                            fileOutputStream2 = fileOutputStream;
                            e.printStackTrace();
                            campaignEx.setMraid("");
                            com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, e.getMessage(), this.f34281b, CampaignEx.CLICKMODE_ON);
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                    }
                } catch (Exception e13) {
                    e = e13;
                }
                File file2 = new File(campaignEx.getMraid());
                if (!file2.exists() || !file2.isFile() || !file2.canRead()) {
                    b("mraid resource write fail");
                }
            }
            arrayList.add(campaignEx);
        }
        return arrayList;
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        q0.c("IntersAdapter", "onload sessionId:" + str);
        com.mbridge.msdk.interstitial.controller.a.f34301o = str;
    }
}

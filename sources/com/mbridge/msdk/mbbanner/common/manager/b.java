package com.mbridge.msdk.mbbanner.common.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.out.MBridgeIds;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f34450n = "b";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f34451a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.data.b f34453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.util.a f34454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.b f34455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.d f34456f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34452b = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f34457g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Timer f34458h = new Timer();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile List<String> f34459i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f34460j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile boolean f34461k = false;
    private volatile boolean l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f34462m = "";

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f34463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f34464b;

        public a(String str, CampaignEx campaignEx) {
            this.f34463a = str;
            this.f34464b = campaignEx;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (b.this.f34457g) {
                return;
            }
            b.this.f34457g = true;
            b.this.a(this.f34463a, -1, "", false, this.f34464b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c extends com.mbridge.msdk.foundation.same.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f34468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f34469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f34470c;

        public c(String str, CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            this.f34468a = str;
            this.f34469b = campaignEx;
            this.f34470c = context;
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f34468a);
            cVar.a(str, eVar);
            com.mbridge.msdk.mbbanner.common.report.a.a(str, cVar, this.f34469b, this.f34470c, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignUnit f34472a;

        public d(CampaignUnit campaignUnit) {
            this.f34472a = campaignUnit;
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.c(b.f34450n, "在单独子线程保存数据库 开始");
            j.a(g.a(b.this.f34451a)).d();
            CampaignUnit campaignUnit = this.f34472a;
            if (campaignUnit != null && campaignUnit.getAds() != null && this.f34472a.getAds().size() > 0) {
                BannerUtils.uisList(b.this.f34451a, this.f34472a.getAds());
            }
            q0.c(b.f34450n, "在单独子线程保存数据库 完成");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class e implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f34474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f34475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CampaignEx f34476c;

        public e(b bVar, String str, CampaignEx campaignEx) {
            this.f34474a = bVar;
            this.f34475b = str;
            this.f34476c = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            String str3;
            if (MBridgeConstans.DEBUG) {
                q0.c(b.f34450n, "DownloadImageListener campaign image fail");
            }
            b bVar = this.f34474a;
            if (bVar != null) {
                str3 = str2;
                bVar.a(this.f34475b, 1, str3, false, this.f34476c);
            } else {
                str3 = str2;
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f34475b, this.f34476c.getCurrentLocalRid());
                cVarA.a(this.f34476c);
                cVarA.e(10);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                cVarA.e(10);
                eVar.a("resource_type", 10);
                eVar.a("result", 3);
                eVar.a("url", str3);
                com.mbridge.msdk.mbbanner.common.report.a.a("m_download_end", cVarA, eVar);
            } catch (Throwable th2) {
                q0.b(b.f34450n, th2.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            String str2;
            if (MBridgeConstans.DEBUG) {
                q0.c(b.f34450n, "DownloadImageListener campaign image success");
            }
            b bVar = this.f34474a;
            if (bVar != null) {
                str2 = str;
                bVar.a(this.f34475b, 1, str2, true, this.f34476c);
            } else {
                str2 = str;
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f34475b, this.f34476c.getCurrentLocalRid());
                cVarA.a(this.f34476c);
                cVarA.e(10);
                cVarA.e(10);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("resource_type", 10);
                eVar.a("result", 1);
                eVar.a("url", str2);
                com.mbridge.msdk.mbbanner.common.report.a.a("m_download_end", cVarA, eVar);
            } catch (Throwable th2) {
                q0.b(b.f34450n, th2.getMessage());
            }
        }
    }

    public b(Context context, com.mbridge.msdk.mbbanner.common.data.b bVar, com.mbridge.msdk.mbbanner.common.listener.b bVar2, com.mbridge.msdk.mbbanner.common.util.a aVar) {
        this.f34451a = context.getApplicationContext();
        this.f34453c = bVar;
        this.f34455e = bVar2;
        this.f34454d = aVar;
    }

    private void b(String str, List<CampaignEx> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (CampaignEx campaignEx : list) {
            if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
                this.f34459i.add(campaignEx.getImageUrl());
                com.mbridge.msdk.foundation.same.image.b.a(this.f34451a).a(campaignEx.getImageUrl(), new e(this, str, campaignEx));
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(str, campaignEx.getCurrentLocalRid());
                cVarA.a(campaignEx);
                cVarA.e(10);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("resource_type", 10);
                com.mbridge.msdk.mbbanner.common.report.a.a("m_download_start", cVarA, eVar);
            }
        }
    }

    private void a(String str, int i10) {
        if (this.l) {
            return;
        }
        if ((this.f34460j || this.f34461k) && this.f34459i.size() == 0) {
            q0.c(f34450n, "在子线程处理业务逻辑 完成");
            this.f34457g = true;
            this.l = true;
            this.f34458h.cancel();
            this.f34454d.a(this.f34455e, str, i10);
            this.f34456f.a(str);
        }
    }

    private void a(String str, CampaignEx campaignEx) {
        String str2 = f34450n;
        q0.c(str2, "在子线程处理业务逻辑 完成");
        q0.c(str2, "downloadResource--> Fail");
        this.f34457g = true;
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880027);
        MBridgeIds mBridgeIds = new MBridgeIds();
        mBridgeIds.setUnitId(str);
        bVar.a(mBridgeIds);
        bVar.b(this.f34453c.a());
        bVar.a(campaignEx);
        this.f34454d.b(this.f34455e, bVar);
        this.f34456f.a(str);
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0137b extends com.mbridge.msdk.mbbanner.common.response.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.data.a f34466c;

        public C0137b(com.mbridge.msdk.mbbanner.common.data.a aVar) {
            this.f34466c = aVar;
        }

        @Override // com.mbridge.msdk.mbbanner.common.response.a
        public void a(CampaignUnit campaignUnit) throws Throwable {
            try {
                q0.c(b.f34450n, "requestCampaign--> Succeed");
                campaignUnit.setLocalRequestId(this.f34466c.b());
                b.this.f34454d.a(b.this.f34455e, campaignUnit, this.unitId);
                b.this.a(this.unitId, this.f34466c.b(), campaignUnit);
            } catch (Exception e10) {
                q0.c(b.f34450n, "requestCampaign--> Fail with exception = " + e10.getMessage());
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880000);
                bVar.a(new MBridgeIds(this.placementId, this.unitId));
                bVar.b(this.f34466c.b());
                bVar.a((campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().isEmpty()) ? null : campaignUnit.getAds().get(0));
                bVar.a((Throwable) e10);
                b.this.f34454d.a(b.this.f34455e, bVar);
                b.this.f34456f.a(this.unitId);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.response.a
        public void a(int i10, String str) {
            q0.c(b.f34450n, "requestCampaign--> Fail errorCode:" + i10 + " msg:" + str);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880003);
            bVar.c(i10 + "#" + str);
            bVar.a(new MBridgeIds(this.placementId, this.unitId));
            bVar.b(this.f34466c.b());
            b.this.f34454d.a(b.this.f34455e, bVar);
            b.this.f34456f.a(this.unitId);
        }
    }

    private void b(String str, String str2, CampaignEx campaignEx) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        a(str, 3, str2, true, campaignEx);
    }

    private String b() {
        return this.f34453c.d();
    }

    private void b(String str) {
        this.f34453c.b(str);
    }

    public void a(String str, int i10, String str2, boolean z10, CampaignEx campaignEx) {
        if (!z10) {
            if (i10 == -1) {
                q0.b(f34450n, " unitId =" + str + " --> time out!");
            }
            this.f34458h.cancel();
            a(str, campaignEx);
            return;
        }
        if (i10 == 1) {
            q0.c(f34450n, "downloadResource--> Success Image");
            synchronized (this) {
                try {
                    this.f34459i.remove(str2);
                    if (this.f34459i.size() == 0) {
                        a(str, i10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        if (i10 == 2) {
            q0.c(f34450n, "downloadResource--> Success banner_html");
            this.f34461k = true;
            a(str, i10);
        } else if (i10 == 3) {
            q0.c(f34450n, "downloadResource--> Success banner_url");
            this.f34460j = true;
            a(str, i10);
        }
    }

    private void a(String str, int i10, CampaignEx campaignEx) {
        this.f34458h.schedule(new a(str, campaignEx), i10);
    }

    public void a(String str, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar, com.mbridge.msdk.mbbanner.common.listener.d dVar) {
        boolean z10;
        try {
            q0.c(f34450n, "requestCampaign--> started");
            this.f34456f = dVar;
            C0137b c0137b = new C0137b(aVar);
            c0137b.setUnitId(str2);
            c0137b.setPlacementId(str);
            c0137b.setAdType(296);
            com.mbridge.msdk.mbbanner.common.request.a aVar2 = new com.mbridge.msdk.mbbanner.common.request.a(this.f34451a);
            this.f34452b = a(str2);
            com.mbridge.msdk.foundation.same.net.wrapper.e eVarA = com.mbridge.msdk.mbbanner.common.data.c.a(false, this.f34451a, str2, b(), this.f34452b, aVar);
            String strD = v0.d(str2);
            if (!TextUtils.isEmpty(strD)) {
                eVarA.a("j", strD);
            }
            String strA = aVar.a();
            if (TextUtils.isEmpty(strA)) {
                z10 = false;
            } else {
                c0137b.a(strA);
                z10 = true;
            }
            this.f34454d.a(z10);
            aVar2.choiceV3OrV5BySetting(1, eVarA, c0137b, strA, 30000L);
        } catch (Exception e10) {
            q0.b(f34450n, e10.getMessage());
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880002);
            bVar.a(new MBridgeIds(str, str2));
            this.f34454d.a(this.f34455e, bVar);
            this.f34456f.a(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, CampaignUnit campaignUnit) throws Throwable {
        com.mbridge.msdk.foundation.error.b bVar;
        CampaignEx campaignEx;
        if (campaignUnit == null) {
            com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880003);
            MBridgeIds mBridgeIds = new MBridgeIds();
            mBridgeIds.setUnitId(str);
            bVar2.a(mBridgeIds);
            bVar2.b(str2);
            this.f34454d.a(this.f34455e, bVar2);
            this.f34456f.a(str);
            return;
        }
        List<CampaignEx> listA = a(str, campaignUnit);
        a(campaignUnit);
        int i10 = 0;
        if (listA != null && listA.size() != 0) {
            q0.c(f34450n, "在子线程处理业务逻辑 开始");
            CampaignEx campaignEx2 = listA.get(0);
            a(str, 60000, campaignEx2);
            b(campaignUnit.getSessionId());
            a(str, listA);
            String strTrim = campaignEx2.getBannerUrl().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                b(str, strTrim, campaignEx2);
                if (listA.size() > 0) {
                    while (i10 < listA.size()) {
                        listA.get(i10).setBannerUrl(campaignEx2.getBannerUrl());
                        listA.get(i10).setHasMBTplMark(true);
                        i10++;
                    }
                }
            } else {
                String strTrim2 = campaignEx2.getBannerHtml().trim();
                if (!TextUtils.isEmpty(strTrim2)) {
                    String strA = a(str, strTrim2, campaignEx2);
                    if (listA.size() > 0) {
                        while (i10 < listA.size()) {
                            listA.get(i10).setBannerHtml(strA);
                            listA.get(i10).setHasMBTplMark(strTrim2.contains("<MBTPLMARK>"));
                            i10++;
                        }
                    }
                } else {
                    this.f34461k = true;
                    this.f34460j = true;
                }
            }
            b(str, listA);
            return;
        }
        q0.c(f34450n, "tryDownloadOnLoadSuccess 返回的campaign 没有符合下载规则的");
        if (this.f34462m.contains("INSTALLED")) {
            bVar = new com.mbridge.msdk.foundation.error.b(880021, "APP ALREADY INSTALLED");
        } else {
            bVar = new com.mbridge.msdk.foundation.error.b(880003);
        }
        MBridgeIds mBridgeIds2 = new MBridgeIds();
        mBridgeIds2.setUnitId(str);
        bVar.a(mBridgeIds2);
        bVar.b(str2);
        if (campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0 && (campaignEx = campaignUnit.getAds().get(0)) != null) {
            bVar.a(campaignEx);
        }
        this.f34454d.a(this.f34455e, bVar);
        this.f34456f.a(str);
    }

    private List<CampaignEx> a(String str, CampaignUnit campaignUnit) {
        b bVar;
        String str2;
        ArrayList arrayList = new ArrayList();
        if (campaignUnit != null) {
            try {
                if (campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
                    ArrayList<CampaignEx> ads = campaignUnit.getAds();
                    q0.c(f34450n, "getNeedShowList 总共返回的campaign有：" + ads.size());
                    y.a(ads);
                    int i10 = 0;
                    while (i10 < ads.size()) {
                        CampaignEx campaignEx = ads.get(i10);
                        if (campaignEx == null || campaignEx.getOfferType() == 99 || (TextUtils.isEmpty(campaignEx.getBannerUrl()) && TextUtils.isEmpty(campaignEx.getBannerHtml()) && TextUtils.isEmpty(campaignEx.getImageUrl()))) {
                            bVar = this;
                            str2 = str;
                        } else {
                            if (v0.c(campaignEx)) {
                                campaignEx.setRtinsType(v0.c(this.f34451a, campaignEx.getPackageName()) ? 1 : 2);
                            }
                            if (com.mbridge.msdk.foundation.same.c.b(this.f34451a, campaignEx)) {
                                arrayList.add(campaignEx);
                            } else {
                                v0.a(str, campaignEx, com.mbridge.msdk.foundation.same.a.f33737x);
                                this.f34462m = "APP ALREADY INSTALLED";
                            }
                            bVar = this;
                            str2 = str;
                            bVar.a(campaignEx, this.f34451a, (com.mbridge.msdk.foundation.same.report.metrics.c) null, str2, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
                        }
                        i10++;
                        this = bVar;
                        str = str2;
                    }
                    q0.c(f34450n, "getNeedShowList 返回有以下带有视频素材的campaign：" + arrayList.size());
                    return arrayList;
                }
            } catch (Exception e10) {
                q0.b(f34450n, e10.getMessage());
            }
        }
        return arrayList;
    }

    private void a(CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, context, cVar, new c(str, campaignEx, context, aVar));
        } catch (Exception e10) {
            q0.b(f34450n, e10.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    private String a(String str, String str2, CampaignEx campaignEx) throws Throwable {
        File file;
        Throwable th2;
        FileOutputStream fileOutputStream;
        String absolutePath = "";
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    String strB = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML);
                    String md5 = SameMD5.getMD5(c1.b(str2));
                    if (TextUtils.isEmpty(md5)) {
                        md5 = String.valueOf(System.currentTimeMillis());
                    }
                    File file2 = new File(strB, md5.concat(".html"));
                    Uri.parse(str2).getPath();
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        fileOutputStream.write(str2.getBytes());
                        fileOutputStream.flush();
                        absolutePath = file2.getAbsolutePath();
                        fileOutputStream.close();
                    } catch (Exception e10) {
                        e = e10;
                        fileOutputStream2 = fileOutputStream;
                        q0.b(f34450n, e.getMessage());
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        file = new File(absolutePath);
                        if (!file.exists()) {
                            a(str, 2, str2, false, campaignEx);
                        } else {
                            a(str, 2, str2, false, campaignEx);
                        }
                        return absolutePath;
                    } catch (Throwable th3) {
                        th2 = th3;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                                throw th2;
                            } catch (Exception e11) {
                                q0.b(f34450n, e11.getMessage());
                                throw th2;
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    fileOutputStream = fileOutputStream2;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Exception e13) {
            q0.b(f34450n, e13.getMessage());
        }
        file = new File(absolutePath);
        if (!file.exists() && file.isFile() && file.canRead()) {
            a(str, 2, str2, true, campaignEx);
        } else {
            a(str, 2, str2, false, campaignEx);
        }
        return absolutePath;
    }

    private void a(CampaignUnit campaignUnit) {
        new Thread(new d(campaignUnit)).start();
    }

    private int a(String str) {
        try {
            int iC = this.f34453c.c();
            if (iC > this.f34453c.b()) {
                return 0;
            }
            return iC;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    private void a(String str, List<CampaignEx> list) {
        int size = this.f34452b;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    size += list.size();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        if (size > this.f34453c.b()) {
            q0.c(f34450n, "saveNextOffset 重置offset为0");
            size = 0;
        }
        q0.c(f34450n, "saveNextOffset 算出 下次的offset是:" + size);
        if (a1.b(str)) {
            this.f34453c.a(size);
        }
    }
}

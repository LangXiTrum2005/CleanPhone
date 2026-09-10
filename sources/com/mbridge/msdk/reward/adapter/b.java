package com.mbridge.msdk.reward.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.X3;
import com.ironsource.Z3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResDownloadCheckManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.video.bt.module.MBridgeBTLayout;
import com.mbridge.msdk.video.bt.module.MBridgeBTRootLayout;
import d5.u;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static ConcurrentHashMap<String, f> f35150g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f35151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f35152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f35153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f35154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f35155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile List<WindVaneWebView> f35156f;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f35157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f35158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35159c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f35160d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f35161e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f35162f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f35163g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ n f35164h;

        public a(CopyOnWriteArrayList copyOnWriteArrayList, Context context, String str, int i10, String str2, String str3, String str4, n nVar) {
            this.f35157a = copyOnWriteArrayList;
            this.f35158b = context;
            this.f35159c = str;
            this.f35160d = i10;
            this.f35161e = str2;
            this.f35162f = str3;
            this.f35163g = str4;
            this.f35164h = nVar;
        }

        /* JADX WARN: Code duplicated, block: B:117:0x02c9  */
        /* JADX WARN: Code duplicated, block: B:123:0x02df  */
        /* JADX WARN: Code duplicated, block: B:124:0x02e6  */
        /* JADX WARN: Code duplicated, block: B:127:0x02f8  */
        /* JADX WARN: Code duplicated, block: B:147:0x036c  */
        /* JADX WARN: Code duplicated, block: B:174:0x0216 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:184:0x032b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:186:0x029a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:208:0x0263 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:60:0x0192  */
        /* JADX WARN: Code duplicated, block: B:70:0x01e8  */
        @Override // java.lang.Runnable
        public void run() {
            CharSequence charSequence;
            String str;
            CampaignEx.c cVar;
            String str2;
            String str3;
            boolean zIsDynamicView;
            String iconUrl;
            String imageUrl;
            CampaignEx campaignEx;
            String strH;
            List<CampaignEx.c.a> listD;
            List<String> list;
            int i10;
            com.mbridge.msdk.foundation.same.report.metrics.c cVar2;
            int i11;
            String str4 = "_";
            CopyOnWriteArrayList copyOnWriteArrayList = this.f35157a;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return;
            }
            try {
                ResDownloadCheckManager.getInstance().setCampaignList(this.f35157a);
                com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f35158b, this.f35159c, this.f35157a, this.f35160d, new k(b.this.f35151a, this.f35161e, this.f35159c, this.f35162f, this.f35163g));
                com.mbridge.msdk.videocommon.download.b.getInstance().load(this.f35159c);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                }
            }
            Iterator it = this.f35157a.iterator();
            while (it.hasNext()) {
                CampaignEx campaignEx2 = (CampaignEx) it.next();
                if (campaignEx2 != null) {
                    try {
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 106;
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35159c);
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f35161e);
                        bundle.putString("request_id", this.f35162f);
                        bundle.putString(X3.i.W, this.f35159c + str4 + this.f35162f + str4 + campaignEx2.getSecondRequestIndex());
                        messageObtain.setData(bundle);
                        b.this.f35151a.sendMessage(messageObtain);
                    } catch (Exception unused) {
                    }
                    CampaignEx.c rewardTemplateMode = campaignEx2.getRewardTemplateMode();
                    if (rewardTemplateMode != null) {
                        String strJ = rewardTemplateMode.j();
                        int iK = rewardTemplateMode.k();
                        if (campaignEx2.isDynamicView() && v0.c(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW, strJ)) {
                            b.this.a(1, campaignEx2, u.f(iK, ""), strJ);
                        } else if (!TextUtils.isEmpty(strJ) && !strJ.contains(CampaignEx.KEY_IS_CMPT_ENTRY)) {
                            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = b.this.a(campaignEx2, 2);
                            if (strJ.contains(".zip")) {
                                try {
                                    H5DownLoadManager h5DownLoadManager = H5DownLoadManager.getInstance();
                                    try {
                                        Context context = this.f35158b;
                                        String str5 = this.f35161e;
                                        try {
                                            String str6 = this.f35159c;
                                            try {
                                                String str7 = this.f35162f;
                                                m mVar = b.this.f35151a;
                                                charSequence = ".zip";
                                                try {
                                                    n nVar = this.f35164h;
                                                    CopyOnWriteArrayList copyOnWriteArrayList2 = this.f35157a;
                                                    cVar = rewardTemplateMode;
                                                    str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                                                    str = "";
                                                    str4 = str4;
                                                    it = it;
                                                    try {
                                                        h5DownLoadManager.downloadH5Res(cVarA, strJ, new l(context, str5, str6, str7, campaignEx2, 859, mVar, nVar, copyOnWriteArrayList2));
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        if (MBridgeConstans.DEBUG) {
                                                            q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                                        }
                                                    }
                                                } catch (Exception e12) {
                                                    e = e12;
                                                    cVar = rewardTemplateMode;
                                                    str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                                                    str = "";
                                                    str4 = str4;
                                                    it = it;
                                                }
                                            } catch (Exception e13) {
                                                e = e13;
                                                cVar = rewardTemplateMode;
                                                str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                                                str = "";
                                                str4 = str4;
                                                it = it;
                                                charSequence = ".zip";
                                            }
                                        } catch (Exception e14) {
                                            e = e14;
                                            charSequence = ".zip";
                                            str = "";
                                            cVar = rewardTemplateMode;
                                            str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                                            if (MBridgeConstans.DEBUG) {
                                                q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                            }
                                            str3 = campaignEx2.getendcard_url();
                                            zIsDynamicView = campaignEx2.isDynamicView();
                                            boolean zL = v0.l(str3);
                                            if (!TextUtils.isEmpty(str3)) {
                                                if (zIsDynamicView) {
                                                    b.this.a(this.f35158b, this.f35161e, this.f35159c, this.f35162f, campaignEx2, str3, this.f35164h, (CopyOnWriteArrayList<CampaignEx>) this.f35157a);
                                                } else if (v0.c(str2, str3)) {
                                                    try {
                                                        i11 = Integer.parseInt(c1.a(str3, "ecid"));
                                                    } catch (Throwable th2) {
                                                        q0.b("RewardCampaignsResourceManager", th2.getMessage());
                                                        i11 = InterfaceC0435l1.a.b.f29084d;
                                                    }
                                                    b.this.a(2, campaignEx2, u.f(i11, str), str3);
                                                }
                                            }
                                            if (!TextUtils.isEmpty(campaignEx2.getEndScreenUrl())) {
                                                H5DownLoadManager.getInstance().download(b.this.a(campaignEx2, 6), campaignEx2.getEndScreenUrl());
                                            }
                                            iconUrl = campaignEx2.getIconUrl();
                                            if (!TextUtils.isEmpty(iconUrl)) {
                                                try {
                                                    com.mbridge.msdk.foundation.same.image.b bVarA = com.mbridge.msdk.foundation.same.image.b.a(this.f35158b);
                                                    try {
                                                        j jVar = new j(b.this.f35151a, 0, this.f35161e, this.f35159c, this.f35162f, campaignEx2);
                                                        campaignEx2 = campaignEx2;
                                                        bVarA.a(iconUrl, jVar);
                                                    } catch (Exception e15) {
                                                        e = e15;
                                                        campaignEx2 = campaignEx2;
                                                        if (MBridgeConstans.DEBUG) {
                                                            q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                                        }
                                                    }
                                                } catch (Exception e16) {
                                                    e = e16;
                                                }
                                            }
                                            imageUrl = campaignEx2.getImageUrl();
                                            if (!TextUtils.isEmpty(imageUrl)) {
                                                try {
                                                    campaignEx = campaignEx2;
                                                    try {
                                                        campaignEx2 = campaignEx;
                                                        com.mbridge.msdk.foundation.same.image.b.a(this.f35158b).a(imageUrl, new j(b.this.f35151a, 0, this.f35161e, this.f35159c, this.f35162f, campaignEx));
                                                    } catch (Exception e17) {
                                                        e = e17;
                                                        campaignEx2 = campaignEx;
                                                        if (MBridgeConstans.DEBUG) {
                                                            q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                                        }
                                                    }
                                                } catch (Exception e18) {
                                                    e = e18;
                                                }
                                            }
                                            if (cVar != null) {
                                                strH = cVar.h();
                                                if (!TextUtils.isEmpty(strH)) {
                                                    if (campaignEx2.getAabEntity() != null) {
                                                        i10 = campaignEx2.getAabEntity().h3c;
                                                    } else {
                                                        i10 = 0;
                                                    }
                                                    cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c(true);
                                                    cVar2.f(i10);
                                                    if (strH.contains(charSequence)) {
                                                        q0.a("RewardCampaignsResourceManager", "开始下载 zip 类型的 pause");
                                                        try {
                                                            H5DownLoadManager.getInstance().downloadH5Res(cVar2, strH, new l(this.f35158b, this.f35161e, this.f35159c, this.f35162f, campaignEx2, 313, b.this.f35151a, this.f35164h, this.f35157a));
                                                        } catch (Exception e19) {
                                                            if (MBridgeConstans.DEBUG) {
                                                                q0.b("RewardCampaignsResourceManager", e19.getLocalizedMessage());
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            H5DownLoadManager.getInstance().downloadH5Res(cVar2, strH, new i(313, this.f35161e, this.f35159c, this.f35162f, campaignEx2, this.f35164h, b.this.f35151a, this.f35157a));
                                                        } catch (Exception e20) {
                                                            if (MBridgeConstans.DEBUG) {
                                                                q0.b("RewardCampaignsResourceManager", e20.getLocalizedMessage());
                                                            }
                                                        }
                                                    }
                                                }
                                                listD = cVar.d();
                                                if (listD != null) {
                                                    while (r2.hasNext()) {
                                                        if (aVar == null) {
                                                        }
                                                    }
                                                }
                                            }
                                            it = it;
                                            str4 = str4;
                                        }
                                    } catch (Exception e21) {
                                        e = e21;
                                        str = "";
                                        charSequence = ".zip";
                                    }
                                } catch (Exception e22) {
                                    e = e22;
                                    charSequence = ".zip";
                                    str = "";
                                }
                            } else {
                                str4 = str4;
                                it = it;
                                charSequence = ".zip";
                                str = "";
                                cVar = rewardTemplateMode;
                                str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                                q0.a("RewardCampaignsResourceManager", "开始下载 html 类型的 template");
                                try {
                                    H5DownLoadManager.getInstance().downloadH5Res(cVarA, strJ, new i(859, this.f35161e, this.f35159c, this.f35162f, campaignEx2, this.f35164h, b.this.f35151a, this.f35157a));
                                } catch (Exception e23) {
                                    if (MBridgeConstans.DEBUG) {
                                        q0.b("RewardCampaignsResourceManager", e23.getLocalizedMessage());
                                    }
                                }
                            }
                        }
                        str4 = str4;
                        it = it;
                        charSequence = ".zip";
                        str = "";
                        cVar = rewardTemplateMode;
                        str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                    } else {
                        str4 = str4;
                        it = it;
                        charSequence = ".zip";
                        str = "";
                        cVar = rewardTemplateMode;
                        str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                    }
                    str3 = campaignEx2.getendcard_url();
                    zIsDynamicView = campaignEx2.isDynamicView();
                    boolean zL2 = v0.l(str3);
                    if (!TextUtils.isEmpty(str3)) {
                        if (zIsDynamicView || zL2) {
                            b.this.a(this.f35158b, this.f35161e, this.f35159c, this.f35162f, campaignEx2, str3, this.f35164h, (CopyOnWriteArrayList<CampaignEx>) this.f35157a);
                        } else if (v0.c(str2, str3)) {
                            i11 = Integer.parseInt(c1.a(str3, "ecid"));
                            b.this.a(2, campaignEx2, u.f(i11, str), str3);
                        }
                    }
                    if (!TextUtils.isEmpty(campaignEx2.getEndScreenUrl()) && !campaignEx2.isDynamicView()) {
                        H5DownLoadManager.getInstance().download(b.this.a(campaignEx2, 6), campaignEx2.getEndScreenUrl());
                    }
                    iconUrl = campaignEx2.getIconUrl();
                    if (!TextUtils.isEmpty(iconUrl)) {
                        com.mbridge.msdk.foundation.same.image.b bVarA2 = com.mbridge.msdk.foundation.same.image.b.a(this.f35158b);
                        j jVar2 = new j(b.this.f35151a, 0, this.f35161e, this.f35159c, this.f35162f, campaignEx2);
                        campaignEx2 = campaignEx2;
                        bVarA2.a(iconUrl, jVar2);
                    }
                    imageUrl = campaignEx2.getImageUrl();
                    if (!TextUtils.isEmpty(imageUrl)) {
                        campaignEx = campaignEx2;
                        campaignEx2 = campaignEx;
                        com.mbridge.msdk.foundation.same.image.b.a(this.f35158b).a(imageUrl, new j(b.this.f35151a, 0, this.f35161e, this.f35159c, this.f35162f, campaignEx));
                    }
                    if (cVar != null) {
                        strH = cVar.h();
                        if (!TextUtils.isEmpty(strH) && !campaignEx2.isDynamicView()) {
                            if (campaignEx2.getAabEntity() != null) {
                                i10 = campaignEx2.getAabEntity().h3c;
                            } else {
                                i10 = 0;
                            }
                            cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c(true);
                            cVar2.f(i10);
                            if (strH.contains(charSequence)) {
                                q0.a("RewardCampaignsResourceManager", "开始下载 zip 类型的 pause");
                                H5DownLoadManager.getInstance().downloadH5Res(cVar2, strH, new l(this.f35158b, this.f35161e, this.f35159c, this.f35162f, campaignEx2, 313, b.this.f35151a, this.f35164h, this.f35157a));
                            } else {
                                H5DownLoadManager.getInstance().downloadH5Res(cVar2, strH, new i(313, this.f35161e, this.f35159c, this.f35162f, campaignEx2, this.f35164h, b.this.f35151a, this.f35157a));
                            }
                        }
                        listD = cVar.d();
                        if (listD != null && listD.size() > 0) {
                            for (CampaignEx.c.a aVar : listD) {
                                if (aVar == null && (list = aVar.f33541a) != null && list.size() > 0) {
                                    for (String str8 : aVar.f33541a) {
                                        if (!TextUtils.isEmpty(str8)) {
                                            try {
                                                CampaignEx campaignEx3 = campaignEx2;
                                                try {
                                                    campaignEx2 = campaignEx3;
                                                    com.mbridge.msdk.foundation.same.image.b.a(this.f35158b).a(str8, new j(b.this.f35151a, 1, this.f35161e, this.f35159c, this.f35162f, campaignEx3));
                                                } catch (Exception e24) {
                                                    e = e24;
                                                    campaignEx2 = campaignEx3;
                                                    if (MBridgeConstans.DEBUG) {
                                                        q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                                    }
                                                }
                                            } catch (Exception e25) {
                                                e = e25;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    it = it;
                    str4 = str4;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f35169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f35170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35171c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CampaignEx f35172d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ n f35173e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f35174f;

        public c(String str, String str2, String str3, CampaignEx campaignEx, n nVar, Context context) {
            this.f35169a = str;
            this.f35170b = str2;
            this.f35171c = str3;
            this.f35172d = campaignEx;
            this.f35173e = nVar;
            this.f35174f = context;
        }

        /* JADX WARN: Code duplicated, block: B:52:0x0169 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            String str3;
            String str4;
            boolean z10;
            Exception exc;
            String str5;
            char c4;
            String str6 = "";
            String str7 = "message";
            try {
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
                Message messageObtain = Message.obtain();
                messageObtain.what = InterfaceC0435l1.c.b.f29100f;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35169a);
                try {
                    bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f35170b);
                    bundle.putString("request_id", this.f35171c);
                    bundle.putString("url", str2);
                    bundle.putString(X3.i.W, this.f35169a + "_" + this.f35171c + "_" + this.f35172d.getSecondRequestIndex());
                    bundle.putString("message", str);
                    messageObtain.setData(bundle);
                    b.this.f35151a.sendMessage(messageObtain);
                    if (this.f35173e != null) {
                        try {
                            c4 = 28037;
                            try {
                                this.f35173e.a(str2, this.f35171c, b.b(880005, new MBridgeIds(this.f35170b, this.f35169a, this.f35171c), "", null, null));
                            } catch (Exception e10) {
                                e = e10;
                                try {
                                    q0.b("RewardCampaignsResourceManager", e.getMessage());
                                } catch (Exception e11) {
                                    str3 = "RewardCampaignsResourceManager";
                                    str6 = "";
                                    str7 = "message";
                                    z10 = false;
                                    exc = e11;
                                    str4 = "_";
                                    ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, z10);
                                    Message messageObtain2 = Message.obtain();
                                    messageObtain2.what = InterfaceC0435l1.d.b.f29109f;
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35169a);
                                    bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f35170b);
                                    bundle2.putString("request_id", this.f35171c);
                                    bundle2.putString(X3.i.W, this.f35169a + str4 + this.f35171c + str4 + this.f35172d.getSecondRequestIndex());
                                    bundle2.putString("url", str2);
                                    bundle2.putString(str7, exc.getMessage());
                                    messageObtain2.setData(bundle2);
                                    b.this.f35151a.sendMessage(messageObtain2);
                                    if (this.f35173e != null) {
                                        try {
                                            this.f35173e.a(str2, this.f35171c, b.b(880005, new MBridgeIds(this.f35170b, this.f35169a, this.f35171c), str6, exc, null));
                                        } catch (Exception e12) {
                                            str5 = str3;
                                            q0.b(str5, e12.getMessage());
                                            q0.b(str5, exc.getLocalizedMessage());
                                        }
                                    }
                                    str5 = str3;
                                    q0.b(str5, exc.getLocalizedMessage());
                                }
                            }
                        } catch (Exception e13) {
                            e = e13;
                            c4 = 28037;
                        }
                    } else {
                        c4 = 28037;
                    }
                    try {
                        try {
                            try {
                                str4 = "_";
                                str3 = "RewardCampaignsResourceManager";
                                z10 = false;
                                try {
                                    b.this.a(this.f35174f, 3, this.f35172d, str2, str, this.f35169a, "");
                                } catch (Exception e14) {
                                    e = e14;
                                    exc = e;
                                    ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, z10);
                                    Message messageObtain3 = Message.obtain();
                                    messageObtain3.what = InterfaceC0435l1.d.b.f29109f;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35169a);
                                    bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f35170b);
                                    bundle3.putString("request_id", this.f35171c);
                                    bundle3.putString(X3.i.W, this.f35169a + str4 + this.f35171c + str4 + this.f35172d.getSecondRequestIndex());
                                    bundle3.putString("url", str2);
                                    bundle3.putString(str7, exc.getMessage());
                                    messageObtain3.setData(bundle3);
                                    b.this.f35151a.sendMessage(messageObtain3);
                                    if (this.f35173e != null) {
                                        this.f35173e.a(str2, this.f35171c, b.b(880005, new MBridgeIds(this.f35170b, this.f35169a, this.f35171c), str6, exc, null));
                                    }
                                    str5 = str3;
                                    q0.b(str5, exc.getLocalizedMessage());
                                }
                            } catch (Exception e15) {
                                e = e15;
                                str3 = "RewardCampaignsResourceManager";
                                str4 = "_";
                                z10 = false;
                            }
                        } catch (Exception e16) {
                            e = e16;
                            str3 = "RewardCampaignsResourceManager";
                            z10 = false;
                            str4 = "_";
                        }
                    } catch (Exception e17) {
                        e = e17;
                        str3 = "RewardCampaignsResourceManager";
                        z10 = false;
                        str4 = "_";
                        exc = e;
                        ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, z10);
                        Message messageObtain4 = Message.obtain();
                        messageObtain4.what = InterfaceC0435l1.d.b.f29109f;
                        Bundle bundle4 = new Bundle();
                        bundle4.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35169a);
                        bundle4.putString(MBridgeConstans.PLACEMENT_ID, this.f35170b);
                        bundle4.putString("request_id", this.f35171c);
                        bundle4.putString(X3.i.W, this.f35169a + str4 + this.f35171c + str4 + this.f35172d.getSecondRequestIndex());
                        bundle4.putString("url", str2);
                        bundle4.putString(str7, exc.getMessage());
                        messageObtain4.setData(bundle4);
                        b.this.f35151a.sendMessage(messageObtain4);
                        if (this.f35173e != null) {
                            this.f35173e.a(str2, this.f35171c, b.b(880005, new MBridgeIds(this.f35170b, this.f35169a, this.f35171c), str6, exc, null));
                        }
                        str5 = str3;
                        q0.b(str5, exc.getLocalizedMessage());
                    }
                } catch (Exception e18) {
                    e = e18;
                    str3 = "RewardCampaignsResourceManager";
                }
            } catch (Exception e19) {
                e = e19;
                str3 = "RewardCampaignsResourceManager";
                str4 = "_";
                z10 = false;
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            String str3 = str;
            try {
                q0.a("RewardCampaignsResourceManager", "zip btl template download success");
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str3, true);
                Message messageObtain = Message.obtain();
                messageObtain.what = InterfaceC0435l1.d.b.f29109f;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35169a);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f35170b);
                bundle.putString("request_id", this.f35171c);
                bundle.putString(X3.i.W, this.f35169a + "_" + this.f35171c + "_" + this.f35172d.getSecondRequestIndex());
                bundle.putString("url", str3);
                messageObtain.setData(bundle);
                b.this.f35151a.sendMessage(messageObtain);
                n nVar = this.f35173e;
                if (nVar != null) {
                    nVar.a(this.f35170b, this.f35169a, this.f35171c, str3);
                }
                if (z10) {
                    return;
                }
                try {
                    b.this.a(this.f35174f, 1, this.f35172d, str, "", this.f35169a, str2);
                    return;
                } catch (Exception e10) {
                    e = e10;
                    str3 = str;
                }
            } catch (Exception e11) {
                e = e11;
            }
            Exception exc = e;
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str3, false);
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = InterfaceC0435l1.c.b.f29100f;
            Bundle bundle2 = new Bundle();
            bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35169a);
            bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f35170b);
            bundle2.putString("request_id", this.f35171c);
            bundle2.putString(X3.i.W, this.f35169a + "_" + this.f35171c + "_" + this.f35172d.getSecondRequestIndex());
            bundle2.putString("url", str3);
            messageObtain2.setData(bundle2);
            b.this.f35151a.sendMessage(messageObtain2);
            if (this.f35173e != null) {
                try {
                    this.f35173e.a(str3, this.f35171c, b.b(880005, new MBridgeIds(this.f35170b, this.f35169a, this.f35171c), "", exc, null));
                } catch (Exception e12) {
                    q0.b("RewardCampaignsResourceManager", e12.getMessage());
                }
            }
            b.this.a(this.f35174f, 3, this.f35172d, str3, exc.getLocalizedMessage(), this.f35169a, str2);
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardCampaignsResourceManager", exc.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f35176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f35177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f35179d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f35180e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f35181f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f35182g;

        public d(CampaignEx campaignEx, Context context, int i10, String str, String str2, String str3, String str4) {
            this.f35176a = campaignEx;
            this.f35177b = context;
            this.f35178c = i10;
            this.f35179d = str;
            this.f35180e = str2;
            this.f35181f = str3;
            this.f35182g = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f35176a == null || this.f35177b == null) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                nVar.j("m_download_end");
                Context context = this.f35177b;
                if (context != null) {
                    nVar.c(m0.s(context.getApplicationContext()));
                }
                nVar.d(this.f35178c);
                CampaignEx campaignEx = this.f35176a;
                if (campaignEx != null) {
                    nVar.b(campaignEx.getId());
                    nVar.n(this.f35176a.getRequestId());
                    nVar.k(this.f35176a.getCurrentLocalRid());
                    nVar.o(this.f35176a.getRequestIdNotice());
                }
                nVar.b("url", this.f35179d);
                nVar.t(this.f35179d);
                nVar.m(this.f35180e);
                nVar.u(this.f35181f);
                if (!TextUtils.isEmpty(this.f35182g)) {
                    nVar.q(this.f35182g);
                }
                nVar.e(1);
                nVar.b("scenes", "1");
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, this.f35176a);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f35184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WindVaneWebView f35185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignEx f35186c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f35187d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f35188e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.videocommon.setting.c f35189f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f35190g;

        public e(boolean z10, WindVaneWebView windVaneWebView, CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, String str, com.mbridge.msdk.videocommon.setting.c cVar, String str2) {
            this.f35184a = z10;
            this.f35185b = windVaneWebView;
            this.f35186c = campaignEx;
            this.f35187d = copyOnWriteArrayList;
            this.f35188e = str;
            this.f35189f = cVar;
            this.f35190g = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f35184a, this.f35185b, this.f35186c.getRewardTemplateMode().j(), 0, this.f35186c, (CopyOnWriteArrayList<CampaignEx>) this.f35187d, H5DownLoadManager.getInstance().getH5ResAddress(this.f35186c.getRewardTemplateMode().j()), this.f35188e, this.f35189f, this.f35190g, b.this.f35152b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f35192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f35193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f35194c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f35195d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f35196e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f35197f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f35198g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        CopyOnWriteArrayList<CampaignEx> f35199h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        CopyOnWriteArrayList<CampaignEx> f35200i;

        public f(boolean z10, boolean z11, int i10, int i11, String str, String str2, int i12, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f35192a = z10;
            this.f35193b = z11;
            this.f35194c = i10;
            this.f35195d = i11;
            this.f35196e = str;
            this.f35197f = str2;
            this.f35198g = i12;
            this.f35199h = copyOnWriteArrayList;
            this.f35200i = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface h {
        void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList);

        void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class i implements H5DownLoadManager.IH5SourceDownloadListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f35221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f35222c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f35223d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f35224e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CampaignEx f35225f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private n f35226g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Handler f35227h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private CopyOnWriteArrayList<CampaignEx> f35228i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f35220a = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f35229j = System.currentTimeMillis();

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f35230a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f35231b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f35232c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f35233d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f35234e;

            public a(int i10, long j10, String str, String str2, String str3) {
                this.f35230a = i10;
                this.f35231b = j10;
                this.f35232c = str;
                this.f35233d = str2;
                this.f35234e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (i.this.f35225f == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("m_download_end", this.f35230a, this.f35231b + "", this.f35232c, i.this.f35225f.getId(), i.this.f35223d, this.f35233d, "2");
                    nVar.n(i.this.f35225f.getRequestId());
                    nVar.k(i.this.f35225f.getCurrentLocalRid());
                    nVar.o(i.this.f35225f.getRequestIdNotice());
                    nVar.b(i.this.f35225f.getId());
                    nVar.a(i.this.f35225f.getAdSpaceT());
                    nVar.b("scenes", "1");
                    nVar.b("url", this.f35232c);
                    if (i.this.f35225f.getAdType() == 287) {
                        nVar.a("3");
                    } else if (i.this.f35225f.getAdType() == 94) {
                        nVar.a("1");
                    }
                    if (!TextUtils.isEmpty(this.f35234e)) {
                        nVar.q(this.f35234e);
                    }
                    b.b(nVar, i.this.f35225f);
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, i.this.f35223d, i.this.f35225f);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    }
                }
            }
        }

        public i(int i10, String str, String str2, String str3, CampaignEx campaignEx, n nVar, Handler handler, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f35221b = i10;
            this.f35222c = str;
            this.f35223d = str2;
            this.f35224e = str3;
            this.f35225f = campaignEx;
            this.f35226g = nVar;
            this.f35227h = handler;
            this.f35228i = copyOnWriteArrayList;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
            int i10 = this.f35221b;
            if (i10 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = InterfaceC0435l1.c.b.f29096b;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35223d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f35222c);
                bundle.putString("request_id", this.f35224e);
                bundle.putString(X3.i.W, this.f35223d + "_" + this.f35224e + "_" + this.f35225f.getSecondRequestIndex());
                bundle.putString("url", str);
                bundle.putString("message", str2);
                messageObtain.setData(bundle);
                this.f35227h.sendMessage(messageObtain);
                return;
            }
            if (i10 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = InterfaceC0435l1.c.b.f29096b;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35223d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f35222c);
                bundle2.putString("request_id", this.f35224e);
                bundle2.putString(X3.i.W, this.f35223d + "_" + this.f35224e + "_" + this.f35225f.getSecondRequestIndex());
                bundle2.putString("url", str);
                bundle2.putString("message", str2);
                messageObtain2.setData(bundle2);
                this.f35227h.sendMessage(messageObtain2);
                if (this.f35220a) {
                    a(3, System.currentTimeMillis() - this.f35229j, str, "url download failed", "");
                    return;
                }
                return;
            }
            if (i10 != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = InterfaceC0435l1.c.b.f29100f;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35223d);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f35222c);
            bundle3.putString("request_id", this.f35224e);
            bundle3.putString(X3.i.W, this.f35223d + "_" + this.f35224e + "_" + this.f35225f.getSecondRequestIndex());
            bundle3.putString("message", str2);
            messageObtain3.setData(bundle3);
            this.f35227h.sendMessage(messageObtain3);
            if (this.f35226g != null) {
                try {
                    this.f35226g.a(str, this.f35224e, b.b(880006, new MBridgeIds(this.f35222c, this.f35223d, this.f35224e), str2, null, null));
                } catch (Exception e10) {
                    q0.b("RewardCampaignsResourceManager", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            int i10 = this.f35221b;
            if (i10 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = InterfaceC0435l1.d.b.f29105b;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35223d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f35222c);
                bundle.putString("request_id", this.f35224e);
                bundle.putString(X3.i.W, this.f35223d + "_" + this.f35224e + "_" + this.f35225f.getSecondRequestIndex());
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                this.f35227h.sendMessage(messageObtain);
                return;
            }
            if (i10 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = InterfaceC0435l1.d.b.f29105b;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35223d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f35222c);
                bundle2.putString("request_id", this.f35224e);
                bundle2.putString(X3.i.W, this.f35223d + "_" + this.f35224e + "_" + this.f35225f.getSecondRequestIndex());
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                this.f35227h.sendMessage(messageObtain2);
                if (this.f35220a) {
                    a(1, System.currentTimeMillis() - this.f35229j, str, "", str2);
                    return;
                }
                return;
            }
            if (i10 != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = InterfaceC0435l1.d.b.f29109f;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35223d);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f35222c);
            bundle3.putString("request_id", this.f35224e);
            bundle3.putString(X3.i.W, this.f35223d + "_" + this.f35224e + "_" + this.f35225f.getSecondRequestIndex());
            messageObtain3.setData(bundle3);
            this.f35227h.sendMessage(messageObtain3);
            n nVar = this.f35226g;
            if (nVar != null) {
                nVar.a(this.f35222c, this.f35223d, this.f35224e, str);
            }
        }

        public void a(boolean z10) {
            this.f35220a = z10;
        }

        private void a(int i10, long j10, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a(i10, j10, str, str2, str3));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class j implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f35236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f35237b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f35238c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f35239d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f35240e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CampaignEx f35241f;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f35242a;

            public a(String str) {
                this.f35242a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (j.this.f35241f != null) {
                    try {
                        com.mbridge.msdk.foundation.db.n nVarA = com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                        q0.a("RewardCampaignsResourceManager", "campaign is null");
                        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                        nVar.j("2000044");
                        nVar.c(m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
                        nVar.b(j.this.f35241f.getId());
                        nVar.i(j.this.f35241f.getImageUrl());
                        nVar.n(j.this.f35241f.getRequestId());
                        nVar.k(j.this.f35241f.getCurrentLocalRid());
                        nVar.o(j.this.f35241f.getRequestIdNotice());
                        nVar.u(j.this.f35238c);
                        nVar.m(this.f35242a);
                        nVar.b("scenes", "1");
                        nVarA.a(nVar);
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                        }
                    }
                }
            }
        }

        public j(Handler handler, int i10, String str, String str2, String str3, CampaignEx campaignEx) {
            this.f35236a = handler;
            this.f35237b = i10;
            this.f35239d = str;
            this.f35238c = str2;
            this.f35240e = str3;
            this.f35241f = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            Message messageObtain = Message.obtain();
            messageObtain.what = this.f35237b == 0 ? InterfaceC0435l1.c.b.f29097c : 204;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35238c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f35239d);
            bundle.putString("request_id", this.f35240e);
            bundle.putString(X3.i.W, this.f35238c + "_" + this.f35240e + "_" + this.f35241f.getSecondRequestIndex());
            messageObtain.setData(bundle);
            this.f35236a.sendMessage(messageObtain);
            a aVar = new a(str);
            if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
            } else {
                aVar.run();
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            ResDownloadCheckManager.getInstance().setImageDownloadDone(str, true);
            Message messageObtain = Message.obtain();
            messageObtain.what = this.f35237b == 0 ? InterfaceC0435l1.d.b.f29106c : InterfaceC0435l1.d.b.f29108e;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35238c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f35239d);
            bundle.putString("request_id", this.f35240e);
            bundle.putString(X3.i.W, this.f35238c + "_" + this.f35240e + "_" + this.f35241f.getSecondRequestIndex());
            messageObtain.setData(bundle);
            this.f35236a.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class l implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f35250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f35251c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f35252d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f35253e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CampaignEx f35254f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f35255g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Handler f35256h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private n f35257i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private CopyOnWriteArrayList<CampaignEx> f35258j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f35249a = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f35259k = System.currentTimeMillis();

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f35260a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f35261b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f35262c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f35263d;

            public a(int i10, String str, String str2, String str3) {
                this.f35260a = i10;
                this.f35261b = str;
                this.f35262c = str2;
                this.f35263d = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (l.this.f35254f == null || l.this.f35250b == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                    nVar.j("m_download_end");
                    if (l.this.f35250b != null) {
                        nVar.c(m0.s(l.this.f35250b.getApplicationContext()));
                    }
                    nVar.d(this.f35260a);
                    if (l.this.f35254f != null) {
                        nVar.b(l.this.f35254f.getId());
                        nVar.n(l.this.f35254f.getRequestId());
                        nVar.k(l.this.f35254f.getCurrentLocalRid());
                        nVar.o(l.this.f35254f.getRequestIdNotice());
                    }
                    nVar.t(this.f35261b);
                    nVar.m(this.f35262c);
                    nVar.u(l.this.f35251c);
                    if (!TextUtils.isEmpty(this.f35263d)) {
                        nVar.q(this.f35263d);
                    }
                    nVar.e(2);
                    nVar.b("scenes", "1");
                    nVar.b("url", this.f35261b);
                    b.b(nVar, l.this.f35254f);
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, l.this.f35254f);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$l$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class RunnableC0158b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f35265a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f35266b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f35267c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f35268d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f35269e;

            public RunnableC0158b(int i10, long j10, String str, String str2, String str3) {
                this.f35265a = i10;
                this.f35266b = j10;
                this.f35267c = str;
                this.f35268d = str2;
                this.f35269e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (l.this.f35254f == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("m_download_end", this.f35265a, this.f35266b + "", this.f35267c, l.this.f35254f.getId(), l.this.f35251c, this.f35268d, "1");
                    nVar.n(l.this.f35254f.getRequestId());
                    nVar.k(l.this.f35254f.getCurrentLocalRid());
                    nVar.o(l.this.f35254f.getRequestIdNotice());
                    nVar.b(l.this.f35254f.getId());
                    nVar.a(l.this.f35254f.getAdSpaceT());
                    nVar.q(this.f35269e);
                    nVar.b("scenes", "1");
                    if (l.this.f35254f.getAdType() == 287) {
                        nVar.a("3");
                    } else if (l.this.f35254f.getAdType() == 94) {
                        nVar.a("1");
                    }
                    nVar.b("url", this.f35267c);
                    nVar.e(3);
                    b.b(nVar, l.this.f35254f);
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, l.this.f35251c, l.this.f35254f);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    }
                }
            }
        }

        public l(Context context, String str, String str2, String str3, CampaignEx campaignEx, int i10, Handler handler, n nVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f35250b = context;
            this.f35252d = str;
            this.f35251c = str2;
            this.f35253e = str3;
            this.f35254f = campaignEx;
            this.f35255g = i10;
            this.f35256h = handler;
            this.f35257i = nVar;
            this.f35258j = copyOnWriteArrayList;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f35259k;
            int i10 = this.f35255g;
            if (i10 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = InterfaceC0435l1.d.b.f29105b;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35251c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f35252d);
                bundle.putString("request_id", this.f35253e);
                bundle.putString(X3.i.W, this.f35251c + "_" + this.f35253e + "_" + this.f35254f.getSecondRequestIndex());
                bundle.putString("url", str2);
                bundle.putString("message", str);
                messageObtain.setData(bundle);
                this.f35256h.sendMessage(messageObtain);
                return;
            }
            if (i10 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = InterfaceC0435l1.c.b.f29096b;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35251c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f35252d);
                bundle2.putString("request_id", this.f35253e);
                bundle2.putString("url", str2);
                bundle2.putString(X3.i.W, this.f35251c + "_" + this.f35253e + "_" + this.f35254f.getSecondRequestIndex());
                bundle2.putString("message", str);
                messageObtain2.setData(bundle2);
                this.f35256h.sendMessage(messageObtain2);
                if (this.f35249a) {
                    a(3, jCurrentTimeMillis, str2, "zip download failed", "");
                    return;
                }
                return;
            }
            if (i10 != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = InterfaceC0435l1.c.b.f29098d;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35251c);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f35252d);
            bundle3.putString("request_id", this.f35253e);
            bundle3.putString("url", str2);
            bundle3.putString(X3.i.W, this.f35251c + "_" + this.f35253e + "_" + this.f35254f.getSecondRequestIndex());
            bundle3.putString("message", str);
            messageObtain3.setData(bundle3);
            this.f35256h.sendMessage(messageObtain3);
            if (this.f35257i != null) {
                try {
                    this.f35257i.a(str2, this.f35253e, b.b(880006, new MBridgeIds(this.f35252d, this.f35251c, this.f35253e), "", null, null));
                } catch (Exception e10) {
                    q0.b("RewardCampaignsResourceManager", e10.getMessage());
                }
            }
            a(3, str2, str, "");
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f35259k;
            int i10 = this.f35255g;
            if (i10 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = InterfaceC0435l1.d.b.f29105b;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35251c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f35252d);
                bundle.putString("request_id", this.f35253e);
                bundle.putString(X3.i.W, this.f35251c + "_" + this.f35253e + "_" + this.f35254f.getSecondRequestIndex());
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                this.f35256h.sendMessage(messageObtain);
                return;
            }
            if (i10 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = InterfaceC0435l1.d.b.f29105b;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35251c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f35252d);
                bundle2.putString("request_id", this.f35253e);
                bundle2.putString(X3.i.W, this.f35251c + "_" + this.f35253e + "_" + this.f35254f.getSecondRequestIndex());
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                this.f35256h.sendMessage(messageObtain2);
                if (this.f35249a) {
                    a(1, jCurrentTimeMillis, str, "", str2);
                    return;
                }
                return;
            }
            if (i10 != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = InterfaceC0435l1.d.b.f29107d;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35251c);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f35252d);
            bundle3.putString("request_id", this.f35253e);
            bundle3.putString(X3.i.W, this.f35251c + "_" + this.f35253e + "_" + this.f35254f.getSecondRequestIndex());
            messageObtain3.setData(bundle3);
            this.f35256h.sendMessage(messageObtain3);
            n nVar = this.f35257i;
            if (nVar != null) {
                nVar.a(this.f35252d, this.f35251c, this.f35253e, str);
            }
            if (z10) {
                return;
            }
            a(1, str, "", str2);
        }

        public void a(boolean z10) {
            this.f35249a = z10;
        }

        private void a(int i10, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a(i10, str, str2, str3));
        }

        private void a(int i10, long j10, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new RunnableC0158b(i10, j10, str, str2, str3));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class m extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f35271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ConcurrentHashMap<String, h> f35272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> f35273c;

        public m(Looper looper) {
            super(looper);
            this.f35272b = new ConcurrentHashMap<>();
            this.f35273c = new ConcurrentHashMap<>();
        }

        public void a(String str, h hVar) {
            this.f35272b.put(str, hVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean zA;
            Bundle data = message.getData();
            String string = data.getString(MBridgeConstans.PLACEMENT_ID);
            String string2 = data.getString(MBridgeConstans.PROPERTIES_UNIT_ID);
            String string3 = data.getString("request_id");
            String string4 = data.getString(X3.i.W);
            f fVar = (f) b.f35150g.get(string4);
            h hVar = this.f35272b.get(string4);
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f35273c.get(string4);
            int i10 = message.what;
            switch (i10) {
                case 100:
                case InterfaceC0435l1.d.b.f29105b /* 101 */:
                case InterfaceC0435l1.d.b.f29106c /* 102 */:
                case InterfaceC0435l1.d.b.f29107d /* 103 */:
                case InterfaceC0435l1.d.b.f29108e /* 104 */:
                case InterfaceC0435l1.d.b.f29109f /* 105 */:
                case 106:
                    break;
                default:
                    switch (i10) {
                        case 200:
                        case InterfaceC0435l1.c.b.f29096b /* 201 */:
                        case InterfaceC0435l1.c.b.f29098d /* 203 */:
                        case InterfaceC0435l1.c.b.f29100f /* 205 */:
                            if (fVar != null && hVar != null) {
                                String string5 = data.getString("message");
                                if (string5 == null) {
                                    string5 = "";
                                }
                                int iC = b.c(message.what);
                                String str = "resource download failed " + b.d(message.what) + " " + string5;
                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = fVar.f35199h;
                                try {
                                    CampaignEx campaignEx = (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.size() <= 0) ? null : fVar.f35199h.get(0);
                                    if (!fVar.f35192a || fVar.f35200i == null) {
                                        if (com.mbridge.msdk.videocommon.download.b.getInstance().a(94, fVar.f35196e, fVar.f35193b, fVar.f35195d, fVar.f35192a, fVar.f35194c, copyOnWriteArrayList)) {
                                            hVar.a(string, string2, string3, fVar.f35199h);
                                        } else {
                                            if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                                                int i11 = message.what;
                                                if (i11 != 200) {
                                                    if (i11 != 201) {
                                                        if (i11 != 203) {
                                                            if (i11 == 205 && campaignEx.getRsIgnoreCheckRule().contains(3)) {
                                                            }
                                                        } else if (campaignEx.getRsIgnoreCheckRule().contains(1)) {
                                                        }
                                                    } else if (campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                    }
                                                } else if (campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                                }
                                            }
                                            hVar.a(fVar.f35199h, b.b(iC, new MBridgeIds(string, string2, string3), str, null, null));
                                        }
                                        this.f35272b.remove(string4);
                                        b.f35150g.remove(string4);
                                        this.f35273c.remove(string4);
                                        break;
                                    } else if (fVar.f35194c == 1) {
                                        if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                                            int i12 = message.what;
                                            if (i12 == 200) {
                                                if (campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                                }
                                                break;
                                            } else if (i12 == 201) {
                                                if (campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                }
                                                break;
                                            } else if (i12 == 203) {
                                                if (campaignEx.getRsIgnoreCheckRule().contains(1)) {
                                                }
                                                break;
                                            } else if (i12 == 205) {
                                                if (!campaignEx.getRsIgnoreCheckRule().contains(3)) {
                                                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList3 = fVar.f35199h;
                                                    if (copyOnWriteArrayList3 != null && copyOnWriteArrayList3.size() > 0) {
                                                        CampaignEx campaignEx2 = fVar.f35199h.get(0);
                                                        if (campaignEx2.getCMPTEntryUrl().equals(campaignEx2.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                        }
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                        hVar.a(fVar.f35199h, b.b(iC, new MBridgeIds(string, string2, string3), str, null, null));
                                        this.f35272b.remove(string4);
                                        b.f35150g.remove(string4);
                                        this.f35273c.remove(string4);
                                    } else {
                                        String string6 = data.getString("url");
                                        int i13 = message.what;
                                        if (i13 == 200) {
                                            if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                                q0.c("RewardCampaignsResourceManager", "Is TPL but  video download fail but hit ignoreCheckRule");
                                            } else {
                                                for (int i14 = 0; i14 < fVar.f35200i.size(); i14++) {
                                                    if (fVar.f35200i.get(i14).getVideoUrlEncode().equals(string6)) {
                                                        fVar.f35200i.remove(i14);
                                                    }
                                                }
                                                b.f35150g.remove(string4);
                                                b.f35150g.put(string4, fVar);
                                            }
                                            break;
                                        } else if (i13 == 201) {
                                            if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                q0.c("RewardCampaignsResourceManager", "Is TPL but download endcard fail but hit ignoreCheckRule");
                                            } else {
                                                for (int i15 = 0; i15 < fVar.f35200i.size(); i15++) {
                                                    CampaignEx campaignEx3 = fVar.f35200i.get(i15);
                                                    if (campaignEx3.getRewardTemplateMode() != null && campaignEx3.getRewardTemplateMode().h().equals(string6)) {
                                                        fVar.f35200i.remove(i15);
                                                    }
                                                    if (!TextUtils.isEmpty(campaignEx3.getendcard_url()) && campaignEx3.getendcard_url().equals(string6)) {
                                                        fVar.f35200i.remove(i15);
                                                    }
                                                }
                                                b.f35150g.remove(string4);
                                                b.f35150g.put(string4, fVar);
                                            }
                                            break;
                                        } else if (i13 == 203) {
                                            if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
                                                q0.c("RewardCampaignsResourceManager", "Is TPL but download template fail but hit ignoreCheckRule");
                                            } else {
                                                for (int i16 = 0; i16 < fVar.f35200i.size(); i16++) {
                                                    CampaignEx campaignEx4 = fVar.f35200i.get(i16);
                                                    if (campaignEx4.getRewardTemplateMode() != null && campaignEx4.getRewardTemplateMode().j().equals(string6)) {
                                                        fVar.f35200i.remove(i16);
                                                    }
                                                }
                                                b.f35150g.remove(string4);
                                                b.f35150g.put(string4, fVar);
                                            }
                                            break;
                                        } else if (i13 == 205) {
                                            if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(3)) {
                                                q0.c("RewardCampaignsResourceManager", "Is TPL but download BTL Template fail but hit ignoreCheckRule");
                                            } else {
                                                fVar.f35200i.clear();
                                                b.f35150g.remove(string4);
                                                b.f35150g.put(string4, fVar);
                                            }
                                            break;
                                        }
                                        if (com.mbridge.msdk.videocommon.download.b.getInstance().a(94, fVar.f35196e, fVar.f35193b, fVar.f35195d, fVar.f35192a, fVar.f35194c, copyOnWriteArrayList)) {
                                            hVar.a(string, string2, string3, fVar.f35199h);
                                            this.f35272b.remove(string4);
                                            b.f35150g.remove(string4);
                                            this.f35273c.remove(string4);
                                        } else if (fVar.f35200i.size() == 0) {
                                            hVar.a(fVar.f35199h, b.b(iC, new MBridgeIds(string, string2, string3), str, null, null));
                                            this.f35272b.remove(string4);
                                            b.f35150g.remove(string4);
                                            this.f35273c.remove(string4);
                                        }
                                    }
                                } catch (Exception e10) {
                                    hVar.a(fVar.f35199h, b.b(iC, new MBridgeIds(string, string2, string3), str, e10, null));
                                    return;
                                }
                                break;
                            }
                            break;
                    }
                    return;
            }
            if (fVar == null || hVar == null) {
                return;
            }
            try {
                zA = com.mbridge.msdk.videocommon.download.b.getInstance().a(94, fVar.f35196e, fVar.f35193b, fVar.f35195d, fVar.f35192a, fVar.f35194c, copyOnWriteArrayList);
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e11.getLocalizedMessage());
                }
                zA = false;
            }
            if (zA) {
                hVar.a(string, string2, string3, fVar.f35199h);
                this.f35272b.remove(string4);
                b.f35150g.remove(string4);
                this.f35273c.remove(string4);
            }
        }

        public void a(Context context) {
            this.f35271a = context;
        }

        public void a(String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f35273c.put(str, copyOnWriteArrayList);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface n {
        void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar);

        void a(String str, String str2, String str3, String str4);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface o {
        void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.a.C0209a c0209a, com.mbridge.msdk.foundation.error.b bVar);

        void a(String str, String str2, String str3, String str4, String str5, com.mbridge.msdk.videocommon.a.C0209a c0209a);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class p extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f35274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Runnable f35275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f35276c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f35277d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f35278e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final o f35279f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final WindVaneWebView f35280g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final String f35281h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f35282i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final String f35283j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final com.mbridge.msdk.videocommon.a.C0209a f35284k;
        private final CampaignEx l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private CopyOnWriteArrayList<CampaignEx> f35285m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f35286n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f35287o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f35288p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Runnable f35289q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final Runnable f35290r;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f35291a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.mbridge.msdk.videocommon.a.C0209a f35292b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f35293c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f35294d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f35295e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f35296f;

            public a(o oVar, com.mbridge.msdk.videocommon.a.C0209a c0209a, String str, String str2, String str3, String str4) {
                this.f35291a = oVar;
                this.f35292b = c0209a;
                this.f35293c = str;
                this.f35294d = str2;
                this.f35295e = str3;
                this.f35296f = str4;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindVaneWebView windVaneWebViewB;
                com.mbridge.msdk.videocommon.a.C0209a c0209a;
                if (this.f35291a != null && (c0209a = this.f35292b) != null) {
                    c0209a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f35293c + "_" + this.f35294d + "_" + this.f35295e, true);
                    o oVar = this.f35291a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f35293c);
                    sb2.append("_");
                    sb2.append(this.f35295e);
                    oVar.a(sb2.toString(), this.f35296f, this.f35293c, this.f35294d, this.f35295e, this.f35292b);
                }
                com.mbridge.msdk.videocommon.a.C0209a c0209a2 = this.f35292b;
                if (c0209a2 == null || (windVaneWebViewB = c0209a2.b()) == null) {
                    return;
                }
                try {
                    windVaneWebViewB.release();
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e10.getMessage());
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$p$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class RunnableC0159b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f35298a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.mbridge.msdk.videocommon.a.C0209a f35299b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f35300c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f35301d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f35302e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f35303f;

            public RunnableC0159b(o oVar, com.mbridge.msdk.videocommon.a.C0209a c0209a, String str, String str2, String str3, String str4) {
                this.f35298a = oVar;
                this.f35299b = c0209a;
                this.f35300c = str;
                this.f35301d = str2;
                this.f35302e = str3;
                this.f35303f = str4;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindVaneWebView windVaneWebViewB;
                com.mbridge.msdk.videocommon.a.C0209a c0209a;
                if (this.f35298a != null && (c0209a = this.f35299b) != null) {
                    c0209a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f35300c + "_" + this.f35301d + "_" + this.f35302e, true);
                    o oVar = this.f35298a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f35300c);
                    sb2.append("_");
                    sb2.append(this.f35302e);
                    oVar.a(sb2.toString(), this.f35303f, this.f35300c, this.f35301d, this.f35302e, this.f35299b);
                }
                com.mbridge.msdk.videocommon.a.C0209a c0209a2 = this.f35299b;
                if (c0209a2 == null || (windVaneWebViewB = c0209a2.b()) == null) {
                    return;
                }
                try {
                    windVaneWebViewB.release();
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e10.getMessage());
                    }
                }
            }
        }

        public p(Handler handler, Runnable runnable, boolean z10, boolean z11, String str, o oVar, WindVaneWebView windVaneWebView, String str2, String str3, String str4, com.mbridge.msdk.videocommon.a.C0209a c0209a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, long j10) {
            this.f35274a = handler;
            this.f35275b = runnable;
            this.f35276c = z10;
            this.f35277d = z11;
            this.f35278e = str;
            this.f35279f = oVar;
            this.f35280g = windVaneWebView;
            this.f35281h = str2;
            this.f35282i = str4;
            this.f35283j = str3;
            this.f35284k = c0209a;
            this.l = campaignEx;
            this.f35285m = copyOnWriteArrayList;
            this.f35286n = j10;
            a aVar = new a(oVar, c0209a, str4, str, str2, str3);
            this.f35290r = aVar;
            this.f35289q = new RunnableC0159b(oVar, c0209a, str4, str, str2, str3);
            if (handler != null) {
                handler.postDelayed(aVar, 5000L);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            Handler handler;
            Runnable runnable;
            Runnable runnable2;
            super.a(webView, i10);
            Handler handler2 = this.f35274a;
            if (handler2 != null && (runnable2 = this.f35289q) != null) {
                handler2.removeCallbacks(runnable2);
            }
            Handler handler3 = this.f35274a;
            if (handler3 != null && (runnable = this.f35290r) != null) {
                handler3.removeCallbacks(runnable);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 2);
                eVar.a("result", Integer.valueOf(i10));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.l, eVar);
            } catch (Throwable th2) {
                q0.b("WindVaneWebView", th2.getMessage());
            }
            if (this.f35288p) {
                return;
            }
            String str = this.f35282i + "_" + this.f35281h;
            if (i10 == 1) {
                Runnable runnable3 = this.f35275b;
                if (runnable3 != null && (handler = this.f35274a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f35282i + "_" + this.f35278e + "_" + this.f35281h, true);
                com.mbridge.msdk.videocommon.a.C0209a c0209a = this.f35284k;
                if (c0209a != null) {
                    c0209a.a(true);
                }
                if (this.f35276c) {
                    if (this.f35277d) {
                        com.mbridge.msdk.videocommon.a.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.l.getRequestIdNotice(), this.f35284k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.l.getRequestIdNotice(), this.f35284k);
                    }
                } else if (this.f35277d) {
                    com.mbridge.msdk.videocommon.a.a(94, this.l.getRequestIdNotice(), this.f35284k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.l.getRequestIdNotice(), this.f35284k);
                }
                o oVar = this.f35279f;
                if (oVar != null) {
                    oVar.a(str, this.f35283j, this.f35282i, this.f35278e, this.f35281h, this.f35284k);
                }
            } else if (this.f35279f != null) {
                this.f35279f.a(str, this.f35278e, this.f35281h, this.f35284k, b.b(880009, new MBridgeIds(this.f35283j, this.f35282i, this.f35278e), l1.d.e(i10, "readyState:"), null, this.l));
            }
            this.f35288p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            Runnable runnable;
            Handler handler;
            Runnable runnable2;
            super.onPageFinished(webView, str);
            Handler handler2 = this.f35274a;
            if (handler2 != null && (runnable2 = this.f35290r) != null) {
                handler2.removeCallbacks(runnable2);
            }
            if (this.f35287o) {
                return;
            }
            if (str.contains("wfr=1")) {
                Handler handler3 = this.f35274a;
                if (handler3 != null && (runnable = this.f35289q) != null) {
                    handler3.postDelayed(runnable, 5000L);
                }
            } else {
                String str2 = this.f35282i + "_" + this.f35281h;
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f35282i + "_" + this.f35278e + "_" + this.f35281h, true);
                Runnable runnable3 = this.f35275b;
                if (runnable3 != null && (handler = this.f35274a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                com.mbridge.msdk.videocommon.a.C0209a c0209a = this.f35284k;
                if (c0209a != null) {
                    c0209a.a(true);
                }
                if (this.f35276c) {
                    if (this.l.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.l.getRequestIdNotice(), this.f35284k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.l.getRequestIdNotice(), this.f35284k);
                    }
                } else if (this.l.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.l.getRequestIdNotice(), this.f35284k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.l.getRequestIdNotice(), this.f35284k);
                }
                o oVar = this.f35279f;
                if (oVar != null) {
                    oVar.a(str2, this.f35283j, this.f35282i, this.f35278e, this.f35281h, this.f35284k);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.f35287o = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f35282i + "_" + this.f35278e + "_" + this.f35281h, false);
            Handler handler = this.f35274a;
            if (handler != null) {
                if (this.f35289q != null) {
                    handler.removeCallbacks(this.f35290r);
                }
                Runnable runnable = this.f35289q;
                if (runnable != null) {
                    this.f35274a.removeCallbacks(runnable);
                }
            }
            try {
                String str3 = this.f35282i + "_" + this.f35281h;
                com.mbridge.msdk.videocommon.a.C0209a c0209a = this.f35284k;
                if (c0209a != null) {
                    c0209a.a(false);
                }
                if (this.f35279f != null) {
                    this.f35279f.a(str3, this.f35278e, str2, this.f35284k, b.b(880009, new MBridgeIds(this.f35283j, this.f35282i, this.f35278e), i10 + "#" + str, null, this.l));
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("WindVaneWebView", e10.getLocalizedMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f35282i + "_" + this.f35278e + "_" + this.f35281h, false);
            Handler handler = this.f35274a;
            if (handler != null) {
                if (this.f35289q != null) {
                    handler.removeCallbacks(this.f35290r);
                }
                Runnable runnable = this.f35289q;
                if (runnable != null) {
                    this.f35274a.removeCallbacks(runnable);
                }
            }
            try {
                String str = this.f35282i + "_" + this.f35281h;
                com.mbridge.msdk.videocommon.a.C0209a c0209a = this.f35284k;
                if (c0209a != null) {
                    c0209a.a(false);
                }
                if (this.f35279f != null) {
                    MBridgeIds mBridgeIds = new MBridgeIds(this.f35283j, this.f35282i, this.f35278e);
                    StringBuilder sb2 = new StringBuilder("onReceivedSslError:");
                    sb2.append(sslError == null ? "" : Integer.valueOf(sslError.getPrimaryError()));
                    this.f35279f.a(str, this.f35278e, this.f35281h, this.f35284k, b.b(880009, mBridgeIds, sb2.toString(), null, this.l));
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("WindVaneWebView", e10.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class q extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f35306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WindVaneWebView f35307c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f35308d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f35309e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final com.mbridge.msdk.videocommon.a.C0209a f35310f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final CampaignEx f35311g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f35312h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f35313i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f35314j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f35315k;

        public q(String str, boolean z10, WindVaneWebView windVaneWebView, String str2, String str3, com.mbridge.msdk.videocommon.a.C0209a c0209a, CampaignEx campaignEx, boolean z11, String str4) {
            this.f35306b = z10;
            this.f35307c = windVaneWebView;
            this.f35308d = str2;
            this.f35309e = str3;
            this.f35310f = c0209a;
            this.f35311g = campaignEx;
            this.f35305a = str;
            this.f35312h = z11;
            this.f35313i = str4;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 2);
                eVar.a("result", Integer.valueOf(i10));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.f35311g, eVar);
            } catch (Throwable th2) {
                q0.b("WindVaneWebView", th2.getMessage());
            }
            if (this.f35315k) {
                return;
            }
            if (this.f35307c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f35305a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i10);
                    jSONObject2.put("error", "");
                    jSONObject.put("data", jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f35307c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e10.getLocalizedMessage());
                    }
                }
            }
            String str = this.f35309e + "_" + this.f35311g.getId() + "_" + this.f35311g.getRequestId() + "_" + this.f35308d;
            if (i10 == 1) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f35309e + "_" + this.f35313i + "_" + this.f35308d, true);
                com.mbridge.msdk.videocommon.a.C0209a c0209a = this.f35310f;
                if (c0209a != null) {
                    c0209a.a(true);
                }
                if (this.f35306b) {
                    if (this.f35311g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(str, this.f35310f, false, this.f35312h);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str, this.f35310f, false, this.f35312h);
                    }
                } else if (this.f35311g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(str, this.f35310f, false, this.f35312h);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str, this.f35310f, false, this.f35312h);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f35309e + "_" + this.f35313i + "_" + this.f35308d, false);
                com.mbridge.msdk.videocommon.a.C0209a c0209a2 = this.f35310f;
                if (c0209a2 != null) {
                    c0209a2.a(false);
                }
            }
            this.f35315k = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            if (this.f35314j) {
                return;
            }
            if (!str.contains("wfr=1")) {
                if (this.f35307c != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", this.f35305a);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "");
                        jSONObject.put("data", jSONObject2);
                        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f35307c, "componentReact", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("WindVaneWebView", e10.getLocalizedMessage());
                        }
                    }
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f35309e + "_" + this.f35313i + "_" + this.f35308d, true);
                com.mbridge.msdk.videocommon.a.C0209a c0209a = this.f35310f;
                if (c0209a != null) {
                    c0209a.a(true);
                }
                String str2 = this.f35309e + "_" + this.f35311g.getId() + "_" + this.f35311g.getRequestId() + "_" + this.f35308d;
                if (this.f35306b) {
                    if (this.f35311g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f35311g.getRequestIdNotice(), this.f35310f);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str2, this.f35310f, false, this.f35312h);
                    }
                } else if (this.f35311g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.f35311g.getRequestIdNotice(), this.f35310f);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str2, this.f35310f, false, this.f35312h);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.f35314j = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f35309e + "_" + this.f35313i + "_" + this.f35308d, false);
            com.mbridge.msdk.videocommon.a.C0209a c0209a = this.f35310f;
            if (c0209a != null) {
                c0209a.a(false);
            }
            if (this.f35307c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f35305a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", str);
                    jSONObject.put("data", jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f35307c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e10.getLocalizedMessage());
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f35316a = new b(null);
    }

    public /* synthetic */ b(a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(int i10) {
        if (i10 == 200) {
            return 880004;
        }
        if (i10 == 201) {
            return 880007;
        }
        if (i10 != 203) {
            return i10 != 205 ? 880024 : 880005;
        }
        return 880006;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static synchronized String d(int i10) {
        if (i10 == 200) {
            return "video";
        }
        if (i10 == 201) {
            return "zip/html";
        }
        if (i10 != 203) {
            return i10 != 205 ? "unknown" : "tpl";
        }
        return Z3.D;
    }

    private b() {
        this.f35153c = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;
        this.f35154d = "down_type";
        this.f35155e = "h3c";
        this.f35156f = new ArrayList(6);
        HandlerThread handlerThread = new HandlerThread("mb-reward-load-thread");
        f35150g = new ConcurrentHashMap<>();
        handlerThread.start();
        this.f35151a = new m(handlerThread.getLooper());
    }

    public void c() {
    }

    public static b b() {
        return r.f35316a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.mbridge.msdk.foundation.entity.n nVar, CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), campaignEx.getCampaignUnitId());
            if (cVarC != null) {
                nVar.s(cVarC.x());
            }
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (aVarC != null) {
                nVar.r(aVarC.f());
            }
        } catch (Exception e10) {
            q0.b("RewardCampaignsResourceManager", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.mbridge.msdk.foundation.error.b b(int i10, MBridgeIds mBridgeIds, String str, Throwable th2, CampaignEx campaignEx) {
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(i10);
        bVar.a(mBridgeIds);
        bVar.a(th2);
        bVar.c(str);
        bVar.a(campaignEx);
        return bVar;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class k implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f35244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f35246c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f35247d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f35248e;

        public k(Handler handler, String str, String str2, String str3, String str4) {
            this.f35244a = handler;
            this.f35246c = str;
            this.f35245b = str2;
            this.f35247d = str3;
            this.f35248e = str4;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str, true);
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35245b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f35246c);
            bundle.putString("request_id", this.f35247d);
            bundle.putString(X3.i.W, this.f35248e);
            bundle.putString("url", str);
            messageObtain.setData(bundle);
            this.f35244a.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str2, false);
            Message messageObtain = Message.obtain();
            messageObtain.what = 200;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35245b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f35246c);
            bundle.putString("request_id", this.f35247d);
            bundle.putString("url", str2);
            bundle.putString(X3.i.W, this.f35248e);
            bundle.putString("message", str);
            messageObtain.setData(bundle);
            this.f35244a.sendMessage(messageObtain);
        }
    }

    public synchronized void a(Context context, boolean z10, int i10, boolean z11, int i11, String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, h hVar, n nVar) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        String str4 = str2 + "_" + str3 + "_" + copyOnWriteArrayList2.get(0).getSecondRequestIndex();
        f35150g.put(str4, new f(z10, z11, i10, copyOnWriteArrayList2.size(), str2, str3, i11, copyOnWriteArrayList2));
        this.f35151a.a(str4, hVar);
        this.f35151a.a(context);
        this.f35151a.a(str4, copyOnWriteArrayList2);
        this.f35151a.post(new a(copyOnWriteArrayList2, context, str2, i11, str, str3, str4, nVar));
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0157b implements z.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f35166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f35167b;

        public C0157b(int i10, CampaignEx campaignEx) {
            this.f35166a = i10;
            this.f35167b = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.tools.z.c
        public void a(String str, String str2, String str3, String str4, boolean z10) {
            if (z10) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                int i10 = this.f35166a;
                if (i10 == 0) {
                    nVar.e(1);
                    nVar.d(1);
                    nVar.j("m_download_end");
                } else if (i10 == 1) {
                    nVar.e(2);
                    nVar.d(1);
                    nVar.j("m_download_end");
                } else if (i10 == 2) {
                    nVar.e(3);
                    nVar.d(1);
                    nVar.j("m_download_end");
                    nVar.b(this.f35167b.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
                    nVar.f("1");
                }
                nVar.o(this.f35167b.getRequestIdNotice());
                nVar.b("url", str);
                nVar.b("scenes", "1");
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, this.f35167b);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.tools.z.c
        public void a(String str, DownloadError downloadError) {
            String message = "";
            if (downloadError != null) {
                try {
                    if (downloadError.getException() != null) {
                        message = downloadError.getException().getMessage();
                    }
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            int i10 = this.f35166a;
            if (i10 == 0) {
                nVar.e(1);
                nVar.d(3);
                nVar.j("m_download_end");
            } else if (i10 == 1) {
                nVar.e(2);
                nVar.d(3);
                nVar.j("m_download_end");
            } else if (i10 == 2) {
                nVar.e(3);
                nVar.d(3);
                nVar.j("m_download_end");
                nVar.b(this.f35167b.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
                nVar.f("1");
            }
            b.b(nVar, this.f35167b);
            nVar.o(this.f35167b.getRequestIdNotice());
            nVar.m(message);
            nVar.b("scenes", "1");
            nVar.b("url", str);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, this.f35167b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, CampaignEx campaignEx, String str, String str2) {
        z.a(i10, str, str2, new C0157b(i10, campaignEx), campaignEx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2, String str3, CampaignEx campaignEx, String str4, n nVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        if (TextUtils.isEmpty(str4) || campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = a(campaignEx, 3);
        if (str4.contains(".zip") && str4.contains(ResourceManager.KEY_MD5FILENAME)) {
            boolean zIsEmpty = TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str4));
            try {
                l lVar = new l(context, str, str2, str3, campaignEx, 497, this.f35151a, nVar, copyOnWriteArrayList);
                lVar.a(zIsEmpty);
                H5DownLoadManager.getInstance().downloadH5Res(cVarA, str4, lVar);
                return;
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    return;
                }
                return;
            }
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str4));
        try {
            i iVar = new i(497, str, str2, str3, campaignEx, nVar, this.f35151a, copyOnWriteArrayList);
            iVar.a(zIsEmpty2);
            H5DownLoadManager.getInstance().downloadH5Res(cVarA, str4, iVar);
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardCampaignsResourceManager", e11.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class g extends com.mbridge.msdk.mbsignalcommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f35201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f35202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f35203c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f35204d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f35205e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f35206f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f35207g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f35208h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f35209i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private com.mbridge.msdk.videocommon.a.C0209a f35210j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private CampaignEx f35211k;
        private CopyOnWriteArrayList<CampaignEx> l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private com.mbridge.msdk.videocommon.setting.c f35212m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final o f35213n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f35214o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f35215p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f35216q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f35217r = 0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f35218s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private long f35219t;

        public g(boolean z10, Handler handler, Runnable runnable, boolean z11, boolean z12, int i10, String str, String str2, String str3, String str4, com.mbridge.msdk.videocommon.a.C0209a c0209a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.videocommon.setting.c cVar, o oVar, boolean z13, long j10) {
            this.f35201a = handler;
            this.f35202b = runnable;
            this.f35203c = z11;
            this.f35204d = z12;
            this.f35205e = i10;
            this.f35206f = str;
            this.f35208h = str2;
            this.f35207g = str3;
            this.f35209i = str4;
            this.f35210j = c0209a;
            this.f35211k = campaignEx;
            this.l = copyOnWriteArrayList;
            this.f35212m = cVar;
            this.f35213n = oVar;
            this.f35214o = z13;
            this.f35218s = z10;
            this.f35219t = j10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            Runnable runnable;
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 1);
                eVar.a("result", Integer.valueOf(i10));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.f35211k, eVar);
            } catch (Throwable th2) {
                q0.b("RVWindVaneWebView", th2.getMessage());
            }
            if (this.f35216q) {
                return;
            }
            String str = this.f35207g + "_" + this.f35206f;
            if (i10 == 1) {
                if (this.f35214o) {
                    com.mbridge.msdk.videocommon.a.d(this.f35207g + "_" + this.f35209i);
                } else {
                    com.mbridge.msdk.videocommon.a.c(this.f35207g + "_" + this.f35209i);
                }
                com.mbridge.msdk.videocommon.a.a(this.f35207g + "_" + this.f35209i + "_" + this.f35206f, this.f35210j, true, this.f35214o);
                Handler handler = this.f35201a;
                if (handler != null && (runnable = this.f35202b) != null) {
                    handler.removeCallbacks(runnable);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f35207g + "_" + this.f35209i + "_" + this.f35206f, true);
                com.mbridge.msdk.videocommon.a.C0209a c0209a = this.f35210j;
                if (c0209a != null) {
                    c0209a.a(true);
                }
                o oVar = this.f35213n;
                if (oVar != null) {
                    oVar.a(str, this.f35208h, this.f35207g, this.f35209i, this.f35206f, this.f35210j);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f35207g + "_" + this.f35209i + "_" + this.f35206f, false);
                com.mbridge.msdk.videocommon.a.C0209a c0209a2 = this.f35210j;
                if (c0209a2 != null) {
                    c0209a2.a(false);
                }
                if (this.f35213n != null) {
                    this.f35213n.a(str, this.f35209i, this.f35206f, this.f35210j, b.b(880008, new MBridgeIds(this.f35208h, this.f35207g, this.f35209i), l1.d.e(i10, "readyState:"), null, this.f35211k));
                }
            }
            this.f35216q = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            Runnable runnable;
            super.onPageFinished(webView, str);
            if (this.f35215p) {
                return;
            }
            String str2 = this.f35207g + "_" + this.f35206f;
            if (!str.contains("wfr=1")) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f35207g + "_" + this.f35209i + "_" + this.f35206f, true);
                Handler handler = this.f35201a;
                if (handler != null && (runnable = this.f35202b) != null) {
                    handler.removeCallbacks(runnable);
                }
                com.mbridge.msdk.videocommon.a.C0209a c0209a = this.f35210j;
                if (c0209a != null) {
                    c0209a.a(true);
                }
                o oVar = this.f35213n;
                if (oVar != null) {
                    oVar.a(str2, this.f35208h, this.f35207g, this.f35209i, this.f35206f, this.f35210j);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.f35215p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f35207g + "_" + this.f35209i + "_" + this.f35206f, false);
            if (this.f35213n != null) {
                String str3 = this.f35207g + "_" + this.f35206f;
                com.mbridge.msdk.videocommon.a.C0209a c0209a = this.f35210j;
                if (c0209a != null) {
                    c0209a.a(false);
                }
                this.f35213n.a(str3, this.f35209i, this.f35206f, this.f35210j, b.b(880008, new MBridgeIds(this.f35208h, this.f35207g, this.f35209i), "onReceivedError： " + i10 + "  " + str, null, this.f35211k));
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onRenderProcessGone(WebView webView) {
            if (webView != null) {
                try {
                    com.mbridge.msdk.video.bt.component.d.c().c(this.f35207g, this.f35209i);
                } catch (Throwable th2) {
                    q0.b("RVWindVaneWebView", th2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a
        public void a(WebView webView, String str, String str2, int i10, int i11) {
            boolean z10 = true;
            if (i10 == 1) {
                try {
                    com.mbridge.msdk.reward.controller.a aVar = new com.mbridge.msdk.reward.controller.a();
                    aVar.e(false);
                    if (i11 != 2) {
                        z10 = false;
                    }
                    aVar.d(z10);
                    aVar.c(str, str2);
                    aVar.a(new com.mbridge.msdk.video.bt.module.orglistener.a(null));
                    aVar.a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, i11, str2, true, 1));
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RVWindVaneWebView", e10.getMessage());
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a
        public void a(Object obj, String str) {
            if (obj != null) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    String strOptString = new JSONObject(str).optString("id");
                    com.mbridge.msdk.video.bt.component.d.c().b(obj, strOptString);
                    String strF = com.mbridge.msdk.video.bt.component.d.c().f(strOptString);
                    CampaignEx campaignExC = com.mbridge.msdk.video.bt.component.d.c().c(strOptString);
                    com.mbridge.msdk.videocommon.setting.c cVarD = com.mbridge.msdk.video.bt.component.d.c().d(strOptString);
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    copyOnWriteArrayList.add(campaignExC);
                    WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b;
                    if (windVaneWebView != null) {
                        b.b().a(this.f35218s, windVaneWebView, campaignExC, (CopyOnWriteArrayList<CampaignEx>) copyOnWriteArrayList, cVarD, strF, strOptString, this.f35217r == 0 ? 3 : 6);
                        this.f35217r++;
                    }
                } catch (Throwable th2) {
                    q0.b("RVWindVaneWebView", th2.getMessage());
                }
            }
        }
    }

    public synchronized void a(Context context, CampaignEx campaignEx, String str, String str2, String str3, n nVar) {
        try {
            this.f35151a.a(context);
            if (campaignEx != null) {
                String cMPTEntryUrl = campaignEx.getCMPTEntryUrl();
                if (campaignEx.isDynamicView()) {
                    if (v0.c(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW, cMPTEntryUrl)) {
                        a(0, campaignEx, campaignEx.getMof_tplid() + "", cMPTEntryUrl);
                    }
                    ResDownloadCheckManager.getInstance().setZipDownloadDone(cMPTEntryUrl, true);
                    Message messageObtain = Message.obtain();
                    messageObtain.what = InterfaceC0435l1.d.b.f29109f;
                    Bundle bundle = new Bundle();
                    bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                    bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                    bundle.putString("request_id", str3);
                    bundle.putString(X3.i.W, str2 + "_" + str3 + "_" + campaignEx.getSecondRequestIndex());
                    bundle.putString("url", cMPTEntryUrl);
                    messageObtain.setData(bundle);
                    this.f35151a.sendMessage(messageObtain);
                    if (nVar != null) {
                        nVar.a(str, str2, str3, cMPTEntryUrl);
                    }
                    return;
                }
            }
            if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.c cVarB = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(campaignEx.getCurrentLocalRid());
                    if (cVarB == null) {
                        cVarB = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.c cVar = cVarB;
                    cVar.a(campaignEx);
                    cVar.e(1);
                    cVar.f(a(campaignEx));
                    H5DownLoadManager.getInstance().downloadH5Res(cVar, campaignEx.getCMPTEntryUrl(), new c(str2, str, str3, campaignEx, nVar, context));
                } catch (Exception e10) {
                    q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, int i10, CampaignEx campaignEx, String str, String str2, String str3, String str4) {
        com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new d(campaignEx, context, i10, str, str2, str3, str4));
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0187 A[Catch: all -> 0x0034, TryCatch #3 {, blocks: (B:4:0x0009, B:5:0x0021, B:9:0x0030, B:58:0x0183, B:60:0x0187, B:62:0x0192, B:19:0x0042, B:27:0x0086, B:30:0x008c, B:32:0x0092, B:37:0x00a3, B:39:0x00ce, B:41:0x00d5, B:36:0x009d, B:49:0x00f6, B:53:0x013b), top: B:71:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0192 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0009, B:5:0x0021, B:9:0x0030, B:58:0x0183, B:60:0x0187, B:62:0x0192, B:19:0x0042, B:27:0x0086, B:30:0x008c, B:32:0x0092, B:37:0x00a3, B:39:0x00ce, B:41:0x00d5, B:36:0x009d, B:49:0x00f6, B:53:0x013b), top: B:71:0x0009 }] */
    public synchronized void a(boolean z10, Handler handler, boolean z11, boolean z12, WindVaneWebView windVaneWebView, String str, int i10, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str2, String str3, String str4, String str5, String str6, com.mbridge.msdk.videocommon.setting.c cVar, o oVar) {
        String str7;
        String str8;
        com.mbridge.msdk.video.signal.impl.k kVar;
        String str9 = str4;
        synchronized (this) {
            String str10 = str9 + "_" + str;
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                if (v0.i(str)) {
                    if (oVar != null) {
                        try {
                            oVar.a(str10, str3, str9, str5, str, null);
                        } catch (Exception e10) {
                            e = e10;
                            str8 = str10;
                        }
                    }
                    return;
                }
                str8 = str10;
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a("type", 2);
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", campaignEx, eVar);
                    com.mbridge.msdk.videocommon.a.C0209a c0209a = new com.mbridge.msdk.videocommon.a.C0209a();
                    try {
                        try {
                            WindVaneWebView windVaneWebView2 = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.n().d());
                            if (campaignEx != null) {
                                windVaneWebView2.setLocalRequestId(campaignEx.getCurrentLocalRid());
                            }
                            windVaneWebView2.setTempTypeForMetrics(2);
                            try {
                                c0209a.a(windVaneWebView2);
                                if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                                    kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx, copyOnWriteArrayList);
                                } else {
                                    kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx);
                                }
                                com.mbridge.msdk.video.signal.impl.k kVar2 = kVar;
                                kVar2.g(i10);
                                kVar2.setUnitId(str9);
                                kVar2.setRewardUnitSetting(cVar);
                                kVar2.d(z10);
                                str7 = str5;
                                try {
                                    windVaneWebView2.setWebViewListener(new p(handler, null, z11, z12, str7, oVar, windVaneWebView, str, str3, str9, c0209a, campaignEx, copyOnWriteArrayList, jCurrentTimeMillis));
                                    windVaneWebView2.setObject(kVar2);
                                    windVaneWebView2.loadUrl(str2);
                                    windVaneWebView2.setRid(str7);
                                } catch (Exception e11) {
                                    e = e11;
                                    str9 = str9;
                                    if (MBridgeConstans.DEBUG) {
                                        q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                    }
                                    if (oVar != null) {
                                        oVar.a(str8, str7, str, null, b(880009, new MBridgeIds(str3, str9, str7), "", e, campaignEx));
                                    }
                                }
                            } catch (Exception e12) {
                                e = e12;
                                str7 = str5;
                            }
                        } catch (Exception unused) {
                            if (oVar != null) {
                                c0209a.a(true);
                                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(str9 + "_" + str5 + "_" + str, true);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str9);
                                sb2.append("_");
                                sb2.append(str);
                                oVar.a(sb2.toString(), str3, str9, str5, str, c0209a);
                                return;
                            }
                            return;
                        } catch (Throwable unused2) {
                            if (oVar != null) {
                                c0209a.a(true);
                                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(str9 + "_" + str5 + "_" + str, true);
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(str9);
                                sb3.append("_");
                                sb3.append(str);
                                oVar.a(sb3.toString(), str3, str9, str5, str, c0209a);
                                return;
                            }
                            return;
                        }
                    } catch (Exception e13) {
                        e = e13;
                    }
                } catch (Exception e14) {
                    e = e14;
                }
                str7 = str5;
            } catch (Exception e15) {
                e = e15;
                str7 = str5;
                str8 = str10;
            }
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
            }
            if (oVar != null) {
                oVar.a(str8, str7, str, null, b(880009, new MBridgeIds(str3, str9, str7), "", e, campaignEx));
            }
        }
    }

    public synchronized void a(boolean z10, Handler handler, boolean z11, boolean z12, String str, String str2, String str3, String str4, String str5, int i10, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str6, String str7, com.mbridge.msdk.videocommon.setting.c cVar, o oVar, boolean z13) {
        String str8;
        com.mbridge.msdk.video.signal.impl.k kVar;
        String str9 = str4;
        synchronized (this) {
            this.f35152b = z13;
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str10 = str9 + "_" + str5;
            this.f35152b = z13;
            if (v0.i(str5)) {
                if (oVar != null) {
                    oVar.a(str10, str3, str9, str, str5, null);
                }
                return;
            }
            try {
                q0.a("RewardCampaignsResourceManager", "开始预加载大模板资源");
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 1);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", campaignEx, eVar);
                com.mbridge.msdk.videocommon.a.C0209a c0209a = new com.mbridge.msdk.videocommon.a.C0209a();
                WindVaneWebView windVaneWebView = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.n().d());
                if (campaignEx != null) {
                    windVaneWebView.setLocalRequestId(campaignEx.getCurrentLocalRid());
                }
                windVaneWebView.setTempTypeForMetrics(1);
                c0209a.a(windVaneWebView);
                String strB = com.mbridge.msdk.video.bt.component.d.c().b();
                String strB2 = com.mbridge.msdk.video.bt.component.d.c().b();
                c0209a.a(strB2);
                if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(str9);
                    if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                        for (int i11 = 0; i11 < copyOnWriteArrayList.size(); i11++) {
                            CampaignEx campaignEx2 = copyOnWriteArrayList.get(i11);
                            for (CampaignEx campaignEx3 : copyOnWriteArrayListB) {
                                if (campaignEx3.getId().equals(campaignEx2.getId()) && campaignEx3.getRequestId().equals(campaignEx2.getRequestId())) {
                                    campaignEx2.setReady(true);
                                    copyOnWriteArrayList.set(i11, campaignEx2);
                                }
                            }
                        }
                    }
                    kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx, copyOnWriteArrayList);
                } else {
                    kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx);
                }
                kVar.g(i10);
                kVar.setUnitId(str7);
                kVar.c(strB2);
                kVar.d(strB);
                kVar.c(true);
                kVar.setRewardUnitSetting(cVar);
                kVar.d(z10);
                com.mbridge.msdk.video.signal.impl.k kVar2 = kVar;
                try {
                    str9 = str4;
                    str8 = str;
                    try {
                        windVaneWebView.setWebViewListener(new g(z10, handler, null, z11, z12, i10, str5, str3, str4, str, c0209a, campaignEx, copyOnWriteArrayList, cVar, oVar, z13, jCurrentTimeMillis));
                        windVaneWebView.setObject(kVar2);
                        windVaneWebView.loadUrl(str6);
                        windVaneWebView.setRid(str8);
                        MBridgeBTRootLayout mBridgeBTRootLayout = new MBridgeBTRootLayout(com.mbridge.msdk.foundation.controller.c.n().d());
                        mBridgeBTRootLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        mBridgeBTRootLayout.setInstanceId(strB);
                        mBridgeBTRootLayout.setUnitId(str9);
                        MBridgeBTLayout mBridgeBTLayout = new MBridgeBTLayout(com.mbridge.msdk.foundation.controller.c.n().d());
                        mBridgeBTLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        mBridgeBTLayout.setInstanceId(strB2);
                        mBridgeBTLayout.setUnitId(str9);
                        mBridgeBTLayout.setWebView(windVaneWebView);
                        AbstractMap abstractMapB = com.mbridge.msdk.video.bt.component.d.c().b(str9, str8);
                        abstractMapB.put(strB2, mBridgeBTLayout);
                        abstractMapB.put(strB, mBridgeBTRootLayout);
                        mBridgeBTRootLayout.addView(mBridgeBTLayout, new FrameLayout.LayoutParams(-1, -1));
                    } catch (Exception e10) {
                        e = e10;
                        if (oVar != null) {
                            oVar.a(str10, str8, str5, null, b(880008, new MBridgeIds(str3, str9, str8), "", e, campaignEx));
                        }
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    str9 = str4;
                    str8 = str;
                }
            } catch (Exception e12) {
                e = e12;
                str8 = str;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, WindVaneWebView windVaneWebView, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.videocommon.setting.c cVar, String str, String str2, int i10) {
        if (windVaneWebView != null) {
            if (campaignEx != null && cVar != null && campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", str2);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "data is null");
                        jSONObject.put("data", jSONObject2);
                        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        return;
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                            return;
                        }
                        return;
                    }
                }
                if (!TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j()) && campaignEx.getRewardTemplateMode().j().contains(CampaignEx.KEY_IS_CMPT_ENTRY)) {
                    q0.a("RewardCampaignsResourceManager", "getTeamplateUrl contains cmpt=1");
                    return;
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new e(z10, windVaneWebView, campaignEx, copyOnWriteArrayList, str, cVar, str2), i10 * 1000);
                    return;
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", str2);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("result", 2);
                jSONObject4.put("error", "data is null");
                jSONObject3.put("data", jSONObject4);
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e11.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, WindVaneWebView windVaneWebView, String str, int i10, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str2, String str3, com.mbridge.msdk.videocommon.setting.c cVar, String str4, boolean z11) {
        com.mbridge.msdk.video.signal.impl.k kVar;
        String requestId;
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", campaignEx, eVar);
            com.mbridge.msdk.videocommon.a.C0209a c0209a = new com.mbridge.msdk.videocommon.a.C0209a();
            WindVaneWebView windVaneWebView2 = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.n().d());
            if (campaignEx != null) {
                windVaneWebView2.setLocalRequestId(campaignEx.getCurrentLocalRid());
            }
            windVaneWebView2.setTempTypeForMetrics(2);
            c0209a.a(windVaneWebView2);
            String requestId2 = "";
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(str3);
                if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                    for (int i11 = 0; i11 < copyOnWriteArrayList.size(); i11++) {
                        CampaignEx campaignEx2 = copyOnWriteArrayList.get(i11);
                        for (CampaignEx campaignEx3 : copyOnWriteArrayListB) {
                            if (campaignEx3.getId().equals(campaignEx2.getId()) && campaignEx3.getRequestId().equals(campaignEx2.getRequestId())) {
                                campaignEx2.setReady(true);
                                copyOnWriteArrayList.set(i11, campaignEx2);
                            }
                        }
                    }
                }
                com.mbridge.msdk.video.signal.impl.k kVar2 = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx, copyOnWriteArrayList);
                requestId = copyOnWriteArrayList.get(0).getRequestId();
                kVar = kVar2;
            } else {
                kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx);
                if (campaignEx != null) {
                    requestId2 = campaignEx.getRequestId();
                }
                requestId = requestId2;
            }
            kVar.g(i10);
            kVar.setUnitId(str3);
            kVar.c(str4);
            kVar.setRewardUnitSetting(cVar);
            kVar.d(z10);
            windVaneWebView2.setWebViewListener(new q(str4, false, windVaneWebView, str, str3, c0209a, campaignEx, z11, requestId));
            windVaneWebView2.setObject(kVar);
            windVaneWebView2.loadUrl(str2);
            windVaneWebView2.setRid(requestId);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
            }
        }
    }

    private int a(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 0;
        }
        try {
            if (campaignEx.getAabEntity() != null) {
                return campaignEx.getAabEntity().h3c;
            }
            return 0;
        } catch (Throwable th2) {
            q0.b("RewardCampaignsResourceManager", th2.getMessage());
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVarB = campaignEx != null ? com.mbridge.msdk.foundation.same.report.metrics.d.b().b(campaignEx.getCurrentLocalRid()) : null;
        if (cVarB == null) {
            cVarB = new com.mbridge.msdk.foundation.same.report.metrics.c();
        }
        cVarB.a(campaignEx);
        cVarB.f(a(campaignEx));
        cVarB.e(i10);
        return cVarB;
    }
}

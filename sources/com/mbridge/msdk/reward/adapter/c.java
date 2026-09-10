package com.mbridge.msdk.reward.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.ResDownloadCheckManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.reward.player.MBRewardVideoActivity;
import d5.u;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c {
    private String C;
    private h D;
    public String K;
    private List<CampaignEx> V;
    private CopyOnWriteArrayList<CampaignEx> W;
    private List<CampaignEx> X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f35317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f35322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f35323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f35324h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.orglistener.h f35325i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile com.mbridge.msdk.reward.adapter.a f35326j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile com.mbridge.msdk.reward.controller.a.j f35327k;
    private com.mbridge.msdk.videocommon.setting.c l;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f35333r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f35334s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f35336u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f35337v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f35338w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f35339x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private CampaignUnit f35340y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f35341z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f35328m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f35329n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f35330o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f35331p = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f35332q = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f35335t = "";
    private boolean A = false;
    private long B = 0;
    private boolean E = false;
    private boolean F = false;
    public String G = "";
    public String H = "";
    public String I = "";
    public int J = 0;
    private Handler L = new a(Looper.getMainLooper());
    private boolean M = false;
    private long N = 0;
    volatile boolean O = false;
    volatile boolean P = false;
    volatile boolean Q = false;
    volatile boolean R = false;
    volatile boolean S = false;
    public volatile boolean T = false;
    private String U = "";

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Code duplicated, block: B:89:0x022f  */
        /* JADX WARN: Code duplicated, block: B:90:0x0231  */
        /* JADX WARN: Code duplicated, block: B:94:0x0261  */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            CampaignEx campaignEx;
            com.mbridge.msdk.foundation.error.b bVarA;
            boolean z10;
            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = c.this.a(message);
            try {
                try {
                    int i10 = message.what;
                    if (i10 == 8) {
                        if (c.this.f35326j == null || (campaignEx = (CampaignEx) message.obj) == null || TextUtils.isEmpty(c.this.f35318b)) {
                            return;
                        }
                        com.mbridge.msdk.reward.report.a.a(c.this.f35317a, campaignEx, c.this.f35318b);
                        c.this.l();
                        return;
                    }
                    if (i10 == 18) {
                        if (c.this.f35327k != null) {
                            c.this.f35327k.a(c.this.C, cVarA);
                            return;
                        }
                        return;
                    }
                    switch (i10) {
                        case 1:
                        case 2:
                            c.this.a((String) message.obj, cVarA);
                            break;
                        case 3:
                            if (c.this.f35326j != null) {
                                c.this.f35326j.a("campaign is ok", cVarA);
                            }
                            Message message2 = new Message();
                            message2.what = 5;
                            if (cVarA != null) {
                                Bundle bundle = new Bundle();
                                bundle.putString("metrics_data_lrid", cVarA.t());
                                message2.setData(bundle);
                            }
                            sendMessageDelayed(message2, com.mbridge.msdk.foundation.same.a.L);
                            break;
                        case 4:
                            if (c.this.f35326j != null) {
                                c cVar = c.this;
                                cVar.a(cVar.f35318b, (List<CampaignEx>) c.this.V, c.this.f35334s, "");
                                try {
                                    com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880002, "unknow error in load failed");
                                    Object obj = message.obj;
                                    if (obj == null) {
                                        if (c.this.L != null) {
                                            c.this.L.removeMessages(5);
                                        }
                                        removeMessages(6);
                                        q0.a("RewardMVVideoAdapter", "=====================onVideoLoadFail=====================00000");
                                        if (!c.this.S) {
                                            c.this.S = false;
                                            bVarA = com.mbridge.msdk.foundation.error.a.a(880002, "errorCode: 3506 errorMessage: data load failed");
                                            bVarA2 = bVarA;
                                        }
                                    } else {
                                        String str = (String) obj;
                                        int i11 = message.arg1;
                                        if (TextUtils.isEmpty(str)) {
                                            if (c.this.L != null) {
                                                c.this.L.removeMessages(5);
                                            }
                                            removeMessages(6);
                                            q0.a("RewardMVVideoAdapter", "=====================onVideoLoadFail=====================11111");
                                            if (!c.this.S) {
                                                c.this.S = false;
                                                bVarA = com.mbridge.msdk.foundation.error.a.a(880002, "errorCode: 3507 errorMessage: data load failed, errorMsg null");
                                            }
                                        } else {
                                            if (c.this.L != null) {
                                                c.this.L.removeMessages(5);
                                            }
                                            removeMessages(6);
                                            bVarA = i11 == 880021 ? com.mbridge.msdk.foundation.error.a.a(880021, "errorCode: 3507 errorMessage: data load failed, errorMsg is APP ALREADY INSTALLED") : (i11 == 880003 || i11 == 6 || i11 == 7) ? com.mbridge.msdk.foundation.error.a.a(880003, "errorCode: 3507 errorMessage: data load failed, errorMsg is ".concat(str)) : com.mbridge.msdk.foundation.error.a.a(880002, "errorCode: 3507 errorMessage: data load failed, errorMsg is ".concat(str));
                                        }
                                        bVarA2 = bVarA;
                                    }
                                    c.this.S = false;
                                    if (cVarA != null) {
                                        cVarA.b(c.this.V);
                                        if (cVarA.u() == null) {
                                            cVarA.a(bVarA2);
                                        } else {
                                            bVarA2 = cVarA.u();
                                        }
                                    }
                                    c.this.f35326j.a(c.this.V, bVarA2, cVarA);
                                } catch (Exception e10) {
                                    if (c.this.L != null) {
                                        c.this.L.removeMessages(5);
                                    }
                                    removeMessages(6);
                                    c cVar2 = c.this;
                                    cVar2.a(cVar2.f35318b, (List<CampaignEx>) c.this.V, c.this.f35334s, "");
                                    com.mbridge.msdk.foundation.error.b bVarA3 = com.mbridge.msdk.foundation.error.a.a(880002, "errorCode: 3508 errorMessage: data load failed, exception is: " + e10.getMessage());
                                    if (cVarA != null) {
                                        cVarA.b(c.this.V);
                                        cVarA.a(bVarA3);
                                    }
                                    c.this.f35326j.a(c.this.V, bVarA3, cVarA);
                                    return;
                                }
                            }
                            break;
                        case 5:
                            if (c.this.f35326j != null) {
                                if (c.this.V != null && c.this.V.size() > 0) {
                                    CampaignEx campaignEx2 = (CampaignEx) c.this.V.get(0);
                                    boolean z11 = !TextUtils.isEmpty(campaignEx2.getCMPTEntryUrl());
                                    int nscpt = campaignEx2.getNscpt();
                                    c cVar3 = c.this;
                                    if (cVar3.a((List<CampaignEx>) cVar3.f35341z, z11, nscpt, true, false)) {
                                        c cVar4 = c.this;
                                        cVar4.a(cVar4.f35318b, (List<CampaignEx>) c.this.V, (List<CampaignEx>) c.this.X, c.this.f35334s);
                                        sendEmptyMessage(6);
                                        removeMessages(5);
                                        if (!c.this.R) {
                                            c.this.R = true;
                                            c.this.f35326j.a(c.this.f35341z, cVarA);
                                        }
                                    }
                                }
                                c cVar5 = c.this;
                                cVar5.a(cVar5.f35318b, (List<CampaignEx>) c.this.V, c.this.f35334s, "");
                                if (c.this.L != null) {
                                    c.this.L.removeMessages(5);
                                    c.this.L.removeMessages(6);
                                }
                                CampaignEx campaignEx3 = (c.this.V == null || c.this.V.size() <= 0) ? null : (CampaignEx) c.this.V.get(0);
                                if (campaignEx3 == null && c.this.W != null && c.this.W.size() > 0) {
                                    campaignEx3 = (CampaignEx) c.this.W.get(0);
                                }
                                if (!c.this.S || (c.this.T && campaignEx3 != null && !TextUtils.isEmpty(campaignEx3.getNLRid()))) {
                                    com.mbridge.msdk.foundation.error.b bVarA4 = com.mbridge.msdk.foundation.error.a.a(880010, "errorCode: 3401 errorMessage: resource load timeout");
                                    c.this.S = false;
                                    if (cVarA != null) {
                                        cVarA.a(bVarA4);
                                    }
                                    c.this.f35326j.a(c.this.V, bVarA4, cVarA);
                                    if (c.this.f35341z != null && c.this.f35341z.size() > 0) {
                                        boolean z12 = false;
                                        for (CampaignEx campaignEx4 : c.this.f35341z) {
                                            if (campaignEx4 != null) {
                                                try {
                                                    if (!TextUtils.isEmpty(campaignEx4.getVideoUrlEncode()) && !ResDownloadCheckManager.getInstance().containsVideoKey(campaignEx4.getVideoUrlEncode())) {
                                                        z10 = true;
                                                    }
                                                    if (campaignEx4 != null && !TextUtils.isEmpty(campaignEx4.getendcard_url()) && !ResDownloadCheckManager.getInstance().containsZipKey(campaignEx4.getendcard_url())) {
                                                        z10 = true;
                                                    }
                                                    if (campaignEx4 != null && !TextUtils.isEmpty(campaignEx4.getCMPTEntryUrl())) {
                                                        if (!ResDownloadCheckManager.getInstance().containsZipKey(campaignEx4.getCMPTEntryUrl())) {
                                                            z10 = true;
                                                        } else if (!z12 && !z10) {
                                                            if (com.mbridge.msdk.videocommon.a.b(c.this.f35318b + "_" + campaignEx4.getRequestId() + "_" + campaignEx4.getCMPTEntryUrl()) == null) {
                                                                z12 = true;
                                                            }
                                                        }
                                                    }
                                                    if (campaignEx4 != null && campaignEx4.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx4.getRewardTemplateMode().j()) && !campaignEx4.getRewardTemplateMode().j().contains(CampaignEx.KEY_IS_CMPT_ENTRY) && ResDownloadCheckManager.getInstance().containsZipKey(campaignEx4.getRewardTemplateMode().j()) && TextUtils.isEmpty(campaignEx4.getCMPTEntryUrl()) && !z10) {
                                                        com.mbridge.msdk.videocommon.a.a(campaignEx4.getAdType(), campaignEx4);
                                                    }
                                                } catch (Exception e11) {
                                                    if (MBridgeConstans.DEBUG) {
                                                        q0.b("RewardMVVideoAdapter", e11.getMessage());
                                                    }
                                                }
                                            }
                                            z10 = false;
                                            if (campaignEx4 != null) {
                                                z10 = true;
                                            }
                                            if (campaignEx4 != null) {
                                                if (!ResDownloadCheckManager.getInstance().containsZipKey(campaignEx4.getCMPTEntryUrl())) {
                                                    z10 = true;
                                                } else if (!z12) {
                                                    if (com.mbridge.msdk.videocommon.a.b(c.this.f35318b + "_" + campaignEx4.getRequestId() + "_" + campaignEx4.getCMPTEntryUrl()) == null) {
                                                        z12 = true;
                                                    }
                                                }
                                            }
                                            if (campaignEx4 != null) {
                                                com.mbridge.msdk.videocommon.a.a(campaignEx4.getAdType(), campaignEx4);
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 6:
                            c cVar6 = c.this;
                            cVar6.a(cVar6.f35318b, (List<CampaignEx>) c.this.V, (List<CampaignEx>) c.this.X, c.this.f35334s);
                            if (c.this.f35326j != null) {
                                removeMessages(6);
                                if (c.this.L != null) {
                                    c.this.L.removeMessages(5);
                                }
                                if (c.this.f35326j != null && !c.this.R) {
                                    c.this.R = true;
                                    c.this.f35326j.a(c.this.f35341z, cVarA);
                                    break;
                                }
                            }
                            break;
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            } catch (Throwable th2) {
                q0.a("RewardMVVideoAdapter", th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends com.mbridge.msdk.reward.request.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.same.report.metrics.c f35343e;

        public b(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            this.f35343e = cVar;
        }

        @Override // com.mbridge.msdk.reward.request.a
        public void a(CampaignUnit campaignUnit) throws Throwable {
            CampaignEx campaignEx;
            try {
                c.this.c(campaignUnit);
                c.this.a(campaignUnit);
                if (campaignUnit != null) {
                    c.this.G = campaignUnit.getRequestId();
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
                if (c.this.f35341z != null && c.this.f35341z.size() > 0 && (campaignEx = (CampaignEx) c.this.f35341z.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
                    c.this.f35341z.clear();
                }
                if (c.this.V != null) {
                    c.this.V.clear();
                }
                c.this.O = false;
                c.this.P = false;
                synchronized (c.this.f35330o) {
                    try {
                        if (c.this.Q) {
                            c.this.Q = false;
                        }
                        c.this.S = false;
                        c.this.R = false;
                        c.this.b("exception after load success", this.f35343e);
                        c.this.n();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.reward.request.a
        public void b(int i10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            CampaignEx campaignEx;
            if (i10 == -1) {
                c.this.B = System.currentTimeMillis();
            }
            if (c.this.f35341z != null && c.this.f35341z.size() > 0 && (campaignEx = (CampaignEx) c.this.f35341z.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
                c.this.f35341z.clear();
            }
            if (c.this.V != null) {
                c.this.V.clear();
            }
            c.this.O = false;
            c.this.P = false;
            synchronized (c.this.f35330o) {
                try {
                    if (c.this.Q) {
                        c.this.Q = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c.this.a(cVar, i10);
            c.this.S = false;
            c.this.R = false;
            if (!c.this.M) {
                c.this.a(i10, str, cVar);
            }
            c.this.n();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements com.mbridge.msdk.reward.adapter.b.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.metrics.c f35366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f35367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f35368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f35369d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f35370e;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f35372a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.mbridge.msdk.foundation.error.b f35373b;

            public a(String str, com.mbridge.msdk.foundation.error.b bVar) {
                this.f35372a = str;
                this.f35373b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.a(cVar.f35318b, (List<CampaignEx>) c.this.V, c.this.f35334s, this.f35372a);
                if (c.this.L != null) {
                    c.this.L.removeMessages(5);
                }
                if (c.this.S || c.this.f35326j == null) {
                    return;
                }
                c.this.S = false;
                com.mbridge.msdk.foundation.error.b bVar = this.f35373b;
                if (bVar != null) {
                    bVar.c("errorCode: 3202 errorMessage: temp resource download failed");
                }
                d dVar = d.this;
                if (dVar.f35366a == null) {
                    dVar.f35366a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                d dVar2 = d.this;
                dVar2.f35366a.b(dVar2.f35369d);
                d.this.f35366a.a(this.f35373b);
                c.this.f35326j.a(c.this.V, this.f35373b, d.this.f35366a);
                q0.a("RewardMVVideoAdapter", "播放模板下载失败，非大模板 onVideoLoadFail");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f35375a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.mbridge.msdk.foundation.error.b f35376b;

            public b(String str, com.mbridge.msdk.foundation.error.b bVar) {
                this.f35375a = str;
                this.f35376b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.a(cVar.f35318b, (List<CampaignEx>) c.this.V, c.this.f35334s, this.f35375a);
                if (c.this.L != null) {
                    c.this.L.removeMessages(5);
                }
                if (c.this.S || c.this.f35326j == null) {
                    return;
                }
                c.this.S = false;
                com.mbridge.msdk.foundation.error.b bVar = this.f35376b;
                if (bVar != null) {
                    bVar.c("errorCode: 3203 errorMessage: tpl temp resource download failed");
                }
                d dVar = d.this;
                if (dVar.f35366a == null) {
                    dVar.f35366a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                d dVar2 = d.this;
                dVar2.f35366a.b(dVar2.f35369d);
                d.this.f35366a.a(this.f35376b);
                c.this.f35326j.a(c.this.V, this.f35376b, d.this.f35366a);
                q0.a("RewardMVVideoAdapter", "播放模板下载失败，大模板，nscpt 1 onVideoLoadFail");
            }
        }

        public d(CampaignEx campaignEx, boolean z10, CopyOnWriteArrayList copyOnWriteArrayList, int i10) {
            this.f35367b = campaignEx;
            this.f35368c = z10;
            this.f35369d = copyOnWriteArrayList;
            this.f35370e = i10;
            this.f35366a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, String str3, String str4) {
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar) {
            q0.a("RewardMVVideoAdapter", "template 下载失败： ");
            if (bVar != null) {
                bVar.c("errorCode: 3202 errorMessage: temp resource download failed");
            }
            if (!this.f35368c && c.this.f35326j != null && c.this.L != null) {
                q0.a("RewardMVVideoAdapter", "播放模板下载失败，非大模板");
                if (this.f35367b.getRsIgnoreCheckRule() == null || this.f35367b.getRsIgnoreCheckRule().size() <= 0 || !this.f35367b.getRsIgnoreCheckRule().contains(1)) {
                    c.this.L.post(new a(str2, bVar));
                    return;
                } else {
                    q0.c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                    return;
                }
            }
            if (this.f35370e == 1) {
                if (this.f35367b.getRsIgnoreCheckRule() != null && this.f35367b.getRsIgnoreCheckRule().size() > 0) {
                    if (this.f35367b.getRsIgnoreCheckRule().contains(3)) {
                        q0.c("RewardMVVideoAdapter", "tpl download fail but hit ignoreCheckRule");
                        return;
                    } else if (this.f35367b.getCMPTEntryUrl().equals(this.f35367b.getendcard_url()) && this.f35367b.getRsIgnoreCheckRule().contains(2)) {
                        q0.c("RewardMVVideoAdapter", "endcard download fail but hit ignoreCheckRule at 3203");
                        return;
                    }
                }
                if (c.this.f35326j == null || c.this.L == null) {
                    return;
                }
                c.this.L.post(new b(str2, bVar));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f extends com.mbridge.msdk.foundation.same.c.a {
        public f() {
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            com.mbridge.msdk.reward.report.metrics.a.a().a(str, cVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignUnit f35390a;

        public g(CampaignUnit campaignUnit) {
            this.f35390a = campaignUnit;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.a(com.mbridge.msdk.foundation.db.g.a(c.this.f35317a)).d();
            CampaignUnit campaignUnit = this.f35390a;
            if (campaignUnit == null || campaignUnit.getAds() == null || this.f35390a.getAds().size() <= 0) {
                return;
            }
            c.this.d(this.f35390a.getAds());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.report.metrics.c f35393b;

        public h(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            this.f35392a = str;
            this.f35393b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (c.this.E) {
                    return;
                }
                c.this.F = true;
                if (c.this.L != null) {
                    Message messageObtainMessage = c.this.L.obtainMessage();
                    messageObtainMessage.obj = this.f35392a;
                    messageObtainMessage.what = 2;
                    if (this.f35393b != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", this.f35393b.t());
                        messageObtainMessage.setData(bundle);
                    }
                    c.this.L.sendMessage(messageObtainMessage);
                }
            } catch (Exception e10) {
                q0.b("RewardMVVideoAdapter", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.report.metrics.c f35396b;

        public i(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            this.f35395a = str;
            this.f35396b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (com.mbridge.msdk.util.b.a()) {
                    c cVar = c.this;
                    cVar.f35336u = com.mbridge.msdk.b.a(cVar.f35318b, c.this.f35317a);
                }
                c cVar2 = c.this;
                cVar2.f35324h = v0.a(cVar2.f35317a, c.this.f35318b);
                if (c.this.F) {
                    return;
                }
                if (c.this.D != null && c.this.L != null) {
                    c.this.L.removeCallbacks(c.this.D);
                }
                c.this.E = true;
                if (c.this.L != null) {
                    Message messageObtainMessage = c.this.L.obtainMessage();
                    messageObtainMessage.obj = this.f35395a;
                    messageObtainMessage.what = 1;
                    if (this.f35396b != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", this.f35396b.t());
                        messageObtainMessage.setData(bundle);
                    }
                    c.this.L.sendMessage(messageObtainMessage);
                }
                if (TextUtils.isEmpty(c.this.f35324h)) {
                    return;
                }
                q0.b("RewardMVVideoAdapter", "excludeId : " + c.this.f35324h);
            } catch (Exception e10) {
                q0.b("RewardMVVideoAdapter", e10.getMessage());
            }
        }
    }

    public c(Context context, String str, String str2) {
        try {
            this.f35317a = context.getApplicationContext();
            this.f35318b = str2;
            this.f35319c = str;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private String i() {
        try {
            return a1.b(com.mbridge.msdk.reward.controller.a.f35413c0) ? com.mbridge.msdk.reward.controller.a.f35413c0 : "";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    private String k() {
        com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        return com.mbridge.msdk.foundation.same.net.utils.d.h().a(this.C, TextUtils.isEmpty(this.C) ? gVarD.v0() : gVarD.D());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        try {
            if (a1.b(this.f35318b)) {
                com.mbridge.msdk.reward.controller.a.a(this.f35318b, 0);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void c(String str) {
        this.f35335t = str;
    }

    public void d(boolean z10) {
        this.f35333r = z10;
    }

    public void e(boolean z10) {
        this.f35334s = z10;
    }

    public void f(boolean z10) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList;
        if (z10 || (copyOnWriteArrayList = this.f35341z) == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        com.mbridge.msdk.videocommon.cache.a.a().a(this.f35318b, this.f35341z);
    }

    public boolean g(boolean z10) {
        if (z10) {
            List<CampaignEx> list = this.X;
            if (list == null || list.size() <= 0) {
                return false;
            }
            for (CampaignEx campaignEx : this.X) {
                if (campaignEx != null) {
                    campaignEx.setLoadTimeoutState(1);
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f35318b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j(), true);
                    }
                }
            }
            com.mbridge.msdk.videocommon.cache.a.a().a(this.f35318b, this.X, "load_timeout", 1);
            return true;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f35341z;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return false;
        }
        for (CampaignEx campaignEx2 : this.f35341z) {
            if (campaignEx2 != null) {
                campaignEx2.setLoadTimeoutState(1);
                if (campaignEx2.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx2.getRewardTemplateMode().j())) {
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f35318b + "_" + campaignEx2.getRequestId() + "_" + campaignEx2.getRewardTemplateMode().j(), true);
                }
            }
        }
        com.mbridge.msdk.videocommon.cache.a.a().a(this.f35318b, this.f35341z, "load_timeout", 1);
        return true;
    }

    public void h(boolean z10) {
        if (z10) {
            List<CampaignEx> list = this.X;
            if (list == null || list.size() <= 0) {
                return;
            }
            for (CampaignEx campaignEx : this.X) {
                if (campaignEx != null) {
                    campaignEx.setLoadTimeoutState(0);
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f35318b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j(), false);
                    }
                }
            }
            com.mbridge.msdk.videocommon.cache.a.a().a(this.f35318b, this.X, "load_timeout", 0);
            return;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f35341z;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        for (CampaignEx campaignEx2 : this.f35341z) {
            if (campaignEx2 != null) {
                campaignEx2.setLoadTimeoutState(0);
                if (campaignEx2.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx2.getRewardTemplateMode().j())) {
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f35318b + "_" + campaignEx2.getRequestId() + "_" + campaignEx2.getRewardTemplateMode().j(), false);
                }
            }
        }
        com.mbridge.msdk.videocommon.cache.a.a().a(this.f35318b, this.f35341z, "load_timeout", 0);
    }

    public String j() {
        return this.f35318b;
    }

    public boolean l() {
        return b(false);
    }

    public boolean m() {
        List<CampaignEx> listC = com.mbridge.msdk.videocommon.cache.a.a().c(this.f35318b, 1, this.f35334s, this.f35335t);
        if (listC == null || listC.size() <= 0) {
            q0.a("test_isReay_db", "database has not can use data");
            return false;
        }
        CampaignEx campaignEx = listC.get(0);
        int iA = com.mbridge.msdk.videocommon.cache.a.a().a(this.f35318b, 1, this.f35334s, this.f35335t);
        if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()) || campaignEx.getNscpt() != 1 || listC.size() >= iA) {
            return a(listC, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<CampaignEx> list) {
        if (this.f35317a == null || list == null || list.size() == 0) {
            return;
        }
        j jVarA = j.a(com.mbridge.msdk.foundation.db.g.a(this.f35317a));
        for (int i10 = 0; i10 < list.size(); i10++) {
            CampaignEx campaignEx = list.get(i10);
            if (campaignEx != null) {
                if (com.mbridge.msdk.util.b.a()) {
                    if (v0.c(this.f35317a, campaignEx.getPackageName())) {
                        com.mbridge.msdk.b.a(campaignEx);
                    } else {
                        a(jVarA, campaignEx);
                    }
                } else {
                    a(jVarA, campaignEx);
                }
            }
        }
    }

    private String e() {
        return com.mbridge.msdk.b.a();
    }

    public void c(boolean z10) {
        this.M = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c metricsData = campaignUnit.getMetricsData();
            if (metricsData != null) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", 1);
                eVar.a("timeout", Integer.valueOf(this.f35322f));
                eVar.a("hst", k());
                metricsData.b(campaignUnit.getAds());
                metricsData.a("2000126", eVar);
                campaignUnit.setLocalRequestId(metricsData.t());
                com.mbridge.msdk.reward.report.metrics.a.a().a("2000126", metricsData);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardMVVideoAdapter", e10.getMessage());
            }
        }
    }

    public CopyOnWriteArrayList<CampaignEx> f() {
        return this.W;
    }

    public void b(String str) {
        this.I = str;
    }

    public boolean b(boolean z10) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.cache.a.a().b(this.f35318b, 1, this.f35334s, this.f35335t);
        if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
            CampaignEx campaignEx = copyOnWriteArrayListB.get(0);
            cVar.i(campaignEx.getCurrentLocalRid());
            int iA = com.mbridge.msdk.videocommon.cache.a.a().a(this.f35318b, 1, this.f35334s, this.f35335t);
            if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()) || campaignEx.getNscpt() != 1 || copyOnWriteArrayListB.size() >= iA) {
                boolean zA = a(copyOnWriteArrayListB, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt(), z10);
                if (z10) {
                    a(zA, cVar, copyOnWriteArrayListB);
                }
                return zA;
            }
            if (z10) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("event_name", "is_ready_cltr");
                eVar.a("reason", "nscpt error");
                eVar.a("type", 8);
                a(cVar, eVar, copyOnWriteArrayListB);
            }
            return false;
        }
        q0.a("RewardVideoController", "database has not can use data");
        if (z10) {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar2.a("event_name", "is_ready_cse");
            eVar2.a("reason", "no effective campaign list");
            eVar2.a("type", 8);
            a(cVar, eVar2, copyOnWriteArrayListB);
        }
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements com.mbridge.msdk.reward.adapter.b.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.metrics.c f35378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f35379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f35380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f35381d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f35382e;

        public e(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, boolean z10, int i10) {
            this.f35379b = campaignEx;
            this.f35380c = copyOnWriteArrayList;
            this.f35381d = z10;
            this.f35382e = i10;
            this.f35378a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, String str3, String str4) {
            q0.a("RewardMVVideoAdapter", "大模板业务，大模板下载成功");
            c.this.P = true;
            if (!c.this.O || c.this.Q || c.this.L == null) {
                return;
            }
            synchronized (c.this.f35330o) {
                try {
                    if (c.this.Q) {
                        return;
                    }
                    c.this.Q = true;
                    c.this.L.post(new a(str3, str, str2));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar) {
            q0.a("RewardMVVideoAdapter", "大模板业务，大模板下载失败");
            if (this.f35379b.getRsIgnoreCheckRule() != null && this.f35379b.getRsIgnoreCheckRule().size() > 0) {
                if (this.f35379b.getRsIgnoreCheckRule().contains(3)) {
                    q0.c("RewardMVVideoAdapter", "tpl download fail but hit ignoreCheckRule");
                    return;
                } else if (this.f35379b.getCMPTEntryUrl().equals(this.f35379b.getendcard_url()) && this.f35379b.getRsIgnoreCheckRule().contains(2)) {
                    q0.c("RewardMVVideoAdapter", "endcard download fail but hit ignoreCheckRule at 3203");
                    return;
                }
            }
            c cVar = c.this;
            cVar.a(cVar.f35318b, (List<CampaignEx>) c.this.V, c.this.f35334s, str2);
            c.this.P = false;
            if (c.this.L != null) {
                c.this.L.removeMessages(5);
            }
            if (c.this.f35326j == null || c.this.S) {
                return;
            }
            c.this.S = false;
            if (bVar != null) {
                bVar.c("errorCode: 3203 errorMessage: tpl temp resource download failed");
            }
            if (this.f35378a == null) {
                this.f35378a = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.f35378a.b(this.f35380c);
            this.f35378a.a(bVar);
            c.this.f35326j.a(c.this.V, bVar, this.f35378a);
            q0.a("RewardMVVideoAdapter", "大模板业务，大模板下载失败 onVideoLoadFail");
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f35384a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f35385b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f35386c;

            public a(String str, String str2, String str3) {
                this.f35384a = str;
                this.f35385b = str2;
                this.f35386c = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b bVarB = com.mbridge.msdk.reward.adapter.b.b();
                boolean z10 = c.this.A;
                Handler handler = c.this.L;
                boolean z11 = c.this.f35333r;
                boolean z12 = c.this.f35334s;
                String str = this.f35384a;
                String requestIdNotice = e.this.f35379b.getRequestIdNotice();
                String str2 = this.f35385b;
                String str3 = this.f35386c;
                String cMPTEntryUrl = e.this.f35379b.getCMPTEntryUrl();
                int i10 = c.this.f35332q;
                e eVar = e.this;
                bVarB.a(z10, handler, z11, z12, str, requestIdNotice, str2, str3, cMPTEntryUrl, i10, eVar.f35379b, eVar.f35380c, H5DownLoadManager.getInstance().getH5ResAddress(e.this.f35379b.getCMPTEntryUrl()), this.f35386c, c.this.l, new C0163a(), false);
            }

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$e$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            public class C0163a implements com.mbridge.msdk.reward.adapter.b.o {
                public C0163a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, com.mbridge.msdk.videocommon.a.C0209a c0209a) {
                    f2.z("模板加载成功 requestId ", str4, "HBOPTIMIZE");
                    e eVar = e.this;
                    if (c.this.a(eVar.f35380c, eVar.f35381d, eVar.f35382e)) {
                        c cVar = c.this;
                        cVar.a(cVar.f35318b, (List<CampaignEx>) c.this.V, (List<CampaignEx>) c.this.X, c.this.f35334s);
                        if (c.this.L != null) {
                            c.this.L.removeMessages(5);
                        }
                        if (c.this.f35326j == null || c.this.R) {
                            return;
                        }
                        c.this.R = true;
                        e eVar2 = e.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = eVar2.f35378a;
                        if (cVar2 != null) {
                            cVar2.b(eVar2.f35380c);
                        }
                        com.mbridge.msdk.reward.adapter.a aVar = c.this.f35326j;
                        e eVar3 = e.this;
                        aVar.a(eVar3.f35380c, eVar3.f35378a);
                        return;
                    }
                    c cVar3 = c.this;
                    cVar3.a(str3, (List<CampaignEx>) cVar3.V, c.this.f35334s, a.this.f35384a);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f35326j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880008, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                    e eVar4 = e.this;
                    if (eVar4.f35378a == null) {
                        eVar4.f35378a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    e eVar5 = e.this;
                    eVar5.f35378a.b(eVar5.f35380c);
                    e.this.f35378a.a(bVarA);
                    c.this.f35326j.a(c.this.V, bVarA, e.this.f35378a);
                    q0.a("RewardMVVideoAdapter", "大模板业务，大模板预加载成功 isReady false  onVideoLoadFail");
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.a.C0209a c0209a, com.mbridge.msdk.foundation.error.b bVar) {
                    q0.a("RewardMVVideoAdapter", "大模板业务，大模板预加载失败");
                    q0.b("HBOPTIMIZE", "模板加载失败 requestId " + str2);
                    a aVar = a.this;
                    c cVar = c.this;
                    cVar.a(aVar.f35386c, (List<CampaignEx>) cVar.V, c.this.f35334s, str2);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f35326j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    e eVar = e.this;
                    if (eVar.f35378a == null) {
                        eVar.f35378a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    e eVar2 = e.this;
                    eVar2.f35378a.b(eVar2.f35380c);
                    e.this.f35378a.a(bVar);
                    c.this.f35326j.a(c.this.V, bVar, e.this.f35378a);
                    q0.a("RewardMVVideoAdapter", "大模板业务，大模板预加载失败 onVideoLoadFail");
                }
            }
        }
    }

    private void d() {
        try {
            Map<String, Long> map = com.mbridge.msdk.foundation.same.buffer.b.l;
            if (map == null || map.size() <= 0) {
                return;
            }
            com.mbridge.msdk.foundation.same.buffer.b.l.clear();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public String a(boolean z10) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB;
        CampaignEx campaignEx;
        if (z10) {
            if (TextUtils.isEmpty(this.H) && (copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.f35318b)) != null && copyOnWriteArrayListB.size() > 0 && (campaignEx = copyOnWriteArrayListB.get(0)) != null) {
                this.H = campaignEx.getRequestId();
            }
            return this.H;
        }
        return this.G;
    }

    public String g() {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f35341z;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            return com.mbridge.msdk.foundation.same.c.b(this.f35341z);
        }
        return com.mbridge.msdk.foundation.same.c.b(this.X);
    }

    public CopyOnWriteArrayList<CampaignEx> h() {
        return this.f35341z;
    }

    private void c() {
        try {
            com.mbridge.msdk.foundation.db.i.a(com.mbridge.msdk.foundation.db.g.a(this.f35317a)).a(this.f35318b);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(int i10) {
        this.f35332q = i10;
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0160c implements com.mbridge.msdk.reward.adapter.b.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.metrics.c f35345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f35346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f35347c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f35348d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f35349e;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class RunnableC0162c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CopyOnWriteArrayList f35363a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.mbridge.msdk.foundation.error.b f35364b;

            public RunnableC0162c(CopyOnWriteArrayList copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar) {
                this.f35363a = copyOnWriteArrayList;
                this.f35364b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.a(cVar.f35318b, this.f35363a, c.this.f35334s, "");
                if (c.this.L != null) {
                    c.this.L.removeMessages(5);
                }
                if (c.this.S || c.this.f35326j == null) {
                    return;
                }
                c.this.S = false;
                C0160c c0160c = C0160c.this;
                if (c0160c.f35345a == null) {
                    c0160c.f35345a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                C0160c c0160c2 = C0160c.this;
                c0160c2.f35345a.b(c0160c2.f35348d);
                com.mbridge.msdk.foundation.error.b bVar = this.f35364b;
                if (bVar != null) {
                    bVar.c("errorCode: 3201 errorMessage: campaign resource download failed");
                }
                C0160c.this.f35345a.a(this.f35364b);
                c.this.f35326j.a(this.f35363a, this.f35364b, C0160c.this.f35345a);
                q0.a("RewardMVVideoAdapter", "Campaign 下载失败：onVideoLoadFail");
            }
        }

        public C0160c(CampaignEx campaignEx, boolean z10, CopyOnWriteArrayList copyOnWriteArrayList, int i10) {
            this.f35346b = campaignEx;
            this.f35347c = z10;
            this.f35348d = copyOnWriteArrayList;
            this.f35349e = i10;
            this.f35345a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.h
        public void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            c.this.O = true;
            if (this.f35347c) {
                if (!c.this.P || c.this.Q || c.this.L == null) {
                    return;
                }
                synchronized (c.this.f35330o) {
                    try {
                        if (c.this.Q) {
                            return;
                        }
                        c.this.Q = true;
                        c.this.L.post(new b(str3, str2, copyOnWriteArrayList));
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            for (CampaignEx campaignEx : copyOnWriteArrayList) {
                if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j()) || campaignEx.getRewardTemplateMode().j().contains(CampaignEx.KEY_IS_CMPT_ENTRY) || c.this.L == null) {
                    C0160c c0160c = this;
                    String str4 = str;
                    String str5 = str2;
                    String str6 = str3;
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = copyOnWriteArrayList;
                    if (c.this.a(c0160c.f35348d, c0160c.f35347c, c0160c.f35349e)) {
                        c cVar = c.this;
                        cVar.a(cVar.f35318b, copyOnWriteArrayList2, (List<CampaignEx>) c.this.X, c.this.f35334s);
                        if (c.this.L != null) {
                            c.this.L.removeMessages(5);
                        }
                        if (c.this.f35326j != null && !c.this.R) {
                            c.this.R = true;
                            com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = c0160c.f35345a;
                            if (cVar2 != null) {
                                cVar2.b(c0160c.f35348d);
                            }
                            c.this.f35326j.a(c0160c.f35348d, c0160c.f35345a);
                        }
                    } else {
                        c cVar3 = c.this;
                        cVar3.a(str5, (List<CampaignEx>) cVar3.V, c.this.f35334s, str6);
                        if (c.this.L != null) {
                            c.this.L.removeMessages(5);
                        }
                        if (c.this.f35326j != null && !c.this.S) {
                            c.this.S = false;
                            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3503 errorMessage: have no temp but isReady false");
                            if (c0160c.f35345a == null) {
                                c0160c.f35345a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                            }
                            c0160c.f35345a.b(c0160c.f35348d);
                            c0160c.f35345a.a(bVarA);
                            c.this.f35326j.a(c0160c.f35348d, bVarA, c0160c.f35345a);
                            q0.a("RewardMVVideoAdapter", "Campaign 下载成功： 非大模板，不存在播放模板,isReay false onVideoLoadFail");
                        }
                    }
                    this = c0160c;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    copyOnWriteArrayList = copyOnWriteArrayList2;
                } else {
                    c.this.L.post(this.new a(campaignEx, str, str2, str3, copyOnWriteArrayList));
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$a */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignEx f35351a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f35352b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f35353c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f35354d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ CopyOnWriteArrayList f35355e;

            public a(CampaignEx campaignEx, String str, String str2, String str3, CopyOnWriteArrayList copyOnWriteArrayList) {
                this.f35351a = campaignEx;
                this.f35352b = str;
                this.f35353c = str2;
                this.f35354d = str3;
                this.f35355e = copyOnWriteArrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b bVarB = com.mbridge.msdk.reward.adapter.b.b();
                boolean z10 = c.this.A;
                Handler handler = c.this.L;
                boolean z11 = c.this.f35333r;
                boolean z12 = c.this.f35334s;
                String strJ = this.f35351a.getRewardTemplateMode().j();
                int i10 = c.this.f35332q;
                C0160c c0160c = C0160c.this;
                bVarB.a(z10, handler, z11, z12, null, strJ, i10, c0160c.f35346b, c0160c.f35348d, H5DownLoadManager.getInstance().getH5ResAddress(this.f35351a.getRewardTemplateMode().j()), this.f35352b, this.f35353c, this.f35354d, this.f35351a.getRequestIdNotice(), c.this.l, new C0161a());
            }

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            public class C0161a implements com.mbridge.msdk.reward.adapter.b.o {
                public C0161a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, com.mbridge.msdk.videocommon.a.C0209a c0209a) {
                    C0160c c0160c = C0160c.this;
                    if (c.this.a(c0160c.f35348d, c0160c.f35347c, c0160c.f35349e)) {
                        c cVar = c.this;
                        String str6 = cVar.f35318b;
                        a aVar = a.this;
                        cVar.a(str6, aVar.f35355e, (List<CampaignEx>) c.this.X, c.this.f35334s);
                        if (c.this.L != null) {
                            c.this.L.removeMessages(5);
                        }
                        if (c.this.f35326j == null || c.this.R) {
                            return;
                        }
                        c.this.R = true;
                        C0160c c0160c2 = C0160c.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = c0160c2.f35345a;
                        if (cVar2 != null) {
                            cVar2.b(c0160c2.f35348d);
                        }
                        com.mbridge.msdk.reward.adapter.a aVar2 = c.this.f35326j;
                        C0160c c0160c3 = C0160c.this;
                        aVar2.a(c0160c3.f35348d, c0160c3.f35345a);
                        return;
                    }
                    c cVar3 = c.this;
                    cVar3.a(str3, (List<CampaignEx>) cVar3.V, c.this.f35334s, str4);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f35326j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3502 errorMessage: temp preload success but isReady false");
                    C0160c c0160c4 = C0160c.this;
                    if (c0160c4.f35345a == null) {
                        c0160c4.f35345a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    C0160c c0160c5 = C0160c.this;
                    c0160c5.f35345a.b(c0160c5.f35348d);
                    C0160c.this.f35345a.a(bVarA);
                    com.mbridge.msdk.reward.adapter.a aVar3 = c.this.f35326j;
                    C0160c c0160c6 = C0160c.this;
                    aVar3.a(c0160c6.f35348d, bVarA, c0160c6.f35345a);
                    q0.a("RewardMVVideoAdapter", "Campaign 下载成功： 非大模板，播放模板预加载成功,isReay false onVideoLoadFail");
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.a.C0209a c0209a, com.mbridge.msdk.foundation.error.b bVar) {
                    if (bVar != null) {
                        bVar.a("his_reason", "preload template failed is tpl :" + C0160c.this.f35347c);
                    }
                    if (C0160c.this.f35346b.getRsIgnoreCheckRule() != null && C0160c.this.f35346b.getRsIgnoreCheckRule().size() > 0 && C0160c.this.f35346b.getRsIgnoreCheckRule().contains(1)) {
                        q0.c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                        return;
                    }
                    a aVar = a.this;
                    c cVar = c.this;
                    cVar.a(aVar.f35353c, (List<CampaignEx>) cVar.V, c.this.f35334s, str2);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f35326j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    C0160c c0160c = C0160c.this;
                    if (c0160c.f35345a == null) {
                        c0160c.f35345a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    C0160c c0160c2 = C0160c.this;
                    c0160c2.f35345a.b(c0160c2.f35348d);
                    C0160c.this.f35345a.a(bVar);
                    c.this.f35326j.a(c.this.V, bVar, C0160c.this.f35345a);
                    q0.a("RewardMVVideoAdapter", "Campaign 下载失败： 非大模板，播放模板预加载失败 onVideoLoadFail");
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$b */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f35358a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f35359b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ CopyOnWriteArrayList f35360c;

            public b(String str, String str2, CopyOnWriteArrayList copyOnWriteArrayList) {
                this.f35358a = str;
                this.f35359b = str2;
                this.f35360c = copyOnWriteArrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b bVarB = com.mbridge.msdk.reward.adapter.b.b();
                boolean z10 = c.this.A;
                Handler handler = c.this.L;
                boolean z11 = c.this.f35333r;
                boolean z12 = c.this.f35334s;
                String str = this.f35358a;
                String requestIdNotice = C0160c.this.f35346b.getRequestIdNotice();
                String str2 = c.this.f35319c;
                String str3 = this.f35359b;
                String cMPTEntryUrl = C0160c.this.f35346b.getCMPTEntryUrl();
                int i10 = c.this.f35332q;
                C0160c c0160c = C0160c.this;
                bVarB.a(z10, handler, z11, z12, str, requestIdNotice, str2, str3, cMPTEntryUrl, i10, c0160c.f35346b, c0160c.f35348d, H5DownLoadManager.getInstance().getH5ResAddress(C0160c.this.f35346b.getCMPTEntryUrl()), this.f35359b, c.this.l, new a(), false);
            }

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$b$a */
            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            public class a implements com.mbridge.msdk.reward.adapter.b.o {
                public a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, com.mbridge.msdk.videocommon.a.C0209a c0209a) {
                    C0160c c0160c = C0160c.this;
                    if (c.this.a(c0160c.f35348d, c0160c.f35347c, c0160c.f35349e)) {
                        c cVar = c.this;
                        String str6 = cVar.f35318b;
                        b bVar = b.this;
                        cVar.a(str6, bVar.f35360c, (List<CampaignEx>) c.this.X, c.this.f35334s);
                        if (c.this.L != null) {
                            c.this.L.removeMessages(5);
                        }
                        if (c.this.f35326j == null || c.this.R) {
                            return;
                        }
                        c.this.R = true;
                        C0160c c0160c2 = C0160c.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = c0160c2.f35345a;
                        if (cVar2 != null) {
                            cVar2.b(c0160c2.f35348d);
                        }
                        com.mbridge.msdk.reward.adapter.a aVar = c.this.f35326j;
                        C0160c c0160c3 = C0160c.this;
                        aVar.a(c0160c3.f35348d, c0160c3.f35345a);
                        return;
                    }
                    c cVar3 = c.this;
                    cVar3.a(str3, (List<CampaignEx>) cVar3.V, c.this.f35334s, str4);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f35326j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                    C0160c c0160c4 = C0160c.this;
                    if (c0160c4.f35345a == null) {
                        c0160c4.f35345a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    C0160c c0160c5 = C0160c.this;
                    c0160c5.f35345a.b(c0160c5.f35348d);
                    C0160c.this.f35345a.a(bVarA);
                    c.this.f35326j.a(c.this.V, bVarA, C0160c.this.f35345a);
                    q0.a("RewardMVVideoAdapter", "Campaign 下载成功： 大模板预加载成功,isReady false onVideoLoadFail");
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.a.C0209a c0209a, com.mbridge.msdk.foundation.error.b bVar) {
                    if (bVar != null) {
                        bVar.a("his_reason", "errorCode: 3303 errorMessage: tpl temp preload failed");
                    }
                    if (C0160c.this.f35346b.getRsIgnoreCheckRule() != null && C0160c.this.f35346b.getRsIgnoreCheckRule().size() > 0 && C0160c.this.f35346b.getRsIgnoreCheckRule().contains(3)) {
                        q0.c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                        return;
                    }
                    b bVar2 = b.this;
                    c cVar = c.this;
                    cVar.a(bVar2.f35359b, (List<CampaignEx>) cVar.V, c.this.f35334s, str2);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f35326j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    C0160c c0160c = C0160c.this;
                    if (c0160c.f35345a == null) {
                        c0160c.f35345a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    C0160c c0160c2 = C0160c.this;
                    c0160c2.f35345a.b(c0160c2.f35348d);
                    C0160c.this.f35345a.a(bVar);
                    c.this.f35326j.a(c.this.V, bVar, C0160c.this.f35345a);
                    q0.a("RewardMVVideoAdapter", "Campaign 下载成功： 大模板预加载失败 onVideoLoadFail");
                }
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.h
        public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar) {
            c.this.O = false;
            if (c.this.f35326j == null || c.this.L == null) {
                return;
            }
            c.this.L.post(new RunnableC0162c(copyOnWriteArrayList, bVar));
        }
    }

    public void a(int i10, String str) {
        this.J = i10;
        this.K = str;
    }

    public void c(List<CampaignEx> list) {
        this.X = list;
    }

    public boolean a(CampaignEx campaignEx, boolean z10, com.mbridge.msdk.foundation.error.b bVar, int i10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        c cVar2;
        com.mbridge.msdk.foundation.same.report.metrics.c cVar3;
        com.mbridge.msdk.foundation.cache.c cVar4;
        com.mbridge.msdk.foundation.cache.c cVar5 = new com.mbridge.msdk.foundation.cache.c();
        com.mbridge.msdk.reward.candidate.a aVar = new com.mbridge.msdk.reward.candidate.a(this.f35318b, this.f35333r);
        boolean z11 = false;
        if (aVar.a(this.C)) {
            return false;
        }
        if (!this.T) {
            this.T = true;
            cVar2 = this;
            cVar5 = aVar.a(this.C, cVar, campaignEx, bVar, i10, cVar2);
            cVar3 = cVar;
            if (cVar5 != null && cVar5.g() > com.mbridge.msdk.foundation.cache.c.f33373i) {
                if (cVar5.c() != null && cVar5.c().size() > 0) {
                    cVar2.a(cVar5.c(), true, true, true);
                } else if (cVar5.g() == com.mbridge.msdk.foundation.cache.c.f33375k && bVar != null) {
                    bVar.a(com.mbridge.msdk.foundation.error.a.b(880038));
                    bVar.d(cVar5.e());
                }
            }
            cVar4 = cVar5;
            aVar.a(cVar3, cVar2.C, cVar4, (List<com.mbridge.msdk.foundation.cache.a.b>) null, (JSONObject) null, 3);
            return z11;
        }
        cVar2 = this;
        cVar3 = cVar;
        cVar5.d("isCandidate:false");
        cVar5.a(com.mbridge.msdk.foundation.cache.c.f33375k);
        cVar4 = cVar5;
        z11 = true;
        aVar.a(cVar3, cVar2.C, cVar4, (List<com.mbridge.msdk.foundation.cache.a.b>) null, (JSONObject) null, 3);
        return z11;
    }

    public void b(String str, boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        String strT;
        boolean zA;
        try {
            if (this.f35317a == null) {
                com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null");
                if (cVar != null) {
                    cVar.a(bVarA);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null", cVar);
                return;
            }
            if (a1.a(this.f35318b)) {
                com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null");
                if (cVar != null) {
                    cVar.a(bVarA2);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null", cVar);
                return;
            }
            if (this.l == null) {
                com.mbridge.msdk.foundation.error.b bVarA3 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null");
                if (cVar != null) {
                    cVar.a(bVarA3);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null", cVar);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                if (System.currentTimeMillis() - this.B < this.l.p() * 1000) {
                    com.mbridge.msdk.foundation.error.b bVarA4 = com.mbridge.msdk.foundation.error.a.a(880018, "errorCode: 3507 errorMessage: data load failed, errorMsg is EXCEPTION_RETURN_EMPTY");
                    if (cVar != null) {
                        cVar.a(bVarA4);
                        cVar.b(true);
                    }
                    b("errorCode: 3507 errorMessage: data load failed, errorMsg is EXCEPTION_RETURN_EMPTY", cVar);
                    return;
                }
            }
            if (cVar == null) {
                strT = "";
            } else {
                strT = cVar.t();
            }
            com.mbridge.msdk.foundation.same.net.wrapper.e eVarA = new com.mbridge.msdk.reward.adapter.e(this.f35319c, this.f35318b, this.f35333r, this.l, strT).a(this.f35323g, this.f35324h, this.f35320d, i(), e(), this.f35336u, str, z10, this.f35337v);
            if (eVarA == null) {
                com.mbridge.msdk.foundation.error.b bVarA5 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Load param is null");
                if (cVar != null) {
                    cVar.a(bVarA5);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is Load param is null", cVar);
                return;
            }
            if (this.J != 0) {
                eVarA.a("r_index", this.J + "");
            }
            if (!TextUtils.isEmpty(this.K)) {
                eVarA.a("invalid_ad_ids", this.K);
            }
            this.N = System.currentTimeMillis();
            com.mbridge.msdk.reward.request.b bVar = new com.mbridge.msdk.reward.request.b(this.f35317a);
            b bVar2 = new b(cVar);
            bVar2.a(str);
            bVar2.setUnitId(this.f35318b);
            bVar2.setPlacementId(this.f35319c);
            bVar2.setAdType(this.f35333r ? 287 : 94);
            bVar2.a(cVar);
            try {
                zA = com.mbridge.msdk.videocommon.download.j.a().a(this.f35333r ? 287 : 94);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardMVVideoAdapter", "isRewardVideoRefactorForCampaignRequest exception " + e10.getMessage());
                }
                zA = false;
            }
            boolean z11 = zA;
            try {
                if (com.mbridge.msdk.foundation.same.net.utils.c.b().a(eVarA) == null) {
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a("hst", k());
                    if (this.J != 0) {
                        eVar.a("r_index", this.J + "");
                    }
                    cVar.a("2000125", eVar);
                    com.mbridge.msdk.reward.report.metrics.a.a().a("2000125", cVar);
                }
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    e11.printStackTrace();
                }
            }
            if (z11) {
                bVar.getCampaign(1, str, eVarA, bVar2, com.mbridge.msdk.foundation.same.c.a(this.f35322f * 1000, 30000L));
            } else {
                bVar.choiceV3OrV5BySetting(1, eVarA, bVar2, str, com.mbridge.msdk.foundation.same.c.a(this.f35322f * 1000, 30000L));
            }
        } catch (Exception e12) {
            e12.printStackTrace();
            b("Load exception", cVar);
            n();
        }
    }

    public void a(com.mbridge.msdk.videocommon.setting.c cVar) {
        try {
            this.l = cVar;
            if (cVar == null || cVar.o() * 1000 == com.mbridge.msdk.foundation.same.a.L) {
                return;
            }
            com.mbridge.msdk.foundation.same.a.L = this.l.o() * 1000;
        } catch (Throwable th2) {
            q0.b("RewardMVVideoAdapter", th2.getMessage(), th2);
        }
    }

    public boolean a(List<CampaignEx> list, boolean z10, int i10, boolean z11) {
        return a(list, z10, i10, false, z11);
    }

    public boolean a(List<CampaignEx> list, boolean z10, int i10) {
        return a(list, z10, i10, false, false);
    }

    public boolean a(List<CampaignEx> list, boolean z10) {
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null && com.mbridge.msdk.videocommon.download.b.getInstance().a(94, this.f35318b, list)) {
                if (z10) {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                        if (campaignEx.getRsIgnoreCheckRule().contains(3)) {
                            q0.c("RewardMVVideoAdapter", "Is not check big template download status");
                            return true;
                        }
                        if (campaignEx.getCMPTEntryUrl().equals(campaignEx.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                            q0.c("RewardMVVideoAdapter", "Is not check big template ENDCARD download status");
                            return true;
                        }
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.f35318b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl())) {
                        q0.a("RewardVideoController", "大模板业务，开始检查大模板预加载情况，大模板预加载成功");
                        return true;
                    }
                } else {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
                        q0.c("RewardMVVideoAdapter", "Is not check template download status");
                        return true;
                    }
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                        if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.f35318b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j())) {
                            q0.a("RewardVideoController", "非大模板业务，存在播放模板，播放模板预加载成功");
                            return true;
                        }
                    } else {
                        q0.a("RewardVideoController", "非大模板 没有 template");
                        return true;
                    }
                }
            }
        } else {
            q0.a("RewardVideoController", "数据为空");
        }
        return false;
    }

    public boolean a(List<CampaignEx> list, boolean z10, int i10, boolean z11, boolean z12) {
        boolean z13;
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            cVar.i(campaignEx.getCurrentLocalRid());
            z13 = false;
            boolean zA = com.mbridge.msdk.videocommon.download.b.getInstance().a(94, this.f35318b, this.f35334s, list.size(), z10, i10, list, z11, eVar);
            eVar.a("event_name", "is_ready_crwtpl_" + zA);
            if (zA) {
                if (z10) {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                        if (campaignEx.getRsIgnoreCheckRule().contains(3)) {
                            q0.c("RewardMVVideoAdapter", "Is not check big template download status");
                            return true;
                        }
                        if (campaignEx.getCMPTEntryUrl().equals(campaignEx.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                            q0.c("RewardMVVideoAdapter", "Is not check big template of ENDCARD download status");
                            return true;
                        }
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.f35318b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl())) {
                        return true;
                    }
                    if (z12) {
                        eVar.a("event_name", "is_ready_crwtpl_" + zA);
                        eVar.a("reason", "h5 big template checkPreLoadState error");
                        eVar.a("type", 5);
                        a(cVar, eVar, list);
                    }
                } else {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
                        q0.c("RewardMVVideoAdapter", "Is not check template download status");
                        return true;
                    }
                    if (campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                        return true;
                    }
                    String str = this.f35318b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j();
                    if (z12) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(str, true);
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(str)) {
                        return true;
                    }
                    if (z12) {
                        eVar.a("event_name", "is_ready_crwtpl_" + zA);
                        eVar.a("reason", "h5 template checkPreLoadState error");
                        eVar.a("type", 5);
                        a(cVar, eVar, list);
                    }
                }
            }
        } else {
            z13 = false;
            eVar.a("event_name", "is_ready_crwtpl_empty");
            eVar.a("reason", "campaign list is empty error");
            eVar.a("type", 8);
        }
        a(cVar, eVar, list);
        return z13;
    }

    private void b(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.L != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 18;
            if (cVar != null) {
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", cVar.t());
                messageObtain.setData(bundle);
            }
            this.L.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.L != null) {
            if (TextUtils.isEmpty(str)) {
                str = "load fail exception";
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 4;
            messageObtain.obj = str;
            if (cVar != null) {
                cVar.b(true);
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", cVar.t());
                messageObtain.setData(bundle);
            }
            if (str.contains("exception")) {
                this.L.sendMessageAtFrontOfQueue(messageObtain);
            } else {
                this.L.sendMessage(messageObtain);
            }
        }
    }

    public void a(com.mbridge.msdk.video.bt.module.orglistener.h hVar, String str, String str2, int i10, String str3, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        boolean z10;
        try {
            this.f35325i = hVar;
            if (this.f35317a != null && !a1.a(this.f35318b)) {
                Intent intent = new Intent(this.f35317a, (Class<?>) MBRewardVideoActivity.class);
                intent.putExtra(MBridgeConstans.UNIT_ID, this.f35318b);
                intent.putExtra(MBridgeConstans.PLACEMENT_ID, this.f35319c);
                intent.putExtra(MBridgeConstans.REWARD_ID, str);
                intent.putExtra(MBridgeConstans.MUTE_STATE, i10);
                intent.putExtra(MBridgeConstans.IS_IV, this.f35333r);
                intent.putExtra(MBridgeConstans.IS_BID, this.f35334s);
                intent.putExtra(MBridgeConstans.EXTRA_DATA, str3);
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.f35318b);
                if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                    CampaignEx campaignEx = copyOnWriteArrayListB.get(0);
                    z10 = true;
                    if (copyOnWriteArrayListB.size() == 1 && !com.mbridge.msdk.foundation.same.c.a(this.f35317a, campaignEx) && campaignEx.getFilterAdsShowCallState() == 1) {
                        com.mbridge.msdk.videocommon.cache.a.a().b(this.f35318b, campaignEx);
                        com.mbridge.msdk.video.bt.module.orglistener.h hVar2 = this.f35325i;
                        if (hVar2 != null) {
                            hVar2.a(cVar, "show_campaign_filtered");
                            return;
                        }
                    }
                    if (campaignEx != null) {
                        this.H = campaignEx.getRequestId();
                    }
                    if (campaignEx == null || TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                        z10 = false;
                    }
                    a();
                } else {
                    com.mbridge.msdk.video.bt.module.orglistener.h hVar3 = this.f35325i;
                    if (hVar3 != null) {
                        hVar3.a(cVar, "load failed");
                        return;
                    }
                    z10 = false;
                }
                intent.putExtra(MBridgeConstans.IS_BIG_OFFER, z10);
                if (this.f35333r) {
                    intent.putExtra(MBridgeConstans.IV_REWARD_MODE_TYPE, this.f35337v);
                    intent.putExtra(MBridgeConstans.IV_REWARD_VALUE_TYPE, this.f35338w);
                    intent.putExtra(MBridgeConstans.IV_REWARD_VALUE, this.f35339x);
                }
                if (!TextUtils.isEmpty(str2)) {
                    intent.putExtra(MBridgeConstans.USER_ID, str2);
                }
                RewardUnitCacheManager.getInstance().add(this.f35319c, this.f35318b, this.l);
                try {
                    if (s0.a().a("a_u_a_c_f_s", false) && com.mbridge.msdk.foundation.controller.c.n() != null && com.mbridge.msdk.foundation.controller.c.n().f() != null) {
                        Activity activity = (Activity) com.mbridge.msdk.foundation.controller.c.n().f();
                        q0.c("RewardMVVideoAdapter", activity.getClass().getSimpleName().concat(" start MBRewardVideoActivity"));
                        activity.startActivity(intent);
                        return;
                    }
                } catch (Throwable th2) {
                    q0.b("RewardMVVideoAdapter", th2.getMessage());
                }
                intent.addFlags(268435456);
                this.f35317a.startActivity(intent);
                return;
            }
            com.mbridge.msdk.video.bt.module.orglistener.h hVar4 = this.f35325i;
            if (hVar4 != null) {
                hVar4.a(cVar, "context or unitid is null");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            com.mbridge.msdk.video.bt.module.orglistener.h hVar5 = this.f35325i;
            if (hVar5 != null) {
                hVar5.a(cVar, "show failed, exception is " + e10.getMessage());
            }
        }
    }

    private void b() {
        if (com.mbridge.msdk.videocommon.cache.a.a() != null) {
            try {
                com.mbridge.msdk.setting.g gVarF = com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
                if (gVarF == null) {
                    gVarF = com.mbridge.msdk.setting.i.b().a();
                }
                com.mbridge.msdk.videocommon.cache.a.a().a(gVarF.d0() * 1000, this.f35318b);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c9 A[Catch: all -> 0x0024, Exception -> 0x0027, TryCatch #2 {all -> 0x0024, blocks: (B:8:0x001c, B:10:0x0020, B:16:0x002c, B:18:0x0032, B:20:0x003c, B:22:0x0049, B:24:0x0053, B:25:0x0058, B:27:0x005e, B:28:0x006f, B:30:0x0075, B:31:0x007d, B:33:0x0082, B:37:0x008d, B:39:0x0099, B:41:0x00a7, B:77:0x0168, B:79:0x0177, B:81:0x017d, B:83:0x0183, B:126:0x0229, B:85:0x018c, B:86:0x018f, B:76:0x0165, B:45:0x00b4, B:48:0x00bf, B:87:0x0190, B:89:0x0198, B:91:0x019e, B:93:0x01a8, B:98:0x01bd, B:99:0x01c2, B:101:0x01c9, B:103:0x01cf, B:107:0x01de, B:108:0x01e1, B:110:0x01e9, B:117:0x0216, B:111:0x01ed, B:113:0x01f6, B:115:0x01fc, B:116:0x020b, B:96:0x01b3), top: B:144:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:105:0x01db  */
    /* JADX WARN: Code duplicated, block: B:106:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e9 A[Catch: all -> 0x0024, Exception -> 0x0027, TryCatch #2 {all -> 0x0024, blocks: (B:8:0x001c, B:10:0x0020, B:16:0x002c, B:18:0x0032, B:20:0x003c, B:22:0x0049, B:24:0x0053, B:25:0x0058, B:27:0x005e, B:28:0x006f, B:30:0x0075, B:31:0x007d, B:33:0x0082, B:37:0x008d, B:39:0x0099, B:41:0x00a7, B:77:0x0168, B:79:0x0177, B:81:0x017d, B:83:0x0183, B:126:0x0229, B:85:0x018c, B:86:0x018f, B:76:0x0165, B:45:0x00b4, B:48:0x00bf, B:87:0x0190, B:89:0x0198, B:91:0x019e, B:93:0x01a8, B:98:0x01bd, B:99:0x01c2, B:101:0x01c9, B:103:0x01cf, B:107:0x01de, B:108:0x01e1, B:110:0x01e9, B:117:0x0216, B:111:0x01ed, B:113:0x01f6, B:115:0x01fc, B:116:0x020b, B:96:0x01b3), top: B:144:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:111:0x01ed A[Catch: all -> 0x0024, Exception -> 0x0027, TryCatch #2 {all -> 0x0024, blocks: (B:8:0x001c, B:10:0x0020, B:16:0x002c, B:18:0x0032, B:20:0x003c, B:22:0x0049, B:24:0x0053, B:25:0x0058, B:27:0x005e, B:28:0x006f, B:30:0x0075, B:31:0x007d, B:33:0x0082, B:37:0x008d, B:39:0x0099, B:41:0x00a7, B:77:0x0168, B:79:0x0177, B:81:0x017d, B:83:0x0183, B:126:0x0229, B:85:0x018c, B:86:0x018f, B:76:0x0165, B:45:0x00b4, B:48:0x00bf, B:87:0x0190, B:89:0x0198, B:91:0x019e, B:93:0x01a8, B:98:0x01bd, B:99:0x01c2, B:101:0x01c9, B:103:0x01cf, B:107:0x01de, B:108:0x01e1, B:110:0x01e9, B:117:0x0216, B:111:0x01ed, B:113:0x01f6, B:115:0x01fc, B:116:0x020b, B:96:0x01b3), top: B:144:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01f6 A[Catch: all -> 0x0024, Exception -> 0x0027, TryCatch #2 {all -> 0x0024, blocks: (B:8:0x001c, B:10:0x0020, B:16:0x002c, B:18:0x0032, B:20:0x003c, B:22:0x0049, B:24:0x0053, B:25:0x0058, B:27:0x005e, B:28:0x006f, B:30:0x0075, B:31:0x007d, B:33:0x0082, B:37:0x008d, B:39:0x0099, B:41:0x00a7, B:77:0x0168, B:79:0x0177, B:81:0x017d, B:83:0x0183, B:126:0x0229, B:85:0x018c, B:86:0x018f, B:76:0x0165, B:45:0x00b4, B:48:0x00bf, B:87:0x0190, B:89:0x0198, B:91:0x019e, B:93:0x01a8, B:98:0x01bd, B:99:0x01c2, B:101:0x01c9, B:103:0x01cf, B:107:0x01de, B:108:0x01e1, B:110:0x01e9, B:117:0x0216, B:111:0x01ed, B:113:0x01f6, B:115:0x01fc, B:116:0x020b, B:96:0x01b3), top: B:144:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:116:0x020b A[Catch: all -> 0x0024, Exception -> 0x0027, TryCatch #2 {all -> 0x0024, blocks: (B:8:0x001c, B:10:0x0020, B:16:0x002c, B:18:0x0032, B:20:0x003c, B:22:0x0049, B:24:0x0053, B:25:0x0058, B:27:0x005e, B:28:0x006f, B:30:0x0075, B:31:0x007d, B:33:0x0082, B:37:0x008d, B:39:0x0099, B:41:0x00a7, B:77:0x0168, B:79:0x0177, B:81:0x017d, B:83:0x0183, B:126:0x0229, B:85:0x018c, B:86:0x018f, B:76:0x0165, B:45:0x00b4, B:48:0x00bf, B:87:0x0190, B:89:0x0198, B:91:0x019e, B:93:0x01a8, B:98:0x01bd, B:99:0x01c2, B:101:0x01c9, B:103:0x01cf, B:107:0x01de, B:108:0x01e1, B:110:0x01e9, B:117:0x0216, B:111:0x01ed, B:113:0x01f6, B:115:0x01fc, B:116:0x020b, B:96:0x01b3), top: B:144:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0237 A[PHI: r14
  0x0237: PHI (r14v4 'e' java.io.IOException) = (r14v7 'e' java.io.IOException), (r14v8 'e' java.io.IOException) binds: [B:132:0x0235, B:124:0x0226] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:164:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0190 A[Catch: all -> 0x0024, Exception -> 0x0027, PHI: r4
  0x0190: PHI (r4v6 java.io.FileOutputStream) = (r4v5 java.io.FileOutputStream), (r4v10 java.io.FileOutputStream) binds: [B:38:0x0097, B:82:0x0181] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x0024, blocks: (B:8:0x001c, B:10:0x0020, B:16:0x002c, B:18:0x0032, B:20:0x003c, B:22:0x0049, B:24:0x0053, B:25:0x0058, B:27:0x005e, B:28:0x006f, B:30:0x0075, B:31:0x007d, B:33:0x0082, B:37:0x008d, B:39:0x0099, B:41:0x00a7, B:77:0x0168, B:79:0x0177, B:81:0x017d, B:83:0x0183, B:126:0x0229, B:85:0x018c, B:86:0x018f, B:76:0x0165, B:45:0x00b4, B:48:0x00bf, B:87:0x0190, B:89:0x0198, B:91:0x019e, B:93:0x01a8, B:98:0x01bd, B:99:0x01c2, B:101:0x01c9, B:103:0x01cf, B:107:0x01de, B:108:0x01e1, B:110:0x01e9, B:117:0x0216, B:111:0x01ed, B:113:0x01f6, B:115:0x01fc, B:116:0x020b, B:96:0x01b3), top: B:144:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0198 A[Catch: all -> 0x0024, Exception -> 0x0027, TryCatch #2 {all -> 0x0024, blocks: (B:8:0x001c, B:10:0x0020, B:16:0x002c, B:18:0x0032, B:20:0x003c, B:22:0x0049, B:24:0x0053, B:25:0x0058, B:27:0x005e, B:28:0x006f, B:30:0x0075, B:31:0x007d, B:33:0x0082, B:37:0x008d, B:39:0x0099, B:41:0x00a7, B:77:0x0168, B:79:0x0177, B:81:0x017d, B:83:0x0183, B:126:0x0229, B:85:0x018c, B:86:0x018f, B:76:0x0165, B:45:0x00b4, B:48:0x00bf, B:87:0x0190, B:89:0x0198, B:91:0x019e, B:93:0x01a8, B:98:0x01bd, B:99:0x01c2, B:101:0x01c9, B:103:0x01cf, B:107:0x01de, B:108:0x01e1, B:110:0x01e9, B:117:0x0216, B:111:0x01ed, B:113:0x01f6, B:115:0x01fc, B:116:0x020b, B:96:0x01b3), top: B:144:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:91:0x019e A[Catch: all -> 0x0024, Exception -> 0x0027, TryCatch #2 {all -> 0x0024, blocks: (B:8:0x001c, B:10:0x0020, B:16:0x002c, B:18:0x0032, B:20:0x003c, B:22:0x0049, B:24:0x0053, B:25:0x0058, B:27:0x005e, B:28:0x006f, B:30:0x0075, B:31:0x007d, B:33:0x0082, B:37:0x008d, B:39:0x0099, B:41:0x00a7, B:77:0x0168, B:79:0x0177, B:81:0x017d, B:83:0x0183, B:126:0x0229, B:85:0x018c, B:86:0x018f, B:76:0x0165, B:45:0x00b4, B:48:0x00bf, B:87:0x0190, B:89:0x0198, B:91:0x019e, B:93:0x01a8, B:98:0x01bd, B:99:0x01c2, B:101:0x01c9, B:103:0x01cf, B:107:0x01de, B:108:0x01e1, B:110:0x01e9, B:117:0x0216, B:111:0x01ed, B:113:0x01f6, B:115:0x01fc, B:116:0x020b, B:96:0x01b3), top: B:144:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01b3 A[Catch: all -> 0x0024, Exception -> 0x0027, TryCatch #2 {all -> 0x0024, blocks: (B:8:0x001c, B:10:0x0020, B:16:0x002c, B:18:0x0032, B:20:0x003c, B:22:0x0049, B:24:0x0053, B:25:0x0058, B:27:0x005e, B:28:0x006f, B:30:0x0075, B:31:0x007d, B:33:0x0082, B:37:0x008d, B:39:0x0099, B:41:0x00a7, B:77:0x0168, B:79:0x0177, B:81:0x017d, B:83:0x0183, B:126:0x0229, B:85:0x018c, B:86:0x018f, B:76:0x0165, B:45:0x00b4, B:48:0x00bf, B:87:0x0190, B:89:0x0198, B:91:0x019e, B:93:0x01a8, B:98:0x01bd, B:99:0x01c2, B:101:0x01c9, B:103:0x01cf, B:107:0x01de, B:108:0x01e1, B:110:0x01e9, B:117:0x0216, B:111:0x01ed, B:113:0x01f6, B:115:0x01fc, B:116:0x020b, B:96:0x01b3), top: B:144:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01bd A[Catch: all -> 0x0024, Exception -> 0x0027, TryCatch #2 {all -> 0x0024, blocks: (B:8:0x001c, B:10:0x0020, B:16:0x002c, B:18:0x0032, B:20:0x003c, B:22:0x0049, B:24:0x0053, B:25:0x0058, B:27:0x005e, B:28:0x006f, B:30:0x0075, B:31:0x007d, B:33:0x0082, B:37:0x008d, B:39:0x0099, B:41:0x00a7, B:77:0x0168, B:79:0x0177, B:81:0x017d, B:83:0x0183, B:126:0x0229, B:85:0x018c, B:86:0x018f, B:76:0x0165, B:45:0x00b4, B:48:0x00bf, B:87:0x0190, B:89:0x0198, B:91:0x019e, B:93:0x01a8, B:98:0x01bd, B:99:0x01c2, B:101:0x01c9, B:103:0x01cf, B:107:0x01de, B:108:0x01e1, B:110:0x01e9, B:117:0x0216, B:111:0x01ed, B:113:0x01f6, B:115:0x01fc, B:116:0x020b, B:96:0x01b3), top: B:144:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01c2 A[Catch: all -> 0x0024, Exception -> 0x0027, TryCatch #2 {all -> 0x0024, blocks: (B:8:0x001c, B:10:0x0020, B:16:0x002c, B:18:0x0032, B:20:0x003c, B:22:0x0049, B:24:0x0053, B:25:0x0058, B:27:0x005e, B:28:0x006f, B:30:0x0075, B:31:0x007d, B:33:0x0082, B:37:0x008d, B:39:0x0099, B:41:0x00a7, B:77:0x0168, B:79:0x0177, B:81:0x017d, B:83:0x0183, B:126:0x0229, B:85:0x018c, B:86:0x018f, B:76:0x0165, B:45:0x00b4, B:48:0x00bf, B:87:0x0190, B:89:0x0198, B:91:0x019e, B:93:0x01a8, B:98:0x01bd, B:99:0x01c2, B:101:0x01c9, B:103:0x01cf, B:107:0x01de, B:108:0x01e1, B:110:0x01e9, B:117:0x0216, B:111:0x01ed, B:113:0x01f6, B:115:0x01fc, B:116:0x020b, B:96:0x01b3), top: B:144:0x001c }] */
    private com.mbridge.msdk.reward.adapter.d b(CampaignUnit campaignUnit) throws Throwable {
        FileOutputStream fileOutputStream;
        IOException e10;
        com.mbridge.msdk.foundation.same.report.metrics.c metricsData;
        int i10;
        String str;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        com.mbridge.msdk.reward.adapter.d dVar = new com.mbridge.msdk.reward.adapter.d();
        dVar.a(copyOnWriteArrayList);
        if (!MBridgeConstans.DEBUG || !com.mbridge.msdk.util.e.f37108a) {
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    com.mbridge.msdk.videocommon.setting.c cVar = this.l;
                    if (cVar != null) {
                        cVar.b();
                    }
                    if (campaignUnit != null && campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
                        ArrayList<CampaignEx> ads = campaignUnit.getAds();
                        this.V = ads;
                        if (campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
                            metricsData = null;
                        } else {
                            ArrayList<CampaignEx> ads2 = campaignUnit.getAds();
                            for (int i11 = 0; i11 < ads2.size(); i11++) {
                                CampaignEx campaignEx = ads2.get(i11);
                                campaignEx.setCampaignUnitId(this.f35318b);
                                ads2.set(i11, campaignEx);
                            }
                            metricsData = campaignUnit.getMetricsData();
                            if (metricsData == null) {
                                metricsData = new com.mbridge.msdk.foundation.same.report.metrics.c();
                                campaignUnit.setMetricsData(metricsData);
                            }
                            metricsData.b(ads2);
                        }
                        for (int i12 = 0; i12 < ads.size() && i12 < Integer.MAX_VALUE; i12++) {
                            CampaignEx campaignEx2 = ads.get(i12);
                            if (campaignEx2.isMraid()) {
                                if (TextUtils.isEmpty(campaignEx2.getMraid().trim())) {
                                    continue;
                                } else {
                                    if (campaignEx2.getAdType() == 287) {
                                        str = "3";
                                    } else if (campaignEx2.getAdType() == 94) {
                                        str = "1";
                                    } else {
                                        str = campaignEx2.getAdType() == 42 ? "2" : "";
                                    }
                                    try {
                                        try {
                                            com.mbridge.msdk.foundation.same.report.g.a("m_download_start", campaignEx2, "", this.f35318b, str);
                                            String strB = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML);
                                            String md5 = SameMD5.getMD5(campaignEx2.getMraid());
                                            if (TextUtils.isEmpty(md5)) {
                                                md5 = String.valueOf(System.currentTimeMillis());
                                            }
                                            File file = new File(strB, md5.concat(".html"));
                                            fileOutputStream = new FileOutputStream(file);
                                            try {
                                                fileOutputStream.write(("<script>" + com.mbridge.msdk.setting.util.a.a().b() + "</script>" + campaignEx2.getMraid()).getBytes());
                                                fileOutputStream.flush();
                                                campaignEx2.setMraid(file.getAbsolutePath());
                                                com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx2, "", this.f35318b, str);
                                                try {
                                                    fileOutputStream.close();
                                                    fileOutputStream2 = fileOutputStream;
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    fileOutputStream2 = fileOutputStream;
                                                    e.printStackTrace();
                                                    if (fileOutputStream2 != null) {
                                                        try {
                                                            fileOutputStream2.close();
                                                        } catch (IOException e12) {
                                                            e10 = e12;
                                                            if (MBridgeConstans.DEBUG) {
                                                                q0.b("RewardMVVideoAdapter", e10.getMessage());
                                                            }
                                                        }
                                                    }
                                                    return dVar;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    if (fileOutputStream != null) {
                                                        try {
                                                            fileOutputStream.close();
                                                        } catch (IOException e13) {
                                                            if (MBridgeConstans.DEBUG) {
                                                                q0.b("RewardMVVideoAdapter", e13.getMessage());
                                                            }
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } catch (Exception e14) {
                                                e = e14;
                                                fileOutputStream2 = fileOutputStream;
                                                e.printStackTrace();
                                                campaignEx2.setMraid("");
                                                com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx2, e.getMessage(), this.f35318b, str);
                                                if (fileOutputStream2 != null) {
                                                    fileOutputStream2.close();
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                fileOutputStream2 = fileOutputStream;
                                                if (fileOutputStream2 != null) {
                                                    fileOutputStream2.close();
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    } catch (Exception e15) {
                                        e = e15;
                                    }
                                    File file2 = new File(campaignEx2.getMraid());
                                    if (!file2.exists() || !file2.isFile() || !file2.canRead()) {
                                        b("mraid resource write fail", metricsData);
                                    } else if (campaignEx2.getOfferType() == 99) {
                                        if (b(campaignEx2)) {
                                            if (!a1.a(campaignEx2.getendcard_url())) {
                                            }
                                            if (com.mbridge.msdk.util.b.a()) {
                                                if (v0.c(this.f35317a, campaignEx2.getPackageName())) {
                                                    i10 = 1;
                                                } else {
                                                    i10 = 2;
                                                }
                                                campaignEx2.setRtinsType(i10);
                                            }
                                            if (com.mbridge.msdk.foundation.same.c.a(this.f35317a, campaignEx2)) {
                                                copyOnWriteArrayList.add(campaignEx2);
                                            } else {
                                                dVar.a(true);
                                                if (ads.size() != 1) {
                                                    v0.a(this.f35318b, campaignEx2, com.mbridge.msdk.foundation.same.a.f33737x);
                                                    this.U = "APP ALREADY INSTALLED";
                                                } else {
                                                    v0.a(this.f35318b, campaignEx2, com.mbridge.msdk.foundation.same.a.f33737x);
                                                    this.U = "APP ALREADY INSTALLED";
                                                }
                                            }
                                            a(campaignEx2, metricsData);
                                        } else if (a1.a(campaignEx2.getVideoUrlEncode())) {
                                            this.U = "No video campaign";
                                        } else {
                                            if (com.mbridge.msdk.util.b.a()) {
                                                if (v0.c(this.f35317a, campaignEx2.getPackageName())) {
                                                    i10 = 1;
                                                } else {
                                                    i10 = 2;
                                                }
                                                campaignEx2.setRtinsType(i10);
                                            }
                                            if (com.mbridge.msdk.foundation.same.c.a(this.f35317a, campaignEx2)) {
                                                copyOnWriteArrayList.add(campaignEx2);
                                            } else {
                                                dVar.a(true);
                                                if (ads.size() != 1) {
                                                    v0.a(this.f35318b, campaignEx2, com.mbridge.msdk.foundation.same.a.f33737x);
                                                    this.U = "APP ALREADY INSTALLED";
                                                } else {
                                                    v0.a(this.f35318b, campaignEx2, com.mbridge.msdk.foundation.same.a.f33737x);
                                                    this.U = "APP ALREADY INSTALLED";
                                                }
                                            }
                                            a(campaignEx2, metricsData);
                                        }
                                    }
                                }
                            } else if (campaignEx2.getOfferType() == 99) {
                                if (b(campaignEx2)) {
                                    if (!a1.a(campaignEx2.getendcard_url()) && TextUtils.isEmpty(campaignEx2.getMraid())) {
                                        this.U = "No video campaign";
                                    } else {
                                        if (com.mbridge.msdk.util.b.a() && v0.c(campaignEx2)) {
                                            if (v0.c(this.f35317a, campaignEx2.getPackageName())) {
                                                i10 = 1;
                                            } else {
                                                i10 = 2;
                                            }
                                            campaignEx2.setRtinsType(i10);
                                        }
                                        if (com.mbridge.msdk.foundation.same.c.a(this.f35317a, campaignEx2)) {
                                            copyOnWriteArrayList.add(campaignEx2);
                                        } else {
                                            dVar.a(true);
                                            if (ads.size() != 1 && campaignEx2.getFilterCallBackState() == 1) {
                                                dVar.a(campaignEx2);
                                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                                                copyOnWriteArrayList2.add(campaignEx2);
                                                dVar.a(copyOnWriteArrayList2);
                                            } else {
                                                v0.a(this.f35318b, campaignEx2, com.mbridge.msdk.foundation.same.a.f33737x);
                                                this.U = "APP ALREADY INSTALLED";
                                            }
                                        }
                                        a(campaignEx2, metricsData);
                                    }
                                } else if (a1.a(campaignEx2.getVideoUrlEncode())) {
                                    this.U = "No video campaign";
                                } else {
                                    if (com.mbridge.msdk.util.b.a()) {
                                        if (v0.c(this.f35317a, campaignEx2.getPackageName())) {
                                            i10 = 1;
                                        } else {
                                            i10 = 2;
                                        }
                                        campaignEx2.setRtinsType(i10);
                                    }
                                    if (com.mbridge.msdk.foundation.same.c.a(this.f35317a, campaignEx2)) {
                                        copyOnWriteArrayList.add(campaignEx2);
                                    } else {
                                        dVar.a(true);
                                        if (ads.size() != 1) {
                                            v0.a(this.f35318b, campaignEx2, com.mbridge.msdk.foundation.same.a.f33737x);
                                            this.U = "APP ALREADY INSTALLED";
                                        } else {
                                            v0.a(this.f35318b, campaignEx2, com.mbridge.msdk.foundation.same.a.f33737x);
                                            this.U = "APP ALREADY INSTALLED";
                                        }
                                    }
                                    a(campaignEx2, metricsData);
                                }
                            }
                        }
                    }
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e16) {
                            e10 = e16;
                            if (MBridgeConstans.DEBUG) {
                                q0.b("RewardMVVideoAdapter", e10.getMessage());
                            }
                        }
                    }
                } catch (Exception e17) {
                    e = e17;
                }
            } catch (Throwable th5) {
                th = th5;
                fileOutputStream = null;
            }
        }
        return dVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006e A[EDGE_INSN: B:24:0x006e->B:25:0x0071 BREAK  A[LOOP:0: B:16:0x004d->B:39:0x004d]] */
    private void a() {
        String strD;
        String strB;
        List<com.mbridge.msdk.foundation.entity.d> listA = com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f35318b, this.H);
        if (listA != null) {
            int size = listA.size();
            String strD2 = com.mbridge.msdk.foundation.same.buffer.b.d(this.f35318b);
            if (size == 0) {
                return;
            }
            try {
                if (size == 1) {
                    if (listA.get(0) != null) {
                        strD = listA.get(0).d();
                        strB = listA.get(0).b();
                    } else {
                        strB = "";
                        strD = "";
                        break;
                    }
                } else if (!TextUtils.isEmpty(strD2)) {
                    Iterator<com.mbridge.msdk.foundation.entity.d> it = listA.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            com.mbridge.msdk.foundation.entity.d next = it.next();
                            if (next != null && strD2.equals(next.a())) {
                                strD = next.d();
                                strB = next.b();
                                break;
                            }
                        } else {
                            strB = "";
                            strD = "";
                            break;
                        }
                    }
                } else {
                    strB = "";
                    strD = "";
                    break;
                }
                if (TextUtils.isEmpty(strD) || !strD.equals(this.H)) {
                    return;
                }
                com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).b(strD2, this.f35318b);
                com.mbridge.msdk.foundation.same.buffer.b.a(this.f35318b, this.H, strB);
                com.mbridge.msdk.foundation.same.buffer.b.e(this.f35318b);
            } catch (Exception e10) {
                q0.a("RewardMVVideoAdapter", e10.getMessage());
            }
        }
    }

    public void a(int i10, int i11, boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        a(i10, i11, z10, "", this.A, cVar);
    }

    public void a(int i10, int i11, boolean z10, String str, boolean z11, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        CampaignEx campaignEx;
        this.f35321e = i10;
        this.f35322f = i11;
        this.f35323g = z10;
        this.C = str;
        this.A = z11;
        boolean zB = false;
        this.T = false;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f35341z;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0 && (campaignEx = this.f35341z.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
            this.f35341z.clear();
        }
        List<CampaignEx> list = this.V;
        if (list != null) {
            list.clear();
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.W;
        if (copyOnWriteArrayList2 != null) {
            copyOnWriteArrayList2.clear();
        }
        this.O = false;
        this.P = false;
        synchronized (this.f35330o) {
            try {
                if (this.Q) {
                    this.Q = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.S = false;
        this.R = false;
        try {
            zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(this.f35317a);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardMVVideoAdapter", e10.getMessage());
            }
        }
        if (!zB) {
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is WebView is not available");
            if (cVar != null) {
                cVar.a(bVarA);
            }
            b("errorCode: 3507 errorMessage: data load failed, errorMsg is WebView is not available", cVar);
            return;
        }
        if (this.f35317a == null) {
            com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null");
            if (cVar != null) {
                cVar.a(bVarA2);
            }
            b("errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null", cVar);
            return;
        }
        if (a1.a(this.f35318b)) {
            com.mbridge.msdk.foundation.error.b bVarA3 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null");
            if (cVar != null) {
                cVar.a(bVarA3);
            }
            b("errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null", cVar);
            return;
        }
        if (this.l == null) {
            com.mbridge.msdk.foundation.error.b bVarA4 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null");
            if (cVar != null) {
                cVar.a(bVarA4);
            }
            b("RewardUnitSetting is null", cVar);
            return;
        }
        d();
        c();
        q0.c("RewardMVVideoAdapter", "load 开始清除过期数据");
        b();
        a(str, z11, cVar);
    }

    private void b(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    this.f35320d += list.size();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        com.mbridge.msdk.videocommon.setting.c cVar = this.l;
        if (cVar == null || this.f35320d > cVar.r()) {
            this.f35320d = 0;
        }
        if (a1.b(this.f35318b)) {
            com.mbridge.msdk.reward.controller.a.a(this.f35318b, this.f35320d);
        }
    }

    private boolean b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            return campaignEx.getPlayable_ads_without_video() == 2;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th2.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x0027 A[Catch: Exception -> 0x00ac, TryCatch #0 {Exception -> 0x00ac, blocks: (B:4:0x0004, B:6:0x000a, B:14:0x0021, B:16:0x002c, B:18:0x004a, B:20:0x0052, B:22:0x0056, B:25:0x005f, B:27:0x0078, B:26:0x006d, B:28:0x008e, B:15:0x0027), top: B:35:0x0004 }] */
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, int i10) {
        Object objA;
        if (cVar != null) {
            try {
                if (cVar.F()) {
                    return;
                }
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                if (i10 == 3 || i10 == 880023 || i10 == 880041) {
                    eVar.a("result", "2");
                } else {
                    switch (i10) {
                        case 10:
                        case 11:
                        case 12:
                            eVar.a("result", "2");
                            break;
                        default:
                            eVar.a("result", "1");
                            break;
                    }
                }
                eVar.a("timeout", this.f35322f + "");
                com.mbridge.msdk.foundation.error.b bVarU = cVar.u();
                if (bVarU != null && (objA = bVarU.a("campaign_request_error")) != null && (objA instanceof com.mbridge.msdk.foundation.same.net.exception.a)) {
                    if (((com.mbridge.msdk.foundation.same.net.exception.a) objA).f33814c != null) {
                        eVar.a("code", Integer.valueOf(((com.mbridge.msdk.foundation.same.net.exception.a) objA).f33814c.f33835d));
                    } else {
                        eVar.a("code", Integer.valueOf(bVarU.g()));
                    }
                    eVar.a("reason", bVarU.l());
                    eVar.a("err_desc", bVarU.i());
                    cVar.a((com.mbridge.msdk.foundation.error.b) null);
                }
                eVar.a("hst", k());
                eVar.a("126_exclude", 1);
                cVar.a("2000126", eVar);
                com.mbridge.msdk.reward.report.metrics.a.a().a("2000126", cVar);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    private void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.L != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 3;
            if (cVar != null) {
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", cVar.t());
                messageObtain.setData(bundle);
            }
            this.L.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.L != null) {
            if (TextUtils.isEmpty(str)) {
                str = "load fail exception";
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 4;
            messageObtain.obj = str;
            messageObtain.arg1 = i10;
            if (cVar != null) {
                cVar.b(true);
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", cVar.t());
                messageObtain.setData(bundle);
            }
            if (str.contains("exception")) {
                this.L.sendMessageAtFrontOfQueue(messageObtain);
            } else {
                this.L.sendMessage(messageObtain);
            }
        }
    }

    private void a(j jVar, CampaignEx campaignEx) {
        if (jVar == null || jVar.a(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
        gVar.a(campaignEx.getId());
        gVar.b(campaignEx.getFca());
        gVar.c(campaignEx.getFcb());
        gVar.a(0);
        gVar.d(0);
        gVar.a(System.currentTimeMillis());
        jVar.b(gVar);
    }

    private void a(String str, String str2, List<CampaignEx> list) {
        if (com.mbridge.msdk.videocommon.cache.a.a() != null) {
            com.mbridge.msdk.videocommon.cache.a.a().a(str, str2, list);
        }
    }

    public void a(com.mbridge.msdk.reward.adapter.a aVar) {
        this.f35326j = aVar;
    }

    public void a(com.mbridge.msdk.reward.controller.a.j jVar) {
        this.f35327k = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    public com.mbridge.msdk.reward.adapter.d a(CampaignUnit campaignUnit) throws Throwable {
        boolean z10;
        this.f35340y = campaignUnit;
        com.mbridge.msdk.reward.adapter.d dVarB = b(campaignUnit);
        new com.mbridge.msdk.reward.candidate.a(this.f35318b, this.f35333r).a(dVarB.b(), this.C, this, this.f35318b);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = dVarB.b();
        if (dVarB.e()) {
            if (dVarB.d() == 0) {
                copyOnWriteArrayListB.clear();
            } else if (dVarB.a()) {
                b(campaignUnit.getMetricsData());
            }
            if (dVarB.c() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = true;
        }
        a(copyOnWriteArrayListB, true, false, z10);
        return dVarB;
    }

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, boolean z10, boolean z11, boolean z12) {
        com.mbridge.msdk.foundation.same.report.metrics.c metricsData;
        try {
            if (z11) {
                this.V = copyOnWriteArrayList;
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
                this.W = copyOnWriteArrayList2;
                metricsData = a((List<CampaignEx>) copyOnWriteArrayList2);
            } else {
                metricsData = this.f35340y.getMetricsData();
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardMVVideoAdapter", e10.getMessage());
            }
            metricsData = null;
        }
        a(this.f35340y, copyOnWriteArrayList);
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            q0.c("RewardMVVideoAdapter", "onload load success size:" + copyOnWriteArrayList.size());
            if (z10) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                if (z11) {
                    eVar.a("cache", 1);
                } else {
                    eVar.a("cache", 2);
                }
                if (metricsData != null) {
                    metricsData.a("2000127", eVar);
                    metricsData.a("2000048", eVar);
                }
                a(metricsData);
            }
            List<CampaignEx> listB = com.mbridge.msdk.videocommon.cache.a.a().b(this.f35318b, 1, this.f35334s);
            if (listB != null && listB.size() > 0 && metricsData != null) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                CampaignEx campaignEx = copyOnWriteArrayList.get(0);
                eVar2.a(BidResponsedEx.KEY_CID, campaignEx.getId());
                eVar2.a("price", "");
                eVar2.a("bid_tk", this.C);
                eVar2.a("lrid", campaignEx.getLocalRequestId());
                CampaignEx campaignEx2 = listB.get(0);
                eVar2.a("cid_old", com.mbridge.msdk.foundation.same.c.a(listB));
                eVar2.a("price_old", "");
                eVar2.a("bid_tk_old", campaignEx2.getBidToken());
                eVar2.a("lrid_old", campaignEx2.getLocalRequestId());
                metricsData.a("m_load_overwrite", eVar2);
                com.mbridge.msdk.reward.report.metrics.a.a().a("m_load_overwrite", metricsData);
            }
            if (z12) {
                a(copyOnWriteArrayList);
                return;
            } else {
                this.U = "campaign filtered";
                a(880021, "campaign filtered", metricsData);
                return;
            }
        }
        q0.c("RewardMVVideoAdapter", "onload load fail, callback campaign have not video");
        if (TextUtils.isEmpty(this.U)) {
            this.U = "APP ALREADY INSTALLED";
        }
        a(this.U.contains("INSTALL") ? 880021 : 880003, this.U, metricsData);
    }

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        CampaignUnit campaignUnit = this.f35340y;
        if (campaignUnit != null) {
            a(campaignUnit.getSessionId());
        }
        b(copyOnWriteArrayList);
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            q0.c("RewardMVVideoAdapter", "#######onload 把广告存在本地 size:" + copyOnWriteArrayList.size());
            a(this.f35319c, this.f35318b, copyOnWriteArrayList);
        }
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        this.f35341z = copyOnWriteArrayList;
        a(campaignEx);
    }

    private void a(CampaignEx campaignEx) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>(this.f35341z);
        boolean zIsEmpty = TextUtils.isEmpty(campaignEx.getCMPTEntryUrl());
        boolean z10 = !zIsEmpty;
        int nscpt = campaignEx.getNscpt();
        this.O = false;
        this.P = false;
        synchronized (this.f35330o) {
            try {
                if (this.Q) {
                    this.Q = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.S = false;
        this.R = false;
        if (this.f35334s) {
            com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getBidToken(), campaignEx.getCampaignUnitId(), campaignEx.getEncryptPrice());
        }
        com.mbridge.msdk.reward.adapter.b.b().a(this.f35317a, z10, nscpt, this.f35334s, this.f35333r ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, this.f35319c, this.f35318b, campaignEx.getRequestId(), copyOnWriteArrayList, new C0160c(campaignEx, z10, copyOnWriteArrayList, nscpt), new d(campaignEx, z10, copyOnWriteArrayList, nscpt));
        if (zIsEmpty) {
            return;
        }
        com.mbridge.msdk.reward.adapter.b.b().a(this.f35317a, campaignEx, this.f35319c, this.f35318b, campaignEx.getRequestId(), new e(campaignEx, copyOnWriteArrayList, z10, nscpt));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, List<CampaignEx> list, List<CampaignEx> list2, boolean z10) {
        com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(str, list, list2, z10);
        if (list2 != null && list2.size() > 0) {
            for (CampaignEx campaignEx : list2) {
                if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                    StringBuilder sbJ = u.j(str, "_");
                    sbJ.append(campaignEx.getId());
                    sbJ.append("_");
                    sbJ.append(campaignEx.getRequestId());
                    sbJ.append("_");
                    sbJ.append(campaignEx.getRewardTemplateMode().j());
                    com.mbridge.msdk.videocommon.a.e(sbJ.toString());
                    com.mbridge.msdk.videocommon.a.b(campaignEx.getAdType(), campaignEx);
                }
            }
        }
        if (z10) {
            a(str, list, list2);
        }
        if (list == null || list.size() <= 0) {
            return;
        }
        try {
            CampaignEx campaignEx2 = list.get(0);
            com.mbridge.msdk.reward.candidate.a aVar = new com.mbridge.msdk.reward.candidate.a(str, this.f35333r);
            if (campaignEx2 == null || !TextUtils.isEmpty(campaignEx2.getNLRid())) {
                return;
            }
            aVar.a(campaignEx2.getLocalRequestId(), campaignEx2.getRequestId(), 1, campaignEx2.getEcppv());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    private void a(String str, List<CampaignEx> list, List<CampaignEx> list2) {
        CampaignEx campaignEx;
        String requestId;
        int vcn;
        String bidToken;
        String localRequestId = "";
        if (list == null) {
            vcn = 1;
            requestId = "";
            bidToken = requestId;
        } else {
            try {
                if (list.size() <= 0 || (campaignEx = list.get(0)) == null) {
                    vcn = 1;
                    requestId = "";
                    bidToken = requestId;
                } else {
                    requestId = campaignEx.getRequestId();
                    vcn = campaignEx.getVcn();
                    bidToken = campaignEx.getBidToken();
                    if (TextUtils.isEmpty(campaignEx.getNLRid())) {
                        localRequestId = campaignEx.getLocalRequestId();
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                    return;
                }
                return;
            }
        }
        if (com.mbridge.msdk.videocommon.cache.a.a() != null) {
            com.mbridge.msdk.videocommon.cache.a.a().c(str, localRequestId);
            com.mbridge.msdk.videocommon.cache.a.a().b(str);
            com.mbridge.msdk.videocommon.cache.a.a().a(str, localRequestId);
        }
        if (com.mbridge.msdk.videocommon.cache.a.a() != null) {
            com.mbridge.msdk.videocommon.cache.a.a().a(str, vcn);
        }
        if (list != null && list.size() > 0) {
            com.mbridge.msdk.reward.controller.a.a(requestId, bidToken);
            for (CampaignEx campaignEx2 : list) {
                if (campaignEx2 != null) {
                    com.mbridge.msdk.foundation.same.buffer.b.a(campaignEx2.getCampaignUnitId(), campaignEx2.getRequestId(), campaignEx2.getId(), campaignEx2.getPlct(), campaignEx2.getPlctb(), campaignEx2.getTimestamp(), campaignEx2.getLocalRequestId());
                }
            }
        }
        if (list2 != null && list2.size() > 0) {
            for (CampaignEx campaignEx3 : list2) {
                if (campaignEx3 != null) {
                    com.mbridge.msdk.foundation.same.buffer.b.c(campaignEx3.getCampaignUnitId(), campaignEx3.getRequestId());
                }
            }
        }
        com.mbridge.msdk.foundation.same.buffer.b.e(str);
        com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, List<CampaignEx> list, boolean z10, String str2) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getEcppv()) && !TextUtils.isEmpty(str2)) {
                com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(str, (CampaignEx) null, z10, str2);
                return;
            } else {
                com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(str, list, z10);
                return;
            }
        }
        com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(str, (CampaignEx) null, z10, str2);
    }

    private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, this.f35317a, cVar, new f());
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    private void a(CampaignUnit campaignUnit, List<CampaignEx> list) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new g(campaignUnit));
    }

    private void a(String str) {
        if (a1.b(str)) {
            com.mbridge.msdk.reward.controller.a.f35413c0 = str;
        }
    }

    public void a(int i10, int i11, int i12) {
        this.f35337v = i10;
        this.f35338w = i11;
        this.f35339x = i12;
    }

    public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.l != null && TextUtils.isEmpty(str)) {
            int iQ = this.l.q() * 1000;
            List<CampaignEx> list = this.X;
            if (list != null && list.size() > 0) {
                if (System.currentTimeMillis() - this.X.get(0).getTimestamp() < iQ) {
                    b("hit ltorwc", cVar);
                    return;
                }
            }
        }
        b(str, this.A, cVar);
    }

    public void a(String str, boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.foundation.same.threadpool.a.f().execute(new i(str, cVar));
        if (this.L != null) {
            h hVar = new h(str, cVar);
            this.D = hVar;
            this.L.postDelayed(hVar, 90000L);
            return;
        }
        b(str, z10, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(Message message) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        if (message != null) {
            try {
                Bundle data = message.getData();
                if (data != null) {
                    return com.mbridge.msdk.foundation.same.report.metrics.d.b().b(data.getString("metrics_data_lrid"));
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
        return cVar;
    }

    private com.mbridge.msdk.foundation.same.report.metrics.c a(List<CampaignEx> list) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        String localRequestId = "";
        if (list != null) {
            try {
                if (list.size() > 0) {
                    if (list.get(0) != null) {
                        localRequestId = list.get(0).getLocalRequestId();
                    }
                    if (com.mbridge.msdk.foundation.same.report.metrics.d.b().c().containsKey(localRequestId)) {
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(localRequestId);
                        if (cVar2 == null) {
                            try {
                                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                            } catch (Exception e10) {
                                e = e10;
                                cVar = cVar2;
                                if (MBridgeConstans.DEBUG) {
                                    e.printStackTrace();
                                }
                                return cVar;
                            }
                        } else {
                            cVar = cVar2;
                        }
                    }
                    cVar.i(localRequestId);
                    cVar.b(list);
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("cache", 1);
        eVar.a(CampaignEx.JSON_KEY_HB, 1);
        eVar.a("auto_load", 2);
        cVar.a("2000127", eVar);
        cVar.a("2000048", eVar);
        cVar.a(this.f35333r ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
        cVar.h("1");
        cVar.f("2");
        if (!TextUtils.isEmpty(localRequestId)) {
            com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(localRequestId, cVar);
        }
        return cVar;
    }

    private void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.e eVar, List<CampaignEx> list) {
        if (cVar != null) {
            if (list != null) {
                try {
                    if (list.size() > 0) {
                        cVar.b(list);
                        CampaignEx campaignEx = list.get(0);
                        if (campaignEx != null) {
                            cVar.i(campaignEx.getLocalRequestId());
                        }
                        cVar.b(list);
                    }
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            a(false, cVar, eVar);
        }
    }

    private void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar, List<CampaignEx> list) {
        if (cVar == null) {
            cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        }
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null) {
                cVar.i(campaignEx.getLocalRequestId());
            }
            cVar.b(list);
        }
        a(z10, cVar, (com.mbridge.msdk.foundation.same.report.metrics.e) null);
    }

    private void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        if (eVar == null) {
            eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        }
        cVar.n(this.f35318b);
        cVar.a(this.f35333r ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
        eVar.a("result", Integer.valueOf(z10 ? 1 : 2));
        eVar.a("bid_tk", this.C);
        eVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(this.f35334s ? 1 : 0));
        cVar.a("m_offer_ready", eVar);
        com.mbridge.msdk.reward.report.metrics.a.a().a("m_offer_ready", cVar);
    }
}

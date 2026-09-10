package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.setting.m;
import java.io.File;
import java.io.Serializable;
import java.net.URL;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class a implements Serializable {
    private int A;
    private File B;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private m H;
    private com.mbridge.msdk.videocommon.setting.c I;
    private m J;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38202c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f38206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f38207h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CampaignEx f38208i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f38209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Context f38210k;
    private long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f38211m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f38212n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f38214p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f38216r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.mbridge.msdk.foundation.db.m f38219u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f38221w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private DownloadRequest f38222x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f38223y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f38224z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f38200a = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f38203d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile int f38204e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.c> f38205f = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f38213o = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f38215q = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f38217s = 100;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f38218t = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f38220v = false;
    private int C = 1;
    private boolean K = false;
    private boolean L = false;
    private boolean M = false;
    private boolean N = false;
    private boolean O = false;
    private boolean P = false;
    private boolean Q = false;
    private OnDownloadStateListener R = new b();
    private OnProgressStateListener S = new c();

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.download.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class RunnableC0211a implements Runnable {
        public RunnableC0211a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f38219u == null) {
                a.this.f38219u = com.mbridge.msdk.foundation.db.m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
            }
            try {
                try {
                    a.this.f38219u.a(a.this.f38211m);
                    if (!s0.a().a("r_d_v_b_l", true)) {
                        File file = new File(a.this.f38214p);
                        if (file.exists() && file.isFile()) {
                            file.delete();
                        }
                    }
                    a.this.f38204e = 0;
                } catch (Throwable unused) {
                    q0.b("CampaignDownLoadTask", "del DB or file failed");
                }
            } finally {
                a.this.f38204e = 0;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements OnProgressStateListener {
        public c() {
        }

        @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
        public void onProgress(DownloadMessage downloadMessage, DownloadProgress downloadProgress) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("cache", a.this.f38222x.get("cache", "2"));
                a aVar = a.this;
                aVar.a(aVar.f38208i, eVar);
                a.this.f38213o = downloadProgress.getCurrent();
                a.this.l = downloadProgress.getTotal();
                a.this.f38223y = downloadProgress.getCurrentDownloadRate();
                if (a.this.f38217s != 100 && downloadProgress.getCurrentDownloadRate() >= a.this.f38217s) {
                    q0.b("CampaignDownLoadTask", "Rate : " + downloadProgress.getCurrentDownloadRate() + " ReadyRate & cdRate = " + a.this.f38217s + " " + a.this.f38202c);
                    if (a.this.f38203d) {
                        return;
                    }
                    a.this.f38203d = true;
                    if (!a.this.f38224z) {
                        a.this.a(1, true, "");
                        a.this.a(downloadProgress.getCurrent(), false, "");
                    }
                    if (a.this.f38222x == null || a.this.C != 2 || a.this.f38224z) {
                        return;
                    }
                    a.this.f38222x.cancel(downloadMessage);
                }
            } catch (Exception e10) {
                q0.b("CampaignDownLoadTask", e10.getMessage());
            }
        }
    }

    public a(Context context, CampaignEx campaignEx, String str, int i10) {
        this.f38201b = 1;
        this.G = false;
        if (context == null && campaignEx == null) {
            return;
        }
        com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarD != null) {
            this.G = gVarD.J0();
        }
        this.D = com.mbridge.msdk.foundation.same.a.f33734u;
        this.E = com.mbridge.msdk.foundation.same.a.f33735v;
        this.F = com.mbridge.msdk.foundation.same.a.f33733t;
        this.f38216r = System.currentTimeMillis();
        this.f38210k = com.mbridge.msdk.foundation.controller.c.n().d();
        this.f38208i = campaignEx;
        this.f38209j = str;
        this.f38201b = i10;
        if (campaignEx != null) {
            this.f38211m = campaignEx.getVideoUrlEncode();
        }
        this.f38221w = o0.d(this.f38211m);
        this.f38212n = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_VC) + File.separator;
        this.f38214p = this.f38212n + this.f38221w;
        q0.c("CampaignDownLoadTask", this.f38208i.getAppName() + " videoLocalPath:" + this.f38214p + " videoUrl: " + this.f38208i.getVideoUrlEncode() + " " + this.f38217s);
        q();
    }

    private void q() {
        File file;
        File file2;
        try {
            if (TextUtils.isEmpty(this.f38211m)) {
                return;
            }
            if (TextUtils.isEmpty(this.f38212n)) {
                file = null;
            } else {
                file = new File(this.f38212n);
                if (!file.exists()) {
                    file.mkdirs();
                }
            }
            if (file != null && file.exists() && ((file2 = this.B) == null || !file2.exists())) {
                File file3 = new File(file + "/.nomedia");
                this.B = file3;
                if (!file3.exists()) {
                    this.B.createNewFile();
                }
            }
            z();
            a(this.f38211m);
        } catch (Exception e10) {
            q0.c("CampaignDownLoadTask", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        try {
            v0.a(this.f38209j, this.f38208i, com.mbridge.msdk.foundation.same.a.f33737x);
        } catch (Exception e10) {
            q0.b("CampaignDownLoadTask", e10.getMessage());
        }
    }

    private void z() {
        if (this.f38219u == null) {
            this.f38219u = com.mbridge.msdk.foundation.db.m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        com.mbridge.msdk.foundation.entity.m mVarB = this.f38219u.b(this.f38211m, "");
        if (mVarB != null) {
            this.f38213o = mVarB.c();
            if (this.f38204e != 2) {
                this.f38204e = mVarB.b();
            }
            if (this.f38204e == 1) {
                this.f38204e = 2;
            }
            this.l = mVarB.d();
            if (mVarB.a() > 0) {
                this.f38216r = mVarB.a();
            }
            if (this.f38204e == 5) {
                if (Objects.exists(new File(this.f38212n + this.f38221w), this.f38212n, this.f38221w)) {
                    this.f38214p = this.f38212n + this.f38221w;
                } else {
                    d();
                }
            } else if (this.f38204e != 0) {
                this.f38214p = this.f38212n + this.f38221w;
            }
        } else {
            this.f38219u.a(this.f38211m, this.f38216r);
        }
        try {
            long j10 = this.l;
            if (j10 <= 0 || this.f38213o * 100 < j10 * ((long) c(this.f38208i))) {
                return;
            }
            if (c(this.f38208i) == 100 || this.f38204e == 5) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("cache", 1);
                a(this.f38208i, eVar);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void A() {
        if (this.Q) {
            return;
        }
        try {
            this.f38224z = true;
            if (this.C == 1) {
                q0.b("CampaignDownLoadTask", "Can not call resume(), because videoCtnType = " + this.C);
            } else {
                if (this.f38201b == 3) {
                    q0.b("CampaignDownLoadTask", "Can not call resume(), because dlnet = " + this.f38201b);
                    return;
                }
                q0.b("CampaignDownLoadTask", "resume()");
                this.O = false;
                this.P = false;
                DownloadMessage downloadMessage = new DownloadMessage(new Object(), this.f38211m, this.f38221w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
                downloadMessage.setUseCronetDownload(a(this.f38208i));
                DownloadRequest<?> downloadRequestA = a(downloadMessage, this.R, this.S, "2");
                this.f38222x = downloadRequestA;
                downloadRequestA.start();
            }
        } catch (Exception e10) {
            q0.b("CampaignDownLoadTask", e10.getMessage());
        }
    }

    public void B() {
        q0.b("CampaignDownLoadTask", "start()");
        try {
            if (TextUtils.isEmpty(this.f38211m)) {
                return;
            }
            if (i() != null) {
                q0.b("CampaignDownLoadTask", new URL(i()).getPath());
            }
            if (this.f38217s == 0 && this.C == 2) {
                q0.b("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                return;
            }
            DownloadRequest downloadRequest = this.f38222x;
            if (downloadRequest != null) {
                downloadRequest.start();
            }
        } catch (Throwable unused) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.f38206g;
            if (aVar != null) {
                aVar.a("VideoUrl is not illegal, Please check it.", "");
            }
            com.mbridge.msdk.videocommon.listener.a aVar2 = this.f38207h;
            if (aVar2 != null) {
                aVar2.a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    public void C() {
        q0.b("CampaignDownLoadTask", "startForLoadRefactor()");
        try {
            if (TextUtils.isEmpty(this.f38211m)) {
                com.mbridge.msdk.videocommon.listener.a aVar = this.f38206g;
                if (aVar != null) {
                    aVar.a(this.f38211m);
                    return;
                }
                return;
            }
            if (i() != null) {
                q0.b("CampaignDownLoadTask", new URL(i()).getPath());
            }
            if (this.f38201b == 3) {
                q0.b("CampaignDownLoadTask", "startForLoadRefactor: Dlnet is 3, Will callback.");
                com.mbridge.msdk.videocommon.listener.a aVar2 = this.f38206g;
                if (aVar2 != null) {
                    aVar2.a(this.f38211m);
                    return;
                }
                return;
            }
            if (this.f38217s == 0 && this.C == 2) {
                q0.b("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                com.mbridge.msdk.videocommon.listener.a aVar3 = this.f38206g;
                if (aVar3 != null) {
                    aVar3.a(this.f38211m);
                    return;
                }
                return;
            }
            try {
                if (this.f38204e == 5 && Utils.getDownloadRate(this.l, this.f38213o) >= this.f38217s) {
                    if (Objects.exists(new File(this.f38212n + this.f38221w), this.f38212n, this.f38221w)) {
                        this.f38214p = this.f38212n + this.f38221w;
                        com.mbridge.msdk.videocommon.listener.a aVar4 = this.f38206g;
                        if (aVar4 != null) {
                            aVar4.a(this.f38211m);
                            return;
                        }
                        return;
                    }
                }
            } catch (Exception e10) {
                f2.q(e10, new StringBuilder("startForLoadRefactor: "), "CampaignDownLoadTask");
            }
            DownloadRequest downloadRequest = this.f38222x;
            if (downloadRequest != null) {
                downloadRequest.start();
            }
        } catch (Throwable unused) {
            com.mbridge.msdk.videocommon.listener.a aVar5 = this.f38206g;
            if (aVar5 != null) {
                aVar5.a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    public int o() {
        return this.f38204e;
    }

    public String p() {
        return this.f38214p;
    }

    public boolean s() {
        return this.K;
    }

    public boolean t() {
        return this.f38220v;
    }

    public boolean u() {
        return this.L;
    }

    public boolean v() {
        return this.Q;
    }

    public boolean w() {
        return this.N;
    }

    public boolean x() {
        return this.M;
    }

    public void y() {
        if (this.f38205f != null) {
            this.f38205f = null;
        }
    }

    public void c(boolean z10) {
        this.L = z10;
    }

    public void d(boolean z10) {
        this.f38215q = z10;
    }

    public void e(boolean z10) {
        this.N = z10;
    }

    public void f(boolean z10) {
        this.M = z10;
    }

    public void g() {
        try {
            d();
            CampaignEx campaignEx = this.f38208i;
            if (campaignEx == null || campaignEx.getPlayable_ads_without_video() != 2) {
                com.mbridge.msdk.videocommon.cache.a aVarA = com.mbridge.msdk.videocommon.cache.a.a();
                if (aVarA != null) {
                    aVarA.a(this.f38208i);
                }
            }
        } catch (Exception unused) {
            q0.b("CampaignDownLoadTask", "del file is failed");
        } finally {
            this.f38204e = 0;
        }
    }

    public CampaignEx h() {
        return this.f38208i;
    }

    public String i() {
        return this.f38211m;
    }

    public long j() {
        return this.l;
    }

    public String k() {
        String message = "";
        if (this.f38201b == 3) {
            return "";
        }
        String str = this.f38212n + this.f38221w;
        File file = new File(str);
        try {
            if (!Objects.exists(file, this.f38212n, this.f38221w)) {
                message = "file is not exist ";
            } else if (!file.isFile()) {
                message = "file is not file ";
            } else if (!file.canRead()) {
                message = "file can not read ";
            } else if (file.length() > 0) {
                this.f38214p = str;
            } else {
                message = "file length is 0 ";
            }
        } catch (Throwable th2) {
            q0.b("CampaignDownLoadTask", th2.getMessage());
            message = th2.getMessage();
        }
        if (this.f38204e == 5 && !TextUtils.isEmpty(message)) {
            d();
        }
        return message;
    }

    public String l() {
        if (this.Q) {
            try {
                File file = new File(this.f38214p);
                return (file.exists() && file.isFile()) ? this.f38214p : this.f38211m;
            } catch (Exception e10) {
                q0.b("CampaignDownLoadTask", e10.getMessage());
                return this.f38211m;
            }
        }
        try {
            File file2 = new File(this.f38214p);
            if (Objects.exists(file2, this.f38212n, this.f38221w) && file2.isFile()) {
                return this.f38214p;
            }
        } catch (Exception e11) {
            q0.b("CampaignDownLoadTask", e11.getMessage());
        }
        return this.f38211m;
    }

    public long m() {
        return this.f38213o;
    }

    public long n() {
        return this.f38216r;
    }

    public void c(int i10) {
        this.f38201b = i10;
    }

    public void d(int i10) {
        q0.a("CampaignDownLoadTask", "set ready rate: " + i10);
        this.f38217s = i10;
    }

    public void e(CampaignEx campaignEx) {
        this.f38208i = campaignEx;
    }

    private int c(CampaignEx campaignEx) {
        int iD;
        if (campaignEx == null) {
            return 100;
        }
        if (campaignEx.getReady_rate() != -1) {
            iD = campaignEx.getReady_rate();
            q0.a("CampaignDownLoadTask", "ready_rate(campaign): " + iD);
        } else {
            iD = d(campaignEx);
            q0.a("CampaignDownLoadTask", "ready_rate(reward_unit_setting): " + iD);
        }
        try {
            return Math.max(iD, 0);
        } catch (Exception unused) {
            return 100;
        }
    }

    public void b(int i10) {
        this.f38202c = i10;
    }

    public void e(int i10) {
        this.C = i10;
    }

    private int d(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 100;
        }
        try {
            if (campaignEx.getAdType() == 298) {
                if (this.H == null) {
                    this.H = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f38209j);
                }
                return this.H.C();
            }
            if (campaignEx.getAdType() == 42) {
                if (this.J == null) {
                    this.J = com.mbridge.msdk.setting.i.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f38209j);
                }
                return b((CampaignEx) null);
            }
            if (this.I == null) {
                this.I = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f38209j, false);
            }
            return this.I.w();
        } catch (Throwable th2) {
            q0.b("CampaignDownLoadTask", th2.getMessage(), th2);
            return 100;
        }
    }

    public void b(boolean z10) {
        this.f38220v = z10;
    }

    public void b(String str) {
        com.mbridge.msdk.videocommon.listener.a aVar = this.f38206g;
        if (aVar != null) {
            aVar.a(str, this.f38211m);
        }
        com.mbridge.msdk.videocommon.listener.a aVar2 = this.f38207h;
        if (aVar2 != null) {
            aVar2.a(str, this.f38211m);
        }
        f2.s("Video download stop : ", str, "CampaignDownLoadTask");
        if (this.f38204e == 4 || this.f38204e == 2 || this.f38204e == 5) {
            return;
        }
        this.f38204e = 4;
        CampaignEx campaignEx = this.f38208i;
        if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && this.f38208i.getRsIgnoreCheckRule().size() > 0 && this.f38208i.getRsIgnoreCheckRule().contains(0)) {
            q0.c("CampaignDownLoadTask", "Is not check video download status");
        } else {
            a(this.f38213o, this.f38204e);
        }
    }

    public void a(boolean z10) {
        this.K = z10;
    }

    public void a(int i10, int i11) {
        this.f38204e = i10;
        if (this.f38219u == null) {
            this.f38219u = com.mbridge.msdk.foundation.db.m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        this.f38219u.a(this.f38211m, i11, i10, this.l);
    }

    public void c(String str) {
        r();
        a(2, str, "");
        this.f38204e = 4;
    }

    public void a(int i10) {
        this.A = i10;
    }

    public void a(String str) {
        int iC;
        if (TextUtils.isEmpty(str)) {
            this.f38207h.a("VideoUrl is NULL, Please check it.", "");
            return;
        }
        if (this.f38204e == 1) {
            q0.a("CampaignDownLoadTask", "Run : Task is RUNNING, Will return.");
            return;
        }
        if (this.f38204e == 5 && Utils.getDownloadRate(this.l, this.f38213o) >= this.f38217s) {
            q0.a("CampaignDownLoadTask", "Run : Video Done, Will callback.");
            com.mbridge.msdk.videocommon.listener.a aVar = this.f38206g;
            if (aVar != null) {
                aVar.a(this.f38211m);
            }
            com.mbridge.msdk.videocommon.listener.a aVar2 = this.f38207h;
            if (aVar2 != null) {
                aVar2.a(this.f38211m);
            }
            try {
                File file = new File(this.f38214p);
                if (Objects.exists(file, this.f38212n, this.f38221w) && file.isFile()) {
                    file.setLastModified(System.currentTimeMillis());
                }
            } catch (Exception e10) {
                q0.b("CampaignDownLoadTask", e10.getMessage());
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("cache", 1);
            a(this.f38208i, eVar);
            return;
        }
        if (this.f38201b == 3) {
            q0.a("CampaignDownLoadTask", "Run : Dlnet is 3, Will callback.");
            a(0L, false, "");
            com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar2.a("cache", 1);
            a(this.f38208i, eVar2);
            return;
        }
        try {
            iC = c(this.f38208i);
        } catch (Exception unused) {
            iC = 100;
        }
        d(iC);
        if (iC == 0) {
            com.mbridge.msdk.videocommon.listener.a aVar3 = this.f38206g;
            if (aVar3 != null) {
                aVar3.a(this.f38211m);
            }
            com.mbridge.msdk.videocommon.listener.a aVar4 = this.f38207h;
            if (aVar4 != null) {
                aVar4.a(this.f38211m);
            }
        }
        DownloadMessage downloadMessage = new DownloadMessage(this.f38208i, str, this.f38221w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
        downloadMessage.setUseCronetDownload(a(this.f38208i));
        downloadMessage.addExtra("resource_type", 4);
        this.f38222x = a(downloadMessage, this.R, this.S, "1");
    }

    private void d() {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new RunnableC0211a());
    }

    private int b(CampaignEx campaignEx) {
        try {
            m mVar = this.J;
            if (mVar != null) {
                return mVar.C();
            }
            return 100;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return 100;
            }
            q0.b("CampaignDownLoadTask", e10.getMessage());
            return 100;
        }
    }

    public void b(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f38207h = aVar;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements OnDownloadStateListener {
        public b() {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage downloadMessage) {
            String str;
            try {
                q0.b("CampaignDownLoadTask", "onDownloadComplete callback : " + a.this.f38213o + "    " + a.this.l);
                if (a.this.f38219u == null) {
                    a.this.f38219u = com.mbridge.msdk.foundation.db.m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                }
                a.this.f38219u.a(a.this.f38211m, a.this.f38213o, 5, a.this.l);
                if (downloadMessage != null) {
                    try {
                        str = (String) downloadMessage.getExtra("responseHeaders");
                    } catch (Throwable th2) {
                        q0.b("CampaignDownLoadTask", th2.getMessage());
                        str = "";
                    }
                } else {
                    str = "";
                }
                a aVar = a.this;
                aVar.a(aVar.f38213o, true, str);
                a.this.a(1, true, "");
            } catch (Exception e10) {
                q0.b("CampaignDownLoadTask", e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
            if (a.this.f38222x == null || a.this.f38222x.getStatus() == DownloadStatus.CANCELLED) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("cache", a.this.f38222x.get("cache", "2"));
            a aVar = a.this;
            aVar.a(aVar.f38208i, eVar);
            String message = (downloadError == null || downloadError.getException() == null) ? "Video Download Error" : downloadError.getException().getMessage();
            a.this.r();
            a.this.a(3, message, "");
            a.this.b(message);
            a aVar2 = a.this;
            aVar2.a(3, aVar2.f38224z, message);
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage downloadMessage) {
            a.this.f38204e = 1;
            if (a.this.f38219u == null) {
                a.this.f38219u = com.mbridge.msdk.foundation.db.m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
            }
            a.this.f38219u.a(a.this.f38208i, a.this.l, a.this.f38214p, a.this.f38204e);
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage downloadMessage) {
        }
    }

    private DownloadRequest<?> a(DownloadMessage downloadMessage, OnDownloadStateListener onDownloadStateListener, OnProgressStateListener onProgressStateListener, String str) {
        return MBDownloadManager.getInstance().download(downloadMessage).withReadTimeout(this.D).withConnectTimeout(this.F).withWriteTimeout(this.E).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(this.f38212n).withDownloadStateListener(onDownloadStateListener).withProgressStateListener(onProgressStateListener).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).with("do_us_fi_re", Boolean.toString(this.G)).with("download_scene", "download_video").with(CampaignEx.JSON_KEY_READY_RATE, String.valueOf(this.f38217s)).with("scenes", str).build();
    }

    public void a(long j10, boolean z10, String str) {
        StringBuilder sb2 = new StringBuilder("setStateToDone 下载完成  ： mProgressSize");
        sb2.append(this.f38213o);
        q4.a.r(sb2, "  progressSize ", j10, "  ");
        sb2.append(this.f38223y);
        sb2.append("%   FileSize : ");
        sb2.append(this.l);
        sb2.append("  ");
        sb2.append(this.f38208i.getAppName());
        q0.b("CampaignDownLoadTask", sb2.toString());
        if (this.f38217s == 100 && this.f38201b != 3 && j10 != this.l && !z10) {
            File file = new File(this.f38214p);
            long length = Objects.exists(file, this.f38212n, this.f38221w) ? file.length() : 0L;
            StringBuilder sbL = wi.d.l(j10, "progressSize = ", " fileSize = ");
            sbL.append(this.l);
            sbL.append(" ");
            sbL.append(z10);
            sbL.append(" absFileSize = ");
            sbL.append(length);
            q0.b("CampaignDownLoadTask", sbL.toString());
            b("File size is not match witch download size.");
            return;
        }
        this.f38204e = 5;
        if (j10 == this.l) {
            a(1, "", str);
        }
        this.f38200a = false;
        a(j10, this.f38204e);
    }

    public void a(com.mbridge.msdk.videocommon.download.c cVar) {
        CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.c> copyOnWriteArrayList = this.f38205f;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(cVar);
        }
    }

    public void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f38206g = aVar;
    }

    private void a(long j10, int i10) {
        long j11;
        this.f38213o = j10;
        int i11 = this.f38217s;
        if (100 * j10 >= ((long) i11) * this.l && !this.f38218t && i10 != 4) {
            if (i11 == 100 && i10 != 5) {
                this.f38204e = 5;
                return;
            }
            this.f38218t = true;
            q0.b("CampaignDownLoadTask", "UpdateListener : state: " + i10 + " progress : " + j10);
            String strK = k();
            if (TextUtils.isEmpty(strK)) {
                com.mbridge.msdk.videocommon.listener.a aVar = this.f38206g;
                if (aVar != null) {
                    aVar.a(this.f38211m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar2 = this.f38207h;
                if (aVar2 != null) {
                    aVar2.a(this.f38211m);
                }
            } else {
                com.mbridge.msdk.videocommon.listener.a aVar3 = this.f38206g;
                if (aVar3 != null) {
                    aVar3.a(defpackage.e.n("file is not effective ", strK), this.f38211m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar4 = this.f38207h;
                if (aVar4 != null) {
                    aVar4.a(defpackage.e.n("file is not effective ", strK), this.f38211m);
                }
            }
        }
        if (this.f38200a || j10 <= 0) {
            j11 = j10;
        } else {
            this.f38200a = true;
            if (this.f38219u == null) {
                this.f38219u = com.mbridge.msdk.foundation.db.m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
            }
            j11 = j10;
            this.f38219u.a(this.f38211m, j11, this.f38204e, this.l);
        }
        CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.c> copyOnWriteArrayList = this.f38205f;
        if (copyOnWriteArrayList != null) {
            for (com.mbridge.msdk.videocommon.download.c cVar : copyOnWriteArrayList) {
                if (cVar != null) {
                    cVar.onProgress(j11, i10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str, String str2) {
        n nVar = new n(this.f38210k, this.f38208i, i10, Long.toString(this.f38216r != 0 ? System.currentTimeMillis() - this.f38216r : 0L), this.l, this.A);
        nVar.b(this.f38208i.getId());
        nVar.v(this.f38208i.getVideoUrlEncode());
        nVar.m(str);
        nVar.n(this.f38208i.getRequestId());
        nVar.k(this.f38208i.getCurrentLocalRid());
        nVar.o(this.f38208i.getRequestIdNotice());
        nVar.u(this.f38209j);
        nVar.q(str2);
        nVar.b(CampaignEx.JSON_KEY_READY_RATE, String.valueOf(this.f38217s));
        nVar.b("url", this.f38208i.getVideoUrlEncode());
        nVar.e(4);
        DownloadRequest downloadRequest = this.f38222x;
        if (downloadRequest != null) {
            nVar.b("scenes", downloadRequest.get("scenes", ""));
            nVar.b("resumed_breakpoint", this.f38222x.get("resumed_breakpoint", ""));
        }
        int i11 = this.A;
        if (i11 == 94 || i11 == 287) {
            return;
        }
        com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(nVar);
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
            q0.b("CampaignDownLoadTask", th2.getMessage());
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, boolean z10, String str) {
        if (this.P) {
            return;
        }
        try {
            this.P = true;
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            DownloadRequest downloadRequest = this.f38222x;
            if (downloadRequest != null) {
                eVar.a("scenes", downloadRequest.get("scenes", ""));
                eVar.a("url", this.f38211m);
                eVar.a("resumed_breakpoint", this.f38222x.get("resumed_breakpoint", ""));
                eVar.a("h3c", "");
            }
            eVar.a("resource_type", 4);
            eVar.a("file_size", Long.valueOf(this.l));
            eVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(this.f38217s));
            eVar.a("result", Integer.valueOf(i10));
            eVar.a("reason", str);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_end", this.f38208i, eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        if (this.O || campaignEx == null || eVar == null) {
            return;
        }
        this.O = true;
        try {
            eVar.a("resource_type", 4);
            DownloadRequest downloadRequest = this.f38222x;
            if (downloadRequest != null) {
                eVar.a("scenes", downloadRequest.get("scenes", "1"));
                eVar.a("resumed_breakpoint", this.f38222x.get("resumed_breakpoint", "2"));
            } else {
                eVar.a("scenes", "1");
                eVar.a("resumed_breakpoint", "1");
            }
            eVar.a("url", campaignEx.getVideoUrlEncode());
            eVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(c(campaignEx)));
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_start", campaignEx, eVar);
        } catch (Exception e10) {
            q0.b("CampaignDownLoadTask", e10.getMessage());
        }
    }
}

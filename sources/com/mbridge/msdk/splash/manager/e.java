package com.mbridge.msdk.splash.manager;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.iab.omid.library.mmadbridge.ScriptInjector;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.m;
import com.mbridge.msdk.splash.view.MBSplashView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e {
    private static String A = "SplashLoadManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f35821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f35822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.splash.middle.b f35823e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MBSplashView f35825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private m f35826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f35827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f35828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f35829k;
    private int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f35830m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f35831n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f35832o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile boolean f35833p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f35834q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private H5DownLoadManager.ZipDownloadListener f35835r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f35836s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f35837t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f35839v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List<CampaignEx> f35840w;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f35838u = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f35841x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Handler f35842y = new c(Looper.getMainLooper());

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Runnable f35843z = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f35824f = com.mbridge.msdk.foundation.controller.c.n().d();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) throws Throwable {
            int i10;
            super.handleMessage(message);
            int i11 = message.what;
            if (i11 == 1) {
                Object obj = message.obj;
                int i12 = message.arg1;
                if (obj instanceof CampaignEx) {
                    CampaignEx campaignEx = (CampaignEx) obj;
                    e.this.a(H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getAdZip()), campaignEx, i12);
                    return;
                }
                return;
            }
            if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                Object obj2 = message.obj;
                if (obj2 instanceof CampaignEx) {
                    e eVar = e.this;
                    eVar.h((CampaignEx) obj2, eVar.f35831n);
                    return;
                }
                return;
            }
            Object obj3 = message.obj;
            try {
                if (obj3 instanceof Bundle) {
                    int i13 = ((Bundle) obj3).getInt("type");
                    String string = ((Bundle) obj3).getString(NotificationCompat.CATEGORY_MESSAGE);
                    CampaignEx campaignEx2 = (CampaignEx) ((Bundle) obj3).getSerializable("campaignex");
                    if (i13 == 1) {
                        i10 = 880004;
                    } else {
                        i10 = i13 == 2 ? 880006 : 880027;
                    }
                    com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(i10);
                    bVar.c(string);
                    e eVar2 = e.this;
                    eVar2.a(bVar, eVar2.f35830m, e.this.f35831n, campaignEx2);
                }
            } catch (Exception e10) {
                com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880024);
                bVar2.a((Throwable) e10);
                e eVar3 = e.this;
                eVar3.a(bVar2, eVar3.f35830m, e.this.f35831n, (CampaignEx) null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880010);
            e eVar = e.this;
            eVar.a(bVar, eVar.f35830m, e.this.f35831n, (CampaignEx) null);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0180e extends com.mbridge.msdk.splash.request.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f35851e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f35852f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0180e(int i10, String str, int i11) {
            super(i10);
            this.f35851e = str;
            this.f35852f = i11;
        }

        @Override // com.mbridge.msdk.splash.request.b
        public void a(CampaignUnit campaignUnit, int i10) throws Throwable {
            try {
                e eVar = e.this;
                eVar.a(campaignUnit, i10, eVar.f35819a, this.f35851e);
                e.this.f35838u = campaignUnit.getRequestId();
                e.this.f35840w = campaignUnit.getAds();
            } catch (Exception e10) {
                e10.printStackTrace();
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880003);
                bVar.a((Throwable) e10);
                e.this.a(bVar, this.f35851e, i10, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
                e.this.f();
            }
        }

        @Override // com.mbridge.msdk.splash.request.b
        public void b(int i10, String str) throws Throwable {
            q0.b(e.A, str);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880002);
            bVar.c(str);
            e.this.a(bVar, this.f35851e, this.f35852f, (CampaignEx) null);
            e.this.f();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f extends com.mbridge.msdk.foundation.same.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f35854a;

        public f(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            this.f35854a = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            com.mbridge.msdk.splash.report.a.a(str, cVar, this.f35854a, e.this.f35824f, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f35856a;

        public g(CampaignEx campaignEx) {
            this.f35856a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(e.this.f35824f)).d();
            y.a(e.this.f35824f, this.f35856a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class h implements com.mbridge.msdk.splash.view.nativeview.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f35858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f35859b;

        public h(CampaignEx campaignEx, int i10) {
            this.f35858a = campaignEx;
            this.f35859b = i10;
        }

        @Override // com.mbridge.msdk.splash.view.nativeview.a
        public void a() {
            if (this.f35858a.isDynamicView() && e.this.f35825g != null) {
                e.this.f35825g.setImageReady(true);
                e.this.f(this.f35858a, this.f35859b);
            }
            e.this.h(this.f35858a, this.f35859b);
        }

        @Override // com.mbridge.msdk.splash.view.nativeview.a
        public void b() throws Throwable {
            if (!this.f35858a.isDynamicView() || e.this.f35825g == null) {
                return;
            }
            e.this.f35825g.setImageReady(false);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880027);
            e eVar = e.this;
            eVar.a(bVar, eVar.f35830m, this.f35859b, this.f35858a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class i implements z.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f35861a;

        public i(CampaignEx campaignEx) {
            this.f35861a = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.tools.z.c
        public void a(String str, String str2, String str3, String str4, boolean z10) {
            if (z10) {
                return;
            }
            e.this.a(this.f35861a, str, true, "");
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
            e.this.a(this.f35861a, str, false, message);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class j implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f35863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f35864b;

        public j(CampaignEx campaignEx, int i10) {
            this.f35863a = campaignEx;
            this.f35864b = i10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880006);
            e eVar = e.this;
            eVar.a(bVar, eVar.f35830m, this.f35864b, this.f35863a);
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f35863a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 2);
            messageObtain.obj = bundle;
            e.this.f35842y.sendMessage(messageObtain);
            e.this.a(this.f35863a, str2, false, str);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = this.f35863a;
            messageObtain.arg1 = this.f35864b;
            e.this.f35842y.sendMessage(messageObtain);
            if (z10) {
                return;
            }
            CampaignEx campaignEx = this.f35863a;
            e.this.a(this.f35863a, campaignEx != null ? campaignEx.getAdZip() : "", true, "");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class k implements com.mbridge.msdk.splash.inter.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f35866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f35867b;

        public k(CampaignEx campaignEx, int i10) {
            this.f35866a = campaignEx;
            this.f35867b = i10;
        }

        @Override // com.mbridge.msdk.splash.inter.a
        public void a(View view) {
            if (e.this.f35825g != null) {
                e.this.f35825g.setDynamicView(true);
                e.this.f35825g.setSplashNativeView(view);
                e.this.h(this.f35866a, this.f35867b);
            }
        }

        @Override // com.mbridge.msdk.splash.inter.a
        public void onError(String str) throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880034);
            bVar.c(str);
            e eVar = e.this;
            eVar.a(bVar, eVar.f35830m, this.f35867b, this.f35866a);
        }
    }

    public e(String str, String str2, long j10) {
        this.f35820b = str;
        this.f35819a = str2;
        this.f35822d = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(CampaignEx campaignEx, int i10) {
        if (!com.mbridge.msdk.splash.manager.d.a(this.f35825g, campaignEx) || this.f35833p) {
            return;
        }
        b();
        if (this.f35832o) {
            com.mbridge.msdk.splash.manager.d.a(campaignEx, this.f35819a);
        }
        this.f35833p = true;
        com.mbridge.msdk.splash.middle.b bVar = this.f35823e;
        if (bVar != null) {
            bVar.a(campaignEx, i10);
        }
    }

    private void i(CampaignEx campaignEx, int i10) throws Throwable {
        MBSplashView mBSplashView = this.f35825g;
        if (mBSplashView != null) {
            mBSplashView.setDynamicView(false);
        }
        if (campaignEx.isDynamicView()) {
            c(campaignEx, i10);
        } else {
            MBSplashView mBSplashView2 = this.f35825g;
            if (mBSplashView2 != null) {
                mBSplashView2.setSplashWebView();
            }
        }
        if (com.mbridge.msdk.splash.manager.d.a(this.f35825g, campaignEx)) {
            h(campaignEx, i10);
        } else {
            a(campaignEx, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements com.mbridge.msdk.splash.manager.g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f35844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f35845b;

        public a(CampaignEx campaignEx, int i10) {
            this.f35844a = campaignEx;
            this.f35845b = i10;
        }

        @Override // com.mbridge.msdk.splash.manager.g.c
        public void a() {
            if (this.f35844a.isHasMBTplMark()) {
                return;
            }
            e.this.g(this.f35844a, this.f35845b);
        }

        @Override // com.mbridge.msdk.splash.manager.g.c
        public void onError(String str) throws Throwable {
            e.this.a(str, this.f35845b, this.f35844a);
        }

        @Override // com.mbridge.msdk.splash.manager.g.c
        public void a(int i10) throws Throwable {
            if (i10 == 1) {
                e.this.g(this.f35844a, this.f35845b);
            } else {
                e.this.a("readyState 2", this.f35845b, this.f35844a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f35837t = 0;
    }

    private void g() {
        try {
            int i10 = this.f35837t + 1;
            this.f35837t = i10;
            m mVar = this.f35826h;
            if (mVar != null && i10 <= mVar.y()) {
                return;
            }
            this.f35837t = 0;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String d() {
        return this.f35838u;
    }

    public void e() {
        if (this.f35823e != null) {
            this.f35823e = null;
        }
        if (this.f35834q != null) {
            this.f35834q = null;
        }
        if (this.f35835r != null) {
            this.f35835r = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00cd A[Catch: Exception -> 0x0110, TRY_ENTER, TryCatch #0 {Exception -> 0x0110, blocks: (B:54:0x010c, B:55:0x010f, B:42:0x00cd, B:44:0x00d1, B:46:0x00d7, B:48:0x00dd, B:50:0x00e3, B:51:0x00fe, B:33:0x00b0), top: B:58:0x000e }] */
    private void d(CampaignEx campaignEx, int i10) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        File file;
        File file2 = null;
        fileOutputStream = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream3 = null;
        FileOutputStream fileOutputStream4 = null;
        try {
            try {
                try {
                    com.mbridge.msdk.foundation.same.report.g.a("m_download_start", campaignEx, "", this.f35819a, "6");
                    File file3 = new File(campaignEx.getAdHtml());
                    try {
                        if (file3.exists()) {
                            file = file3;
                        } else {
                            String strB = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML);
                            String md5 = SameMD5.getMD5(c1.b(campaignEx.getAdHtml()));
                            if (TextUtils.isEmpty(md5)) {
                                md5 = String.valueOf(System.currentTimeMillis());
                            }
                            file = new File(strB, md5.concat(".html"));
                            try {
                                if (!file.exists()) {
                                    fileOutputStream = new FileOutputStream(file);
                                    try {
                                        String strInjectScriptContentIntoHtml = ScriptInjector.injectScriptContentIntoHtml(MBridgeConstans.OMID_JS_SERVICE_CONTENT, "<script>" + com.mbridge.msdk.setting.util.a.a().b() + "</script>" + campaignEx.getAdHtml());
                                        if (campaignEx.isActiveOm()) {
                                            strInjectScriptContentIntoHtml = com.mbridge.msdk.omsdk.b.a(strInjectScriptContentIntoHtml);
                                        }
                                        fileOutputStream.write(strInjectScriptContentIntoHtml.getBytes());
                                        fileOutputStream.flush();
                                        fileOutputStream3 = fileOutputStream;
                                    } catch (Exception e10) {
                                        e = e10;
                                        fileOutputStream4 = fileOutputStream;
                                        file3 = file;
                                        e.printStackTrace();
                                        campaignEx.setMraid("");
                                        com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, e.getMessage(), this.f35819a, "6");
                                        if (fileOutputStream4 != null) {
                                            fileOutputStream4.close();
                                        }
                                        file = file3;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Exception e11) {
                                e = e11;
                            }
                        }
                        try {
                            com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, "", this.f35819a, "6");
                            if (fileOutputStream3 != null) {
                                fileOutputStream3.close();
                            }
                        } catch (Exception e12) {
                            e = e12;
                            fileOutputStream2 = fileOutputStream3;
                            file2 = file;
                            file3 = file2;
                            fileOutputStream4 = fileOutputStream2;
                            e.printStackTrace();
                            campaignEx.setMraid("");
                            com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, e.getMessage(), this.f35819a, "6");
                            if (fileOutputStream4 != null) {
                                fileOutputStream4.close();
                            }
                            file = file3;
                        }
                    } catch (Exception e13) {
                        e = e13;
                    }
                } catch (Exception e14) {
                    e = e14;
                    fileOutputStream2 = null;
                }
                if (file.exists() && file.isFile() && file.canRead()) {
                    campaignEx.setAdHtml(file.getAbsolutePath());
                    a("file:////" + file.getAbsolutePath(), campaignEx, i10);
                    return;
                }
                a(new com.mbridge.msdk.foundation.error.b(880013), this.f35830m, i10, campaignEx);
            } catch (Exception unused) {
                a(new com.mbridge.msdk.foundation.error.b(880013), this.f35830m, i10, campaignEx);
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(CampaignEx campaignEx, int i10) {
        if (campaignEx.isDynamicView()) {
            com.mbridge.msdk.splash.common.c.a aVar = new com.mbridge.msdk.splash.common.c.a();
            aVar.b(this.f35819a).a(this.f35820b).a(this.f35827i).a(campaignEx).c(this.f35828j).f(this.f35839v);
            try {
                if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
                    Uri uri = Uri.parse(campaignEx.getAdZip());
                    String queryParameter = uri.getQueryParameter("hdbtn");
                    String queryParameter2 = uri.getQueryParameter("alecfc");
                    String queryParameter3 = uri.getQueryParameter("hdinfo");
                    String queryParameter4 = uri.getQueryParameter("shake_show");
                    String queryParameter5 = uri.getQueryParameter("shake_strength");
                    String queryParameter6 = uri.getQueryParameter("shake_time");
                    String queryParameter7 = uri.getQueryParameter("n_logo");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        aVar.b(Integer.parseInt(queryParameter));
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        aVar.e(Integer.parseInt(queryParameter2));
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        aVar.a(Integer.parseInt(queryParameter3));
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        aVar.g(Integer.parseInt(queryParameter4));
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        aVar.h(Integer.parseInt(queryParameter5));
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        aVar.i(Integer.parseInt(queryParameter6));
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        aVar.d(Integer.parseInt(queryParameter7) == 0 ? 0 : 1);
                    }
                }
            } catch (Throwable th2) {
                q0.b(A, th2.getMessage());
            }
            com.mbridge.msdk.splash.manager.c.a().a(this.f35825g, aVar.a(), new k(campaignEx, i10));
        }
    }

    public void b(int i10) {
        this.f35839v = i10;
    }

    public String c() {
        return com.mbridge.msdk.foundation.same.c.b(this.f35840w);
    }

    private void b() {
        this.f35842y.removeCallbacks(this.f35843z);
    }

    private void c(CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.splash.manager.d.a(this.f35825g, campaignEx, new h(campaignEx, i10));
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f35847a;

        public b(CampaignEx campaignEx) {
            this.f35847a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            e.this.f35825g.setVideoReady(true);
            Message messageObtain = Message.obtain();
            messageObtain.obj = this.f35847a;
            messageObtain.what = 3;
            e.this.f35842y.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) throws Throwable {
            e.this.f35825g.setVideoReady(false);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880004);
            bVar.c(str);
            e eVar = e.this;
            eVar.a(bVar, eVar.f35830m, e.this.f35831n, this.f35847a);
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f35847a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 1);
            messageObtain.obj = bundle;
            messageObtain.what = 2;
            e.this.f35842y.sendMessage(messageObtain);
        }
    }

    private void b(CampaignEx campaignEx, int i10) {
        this.f35834q = new b(campaignEx);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(campaignEx);
        com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f35824f, this.f35819a, copyOnWriteArrayList, 297, this.f35834q);
        if (!com.mbridge.msdk.videocommon.download.b.getInstance().b(297, this.f35819a, campaignEx.isBidCampaign())) {
            com.mbridge.msdk.videocommon.download.b.getInstance().load(this.f35819a);
        } else {
            this.f35825g.setVideoReady(true);
            h(campaignEx, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(CampaignEx campaignEx, int i10) {
        if (this.f35825g.isH5Ready()) {
            return;
        }
        this.f35825g.setH5Ready(true);
        h(campaignEx, i10);
    }

    private void e(CampaignEx campaignEx, int i10) {
        if (campaignEx.isDynamicView()) {
            z.a(5, "", campaignEx.getAdZip(), new i(campaignEx), campaignEx);
            return;
        }
        this.f35835r = new j(campaignEx, i10);
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a(297);
        cVar.e(2);
        cVar.a(campaignEx);
        cVar.f(campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0);
        H5DownLoadManager.getInstance().downloadH5Res(cVar, campaignEx.getAdZip(), this.f35835r);
    }

    public void a(m mVar) {
        this.f35826h = mVar;
    }

    public void a(MBSplashView mBSplashView) {
        this.f35825g = mBSplashView;
    }

    public void a(boolean z10) {
        this.f35827i = z10;
    }

    public void a(int i10) {
        this.f35828j = i10;
    }

    public void a(int i10, int i11) {
        this.l = i10;
        this.f35829k = i11;
    }

    public void a(String str, int i10) {
        this.f35833p = false;
        this.f35830m = str;
        this.f35831n = i10;
        CampaignEx campaignExA = com.mbridge.msdk.splash.manager.d.a(this.f35825g, this.f35820b, this.f35819a, str, this.f35827i, this.f35828j, false, false);
        long timestamp = campaignExA != null ? campaignExA.getTimestamp() : 0L;
        if (this.f35826h.t() == 1 && i10 != 1 && campaignExA != null) {
            i(campaignExA, i10);
            return;
        }
        this.f35832o = true;
        if (i10 == 1) {
            List<Integer> listC = this.f35826h.c();
            if (listC != null && listC.size() > 0) {
                this.f35821c = listC.get(0).intValue() * 1000;
            } else {
                this.f35821c = 30000L;
            }
        } else {
            long j10 = this.f35822d;
            if (j10 <= 0) {
                this.f35821c = this.f35826h.E();
            } else {
                this.f35821c = j10;
            }
        }
        if (this.f35826h == null || timestamp <= 0 || !TextUtils.isEmpty(str)) {
            a(this.f35821c);
            a(this.f35824f, str, i10);
            return;
        }
        if (System.currentTimeMillis() - timestamp > this.f35826h.v() * 1000) {
            a(this.f35821c);
            a(this.f35824f, str, i10);
        } else {
            i(campaignExA, i10);
        }
    }

    private void a(long j10) {
        this.f35842y.postDelayed(this.f35843z, j10);
    }

    private void a(Context context, String str, int i10) throws Throwable {
        Exception exc;
        String str2;
        try {
            if (context == null) {
                a(new com.mbridge.msdk.foundation.error.b(880025), str, i10, (CampaignEx) null);
                return;
            }
            try {
                if (a1.a(this.f35819a)) {
                    a(new com.mbridge.msdk.foundation.error.b(880032), str, i10, (CampaignEx) null);
                    return;
                }
                MBridgeIds mBridgeIds = new MBridgeIds(this.f35820b, this.f35819a);
                com.mbridge.msdk.splash.request.f fVar = new com.mbridge.msdk.splash.request.f();
                fVar.d(i10);
                fVar.c(this.f35837t);
                fVar.a(this.f35836s);
                fVar.b(this.l);
                fVar.a(this.f35829k);
                com.mbridge.msdk.foundation.same.net.wrapper.e eVarB = com.mbridge.msdk.splash.request.e.b(context, mBridgeIds, fVar);
                if (eVarB == null) {
                    a(new com.mbridge.msdk.foundation.error.b(880001), str, i10, (CampaignEx) null);
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    eVarB.a("token", str);
                }
                String strD = v0.d(this.f35819a);
                if (!TextUtils.isEmpty(strD)) {
                    eVarB.a("j", strD);
                }
                com.mbridge.msdk.splash.request.c cVar = new com.mbridge.msdk.splash.request.c(context);
                C0180e c0180e = new C0180e(i10, str, i10);
                c0180e.a(str);
                c0180e.setUnitId(this.f35819a);
                c0180e.setPlacementId(this.f35820b);
                c0180e.setAdType(297);
                str2 = str;
                try {
                    cVar.choiceV3OrV5BySetting(1, eVarB, c0180e, str2, com.mbridge.msdk.foundation.same.c.a(this.f35821c, 30000L));
                    return;
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Exception e11) {
                e = e11;
                str2 = str;
            }
            exc = e;
            q0.b(A, exc.getMessage());
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880020);
            bVar.a((Throwable) exc);
            a(bVar, str2, i10, (CampaignEx) null);
            f();
        } catch (Exception e12) {
            exc = e12;
            str2 = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignUnit campaignUnit, int i10, String str, String str2) throws Throwable {
        com.mbridge.msdk.foundation.error.b bVar;
        List<CampaignEx> listA = a(campaignUnit);
        if (listA != null && listA.size() > 0) {
            g();
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("adtp", 297);
            if (!TextUtils.isEmpty(str2)) {
                eVar.a(CampaignEx.JSON_KEY_HB, 1);
            } else {
                eVar.a(CampaignEx.JSON_KEY_HB, 0);
            }
            CampaignEx campaignEx = listA.get(0);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, str2, eVar, campaignEx, str);
            if (TextUtils.isEmpty(campaignEx.getAdZip()) && (TextUtils.isEmpty(campaignEx.getAdHtml()) || !campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
                campaignEx.setHasMBTplMark(false);
                campaignEx.setIsMraid(true);
            } else {
                campaignEx.setHasMBTplMark(true);
                campaignEx.setIsMraid(false);
            }
            i(campaignEx, i10);
            return;
        }
        if (this.f35841x.contains("INSTALLED")) {
            bVar = new com.mbridge.msdk.foundation.error.b(880021, "APP ALREADY INSTALLED");
        } else {
            bVar = new com.mbridge.msdk.foundation.error.b(880003);
        }
        a(bVar, str2, i10, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
    }

    private List<CampaignEx> a(CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = campaignUnit.getAds().get(0);
        campaignEx.setCampaignUnitId(this.f35819a);
        a(campaignEx);
        this.f35836s = campaignUnit.getSessionId();
        if (campaignEx.getOfferType() != 99 && (!TextUtils.isEmpty(campaignEx.getAdZip()) || !TextUtils.isEmpty(campaignEx.getAdHtml()))) {
            if (v0.c(campaignEx)) {
                campaignEx.setRtinsType(v0.c(this.f35824f, campaignEx.getPackageName()) ? 1 : 2);
            }
            if (com.mbridge.msdk.foundation.same.c.b(this.f35824f, campaignEx)) {
                arrayList.add(campaignEx);
            } else {
                v0.a(this.f35819a, campaignEx, com.mbridge.msdk.foundation.same.a.f33737x);
                this.f35841x = "APP ALREADY INSTALLED";
            }
            a(campaignEx, (com.mbridge.msdk.foundation.same.report.metrics.c) null, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
        return arrayList;
    }

    private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, this.f35824f, cVar, new f(campaignEx, aVar));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    private void a(CampaignEx campaignEx) {
        new Thread(new g(campaignEx)).start();
    }

    public void a(com.mbridge.msdk.splash.middle.b bVar) {
        this.f35823e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar, String str, int i10, CampaignEx campaignEx) throws Throwable {
        if (this.f35832o) {
            this.f35832o = false;
            a(bVar, i10, str, campaignEx);
        } else {
            a(bVar, i10, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, String str, CampaignEx campaignEx) throws Throwable {
        CampaignEx campaignExA = com.mbridge.msdk.splash.manager.d.a(this.f35825g, this.f35820b, this.f35819a, str, this.f35827i, this.f35828j, true, false);
        if (campaignExA != null) {
            i(campaignExA, i10);
        } else {
            a(bVar, i10, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, CampaignEx campaignEx) {
        if (this.f35833p) {
            return;
        }
        b();
        this.f35833p = true;
        if (bVar != null) {
            bVar.a(campaignEx);
        }
        com.mbridge.msdk.splash.middle.b bVar2 = this.f35823e;
        if (bVar2 != null) {
            bVar2.a(bVar, i10);
        }
    }

    private void a(CampaignEx campaignEx, int i10) throws Throwable {
        this.f35825g.clearResState();
        if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
            e(campaignEx, i10);
        }
        if (campaignEx.isDynamicView()) {
            return;
        }
        if (!TextUtils.isEmpty(campaignEx.getAdHtml())) {
            d(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            b(campaignEx, i10);
        }
        if (TextUtils.isEmpty(campaignEx.getImageUrl())) {
            return;
        }
        c(campaignEx, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.splash.manager.g.d dVar = new com.mbridge.msdk.splash.manager.g.d();
        dVar.c(this.f35819a);
        dVar.b(this.f35820b);
        dVar.a(campaignEx);
        dVar.a(str);
        dVar.a(this.f35827i);
        dVar.a(this.f35828j);
        com.mbridge.msdk.splash.manager.g.a().a(this.f35825g, dVar, new a(campaignEx, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10, CampaignEx campaignEx) throws Throwable {
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880009);
        bVar.c(str);
        a(bVar, this.f35830m, i10, campaignEx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, String str, boolean z10, String str2) {
        try {
            n nVar = new n();
            nVar.e(2);
            nVar.j("m_download_end");
            if (campaignEx != null) {
                nVar.b(campaignEx.isMraid() ? n.N : n.O);
                nVar.o(campaignEx.getRequestIdNotice());
            }
            nVar.b("url", str);
            nVar.b("scenes", "1");
            if (z10) {
                nVar.d(1);
            } else {
                nVar.d(3);
                nVar.m(str2);
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, campaignEx);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(A, e10.getMessage());
            }
        }
    }
}

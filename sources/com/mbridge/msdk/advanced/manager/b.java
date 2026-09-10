package com.mbridge.msdk.advanced.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.measurement.f2;
import com.iab.omid.library.mmadbridge.ScriptInjector;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
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
import com.mbridge.msdk.out.MBridgeIds;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static String f31426z = "NativeAdvancedLoadManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f31429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.advanced.middle.b f31430d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MBNativeAdvancedView f31432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.setting.m f31433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<CampaignEx> f31434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CampaignEx f31435i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f31436j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f31437k;
    private int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f31438m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f31439n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f31440o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f31441p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile boolean f31442q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f31443r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private H5DownLoadManager.ZipDownloadListener f31444s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private H5DownLoadManager.ZipDownloadListener f31445t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f31446u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f31447v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f31448w = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Handler f31449x = new e(Looper.getMainLooper());

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Runnable f31450y = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f31431e = com.mbridge.msdk.foundation.controller.c.n().d();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f31451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f31452b;

        public a(CampaignEx campaignEx, int i10) {
            this.f31451a = campaignEx;
            this.f31452b = i10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            q0.a(b.f31426z, "zip 下载失败： " + str2 + " " + str);
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f31451a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 3);
            messageObtain.obj = bundle;
            b.this.f31449x.sendMessage(messageObtain);
            b.this.a(this.f31451a, str2, false, str);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            q0.a(b.f31426z, "zip 下载成功： " + str);
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = this.f31451a;
            messageObtain.arg1 = this.f31452b;
            b.this.f31449x.sendMessage(messageObtain);
            if (z10) {
                return;
            }
            b.this.a(this.f31451a, str, true, "");
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0094b extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f31454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f31455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f31456c;

        public C0094b(CampaignEx campaignEx, int i10, long j10) {
            this.f31454a = campaignEx;
            this.f31455b = i10;
            this.f31456c = j10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) throws Throwable {
            super.a(webView, i10);
            q0.b("NativeAdvancedLoadManager", "=========readyState: " + i10);
            if (i10 != 1) {
                b.this.a(this.f31454a, "readyState 2", this.f31455b);
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f31454a, b.this.f31427a, "readyState 2", this.f31456c, 3);
                return;
            }
            b.this.f31432f.setH5Ready(true);
            com.mbridge.msdk.advanced.common.c.a(b.this.f31428b + b.this.f31427a + this.f31454a.getRequestId(), true);
            b.this.h(this.f31454a, this.f31455b);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f31454a, b.this.f31427a, "", this.f31456c, 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            q0.b("NativeAdvancedLoadManager", "onPageFinished");
            if (!this.f31454a.isHasMBTplMark()) {
                b.this.f31432f.setH5Ready(true);
                q0.b("NativeAdvancedLoadManager", "=======onPageFinished OK");
                com.mbridge.msdk.advanced.common.c.a(b.this.f31428b + b.this.f31427a + this.f31454a.getRequestId(), true);
                b.this.h(this.f31454a, this.f31455b);
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f31454a, b.this.f31427a, "", this.f31456c, 1);
            }
            com.mbridge.msdk.advanced.signal.a.a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) throws Throwable {
            super.onReceivedError(webView, i10, str, str2);
            q0.b("NativeAdvancedLoadManager", "onReceivedError： " + i10 + "  " + str + "  " + str2);
            b.this.a(this.f31454a, str, this.f31455b);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f31454a, b.this.f31427a, defpackage.e.h(i10, "error code:", str), this.f31456c, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) throws Throwable {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            q0.b("NativeAdvancedLoadManager", "onReceivedSslError: " + sslError.getPrimaryError());
            b.this.a(this.f31454a, "onReceivedSslError:" + sslError.getUrl(), this.f31455b);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f31454a, b.this.f31427a, "error url:" + sslError.getUrl(), this.f31456c, 3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MBNativeAdvancedWebview f31458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f31459b;

        public c(MBNativeAdvancedWebview mBNativeAdvancedWebview, String str) {
            this.f31458a = mBNativeAdvancedWebview;
            this.f31459b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f31458a.loadUrl(this.f31459b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) throws Throwable {
            int i10;
            Object obj;
            super.handleMessage(message);
            int i11 = message.what;
            if (i11 == 1) {
                Object obj2 = message.obj;
                int i12 = message.arg1;
                if (obj2 == null || !(obj2 instanceof CampaignEx)) {
                    return;
                }
                CampaignEx campaignEx = (CampaignEx) obj2;
                b.this.a(H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getAdZip()), campaignEx, i12);
                return;
            }
            if (i11 == 2) {
                Object obj3 = message.obj;
                try {
                    if (obj3 instanceof Bundle) {
                        int i13 = ((Bundle) obj3).getInt("type");
                        if (i13 == 1) {
                            i10 = 880004;
                        } else if (i13 == 2) {
                            i10 = 880007;
                        } else {
                            i10 = i13 == 3 ? 880006 : 880024;
                        }
                        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(i10);
                        String string = ((Bundle) obj3).getString(NotificationCompat.CATEGORY_MESSAGE);
                        CampaignEx campaignEx2 = (CampaignEx) ((Bundle) obj3).getSerializable("campaignex");
                        bVar.c(string);
                        bVar.a(campaignEx2);
                        b bVar2 = b.this;
                        bVar2.a(bVar, bVar2.f31439n, b.this.f31440o, campaignEx2);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    com.mbridge.msdk.foundation.error.b bVar3 = new com.mbridge.msdk.foundation.error.b(880000);
                    bVar3.a((Throwable) e10);
                    b bVar4 = b.this;
                    bVar4.a(bVar3, bVar4.f31439n, b.this.f31440o, (CampaignEx) null);
                    return;
                }
            }
            if (i11 == 3) {
                Object obj4 = message.obj;
                if (obj4 == null || !(obj4 instanceof CampaignEx)) {
                    return;
                }
                b bVar5 = b.this;
                bVar5.i((CampaignEx) obj4, bVar5.f31440o);
                return;
            }
            if (i11 != 4) {
                if (i11 == 5 && (obj = message.obj) != null && (obj instanceof CampaignEx)) {
                    if (b.this.f31432f != null) {
                        b.this.f31432f.setVideoReady(true);
                    }
                    b bVar6 = b.this;
                    bVar6.i((CampaignEx) obj, bVar6.f31440o);
                    return;
                }
                return;
            }
            Object obj5 = message.obj;
            if (obj5 == null || !(obj5 instanceof CampaignEx)) {
                return;
            }
            if (b.this.f31432f != null) {
                b.this.f31432f.setEndCardReady(true);
            }
            b bVar7 = b.this;
            bVar7.i((CampaignEx) obj5, bVar7.f31440o);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880010);
            b bVar2 = b.this;
            bVar2.a(bVar, bVar2.f31439n, b.this.f31440o, (CampaignEx) null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class g extends com.mbridge.msdk.advanced.request.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f31465e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f31466f;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Exception f31468a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f31469b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f31470c;

            public a(Exception exc, int i10, CampaignUnit campaignUnit) {
                this.f31468a = exc;
                this.f31469b = i10;
                this.f31470c = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880003);
                bVar.a((Throwable) this.f31468a);
                g gVar = g.this;
                b bVar2 = b.this;
                String str = gVar.f31465e;
                int i10 = this.f31469b;
                CampaignUnit campaignUnit = this.f31470c;
                bVar2.a(bVar, str, i10, (campaignUnit == null || campaignUnit.getAds() == null || this.f31470c.getAds().size() == 0) ? null : this.f31470c.getAds().get(0));
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$g$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class RunnableC0095b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f31472a;

            public RunnableC0095b(String str) {
                this.f31472a = str;
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880002);
                bVar.c(this.f31472a);
                g gVar = g.this;
                b.this.a(bVar, gVar.f31465e, gVar.f31466f, (CampaignEx) null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i10, String str, int i11) {
            super(i10);
            this.f31465e = str;
            this.f31466f = i11;
        }

        @Override // com.mbridge.msdk.advanced.request.b
        public void a(CampaignUnit campaignUnit, int i10) throws Throwable {
            try {
                b bVar = b.this;
                bVar.a(campaignUnit, i10, bVar.f31427a, this.f31465e);
                b.this.f31448w = campaignUnit.getRequestId();
                b.this.f31434h = campaignUnit.getAds();
            } catch (Exception e10) {
                q0.b(b.f31426z, e10.getMessage());
                q0.c(b.f31426z, "onLoadCompaginSuccess 数据刚请求失败");
                if (b.this.f31449x != null) {
                    b.this.f31449x.post(new a(e10, i10, campaignUnit));
                }
                b.this.f();
            }
        }

        @Override // com.mbridge.msdk.advanced.request.b
        public void b(int i10, String str) {
            q0.b(b.f31426z, str);
            q0.c(b.f31426z, "onLoadCompaginFailed load failed errorCode:" + i10 + " msg:" + str);
            if (b.this.f31449x != null) {
                b.this.f31449x.post(new RunnableC0095b(str));
            }
            b.this.f();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class h extends com.mbridge.msdk.foundation.same.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f31474a;

        public h(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            this.f31474a = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            com.mbridge.msdk.advanced.report.a.a(str, cVar, this.f31474a, b.this.f31431e, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f31476a;

        public i(CampaignEx campaignEx) {
            this.f31476a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(b.this.f31431e)).d();
            y.a(b.this.f31431e, this.f31476a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class j implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f31478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f31479b;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j jVar = j.this;
                b.this.i(jVar.f31478a, jVar.f31479b);
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$j$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class RunnableC0096b implements Runnable {
            public RunnableC0096b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j jVar = j.this;
                b.this.i(jVar.f31478a, jVar.f31479b);
            }
        }

        public j(CampaignEx campaignEx, int i10) {
            this.f31478a = campaignEx;
            this.f31479b = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            f2.z("gifurl 下载失败： ", str2, b.f31426z);
            if (b.this.f31449x != null) {
                b.this.f31449x.post(new RunnableC0096b());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            f2.z("giturl 下载成功： ", str, b.f31426z);
            if (b.this.f31449x != null) {
                b.this.f31449x.post(new a());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class k implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f31483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f31484b;

        public k(CampaignEx campaignEx, int i10) {
            this.f31483a = campaignEx;
            this.f31484b = i10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            f2.z("endcard 下载失败： ", str2, b.f31426z);
            if (b.this.f31432f != null) {
                b.this.f31432f.setEndCardReady(false);
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f31483a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 2);
            messageObtain.obj = bundle;
            b.this.f31449x.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            f2.z("endcard 下载成功： ", str, b.f31426z);
            if (b.this.f31449x != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                messageObtain.obj = this.f31483a;
                messageObtain.arg1 = this.f31484b;
                b.this.f31449x.sendMessage(messageObtain);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class l implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f31486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f31487b;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l lVar = l.this;
                b.this.i(lVar.f31486a, lVar.f31487b);
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$l$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class RunnableC0097b implements Runnable {
            public RunnableC0097b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l lVar = l.this;
                b.this.i(lVar.f31486a, lVar.f31487b);
            }
        }

        public l(CampaignEx campaignEx, int i10) {
            this.f31486a = campaignEx;
            this.f31487b = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            f2.z("image 下载失败： ", str2, b.f31426z);
            if (b.this.f31449x != null) {
                b.this.f31449x.post(new RunnableC0097b());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            f2.z("image 下载成功： ", str, b.f31426z);
            if (b.this.f31449x != null) {
                b.this.f31449x.post(new a());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f31491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f31492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f31493c;

        public m(File file, CampaignEx campaignEx, int i10) {
            this.f31491a = file;
            this.f31492b = campaignEx;
            this.f31493c = i10;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            b.this.a("file:////" + this.f31491a.getAbsolutePath(), this.f31492b, this.f31493c);
        }
    }

    public b(String str, String str2, long j10) {
        this.f31428b = str;
        this.f31427a = str2;
    }

    private void b(CampaignEx campaignEx, int i10) {
        f2.g().a(campaignEx.getGifUrl(), new j(campaignEx, i10));
    }

    private void c(CampaignEx campaignEx, int i10) {
        f2.g().a(campaignEx.getImageUrl(), new l(campaignEx, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(CampaignEx campaignEx, int i10) {
        if (!com.mbridge.msdk.advanced.manager.d.a(this.f31432f, campaignEx, this.f31428b, this.f31427a) || this.f31442q) {
            return;
        }
        b();
        com.mbridge.msdk.advanced.manager.d.a(campaignEx, this.f31427a);
        this.f31442q = true;
        com.mbridge.msdk.advanced.middle.b bVar = this.f31430d;
        if (bVar != null) {
            bVar.a(campaignEx, i10);
        }
    }

    private void j(CampaignEx campaignEx, int i10) throws Throwable {
        this.f31435i = campaignEx;
        if (com.mbridge.msdk.advanced.manager.d.a(this.f31432f, campaignEx, this.f31428b, this.f31427a)) {
            i(campaignEx, i10);
        } else {
            e(campaignEx, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f31447v = 0;
    }

    private void g() {
        try {
            int i10 = this.f31447v + 1;
            this.f31447v = i10;
            com.mbridge.msdk.setting.m mVar = this.f31433g;
            if (mVar == null || i10 > mVar.y()) {
                q0.c(f31426z, "onload 重置offset为0");
                this.f31447v = 0;
            }
            q0.c(f31426z, "onload 算出 下次的offset是:" + this.f31447v);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(CampaignEx campaignEx, int i10) {
        if (this.f31432f.isH5Ready()) {
            i(campaignEx, i10);
            com.mbridge.msdk.advanced.report.a.a(1, "", this.f31427a, campaignEx);
        }
    }

    public String d() {
        return this.f31448w;
    }

    public void e() {
        if (this.f31430d != null) {
            this.f31430d = null;
        }
        if (this.f31443r != null) {
            this.f31443r = null;
        }
        if (this.f31444s != null) {
            this.f31444s = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ce A[Catch: all -> 0x00b2, Exception -> 0x0127, TRY_ENTER, TryCatch #6 {all -> 0x00b2, blocks: (B:66:0x0127, B:44:0x00ce, B:46:0x00d2, B:48:0x00d8, B:50:0x00de, B:52:0x00e4, B:54:0x00f6, B:55:0x00ff, B:33:0x00ae), top: B:81:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0133 A[Catch: IOException -> 0x0137, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0137, blocks: (B:68:0x0133, B:57:0x0117), top: B:81:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    private void d(CampaignEx campaignEx, int i10) throws Throwable {
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileOutputStream fileOutputStream2;
        File file;
        FileOutputStream fileOutputStream3 = null;
        fileOutputStream = null;
        fileOutputStream = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream4 = null;
        FileOutputStream fileOutputStream5 = null;
        File file2 = null;
        try {
            try {
                try {
                    try {
                        try {
                            com.mbridge.msdk.foundation.same.report.g.a("m_download_start", campaignEx, "", this.f31427a, "8");
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
                                                fileOutputStream4 = fileOutputStream;
                                            } catch (Exception e10) {
                                                e = e10;
                                                fileOutputStream4 = fileOutputStream;
                                                file3 = file;
                                                e.printStackTrace();
                                                campaignEx.setMraid("");
                                                com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, e.getMessage(), this.f31427a, "8");
                                                if (fileOutputStream4 != null) {
                                                    fileOutputStream4.close();
                                                }
                                                file = file3;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                if (fileOutputStream != null) {
                                                    try {
                                                        fileOutputStream.close();
                                                    } catch (Exception unused) {
                                                        fileOutputStream3 = fileOutputStream;
                                                        a(new com.mbridge.msdk.foundation.error.b(880013), this.f31439n, i10, campaignEx);
                                                        if (fileOutputStream3 == null) {
                                                            fileOutputStream3.close();
                                                        }
                                                        return;
                                                    } catch (Throwable th4) {
                                                        th2 = th4;
                                                        fileOutputStream5 = fileOutputStream;
                                                        if (fileOutputStream5 != null) {
                                                            try {
                                                                fileOutputStream5.close();
                                                            } catch (IOException e11) {
                                                                q0.b(f31426z, e11.getMessage());
                                                            }
                                                        }
                                                        throw th2;
                                                    }
                                                }
                                                throw th;
                                            }
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                    }
                                }
                                try {
                                    com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, "", this.f31427a, "8");
                                    if (fileOutputStream4 != null) {
                                        fileOutputStream4.close();
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    fileOutputStream2 = fileOutputStream4;
                                    file2 = file;
                                    file3 = file2;
                                    fileOutputStream4 = fileOutputStream2;
                                    e.printStackTrace();
                                    campaignEx.setMraid("");
                                    com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, e.getMessage(), this.f31427a, "8");
                                    if (fileOutputStream4 != null) {
                                        fileOutputStream4.close();
                                    }
                                    file = file3;
                                }
                            } catch (Exception e14) {
                                e = e14;
                            }
                        } catch (Exception unused2) {
                            a(new com.mbridge.msdk.foundation.error.b(880013), this.f31439n, i10, campaignEx);
                            if (fileOutputStream3 == null) {
                                return;
                            } else {
                                fileOutputStream3.close();
                            }
                        }
                    } catch (Exception e15) {
                        e = e15;
                        fileOutputStream2 = null;
                    }
                    if (file.exists() && file.isFile() && file.canRead()) {
                        campaignEx.setAdHtml(file.getAbsolutePath());
                        q0.a(f31426z, "开始渲染 HTML： ");
                        Handler handler = this.f31449x;
                        if (handler != null) {
                            handler.post(new m(file, campaignEx, i10));
                        }
                    } else {
                        q0.a(f31426z, "渲染 HTML 失败： html file write failed");
                        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880013);
                        a(bVar, this.f31439n, i10, campaignEx);
                        a(bVar, this.f31439n, i10, campaignEx);
                    }
                    if (fileOutputStream4 != null) {
                        fileOutputStream4.close();
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    if (fileOutputStream5 != null) {
                        fileOutputStream5.close();
                    }
                    throw th2;
                }
            } catch (IOException e16) {
                q0.b(f31426z, e16.getMessage());
            }
        } catch (Throwable th6) {
            th = th6;
            fileOutputStream = null;
        }
    }

    private void f(CampaignEx campaignEx, int i10) {
        this.f31443r = new d(campaignEx);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(campaignEx);
        com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f31431e, this.f31427a, copyOnWriteArrayList, 298, this.f31443r);
        if (!com.mbridge.msdk.videocommon.download.b.getInstance().b(298, this.f31427a, campaignEx.isBidCampaign())) {
            q0.a(f31426z, " load Video");
            com.mbridge.msdk.videocommon.download.b.getInstance().load(this.f31427a);
        } else {
            q0.a(f31426z, " load Video isReady true");
            this.f31432f.setVideoReady(true);
            i(campaignEx, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f31461a;

        public d(CampaignEx campaignEx) {
            this.f31461a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            q0.a(b.f31426z, "Video 下载成功： " + str);
            Message messageObtain = Message.obtain();
            messageObtain.obj = this.f31461a;
            messageObtain.what = 5;
            b.this.f31449x.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            q0.a(b.f31426z, "Video 下载失败： " + str);
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f31461a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 1);
            messageObtain.obj = bundle;
            messageObtain.what = 2;
            b.this.f31449x.sendMessage(messageObtain);
        }
    }

    public String c() {
        return com.mbridge.msdk.foundation.same.c.b(this.f31434h);
    }

    private void e(CampaignEx campaignEx, int i10) throws Throwable {
        MBNativeAdvancedView mBNativeAdvancedView = this.f31432f;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.clearResState();
        }
        if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
            q0.a(f31426z, "开始下载zip： " + campaignEx.getAdZip());
            g(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getAdHtml())) {
            q0.a(f31426z, "开始下载HTML： " + campaignEx.getAdHtml());
            d(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            q0.a(f31426z, "开始下载Video： " + campaignEx.getVideoUrlEncode());
            f(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
            q0.a(f31426z, "开始下载image： " + campaignEx.getImageUrl());
            c(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
            q0.a(f31426z, "开始下载EndCard： " + campaignEx.getendcard_url());
            a(campaignEx, i10);
        }
        if (TextUtils.isEmpty(campaignEx.getGifUrl())) {
            return;
        }
        q0.a(f31426z, "开始下载gitUrl： " + campaignEx.getGifUrl());
        b(campaignEx, i10);
    }

    private void g(CampaignEx campaignEx, int i10) {
        String adZip;
        this.f31444s = new a(campaignEx, i10);
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a(campaignEx);
        int i11 = 0;
        if (campaignEx != null) {
            i11 = campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0;
            adZip = campaignEx.getAdZip();
        } else {
            adZip = "";
        }
        cVar.f(i11);
        cVar.e(2);
        H5DownLoadManager.getInstance().downloadH5Res(cVar, adZip, this.f31444s);
    }

    public void b(String str, int i10) throws Throwable {
        String str2;
        CampaignEx campaignExA;
        List<Integer> listC;
        this.f31442q = false;
        this.f31439n = str;
        this.f31440o = i10;
        this.f31435i = null;
        if (this.f31432f == null) {
            a(new com.mbridge.msdk.foundation.error.b(880030), str, i10, (CampaignEx) null);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f31432f, this.f31428b, this.f31427a, str, this.f31436j, false, false);
            str2 = str;
        } else {
            str2 = str;
            campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f31432f, this.f31428b, this.f31427a, str2, this.f31436j, false, true);
        }
        long timestamp = campaignExA != null ? campaignExA.getTimestamp() : 0L;
        com.mbridge.msdk.setting.m mVar = this.f31433g;
        if (mVar != null && mVar.t() == 1 && this.f31432f != null && campaignExA != null) {
            j(campaignExA, i10);
            return;
        }
        this.f31441p = false;
        com.mbridge.msdk.setting.m mVar2 = this.f31433g;
        if (mVar2 != null && (listC = mVar2.c()) != null && listC.size() > 0) {
            this.f31429c = listC.get(0).intValue() * 1000;
        } else {
            this.f31429c = 30000L;
        }
        q0.a(f31426z, "开始从V3请求新的 offer，超时 ：" + this.f31429c);
        if (this.f31433g == null || timestamp <= 0 || !TextUtils.isEmpty(str2)) {
            a(this.f31429c);
            a(this.f31431e, str2, i10);
        } else if (System.currentTimeMillis() - timestamp > this.f31433g.v() * 1000) {
            a(this.f31429c);
            a(this.f31431e, str2, i10);
        } else {
            j(campaignExA, i10);
        }
    }

    public void a(com.mbridge.msdk.setting.m mVar) {
        this.f31433g = mVar;
    }

    public void a(MBNativeAdvancedView mBNativeAdvancedView) {
        this.f31432f = mBNativeAdvancedView;
    }

    public void a(int i10) {
        this.f31436j = i10;
    }

    public void a(int i10, int i11) {
        this.f31438m = i10;
        this.l = i11;
    }

    private void a(long j10) {
        this.f31449x.postDelayed(this.f31450y, j10);
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
                if (a1.a(this.f31427a)) {
                    a(new com.mbridge.msdk.foundation.error.b(880032), str, i10, (CampaignEx) null);
                    return;
                }
                try {
                    com.mbridge.msdk.advanced.manager.d.b(this.f31427a);
                } catch (Throwable th2) {
                    q0.b(f31426z, th2.getMessage());
                }
                q0.c(f31426z, "load 开始准备请求参数");
                MBridgeIds mBridgeIds = new MBridgeIds(this.f31428b, this.f31427a);
                com.mbridge.msdk.advanced.request.f fVar = new com.mbridge.msdk.advanced.request.f();
                fVar.d(i10);
                fVar.c(this.f31447v);
                fVar.a(this.f31446u);
                fVar.b(this.f31438m);
                fVar.a(this.l);
                com.mbridge.msdk.foundation.same.net.wrapper.e eVarB = com.mbridge.msdk.advanced.request.e.b(context, mBridgeIds, fVar);
                if (eVarB == null) {
                    q0.c(f31426z, "load 请求参数为空 load失败");
                    a(new com.mbridge.msdk.foundation.error.b(880001), str, i10, (CampaignEx) null);
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    eVarB.a("token", str);
                }
                String strD = v0.d(this.f31427a);
                if (!TextUtils.isEmpty(strD)) {
                    eVarB.a("j", strD);
                }
                str2 = str;
                try {
                    new com.mbridge.msdk.advanced.request.c(context).choiceV3OrV5BySetting(1, eVarB, a(str, i10), str2, com.mbridge.msdk.foundation.same.c.a(this.f31429c, 30000L));
                    return;
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Exception e11) {
                e = e11;
                str2 = str;
            }
            exc = e;
            q0.b(f31426z, exc.getMessage());
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880020);
            bVar.a((Throwable) exc);
            a(bVar, str2, i10, (CampaignEx) null);
            f();
        } catch (Exception e12) {
            exc = e12;
            str2 = str;
        }
    }

    private void b() {
        this.f31449x.removeCallbacks(this.f31450y);
    }

    @NonNull
    private com.mbridge.msdk.advanced.request.b a(String str, int i10) {
        g gVar = new g(i10, str, i10);
        gVar.a(str);
        gVar.setUnitId(this.f31427a);
        gVar.setPlacementId(this.f31428b);
        gVar.setAdType(298);
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignUnit campaignUnit, int i10, String str, String str2) throws Throwable {
        String str3;
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 298);
        if (!TextUtils.isEmpty(str2)) {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        }
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            str3 = str2;
        } else {
            str3 = str2;
            campaignUnit.setLocalRequestId(com.mbridge.msdk.foundation.same.report.metrics.d.b().a(i10 == 1, str3, eVar, campaignUnit.getAds().get(0), str).t());
        }
        List<CampaignEx> listA = a(campaignUnit);
        if (listA != null && listA.size() > 0) {
            g();
            q0.c(f31426z, "onload load成功 size:" + listA.size());
            CampaignEx campaignEx = listA.get(0);
            if (TextUtils.isEmpty(campaignEx.getAdZip()) && (TextUtils.isEmpty(campaignEx.getAdHtml()) || !campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
                campaignEx.setHasMBTplMark(false);
                campaignEx.setIsMraid(true);
            } else {
                campaignEx.setHasMBTplMark(true);
                campaignEx.setIsMraid(false);
            }
            j(campaignEx, i10);
            return;
        }
        q0.c(f31426z, "onload load失败 返回的compaign没有可以用的");
        a(new com.mbridge.msdk.foundation.error.b(880033), str3, i10, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
    }

    private List<CampaignEx> a(CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = campaignUnit.getAds().get(0);
        campaignEx.setLocalRequestId(campaignUnit.getLocalRequestId());
        campaignEx.setCampaignUnitId(this.f31427a);
        a(campaignEx);
        this.f31446u = campaignUnit.getSessionId();
        if (campaignEx.getOfferType() != 99 && (!TextUtils.isEmpty(campaignEx.getAdZip()) || !TextUtils.isEmpty(campaignEx.getAdHtml()))) {
            if (v0.c(campaignEx)) {
                campaignEx.setRtinsType(v0.c(this.f31431e, campaignEx.getPackageName()) ? 1 : 2);
            }
            if (com.mbridge.msdk.foundation.same.c.b(this.f31431e, campaignEx)) {
                arrayList.add(campaignEx);
            } else {
                v0.a(this.f31427a, campaignEx, com.mbridge.msdk.foundation.same.a.f33737x);
            }
            a(campaignEx, (com.mbridge.msdk.foundation.same.report.metrics.c) null, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
        return arrayList;
    }

    private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, this.f31431e, cVar, new h(campaignEx, aVar));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    private void a(CampaignEx campaignEx) {
        new Thread(new i(campaignEx)).start();
    }

    public void a(com.mbridge.msdk.advanced.middle.b bVar) {
        this.f31430d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar, String str, int i10, CampaignEx campaignEx) throws Throwable {
        if (this.f31441p) {
            this.f31441p = false;
            a(bVar, i10, str);
        } else {
            if (bVar != null) {
                bVar.a(campaignEx);
            }
            a(bVar, i10, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, String str) throws Throwable {
        CampaignEx campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f31432f, this.f31428b, this.f31427a, str, this.f31436j, true, true);
        if (campaignExA != null) {
            q0.b(f31426z, "load failed cache ");
            j(campaignExA, i10);
        } else {
            a(bVar, i10, campaignExA);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, CampaignEx campaignEx) {
        if (this.f31442q) {
            return;
        }
        b();
        if (bVar != null) {
            q0.b(f31426z, "real failed: " + bVar.l());
        }
        this.f31442q = true;
        com.mbridge.msdk.advanced.middle.b bVar2 = this.f31430d;
        if (bVar2 != null) {
            bVar2.a(bVar, i10);
        }
    }

    private void a(CampaignEx campaignEx, int i10) {
        String str;
        this.f31445t = new k(campaignEx, i10);
        int i11 = 0;
        if (campaignEx != null) {
            i11 = campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0;
            str = campaignEx.getendcard_url();
        } else {
            str = "";
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a(campaignEx);
        cVar.f(i11);
        H5DownLoadManager.getInstance().downloadH5Res(cVar, str, this.f31445t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, CampaignEx campaignEx, int i10) throws Throwable {
        MBNativeAdvancedView mBNativeAdvancedView = this.f31432f;
        if (mBNativeAdvancedView == null || mBNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        com.mbridge.msdk.advanced.report.a.b(this.f31427a, campaignEx);
        com.mbridge.msdk.advanced.signal.b bVar = new com.mbridge.msdk.advanced.signal.b(this.f31432f.getContext(), this.f31428b, this.f31427a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        bVar.a(arrayList);
        bVar.a(this.f31436j);
        bVar.b(this.f31437k);
        this.f31432f.setAdvancedNativeSignalCommunicationImpl(bVar);
        long jCurrentTimeMillis = System.currentTimeMillis();
        MBNativeAdvancedWebview advancedNativeWebview = this.f31432f.getAdvancedNativeWebview();
        if (advancedNativeWebview == null) {
            a(campaignEx, "webview is null", i10);
            return;
        }
        if (advancedNativeWebview.isDestoryed()) {
            a(campaignEx, "webview is destroyed", i10);
            return;
        }
        advancedNativeWebview.setWebViewListener(new C0094b(campaignEx, i10, jCurrentTimeMillis));
        if (!advancedNativeWebview.isDestoryed()) {
            f2.s("=======开始渲染: ", str, f31426z);
            Handler handler = this.f31449x;
            if (handler != null) {
                handler.post(new c(advancedNativeWebview, str));
                return;
            }
            return;
        }
        a(new com.mbridge.msdk.foundation.error.b(880031), this.f31439n, i10, campaignEx);
        com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, this.f31427a, "webview had destory", jCurrentTimeMillis, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, String str, int i10) throws Throwable {
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880009);
        bVar.c(str);
        a(bVar, this.f31439n, i10, campaignEx);
        com.mbridge.msdk.advanced.report.a.a(2, str, this.f31427a, campaignEx);
    }

    public String a(String str) {
        int iO;
        if (this.f31435i != null) {
            try {
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f31427a, this.f31435i.getId() + this.f31435i.getVideoUrlEncode() + this.f31435i.getBidToken());
                if (aVarA != null && (iO = aVarA.o()) == 5) {
                    String strP = aVarA.p();
                    if (new File(strP).exists()) {
                        q0.b(f31426z, "本地已下载完 拿本地播放地址：" + strP + " state：" + iO);
                        return strP;
                    }
                }
            } catch (Exception e10) {
                q0.b(f31426z, e10.getMessage());
            }
            return str;
        }
        return "";
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
                q0.b(f31426z, e10.getMessage());
            }
        }
    }
}

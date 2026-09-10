package com.mbridge.msdk.advanced.manager;

import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.setting.i;
import d5.u;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f31497a = "ResManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f31498b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static e f31499c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f31500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f31501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignEx f31502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ MBNativeAdvancedView f31503d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f31504e;

        public a(String str, String str2, CampaignEx campaignEx, MBNativeAdvancedView mBNativeAdvancedView, long j10) {
            this.f31500a = str;
            this.f31501b = str2;
            this.f31502c = campaignEx;
            this.f31503d = mBNativeAdvancedView;
            this.f31504e = j10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            super.a(webView, i10);
            if (i10 != 1) {
                this.f31503d.setH5Ready(false);
                q0.a("WindVaneWebView", "======渲染失败");
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f31502c, this.f31501b, "readyState 2", this.f31504e, 3);
                return;
            }
            com.mbridge.msdk.advanced.common.c.a(this.f31500a + this.f31501b + this.f31502c.getRequestId(), true);
            this.f31503d.setH5Ready(true);
            q0.a("WindVaneWebView", "======渲染成功：ready");
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f31502c, this.f31501b, "", this.f31504e, 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.f31502c.isHasMBTplMark()) {
                com.mbridge.msdk.advanced.common.c.a(this.f31500a + this.f31501b + this.f31502c.getRequestId(), true);
                this.f31503d.setH5Ready(true);
                q0.a("WindVaneWebView", "======渲染成功：finish");
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f31502c, this.f31501b, "", this.f31504e, 1);
            }
            com.mbridge.msdk.advanced.signal.a.a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            this.f31503d.setH5Ready(false);
            q0.a("WindVaneWebView", "======渲染失败");
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f31502c, this.f31501b, defpackage.e.h(i10, "error code:", str), this.f31504e, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            this.f31503d.setH5Ready(false);
            q0.a("WindVaneWebView", "======渲染失败");
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f31502c, this.f31501b, "error url:" + sslError.getUrl(), this.f31504e, 3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MBNativeAdvancedWebview f31505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f31506b;

        public b(MBNativeAdvancedWebview mBNativeAdvancedWebview, String str) {
            this.f31505a = mBNativeAdvancedWebview;
            this.f31506b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f31505a.loadUrl(this.f31506b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0075  */
    /* JADX WARN: Code duplicated, block: B:22:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:49:0x0102  */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x0097, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x0102, please report this as an issue */
    public static CampaignEx a(MBNativeAdvancedView mBNativeAdvancedView, String str, String str2, String str3, int i10, boolean z10, boolean z11) {
        com.mbridge.msdk.setting.g gVarI = f2.i(i.b());
        if (gVarI == null) {
            gVarI = i.b().a();
        }
        long jC0 = gVarI.c0() * 1000;
        long jD0 = gVarI.d0() * 1000;
        a(jD0, str2);
        List<CampaignEx> listA = a(str2, str3);
        if (listA != null && listA.size() > 0) {
            CampaignEx campaignEx = listA.get(0);
            if (TextUtils.isEmpty(campaignEx.getAdZip()) && TextUtils.isEmpty(campaignEx.getAdHtml())) {
                return null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = jCurrentTimeMillis - jC0;
            if (z10) {
                if (campaignEx.getPlct() > 0) {
                    if (campaignEx.getTimestamp() + (campaignEx.getPlct() * 1000) < jCurrentTimeMillis) {
                        if (campaignEx.getPlct() <= 0 || campaignEx.getTimestamp() < j10) {
                            if (!a(mBNativeAdvancedView, campaignEx, str, str2, i10, z11) && campaignEx.isSpareOffer(jC0, jD0)) {
                                return a(campaignEx);
                            }
                            if (!campaignEx.isSpareOffer(jC0, jD0) && mBNativeAdvancedView != null) {
                                mBNativeAdvancedView.setVisibility(8);
                            }
                        } else if (a(mBNativeAdvancedView, campaignEx, str, str2, i10, z11)) {
                            q0.b(f31497a, "cache campain is picked:" + campaignEx.getAppName());
                            return a(campaignEx);
                        }
                    } else if (a(mBNativeAdvancedView, campaignEx, str, str2, i10, z11)) {
                        q0.b(f31497a, "cache campain is picked:" + campaignEx.getAppName());
                        return a(campaignEx);
                    }
                } else {
                    if (campaignEx.getPlct() <= 0) {
                    }
                    if (!a(mBNativeAdvancedView, campaignEx, str, str2, i10, z11)) {
                    }
                    if (!campaignEx.isSpareOffer(jC0, jD0)) {
                        mBNativeAdvancedView.setVisibility(8);
                    }
                }
            } else if (campaignEx.getPlct() > 0) {
                if (campaignEx.getTimestamp() + (campaignEx.getPlct() * 1000) < jCurrentTimeMillis) {
                    if (campaignEx.getPlct() <= 0 || campaignEx.getTimestamp() < j10) {
                        q0.a(f31497a, "========已经超了缓存时间");
                        if (!campaignEx.isSpareOffer(jC0, jD0) && mBNativeAdvancedView != null) {
                            mBNativeAdvancedView.setVisibility(8);
                            return null;
                        }
                    } else if (a(mBNativeAdvancedView, campaignEx, str, str2, i10, z11)) {
                        q0.b(f31497a, "cache campain is picked:" + campaignEx.getAppName());
                        return a(campaignEx);
                    }
                } else if (a(mBNativeAdvancedView, campaignEx, str, str2, i10, z11)) {
                    q0.b(f31497a, "cache campain is picked:" + campaignEx.getAppName());
                    return a(campaignEx);
                }
            } else {
                if (campaignEx.getPlct() <= 0) {
                }
                q0.a(f31497a, "========已经超了缓存时间");
                if (!campaignEx.isSpareOffer(jC0, jD0)) {
                    mBNativeAdvancedView.setVisibility(8);
                    return null;
                }
            }
        }
        return null;
    }

    public static void b(String str) {
        if (f31499c == null) {
            f31499c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        f31499c.a(str, 0, f31498b);
    }

    private static List<CampaignEx> a(String str, String str2) {
        if (f31499c == null) {
            f31499c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        return f31499c.b(str, 0, 0, f31498b);
    }

    private static CampaignEx a(CampaignEx campaignEx) {
        if (TextUtils.isEmpty(campaignEx.getAdZip()) && (TextUtils.isEmpty(campaignEx.getAdHtml()) || !campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
            campaignEx.setHasMBTplMark(false);
            campaignEx.setIsMraid(true);
            return campaignEx;
        }
        campaignEx.setHasMBTplMark(true);
        campaignEx.setIsMraid(false);
        return campaignEx;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    public static boolean a(MBNativeAdvancedView mBNativeAdvancedView, CampaignEx campaignEx, String str, String str2, int i10, boolean z10) {
        boolean z11;
        if (campaignEx == null) {
            return false;
        }
        mBNativeAdvancedView.clearResState();
        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            boolean zB = com.mbridge.msdk.videocommon.download.b.getInstance().b(298, str2, campaignEx.isBidCampaign());
            if (zB) {
                mBNativeAdvancedView.setVideoReady(true);
            }
            z11 = zB;
        } else {
            mBNativeAdvancedView.setVideoReady(true);
            z11 = true;
        }
        if (!TextUtils.isEmpty(campaignEx.getendcard_url()) && !mBNativeAdvancedView.isEndCardReady() && !TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getendcard_url()))) {
            mBNativeAdvancedView.setEndCardReady(true);
        }
        if (!TextUtils.isEmpty(campaignEx.getAdZip()) && !mBNativeAdvancedView.isH5Ready()) {
            String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getAdZip());
            if (TextUtils.isEmpty(h5ResAddress)) {
                z11 = false;
            } else {
                StringBuilder sbJ = u.j(str, str2);
                sbJ.append(campaignEx.getRequestId());
                if (com.mbridge.msdk.advanced.common.c.a(sbJ.toString())) {
                    mBNativeAdvancedView.setH5Ready(true);
                } else {
                    a(mBNativeAdvancedView, h5ResAddress, campaignEx, str, str2, i10);
                    if (!z10) {
                        z11 = false;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(campaignEx.getAdZip()) && !TextUtils.isEmpty(campaignEx.getAdHtml()) && !mBNativeAdvancedView.isH5Ready()) {
            String strA = a(campaignEx.getAdHtml());
            if (!TextUtils.isEmpty(strA)) {
                StringBuilder sbJ2 = u.j(str, str2);
                sbJ2.append(campaignEx.getRequestId());
                if (com.mbridge.msdk.advanced.common.c.a(sbJ2.toString())) {
                    mBNativeAdvancedView.setH5Ready(true);
                    if (campaignEx.isMraid()) {
                        mBNativeAdvancedView.setVideoReady(true);
                    }
                    return true;
                }
                a(mBNativeAdvancedView, strA, campaignEx, str, str2, i10);
                if (!z10) {
                }
            }
            return false;
        }
        return z11;
    }

    private static void a(MBNativeAdvancedView mBNativeAdvancedView, String str, CampaignEx campaignEx, String str2, String str3, int i10) {
        if (mBNativeAdvancedView == null || mBNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        com.mbridge.msdk.advanced.report.a.b(str3, campaignEx);
        com.mbridge.msdk.advanced.signal.b bVar = new com.mbridge.msdk.advanced.signal.b(mBNativeAdvancedView.getContext(), str2, str3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        bVar.a(arrayList);
        bVar.a(i10);
        mBNativeAdvancedView.setAdvancedNativeSignalCommunicationImpl(bVar);
        MBNativeAdvancedWebview advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview();
        long jCurrentTimeMillis = System.currentTimeMillis();
        advancedNativeWebview.setWebViewListener(new a(str2, str3, campaignEx, mBNativeAdvancedView, jCurrentTimeMillis));
        if (!advancedNativeWebview.isDestoryed()) {
            q0.a(f31497a, "======开始渲染：" + str);
            new Handler(Looper.getMainLooper()).post(new b(advancedNativeWebview, str));
            return;
        }
        mBNativeAdvancedView.setH5Ready(false);
        com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, str3, "webview had destory", jCurrentTimeMillis, 3);
    }

    private static String a(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            return "file:///" + file.getAbsolutePath();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Exception e10) {
                e10.getMessage();
                return "";
            }
        }
    }

    public static boolean a(MBNativeAdvancedView mBNativeAdvancedView, CampaignEx campaignEx, String str, String str2) {
        boolean zA;
        boolean z10 = false;
        if (mBNativeAdvancedView == null) {
            q0.b(f31497a, "mbAdvancedNativeView  is null");
            return false;
        }
        if (TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            zA = true;
        } else {
            zA = mBNativeAdvancedView.isVideoReady();
            q0.b(f31497a, "======isReady isVideoReady:" + zA);
        }
        if (zA && !TextUtils.isEmpty(campaignEx.getAdZip())) {
            StringBuilder sbJ = u.j(str, str2);
            sbJ.append(campaignEx.getRequestId());
            zA = com.mbridge.msdk.advanced.common.c.a(sbJ.toString());
            q0.b(f31497a, "======isReady getAdZip:" + zA);
        }
        if (zA && TextUtils.isEmpty(campaignEx.getAdZip()) && !TextUtils.isEmpty(campaignEx.getAdHtml())) {
            StringBuilder sbJ2 = u.j(str, str2);
            sbJ2.append(campaignEx.getRequestId());
            zA = com.mbridge.msdk.advanced.common.c.a(sbJ2.toString());
            q0.b(f31497a, "======isReady getAdHtml:" + zA);
        }
        if (TextUtils.isEmpty(campaignEx.getAdZip()) && TextUtils.isEmpty(campaignEx.getAdHtml())) {
            q0.b(f31497a, "======isReady getAdHtml  getAdZip all are empty");
        } else {
            z10 = zA;
        }
        if (!z10 || TextUtils.isEmpty(campaignEx.getendcard_url())) {
            return z10;
        }
        boolean zIsEndCardReady = mBNativeAdvancedView.isEndCardReady();
        q0.b(f31497a, "======isReady isEndCardReady:" + zIsEndCardReady);
        return zIsEndCardReady;
    }

    public static void a(CampaignEx campaignEx, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        if (f31499c == null) {
            f31499c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        f31499c.a(arrayList, str);
    }

    public static void a(long j10, String str) {
        if (f31499c == null) {
            f31499c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        f31499c.a(j10, str);
    }
}

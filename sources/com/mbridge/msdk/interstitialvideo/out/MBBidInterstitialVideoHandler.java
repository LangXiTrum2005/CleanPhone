package com.mbridge.msdk.interstitialvideo.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.reward.controller.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class MBBidInterstitialVideoHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f34365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f34368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f34369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f34370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f34371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterstitialVideoListener f34372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f34373i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f34374j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f34375k = false;
    private boolean l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f34376m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f34377n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f34378o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f34379p;

    public MBBidInterstitialVideoHandler(Context context, String str, String str2) {
        if (c.n().d() == null && context != null) {
            c.n().b(context);
        }
        a(str, str2);
    }

    private void a(String str, String str2) {
        String strE = v0.e(str2);
        if (!TextUtils.isEmpty(strE)) {
            v0.d(str2, strE);
        }
        this.f34366b = str2;
        this.f34367c = str;
        a();
    }

    private void b(String str, String str2) {
        try {
            if (this.f34365a == null) {
                a aVar = new a();
                this.f34365a = aVar;
                aVar.d(true);
                this.f34365a.e(true);
                this.f34365a.c(str, str2);
            }
        } catch (Throwable th2) {
            q0.b("MBBidRewardVideoHandler", th2.getMessage(), th2);
        }
    }

    public void clearVideoCache() {
        try {
            a aVar = this.f34365a;
            if (aVar != null) {
                aVar.e();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        a aVar = this.f34365a;
        return aVar != null ? aVar.j() : "";
    }

    public String getRequestId() {
        a aVar = this.f34365a;
        return aVar != null ? aVar.m() : "";
    }

    public boolean isBidReady() {
        a();
        a aVar = this.f34365a;
        if (aVar != null) {
            return aVar.c(true);
        }
        return false;
    }

    public void loadFormSelfFilling() {
        a();
        if (this.f34365a != null) {
            this.f34365a.a(false, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f34366b, true, 1));
        }
    }

    public void loadFromBid(String str) {
        a();
        if (this.f34365a != null) {
            this.f34365a.a(true, str, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f34366b, true, 2));
        }
    }

    public void playVideoMute(int i10) {
        this.f34373i = i10;
        a aVar = this.f34365a;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f34368d = str;
        this.f34369e = str2;
        this.f34370f = str3;
        this.f34371g = str4;
        this.f34375k = true;
        this.l = true;
        MBridgeGlobalCommon.setAlertDialogText(this.f34366b, str, str2, str3, str4);
    }

    public void setIVRewardEnable(int i10, int i11) {
        this.f34377n = i10;
        this.f34378o = i11;
        this.f34379p = com.mbridge.msdk.foundation.same.a.K;
        this.f34376m = true;
        b();
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f34372h = interstitialVideoListener;
        this.f34374j = true;
        a aVar = this.f34365a;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f34365a.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener, this.f34366b, true));
        this.f34374j = false;
    }

    @Deprecated
    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f34372h = interstitialVideoListener;
        this.f34374j = true;
        a aVar = this.f34365a;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f34365a.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener, this.f34366b, true));
        this.f34374j = false;
    }

    public void showFromBid() {
        a();
        if (this.f34365a != null) {
            this.f34365a.a((String) null, (String) null, (String) null, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f34366b, false, -1));
        }
    }

    public void setIVRewardEnable(int i10, double d10) {
        this.f34377n = i10;
        this.f34378o = (int) (d10 * 100.0d);
        this.f34379p = com.mbridge.msdk.foundation.same.a.J;
        this.f34376m = true;
        b();
    }

    private void a() {
        a aVar;
        if (this.f34365a == null) {
            b(this.f34367c, this.f34366b);
        }
        if (this.f34374j) {
            a aVar2 = this.f34365a;
            if (aVar2 != null) {
                aVar2.a(new com.mbridge.msdk.interstitialvideo.listener.a(this.f34372h, this.f34366b, true));
            }
            this.f34374j = false;
        }
        if (this.f34375k) {
            a aVar3 = this.f34365a;
            if (aVar3 != null) {
                aVar3.a(this.f34368d, this.f34369e, this.f34370f, this.f34371g);
            }
            this.f34375k = false;
        }
        if (!this.f34376m || (aVar = this.f34365a) == null) {
            return;
        }
        aVar.a(this.f34377n, this.f34379p, this.f34378o);
        this.f34376m = false;
    }

    private void b() {
        a aVar = this.f34365a;
        if (aVar != null) {
            aVar.a(this.f34377n, this.f34379p, this.f34378o);
        }
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        a(str, str2);
    }
}

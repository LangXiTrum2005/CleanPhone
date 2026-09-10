package com.mbridge.msdk.newinterstitial.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.BaseExtraInterfaceForHandler;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.reward.controller.a;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class MBBidInterstitialVideoHandler implements BaseExtraInterfaceForHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f35093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f35094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f35095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private NewInterstitialListener f35096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f35097h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f35098i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f35099j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f35100k = false;
    private int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f35101m;
    public String mUnitId;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f35102n;

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
        this.mUnitId = str2;
        this.f35090a = str;
        a();
    }

    private void b(String str, String str2) {
        try {
            if (this.f35095f == null) {
                a aVar = new a();
                this.f35095f = aVar;
                aVar.d(true);
                this.f35095f.e(true);
                this.f35095f.c(str, str2);
            }
        } catch (Throwable th2) {
            q0.b("MBBidInterstitialVideoHandler", th2.getMessage(), th2);
        }
    }

    private void c() {
        a aVar = this.f35095f;
        if (aVar != null) {
            aVar.a(this.l, this.f35102n, this.f35101m);
        }
    }

    public void clearVideoCache() {
        try {
            a aVar = this.f35095f;
            if (aVar != null) {
                aVar.e();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        a aVar = this.f35095f;
        return aVar != null ? aVar.j() : "";
    }

    public String getRequestId() {
        a aVar = this.f35095f;
        return aVar != null ? aVar.m() : "";
    }

    public boolean isBidReady() {
        a();
        a aVar = this.f35095f;
        if (aVar != null) {
            return aVar.c(true);
        }
        return false;
    }

    public void loadFormSelfFilling() {
        a();
        if (this.f35095f != null) {
            this.f35095f.a(false, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.mUnitId, true, 1));
        }
    }

    public void loadFromBid(String str) {
        a();
        if (this.f35095f != null) {
            this.f35095f.a(true, str, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.mUnitId, true, 2));
        }
    }

    public void playVideoMute(int i10) {
        this.f35097h = i10;
        a aVar = this.f35095f;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f35092c = str;
        this.f35091b = str2;
        this.f35093d = str3;
        this.f35094e = str4;
        this.f35099j = true;
        MBridgeGlobalCommon.setAlertDialogText(this.mUnitId, str, str2, str3, str4);
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.n().a(this.mUnitId, jSONObject);
    }

    public void setIVRewardEnable(int i10, int i11) {
        this.l = i10;
        this.f35101m = i11;
        this.f35102n = com.mbridge.msdk.foundation.same.a.K;
        this.f35100k = true;
        c();
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f35096g = newInterstitialListener;
        this.f35098i = true;
        a aVar = this.f35095f;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f35095f.a(new com.mbridge.msdk.newinterstitial.listener.a(newInterstitialListener));
        this.f35098i = false;
    }

    @Deprecated
    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f35096g = newInterstitialListener;
        this.f35098i = true;
        a aVar = this.f35095f;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f35095f.a(new com.mbridge.msdk.newinterstitial.listener.a(newInterstitialListener));
        this.f35098i = false;
    }

    public void showFromBid() {
        a();
        if (this.f35095f != null) {
            this.f35095f.a((String) null, (String) null, (String) null, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.mUnitId, false, -1));
        }
    }

    public void setIVRewardEnable(int i10, double d10) {
        this.l = i10;
        this.f35101m = (int) (d10 * 100.0d);
        this.f35102n = com.mbridge.msdk.foundation.same.a.J;
        this.f35100k = true;
        c();
    }

    private void a() {
        if (this.f35095f == null) {
            b(this.f35090a, this.mUnitId);
        }
        b();
    }

    private void b() {
        a aVar;
        if (this.f35098i) {
            a aVar2 = this.f35095f;
            if (aVar2 != null) {
                aVar2.a(new com.mbridge.msdk.newinterstitial.listener.a(this.f35096g));
            }
            this.f35098i = false;
        }
        if (this.f35099j) {
            a aVar3 = this.f35095f;
            if (aVar3 != null) {
                aVar3.a(this.f35092c, this.f35091b, this.f35093d, this.f35094e);
            }
            this.f35099j = false;
        }
        if (!this.f35100k || (aVar = this.f35095f) == null) {
            return;
        }
        aVar.a(this.l, this.f35102n, this.f35101m);
        this.f35100k = false;
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        a(str, str2);
    }
}

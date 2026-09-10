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
import com.mbridge.msdk.setting.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class MBInterstitialVideoHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f34381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f34383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f34384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f34385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f34386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterstitialVideoListener f34387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f34388i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f34389j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f34390k = false;
    private boolean l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f34391m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f34392n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f34393o;

    public MBInterstitialVideoHandler(Context context, String str, String str2) {
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
        this.f34382c = str2;
        this.f34380a = str;
        a();
    }

    private void b(String str, String str2) {
        try {
            if (this.f34381b == null) {
                a aVar = new a();
                this.f34381b = aVar;
                aVar.d(true);
                this.f34381b.c(str, str2);
                i.b().k(str2);
            }
        } catch (Throwable th2) {
            q0.b("MBRewardVideoHandler", th2.getMessage(), th2);
        }
    }

    public void clearVideoCache() {
        try {
            a aVar = this.f34381b;
            if (aVar != null) {
                aVar.e();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        a aVar = this.f34381b;
        return aVar != null ? aVar.j() : "";
    }

    public String getRequestId() {
        a aVar = this.f34381b;
        return aVar != null ? aVar.m() : "";
    }

    public boolean isReady() {
        a();
        a aVar = this.f34381b;
        if (aVar != null) {
            return aVar.c(true);
        }
        return false;
    }

    public void load() {
        a();
        if (this.f34381b != null) {
            this.f34381b.a(true, d.b().a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f34382c, true, 2));
        }
    }

    public void loadFormSelfFilling() {
        a();
        if (this.f34381b != null) {
            this.f34381b.a(false, d.b().a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f34382c, true, 1));
        }
    }

    public void playVideoMute(int i10) {
        this.f34388i = i10;
        a aVar = this.f34381b;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f34383d = str;
        this.f34384e = str2;
        this.f34385f = str3;
        this.f34386g = str4;
        this.f34390k = true;
        MBridgeGlobalCommon.setAlertDialogText(this.f34382c, str, str2, str3, str4);
    }

    public void setIVRewardEnable(int i10, int i11) {
        this.f34391m = i10;
        this.f34392n = i11;
        this.f34393o = com.mbridge.msdk.foundation.same.a.K;
        this.l = true;
        b();
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f34387h = interstitialVideoListener;
        this.f34389j = true;
        a aVar = this.f34381b;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f34381b.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener));
        this.f34389j = false;
    }

    @Deprecated
    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f34387h = interstitialVideoListener;
        this.f34389j = true;
        a aVar = this.f34381b;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f34381b.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener));
        this.f34389j = false;
    }

    public void show() {
        a();
        if (this.f34381b != null) {
            this.f34381b.a((String) null, (String) null, (String) null, d.b().a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f34382c, false, -1));
        }
    }

    public void setIVRewardEnable(int i10, double d10) {
        this.f34391m = i10;
        this.f34392n = (int) (d10 * 100.0d);
        this.f34393o = com.mbridge.msdk.foundation.same.a.J;
        this.l = true;
        b();
    }

    private void a() {
        a aVar;
        if (this.f34381b == null) {
            b(this.f34380a, this.f34382c);
        }
        if (this.f34389j) {
            this.f34381b.a(new com.mbridge.msdk.interstitialvideo.listener.a(this.f34387h, this.f34382c, false));
            this.f34389j = false;
        }
        if (this.f34390k) {
            this.f34381b.a(this.f34383d, this.f34384e, this.f34385f, this.f34386g);
            this.f34390k = false;
        }
        if (!this.l || (aVar = this.f34381b) == null) {
            return;
        }
        aVar.a(this.f34391m, this.f34393o, this.f34392n);
        this.l = false;
    }

    private void b() {
        a aVar = this.f34381b;
        if (aVar != null) {
            aVar.a(this.f34391m, this.f34393o, this.f34392n);
        }
    }

    public MBInterstitialVideoHandler(String str, String str2) {
        a(str, str2);
    }
}

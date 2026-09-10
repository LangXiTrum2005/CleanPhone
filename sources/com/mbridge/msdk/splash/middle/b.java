package com.mbridge.msdk.splash.middle;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.out.MBSplashLoadListener;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MBSplashLoadListener f35884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f35885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f35887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MBridgeIds f35888e;

    public b(c cVar, MBridgeIds mBridgeIds) {
        this.f35885b = cVar;
        this.f35888e = mBridgeIds;
        if (mBridgeIds != null) {
            this.f35886c = mBridgeIds.getUnitId();
        }
    }

    public void a(MBSplashLoadListener mBSplashLoadListener) {
        this.f35884a = mBSplashLoadListener;
    }

    public void a(String str) {
        this.f35887d = str;
    }

    public void a(CampaignEx campaignEx, int i10) {
        c cVar;
        c cVar2 = this.f35885b;
        if (cVar2 == null || !cVar2.g() || campaignEx == null) {
            return;
        }
        MBSplashLoadListener mBSplashLoadListener = this.f35884a;
        if (mBSplashLoadListener != null) {
            mBSplashLoadListener.onLoadSuccessed(this.f35888e, i10);
            this.f35884a.isSupportZoomOut(this.f35888e, campaignEx.getFlb() == 1);
        }
        this.f35885b.b(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), arrayList, this.f35886c, campaignEx.isBidCampaign());
        if (i10 != 2 || (cVar = this.f35885b) == null) {
            return;
        }
        cVar.b(campaignEx, 0, true);
    }

    public void a(com.mbridge.msdk.foundation.error.b bVar, int i10) {
        c cVar = this.f35885b;
        if (cVar == null || !cVar.g()) {
            return;
        }
        String str = "";
        if (bVar != null) {
            String strL = bVar.l();
            if (!TextUtils.isEmpty(strL)) {
                str = strL;
            }
        }
        MBSplashLoadListener mBSplashLoadListener = this.f35884a;
        if (mBSplashLoadListener != null) {
            mBSplashLoadListener.onLoadFailed(this.f35888e, str, i10);
        }
        this.f35885b.b(false);
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, this.f35886c, !TextUtils.isEmpty(this.f35887d), bVar != null ? bVar.d() : null);
    }
}

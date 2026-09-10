package com.mbridge.msdk.advanced.middle;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NativeAdvancedAdListener f31507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f31508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MBridgeIds f31509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f31510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f31511e;

    public b(c cVar, MBridgeIds mBridgeIds) {
        this.f31508b = cVar;
        this.f31509c = mBridgeIds;
        this.f31510d = mBridgeIds.getUnitId();
    }

    public void a(NativeAdvancedAdListener nativeAdvancedAdListener) {
        this.f31507a = nativeAdvancedAdListener;
    }

    public void a(String str) {
        this.f31511e = str;
    }

    public void a(CampaignEx campaignEx, int i10) {
        c cVar;
        q0.b("NativeAdvancedLoadManager", "onLoadSuccessed: " + i10);
        c cVar2 = this.f31508b;
        if (cVar2 == null || !cVar2.g() || campaignEx == null) {
            return;
        }
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f31507a;
        if (nativeAdvancedAdListener != null && this.f31508b != null) {
            nativeAdvancedAdListener.onLoadSuccessed(this.f31509c);
        }
        this.f31508b.a(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), arrayList, this.f31510d, campaignEx.isBidCampaign());
        if (i10 != 2 || (cVar = this.f31508b) == null) {
            return;
        }
        cVar.a(campaignEx, true);
    }

    public void a(com.mbridge.msdk.foundation.error.b bVar, int i10) {
        c cVar = this.f31508b;
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
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f31507a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onLoadFailed(this.f31509c, str);
        }
        this.f31508b.a(false);
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, this.f31510d, !TextUtils.isEmpty(this.f31511e), bVar != null ? bVar.d() : null);
    }
}

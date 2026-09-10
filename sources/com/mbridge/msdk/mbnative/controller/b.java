package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.os.Handler;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.setting.m;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Handler f34706a;

    public abstract void a(int i10, long j10, int i11, m mVar, String str, String str2, com.mbridge.msdk.preload.listenter.a aVar, boolean z10);

    public void a(Context context, CampaignEx campaignEx) {
    }

    public void a(CampaignUnit campaignUnit) {
    }

    public void a(com.mbridge.msdk.foundation.same.net.wrapper.e eVar, int i10) {
    }

    public synchronized void a(int i10, long j10, int i11, m mVar, String str, String str2, boolean z10, com.mbridge.msdk.preload.listenter.a aVar) {
        try {
            a(i10, j10, i11, mVar, str, str2, aVar, z10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}

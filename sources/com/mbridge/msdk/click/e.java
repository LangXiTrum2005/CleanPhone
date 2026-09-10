package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f31642e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.task.b f31645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p f31646i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    JumpLoaderResult f31639b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31640c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f31641d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g f31643f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f31644g = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Handler f31647j = new Handler(Looper.getMainLooper());

    public e(Context context) {
        this.f31645h = new com.mbridge.msdk.foundation.same.task.b(context);
        this.f31646i = new p(context);
    }

    public void a(String str, CampaignEx campaignEx, g gVar, String str2, boolean z10, boolean z11, int i10) {
        String id2;
        this.f31641d = str2;
        this.f31643f = gVar;
        this.f31639b = null;
        this.f31642e = i10;
        boolean z12 = false;
        if (campaignEx != null) {
            z12 = CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode());
            id2 = campaignEx.getId();
        } else {
            id2 = "";
        }
        this.f31646i.a(str2, gVar, z12, id2, str, campaignEx, z10, z11, i10);
    }

    public void a(String str, CampaignEx campaignEx, g gVar) {
        this.f31641d = new String(campaignEx.getClickURL());
        this.f31643f = gVar;
        this.f31639b = null;
        this.f31646i.a(campaignEx.getClickURL(), gVar, CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode()), campaignEx.getId(), str, campaignEx, true, false, com.mbridge.msdk.click.retry.a.f31755p);
    }

    public void a() {
        this.f31644g = false;
    }
}

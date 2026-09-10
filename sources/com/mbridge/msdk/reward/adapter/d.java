package com.mbridge.msdk.reward.adapter;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f35398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CampaignEx f35399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35400c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35401d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35402e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f35403f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f35404g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f35405h = 0;

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f35398a = copyOnWriteArrayList;
    }

    public CopyOnWriteArrayList<CampaignEx> b() {
        return this.f35398a;
    }

    public int c() {
        return this.f35404g;
    }

    public int d() {
        return this.f35403f;
    }

    public boolean e() {
        return this.f35400c;
    }

    public void a(boolean z10) {
        this.f35400c = z10;
    }

    public void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            this.f35399b = campaignEx;
            this.f35401d = campaignEx.getSecondRequestIndex();
            this.f35402e = campaignEx.getSecondShowIndex();
            this.f35403f = campaignEx.getFilterCallBackState();
            this.f35405h = campaignEx.getFilterAdsShowCallState();
            this.f35404g = campaignEx.getFilterAdsVideoCallState();
        }
    }

    public boolean a() {
        return this.f35401d == 1 && this.f35400c;
    }
}

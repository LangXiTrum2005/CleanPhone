package com.mbridge.msdk.mbnative.cache;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.Campaign;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends b<String, List<Campaign>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f34607a = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34608b;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.cache.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class RunnableC0144a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f34609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34610b;

        public RunnableC0144a(List list, String str) {
            this.f34609a = list;
            this.f34610b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            for (int i10 = 0; i10 < this.f34609a.size(); i10++) {
                CampaignEx campaignEx = (CampaignEx) this.f34609a.get(i10);
                campaignEx.setCacheLevel(1);
                a.this.f34607a.a(campaignEx, this.f34610b, 1);
            }
        }
    }

    public a(int i10) {
        this.f34608b = i10;
    }

    @Override // com.mbridge.msdk.mbnative.cache.b
    public List<Campaign> b(String str, int i10) {
        List<CampaignEx> listA = this.f34607a.a(str, i10, 2, this.f34608b);
        if (listA == null) {
            return null;
        }
        if (a(listA, 2)) {
            this.f34607a.a(str, 2, this.f34608b);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(listA);
        return arrayList;
    }

    public void a(List<CampaignEx> list, String str) throws Throwable {
        for (int i10 = 0; i10 < list.size(); i10++) {
            CampaignEx campaignEx = list.get(i10);
            campaignEx.setCacheLevel(2);
            this.f34607a.a(campaignEx, str, 1);
        }
    }

    public boolean a(List<CampaignEx> list, int i10) {
        long jA;
        if (list != null && list.size() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long timestamp = list.get(0).getTimestamp();
            if (i10 != 1) {
                jA = i10 != 2 ? 0L : b();
            } else {
                jA = a();
            }
            if (jCurrentTimeMillis - timestamp > jA) {
                return true;
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.mbnative.cache.b
    public void a(String str, List<Campaign> list) throws Throwable {
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
            return;
        }
        this.f34607a.a(str, 1, this.f34608b, false);
        this.f34607a.a(str, 2, this.f34608b, false);
        for (int i10 = 0; i10 < list.size(); i10++) {
            CampaignEx campaignEx = (CampaignEx) list.get(i10);
            campaignEx.setCacheLevel(1);
            this.f34607a.a(campaignEx, str, 1);
        }
    }

    @Override // com.mbridge.msdk.mbnative.cache.b
    public void a(String str, List<Campaign> list, String str2) {
        boolean z10 = !TextUtils.isEmpty(str2);
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
            return;
        }
        this.f34607a.a(str, 1, this.f34608b, z10);
        this.f34607a.a(str, 2, this.f34608b, z10);
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new RunnableC0144a(list, str));
    }

    @Override // com.mbridge.msdk.mbnative.cache.b
    public List<Campaign> a(String str, int i10) throws Throwable {
        List<CampaignEx> listA = this.f34607a.a(str, i10, 1, this.f34608b);
        if (listA == null) {
            return null;
        }
        if (a(listA, 1)) {
            a(listA, str);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(listA);
        return arrayList;
    }

    @Override // com.mbridge.msdk.mbnative.cache.b
    public void a(String str, Campaign campaign, String str2) {
        boolean z10 = !TextUtils.isEmpty(str2);
        if (campaign == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            CampaignEx campaignEx = (CampaignEx) campaign;
            if (this.f34607a.a(campaignEx.getId(), campaignEx.getTab(), str, campaignEx.getCacheLevel(), campaignEx.getType(), z10)) {
                this.f34607a.a(campaignEx.getId(), str, campaignEx.getCacheLevel(), this.f34608b, z10);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}

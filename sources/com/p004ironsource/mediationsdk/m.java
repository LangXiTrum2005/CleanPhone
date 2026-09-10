package com.p004ironsource.mediationsdk;

import com.p004ironsource.cn;
import com.p004ironsource.m5;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.p004ironsource.mediationsdk.impressionData.ImpressionData;
import com.p004ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.r;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashSet<ImpressionDataListener> f25951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected r f25952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected IronSourceSegment f25953c;
    protected AdInfo d;

    public m(HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        new HashSet();
        this.f25951a = hashSet;
        this.f25952b = new r();
        this.f25953c = ironSourceSegment;
    }

    public void a(m5 m5Var, String str) {
        HashSet<ImpressionDataListener> hashSet;
        if (m5Var == null) {
            IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
            return;
        }
        ImpressionData impressionDataA = m5Var.a(str);
        if (impressionDataA != null) {
            synchronized (this) {
                hashSet = (HashSet) this.f25951a.clone();
            }
            for (ImpressionDataListener impressionDataListener : hashSet) {
                IronLog.CALLBACK.info("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + impressionDataA);
                impressionDataListener.onImpressionSuccess(impressionDataA);
            }
        }
    }

    public void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f25951a.add(impressionDataListener);
        }
    }

    public void c() {
        synchronized (this) {
            this.f25951a.clear();
        }
    }

    public String e() {
        return "fallback_" + System.currentTimeMillis();
    }

    public void f() {
        this.d = null;
    }

    public void a(IronSource.AD_UNIT ad_unit) {
        this.f25952b.a(ad_unit, false);
    }

    public void a(IronSourceSegment ironSourceSegment) {
        this.f25953c = ironSourceSegment;
    }

    public void a(ImpressionData impressionData, cn cnVar) {
        if (impressionData != null) {
            this.d = new AdInfo(impressionData, cnVar);
        }
    }

    public void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f25951a.remove(impressionDataListener);
        }
    }

    public void a(JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        this.f25952b.a(ad_unit, jSONObject != null ? jSONObject.optBoolean(d.f, false) : false);
    }
}

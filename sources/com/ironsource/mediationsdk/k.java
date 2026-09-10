package com.ironsource.mediationsdk;

import com.ironsource.Ab;
import com.ironsource.C0265ba;
import com.ironsource.C0526q2;
import com.ironsource.C0558s;
import com.ironsource.W8;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashSet<ImpressionDataListener> f29569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected C0558s f29570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected C0265ba f29571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected AdInfo f29572d;

    public k(HashSet<ImpressionDataListener> hashSet, C0265ba c0265ba) {
        new HashSet();
        this.f29569a = hashSet;
        this.f29570b = new C0558s();
        this.f29571c = c0265ba;
    }

    public void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f29569a.add(impressionDataListener);
        }
    }

    public void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f29569a.remove(impressionDataListener);
        }
    }

    public void c() {
        this.f29572d = null;
    }

    public void a(C0265ba c0265ba) {
        this.f29571c = c0265ba;
    }

    public void b() {
        synchronized (this) {
            this.f29569a.clear();
        }
    }

    public void a(W8 w10, Ab ab2) {
        if (w10 != null) {
            this.f29572d = new AdInfo(w10, ab2);
        }
    }

    public void a(C0526q2 c0526q2, String str) {
        HashSet<ImpressionDataListener> hashSet;
        if (c0526q2 != null) {
            W8 w8A = c0526q2.a(str);
            if (w8A != null) {
                synchronized (this) {
                    hashSet = (HashSet) this.f29569a.clone();
                }
                for (ImpressionDataListener impressionDataListener : hashSet) {
                    IronLog.CALLBACK.info("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + w8A);
                    impressionDataListener.onImpressionSuccess(w8A);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
    }

    public String a() {
        return "fallback_" + System.currentTimeMillis();
    }

    public void a(JSONObject jSONObject, IronSource.a aVar) {
        this.f29570b.a(aVar, jSONObject != null ? jSONObject.optBoolean(d.f29335f, false) : false);
    }

    public void a(IronSource.a aVar) {
        this.f29570b.a(aVar, false);
    }
}

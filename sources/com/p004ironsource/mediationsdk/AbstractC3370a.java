package com.p004ironsource.mediationsdk;

import android.app.Activity;
import android.support.v4.media.a;
import android.text.TextUtils;
import com.p004ironsource.a8;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.p004ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.tk;
import java.lang.ref.WeakReference;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3370a<Listener extends AdapterAdListener> extends BaseAdAdapter<u, Listener> implements AdapterAdFullScreenInterface<Listener>, AdapterBannerInterface<Listener>, AdapterNativeAdInterface<Listener>, AdapterBindAdViewInterface, a8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected AbstractAdapter f25732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected WeakReference<Listener> f25733b;

    public AbstractC3370a(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, UUID uuid) {
        super(ad_unit, networkSettings, uuid);
        this.f25733b = new WeakReference<>(null);
        this.f25732a = abstractAdapter;
    }

    public static AbstractC3370a<?> a(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, UUID uuid) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return new z(abstractAdapter, networkSettings, uuid);
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return new o(abstractAdapter, networkSettings, uuid);
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return new j(abstractAdapter, networkSettings, uuid);
        }
        if (ad_unit == IronSource.AD_UNIT.NATIVE_AD) {
            return new t(abstractAdapter, networkSettings, uuid);
        }
        IronLog.INTERNAL.error("ad unit not supported - " + ad_unit);
        return null;
    }

    private void b(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        StringBuilder sbY = a.y("Method '", str, "' is not supported for ");
        sbY.append(getClass().getName());
        ironLog.error(a(sbY.toString()));
    }

    public abstract void a(JSONObject jSONObject, JSONObject jSONObject2, AdData adData);

    public abstract IronSource.AD_UNIT b();

    public boolean c(JSONObject jSONObject) {
        b("isAdAvailable");
        return false;
    }

    @Override // com.p004ironsource.a8
    public void collectBiddingData(AdData adData, BiddingDataCallback biddingDataCallback) {
        a(tk.a(adData.getConfiguration()), tk.a(adData.getAdUnitData()), biddingDataCallback);
    }

    public void d(JSONObject jSONObject) {
        b("onAdViewWillBind");
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface, com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface
    public void destroyAd(AdData adData) {
        a(tk.a(adData.getConfiguration()));
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void disposeAd(AdData adData) {
        b(tk.a(adData.getConfiguration()));
    }

    public void e(JSONObject jSONObject) {
        b("onAdViewWillBind");
    }

    public void f(JSONObject jSONObject) {
        b("showAd");
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public boolean isAdAvailable(AdData adData) {
        return c(tk.a(adData.getConfiguration()));
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface
    public void loadAd(AdData adData, Activity activity, ISBannerSize iSBannerSize, Listener listener) {
        a(adData, listener);
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface
    public void onAdViewBound(AdData adData) {
        d(tk.a(adData.getConfiguration()));
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface
    public void onAdViewWillBind(AdData adData) {
        e(tk.a(adData.getConfiguration()));
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter
    public void releaseMemory() {
        IronLog.INTERNAL.verbose(a());
        AbstractAdapter abstractAdapter = this.f25732a;
        if (abstractAdapter != null) {
            abstractAdapter.releaseMemory(b(), new JSONObject());
            this.f25732a = null;
        }
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void showAd(AdData adData, Listener listener) {
        this.f25733b = new WeakReference<>(listener);
        f(tk.a(adData.getConfiguration()));
    }

    public String a() {
        return a((String) null);
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface, com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface
    public void loadAd(AdData adData, Activity activity, Listener listener) {
        a(adData, listener);
    }

    public String a(String str) {
        String string = b().toString();
        return TextUtils.isEmpty(str) ? string : a.D(string, " - ", str);
    }

    public void b(JSONObject jSONObject) {
        b("disposeAd");
    }

    private void a(AdData adData, Listener listener) {
        this.f25733b = new WeakReference<>(listener);
        a(tk.a(adData.getConfiguration()), tk.a(adData.getAdUnitData()), adData);
    }

    public void a(JSONObject jSONObject) {
        b("destroyAd");
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        b("collectBiddingData");
    }
}

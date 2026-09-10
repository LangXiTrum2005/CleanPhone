package com.ironsource.adapters.ironsource.nativeAd;

import android.app.Activity;
import bc.r;
import com.ironsource.B8;
import com.ironsource.C0474n4;
import com.ironsource.X3;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.e;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.n;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class IronSourceNativeAdAdapter extends AbstractNativeAdAdapter<IronSourceAdapter> {
    private B8 nativeAd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IronSourceNativeAdAdapter(IronSourceAdapter adapter) {
        super(adapter);
        n.f(adapter, "adapter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadNativeAdForBidding$lambda$0(IronSourceNativeAdAdapter this$0, JSONObject config, NativeAdSmashListener listener, String str) {
        n.f(this$0, "this$0");
        n.f(config, "$config");
        n.f(listener, "$listener");
        try {
            B8 b8A = B8.f25716j.a();
            b8A.a(new IronSourceNativeAdListener(new IronSourceNativeAdViewBinder(b8A, this$0.getNativeAdProperties(config)), listener));
            Activity activity = ContextProvider.getInstance().getCurrentActiveActivity();
            JSONObject jSONObjectPrepareLoadParams = this$0.prepareLoadParams(config, str);
            n.e(activity, "activity");
            b8A.a(activity, jSONObjectPrepareLoadParams);
            this$0.nativeAd = b8A;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            listener.onNativeAdLoadFailed(new IronSourceError(510, e.n("IronSourceAdapter loadNativeAd exception ", e10.getMessage())));
        }
    }

    private final JSONObject prepareLoadParams(JSONObject jSONObject, String str) throws JSONException {
        JSONObject loadParams = new JSONObject().put("demandSourceName", getAdapter().getDemandSourceName(jSONObject)).put(X3.f27659s, "2").put("inAppBidding", true).put(getAdapter().ADM_KEY, d.b().a(str));
        HashMap<String, String> extraParams = getAdapter().getInitParams();
        n.e(extraParams, "extraParams");
        for (Map.Entry<String, String> entry : extraParams.entrySet()) {
            loadParams.put(entry.getKey(), entry.getValue());
        }
        n.e(loadParams, "loadParams");
        return loadParams;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void destroyNativeAd(JSONObject config) {
        n.f(config, "config");
        B8 b10 = this.nativeAd;
        if (b10 != null) {
            b10.a();
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public Map<String, Object> getNativeAdBiddingData(JSONObject config, JSONObject jSONObject) {
        n.f(config, "config");
        return new HashMap();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAdForBidding(String str, String str2, JSONObject config, NativeAdSmashListener listener) {
        n.f(config, "config");
        n.f(listener, "listener");
        getAdapter().initSDK(str, config);
        listener.onNativeAdInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAdForBidding(JSONObject config, JSONObject jSONObject, String str, NativeAdSmashListener listener) {
        n.f(config, "config");
        n.f(listener, "listener");
        postOnUIThread(new r(this, config, listener, str));
    }
}

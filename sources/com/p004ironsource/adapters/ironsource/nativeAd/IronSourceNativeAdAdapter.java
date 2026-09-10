package com.p004ironsource.adapters.ironsource.nativeAd;

import A.F;
import android.app.Activity;
import com.applovin.impl.Z;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.adapters.ironsource.IronSourceAdapter;
import com.p004ironsource.d9;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.m5;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.adapter.AbstractNativeAdAdapter;
import com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.p004ironsource.mediationsdk.d;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.ne;
import com.p004ironsource.xh;
import com.smartdigimkt.q0.b;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J,\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016J,\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J,\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00102\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/ironsource/adapters/ironsource/nativeAd/IronSourceNativeAdAdapter;", "Lcom/ironsource/mediationsdk/adapter/AbstractNativeAdAdapter;", "Lcom/ironsource/adapters/ironsource/IronSourceAdapter;", "Lorg/json/JSONObject;", b.i0, "", m5.s, "prepareLoadParams", "appKey", "userId", "Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdSmashListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "initNativeAdForBidding", "adData", "loadNativeAdForBidding", "", "", "getNativeAdBiddingData", "destroyNativeAd", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adUnit", "releaseMemory", "Lcom/ironsource/xh;", "nativeAd", "Lcom/ironsource/xh;", ne.E1, "<init>", "(Lcom/ironsource/adapters/ironsource/IronSourceAdapter;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class IronSourceNativeAdAdapter extends AbstractNativeAdAdapter<IronSourceAdapter> {
    private xh nativeAd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IronSourceNativeAdAdapter(IronSourceAdapter adapter) {
        super(adapter);
        Intrinsics.f(adapter, "adapter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadNativeAdForBidding$lambda$0(IronSourceNativeAdAdapter this$0, JSONObject config, NativeAdSmashListener listener, String str) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(config, "$config");
        Intrinsics.f(listener, "$listener");
        try {
            xh xhVarA = xh.INSTANCE.a();
            xhVarA.a(new IronSourceNativeAdListener(new IronSourceNativeAdViewBinder(xhVarA, this$0.getNativeAdProperties(config)), listener));
            Activity activity = ContextProvider.getInstance().getCurrentActiveActivity();
            JSONObject jSONObjectPrepareLoadParams = this$0.prepareLoadParams(config, str);
            Intrinsics.e(activity, "activity");
            xhVarA.a(activity, jSONObjectPrepareLoadParams);
            this$0.nativeAd = xhVarA;
        } catch (Exception e2) {
            listener.onNativeAdLoadFailed(new IronSourceError(510, Z.m(e2, a.o(e2, "IronSourceAdapter loadNativeAd exception "))));
        }
    }

    private final JSONObject prepareLoadParams(JSONObject config, String serverData) throws JSONException {
        JSONObject loadParams = new JSONObject().put("demandSourceName", getAdapter().getDemandSourceName(config)).put(d9.r, "2").put("inAppBidding", true).put(getAdapter().ADM_KEY, d.b().a(serverData));
        HashMap<String, String> extraParams = getAdapter().getInitParams();
        Intrinsics.e(extraParams, "extraParams");
        for (Map.Entry<String, String> entry : extraParams.entrySet()) {
            loadParams.put(entry.getKey(), entry.getValue());
        }
        Intrinsics.e(loadParams, "loadParams");
        return loadParams;
    }

    @Override // com.p004ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void destroyNativeAd(JSONObject config) {
        Intrinsics.f(config, "config");
        xh xhVar = this.nativeAd;
        if (xhVar != null) {
            xhVar.destroy();
        }
    }

    @Override // com.p004ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public Map<String, Object> getNativeAdBiddingData(JSONObject config, JSONObject adData) {
        Intrinsics.f(config, "config");
        return new HashMap();
    }

    @Override // com.p004ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAdForBidding(String appKey, String userId, JSONObject config, NativeAdSmashListener listener) {
        Intrinsics.f(config, "config");
        Intrinsics.f(listener, "listener");
        getAdapter().initSDK(appKey, config);
        listener.onNativeAdInitSuccess();
    }

    @Override // com.p004ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAdForBidding(JSONObject config, JSONObject adData, String serverData, NativeAdSmashListener listener) {
        Intrinsics.f(config, "config");
        Intrinsics.f(listener, "listener");
        postOnUIThread(new F(this, config, listener, serverData, 4));
    }

    @Override // com.p004ironsource.mediationsdk.sdk.ReleaseMemoryAdapterInterface
    public void releaseMemory(IronSource.AD_UNIT adUnit, JSONObject config) {
        Intrinsics.f(adUnit, "adUnit");
    }
}

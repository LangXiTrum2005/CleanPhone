package com.p004ironsource;

import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.IronSourceSegment;
import com.p004ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.model.Placement;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.smartdigimkt.y4.g;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u00020\u0004B=\u0012\u0010\u0010+\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010*\u0012\u0006\u0010-\u001a\u00020,\u0012\b\u0010.\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u00100\u001a\u00020/\u0012\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104J<\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0014J\b\u0010\u0011\u001a\u00020\u0010H\u0014J\u0010\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u0006\u0010\u0016\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017J \u0010\u0015\u001a\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001f\u001a\u00020\u0014H\u0014J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u0010\u000f\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\b\u0010&\u001a\u00020%H\u0014J\b\u0010'\u001a\u00020\u000bH\u0014J\b\u0010(\u001a\u00020%H\u0014J\b\u0010)\u001a\u00020\u000bH\u0014¨\u00065"}, d2 = {"Lcom/ironsource/co;", "Lcom/ironsource/p7;", "Lcom/ironsource/go;", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/listener/AdapterAdListener;", "Lcom/ironsource/p2;", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", xs.f27731b, "Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;", ne.E1, "", "sessionDepth", "", "currentAuctionId", "Lcom/ironsource/m5;", "item", "b", "Lcom/ironsource/j2;", g.f40227p, "Lcom/ironsource/mediationsdk/model/Placement;", "placement", "", "a", "M", "Lcom/ironsource/mediationsdk/ads/nativead/internal/InternalNativeAdListener;", "nativeAdListener", "Lcom/ironsource/s7;", "smash", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;", "adInfo", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "Lcom/ironsource/z1;", "event", "", "", "Lorg/json/JSONObject;", "", "v", "o", "H", "l", "", "providersList", "Lcom/ironsource/tn;", ch.f24532p, "userId", "Lcom/ironsource/xk;", "publisherDataHolder", "Lcom/ironsource/mediationsdk/IronSourceSegment;", a4.f24258i, "<init>", "(Ljava/util/List;Lcom/ironsource/tn;Ljava/lang/String;Lcom/ironsource/xk;Lcom/ironsource/mediationsdk/IronSourceSegment;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class co extends p7<go, AdapterAdListener> implements p2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co(List<? extends NetworkSettings> list, tn configs, String str, xk publisherDataHolder, IronSourceSegment ironSourceSegment) {
        super(new Cdo(str, list, configs), publisherDataHolder, ironSourceSegment);
        Intrinsics.f(configs, "configs");
        Intrinsics.f(publisherDataHolder, "publisherDataHolder");
    }

    @Override // com.p004ironsource.p7
    public void G() {
    }

    @Override // com.p004ironsource.p7
    public boolean H() {
        return false;
    }

    public final void M() {
        lw lwVar;
        bn bnVar;
        IronLog.INTERNAL.verbose();
        try {
            go goVar = (go) this.f26459a.d();
            if (goVar != null) {
                Integer numR = goVar.r();
                int iA = numR == null ? this.C.a(this.o.getAdUnit()) : numR.intValue();
                c2 c2Var = this.s;
                if (c2Var != null && (bnVar = c2Var.f) != null) {
                    bnVar.a(iA);
                }
                goVar.P();
                this.f26459a.a(null);
                this.f26459a.b(null);
            }
            this.f26464i = null;
            a(p7.f.NONE);
        } catch (Throwable th) {
            StringBuilder sbP = a.p("destroyNativeAd - exception = ", th);
            sbP.append(th.getLocalizedMessage());
            String string = sbP.toString();
            IronLog.INTERNAL.error(b(string));
            c2 c2Var2 = this.s;
            if (c2Var2 == null || (lwVar = c2Var2.j) == null) {
                return;
            }
            lwVar.g(string);
        }
    }

    @Override // com.p004ironsource.p7
    public /* bridge */ /* synthetic */ s7 a(NetworkSettings networkSettings, BaseAdAdapter baseAdAdapter, int i2, String str, m5 m5Var) {
        return b(networkSettings, (BaseAdAdapter<?, AdapterAdListener>) baseAdAdapter, i2, str, m5Var);
    }

    public go b(NetworkSettings providerSettings, BaseAdAdapter<?, AdapterAdListener> adapter, int sessionDepth, String currentAuctionId, m5 item) {
        Intrinsics.f(providerSettings, "providerSettings");
        Intrinsics.f(adapter, "adapter");
        Intrinsics.f(currentAuctionId, "currentAuctionId");
        Intrinsics.f(item, "item");
        return new go(this, new k1(IronSource.AD_UNIT.NATIVE_AD, this.o.getUserId(), sessionDepth, this.g, currentAuctionId, this.f26462e, this.f, providerSettings, this.o.getSmashLoadTimeout()), adapter, this.f26464i, item, this);
    }

    @Override // com.p004ironsource.p7
    public j2 g() {
        return new jb();
    }

    @Override // com.p004ironsource.p7
    public String l() {
        return "NA";
    }

    @Override // com.p004ironsource.p7
    public String o() {
        return IronSourceConstants.OPW_NT_MANAGER_NAME;
    }

    @Override // com.p004ironsource.p7
    public boolean v() {
        return false;
    }

    @Override // com.p004ironsource.p7, com.p004ironsource.b2
    public Map<String, Object> a(z1 event) {
        Intrinsics.f(event, "event");
        Map<String, Object> data = super.a(event);
        Placement placement = this.f26464i;
        if (placement != null) {
            Intrinsics.e(data, "data");
            data.put("placement", placement.getPlacementName());
        }
        UUID uuid = this.f26469w;
        if (uuid != null) {
            Intrinsics.e(data, "data");
            data.put("objectId", uuid);
        }
        Intrinsics.e(data, "data");
        return data;
    }

    @Override // com.p004ironsource.p7
    public JSONObject b(NetworkSettings providerSettings) {
        Intrinsics.f(providerSettings, "providerSettings");
        JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        Intrinsics.e(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }

    public final void a(InternalNativeAdListener nativeAdListener) {
        Intrinsics.f(nativeAdListener, "nativeAdListener");
        a(new bo(nativeAdListener));
    }

    @Override // com.p004ironsource.p7
    public void a(IronSourceError error) {
        this.t.a(error);
    }

    public final void a(Placement placement) {
        String str;
        int iB;
        IronLog.INTERNAL.verbose("placement = " + placement);
        if (placement == null || TextUtils.isEmpty(placement.getPlacementName())) {
            str = String.format("can't load native ad - %s", Arrays.copyOf(new Object[]{placement == null ? "placement is null" : "placement name is empty"}, 1));
            iB = y1.b(this.o.getAdUnit());
        } else if (this.f26455E.b(ContextProvider.getInstance().getApplicationContext(), placement, this.o.getAdUnit())) {
            str = String.format("placement %s is capped", Arrays.copyOf(new Object[]{placement.getPlacementName()}, 1));
            iB = y1.f(this.o.getAdUnit());
        } else {
            str = null;
            iB = 510;
        }
        if (TextUtils.isEmpty(str)) {
            this.f26464i = placement;
            A();
        } else {
            IronLog.API.error(b(str));
            a(iB, str, false);
        }
    }

    @Override // com.p004ironsource.p7
    public void a(s7<?> smash, AdInfo adInfo) {
        if (smash instanceof go) {
            go goVar = (go) smash;
            this.t.a(goVar.getAdapterNativeAdData(), goVar.getNativeAdViewBinder(), adInfo);
        }
    }
}

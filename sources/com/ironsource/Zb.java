package com.ironsource;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Zb extends AbstractC0384i3<C0303dc, AdapterAdListener> implements R0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zb(List<? extends NetworkSettings> list, Qb configs, String str, C0462ma publisherDataHolder, C0265ba c0265ba) {
        super(new C0249ac(str, list, configs), publisherDataHolder, c0265ba);
        kotlin.jvm.internal.n.f(configs, "configs");
        kotlin.jvm.internal.n.f(publisherDataHolder, "publisherDataHolder");
    }

    @Override // com.ironsource.AbstractC0384i3
    public boolean E() {
        return false;
    }

    public final void J() {
        C0540qg c0540qg;
        C0696zb c0696zb;
        IronLog.INTERNAL.verbose();
        try {
            C0303dc c0303dc = (C0303dc) this.f28843a.d();
            if (c0303dc != null) {
                Integer numR = c0303dc.r();
                int iA = numR == null ? this.C.a(this.f28856o.b()) : numR.intValue();
                F0 f10 = this.f28860s;
                if (f10 != null && (c0696zb = f10.f26031f) != null) {
                    c0696zb.a(iA);
                }
                c0303dc.P();
                this.f28843a.a(null);
                this.f28843a.b(null);
            }
            this.f28851i = null;
            a(AbstractC0384i3.f.NONE);
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            String strN = defpackage.e.n("destroyNativeAd - exception = ", th2.getLocalizedMessage());
            IronLog.INTERNAL.error(b(strN));
            F0 f11 = this.f28860s;
            if (f11 == null || (c0540qg = f11.f26035j) == null) {
                return;
            }
            c0540qg.g(strN);
        }
    }

    @Override // com.ironsource.AbstractC0384i3
    public /* bridge */ /* synthetic */ AbstractC0401j3 a(NetworkSettings networkSettings, BaseAdAdapter baseAdAdapter, int i10, String str, C0526q2 c0526q2) {
        return b(networkSettings, (BaseAdAdapter<?, AdapterAdListener>) baseAdAdapter, i10, str, c0526q2);
    }

    public C0303dc b(NetworkSettings providerSettings, BaseAdAdapter<?, AdapterAdListener> adapter, int i10, String currentAuctionId, C0526q2 item) {
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        kotlin.jvm.internal.n.f(adapter, "adapter");
        kotlin.jvm.internal.n.f(currentAuctionId, "currentAuctionId");
        kotlin.jvm.internal.n.f(item, "item");
        return new C0303dc(this, new C0470n0(IronSource.a.NATIVE_AD, this.f28856o.o(), i10, this.f28849g, currentAuctionId, this.f28847e, this.f28848f, providerSettings, this.f28856o.n()), adapter, this.f28851i, item, this);
    }

    @Override // com.ironsource.AbstractC0384i3
    public L0 d() {
        return new C0368h5();
    }

    @Override // com.ironsource.AbstractC0384i3
    public String i() {
        return "NA";
    }

    @Override // com.ironsource.AbstractC0384i3
    public String l() {
        return IronSourceConstants.OPW_NT_MANAGER_NAME;
    }

    @Override // com.ironsource.AbstractC0384i3
    public boolean s() {
        return false;
    }

    public final void a(C0358gd c0358gd) {
        String str;
        int iB;
        IronLog.INTERNAL.verbose("placement = " + c0358gd);
        if (c0358gd == null || TextUtils.isEmpty(c0358gd.c())) {
            str = String.format("can't load native ad - %s", Arrays.copyOf(new Object[]{c0358gd == null ? "placement is null" : "placement name is empty"}, 1));
            iB = B0.b(this.f28856o.b());
        } else if (this.E.c(ContextProvider.getInstance().getApplicationContext(), c0358gd, this.f28856o.b())) {
            str = String.format("placement %s is capped", Arrays.copyOf(new Object[]{c0358gd.c()}, 1));
            iB = B0.f(this.f28856o.b());
        } else {
            str = null;
            iB = 510;
        }
        if (TextUtils.isEmpty(str)) {
            this.f28851i = c0358gd;
            x();
        } else {
            IronLog.API.error(b(str));
            a(iB, str, false);
        }
    }

    @Override // com.ironsource.AbstractC0384i3
    public JSONObject b(NetworkSettings providerSettings) {
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        kotlin.jvm.internal.n.e(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }

    public final void a(InternalNativeAdListener nativeAdListener) {
        kotlin.jvm.internal.n.f(nativeAdListener, "nativeAdListener");
        a(new Yb(nativeAdListener));
    }

    @Override // com.ironsource.AbstractC0384i3
    public void a(AbstractC0401j3<?> abstractC0401j3, AdInfo adInfo) {
        if (abstractC0401j3 instanceof C0303dc) {
            C0303dc c0303dc = (C0303dc) abstractC0401j3;
            this.f28861t.a(c0303dc.Q(), c0303dc.R(), adInfo);
        }
    }

    @Override // com.ironsource.AbstractC0384i3
    public void D() {
    }

    @Override // com.ironsource.AbstractC0384i3
    public void a(IronSourceError ironSourceError) {
        this.f28861t.a(ironSourceError);
    }

    @Override // com.ironsource.AbstractC0384i3, com.ironsource.E0
    public Map<String, Object> a(C0 event) {
        kotlin.jvm.internal.n.f(event, "event");
        Map<String, Object> data = super.a(event);
        C0358gd c0358gd = this.f28851i;
        if (c0358gd != null) {
            kotlin.jvm.internal.n.e(data, "data");
            data.put("placement", c0358gd.c());
        }
        UUID uuid = this.f28864w;
        if (uuid != null) {
            kotlin.jvm.internal.n.e(data, "data");
            data.put("objectId", uuid);
        }
        kotlin.jvm.internal.n.e(data, "data");
        return data;
    }
}

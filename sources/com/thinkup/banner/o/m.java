package com.thinkup.banner.o;

import android.content.Context;
import com.thinkup.banner.unitgroup.api.CustomBannerAdapter;
import com.thinkup.banner.unitgroup.api.CustomBannerEventListener;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.core.common.n.mo;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.n0;
import com.thinkup.core.common.oo0.oo;
import com.thinkup.core.common.ooo.m0m;
import com.thinkup.core.common.ooo.omn;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements CustomBannerEventListener {
    CustomBannerAdapter m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f41794n;
    WeakReference<o0> o;

    public m(o0 o0Var, CustomBannerAdapter customBannerAdapter, boolean z2) {
        this.f41794n = false;
        this.o = new WeakReference<>(o0Var);
        this.m = customBannerAdapter;
        this.f41794n = z2;
    }

    @Override // com.thinkup.banner.unitgroup.api.CustomBannerEventListener
    public final void onBannerAdClicked() {
        CustomBannerAdapter customBannerAdapter = this.m;
        if (customBannerAdapter != null) {
            n0 trackingInfo = customBannerAdapter.getTrackingInfo();
            m0m.n(trackingInfo, this.m);
            com.thinkup.core.common.oo0.n.o(o0n.m().on()).o(6, trackingInfo);
            if (trackingInfo != null ? trackingInfo.o0no() : false) {
                return;
            }
            com.thinkup.core.common.ooo.n.o().m(this.m);
            omn.o(trackingInfo, mo.o0m.o0, mo.o0m.no, "");
            o0 o0Var = this.o.get();
            if (o0Var != null) {
                o0Var.onBannerClicked(this.m);
            }
        }
    }

    @Override // com.thinkup.banner.unitgroup.api.CustomBannerEventListener
    public final void onBannerAdClose() {
        if (this.m != null) {
            o0 o0Var = this.o.get();
            if (o0Var != null) {
                o0Var.onBannerClose(this.m);
            }
            n0 trackingInfo = this.m.getTrackingInfo();
            omn.o(trackingInfo, mo.o0m.oo, mo.o0m.no, "");
            if (trackingInfo != null) {
                oo.o(trackingInfo, false);
            }
        }
    }

    @Override // com.thinkup.banner.unitgroup.api.CustomBannerEventListener
    public final void onBannerAdShow() {
        if (this.m != null) {
            com.thinkup.core.common.ooo.n.o().o(this.m);
            o0 o0Var = this.o.get();
            if (o0Var != null) {
                o0Var.onBannerShow(this.m, this.f41794n);
            }
            n0 trackingInfo = this.m.getTrackingInfo();
            trackingInfo.o(this.m.getInternalNetworkInfoMap());
            omn.o(trackingInfo, mo.o0m.f41901n, mo.o0m.no, "");
            m0m.m(trackingInfo, this.m);
            com.thinkup.core.common.oo0.n.o(o0n.m().on()).o(4, trackingInfo, this.m.getUnitGroupInfo());
        }
    }

    @Override // com.thinkup.banner.unitgroup.api.CustomBannerEventListener
    public final void onDeeplinkCallback(boolean z2) {
        o0 o0Var = this.o.get();
        if (o0Var != null) {
            o0Var.onDeeplinkCallback(this.m, z2);
        }
        CustomBannerAdapter customBannerAdapter = this.m;
        if (customBannerAdapter != null) {
            omn.o(customBannerAdapter.getTrackingInfo(), mo.o0m.mm, z2 ? mo.o0m.no : mo.o0m.nm, "");
        }
    }

    @Override // com.thinkup.banner.unitgroup.api.CustomBannerEventListener
    public final void onDownloadConfirm(Context context, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
        o0 o0Var = this.o.get();
        if (o0Var != null) {
            o0Var.onDownloadConfirm(context, this.m, tUNetworkConfirmInfo);
        }
        CustomBannerAdapter customBannerAdapter = this.m;
        if (customBannerAdapter != null) {
            omn.o(customBannerAdapter.getTrackingInfo(), mo.o0m.mn, mo.o0m.no, "");
        }
    }
}

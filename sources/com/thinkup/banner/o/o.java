package com.thinkup.banner.o;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.thinkup.banner.unitgroup.api.CustomBannerAdapter;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUAdMultipleLoadedListener;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.api.TUAdStatusInfo;
import com.thinkup.core.api.TUNativeAdCustomRender;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.core.common.om;
import com.thinkup.core.common.on.mmm;
import com.thinkup.core.common.on.ono;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class o {
    public static final String o = "Bannero";
    private static final Map<String, o> oo = new ConcurrentHashMap(3);
    private final Context m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f41795n;
    private final om o0;

    private o(Context context, String str) {
        this.m = context.getApplicationContext();
        this.f41795n = str;
        this.o0 = om.o(context, str, "2");
    }

    public static o o(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, o> map = oo;
        o oVar = map.get(str);
        if (oVar != null) {
            return oVar;
        }
        synchronized (o.class) {
            if (oVar == null) {
                try {
                    oVar = new o(context, str);
                    map.put(str, oVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return oVar;
    }

    public final boolean m() {
        return this.o0.on();
    }

    public final void o(Context context, int i2, com.thinkup.core.common.n.o oVar, com.thinkup.core.common.n.n nVar, TUAdMultipleLoadedListener tUAdMultipleLoadedListener, Map<String, Object> map, TUAdRequest tUAdRequest) {
        mmm mmmVar = new mmm();
        mmmVar.o0 = nVar;
        mmmVar.om = tUAdMultipleLoadedListener;
        mmmVar.o(context);
        mmmVar.o(tUAdRequest);
        mmmVar.f42198n = i2;
        if (map != null) {
            try {
                mmmVar.on = new HashMap(map);
            } catch (Throwable unused) {
            }
        }
        if (tUAdRequest != null) {
            mmmVar.n0 = tUAdRequest.getTUAdxBidFloorInfo();
        }
        this.o0.m(this.m, "2", this.f41795n, mmmVar, oVar);
    }

    public final String o() {
        om omVar = this.o0;
        if (omVar != null) {
            return omVar.m0();
        }
        return "";
    }

    public final List<TUAdInfo> o(Context context) {
        return this.o0.o(context);
    }

    public final TUAdStatusInfo o(Context context, Map<String, Object> map) {
        return this.o0.o(context, map);
    }

    public final com.thinkup.core.common.on.o o(Context context, boolean z2, ono onoVar) {
        return this.o0.m(context, false, z2, onoVar);
    }

    public final void o(com.thinkup.core.common.on.o oVar) {
        this.o0.o(oVar);
    }

    public final View o(Context context, com.thinkup.core.common.on.o oVar, CustomBannerAdapter customBannerAdapter, final m mVar, TUNativeAdCustomRender tUNativeAdCustomRender) {
        if (customBannerAdapter != null && oVar != null) {
            if (!customBannerAdapter.isMixNative()) {
                customBannerAdapter.setAdEventListener(mVar);
                return customBannerAdapter.getBannerView();
            }
            if (oVar.om() == null) {
                return null;
            }
            com.thinkup.core.common.mn.n.o.o oVarO = com.thinkup.core.common.inner.mixad.m.m.o(customBannerAdapter, new com.thinkup.core.common.mn.o0.o.C0664o().o(context).o(customBannerAdapter.getTrackingInfo()).o(oVar.om()).o(tUNativeAdCustomRender).o(new com.thinkup.core.common.mn.oo.o(oVar) { // from class: com.thinkup.banner.o.o.1
                @Override // com.thinkup.core.common.mn.oo.o, com.thinkup.core.common.mn.oo.o.m
                public final void onAdClicked(View view) {
                    super.onAdClicked(view);
                    m mVar2 = mVar;
                    if (mVar2 != null) {
                        mVar2.onBannerAdClicked();
                    }
                }

                @Override // com.thinkup.core.common.mn.oo.o, com.thinkup.core.common.mn.oo.o.m
                public final void onAdImpressed() {
                    m mVar2 = mVar;
                    if (mVar2 != null) {
                        mVar2.onBannerAdShow();
                    }
                }

                @Override // com.thinkup.core.common.mn.oo.o, com.thinkup.core.common.mn.oo.o.m
                public final void onClose() {
                    m mVar2 = mVar;
                    if (mVar2 != null) {
                        mVar2.onBannerAdClose();
                    }
                }

                @Override // com.thinkup.core.common.mn.oo.o, com.thinkup.core.common.mn.oo.o.m
                public final void onDeeplinkCallback(boolean z2) {
                    m mVar2 = mVar;
                    if (mVar2 != null) {
                        mVar2.onDeeplinkCallback(z2);
                    }
                }

                @Override // com.thinkup.core.common.mn.oo.o, com.thinkup.core.common.mn.oo.o.m
                public final void onDownloadConfirmCallback(Context context2, View view, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
                    m mVar2 = mVar;
                    if (mVar2 != null) {
                        mVar2.onDownloadConfirm(context2, tUNetworkConfirmInfo);
                    }
                }
            }).o());
            if (oVarO instanceof com.thinkup.core.common.mn.n.o.m) {
                return ((com.thinkup.core.common.mn.n.o.m) oVarO).o();
            }
        }
        return null;
    }

    public static void o(String str) {
        Map<String, o> map = oo;
        if (map == null || TextUtils.isEmpty(str)) {
            return;
        }
        map.remove(str);
    }
}

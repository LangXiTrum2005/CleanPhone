package com.thinkup.interstitial.o;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.api.TUAdStatusInfo;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.core.common.n.mn;
import com.thinkup.core.common.n.mo;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.mmm;
import com.thinkup.core.common.on.n0;
import com.thinkup.core.common.on.on;
import com.thinkup.core.common.oo0.m0;
import com.thinkup.core.common.ooo;
import com.thinkup.core.common.ooo.m0m;
import com.thinkup.core.common.ooo.omn;
import com.thinkup.interstitial.api.TUInterstitialExListener;
import com.thinkup.interstitial.api.TUInterstitialListener;
import com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter;
import com.thinkup.interstitial.unitgroup.api.CustomInterstitialEventListener;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class om implements CustomInterstitialEventListener {
    CustomInterstitialAdapter m;
    private final o m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    long f42484n;
    TUInterstitialListener o;
    long o0;
    boolean on;
    int oo = 0;
    boolean om = true;

    public om(CustomInterstitialAdapter customInterstitialAdapter, TUInterstitialListener tUInterstitialListener, o oVar) {
        this.o = tUInterstitialListener;
        this.m = customInterstitialAdapter;
        this.m0 = oVar;
        if (oVar != null) {
            oVar.o(customInterstitialAdapter, this);
        }
    }

    private n0 o() {
        o oVar;
        n0 trackingInfo = this.m.getTrackingInfo();
        if (trackingInfo != null && (oVar = this.m0) != null) {
            if (oVar.m() == 0) {
                trackingInfo.nnm(0);
                trackingInfo.nnn(-1);
                return trackingInfo;
            }
            trackingInfo.nnm(this.m0.n());
            trackingInfo.nnn(this.m0.o0());
        }
        return trackingInfo;
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onDeeplinkCallback(boolean z2) {
        TUInterstitialListener tUInterstitialListener = this.o;
        if (tUInterstitialListener != null && (tUInterstitialListener instanceof TUInterstitialExListener)) {
            ((TUInterstitialExListener) tUInterstitialListener).onDeeplinkCallback(mn.o(this.m), z2);
        }
        CustomInterstitialAdapter customInterstitialAdapter = this.m;
        if (customInterstitialAdapter != null) {
            omn.o(customInterstitialAdapter.getTrackingInfo(), mo.o0m.mm, z2 ? mo.o0m.no : mo.o0m.nm, "");
        }
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onDownloadConfirm(Context context, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
        TUInterstitialListener tUInterstitialListener = this.o;
        if (tUInterstitialListener != null && (tUInterstitialListener instanceof TUInterstitialExListener)) {
            ((TUInterstitialExListener) tUInterstitialListener).onDownloadConfirm(context, mn.o(this.m), tUNetworkConfirmInfo);
        }
        CustomInterstitialAdapter customInterstitialAdapter = this.m;
        if (customInterstitialAdapter != null) {
            omn.o(customInterstitialAdapter.getTrackingInfo(), mo.o0m.mn, mo.o0m.no, "");
        }
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdClicked() {
        o oVar;
        if (this.m != null) {
            n0 n0VarO = o();
            m0m.n(n0VarO, this.m);
            com.thinkup.core.common.oo0.n.o(o0n.m().on()).o(6, n0VarO);
            if (n0VarO != null ? n0VarO.o0no() : false) {
                return;
            } else {
                omn.o(n0VarO, mo.o0m.o0, mo.o0m.no, "");
            }
        }
        com.thinkup.core.common.ooo.n.o().m(this.m);
        TUInterstitialListener tUInterstitialListener = this.o;
        if (tUInterstitialListener != null) {
            tUInterstitialListener.onInterstitialAdClicked(mn.o(this.m));
        }
        CustomInterstitialAdapter customInterstitialAdapter = this.m;
        if (customInterstitialAdapter == null || (oVar = this.m0) == null) {
            return;
        }
        oVar.m(customInterstitialAdapter);
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdClose() {
        CustomInterstitialAdapter customInterstitialAdapter = this.m;
        if (customInterstitialAdapter != null) {
            o oVar = this.m0;
            if (oVar != null) {
                oVar.n(customInterstitialAdapter);
            }
            n0 trackingInfo = this.m.getTrackingInfo();
            int dismissType = this.oo;
            if (dismissType == 0) {
                dismissType = this.m.getDismissType();
            }
            if (dismissType == 0) {
                dismissType = 1;
            }
            trackingInfo.moo(dismissType);
            o oVar2 = this.m0;
            if (oVar2 != null) {
                trackingInfo.nnm(oVar2.n());
                trackingInfo.nn0(this.m0.om());
                trackingInfo.nno(this.m0.oo());
            }
            omn.o(trackingInfo, mo.o0m.oo, mo.o0m.no, "");
            long j = this.f42484n;
            if (j != 0) {
                com.thinkup.core.common.oo0.oo.o(trackingInfo, false, j, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.o0);
            }
            Map<String, Object> adExtraInfoMap = this.m.getAdExtraInfoMap();
            if (adExtraInfoMap != null) {
                Object obj = adExtraInfoMap.get("close_scene");
                if (obj instanceof Integer) {
                    trackingInfo.mno(((Integer) obj).intValue());
                }
            }
            com.thinkup.core.common.oo0.oo.o(trackingInfo, false);
            try {
                com.thinkup.core.common.ooo.o0.o().o0(this.m);
                this.m.clearImpressionListener();
                this.m.internalDestory();
            } catch (Throwable unused) {
            }
            o oVar3 = this.m0;
            if (oVar3 == null) {
                TUInterstitialListener tUInterstitialListener = this.o;
                if (tUInterstitialListener != null) {
                    tUInterstitialListener.onInterstitialAdClose(mn.o(trackingInfo, this.m));
                }
            } else if (oVar3.m() != 1) {
                this.m0.o();
                TUInterstitialListener tUInterstitialListener2 = this.o;
                if (tUInterstitialListener2 != null) {
                    tUInterstitialListener2.onInterstitialAdClose(mn.o(trackingInfo, this.m));
                }
            }
            o(trackingInfo.oomn());
            o(trackingInfo.oomn(), 18);
        }
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdShow() {
        o oVar;
        CustomInterstitialAdapter customInterstitialAdapter = this.m;
        if (customInterstitialAdapter != null && (oVar = this.m0) != null) {
            oVar.o(customInterstitialAdapter);
        }
        if ((this.m == null || (com.thinkup.core.common.ooo.o0.o().o(this.m) && com.thinkup.core.common.ooo.o0.o().m(this.m))) && !this.on) {
            this.on = true;
            com.thinkup.core.common.ooo.n.o().o(this.m);
            this.f42484n = System.currentTimeMillis();
            this.o0 = SystemClock.elapsedRealtime();
            mn mnVarO = mn.o(this.m);
            if (this.m != null) {
                final n0 n0VarO = o();
                n0VarO.o(this.m.getInternalNetworkInfoMap());
                String ilrd = this.m.getILRD();
                if (!TextUtils.isEmpty(ilrd)) {
                    n0VarO.o0(ilrd);
                }
                com.thinkup.core.common.ooo.o0.o().o(n0VarO, this.m.getUnitGroupInfo(), 6);
                omn.o(n0VarO, mo.o0m.f41901n, mo.o0m.no, "");
                com.thinkup.core.common.ooo.o0.o().o(this.m, new com.thinkup.core.common.ooo.o0.o() { // from class: com.thinkup.interstitial.o.om.1
                    @Override // com.thinkup.core.common.ooo.o0.o
                    public final void m() {
                    }

                    @Override // com.thinkup.core.common.ooo.o0.o
                    public final void o() {
                        m0m.m(n0VarO, om.this.m);
                        com.thinkup.core.common.oo0.n.o(o0n.m().on()).o(4, n0VarO, om.this.m.getUnitGroupInfo());
                    }
                });
                String strOomn = n0VarO.oomn();
                ooo.o().o(strOomn, mnVarO);
                o(strOomn, 6);
            }
            if (this.o != null) {
                if (mnVarO.getNetworkFirmId() == -1) {
                    m0.o("Interstitial", this.m, null);
                }
                this.o.onInterstitialAdShow(mnVarO);
            }
        }
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdVideoEnd() {
        CustomInterstitialAdapter customInterstitialAdapter = this.m;
        if (customInterstitialAdapter != null) {
            if (customInterstitialAdapter.getDismissType() == 0) {
                this.oo = 3;
            }
            n0 trackingInfo = this.m.getTrackingInfo();
            com.thinkup.core.common.oo0.n.o(o0n.m().on()).o(9, trackingInfo);
            TUInterstitialListener tUInterstitialListener = this.o;
            if (tUInterstitialListener != null) {
                tUInterstitialListener.onInterstitialAdVideoEnd(mn.o(this.m));
            }
            omn.o(trackingInfo, mo.o0m.on, mo.o0m.no, "");
        }
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdVideoError(String str, String str2) {
        this.oo = 99;
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.adShowError, str, str2);
        CustomInterstitialAdapter customInterstitialAdapter = this.m;
        if (customInterstitialAdapter != null) {
            n0 trackingInfo = customInterstitialAdapter.getTrackingInfo();
            if (trackingInfo.n0n() == 66) {
                this.om = false;
            }
            com.thinkup.core.common.oo0.oo.o(trackingInfo, errorCode, this.m.getInternalNetworkInfoMap());
            String strOomn = trackingInfo.oomn();
            o(trackingInfo.oomn());
            o(strOomn, 7);
            omn.o(trackingInfo, mo.o0m.m0, mo.o0m.nm, str2);
        }
        TUInterstitialListener tUInterstitialListener = this.o;
        if (tUInterstitialListener != null) {
            tUInterstitialListener.onInterstitialAdVideoError(errorCode);
        }
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdVideoStart() {
        CustomInterstitialAdapter customInterstitialAdapter = this.m;
        if (customInterstitialAdapter != null) {
            n0 trackingInfo = customInterstitialAdapter.getTrackingInfo();
            if (this.om) {
                com.thinkup.core.common.oo0.n.o(o0n.m().on()).o(8, trackingInfo);
                TUInterstitialListener tUInterstitialListener = this.o;
                if (tUInterstitialListener != null) {
                    tUInterstitialListener.onInterstitialAdVideoStart(mn.o(this.m));
                }
            }
        }
    }

    private static void o(String str) {
        on onVarN;
        if (TextUtils.isEmpty(str) || (onVarN = ooo.o().n(str)) == null) {
            return;
        }
        ooo.o().o0(str);
        com.thinkup.core.common.om.o(o0n.m().on(), str, "3").n(ooo.o().m(str, onVarN.o()));
    }

    private static void o(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.thinkup.core.common.om omVarO = com.thinkup.core.common.om.o(o0n.m().mm0(), str, "3");
        if (omVarO.o((TUAdStatusInfo) null, i2)) {
            mmm mmmVar = new mmm();
            mmmVar.o(o0n.m().mm0());
            mmmVar.f42198n = i2;
            if (omVarO.mo() != null) {
                mmmVar.o(omVarO.mo());
            }
            omVarO.m(o0n.m().mm0(), "3", str, mmmVar, null);
        }
    }
}

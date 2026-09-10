package com.thinkup.rewardvideo.o;

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
import com.thinkup.core.common.on.noo;
import com.thinkup.core.common.on.on;
import com.thinkup.core.common.oo0.m0;
import com.thinkup.core.common.ooo;
import com.thinkup.core.common.ooo.m0m;
import com.thinkup.core.common.ooo.nn;
import com.thinkup.core.common.ooo.omn;
import com.thinkup.rewardvideo.api.TURewardVideoExListener;
import com.thinkup.rewardvideo.api.TURewardVideoListener;
import com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class om implements CustomRewardedVideoEventListener {
    long m;
    long m0;
    boolean mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f42652n;
    boolean n0;
    private TURewardVideoListener nm;
    private CustomRewardVideoAdapter nn;
    boolean no;
    boolean o0;
    private com.thinkup.core.common.mm.oo o00;
    private long o0m;
    private long o0o;
    boolean om;
    long on;
    n0 oo;
    int mm = 0;
    long o = 0;
    boolean mn = true;

    public om(CustomRewardVideoAdapter customRewardVideoAdapter, com.thinkup.core.common.mm.oo ooVar, TURewardVideoListener tURewardVideoListener) {
        this.nm = tURewardVideoListener;
        this.nn = customRewardVideoAdapter;
        this.o00 = ooVar;
    }

    private static void m(n0 n0Var) {
        omn.o(n0Var, mo.o0m.on, mo.o0m.no, "");
        com.thinkup.core.common.oo0.n.o(o0n.m().on()).o(9, n0Var);
    }

    private boolean n(n0 n0Var) {
        m0m.n(n0Var, this.nn);
        com.thinkup.core.common.oo0.n.o(o0n.m().on()).o(6, n0Var);
        if (n0Var != null ? n0Var.o0no() : false) {
            return false;
        }
        com.thinkup.core.common.ooo.n.o().m(this.nn);
        omn.o(n0Var, mo.o0m.o0, mo.o0m.no, "");
        return true;
    }

    private void o0(n0 n0Var) {
        com.thinkup.core.common.oo0.n.o(o0n.m().on()).o(13, n0Var, this.nn.getUnitGroupInfo());
        com.thinkup.core.common.ooo.o0.o().o(n0Var, this.nn.getUnitGroupInfo(), com.thinkup.core.common.ooo.o0.m);
        o(n0Var);
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onAgainReward() {
        com.thinkup.core.common.mm.oo ooVar;
        if (this.nn == null || com.thinkup.core.common.ooo.o0.o().n(this.nn)) {
            n0 n0VarO = o();
            if (!this.om && (ooVar = this.o00) != null) {
                o(ooVar, n0VarO, true, true);
                this.o00.o(this.on, this.m0, this.nn, n0VarO);
            }
            this.om = true;
            TURewardVideoListener tURewardVideoListener = this.nm;
            if (tURewardVideoListener != null && (tURewardVideoListener instanceof TURewardVideoExListener)) {
                ((TURewardVideoExListener) tURewardVideoListener).onAgainReward(mn.o(n0VarO, this.nn));
            }
            if (this.nn != null) {
                omn.o(n0VarO, mo.o0m.mo, mo.o0m.no, "");
            }
        }
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onAgainRewardFailed() {
        try {
            if (this.om) {
                return;
            }
            this.om = true;
            n0 n0VarO = o();
            o(this.o00, n0VarO, false, true);
            TURewardVideoListener tURewardVideoListener = this.nm;
            if (tURewardVideoListener != null && (tURewardVideoListener instanceof TURewardVideoExListener)) {
                ((TURewardVideoExListener) tURewardVideoListener).onAgainRewardFailed(mn.o(n0VarO, this.nn));
            }
            if (this.nn != null) {
                omn.o(n0VarO, mo.o0m.mo, mo.o0m.nm, "");
            }
        } catch (Throwable th) {
            com.thinkup.core.common.oo0.oo.m("onAgainRewardFailed error", th.getMessage(), o0n.m().o0m());
        }
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onDeeplinkCallback(boolean z2) {
        TURewardVideoListener tURewardVideoListener = this.nm;
        if (tURewardVideoListener != null && (tURewardVideoListener instanceof TURewardVideoExListener)) {
            ((TURewardVideoExListener) tURewardVideoListener).onDeeplinkCallback(mn.o(this.nn), z2);
        }
        CustomRewardVideoAdapter customRewardVideoAdapter = this.nn;
        if (customRewardVideoAdapter != null) {
            omn.o(customRewardVideoAdapter.getTrackingInfo(), mo.o0m.mm, z2 ? mo.o0m.no : mo.o0m.nm, "");
        }
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onDownloadConfirm(Context context, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
        TURewardVideoListener tURewardVideoListener = this.nm;
        if (tURewardVideoListener != null && (tURewardVideoListener instanceof TURewardVideoExListener)) {
            ((TURewardVideoExListener) tURewardVideoListener).onDownloadConfirm(context, mn.o(this.nn), tUNetworkConfirmInfo);
        }
        CustomRewardVideoAdapter customRewardVideoAdapter = this.nn;
        if (customRewardVideoAdapter != null) {
            omn.o(customRewardVideoAdapter.getTrackingInfo(), mo.o0m.mn, mo.o0m.no, "");
        }
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onReward() {
        if ((this.nn == null || com.thinkup.core.common.ooo.o0.o().n(this.nn)) && !this.o0) {
            this.o0 = true;
            if (!this.f42652n && this.o00 != null) {
                n0 trackingInfo = this.nn.getTrackingInfo();
                o(this.o00, trackingInfo, true, false);
                this.o00.o(this.o0o, this.o0m, this.nn, trackingInfo);
            }
            this.f42652n = true;
            TURewardVideoListener tURewardVideoListener = this.nm;
            if (tURewardVideoListener != null) {
                tURewardVideoListener.onReward(mn.o(this.nn));
            }
            CustomRewardVideoAdapter customRewardVideoAdapter = this.nn;
            if (customRewardVideoAdapter != null) {
                omn.o(customRewardVideoAdapter.getTrackingInfo(), mo.o0m.mo, mo.o0m.no, "");
            }
        }
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardFailed() {
        try {
            if (this.o0) {
                return;
            }
            this.o0 = true;
            n0 trackingInfo = this.nn.getTrackingInfo();
            o(this.o00, trackingInfo, false, false);
            TURewardVideoListener tURewardVideoListener = this.nm;
            if (tURewardVideoListener != null && (tURewardVideoListener instanceof TURewardVideoExListener)) {
                ((TURewardVideoExListener) tURewardVideoListener).onRewardFailed(mn.o(this.nn));
            }
            if (this.nn != null) {
                omn.o(trackingInfo, mo.o0m.mo, mo.o0m.nm, "");
            }
        } catch (Throwable th) {
            com.thinkup.core.common.oo0.oo.m("onRewardFailed error", th.getMessage(), o0n.m().o0m());
        }
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdAgainPlayClicked() {
        TURewardVideoListener tURewardVideoListener;
        n0 n0VarO = o();
        if (((this.nn == null || n0VarO == null) ? true : n(n0VarO)) && (tURewardVideoListener = this.nm) != null && (tURewardVideoListener instanceof TURewardVideoExListener)) {
            ((TURewardVideoExListener) tURewardVideoListener).onRewardedVideoAdAgainPlayClicked(mn.o(n0VarO, this.nn));
        }
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdAgainPlayEnd() {
        if (this.mo) {
            return;
        }
        this.mo = true;
        if (this.m0 == 0) {
            this.m0 = SystemClock.elapsedRealtime();
        }
        n0 n0VarO = o();
        if (this.nn != null && n0VarO != null) {
            m(n0VarO);
        }
        TURewardVideoListener tURewardVideoListener = this.nm;
        if (tURewardVideoListener == null || !(tURewardVideoListener instanceof TURewardVideoExListener)) {
            return;
        }
        ((TURewardVideoExListener) tURewardVideoListener).onRewardedVideoAdAgainPlayEnd(mn.o(n0VarO, this.nn));
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdAgainPlayFailed(String str, String str2) {
        this.mm = 99;
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.adShowError, str, str2);
        n0 n0VarO = o();
        if (this.nn != null && n0VarO != null) {
            o(errorCode, n0VarO);
        }
        TURewardVideoListener tURewardVideoListener = this.nm;
        if (tURewardVideoListener == null || !(tURewardVideoListener instanceof TURewardVideoExListener)) {
            return;
        }
        ((TURewardVideoExListener) tURewardVideoListener).onRewardedVideoAdAgainPlayFailed(errorCode, mn.o(n0VarO, this.nn));
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdAgainPlayStart() {
        if (this.nn == null || (com.thinkup.core.common.ooo.o0.o().o(this.nn) && com.thinkup.core.common.ooo.o0.o().m(this.nn))) {
            this.mm = 0;
            if (this.on == 0) {
                this.on = SystemClock.elapsedRealtime();
            }
            this.m0 = 0L;
            n0 n0VarO = o();
            if (this.nn != null && n0VarO != null) {
                com.thinkup.core.common.ooo.o0.o().o(n0VarO, this.nn.getUnitGroupInfo(), 6);
                com.thinkup.core.common.oo0.n.o(o0n.m().on()).o(13, n0VarO, this.nn.getUnitGroupInfo());
                com.thinkup.core.common.ooo.o0.o().o(n0VarO, this.nn.getUnitGroupInfo(), com.thinkup.core.common.ooo.o0.m);
                o(n0VarO);
                com.thinkup.core.common.mm.oo ooVar = this.o00;
                if (ooVar != null) {
                    ooVar.o(this.m, this.nn, n0VarO);
                }
            }
            TURewardVideoListener tURewardVideoListener = this.nm;
            if (tURewardVideoListener == null || !(tURewardVideoListener instanceof TURewardVideoExListener)) {
                return;
            }
            ((TURewardVideoExListener) tURewardVideoListener).onRewardedVideoAdAgainPlayStart(mn.o(n0VarO, this.nn));
        }
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdClosed() {
        CustomRewardVideoAdapter customRewardVideoAdapter = this.nn;
        if (customRewardVideoAdapter != null) {
            n0 trackingInfo = customRewardVideoAdapter.getTrackingInfo();
            int dismissType = this.mm;
            if (dismissType == 0) {
                dismissType = this.nn.getDismissType();
            }
            if (dismissType == 0) {
                dismissType = 1;
            }
            trackingInfo.moo(dismissType);
            omn.o(trackingInfo, mo.o0m.oo, mo.o0m.no, this.f42652n ? "" : "onReward() is not fired");
            long j = this.o;
            if (j != 0) {
                com.thinkup.core.common.oo0.oo.o(trackingInfo, this.f42652n, j, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.m);
            }
            Map<String, Object> adExtraInfoMap = this.nn.getAdExtraInfoMap();
            if (adExtraInfoMap != null) {
                Object obj = adExtraInfoMap.get("close_scene");
                if (obj instanceof Integer) {
                    trackingInfo.mno(((Integer) obj).intValue());
                }
            }
            com.thinkup.core.common.oo0.oo.o(trackingInfo, this.f42652n);
            if (this.o0) {
                try {
                    com.thinkup.core.common.ooo.o0.o().o0(this.nn);
                    this.nn.clearImpressionListener();
                    this.nn.internalDestory();
                } catch (Throwable unused) {
                }
            } else {
                o0n.m().o(new Runnable() { // from class: com.thinkup.rewardvideo.o.om.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            com.thinkup.core.common.ooo.o0.o().o0(om.this.nn);
                            om.this.nn.clearImpressionListener();
                            om.this.nn.internalDestory();
                        } catch (Throwable unused2) {
                        }
                    }
                }, 5000L);
            }
            o(trackingInfo.oomn());
            TURewardVideoListener tURewardVideoListener = this.nm;
            if (tURewardVideoListener != null) {
                tURewardVideoListener.onRewardedVideoAdClosed(mn.o(trackingInfo, this.nn));
            }
            o(trackingInfo.oomn(), 18);
        }
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdPlayClicked() {
        TURewardVideoListener tURewardVideoListener;
        CustomRewardVideoAdapter customRewardVideoAdapter = this.nn;
        if (!(customRewardVideoAdapter != null ? n(customRewardVideoAdapter.getTrackingInfo()) : true) || (tURewardVideoListener = this.nm) == null) {
            return;
        }
        tURewardVideoListener.onRewardedVideoAdPlayClicked(mn.o(this.nn));
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdPlayEnd() {
        if (this.no) {
            return;
        }
        this.no = true;
        if (this.o0m == 0) {
            this.o0m = SystemClock.elapsedRealtime();
        }
        CustomRewardVideoAdapter customRewardVideoAdapter = this.nn;
        if (customRewardVideoAdapter != null) {
            if (customRewardVideoAdapter.getDismissType() == 0) {
                this.mm = 3;
            }
            m(this.nn.getTrackingInfo());
        }
        TURewardVideoListener tURewardVideoListener = this.nm;
        if (tURewardVideoListener != null) {
            tURewardVideoListener.onRewardedVideoAdPlayEnd(mn.o(this.nn));
        }
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdPlayFailed(String str, String str2) {
        this.mm = 99;
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.adShowError, str, str2);
        CustomRewardVideoAdapter customRewardVideoAdapter = this.nn;
        if (customRewardVideoAdapter != null) {
            n0 trackingInfo = customRewardVideoAdapter.getTrackingInfo();
            if (trackingInfo.n0n() == 66) {
                this.mn = false;
            }
            String strOomn = trackingInfo.oomn();
            o(errorCode, trackingInfo);
            o(trackingInfo.oomn());
            o(strOomn, 7);
        }
        TURewardVideoListener tURewardVideoListener = this.nm;
        if (tURewardVideoListener != null) {
            tURewardVideoListener.onRewardedVideoAdPlayFailed(errorCode, mn.o(this.nn));
        }
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdPlayStart() {
        if ((this.nn == null || (com.thinkup.core.common.ooo.o0.o().o(this.nn) && com.thinkup.core.common.ooo.o0.o().m(this.nn))) && !this.n0) {
            this.n0 = true;
            this.o = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.m = jElapsedRealtime;
            if (this.o0o == 0) {
                this.o0o = jElapsedRealtime;
            }
            mn mnVarO = mn.o(this.nn);
            CustomRewardVideoAdapter customRewardVideoAdapter = this.nn;
            if (customRewardVideoAdapter != null) {
                n0 trackingInfo = customRewardVideoAdapter.getTrackingInfo();
                trackingInfo.o(this.nn.getInternalNetworkInfoMap());
                com.thinkup.core.common.ooo.o0.o().o(trackingInfo, this.nn.getUnitGroupInfo(), 6);
                o(trackingInfo);
                com.thinkup.core.common.mm.oo ooVar = this.o00;
                if (ooVar != null) {
                    ooVar.o(this.m, this.nn, trackingInfo);
                }
                String strOomn = trackingInfo.oomn();
                ooo.o().o(strOomn, mnVarO);
                o(strOomn, 6);
            }
            if (!this.mn || this.nm == null) {
                return;
            }
            if (mnVarO.getNetworkFirmId() == -1) {
                m0.o("RewardedVideo", this.nn, null);
            }
            this.nm.onRewardedVideoAdPlayStart(mnVarO);
        }
    }

    private n0 o() {
        CustomRewardVideoAdapter customRewardVideoAdapter;
        if (this.oo == null && (customRewardVideoAdapter = this.nn) != null) {
            n0 n0VarNmm = customRewardVideoAdapter.getTrackingInfo().nmm();
            this.oo = n0VarNmm;
            n0VarNmm.oo0 = 6;
            this.oo.nm(nn.m(n0VarNmm.oon0(), this.oo.mon(), System.currentTimeMillis()));
        }
        return this.oo;
    }

    private void o(final n0 n0Var) {
        com.thinkup.core.common.ooo.n.o().o(this.nn);
        String ilrd = this.nn.getILRD();
        if (!TextUtils.isEmpty(ilrd)) {
            n0Var.o0(ilrd);
        }
        com.thinkup.core.common.ooo.o0.o().o(this.nn, new com.thinkup.core.common.ooo.o0.o() { // from class: com.thinkup.rewardvideo.o.om.2
            @Override // com.thinkup.core.common.ooo.o0.o
            public final void m() {
            }

            @Override // com.thinkup.core.common.ooo.o0.o
            public final void o() {
                m0m.m(n0Var, om.this.nn);
                com.thinkup.core.common.oo0.n.o(o0n.m().on()).o(4, n0Var, om.this.nn.getUnitGroupInfo());
            }
        });
        if (this.mn) {
            com.thinkup.core.common.oo0.n.o(o0n.m().on()).o(8, n0Var);
        }
        omn.o(n0Var, mo.o0m.f41901n, mo.o0m.no, "");
    }

    private void o(AdError adError, n0 n0Var) {
        omn.o(n0Var, mo.o0m.f41901n, mo.o0m.nm, adError.printStackTrace());
        CustomRewardVideoAdapter customRewardVideoAdapter = this.nn;
        com.thinkup.core.common.oo0.oo.o(n0Var, adError, customRewardVideoAdapter != null ? customRewardVideoAdapter.getInternalNetworkInfoMap() : null);
    }

    private void o(com.thinkup.core.common.mm.oo ooVar, n0 n0Var, boolean z2, boolean z3) {
        long jElapsedRealtime;
        long j;
        boolean z4 = z3 ? this.mo : this.no;
        com.thinkup.core.common.mo.o();
        String strO0 = com.thinkup.core.common.mo.o0();
        n0Var.o(noo.o(z4, strO0, z2, this.nn.getNetworkInfoMap()));
        com.thinkup.core.common.oo0.n.o(o0n.m().on()).o(25, n0Var);
        if (z3) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
            j = this.on;
        } else {
            jElapsedRealtime = SystemClock.elapsedRealtime();
            j = this.o0o;
        }
        com.thinkup.core.common.oo0.oo.o(ooVar, z2, n0Var, jElapsedRealtime - j, z4, strO0, this.nn);
    }

    private static void o(String str) {
        on onVarN;
        if (TextUtils.isEmpty(str) || (onVarN = ooo.o().n(str)) == null) {
            return;
        }
        ooo.o().o0(str);
        com.thinkup.core.common.om.o(o0n.m().on(), str, "1").n(ooo.o().m(str, onVarN.o()));
    }

    private static void o(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.thinkup.core.common.om omVarO = com.thinkup.core.common.om.o(o0n.m().mm0(), str, "1");
        if (omVarO.o((TUAdStatusInfo) null, i2)) {
            mmm mmmVar = new mmm();
            mmmVar.o(o0n.m().mm0());
            mmmVar.f42198n = i2;
            if (omVarO.mo() != null) {
                mmmVar.o(omVarO.mo());
            }
            omVarO.m(o0n.m().mm0(), "1", str, mmmVar, null);
        }
    }
}

package com.thinkup.core.common.ooo;

import android.text.TextUtils;
import com.thinkup.core.api.TUAdMixBidInfo;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.common.on.mnn;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.o0mo;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class n {
    private static volatile n m = null;
    private static final String o = "thinkup_event_listener";

    private n() {
    }

    public static n o() {
        if (m == null) {
            synchronized (n.class) {
                try {
                    if (m == null) {
                        m = new n();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    public final void m(TUBaseAdAdapter tUBaseAdAdapter) {
        if (tUBaseAdAdapter != null) {
            m(tUBaseAdAdapter, tUBaseAdAdapter.getTrackingInfo(), true);
        }
    }

    public final void m(TUBaseAdAdapter tUBaseAdAdapter, com.thinkup.core.common.on.n0 n0Var, boolean z2) {
        if (tUBaseAdAdapter != null && z2) {
            o(n0Var, tUBaseAdAdapter.getUnitGroupInfo(), tUBaseAdAdapter, 1);
        }
        try {
            if (TUSDK.isCnSDK()) {
                com.thinkup.core.o.m.o.o();
                com.thinkup.core.o.m.o.o(tUBaseAdAdapter, com.thinkup.core.o.m.o.f42427n, n0Var.oono());
            }
        } catch (Throwable unused) {
        }
    }

    private static void o(com.thinkup.core.common.on.o oVar) {
        if (oVar != null) {
            try {
                TUBaseAdAdapter tUBaseAdAdapterOo = oVar.oo();
                if (tUBaseAdAdapterOo != null) {
                    com.thinkup.core.o.m.o.o();
                    com.thinkup.core.o.m.o.o(tUBaseAdAdapterOo, com.thinkup.core.o.m.o.o, tUBaseAdAdapterOo.getTrackingInfo().oono());
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void o(TUBaseAdAdapter tUBaseAdAdapter) {
        if (tUBaseAdAdapter != null) {
            o(tUBaseAdAdapter, tUBaseAdAdapter.getTrackingInfo(), true);
        }
    }

    public final void o(TUBaseAdAdapter tUBaseAdAdapter, com.thinkup.core.common.on.n0 n0Var, boolean z2) {
        if (tUBaseAdAdapter != null && z2) {
            o(n0Var, tUBaseAdAdapter.getUnitGroupInfo(), tUBaseAdAdapter, 0);
        }
        try {
            if (TUSDK.isCnSDK()) {
                com.thinkup.core.o.m.o.o();
                com.thinkup.core.o.m.o.o(tUBaseAdAdapter, com.thinkup.core.o.m.o.m, n0Var.oono());
            }
        } catch (Throwable unused) {
        }
    }

    private void o(final o0mo o0moVar, o0mm o0mmVar, final TUBaseAdAdapter tUBaseAdAdapter, final int i2) {
        if (o0moVar == null || o0mmVar == null || o0mmVar.nm() == 8) {
            return;
        }
        com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.ooo.n.1
            @Override // java.lang.Runnable
            public final void run() {
                TUAdMixBidInfo.XBiddingInfo xBiddingInfo;
                TUAdMixBidInfo.BidEntity biddingInfo;
                try {
                    com.thinkup.core.oo.m mVarM = com.thinkup.core.oo.o0.o(com.thinkup.core.common.n.o0n.m().on()).m(com.thinkup.core.common.n.o0n.m().o00());
                    if (mVarM == null || mVarM.n() == null || !mVarM.n().contains(28) || (xBiddingInfo = TUAdMixBidInfo.getInstance().getXBiddingInfo()) == null || (biddingInfo = xBiddingInfo.getBiddingInfo(com.thinkup.core.common.n.mn.o(tUBaseAdAdapter))) == null) {
                        return;
                    }
                    String adTittle = biddingInfo.getAdTittle();
                    String adUserName = biddingInfo.getAdUserName();
                    if (TextUtils.isEmpty(adTittle) && TextUtils.isEmpty(adUserName)) {
                        return;
                    }
                    List<com.thinkup.core.common.on.o> listO = com.thinkup.core.common.o.o().o(o0moVar.oomn());
                    if (listO != null) {
                        listO.size();
                        for (com.thinkup.core.common.on.o oVar : listO) {
                            if (oVar != null && oVar.n() == 0) {
                                com.thinkup.core.common.on.n0 n0VarMo = oVar.mo();
                                o0mm unitGroupInfo = oVar.oo().getUnitGroupInfo();
                                if (unitGroupInfo != null && unitGroupInfo.nm() == 28 && unitGroupInfo.oom()) {
                                    com.thinkup.core.common.on.on0 on0VarN0n = unitGroupInfo.n0n();
                                    Objects.toString(on0VarN0n);
                                    if (on0VarN0n != null) {
                                        mnn mnnVar = new mnn(8, unitGroupInfo, n0VarMo, nn.o(unitGroupInfo));
                                        mnnVar.o(biddingInfo);
                                        mnnVar.o(i2);
                                        com.thinkup.core.n.o0.n.o(on0VarN0n, mnnVar, true, 32);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }, 2);
    }
}

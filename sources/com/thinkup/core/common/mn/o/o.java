package com.thinkup.core.common.mn.o;

import com.thinkup.core.api.ITUBaseAdAdapter;
import com.thinkup.core.api.TUBiddingListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.common.mn.on.n;

/* JADX INFO: loaded from: classes6.dex */
public final class o {
    private static ITUBaseAdAdapter o(ITUBaseAdAdapter iTUBaseAdAdapter) {
        return new m(iTUBaseAdAdapter);
    }

    private static TUCustomLoadListener o(ITUBaseAdAdapter iTUBaseAdAdapter, TUCustomLoadListener tUCustomLoadListener) {
        if (iTUBaseAdAdapter == null || tUCustomLoadListener == null) {
            return null;
        }
        com.thinkup.core.common.mn.o0.m serverExtraInfo = iTUBaseAdAdapter.getServerExtraInfo();
        return (serverExtraInfo == null || !serverExtraInfo.mn()) ? tUCustomLoadListener : new n(tUCustomLoadListener, serverExtraInfo);
    }

    private static TUBiddingListener o(ITUBaseAdAdapter iTUBaseAdAdapter, TUBiddingListener tUBiddingListener) {
        if (iTUBaseAdAdapter == null || tUBiddingListener == null) {
            return null;
        }
        com.thinkup.core.common.mn.o0.m serverExtraInfo = iTUBaseAdAdapter.getServerExtraInfo();
        return (serverExtraInfo == null || !serverExtraInfo.mn()) ? tUBiddingListener : new com.thinkup.core.common.mn.on.m(tUBiddingListener, serverExtraInfo);
    }
}

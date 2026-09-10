package com.thinkup.core.api;

import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.o0om;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class MediationBidManager {
    public static final String NO_BID_TOKEN_ERROR = "NO_BID_TOKEN";
    protected String mRequestUrl;

    public interface BidListener {
        void onBidFail(String str);

        void onBidStart(o0mm o0mmVar, TUBaseAdAdapter tUBaseAdAdapter);

        void onBidSuccess(List<o0mm> list);
    }

    public abstract void notifyWinnerDisplay(String str, o0mm o0mmVar);

    public void setBidRequestUrl(String str) {
        this.mRequestUrl = str;
    }

    public abstract void startBid(o0om o0omVar, BidListener bidListener);
}

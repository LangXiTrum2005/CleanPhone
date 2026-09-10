package com.thinkup.core.common.on;

import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TURequestingInfo;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class o0on extends TURequestingInfo {
    protected List<TUAdInfo> m;
    protected List<TUAdInfo> o;

    public o0on(List<TUAdInfo> list, List<TUAdInfo> list2) {
        this.o = list;
        this.m = list2;
    }

    @Override // com.thinkup.core.api.TURequestingInfo
    public final List<TUAdInfo> getBiddingAttemptAdInfoList() {
        return this.m;
    }

    @Override // com.thinkup.core.api.TURequestingInfo
    public final List<TUAdInfo> getLoadingAdInfoList() {
        return this.o;
    }
}

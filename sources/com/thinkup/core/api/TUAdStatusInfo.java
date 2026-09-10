package com.thinkup.core.api;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class TUAdStatusInfo {
    private boolean mIsLoading;
    private boolean mIsReady;
    private TUAdInfo mTUTopAdInfo;

    public TUAdStatusInfo(boolean z2, boolean z3, TUAdInfo tUAdInfo) {
        this.mIsLoading = z2;
        this.mIsReady = z3;
        this.mTUTopAdInfo = tUAdInfo;
    }

    public TUAdInfo getTUTopAdInfo() {
        return this.mTUTopAdInfo;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public boolean isReady() {
        return this.mIsReady;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TUAdStatusInfo{isLoading=");
        sb.append(this.mIsLoading);
        sb.append(", isReady=");
        sb.append(this.mIsReady);
        sb.append(", topAdInfo=");
        Object obj = this.mTUTopAdInfo;
        if (obj == null) {
            obj = AbstractJsonLexerKt.NULL;
        }
        sb.append(obj);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}

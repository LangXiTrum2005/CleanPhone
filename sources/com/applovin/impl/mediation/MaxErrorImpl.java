package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MaxErrorImpl implements MaxError {

    @Nullable
    private String adLoadFailureInfo;
    private final int errorCode;
    private final String errorMessage;
    private String loadTag;
    private final int mediatedNetworkErrorCode;
    private final String mediatedNetworkErrorMessage;
    private long requestLatencyMillis;
    private MaxAdWaterfallInfo waterfall;

    public MaxErrorImpl(int i10) {
        this(i10, "");
    }

    @Override // com.applovin.mediation.MaxError
    @Nullable
    public String getAdLoadFailureInfo() {
        return this.adLoadFailureInfo;
    }

    @Override // com.applovin.mediation.MaxError
    public int getCode() {
        return this.errorCode;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public String getLoadTag() {
        return this.loadTag;
    }

    @Override // com.applovin.mediation.MaxError
    public int getMediatedNetworkErrorCode() {
        return this.mediatedNetworkErrorCode;
    }

    @Override // com.applovin.mediation.MaxError
    public String getMediatedNetworkErrorMessage() {
        return this.mediatedNetworkErrorMessage;
    }

    @Override // com.applovin.mediation.MaxError
    public String getMessage() {
        return this.errorMessage;
    }

    @Override // com.applovin.mediation.MaxError
    public long getRequestLatencyMillis() {
        return this.requestLatencyMillis;
    }

    @Override // com.applovin.mediation.MaxError
    @Nullable
    public MaxAdWaterfallInfo getWaterfall() {
        return this.waterfall;
    }

    public void setAdLoadFailureInfo(@Nullable String str) {
        this.adLoadFailureInfo = str;
    }

    public void setLoadTag(@Nullable String str) {
        this.loadTag = str;
    }

    public void setRequestLatencyMillis(long j10) {
        this.requestLatencyMillis = j10;
    }

    public void setWaterfall(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.waterfall = maxAdWaterfallInfo;
    }

    @NonNull
    public String toString() {
        return "MaxError{code=" + getCode() + ", message=\"" + getMessage() + "\", mediatedNetworkErrorCode=" + getMediatedNetworkErrorCode() + ", mediatedNetworkErrorMessage=\"" + getMediatedNetworkErrorMessage() + "\"}";
    }

    public MaxErrorImpl(String str) {
        this(-1, str);
    }

    public MaxErrorImpl(int i10, String str) {
        this(i10, str, -1, "");
    }

    public MaxErrorImpl(int i10, String str, int i11, String str2) {
        this.errorCode = i10;
        this.errorMessage = StringUtils.emptyIfNull(str);
        this.mediatedNetworkErrorCode = i11;
        this.mediatedNetworkErrorMessage = StringUtils.emptyIfNull(str2);
    }
}

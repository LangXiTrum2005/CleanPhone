package com.startapp.sdk.adsbase.commontracking;

/* JADX INFO: loaded from: classes6.dex */
public class CloseTrackingParams extends TrackingParams {
    private static final long serialVersionUID = -1873434013300932473L;
    private final long duration;

    public CloseTrackingParams(String str, long j) {
        super(str);
        this.duration = j;
    }

    @Override // com.startapp.sdk.adsbase.commontracking.TrackingParams
    public final String e() {
        return super.e() + "&displayDuration=" + Math.max(0L, this.duration);
    }
}

package com.startapp.sdk.ads.video.tracking;

/* JADX INFO: loaded from: classes6.dex */
public class VideoPausedTrackingParams extends VideoTrackingParams {
    private static final long serialVersionUID = 4019115021800482057L;
    private int pauseNum;
    private PauseOrigin pauseOrigin;

    public enum PauseOrigin {
        INAPP,
        EXTERNAL
    }

    public VideoPausedTrackingParams(String str, int i2, int i3, int i4, PauseOrigin pauseOrigin, String str2) {
        super(i2, i3, str, str2);
        this.pauseNum = i4;
        this.pauseOrigin = pauseOrigin;
    }

    @Override // com.startapp.sdk.ads.video.tracking.VideoTrackingParams, com.startapp.sdk.adsbase.commontracking.TrackingParams
    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(f());
        sb.append("&po=" + this.pauseOrigin.toString());
        sb.append("&pn=" + this.pauseNum);
        sb.append(h());
        return b(sb.toString());
    }
}

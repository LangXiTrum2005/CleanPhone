package com.startapp.sdk.ads.video.tracking;

/* JADX INFO: loaded from: classes6.dex */
public class VideoClickedTrackingParams extends VideoTrackingParams {
    private static final long serialVersionUID = 940417627850369979L;
    private boolean isVideoFinished;

    public VideoClickedTrackingParams(String str, int i2, int i3, boolean z2, String str2) {
        super(i2, i3, str, str2);
        this.isVideoFinished = z2;
    }

    @Override // com.startapp.sdk.ads.video.tracking.VideoTrackingParams, com.startapp.sdk.adsbase.commontracking.TrackingParams
    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(f());
        sb.append("&co=".concat(this.isVideoFinished ? "POSTROLL" : "VIDEO"));
        sb.append(h());
        return b(sb.toString());
    }
}

package com.startapp.sdk.ads.video;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.ads.video.tracking.VideoTrackingDetails;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.internal.ej;
import com.startapp.sdk.internal.wi;
import com.startapp.sdk.internal.xi;
import com.startapp.sdk.omsdk.VerificationDetails;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class VideoAdDetails implements Serializable {
    private static final long serialVersionUID = 4938639129535870268L;

    @TypeInfo(type = ArrayList.class, value = VerificationDetails.class)
    private List<VerificationDetails> adVerifications;
    private String clickUrl;
    private boolean clickable;
    private boolean closeable;
    private boolean isVideoMuted;
    private String localVideoPath;

    @TypeInfo(type = PostRollType.class)
    private PostRollType postRoll;
    private String postRollClickThroughUrl;
    private String postRollHtml;
    private boolean skippable;
    private long skippableAfter;
    private Long unskipLess;

    @TypeInfo(complex = true)
    private VideoTrackingDetails videoTrackingDetails;
    private String videoUrl;

    public enum PostRollType {
        IMAGE,
        LAST_FRAME,
        NONE
    }

    public VideoAdDetails() {
    }

    public List<VerificationDetails> getAdVerifications() {
        return this.adVerifications;
    }

    public String getClickUrl() {
        return this.clickUrl;
    }

    public String getLocalVideoPath() {
        return this.localVideoPath;
    }

    public String getPostRollClickThroughUrl() {
        return this.postRollHtml != null ? this.postRollClickThroughUrl : this.clickUrl;
    }

    public String getPostRollHtml() {
        return this.postRollHtml;
    }

    public PostRollType getPostRollType() {
        return this.postRoll;
    }

    public long getSkippableAfter() {
        return this.skippableAfter;
    }

    public Long getUnskipLess() {
        return this.unskipLess;
    }

    public VideoTrackingDetails getVideoTrackingDetails() {
        return this.videoTrackingDetails;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }

    public boolean hasPostRoll() {
        return (this.postRoll == PostRollType.NONE && this.postRollHtml == null) ? false : true;
    }

    public boolean isClickable() {
        return this.clickable;
    }

    public boolean isCloseable() {
        return this.closeable;
    }

    public boolean isSkippable() {
        return this.skippable;
    }

    public boolean isVideoMuted() {
        return this.isVideoMuted;
    }

    public void setAdVerifications(List<VerificationDetails> list) {
        this.adVerifications = list;
    }

    public void setLocalVideoPath(String str) {
        this.localVideoPath = str;
    }

    public void setVideoMuted(boolean z2) {
        this.isVideoMuted = z2;
    }

    public void setup() {
        this.skippableAfter = TimeUnit.SECONDS.toMillis(this.skippableAfter);
    }

    public String toString() {
        return super.toString();
    }

    public VideoAdDetails(xi xiVar, VideoConfig videoConfig, ej ejVar) {
        long jIntValue;
        this.videoTrackingDetails = new VideoTrackingDetails(xiVar);
        this.videoUrl = xiVar.f41689p;
        if (ejVar != null) {
            Long l2 = ejVar.f40943a;
            Integer num = xiVar.m;
            if (l2 != null) {
                jIntValue = l2.longValue();
            } else {
                jIntValue = num != null ? num.intValue() : videoConfig.n();
            }
            this.skippableAfter = jIntValue;
            this.skippable = true;
            this.unskipLess = ejVar.f40944b;
        } else {
            this.skippable = false;
        }
        String str = xiVar.s;
        this.clickUrl = str;
        this.clickable = str != null;
        this.postRoll = PostRollType.NONE;
        wi wiVar = xiVar.o;
        if (wiVar != null) {
            this.postRollHtml = wiVar.f41641c.a();
            this.postRollClickThroughUrl = wiVar.d;
        }
        setAdVerifications(Collections.unmodifiableList(xiVar.t));
    }
}

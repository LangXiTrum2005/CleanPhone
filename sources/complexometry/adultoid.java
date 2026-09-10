package complexometry;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import p002kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\t8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcomplexometry/adultoid;", "", "", "play", "()V", CampaignEx.JSON_NATIVE_VIDEO_PAUSE, "", CampaignEx.JSON_NATIVE_VIDEO_MUTE, "(Z)V", "Lcomplexometry/adultoid$attabal;", "getVideoLifecycleCallbacks", "()Lcomplexometry/adultoid$attabal;", "setVideoLifecycleCallbacks", "(Lcomplexometry/adultoid$attabal;)V", "videoLifecycleCallbacks", "attabal", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface adultoid {
    attabal getVideoLifecycleCallbacks();

    void mute(boolean mute);

    void pause();

    void play();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcomplexometry/adultoid$attabal;", "", "", "onVideoStart", "()V", "onVideoPlay", "onVideoPause", "onVideoEnd", "", "isMuted", "onVideoMute", "(Z)V", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface attabal {
        default void onVideoEnd() {
        }

        default void onVideoPause() {
        }

        default void onVideoPlay() {
        }

        default void onVideoStart() {
        }

        default void onVideoMute(boolean isMuted) {
        }
    }
}

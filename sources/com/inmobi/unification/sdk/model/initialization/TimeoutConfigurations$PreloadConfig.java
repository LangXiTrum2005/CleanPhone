package com.inmobi.unification.sdk.model.Initialization;

import com.inmobi.media.C3151ne;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"com/inmobi/unification/sdk/model/Initialization/TimeoutConfigurations$PreloadConfig", "", "<init>", "()V", "Lcom/inmobi/unification/sdk/model/Initialization/TimeoutConfigurations$AdPreloadConfig;", "getBanner", "()Lcom/inmobi/unification/sdk/model/Initialization/TimeoutConfigurations$AdPreloadConfig;", "getInterstitial", "getNative", "getAudio", "", "isValid", "()Z", "banner", "Lcom/inmobi/unification/sdk/model/Initialization/TimeoutConfigurations$AdPreloadConfig;", "int", "native", "audio", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TimeoutConfigurations$PreloadConfig {
    private TimeoutConfigurations$AdPreloadConfig audio;
    private TimeoutConfigurations$AdPreloadConfig banner;
    private TimeoutConfigurations$AdPreloadConfig int;
    private TimeoutConfigurations$AdPreloadConfig native;

    public TimeoutConfigurations$PreloadConfig() {
        C3151ne.Companion.getClass();
        this.banner = new TimeoutConfigurations$AdPreloadConfig(C3151ne.defaultPreloadBannerPreloadTimeout, C3151ne.defaultPreloadBannerMuttTimeout, C3151ne.defaultPreloadBannerLoadTimeout, C3151ne.defaultPreloadBannerRetryInterval, C3151ne.defaultPreloadBannerMaxRetries);
        this.int = new TimeoutConfigurations$AdPreloadConfig(C3151ne.defaultPreloadIntPreloadTimeout, C3151ne.defaultPreloadIntMuttTimeout, C3151ne.defaultPreloadIntloadTimeout, C3151ne.defaultPreloadIntRetryInterval, C3151ne.defaultPreloadIntMaxRetries);
        this.native = new TimeoutConfigurations$AdPreloadConfig(C3151ne.defaultPreloadNativePreloadTimeout, C3151ne.defaultPreloadNativeMuttTimeout, C3151ne.defaultPreloadNativeloadTimeout, C3151ne.defaultPreloadNativeRetryInterval, C3151ne.defaultPreloadNativeMaxRetries);
        this.audio = new TimeoutConfigurations$AdPreloadConfig(C3151ne.defaultPreloadAudioPreloadTimeout, C3151ne.defaultPreloadAudioMuttTimeout, C3151ne.defaultPreloadAudioloadTimeout, C3151ne.defaultPreloadAudioRetryInterval, C3151ne.defaultPreloadAudioMaxRetries);
    }

    public final TimeoutConfigurations$AdPreloadConfig getAudio() {
        return this.audio;
    }

    public final TimeoutConfigurations$AdPreloadConfig getBanner() {
        return this.banner;
    }

    /* JADX INFO: renamed from: getInterstitial, reason: from getter */
    public final TimeoutConfigurations$AdPreloadConfig getInt() {
        return this.int;
    }

    public final TimeoutConfigurations$AdPreloadConfig getNative() {
        return this.native;
    }

    public final boolean isValid() {
        return this.banner.isValid() && this.int.isValid() && this.native.isValid() && this.audio.isValid();
    }
}

package com.inmobi.unification.sdk.model.Initialization;

import com.inmobi.media.C3151ne;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"com/inmobi/unification/sdk/model/Initialization/TimeoutConfigurations$NonABConfig", "", "<init>", "()V", "Lcom/inmobi/unification/sdk/model/Initialization/TimeoutConfigurations$AdNonABConfig;", "getBanner", "()Lcom/inmobi/unification/sdk/model/Initialization/TimeoutConfigurations$AdNonABConfig;", "getInterstitial", "getNative", "getAudio", "", "isValid", "()Z", "banner", "Lcom/inmobi/unification/sdk/model/Initialization/TimeoutConfigurations$AdNonABConfig;", "int", "native", "audio", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TimeoutConfigurations$NonABConfig {
    private TimeoutConfigurations$AdNonABConfig audio;
    private TimeoutConfigurations$AdNonABConfig banner;
    private TimeoutConfigurations$AdNonABConfig int;
    private TimeoutConfigurations$AdNonABConfig native;

    public TimeoutConfigurations$NonABConfig() {
        C3151ne.Companion.getClass();
        this.banner = new TimeoutConfigurations$AdNonABConfig(C3151ne.defaultNonABBannerloadTimeout, C3151ne.defaultNonABBannerMuttTimeout, C3151ne.defaultNonABBannerRetryInterval, C3151ne.defaultNonABBannerMaxRetries);
        this.int = new TimeoutConfigurations$AdNonABConfig(C3151ne.defaultNonABIntloadTimeout, C3151ne.defaultNonABIntMuttTimeout, C3151ne.defaultNonABIntRetryInterval, C3151ne.defaultNonABIntMaxRetries);
        this.native = new TimeoutConfigurations$AdNonABConfig(C3151ne.defaultNonABNativeloadTimeout, C3151ne.defaultNonABNativeMuttTimeout, C3151ne.defaultNonABNativeRetryInterval, C3151ne.defaultNonABNativeMaxRetries);
        this.audio = new TimeoutConfigurations$AdNonABConfig(C3151ne.defaultNonABAudioloadTimeout, C3151ne.defaultNonABAudioMuttTimeout, C3151ne.defaultNonABAudioRetryInterval, C3151ne.defaultNonABAudioMaxRetries);
    }

    public final TimeoutConfigurations$AdNonABConfig getAudio() {
        return this.audio;
    }

    public final TimeoutConfigurations$AdNonABConfig getBanner() {
        return this.banner;
    }

    /* JADX INFO: renamed from: getInterstitial, reason: from getter */
    public final TimeoutConfigurations$AdNonABConfig getInt() {
        return this.int;
    }

    public final TimeoutConfigurations$AdNonABConfig getNative() {
        return this.native;
    }

    public final boolean isValid() {
        return this.banner.isValid() && this.int.isValid() && this.native.isValid() && this.audio.isValid();
    }
}

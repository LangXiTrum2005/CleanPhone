package com.chartboost.sdk.impl;

import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public enum rc {
    GET_PARAMETERS("getParameters"),
    GET_MAX_SIZE("getMaxSize"),
    GET_SCREEN_SIZE("getScreenSize"),
    GET_CURRENT_POSITION("getCurrentPosition"),
    GET_DEFAULT_POSITION("getDefaultPosition"),
    GET_ORIENTATION_PROPERTIES("getOrientationProperties"),
    CLICK("click"),
    CLOSE("close"),
    SKIPPED("skipped"),
    VIDEO_COMPLETED("videoCompleted"),
    VIDEO_RESUMED("videoResumed"),
    VIDEO_PAUSED("videoPaused"),
    VIDEO_REPLAY("videoReplay"),
    CURRENT_VIDEO_DURATION("currentVideoDuration"),
    TOTAL_VIDEO_DURATION("totalVideoDuration"),
    SHOW("show"),
    ERROR("error"),
    WARNING("warning"),
    DEBUG("debug"),
    TRACKING("tracking"),
    OPEN_URL("openUrl"),
    SET_ORIENTATION_PROPERTIES(MRAIDPresenter.SET_ORIENTATION_PROPERTIES),
    REWARD("reward"),
    REWARDED_VIDEO_COMPLETED("rewardedVideoCompleted"),
    PLAY_VIDEO("playVideo"),
    PAUSE_VIDEO("pauseVideo"),
    CLOSE_VIDEO("closeVideo"),
    MUTE_VIDEO("mute"),
    UNMUTE_VIDEO("unmute"),
    OM_MEASUREMENT_RESOURCES("OMMeasurementResources"),
    START("start"),
    BUFFER_START("bufferStart"),
    BUFFER_END("bufferEnd"),
    VIDEO_FINISHED("videoFinished"),
    VIDEO_STARTED("videoStarted"),
    VIDEO_ENDED("videoEnded"),
    VIDEO_FAILED("videoFailed"),
    PLAYBACK_TIME("playbackTime"),
    ON_BACKGROUND("onBackground"),
    ON_FOREGROUND("onForeground");

    public static final /* synthetic */ EnumEntries T = EnumEntriesKt.a(a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15032c = new a(null);
    public static final Map d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15042b;

    public static final class a {
        public a() {
        }

        public final rc a(String cmdName) {
            Intrinsics.f(cmdName, "cmdName");
            return (rc) rc.d.get(cmdName);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        EnumEntries enumEntriesD = d();
        int iH = MapsKt.h(CollectionsKt.n(enumEntriesD, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH >= 16 ? iH : 16);
        for (Object obj : enumEntriesD) {
            linkedHashMap.put(((rc) obj).f15042b, obj);
        }
        d = linkedHashMap;
    }

    rc(String str) {
        this.f15042b = str;
    }

    public static EnumEntries d() {
        return T;
    }

    public final String c() {
        return this.f15042b;
    }
}

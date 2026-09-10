package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t3 extends z4 {
    public static final z4 A7;
    public static final z4 A8;
    public static final z4 B7;
    public static final z4 B8;
    public static final z4 C7;
    public static final z4 C8;
    public static final z4 D7;
    public static final z4 D8;
    public static final z4 E7;
    public static final z4 E8;
    public static final z4 F7;
    public static final z4 F8;
    public static final z4 G7;
    public static final z4 G8;
    public static final z4 H7;
    public static final z4 H8;
    public static final z4 I7;
    public static final z4 I8;
    public static final z4 J7;
    public static final z4 J8;
    public static final z4 K7;
    public static final z4 K8;
    public static final z4 L7;
    public static final z4 L8;
    public static final z4 M7;
    public static final z4 N7;
    public static final z4 O7;
    public static final z4 P7;
    public static final z4 Q7;
    public static final z4 R7;
    public static final z4 S7;
    public static final z4 T7;
    public static final z4 U7;
    public static final z4 V7;
    public static final z4 W7;
    public static final z4 X7;
    public static final z4 Y7;
    public static final z4 Z7;
    public static final z4 a8;

    /* JADX INFO: renamed from: b8, reason: collision with root package name */
    public static final z4 f9765b8;

    /* JADX INFO: renamed from: c8, reason: collision with root package name */
    public static final z4 f9766c8;

    /* JADX INFO: renamed from: d8, reason: collision with root package name */
    public static final z4 f9767d8;

    /* JADX INFO: renamed from: e8, reason: collision with root package name */
    public static final z4 f9768e8;

    /* JADX INFO: renamed from: f8, reason: collision with root package name */
    public static final z4 f9769f8;

    /* JADX INFO: renamed from: g8, reason: collision with root package name */
    public static final z4 f9770g8;
    public static final z4 h8;

    /* JADX INFO: renamed from: i8, reason: collision with root package name */
    public static final z4 f9771i8;

    /* JADX INFO: renamed from: j8, reason: collision with root package name */
    public static final z4 f9772j8;
    public static final z4 k8;

    /* JADX INFO: renamed from: l8, reason: collision with root package name */
    public static final z4 f9773l8;

    /* JADX INFO: renamed from: m8, reason: collision with root package name */
    public static final z4 f9774m8;

    /* JADX INFO: renamed from: n8, reason: collision with root package name */
    public static final z4 f9775n8;

    /* JADX INFO: renamed from: o8, reason: collision with root package name */
    public static final z4 f9776o8;

    /* JADX INFO: renamed from: p8, reason: collision with root package name */
    public static final z4 f9777p8;

    /* JADX INFO: renamed from: q8, reason: collision with root package name */
    public static final z4 f9778q8;

    /* JADX INFO: renamed from: r7, reason: collision with root package name */
    public static final z4 f9779r7 = z4.a("afi", "");

    /* JADX INFO: renamed from: r8, reason: collision with root package name */
    public static final z4 f9780r8;

    /* JADX INFO: renamed from: s7, reason: collision with root package name */
    public static final z4 f9781s7;

    /* JADX INFO: renamed from: s8, reason: collision with root package name */
    public static final z4 f9782s8;

    /* JADX INFO: renamed from: t7, reason: collision with root package name */
    public static final z4 f9783t7;

    /* JADX INFO: renamed from: t8, reason: collision with root package name */
    public static final z4 f9784t8;

    /* JADX INFO: renamed from: u7, reason: collision with root package name */
    public static final z4 f9785u7;

    /* JADX INFO: renamed from: u8, reason: collision with root package name */
    public static final z4 f9786u8;

    /* JADX INFO: renamed from: v7, reason: collision with root package name */
    public static final z4 f9787v7;
    public static final z4 v8;

    /* JADX INFO: renamed from: w7, reason: collision with root package name */
    public static final z4 f9788w7;

    /* JADX INFO: renamed from: w8, reason: collision with root package name */
    public static final z4 f9789w8;

    /* JADX INFO: renamed from: x7, reason: collision with root package name */
    public static final z4 f9790x7;

    /* JADX INFO: renamed from: x8, reason: collision with root package name */
    public static final z4 f9791x8;

    /* JADX INFO: renamed from: y7, reason: collision with root package name */
    public static final z4 f9792y7;

    /* JADX INFO: renamed from: y8, reason: collision with root package name */
    public static final z4 f9793y8;

    /* JADX INFO: renamed from: z7, reason: collision with root package name */
    public static final z4 f9794z7;

    /* JADX INFO: renamed from: z8, reason: collision with root package name */
    public static final z4 f9795z8;

    static {
        Boolean bool = Boolean.FALSE;
        f9781s7 = z4.a("iafiwaa", bool);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f9783t7 = ca.k("afi_ms", 5L, timeUnit);
        f9785u7 = z4.a("mediation_endpoint", "https://ms.applovin.com/");
        f9787v7 = z4.a("mediation_backup_endpoint", "https://ms.applvn.com/");
        f9788w7 = ca.k("fetch_next_ad_retry_delay_ms", 2L, timeUnit);
        f9790x7 = ca.k("fetch_next_ad_timeout_ms", 30L, timeUnit);
        f9792y7 = ca.k("fetch_mediation_debugger_info_timeout_ms", 7L, timeUnit);
        Boolean bool2 = Boolean.TRUE;
        f9794z7 = z4.a("auto_init_mediation_debugger", bool2);
        A7 = z4.a("postback_macros", "{\"{MCODE}\":\"mcode\",\"{BCODE}\":\"bcode\",\"{ICODE}\":\"icode\",\"{SCODE}\":\"scode\"}");
        B7 = ca.k("max_signal_provider_latency_ms", 30L, timeUnit);
        C7 = ca.k("default_adapter_timeout_ms", 10L, timeUnit);
        D7 = ca.k("ad_refresh_ms", 30L, timeUnit);
        E7 = ca.k("ad_load_failure_refresh_ms", 30L, timeUnit);
        F7 = z4.a("ad_load_failure_refresh_ignore_error_codes", "204");
        G7 = z4.a("refresh_ad_on_app_resume_elapsed_threshold_ms", 0L);
        H7 = z4.a("refresh_ad_view_timer_responds_to_background", bool2);
        I7 = z4.a("refresh_ad_view_timer_responds_to_store_kit", bool2);
        J7 = z4.a("refresh_ad_view_timer_responds_to_window_visibility_changed", bool);
        K7 = z4.a("avrsponse", bool);
        L7 = z4.a("allow_pause_auto_refresh_immediately", bool);
        M7 = z4.a("ad_view_race_condition_fix_enabled", bool);
        N7 = z4.a("always_destroy_ad_view_on_ui_thread", bool);
        O7 = z4.a("fullscreen_display_delay_ms", 0L);
        P7 = z4.a("susaode", bool);
        Q7 = z4.a("ahdm", 500L);
        R7 = z4.a("ad_view_refresh_precache_request_viewability_undesired_flags", 246L);
        S7 = z4.a("ad_view_refresh_precache_request_enabled", bool2);
        T7 = z4.a("famttl_ms", 0L);
        U7 = z4.a("signal_expiration_ms", -1L);
        V7 = z4.a("signal_cache_level", Integer.valueOf(d5.b.AD_FORMAT.ordinal()));
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        W7 = ca.k("ad_expiration_ms", 4L, timeUnit2);
        X7 = ca.k("native_ad_expiration_ms", 4L, timeUnit2);
        Y7 = z4.a("rena", bool2);
        Z7 = z4.a("fullscreen_ad_displayed_timeout_ms", -1L);
        a8 = z4.a("freast_ms", -1L);
        f9765b8 = z4.a("ad_hidden_timeout_ms", -1L);
        f9766c8 = z4.a("schedule_ad_hidden_on_ad_dismiss", bool);
        f9767d8 = z4.a("schedule_ad_hidden_on_single_task_app_relaunch", bool);
        f9768e8 = ca.k("ad_hidden_on_ad_dismiss_callback_delay_ms", 1L, timeUnit);
        f9769f8 = z4.a("proe", bool);
        f9770g8 = z4.a("mute_state", 2);
        h8 = z4.a("saf", "");
        f9771i8 = z4.a("saui", "");
        f9772j8 = z4.a("malm_v2_e", bool);
        k8 = z4.a("slsaod", bool);
        f9773l8 = z4.a("saldm", 0L);
        f9774m8 = z4.a("mspc", 1);
        f9775n8 = z4.a("mra", -1);
        f9776o8 = z4.a("mra_af", "INTER,REWARDED,BANNER,LEADER,MREC");
        f9777p8 = z4.a("fadiafase", bool2);
        f9778q8 = z4.a("fadwvcv", bool2);
        f9780r8 = z4.a("bfarud", bool);
        f9782s8 = z4.a("inacc", Boolean.valueOf(q7.b(Arrays.asList("com.textmeinc.textme", "com.textmeinc.freetone", "com.textmeinc.textme3", "com.jaumo", "com.jaumo.casual", "com.pinkapp", "com.jaumo.mature", "com.jaumo.prime", "com.jaumo.gay", "com.jaumo.lesbian"))));
        f9784t8 = z4.a("adiets_sec", Long.valueOf(TimeUnit.MINUTES.toSeconds(1L)));
        f9786u8 = z4.a("faomq", bool);
        v8 = z4.a("rahcnct_sec", -1);
        f9789w8 = z4.a("paslbaf", JsonUtils.EMPTY_JSON);
        f9791x8 = z4.a("msbl", "{\"ad\":[\"ttdasi_ms\"]}");
        f9793y8 = z4.a("siarni", bool);
        f9795z8 = z4.a("spims", bool);
        A8 = z4.a("avat", 20);
        B8 = z4.a("uabta", bool);
        C8 = z4.a("use_initialization_spec_during_init", bool);
        D8 = z4.a("report_cimp_after_ierr", bool);
        E8 = z4.a("fail_collection_for_empty_signal", bool);
        F8 = z4.a("fetch_mediated_ad_gzip", bool2);
        G8 = z4.a("max_postback_gzip", bool2);
        H8 = z4.a("md_endpoint", "https://md.applovin.com/");
        I8 = z4.a("md_backup_endpoint", "https://md.applvn.com/");
        J8 = z4.a("md_v2", bool);
        K8 = z4.a("suaaode", bool);
        L8 = z4.a("fcms", 5);
    }
}

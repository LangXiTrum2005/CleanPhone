package ea;

import com.ironsource.Xa;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d0 {
    public static final c0 A;
    public static final c0 A0;
    public static final c0 B;
    public static final c0 B0;
    public static final c0 C;
    public static final c0 C0;
    public static final c0 D;
    public static final c0 D0;
    public static final c0 E;
    public static final c0 E0;
    public static final c0 F;
    public static final c0 F0;
    public static final c0 G;
    public static final c0 G0;
    public static final c0 H;
    public static final c0 H0;
    public static final c0 I;
    public static final c0 I0;
    public static final c0 J;
    public static final c0 J0;
    public static final c0 K;
    public static final c0 K0;
    public static final c0 L;
    public static final c0 L0;
    public static final c0 M;
    public static final c0 M0;
    public static final c0 N;
    public static final c0 N0;
    public static final c0 O;
    public static final c0 O0;
    public static final c0 P;
    public static final c0 P0;
    public static final c0 Q;
    public static final c0 Q0;
    public static final c0 R;
    public static final c0 R0;
    public static final c0 S;
    public static final c0 S0;
    public static final c0 T;
    public static final c0 T0;
    public static final c0 U;
    public static final c0 U0;
    public static final c0 V;
    public static final c0 V0;
    public static final c0 W;
    public static final c0 W0;
    public static final c0 X;
    public static final c0 X0;
    public static final c0 Y;
    public static final c0 Y0;
    public static final c0 Z;
    public static final c0 Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f39287a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final c0 f39288a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final c0 f39289a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c0 f39290b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final c0 f39291b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final c0 f39292b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f39293c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final c0 f39294c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final c0 f39295c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c0 f39296d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final c0 f39297d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final c0 f39298d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c0 f39299e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final c0 f39300e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final c0 f39301e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c0 f39302f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final c0 f39303f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final c0 f39304f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c0 f39305g;
    public static final c0 g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final c0 f39306g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c0 f39307h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final c0 f39308h0;
    public static final c0 h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c0 f39309i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final c0 f39310i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final c0 f39311i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c0 f39312j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final c0 f39313j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final c0 f39314j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c0 f39315k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final c0 f39316k0;
    public static final c0 l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final c0 f39317l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c0 f39318m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final c0 f39319m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c0 f39320n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final c0 f39321n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c0 f39322o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final c0 f39323o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final c0 f39324p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final c0 f39325p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final c0 f39326q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final c0 f39327q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c0 f39328r;
    public static final c0 r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c0 f39329s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final c0 f39330s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c0 f39331t;
    public static final c0 t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final c0 f39332u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final c0 f39333u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c0 f39334v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final c0 f39335v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c0 f39336w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final c0 f39337w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final c0 f39338x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final c0 f39339x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c0 f39340y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final c0 f39341y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final c0 f39342z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final c0 f39343z0;

    static {
        Collections.synchronizedSet(new HashSet());
        Long lValueOf = Long.valueOf(Xa.f27908s);
        f39290b = a("measurement.ad_id_cache_time", lValueOf, a0.f39197i, false);
        f39293c = a("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, rc.d.f49542e, false);
        f39296d = a("measurement.monitoring.sample_period_millis", 86400000L, rc.d.f49549m, false);
        f39299e = a("measurement.config.cache_time", 86400000L, fd.b.f40806s, false);
        f39302f = a("measurement.config.url_scheme", "https", x.f39879e, false);
        f39305g = a("measurement.config.url_authority", "app-measurement.com", w.f39817k, false);
        f39307h = a("measurement.upload.max_bundles", 100, x.f39889p, false);
        Integer numValueOf = Integer.valueOf(C.DEFAULT_BUFFER_SEGMENT_SIZE);
        f39309i = a("measurement.upload.max_batch_size", numValueOf, w.f39827v, false);
        f39312j = a("measurement.upload.max_bundle_size", numValueOf, x.A, false);
        f39315k = a("measurement.upload.max_events_per_bundle", 1000, a0.f39191c, false);
        Integer numValueOf2 = Integer.valueOf(DefaultOggSeeker.MATCH_BYTE_RANGE);
        l = a("measurement.upload.max_events_per_day", numValueOf2, b0.f39246h, false);
        f39318m = a("measurement.upload.max_error_events_per_day", 1000, rc.d.f49545h, false);
        f39320n = a("measurement.upload.max_public_events_per_day", Integer.valueOf(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS), fd.b.f40797i, false);
        f39322o = a("measurement.upload.max_conversions_per_day", 10000, rc.d.f49546i, false);
        f39324p = a("measurement.upload.max_realtime_events_per_day", 10, fd.b.f40798j, false);
        f39326q = a("measurement.store.max_stored_events_per_app", numValueOf2, rc.d.f49547j, false);
        f39328r = a("measurement.upload.url", "https://app-measurement.com/a", fd.b.f40799k, false);
        f39329s = a("measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d", rc.d.f49548k, false);
        f39331t = a("measurement.sgtm.service_upload_apps_list", "", fd.b.l, false);
        f39332u = a("measurement.sgtm.upload.backoff_http_codes", "404,429,503,504", rc.d.l, false);
        f39334v = a("measurement.sgtm.upload.retry_interval", 600000L, fd.b.f40800m, false);
        f39336w = a("measurement.sgtm.upload.retry_max_wait", 21600000L, fd.b.f40801n, false);
        f39338x = a("measurement.sgtm.batch.retry_interval", 1800000L, rc.d.f49550n, false);
        f39340y = a("measurement.sgtm.batch.retry_max_wait", 21600000L, fd.b.f40802o, false);
        f39342z = a("measurement.sgtm.batch.retry_max_count", 10, rc.d.f49551o, false);
        A = a("measurement.sgtm.upload.max_queued_batches", 5000, fd.b.f40803p, false);
        B = a("measurement.sgtm.upload.batches_retrieval_limit", 5, rc.d.f49552p, false);
        C = a("measurement.sgtm.upload.min_delay_after_startup", 5000L, fd.b.f40804q, false);
        D = a("measurement.sgtm.upload.min_delay_after_broadcast", 1000L, rc.d.f49553q, false);
        E = a("measurement.sgtm.upload.min_delay_after_background", 600000L, fd.b.f40805r, false);
        F = a("measurement.sgtm.batch.long_queuing_threshold", 14400000L, rc.d.f49554r, false);
        G = a("measurement.upload.backoff_period", 43200000L, rc.d.f49555s, false);
        a("measurement.upload.window_interval", 3600000L, fd.b.f40807t, false);
        H = a("measurement.upload.interval", 3600000L, rc.d.f49556t, false);
        I = a("measurement.upload.realtime_upload_interval", lValueOf, w.f39808b, false);
        J = a("measurement.upload.debug_upload_interval", 1000L, x.f39876b, false);
        K = a("measurement.upload.minimum_delay", 500L, w.f39809c, false);
        L = a("measurement.alarm_manager.minimum_interval", Long.valueOf(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS), x.f39877c, false);
        M = a("measurement.upload.stale_data_deletion_interval", 86400000L, w.f39810d, false);
        N = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, x.f39878d, false);
        O = a("measurement.upload.initial_upload_delay_time", 15000L, w.f39811e, false);
        P = a("measurement.upload.retry_time", 1800000L, w.f39812f, false);
        Q = a("measurement.upload.retry_count", 6, x.f39880f, false);
        R = a("measurement.upload.max_queue_time", 518400000L, w.f39813g, false);
        S = a("measurement.upload.google_signal_max_queue_time", 300000L, x.f39881g, false);
        T = a("measurement.lifetimevalue.max_currency_tracked", 4, w.f39814h, false);
        U = a("measurement.audience.filter_result_max_count", 200, x.f39882h, false);
        V = a("measurement.upload.max_public_user_properties", 100, null, false);
        W = a("measurement.upload.max_event_name_cardinality", 2000, null, false);
        X = a("measurement.upload.max_public_event_params", 100, null, false);
        Y = a("measurement.service_client.idle_disconnect_millis", 5000L, w.f39815i, false);
        Z = a("measurement.service_client.reconnect_millis", 1000L, x.f39883i, false);
        Boolean bool = Boolean.FALSE;
        f39288a0 = a("measurement.test.test_boolean_flag", bool, w.f39816j, false);
        f39291b0 = a("measurement.test.test_string_flag", "---", x.f39884j, false);
        f39294c0 = a("measurement.test.test_long_flag", -1L, x.f39885k, false);
        a("measurement.test.test_cached_long_flag", -1L, w.l, true);
        f39297d0 = a("measurement.test.test_int_flag", -2, x.l, false);
        f39300e0 = a("measurement.test.test_double_flag", Double.valueOf(-3.0d), w.f39818m, false);
        a("measurement.experiment.max_ids", 50, x.f39886m, false);
        f39303f0 = a("measurement.upload.max_item_scoped_custom_parameters", 27, w.f39819n, false);
        g0 = a("measurement.upload.max_event_parameter_value_length", Integer.valueOf(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE), x.f39887n, true);
        f39308h0 = a("measurement.max_bundles_per_iteration", 100, w.f39820o, false);
        f39310i0 = a("measurement.sdk.attribution.cache.ttl", 604800000L, x.f39888o, false);
        f39313j0 = a("measurement.redaction.app_instance_id.ttl", 7200000L, w.f39821p, false);
        f39316k0 = a("measurement.rb.attribution.client.min_ad_services_version", 7, w.f39822q, false);
        f39317l0 = a("measurement.dma_consent.max_daily_dcu_realtime_events", 1, x.f39890q, false);
        f39319m0 = a("measurement.rb.attribution.uri_scheme", "https", w.f39823r, false);
        f39321n0 = a("measurement.rb.attribution.uri_authority", "google-analytics.com", x.f39891r, false);
        f39323o0 = a("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", w.f39824s, false);
        f39325p0 = a("measurement.session.engagement_interval", 3600000L, x.f39892s, false);
        f39327q0 = a("measurement.rb.attribution.app_allowlist", "", w.f39825t, false);
        r0 = a("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot", x.f39893t, false);
        f39330s0 = a("measurement.rb.attribution.event_params", "value|currency", w.f39826u, false);
        t0 = a("measurement.rb.attribution.query_parameters_to_remove", "", x.f39894u, false);
        f39333u0 = a("measurement.rb.attribution.max_queue_time", 864000000L, x.f39895v, false);
        f39335v0 = a("measurement.rb.attribution.max_retry_delay_seconds", 16, w.f39828w, false);
        f39337w0 = a("measurement.rb.attribution.client.min_time_after_boot_seconds", 90, x.f39896w, false);
        a("measurement.rb.attribution.max_trigger_uris_queried_at_once", 0, w.f39829x, false);
        f39339x0 = a("measurement.rb.max_trigger_registrations_per_day", 1000, x.f39897x, false);
        Boolean bool2 = Boolean.TRUE;
        f39341y0 = a("measurement.config.bundle_for_all_apps_on_backgrounded", bool2, w.f39830y, false);
        f39343z0 = a("measurement.config.notify_trigger_uris_on_backgrounded", bool2, x.f39898y, false);
        A0 = a("measurement.rb.attribution.notify_app_delay_millis", Integer.valueOf(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED), w.f39831z, false);
        a("measurement.config.default_flag_values", bool2, x.f39899z, false);
        B0 = a("measurement.upload.diagnostic_upload_interval", 3600000L, w.A, false);
        C0 = a("measurement.quality.checksum", bool, null, false);
        D0 = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, w.B, false);
        E0 = a("measurement.audience.refresh_event_count_filters_timestamp", bool, x.B, false);
        F0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, w.C, true);
        G0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, x.C, false);
        H0 = a("measurement.integration.disable_firebase_instance_id", bool, w.D, false);
        I0 = a("measurement.collection.service.update_with_analytics_fix", bool, x.D, false);
        J0 = a("measurement.service.storage_consent_support_version", 203600, w.E, false);
        K0 = a("measurement.service.store_null_safelist", bool2, x.E, false);
        L0 = a("measurement.service.store_safelist", bool2, a0.f39190b, false);
        M0 = a("measurement.session_stitching_token_enabled", bool, b0.f39240b, false);
        N0 = a("measurement.sgtm.client.upload_on_backgrounded.dev", bool, b0.f39241c, true);
        O0 = a("measurement.rb.attribution.service", bool2, a0.f39192d, true);
        P0 = a("measurement.rb.attribution.client2", bool2, b0.f39242d, true);
        Q0 = a("measurement.rb.attribution.uuid_generation", bool2, a0.f39193e, false);
        R0 = a("measurement.rb.attribution.enable_trigger_redaction", bool2, b0.f39243e, false);
        S0 = a("measurement.client.sessions.enable_fix_background_engagement", bool2, b0.f39249k, false);
        a("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", bool2, a0.f39194f, false);
        a("measurement.remove_conflicting_first_party_apis.dev", bool, b0.f39244f, false);
        T0 = a("measurement.rb.attribution.service.trigger_uris_high_priority", bool2, a0.f39195g, false);
        U0 = a("measurement.experiment.enable_phenotype_experiment_reporting", bool2, b0.f39245g, false);
        V0 = a("measurement.experiment.enable_passthrough_experiment_reporting", bool2, a0.f39196h, false);
        W0 = a("measurement.set_default_event_parameters.fix_service_request_ordering", bool, rc.d.f49540c, false);
        X0 = a("measurement.set_default_event_parameters.fix_app_update_logging", bool2, fd.b.f40791c, false);
        Y0 = a("measurement.service.fix_stop_bundling_bug", bool2, fd.b.f40793e, false);
        Z0 = a("measurement.gbraid_campaign.stop_lgclid", bool, a0.f39198j, false);
        f39289a1 = a("measurement.gbraid_campaign.deep_link_url", bool, b0.f39247i, false);
        f39292b1 = a("measurement.gbraid_compaign.compaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid", fd.b.f40794f, false);
        f39295c1 = a("measurement.edpb.service", bool, rc.d.f49541d, false);
        f39298d1 = a("measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp", rc.d.f49543f, false);
        f39301e1 = a("measurement.robust_time_source_2", bool, a0.f39199k, false);
        f39304f1 = a("measurement.manual_iap_logging.client_service", bool, b0.f39248j, false);
        f39306g1 = a("measurement.dsid_consent_only.app_allowlist1", "", fd.b.f40795g, false);
        h1 = a("measurement.dsid_consent_only.app_allowlist2", "", rc.d.f49544g, false);
        f39311i1 = a("measurement.dsid_consent_only.app_allowlist3", "", fd.b.f40796h, false);
        f39314j1 = a("measurement.diagnostics.enabled", bool, fd.b.f40792d, false);
    }

    public static c0 a(String str, Object obj, v vVar, boolean z10) {
        c0 c0Var = new c0(str, obj, vVar);
        if (z10) {
            f39287a.add(c0Var);
        }
        return c0Var;
    }
}

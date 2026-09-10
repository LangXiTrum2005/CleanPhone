package ea;

import com.google.android.gms.internal.measurement.s4;
import com.google.android.gms.internal.measurement.u4;
import com.google.android.gms.internal.measurement.w5;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ x f39876b = new x(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ x f39877c = new x(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ x f39878d = new x(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ x f39879e = new x(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ x f39880f = new x(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ x f39881g = new x(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ x f39882h = new x(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ x f39883i = new x(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ x f39884j = new x(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ x f39885k = new x(9);
    public static final /* synthetic */ x l = new x(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ x f39886m = new x(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ x f39887n = new x(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ x f39888o = new x(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ x f39889p = new x(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ x f39890q = new x(15);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ x f39891r = new x(16);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ x f39892s = new x(17);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ x f39893t = new x(18);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ x f39894u = new x(19);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ x f39895v = new x(20);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ x f39896w = new x(21);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ x f39897x = new x(22);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ x f39898y = new x(23);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ x f39899z = new x(24);
    public static final /* synthetic */ x A = new x(25);
    public static final /* synthetic */ x B = new x(26);
    public static final /* synthetic */ x C = new x(27);
    public static final /* synthetic */ x D = new x(28);
    public static final /* synthetic */ x E = new x(29);

    public /* synthetic */ x(int i10) {
        this.f39900a = i10;
    }

    @Override // ea.v
    public final Object zza() {
        switch (this.f39900a) {
            case 0:
                List list = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (Long) com.google.android.gms.internal.measurement.i3.f23571a.f(9, 1000L, "measurement.upload.debug_upload_interval").get();
            case 1:
                List list2 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (Long) com.google.android.gms.internal.measurement.i3.f23571a.f(27, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, "measurement.alarm_manager.minimum_interval").get();
            case 2:
                List list3 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (Long) com.google.android.gms.internal.measurement.i3.f23571a.f(34, 604800000L, "measurement.upload.refresh_blacklisted_config_interval").get();
            case 3:
                List list4 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (String) com.google.android.gms.internal.measurement.i3.f23571a.h(8, "measurement.config.url_scheme", "https").get();
            case 4:
                List list5 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.i3.f23571a.f(76, 6L, "measurement.upload.retry_count").get()).longValue());
            case 5:
                List list6 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (Long) com.google.android.gms.internal.measurement.i3.f23571a.f(15, 605000L, "measurement.upload.google_signal_max_queue_time").get();
            case 6:
                List list7 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.i3.f23571a.f(22, 200L, "measurement.audience.filter_result_max_count").get()).longValue());
            case 7:
                List list8 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (Long) com.google.android.gms.internal.measurement.i3.f23571a.f(38, 1000L, "measurement.service_client.reconnect_millis").get();
            case 8:
                List list9 = d0.f39287a;
                s4.f23952b.get();
                return (String) u4.f24019a.h(5, "measurement.test.string_flag", "---").get();
            case 9:
                List list10 = d0.f39287a;
                s4.f23952b.get();
                return (Long) u4.f24019a.f(4, -1L, "measurement.test.long_flag").get();
            case 10:
                List list11 = d0.f39287a;
                s4.f23952b.get();
                return Integer.valueOf((int) ((Long) u4.f24019a.f(3, -2L, "measurement.test.int_flag").get()).longValue());
            case 11:
                List list12 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.i3.f23571a.f(21, 50L, "measurement.experiment.max_ids").get()).longValue());
            case 12:
                List list13 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.i3.f23571a.f(19, 500L, "measurement.upload.max_event_parameter_value_length").get()).longValue());
            case 13:
                List list14 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (Long) com.google.android.gms.internal.measurement.i3.f23571a.f(61, 604800000L, "measurement.sdk.attribution.cache.ttl").get();
            case 14:
                List list15 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.i3.f23571a.f(67, 100L, "measurement.upload.max_bundles").get()).longValue());
            case 15:
                List list16 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.i3.f23571a.f(18, 1L, "measurement.dma_consent.max_daily_dcu_realtime_events").get()).longValue());
            case 16:
                List list17 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (String) com.google.android.gms.internal.measurement.i3.f23571a.h(56, "measurement.rb.attribution.uri_authority", "google-analytics.com").get();
            case 17:
                List list18 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (Long) com.google.android.gms.internal.measurement.i3.f23571a.f(12, 3600000L, "measurement.session.engagement_interval").get();
            case 18:
                List list19 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (String) com.google.android.gms.internal.measurement.i3.f23571a.h(80, "measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot").get();
            case 19:
                List list20 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (String) com.google.android.gms.internal.measurement.i3.f23571a.h(59, "measurement.rb.attribution.query_parameters_to_remove", "").get();
            case 20:
                List list21 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (Long) com.google.android.gms.internal.measurement.i3.f23571a.f(57, 864000000L, "measurement.rb.attribution.max_queue_time").get();
            case 21:
                List list22 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.i3.f23571a.f(55, 90L, "measurement.rb.attribution.client.min_time_after_boot_seconds").get()).longValue());
            case 22:
                List list23 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.i3.f23571a.f(24, 1000L, "measurement.rb.max_trigger_registrations_per_day").get()).longValue());
            case 23:
                List list24 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (Boolean) com.google.android.gms.internal.measurement.i3.f23571a.b(31, "measurement.config.notify_trigger_uris_on_backgrounded", true).get();
            case 24:
                List list25 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (Boolean) com.google.android.gms.internal.measurement.i3.f23571a.b(10, "measurement.config.default_flag_values", true).get();
            case 25:
                List list26 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.i3.f23571a.f(66, 65536L, "measurement.upload.max_bundle_size").get()).longValue());
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                List list27 = d0.f39287a;
                return (Boolean) com.google.android.gms.internal.measurement.e4.f23412a.get();
            case 27:
                List list28 = d0.f39287a;
                return (Boolean) com.google.android.gms.internal.measurement.n4.f23765a.get();
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                List list29 = d0.f39287a;
                return (Boolean) w5.f24111a.get();
            default:
                List list30 = d0.f39287a;
                return (Boolean) com.google.android.gms.internal.measurement.b4.f23313a.get();
        }
    }
}

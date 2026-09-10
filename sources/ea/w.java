package ea;

import com.google.android.gms.internal.measurement.gd;
import com.google.android.gms.internal.measurement.h6;
import com.google.android.gms.internal.measurement.jd;
import com.google.android.gms.internal.measurement.q6;
import com.google.android.gms.internal.measurement.s4;
import com.google.android.gms.internal.measurement.t5;
import com.google.android.gms.internal.measurement.u4;
import com.ironsource.Xa;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ w f39808b = new w(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ w f39809c = new w(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ w f39810d = new w(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ w f39811e = new w(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ w f39812f = new w(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w f39813g = new w(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w f39814h = new w(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w f39815i = new w(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ w f39816j = new w(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ w f39817k = new w(9);
    public static final /* synthetic */ w l = new w(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ w f39818m = new w(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ w f39819n = new w(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ w f39820o = new w(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ w f39821p = new w(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ w f39822q = new w(15);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ w f39823r = new w(16);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ w f39824s = new w(17);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ w f39825t = new w(18);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ w f39826u = new w(19);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ w f39827v = new w(20);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ w f39828w = new w(21);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ w f39829x = new w(22);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ w f39830y = new w(23);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ w f39831z = new w(24);
    public static final /* synthetic */ w A = new w(25);
    public static final /* synthetic */ w B = new w(26);
    public static final /* synthetic */ w C = new w(27);
    public static final /* synthetic */ w D = new w(28);
    public static final /* synthetic */ w E = new w(29);

    public /* synthetic */ w(int i10) {
        this.f39832a = i10;
    }

    @Override // ea.v
    public final Object zza() {
        switch (this.f39832a) {
            case 0:
                List list = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (Long) com.google.android.gms.internal.measurement.i3.f23571a.f(33, Xa.f27908s, "measurement.upload.realtime_upload_interval").get();
            case 1:
                List list2 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (Long) com.google.android.gms.internal.measurement.i3.f23571a.f(28, 500L, "measurement.upload.minimum_delay").get();
            case 2:
                List list3 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (Long) com.google.android.gms.internal.measurement.i3.f23571a.f(53, 86400000L, "measurement.upload.stale_data_deletion_interval").get();
            case 3:
                List list4 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (Long) com.google.android.gms.internal.measurement.i3.f23571a.f(64, 15000L, "measurement.upload.initial_upload_delay_time").get();
            case 4:
                List list5 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (Long) com.google.android.gms.internal.measurement.i3.f23571a.f(77, 1800000L, "measurement.upload.retry_time").get();
            case 5:
                List list6 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (Long) com.google.android.gms.internal.measurement.i3.f23571a.f(73, 518400000L, "measurement.upload.max_queue_time").get();
            case 6:
                List list7 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.i3.f23571a.f(17, 4L, "measurement.lifetimevalue.max_currency_tracked").get()).longValue());
            case 7:
                List list8 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (Long) com.google.android.gms.internal.measurement.i3.f23571a.f(36, 5000L, "measurement.service_client.idle_disconnect_millis").get();
            case 8:
                List list9 = d0.f39287a;
                s4.f23952b.get();
                return (Boolean) u4.f24019a.b(0, "measurement.test.boolean_flag", false).get();
            case 9:
                List list10 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (String) com.google.android.gms.internal.measurement.i3.f23571a.h(7, "measurement.config.url_authority", "app-measurement.com").get();
            case 10:
                List list11 = d0.f39287a;
                s4.f23952b.get();
                return (Long) u4.f24019a.f(1, -1L, "measurement.test.cached_long_flag").get();
            case 11:
                List list12 = d0.f39287a;
                s4.f23952b.get();
                h6 h6Var = u4.f24019a;
                AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) h6Var.f23540b;
                jd jdVar = (jd) atomicReferenceArray.get(2);
                if (jdVar == null) {
                    gd gdVar = new gd("measurement.test.double_flag", (i9.i) ((q6) h6Var.f23541c).f23891b);
                    while (!atomicReferenceArray.compareAndSet(2, null, gdVar)) {
                        if (atomicReferenceArray.get(2) != null) {
                            jdVar = (jd) atomicReferenceArray.get(2);
                            jdVar.getClass();
                        }
                    }
                    jdVar = gdVar;
                }
                return (Double) jdVar.get();
            case 12:
                List list13 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.i3.f23571a.f(23, 27L, "measurement.upload.max_item_scoped_custom_parameters").get()).longValue());
            case 13:
                List list14 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.i3.f23571a.f(3, 100L, "measurement.max_bundles_per_iteration").get()).longValue());
            case 14:
                List list15 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (Long) com.google.android.gms.internal.measurement.i3.f23571a.f(62, 7200000L, "measurement.redaction.app_instance_id.ttl").get();
            case 15:
                List list16 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.i3.f23571a.f(26, 7L, "measurement.rb.attribution.client.min_ad_services_version").get()).longValue());
            case 16:
                List list17 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (String) com.google.android.gms.internal.measurement.i3.f23571a.h(60, "measurement.rb.attribution.uri_scheme", "https").get();
            case 17:
                List list18 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (String) com.google.android.gms.internal.measurement.i3.f23571a.h(58, "measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion").get();
            case 18:
                List list19 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (String) com.google.android.gms.internal.measurement.i3.f23571a.h(32, "measurement.rb.attribution.app_allowlist", "").get();
            case 19:
                List list20 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (String) com.google.android.gms.internal.measurement.i3.f23571a.h(13, "measurement.rb.attribution.event_params", "value|currency").get();
            case 20:
                List list21 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.i3.f23571a.f(75, 65536L, "measurement.upload.max_batch_size").get()).longValue());
            case 21:
                List list22 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.i3.f23571a.f(54, 16L, "measurement.rb.attribution.max_retry_delay_seconds").get()).longValue());
            case 22:
                List list23 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.i3.f23571a.f(25, 0L, "measurement.rb.attribution.max_trigger_uris_queried_at_once").get()).longValue());
            case 23:
                List list24 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (Boolean) com.google.android.gms.internal.measurement.i3.f23571a.b(2, "measurement.config.bundle_for_all_apps_on_backgrounded", true).get();
            case 24:
                List list25 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.i3.f23571a.f(30, Xa.C, "measurement.rb.attribution.notify_app_delay_millis").get()).longValue());
            case 25:
                List list26 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (Long) com.google.android.gms.internal.measurement.i3.f23571a.f(11, 3600000L, "45769094").get();
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                List list27 = d0.f39287a;
                return (Boolean) com.google.android.gms.internal.measurement.e4.f23413b.get();
            case 27:
                List list28 = d0.f39287a;
                return (Boolean) com.google.android.gms.internal.measurement.e4.f23414c.get();
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                List list29 = d0.f39287a;
                return (Boolean) t5.f23983a.get();
            default:
                List list30 = d0.f39287a;
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.l3.f23693a.get()).longValue());
        }
    }
}

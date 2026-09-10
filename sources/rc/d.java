package rc;

import b2.g0;
import com.google.android.gms.internal.ads.a0;
import com.google.android.gms.internal.measurement.g3;
import com.google.android.gms.internal.measurement.i3;
import com.google.android.gms.internal.measurement.p3;
import com.google.android.gms.internal.measurement.v3;
import com.google.android.gms.internal.measurement.y3;
import com.ironsource.Xa;
import ea.d0;
import ea.v;
import j2.j;
import j2.m;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements a9.a, j2.h, b7.a, bc.d, e6.g, ea.f, v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d f49539b = new d(11);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d f49540c = new d(12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d f49541d = new d(13);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ d f49542e = new d(14);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ d f49543f = new d(15);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ d f49544g = new d(16);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ d f49545h = new d(17);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ d f49546i = new d(18);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ d f49547j = new d(19);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ d f49548k = new d(20);
    public static final /* synthetic */ d l = new d(21);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ d f49549m = new d(22);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ d f49550n = new d(23);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ d f49551o = new d(24);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ d f49552p = new d(25);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ d f49553q = new d(26);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ d f49554r = new d(27);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ d f49555s = new d(28);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ d f49556t = new d(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49557a;

    public /* synthetic */ d(int i10) {
        this.f49557a = i10;
    }

    @Override // j2.h
    public /* bridge */ /* synthetic */ void b(j jVar, long j10, long j11, boolean z10) {
    }

    @Override // j2.h
    public a0 d(j jVar, long j10, long j11, IOException iOException, int i10) {
        return m.f43672e;
    }

    @Override // b7.a
    public Object e() {
        return new ArrayList();
    }

    @Override // a9.a
    public long f() {
        return System.currentTimeMillis();
    }

    @Override // bc.d
    public String g() {
        return null;
    }

    @Override // j2.h
    public /* bridge */ /* synthetic */ void j(j jVar, long j10, long j11) {
    }

    @Override // ea.f
    public /* synthetic */ String m0(String str, String str2) {
        return null;
    }

    @Override // ea.v
    public Object zza() {
        switch (this.f49557a) {
            case 12:
                return new Boolean(((Boolean) p3.f23835b.get()).booleanValue());
            case 13:
                return new Boolean(((Boolean) y3.f24167a.get()).booleanValue());
            case 14:
                List list = d0.f39287a;
                g3.f23501b.get();
                return (Long) i3.f23571a.f(1, 3600000L, "measurement.app_uninstalled_additional_ad_id_cache_time").get();
            case 15:
                List list2 = d0.f39287a;
                g3.f23501b.get();
                return (String) i3.f23571a.h(14, "measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp").get();
            case 16:
                List list3 = d0.f39287a;
                return (String) v3.f24073b.get();
            case 17:
                List list4 = d0.f39287a;
                g3.f23501b.get();
                return Integer.valueOf((int) ((Long) i3.f23571a.f(69, 1000L, "measurement.upload.max_error_events_per_day").get()).longValue());
            case 18:
                List list5 = d0.f39287a;
                g3.f23501b.get();
                return Integer.valueOf((int) ((Long) i3.f23571a.f(68, Xa.f27908s, "measurement.upload.max_conversions_per_day").get()).longValue());
            case 19:
                List list6 = d0.f39287a;
                g3.f23501b.get();
                return Integer.valueOf((int) ((Long) i3.f23571a.f(20, 100000L, "measurement.store.max_stored_events_per_app").get()).longValue());
            case 20:
                List list7 = d0.f39287a;
                g3.f23501b.get();
                return (String) i3.f23571a.h(16, "measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d").get();
            case 21:
                List list8 = d0.f39287a;
                g3.f23501b.get();
                return (String) i3.f23571a.h(45, "measurement.sgtm.upload.backoff_http_codes", "404,429,503,504").get();
            case 22:
                List list9 = d0.f39287a;
                g3.f23501b.get();
                return (Long) i3.f23571a.f(29, 86400000L, "measurement.monitoring.sample_period_millis").get();
            case 23:
                List list10 = d0.f39287a;
                g3.f23501b.get();
                return (Long) i3.f23571a.f(41, 1800000L, "measurement.sgtm.batch.retry_interval").get();
            case 24:
                List list11 = d0.f39287a;
                g3.f23501b.get();
                return Integer.valueOf((int) ((Long) i3.f23571a.f(42, 10L, "measurement.sgtm.batch.retry_max_count").get()).longValue());
            case 25:
                List list12 = d0.f39287a;
                g3.f23501b.get();
                return Integer.valueOf((int) ((Long) i3.f23571a.f(46, 5L, "measurement.sgtm.upload.batches_retrieval_limit").get()).longValue());
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                List list13 = d0.f39287a;
                g3.f23501b.get();
                return (Long) i3.f23571a.f(49, 1000L, "measurement.sgtm.upload.min_delay_after_broadcast").get();
            case 27:
                List list14 = d0.f39287a;
                g3.f23501b.get();
                return (Long) i3.f23571a.f(40, 240000L, "measurement.sgtm.batch.long_queuing_threshold").get();
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                List list15 = d0.f39287a;
                g3.f23501b.get();
                return (Long) i3.f23571a.f(63, 43200000L, "measurement.upload.backoff_period").get();
            default:
                List list16 = d0.f39287a;
                g3.f23501b.get();
                return (Long) i3.f23571a.f(65, 3600000L, "measurement.upload.interval").get();
        }
    }

    public d(g0 g0Var) {
        this.f49557a = 3;
    }

    @Override // bc.d
    public void a() {
    }

    @Override // bc.d
    public void h(long j10, String str) {
    }

    @Override // e6.g
    public void c(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}

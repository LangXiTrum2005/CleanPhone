package fd;

import android.os.Looper;
import android.os.SystemClock;
import b2.d;
import b2.e;
import b2.r0;
import b2.s0;
import b7.c;
import com.google.android.gms.internal.auth.i;
import com.google.android.gms.internal.measurement.g3;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.i3;
import com.google.android.gms.internal.measurement.p3;
import com.google.android.gms.internal.measurement.s3;
import com.google.android.gms.internal.measurement.v3;
import com.unity3d.services.core.di.ServiceProvider;
import ea.d0;
import ea.v;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements a9.a, d, c, v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static b f40790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b f40791c = new b(12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b f40792d = new b(13);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b f40793e = new b(14);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b f40794f = new b(15);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ b f40795g = new b(16);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ b f40796h = new b(17);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ b f40797i = new b(18);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ b f40798j = new b(19);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ b f40799k = new b(20);
    public static final /* synthetic */ b l = new b(21);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ b f40800m = new b(22);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ b f40801n = new b(23);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ b f40802o = new b(24);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ b f40803p = new b(25);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ b f40804q = new b(26);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ b f40805r = new b(27);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ b f40806s = new b(28);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ b f40807t = new b(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40808a;

    public /* synthetic */ b(int i10) {
        this.f40808a = i10;
    }

    public static final boolean e() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // b7.c
    public void a(Object obj) {
        switch (this.f40808a) {
            case 5:
                break;
            default:
                ((List) obj).clear();
                break;
        }
    }

    @Override // b2.d
    public e b(int i10) throws IOException {
        s0 s0Var = new s0();
        s0 s0Var2 = new s0();
        try {
            s0Var.f5395a.C(android.support.v4.media.session.a.r(0));
            int iF = s0Var.f();
            boolean z10 = iF % 2 == 0;
            s0Var2.f5395a.C(android.support.v4.media.session.a.r(z10 ? iF + 1 : iF - 1));
            if (z10) {
                s0Var.f5396b = s0Var2;
                return s0Var;
            }
            s0Var2.f5396b = s0Var;
            return s0Var2;
        } catch (IOException e10) {
            i.e(s0Var);
            i.e(s0Var2);
            throw e10;
        }
    }

    @Override // b2.d
    public d c() {
        return new r0();
    }

    @Override // a9.a
    public long f() {
        return SystemClock.elapsedRealtime();
    }

    @Override // ea.v
    public Object zza() {
        switch (this.f40808a) {
            case 12:
                return new Boolean(((Boolean) p3.f23834a.get()).booleanValue());
            case 13:
                return new Boolean(((Boolean) s3.f23951a.get()).booleanValue());
            case 14:
                return new Boolean(((Boolean) h4.f23536a.get()).booleanValue());
            case 15:
                List list = d0.f39287a;
                g3.f23501b.get();
                return (String) i3.f23571a.h(4, "measurement.gbraid_campaign.campaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid").get();
            case 16:
                List list2 = d0.f39287a;
                return (String) v3.f24072a.get();
            case 17:
                List list3 = d0.f39287a;
                return (String) v3.f24074c.get();
            case 18:
                List list4 = d0.f39287a;
                g3.f23501b.get();
                return Integer.valueOf((int) ((Long) i3.f23571a.f(72, ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, "measurement.upload.max_public_events_per_day").get()).longValue());
            case 19:
                List list5 = d0.f39287a;
                g3.f23501b.get();
                return Integer.valueOf((int) ((Long) i3.f23571a.f(74, 10L, "measurement.upload.max_realtime_events_per_day").get()).longValue());
            case 20:
                List list6 = d0.f39287a;
                g3.f23501b.get();
                return (String) i3.f23571a.h(78, "measurement.upload.url", "https://app-measurement.com/a").get();
            case 21:
                List list7 = d0.f39287a;
                g3.f23501b.get();
                return (String) i3.f23571a.h(44, "measurement.sgtm.service_upload_apps_list", "").get();
            case 22:
                List list8 = d0.f39287a;
                g3.f23501b.get();
                return (Long) i3.f23571a.f(51, 600000L, "measurement.sgtm.upload.retry_interval").get();
            case 23:
                List list9 = d0.f39287a;
                g3.f23501b.get();
                return (Long) i3.f23571a.f(52, 21600000L, "measurement.sgtm.upload.retry_max_wait").get();
            case 24:
                List list10 = d0.f39287a;
                g3.f23501b.get();
                return (Long) i3.f23571a.f(43, 21600000L, "measurement.sgtm.batch.retry_max_wait").get();
            case 25:
                List list11 = d0.f39287a;
                g3.f23501b.get();
                return Integer.valueOf((int) ((Long) i3.f23571a.f(47, 5000L, "measurement.sgtm.upload.max_queued_batches").get()).longValue());
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                List list12 = d0.f39287a;
                g3.f23501b.get();
                return (Long) i3.f23571a.f(50, 5000L, "measurement.sgtm.upload.min_delay_after_startup").get();
            case 27:
                List list13 = d0.f39287a;
                g3.f23501b.get();
                return (Long) i3.f23571a.f(48, 600000L, "measurement.sgtm.upload.min_delay_after_background").get();
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                List list14 = d0.f39287a;
                g3.f23501b.get();
                return (Long) i3.f23571a.f(5, 86400000L, "measurement.config.cache_time").get();
            default:
                List list15 = d0.f39287a;
                g3.f23501b.get();
                return (Long) i3.f23571a.f(79, 3600000L, "measurement.upload.window_interval").get();
        }
    }

    private final void d(Object obj) {
    }
}

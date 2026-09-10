package ea;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j3 extends z3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f39510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z0 f39511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z0 f39512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z0 f39513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z0 f39514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z0 f39515i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z0 f39516j;

    public j3(e4 e4Var) {
        super(e4Var);
        this.f39510d = new HashMap();
        a1 a1Var = ((m1) this.f3623a).f39586e;
        m1.f(a1Var);
        this.f39511e = new z0(a1Var, "last_delete_stale", 0L);
        a1 a1Var2 = ((m1) this.f3623a).f39586e;
        m1.f(a1Var2);
        this.f39512f = new z0(a1Var2, "last_delete_stale_batch", 0L);
        a1 a1Var3 = ((m1) this.f3623a).f39586e;
        m1.f(a1Var3);
        this.f39513g = new z0(a1Var3, "backoff", 0L);
        a1 a1Var4 = ((m1) this.f3623a).f39586e;
        m1.f(a1Var4);
        this.f39514h = new z0(a1Var4, "last_upload", 0L);
        a1 a1Var5 = ((m1) this.f3623a).f39586e;
        m1.f(a1Var5);
        this.f39515i = new z0(a1Var5, "last_upload_attempt", 0L);
        a1 a1Var6 = ((m1) this.f3623a).f39586e;
        m1.f(a1Var6);
        this.f39516j = new z0(a1Var6, "midnight_offset", 0L);
    }

    public final Pair K0(n4 n4Var, y1 y1Var) {
        String str = n4Var.f39628a;
        k9.c0.e(str);
        return (y1Var.i(x1.AD_STORAGE) && n4Var.f39640n) ? L0(str) : new Pair("", Boolean.FALSE);
    }

    public final Pair L0(String str) throws Throwable {
        i3 i3Var;
        AdvertisingIdClient.Info advertisingIdInfo;
        G0();
        m1 m1Var = (m1) this.f3623a;
        p9.b bVar = m1Var.f39592k;
        g gVar = m1Var.f39585d;
        bVar.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f39510d;
        i3 i3Var2 = (i3) map.get(str);
        if (i3Var2 != null && jElapsedRealtime < i3Var2.f39483c) {
            return new Pair(i3Var2.f39481a, Boolean.valueOf(i3Var2.f39482b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long jO0 = gVar.O0(str, d0.f39290b) + jElapsedRealtime;
        try {
            try {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(m1Var.f39582a);
            } catch (PackageManager.NameNotFoundException unused) {
                if (i3Var2 != null && jElapsedRealtime < i3Var2.f39483c + gVar.O0(str, d0.f39293c)) {
                    return new Pair(i3Var2.f39481a, Boolean.valueOf(i3Var2.f39482b));
                }
                advertisingIdInfo = null;
            }
            if (advertisingIdInfo == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String id2 = advertisingIdInfo.getId();
            i3Var = id2 != null ? new i3(jO0, advertisingIdInfo.isLimitAdTrackingEnabled(), id2) : new i3(jO0, advertisingIdInfo.isLimitAdTrackingEnabled(), "");
            map.put(str, i3Var);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new Pair(i3Var.f39481a, Boolean.valueOf(i3Var.f39482b));
        } catch (Exception e10) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39759m.c(e10, "Unable to get advertising id");
            i3Var = new i3(jO0, false, "");
        }
    }

    public final String M0(n4 n4Var, y1 y1Var) {
        String str = n4Var.f39628a;
        k9.c0.e(str);
        if (!y1Var.i(x1.AD_STORAGE) || !n4Var.f39640n) {
            return "";
        }
        G0();
        String str2 = (String) L0(str).first;
        MessageDigest messageDigestZ0 = l4.Z0();
        if (messageDigestZ0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestZ0.digest(str2.getBytes())));
    }

    @Override // ea.z3
    public final void J0() {
    }
}

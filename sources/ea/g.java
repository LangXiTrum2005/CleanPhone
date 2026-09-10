package ea;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends al.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f39415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f39416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f39417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f39418e;

    public final boolean H0(String str) {
        m1.f(((m1) this.f3623a).f39590i);
        if (l4.h1((String) d0.f39306g1.a(null), str) || l4.h1((String) d0.h1.a(null), str) || l4.h1((String) d0.f39311i1.a(null), str)) {
            return true;
        }
        return "1".equals(this.f39417d.m0(str, "gaia_collection_enabled"));
    }

    public final boolean I0(String str) {
        return "1".equals(this.f39417d.m0(str, "measurement.event_sampling_enabled"));
    }

    public final boolean J0() {
        if (this.f39415b == null) {
            Boolean boolT0 = T0("app_measurement_lite");
            this.f39415b = boolT0;
            if (boolT0 == null) {
                this.f39415b = Boolean.FALSE;
            }
        }
        return this.f39415b.booleanValue() || !((m1) this.f3623a).f39583b;
    }

    public final String K0(String str) {
        m1 m1Var = (m1) this.f3623a;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            k9.c0.h(str2);
            return str2;
        } catch (ClassNotFoundException e10) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39753f.c(e10, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e11) {
            s0 s0Var2 = m1Var.f39587f;
            m1.h(s0Var2);
            s0Var2.f39753f.c(e11, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e12) {
            s0 s0Var3 = m1Var.f39587f;
            m1.h(s0Var3);
            s0Var3.f39753f.c(e12, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e13) {
            s0 s0Var4 = m1Var.f39587f;
            m1.h(s0Var4);
            s0Var4.f39753f.c(e13, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final int L0(String str, boolean z10) {
        int iMax = UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
        if (z10) {
            iMax = Math.max(Math.min(P0(str, d0.g0), UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE), 100);
        }
        return Math.max(iMax, NotificationCompat.FLAG_LOCAL_ONLY);
    }

    public final void M0() {
        ((m1) this.f3623a).getClass();
    }

    public final String N0(String str, c0 c0Var) {
        return TextUtils.isEmpty(str) ? (String) c0Var.a(null) : (String) c0Var.a(this.f39417d.m0(str, c0Var.f39270a));
    }

    public final long O0(String str, c0 c0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) c0Var.a(null)).longValue();
        }
        String strM0 = this.f39417d.m0(str, c0Var.f39270a);
        if (TextUtils.isEmpty(strM0)) {
            return ((Long) c0Var.a(null)).longValue();
        }
        try {
            return ((Long) c0Var.a(Long.valueOf(Long.parseLong(strM0)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c0Var.a(null)).longValue();
        }
    }

    public final int P0(String str, c0 c0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) c0Var.a(null)).intValue();
        }
        String strM0 = this.f39417d.m0(str, c0Var.f39270a);
        if (TextUtils.isEmpty(strM0)) {
            return ((Integer) c0Var.a(null)).intValue();
        }
        try {
            return ((Integer) c0Var.a(Integer.valueOf(Integer.parseInt(strM0)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c0Var.a(null)).intValue();
        }
    }

    public final double Q0(String str, c0 c0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) c0Var.a(null)).doubleValue();
        }
        String strM0 = this.f39417d.m0(str, c0Var.f39270a);
        if (TextUtils.isEmpty(strM0)) {
            return ((Double) c0Var.a(null)).doubleValue();
        }
        try {
            return ((Double) c0Var.a(Double.valueOf(Double.parseDouble(strM0)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c0Var.a(null)).doubleValue();
        }
    }

    public final boolean R0(String str, c0 c0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) c0Var.a(null)).booleanValue();
        }
        String strM0 = this.f39417d.m0(str, c0Var.f39270a);
        return TextUtils.isEmpty(strM0) ? ((Boolean) c0Var.a(null)).booleanValue() : ((Boolean) c0Var.a(Boolean.valueOf("1".equals(strM0)))).booleanValue();
    }

    public final Bundle S0() {
        m1 m1Var = (m1) this.f3623a;
        try {
            Context context = m1Var.f39582a;
            Context context2 = m1Var.f39582a;
            s0 s0Var = m1Var.f39587f;
            if (context.getPackageManager() == null) {
                m1.h(s0Var);
                s0Var.f39753f.b("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoD = r9.c.a(context2).d(128, context2.getPackageName());
            if (applicationInfoD != null) {
                return applicationInfoD.metaData;
            }
            m1.h(s0Var);
            s0Var.f39753f.b("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            s0 s0Var2 = m1Var.f39587f;
            m1.h(s0Var2);
            s0Var2.f39753f.c(e10, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean T0(String str) {
        k9.c0.e(str);
        Bundle bundleS0 = S0();
        if (bundleS0 != null) {
            if (bundleS0.containsKey(str)) {
                return Boolean.valueOf(bundleS0.getBoolean(str));
            }
            return null;
        }
        s0 s0Var = ((m1) this.f3623a).f39587f;
        m1.h(s0Var);
        s0Var.f39753f.b("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean U0() {
        ((m1) this.f3623a).getClass();
        Boolean boolT0 = T0("firebase_analytics_collection_deactivated");
        return boolT0 != null && boolT0.booleanValue();
    }

    public final boolean V0() {
        Boolean boolT0 = T0("google_analytics_automatic_screen_reporting_enabled");
        return boolT0 == null || boolT0.booleanValue();
    }

    public final v1 W0(String str, boolean z10) {
        Object obj;
        k9.c0.e(str);
        m1 m1Var = (m1) this.f3623a;
        Bundle bundleS0 = S0();
        if (bundleS0 == null) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39753f.b("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleS0.get(str);
        }
        v1 v1Var = v1.UNINITIALIZED;
        if (obj == null) {
            return v1Var;
        }
        if (Boolean.TRUE.equals(obj)) {
            return v1.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return v1.DENIED;
        }
        if (z10 && "eu_consent_policy".equals(obj)) {
            return v1.POLICY;
        }
        s0 s0Var2 = m1Var.f39587f;
        m1.h(s0Var2);
        s0Var2.f39756i.c(str, "Invalid manifest metadata for");
        return v1Var;
    }
}

package ea;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.measurement.ba;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class v0 extends z3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f39792d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(e4 e4Var, int i10) {
        super(e4Var);
        this.f39792d = i10;
    }

    @Override // ea.z3
    public final void J0() {
        int i10 = this.f39792d;
    }

    public boolean K0() {
        H0();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((m1) this.f3623a).f39582a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void N0(String str, a4 a4Var, ba baVar, t0 t0Var) {
        String str2;
        String str3 = a4Var.f39227a;
        m1 m1Var = (m1) this.f3623a;
        G0();
        H0();
        try {
            URL url = new URI(str3).toURL();
            this.f39807b.k0();
            byte[] bArrA = baVar.a();
            j1 j1Var = m1Var.f39588g;
            m1.h(j1Var);
            Map map = a4Var.f39228b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
            try {
                j1Var.S0(new u0(this, str2, url, bArrA, map, t0Var));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                s0 s0Var = m1Var.f39587f;
                m1.h(s0Var);
                s0Var.f39753f.d("Failed to parse URL. Not uploading MeasurementBatch. appId", s0.O0(str2), str3);
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            str2 = str;
        }
    }

    private final void L0() {
    }

    private final void M0() {
    }
}

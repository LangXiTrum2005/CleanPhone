package k9;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectionResult f44402a;

    public d0(ConnectionResult connectionResult) {
        c0.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", (connectionResult.f11641b == 0 || connectionResult.f11642c == null) ? false : true);
        this.f44402a = connectionResult;
    }
}

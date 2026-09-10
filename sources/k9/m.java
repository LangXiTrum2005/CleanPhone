package k9;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements d, b, c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static m f44475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f44476c = new n(0, 0, 0, false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f44477a;

    public /* synthetic */ m(Object obj) {
        this.f44477a = obj;
    }

    public static synchronized m b() {
        try {
            if (f44475b == null) {
                f44475b = new m();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44475b;
    }

    @Override // k9.d
    public void a(ConnectionResult connectionResult) {
        f fVar = (f) this.f44477a;
        if (connectionResult.b()) {
            fVar.getRemoteService(null, fVar.d());
            return;
        }
        c cVar = fVar.f44424v;
        if (cVar != null) {
            cVar.r(connectionResult);
        }
    }

    @Override // k9.b
    public void d(Bundle bundle) {
        ((j9.j) this.f44477a).onConnected();
    }

    @Override // k9.b
    public void q(int i10) {
        ((j9.j) this.f44477a).q(i10);
    }

    @Override // k9.c
    public void r(ConnectionResult connectionResult) {
        ((j9.k) this.f44477a).r(connectionResult);
    }

    public m(f fVar) {
        Objects.requireNonNull(fVar);
        this.f44477a = fVar;
    }
}

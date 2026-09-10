package k9;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f44457g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(f fVar, int i10, Bundle bundle) {
        super(fVar, i10, bundle);
        this.f44457g = fVar;
    }

    @Override // k9.x
    public final boolean a() {
        this.f44457g.f44418p.a(ConnectionResult.f11639f);
        return true;
    }

    @Override // k9.x
    public final void b(ConnectionResult connectionResult) {
        f fVar = this.f44457g;
        fVar.getClass();
        fVar.f44418p.a(connectionResult);
        fVar.f44407d = connectionResult.f11641b;
        fVar.f44408e = System.currentTimeMillis();
    }
}

package k9;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f44526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f44527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f44528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f44530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f44531f;

    public x(f fVar, int i10, Bundle bundle) {
        this.f44531f = fVar;
        Boolean bool = Boolean.TRUE;
        this.f44528c = fVar;
        this.f44526a = bool;
        this.f44527b = false;
        this.f44529d = i10;
        this.f44530e = bundle;
    }

    public abstract boolean a();

    public abstract void b(ConnectionResult connectionResult);
}

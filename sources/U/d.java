package u;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f51617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f51618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f51619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f51620e;

    public d(f fVar, int i10, Uri uri, boolean z10, Bundle bundle) {
        this.f51620e = fVar;
        this.f51616a = i10;
        this.f51617b = uri;
        this.f51618c = z10;
        this.f51619d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f51620e.f51629b.onRelationshipValidationResult(this.f51616a, this.f51617b, this.f51618c, this.f51619d);
    }
}

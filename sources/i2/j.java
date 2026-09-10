package i2;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import oa.m1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Spatializer$OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f42782a;

    public j(p pVar) {
        this.f42782a = pVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        m1 m1Var = p.f42818k;
        this.f42782a.e();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        m1 m1Var = p.f42818k;
        this.f42782a.e();
    }
}

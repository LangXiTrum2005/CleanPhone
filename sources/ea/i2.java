package ea;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class i2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f39472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f39473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f39474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f39475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f39476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f39477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f39478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f39479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p2 f39480i;

    public i2(p2 p2Var, String str, String str2, long j10, long j11, Bundle bundle, boolean z10, boolean z11, boolean z12) {
        this.f39472a = str;
        this.f39473b = str2;
        this.f39474c = j10;
        this.f39475d = j11;
        this.f39476e = bundle;
        this.f39477f = z10;
        this.f39478g = z11;
        this.f39479h = z12;
        this.f39480i = p2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f39480i.P0(this.f39472a, this.f39473b, this.f39474c, this.f39475d, this.f39476e, this.f39477f, this.f39478g, this.f39479h);
    }
}

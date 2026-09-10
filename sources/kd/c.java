package kd;

import com.google.firebase.perf.session.gauges.GaugeManager;
import nd.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GaugeManager f44596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f44597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f44598d;

    public /* synthetic */ c(GaugeManager gaugeManager, String str, l lVar, int i10) {
        this.f44595a = i10;
        this.f44596b = gaugeManager;
        this.f44597c = str;
        this.f44598d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44595a) {
            case 0:
                this.f44596b.lambda$stopCollectingGauges$3(this.f44597c, this.f44598d);
                break;
            default:
                this.f44596b.lambda$startCollectingGauges$2(this.f44597c, this.f44598d);
                break;
        }
    }
}

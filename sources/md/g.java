package md;

import com.google.firebase.perf.metrics.Trace;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fd.a f45966a = fd.a.d();

    public static void a(Trace trace, gd.d dVar) {
        int i10 = dVar.f41845a;
        int i11 = dVar.f41847c;
        int i12 = dVar.f41846b;
        if (i10 > 0) {
            trace.putMetric("_fr_tot", i10);
        }
        if (i12 > 0) {
            trace.putMetric("_fr_slo", i12);
        }
        if (i11 > 0) {
            trace.putMetric("_fr_fzn", i11);
        }
        StringBuilder sb2 = new StringBuilder("Screen trace: ");
        sb2.append(trace.f24717d);
        sb2.append(" _fr_tot:");
        l1.d.o(sb2, dVar.f41845a, " _fr_slo:", i12, " _fr_fzn:");
        sb2.append(i11);
        f45966a.a(sb2.toString());
    }
}

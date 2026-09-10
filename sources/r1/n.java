package r1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f49324a;

    /* JADX WARN: Illegal instructions before constructor call */
    public n(int i10, int i11, int i12, int i13, i1.p pVar, boolean z10, h hVar) {
        StringBuilder sbL = l1.d.l("AudioTrack init failed 0 Config(", i10, ", ", i11, ", ");
        l1.d.o(sbL, i12, ", ", i13, ") ");
        sbL.append(pVar);
        sbL.append(z10 ? " (recoverable)" : "");
        super(sbL.toString(), hVar);
        this.f49324a = z10;
    }
}

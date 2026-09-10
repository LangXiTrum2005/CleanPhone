package vm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52687b;

    public /* synthetic */ n(String str, int i10) {
        this.f52686a = i10;
        this.f52687b = str;
    }

    @Override // vm.e
    public final String a(kl.e eVar) {
        switch (this.f52686a) {
            case 0:
                break;
        }
        return go.c.w(this, eVar);
    }

    @Override // vm.e
    public final String getDescription() {
        switch (this.f52686a) {
            case 0:
                break;
        }
        return this.f52687b;
    }
}

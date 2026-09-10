package zb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f54723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.consent_sdk.d f54724c;

    public /* synthetic */ m(r rVar, com.google.android.gms.internal.consent_sdk.d dVar, int i10) {
        this.f54722a = i10;
        this.f54723b = rVar;
        this.f54724c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54722a) {
            case 0:
                this.f54723b.a(this.f54724c);
                break;
            default:
                this.f54723b.a(this.f54724c);
                break;
        }
    }
}

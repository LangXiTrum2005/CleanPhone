package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f43191b;

    public /* synthetic */ o(int i2, int i3) {
        this.f43190a = i3;
        this.f43191b = i2;
    }

    @Override // j$.time.temporal.n
    public final m b(m mVar) {
        switch (this.f43190a) {
            case 0:
                int iG = mVar.g(a.DAY_OF_WEEK);
                int i2 = this.f43191b;
                if (iG == i2) {
                    return mVar;
                }
                int i3 = iG - i2;
                return mVar.l(i3 >= 0 ? 7 - i3 : -i3, b.DAYS);
            default:
                int iG2 = mVar.g(a.DAY_OF_WEEK);
                int i4 = this.f43191b;
                if (iG2 == i4) {
                    return mVar;
                }
                int i5 = i4 - iG2;
                return mVar.c(i5 >= 0 ? 7 - i5 : -i5, b.DAYS);
        }
    }
}

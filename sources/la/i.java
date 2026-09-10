package la;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f45255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f45256c;

    public /* synthetic */ i(Object obj, int i10) {
        this.f45255b = i10;
        this.f45256c = obj;
    }

    @Override // la.f
    public final void a() {
        switch (this.f45255b) {
            case 0:
                synchronized (((k) this.f45256c).f45265f) {
                    try {
                        if (((k) this.f45256c).f45270k.get() > 0 && ((k) this.f45256c).f45270k.decrementAndGet() > 0) {
                            ((k) this.f45256c).f45261b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        k kVar = (k) this.f45256c;
                        if (kVar.f45271m != null) {
                            kVar.f45261b.a("Unbind from service.", new Object[0]);
                            k kVar2 = (k) this.f45256c;
                            kVar2.f45260a.unbindService(kVar2.l);
                            k kVar3 = (k) this.f45256c;
                            kVar3.f45266g = false;
                            kVar3.f45271m = null;
                            kVar3.l = null;
                        }
                        ((k) this.f45256c).c();
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            default:
                k kVar4 = (k) ((j) this.f45256c).f45258b;
                kVar4.f45261b.a("unlinkToDeath", new Object[0]);
                ((b) kVar4.f45271m).f45247a.unlinkToDeath(kVar4.f45269j, 0);
                kVar4.f45271m = null;
                kVar4.f45266g = false;
                return;
        }
    }
}

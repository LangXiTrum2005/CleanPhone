package g6;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w6.g f41658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f41659c;

    public /* synthetic */ n(q qVar, w6.g gVar, int i10) {
        this.f41657a = i10;
        this.f41659c = qVar;
        this.f41658b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41657a) {
            case 0:
                w6.g gVar = this.f41658b;
                gVar.f52960b.a();
                synchronized (gVar.f52961c) {
                    synchronized (this.f41659c) {
                        try {
                            if (this.f41659c.f41664a.f41662a.contains(new o(this.f41658b, a7.h.f3430b))) {
                                q qVar = this.f41659c;
                                w6.g gVar2 = this.f41658b;
                                qVar.getClass();
                                try {
                                    gVar2.f(qVar.f41679q, 5);
                                } catch (Throwable th2) {
                                    throw new d(th2);
                                }
                            }
                            this.f41659c.d();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                        break;
                    }
                }
                return;
            default:
                w6.g gVar3 = this.f41658b;
                gVar3.f52960b.a();
                synchronized (gVar3.f52961c) {
                    synchronized (this.f41659c) {
                        try {
                            if (this.f41659c.f41664a.f41662a.contains(new o(this.f41658b, a7.h.f3430b))) {
                                this.f41659c.f41681s.a();
                                q qVar2 = this.f41659c;
                                w6.g gVar4 = this.f41658b;
                                qVar2.getClass();
                                try {
                                    gVar4.i(qVar2.f41681s, qVar2.f41677o, qVar2.f41684v);
                                    this.f41659c.h(this.f41658b);
                                } catch (Throwable th4) {
                                    throw new d(th4);
                                }
                            }
                            this.f41659c.d();
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
                return;
        }
    }
}

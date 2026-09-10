package ea;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f39187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f39188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f39189d;

    public /* synthetic */ a(y yVar, String str, long j10, int i10) {
        this.f39186a = i10;
        this.f39187b = str;
        this.f39188c = j10;
        this.f39189d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39186a) {
            case 0:
                y yVar = this.f39189d;
                yVar.G0();
                String str = this.f39187b;
                k9.c0.e(str);
                x.e eVar = yVar.f39918c;
                boolean zIsEmpty = eVar.isEmpty();
                long j10 = this.f39188c;
                if (zIsEmpty) {
                    yVar.f39919d = j10;
                }
                Integer num = (Integer) eVar.get(str);
                if (num != null) {
                    eVar.put(str, Integer.valueOf(num.intValue() + 1));
                } else if (eVar.f53506c < 100) {
                    eVar.put(str, 1);
                    yVar.f39917b.put(str, Long.valueOf(j10));
                } else {
                    s0 s0Var = ((m1) yVar.f3623a).f39587f;
                    m1.h(s0Var);
                    s0Var.f39756i.b("Too many ads visible");
                }
                break;
            default:
                y yVar2 = this.f39189d;
                m1 m1Var = (m1) yVar2.f3623a;
                yVar2.G0();
                String str2 = this.f39187b;
                k9.c0.e(str2);
                x.e eVar2 = yVar2.f39918c;
                Integer num2 = (Integer) eVar2.get(str2);
                if (num2 == null) {
                    s0 s0Var2 = m1Var.f39587f;
                    m1.h(s0Var2);
                    s0Var2.f39753f.c(str2, "Call to endAdUnitExposure for unknown ad unit id");
                } else {
                    z2 z2Var = m1Var.l;
                    s0 s0Var3 = m1Var.f39587f;
                    m1.g(z2Var);
                    w2 w2VarK0 = z2Var.K0(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        eVar2.put(str2, Integer.valueOf(iIntValue));
                    } else {
                        eVar2.remove(str2);
                        x.e eVar3 = yVar2.f39917b;
                        Long l = (Long) eVar3.get(str2);
                        long j11 = this.f39188c;
                        if (l == null) {
                            m1.h(s0Var3);
                            s0Var3.f39753f.b("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j11 - l.longValue();
                            eVar3.remove(str2);
                            yVar2.L0(str2, jLongValue, w2VarK0);
                        }
                        if (eVar2.isEmpty()) {
                            long j12 = yVar2.f39919d;
                            if (j12 != 0) {
                                yVar2.K0(j11 - j12, w2VarK0);
                                yVar2.f39919d = 0L;
                            } else {
                                m1.h(s0Var3);
                                s0Var3.f39753f.b("First ad exposure time was never set");
                            }
                        }
                    }
                }
                break;
        }
    }
}

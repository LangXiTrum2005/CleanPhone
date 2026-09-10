package ads_mobile_sdk;

import java.util.ArrayDeque;
import java.util.Optional;

/* JADX INFO: loaded from: classes.dex */
public final class uc3 {
    public final qc3 a;
    public final nc3 b;
    public final ic3 c;

    public uc3(ob3 ob3Var, qc3 qc3Var, ic3 ic3Var) {
        int[] iArr = {343945053, 300943123, 276960570, 1098387973, 1376531620, 1545514151, 271059426, 857490000, 454333378};
        int i = iArr[7] % iArr[8];
        this.a = qc3Var;
        this.c = ic3Var;
        this.b = new nc3();
    }

    public final Optional a() {
        y62 y62Var;
        try {
            ArrayDeque arrayDeque = this.b.a;
            if (arrayDeque.isEmpty()) {
                throw new mc3();
            }
            kc3 kc3Var = (kc3) arrayDeque.pop();
            long j = kc3Var.a;
            long j2 = kc3Var.b;
            long j3 = kc3Var.c;
            qc3 qc3Var = this.a;
            if (qc3Var.b < j2) {
                return Optional.of(y62.H);
            }
            this.c.a(j);
            if (j3 == 0) {
                while (qc3Var.b > j2) {
                    qc3Var.a();
                }
            }
            return Optional.empty();
        } catch (gc3 e) {
            e = e;
            throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e);
        } catch (hc3 e2) {
            e = e2;
            throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e);
        } catch (mc3 unused) {
            y62Var = y62.x;
            return Optional.of(y62Var);
        } catch (oc3 unused2) {
            y62Var = y62.H;
            return Optional.of(y62Var);
        }
    }
}

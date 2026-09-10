package ads_mobile_sdk;

import saneness.amphitheatre;
import saneness.delouse;
import saneness.resalable;

/* JADX INFO: loaded from: classes.dex */
public final class ed0 implements resalable {
    public final delouse a;
    public final u13 b;
    public final amphitheatre c;
    public final long d;

    public ed0(delouse delouseVar, u13 u13Var, amphitheatre amphitheatreVar, long j) {
        this.a = delouseVar;
        this.b = u13Var;
        this.c = amphitheatreVar;
        this.d = j;
    }

    @Override // saneness.resalable
    public final boolean a(i72 i72Var) {
        if (i72Var == null || i72Var.equals(i72.q())) {
            this.b.b(gf0.EVENT_ID_DG_VALIDATOR_UPDATE_METADATA_NOT_FOUND);
            return true;
        }
        if (i72Var.p() != this.a.get()) {
            this.b.b(gf0.EVENT_ID_DG_VALIDATOR_UPDATE_METADATA_ARCH_MISMATCH);
            return true;
        }
        long jQ = i72Var.r().q() * 1000;
        this.c.getClass();
        boolean z = jQ - System.currentTimeMillis() <= this.d;
        if (z) {
            this.b.b(gf0.EVENT_ID_DG_VALIDATOR_UPDATE_PROGRAM_ALMOST_EXPIRED);
        }
        return z;
    }

    @Override // saneness.resalable
    public final boolean b(i72 i72Var) {
        if (i72Var == null || i72Var.equals(i72.q())) {
            this.b.b(gf0.EVENT_ID_DG_VALIDATOR_INIT_METADATA_NOT_FOUND);
            return false;
        }
        if (i72Var.p() == this.a.get()) {
            return true;
        }
        this.b.b(gf0.EVENT_ID_DG_VALIDATOR_INIT_METADATA_ARCH_MISMATCH);
        return false;
    }
}

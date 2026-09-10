package saneness;

import ads_mobile_sdk.gb1;
import ads_mobile_sdk.in;
import ads_mobile_sdk.vm0;

/* JADX INFO: loaded from: classes.dex */
public final class euhemerize extends vm0 {
    public euhemerize() {
        super(gb1.DEFAULT_INSTANCE);
    }

    public final euhemerize attabal(in inVar) {
        b();
        gb1 gb1Var = (gb1) this.b;
        gb1Var.getClass();
        inVar.getClass();
        gb1Var.bitField0_ |= 4;
        gb1Var.hmacKey_ = inVar;
        return this;
    }

    public final euhemerize dern(in inVar) {
        b();
        gb1 gb1Var = (gb1) this.b;
        gb1Var.getClass();
        inVar.getClass();
        gb1Var.bitField0_ |= 2;
        gb1Var.symmetricKey_ = inVar;
        return this;
    }

    public final euhemerize wireman() {
        b();
        gb1 gb1Var = (gb1) this.b;
        gb1Var.getClass();
        gb1Var.type_ = 3;
        gb1Var.bitField0_ |= 1;
        return this;
    }
}

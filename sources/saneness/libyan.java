package saneness;

import ads_mobile_sdk.b10;
import ads_mobile_sdk.d10;
import ads_mobile_sdk.vm0;
import ads_mobile_sdk.zz;

/* JADX INFO: loaded from: classes.dex */
public final class libyan extends vm0 {
    public libyan() {
        super(d10.DEFAULT_INSTANCE);
    }

    public final libyan attabal(int i) {
        b();
        d10 d10Var = (d10) this.b;
        d10Var.bitField0_ |= 1;
        d10Var.id_ = i;
        return this;
    }

    public final libyan dern(b10 b10Var) {
        b();
        d10 d10Var = (d10) this.b;
        d10Var.getClass();
        d10Var.adResourceType_ = b10Var.a;
        d10Var.bitField0_ |= 64;
        return this;
    }

    public final libyan marial(String str) {
        b();
        d10 d10Var = (d10) this.b;
        d10Var.getClass();
        str.getClass();
        d10Var.bitField0_ |= 2;
        d10Var.url_ = str;
        return this;
    }

    public final libyan wireman(zz zzVar) {
        b();
        d10 d10Var = (d10) this.b;
        d10Var.getClass();
        d10Var.request_ = zzVar;
        d10Var.bitField0_ |= 4;
        return this;
    }
}

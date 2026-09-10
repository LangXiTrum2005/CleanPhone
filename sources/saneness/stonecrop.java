package saneness;

import ads_mobile_sdk.d10;
import ads_mobile_sdk.f10;
import ads_mobile_sdk.j;
import ads_mobile_sdk.jz;
import ads_mobile_sdk.vm0;
import ads_mobile_sdk.w10;

/* JADX INFO: loaded from: classes.dex */
public final class stonecrop extends vm0 {
    public stonecrop() {
        super(w10.DEFAULT_INSTANCE);
    }

    public final stonecrop attabal(f10 f10Var) {
        b();
        w10 w10Var = (w10) this.b;
        w10Var.getClass();
        w10Var.clientProperties_ = f10Var;
        w10Var.bitField0_ |= 8192;
        return this;
    }

    public final stonecrop beachfront(String str) {
        b();
        w10 w10Var = (w10) this.b;
        w10Var.getClass();
        w10Var.bitField0_ |= 8;
        w10Var.pageUrl_ = str;
        return this;
    }

    public final stonecrop competently(String str) {
        b();
        w10 w10Var = (w10) this.b;
        w10Var.getClass();
        w10Var.bitField0_ |= 4;
        w10Var.url_ = str;
        return this;
    }

    public final stonecrop dern(jz jzVar) {
        b();
        w10 w10Var = (w10) this.b;
        w10Var.getClass();
        w10Var.creativeProperties_ = jzVar;
        w10Var.bitField0_ |= 32;
        return this;
    }

    public final stonecrop impromptu() {
        b();
        w10 w10Var = (w10) this.b;
        w10Var.getClass();
        w10Var.type_ = 8;
        w10Var.bitField0_ |= 1;
        return this;
    }

    public final void marial(libyan libyanVar) {
        b();
        w10 w10Var = (w10) this.b;
        d10 d10Var = (d10) libyanVar.a();
        w10Var.getClass();
        prescient prescientVar = w10Var.resources_;
        if (!((j) prescientVar).a) {
            w10Var.resources_ = listeriosis.attabal(prescientVar, 2);
        }
        w10Var.resources_.add(d10Var);
    }

    public final void wireman(String str) {
        b();
        w10 w10Var = (w10) this.b;
        w10Var.getClass();
        str.getClass();
        w10Var.bitField0_ |= 64;
        w10Var.clickUrl_ = str;
    }
}

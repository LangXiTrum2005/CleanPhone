package saneness;

import ads_mobile_sdk.j;
import ads_mobile_sdk.j21;
import ads_mobile_sdk.o5;
import ads_mobile_sdk.vc0;
import ads_mobile_sdk.vm0;
import ads_mobile_sdk.z72;
import ads_mobile_sdk.zb1;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class tower extends vm0 {
    public tower() {
        super(o5.DEFAULT_INSTANCE);
    }

    public final tower apical(String str) {
        b();
        o5 o5Var = (o5) this.b;
        o5Var.getClass();
        str.getClass();
        o5Var.bitField0_ |= 8;
        o5Var.country_ = str;
        return this;
    }

    public final tower attabal(long j) {
        b();
        o5 o5Var = (o5) this.b;
        o5Var.bitField0_ |= 1;
        o5Var.apiLevel_ = j;
        return this;
    }

    public final void beachfront(cyrtometer cyrtometerVar) {
        b();
        o5 o5Var = (o5) this.b;
        RandomAccess randomAccess = o5Var.experimentIds_;
        if (!((j) randomAccess).a) {
            j21 j21Var = (j21) randomAccess;
            o5Var.experimentIds_ = j21Var.a(j21Var.c * 2);
        }
        lamplit.a(cyrtometerVar, o5Var.experimentIds_);
    }

    public final tower competently(String str) {
        b();
        o5 o5Var = (o5) this.b;
        o5Var.getClass();
        str.getClass();
        o5Var.bitField0_ |= 32;
        o5Var.appId_ = str;
        return this;
    }

    public final void dern(vc0 vc0Var) {
        b();
        o5 o5Var = (o5) this.b;
        o5Var.getClass();
        o5Var.deviceType_ = vc0Var.a;
        o5Var.bitField0_ |= 16;
    }

    public final tower formularize(String str) {
        b();
        o5 o5Var = (o5) this.b;
        o5Var.getClass();
        str.getClass();
        o5Var.bitField0_ |= 128;
        o5Var.hostVersion_ = str;
        return this;
    }

    public final void impassible() {
        b();
        o5 o5Var = (o5) this.b;
        o5Var.getClass();
        o5Var.logEvents_ = z72.e;
    }

    public final void impromptu(long j) {
        b();
        o5 o5Var = (o5) this.b;
        o5Var.bitField0_ |= 64;
        o5Var.appVersionCode_ = j;
    }

    public final tower kowloon(String str) {
        b();
        o5 o5Var = (o5) this.b;
        o5Var.getClass();
        str.getClass();
        o5Var.bitField0_ |= 4;
        o5Var.locale_ = str;
        return this;
    }

    public final void marial(String str) {
        b();
        o5 o5Var = (o5) this.b;
        o5Var.getClass();
        str.getClass();
        o5Var.bitField0_ |= 256;
        o5Var.adshieldVersion_ = str;
    }

    public final tower monoploid(String str) {
        b();
        o5 o5Var = (o5) this.b;
        o5Var.getClass();
        str.getClass();
        o5Var.bitField0_ |= 2;
        o5Var.model_ = str;
        return this;
    }

    public final tower taiyuan(long j) {
        b();
        o5 o5Var = (o5) this.b;
        o5Var.bitField0_ |= 1024;
        o5Var.requestedAdshieldVersion_ = j;
        return this;
    }

    public final void triweekly(long j) {
        b();
        o5 o5Var = (o5) this.b;
        o5Var.bitField0_ |= 512;
        o5Var.samplingDenominator_ = j;
    }

    public final void wireman(zb1 zb1Var) {
        b();
        o5 o5Var = (o5) this.b;
        o5Var.getClass();
        prescient prescientVar = o5Var.logEvents_;
        if (!((j) prescientVar).a) {
            o5Var.logEvents_ = listeriosis.attabal(prescientVar, 2);
        }
        o5Var.logEvents_.add(zb1Var);
    }
}

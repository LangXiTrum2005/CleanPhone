package saneness;

import ads_mobile_sdk.hz1;
import ads_mobile_sdk.in;
import ads_mobile_sdk.ps0;
import ads_mobile_sdk.q5;
import ads_mobile_sdk.vm0;

/* JADX INFO: loaded from: classes.dex */
public final class gibeonite extends vm0 {
    public gibeonite() {
        super(q5.DEFAULT_INSTANCE);
    }

    public final gibeonite attabal(long j) {
        b();
        q5 q5Var = (q5) this.b;
        q5Var.bitField0_ |= 2;
        q5Var.apiLevel_ = j;
        return this;
    }

    public final gibeonite beachfront(long j) {
        b();
        q5 q5Var = (q5) this.b;
        q5Var.bitField0_ |= 16;
        q5Var.appVersionCode_ = j;
        return this;
    }

    public final gibeonite competently(String str) {
        b();
        q5 q5Var = (q5) this.b;
        q5Var.getClass();
        str.getClass();
        q5Var.bitField0_ |= 32;
        q5Var.hostVersion_ = str;
        return this;
    }

    public final gibeonite dern(in inVar) {
        b();
        q5 q5Var = (q5) this.b;
        q5Var.getClass();
        inVar.getClass();
        q5Var.bitField0_ |= 1;
        q5Var.vmVersion_ = inVar;
        return this;
    }

    public final gibeonite impromptu(String str) {
        b();
        q5 q5Var = (q5) this.b;
        q5Var.getClass();
        str.getClass();
        q5Var.bitField0_ |= 4;
        q5Var.model_ = str;
        return this;
    }

    public final gibeonite marial(String str) {
        b();
        q5 q5Var = (q5) this.b;
        q5Var.getClass();
        str.getClass();
        q5Var.bitField0_ |= 8;
        q5Var.appId_ = str;
        return this;
    }

    public final gibeonite taiyuan() {
        hz1 hz1Var = hz1.ANDROID;
        b();
        q5 q5Var = (q5) this.b;
        q5Var.getClass();
        q5Var.osType_ = hz1Var.getNumber();
        q5Var.bitField0_ |= 64;
        return this;
    }

    public final gibeonite wireman(ps0 ps0Var) {
        b();
        q5 q5Var = (q5) this.b;
        q5Var.getClass();
        q5Var.hostType_ = ps0Var.getNumber();
        q5Var.bitField0_ |= 128;
        return this;
    }
}

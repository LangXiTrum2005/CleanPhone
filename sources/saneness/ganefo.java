package saneness;

import ads_mobile_sdk.nv2;
import ads_mobile_sdk.vm0;
import ads_mobile_sdk.zb1;

/* JADX INFO: loaded from: classes.dex */
public final class ganefo extends vm0 {
    public ganefo() {
        super(zb1.DEFAULT_INSTANCE);
    }

    public final ganefo attabal(long j) {
        b();
        zb1 zb1Var = (zb1) this.b;
        zb1Var.bitField0_ |= 32;
        zb1Var.eventCount_ = j;
        return this;
    }

    public final ganefo beachfront(String str) {
        b();
        zb1 zb1Var = (zb1) this.b;
        zb1Var.getClass();
        zb1Var.bitField0_ |= 8;
        zb1Var.exceptionName_ = str;
        return this;
    }

    public final ganefo competently(long j) {
        b();
        zb1 zb1Var = (zb1) this.b;
        zb1Var.bitField0_ |= 2;
        zb1Var.runtimeMs_ = j;
        return this;
    }

    public final void dern(nv2 nv2Var) {
        b();
        zb1 zb1Var = (zb1) this.b;
        zb1Var.getClass();
        zb1Var.status_ = nv2Var.a;
        zb1Var.bitField0_ |= 4;
    }

    public final void impromptu(String str) {
        b();
        zb1 zb1Var = (zb1) this.b;
        zb1Var.getClass();
        str.getClass();
        zb1Var.bitField0_ |= 16;
        zb1Var.stackTrace_ = str;
    }

    public final ganefo marial(long j) {
        b();
        zb1 zb1Var = (zb1) this.b;
        zb1Var.bitField0_ |= 1;
        zb1Var.eventId_ = j;
        return this;
    }

    public final void wireman(String str) {
        b();
        zb1 zb1Var = (zb1) this.b;
        zb1Var.getClass();
        str.getClass();
        zb1Var.bitField0_ |= 64;
        zb1Var.debugInfo_ = str;
    }
}

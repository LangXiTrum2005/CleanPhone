package saneness;

import ads_mobile_sdk.tm1;
import ads_mobile_sdk.vm0;
import ads_mobile_sdk.vm1;
import ads_mobile_sdk.xm1;

/* JADX INFO: loaded from: classes.dex */
public final class executant extends vm0 {
    public executant() {
        super(tm1.DEFAULT_INSTANCE);
    }

    public final void attabal(int i) {
        b();
        tm1 tm1Var = (tm1) this.b;
        tm1Var.bitField0_ |= 8;
        tm1Var.preferredAdChoicesPosition_ = i;
    }

    public final void beachfront() {
        b();
        tm1 tm1Var = (tm1) this.b;
        tm1Var.bitField0_ |= 16;
        tm1Var.disableImageLoading_ = true;
    }

    public final void competently() {
        b();
        tm1 tm1Var = (tm1) this.b;
        tm1Var.bitField0_ |= 64;
        tm1Var.isBannerAllowed_ = true;
    }

    public final void dern(vm1 vm1Var) {
        b();
        tm1 tm1Var = (tm1) this.b;
        tm1Var.getClass();
        tm1Var.sdkCustomClickGesture_ = vm1Var;
        tm1Var.bitField0_ |= 256;
    }

    public final void impromptu() {
        b();
        tm1 tm1Var = (tm1) this.b;
        tm1Var.bitField0_ |= 128;
        tm1Var.isNativeAllowed_ = true;
    }

    public final void marial(String str) {
        b();
        tm1 tm1Var = (tm1) this.b;
        tm1Var.getClass();
        str.getClass();
        tm1Var.bitField0_ |= 32;
        tm1Var.nativeMediaOrientation_ = str;
    }

    public final void taiyuan() {
        b();
        tm1 tm1Var = (tm1) this.b;
        tm1Var.bitField0_ |= 4;
        tm1Var.useCustomMute_ = true;
    }

    public final void wireman(xm1 xm1Var) {
        b();
        tm1 tm1Var = (tm1) this.b;
        tm1Var.getClass();
        tm1Var.videoOptions_ = xm1Var;
        tm1Var.bitField0_ |= 1;
    }
}

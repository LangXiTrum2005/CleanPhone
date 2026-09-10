package saneness;

import ads_mobile_sdk.fb;
import ads_mobile_sdk.vm0;

/* JADX INFO: loaded from: classes.dex */
public final class montera extends vm0 {
    public montera() {
        super(fb.DEFAULT_INSTANCE);
    }

    public final montera attabal(long j) {
        b();
        fb fbVar = (fb) this.b;
        fbVar.bitField0_ |= 4;
        fbVar.evtTime_ = j;
        return this;
    }

    public final void beachfront(long j) {
        b();
        fb fbVar = (fb) this.b;
        fbVar.bitField0_ |= 16;
        fbVar.vcdSignal_ = j;
    }

    public final montera competently() {
        b();
        fb fbVar = (fb) this.b;
        fbVar.getClass();
        fbVar.bitField0_ |= 1;
        fbVar.adshieldVersion_ = "0.869935264";
        return this;
    }

    public final montera dern(String str) {
        b();
        fb fbVar = (fb) this.b;
        fbVar.getClass();
        str.getClass();
        fbVar.bitField0_ |= 2;
        fbVar.afmaVersion_ = str;
        return this;
    }

    public final montera marial(String str) {
        b();
        fb fbVar = (fb) this.b;
        fbVar.getClass();
        str.getClass();
        fbVar.bitField0_ |= 8;
        fbVar.appIdSignal_ = str;
        return this;
    }

    public final montera wireman(long j) {
        b();
        fb fbVar = (fb) this.b;
        fbVar.bitField0_ |= 32;
        fbVar.uptSignal_ = j;
        return this;
    }
}

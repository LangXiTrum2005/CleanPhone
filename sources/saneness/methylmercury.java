package saneness;

import ads_mobile_sdk.rm;
import ads_mobile_sdk.tm;
import ads_mobile_sdk.um;
import ads_mobile_sdk.vm0;

/* JADX INFO: loaded from: classes.dex */
public final class methylmercury extends vm0 {
    public methylmercury() {
        super(um.DEFAULT_INSTANCE);
    }

    public final void attabal(int i) {
        b();
        um umVar = (um) this.b;
        umVar.bitField0_ |= 128;
        umVar.adapterBehaviorBitmap_ = i;
    }

    public final void beachfront(String str) {
        b();
        um umVar = (um) this.b;
        umVar.getClass();
        str.getClass();
        umVar.bitField0_ |= 1;
        umVar.adapterClassName_ = str;
    }

    public final void competently(tm tmVar) {
        b();
        um umVar = (um) this.b;
        umVar.getClass();
        umVar.sdkVersion_ = tmVar;
        umVar.bitField0_ |= 4;
    }

    public final void dern(long j) {
        b();
        um umVar = (um) this.b;
        umVar.bitField0_ |= 64;
        umVar.latencyMs_ = j;
    }

    public final void impromptu(String str) {
        b();
        um umVar = (um) this.b;
        umVar.getClass();
        str.getClass();
        umVar.bitField0_ |= 2;
        umVar.buyerGeneratedRequestData_ = str;
    }

    public final void marial(tm tmVar) {
        b();
        um umVar = (um) this.b;
        umVar.getClass();
        umVar.adapterVersion_ = tmVar;
        umVar.bitField0_ |= 8;
    }

    public final String taiyuan() {
        return ((um) this.b).adapterClassName_;
    }

    public final void wireman(rm rmVar) {
        b();
        um umVar = (um) this.b;
        umVar.getClass();
        umVar.error_ = rmVar;
        umVar.bitField0_ |= 32;
    }
}

package saneness;

import ads_mobile_sdk.qa;
import ads_mobile_sdk.vm0;

/* JADX INFO: loaded from: classes.dex */
public final class dispatchbox extends vm0 {
    public dispatchbox() {
        super(qa.DEFAULT_INSTANCE);
    }

    public final void attabal(long j) {
        b();
        qa qaVar = (qa) this.b;
        qaVar.bitField0_ |= 32;
        qaVar.displayDensity_ = j;
    }

    public final dispatchbox beachfront(long j) {
        b();
        qa qaVar = (qa) this.b;
        qaVar.bitField0_ |= 16;
        qaVar.viewWidth_ = j;
        return this;
    }

    public final dispatchbox dern(long j) {
        b();
        qa qaVar = (qa) this.b;
        qaVar.bitField0_ |= 4;
        qaVar.minAlphaSignal_ = j;
        return this;
    }

    public final dispatchbox marial(long j) {
        b();
        qa qaVar = (qa) this.b;
        qaVar.bitField0_ |= 8;
        qaVar.viewHeight_ = j;
        return this;
    }

    public final dispatchbox wireman(long j) {
        b();
        qa qaVar = (qa) this.b;
        qaVar.bitField0_ |= 1;
        qaVar.percentAdOnScreen_ = j;
        return this;
    }
}

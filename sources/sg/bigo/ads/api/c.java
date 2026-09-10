package sg.bigo.ads.api;

import sg.bigo.ads.api.b;
import sg.bigo.ads.api.c;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c<ARB extends c, AR extends b> {
    private long mActivatedTime;
    private int mAge;
    private int mGender;
    protected String mServerBidPayload;
    protected String mSlotId;

    public AR build() {
        AR ar = (AR) createAdRequest();
        if (ar != null) {
            int i2 = this.mAge;
            int i3 = this.mGender;
            long j = this.mActivatedTime;
            ar.d = i2;
            ar.f46990e = i3;
            ar.f = j;
        }
        return ar;
    }

    public abstract AR createAdRequest();

    public ARB withActivatedTime(long j) {
        this.mActivatedTime = j;
        return this;
    }

    public ARB withAge(int i2) {
        this.mAge = i2;
        return this;
    }

    public final ARB withBid(String str) {
        this.mServerBidPayload = str;
        return this;
    }

    public ARB withGender(int i2) {
        this.mGender = i2;
        return this;
    }

    public final ARB withSlotId(String str) {
        this.mSlotId = str;
        return this;
    }
}

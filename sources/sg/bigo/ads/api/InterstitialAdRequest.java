package sg.bigo.ads.api;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class InterstitialAdRequest extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f46969h;

    public static class Builder extends c<Builder, InterstitialAdRequest> {
        @Override // sg.bigo.ads.api.c
        public InterstitialAdRequest createAdRequest() {
            return new InterstitialAdRequest(this.mSlotId, this.mServerBidPayload);
        }
    }

    public InterstitialAdRequest(String str, String str2) {
        super(str, str2);
        this.f46969h = 3;
    }

    @Override // sg.bigo.ads.api.b
    public final boolean a(int i2) {
        if (i2 == 3) {
            this.f46969h = 3;
            return false;
        }
        if (i2 != 20) {
            return true;
        }
        this.f46969h = 20;
        return false;
    }

    @Override // sg.bigo.ads.api.b
    public final int c() {
        return this.f46969h;
    }

    @Override // sg.bigo.ads.api.b
    public final Map<String, Object> d() {
        return null;
    }
}

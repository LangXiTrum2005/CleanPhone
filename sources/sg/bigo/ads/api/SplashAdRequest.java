package sg.bigo.ads.api;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SplashAdRequest extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f46972h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f46973i;

    public static class Builder extends c<Builder, SplashAdRequest> {
        private int mAppLogoResId;
        private String mAppName;

        @Override // sg.bigo.ads.api.c
        public SplashAdRequest createAdRequest() {
            return new SplashAdRequest(this.mSlotId, this.mAppLogoResId, this.mAppName, this.mServerBidPayload);
        }

        public Builder withAppLogo(int i2) {
            this.mAppLogoResId = i2;
            return this;
        }

        public Builder withAppName(String str) {
            this.mAppName = str;
            return this;
        }
    }

    public SplashAdRequest(String str, int i2, String str2, String str3) {
        super(str, str3);
        this.f46972h = i2;
        this.f46973i = str2;
    }

    @Override // sg.bigo.ads.api.b
    public final int c() {
        return 12;
    }

    @Override // sg.bigo.ads.api.b
    public final Map<String, Object> d() {
        return null;
    }
}

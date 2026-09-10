package com.adcolony.sdk;

/* JADX INFO: loaded from: classes.dex */
public class AdColonyAdOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f8889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f8890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    AdColonyUserMetadata f8891c;
    f1 d = c0.b();

    public AdColonyAdOptions enableConfirmationDialog(boolean z2) {
        this.f8889a = z2;
        c0.b(this.d, "confirmation_enabled", true);
        return this;
    }

    public AdColonyAdOptions enableResultsDialog(boolean z2) {
        this.f8890b = z2;
        c0.b(this.d, "results_enabled", true);
        return this;
    }

    public Object getOption(String str) {
        return c0.g(this.d, str);
    }

    @Deprecated
    public AdColonyUserMetadata getUserMetadata() {
        return this.f8891c;
    }

    public AdColonyAdOptions setOption(String str, boolean z2) {
        if (z0.e(str)) {
            c0.b(this.d, str, z2);
        }
        return this;
    }

    @Deprecated
    public AdColonyAdOptions setUserMetadata(AdColonyUserMetadata adColonyUserMetadata) {
        this.f8891c = adColonyUserMetadata;
        c0.a(this.d, "user_metadata", adColonyUserMetadata.f8942b);
        return this;
    }

    public AdColonyAdOptions setOption(String str, double d) {
        if (z0.e(str)) {
            c0.a(this.d, str, d);
        }
        return this;
    }

    public AdColonyAdOptions setOption(String str, String str2) {
        if (str != null) {
            c0.a(this.d, str, str2);
        }
        return this;
    }
}

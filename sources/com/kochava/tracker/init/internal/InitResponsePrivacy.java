package com.kochava.tracker.init.internal;

import com.kochava.tracker.privacy.internal.PrivacyProfileApi;

/* JADX INFO: loaded from: classes5.dex */
public final class InitResponsePrivacy implements InitResponsePrivacyApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PrivacyProfileApi[] f28218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f28219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f28220c;
    public final String[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f28221e;
    public final InitResponsePrivacyIntelligentConsent f;

    public InitResponsePrivacy() {
        this.f28218a = new PrivacyProfileApi[0];
        this.f28219b = new String[0];
        this.f28220c = new String[0];
        this.d = new String[0];
        this.f28221e = new String[0];
        this.f = new InitResponsePrivacyIntelligentConsent();
    }

    public InitResponsePrivacy(PrivacyProfileApi[] privacyProfileApiArr, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, InitResponsePrivacyIntelligentConsent initResponsePrivacyIntelligentConsent) {
        this.f28218a = privacyProfileApiArr;
        this.f28219b = strArr;
        this.f28220c = strArr2;
        this.d = strArr3;
        this.f28221e = strArr4;
        this.f = initResponsePrivacyIntelligentConsent;
    }
}

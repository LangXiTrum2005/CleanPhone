package com.kochava.tracker.profile.internal;

import com.kochava.core.storage.prefs.internal.StoragePrefs;
import com.kochava.tracker.privacy.internal.ConsentState;

/* JADX INFO: loaded from: classes5.dex */
public final class ProfilePrivacy extends a implements ProfilePrivacyApi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ConsentState f28308c;
    public long d;

    public ProfilePrivacy(StoragePrefs storagePrefs, long j) {
        super(storagePrefs);
        this.f28308c = ConsentState.NOT_ANSWERED;
        this.d = 0L;
        this.f28307b = j;
    }

    public final synchronized void a() {
        ConsentState consentState;
        String strE = this.f28312a.e("privacy.consent_state", "not_answered");
        ConsentState[] consentStateArrValues = ConsentState.values();
        int length = consentStateArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                consentState = ConsentState.NOT_ANSWERED;
                break;
            }
            consentState = consentStateArrValues[i2];
            if (consentState.X.equals(strE)) {
                break;
            } else {
                i2++;
            }
        }
        this.f28308c = consentState;
        long jLongValue = this.f28312a.d("privacy.consent_state_time_millis", Long.valueOf(this.f28307b)).longValue();
        this.d = jLongValue;
        if (jLongValue == this.f28307b) {
            this.f28312a.j("privacy.consent_state_time_millis", jLongValue);
        }
    }

    public final synchronized ConsentState b() {
        return this.f28308c;
    }

    public final synchronized void c(ConsentState consentState) {
        this.f28308c = consentState;
        this.f28312a.k("privacy.consent_state", consentState.X);
    }

    public final synchronized void d(long j) {
        this.d = j;
        this.f28312a.j("privacy.consent_state_time_millis", j);
    }
}

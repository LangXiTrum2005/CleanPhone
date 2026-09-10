package com.chartboost.sdk.impl;

import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.Custom;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.GDPR;
import com.chartboost.sdk.privacy.model.LGPD;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class le implements ke, z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fe f14424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z6 f14425b;

    public le(fe repository, z6 eventTracker) {
        Intrinsics.f(repository, "repository");
        Intrinsics.f(eventTracker, "eventTracker");
        this.f14424a = repository;
        this.f14425b = eventTracker;
    }

    @Override // com.chartboost.sdk.impl.ke
    public void a(DataUseConsent dataUseConsent) {
        String privacyStandardName;
        if (dataUseConsent == null || (privacyStandardName = dataUseConsent.getPrivacyStandardName()) == null || privacyStandardName.length() == 0) {
            try {
                track((ch) new h5(fh.d.PERSISTENCE_ERROR, "", "", "", null, null, 48, null));
            } catch (Exception unused) {
            }
            za.b("addDataUseConsent failed", (Throwable) null, 2, (Object) null);
        } else if ((dataUseConsent instanceof GDPR) || (dataUseConsent instanceof CCPA) || (dataUseConsent instanceof COPPA) || (dataUseConsent instanceof LGPD) || (dataUseConsent instanceof Custom)) {
            this.f14424a.b(dataUseConsent);
        } else {
            try {
                track((ch) new u6(fh.d.SUBCLASSING_ERROR, dataUseConsent.getClass().getName(), "", "", null, 16, null));
            } catch (Exception unused2) {
            }
            za.e("Attempt to addDataUseConsent. Context and DataUseConsent cannot be null.", null, 2, null);
        }
    }

    @Override // com.chartboost.sdk.impl.y6
    public void clear(String type, String location) {
        Intrinsics.f(type, "type");
        Intrinsics.f(location, "location");
        this.f14425b.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch clearFromStorage(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f14425b.clearFromStorage(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch persist(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f14425b.persist(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ah refresh(ah ahVar) {
        Intrinsics.f(ahVar, "<this>");
        return this.f14425b.refresh(ahVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ug store(ug ugVar) {
        Intrinsics.f(ugVar, "<this>");
        return this.f14425b.store(ugVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch track(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f14425b.track(chVar);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo185clearFromStorage(ch event) {
        Intrinsics.f(event, "event");
        this.f14425b.mo185clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: persist */
    public void mo186persist(ch event) {
        Intrinsics.f(event, "event");
        this.f14425b.mo186persist(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: refresh */
    public void mo187refresh(ah config) {
        Intrinsics.f(config, "config");
        this.f14425b.mo187refresh(config);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: store */
    public void mo188store(ug ad) {
        Intrinsics.f(ad, "ad");
        this.f14425b.mo188store(ad);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: track */
    public void mo189track(ch event) {
        Intrinsics.f(event, "event");
        this.f14425b.mo189track(event);
    }
}

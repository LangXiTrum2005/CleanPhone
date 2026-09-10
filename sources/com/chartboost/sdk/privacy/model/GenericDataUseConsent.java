package com.chartboost.sdk.privacy.model;

import com.chartboost.sdk.impl.ah;
import com.chartboost.sdk.impl.ch;
import com.chartboost.sdk.impl.fh;
import com.chartboost.sdk.impl.h5;
import com.chartboost.sdk.impl.ug;
import com.chartboost.sdk.impl.xg;
import com.chartboost.sdk.impl.z6;
import com.p004ironsource.d9;
import com.smartdigimkt.q0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000b\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010*\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\fJ\u0014\u0010\u000b\u001a\u00020\t*\u00020\tH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\u0017J\u0014\u0010\r\u001a\u00020\t*\u00020\tH\u0096\u0001¢\u0006\u0004\b\r\u0010\u0017J\u0014\u0010\u0010\u001a\u00020\u000e*\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0018J\u0014\u0010\u0014\u001a\u00020\u0012*\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0019J\u0014\u0010\u0016\u001a\u00020\t*\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u0004¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\u00020\u00038\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b\u001d\u0010\u001cR\"\u0010'\u001a\u00020\"8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b\u001b\u0010%\"\u0004\b\u001b\u0010&R\u0014\u0010)\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010 ¨\u0006-"}, d2 = {"Lcom/chartboost/sdk/privacy/model/GenericDataUseConsent;", "Lcom/chartboost/sdk/privacy/model/DataUseConsent;", "Lcom/chartboost/sdk/impl/z6;", "", "type", "location", "", "clear", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/chartboost/sdk/impl/ch;", "event", "clearFromStorage", "(Lcom/chartboost/sdk/impl/ch;)V", "persist", "Lcom/chartboost/sdk/impl/ah;", b.i0, "refresh", "(Lcom/chartboost/sdk/impl/ah;)V", "Lcom/chartboost/sdk/impl/ug;", "ad", d9.h.f24716U, "(Lcom/chartboost/sdk/impl/ug;)V", "track", "(Lcom/chartboost/sdk/impl/ch;)Lcom/chartboost/sdk/impl/ch;", "(Lcom/chartboost/sdk/impl/ah;)Lcom/chartboost/sdk/impl/ah;", "(Lcom/chartboost/sdk/impl/ug;)Lcom/chartboost/sdk/impl/ug;", "msg", "a", "(Ljava/lang/String;)V", "b", "Ljava/lang/String;", "getPrivacyStandardName", "()Ljava/lang/String;", "privacyStandardName", "", "c", "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "consentValue", "getPrivacyStandard", "privacyStandard", "eventTracker", "<init>", "(Lcom/chartboost/sdk/impl/z6;)V", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0})
public abstract class GenericDataUseConsent implements DataUseConsent, z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z6 f15864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public String privacyStandardName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public Object consentValue;

    public GenericDataUseConsent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getConsentValue() {
        return this.consentValue;
    }

    public final void b(String str) {
        Intrinsics.f(str, "<set-?>");
        this.privacyStandardName = str;
    }

    @Override // com.chartboost.sdk.impl.y6
    public void clear(String type, String location) {
        Intrinsics.f(type, "type");
        Intrinsics.f(location, "location");
        this.f15864a.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch clearFromStorage(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f15864a.clearFromStorage(chVar);
    }

    @Override // com.chartboost.sdk.privacy.model.DataUseConsent
    /* JADX INFO: renamed from: getPrivacyStandard, reason: from getter */
    public String getPrivacyStandardName() {
        return this.privacyStandardName;
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch persist(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f15864a.persist(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ah refresh(ah ahVar) {
        Intrinsics.f(ahVar, "<this>");
        return this.f15864a.refresh(ahVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ug store(ug ugVar) {
        Intrinsics.f(ugVar, "<this>");
        return this.f15864a.store(ugVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch track(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f15864a.track(chVar);
    }

    public GenericDataUseConsent(z6 eventTracker) {
        Intrinsics.f(eventTracker, "eventTracker");
        this.f15864a = eventTracker;
        this.privacyStandardName = "";
        this.consentValue = "";
    }

    public final void a(Object obj) {
        Intrinsics.f(obj, "<set-?>");
        this.consentValue = obj;
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo185clearFromStorage(ch event) {
        Intrinsics.f(event, "event");
        this.f15864a.mo185clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: persist */
    public void mo186persist(ch event) {
        Intrinsics.f(event, "event");
        this.f15864a.mo186persist(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: refresh */
    public void mo187refresh(ah config) {
        Intrinsics.f(config, "config");
        this.f15864a.mo187refresh(config);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: store */
    public void mo188store(ug ad) {
        Intrinsics.f(ad, "ad");
        this.f15864a.mo188store(ad);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: track */
    public void mo189track(ch event) {
        Intrinsics.f(event, "event");
        this.f15864a.mo189track(event);
    }

    public final void a(String msg) {
        try {
            track((ch) new h5(fh.d.CREATION_ERROR, msg == null ? "no message" : msg, "", "", null, null, 48, null));
            throw new Exception(msg);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public /* synthetic */ GenericDataUseConsent(z6 z6Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? xg.a() : z6Var);
    }
}

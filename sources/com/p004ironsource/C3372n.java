package com.p004ironsource;

import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.sdk.controller.f;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ironsource/n;", "Lcom/ironsource/gc;", "Lcom/ironsource/z1;", "event", "", "", "", "a", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adFormat", "Ljava/util/UUID;", "b", "Ljava/util/UUID;", f.b.AD_ID, "c", "Ljava/lang/String;", "adUnitId", "<init>", "(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/util/UUID;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class C3372n extends gc {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final IronSource.AD_UNIT adFormat;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final UUID adId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String adUnitId;

    public C3372n(IronSource.AD_UNIT adFormat, UUID adId, String adUnitId) {
        Intrinsics.f(adFormat, "adFormat");
        Intrinsics.f(adId, "adId");
        Intrinsics.f(adUnitId, "adUnitId");
        this.adFormat = adFormat;
        this.adId = adId;
        this.adUnitId = adUnitId;
    }

    @Override // com.p004ironsource.b2
    public Map<String, Object> a(z1 event) {
        return a(new e1(this.adFormat, this.adId, this.adUnitId, null, null, null, 56, null));
    }
}

package com.p004ironsource;

import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ironsource/a2;", "Lcom/ironsource/gc;", "Lcom/ironsource/z1;", "event", "", "", "", "a", "Lcom/ironsource/m1;", "Lcom/ironsource/m1;", "adTools", "Lcom/ironsource/e1;", "b", "Lcom/ironsource/e1;", "adProperties", "c", "Ljava/lang/String;", IronSourceConstants.EVENTS_MEDIATION_LOAD_STRATEGY, "<init>", "(Lcom/ironsource/m1;Lcom/ironsource/e1;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class a2 extends gc {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m1 adTools;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e1 adProperties;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String mediationLoadStrategy;

    public a2(m1 adTools, e1 adProperties, String str) {
        Intrinsics.f(adTools, "adTools");
        Intrinsics.f(adProperties, "adProperties");
        this.adTools = adTools;
        this.adProperties = adProperties;
        this.mediationLoadStrategy = str;
    }

    @Override // com.p004ironsource.b2
    public Map<String, Object> a(z1 event) {
        Map<String, Object> mapA = a(this.adProperties);
        mapA.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        mapA.put("sessionDepth", Integer.valueOf(this.adTools.f()));
        String str = this.mediationLoadStrategy;
        if (str != null) {
            mapA.put(IronSourceConstants.EVENTS_MEDIATION_LOAD_STRATEGY, str);
        }
        return mapA;
    }

    public /* synthetic */ a2(m1 m1Var, e1 e1Var, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(m1Var, e1Var, (i2 & 4) != 0 ? null : str);
    }
}

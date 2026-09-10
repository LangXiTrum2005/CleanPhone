package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class D0 extends E5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0506p0 f25913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0363h0 f25914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f25915c;

    public /* synthetic */ D0(C0506p0 c0506p0, C0363h0 c0363h0, String str, int i10, kotlin.jvm.internal.g gVar) {
        this(c0506p0, c0363h0, (i10 & 4) != 0 ? null : str);
    }

    @Override // com.ironsource.E0
    public Map<String, Object> a(C0 c4) {
        Map<String, Object> mapA = a(this.f25914b);
        mapA.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        mapA.put("sessionDepth", Integer.valueOf(this.f25913a.e()));
        String str = this.f25915c;
        if (str != null) {
            mapA.put(IronSourceConstants.EVENTS_MEDIATION_LOAD_STRATEGY, str);
        }
        return mapA;
    }

    public D0(C0506p0 adTools, C0363h0 adProperties, String str) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(adProperties, "adProperties");
        this.f25913a = adTools;
        this.f25914b = adProperties;
        this.f25915c = str;
    }
}

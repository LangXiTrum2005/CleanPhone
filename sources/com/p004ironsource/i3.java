package com.p004ironsource;

import com.p004ironsource.adapters.ironsource.IronSourceLoadParameters;
import com.p004ironsource.mediationsdk.IronSource;
import com.smartdigimkt.h5.f;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0005BA\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\u0010\u000f\u001a\u00060\u000bj\u0002`\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0018\u0010\u000f\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/ironsource/i3;", "Lcom/ironsource/j3;", "Ljava/util/ArrayList;", "Lcom/ironsource/l3;", "Lkotlin/collections/ArrayList;", "a", "", "Ljava/lang/String;", "version", "b", "instanceId", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "Lcom/unity3d/ironsourceads/internal/AdFormat;", "c", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adFormat", "", "d", "Z", "oneFlow", "e", IronSourceLoadParameters.Constants.DEMAND_ONLY, f.j, "multipleAdObjects", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;ZZZ)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class i3 implements j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String version;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String instanceId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final IronSource.AD_UNIT adFormat;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean oneFlow;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean demandOnly;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean multipleAdObjects;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/ironsource/i3$a;", "", "", "b", "I", "DEMAND_ONLY", "c", "ONE_FLOW", "d", "MULTIPLE_AD_OBJECTS", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25306a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final int DEMAND_ONLY = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final int ONE_FLOW = 1;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public static final int MULTIPLE_AD_OBJECTS = 1;

        private a() {
        }
    }

    public i3(String version, String instanceId, IronSource.AD_UNIT adFormat, boolean z2, boolean z3, boolean z4) {
        Intrinsics.f(version, "version");
        Intrinsics.f(instanceId, "instanceId");
        Intrinsics.f(adFormat, "adFormat");
        this.version = version;
        this.instanceId = instanceId;
        this.adFormat = adFormat;
        this.oneFlow = z2;
        this.demandOnly = z3;
        this.multipleAdObjects = z4;
    }

    @Override // com.p004ironsource.j3
    public ArrayList<l3> a() {
        ArrayList<l3> arrayList = new ArrayList<>();
        arrayList.add(new k3.v(this.version));
        arrayList.add(new k3.x(this.instanceId));
        arrayList.add(new k3.a(this.adFormat));
        if (this.oneFlow) {
            arrayList.add(new k3.p(1));
        }
        if (this.demandOnly) {
            arrayList.add(new k3.e(1));
        }
        if (this.multipleAdObjects) {
            arrayList.add(new k3.o(1));
        }
        return arrayList;
    }

    public /* synthetic */ i3(String str, String str2, IronSource.AD_UNIT ad_unit, boolean z2, boolean z3, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, ad_unit, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? true : z3, (i2 & 32) != 0 ? true : z4);
    }
}

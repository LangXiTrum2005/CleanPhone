package com.p004ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/ironsource/fn;", "Lcom/ironsource/sc;", "Lcom/ironsource/en;", "b", "", "a", "Ljava/lang/String;", "adm", "Lcom/ironsource/ar;", "Lcom/ironsource/ar;", "providerName", "Lcom/ironsource/c3;", "c", "Lcom/ironsource/c3;", "adapterConfigs", "", "d", "Z", "isSDKInitialized", "<init>", "(Ljava/lang/String;Lcom/ironsource/ar;Lcom/ironsource/c3;Z)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class fn implements sc<en> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String adm;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ar providerName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c3 adapterConfigs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isSDKInitialized;

    public fn(String adm, ar providerName, c3 adapterConfigs, boolean z2) {
        Intrinsics.f(adm, "adm");
        Intrinsics.f(providerName, "providerName");
        Intrinsics.f(adapterConfigs, "adapterConfigs");
        this.adm = adm;
        this.providerName = providerName;
        this.adapterConfigs = adapterConfigs;
        this.isSDKInitialized = z2;
    }

    @Override // com.p004ironsource.sc
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public en a() throws Exception {
        cj cjVarA = this.adapterConfigs.a(this.providerName);
        new C3380r0(this.adm, cjVarA, this.isSDKInitialized).a();
        if (cjVarA != null) {
            return new en(cjVarA.c(), cjVarA.b(), cjVarA.e(), cjVarA.a(), false, 16, null);
        }
        return null;
    }
}

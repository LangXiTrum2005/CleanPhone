package com.kochava.core.module.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class ModuleDetailsDependency implements ModuleDetailsDependencyApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f28037b;

    public ModuleDetailsDependency(String str, boolean z2) {
        this.f28036a = str;
        this.f28037b = z2;
    }

    @Override // com.kochava.core.module.internal.ModuleDetailsDependencyApi
    public final boolean a() {
        return this.f28037b;
    }

    @Override // com.kochava.core.module.internal.ModuleDetailsDependencyApi
    public final String getName() {
        return this.f28036a;
    }
}

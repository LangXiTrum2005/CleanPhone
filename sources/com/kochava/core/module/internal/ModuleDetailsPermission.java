package com.kochava.core.module.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class ModuleDetailsPermission implements ModuleDetailsPermissionApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f28039b;

    public ModuleDetailsPermission(String str, boolean z2) {
        this.f28038a = str;
        this.f28039b = z2;
    }

    @Override // com.kochava.core.module.internal.ModuleDetailsPermissionApi
    public final boolean a() {
        return this.f28039b;
    }

    @Override // com.kochava.core.module.internal.ModuleDetailsPermissionApi
    public final String getName() {
        return this.f28038a;
    }
}

package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;

/* JADX INFO: loaded from: classes4.dex */
class GetIdListener implements StateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f20850a;

    public GetIdListener(TaskCompletionSource taskCompletionSource) {
        this.f20850a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.StateListener
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.StateListener
    public final boolean b(PersistedInstallationEntry persistedInstallationEntry) {
        if (persistedInstallationEntry.f() != PersistedInstallation.RegistrationStatus.Z && persistedInstallationEntry.f() != PersistedInstallation.RegistrationStatus.e0 && persistedInstallationEntry.f() != PersistedInstallation.RegistrationStatus.f0) {
            return false;
        }
        this.f20850a.trySetResult(persistedInstallationEntry.c());
        return true;
    }
}

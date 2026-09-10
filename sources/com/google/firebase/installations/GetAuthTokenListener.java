package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;

/* JADX INFO: loaded from: classes4.dex */
class GetAuthTokenListener implements StateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Utils f20848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f20849b;

    public GetAuthTokenListener(Utils utils, TaskCompletionSource taskCompletionSource) {
        this.f20848a = utils;
        this.f20849b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.StateListener
    public final boolean a(Exception exc) {
        this.f20849b.trySetException(exc);
        return true;
    }

    @Override // com.google.firebase.installations.StateListener
    public final boolean b(PersistedInstallationEntry persistedInstallationEntry) {
        if (persistedInstallationEntry.f() != PersistedInstallation.RegistrationStatus.e0 || this.f20848a.a(persistedInstallationEntry)) {
            return false;
        }
        AutoValue_InstallationTokenResult.Builder builder = new AutoValue_InstallationTokenResult.Builder();
        String strA = persistedInstallationEntry.a();
        if (strA == null) {
            throw new NullPointerException("Null token");
        }
        builder.f20834a = strA;
        builder.f20835b = Long.valueOf(persistedInstallationEntry.b());
        builder.f20836c = Long.valueOf(persistedInstallationEntry.g());
        String strM = builder.f20834a == null ? " token" : "";
        if (builder.f20835b == null) {
            strM = strM.concat(" tokenExpirationTimestamp");
        }
        if (builder.f20836c == null) {
            strM = android.support.v4.media.a.m(strM, " tokenCreationTimestamp");
        }
        if (!strM.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strM));
        }
        this.f20849b.setResult(new AutoValue_InstallationTokenResult(builder.f20834a, builder.f20835b.longValue(), builder.f20836c.longValue()));
        return true;
    }
}

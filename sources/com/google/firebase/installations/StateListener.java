package com.google.firebase.installations;

import com.google.firebase.installations.local.PersistedInstallationEntry;

/* JADX INFO: loaded from: classes4.dex */
interface StateListener {
    boolean a(Exception exc);

    boolean b(PersistedInstallationEntry persistedInstallationEntry);
}

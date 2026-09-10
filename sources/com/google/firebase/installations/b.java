package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ FirebaseInstallations f20857Y;

    public /* synthetic */ b(FirebaseInstallations firebaseInstallations, int i2) {
        this.X = i2;
        this.f20857Y = firebaseInstallations;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PersistedInstallationEntry persistedInstallationEntryC;
        PersistedInstallationEntry persistedInstallationEntryF;
        switch (this.X) {
            case 0:
                FirebaseInstallations firebaseInstallations = this.f20857Y;
                Object obj = FirebaseInstallations.m;
                firebaseInstallations.getClass();
                Object obj2 = FirebaseInstallations.m;
                synchronized (obj2) {
                    try {
                        FirebaseApp firebaseApp = firebaseInstallations.f20839a;
                        firebaseApp.a();
                        CrossProcessLock crossProcessLockA = CrossProcessLock.a(firebaseApp.f20145a);
                        try {
                            persistedInstallationEntryC = firebaseInstallations.f20841c.c();
                            if (crossProcessLockA != null) {
                                crossProcessLockA.b();
                            }
                        } catch (Throwable th) {
                            if (crossProcessLockA != null) {
                                crossProcessLockA.b();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    if (persistedInstallationEntryC.f() == PersistedInstallation.RegistrationStatus.f0) {
                        persistedInstallationEntryF = firebaseInstallations.f(persistedInstallationEntryC);
                    } else {
                        if (persistedInstallationEntryC.f() == PersistedInstallation.RegistrationStatus.Z) {
                            persistedInstallationEntryF = firebaseInstallations.f(persistedInstallationEntryC);
                        } else if (!firebaseInstallations.d.a(persistedInstallationEntryC)) {
                            return;
                        } else {
                            persistedInstallationEntryF = firebaseInstallations.b(persistedInstallationEntryC);
                        }
                    }
                    synchronized (obj2) {
                        try {
                            FirebaseApp firebaseApp2 = firebaseInstallations.f20839a;
                            firebaseApp2.a();
                            CrossProcessLock crossProcessLockA2 = CrossProcessLock.a(firebaseApp2.f20145a);
                            try {
                                firebaseInstallations.f20841c.b(persistedInstallationEntryF);
                                if (crossProcessLockA2 != null) {
                                    crossProcessLockA2.b();
                                }
                            } catch (Throwable th3) {
                                if (crossProcessLockA2 != null) {
                                    crossProcessLockA2.b();
                                }
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    synchronized (firebaseInstallations) {
                        if (firebaseInstallations.k.size() != 0 && !TextUtils.equals(persistedInstallationEntryC.c(), persistedInstallationEntryF.c())) {
                            Iterator it = firebaseInstallations.k.iterator();
                            while (it.hasNext()) {
                                ((FidListener) it.next()).a();
                            }
                        }
                    }
                    if (persistedInstallationEntryF.f() == PersistedInstallation.RegistrationStatus.e0) {
                        String strC = persistedInstallationEntryF.c();
                        synchronized (firebaseInstallations) {
                            firebaseInstallations.j = strC;
                        }
                    }
                    if (persistedInstallationEntryF.f() == PersistedInstallation.RegistrationStatus.f0) {
                        firebaseInstallations.g(new FirebaseInstallationsException());
                        return;
                    } else if (persistedInstallationEntryF.f() == PersistedInstallation.RegistrationStatus.f20872Y || persistedInstallationEntryF.f() == PersistedInstallation.RegistrationStatus.X) {
                        firebaseInstallations.g(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        firebaseInstallations.h(persistedInstallationEntryF);
                        return;
                    }
                } catch (FirebaseInstallationsException e2) {
                    firebaseInstallations.g(e2);
                    return;
                }
            case 1:
                Object obj3 = FirebaseInstallations.m;
                this.f20857Y.a();
                return;
            default:
                Object obj4 = FirebaseInstallations.m;
                this.f20857Y.a();
                return;
        }
    }
}

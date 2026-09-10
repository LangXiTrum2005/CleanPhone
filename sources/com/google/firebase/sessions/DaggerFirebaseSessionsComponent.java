package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.dagger.internal.InstanceFactory;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class DaggerFirebaseSessionsComponent {

    public static final class Builder implements FirebaseSessionsComponent.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f21044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CoroutineContext f21045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CoroutineContext f21046c;
        public FirebaseApp d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public FirebaseInstallationsApi f21047e;
        public Provider f;
    }

    public static final class FirebaseSessionsComponentImpl implements FirebaseSessionsComponent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InstanceFactory f21048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InstanceFactory f21049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public com.google.firebase.sessions.dagger.internal.Provider f21050c;
        public com.google.firebase.sessions.dagger.internal.Provider d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public InstanceFactory f21051e;
        public com.google.firebase.sessions.dagger.internal.Provider f;
        public InstanceFactory g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public com.google.firebase.sessions.dagger.internal.Provider f21052h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public InstanceFactory f21053i;
        public com.google.firebase.sessions.dagger.internal.Provider j;
        public com.google.firebase.sessions.dagger.internal.Provider k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public com.google.firebase.sessions.dagger.internal.Provider f21054l;
        public com.google.firebase.sessions.dagger.internal.Provider m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public com.google.firebase.sessions.dagger.internal.Provider f21055n;
        public com.google.firebase.sessions.dagger.internal.Provider o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public com.google.firebase.sessions.dagger.internal.Provider f21056p;
        public com.google.firebase.sessions.dagger.internal.Provider q;
        public com.google.firebase.sessions.dagger.internal.Provider r;
        public com.google.firebase.sessions.dagger.internal.Provider s;
        public com.google.firebase.sessions.dagger.internal.Provider t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public com.google.firebase.sessions.dagger.internal.Provider f21057u;
        public com.google.firebase.sessions.dagger.internal.Provider v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public com.google.firebase.sessions.dagger.internal.Provider f21058w;

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent
        public final SharedSessionRepository a() {
            return (SharedSessionRepository) this.f21057u.get();
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent
        public final FirebaseSessions b() {
            return (FirebaseSessions) this.f21058w.get();
        }
    }
}

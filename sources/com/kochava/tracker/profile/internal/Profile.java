package com.kochava.tracker.profile.internal;

import android.content.Context;
import com.kochava.core.json.internal.JsonArray;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.storage.prefs.internal.StoragePrefs;
import com.kochava.core.task.manager.internal.TaskManagerApi;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.attribution.internal.InstallAttributionResponse;
import com.kochava.tracker.install.internal.LastInstall;
import com.kochava.tracker.payload.internal.PayloadQueue;

/* JADX INFO: loaded from: classes5.dex */
public final class Profile extends com.kochava.core.profile.internal.Profile implements ProfileApi {
    public static final Object v0 = new Object();
    public final long i0;
    public ProfileMain j0;
    public ProfileInit k0;
    public ProfileInstall l0;
    public ProfileSession m0;
    public ProfileEngagement n0;
    public ProfilePrivacy o0;
    public PayloadQueue p0;
    public PayloadQueue q0;
    public PayloadQueue r0;
    public PayloadQueue s0;
    public PayloadQueue t0;
    public PayloadQueue u0;

    public Profile(Context context, TaskManagerApi taskManagerApi, long j) {
        super(context, taskManagerApi);
        this.i0 = j;
    }

    @Override // com.kochava.core.profile.internal.Profile
    public final void e() {
        Context context = this.X;
        StoragePrefs storagePrefs = new StoragePrefs(context.getSharedPreferences(BuildConfig.PROFILE_NAME, 0), this.f28053Y);
        PayloadQueue payloadQueue = new PayloadQueue(this.X, this.f28053Y, BuildConfig.PROFILE_EVENTS_QUEUE_NAME);
        PayloadQueue payloadQueue2 = new PayloadQueue(this.X, this.f28053Y, BuildConfig.PROFILE_UPDATES_QUEUE_NAME);
        PayloadQueue payloadQueue3 = new PayloadQueue(this.X, this.f28053Y, BuildConfig.PROFILE_IDENTITYLINK_QUEUE_NAME);
        PayloadQueue payloadQueue4 = new PayloadQueue(this.X, this.f28053Y, BuildConfig.PROFILE_TOKEN_QUEUE_NAME);
        PayloadQueue payloadQueue5 = new PayloadQueue(this.X, this.f28053Y, BuildConfig.PROFILE_SESSION_QUEUE_NAME);
        PayloadQueue payloadQueue6 = new PayloadQueue(this.X, this.f28053Y, BuildConfig.PROFILE_CLICKS_QUEUE_NAME);
        long j = this.i0;
        this.j0 = new ProfileMain(storagePrefs, j);
        this.k0 = new ProfileInit(storagePrefs, j);
        ProfileInstall profileInstall = new ProfileInstall(storagePrefs);
        profileInstall.f28288b = null;
        profileInstall.f28289c = new LastInstall();
        profileInstall.d = 0L;
        profileInstall.f28290e = 0L;
        profileInstall.f = false;
        profileInstall.g = JsonObject.w();
        profileInstall.f28291h = false;
        profileInstall.f28292i = JsonObject.w();
        profileInstall.j = JsonObject.w();
        profileInstall.k = new InstallAttributionResponse();
        profileInstall.f28293l = null;
        profileInstall.m = null;
        profileInstall.f28294n = null;
        profileInstall.o = null;
        this.l0 = profileInstall;
        ProfileSession profileSession = new ProfileSession(storagePrefs);
        profileSession.f28309b = null;
        profileSession.f28310c = 0L;
        profileSession.d = 0L;
        profileSession.f28311e = false;
        profileSession.f = 0L;
        profileSession.g = 0;
        this.m0 = profileSession;
        ProfileEngagement profileEngagement = new ProfileEngagement(storagePrefs);
        profileEngagement.f28281b = false;
        profileEngagement.f28282c = JsonObject.w();
        profileEngagement.d = null;
        profileEngagement.f28283e = true;
        profileEngagement.f = 0L;
        profileEngagement.g = JsonArray.g();
        this.n0 = profileEngagement;
        this.o0 = new ProfilePrivacy(storagePrefs, this.i0);
        synchronized (v0) {
            try {
                this.p0 = payloadQueue;
                this.q0 = payloadQueue2;
                this.r0 = payloadQueue3;
                this.s0 = payloadQueue4;
                this.t0 = payloadQueue5;
                this.u0 = payloadQueue6;
                this.j0.a();
                this.k0.a();
                this.l0.a();
                this.m0.a();
                this.n0.a();
                this.o0.a();
                if (this.j0.h()) {
                    ProfileMigration.b(this.X, this.i0, this.j0, this.l0, this.n0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final PayloadQueue g() {
        PayloadQueue payloadQueue;
        f(5000L);
        synchronized (v0) {
            payloadQueue = this.u0;
        }
        return payloadQueue;
    }

    public final ProfileEngagement h() {
        ProfileEngagement profileEngagement;
        f(5000L);
        synchronized (v0) {
            profileEngagement = this.n0;
        }
        return profileEngagement;
    }

    public final PayloadQueue i() {
        PayloadQueue payloadQueue;
        f(5000L);
        synchronized (v0) {
            payloadQueue = this.p0;
        }
        return payloadQueue;
    }

    public final PayloadQueue j() {
        PayloadQueue payloadQueue;
        f(5000L);
        synchronized (v0) {
            payloadQueue = this.r0;
        }
        return payloadQueue;
    }

    public final ProfileInit k() {
        ProfileInit profileInit;
        f(5000L);
        synchronized (v0) {
            profileInit = this.k0;
        }
        return profileInit;
    }

    public final ProfileInstall l() {
        ProfileInstall profileInstall;
        f(5000L);
        synchronized (v0) {
            profileInstall = this.l0;
        }
        return profileInstall;
    }

    public final ProfileMain m() {
        ProfileMain profileMain;
        f(5000L);
        synchronized (v0) {
            profileMain = this.j0;
        }
        return profileMain;
    }

    public final ProfilePrivacy n() {
        ProfilePrivacy profilePrivacy;
        f(5000L);
        synchronized (v0) {
            profilePrivacy = this.o0;
        }
        return profilePrivacy;
    }

    public final ProfileSession o() {
        ProfileSession profileSession;
        f(5000L);
        synchronized (v0) {
            profileSession = this.m0;
        }
        return profileSession;
    }

    public final PayloadQueue p() {
        PayloadQueue payloadQueue;
        f(5000L);
        synchronized (v0) {
            payloadQueue = this.t0;
        }
        return payloadQueue;
    }

    public final PayloadQueue q() {
        PayloadQueue payloadQueue;
        f(5000L);
        synchronized (v0) {
            payloadQueue = this.s0;
        }
        return payloadQueue;
    }

    public final PayloadQueue r() {
        PayloadQueue payloadQueue;
        f(5000L);
        synchronized (v0) {
            payloadQueue = this.q0;
        }
        return payloadQueue;
    }
}

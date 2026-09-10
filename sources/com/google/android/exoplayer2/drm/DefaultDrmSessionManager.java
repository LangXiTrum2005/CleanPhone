package com.google.android.exoplayer2.drm;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultDrmSessionManager implements DrmSessionManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ExoMediaDrm f17464c;
    public DefaultDrmSession d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DefaultDrmSession f17465e;
    public Looper f;
    public Handler g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PlayerId f17466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile MediaDrmHandler f17467i;

    public static final class Builder {
        public Builder() {
            new HashMap();
            UUID uuid = C.d;
        }
    }

    public class MediaDrmEventListener implements ExoMediaDrm.OnEventListener {
        public MediaDrmEventListener() {
        }
    }

    public class MediaDrmHandler extends Handler {
        public MediaDrmHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (((byte[]) message.obj) == null) {
                return;
            }
            DefaultDrmSessionManager.this.getClass();
            throw null;
        }
    }

    public static final class MissingSchemeDataException extends Exception {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public class PreacquiredSessionReference implements DrmSessionManager.DrmSessionReference {
        public final DrmSessionEventListener.EventDispatcher X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public DrmSession f17470Y;
        public boolean Z;

        public PreacquiredSessionReference(DrmSessionEventListener.EventDispatcher eventDispatcher) {
            this.X = eventDispatcher;
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference
        public final void release() {
            Handler handler = DefaultDrmSessionManager.this.g;
            handler.getClass();
            final int i2 = 0;
            Util.E(handler, new Runnable() { // from class: com.google.android.exoplayer2.drm.a
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            DefaultDrmSessionManager.PreacquiredSessionReference preacquiredSessionReference = (DefaultDrmSessionManager.PreacquiredSessionReference) this;
                            if (preacquiredSessionReference.Z) {
                                return;
                            }
                            DrmSession drmSession = preacquiredSessionReference.f17470Y;
                            if (drmSession != null) {
                                drmSession.f(preacquiredSessionReference.X);
                            }
                            DefaultDrmSessionManager.this.getClass();
                            throw null;
                        default:
                            ((DefaultDrmSession) this).f(null);
                            return;
                    }
                }
            });
        }
    }

    public class ProvisioningManagerImpl implements DefaultDrmSession.ProvisioningManager {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DefaultDrmSession f17471a;

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
        public final void a(Exception exc, boolean z2) {
            this.f17471a = null;
            ImmutableList.u(null);
            throw null;
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
        public final void b(DefaultDrmSession defaultDrmSession) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
        public final void onProvisionCompleted() {
            this.f17471a = null;
            ImmutableList.u(null);
            throw null;
        }
    }

    public class ReferenceCountListenerImpl implements DefaultDrmSession.ReferenceCountListener {
        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ReferenceCountListener
        public final void a(DefaultDrmSession defaultDrmSession, int i2) {
            if (i2 == 1) {
                throw null;
            }
            if (i2 != 0) {
                throw null;
            }
            throw null;
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ReferenceCountListener
        public final void b(DefaultDrmSession defaultDrmSession) {
            throw null;
        }
    }

    public static boolean f(DrmSession drmSession) {
        DefaultDrmSession defaultDrmSession = (DefaultDrmSession) drmSession;
        defaultDrmSession.l();
        if (defaultDrmSession.o != 1) {
            return false;
        }
        if (Util.f18979a >= 19) {
            DrmSession.DrmSessionException error = defaultDrmSession.getError();
            error.getClass();
            if (!(error.getCause() instanceof ResourceBusyException)) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList g(DrmInitData drmInitData, UUID uuid, boolean z2) {
        ArrayList arrayList = new ArrayList(drmInitData.e0);
        for (int i2 = 0; i2 < drmInitData.e0; i2++) {
            DrmInitData.SchemeData schemeData = drmInitData.X[i2];
            if ((schemeData.a(uuid) || (C.f16999c.equals(uuid) && schemeData.a(C.f16998b))) && (schemeData.f0 != null || z2)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public final int a(Format format) {
        String str;
        h(false);
        ExoMediaDrm exoMediaDrm = this.f17464c;
        exoMediaDrm.getClass();
        int iA = exoMediaDrm.a();
        DrmInitData drmInitData = format.p0;
        if (drmInitData == null) {
            MimeTypes.f(format.m0);
            throw null;
        }
        if (!g(drmInitData, null, true).isEmpty()) {
            str = drmInitData.Z;
            if (str != null || "cenc".equals(str) || (!"cbcs".equals(str) ? !("cbc1".equals(str) || "cens".equals(str)) : Util.f18979a >= 25)) {
                return iA;
            }
        } else if (drmInitData.e0 == 1 && drmInitData.X[0].a(C.f16998b)) {
            Log.g("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + ((Object) null));
            str = drmInitData.Z;
            if (str != null) {
            }
            return iA;
        }
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public final void b(Looper looper, PlayerId playerId) {
        synchronized (this) {
            try {
                Looper looper2 = this.f;
                if (looper2 == null) {
                    this.f = looper;
                    this.g = new Handler(looper);
                } else {
                    Assertions.d(looper2 == looper);
                    this.g.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f17466h = playerId;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public final DrmSession c(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
        h(false);
        Assertions.d(this.f17463b > 0);
        Assertions.e(this.f);
        return e(this.f, eventDispatcher, format, true);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public final DrmSessionManager.DrmSessionReference d(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
        Assertions.d(this.f17463b > 0);
        Assertions.e(this.f);
        PreacquiredSessionReference preacquiredSessionReference = new PreacquiredSessionReference(eventDispatcher);
        Handler handler = this.g;
        handler.getClass();
        handler.post(new b(3, preacquiredSessionReference, format));
        return preacquiredSessionReference;
    }

    public final DrmSession e(Looper looper, DrmSessionEventListener.EventDispatcher eventDispatcher, Format format, boolean z2) {
        if (this.f17467i == null) {
            this.f17467i = new MediaDrmHandler(looper);
        }
        DrmInitData drmInitData = format.p0;
        if (drmInitData == null) {
            MimeTypes.f(format.m0);
            ExoMediaDrm exoMediaDrm = this.f17464c;
            exoMediaDrm.getClass();
            if (exoMediaDrm.a() == 2 && FrameworkCryptoConfig.d) {
                return null;
            }
            throw null;
        }
        ArrayList arrayListG = g(drmInitData, null, false);
        if (arrayListG.isEmpty()) {
            MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException("Media does not support uuid: " + ((Object) null));
            Log.d("DefaultDrmSessionMgr", "DRM error", missingSchemeDataException);
            eventDispatcher.e(missingSchemeDataException);
            return new ErrorStateDrmSession(new DrmSession.DrmSessionException(missingSchemeDataException, 6003));
        }
        DefaultDrmSession defaultDrmSession = this.f17465e;
        if (defaultDrmSession != null) {
            defaultDrmSession.e(eventDispatcher);
            return defaultDrmSession;
        }
        this.f17464c.getClass();
        ExoMediaDrm exoMediaDrm2 = this.f17464c;
        Looper looper2 = this.f;
        looper2.getClass();
        PlayerId playerId = this.f17466h;
        playerId.getClass();
        DefaultDrmSession defaultDrmSession2 = new DefaultDrmSession(null, exoMediaDrm2, null, null, arrayListG, false, false, null, null, null, looper2, null, playerId);
        defaultDrmSession2.e(eventDispatcher);
        if (0 != -9223372036854775807L) {
            defaultDrmSession2.e(null);
        }
        if (f(defaultDrmSession2)) {
            throw null;
        }
        if (f(defaultDrmSession2) && z2) {
            throw null;
        }
        this.f17465e = defaultDrmSession2;
        throw null;
    }

    public final void h(boolean z2) {
        if (z2 && this.f == null) {
            Log.h("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            Log.h("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public final void prepare() {
        h(true);
        int i2 = this.f17463b;
        this.f17463b = i2 + 1;
        if (i2 != 0) {
            return;
        }
        if (this.f17464c == null) {
            throw null;
        }
        if (0 != -9223372036854775807L) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public final void release() {
        h(true);
        int i2 = this.f17463b - 1;
        this.f17463b = i2;
        if (i2 != 0) {
            return;
        }
        if (0 != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList((Collection) null);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((DefaultDrmSession) arrayList.get(i3)).f(null);
            }
        }
        UnmodifiableIterator it = ImmutableSet.u(null).iterator();
        while (it.hasNext()) {
            ((PreacquiredSessionReference) it.next()).release();
        }
        if (this.f17464c != null && this.f17463b == 0) {
            throw null;
        }
    }
}

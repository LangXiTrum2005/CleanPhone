package com.google.android.exoplayer2.drm;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.CopyOnWriteMultiset;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
class DefaultDrmSession implements DrmSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExoMediaDrm f17447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProvisioningManager f17448c;
    public final ReferenceCountListener d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17449e;
    public final boolean f;
    public final HashMap g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CopyOnWriteMultiset f17450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DefaultLoadErrorHandlingPolicy f17451i;
    public final PlayerId j;
    public final HttpMediaDrmCallback k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final UUID f17452l;
    public final Looper m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ResponseHandler f17453n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f17454p;
    public HandlerThread q;
    public RequestHandler r;
    public CryptoConfig s;
    public DrmSession.DrmSessionException t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte[] f17455u;
    public byte[] v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ExoMediaDrm.KeyRequest f17456w;
    public ExoMediaDrm.ProvisionRequest x;

    public interface ProvisioningManager {
        void a(Exception exc, boolean z2);

        void b(DefaultDrmSession defaultDrmSession);

        void onProvisionCompleted();
    }

    public interface ReferenceCountListener {
        void a(DefaultDrmSession defaultDrmSession, int i2);

        void b(DefaultDrmSession defaultDrmSession);
    }

    public class RequestHandler extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f17457a;

        public RequestHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object objC;
            RequestTask requestTask = (RequestTask) message.obj;
            try {
                int i2 = message.what;
                if (i2 == 0) {
                    objC = DefaultDrmSession.this.k.c((ExoMediaDrm.ProvisionRequest) requestTask.f17461c);
                } else {
                    if (i2 != 1) {
                        throw new RuntimeException();
                    }
                    DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                    objC = defaultDrmSession.k.a(defaultDrmSession.f17452l, (ExoMediaDrm.KeyRequest) requestTask.f17461c);
                }
            } catch (MediaDrmCallbackException e2) {
                RequestTask requestTask2 = (RequestTask) message.obj;
                if (requestTask2.f17460b) {
                    int i3 = requestTask2.d + 1;
                    requestTask2.d = i3;
                    DefaultDrmSession.this.f17451i.getClass();
                    if (i3 <= 3) {
                        SystemClock.elapsedRealtime();
                        SystemClock.elapsedRealtime();
                        long jB = DefaultDrmSession.this.f17451i.b(new LoadErrorHandlingPolicy.LoadErrorInfo(e2.getCause() instanceof IOException ? (IOException) e2.getCause() : new UnexpectedDrmSessionException(e2.getCause()), requestTask2.d));
                        if (jB != -9223372036854775807L) {
                            synchronized (this) {
                                try {
                                    if (!this.f17457a) {
                                        sendMessageDelayed(Message.obtain(message), jB);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }
                }
                objC = e2;
            } catch (Exception e3) {
                Log.h("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e3);
                objC = e3;
            }
            DefaultLoadErrorHandlingPolicy defaultLoadErrorHandlingPolicy = DefaultDrmSession.this.f17451i;
            long j = requestTask.f17459a;
            defaultLoadErrorHandlingPolicy.getClass();
            synchronized (this) {
                try {
                    if (!this.f17457a) {
                        DefaultDrmSession.this.f17453n.obtainMessage(message.what, Pair.create(requestTask.f17461c, objC)).sendToTarget();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static final class RequestTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f17459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f17460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f17461c;
        public int d;

        public RequestTask(long j, boolean z2, long j2, Object obj) {
            this.f17459a = j;
            this.f17460b = z2;
            this.f17461c = obj;
        }
    }

    public class ResponseHandler extends Handler {
        public ResponseHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Set set;
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i2 = message.what;
            if (i2 == 0) {
                DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                if (obj == defaultDrmSession.x) {
                    if (defaultDrmSession.o == 2 || defaultDrmSession.h()) {
                        defaultDrmSession.x = null;
                        boolean z2 = obj2 instanceof Exception;
                        ProvisioningManager provisioningManager = defaultDrmSession.f17448c;
                        if (z2) {
                            provisioningManager.a((Exception) obj2, false);
                            return;
                        }
                        try {
                            defaultDrmSession.f17447b.provideProvisionResponse((byte[]) obj2);
                            provisioningManager.onProvisionCompleted();
                            return;
                        } catch (Exception e2) {
                            provisioningManager.a(e2, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (i2 != 1) {
                return;
            }
            DefaultDrmSession defaultDrmSession2 = DefaultDrmSession.this;
            if (obj == defaultDrmSession2.f17456w && defaultDrmSession2.h()) {
                defaultDrmSession2.f17456w = null;
                if (obj2 instanceof Exception) {
                    defaultDrmSession2.j((Exception) obj2, false);
                    return;
                }
                try {
                    byte[] bArrProvideKeyResponse = defaultDrmSession2.f17447b.provideKeyResponse(defaultDrmSession2.f17455u, (byte[]) obj2);
                    if (defaultDrmSession2.v != null && bArrProvideKeyResponse != null && bArrProvideKeyResponse.length != 0) {
                        defaultDrmSession2.v = bArrProvideKeyResponse;
                    }
                    defaultDrmSession2.o = 4;
                    CopyOnWriteMultiset copyOnWriteMultiset = defaultDrmSession2.f17450h;
                    synchronized (copyOnWriteMultiset.X) {
                        set = copyOnWriteMultiset.Z;
                    }
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((DrmSessionEventListener.EventDispatcher) it.next()).b();
                    }
                } catch (Exception e3) {
                    defaultDrmSession2.j(e3, true);
                }
            }
        }
    }

    public static final class UnexpectedDrmSessionException extends IOException {
    }

    public DefaultDrmSession(UUID uuid, ExoMediaDrm exoMediaDrm, ProvisioningManager provisioningManager, ReferenceCountListener referenceCountListener, List list, boolean z2, boolean z3, byte[] bArr, HashMap map, HttpMediaDrmCallback httpMediaDrmCallback, Looper looper, DefaultLoadErrorHandlingPolicy defaultLoadErrorHandlingPolicy, PlayerId playerId) {
        this.f17452l = uuid;
        this.f17448c = provisioningManager;
        this.d = referenceCountListener;
        this.f17447b = exoMediaDrm;
        this.f17449e = z2;
        this.f = z3;
        if (bArr != null) {
            this.v = bArr;
            this.f17446a = null;
        } else {
            list.getClass();
            this.f17446a = Collections.unmodifiableList(list);
        }
        this.g = map;
        this.k = httpMediaDrmCallback;
        this.f17450h = new CopyOnWriteMultiset();
        this.f17451i = defaultLoadErrorHandlingPolicy;
        this.j = playerId;
        this.o = 2;
        this.m = looper;
        this.f17453n = new ResponseHandler(looper);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID a() {
        l();
        return this.f17452l;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final boolean b() {
        l();
        return this.f17449e;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final CryptoConfig c() {
        l();
        return this.s;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final boolean d(String str) {
        l();
        byte[] bArr = this.f17455u;
        Assertions.e(bArr);
        return this.f17447b.d(str, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0119  */
    /* JADX WARN: Code duplicated, block: B:64:0x011f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0127  */
    /* JADX WARN: Code duplicated, block: B:67:0x0129  */
    /* JADX WARN: Code duplicated, block: B:70:0x0132  */
    /* JADX WARN: Code duplicated, block: B:73:0x0143 A[Catch: NumberFormatException -> 0x0148, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0148, blocks: (B:71:0x013b, B:73:0x0143), top: B:109:0x013b }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0148  */
    /* JADX WARN: Code duplicated, block: B:79:0x0157 A[Catch: NumberFormatException -> 0x015b, TRY_LEAVE, TryCatch #7 {NumberFormatException -> 0x015b, blocks: (B:77:0x014f, B:79:0x0157), top: B:119:0x014f }] */
    /* JADX WARN: Code duplicated, block: B:84:0x017f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0196  */
    /* JADX WARN: Code duplicated, block: B:87:0x019c  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b9 A[LOOP:0: B:93:0x01b3->B:95:0x01b9, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:84:0x017f, please report this as an issue */
    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final void e(DrmSessionEventListener.EventDispatcher eventDispatcher) {
        Set set;
        byte[] bArr;
        Pair pair;
        Map mapQueryKeyStatus;
        long jMin;
        long j;
        long j2;
        String str;
        String str2;
        CopyOnWriteMultiset copyOnWriteMultiset;
        Iterator it;
        l();
        boolean z2 = false;
        if (this.f17454p < 0) {
            Log.c("DefaultDrmSession", "Session reference count less than zero: " + this.f17454p);
            this.f17454p = 0;
        }
        if (eventDispatcher != null) {
            CopyOnWriteMultiset copyOnWriteMultiset2 = this.f17450h;
            synchronized (copyOnWriteMultiset2.X) {
                try {
                    ArrayList arrayList = new ArrayList(copyOnWriteMultiset2.e0);
                    arrayList.add(eventDispatcher);
                    copyOnWriteMultiset2.e0 = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) copyOnWriteMultiset2.f18900Y.get(eventDispatcher);
                    if (num == null) {
                        HashSet hashSet = new HashSet(copyOnWriteMultiset2.Z);
                        hashSet.add(eventDispatcher);
                        copyOnWriteMultiset2.Z = Collections.unmodifiableSet(hashSet);
                    }
                    copyOnWriteMultiset2.f18900Y.put(eventDispatcher, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i2 = this.f17454p + 1;
        this.f17454p = i2;
        if (i2 == 1) {
            Assertions.d(this.o == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.q = handlerThread;
            handlerThread.start();
            this.r = new RequestHandler(this.q.getLooper());
            if (!h()) {
                try {
                    byte[] bArrOpenSession = this.f17447b.openSession();
                    this.f17455u = bArrOpenSession;
                    this.f17447b.e(bArrOpenSession, this.j);
                    this.s = this.f17447b.b(this.f17455u);
                    this.o = 3;
                    CopyOnWriteMultiset copyOnWriteMultiset3 = this.f17450h;
                    synchronized (copyOnWriteMultiset3.X) {
                        set = copyOnWriteMultiset3.Z;
                    }
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        ((DrmSessionEventListener.EventDispatcher) it2.next()).d(3);
                    }
                    this.f17455u.getClass();
                } catch (NotProvisionedException unused) {
                    this.f17448c.b(this);
                } catch (Exception e2) {
                    i(e2, 1);
                }
            }
            z2 = true;
            if (z2 && !this.f) {
                byte[] bArr2 = this.f17455u;
                int i3 = Util.f18979a;
                byte[] bArr3 = this.v;
                if (bArr3 == null) {
                    k(bArr2, 1, true);
                } else if (this.o != 4) {
                    try {
                        this.f17447b.restoreKeys(bArr2, bArr3);
                        if (C.d.equals(this.f17452l)) {
                            l();
                            bArr = this.f17455u;
                            pair = null;
                            if (bArr == null) {
                                mapQueryKeyStatus = null;
                            } else {
                                mapQueryKeyStatus = this.f17447b.queryKeyStatus(bArr);
                            }
                            if (mapQueryKeyStatus != null) {
                                j = -9223372036854775807L;
                                try {
                                    str2 = (String) mapQueryKeyStatus.get("LicenseDurationRemaining");
                                    if (str2 != null) {
                                        j2 = Long.parseLong(str2);
                                    } else {
                                        j2 = -9223372036854775807L;
                                    }
                                } catch (NumberFormatException unused2) {
                                }
                                Long lValueOf = Long.valueOf(j2);
                                try {
                                    str = (String) mapQueryKeyStatus.get("PlaybackDurationRemaining");
                                    if (str != null) {
                                        j = Long.parseLong(str);
                                    }
                                } catch (NumberFormatException unused3) {
                                }
                                pair = new Pair(lValueOf, Long.valueOf(j));
                            }
                            pair.getClass();
                            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
                        } else {
                            jMin = Long.MAX_VALUE;
                        }
                        if (jMin <= 60) {
                            Log.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMin);
                            k(bArr2, 2, true);
                        } else if (jMin <= 0) {
                            i(new KeysExpiredException(), 2);
                        } else {
                            this.o = 4;
                            copyOnWriteMultiset = this.f17450h;
                            synchronized (copyOnWriteMultiset.X) {
                                Set set2 = copyOnWriteMultiset.Z;
                            }
                            it = set2.iterator();
                            while (it.hasNext()) {
                                ((DrmSessionEventListener.EventDispatcher) it.next()).c();
                            }
                        }
                    } catch (Exception e3) {
                        i(e3, 1);
                    }
                } else {
                    if (C.d.equals(this.f17452l)) {
                        jMin = Long.MAX_VALUE;
                    } else {
                        l();
                        bArr = this.f17455u;
                        pair = null;
                        if (bArr == null) {
                            mapQueryKeyStatus = null;
                        } else {
                            mapQueryKeyStatus = this.f17447b.queryKeyStatus(bArr);
                        }
                        if (mapQueryKeyStatus != null) {
                            j = -9223372036854775807L;
                            str2 = (String) mapQueryKeyStatus.get("LicenseDurationRemaining");
                            if (str2 != null) {
                                j2 = Long.parseLong(str2);
                            } else {
                                j2 = -9223372036854775807L;
                            }
                            Long lValueOf2 = Long.valueOf(j2);
                            str = (String) mapQueryKeyStatus.get("PlaybackDurationRemaining");
                            if (str != null) {
                                j = Long.parseLong(str);
                            }
                            pair = new Pair(lValueOf2, Long.valueOf(j));
                        }
                        pair.getClass();
                        jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
                    }
                    if (jMin <= 60) {
                        Log.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMin);
                        k(bArr2, 2, true);
                    } else if (jMin <= 0) {
                        i(new KeysExpiredException(), 2);
                    } else {
                        this.o = 4;
                        copyOnWriteMultiset = this.f17450h;
                        synchronized (copyOnWriteMultiset.X) {
                            Set set3 = copyOnWriteMultiset.Z;
                            it = set3.iterator();
                            while (it.hasNext()) {
                                ((DrmSessionEventListener.EventDispatcher) it.next()).c();
                            }
                        }
                    }
                }
            }
        } else if (eventDispatcher != null && h() && this.f17450h.a(eventDispatcher) == 1) {
            eventDispatcher.d(this.o);
        }
        this.d.b(this);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final void f(DrmSessionEventListener.EventDispatcher eventDispatcher) {
        l();
        int i2 = this.f17454p;
        if (i2 <= 0) {
            Log.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i3 = i2 - 1;
        this.f17454p = i3;
        if (i3 == 0) {
            this.o = 0;
            ResponseHandler responseHandler = this.f17453n;
            int i4 = Util.f18979a;
            responseHandler.removeCallbacksAndMessages(null);
            RequestHandler requestHandler = this.r;
            synchronized (requestHandler) {
                requestHandler.removeCallbacksAndMessages(null);
                requestHandler.f17457a = true;
            }
            this.r = null;
            this.q.quit();
            this.q = null;
            this.s = null;
            this.t = null;
            this.f17456w = null;
            this.x = null;
            byte[] bArr = this.f17455u;
            if (bArr != null) {
                this.f17447b.closeSession(bArr);
                this.f17455u = null;
            }
        }
        if (eventDispatcher != null) {
            CopyOnWriteMultiset copyOnWriteMultiset = this.f17450h;
            synchronized (copyOnWriteMultiset.X) {
                try {
                    Integer num = (Integer) copyOnWriteMultiset.f18900Y.get(eventDispatcher);
                    if (num != null) {
                        ArrayList arrayList = new ArrayList(copyOnWriteMultiset.e0);
                        arrayList.remove(eventDispatcher);
                        copyOnWriteMultiset.e0 = Collections.unmodifiableList(arrayList);
                        if (num.intValue() == 1) {
                            copyOnWriteMultiset.f18900Y.remove(eventDispatcher);
                            HashSet hashSet = new HashSet(copyOnWriteMultiset.Z);
                            hashSet.remove(eventDispatcher);
                            copyOnWriteMultiset.Z = Collections.unmodifiableSet(hashSet);
                        } else {
                            copyOnWriteMultiset.f18900Y.put(eventDispatcher, Integer.valueOf(num.intValue() - 1));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f17450h.a(eventDispatcher) == 0) {
                eventDispatcher.f();
            }
        }
        this.d.a(this, this.f17454p);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final DrmSession.DrmSessionException getError() {
        l();
        if (this.o == 1) {
            return this.t;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        l();
        return this.o;
    }

    public final boolean h() {
        int i2 = this.o;
        return i2 == 3 || i2 == 4;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    public final void i(Exception exc, int i2) {
        int iB;
        Set set;
        int i3 = Util.f18979a;
        if (i3 >= 21 && DrmUtil.Api21.a(exc)) {
            iB = DrmUtil.Api21.b(exc);
        } else if (i3 >= 23 && DrmUtil.Api23.a(exc)) {
            iB = 6006;
        } else if (i3 >= 18 && DrmUtil.Api18.b(exc)) {
            iB = 6002;
        } else if (i3 >= 18 && DrmUtil.Api18.a(exc)) {
            iB = 6007;
        } else if (exc instanceof UnsupportedDrmException) {
            iB = 6001;
        } else if (exc instanceof DefaultDrmSessionManager.MissingSchemeDataException) {
            iB = 6003;
        } else if (exc instanceof KeysExpiredException) {
            iB = 6008;
        } else if (i2 == 1) {
            iB = 6006;
        } else if (i2 == 2) {
            iB = 6004;
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException();
            }
            iB = 6002;
        }
        this.t = new DrmSession.DrmSessionException(exc, iB);
        Log.d("DefaultDrmSession", "DRM session error", exc);
        CopyOnWriteMultiset copyOnWriteMultiset = this.f17450h;
        synchronized (copyOnWriteMultiset.X) {
            set = copyOnWriteMultiset.Z;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((DrmSessionEventListener.EventDispatcher) it.next()).e(exc);
        }
        if (this.o != 4) {
            this.o = 1;
        }
    }

    public final void j(Exception exc, boolean z2) {
        if (exc instanceof NotProvisionedException) {
            this.f17448c.b(this);
        } else {
            i(exc, z2 ? 1 : 2);
        }
    }

    public final void k(byte[] bArr, int i2, boolean z2) {
        try {
            ExoMediaDrm.KeyRequest keyRequestC = this.f17447b.c(bArr, this.f17446a, i2, this.g);
            this.f17456w = keyRequestC;
            RequestHandler requestHandler = this.r;
            int i3 = Util.f18979a;
            keyRequestC.getClass();
            requestHandler.getClass();
            requestHandler.obtainMessage(1, new RequestTask(LoadEventInfo.f18338b.getAndIncrement(), z2, SystemClock.elapsedRealtime(), keyRequestC)).sendToTarget();
        } catch (Exception e2) {
            j(e2, true);
        }
    }

    public final void l() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.m;
        if (threadCurrentThread != looper.getThread()) {
            Log.h("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}

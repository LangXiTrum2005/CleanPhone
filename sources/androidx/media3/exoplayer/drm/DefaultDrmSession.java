package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CopyOnWriteMultiset;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
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

/* JADX INFO: loaded from: classes.dex */
class DefaultDrmSession implements DrmSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExoMediaDrm f6197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProvisioningManager f6198c;
    public final ReferenceCountListener d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6199e;
    public final boolean f;
    public final HashMap g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CopyOnWriteMultiset f6200h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DefaultLoadErrorHandlingPolicy f6201i;
    public final PlayerId j;
    public final HttpMediaDrmCallback k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final UUID f6202l;
    public final Looper m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ResponseHandler f6203n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6204p;
    public HandlerThread q;
    public RequestHandler r;
    public CryptoConfig s;
    public DrmSession.DrmSessionException t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte[] f6205u;
    public byte[] v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ExoMediaDrm.KeyRequest f6206w;
    public ExoMediaDrm.ProvisionRequest x;

    public interface ProvisioningManager {
        void a(Exception exc, boolean z2);

        void b(DefaultDrmSession defaultDrmSession);

        void onProvisionCompleted();
    }

    public interface ReferenceCountListener {
        void a(DefaultDrmSession defaultDrmSession);

        void b(DefaultDrmSession defaultDrmSession, int i2);
    }

    public class RequestHandler extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f6207a;

        public RequestHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object objC;
            RequestTask requestTask = (RequestTask) message.obj;
            try {
                int i2 = message.what;
                if (i2 == 1) {
                    objC = DefaultDrmSession.this.k.c((ExoMediaDrm.ProvisionRequest) requestTask.f6211c);
                } else {
                    if (i2 != 2) {
                        throw new RuntimeException();
                    }
                    DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                    objC = defaultDrmSession.k.a(defaultDrmSession.f6202l, (ExoMediaDrm.KeyRequest) requestTask.f6211c);
                }
            } catch (MediaDrmCallbackException e2) {
                RequestTask requestTask2 = (RequestTask) message.obj;
                if (requestTask2.f6210b) {
                    int i3 = requestTask2.d + 1;
                    requestTask2.d = i3;
                    DefaultDrmSession.this.f6201i.getClass();
                    if (i3 <= 3) {
                        SystemClock.elapsedRealtime();
                        SystemClock.elapsedRealtime();
                        long jB = DefaultDrmSession.this.f6201i.b(new LoadErrorHandlingPolicy.LoadErrorInfo(e2.getCause() instanceof IOException ? (IOException) e2.getCause() : new UnexpectedDrmSessionException(e2.getCause()), requestTask2.d));
                        if (jB != -9223372036854775807L) {
                            synchronized (this) {
                                try {
                                    if (!this.f6207a) {
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
            DefaultLoadErrorHandlingPolicy defaultLoadErrorHandlingPolicy = DefaultDrmSession.this.f6201i;
            long j = requestTask.f6209a;
            defaultLoadErrorHandlingPolicy.getClass();
            synchronized (this) {
                try {
                    if (!this.f6207a) {
                        DefaultDrmSession.this.f6203n.obtainMessage(message.what, Pair.create(requestTask.f6211c, objC)).sendToTarget();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static final class RequestTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f6209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f6210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f6211c;
        public int d;

        public RequestTask(long j, boolean z2, long j2, Object obj) {
            this.f6209a = j;
            this.f6210b = z2;
            this.f6211c = obj;
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
            if (i2 == 1) {
                DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                if (obj == defaultDrmSession.x) {
                    if (defaultDrmSession.o == 2 || defaultDrmSession.h()) {
                        defaultDrmSession.x = null;
                        boolean z2 = obj2 instanceof Exception;
                        ProvisioningManager provisioningManager = defaultDrmSession.f6198c;
                        if (z2) {
                            provisioningManager.a((Exception) obj2, false);
                            return;
                        }
                        try {
                            defaultDrmSession.f6197b.provideProvisionResponse((byte[]) obj2);
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
            if (i2 != 2) {
                return;
            }
            DefaultDrmSession defaultDrmSession2 = DefaultDrmSession.this;
            if (obj == defaultDrmSession2.f6206w && defaultDrmSession2.h()) {
                defaultDrmSession2.f6206w = null;
                if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                    defaultDrmSession2.j(false, (Throwable) obj2);
                    return;
                }
                try {
                    byte[] bArrProvideKeyResponse = defaultDrmSession2.f6197b.provideKeyResponse(defaultDrmSession2.f6205u, (byte[]) obj2);
                    if (defaultDrmSession2.v != null && bArrProvideKeyResponse != null && bArrProvideKeyResponse.length != 0) {
                        defaultDrmSession2.v = bArrProvideKeyResponse;
                    }
                    defaultDrmSession2.o = 4;
                    CopyOnWriteMultiset copyOnWriteMultiset = defaultDrmSession2.f6200h;
                    synchronized (copyOnWriteMultiset.X) {
                        set = copyOnWriteMultiset.Z;
                    }
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((DrmSessionEventListener.EventDispatcher) it.next()).b();
                    }
                } catch (Exception e3) {
                    e = e3;
                    defaultDrmSession2.j(true, e);
                } catch (NoSuchMethodError e4) {
                    e = e4;
                    defaultDrmSession2.j(true, e);
                }
            }
        }
    }

    public static final class UnexpectedDrmSessionException extends IOException {
    }

    public DefaultDrmSession(UUID uuid, ExoMediaDrm exoMediaDrm, ProvisioningManager provisioningManager, ReferenceCountListener referenceCountListener, List list, boolean z2, boolean z3, byte[] bArr, HashMap map, HttpMediaDrmCallback httpMediaDrmCallback, Looper looper, DefaultLoadErrorHandlingPolicy defaultLoadErrorHandlingPolicy, PlayerId playerId) {
        this.f6202l = uuid;
        this.f6198c = provisioningManager;
        this.d = referenceCountListener;
        this.f6197b = exoMediaDrm;
        this.f6199e = z2;
        this.f = z3;
        if (bArr != null) {
            this.v = bArr;
            this.f6196a = null;
        } else {
            list.getClass();
            this.f6196a = Collections.unmodifiableList(list);
        }
        this.g = map;
        this.k = httpMediaDrmCallback;
        this.f6200h = new CopyOnWriteMultiset();
        this.f6201i = defaultLoadErrorHandlingPolicy;
        this.j = playerId;
        this.o = 2;
        this.m = looper;
        this.f6203n = new ResponseHandler(looper);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final UUID a() {
        l();
        return this.f6202l;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean b() {
        l();
        return this.f6199e;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final CryptoConfig c() {
        l();
        return this.s;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean d(String str) {
        l();
        byte[] bArr = this.f6205u;
        Assertions.f(bArr);
        return this.f6197b.d(str, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01cf A[LOOP:0: B:102:0x01c9->B:104:0x01cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:124:0x01c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:70:0x0125  */
    /* JADX WARN: Code duplicated, block: B:72:0x012f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0135  */
    /* JADX WARN: Code duplicated, block: B:75:0x013d  */
    /* JADX WARN: Code duplicated, block: B:76:0x013f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0148  */
    /* JADX WARN: Code duplicated, block: B:82:0x0159 A[Catch: NumberFormatException -> 0x015e, TRY_LEAVE, TryCatch #5 {NumberFormatException -> 0x015e, blocks: (B:80:0x0151, B:82:0x0159), top: B:122:0x0151 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x015e  */
    /* JADX WARN: Code duplicated, block: B:88:0x016d A[Catch: NumberFormatException -> 0x0171, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x0171, blocks: (B:86:0x0165, B:88:0x016d), top: B:120:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0195  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:97:0x01bb  */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x0195, please report this as an issue */
    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final void f(DrmSessionEventListener.EventDispatcher eventDispatcher) {
        boolean z2;
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
        boolean z3 = false;
        if (this.f6204p < 0) {
            Log.c("DefaultDrmSession", "Session reference count less than zero: " + this.f6204p);
            this.f6204p = 0;
        }
        if (eventDispatcher != null) {
            CopyOnWriteMultiset copyOnWriteMultiset2 = this.f6200h;
            synchronized (copyOnWriteMultiset2.X) {
                try {
                    ArrayList arrayList = new ArrayList(copyOnWriteMultiset2.e0);
                    arrayList.add(eventDispatcher);
                    copyOnWriteMultiset2.e0 = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) copyOnWriteMultiset2.f5634Y.get(eventDispatcher);
                    if (num == null) {
                        HashSet hashSet = new HashSet(copyOnWriteMultiset2.Z);
                        hashSet.add(eventDispatcher);
                        copyOnWriteMultiset2.Z = Collections.unmodifiableSet(hashSet);
                    }
                    copyOnWriteMultiset2.f5634Y.put(eventDispatcher, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i2 = this.f6204p + 1;
        this.f6204p = i2;
        if (i2 == 1) {
            Assertions.e(this.o == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.q = handlerThread;
            handlerThread.start();
            this.r = new RequestHandler(this.q.getLooper());
            if (!h()) {
                try {
                    byte[] bArrOpenSession = this.f6197b.openSession();
                    this.f6205u = bArrOpenSession;
                    this.f6197b.f(bArrOpenSession, this.j);
                    this.s = this.f6197b.b(this.f6205u);
                    this.o = 3;
                    CopyOnWriteMultiset copyOnWriteMultiset3 = this.f6200h;
                    synchronized (copyOnWriteMultiset3.X) {
                        set = copyOnWriteMultiset3.Z;
                    }
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        ((DrmSessionEventListener.EventDispatcher) it2.next()).d(3);
                    }
                    this.f6205u.getClass();
                } catch (NotProvisionedException unused) {
                    this.f6198c.b(this);
                    z2 = false;
                } catch (Exception e2) {
                    e = e2;
                    if (DrmUtil.a(e)) {
                        this.f6198c.b(this);
                    } else {
                        i(e, 1);
                    }
                    z2 = false;
                } catch (NoSuchMethodError e3) {
                    e = e3;
                    if (DrmUtil.a(e)) {
                        this.f6198c.b(this);
                    } else {
                        i(e, 1);
                    }
                    z2 = false;
                }
            }
            z2 = true;
            if (z2 && !this.f) {
                byte[] bArr2 = this.f6205u;
                int i3 = Util.f5683a;
                if (this.v == null) {
                    k(bArr2, 1, true);
                } else if (this.o != 4) {
                    try {
                        this.f6197b.restoreKeys(this.f6205u, this.v);
                        z3 = true;
                    } catch (Exception | NoSuchMethodError e4) {
                        i(e4, 1);
                    }
                    if (z3) {
                        if (C.d.equals(this.f6202l)) {
                            l();
                            bArr = this.f6205u;
                            pair = null;
                            if (bArr == null) {
                                mapQueryKeyStatus = null;
                            } else {
                                mapQueryKeyStatus = this.f6197b.queryKeyStatus(bArr);
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
                            copyOnWriteMultiset = this.f6200h;
                            synchronized (copyOnWriteMultiset.X) {
                                Set set2 = copyOnWriteMultiset.Z;
                            }
                            it = set2.iterator();
                            while (it.hasNext()) {
                                ((DrmSessionEventListener.EventDispatcher) it.next()).c();
                            }
                        }
                    }
                } else {
                    if (C.d.equals(this.f6202l)) {
                        jMin = Long.MAX_VALUE;
                    } else {
                        l();
                        bArr = this.f6205u;
                        pair = null;
                        if (bArr == null) {
                            mapQueryKeyStatus = null;
                        } else {
                            mapQueryKeyStatus = this.f6197b.queryKeyStatus(bArr);
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
                        copyOnWriteMultiset = this.f6200h;
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
        } else if (eventDispatcher != null && h() && this.f6200h.a(eventDispatcher) == 1) {
            eventDispatcher.d(this.o);
        }
        this.d.a(this);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final void g(DrmSessionEventListener.EventDispatcher eventDispatcher) {
        l();
        int i2 = this.f6204p;
        if (i2 <= 0) {
            Log.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i3 = i2 - 1;
        this.f6204p = i3;
        if (i3 == 0) {
            this.o = 0;
            ResponseHandler responseHandler = this.f6203n;
            int i4 = Util.f5683a;
            responseHandler.removeCallbacksAndMessages(null);
            RequestHandler requestHandler = this.r;
            synchronized (requestHandler) {
                requestHandler.removeCallbacksAndMessages(null);
                requestHandler.f6207a = true;
            }
            this.r = null;
            this.q.quit();
            this.q = null;
            this.s = null;
            this.t = null;
            this.f6206w = null;
            this.x = null;
            byte[] bArr = this.f6205u;
            if (bArr != null) {
                this.f6197b.closeSession(bArr);
                this.f6205u = null;
            }
        }
        if (eventDispatcher != null) {
            CopyOnWriteMultiset copyOnWriteMultiset = this.f6200h;
            synchronized (copyOnWriteMultiset.X) {
                try {
                    Integer num = (Integer) copyOnWriteMultiset.f5634Y.get(eventDispatcher);
                    if (num != null) {
                        ArrayList arrayList = new ArrayList(copyOnWriteMultiset.e0);
                        arrayList.remove(eventDispatcher);
                        copyOnWriteMultiset.e0 = Collections.unmodifiableList(arrayList);
                        if (num.intValue() == 1) {
                            copyOnWriteMultiset.f5634Y.remove(eventDispatcher);
                            HashSet hashSet = new HashSet(copyOnWriteMultiset.Z);
                            hashSet.remove(eventDispatcher);
                            copyOnWriteMultiset.Z = Collections.unmodifiableSet(hashSet);
                        } else {
                            copyOnWriteMultiset.f5634Y.put(eventDispatcher, Integer.valueOf(num.intValue() - 1));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f6200h.a(eventDispatcher) == 0) {
                eventDispatcher.f();
            }
        }
        this.d.b(this, this.f6204p);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final DrmSession.DrmSessionException getError() {
        l();
        if (this.o == 1) {
            return this.t;
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final int getState() {
        l();
        return this.o;
    }

    public final boolean h() {
        int i2 = this.o;
        return i2 == 3 || i2 == 4;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    public final void i(Throwable th, int i2) {
        int iB;
        Set set;
        int i3 = Util.f5683a;
        if (i3 >= 21 && DrmUtil.Api21.a(th)) {
            iB = DrmUtil.Api21.b(th);
        } else if (i3 >= 23 && DrmUtil.Api23.a(th)) {
            iB = 6006;
        } else if ((th instanceof NotProvisionedException) || DrmUtil.a(th)) {
            iB = 6002;
        } else if (th instanceof DeniedByServerException) {
            iB = 6007;
        } else if (th instanceof UnsupportedDrmException) {
            iB = 6001;
        } else if (th instanceof DefaultDrmSessionManager.MissingSchemeDataException) {
            iB = 6003;
        } else if (th instanceof KeysExpiredException) {
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
        this.t = new DrmSession.DrmSessionException(th, iB);
        Log.d("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            CopyOnWriteMultiset copyOnWriteMultiset = this.f6200h;
            synchronized (copyOnWriteMultiset.X) {
                set = copyOnWriteMultiset.Z;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((DrmSessionEventListener.EventDispatcher) it.next()).e((Exception) th);
            }
        } else {
            if (!(th instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th);
            }
            if (!DrmUtil.b(th) && !DrmUtil.a(th)) {
                throw ((Error) th);
            }
        }
        if (this.o != 4) {
            this.o = 1;
        }
    }

    public final void j(boolean z2, Throwable th) {
        if ((th instanceof NotProvisionedException) || DrmUtil.a(th)) {
            this.f6198c.b(this);
        } else {
            i(th, z2 ? 1 : 2);
        }
    }

    public final void k(byte[] bArr, int i2, boolean z2) {
        try {
            ExoMediaDrm.KeyRequest keyRequestC = this.f6197b.c(bArr, this.f6196a, i2, this.g);
            this.f6206w = keyRequestC;
            RequestHandler requestHandler = this.r;
            int i3 = Util.f5683a;
            keyRequestC.getClass();
            requestHandler.getClass();
            requestHandler.obtainMessage(2, new RequestTask(LoadEventInfo.f6371b.getAndIncrement(), z2, SystemClock.elapsedRealtime(), keyRequestC)).sendToTarget();
        } catch (Exception | NoSuchMethodError e2) {
            j(true, e2);
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

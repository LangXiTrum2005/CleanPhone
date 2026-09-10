package com.smartdigimkt.a4;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.smartdigimkt.a4.i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
class b<T extends i> implements f<T> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final int f33606A = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final int f33607B = 1;
    private static final int C = 60;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f33608z = "DefaultDrmSession";
    private final j<T> f;
    private final c<T> g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e.b f33609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f33610i;
    private final HashMap<String, String> j;
    private final com.smartdigimkt.a4.c.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f33611l;
    final n m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final UUID f33612n;
    final b<T>.HandlerC0429b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f33613p;
    private int q;
    private HandlerThread r;
    private b<T>.a s;
    private T t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private f.a f33614u;
    private byte[] v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private byte[] f33615w;
    private Object x;
    private Object y;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        public void a(int i2, Object obj, boolean z2) {
            obtainMessage(i2, z2 ? 1 : 0, 0, obj).sendToTarget();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object obj = message.obj;
            try {
                int i2 = message.what;
                if (i2 == 0) {
                    b bVar = b.this;
                    e = bVar.m.a(bVar.f33612n, (j.h) obj);
                } else {
                    if (i2 != 1) {
                        throw new RuntimeException();
                    }
                    Pair pair = (Pair) obj;
                    j.d dVar = (j.d) pair.first;
                    String str = (String) pair.second;
                    b bVar2 = b.this;
                    e = bVar2.m.a(bVar2.f33612n, dVar, str);
                }
            } catch (Exception e2) {
                e = e2;
                if (a(message)) {
                    return;
                }
            }
            b.this.o.obtainMessage(message.what, Pair.create(obj, e)).sendToTarget();
        }

        private boolean a(Message message) {
            int i2;
            if (message.arg1 != 1 || (i2 = message.arg2 + 1) > b.this.f33611l) {
                return false;
            }
            Message messageObtain = Message.obtain(message);
            messageObtain.arg2 = i2;
            sendMessageDelayed(messageObtain, a(i2));
            return true;
        }

        private long a(int i2) {
            return Math.min((i2 - 1) * 1000, 5000);
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.a4.b$b, reason: collision with other inner class name */
    public class HandlerC0429b extends Handler {
        public HandlerC0429b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i2 = message.what;
            if (i2 == 0) {
                b.this.b(obj, obj2);
            } else {
                if (i2 != 1) {
                    return;
                }
                b.this.a(obj, obj2);
            }
        }
    }

    public interface c<T extends i> {
        void a();

        void a(b<T> bVar);

        void a(Exception exc);
    }

    public b(UUID uuid, j<T> jVar, c<T> cVar, e.b bVar, int i2, byte[] bArr, HashMap<String, String> map, n nVar, Looper looper, com.smartdigimkt.a4.c.a aVar, int i3) {
        this.f33612n = uuid;
        this.g = cVar;
        this.f = jVar;
        this.f33610i = i2;
        this.f33615w = bArr;
        this.f33609h = bArr != null ? null : bVar;
        this.j = map;
        this.m = nVar;
        this.f33611l = i3;
        this.k = aVar;
        this.f33613p = 2;
        this.o = new HandlerC0429b(looper);
        HandlerThread handlerThread = new HandlerThread("DrmRequestHandler");
        this.r = handlerThread;
        handlerThread.start();
        this.s = new a(this.r.getLooper());
    }

    private void i() {
        if (this.f33613p == 4) {
            this.f33613p = 3;
            a(new m());
        }
    }

    private boolean m() {
        try {
            this.f.a(this.v, this.f33615w);
            return true;
        } catch (Exception e2) {
            Log.e(f33608z, "Error trying to restore Widevine keys.", e2);
            a(e2);
            return false;
        }
    }

    public void c(Exception exc) {
        a(exc);
    }

    @Override // com.smartdigimkt.a4.f
    public final int d() {
        return this.f33613p;
    }

    @Override // com.smartdigimkt.a4.f
    public Map<String, String> e() {
        byte[] bArr = this.v;
        if (bArr == null) {
            return null;
        }
        return this.f.a(bArr);
    }

    @Override // com.smartdigimkt.a4.f
    public final T f() {
        return this.t;
    }

    @Override // com.smartdigimkt.a4.f
    public byte[] g() {
        return this.f33615w;
    }

    @Override // com.smartdigimkt.a4.f
    public final f.a h() {
        if (this.f33613p == 1) {
            return this.f33614u;
        }
        return null;
    }

    public void j() {
        if (b(false)) {
            a(true);
        }
    }

    public void k() {
        j.h hVarA = this.f.a();
        this.y = hVarA;
        this.s.a(0, hVarA, true);
    }

    public boolean l() {
        int i2 = this.q - 1;
        this.q = i2;
        if (i2 != 0) {
            return false;
        }
        this.f33613p = 0;
        this.o.removeCallbacksAndMessages(null);
        this.s.removeCallbacksAndMessages(null);
        this.s = null;
        this.r.quit();
        this.r = null;
        this.t = null;
        this.f33614u = null;
        this.x = null;
        this.y = null;
        byte[] bArr = this.v;
        if (bArr != null) {
            this.f.b(bArr);
            this.v = null;
        }
        return true;
    }

    private boolean c() {
        int i2 = this.f33613p;
        return i2 == 3 || i2 == 4;
    }

    public boolean b(byte[] bArr) {
        return Arrays.equals(this.v, bArr);
    }

    private boolean b(boolean z2) {
        if (c()) {
            return true;
        }
        try {
            byte[] bArrB = this.f.b();
            this.v = bArrB;
            this.t = (T) this.f.c(bArrB);
            this.f33613p = 3;
            return true;
        } catch (Exception e2) {
            a(e2);
            return false;
        }
    }

    public void a() {
        int i2 = this.q + 1;
        this.q = i2;
        if (i2 == 1 && this.f33613p != 1 && b(true)) {
            a(true);
        }
    }

    public boolean a(byte[] bArr) {
        e.b bVar = this.f33609h;
        return Arrays.equals(bVar != null ? bVar.f33642e : null, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Object obj, Object obj2) {
        if (obj == this.y) {
            if (this.f33613p == 2 || c()) {
                this.y = null;
                if (obj2 instanceof Exception) {
                    this.g.a((Exception) obj2);
                    return;
                }
                try {
                    this.f.d((byte[]) obj2);
                    this.g.a();
                } catch (Exception e2) {
                    this.g.a(e2);
                }
            }
        }
    }

    public void a(int i2) {
        if (c()) {
            if (i2 == 1) {
                this.f33613p = 3;
                this.g.a(this);
            } else if (i2 == 2) {
                a(false);
            } else {
                if (i2 != 3) {
                    return;
                }
                i();
            }
        }
    }

    private void a(boolean z2) {
        int i2 = this.f33610i;
        if (i2 != 0 && i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3 && m()) {
                    a(3, z2);
                    return;
                }
                return;
            }
            if (this.f33615w == null) {
                a(2, z2);
                return;
            } else {
                if (m()) {
                    a(2, z2);
                    return;
                }
                return;
            }
        }
        if (this.f33615w == null) {
            a(1, z2);
            return;
        }
        if (this.f33613p == 4 || m()) {
            long jB = b();
            if (this.f33610i == 0 && jB <= 60) {
                Log.d(f33608z, "Offline license has expired or will expire soon. Remaining seconds: " + jB);
                a(2, z2);
                return;
            }
            if (jB <= 0) {
                a(new m());
            } else {
                this.f33613p = 4;
                this.k.c();
            }
        }
    }

    private long b() {
        if (!com.smartdigimkt.w3.b.k1.equals(this.f33612n)) {
            return Long.MAX_VALUE;
        }
        Pair<Long, Long> pairA = p.a(this);
        return Math.min(((Long) pairA.first).longValue(), ((Long) pairA.second).longValue());
    }

    private void b(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.g.a(this);
        } else {
            a(exc);
        }
    }

    private void a(int i2, boolean z2) {
        String str;
        byte[] bArr;
        String str2;
        byte[] bArr2 = i2 == 3 ? this.f33615w : this.v;
        e.b bVar = this.f33609h;
        if (bVar != null) {
            byte[] bArr3 = bVar.f33642e;
            String str3 = bVar.d;
            str = bVar.f33641c;
            str2 = str3;
            bArr = bArr3;
        } else {
            str = null;
            bArr = null;
            str2 = null;
        }
        try {
            Pair pairCreate = Pair.create(this.f.a(bArr2, bArr, str2, i2, this.j), str);
            this.x = pairCreate;
            this.s.a(1, pairCreate, z2);
        } catch (Exception e2) {
            b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj, Object obj2) {
        if (obj == this.x && c()) {
            this.x = null;
            if (obj2 instanceof Exception) {
                b((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f33610i == 3) {
                    this.f.b(this.f33615w, bArr);
                    this.k.b();
                    return;
                }
                byte[] bArrB = this.f.b(this.v, bArr);
                int i2 = this.f33610i;
                if ((i2 == 2 || (i2 == 0 && this.f33615w != null)) && bArrB != null && bArrB.length != 0) {
                    this.f33615w = bArrB;
                }
                this.f33613p = 4;
                this.k.a();
            } catch (Exception e2) {
                b(e2);
            }
        }
    }

    private void a(Exception exc) {
        this.f33614u = new f.a(exc);
        this.k.a(exc);
        if (this.f33613p != 4) {
            this.f33613p = 1;
        }
    }
}

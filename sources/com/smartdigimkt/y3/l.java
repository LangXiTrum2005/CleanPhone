package com.smartdigimkt.y3;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.p004ironsource.d9;
import com.smartdigimkt.p4.f0;
import com.smartdigimkt.w3.v;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements com.smartdigimkt.y3.h {
    private static final long a0 = 250000;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final long f40097b0 = 750000;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final long f40098c0 = 250000;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final int f40099d0 = 4;
    private static final int e0 = -2;
    private static final int f0 = 0;
    private static final int g0 = 1;
    private static final int h0 = 1;
    private static final int i0 = 1;
    private static final String j0 = "AudioTrack";
    private static final int k0 = 0;
    private static final int l0 = 1;
    private static final int m0 = 2;
    public static boolean n0 = false;
    public static boolean o0 = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f40100A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f40101B;
    private ByteBuffer C;
    private int D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f40102E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private long f40103F;
    private long G;
    private int H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private long f40104I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private long f40105J;
    private int K;
    private int L;
    private long M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private float f40106N;
    private com.smartdigimkt.y3.f[] O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private ByteBuffer[] f40107P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private ByteBuffer f40108Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private ByteBuffer f40109R;
    private byte[] S;
    private int T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f40110U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private boolean f40111V;
    private boolean W;
    private int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private boolean f40112Y;
    private long Z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.smartdigimkt.y3.c f40113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f40114c;
    private final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f40115e;
    private final u f;
    private final com.smartdigimkt.y3.f[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.smartdigimkt.y3.f[] f40116h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ConditionVariable f40117i;
    private final j j;
    private final ArrayDeque<f> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.smartdigimkt.y3.h.c f40118l;
    private AudioTrack m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AudioTrack f40119n;
    private boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f40120p;
    private int q;
    private int r;
    private int s;
    private int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.smartdigimkt.y3.b f40121u;
    private boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f40122w;
    private int x;
    private v y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private v f40123z;

    public class a extends Thread {
        final /* synthetic */ AudioTrack X;

        public a(AudioTrack audioTrack) {
            this.X = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.X.flush();
                this.X.release();
            } finally {
                l.this.f40117i.open();
            }
        }
    }

    public class b extends Thread {
        final /* synthetic */ AudioTrack X;

        public b(AudioTrack audioTrack) {
            this.X = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.X.release();
        }
    }

    public interface c {
        long a();

        long a(long j);

        v a(v vVar);

        com.smartdigimkt.y3.f[] b();
    }

    public static final class e extends RuntimeException {
        public /* synthetic */ e(String str, a aVar) {
            this(str);
        }

        private e(String str) {
            super(str);
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final v f40129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f40130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f40131c;

        public /* synthetic */ f(v vVar, long j, long j2, a aVar) {
            this(vVar, j, j2);
        }

        private f(v vVar, long j, long j2) {
            this.f40129a = vVar;
            this.f40130b = j;
            this.f40131c = j2;
        }
    }

    public final class g implements j.a {
        private g() {
        }

        @Override // com.smartdigimkt.y3.j.a
        public void a(long j, long j2, long j3, long j4) {
            StringBuilder sbV = android.support.v4.media.a.v(j, "Spurious audio timestamp (frame position mismatch): ", ", ");
            sbV.append(j2);
            androidx.datastore.preferences.protobuf.a.A(sbV, ", ", j3, ", ");
            sbV.append(j4);
            sbV.append(", ");
            sbV.append(l.this.m());
            sbV.append(", ");
            sbV.append(l.this.n());
            String string = sbV.toString();
            if (l.o0) {
                throw new e(string, null);
            }
            Log.w(l.j0, string);
        }

        @Override // com.smartdigimkt.y3.j.a
        public void b(long j, long j2, long j3, long j4) {
            StringBuilder sbV = android.support.v4.media.a.v(j, "Spurious audio timestamp (system clock mismatch): ", ", ");
            sbV.append(j2);
            androidx.datastore.preferences.protobuf.a.A(sbV, ", ", j3, ", ");
            sbV.append(j4);
            sbV.append(", ");
            sbV.append(l.this.m());
            sbV.append(", ");
            sbV.append(l.this.n());
            String string = sbV.toString();
            if (l.o0) {
                throw new e(string, null);
            }
            Log.w(l.j0, string);
        }

        public /* synthetic */ g(l lVar, a aVar) {
            this();
        }

        @Override // com.smartdigimkt.y3.j.a
        public void a(long j) {
            Log.w(l.j0, "Ignoring impossibly large audio latency: " + j);
        }

        @Override // com.smartdigimkt.y3.j.a
        public void a(int i2, long j) {
            if (l.this.f40118l != null) {
                l.this.f40118l.a(i2, j, SystemClock.elapsedRealtime() - l.this.Z);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface h {
    }

    public l(com.smartdigimkt.y3.c cVar, com.smartdigimkt.y3.f[] fVarArr) {
        this(cVar, fVarArr, false);
    }

    private AudioTrack i() {
        AudioAttributes audioAttributesBuild = this.f40112Y ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : this.f40121u.a();
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setChannelMask(this.s).setEncoding(this.t).setSampleRate(this.r).build();
        int i2 = this.X;
        if (i2 == 0) {
            i2 = 0;
        }
        return new AudioTrack(audioAttributesBuild, audioFormatBuild, this.x, 1, i2);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0032 -> B:9:0x0012). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private boolean j() throws com.smartdigimkt.y3.h.d {
        /*
            r9 = this;
            int r0 = r9.f40110U
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L14
            boolean r0 = r9.v
            if (r0 == 0) goto Ld
            r0 = r2
            goto L10
        Ld:
            com.smartdigimkt.y3.f[] r0 = r9.O
            int r0 = r0.length
        L10:
            r9.f40110U = r0
        L12:
            r0 = r1
            goto L15
        L14:
            r0 = r2
        L15:
            int r4 = r9.f40110U
            com.smartdigimkt.y3.f[] r5 = r9.O
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.e()
        L28:
            r9.f(r7)
            boolean r0 = r4.a()
            if (r0 != 0) goto L32
            return r2
        L32:
            int r0 = r9.f40110U
            int r0 = r0 + r1
            r9.f40110U = r0
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.f40109R
            if (r0 == 0) goto L44
            r9.b(r0, r7)
            java.nio.ByteBuffer r0 = r9.f40109R
            if (r0 == 0) goto L44
            return r2
        L44:
            r9.f40110U = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smartdigimkt.y3.l.j():boolean");
    }

    private void k() {
        int i2 = 0;
        while (true) {
            com.smartdigimkt.y3.f[] fVarArr = this.O;
            if (i2 >= fVarArr.length) {
                return;
            }
            com.smartdigimkt.y3.f fVar = fVarArr[i2];
            fVar.flush();
            this.f40107P[i2] = fVar.d();
            i2++;
        }
    }

    private com.smartdigimkt.y3.f[] l() {
        return this.f40120p ? this.f40116h : this.g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long m() {
        return this.o ? this.f40103F / ((long) this.f40102E) : this.G;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long n() {
        return this.o ? this.f40104I / ((long) this.H) : this.f40105J;
    }

    private void o() throws com.smartdigimkt.y3.h.b {
        this.f40117i.block();
        AudioTrack audioTrackP = p();
        this.f40119n = audioTrackP;
        int audioSessionId = audioTrackP.getAudioSessionId();
        if (n0 && f0.f37540a < 21) {
            AudioTrack audioTrack = this.m;
            if (audioTrack != null && audioSessionId != audioTrack.getAudioSessionId()) {
                r();
            }
            if (this.m == null) {
                this.m = d(audioSessionId);
            }
        }
        if (this.X != audioSessionId) {
            this.X = audioSessionId;
            com.smartdigimkt.y3.h.c cVar = this.f40118l;
            if (cVar != null) {
                cVar.a(audioSessionId);
            }
        }
        this.f40123z = this.f40122w ? this.f40114c.a(this.f40123z) : v.f39373e;
        t();
        this.j.a(this.f40119n, this.t, this.H, this.x);
        s();
    }

    private AudioTrack p() throws com.smartdigimkt.y3.h.b {
        AudioTrack audioTrack;
        if (f0.f37540a >= 21) {
            audioTrack = i();
        } else {
            int iE = f0.e(this.f40121u.f40041c);
            audioTrack = this.X == 0 ? new AudioTrack(iE, this.r, this.s, this.t, this.x, 1) : new AudioTrack(iE, this.r, this.s, this.t, this.x, 1, this.X);
        }
        int state = audioTrack.getState();
        if (state == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new com.smartdigimkt.y3.h.b(state, this.r, this.s, this.x);
    }

    private boolean q() {
        return this.f40119n != null;
    }

    private void r() {
        AudioTrack audioTrack = this.m;
        if (audioTrack == null) {
            return;
        }
        this.m = null;
        new b(audioTrack).start();
    }

    private void s() {
        if (q()) {
            if (f0.f37540a >= 21) {
                a(this.f40119n, this.f40106N);
            } else {
                b(this.f40119n, this.f40106N);
            }
        }
    }

    private void t() {
        ArrayList arrayList = new ArrayList();
        for (com.smartdigimkt.y3.f fVar : l()) {
            if (fVar.f()) {
                arrayList.add(fVar);
            } else {
                fVar.flush();
            }
        }
        int size = arrayList.size();
        this.O = (com.smartdigimkt.y3.f[]) arrayList.toArray(new com.smartdigimkt.y3.f[size]);
        this.f40107P = new ByteBuffer[size];
        k();
    }

    @Override // com.smartdigimkt.y3.h
    public void f() {
        this.W = true;
        if (q()) {
            this.j.i();
            this.f40119n.play();
        }
    }

    @Override // com.smartdigimkt.y3.h
    public void g() {
        if (this.f40112Y) {
            this.f40112Y = false;
            this.X = 0;
            c();
        }
    }

    @Override // com.smartdigimkt.y3.h
    public void h() {
        if (this.L == 1) {
            this.L = 2;
        }
    }

    @Override // com.smartdigimkt.y3.h
    public void pause() {
        this.W = false;
        if (q() && this.j.f()) {
            this.f40119n.pause();
        }
    }

    @Override // com.smartdigimkt.y3.h
    public void release() {
        c();
        r();
        for (com.smartdigimkt.y3.f fVar : this.g) {
            fVar.c();
        }
        for (com.smartdigimkt.y3.f fVar2 : this.f40116h) {
            fVar2.c();
        }
        this.X = 0;
        this.W = false;
    }

    public l(com.smartdigimkt.y3.c cVar, com.smartdigimkt.y3.f[] fVarArr, boolean z2) {
        this(cVar, new d(fVarArr), z2);
    }

    @Override // com.smartdigimkt.y3.h
    public void a(com.smartdigimkt.y3.h.c cVar) {
        this.f40118l = cVar;
    }

    @Override // com.smartdigimkt.y3.h
    public boolean b(int i2) {
        if (f0.g(i2)) {
            return i2 != 4 || f0.f37540a >= 21;
        }
        com.smartdigimkt.y3.c cVar = this.f40113b;
        return cVar != null && cVar.a(i2);
    }

    @Override // com.smartdigimkt.y3.h
    public void c(int i2) {
        com.smartdigimkt.p4.a.b(f0.f37540a >= 21);
        if (this.f40112Y && this.X == i2) {
            return;
        }
        this.f40112Y = true;
        this.X = i2;
        c();
    }

    @Override // com.smartdigimkt.y3.h
    public void d() throws com.smartdigimkt.y3.h.d {
        if (!this.f40111V && q() && j()) {
            this.j.c(n());
            this.f40119n.stop();
            this.D = 0;
            this.f40111V = true;
        }
    }

    @Override // com.smartdigimkt.y3.h
    public boolean e() {
        return q() && this.j.d(n());
    }

    public l(com.smartdigimkt.y3.c cVar, c cVar2, boolean z2) {
        this.f40113b = cVar;
        this.f40114c = (c) com.smartdigimkt.p4.a.a(cVar2);
        this.d = z2;
        this.f40117i = new ConditionVariable(true);
        this.j = new j(new g(this, null));
        k kVar = new k();
        this.f40115e = kVar;
        u uVar = new u();
        this.f = uVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new p(), kVar, uVar);
        Collections.addAll(arrayList, cVar2.b());
        this.g = (com.smartdigimkt.y3.f[]) arrayList.toArray(new com.smartdigimkt.y3.f[arrayList.size()]);
        this.f40116h = new com.smartdigimkt.y3.f[]{new n()};
        this.f40106N = 1.0f;
        this.L = 0;
        this.f40121u = com.smartdigimkt.y3.b.f40038e;
        this.X = 0;
        this.f40123z = v.f39373e;
        this.f40110U = -1;
        this.O = new com.smartdigimkt.y3.f[0];
        this.f40107P = new ByteBuffer[0];
        this.k = new ArrayDeque<>();
    }

    private long e(long j) {
        return (j * 1000000) / ((long) this.q);
    }

    @Override // com.smartdigimkt.y3.h
    public long a(boolean z2) {
        if (!q() || this.L == 0) {
            return Long.MIN_VALUE;
        }
        return this.M + a(b(Math.min(this.j.a(z2), d(n()))));
    }

    public static class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.smartdigimkt.y3.f[] f40126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q f40127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final t f40128c;

        public d(com.smartdigimkt.y3.f... fVarArr) {
            com.smartdigimkt.y3.f[] fVarArr2 = (com.smartdigimkt.y3.f[]) Arrays.copyOf(fVarArr, fVarArr.length + 2);
            this.f40126a = fVarArr2;
            q qVar = new q();
            this.f40127b = qVar;
            t tVar = new t();
            this.f40128c = tVar;
            fVarArr2[fVarArr.length] = qVar;
            fVarArr2[fVarArr.length + 1] = tVar;
        }

        @Override // com.smartdigimkt.y3.l.c
        public v a(v vVar) {
            this.f40127b.a(vVar.f39376c);
            return new v(this.f40128c.b(vVar.f39374a), this.f40128c.a(vVar.f39375b), vVar.f39376c);
        }

        @Override // com.smartdigimkt.y3.l.c
        public com.smartdigimkt.y3.f[] b() {
            return this.f40126a;
        }

        @Override // com.smartdigimkt.y3.l.c
        public long a(long j) {
            return this.f40128c.a(j);
        }

        @Override // com.smartdigimkt.y3.l.c
        public long a() {
            return this.f40127b.b();
        }
    }

    private void b(ByteBuffer byteBuffer, long j) throws com.smartdigimkt.y3.h.d {
        l lVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f40109R;
            int iA = 0;
            if (byteBuffer2 != null) {
                com.smartdigimkt.p4.a.a(byteBuffer2 == byteBuffer);
            } else {
                this.f40109R = byteBuffer;
                if (f0.f37540a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.S;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.S = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.S, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.T = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (f0.f37540a < 21) {
                int iB = this.j.b(this.f40104I);
                if (iB > 0) {
                    iA = this.f40119n.write(this.S, this.T, Math.min(iRemaining2, iB));
                    if (iA > 0) {
                        this.T += iA;
                        byteBuffer.position(byteBuffer.position() + iA);
                    }
                }
                lVar = this;
            } else if (this.f40112Y) {
                com.smartdigimkt.p4.a.b(j != -9223372036854775807L);
                lVar = this;
                iA = lVar.a(this.f40119n, byteBuffer, iRemaining2, j);
            } else {
                lVar = this;
                iA = a(lVar.f40119n, byteBuffer, iRemaining2);
            }
            lVar.Z = SystemClock.elapsedRealtime();
            if (iA >= 0) {
                boolean z2 = lVar.o;
                if (z2) {
                    lVar.f40104I += (long) iA;
                }
                if (iA == iRemaining2) {
                    if (!z2) {
                        lVar.f40105J += (long) lVar.K;
                    }
                    lVar.f40109R = null;
                    return;
                }
                return;
            }
            throw new com.smartdigimkt.y3.h.d(iA);
        }
    }

    private void f(long j) throws com.smartdigimkt.y3.h.d {
        ByteBuffer byteBuffer;
        int length = this.O.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.f40107P[i2 - 1];
            } else {
                byteBuffer = this.f40108Q;
                if (byteBuffer == null) {
                    byteBuffer = com.smartdigimkt.y3.f.f40052a;
                }
            }
            if (i2 == length) {
                b(byteBuffer, j);
            } else {
                com.smartdigimkt.y3.f fVar = this.O[i2];
                fVar.a(byteBuffer);
                ByteBuffer byteBufferD = fVar.d();
                this.f40107P[i2] = byteBufferD;
                if (byteBufferD.hasRemaining()) {
                    i2++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i2--;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x008f  */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00df  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:84:0x011a  */
    /* JADX WARN: Code duplicated, block: B:85:0x011f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0124  */
    /* JADX WARN: Code duplicated, block: B:90:0x0127  */
    /* JADX WARN: Code duplicated, block: B:92:0x012b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0135  */
    /* JADX WARN: Code duplicated, block: B:98:0x015e  */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x004b, please report this as an issue */
    @Override // com.smartdigimkt.y3.h
    public void a(int i2, int i3, int i4, int i5, int[] iArr, int i6, int i7) throws com.smartdigimkt.y3.h.a {
        int i8;
        boolean z2;
        boolean z3;
        int iH;
        boolean zA;
        int iG;
        int i9;
        int i10;
        int i11;
        int iB;
        int i12;
        int i13;
        this.q = i4;
        this.o = f0.g(i2);
        this.f40120p = this.d && b(1073741824) && f0.f(i2);
        if (this.o) {
            this.f40102E = f0.b(i2, i3);
        }
        int i14 = 4;
        if (this.o) {
            i8 = i2;
            z2 = i8 != 4;
            if (z2 || this.f40120p) {
                z3 = false;
            } else {
                z3 = true;
            }
            this.f40122w = z3;
            if (z2) {
                this.f.a(i6, i7);
                this.f40115e.a(iArr);
                iH = i4;
                zA = false;
                iG = i3;
                for (com.smartdigimkt.y3.f fVar : l()) {
                    try {
                        zA |= fVar.a(iH, iG, i8);
                        if (fVar.f()) {
                            iG = fVar.g();
                            iH = fVar.h();
                            i8 = fVar.i();
                        }
                    } catch (com.smartdigimkt.y3.f.a e2) {
                        throw new com.smartdigimkt.y3.h.a(e2);
                    }
                }
            } else {
                iH = i4;
                zA = false;
                iG = i3;
            }
            i9 = 252;
            switch (iG) {
                case 1:
                    break;
                case 2:
                    i14 = 12;
                    break;
                case 3:
                    i14 = 28;
                    break;
                case 4:
                    i14 = 204;
                    break;
                case 5:
                    i14 = Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE;
                    break;
                case 6:
                    i14 = 252;
                    break;
                case 7:
                    i14 = 1276;
                    break;
                case 8:
                    i14 = com.smartdigimkt.w3.b.C;
                    break;
                default:
                    throw new com.smartdigimkt.y3.h.a(android.support.v4.media.a.h(iG, "Unsupported channel count: "));
            }
            i10 = f0.f37540a;
            if (i10 <= 23 || !"foster".equals(f0.f37541b) || !"NVIDIA".equals(f0.f37542c)) {
                i9 = i14;
            } else if (iG != 3 && iG != 5) {
                if (iG != 7) {
                    i9 = i14;
                } else {
                    i9 = com.smartdigimkt.w3.b.C;
                }
            }
            i11 = (i10 <= 25 || !"fugu".equals(f0.f37541b) || this.o || iG != 1) ? i9 : 12;
            if (zA && q() && this.t == i8 && this.r == iH && this.s == i11) {
                return;
            }
            c();
            this.v = z2;
            this.r = iH;
            this.s = i11;
            this.t = i8;
            if (this.o) {
                iB = f0.b(i8, iG);
            } else {
                iB = -1;
            }
            this.H = iB;
            if (i5 != 0) {
                this.x = i5;
                return;
            }
            if (this.o) {
                int minBufferSize = AudioTrack.getMinBufferSize(iH, i11, this.t);
                com.smartdigimkt.p4.a.b(minBufferSize != -2);
                this.x = f0.a(minBufferSize * 4, ((int) c(250000L)) * this.H, (int) Math.max(minBufferSize, c(f40097b0) * ((long) this.H)));
            }
            i12 = this.t;
            if (i12 == 5 && i12 != 6) {
                if (i12 == 7) {
                    this.x = 49152;
                    return;
                } else {
                    this.x = 294912;
                    return;
                }
            }
            this.x = 20480;
        }
        i8 = i2;
        if (z2) {
            z3 = false;
        } else {
            z3 = false;
        }
        this.f40122w = z3;
        if (z2) {
            this.f.a(i6, i7);
            this.f40115e.a(iArr);
            iH = i4;
            zA = false;
            iG = i3;
            while (i13 < r9) {
                zA |= fVar.a(iH, iG, i8);
                if (fVar.f()) {
                    iG = fVar.g();
                    iH = fVar.h();
                    i8 = fVar.i();
                }
            }
        } else {
            iH = i4;
            zA = false;
            iG = i3;
        }
        i9 = 252;
        switch (iG) {
            case 1:
                break;
            case 2:
                i14 = 12;
                break;
            case 3:
                i14 = 28;
                break;
            case 4:
                i14 = 204;
                break;
            case 5:
                i14 = Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE;
                break;
            case 6:
                i14 = 252;
                break;
            case 7:
                i14 = 1276;
                break;
            case 8:
                i14 = com.smartdigimkt.w3.b.C;
                break;
            default:
                throw new com.smartdigimkt.y3.h.a(android.support.v4.media.a.h(iG, "Unsupported channel count: "));
        }
        i10 = f0.f37540a;
        if (i10 <= 23) {
            i9 = i14;
        } else {
            i9 = i14;
        }
        if (i10 <= 25) {
        }
        if (zA) {
        }
        c();
        this.v = z2;
        this.r = iH;
        this.s = i11;
        this.t = i8;
        if (this.o) {
            iB = f0.b(i8, iG);
        } else {
            iB = -1;
        }
        this.H = iB;
        if (i5 != 0) {
            this.x = i5;
            return;
        }
        if (this.o) {
            int minBufferSize2 = AudioTrack.getMinBufferSize(iH, i11, this.t);
            com.smartdigimkt.p4.a.b(minBufferSize2 != -2);
            this.x = f0.a(minBufferSize2 * 4, ((int) c(250000L)) * this.H, (int) Math.max(minBufferSize2, c(f40097b0) * ((long) this.H)));
        } else {
            i12 = this.t;
            if (i12 == 5) {
            }
            this.x = 20480;
        }
    }

    @Override // com.smartdigimkt.y3.h
    public void c() {
        if (q()) {
            this.f40103F = 0L;
            this.G = 0L;
            this.f40104I = 0L;
            this.f40105J = 0L;
            this.K = 0;
            v vVar = this.y;
            if (vVar != null) {
                this.f40123z = vVar;
                this.y = null;
            } else if (!this.k.isEmpty()) {
                this.f40123z = this.k.getLast().f40129a;
            }
            this.k.clear();
            this.f40100A = 0L;
            this.f40101B = 0L;
            this.f40108Q = null;
            this.f40109R = null;
            k();
            this.f40111V = false;
            this.f40110U = -1;
            this.C = null;
            this.D = 0;
            this.L = 0;
            if (this.j.d()) {
                this.f40119n.pause();
            }
            AudioTrack audioTrack = this.f40119n;
            this.f40119n = null;
            this.j.g();
            this.f40117i.close();
            new a(audioTrack).start();
        }
    }

    private long d(long j) {
        return (j * 1000000) / ((long) this.r);
    }

    private AudioTrack d(int i2) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i2);
    }

    @Override // com.smartdigimkt.y3.h
    public v b() {
        return this.f40123z;
    }

    private long b(long j) {
        f fVarRemove = null;
        while (!this.k.isEmpty() && j >= this.k.getFirst().f40131c) {
            fVarRemove = this.k.remove();
        }
        if (fVarRemove != null) {
            this.f40123z = fVarRemove.f40129a;
            this.f40101B = fVarRemove.f40131c;
            this.f40100A = fVarRemove.f40130b - this.M;
        }
        if (this.f40123z.f39374a == 1.0f) {
            return (j + this.f40100A) - this.f40101B;
        }
        if (this.k.isEmpty()) {
            return this.f40114c.a(j - this.f40101B) + this.f40100A;
        }
        return f0.a(j - this.f40101B, this.f40123z.f39374a) + this.f40100A;
    }

    private long c(long j) {
        return (j * ((long) this.r)) / 1000000;
    }

    private static void b(AudioTrack audioTrack, float f2) {
        audioTrack.setStereoVolume(f2, f2);
    }

    @Override // com.smartdigimkt.y3.h
    public boolean a(ByteBuffer byteBuffer, long j) throws com.smartdigimkt.y3.h.b, com.smartdigimkt.y3.h.d {
        ByteBuffer byteBuffer2 = this.f40108Q;
        boolean z2 = false;
        com.smartdigimkt.p4.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!q()) {
            o();
            if (this.W) {
                f();
            }
        }
        if (!this.j.f(n())) {
            return false;
        }
        if (this.f40108Q != null) {
            z2 = false;
        } else {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.o && this.K == 0) {
                int iA = a(this.t, byteBuffer);
                this.K = iA;
                if (iA == 0) {
                    return true;
                }
            }
            if (this.y != null) {
                if (!j()) {
                    return false;
                }
                v vVar = this.y;
                this.y = null;
                this.k.add(new f(this.f40114c.a(vVar), Math.max(0L, j), d(n()), null));
                t();
            }
            if (this.L == 0) {
                this.M = Math.max(0L, j);
                this.L = 1;
            } else {
                long jE = this.M + e(m());
                if (this.L == 1 && Math.abs(jE - j) > 200000) {
                    StringBuilder sbV = android.support.v4.media.a.v(jE, "Discontinuity detected [expected ", ", got ");
                    sbV.append(j);
                    sbV.append(d9.i.f24752e);
                    Log.e(j0, sbV.toString());
                    this.L = 2;
                }
                if (this.L == 2) {
                    this.M = (j - jE) + this.M;
                    this.L = 1;
                    com.smartdigimkt.y3.h.c cVar = this.f40118l;
                    if (cVar != null) {
                        cVar.a();
                    }
                }
            }
            if (this.o) {
                this.f40103F += (long) byteBuffer.remaining();
            } else {
                this.G += (long) this.K;
            }
            this.f40108Q = byteBuffer;
        }
        if (this.v) {
            f(j);
        } else {
            b(this.f40108Q, j);
        }
        if (!this.f40108Q.hasRemaining()) {
            this.f40108Q = null;
            return true;
        }
        if (!this.j.e(n())) {
            return z2;
        }
        Log.w(j0, "Resetting stalled audio track");
        c();
        return true;
    }

    @Override // com.smartdigimkt.y3.h
    public boolean a() {
        if (q()) {
            return this.f40111V && !e();
        }
        return true;
    }

    @Override // com.smartdigimkt.y3.h
    public v a(v vVar) {
        if (q() && !this.f40122w) {
            v vVar2 = v.f39373e;
            this.f40123z = vVar2;
            return vVar2;
        }
        v vVar3 = this.y;
        if (vVar3 == null) {
            if (!this.k.isEmpty()) {
                vVar3 = this.k.getLast().f40129a;
            } else {
                vVar3 = this.f40123z;
            }
        }
        if (!vVar.equals(vVar3)) {
            if (q()) {
                this.y = vVar;
            } else {
                this.f40123z = this.f40114c.a(vVar);
            }
        }
        return this.f40123z;
    }

    @Override // com.smartdigimkt.y3.h
    public void a(com.smartdigimkt.y3.b bVar) {
        if (this.f40121u.equals(bVar)) {
            return;
        }
        this.f40121u = bVar;
        if (this.f40112Y) {
            return;
        }
        c();
        this.X = 0;
    }

    @Override // com.smartdigimkt.y3.h
    public void a(int i2) {
        if (this.X != i2) {
            this.X = i2;
            c();
        }
    }

    @Override // com.smartdigimkt.y3.h
    public void a(float f2) {
        if (this.f40106N != f2) {
            this.f40106N = f2;
            s();
        }
    }

    private long a(long j) {
        return j + d(this.f40114c.a());
    }

    private static int a(int i2, ByteBuffer byteBuffer) {
        if (i2 == 7 || i2 == 8) {
            return m.a(byteBuffer);
        }
        if (i2 == 5) {
            return com.smartdigimkt.y3.a.a();
        }
        if (i2 == 6) {
            return com.smartdigimkt.y3.a.b(byteBuffer);
        }
        if (i2 == 14) {
            int iA = com.smartdigimkt.y3.a.a(byteBuffer);
            if (iA == -1) {
                return 0;
            }
            return com.smartdigimkt.y3.a.a(byteBuffer, iA) * 16;
        }
        throw new IllegalStateException(android.support.v4.media.a.h(i2, "Unexpected audio encoding: "));
    }

    private static int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2) {
        return audioTrack.write(byteBuffer, i2, 1);
    }

    private int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2, long j) {
        if (this.C == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.C = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.C.putInt(1431633921);
        }
        if (this.D == 0) {
            this.C.putInt(4, i2);
            this.C.putLong(8, j * 1000);
            this.C.position(0);
            this.D = i2;
        }
        int iRemaining = this.C.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.C, iRemaining, 1);
            if (iWrite < 0) {
                this.D = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iA = a(audioTrack, byteBuffer, i2);
        if (iA < 0) {
            this.D = 0;
            return iA;
        }
        this.D -= iA;
        return iA;
    }

    private static void a(AudioTrack audioTrack, float f2) {
        audioTrack.setVolume(f2);
    }
}

package com.smartdigimkt.h8;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.FileObserver;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends com.smartdigimkt.h8.a {
    private static final String l0 = "j";
    private static final int m0 = 1;
    private static final int n0 = 2;
    private static final int o0 = 3000;
    private static final Random p0 = new Random();

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final boolean f35762U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final File f35763V;
    private final File W;
    private RandomAccessFile X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private RandomAccessFile f35764Y;
    private FileChannel Z;
    private FileChannel a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private MappedByteBuffer f35765b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private FileLock f35766c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int[] f35767d0;
    private int e0;
    private long f0;
    private boolean g0;
    private final Executor h0;
    private volatile d i0;
    private final Set<String> j0;
    private final Handler k0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.D();
        }
    }

    public class b extends Handler {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j.this.x();
            }
        }

        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                j.this.h0.execute(new a());
            } else {
                if (i2 != 2) {
                    return;
                }
                j.this.apply();
            }
        }
    }

    public static class c {
        private static final Map<String, j> f = new ConcurrentHashMap();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f35770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.smartdigimkt.i8.b[] f35771c;
        private com.smartdigimkt.i8.a d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f35772e = false;

        public c(Context context, String str) {
            if (context == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f35769a = context.getFilesDir().getAbsolutePath() + "/tktp/";
            this.f35770b = str;
        }

        public c a(com.smartdigimkt.i8.b[] bVarArr) {
            this.f35771c = bVarArr;
            return this;
        }

        public c a(com.smartdigimkt.i8.a aVar) {
            this.d = aVar;
            return this;
        }

        public c a(boolean z2) {
            this.f35772e = z2;
            return this;
        }

        public j a() {
            j jVar;
            String str = this.f35769a + this.f35770b;
            Map<String, j> map = f;
            j jVar2 = map.get(str);
            if (jVar2 != null) {
                return jVar2;
            }
            synchronized (c.class) {
                try {
                    jVar = map.get(str);
                    if (jVar == null) {
                        j jVar3 = new j(this.f35769a, this.f35770b, this.f35771c, this.d, this.f35772e);
                        map.put(str, jVar3);
                        jVar = jVar3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return jVar;
        }

        public c(String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            this.f35769a = str.endsWith("/") ? str : str.concat("/");
            this.f35770b = str2;
        }
    }

    public class d extends FileObserver {
        public d(String str) {
            super(str, 2);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i2, String str) {
            if (j.this.k0.hasMessages(1)) {
                return;
            }
            j.this.k0.sendEmptyMessageDelayed(1, 30L);
        }
    }

    public j(String str, String str2, com.smartdigimkt.i8.b[] bVarArr, com.smartdigimkt.i8.a aVar, boolean z2) {
        super(str, str2, bVarArr, aVar);
        this.f35767d0 = new int[16];
        this.e0 = 0;
        this.g0 = false;
        this.h0 = new i();
        this.j0 = new HashSet();
        this.k0 = new b(Looper.getMainLooper());
        this.f35763V = new File(str, android.support.v4.media.a.m(str2, ".kva"));
        this.W = new File(str, android.support.v4.media.a.m(str2, ".kvb"));
        this.f35762U = z2;
        t();
    }

    private void A() {
        if (this.f35765b0 == null) {
            return;
        }
        z();
        s();
        f fVar = this.k;
        fVar.f35746c = 0;
        int iB = fVar.b();
        int iF = com.smartdigimkt.h8.a.f(iB);
        boolean zD = com.smartdigimkt.h8.a.d(iB);
        long jC = this.k.c();
        this.f35716h = jC;
        this.g = iF + 12;
        if (jC == this.k.a(12, iF) && a(zD)) {
            return;
        }
        n();
    }

    private void B() {
        int i2 = com.smartdigimkt.h8.a.f35709Q;
        int iB = b(i2, this.g + i2);
        byte[] bArr = this.k.f35745b;
        if (iB >= bArr.length) {
            return;
        }
        byte[] bArr2 = new byte[iB];
        System.arraycopy(bArr, 0, bArr2, 0, this.g);
        this.k.f35745b = bArr2;
        try {
            long j = iB;
            this.Z.truncate(j);
            MappedByteBuffer map = this.Z.map(FileChannel.MapMode.READ_WRITE, 0L, j);
            this.f35765b0 = map;
            map.order(ByteOrder.LITTLE_ENDIAN);
            this.f35764Y.setLength(j);
            this.a0.truncate(j);
        } catch (Exception e2) {
            a(new Exception("map failed", e2));
            this.g0 = true;
        }
        n("truncate finish");
    }

    private void C() {
        File file;
        if (this.f35762U && this.i0 == null && (file = this.W) != null && file.exists()) {
            this.i0 = new d(this.W.getPath());
            this.i0.startWatching();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean D() {
        if (this.f35766c0 == null) {
            return false;
        }
        if (this.k == null || (this.e0 == 0 && !this.g0)) {
            y();
            return false;
        }
        try {
            int iE = e(this.g - 12);
            this.k.b(0, iE);
            this.k.a(4, this.f35716h);
            if (this.g0) {
                boolean zP = p();
                if (zP) {
                    this.g0 = false;
                }
                this.e0 = 0;
                if (!this.f35719n.isEmpty()) {
                    this.f35719n.clear();
                }
                E();
                y();
                w();
                return zP;
            }
            if (!l()) {
                if (this.f35765b0 != null) {
                    A();
                } else {
                    this.g0 = true;
                }
                this.e0 = 0;
                if (!this.f35719n.isEmpty()) {
                    this.f35719n.clear();
                }
                E();
                y();
                w();
                return false;
            }
            g(this.f35765b0.capacity());
            this.f35765b0.putInt(0, iE);
            this.f35765b0.putLong(4, this.f35716h);
            for (int i2 = 0; i2 < this.e0; i2 += 2) {
                int[] iArr = this.f35767d0;
                e(iArr[i2], iArr[i2 + 1]);
            }
            if (this.g + 8 < this.f35765b0.capacity()) {
                long jNextLong = p0.nextLong() ^ System.nanoTime();
                this.f0 = jNextLong;
                this.f35765b0.putLong(this.g, jNextLong);
            }
            d(0, 12);
            for (int i3 = 0; i3 < this.e0; i3 += 2) {
                int[] iArr2 = this.f35767d0;
                d(iArr2[i3], iArr2[i3 + 1]);
            }
            if (!this.f35719n.isEmpty()) {
                Iterator<String> it = this.f35719n.iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
            if (this.k.f35745b.length - this.g > com.smartdigimkt.h8.a.f35710R) {
                B();
            }
            this.e0 = 0;
            if (!this.f35719n.isEmpty()) {
                this.f35719n.clear();
            }
            E();
            y();
            w();
            return true;
        } catch (Throwable th) {
            try {
                if (th instanceof Exception) {
                    a(th);
                }
                this.g0 = true;
                return false;
            } finally {
                this.e0 = 0;
                if (!this.f35719n.isEmpty()) {
                    this.f35719n.clear();
                }
                E();
                y();
                w();
            }
        }
    }

    private void E() {
        while (this.t.a()) {
            try {
                Thread.sleep(10L);
            } catch (Exception unused) {
            }
        }
    }

    private void e(int i2, int i3) {
        byte[] bArr = this.k.f35745b;
        this.f35765b0.position(i2);
        this.f35765b0.put(bArr, i2, i3);
    }

    private void g(int i2) throws IOException {
        if (this.f35764Y == null) {
            this.f35764Y = new RandomAccessFile(this.W, "rw");
        }
        if (this.a0 == null) {
            this.a0 = this.f35764Y.getChannel();
        }
        long j = i2;
        if (this.a0.size() != j) {
            this.f35764Y.setLength(j);
            this.a0.truncate(j);
        }
    }

    private boolean l() {
        int length = this.k.f35745b.length;
        try {
            if (this.X == null) {
                if (!l.d(this.f35763V)) {
                    return false;
                }
                this.X = new RandomAccessFile(this.f35763V, "rw");
            }
            long j = length;
            if (this.X.length() != j) {
                this.X.setLength(j);
            }
            FileChannel fileChannel = this.Z;
            if (fileChannel == null) {
                this.Z = this.X.getChannel();
            } else if (fileChannel.size() != j) {
                this.Z.truncate(j);
            }
            MappedByteBuffer mappedByteBuffer = this.f35765b0;
            if (mappedByteBuffer != null && mappedByteBuffer.capacity() == length) {
                return true;
            }
            MappedByteBuffer map = this.Z.map(FileChannel.MapMode.READ_WRITE, 0L, j);
            this.f35765b0 = map;
            map.order(ByteOrder.LITTLE_ENDIAN);
            return true;
        } catch (Exception e2) {
            a(e2);
            return false;
        }
    }

    private void n() {
        i();
        try {
            l();
            this.f35765b0.putInt(0, e(0));
            this.f35765b0.putLong(4, 0L);
            s();
            if (l.d(this.W)) {
                g(com.smartdigimkt.h8.a.f35709Q);
                d(0, 12);
                C();
            }
        } catch (Exception e2) {
            a(e2);
            this.g0 = true;
        }
        l.a(new File(this.f35713b + this.f35714c));
        p(null);
    }

    private boolean p() {
        f fVar = this.k;
        fVar.f35746c = 0;
        int iF = com.smartdigimkt.h8.a.f(fVar.b());
        long jC = this.k.c();
        this.f35716h = jC;
        this.g = iF + 12;
        if (jC == this.k.a(12, iF)) {
            return a(this.k);
        }
        n();
        return true;
    }

    private void q() {
        try {
            if (l.d(this.W)) {
                g(this.f35765b0.capacity());
                d(0, this.g);
            }
        } catch (Exception e2) {
            a(e2);
        }
    }

    private void r() {
        try {
            if (l()) {
                this.f35765b0.position(0);
                this.f35765b0.put(this.k.f35745b, 0, this.g);
            }
        } catch (Exception e2) {
            a(e2);
        }
    }

    private void s() {
        MappedByteBuffer mappedByteBuffer = this.f35765b0;
        if (mappedByteBuffer == null || this.g + 8 >= mappedByteBuffer.capacity()) {
            return;
        }
        this.f0 = this.f35765b0.getLong(this.g);
    }

    private synchronized void t() {
        try {
            long jNanoTime = System.nanoTime();
            if (!v()) {
                u();
            }
            if (this.k == null) {
                this.k = new f(com.smartdigimkt.h8.a.f35709Q);
            }
            if (this.g == 0) {
                this.g = 12;
            }
            if (this.o) {
                j();
                n("rewrite data");
            }
            if (this.f35715e != null) {
                n("loading finish, data len:" + this.g + ", get keys:" + this.f35717i.size() + ", use time:" + ((System.nanoTime() - jNanoTime) / 1000000) + " ms");
            }
            C();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d8 A[Catch: all -> 0x009d, TryCatch #2 {all -> 0x009d, blocks: (B:19:0x0067, B:23:0x0077, B:28:0x008c, B:62:0x0163, B:31:0x00a0, B:35:0x00ac, B:37:0x00b9, B:38:0x00c6, B:40:0x00ca, B:43:0x00d1, B:46:0x00d8, B:47:0x00e7, B:49:0x00f0, B:52:0x0108, B:54:0x0118, B:56:0x0120, B:58:0x0145, B:60:0x014b, B:61:0x015b, B:51:0x00fb, B:22:0x0073, B:66:0x016b), top: B:77:0x0067, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x015b A[Catch: all -> 0x009d, TryCatch #2 {all -> 0x009d, blocks: (B:19:0x0067, B:23:0x0077, B:28:0x008c, B:62:0x0163, B:31:0x00a0, B:35:0x00ac, B:37:0x00b9, B:38:0x00c6, B:40:0x00ca, B:43:0x00d1, B:46:0x00d8, B:47:0x00e7, B:49:0x00f0, B:52:0x0108, B:54:0x0118, B:56:0x0120, B:58:0x0145, B:60:0x014b, B:61:0x015b, B:51:0x00fb, B:22:0x0073, B:66:0x016b), top: B:77:0x0067, outer: #1 }] */
    private void u() {
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            try {
                if (!l.d(this.f35763V) || !l.d(this.W)) {
                    if (i4 >= 3) {
                        break;
                    }
                    Thread.sleep(20L);
                    i4++;
                } else {
                    break;
                }
            } catch (Throwable th) {
                if (th instanceof Exception) {
                    a(th);
                }
                i();
                return;
            }
        }
        if (this.f35763V.exists() && this.W.exists()) {
            this.X = new RandomAccessFile(this.f35763V, "rw");
            this.f35764Y = new RandomAccessFile(this.W, "rw");
            long length = this.X.length();
            long length2 = this.f35764Y.length();
            this.Z = this.X.getChannel();
            FileChannel channel = this.f35764Y.getChannel();
            this.a0 = channel;
            FileLock fileLockLock = channel.lock();
            try {
                try {
                    MappedByteBuffer map = this.Z.map(FileChannel.MapMode.READ_WRITE, 0L, length > 0 ? length : com.smartdigimkt.h8.a.f35709Q);
                    this.f35765b0 = map;
                    map.order(ByteOrder.LITTLE_ENDIAN);
                    if (length == 0 && length2 == 0) {
                        this.g = 12;
                        RandomAccessFile randomAccessFile = this.f35764Y;
                        long j = com.smartdigimkt.h8.a.f35709Q;
                        randomAccessFile.setLength(j);
                        this.a0.truncate(j);
                    } else if (!a(this.W)) {
                        this.e0 = 0;
                        h();
                        f fVar = this.k;
                        if (fVar == null || fVar.f35745b.length != this.f35765b0.capacity()) {
                            this.k = new f(this.f35765b0.capacity());
                        }
                        int i5 = this.f35765b0.getInt();
                        int iF = com.smartdigimkt.h8.a.f(i5);
                        boolean zD = com.smartdigimkt.h8.a.d(i5);
                        if (iF < 0 || iF > length - 12) {
                            c("both files error");
                            n();
                        } else {
                            this.g = iF + 12;
                            long j2 = this.f35765b0.getLong(4);
                            this.f35765b0.rewind();
                            this.f35765b0.get(this.k.f35745b, 0, this.g);
                            if (j2 == this.k.a(12, iF) && a(zD)) {
                                this.f35716h = j2;
                                b(new Exception("B file error"));
                                q();
                            } else {
                                c("both files error");
                                n();
                            }
                        }
                    } else if (length == length2 && this.k.f35745b.length == this.f35765b0.capacity()) {
                        byte[] bArr = this.k.f35745b;
                        int i6 = this.g;
                        byte[] bArr2 = new byte[i6];
                        this.f35765b0.get(bArr2, 0, i6);
                        while (true) {
                            i2 = this.g;
                            if (i3 >= i2 || bArr2[i3] != bArr[i3]) {
                                break;
                                break;
                            }
                            i3++;
                        }
                        if (i3 != i2) {
                            b(new Exception("A file error"));
                            r();
                        }
                    } else {
                        b(new Exception("A file error"));
                        r();
                    }
                    s();
                    return;
                } finally {
                    fileLockLock.release();
                }
            } catch (IOException e2) {
                a(e2);
                a(this.f35763V, this.W);
                fileLockLock.release();
                return;
            }
        }
        a(new Exception("open file failed"));
    }

    private boolean v() {
        File file = new File(this.f35713b, android.support.v4.media.a.r(new StringBuilder(), this.f35714c, ".kvc"));
        File file2 = new File(this.f35713b, android.support.v4.media.a.r(new StringBuilder(), this.f35714c, ".tmp"));
        boolean z2 = false;
        try {
            if (!file.exists()) {
                file = file2.exists() ? file2 : null;
            }
            if (file != null) {
                if (!a(file)) {
                    i();
                } else if (a(this.k)) {
                    n("recover from c file");
                    z2 = true;
                }
                d();
            }
            return z2;
        } catch (Exception e2) {
            a(e2);
            return z2;
        }
    }

    private synchronized void w() {
        try {
            if (!this.j0.isEmpty()) {
                Iterator<String> it = this.j0.iterator();
                while (it.hasNext()) {
                    p(it.next());
                }
                this.j0.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void x() {
        e();
        y();
    }

    private synchronized void y() {
        FileLock fileLock = this.f35766c0;
        if (fileLock != null) {
            try {
                fileLock.release();
            } catch (Exception e2) {
                a(e2);
            }
            this.f35766c0 = null;
            this.k0.removeMessages(2);
        }
    }

    private void z() {
        this.f35717i.clear();
        c();
        int iCapacity = this.f35765b0.capacity();
        f fVar = this.k;
        if (fVar == null) {
            this.k = new f(iCapacity);
        } else if (fVar.f35745b.length != iCapacity) {
            fVar.f35745b = new byte[iCapacity];
        }
        this.f35765b0.rewind();
        this.f35765b0.get(this.k.f35745b, 0, this.g);
    }

    @Override // android.content.SharedPreferences.Editor
    public void apply() {
        this.f35721u.execute(new a());
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor clear() {
        e();
        n();
        y();
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public boolean commit() {
        return D();
    }

    @Override // com.smartdigimkt.h8.a
    public void h() {
        super.h();
        this.f0 = 0L;
    }

    @Override // com.smartdigimkt.h8.a
    public void k() {
        this.f35716h ^= this.k.a(this.f35718l, this.m);
        int i2 = this.m;
        if (i2 != 0) {
            c(this.f35718l, i2);
            this.m = 0;
        }
    }

    @Override // com.smartdigimkt.h8.a
    public void m(String str) {
        if (this.x.isEmpty()) {
            return;
        }
        this.j0.add(str);
    }

    public synchronized void o() {
        try {
            try {
                MappedByteBuffer mappedByteBuffer = this.f35765b0;
                if (mappedByteBuffer != null) {
                    mappedByteBuffer.force();
                }
                FileChannel fileChannel = this.a0;
                if (fileChannel != null) {
                    fileChannel.force(true);
                }
            } catch (Exception e2) {
                a(e2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor remove(String str) {
        try {
            e();
            m(str);
            com.smartdigimkt.h8.b.AbstractC0504b abstractC0504b = this.f35717i.get(str);
            if (abstractC0504b != null) {
                this.f35717i.remove(str);
                this.s.b(str);
                this.r.b(str);
                byte bA = abstractC0504b.a();
                String str2 = null;
                if (bA <= 5) {
                    int iB = f.b(str);
                    int i2 = abstractC0504b.f35725a;
                    a(bA, i2 - (iB + 2), i2 + com.smartdigimkt.h8.a.O[bA]);
                } else {
                    com.smartdigimkt.h8.b.j jVar = (com.smartdigimkt.h8.b.j) abstractC0504b;
                    a(bA, jVar.f35732c, jVar.f35725a + jVar.d);
                    if (jVar.f35733e) {
                        str2 = (String) jVar.f35731b;
                    }
                }
                if (str2 != null) {
                    this.f35719n.add(str2);
                }
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public String toString() {
        return "MPFastKV: path:" + this.f35713b + " name:" + this.f35714c;
    }

    private void c(int i2, int i3) {
        int i4 = this.e0;
        int[] iArr = this.f35767d0;
        int length = iArr.length;
        if ((i4 << 1) >= length) {
            int[] iArr2 = new int[length << 1];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.f35767d0 = iArr2;
        }
        int[] iArr3 = this.f35767d0;
        iArr3[i4] = i2;
        iArr3[i4 + 1] = i3;
        this.e0 = i4 + 2;
    }

    private void d(int i2, int i3) throws IOException {
        MappedByteBuffer mappedByteBuffer = this.f35765b0;
        mappedByteBuffer.position(i2);
        mappedByteBuffer.limit(i3 + i2);
        if (this.a0.size() != mappedByteBuffer.capacity()) {
            this.a0.truncate(mappedByteBuffer.capacity());
        }
        this.a0.position(i2);
        while (mappedByteBuffer.hasRemaining()) {
            this.a0.write(mappedByteBuffer);
        }
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    @Override // com.smartdigimkt.h8.a
    public void a(g gVar) {
        a(gVar.k);
    }

    @Override // com.smartdigimkt.h8.a
    public void b(int i2) {
        int length = this.k.f35745b.length;
        int i3 = this.g + i2 + 8;
        if (i3 >= length) {
            byte[] bArr = new byte[b(length, i3)];
            System.arraycopy(this.k.f35745b, 0, bArr, 0, this.g);
            this.k.f35745b = bArr;
        }
    }

    private boolean a(f fVar) {
        int length = fVar.f35745b.length;
        try {
            if (l.d(this.f35763V) && l.d(this.W)) {
                if (this.f35764Y == null) {
                    this.f35764Y = new RandomAccessFile(this.W, "rw");
                }
                if (this.a0 == null) {
                    this.a0 = this.f35764Y.getChannel();
                }
                FileLock fileLockLock = this.f35766c0 == null ? this.a0.lock() : null;
                try {
                    l();
                    this.f35765b0.put(fVar.f35745b, 0, this.g);
                    s();
                    long j = length;
                    if (this.f35764Y.length() != j) {
                        this.f35764Y.setLength(j);
                    }
                    this.a0.truncate(j);
                    d(0, this.g);
                    this.a0.force(false);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    C();
                    return true;
                } catch (Throwable th) {
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    throw th;
                }
            }
            throw new Exception("open file failed");
        } catch (Exception e2) {
            a(e2);
            return false;
        }
    }

    private void m() throws IOException {
        File file;
        MappedByteBuffer map = this.f35765b0;
        if (map == null || (file = this.f35763V) == null) {
            return;
        }
        int length = (int) file.length();
        if (length <= 0) {
            c("invalid file length");
            return;
        }
        if (this.f35765b0.capacity() != length) {
            long j = length;
            this.Z.truncate(j);
            map = this.Z.map(FileChannel.MapMode.READ_WRITE, 0L, j);
            if (map == null) {
                return;
            }
            this.f35765b0 = map;
            map.order(ByteOrder.LITTLE_ENDIAN);
        }
        long j2 = length;
        if (this.a0.size() != j2) {
            this.a0.truncate(j2);
        }
        int iCapacity = map.capacity();
        int i2 = map.getInt(0);
        int iF = com.smartdigimkt.h8.a.f(i2);
        boolean zD = com.smartdigimkt.h8.a.d(i2);
        if (iF >= 0 && iF <= iCapacity) {
            long j3 = map.getLong(4);
            int i3 = iF + 12;
            long j4 = this.f0;
            if (i3 < map.capacity() - 8) {
                j4 = map.getLong(i3);
            }
            if (i3 == this.g && j3 == this.f35716h && j4 == this.f0) {
                return;
            }
            this.g = i3;
            this.f35716h = j3;
            this.f0 = j4;
            HashMap<String, com.smartdigimkt.h8.b.AbstractC0504b> map2 = this.x.isEmpty() ? null : new HashMap<>(this.f35717i);
            z();
            if (j3 != this.k.a(12, iF) || !a(zD)) {
                n();
                return;
            } else {
                if (map2 != null) {
                    a(map2);
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException(android.support.v4.media.a.g(iF, iCapacity, "Invalid file, dataSize:", ", capacity:"));
    }

    @Override // com.smartdigimkt.h8.a
    public void e() {
        if (this.f35766c0 != null) {
            return;
        }
        if (this.a0 == null) {
            u();
            C();
        }
        FileChannel fileChannel = this.a0;
        if (fileChannel != null) {
            try {
                this.f35766c0 = fileChannel.lock();
                try {
                    m();
                } finally {
                    this.k0.sendEmptyMessageDelayed(2, com.smartdigimkt.u2.m.D0);
                }
            } catch (Exception e2) {
                a(e2);
            }
        }
    }

    @Override // com.smartdigimkt.h8.a
    public void q(String str) {
        this.f35719n.add(str);
    }

    @Override // com.smartdigimkt.h8.a
    public void b() {
        if (this.v >= a() || this.f35722w.size() >= 80) {
            c(0);
        }
    }

    private void a(HashMap<String, com.smartdigimkt.h8.b.AbstractC0504b> map) {
        HashSet hashSet = new HashSet(this.f35717i.keySet());
        HashSet hashSet2 = new HashSet(map.keySet());
        HashSet<String> hashSet3 = new HashSet(hashSet);
        hashSet3.retainAll(hashSet2);
        hashSet.removeAll(hashSet3);
        hashSet2.removeAll(hashSet3);
        this.j0.addAll(hashSet);
        this.j0.addAll(hashSet2);
        for (String str : hashSet3) {
            com.smartdigimkt.h8.b.AbstractC0504b abstractC0504b = map.get(str);
            com.smartdigimkt.h8.b.AbstractC0504b abstractC0504b2 = this.f35717i.get(str);
            if (abstractC0504b != null && !abstractC0504b.a(abstractC0504b2)) {
                this.j0.add(str);
            }
        }
        if (this.j0.isEmpty()) {
            return;
        }
        w();
    }

    @Override // com.smartdigimkt.h8.a
    public void a(byte b2, int i2) {
        this.f35716h ^= a(1L, i2);
        this.k.f35745b[i2] = b2;
        c(i2, 1);
    }

    @Override // com.smartdigimkt.h8.a
    public void a(int i2, long j, int i3) {
        this.f35716h = a(j, i3) ^ this.f35716h;
        this.k.b(i3, i2);
        c(i3, 4);
    }

    @Override // com.smartdigimkt.h8.a
    public void a(long j, long j2, int i2) {
        this.f35716h = a(j2, i2) ^ this.f35716h;
        this.k.a(i2, j);
        c(i2, 8);
    }

    @Override // com.smartdigimkt.h8.a
    public void a(int i2, byte[] bArr) {
        super.a(i2, bArr);
        c(i2, bArr.length);
    }

    @Override // com.smartdigimkt.h8.a
    public void a(byte b2, int i2, int i3) {
        super.a(b2, i2, i3);
        c(i2, 1);
    }

    @Override // com.smartdigimkt.h8.a
    public void a(int i2, int i3, int i4) {
        for (int i5 = 0; i5 < this.e0; i5 += 2) {
            int i6 = this.f35767d0[i5];
            if (i6 < i2) {
                i2 = i6;
            }
        }
        int[] iArr = this.f35767d0;
        iArr[0] = i2;
        iArr[1] = this.g - i2;
        this.e0 = 2;
    }
}

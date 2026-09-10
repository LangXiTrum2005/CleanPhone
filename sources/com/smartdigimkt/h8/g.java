package com.smartdigimkt.h8;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends com.smartdigimkt.h8.a {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f35747b0 = "g";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f35748c0 = 0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f35749d0 = 1;
    public static final int e0 = 2;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private FileChannel f35750U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private FileChannel f35751V;
    private MappedByteBuffer W;
    private MappedByteBuffer X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private int f35752Y;
    private int Z;
    boolean a0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.y();
        }
    }

    public static final class b {
        static final Map<String, g> f = new ConcurrentHashMap();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f35754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.smartdigimkt.i8.b[] f35755c;
        private com.smartdigimkt.i8.a d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f35756e = 0;

        public b(Context context, String str) {
            if (context == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f35753a = context.getFilesDir().getAbsolutePath() + "/tktp/";
            this.f35754b = str;
        }

        public b a(com.smartdigimkt.i8.b[] bVarArr) {
            this.f35755c = bVarArr;
            return this;
        }

        public b b() {
            this.f35756e = 2;
            return this;
        }

        public g c() {
            g gVar;
            String str = this.f35753a + this.f35754b;
            Map<String, g> map = f;
            g gVar2 = map.get(str);
            if (gVar2 != null) {
                return gVar2;
            }
            synchronized (b.class) {
                try {
                    gVar = map.get(str);
                    if (gVar == null) {
                        g gVar3 = new g(this.f35753a, this.f35754b, this.f35755c, this.d, this.f35756e);
                        map.put(str, gVar3);
                        gVar = gVar3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return gVar;
        }

        public b a(com.smartdigimkt.i8.a aVar) {
            this.d = aVar;
            return this;
        }

        public b a() {
            this.f35756e = 1;
            return this;
        }

        public b(String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            this.f35753a = str.endsWith("/") ? str : str.concat("/");
            this.f35754b = str2;
        }
    }

    public g(String str, String str2, com.smartdigimkt.i8.b[] bVarArr, com.smartdigimkt.i8.a aVar, int i2) {
        super(str, str2, bVarArr, aVar);
        this.a0 = true;
        this.Z = i2;
        u();
    }

    private void g(int i2) {
        int i3 = com.smartdigimkt.h8.a.f35709Q;
        int iB = b(i3, i2 + i3);
        byte[] bArr = this.k.f35745b;
        if (iB >= bArr.length) {
            return;
        }
        byte[] bArr2 = new byte[iB];
        System.arraycopy(bArr, 0, bArr2, 0, this.g);
        this.k.f35745b = bArr2;
        if (this.Z == 0) {
            try {
                long j = iB;
                this.f35750U.truncate(j);
                FileChannel fileChannel = this.f35750U;
                FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                MappedByteBuffer map = fileChannel.map(mapMode, 0L, j);
                this.W = map;
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                map.order(byteOrder);
                this.f35751V.truncate(j);
                MappedByteBuffer map2 = this.f35751V.map(mapMode, 0L, j);
                this.X = map2;
                map2.order(byteOrder);
            } catch (Exception e2) {
                a(new Exception("map failed", e2));
                x();
            }
        }
        n("truncate finish");
    }

    private void l() {
        if (this.Z == 0 || !this.a0) {
            return;
        }
        p();
    }

    private void n() {
        if (this.f35719n.isEmpty()) {
            return;
        }
        Iterator<String> it = this.f35719n.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        this.f35719n.clear();
    }

    private boolean p() {
        int i2 = this.Z;
        if (i2 == 1) {
            this.f35721u.execute(new a());
        } else if (i2 == 2) {
            return y();
        }
        return true;
    }

    private boolean t() {
        f fVar = new f(this.g);
        this.X.rewind();
        this.X.get(fVar.f35745b, 0, this.g);
        byte[] bArr = this.k.f35745b;
        byte[] bArr2 = fVar.f35745b;
        for (int i2 = 0; i2 < this.g; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private synchronized void u() {
        try {
            long jNanoTime = System.nanoTime();
            if (!w() && this.Z == 0) {
                v();
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
        } catch (Throwable th) {
            throw th;
        }
    }

    private void v() {
        File file = new File(this.f35713b, android.support.v4.media.a.r(new StringBuilder(), this.f35714c, ".kva"));
        File file2 = new File(this.f35713b, android.support.v4.media.a.r(new StringBuilder(), this.f35714c, ".kvb"));
        try {
            if (l.d(file) && l.d(file2)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                long length = randomAccessFile.length();
                long length2 = randomAccessFile2.length();
                this.f35750U = randomAccessFile.getChannel();
                this.f35751V = randomAccessFile2.getChannel();
                try {
                    FileChannel fileChannel = this.f35750U;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    MappedByteBuffer map = fileChannel.map(mapMode, 0L, length > 0 ? length : com.smartdigimkt.h8.a.f35709Q);
                    this.W = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    MappedByteBuffer map2 = this.f35751V.map(mapMode, 0L, length2 > 0 ? length2 : com.smartdigimkt.h8.a.f35709Q);
                    this.X = map2;
                    map2.order(byteOrder);
                    this.k = new f(this.W.capacity());
                    if (length == 0 && length2 == 0) {
                        this.g = 12;
                        return;
                    }
                    int i2 = this.W.getInt();
                    int iF = com.smartdigimkt.h8.a.f(i2);
                    boolean zD = com.smartdigimkt.h8.a.d(i2);
                    long j = this.W.getLong();
                    int i3 = this.X.getInt();
                    int iF2 = com.smartdigimkt.h8.a.f(i3);
                    boolean zD2 = com.smartdigimkt.h8.a.d(i3);
                    long j2 = this.X.getLong();
                    if (iF >= 0 && iF <= length - 12) {
                        this.g = iF + 12;
                        this.W.rewind();
                        this.W.get(this.k.f35745b, 0, this.g);
                        if (j == this.k.a(12, iF) && a(zD)) {
                            this.f35716h = j;
                            if (length == length2 && t()) {
                                return;
                            }
                            b(new Exception("B file error"));
                            a(this.W, this.X, this.g);
                            return;
                        }
                    }
                    if (iF2 >= 0 && iF2 <= length2 - 12) {
                        this.f35717i.clear();
                        c();
                        this.g = iF2 + 12;
                        if (this.k.f35745b.length != this.X.capacity()) {
                            this.k = new f(this.X.capacity());
                        }
                        this.X.rewind();
                        this.X.get(this.k.f35745b, 0, this.g);
                        if (j2 == this.k.a(12, iF2) && a(zD2)) {
                            b(new Exception("A file error"));
                            a(this.X, this.W, this.g);
                            this.f35716h = j2;
                            return;
                        }
                    }
                    c("both files error");
                    m();
                    return;
                } catch (IOException e2) {
                    a(e2);
                    x();
                    a(file, file2);
                    return;
                }
            }
            a(new Exception("open file failed"));
            x();
        } catch (Exception e3) {
            a(e3);
            i();
            x();
        }
    }

    private boolean w() {
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
                    d();
                    return false;
                }
                if (this.Z == 0) {
                    if (!a(this.k)) {
                        this.Z = 1;
                        return false;
                    }
                    n("recover from c file");
                    try {
                        d();
                        return true;
                    } catch (Exception e2) {
                        e = e2;
                        z2 = true;
                        a(e);
                        return z2;
                    }
                }
            } else if (this.Z != 0) {
                File file3 = new File(this.f35713b, this.f35714c + ".kva");
                File file4 = new File(this.f35713b, this.f35714c + ".kvb");
                if (file3.exists() && file4.exists()) {
                    a(file3, file4);
                }
            }
            return false;
        } catch (Exception e3) {
            e = e3;
        }
    }

    private void x() {
        this.Z = 1;
        l.a(this.f35750U);
        l.a(this.f35751V);
        this.f35750U = null;
        this.f35751V = null;
        this.W = null;
        this.X = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean y() {
        try {
            File file = new File(this.f35713b, this.f35714c + ".tmp");
            if (l.d(file)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    randomAccessFile.setLength(this.g);
                    randomAccessFile.write(this.k.f35745b, 0, this.g);
                    randomAccessFile.getFD().sync();
                    randomAccessFile.close();
                    if (l.b(file, new File(this.f35713b, this.f35714c + ".kvc"))) {
                        n();
                        return true;
                    }
                    b(new Exception("rename failed"));
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (Exception e2) {
            a(e2);
        }
        return false;
    }

    @Override // com.smartdigimkt.h8.a
    public void a(g gVar) {
        MappedByteBuffer mappedByteBuffer;
        f fVar = gVar.k;
        if (this.Z == 0) {
            int length = fVar.f35745b.length;
            MappedByteBuffer mappedByteBuffer2 = this.W;
            if (mappedByteBuffer2 != null && mappedByteBuffer2.capacity() == length && (mappedByteBuffer = this.X) != null && mappedByteBuffer.capacity() == length) {
                this.W.position(0);
                this.W.put(fVar.f35745b, 0, this.g);
                this.X.position(0);
                this.X.put(fVar.f35745b, 0, this.g);
            } else if (!a(fVar)) {
                this.Z = 1;
            }
        }
        if (this.Z != 0) {
            y();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized void apply() {
        if (this.f35720p) {
            return;
        }
        this.a0 = true;
        p();
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor clear() {
        try {
            if (this.f35720p) {
                return this;
            }
            m();
            if (this.Z != 0) {
                d();
            }
            p(null);
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized boolean commit() {
        if (this.f35720p) {
            return false;
        }
        this.a0 = true;
        return p();
    }

    @Override // com.smartdigimkt.h8.a
    public void k() {
        this.f35716h ^= this.k.a(this.f35718l, this.m);
        int iE = e(this.g - 12);
        if (this.Z == 0) {
            this.W.putInt(0, -1);
            b(this.W);
            this.W.putInt(0, iE);
            this.X.putInt(0, iE);
            b(this.X);
        } else {
            this.k.b(0, iE);
            this.k.a(4, this.f35716h);
        }
        this.f35752Y = 0;
        this.m = 0;
    }

    @Override // com.smartdigimkt.h8.a
    public void m(String str) {
        l();
        p(str);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public synchronized void o() {
        if (this.f35720p) {
            return;
        }
        this.f35720p = true;
        if (this.Z != 0) {
            synchronized (b.class) {
                b.f.remove(this.f35713b + this.f35714c);
                return;
            }
        }
        try {
            this.f35750U.force(true);
            this.f35750U.close();
            this.f35751V.force(true);
            this.f35751V.close();
        } catch (Exception e2) {
            a(e2);
        }
        synchronized (b.class) {
            b.f.remove(this.f35713b + this.f35714c);
        }
        return;
        throw th;
    }

    public synchronized void q() {
        this.a0 = false;
    }

    public synchronized void r() {
        if (this.f35720p) {
            return;
        }
        if (this.Z == 0) {
            this.W.force();
            this.X.force();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor remove(String str) {
        try {
            if (this.f35720p) {
                return this;
            }
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
                byte b2 = (byte) (bA | (-128));
                if (this.Z == 0) {
                    this.W.putLong(4, this.f35716h);
                    this.W.put(this.f35752Y, b2);
                    this.X.putLong(4, this.f35716h);
                    this.X.put(this.f35752Y, b2);
                } else {
                    this.k.a(4, this.f35716h);
                }
                this.f35752Y = 0;
                if (str2 != null) {
                    if (this.Z == 0) {
                        b(str2);
                    } else {
                        this.f35719n.add(str2);
                    }
                }
                b();
                l();
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    public int s() {
        return this.Z;
    }

    public String toString() {
        return "FastKV: path:" + this.f35713b + " name:" + this.f35714c;
    }

    private void b(MappedByteBuffer mappedByteBuffer) {
        try {
            if (mappedByteBuffer.capacity() < 12) {
                throw new IllegalArgumentException("Buffer capacity too small for checksum");
            }
            mappedByteBuffer.putLong(4, this.f35716h);
            int i2 = this.f35752Y;
            if (i2 != 0) {
                if (i2 < 0 || i2 >= mappedByteBuffer.capacity()) {
                    throw new IllegalArgumentException("removeStart out of bounds: " + this.f35752Y);
                }
                int i3 = this.f35752Y;
                byte[] bArr = this.k.f35745b;
                if (i3 >= bArr.length) {
                    throw new IllegalArgumentException("fastBuffer.hb index out of bounds: " + this.f35752Y);
                }
                mappedByteBuffer.put(i3, bArr[i3]);
            }
            int i4 = this.m;
            if (i4 != 0) {
                int i5 = this.f35718l;
                if (i5 < 0 || i4 < 0 || i4 + i5 > this.k.f35745b.length) {
                    throw new IllegalArgumentException("Invalid update range");
                }
                if (i5 <= mappedByteBuffer.capacity()) {
                    int iCapacity = mappedByteBuffer.capacity();
                    int i6 = this.f35718l;
                    if (iCapacity - i6 >= this.m) {
                        mappedByteBuffer.position(i6);
                        mappedByteBuffer.put(this.k.f35745b, this.f35718l, this.m);
                        return;
                    }
                }
                throw new IllegalArgumentException("buffer capacity overflow");
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.h8.a
    public void q(String str) {
        if (this.Z == 0) {
            b(str);
        } else {
            this.f35719n.add(str);
        }
    }

    private void m() {
        if (this.Z == 0) {
            try {
                a(this.W);
                a(this.X);
            } catch (Exception unused) {
                x();
            }
        }
        i();
        l.a(new File(this.f35713b + this.f35714c));
    }

    private boolean a(f fVar) {
        Exception exc;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        try {
            int length = fVar.f35745b.length;
            File file = new File(this.f35713b, this.f35714c + ".kva");
            File file2 = new File(this.f35713b, this.f35714c + ".kvb");
            if (l.d(file) && l.d(file2)) {
                randomAccessFile2 = new RandomAccessFile(file, "rw");
                long j = length;
                try {
                    randomAccessFile2.setLength(j);
                    FileChannel channel = randomAccessFile2.getChannel();
                    this.f35750U = channel;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    MappedByteBuffer map = channel.map(mapMode, 0L, j);
                    this.W = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    this.W.put(fVar.f35745b, 0, this.g);
                    randomAccessFile = new RandomAccessFile(file2, "rw");
                    try {
                        randomAccessFile.setLength(j);
                        FileChannel channel2 = randomAccessFile.getChannel();
                        this.f35751V = channel2;
                        MappedByteBuffer map2 = channel2.map(mapMode, 0L, j);
                        this.X = map2;
                        map2.order(byteOrder);
                        this.X.put(fVar.f35745b, 0, this.g);
                        return true;
                    } catch (Exception e2) {
                        exc = e2;
                        l.a(randomAccessFile2);
                        l.a(randomAccessFile);
                        this.f35750U = null;
                        this.f35751V = null;
                        this.W = null;
                        this.X = null;
                        a(exc);
                        return false;
                    }
                } catch (Exception e3) {
                    exc = e3;
                    randomAccessFile = null;
                }
            } else {
                throw new Exception("open file failed");
            }
        } catch (Exception e4) {
            exc = e4;
            randomAccessFile = null;
            randomAccessFile2 = null;
        }
    }

    @Override // com.smartdigimkt.h8.a
    public void b(int i2) {
        int length = this.k.f35745b.length;
        int i3 = this.g + i2;
        if (i3 >= length) {
            int i4 = this.v;
            if (i4 > i2 && i4 > a()) {
                c(i2);
                return;
            }
            int iB = b(length, i3);
            byte[] bArr = new byte[iB];
            System.arraycopy(this.k.f35745b, 0, bArr, 0, this.g);
            this.k.f35745b = bArr;
            if (this.Z == 0) {
                try {
                    FileChannel fileChannel = this.f35750U;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    long j = iB;
                    MappedByteBuffer map = fileChannel.map(mapMode, 0L, j);
                    this.W = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    MappedByteBuffer map2 = this.f35751V.map(mapMode, 0L, j);
                    this.X = map2;
                    map2.order(byteOrder);
                } catch (IOException e2) {
                    a(new Exception("map failed", e2));
                    this.k.b(0, e(this.g - 12));
                    this.k.a(4, this.f35716h);
                    x();
                }
            }
        }
    }

    @Override // com.smartdigimkt.h8.a
    public void b() {
        if (this.v < (a() << 1)) {
            if (this.f35722w.size() < (this.g < 16384 ? 80 : 160)) {
                return;
            }
        }
        c(0);
    }

    private void a(MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, int i2) {
        if (mappedByteBuffer.capacity() != mappedByteBuffer2.capacity()) {
            try {
                MappedByteBuffer map = (mappedByteBuffer2 == this.X ? this.f35751V : this.f35750U).map(FileChannel.MapMode.READ_WRITE, 0L, mappedByteBuffer.capacity());
                map.order(ByteOrder.LITTLE_ENDIAN);
                if (mappedByteBuffer2 == this.X) {
                    this.X = map;
                } else {
                    this.W = map;
                }
                mappedByteBuffer2 = map;
            } catch (IOException e2) {
                a(e2);
                x();
                return;
            }
        }
        mappedByteBuffer.rewind();
        mappedByteBuffer2.rewind();
        mappedByteBuffer.limit(i2);
        mappedByteBuffer2.put(mappedByteBuffer);
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    @Override // com.smartdigimkt.h8.a
    public synchronized void a(Map<String, Object> map, Map<Class, com.smartdigimkt.i8.b> map2) {
        try {
            if (this.f35720p) {
                return;
            }
            if (this.Z != 0) {
                this.a0 = false;
            }
            super.a(map, map2);
            if (this.Z != 0) {
                commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(MappedByteBuffer mappedByteBuffer) throws IOException {
        int iCapacity = mappedByteBuffer.capacity();
        int i2 = com.smartdigimkt.h8.a.f35709Q;
        if (iCapacity != i2) {
            FileChannel fileChannel = mappedByteBuffer == this.W ? this.f35750U : this.f35751V;
            long j = i2;
            fileChannel.truncate(j);
            MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j);
            map.order(ByteOrder.LITTLE_ENDIAN);
            if (mappedByteBuffer == this.W) {
                this.W = map;
            } else {
                this.X = map;
            }
            mappedByteBuffer = map;
        }
        mappedByteBuffer.putInt(0, e(0));
        mappedByteBuffer.putLong(4, 0L);
    }

    @Override // com.smartdigimkt.h8.a
    public void a(byte b2, int i2) {
        long jA = this.f35716h ^ a(1L, i2);
        this.f35716h = jA;
        if (this.Z == 0) {
            this.W.putLong(4, jA);
            this.W.put(i2, b2);
            this.X.putLong(4, this.f35716h);
            this.X.put(i2, b2);
        } else {
            this.k.a(4, jA);
        }
        this.k.f35745b[i2] = b2;
    }

    @Override // com.smartdigimkt.h8.a
    public void a(int i2, long j, int i3) {
        long jA = a(j, i3) ^ this.f35716h;
        this.f35716h = jA;
        if (this.Z == 0) {
            this.W.putLong(4, jA);
            this.W.putInt(i3, i2);
            this.X.putLong(4, this.f35716h);
            this.X.putInt(i3, i2);
        } else {
            this.k.a(4, jA);
        }
        this.k.b(i3, i2);
    }

    @Override // com.smartdigimkt.h8.a
    public void a(long j, long j2, int i2) {
        long jA = a(j2, i2) ^ this.f35716h;
        this.f35716h = jA;
        if (this.Z == 0) {
            this.W.putLong(4, jA);
            this.W.putLong(i2, j);
            this.X.putLong(4, this.f35716h);
            this.X.putLong(i2, j);
        } else {
            this.k.a(4, jA);
        }
        this.k.a(i2, j);
    }

    @Override // com.smartdigimkt.h8.a
    public void a(int i2, byte[] bArr) {
        super.a(i2, bArr);
        if (this.Z == 0) {
            this.W.putInt(0, -1);
            this.W.putLong(4, this.f35716h);
            this.W.position(i2);
            this.W.put(bArr);
            this.W.putInt(0, e(this.g - 12));
            this.X.putLong(4, this.f35716h);
            this.X.position(i2);
            this.X.put(bArr);
            return;
        }
        this.k.a(4, this.f35716h);
    }

    @Override // com.smartdigimkt.h8.a
    public void a(byte b2, int i2, int i3) {
        super.a(b2, i2, i3);
        this.f35752Y = i2;
    }

    @Override // com.smartdigimkt.h8.a
    public void a(int i2, int i3, int i4) {
        int iE = e(this.g - 12);
        if (this.Z == 0) {
            this.W.putInt(0, -1);
            this.W.putLong(4, this.f35716h);
            this.W.position(i2);
            this.W.put(this.k.f35745b, i2, i4);
            this.W.putInt(0, iE);
            this.X.putInt(0, iE);
            this.X.putLong(4, this.f35716h);
            this.X.position(i2);
            this.X.put(this.k.f35745b, i2, i4);
        } else {
            this.k.b(0, iE);
            this.k.a(4, this.f35716h);
        }
        int i5 = this.g + i3;
        if (this.k.f35745b.length - i5 > com.smartdigimkt.h8.a.f35710R) {
            g(i5);
        }
    }
}

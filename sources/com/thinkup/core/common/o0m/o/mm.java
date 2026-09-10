package com.thinkup.core.common.o0m.o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.FileObserver;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.a;
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

/* JADX INFO: loaded from: classes6.dex */
public final class mm extends com.thinkup.core.common.o0m.o.o {
    private static final int mnm = 1;
    private static final int mnn = 2;
    private static final String mno = "mm";
    private static final int n00 = 3000;
    private static final Random n0o = new Random();
    private final boolean n0m;
    private final File n0n;
    private FileChannel nm0;
    private FileLock nmm;
    private int[] nmn;
    private MappedByteBuffer nmo;
    private int nn0;
    private boolean nnm;
    private final Executor nnn;
    private long nno;
    private final File no0;
    private RandomAccessFile nom;
    private FileChannel non;
    private RandomAccessFile noo;
    private volatile m o000;
    private final Handler o00m;
    private final Set<String> o00o;

    public class m extends FileObserver {
        public m(String str) {
            super(str, 2);
        }

        @Override // android.os.FileObserver
        public final void onEvent(int i2, String str) {
            if (mm.this.o00m.hasMessages(1)) {
                return;
            }
            mm.this.o00m.sendEmptyMessageDelayed(1, 30L);
        }
    }

    public static class o {
        private static final Map<String, mm> o = new ConcurrentHashMap();
        private String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f42151n;
        private com.thinkup.core.common.o0m.o.o.m[] o0;
        private boolean om = false;
        private com.thinkup.core.common.o0m.o.o.o oo;

        public o(Context context, String str) {
            if (context == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.m = context.getFilesDir().getAbsolutePath() + "/tktp/";
            this.f42151n = str;
        }

        private o o(com.thinkup.core.common.o0m.o.o.m[] mVarArr) {
            this.o0 = mVarArr;
            return this;
        }

        public final mm m() {
            mm mmVar;
            String str = this.m + this.f42151n;
            Map<String, mm> map = o;
            mm mmVar2 = map.get(str);
            if (mmVar2 != null) {
                return mmVar2;
            }
            synchronized (o.class) {
                try {
                    mmVar = map.get(str);
                    if (mmVar == null) {
                        mm mmVar3 = new mm(this.m, this.f42151n, this.o0, this.oo, this.om);
                        map.put(str, mmVar3);
                        mmVar = mmVar3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return mmVar;
        }

        private o o(com.thinkup.core.common.o0m.o.o.o oVar) {
            this.oo = oVar;
            return this;
        }

        public final o o() {
            this.om = false;
            return this;
        }

        private o(String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            this.m = str.endsWith("/") ? str : str.concat("/");
            this.f42151n = str2;
        }
    }

    public mm(String str, String str2, com.thinkup.core.common.o0m.o.o.m[] mVarArr, com.thinkup.core.common.o0m.o.o.o oVar, boolean z2) {
        super(str, str2, mVarArr, oVar);
        this.nmn = new int[16];
        this.nn0 = 0;
        this.nnm = false;
        this.nnn = new mo();
        this.o00o = new HashSet();
        this.o00m = new Handler(Looper.getMainLooper()) { // from class: com.thinkup.core.common.o0m.o.mm.2
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                int i2 = message.what;
                if (i2 == 1) {
                    mm.this.nnn.execute(new Runnable() { // from class: com.thinkup.core.common.o0m.o.mm.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            mm.this.ono();
                        }
                    });
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    mm.this.apply();
                }
            }
        };
        this.n0n = new File(str, a.m(str2, ".kva"));
        this.no0 = new File(str, a.m(str2, ".kvb"));
        this.n0m = z2;
        SystemClock.currentThreadTimeMillis();
        mm();
        SystemClock.currentThreadTimeMillis();
    }

    private synchronized void mm() {
        try {
            long jNanoTime = System.nanoTime();
            if (!o0o()) {
                n0();
            }
            if (this.onn == null) {
                this.onn = new om(com.thinkup.core.common.o0m.o.o.o0m);
            }
            if (this.omn == 0) {
                this.omn = 12;
            }
            if (this.m0n) {
                o();
                n("rewrite data");
            }
            if (this.omo != null) {
                n("loading finish, data len:" + this.omn + ", get keys:" + this.ono.size() + ", use time:" + ((System.nanoTime() - jNanoTime) / 1000000) + " ms");
            }
            mn();
        } catch (Throwable th) {
            throw th;
        }
    }

    private void mn() {
        File file;
        if (this.n0m && this.o000 == null && (file = this.no0) != null && file.exists()) {
            this.o000 = new m(this.no0.getPath());
            this.o000.startWatching();
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00d8 A[Catch: all -> 0x009e, TryCatch #2 {all -> 0x009e, blocks: (B:19:0x0067, B:23:0x0077, B:28:0x008c, B:61:0x0163, B:31:0x00a1, B:35:0x00ad, B:37:0x00ba, B:38:0x00c7, B:40:0x00cb, B:42:0x00d1, B:45:0x00d8, B:46:0x00e7, B:48:0x00f0, B:51:0x0108, B:53:0x0118, B:55:0x0120, B:57:0x0145, B:59:0x014b, B:60:0x015b, B:50:0x00fb, B:22:0x0073, B:65:0x016b), top: B:77:0x0067, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x015b A[Catch: all -> 0x009e, TryCatch #2 {all -> 0x009e, blocks: (B:19:0x0067, B:23:0x0077, B:28:0x008c, B:61:0x0163, B:31:0x00a1, B:35:0x00ad, B:37:0x00ba, B:38:0x00c7, B:40:0x00cb, B:42:0x00d1, B:45:0x00d8, B:46:0x00e7, B:48:0x00f0, B:51:0x0108, B:53:0x0118, B:55:0x0120, B:57:0x0145, B:59:0x014b, B:60:0x015b, B:50:0x00fb, B:22:0x0073, B:65:0x016b), top: B:77:0x0067, outer: #1 }] */
    private void n0() {
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            try {
                if (!n0.o(this.n0n) || !n0.o(this.no0)) {
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
                    o(th);
                }
                n();
                return;
            }
        }
        if (this.n0n.exists() && this.no0.exists()) {
            this.noo = new RandomAccessFile(this.n0n, "rw");
            this.nom = new RandomAccessFile(this.no0, "rw");
            long length = this.noo.length();
            long length2 = this.nom.length();
            this.non = this.noo.getChannel();
            FileChannel channel = this.nom.getChannel();
            this.nm0 = channel;
            FileLock fileLockLock = channel.lock();
            try {
                try {
                    MappedByteBuffer map = this.non.map(FileChannel.MapMode.READ_WRITE, 0L, length > 0 ? length : com.thinkup.core.common.o0m.o.o.o0m);
                    this.nmo = map;
                    map.order(ByteOrder.LITTLE_ENDIAN);
                    if (length == 0 && length2 == 0) {
                        this.omn = 12;
                        RandomAccessFile randomAccessFile = this.nom;
                        int i5 = com.thinkup.core.common.o0m.o.o.o0m;
                        randomAccessFile.setLength(i5);
                        this.nm0.truncate(i5);
                    } else if (!o(this.no0)) {
                        this.nn0 = 0;
                        o0();
                        om omVar = this.onn;
                        if (omVar == null || omVar.o.length != this.nmo.capacity()) {
                            this.onn = new om(this.nmo.capacity());
                        }
                        int i6 = this.nmo.getInt();
                        int i7 = (-1073741825) & i6;
                        boolean zM = com.thinkup.core.common.o0m.o.o.m(i6);
                        if (i7 < 0 || i7 > length - 12) {
                            m("both files error");
                            omn();
                        } else {
                            this.omn = i7 + 12;
                            long j = this.nmo.getLong(4);
                            this.nmo.rewind();
                            this.nmo.get(this.onn.o, 0, this.omn);
                            if (j == this.onn.m(12, i7) && o(zM)) {
                                this.on0 = j;
                                m(new Exception("B file error"));
                                nm();
                            } else {
                                m("both files error");
                                omn();
                            }
                        }
                    } else if (length == length2 && this.onn.o.length == this.nmo.capacity()) {
                        byte[] bArr = this.onn.o;
                        int i8 = this.omn;
                        byte[] bArr2 = new byte[i8];
                        this.nmo.get(bArr2, 0, i8);
                        while (true) {
                            i2 = this.omn;
                            if (i3 >= i2 || bArr2[i3] != bArr[i3]) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        if (i3 != i2) {
                            m(new Exception("A file error"));
                            nn();
                        }
                    } else {
                        m(new Exception("A file error"));
                        nn();
                    }
                    no();
                    return;
                } finally {
                    fileLockLock.release();
                }
            } catch (IOException e2) {
                o(e2);
                o(this.n0n, this.no0);
                fileLockLock.release();
                return;
            }
        }
        o(new Exception("open file failed"));
    }

    private void nm() {
        try {
            if (n0.o(this.no0)) {
                oo(this.nmo.capacity());
                m(0, this.omn);
            }
        } catch (Exception e2) {
            o(e2);
        }
    }

    private void nn() {
        try {
            if (o00()) {
                this.nmo.position(0);
                this.nmo.put(this.onn.o, 0, this.omn);
            }
        } catch (Exception e2) {
            o(e2);
        }
    }

    private void no() {
        MappedByteBuffer mappedByteBuffer = this.nmo;
        if (mappedByteBuffer == null || this.omn + 8 >= mappedByteBuffer.capacity()) {
            return;
        }
        this.nno = this.nmo.getLong(this.omn);
    }

    private boolean o00() {
        int length = this.onn.o.length;
        try {
            if (this.noo == null) {
                if (!n0.o(this.n0n)) {
                    return false;
                }
                this.noo = new RandomAccessFile(this.n0n, "rw");
            }
            long j = length;
            if (this.noo.length() != j) {
                this.noo.setLength(j);
            }
            FileChannel fileChannel = this.non;
            if (fileChannel == null) {
                this.non = this.noo.getChannel();
            } else if (fileChannel.size() != j) {
                this.non.truncate(j);
            }
            MappedByteBuffer mappedByteBuffer = this.nmo;
            if (mappedByteBuffer != null && mappedByteBuffer.capacity() == length) {
                return true;
            }
            MappedByteBuffer map = this.non.map(FileChannel.MapMode.READ_WRITE, 0L, j);
            this.nmo = map;
            map.order(ByteOrder.LITTLE_ENDIAN);
            return true;
        } catch (Exception e2) {
            o(e2);
            return false;
        }
    }

    private synchronized void o0m() {
        try {
            if (!this.o00o.isEmpty()) {
                Iterator<String> it = this.o00o.iterator();
                while (it.hasNext()) {
                    oo(it.next());
                }
                this.o00o.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void o0n() {
        try {
            try {
                MappedByteBuffer mappedByteBuffer = this.nmo;
                if (mappedByteBuffer != null) {
                    mappedByteBuffer.force();
                }
                FileChannel fileChannel = this.nm0;
                if (fileChannel != null) {
                    fileChannel.force(true);
                }
            } catch (Exception e2) {
                o(e2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private boolean o0o() {
        File file = new File(this.oom, a.r(new StringBuilder(), this.oon, ".kvc"));
        File file2 = new File(this.oom, a.r(new StringBuilder(), this.oon, ".tmp"));
        boolean z2 = false;
        try {
            if (!file.exists()) {
                file = file2.exists() ? file2 : null;
            }
            if (file != null) {
                if (!o(file)) {
                    n();
                } else if (o(this.onn)) {
                    n("recover from c file");
                    z2 = true;
                }
                m();
            }
            return z2;
        } catch (Exception e2) {
            o(e2);
            return z2;
        }
    }

    private void om0() {
        if (this.nmo == null) {
            return;
        }
        omo();
        no();
        om omVar = this.onn;
        omVar.m = 0;
        int iN = omVar.n();
        int i2 = (-1073741825) & iN;
        boolean zM = com.thinkup.core.common.o0m.o.o.m(iN);
        long jO0 = this.onn.o0();
        this.on0 = jO0;
        this.omn = i2 + 12;
        if (jO0 == this.onn.m(12, i2) && o(zM)) {
            return;
        }
        omn();
    }

    private void omm() throws IOException {
        File file;
        MappedByteBuffer map = this.nmo;
        if (map == null || (file = this.n0n) == null) {
            return;
        }
        int length = (int) file.length();
        if (length <= 0) {
            m("invalid file length");
            return;
        }
        if (this.nmo.capacity() != length) {
            long j = length;
            this.non.truncate(j);
            map = this.non.map(FileChannel.MapMode.READ_WRITE, 0L, j);
            if (map == null) {
                return;
            }
            this.nmo = map;
            map.order(ByteOrder.LITTLE_ENDIAN);
        }
        long j2 = length;
        if (this.nm0.size() != j2) {
            this.nm0.truncate(j2);
        }
        int iCapacity = map.capacity();
        int i2 = map.getInt(0);
        int i3 = (-1073741825) & i2;
        boolean zM = com.thinkup.core.common.o0m.o.o.m(i2);
        if (i3 < 0 || i3 > iCapacity) {
            throw new IllegalStateException(a.g(i3, iCapacity, "Invalid file, dataSize:", ", capacity:"));
        }
        long j3 = map.getLong(4);
        int i4 = i3 + 12;
        long j4 = this.nno;
        if (i4 < map.capacity() - 8) {
            j4 = map.getLong(i4);
        }
        if (i4 == this.omn && j3 == this.on0 && j4 == this.nno) {
            return;
        }
        this.omn = i4;
        this.on0 = j3;
        this.nno = j4;
        HashMap<String, com.thinkup.core.common.o0m.o.m.AbstractC0680m> map2 = this.mn0.isEmpty() ? null : new HashMap<>(this.ono);
        omo();
        if (j3 != this.onn.m(12, i3) || !o(zM)) {
            omn();
        } else if (map2 != null) {
            o(map2);
        }
    }

    private void omn() {
        n();
        try {
            o00();
            this.nmo.putInt(0, o(0));
            this.nmo.putLong(4, 0L);
            no();
            if (n0.o(this.no0)) {
                oo(com.thinkup.core.common.o0m.o.o.o0m);
                m(0, 12);
                mn();
            }
        } catch (Exception e2) {
            o(e2);
            this.nnm = true;
        }
        n0.n(new File(this.oom + this.oon));
        oo((String) null);
    }

    private void omo() {
        this.ono.clear();
        oo();
        int iCapacity = this.nmo.capacity();
        om omVar = this.onn;
        if (omVar == null) {
            this.onn = new om(iCapacity);
        } else if (omVar.o.length != iCapacity) {
            omVar.o = new byte[iCapacity];
        }
        this.nmo.rewind();
        this.nmo.get(this.onn.o, 0, this.omn);
    }

    private void on0() {
        int i2 = com.thinkup.core.common.o0m.o.o.o0m;
        int iO = com.thinkup.core.common.o0m.o.o.o(i2, this.omn + i2);
        byte[] bArr = this.onn.o;
        if (iO >= bArr.length) {
            return;
        }
        byte[] bArr2 = new byte[iO];
        System.arraycopy(bArr, 0, bArr2, 0, this.omn);
        this.onn.o = bArr2;
        try {
            long j = iO;
            this.non.truncate(j);
            MappedByteBuffer map = this.non.map(FileChannel.MapMode.READ_WRITE, 0L, j);
            this.nmo = map;
            map.order(ByteOrder.LITTLE_ENDIAN);
            this.nom.setLength(j);
            this.nm0.truncate(j);
        } catch (Exception e2) {
            o(new Exception("map failed", e2));
            this.nnm = true;
        }
        n("truncate finish");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void ono() {
        on();
        oon();
    }

    private void oo(int i2) throws IOException {
        if (this.nom == null) {
            this.nom = new RandomAccessFile(this.no0, "rw");
        }
        if (this.nm0 == null) {
            this.nm0 = this.nom.getChannel();
        }
        long j = i2;
        if (this.nm0.size() != j) {
            this.nom.setLength(j);
            this.nm0.truncate(j);
        }
    }

    private boolean oo0() {
        om omVar = this.onn;
        omVar.m = 0;
        int iN = omVar.n() & (-1073741825);
        long jO0 = this.onn.o0();
        this.on0 = jO0;
        this.omn = iN + 12;
        if (jO0 == this.onn.m(12, iN)) {
            return o(this.onn);
        }
        omn();
        return true;
    }

    private void oom() {
        while (this.mm0.o()) {
            try {
                Thread.sleep(10L);
            } catch (Exception unused) {
            }
        }
    }

    private synchronized void oon() {
        FileLock fileLock = this.nmm;
        if (fileLock != null) {
            try {
                fileLock.release();
            } catch (Exception e2) {
                o(e2);
            }
            this.nmm = null;
            this.o00m.removeMessages(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean ooo() {
        if (this.nmm == null) {
            return false;
        }
        if (this.onn == null || (this.nn0 == 0 && !this.nnm)) {
            oon();
            return false;
        }
        try {
            int iO = o(this.omn - 12);
            this.onn.o(0, iO);
            this.onn.o(4, this.on0);
            if (this.nnm) {
                boolean zOo0 = oo0();
                if (zOo0) {
                    this.nnm = false;
                }
                this.nn0 = 0;
                if (!this.m0m.isEmpty()) {
                    this.m0m.clear();
                }
                oom();
                oon();
                o0m();
                return zOo0;
            }
            if (!o00()) {
                MappedByteBuffer mappedByteBuffer = this.nmo;
                if (mappedByteBuffer == null) {
                    this.nnm = true;
                } else if (mappedByteBuffer != null) {
                    omo();
                    no();
                    om omVar = this.onn;
                    omVar.m = 0;
                    int iN = omVar.n();
                    int i2 = (-1073741825) & iN;
                    boolean zM = com.thinkup.core.common.o0m.o.o.m(iN);
                    long jO0 = this.onn.o0();
                    this.on0 = jO0;
                    this.omn = i2 + 12;
                    if (jO0 != this.onn.m(12, i2) || !o(zM)) {
                        omn();
                    }
                }
                this.nn0 = 0;
                if (!this.m0m.isEmpty()) {
                    this.m0m.clear();
                }
                oom();
                oon();
                o0m();
                return false;
            }
            oo(this.nmo.capacity());
            this.nmo.putInt(0, iO);
            this.nmo.putLong(4, this.on0);
            for (int i3 = 0; i3 < this.nn0; i3 += 2) {
                int[] iArr = this.nmn;
                int i4 = iArr[i3];
                int i5 = iArr[i3 + 1];
                byte[] bArr = this.onn.o;
                this.nmo.position(i4);
                this.nmo.put(bArr, i4, i5);
            }
            if (this.omn + 8 < this.nmo.capacity()) {
                long jNextLong = n0o.nextLong() ^ System.nanoTime();
                this.nno = jNextLong;
                this.nmo.putLong(this.omn, jNextLong);
            }
            m(0, 12);
            for (int i6 = 0; i6 < this.nn0; i6 += 2) {
                int[] iArr2 = this.nmn;
                m(iArr2[i6], iArr2[i6 + 1]);
            }
            if (!this.m0m.isEmpty()) {
                Iterator<String> it = this.m0m.iterator();
                while (it.hasNext()) {
                    o(it.next());
                }
            }
            int length = this.onn.o.length;
            int i7 = this.omn;
            if (length - i7 > com.thinkup.core.common.o0m.o.o.o0n) {
                int i8 = com.thinkup.core.common.o0m.o.o.o0m;
                int iO2 = com.thinkup.core.common.o0m.o.o.o(i8, i7 + i8);
                byte[] bArr2 = this.onn.o;
                if (iO2 < bArr2.length) {
                    byte[] bArr3 = new byte[iO2];
                    System.arraycopy(bArr2, 0, bArr3, 0, this.omn);
                    this.onn.o = bArr3;
                    try {
                        long j = iO2;
                        this.non.truncate(j);
                        MappedByteBuffer map = this.non.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                        this.nmo = map;
                        map.order(ByteOrder.LITTLE_ENDIAN);
                        this.nom.setLength(j);
                        this.nm0.truncate(j);
                    } catch (Exception e2) {
                        o(new Exception("map failed", e2));
                        this.nnm = true;
                    }
                    n("truncate finish");
                }
            }
            this.nn0 = 0;
            if (!this.m0m.isEmpty()) {
                this.m0m.clear();
            }
            oom();
            oon();
            o0m();
            return true;
        } catch (Throwable th) {
            try {
                if (th instanceof Exception) {
                    o(th);
                }
                this.nnm = true;
                return false;
            } finally {
                this.nn0 = 0;
                if (!this.m0m.isEmpty()) {
                    this.m0m.clear();
                }
                oom();
                oon();
                o0m();
            }
        }
        throw th;
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        this.mmo.execute(new Runnable() { // from class: com.thinkup.core.common.o0m.o.mm.1
            @Override // java.lang.Runnable
            public final void run() {
                mm.this.ooo();
            }
        });
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor clear() {
        on();
        omn();
        oon();
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        return ooo();
    }

    @Override // com.thinkup.core.common.o0m.o.o
    public final void m0() {
        if (this.mmm >= om() || this.mmn.size() >= 80) {
            n(0);
        }
    }

    @Override // com.thinkup.core.common.o0m.o.o
    public final void mo() {
        this.on0 ^= this.onn.m(this.m00, this.m0o);
        int i2 = this.m0o;
        if (i2 != 0) {
            o0(this.m00, i2);
            this.m0o = 0;
        }
    }

    @Override // com.thinkup.core.common.o0m.o.o
    public final void om(String str) {
        if (this.mn0.isEmpty()) {
            return;
        }
        this.o00o.add(str);
    }

    @Override // com.thinkup.core.common.o0m.o.o
    public final void on() {
        if (this.nmm != null) {
            return;
        }
        if (this.nm0 == null) {
            n0();
            mn();
        }
        FileChannel fileChannel = this.nm0;
        if (fileChannel != null) {
            try {
                this.nmm = fileChannel.lock();
                try {
                    omm();
                } finally {
                    this.o00m.sendEmptyMessageDelayed(2, com.smartdigimkt.u2.m.D0);
                }
            } catch (Exception e2) {
                o(e2);
            }
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor remove(String str) {
        try {
            on();
            om(str);
            com.thinkup.core.common.o0m.o.m.AbstractC0680m abstractC0680m = this.ono.get(str);
            if (abstractC0680m != null) {
                this.ono.remove(str);
                this.mon.m(str);
                this.mom.m(str);
                byte bO = abstractC0680m.o();
                String str2 = null;
                if (bO <= 5) {
                    int iM = om.m(str);
                    int i2 = abstractC0680m.o;
                    o(bO, i2 - (iM + 2), i2 + com.thinkup.core.common.o0m.o.o.nn[bO]);
                } else {
                    com.thinkup.core.common.o0m.o.m.mm mmVar = (com.thinkup.core.common.o0m.o.m.mm) abstractC0680m;
                    o(bO, mmVar.o0, mmVar.o + mmVar.oo);
                    if (mmVar.om) {
                        str2 = (String) mmVar.f42149n;
                    }
                }
                if (str2 != null) {
                    this.m0m.add(str2);
                }
                m0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final String toString() {
        return "MPFastKV: path:" + this.oom + " name:" + this.oon;
    }

    private void m(int i2, int i3) throws IOException {
        MappedByteBuffer mappedByteBuffer = this.nmo;
        mappedByteBuffer.position(i2);
        mappedByteBuffer.limit(i3 + i2);
        if (this.nm0.size() != mappedByteBuffer.capacity()) {
            this.nm0.truncate(mappedByteBuffer.capacity());
        }
        this.nm0.position(i2);
        while (mappedByteBuffer.hasRemaining()) {
            this.nm0.write(mappedByteBuffer);
        }
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    private void n(int i2, int i3) {
        byte[] bArr = this.onn.o;
        this.nmo.position(i2);
        this.nmo.put(bArr, i2, i3);
    }

    @Override // com.thinkup.core.common.o0m.o.o
    public final void o(on onVar) {
        o(onVar.onn);
    }

    @Override // com.thinkup.core.common.o0m.o.o
    public final void o0() {
        super.o0();
        this.nno = 0L;
    }

    private boolean o(om omVar) {
        int length = omVar.o.length;
        try {
            if (n0.o(this.n0n) && n0.o(this.no0)) {
                if (this.nom == null) {
                    this.nom = new RandomAccessFile(this.no0, "rw");
                }
                if (this.nm0 == null) {
                    this.nm0 = this.nom.getChannel();
                }
                FileLock fileLockLock = this.nmm == null ? this.nm0.lock() : null;
                try {
                    o00();
                    this.nmo.put(omVar.o, 0, this.omn);
                    no();
                    long j = length;
                    if (this.nom.length() != j) {
                        this.nom.setLength(j);
                    }
                    this.nm0.truncate(j);
                    m(0, this.omn);
                    this.nm0.force(false);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    mn();
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
            o(e2);
            return false;
        }
    }

    private void o0(int i2, int i3) {
        int i4 = this.nn0;
        int[] iArr = this.nmn;
        int length = iArr.length;
        if ((i4 << 1) >= length) {
            int[] iArr2 = new int[length << 1];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.nmn = iArr2;
        }
        int[] iArr3 = this.nmn;
        iArr3[i4] = i2;
        iArr3[i4 + 1] = i3;
        this.nn0 = i4 + 2;
    }

    @Override // com.thinkup.core.common.o0m.o.o
    public final void on(String str) {
        this.m0m.add(str);
    }

    @Override // com.thinkup.core.common.o0m.o.o
    public final void o0(int i2) {
        int length = this.onn.o.length;
        int i3 = this.omn + i2 + 8;
        if (i3 >= length) {
            byte[] bArr = new byte[com.thinkup.core.common.o0m.o.o.o(length, i3)];
            System.arraycopy(this.onn.o, 0, bArr, 0, this.omn);
            this.onn.o = bArr;
        }
    }

    private void o(HashMap<String, com.thinkup.core.common.o0m.o.m.AbstractC0680m> map) {
        HashSet hashSet = new HashSet(this.ono.keySet());
        HashSet hashSet2 = new HashSet(map.keySet());
        HashSet<String> hashSet3 = new HashSet(hashSet);
        hashSet3.retainAll(hashSet2);
        hashSet.removeAll(hashSet3);
        hashSet2.removeAll(hashSet3);
        this.o00o.addAll(hashSet);
        this.o00o.addAll(hashSet2);
        for (String str : hashSet3) {
            com.thinkup.core.common.o0m.o.m.AbstractC0680m abstractC0680m = map.get(str);
            com.thinkup.core.common.o0m.o.m.AbstractC0680m abstractC0680m2 = this.ono.get(str);
            if (abstractC0680m != null && !abstractC0680m.o(abstractC0680m2)) {
                this.o00o.add(str);
            }
        }
        if (this.o00o.isEmpty()) {
            return;
        }
        o0m();
    }

    @Override // com.thinkup.core.common.o0m.o.o
    public final void o(byte b2, int i2) {
        this.on0 ^= com.thinkup.core.common.o0m.o.o.o(1L, i2);
        this.onn.o[i2] = b2;
        o0(i2, 1);
    }

    @Override // com.thinkup.core.common.o0m.o.o
    public final void o(int i2, long j, int i3) {
        this.on0 = com.thinkup.core.common.o0m.o.o.o(j, i3) ^ this.on0;
        this.onn.o(i3, i2);
        o0(i3, 4);
    }

    @Override // com.thinkup.core.common.o0m.o.o
    public final void o(long j, long j2, int i2) {
        this.on0 = com.thinkup.core.common.o0m.o.o.o(j2, i2) ^ this.on0;
        this.onn.o(i2, j);
        o0(i2, 8);
    }

    @Override // com.thinkup.core.common.o0m.o.o
    public final void o(int i2, byte[] bArr) {
        super.o(i2, bArr);
        o0(i2, bArr.length);
    }

    @Override // com.thinkup.core.common.o0m.o.o
    public final void o(byte b2, int i2, int i3) {
        super.o(b2, i2, i3);
        o0(i2, 1);
    }

    @Override // com.thinkup.core.common.o0m.o.o
    public final void o(int i2, int i3, int i4) {
        for (int i5 = 0; i5 < this.nn0; i5 += 2) {
            int i6 = this.nmn[i5];
            if (i6 < i2) {
                i2 = i6;
            }
        }
        int[] iArr = this.nmn;
        iArr[0] = i2;
        iArr[1] = this.omn - i2;
        this.nn0 = 2;
    }
}

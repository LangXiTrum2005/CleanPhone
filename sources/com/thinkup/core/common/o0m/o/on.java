package com.thinkup.core.common.o0m.o;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.media.a;
import android.text.TextUtils;
import com.thinkup.core.common.n.o0n;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class on extends com.thinkup.core.common.o0m.o.o {
    public static final int mnm = 1;
    public static final int mnn = 2;
    public static final int mno = 0;
    private static final String n0o = "on";
    boolean n00;
    private FileChannel n0m;
    private FileChannel n0n;
    private MappedByteBuffer no0;
    private int nom;
    private int non;
    private MappedByteBuffer noo;

    public static final class o {
        static final Map<String, on> o = new ConcurrentHashMap();
        private String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f42157n;
        private com.thinkup.core.common.o0m.o.o.m[] o0;
        private int om = 0;
        private com.thinkup.core.common.o0m.o.o.o oo;

        private o(Context context, String str) {
            if (context == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.m = context.getFilesDir().getAbsolutePath() + "/tktp/";
            this.f42157n = str;
        }

        private o m() {
            this.om = 1;
            return this;
        }

        private on n() {
            on onVar;
            String str = this.m + this.f42157n;
            Map<String, on> map = o;
            on onVar2 = map.get(str);
            if (onVar2 != null) {
                return onVar2;
            }
            synchronized (o.class) {
                try {
                    onVar = map.get(str);
                    if (onVar == null) {
                        on onVar3 = new on(this.m, this.f42157n, this.o0, this.oo, this.om);
                        map.put(str, onVar3);
                        onVar = onVar3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return onVar;
        }

        private o o(com.thinkup.core.common.o0m.o.o.m[] mVarArr) {
            this.o0 = mVarArr;
            return this;
        }

        private o o(com.thinkup.core.common.o0m.o.o.o oVar) {
            this.oo = oVar;
            return this;
        }

        private o o() {
            this.om = 2;
            return this;
        }

        private o(String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            this.m = str.endsWith("/") ? str : str.concat("/");
            this.f42157n = str2;
        }
    }

    public on(String str, String str2, com.thinkup.core.common.o0m.o.o.m[] mVarArr, com.thinkup.core.common.o0m.o.o.o oVar, int i2) {
        super(str, str2, mVarArr, oVar);
        this.n00 = true;
        this.non = i2;
        mn();
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0156  */
    /* JADX WARN: Code duplicated, block: B:64:0x01bd A[Catch: all -> 0x00cd, Exception -> 0x013e, TryCatch #2 {Exception -> 0x013e, blocks: (B:41:0x010b, B:43:0x012b, B:45:0x0131, B:47:0x0137, B:52:0x0141, B:54:0x0158, B:56:0x015f, B:58:0x0178, B:59:0x0185, B:61:0x01a1, B:63:0x01a7, B:64:0x01bd, B:69:0x01cf, B:70:0x01db), top: B:92:0x0049 }] */
    private synchronized void mn() {
        try {
            long jNanoTime = System.nanoTime();
            if (nm() || this.non != 0) {
                jNanoTime = jNanoTime;
            } else {
                File file = new File(this.oom, this.oon + ".kva");
                File file2 = new File(this.oom, this.oon + ".kvb");
                try {
                    try {
                        if (n0.o(file) && n0.o(file2)) {
                            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                            long length = randomAccessFile.length();
                            long length2 = randomAccessFile2.length();
                            this.n0m = randomAccessFile.getChannel();
                            this.n0n = randomAccessFile2.getChannel();
                            try {
                                FileChannel fileChannel = this.n0m;
                                FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                                MappedByteBuffer map = fileChannel.map(mapMode, 0L, length > 0 ? length : com.thinkup.core.common.o0m.o.o.o0m);
                                this.no0 = map;
                                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                map.order(byteOrder);
                                try {
                                    MappedByteBuffer map2 = this.n0n.map(mapMode, 0L, length2 > 0 ? length2 : com.thinkup.core.common.o0m.o.o.o0m);
                                    this.noo = map2;
                                    map2.order(byteOrder);
                                    this.onn = new om(this.no0.capacity());
                                    if (length == 0 && length2 == 0) {
                                        this.omn = 12;
                                        jNanoTime = jNanoTime;
                                    } else {
                                        int i2 = this.no0.getInt();
                                        int i3 = i2 & (-1073741825);
                                        boolean zM = com.thinkup.core.common.o0m.o.o.m(i2);
                                        long j = this.no0.getLong();
                                        int i4 = this.noo.getInt();
                                        int i5 = (-1073741825) & i4;
                                        boolean zM2 = com.thinkup.core.common.o0m.o.o.m(i4);
                                        long j2 = this.noo.getLong();
                                        jNanoTime = jNanoTime;
                                        if (i3 >= 0 && i3 <= length - 12) {
                                            this.omn = i3 + 12;
                                            this.no0.rewind();
                                            this.no0.get(this.onn.o, 0, this.omn);
                                            if (j == this.onn.m(12, i3) && o(zM)) {
                                                this.on0 = j;
                                                if (length != length2 || !no()) {
                                                    m(new Exception("B file error"));
                                                    o(this.no0, this.noo, this.omn);
                                                }
                                            } else if (i5 >= 0) {
                                                m("both files error");
                                                oom();
                                            } else {
                                                m("both files error");
                                                oom();
                                            }
                                        } else if (i5 >= 0 || i5 > length2 - 12) {
                                            m("both files error");
                                            oom();
                                        } else {
                                            this.ono.clear();
                                            oo();
                                            this.omn = i5 + 12;
                                            if (this.onn.o.length != this.noo.capacity()) {
                                                this.onn = new om(this.noo.capacity());
                                            }
                                            this.noo.rewind();
                                            this.noo.get(this.onn.o, 0, this.omn);
                                            if (j2 == this.onn.m(12, i5) && o(zM2)) {
                                                m(new Exception("A file error"));
                                                o(this.noo, this.no0, this.omn);
                                                this.on0 = j2;
                                            } else {
                                                m("both files error");
                                                oom();
                                            }
                                        }
                                    }
                                } catch (IOException e2) {
                                    e = e2;
                                    o(e);
                                    ooo();
                                    o(file, file2);
                                }
                            } catch (IOException e3) {
                                e = e3;
                                file = file;
                            }
                        } else {
                            jNanoTime = jNanoTime;
                            o(new Exception("open file failed"));
                            ooo();
                        }
                    } catch (Exception e4) {
                        e = e4;
                        o(e);
                        n();
                        ooo();
                    }
                } catch (Exception e5) {
                    e = e5;
                    jNanoTime = jNanoTime;
                }
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
        } catch (Throwable th) {
            throw th;
        }
    }

    private void n0() {
        long j;
        File file = new File(this.oom, a.r(new StringBuilder(), this.oon, ".kva"));
        File file2 = new File(this.oom, a.r(new StringBuilder(), this.oon, ".kvb"));
        try {
            if (n0.o(file) && n0.o(file2)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                long length = randomAccessFile.length();
                long length2 = randomAccessFile2.length();
                this.n0m = randomAccessFile.getChannel();
                this.n0n = randomAccessFile2.getChannel();
                try {
                    FileChannel fileChannel = this.n0m;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    MappedByteBuffer map = fileChannel.map(mapMode, 0L, length > 0 ? length : com.thinkup.core.common.o0m.o.o.o0m);
                    this.no0 = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    MappedByteBuffer map2 = this.n0n.map(mapMode, 0L, length2 > 0 ? length2 : com.thinkup.core.common.o0m.o.o.o0m);
                    this.noo = map2;
                    map2.order(byteOrder);
                    this.onn = new om(this.no0.capacity());
                    if (length == 0 && length2 == 0) {
                        this.omn = 12;
                        return;
                    }
                    int i2 = this.no0.getInt();
                    int i3 = i2 & (-1073741825);
                    boolean zM = com.thinkup.core.common.o0m.o.o.m(i2);
                    long j2 = this.no0.getLong();
                    int i4 = this.noo.getInt();
                    int i5 = (-1073741825) & i4;
                    boolean zM2 = com.thinkup.core.common.o0m.o.o.m(i4);
                    long j3 = this.noo.getLong();
                    if (i3 < 0 || i3 > length - 12) {
                        j = 12;
                    } else {
                        this.omn = i3 + 12;
                        this.no0.rewind();
                        j = 12;
                        this.no0.get(this.onn.o, 0, this.omn);
                        if (j2 == this.onn.m(12, i3) && o(zM)) {
                            this.on0 = j2;
                            if (length == length2 && no()) {
                                return;
                            }
                            m(new Exception("B file error"));
                            o(this.no0, this.noo, this.omn);
                            return;
                        }
                    }
                    if (i5 >= 0 && i5 <= length2 - j) {
                        this.ono.clear();
                        oo();
                        this.omn = i5 + 12;
                        if (this.onn.o.length != this.noo.capacity()) {
                            this.onn = new om(this.noo.capacity());
                        }
                        this.noo.rewind();
                        this.noo.get(this.onn.o, 0, this.omn);
                        if (j3 == this.onn.m(12, i5) && o(zM2)) {
                            m(new Exception("A file error"));
                            o(this.noo, this.no0, this.omn);
                            this.on0 = j3;
                            return;
                        }
                    }
                    m("both files error");
                    oom();
                    return;
                } catch (IOException e2) {
                    o(e2);
                    ooo();
                    o(file, file2);
                    return;
                }
            }
            o(new Exception("open file failed"));
            ooo();
        } catch (Exception e3) {
            o(e3);
            n();
            ooo();
        }
    }

    private boolean nm() {
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
                    m();
                    return false;
                }
                if (this.non == 0) {
                    if (!o(this.onn)) {
                        this.non = 1;
                        return false;
                    }
                    n("recover from c file");
                    try {
                        m();
                        return true;
                    } catch (Exception e2) {
                        e = e2;
                        z2 = true;
                        o(e);
                        return z2;
                    }
                }
            } else if (this.non != 0) {
                File file3 = new File(this.oom, this.oon + ".kva");
                File file4 = new File(this.oom, this.oon + ".kvb");
                if (file3.exists() && file4.exists()) {
                    o(file3, file4);
                }
            }
            return false;
        } catch (Exception e3) {
            e = e3;
        }
    }

    private synchronized void nn() {
        if (this.mo0) {
            return;
        }
        if (this.non == 0) {
            this.no0.force();
            this.noo.force();
        }
    }

    private boolean no() {
        om omVar = new om(this.omn);
        this.noo.rewind();
        this.noo.get(omVar.o, 0, this.omn);
        byte[] bArr = this.onn.o;
        byte[] bArr2 = omVar.o;
        for (int i2 = 0; i2 < this.omn; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private synchronized void o00() {
        this.n00 = false;
    }

    private boolean o0m() {
        int i2 = this.non;
        if (i2 == 1) {
            this.mmo.execute(new Runnable() { // from class: com.thinkup.core.common.o0m.o.on.1
                @Override // java.lang.Runnable
                public final void run() {
                    on.this.o0n();
                }
            });
        } else if (i2 == 2) {
            return o0n();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean o0n() {
        try {
            File file = new File(this.oom, this.oon + ".tmp");
            if (n0.o(file)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    randomAccessFile.setLength(this.omn);
                    randomAccessFile.write(this.onn.o, 0, this.omn);
                    randomAccessFile.getFD().sync();
                    randomAccessFile.close();
                    if (n0.o(file, new File(this.oom, this.oon + ".kvc"))) {
                        oo0();
                        return true;
                    }
                    m(new Exception("rename failed"));
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
            o(e2);
        }
        return false;
    }

    private void o0o() {
        if (this.non == 0 || !this.n00) {
            return;
        }
        o0m();
    }

    private void oo(int i2) {
        int i3 = com.thinkup.core.common.o0m.o.o.o0m;
        int iO = com.thinkup.core.common.o0m.o.o.o(i3, i2 + i3);
        byte[] bArr = this.onn.o;
        if (iO >= bArr.length) {
            return;
        }
        byte[] bArr2 = new byte[iO];
        System.arraycopy(bArr, 0, bArr2, 0, this.omn);
        this.onn.o = bArr2;
        if (this.non == 0) {
            try {
                long j = iO;
                this.n0m.truncate(j);
                FileChannel fileChannel = this.n0m;
                FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                MappedByteBuffer map = fileChannel.map(mapMode, 0L, j);
                this.no0 = map;
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                map.order(byteOrder);
                this.n0n.truncate(j);
                MappedByteBuffer map2 = this.n0n.map(mapMode, 0L, j);
                this.noo = map2;
                map2.order(byteOrder);
            } catch (Exception e2) {
                o(new Exception("map failed", e2));
                ooo();
            }
        }
        n("truncate finish");
    }

    private void oo0() {
        if (this.m0m.isEmpty()) {
            return;
        }
        Iterator<String> it = this.m0m.iterator();
        while (it.hasNext()) {
            o(it.next());
        }
        this.m0m.clear();
    }

    private void oom() {
        if (this.non == 0) {
            try {
                o(this.no0);
                o(this.noo);
            } catch (Exception unused) {
                ooo();
            }
        }
        n();
        n0.n(new File(this.oom + this.oon));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private synchronized void oon() {
        if (this.mo0) {
            return;
        }
        this.mo0 = true;
        if (this.non != 0) {
            synchronized (o.class) {
                o.o.remove(this.oom + this.oon);
                return;
            }
        }
        try {
            this.n0m.force(true);
            this.n0m.close();
            this.n0n.force(true);
            this.n0n.close();
        } catch (Exception e2) {
            o(e2);
        }
        synchronized (o.class) {
            o.o.remove(this.oom + this.oon);
        }
        return;
        throw th;
    }

    private void ooo() {
        this.non = 1;
        n0.o(this.n0m);
        n0.o(this.n0n);
        this.n0m = null;
        this.n0n = null;
        this.no0 = null;
        this.noo = null;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized void apply() {
        if (this.mo0) {
            return;
        }
        this.n00 = true;
        o0m();
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor clear() {
        try {
            if (this.mo0) {
                return this;
            }
            oom();
            if (this.non != 0) {
                m();
            }
            oo((String) null);
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized boolean commit() {
        if (this.mo0) {
            return false;
        }
        this.n00 = true;
        return o0m();
    }

    @Override // com.thinkup.core.common.o0m.o.o
    public final void m0() {
        if (this.mmm < (om() << 1)) {
            if (this.mmn.size() < (this.omn < 16384 ? 80 : 160)) {
                return;
            }
        }
        n(0);
    }

    public final int mm() {
        return this.non;
    }

    @Override // com.thinkup.core.common.o0m.o.o
    public final void mo() {
        this.on0 ^= this.onn.m(this.m00, this.m0o);
        int iO = o(this.omn - 12);
        if (this.non == 0) {
            this.no0.putInt(0, -1);
            m(this.no0);
            this.no0.putInt(0, iO);
            this.noo.putInt(0, iO);
            m(this.noo);
        } else {
            this.onn.o(0, iO);
            this.onn.o(4, this.on0);
        }
        this.nom = 0;
        this.m0o = 0;
    }

    @Override // com.thinkup.core.common.o0m.o.o
    public final void o(on onVar) {
        MappedByteBuffer mappedByteBuffer;
        om omVar = onVar.onn;
        if (this.non == 0) {
            int length = omVar.o.length;
            MappedByteBuffer mappedByteBuffer2 = this.no0;
            if (mappedByteBuffer2 != null && mappedByteBuffer2.capacity() == length && (mappedByteBuffer = this.noo) != null && mappedByteBuffer.capacity() == length) {
                this.no0.position(0);
                this.no0.put(omVar.o, 0, this.omn);
                this.noo.position(0);
                this.noo.put(omVar.o, 0, this.omn);
            } else if (!o(omVar)) {
                this.non = 1;
            }
        }
        if (this.non != 0) {
            o0n();
        }
    }

    @Override // com.thinkup.core.common.o0m.o.o
    public final void o0(int i2) {
        int length = this.onn.o.length;
        int i3 = this.omn + i2;
        if (i3 >= length) {
            int i4 = this.mmm;
            if (i4 > i2 && i4 > om()) {
                n(i2);
                return;
            }
            int iO = com.thinkup.core.common.o0m.o.o.o(length, i3);
            byte[] bArr = new byte[iO];
            System.arraycopy(this.onn.o, 0, bArr, 0, this.omn);
            this.onn.o = bArr;
            if (this.non == 0) {
                try {
                    FileChannel fileChannel = this.n0m;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    long j = iO;
                    MappedByteBuffer map = fileChannel.map(mapMode, 0L, j);
                    this.no0 = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    MappedByteBuffer map2 = this.n0n.map(mapMode, 0L, j);
                    this.noo = map2;
                    map2.order(byteOrder);
                } catch (IOException e2) {
                    o(new Exception("map failed", e2));
                    this.onn.o(0, o(this.omn - 12));
                    this.onn.o(4, this.on0);
                    ooo();
                }
            }
        }
    }

    @Override // com.thinkup.core.common.o0m.o.o
    public final void om(String str) {
        o0o();
        oo(str);
    }

    @Override // com.thinkup.core.common.o0m.o.o
    public final void on(String str) {
        if (this.non == 0) {
            o(str);
        } else {
            this.m0m.add(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005a A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0011, B:11:0x0027, B:18:0x0052, B:20:0x005a, B:22:0x007e, B:24:0x0083, B:26:0x0087, B:27:0x008b, B:28:0x0090, B:21:0x0077, B:14:0x003c, B:16:0x004c), top: B:33:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0077 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0011, B:11:0x0027, B:18:0x0052, B:20:0x005a, B:22:0x007e, B:24:0x0083, B:26:0x0087, B:27:0x008b, B:28:0x0090, B:21:0x0077, B:14:0x003c, B:16:0x004c), top: B:33:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0083 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0011, B:11:0x0027, B:18:0x0052, B:20:0x005a, B:22:0x007e, B:24:0x0083, B:26:0x0087, B:27:0x008b, B:28:0x0090, B:21:0x0077, B:14:0x003c, B:16:0x004c), top: B:33:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0087 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0011, B:11:0x0027, B:18:0x0052, B:20:0x005a, B:22:0x007e, B:24:0x0083, B:26:0x0087, B:27:0x008b, B:28:0x0090, B:21:0x0077, B:14:0x003c, B:16:0x004c), top: B:33:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x008b A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0011, B:11:0x0027, B:18:0x0052, B:20:0x005a, B:22:0x007e, B:24:0x0083, B:26:0x0087, B:27:0x008b, B:28:0x0090, B:21:0x0077, B:14:0x003c, B:16:0x004c), top: B:33:0x0001 }] */
    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor remove(String str) {
        String str2;
        byte b2;
        try {
            if (this.mo0) {
                return this;
            }
            m.AbstractC0680m abstractC0680m = this.ono.get(str);
            if (abstractC0680m != null) {
                this.ono.remove(str);
                this.mon.m(str);
                this.mom.m(str);
                byte bO = abstractC0680m.o();
                if (bO <= 5) {
                    int iM = om.m(str);
                    int i2 = abstractC0680m.o;
                    o(bO, i2 - (iM + 2), i2 + com.thinkup.core.common.o0m.o.o.nn[bO]);
                } else {
                    m.mm mmVar = (m.mm) abstractC0680m;
                    o(bO, mmVar.o0, mmVar.o + mmVar.oo);
                    str2 = mmVar.om ? (String) mmVar.f42149n : null;
                    b2 = (byte) (bO | (-128));
                    if (this.non == 0) {
                        this.no0.putLong(4, this.on0);
                        this.no0.put(this.nom, b2);
                        this.noo.putLong(4, this.on0);
                        this.noo.put(this.nom, b2);
                    } else {
                        this.onn.o(4, this.on0);
                    }
                    this.nom = 0;
                    if (str2 != null) {
                        if (this.non == 0) {
                            o(str2);
                        } else {
                            this.m0m.add(str2);
                        }
                    }
                    m0();
                    o0o();
                }
                b2 = (byte) (bO | (-128));
                if (this.non == 0) {
                    this.no0.putLong(4, this.on0);
                    this.no0.put(this.nom, b2);
                    this.noo.putLong(4, this.on0);
                    this.noo.put(this.nom, b2);
                } else {
                    this.onn.o(4, this.on0);
                }
                this.nom = 0;
                if (str2 != null) {
                    if (this.non == 0) {
                        o(str2);
                    } else {
                        this.m0m.add(str2);
                    }
                }
                m0();
                o0o();
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String toString() {
        return "FastKV: path:" + this.oom + " name:" + this.oon;
    }

    private void m(MappedByteBuffer mappedByteBuffer) {
        try {
            if (mappedByteBuffer.capacity() < 12) {
                throw new IllegalArgumentException("Buffer capacity too small for checksum");
            }
            mappedByteBuffer.putLong(4, this.on0);
            int i2 = this.nom;
            if (i2 != 0) {
                if (i2 < 0 || i2 >= mappedByteBuffer.capacity()) {
                    throw new IllegalArgumentException("removeStart out of bounds: " + this.nom);
                }
                int i3 = this.nom;
                byte[] bArr = this.onn.o;
                if (i3 >= bArr.length) {
                    throw new IllegalArgumentException("fastBuffer.hb index out of bounds: " + this.nom);
                }
                mappedByteBuffer.put(i3, bArr[i3]);
            }
            int i4 = this.m0o;
            if (i4 != 0) {
                int i5 = this.m00;
                if (i5 < 0 || i4 < 0 || i4 + i5 > this.onn.o.length) {
                    throw new IllegalArgumentException("Invalid update range");
                }
                if (i5 <= mappedByteBuffer.capacity()) {
                    int iCapacity = mappedByteBuffer.capacity();
                    int i6 = this.m00;
                    if (iCapacity - i6 >= this.m0o) {
                        mappedByteBuffer.position(i6);
                        mappedByteBuffer.put(this.onn.o, this.m00, this.m0o);
                        return;
                    }
                }
                throw new IllegalArgumentException("buffer capacity overflow");
            }
        } catch (Throwable th) {
            com.thinkup.core.common.oo0.oo.m("sp_mmap_error", "spName: " + this.oon + " errorMsg: " + th.getMessage(), o0n.m().o0m());
        }
    }

    private boolean o(om omVar) {
        Exception exc;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        try {
            int length = omVar.o.length;
            File file = new File(this.oom, this.oon + ".kva");
            File file2 = new File(this.oom, this.oon + ".kvb");
            if (n0.o(file) && n0.o(file2)) {
                randomAccessFile2 = new RandomAccessFile(file, "rw");
                long j = length;
                try {
                    randomAccessFile2.setLength(j);
                    FileChannel channel = randomAccessFile2.getChannel();
                    this.n0m = channel;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    MappedByteBuffer map = channel.map(mapMode, 0L, j);
                    this.no0 = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    this.no0.put(omVar.o, 0, this.omn);
                    randomAccessFile = new RandomAccessFile(file2, "rw");
                    try {
                        randomAccessFile.setLength(j);
                        FileChannel channel2 = randomAccessFile.getChannel();
                        this.n0n = channel2;
                        MappedByteBuffer map2 = channel2.map(mapMode, 0L, j);
                        this.noo = map2;
                        map2.order(byteOrder);
                        this.noo.put(omVar.o, 0, this.omn);
                        return true;
                    } catch (Exception e2) {
                        exc = e2;
                        n0.o(randomAccessFile2);
                        n0.o(randomAccessFile);
                        this.n0m = null;
                        this.n0n = null;
                        this.no0 = null;
                        this.noo = null;
                        o(exc);
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

    private void o(MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, int i2) {
        if (mappedByteBuffer.capacity() != mappedByteBuffer2.capacity()) {
            try {
                MappedByteBuffer map = (mappedByteBuffer2 == this.noo ? this.n0n : this.n0m).map(FileChannel.MapMode.READ_WRITE, 0L, mappedByteBuffer.capacity());
                map.order(ByteOrder.LITTLE_ENDIAN);
                if (mappedByteBuffer2 == this.noo) {
                    this.noo = map;
                } else {
                    this.no0 = map;
                }
                mappedByteBuffer2 = map;
            } catch (IOException e2) {
                o(e2);
                ooo();
                return;
            }
        }
        mappedByteBuffer.rewind();
        mappedByteBuffer2.rewind();
        mappedByteBuffer.limit(i2);
        mappedByteBuffer2.put(mappedByteBuffer);
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    @Override // com.thinkup.core.common.o0m.o.o
    public final synchronized void o(Map<String, Object> map, Map<Class, com.thinkup.core.common.o0m.o.o.m> map2) {
        try {
            if (this.mo0) {
                return;
            }
            if (this.non != 0) {
                this.n00 = false;
            }
            super.o(map, map2);
            if (this.non != 0) {
                commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void o(MappedByteBuffer mappedByteBuffer) throws IOException {
        int iCapacity = mappedByteBuffer.capacity();
        int i2 = com.thinkup.core.common.o0m.o.o.o0m;
        if (iCapacity != i2) {
            FileChannel fileChannel = mappedByteBuffer == this.no0 ? this.n0m : this.n0n;
            fileChannel.truncate(i2);
            MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, i2);
            map.order(ByteOrder.LITTLE_ENDIAN);
            if (mappedByteBuffer == this.no0) {
                this.no0 = map;
            } else {
                this.noo = map;
            }
            mappedByteBuffer = map;
        }
        mappedByteBuffer.putInt(0, o(0));
        mappedByteBuffer.putLong(4, 0L);
    }

    @Override // com.thinkup.core.common.o0m.o.o
    public final void o(byte b2, int i2) {
        long jO = this.on0 ^ com.thinkup.core.common.o0m.o.o.o(1L, i2);
        this.on0 = jO;
        if (this.non == 0) {
            this.no0.putLong(4, jO);
            this.no0.put(i2, b2);
            this.noo.putLong(4, this.on0);
            this.noo.put(i2, b2);
        } else {
            this.onn.o(4, jO);
        }
        this.onn.o[i2] = b2;
    }

    @Override // com.thinkup.core.common.o0m.o.o
    public final void o(int i2, long j, int i3) {
        long jO = com.thinkup.core.common.o0m.o.o.o(j, i3) ^ this.on0;
        this.on0 = jO;
        if (this.non == 0) {
            this.no0.putLong(4, jO);
            this.no0.putInt(i3, i2);
            this.noo.putLong(4, this.on0);
            this.noo.putInt(i3, i2);
        } else {
            this.onn.o(4, jO);
        }
        this.onn.o(i3, i2);
    }

    @Override // com.thinkup.core.common.o0m.o.o
    public final void o(long j, long j2, int i2) {
        long jO = com.thinkup.core.common.o0m.o.o.o(j2, i2) ^ this.on0;
        this.on0 = jO;
        if (this.non == 0) {
            this.no0.putLong(4, jO);
            this.no0.putLong(i2, j);
            this.noo.putLong(4, this.on0);
            this.noo.putLong(i2, j);
        } else {
            this.onn.o(4, jO);
        }
        this.onn.o(i2, j);
    }

    @Override // com.thinkup.core.common.o0m.o.o
    public final void o(int i2, byte[] bArr) {
        super.o(i2, bArr);
        if (this.non == 0) {
            this.no0.putInt(0, -1);
            this.no0.putLong(4, this.on0);
            this.no0.position(i2);
            this.no0.put(bArr);
            this.no0.putInt(0, o(this.omn - 12));
            this.noo.putLong(4, this.on0);
            this.noo.position(i2);
            this.noo.put(bArr);
            return;
        }
        this.onn.o(4, this.on0);
    }

    @Override // com.thinkup.core.common.o0m.o.o
    public final void o(byte b2, int i2, int i3) {
        super.o(b2, i2, i3);
        this.nom = i2;
    }

    @Override // com.thinkup.core.common.o0m.o.o
    public final void o(int i2, int i3, int i4) {
        int iO = o(this.omn - 12);
        if (this.non == 0) {
            this.no0.putInt(0, -1);
            this.no0.putLong(4, this.on0);
            this.no0.position(i2);
            this.no0.put(this.onn.o, i2, i4);
            this.no0.putInt(0, iO);
            this.noo.putInt(0, iO);
            this.noo.putLong(4, this.on0);
            this.noo.position(i2);
            this.noo.put(this.onn.o, i2, i4);
        } else {
            this.onn.o(0, iO);
            this.onn.o(4, this.on0);
        }
        int i5 = this.omn + i3;
        if (this.onn.o.length - i5 > com.thinkup.core.common.o0m.o.o.o0n) {
            int i6 = com.thinkup.core.common.o0m.o.o.o0m;
            int iO2 = com.thinkup.core.common.o0m.o.o.o(i6, i5 + i6);
            byte[] bArr = this.onn.o;
            if (iO2 < bArr.length) {
                byte[] bArr2 = new byte[iO2];
                System.arraycopy(bArr, 0, bArr2, 0, this.omn);
                this.onn.o = bArr2;
                if (this.non == 0) {
                    try {
                        long j = iO2;
                        this.n0m.truncate(j);
                        FileChannel fileChannel = this.n0m;
                        FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                        MappedByteBuffer map = fileChannel.map(mapMode, 0L, j);
                        this.no0 = map;
                        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                        map.order(byteOrder);
                        this.n0n.truncate(j);
                        MappedByteBuffer map2 = this.n0n.map(mapMode, 0L, j);
                        this.noo = map2;
                        map2.order(byteOrder);
                    } catch (Exception e2) {
                        o(new Exception("map failed", e2));
                        ooo();
                    }
                }
                n("truncate finish");
            }
        }
    }
}

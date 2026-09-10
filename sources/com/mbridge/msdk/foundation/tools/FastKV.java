package com.mbridge.msdk.foundation.tools;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.Utf8;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class FastKV {
    static final int ASYNC_BLOCKING = 1;
    private static final String A_SUFFIX = ".kva";
    private static final int BASE_GC_BYTES_THRESHOLD = 4096;
    private static final int BASE_GC_KEYS_THRESHOLD = 80;
    private static final String BOTH_FILES_ERROR = "both files error";
    private static final String B_SUFFIX = ".kvb";
    private static final String C_SUFFIX = ".kvc";
    private static final int DATA_SIZE_LIMIT = 536870912;
    private static final int DATA_START = 12;
    private static final int DOUBLE_LIMIT;
    private static final byte[] EMPTY_ARRAY = new byte[0];
    static final String GC_FINISH = "gc finish";
    private static final int INTERNAL_LIMIT = 2048;
    private static final String MAP_FAILED = "map failed";
    static final int NON_BLOCKING = 0;
    private static final String OPEN_FILE_FAILED = "open file failed";
    private static final int PAGE_SIZE;
    private static final String PARSE_DATA_FAILED = "parse dara failed";
    static final int SYNC_BLOCKING = 2;
    private static final String TEMP_SUFFIX = ".tmp";
    static final String TRUNCATE_FINISH = "truncate finish";
    private static final int TRUNCATE_THRESHOLD;
    private static final int[] TYPE_SIZE;
    private MappedByteBuffer aBuffer;
    private FileChannel aChannel;
    private MappedByteBuffer bBuffer;
    private FileChannel bChannel;
    private long checksum;
    private int dataEnd;
    private final Map<String, b> encoderMap;
    private b0 fastBuffer;
    private int invalidBytes;
    private final String name;
    private final String path;
    private int removeStart;
    private boolean sizeChanged;
    private String tempExternalName;
    private int updateSize;
    private int updateStart;
    private int writingMode;
    private final Map<String, j> data = new HashMap();
    private final Executor executor = new e0();
    private final ArrayList<d> invalids = new ArrayList<>();
    private final c logger = c0.f34078b;
    private boolean autoCommit = true;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class Builder {
        private static final Map<String, FastKV> INSTANCE_MAP = new ConcurrentHashMap();
        private b[] encoders;
        private final String name;
        private final String path;
        private int writingMode = 0;

        public Builder(String str, String str2) {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("path is empty");
            }
            if (str2 == null || str2.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            this.path = str.endsWith("/") ? str : str.concat("/");
            this.name = str2;
        }

        public Builder asyncBlocking() {
            this.writingMode = 1;
            return this;
        }

        public Builder blocking() {
            this.writingMode = 2;
            return this;
        }

        public FastKV build() {
            FastKV fastKV;
            String str = this.path + this.name;
            Map<String, FastKV> map = INSTANCE_MAP;
            FastKV fastKV2 = map.get(str);
            if (fastKV2 != null) {
                return fastKV2;
            }
            synchronized (Builder.class) {
                try {
                    fastKV = map.get(str);
                    if (fastKV == null) {
                        fastKV = new FastKV(this.path, this.name, this.encoders, this.writingMode);
                        map.put(str, fastKV);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return fastKV;
        }

        public Builder encoder(b[] bVarArr) {
            this.encoders = bVarArr;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FastKV.this.writeToCFile();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface b<T> {
        T a(byte[] bArr, int i10, int i11);

        String a();

        byte[] a(T t10);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface c {
        void a(String str, Exception exc);

        void a(String str, String str2);

        void b(String str, Exception exc);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class d implements Comparable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f34032b;

        public d(int i10, int i11) {
            this.f34032b = i10;
            this.f34031a = i11;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f34032b - dVar.f34032b;
        }
    }

    static {
        int iA = d1.a();
        PAGE_SIZE = iA;
        int iMax = Math.max(iA << 1, Http2.INITIAL_MAX_FRAME_SIZE);
        DOUBLE_LIMIT = iMax;
        TRUNCATE_THRESHOLD = iMax << 1;
        TYPE_SIZE = new int[]{0, 1, 4, 4, 8, 8};
    }

    public FastKV(String str, String str2, b[] bVarArr, int i10) {
        this.path = str;
        this.name = str2;
        this.writingMode = i10;
        HashMap map = new HashMap();
        z0 z0Var = z0.f34219a;
        map.put(z0Var.a(), z0Var);
        if (bVarArr != null && bVarArr.length > 0) {
            for (b bVar : bVarArr) {
                String strA = bVar.a();
                if (map.containsKey(strA)) {
                    error(defpackage.e.n("duplicate encoder tag:", strA));
                } else {
                    map.put(strA, bVar);
                }
            }
        }
        this.encoderMap = map;
        loadData();
    }

    private void addObject(String str, Object obj, byte[] bArr, byte b10) {
        Object obj2;
        int length;
        j iVar;
        int iSaveArray = saveArray(str, bArr, b10);
        if (iSaveArray != 0) {
            String str2 = this.tempExternalName;
            boolean z10 = str2 != null;
            if (z10) {
                this.tempExternalName = null;
                length = 32;
                obj2 = str2;
            } else {
                obj2 = obj;
                length = bArr.length;
            }
            if (b10 == 6) {
                iVar = new q(this.updateStart, iSaveArray, (String) obj2, length, z10);
            } else {
                iVar = b10 == 7 ? new i(this.updateStart, iSaveArray, obj2, length, z10) : new p(this.updateStart, iSaveArray, obj2, length, z10);
            }
            this.data.put(str, iVar);
            updateChange();
        }
    }

    private void addOrUpdate(String str, Object obj, byte[] bArr, r rVar, byte b10) {
        if (rVar == null) {
            addObject(str, obj, bArr, b10);
        } else if (rVar.f34170b || rVar.f34173e != bArr.length) {
            updateObject(str, obj, bArr, rVar);
        } else {
            updateBytes(rVar.f34128a, bArr);
            rVar.f34172d = obj;
        }
        checkIfCommit();
    }

    private int bytesThreshold() {
        int i10 = this.dataEnd;
        if (i10 <= 16384) {
            return 4096;
        }
        return i10 <= 65536 ? Segment.SIZE : Http2.INITIAL_MAX_FRAME_SIZE;
    }

    private void checkGC() {
        if (this.invalidBytes < (bytesThreshold() << 1)) {
            if (this.invalids.size() < (this.dataEnd < 16384 ? BASE_GC_KEYS_THRESHOLD : 160)) {
                return;
            }
        }
        gc(0);
    }

    private void checkIfCommit() {
        if (this.writingMode == 0 || !this.autoCommit) {
            return;
        }
        commitToCFile();
    }

    private void checkKey(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("key is empty");
        }
    }

    private void checkKeySize(int i10) {
        if (i10 > 255) {
            throw new IllegalArgumentException("key's length must less than 256");
        }
    }

    private void checkValueSize(int i10, boolean z10) {
        if (z10) {
            if (i10 != 32) {
                throw new IllegalStateException("name size not match");
            }
        } else if (i10 < 0 || i10 >= 2048) {
            throw new IllegalStateException("value size out of bound");
        }
    }

    private void clearData() {
        this.dataEnd = 12;
        this.checksum = 0L;
        clearInvalid();
        this.data.clear();
        b0 b0Var = this.fastBuffer;
        if (b0Var == null || b0Var.f34062a.length != PAGE_SIZE) {
            this.fastBuffer = new b0(PAGE_SIZE);
        } else {
            b0Var.b(0, 0);
            this.fastBuffer.a(4, 0L);
        }
    }

    private void clearInvalid() {
        this.invalidBytes = 0;
        this.invalids.clear();
    }

    private boolean commitToCFile() {
        int i10 = this.writingMode;
        if (i10 == 1) {
            this.executor.execute(new a());
        } else if (i10 == 2) {
            return writeToCFile();
        }
        return true;
    }

    private void copyBuffer(MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, int i10) {
        if (mappedByteBuffer.capacity() != mappedByteBuffer2.capacity()) {
            try {
                MappedByteBuffer map = (mappedByteBuffer2 == this.bBuffer ? this.bChannel : this.aChannel).map(FileChannel.MapMode.READ_WRITE, 0L, mappedByteBuffer.capacity());
                map.order(ByteOrder.LITTLE_ENDIAN);
                if (mappedByteBuffer2 == this.bBuffer) {
                    this.bBuffer = map;
                } else {
                    this.aBuffer = map;
                }
                mappedByteBuffer2 = map;
            } catch (IOException e10) {
                error(e10);
                toBlockingMode();
                return;
            }
        }
        mappedByteBuffer.rewind();
        mappedByteBuffer2.rewind();
        mappedByteBuffer.limit(i10);
        mappedByteBuffer2.put(mappedByteBuffer);
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    private void countInvalid(int i10, int i11) {
        this.invalidBytes = (i11 - i10) + this.invalidBytes;
        this.invalids.add(new d(i10, i11));
    }

    private void deleteCFiles() {
        try {
            d1.a(new File(this.path, this.name + C_SUFFIX));
            d1.a(new File(this.path, this.name + TEMP_SUFFIX));
        } catch (Exception e10) {
            error(e10);
        }
    }

    private void ensureSize(int i10) {
        int length = this.fastBuffer.f34062a.length;
        int i11 = this.dataEnd + i10;
        if (i11 >= length) {
            int i12 = this.invalidBytes;
            if (i12 > i10 && i12 > bytesThreshold()) {
                gc(i10);
                return;
            }
            int newCapacity = getNewCapacity(length, i11);
            byte[] bArr = new byte[newCapacity];
            System.arraycopy(this.fastBuffer.f34062a, 0, bArr, 0, this.dataEnd);
            this.fastBuffer.f34062a = bArr;
            if (this.writingMode == 0) {
                try {
                    FileChannel fileChannel = this.aChannel;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    long j10 = newCapacity;
                    MappedByteBuffer map = fileChannel.map(mapMode, 0L, j10);
                    this.aBuffer = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    MappedByteBuffer map2 = this.bChannel.map(mapMode, 0L, j10);
                    this.bBuffer = map2;
                    map2.order(byteOrder);
                } catch (IOException e10) {
                    error(new Exception(MAP_FAILED, e10));
                    this.fastBuffer.b(0, this.dataEnd - 12);
                    this.fastBuffer.a(4, this.checksum);
                    toBlockingMode();
                }
            }
        }
    }

    private void error(Exception exc) {
        c cVar = this.logger;
        if (cVar != null) {
            cVar.b(this.name, exc);
        }
    }

    private void fastPutString(String str, String str2, q qVar) {
        int iB = b0.b(str2);
        if (qVar == null) {
            int iB2 = b0.b(str);
            checkKeySize(iB2);
            int i10 = iB2 + 4;
            this.updateSize = i10 + iB;
            preparePutBytes();
            this.fastBuffer.a((byte) 6);
            putKey(str, iB2);
            putStringValue(str2, iB);
            Map<String, j> map = this.data;
            int i11 = this.updateStart;
            map.put(str, new q(i11, i10 + i11, str2, iB, false));
            updateChange();
        } else {
            int i12 = qVar.f34128a;
            int i13 = i12 - qVar.f34171c;
            int i14 = qVar.f34173e;
            boolean z10 = false;
            String str3 = null;
            if (i14 == iB) {
                this.checksum = this.fastBuffer.a(i12, i14) ^ this.checksum;
                if (iB == str2.length()) {
                    str2.getBytes(0, iB, this.fastBuffer.f34062a, qVar.f34128a);
                } else {
                    b0 b0Var = this.fastBuffer;
                    b0Var.f34063b = qVar.f34128a;
                    b0Var.c(str2);
                }
                this.updateStart = qVar.f34128a;
                this.updateSize = iB;
            } else {
                this.updateSize = i13 + iB;
                preparePutBytes();
                this.fastBuffer.a((byte) 6);
                int i15 = i13 - 3;
                b0 b0Var2 = this.fastBuffer;
                byte[] bArr = b0Var2.f34062a;
                System.arraycopy(bArr, qVar.f34171c + 1, bArr, b0Var2.f34063b, i15);
                this.fastBuffer.f34063b += i15;
                putStringValue(str2, iB);
                remove((byte) 6, qVar.f34171c, qVar.f34128a + qVar.f34173e);
                str3 = qVar.f34170b ? (String) qVar.f34172d : null;
                qVar.f34170b = false;
                int i16 = this.updateStart;
                qVar.f34171c = i16;
                qVar.f34128a = i16 + i13;
                qVar.f34173e = iB;
                z10 = true;
            }
            qVar.f34172d = str2;
            updateChange();
            if (z10) {
                checkGC();
            }
            if (str3 != null) {
                d1.a(new File(this.path + this.name, str3));
            }
        }
        checkIfCommit();
    }

    private byte[] getArrayFromFile(i iVar) {
        try {
            byte[] bArrC = d1.c(new File(this.path + this.name, (String) iVar.f34172d));
            return bArrC != null ? bArrC : EMPTY_ARRAY;
        } catch (Exception e10) {
            error(e10);
            return EMPTY_ARRAY;
        }
    }

    private int getNewCapacity(int i10, int i11) {
        if (i11 > DATA_SIZE_LIMIT) {
            throw new IllegalStateException("data size out of limit");
        }
        int i12 = PAGE_SIZE;
        if (i11 <= i12) {
            return i12;
        }
        while (i10 < i11) {
            int i13 = DOUBLE_LIMIT;
            i10 = i10 <= i13 ? i10 << 1 : i10 + i13;
        }
        return i10;
    }

    private Object getObjectFromFile(p pVar) {
        try {
            byte[] bArrC = d1.c(new File(this.path + this.name, (String) pVar.f34172d));
            if (bArrC == null) {
                warning(new Exception("Read object data failed"));
                return null;
            }
            int i10 = bArrC[0] & 255;
            String str = new String(bArrC, 1, i10, StandardCharsets.UTF_8);
            b bVar = this.encoderMap.get(str);
            if (bVar != null) {
                int i11 = i10 + 1;
                return bVar.a(bArrC, i11, bArrC.length - i11);
            }
            warning(new Exception("No encoder for tag:".concat(str)));
            return null;
        } catch (Exception e10) {
            error(e10);
            return null;
        }
    }

    private String getStringFromFile(q qVar) {
        try {
            byte[] bArrC = d1.c(new File(this.path + this.name, (String) qVar.f34172d));
            return (bArrC == null || bArrC.length == 0) ? "" : new String(bArrC, StandardCharsets.UTF_8);
        } catch (Exception e10) {
            error(e10);
        }
        return "";
    }

    private void info(String str) {
        c cVar = this.logger;
        if (cVar != null) {
            cVar.a(this.name, str);
        }
    }

    private boolean isABFileEqual() {
        b0 b0Var = new b0(this.dataEnd);
        this.bBuffer.rewind();
        this.bBuffer.get(b0Var.f34062a, 0, this.dataEnd);
        byte[] bArr = this.fastBuffer.f34062a;
        byte[] bArr2 = b0Var.f34062a;
        for (int i10 = 0; i10 < this.dataEnd; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    private synchronized void loadData() {
        try {
            long jNanoTime = System.nanoTime();
            if (!loadFromCFile() && this.writingMode == 0) {
                loadFromABFile();
            }
            if (this.fastBuffer == null) {
                this.fastBuffer = new b0(PAGE_SIZE);
            }
            if (this.logger != null) {
                info("loading finish, data len:" + this.dataEnd + ", get keys:" + this.data.size() + ", use time:" + ((System.nanoTime() - jNanoTime) / 1000000) + " ms");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void loadFromABFile() {
        long j10;
        File file = new File(this.path, defpackage.e.q(this.name, A_SUFFIX, new StringBuilder()));
        File file2 = new File(this.path, defpackage.e.q(this.name, B_SUFFIX, new StringBuilder()));
        try {
            if (d1.d(file) && d1.d(file2)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                long length = randomAccessFile.length();
                long length2 = randomAccessFile2.length();
                this.aChannel = randomAccessFile.getChannel();
                this.bChannel = randomAccessFile2.getChannel();
                try {
                    FileChannel fileChannel = this.aChannel;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    MappedByteBuffer map = fileChannel.map(mapMode, 0L, length > 0 ? length : PAGE_SIZE);
                    this.aBuffer = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    MappedByteBuffer map2 = this.bChannel.map(mapMode, 0L, length2 > 0 ? length2 : PAGE_SIZE);
                    this.bBuffer = map2;
                    map2.order(byteOrder);
                    this.fastBuffer = new b0(this.aBuffer.capacity());
                    if (length == 0 && length2 == 0) {
                        this.dataEnd = 12;
                        return;
                    }
                    int i10 = this.aBuffer.getInt();
                    long j11 = this.aBuffer.getLong();
                    int i11 = this.bBuffer.getInt();
                    long j12 = this.bBuffer.getLong();
                    if (i10 < 0) {
                        j10 = 12;
                    } else if (i10 <= length - 12) {
                        this.dataEnd = i10 + 12;
                        this.aBuffer.rewind();
                        j10 = 12;
                        this.aBuffer.get(this.fastBuffer.f34062a, 0, this.dataEnd);
                        if (j11 == this.fastBuffer.a(12, i10) && parseData() == 0) {
                            this.checksum = j11;
                            if (length == length2 && isABFileEqual()) {
                                return;
                            }
                            warning(new Exception("B file error"));
                            copyBuffer(this.aBuffer, this.bBuffer, this.dataEnd);
                            return;
                        }
                    } else {
                        j10 = 12;
                    }
                    if (i11 >= 0 && i11 <= length2 - j10) {
                        this.data.clear();
                        clearInvalid();
                        this.dataEnd = i11 + 12;
                        if (this.fastBuffer.f34062a.length != this.bBuffer.capacity()) {
                            this.fastBuffer = new b0(this.bBuffer.capacity());
                        }
                        this.bBuffer.rewind();
                        this.bBuffer.get(this.fastBuffer.f34062a, 0, this.dataEnd);
                        if (j12 == this.fastBuffer.a(12, i11) && parseData() == 0) {
                            warning(new Exception("A file error"));
                            copyBuffer(this.bBuffer, this.aBuffer, this.dataEnd);
                            this.checksum = j12;
                            return;
                        }
                    }
                    error(BOTH_FILES_ERROR);
                    resetData();
                    return;
                } catch (IOException e10) {
                    error(e10);
                    toBlockingMode();
                    tryBlockingIO(file, file2);
                    return;
                }
            }
            error(new Exception(OPEN_FILE_FAILED));
            toBlockingMode();
        } catch (Exception e11) {
            error(e11);
            clearData();
            toBlockingMode();
        }
    }

    private boolean loadFromCFile() {
        File file = new File(this.path, defpackage.e.q(this.name, C_SUFFIX, new StringBuilder()));
        File file2 = new File(this.path, defpackage.e.q(this.name, TEMP_SUFFIX, new StringBuilder()));
        boolean z10 = false;
        try {
            if (!file.exists()) {
                file = file2.exists() ? file2 : null;
            }
            if (file != null) {
                if (!loadWithBlockingIO(file)) {
                    clearData();
                    deleteCFiles();
                    return false;
                }
                if (this.writingMode == 0) {
                    if (!writeToABFile(this.fastBuffer)) {
                        this.writingMode = 1;
                        return false;
                    }
                    info("recover from c file");
                    try {
                        deleteCFiles();
                        return true;
                    } catch (Exception e10) {
                        e = e10;
                        z10 = true;
                        error(e);
                        return z10;
                    }
                }
            } else if (this.writingMode != 0) {
                File file3 = new File(this.path, this.name + A_SUFFIX);
                File file4 = new File(this.path, this.name + B_SUFFIX);
                if (file3.exists() && file4.exists()) {
                    tryBlockingIO(file3, file4);
                }
            }
            return false;
        } catch (Exception e11) {
            e = e11;
        }
    }

    private boolean loadWithBlockingIO(File file) throws IOException {
        long length = file.length();
        if (length != 0 && length <= 536870912) {
            int i10 = (int) length;
            int newCapacity = getNewCapacity(PAGE_SIZE, i10);
            b0 b0Var = this.fastBuffer;
            if (b0Var == null || b0Var.f34062a.length != newCapacity) {
                b0Var = new b0(new byte[newCapacity]);
                this.fastBuffer = b0Var;
            } else {
                b0Var.f34063b = 0;
            }
            d1.a(file, b0Var.f34062a, i10);
            int iD = b0Var.d();
            long jE = b0Var.e();
            this.dataEnd = iD + 12;
            if (iD >= 0 && iD <= i10 - 12 && jE == b0Var.a(12, iD) && parseData() == 0) {
                this.checksum = jE;
                return true;
            }
        }
        return false;
    }

    private void mergeInvalids() {
        int size = this.invalids.size() - 1;
        d dVar = this.invalids.get(size);
        while (size > 0) {
            int i10 = size - 1;
            d dVar2 = this.invalids.get(i10);
            if (dVar.f34032b == dVar2.f34031a) {
                dVar2.f34031a = dVar.f34031a;
                this.invalids.remove(size);
            }
            dVar = dVar2;
            size = i10;
        }
    }

    private int parseData() {
        b0 b0Var = this.fastBuffer;
        b0Var.f34063b = 12;
        while (true) {
            try {
                int i10 = b0Var.f34063b;
                int i11 = this.dataEnd;
                if (i10 >= i11) {
                    if (i10 == i11) {
                        return 0;
                    }
                    warning(new Exception(PARSE_DATA_FAILED));
                    return -1;
                }
                byte bA = b0Var.a();
                byte b10 = (byte) (bA & Utf8.REPLACEMENT_BYTE);
                if (b10 < 1 || b10 > 8) {
                    throw new Exception(PARSE_DATA_FAILED);
                }
                int iA = b0Var.a() & 255;
                if (bA < 0) {
                    b0Var.f34063b += iA;
                    int iF = b10 <= 5 ? TYPE_SIZE[b10] : b0Var.f() & 65535;
                    b0 b0Var2 = this.fastBuffer;
                    int i12 = b0Var2.f34063b + iF;
                    b0Var2.f34063b = i12;
                    countInvalid(i10, i12);
                } else {
                    String strE = b0Var.e(iA);
                    int i13 = b0Var.f34063b;
                    if (b10 > 5) {
                        int iF2 = 65535 & b0Var.f();
                        boolean z10 = (bA & 64) != 0;
                        checkValueSize(iF2, z10);
                        if (b10 == 6) {
                            this.data.put(strE, new q(i10, i13 + 2, b0Var.e(iF2), iF2, z10));
                        } else if (b10 == 7) {
                            this.data.put(strE, new i(i10, i13 + 2, z10 ? b0Var.e(iF2) : b0Var.b(iF2), iF2, z10));
                        } else if (z10) {
                            this.data.put(strE, new p(i10, i13 + 2, b0Var.e(iF2), iF2, true));
                        } else {
                            int iA2 = b0Var.a() & 255;
                            String strE2 = b0Var.e(iA2);
                            b bVar = this.encoderMap.get(strE2);
                            int i14 = iF2 - (iA2 + 1);
                            if (i14 < 0) {
                                throw new Exception(PARSE_DATA_FAILED);
                            }
                            if (bVar != null) {
                                try {
                                    Object objA = bVar.a(b0Var.f34062a, b0Var.f34063b, i14);
                                    if (objA != null) {
                                        this.data.put(strE, new p(i10, i13 + 2, objA, iF2, false));
                                    }
                                } catch (Exception e10) {
                                    error(e10);
                                }
                            } else {
                                error("object with tag: " + strE2 + " without encoder");
                            }
                            b0Var.f34063b += i14;
                        }
                    } else if (b10 == 1) {
                        this.data.put(strE, new k(i13, b0Var.a() == 1));
                    } else if (b10 == 2) {
                        this.data.put(strE, new n(i13, b0Var.d()));
                    } else if (b10 == 3) {
                        this.data.put(strE, new m(i13, b0Var.c()));
                    } else if (b10 != 4) {
                        this.data.put(strE, new l(i13, b0Var.b()));
                    } else {
                        this.data.put(strE, new o(i13, b0Var.e()));
                    }
                }
            } catch (Exception e11) {
                warning(e11);
                return -1;
            }
        }
    }

    private void preparePutBytes() {
        ensureSize(this.updateSize);
        int i10 = this.dataEnd;
        this.updateStart = i10;
        this.dataEnd = this.updateSize + i10;
        this.fastBuffer.f34063b = i10;
        this.sizeChanged = true;
    }

    private void putKey(String str, int i10) {
        this.fastBuffer.a((byte) i10);
        if (i10 != str.length()) {
            this.fastBuffer.c(str);
            return;
        }
        b0 b0Var = this.fastBuffer;
        str.getBytes(0, i10, b0Var.f34062a, b0Var.f34063b);
        this.fastBuffer.f34063b += i10;
    }

    private void putStringValue(String str, int i10) {
        this.fastBuffer.a((short) i10);
        if (i10 != str.length()) {
            this.fastBuffer.c(str);
        } else {
            b0 b0Var = this.fastBuffer;
            str.getBytes(0, i10, b0Var.f34062a, b0Var.f34063b);
        }
    }

    private void resetBuffer(MappedByteBuffer mappedByteBuffer) throws IOException {
        int iCapacity = mappedByteBuffer.capacity();
        int i10 = PAGE_SIZE;
        if (iCapacity != i10) {
            FileChannel fileChannel = mappedByteBuffer == this.aBuffer ? this.aChannel : this.bChannel;
            long j10 = i10;
            fileChannel.truncate(j10);
            MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j10);
            map.order(ByteOrder.LITTLE_ENDIAN);
            if (mappedByteBuffer == this.aBuffer) {
                this.aBuffer = map;
            } else {
                this.bBuffer = map;
            }
            mappedByteBuffer = map;
        }
        mappedByteBuffer.putInt(0, 0);
        mappedByteBuffer.putLong(4, 0L);
    }

    private void resetData() {
        if (this.writingMode == 0) {
            try {
                resetBuffer(this.aBuffer);
                resetBuffer(this.bBuffer);
            } catch (IOException unused) {
                toBlockingMode();
            }
        }
        clearData();
        d1.a(new File(this.path + this.name));
    }

    private int saveArray(String str, byte[] bArr, byte b10) {
        this.tempExternalName = null;
        if (bArr.length < 2048) {
            return wrapArray(str, bArr, b10);
        }
        StringBuilder sbK = d5.u.k("large value, key: ", str, ", size: ");
        sbK.append(bArr.length);
        info(sbK.toString());
        String strB = d1.b();
        if (!d1.a(new File(this.path + this.name, strB), bArr)) {
            error("save large value failed");
            return 0;
        }
        this.tempExternalName = strB;
        byte[] bArr2 = new byte[32];
        strB.getBytes(0, 32, bArr2, 0);
        return wrapArray(str, bArr2, (byte) (b10 | 64));
    }

    private long shiftCheckSum(long j10, int i10) {
        int i11 = (i10 & 7) << 3;
        return (j10 >>> (64 - i11)) | (j10 << i11);
    }

    private void syncABBuffer(MappedByteBuffer mappedByteBuffer) {
        if (this.sizeChanged && mappedByteBuffer != this.aBuffer) {
            mappedByteBuffer.putInt(0, this.dataEnd - 12);
        }
        mappedByteBuffer.putLong(4, this.checksum);
        int i10 = this.removeStart;
        if (i10 != 0) {
            mappedByteBuffer.put(i10, this.fastBuffer.f34062a[i10]);
        }
        if (this.updateSize != 0) {
            mappedByteBuffer.position(this.updateStart);
            mappedByteBuffer.put(this.fastBuffer.f34062a, this.updateStart, this.updateSize);
        }
    }

    private void toBlockingMode() {
        this.writingMode = 1;
        d1.a(this.aChannel);
        d1.a(this.bChannel);
        this.aChannel = null;
        this.bChannel = null;
        this.aBuffer = null;
        this.bBuffer = null;
    }

    private void truncate(int i10) {
        int i11 = PAGE_SIZE;
        int newCapacity = getNewCapacity(i11, i10 + i11);
        byte[] bArr = this.fastBuffer.f34062a;
        if (newCapacity >= bArr.length) {
            return;
        }
        byte[] bArr2 = new byte[newCapacity];
        System.arraycopy(bArr, 0, bArr2, 0, this.dataEnd);
        this.fastBuffer.f34062a = bArr2;
        if (this.writingMode == 0) {
            try {
                long j10 = newCapacity;
                this.aChannel.truncate(j10);
                FileChannel fileChannel = this.aChannel;
                FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                MappedByteBuffer map = fileChannel.map(mapMode, 0L, j10);
                this.aBuffer = map;
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                map.order(byteOrder);
                this.bChannel.truncate(j10);
                MappedByteBuffer map2 = this.bChannel.map(mapMode, 0L, j10);
                this.bBuffer = map2;
                map2.order(byteOrder);
            } catch (IOException e10) {
                error(new Exception(MAP_FAILED, e10));
                toBlockingMode();
            }
        }
        info(TRUNCATE_FINISH);
    }

    private void tryBlockingIO(File file, File file2) {
        try {
            if (loadWithBlockingIO(file)) {
                return;
            }
        } catch (IOException e10) {
            warning(e10);
        }
        clearData();
        try {
            if (loadWithBlockingIO(file2)) {
                return;
            }
        } catch (IOException e11) {
            warning(e11);
        }
        clearData();
    }

    private void updateBoolean(byte b10, int i10) {
        long jShiftCheckSum = this.checksum ^ shiftCheckSum(1L, i10);
        this.checksum = jShiftCheckSum;
        if (this.writingMode == 0) {
            this.aBuffer.putLong(4, jShiftCheckSum);
            this.aBuffer.put(i10, b10);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.put(i10, b10);
        } else {
            this.fastBuffer.a(4, jShiftCheckSum);
        }
        this.fastBuffer.f34062a[i10] = b10;
    }

    private void updateBytes(int i10, byte[] bArr) {
        int length = bArr.length;
        this.checksum ^= this.fastBuffer.a(i10, length);
        b0 b0Var = this.fastBuffer;
        b0Var.f34063b = i10;
        b0Var.a(bArr);
        long jA = this.checksum ^ this.fastBuffer.a(i10, length);
        this.checksum = jA;
        if (this.writingMode != 0) {
            this.fastBuffer.a(4, jA);
            return;
        }
        this.aBuffer.putInt(0, -1);
        this.aBuffer.putLong(4, this.checksum);
        this.aBuffer.position(i10);
        this.aBuffer.put(bArr);
        this.aBuffer.putInt(0, this.dataEnd - 12);
        this.bBuffer.putLong(4, this.checksum);
        this.bBuffer.position(i10);
        this.bBuffer.put(bArr);
    }

    private void updateChange() {
        this.checksum ^= this.fastBuffer.a(this.updateStart, this.updateSize);
        if (this.writingMode == 0) {
            this.aBuffer.putInt(0, -1);
            syncABBuffer(this.aBuffer);
            this.aBuffer.putInt(0, this.dataEnd - 12);
            syncABBuffer(this.bBuffer);
        } else {
            if (this.sizeChanged) {
                this.fastBuffer.b(0, this.dataEnd - 12);
            }
            this.fastBuffer.a(4, this.checksum);
        }
        this.sizeChanged = false;
        this.removeStart = 0;
        this.updateSize = 0;
    }

    private void updateInt32(int i10, long j10, int i11) {
        long jShiftCheckSum = shiftCheckSum(j10, i11) ^ this.checksum;
        this.checksum = jShiftCheckSum;
        if (this.writingMode == 0) {
            this.aBuffer.putLong(4, jShiftCheckSum);
            this.aBuffer.putInt(i11, i10);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.putInt(i11, i10);
        } else {
            this.fastBuffer.a(4, jShiftCheckSum);
        }
        this.fastBuffer.b(i11, i10);
    }

    private void updateInt64(long j10, long j11, int i10) {
        long jShiftCheckSum = shiftCheckSum(j11, i10) ^ this.checksum;
        this.checksum = jShiftCheckSum;
        if (this.writingMode == 0) {
            this.aBuffer.putLong(4, jShiftCheckSum);
            this.aBuffer.putLong(i10, j10);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.putLong(i10, j10);
        } else {
            this.fastBuffer.a(4, jShiftCheckSum);
        }
        this.fastBuffer.a(i10, j10);
    }

    private void updateObject(String str, Object obj, byte[] bArr, r rVar) {
        int iSaveArray = saveArray(str, bArr, rVar.a());
        if (iSaveArray != 0) {
            String str2 = rVar.f34170b ? (String) rVar.f34172d : null;
            remove(rVar.a(), rVar.f34171c, rVar.f34128a + rVar.f34173e);
            String str3 = this.tempExternalName;
            boolean z10 = str3 != null;
            rVar.f34171c = this.updateStart;
            rVar.f34128a = iSaveArray;
            rVar.f34170b = z10;
            if (z10) {
                rVar.f34172d = str3;
                rVar.f34173e = 32;
                this.tempExternalName = null;
            } else {
                rVar.f34172d = obj;
                rVar.f34173e = bArr.length;
            }
            updateChange();
            checkGC();
            if (str2 != null) {
                d1.a(new File(this.path + this.name, str2));
            }
        }
    }

    private void updateOffset(int i10, int[] iArr) {
        for (j jVar : this.data.values()) {
            int i11 = jVar.f34128a;
            if (i11 > i10) {
                int i12 = iArr[(d1.a(iArr, i11) << 1) + 1];
                jVar.f34128a -= i12;
                if (jVar.a() >= 6) {
                    ((r) jVar).f34171c -= i12;
                }
            }
        }
    }

    private void warning(Exception exc) {
        c cVar = this.logger;
        if (cVar != null) {
            cVar.a(this.name, exc);
        }
    }

    private int wrapArray(String str, byte[] bArr, byte b10) {
        wrapHeader(str, b10, bArr.length + 2);
        this.fastBuffer.a((short) bArr.length);
        b0 b0Var = this.fastBuffer;
        int i10 = b0Var.f34063b;
        b0Var.a(bArr);
        return i10;
    }

    private void wrapHeader(String str, byte b10) {
        wrapHeader(str, b10, TYPE_SIZE[b10]);
    }

    private boolean writeToABFile(b0 b0Var) {
        int length = b0Var.f34062a.length;
        File file = new File(this.path, defpackage.e.q(this.name, A_SUFFIX, new StringBuilder()));
        File file2 = new File(this.path, defpackage.e.q(this.name, B_SUFFIX, new StringBuilder()));
        try {
            if (!d1.d(file) || !d1.d(file2)) {
                throw new Exception(OPEN_FILE_FAILED);
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
            long j10 = length;
            randomAccessFile.setLength(j10);
            randomAccessFile2.setLength(j10);
            this.aChannel = randomAccessFile.getChannel();
            this.bChannel = randomAccessFile2.getChannel();
            FileChannel fileChannel = this.aChannel;
            FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
            MappedByteBuffer map = fileChannel.map(mapMode, 0L, j10);
            this.aBuffer = map;
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            map.order(byteOrder);
            MappedByteBuffer map2 = this.bChannel.map(mapMode, 0L, j10);
            this.bBuffer = map2;
            map2.order(byteOrder);
            this.aBuffer.put(b0Var.f34062a, 0, this.dataEnd);
            this.bBuffer.put(b0Var.f34062a, 0, this.dataEnd);
            return true;
        } catch (Exception e10) {
            error(e10);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean writeToCFile() {
        try {
            try {
                File file = new File(this.path, this.name + TEMP_SUFFIX);
                if (d1.d(file)) {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                    randomAccessFile.setLength(this.dataEnd);
                    randomAccessFile.write(this.fastBuffer.f34062a, 0, this.dataEnd);
                    randomAccessFile.close();
                    File file2 = new File(this.path, this.name + C_SUFFIX);
                    if (!file2.exists() || file2.delete()) {
                        if (file.renameTo(file2)) {
                            return true;
                        }
                        warning(new Exception("rename failed"));
                    }
                }
            } catch (Exception e10) {
                error(e10);
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void clear() {
        resetData();
        if (this.writingMode != 0) {
            deleteCFiles();
        }
    }

    public synchronized boolean commit() {
        this.autoCommit = true;
        return commitToCFile();
    }

    public synchronized boolean contains(String str) {
        return this.data.containsKey(str);
    }

    public synchronized void disableAutoCommit() {
        this.autoCommit = false;
    }

    public synchronized void force() {
        if (this.writingMode == 0) {
            this.aBuffer.force();
            this.bBuffer.force();
        }
    }

    public void gc(int i10) {
        Collections.sort(this.invalids);
        mergeInvalids();
        d dVar = this.invalids.get(0);
        int i11 = dVar.f34032b;
        int i12 = this.dataEnd;
        int i13 = i12 - this.invalidBytes;
        int i14 = i13 - 12;
        int i15 = i13 - i11;
        int i16 = i12 - i11;
        boolean z10 = true;
        boolean z11 = i14 < i16 + i15;
        if (!z11) {
            this.checksum ^= this.fastBuffer.a(i11, i16);
        }
        int size = this.invalids.size();
        int i17 = size - 1;
        int i18 = this.dataEnd - this.invalids.get(i17).f34031a;
        int[] iArr = new int[(i18 > 0 ? size : i17) << 1];
        int i19 = dVar.f34032b;
        int i20 = dVar.f34031a;
        int i21 = 1;
        while (i21 < size) {
            d dVar2 = this.invalids.get(i21);
            boolean z12 = z10;
            int i22 = dVar2.f34032b - i20;
            byte[] bArr = this.fastBuffer.f34062a;
            System.arraycopy(bArr, i20, bArr, i19, i22);
            int i23 = (i21 - 1) << 1;
            iArr[i23] = i20;
            iArr[i23 + 1] = i20 - i19;
            i19 += i22;
            i20 = dVar2.f34031a;
            i21++;
            z10 = z12;
        }
        if (i18 > 0) {
            byte[] bArr2 = this.fastBuffer.f34062a;
            System.arraycopy(bArr2, i20, bArr2, i19, i18);
            int i24 = i17 << 1;
            iArr[i24] = i20;
            iArr[i24 + 1] = i20 - i19;
        }
        clearInvalid();
        if (z11) {
            this.checksum = this.fastBuffer.a(12, i14);
        } else {
            this.checksum ^= this.fastBuffer.a(i11, i15);
        }
        this.dataEnd = i13;
        if (this.writingMode == 0) {
            this.aBuffer.putInt(0, -1);
            this.aBuffer.putLong(4, this.checksum);
            this.aBuffer.position(i11);
            this.aBuffer.put(this.fastBuffer.f34062a, i11, i15);
            this.aBuffer.putInt(0, i14);
            this.bBuffer.putInt(0, i14);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.position(i11);
            this.bBuffer.put(this.fastBuffer.f34062a, i11, i15);
        } else {
            this.fastBuffer.b(0, i14);
            this.fastBuffer.a(4, this.checksum);
        }
        updateOffset(i11, iArr);
        int i25 = i13 + i10;
        if (this.fastBuffer.f34062a.length - i25 > TRUNCATE_THRESHOLD) {
            truncate(i25);
        }
        info(GC_FINISH);
    }

    public synchronized Map<String, Object> getAll() {
        Object objValueOf;
        int size = this.data.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap map = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry<String, j> entry : this.data.entrySet()) {
            String key = entry.getKey();
            j value = entry.getValue();
            switch (value.a()) {
                case 1:
                    objValueOf = Boolean.valueOf(((k) value).f34131b);
                    break;
                case 2:
                    objValueOf = Integer.valueOf(((n) value).f34157b);
                    break;
                case 3:
                    objValueOf = Float.valueOf(((m) value).f34137b);
                    break;
                case 4:
                    objValueOf = Long.valueOf(((o) value).f34161b);
                    break;
                case 5:
                    objValueOf = Double.valueOf(((l) value).f34136b);
                    break;
                case 6:
                    q qVar = (q) value;
                    objValueOf = qVar.f34170b ? getStringFromFile(qVar) : qVar.f34172d;
                    break;
                case 7:
                    i iVar = (i) value;
                    objValueOf = iVar.f34170b ? getArrayFromFile(iVar) : iVar.f34172d;
                    break;
                case 8:
                    p pVar = (p) value;
                    objValueOf = pVar.f34170b ? getObjectFromFile(pVar) : pVar.f34172d;
                    break;
                default:
                    objValueOf = null;
                    break;
            }
            map.put(key, objValueOf);
        }
        return map;
    }

    public byte[] getArray(String str) {
        return getArray(str, EMPTY_ARRAY);
    }

    public synchronized boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public double getDouble(String str) {
        return getDouble(str, 0.0d);
    }

    public float getFloat(String str) {
        return getFloat(str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public synchronized long getLong(String str) {
        o oVar;
        oVar = (o) this.data.get(str);
        return oVar == null ? 0L : oVar.f34161b;
    }

    public synchronized <T> T getObject(String str) {
        try {
            p pVar = (p) this.data.get(str);
            if (pVar != null) {
                return pVar.f34170b ? (T) getObjectFromFile(pVar) : (T) pVar.f34172d;
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public String getString(String str) {
        return getString(str, "");
    }

    public synchronized Set<String> getStringSet(String str) {
        return (Set) getObject(str);
    }

    public void putAll(Map<String, Object> map) {
        putAll(map, null);
    }

    public synchronized void putArray(String str, byte[] bArr) throws Throwable {
        Throwable th2;
        FastKV fastKV;
        try {
            try {
                checkKey(str);
                if (bArr == null) {
                    try {
                        remove(str);
                        fastKV = this;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    fastKV = this;
                    fastKV.addOrUpdate(str, bArr, bArr, (i) this.data.get(str), (byte) 7);
                }
                return;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
        throw th2;
    }

    public synchronized void putBoolean(String str, boolean z10) {
        try {
            checkKey(str);
            k kVar = (k) this.data.get(str);
            if (kVar == null) {
                wrapHeader(str, (byte) 1);
                b0 b0Var = this.fastBuffer;
                int i10 = b0Var.f34063b;
                b0Var.a(z10 ? (byte) 1 : (byte) 0);
                updateChange();
                this.data.put(str, new k(i10, z10));
                checkIfCommit();
            } else if (kVar.f34131b != z10) {
                kVar.f34131b = z10;
                updateBoolean(z10 ? (byte) 1 : (byte) 0, kVar.f34128a);
                checkIfCommit();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void putDouble(String str, double d10) throws Throwable {
        Throwable th2;
        FastKV fastKV;
        try {
            try {
                checkKey(str);
                l lVar = (l) this.data.get(str);
                if (lVar != null) {
                    if (lVar.f34136b != d10) {
                        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10);
                        long jDoubleToRawLongBits2 = Double.doubleToRawLongBits(lVar.f34136b) ^ jDoubleToRawLongBits;
                        lVar.f34136b = d10;
                        fastKV = this;
                        fastKV.updateInt64(jDoubleToRawLongBits, jDoubleToRawLongBits2, lVar.f34128a);
                        fastKV.checkIfCommit();
                    }
                    return;
                }
                try {
                    wrapHeader(str, (byte) 5);
                    b0 b0Var = this.fastBuffer;
                    int i10 = b0Var.f34063b;
                    b0Var.a(Double.doubleToRawLongBits(d10));
                    updateChange();
                    this.data.put(str, new l(i10, d10));
                    checkIfCommit();
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
                fastKV = this;
                return;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
        throw th2;
    }

    public synchronized void putFloat(String str, float f10) {
        try {
            checkKey(str);
            m mVar = (m) this.data.get(str);
            if (mVar == null) {
                wrapHeader(str, (byte) 3);
                b0 b0Var = this.fastBuffer;
                int i10 = b0Var.f34063b;
                b0Var.g(Float.floatToRawIntBits(f10));
                updateChange();
                this.data.put(str, new m(i10, f10));
                checkIfCommit();
            } else if (mVar.f34137b != f10) {
                int iFloatToRawIntBits = Float.floatToRawIntBits(f10);
                long jFloatToRawIntBits = ((long) (Float.floatToRawIntBits(mVar.f34137b) ^ iFloatToRawIntBits)) & 4294967295L;
                mVar.f34137b = f10;
                updateInt32(iFloatToRawIntBits, jFloatToRawIntBits, mVar.f34128a);
                checkIfCommit();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void putInt(String str, int i10) {
        try {
            checkKey(str);
            n nVar = (n) this.data.get(str);
            if (nVar == null) {
                wrapHeader(str, (byte) 2);
                b0 b0Var = this.fastBuffer;
                int i11 = b0Var.f34063b;
                b0Var.g(i10);
                updateChange();
                this.data.put(str, new n(i11, i10));
                checkIfCommit();
            } else {
                int i12 = nVar.f34157b;
                if (i12 != i10) {
                    nVar.f34157b = i10;
                    updateInt32(i10, ((long) (i12 ^ i10)) & 4294967295L, nVar.f34128a);
                    checkIfCommit();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void putLong(String str, long j10) {
        Throwable th2;
        FastKV fastKV;
        try {
            try {
                checkKey(str);
                o oVar = (o) this.data.get(str);
                if (oVar != null) {
                    long j11 = oVar.f34161b;
                    if (j11 != j10) {
                        long j12 = j10 ^ j11;
                        oVar.f34161b = j10;
                        fastKV = this;
                        fastKV.updateInt64(j10, j12, oVar.f34128a);
                        fastKV.checkIfCommit();
                    }
                    return;
                }
                try {
                    wrapHeader(str, (byte) 4);
                    b0 b0Var = this.fastBuffer;
                    int i10 = b0Var.f34063b;
                    b0Var.a(j10);
                    updateChange();
                    this.data.put(str, new o(i10, j10));
                    checkIfCommit();
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
                fastKV = this;
                return;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
        throw th2;
    }

    public synchronized <T> void putObject(String str, T t10, b<T> bVar) throws Throwable {
        Throwable th2;
        byte[] bArrA;
        try {
            try {
                checkKey(str);
                if (bVar == null) {
                    throw new IllegalArgumentException("Encoder is null");
                }
                String strA = bVar.a();
                if (strA == null || strA.isEmpty() || strA.length() > 50) {
                    throw new IllegalArgumentException("Invalid encoder tag:" + strA);
                }
                if (!this.encoderMap.containsKey(strA)) {
                    throw new IllegalArgumentException("Encoder hasn't been registered");
                }
                try {
                    if (t10 == null) {
                        remove(str);
                        return;
                    }
                    try {
                        bArrA = bVar.a(t10);
                    } catch (Exception e10) {
                        error(e10);
                        bArrA = null;
                    }
                    if (bArrA == null) {
                        remove(str);
                        return;
                    }
                    int iB = b0.b(strA);
                    b0 b0Var = new b0(iB + 1 + bArrA.length);
                    b0Var.a((byte) iB);
                    b0Var.c(strA);
                    b0Var.a(bArrA);
                    addOrUpdate(str, t10, b0Var.f34062a, (p) this.data.get(str), (byte) 8);
                    return;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        throw th2;
    }

    public synchronized void putString(String str, String str2) {
        Throwable th2;
        FastKV fastKV;
        try {
            try {
                checkKey(str);
                try {
                    if (str2 != null) {
                        q qVar = (q) this.data.get(str);
                        if (str2.length() * 3 < 2048) {
                            fastPutString(str, str2, qVar);
                        } else {
                            fastKV = this;
                            fastKV.addOrUpdate(str, str2, str2.isEmpty() ? EMPTY_ARRAY : str2.getBytes(StandardCharsets.UTF_8), qVar, (byte) 6);
                        }
                        return;
                    }
                    remove(str);
                    fastKV = this;
                    return;
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
        throw th2;
    }

    public synchronized void putStringSet(String str, Set<String> set) {
        try {
            if (set == null) {
                remove(str);
            } else {
                putObject(str, set, z0.f34219a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void remove(String str) {
        try {
            j jVar = this.data.get(str);
            if (jVar != null) {
                this.data.remove(str);
                byte bA = jVar.a();
                String str2 = null;
                if (bA <= 5) {
                    int iB = b0.b(str);
                    int i10 = jVar.f34128a;
                    remove(bA, i10 - (iB + 2), i10 + TYPE_SIZE[bA]);
                } else {
                    r rVar = (r) jVar;
                    remove(bA, rVar.f34171c, rVar.f34128a + rVar.f34173e);
                    if (rVar.f34170b) {
                        str2 = (String) rVar.f34172d;
                    }
                }
                byte b10 = (byte) (bA | (-128));
                if (this.writingMode == 0) {
                    this.aBuffer.putLong(4, this.checksum);
                    this.aBuffer.put(this.removeStart, b10);
                    this.bBuffer.putLong(4, this.checksum);
                    this.bBuffer.put(this.removeStart, b10);
                } else {
                    this.fastBuffer.a(4, this.checksum);
                }
                this.removeStart = 0;
                if (str2 != null) {
                    d1.a(new File(this.path + this.name, str2));
                }
                checkGC();
                checkIfCommit();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized String toString() {
        return "FastKV: path:" + this.path + " name:" + this.name;
    }

    private void wrapHeader(String str, byte b10, int i10) {
        int iB = b0.b(str);
        checkKeySize(iB);
        this.updateSize = iB + 2 + i10;
        preparePutBytes();
        this.fastBuffer.a(b10);
        putKey(str, iB);
    }

    public synchronized byte[] getArray(String str, byte[] bArr) {
        try {
            i iVar = (i) this.data.get(str);
            if (iVar != null) {
                return iVar.f34170b ? getArrayFromFile(iVar) : (byte[]) iVar.f34172d;
            }
            return bArr;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean getBoolean(String str, boolean z10) {
        k kVar = (k) this.data.get(str);
        if (kVar != null) {
            z10 = kVar.f34131b;
        }
        return z10;
    }

    public synchronized double getDouble(String str, double d10) {
        l lVar = (l) this.data.get(str);
        if (lVar != null) {
            d10 = lVar.f34136b;
        }
        return d10;
    }

    public synchronized float getFloat(String str, float f10) {
        m mVar = (m) this.data.get(str);
        if (mVar != null) {
            f10 = mVar.f34137b;
        }
        return f10;
    }

    public synchronized int getInt(String str, int i10) {
        n nVar = (n) this.data.get(str);
        if (nVar != null) {
            i10 = nVar.f34157b;
        }
        return i10;
    }

    public synchronized String getString(String str, String str2) {
        try {
            q qVar = (q) this.data.get(str);
            if (qVar != null) {
                return qVar.f34170b ? getStringFromFile(qVar) : (String) qVar.f34172d;
            }
            return str2;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void putAll(Map<String, Object> map, Map<Class, b> map2) {
        try {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (key != null && !key.isEmpty()) {
                    if (value instanceof String) {
                        putString(key, (String) value);
                    } else if (value instanceof Boolean) {
                        putBoolean(key, ((Boolean) value).booleanValue());
                    } else if (value instanceof Integer) {
                        putInt(key, ((Integer) value).intValue());
                    } else if (value instanceof Long) {
                        putLong(key, ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        putFloat(key, ((Float) value).floatValue());
                    } else if (value instanceof Double) {
                        putDouble(key, ((Double) value).doubleValue());
                    } else if (value instanceof Set) {
                        Set<String> set = (Set) value;
                        if (!set.isEmpty() && (set.iterator().next() instanceof String)) {
                            putStringSet(key, set);
                        }
                    } else if (value instanceof byte[]) {
                        putArray(key, (byte[]) value);
                    } else if (map2 != null) {
                        b bVar = map2.get(value.getClass());
                        if (bVar != null) {
                            putObject(key, value, bVar);
                        } else {
                            warning(new Exception("missing encoder for type:" + value.getClass()));
                        }
                    } else {
                        warning(new Exception("missing encoders"));
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void error(String str) {
        c cVar = this.logger;
        if (cVar != null) {
            cVar.b(this.name, new Exception(str));
        }
    }

    public synchronized long getLong(String str, long j10) {
        o oVar = (o) this.data.get(str);
        if (oVar != null) {
            j10 = oVar.f34161b;
        }
        return j10;
    }

    private void remove(byte b10, int i10, int i11) {
        countInvalid(i10, i11);
        byte b11 = (byte) (b10 | (-128));
        byte[] bArr = this.fastBuffer.f34062a;
        this.checksum = ((((long) (bArr[i10] ^ b11)) & 255) << ((i10 & 7) << 3)) ^ this.checksum;
        bArr[i10] = b11;
        this.removeStart = i10;
    }
}

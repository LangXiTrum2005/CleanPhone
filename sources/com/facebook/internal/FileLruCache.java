package com.facebook.internal;

import com.applovin.shadow.okio.Segment;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/facebook/internal/FileLruCache;", "", "BufferFile", "CloseCallbackOutputStream", "Companion", "CopyingInputStream", "Limits", "ModifiedFile", "StreamCloseCallback", "StreamHeader", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class FileLruCache {
    public static final AtomicLong g = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f16311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f16313c;
    public final Condition d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicLong f16314e;
    public final String f;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/FileLruCache$BufferFile;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class BufferFile {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/FileLruCache$CloseCallbackOutputStream;", "Ljava/io/OutputStream;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class CloseCallbackOutputStream extends OutputStream {
        public final FileOutputStream X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final FileLruCache$openPutStream$renameToTargetCallback$1 f16317Y;

        public CloseCallbackOutputStream(FileOutputStream fileOutputStream, FileLruCache$openPutStream$renameToTargetCallback$1 fileLruCache$openPutStream$renameToTargetCallback$1) {
            this.X = fileOutputStream;
            this.f16317Y = fileLruCache$openPutStream$renameToTargetCallback$1;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            FileLruCache$openPutStream$renameToTargetCallback$1 fileLruCache$openPutStream$renameToTargetCallback$1 = this.f16317Y;
            try {
                this.X.close();
            } finally {
                fileLruCache$openPutStream$renameToTargetCallback$1.a();
            }
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            this.X.flush();
        }

        @Override // java.io.OutputStream
        public final void write(byte[] buffer, int i2, int i3) throws IOException {
            Intrinsics.f(buffer, "buffer");
            this.X.write(buffer, i2, i3);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] buffer) throws IOException {
            Intrinsics.f(buffer, "buffer");
            this.X.write(buffer);
        }

        @Override // java.io.OutputStream
        public final void write(int i2) throws IOException {
            this.X.write(i2);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/internal/FileLruCache$Companion;", "", "", "HEADER_CACHEKEY_KEY", "Ljava/lang/String;", "HEADER_CACHE_CONTENT_TAG_KEY", "Ljava/util/concurrent/atomic/AtomicLong;", "bufferIndex", "Ljava/util/concurrent/atomic/AtomicLong;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/FileLruCache$Limits;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Limits {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/internal/FileLruCache$ModifiedFile;", "", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class ModifiedFile implements Comparable<ModifiedFile> {
        public final long X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final File f16319Y;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/FileLruCache$ModifiedFile$Companion;", "", "", "HASH_MULTIPLIER", "I", "HASH_SEED", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
        }

        public ModifiedFile(File file) {
            this.f16319Y = file;
            this.X = file.lastModified();
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(ModifiedFile another) {
            Intrinsics.f(another, "another");
            long j = this.X;
            long j2 = another.X;
            if (j < j2) {
                return -1;
            }
            if (j > j2) {
                return 1;
            }
            return this.f16319Y.compareTo(another.f16319Y);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ModifiedFile) && compareTo((ModifiedFile) obj) == 0;
        }

        public final int hashCode() {
            return ((this.f16319Y.hashCode() + 1073) * 37) + ((int) (this.X % ((long) Integer.MAX_VALUE)));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bâ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/FileLruCache$StreamCloseCallback;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface StreamCloseCallback {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/FileLruCache$StreamHeader;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class StreamHeader {
        public static JSONObject a(BufferedInputStream bufferedInputStream) throws IOException {
            if (bufferedInputStream.read() != 0) {
                return null;
            }
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                LoggingBehavior loggingBehavior = LoggingBehavior.e0;
                if (i3 >= 3) {
                    byte[] bArr = new byte[i4];
                    while (i2 < i4) {
                        int i5 = bufferedInputStream.read(bArr, i2, i4 - i2);
                        if (i5 < 1) {
                            HashMap map = Logger.d;
                            AtomicLong atomicLong = FileLruCache.g;
                            Logger.Companion.a(loggingBehavior, "FileLruCache", "readHeader: stream.read stopped at " + Integer.valueOf(i2) + " when expected " + i4);
                            return null;
                        }
                        i2 += i5;
                    }
                    try {
                        Object objNextValue = new JSONTokener(new String(bArr, Charsets.f44691a)).nextValue();
                        if (objNextValue instanceof JSONObject) {
                            return (JSONObject) objNextValue;
                        }
                        HashMap map2 = Logger.d;
                        AtomicLong atomicLong2 = FileLruCache.g;
                        Logger.Companion.a(loggingBehavior, "FileLruCache", "readHeader: expected JSONObject, got " + objNextValue.getClass().getCanonicalName());
                        return null;
                    } catch (JSONException e2) {
                        throw new IOException(e2.getMessage());
                    }
                }
                int i6 = bufferedInputStream.read();
                if (i6 == -1) {
                    HashMap map3 = Logger.d;
                    AtomicLong atomicLong3 = FileLruCache.g;
                    Logger.Companion.a(loggingBehavior, "FileLruCache", "readHeader: stream.read returned -1 while reading header size");
                    return null;
                }
                i4 = (i4 << 8) + (i6 & 255);
                i3++;
            }
        }

        public static void b(BufferedOutputStream bufferedOutputStream, JSONObject jSONObject) throws IOException {
            String string = jSONObject.toString();
            Intrinsics.e(string, "header.toString()");
            byte[] bytes = string.getBytes(Charsets.f44691a);
            Intrinsics.e(bytes, "(this as java.lang.String).getBytes(charset)");
            bufferedOutputStream.write(0);
            bufferedOutputStream.write((bytes.length >> 16) & 255);
            bufferedOutputStream.write((bytes.length >> 8) & 255);
            bufferedOutputStream.write(bytes.length & 255);
            bufferedOutputStream.write(bytes);
        }
    }

    public FileLruCache(String tag, Limits limits) {
        File[] fileArrListFiles;
        Intrinsics.f(tag, "tag");
        this.f = tag;
        HashSet hashSet = FacebookSdk.f15915a;
        Validate.h();
        LockOnGetVariable lockOnGetVariable = FacebookSdk.f15919h;
        if (lockOnGetVariable == null) {
            Intrinsics.m("cacheDir");
            throw null;
        }
        CountDownLatch countDownLatch = lockOnGetVariable.f16349b;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
        File file = new File((File) lockOnGetVariable.f16348a, this.f);
        this.f16311a = file;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f16313c = reentrantLock;
        this.d = reentrantLock.newCondition();
        this.f16314e = new AtomicLong(0L);
        if ((file.mkdirs() || file.isDirectory()) && (fileArrListFiles = file.listFiles(FileLruCache$BufferFile$filterExcludeNonBufferFiles$1.f16316a)) != null) {
            for (File file2 : fileArrListFiles) {
                file2.delete();
            }
        }
    }

    public static final void a(FileLruCache fileLruCache) throws Throwable {
        Condition condition;
        long j;
        Condition condition2 = fileLruCache.d;
        ReentrantLock reentrantLock = fileLruCache.f16313c;
        reentrantLock.lock();
        int i2 = 0;
        try {
            fileLruCache.f16312b = false;
            reentrantLock.unlock();
            try {
                HashMap map = Logger.d;
                LoggingBehavior loggingBehavior = LoggingBehavior.e0;
                Logger.Companion.a(loggingBehavior, "FileLruCache", "trim started");
                PriorityQueue priorityQueue = new PriorityQueue();
                File[] fileArrListFiles = fileLruCache.f16311a.listFiles(FileLruCache$BufferFile$filterExcludeBufferFiles$1.f16315a);
                long length = 0;
                if (fileArrListFiles != null) {
                    int length2 = fileArrListFiles.length;
                    j = 0;
                    while (i2 < length2) {
                        File file = fileArrListFiles[i2];
                        Intrinsics.e(file, "file");
                        ModifiedFile modifiedFile = new ModifiedFile(file);
                        priorityQueue.add(modifiedFile);
                        HashMap map2 = Logger.d;
                        StringBuilder sb = new StringBuilder();
                        sb.append("  trim considering time=");
                        File[] fileArr = fileArrListFiles;
                        condition = condition2;
                        try {
                            sb.append(Long.valueOf(modifiedFile.X));
                            sb.append(" name=");
                            sb.append(file.getName());
                            Logger.Companion.a(loggingBehavior, "FileLruCache", sb.toString());
                            length += file.length();
                            j++;
                            i2++;
                            fileArrListFiles = fileArr;
                            condition2 = condition;
                        } catch (Throwable th) {
                            th = th;
                            reentrantLock.lock();
                            try {
                                condition.signalAll();
                                throw th;
                            } finally {
                                reentrantLock.unlock();
                            }
                        }
                    }
                    condition = condition2;
                } else {
                    condition = condition2;
                    j = 0;
                }
                while (true) {
                    if (length <= 1048576 && j <= 1024) {
                        reentrantLock.lock();
                        try {
                            condition.signalAll();
                            return;
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                    File file2 = ((ModifiedFile) priorityQueue.remove()).f16319Y;
                    HashMap map3 = Logger.d;
                    Logger.Companion.a(loggingBehavior, "FileLruCache", "  trim removing " + file2.getName());
                    length -= file2.length();
                    j += -1;
                    file2.delete();
                }
            } catch (Throwable th2) {
                th = th2;
                condition = condition2;
            }
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public final void b() {
        final File[] fileArrListFiles = this.f16311a.listFiles(FileLruCache$BufferFile$filterExcludeBufferFiles$1.f16315a);
        this.f16314e.set(System.currentTimeMillis());
        if (fileArrListFiles != null) {
            FacebookSdk.e().execute(new Runnable() { // from class: com.facebook.internal.FileLruCache$clearCache$1
                @Override // java.lang.Runnable
                public final void run() {
                    if (CrashShieldHandler.b(this)) {
                        return;
                    }
                    try {
                        for (File file : fileArrListFiles) {
                            file.delete();
                        }
                    } catch (Throwable th) {
                        CrashShieldHandler.a(this, th);
                    }
                }
            });
        }
    }

    public final BufferedInputStream c(String str, String str2) throws IOException {
        File file = new File(this.f16311a, Utility.K(str));
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), Segment.SIZE);
            try {
                JSONObject jSONObjectA = StreamHeader.a(bufferedInputStream);
                if (jSONObjectA == null) {
                    bufferedInputStream.close();
                    return null;
                }
                if (!Intrinsics.a(jSONObjectA.optString("key"), str)) {
                    bufferedInputStream.close();
                    return null;
                }
                String strOptString = jSONObjectA.optString("tag", null);
                if (str2 == null && !Intrinsics.a(str2, strOptString)) {
                    bufferedInputStream.close();
                    return null;
                }
                long time = new Date().getTime();
                HashMap map = Logger.d;
                Logger.Companion.a(LoggingBehavior.e0, "FileLruCache", "Setting lastModified to " + Long.valueOf(time) + " for " + file.getName());
                file.setLastModified(time);
                return bufferedInputStream;
            } catch (Throwable th) {
                bufferedInputStream.close();
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final BufferedOutputStream d(String key, String str) throws IOException {
        LoggingBehavior loggingBehavior = LoggingBehavior.e0;
        Intrinsics.f(key, "key");
        File file = new File(this.f16311a, "buffer" + String.valueOf(g.incrementAndGet()));
        file.delete();
        if (!file.createNewFile()) {
            throw new IOException("Could not create file at " + file.getAbsolutePath());
        }
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new CloseCallbackOutputStream(new FileOutputStream(file), new FileLruCache$openPutStream$renameToTargetCallback$1(this, System.currentTimeMillis(), file, key)), Segment.SIZE);
            try {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key", key);
                    if (!Utility.C(str)) {
                        jSONObject.put("tag", str);
                    }
                    StreamHeader.b(bufferedOutputStream, jSONObject);
                    return bufferedOutputStream;
                } catch (JSONException e2) {
                    HashMap map = Logger.d;
                    Logger.Companion.b(loggingBehavior, "FileLruCache", "Error creating JSON header for cache file: " + e2);
                    throw new IOException(e2.getMessage());
                }
            } catch (Throwable th) {
                bufferedOutputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e3) {
            HashMap map2 = Logger.d;
            Logger.Companion.b(loggingBehavior, "FileLruCache", "Error creating buffer output stream: " + e3);
            throw new IOException(e3.getMessage());
        }
    }

    public final String toString() {
        return "{FileLruCache: tag:" + this.f + " file:" + this.f16311a.getName() + "}";
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/FileLruCache$CopyingInputStream;", "Ljava/io/InputStream;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class CopyingInputStream extends InputStream {
        public final InputStream X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final BufferedOutputStream f16318Y;

        public CopyingInputStream(InputStream inputStream, BufferedOutputStream bufferedOutputStream) {
            this.X = inputStream;
            this.f16318Y = bufferedOutputStream;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.X.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            BufferedOutputStream bufferedOutputStream = this.f16318Y;
            try {
                this.X.close();
            } finally {
                bufferedOutputStream.close();
            }
        }

        @Override // java.io.InputStream
        public final void mark(int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return false;
        }

        @Override // java.io.InputStream
        public final int read(byte[] buffer) throws IOException {
            Intrinsics.f(buffer, "buffer");
            int i2 = this.X.read(buffer);
            if (i2 > 0) {
                this.f16318Y.write(buffer, 0, i2);
            }
            return i2;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public final long skip(long j) {
            int i2;
            byte[] bArr = new byte[1024];
            long j2 = 0;
            while (j2 < j && (i2 = read(bArr, 0, (int) Math.min(j - j2, 1024))) >= 0) {
                j2 += (long) i2;
            }
            return j2;
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            int i2 = this.X.read();
            if (i2 >= 0) {
                this.f16318Y.write(i2);
            }
            return i2;
        }

        @Override // java.io.InputStream
        public final int read(byte[] buffer, int i2, int i3) throws IOException {
            Intrinsics.f(buffer, "buffer");
            int i4 = this.X.read(buffer, i2, i3);
            if (i4 > 0) {
                this.f16318Y.write(buffer, i2, i4);
            }
            return i4;
        }
    }
}

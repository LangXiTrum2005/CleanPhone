package com.bumptech.glide.disklrucache;

import android.os.Build;
import android.os.StrictMode;
import com.p004ironsource.d9;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class DiskLruCache implements Closeable {
    public final File X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final File f12315Y;
    public final File Z;
    public final File e0;
    public final long g0;
    public BufferedWriter j0;
    public int l0;
    public long i0 = 0;
    public final LinkedHashMap k0 = new LinkedHashMap(0, 0.75f, true);
    public long m0 = 0;
    public final ThreadPoolExecutor n0 = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new DiskLruCacheThreadFactory());
    public final Callable o0 = new Callable<Void>() { // from class: com.bumptech.glide.disklrucache.DiskLruCache.1
        @Override // java.util.concurrent.Callable
        public final Void call() {
            synchronized (DiskLruCache.this) {
                try {
                    DiskLruCache diskLruCache = DiskLruCache.this;
                    if (diskLruCache.j0 == null) {
                        return null;
                    }
                    diskLruCache.t();
                    if (DiskLruCache.this.k()) {
                        DiskLruCache.this.r();
                        DiskLruCache.this.l0 = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };
    public final int f0 = 1;
    public final int h0 = 1;

    public static final class DiskLruCacheThreadFactory implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    public final class Editor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Entry f12316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f12317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f12318c;

        public Editor(Entry entry) {
            this.f12316a = entry;
            this.f12317b = entry.f12322e ? null : new boolean[DiskLruCache.this.h0];
        }

        public final void a() {
            DiskLruCache.a(DiskLruCache.this, this, false);
        }

        public final File b() {
            File file;
            synchronized (DiskLruCache.this) {
                try {
                    Entry entry = this.f12316a;
                    if (entry.f != this) {
                        throw new IllegalStateException();
                    }
                    if (!entry.f12322e) {
                        this.f12317b[0] = true;
                    }
                    file = entry.d[0];
                    DiskLruCache.this.X.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return file;
        }
    }

    public final class Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f12320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final File[] f12321c;
        public final File[] d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f12322e;
        public Editor f;

        public Entry(String str) {
            this.f12319a = str;
            int i2 = DiskLruCache.this.h0;
            this.f12320b = new long[i2];
            this.f12321c = new File[i2];
            this.d = new File[i2];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i3 = 0; i3 < DiskLruCache.this.h0; i3++) {
                sb.append(i3);
                File[] fileArr = this.f12321c;
                String string = sb.toString();
                File file = DiskLruCache.this.X;
                fileArr[i3] = new File(file, string);
                sb.append(".tmp");
                this.d[i3] = new File(file, sb.toString());
                sb.setLength(length);
            }
        }

        public final String a() {
            StringBuilder sb = new StringBuilder();
            for (long j : this.f12320b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }
    }

    public final class Value {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File[] f12323a;

        public Value(File[] fileArr) {
            this.f12323a = fileArr;
        }
    }

    public DiskLruCache(File file, long j) {
        this.X = file;
        this.f12315Y = new File(file, "journal");
        this.Z = new File(file, "journal.tmp");
        this.e0 = new File(file, "journal.bkp");
        this.g0 = j;
    }

    public static void a(DiskLruCache diskLruCache, Editor editor, boolean z2) {
        synchronized (diskLruCache) {
            Entry entry = editor.f12316a;
            if (entry.f != editor) {
                throw new IllegalStateException();
            }
            if (z2 && !entry.f12322e) {
                for (int i2 = 0; i2 < diskLruCache.h0; i2++) {
                    if (!editor.f12317b[i2]) {
                        editor.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                    }
                    if (!entry.d[i2].exists()) {
                        editor.a();
                        return;
                    }
                }
            }
            for (int i3 = 0; i3 < diskLruCache.h0; i3++) {
                File file = entry.d[i3];
                if (!z2) {
                    d(file);
                } else if (file.exists()) {
                    File file2 = entry.f12321c[i3];
                    file.renameTo(file2);
                    long j = entry.f12320b[i3];
                    long length = file2.length();
                    entry.f12320b[i3] = length;
                    diskLruCache.i0 = (diskLruCache.i0 - j) + length;
                }
            }
            diskLruCache.l0++;
            entry.f = null;
            if (entry.f12322e || z2) {
                entry.f12322e = true;
                diskLruCache.j0.append((CharSequence) "CLEAN");
                diskLruCache.j0.append(' ');
                diskLruCache.j0.append((CharSequence) entry.f12319a);
                diskLruCache.j0.append((CharSequence) entry.a());
                diskLruCache.j0.append('\n');
                if (z2) {
                    diskLruCache.m0++;
                }
            } else {
                diskLruCache.k0.remove(entry.f12319a);
                diskLruCache.j0.append((CharSequence) "REMOVE");
                diskLruCache.j0.append(' ');
                diskLruCache.j0.append((CharSequence) entry.f12319a);
                diskLruCache.j0.append('\n');
            }
            i(diskLruCache.j0);
            if (diskLruCache.i0 > diskLruCache.g0 || diskLruCache.k()) {
                diskLruCache.n0.submit(diskLruCache.o0);
            }
        }
    }

    public static void b(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void d(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void i(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static DiskLruCache l(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                s(file2, file3, false);
            }
        }
        DiskLruCache diskLruCache = new DiskLruCache(file, j);
        if (diskLruCache.f12315Y.exists()) {
            try {
                diskLruCache.p();
                diskLruCache.m();
                return diskLruCache;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                diskLruCache.close();
                Util.a(diskLruCache.X);
            }
        }
        file.mkdirs();
        DiskLruCache diskLruCache2 = new DiskLruCache(file, j);
        diskLruCache2.r();
        return diskLruCache2;
    }

    public static void s(File file, File file2, boolean z2) throws IOException {
        if (z2) {
            d(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.j0 == null) {
                return;
            }
            Iterator it = new ArrayList(this.k0.values()).iterator();
            while (it.hasNext()) {
                Editor editor = ((Entry) it.next()).f;
                if (editor != null) {
                    editor.a();
                }
            }
            t();
            b(this.j0);
            this.j0 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Editor h(String str) {
        synchronized (this) {
            try {
                if (this.j0 == null) {
                    throw new IllegalStateException("cache is closed");
                }
                Entry entry = (Entry) this.k0.get(str);
                if (entry == null) {
                    entry = new Entry(str);
                    this.k0.put(str, entry);
                } else if (entry.f != null) {
                    return null;
                }
                Editor editor = new Editor(entry);
                entry.f = editor;
                this.j0.append((CharSequence) "DIRTY");
                this.j0.append(' ');
                this.j0.append((CharSequence) str);
                this.j0.append('\n');
                i(this.j0);
                return editor;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Value j(String str) {
        if (this.j0 == null) {
            throw new IllegalStateException("cache is closed");
        }
        Entry entry = (Entry) this.k0.get(str);
        if (entry == null) {
            return null;
        }
        if (!entry.f12322e) {
            return null;
        }
        for (File file : entry.f12321c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.l0++;
        this.j0.append((CharSequence) "READ");
        this.j0.append(' ');
        this.j0.append((CharSequence) str);
        this.j0.append('\n');
        if (k()) {
            this.n0.submit(this.o0);
        }
        return new Value(entry.f12321c);
    }

    public final boolean k() {
        int i2 = this.l0;
        return i2 >= 2000 && i2 >= this.k0.size();
    }

    public final void m() throws IOException {
        d(this.Z);
        Iterator it = this.k0.values().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            Editor editor = entry.f;
            int i2 = this.h0;
            int i3 = 0;
            if (editor == null) {
                while (i3 < i2) {
                    this.i0 += entry.f12320b[i3];
                    i3++;
                }
            } else {
                entry.f = null;
                while (i3 < i2) {
                    d(entry.f12321c[i3]);
                    d(entry.d[i3]);
                    i3++;
                }
                it.remove();
            }
        }
    }

    public final void p() {
        File file = this.f12315Y;
        StrictLineReader strictLineReader = new StrictLineReader(new FileInputStream(file), Util.f12325a);
        try {
            String strD = strictLineReader.d();
            String strD2 = strictLineReader.d();
            String strD3 = strictLineReader.d();
            String strD4 = strictLineReader.d();
            String strD5 = strictLineReader.d();
            if (!"libcore.io.DiskLruCache".equals(strD) || !"1".equals(strD2) || !Integer.toString(this.f0).equals(strD3) || !Integer.toString(this.h0).equals(strD4) || !"".equals(strD5)) {
                throw new IOException("unexpected journal header: [" + strD + ", " + strD2 + ", " + strD4 + ", " + strD5 + d9.i.f24752e);
            }
            int i2 = 0;
            while (true) {
                try {
                    q(strictLineReader.d());
                    i2++;
                } catch (EOFException unused) {
                    this.l0 = i2 - this.k0.size();
                    if (strictLineReader.f0 == -1) {
                        r();
                    } else {
                        this.j0 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), Util.f12325a));
                    }
                    try {
                        strictLineReader.close();
                        return;
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                strictLineReader.close();
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void q(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i2 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i2);
        LinkedHashMap linkedHashMap = this.k0;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i2);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i2, iIndexOf2);
        }
        Entry entry = (Entry) linkedHashMap.get(strSubstring);
        if (entry == null) {
            entry = new Entry(strSubstring);
            linkedHashMap.put(strSubstring, entry);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                entry.f = new Editor(entry);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        entry.f12322e = true;
        entry.f = null;
        if (strArrSplit.length != DiskLruCache.this.h0) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i3 = 0; i3 < strArrSplit.length; i3++) {
            try {
                entry.f12320b[i3] = Long.parseLong(strArrSplit[i3]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void r() {
        try {
            BufferedWriter bufferedWriter = this.j0;
            if (bufferedWriter != null) {
                b(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.Z), Util.f12325a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write("1");
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write(Integer.toString(this.f0));
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write(Integer.toString(this.h0));
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                for (Entry entry : this.k0.values()) {
                    if (entry.f != null) {
                        bufferedWriter2.write("DIRTY " + entry.f12319a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + entry.f12319a + entry.a() + '\n');
                    }
                }
                b(bufferedWriter2);
                if (this.f12315Y.exists()) {
                    s(this.f12315Y, this.e0, true);
                }
                s(this.Z, this.f12315Y, false);
                this.e0.delete();
                this.j0 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f12315Y, true), Util.f12325a));
            } catch (Throwable th) {
                b(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void t() {
        while (this.i0 > this.g0) {
            String str = (String) ((Map.Entry) this.k0.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.j0 == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    Entry entry = (Entry) this.k0.get(str);
                    if (entry != null && entry.f == null) {
                        for (int i2 = 0; i2 < this.h0; i2++) {
                            File file = entry.f12321c[i2];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.i0;
                            long[] jArr = entry.f12320b;
                            this.i0 = j - jArr[i2];
                            jArr[i2] = 0;
                        }
                        this.l0++;
                        this.j0.append((CharSequence) "REMOVE");
                        this.j0.append(' ');
                        this.j0.append((CharSequence) str);
                        this.j0.append('\n');
                        this.k0.remove(str);
                        if (k()) {
                            this.n0.submit(this.o0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}

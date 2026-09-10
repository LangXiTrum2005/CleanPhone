package com.inmobi.media;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class S3 implements Closeable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f23152p = Pattern.compile("[a-z0-9_-]{1,64}");
    public static final N3 q = new N3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f23153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f23154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f23155c;
    public final File d;
    public final long f;
    public final of g;
    public BufferedWriter j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23159l;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f23158i = 0;
    public final LinkedHashMap k = new LinkedHashMap(0, 0.75f, true);
    public long m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ThreadPoolExecutor f23160n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final M3 o = new M3(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23156e = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f23157h = 2;

    public S3(File file, long j, of ofVar) {
        this.f23153a = file;
        this.f23154b = new File(file, "journal");
        this.f23155c = new File(file, "journal.tmp");
        this.d = new File(file, "journal.bkp");
        this.f = j;
        this.g = ofVar;
    }

    public static void a(S3 s3, P3 p3, boolean z2) {
        synchronized (s3) {
            Q3 q3 = p3.f23062a;
            if (q3.d != p3) {
                throw new IllegalStateException("CurrentEditor of Entry didn't match with CurrentEditor instance.");
            }
            if (z2 && !q3.f23100c) {
                for (int i2 = 0; i2 < s3.f23157h; i2++) {
                    if (!p3.f23063b[i2]) {
                        a(p3.d, p3, false);
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                    }
                    if (!q3.b(i2).exists()) {
                        a(p3.d, p3, false);
                        return;
                    }
                }
            }
            for (int i3 = 0; i3 < s3.f23157h; i3++) {
                File fileB = q3.b(i3);
                if (z2) {
                    if (fileB.exists()) {
                        File fileA = q3.a(i3);
                        fileB.renameTo(fileA);
                        long j = q3.f23099b[i3];
                        long length = fileA.length();
                        q3.f23099b[i3] = length;
                        s3.f23158i = (s3.f23158i - j) + length;
                    }
                } else if (fileB.exists() && !fileB.delete()) {
                    throw new IOException();
                }
            }
            s3.f23159l++;
            q3.d = null;
            if (q3.f23100c || z2) {
                q3.f23100c = true;
                BufferedWriter bufferedWriter = s3.j;
                StringBuilder sb = new StringBuilder("CLEAN ");
                sb.append(q3.f23098a);
                StringBuilder sb2 = new StringBuilder();
                for (long j2 : q3.f23099b) {
                    sb2.append(' ');
                    sb2.append(j2);
                }
                sb.append(sb2.toString());
                sb.append('\n');
                bufferedWriter.write(sb.toString());
                if (z2) {
                    s3.m++;
                }
            } else {
                s3.k.remove(q3.f23098a);
                s3.j.write("REMOVE " + q3.f23098a + '\n');
            }
            s3.j.flush();
            if (s3.f23158i > s3.f || s3.a()) {
                s3.f23160n.submit(s3.o);
            }
        }
    }

    public final void b() throws IOException {
        File file = this.f23155c;
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
        Iterator it = this.k.values().iterator();
        while (it.hasNext()) {
            Q3 q3 = (Q3) it.next();
            int i2 = 0;
            if (q3.d == null) {
                while (i2 < this.f23157h) {
                    this.f23158i += q3.f23099b[i2];
                    i2++;
                }
            } else {
                q3.d = null;
                while (i2 < this.f23157h) {
                    File fileA = q3.a(i2);
                    if (fileA.exists() && !fileA.delete()) {
                        throw new IOException();
                    }
                    File fileB = q3.b(i2);
                    if (fileB.exists() && !fileB.delete()) {
                        throw new IOException();
                    }
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void c() {
        Fd fd = new Fd(new FileInputStream(this.f23154b), Ge.f22851a);
        try {
            String strA = fd.a();
            String strA2 = fd.a();
            String strA3 = fd.a();
            String strA4 = fd.a();
            String strA5 = fd.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Integer.toString(this.f23156e).equals(strA3) || !Integer.toString(this.f23157h).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + com.ironsource.d9.i.f24752e);
            }
            int i2 = 0;
            while (true) {
                try {
                    c(fd.a());
                    i2++;
                } catch (EOFException unused) {
                    this.f23159l = i2 - this.k.size();
                    Ge.a(fd);
                    return;
                }
            }
        } catch (Throwable th) {
            Ge.a(fd);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.j == null) {
                return;
            }
            Iterator it = new ArrayList(this.k.values()).iterator();
            while (it.hasNext()) {
                P3 p3 = ((Q3) it.next()).d;
                if (p3 != null) {
                    a(p3.d, p3, false);
                }
            }
            while (this.f23158i > this.f) {
                d((String) ((Map.Entry) this.k.entrySet().iterator().next()).getKey());
            }
            this.j.close();
            this.j = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d() {
        try {
            BufferedWriter bufferedWriter = this.j;
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f23155c), Ge.f22851a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write("1");
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write(Integer.toString(this.f23156e));
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write(Integer.toString(this.f23157h));
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                for (Q3 q3 : this.k.values()) {
                    if (q3.d != null) {
                        bufferedWriter2.write("DIRTY " + q3.f23098a + '\n');
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("CLEAN ");
                        sb.append(q3.f23098a);
                        StringBuilder sb2 = new StringBuilder();
                        for (long j : q3.f23099b) {
                            sb2.append(' ');
                            sb2.append(j);
                        }
                        sb.append(sb2.toString());
                        sb.append('\n');
                        bufferedWriter2.write(sb.toString());
                    }
                }
                bufferedWriter2.close();
                if (this.f23154b.exists()) {
                    File file = this.f23154b;
                    File file2 = this.d;
                    if (file2.exists() && !file2.delete()) {
                        throw new IOException();
                    }
                    if (!file.renameTo(file2)) {
                        throw new IOException();
                    }
                }
                if (!this.f23155c.renameTo(this.f23154b)) {
                    throw new IOException();
                }
                this.d.delete();
                this.j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f23154b, true), Ge.f22851a));
            } catch (Throwable th) {
                bufferedWriter2.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf != -1) {
            int i2 = iIndexOf + 1;
            int iIndexOf2 = str.indexOf(32, i2);
            if (iIndexOf2 == -1) {
                strSubstring = str.substring(i2);
                if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                    this.k.remove(strSubstring);
                    return;
                }
            } else {
                strSubstring = str.substring(i2, iIndexOf2);
            }
            Q3 q3 = (Q3) this.k.get(strSubstring);
            if (q3 == null) {
                q3 = new Q3(this, strSubstring);
                this.k.put(strSubstring, q3);
            }
            if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
                String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
                q3.f23100c = true;
                q3.d = null;
                if (strArrSplit.length == q3.f23101e.f23157h) {
                    for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                        try {
                            q3.f23099b[i3] = Long.parseLong(strArrSplit[i3]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                q3.d = new P3(this, q3);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized R3 b(String key) {
        InputStream inputStream;
        if (this.j != null) {
            if (f23152p.matcher(key).matches()) {
                Q3 q3 = (Q3) this.k.get(key);
                if (q3 == null) {
                    return null;
                }
                if (!q3.f23100c) {
                    return null;
                }
                InputStream[] inputStreamArr = new InputStream[this.f23157h];
                for (int i2 = 0; i2 < this.f23157h; i2++) {
                    try {
                        inputStreamArr[i2] = new FileInputStream(q3.a(i2));
                    } catch (FileNotFoundException unused) {
                        if (this.g != null) {
                            Intrinsics.f(key, "key");
                            LinkedHashMap linkedHashMapL = MapsKt.l(new Pair("urlKey", key));
                            Pd pd = Pd.f23077a;
                            Pd.b("ResourceDiskCacheFileMissing", linkedHashMapL, Td.SDK);
                        }
                        for (int i3 = 0; i3 < this.f23157h && (inputStream = inputStreamArr[i3]) != null; i3++) {
                            Ge.a(inputStream);
                        }
                        return null;
                    }
                }
                this.f23159l++;
                this.j.append((CharSequence) ("READ " + key + '\n'));
                if (a()) {
                    this.f23160n.submit(this.o);
                }
                return new R3(inputStreamArr);
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + key + "\"");
        }
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized void d(String str) {
        if (this.j != null) {
            if (f23152p.matcher(str).matches()) {
                Q3 q3 = (Q3) this.k.get(str);
                if (q3 != null && q3.d == null) {
                    for (int i2 = 0; i2 < this.f23157h; i2++) {
                        File file = q3.a(i2);
                        if (this.g != null) {
                            Intrinsics.f(file, "file");
                            if (str != null && i2 == 0) {
                                String str2 = "";
                                try {
                                    String strA = Ge.a(new InputStreamReader(new FileInputStream(file), Ge.f22852b));
                                    Intrinsics.e(strA, "readFully(...)");
                                    str2 = strA;
                                } catch (Exception unused) {
                                }
                                LinkedHashMap linkedHashMapL = MapsKt.l(new Pair("urlKey", str), new Pair("url", str2));
                                Pd pd = Pd.f23077a;
                                Pd.b("ResourceDiskCacheFileEvicted", linkedHashMapL, Td.SDK);
                            }
                        }
                        if (file.exists() && !file.delete()) {
                            throw new IOException("failed to delete " + file);
                        }
                        long j = this.f23158i;
                        long[] jArr = q3.f23099b;
                        this.f23158i = j - jArr[i2];
                        jArr[i2] = 0;
                    }
                    this.f23159l++;
                    this.j.append((CharSequence) ("REMOVE " + str + '\n'));
                    this.k.remove(str);
                    if (a()) {
                        this.f23160n.submit(this.o);
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
        }
        throw new IllegalStateException("cache is closed");
    }

    public final P3 a(String str) {
        synchronized (this) {
            try {
                if (this.j != null) {
                    if (f23152p.matcher(str).matches()) {
                        Q3 q3 = (Q3) this.k.get(str);
                        if (q3 == null) {
                            q3 = new Q3(this, str);
                            this.k.put(str, q3);
                        } else if (q3.d != null) {
                            return null;
                        }
                        P3 p3 = new P3(this, q3);
                        q3.d = p3;
                        this.j.write("DIRTY " + str + '\n');
                        this.j.flush();
                        return p3;
                    }
                    throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
                }
                throw new IllegalStateException("cache is closed");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a() {
        int i2 = this.f23159l;
        return i2 >= 2000 && i2 >= this.k.size();
    }
}

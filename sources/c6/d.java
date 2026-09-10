package c6;

import android.os.StrictMode;
import bc.s;
import com.ironsource.X3;
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
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s4.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f5934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f5935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f5936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f5937d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5939f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BufferedWriter f5942i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5944k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f5941h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f5943j = new LinkedHashMap(0, 0.75f, true);
    public long l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ThreadPoolExecutor f5945m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f5946n = new a(this, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5938e = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5940g = 1;

    public d(File file, long j10) {
        this.f5934a = file;
        this.f5935b = new File(file, "journal");
        this.f5936c = new File(file, "journal.tmp");
        this.f5937d = new File(file, "journal.bkp");
        this.f5939f = j10;
    }

    public static void a(d dVar, s sVar, boolean z10) {
        synchronized (dVar) {
            c cVar = (c) sVar.f5581b;
            if (cVar.f5932f != sVar) {
                throw new IllegalStateException();
            }
            if (z10 && !cVar.f5931e) {
                for (int i10 = 0; i10 < dVar.f5940g; i10++) {
                    if (!((boolean[]) sVar.f5582c)[i10]) {
                        sVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                    }
                    if (!cVar.f5930d[i10].exists()) {
                        sVar.a();
                        return;
                    }
                }
            }
            for (int i11 = 0; i11 < dVar.f5940g; i11++) {
                File file = cVar.f5930d[i11];
                if (!z10) {
                    c(file);
                } else if (file.exists()) {
                    File file2 = cVar.f5929c[i11];
                    file.renameTo(file2);
                    long j10 = cVar.f5928b[i11];
                    long length = file2.length();
                    cVar.f5928b[i11] = length;
                    dVar.f5941h = (dVar.f5941h - j10) + length;
                }
            }
            dVar.f5944k++;
            cVar.f5932f = null;
            if (cVar.f5931e || z10) {
                cVar.f5931e = true;
                dVar.f5942i.append((CharSequence) "CLEAN");
                dVar.f5942i.append(' ');
                dVar.f5942i.append((CharSequence) cVar.f5927a);
                dVar.f5942i.append((CharSequence) cVar.a());
                dVar.f5942i.append('\n');
                if (z10) {
                    dVar.l++;
                }
            } else {
                dVar.f5943j.remove(cVar.f5927a);
                dVar.f5942i.append((CharSequence) "REMOVE");
                dVar.f5942i.append(' ');
                dVar.f5942i.append((CharSequence) cVar.f5927a);
                dVar.f5942i.append('\n');
            }
            h(dVar.f5942i);
            if (dVar.f5941h > dVar.f5939f || dVar.k()) {
                dVar.f5945m.submit(dVar.f5946n);
            }
        }
    }

    public static void b(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void c(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void h(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static d n(File file, long j10) throws IOException {
        if (j10 <= 0) {
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
        d dVar = new d(file, j10);
        if (dVar.f5935b.exists()) {
            try {
                dVar.p();
                dVar.o();
                return dVar;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                dVar.close();
                g.a(dVar.f5934a);
            }
        }
        file.mkdirs();
        d dVar2 = new d(file, j10);
        dVar2.r();
        return dVar2;
    }

    public static void s(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            c(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f5942i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f5943j.values()).iterator();
            while (it.hasNext()) {
                s sVar = ((c) it.next()).f5932f;
                if (sVar != null) {
                    sVar.a();
                }
            }
            t();
            b(this.f5942i);
            this.f5942i = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final s d(String str) {
        synchronized (this) {
            try {
                if (this.f5942i == null) {
                    throw new IllegalStateException("cache is closed");
                }
                c cVar = (c) this.f5943j.get(str);
                if (cVar == null) {
                    cVar = new c(this, str);
                    this.f5943j.put(str, cVar);
                } else if (cVar.f5932f != null) {
                    return null;
                }
                s sVar = new s(this, cVar);
                cVar.f5932f = sVar;
                this.f5942i.append((CharSequence) "DIRTY");
                this.f5942i.append(' ');
                this.f5942i.append((CharSequence) str);
                this.f5942i.append('\n');
                h(this.f5942i);
                return sVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized i j(String str) {
        if (this.f5942i == null) {
            throw new IllegalStateException("cache is closed");
        }
        c cVar = (c) this.f5943j.get(str);
        if (cVar == null) {
            return null;
        }
        if (!cVar.f5931e) {
            return null;
        }
        for (File file : cVar.f5929c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f5944k++;
        this.f5942i.append((CharSequence) "READ");
        this.f5942i.append(' ');
        this.f5942i.append((CharSequence) str);
        this.f5942i.append('\n');
        if (k()) {
            this.f5945m.submit(this.f5946n);
        }
        return new i(cVar.f5929c);
    }

    public final boolean k() {
        int i10 = this.f5944k;
        return i10 >= 2000 && i10 >= this.f5943j.size();
    }

    public final void o() throws IOException {
        c(this.f5936c);
        Iterator it = this.f5943j.values().iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            s sVar = cVar.f5932f;
            int i10 = this.f5940g;
            int i11 = 0;
            if (sVar == null) {
                while (i11 < i10) {
                    this.f5941h += cVar.f5928b[i11];
                    i11++;
                }
            } else {
                cVar.f5932f = null;
                while (i11 < i10) {
                    c(cVar.f5929c[i11]);
                    c(cVar.f5930d[i11]);
                    i11++;
                }
                it.remove();
            }
        }
    }

    public final void p() {
        File file = this.f5935b;
        f fVar = new f(new FileInputStream(file), g.f5954a);
        try {
            String strD = fVar.d();
            String strD2 = fVar.d();
            String strD3 = fVar.d();
            String strD4 = fVar.d();
            String strD5 = fVar.d();
            if (!"libcore.io.DiskLruCache".equals(strD) || !"1".equals(strD2) || !Integer.toString(this.f5938e).equals(strD3) || !Integer.toString(this.f5940g).equals(strD4) || !"".equals(strD5)) {
                throw new IOException("unexpected journal header: [" + strD + ", " + strD2 + ", " + strD4 + ", " + strD5 + X3.j.f27836e);
            }
            int i10 = 0;
            while (true) {
                try {
                    q(fVar.d());
                    i10++;
                } catch (EOFException unused) {
                    this.f5944k = i10 - this.f5943j.size();
                    if (fVar.f5953e == -1) {
                        r();
                    } else {
                        this.f5942i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), g.f5954a));
                    }
                    try {
                        fVar.close();
                        return;
                    } catch (RuntimeException e10) {
                        throw e10;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                fVar.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused3) {
            }
            throw th2;
        }
    }

    public final void q(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        LinkedHashMap linkedHashMap = this.f5943j;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        c cVar = (c) linkedHashMap.get(strSubstring);
        if (cVar == null) {
            cVar = new c(this, strSubstring);
            linkedHashMap.put(strSubstring, cVar);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                cVar.f5932f = new s(this, cVar);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        cVar.f5931e = true;
        cVar.f5932f = null;
        if (strArrSplit.length != cVar.f5933g.f5940g) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            try {
                cVar.f5928b[i11] = Long.parseLong(strArrSplit[i11]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void r() {
        try {
            BufferedWriter bufferedWriter = this.f5942i;
            if (bufferedWriter != null) {
                b(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f5936c), g.f5954a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f5938e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f5940g));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (c cVar : this.f5943j.values()) {
                    if (cVar.f5932f != null) {
                        bufferedWriter2.write("DIRTY " + cVar.f5927a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + cVar.f5927a + cVar.a() + '\n');
                    }
                }
                b(bufferedWriter2);
                if (this.f5935b.exists()) {
                    s(this.f5935b, this.f5937d, true);
                }
                s(this.f5936c, this.f5935b, false);
                this.f5937d.delete();
                this.f5942i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f5935b, true), g.f5954a));
            } catch (Throwable th2) {
                b(bufferedWriter2);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void t() {
        while (this.f5941h > this.f5939f) {
            String str = (String) ((Map.Entry) this.f5943j.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f5942i == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    c cVar = (c) this.f5943j.get(str);
                    if (cVar != null && cVar.f5932f == null) {
                        for (int i10 = 0; i10 < this.f5940g; i10++) {
                            File file = cVar.f5929c[i10];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j10 = this.f5941h;
                            long[] jArr = cVar.f5928b;
                            this.f5941h = j10 - jArr[i10];
                            jArr[i10] = 0;
                        }
                        this.f5944k++;
                        this.f5942i.append((CharSequence) "REMOVE");
                        this.f5942i.append(' ');
                        this.f5942i.append((CharSequence) str);
                        this.f5942i.append('\n');
                        this.f5943j.remove(str);
                        if (k()) {
                            this.f5945m.submit(this.f5946n);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}

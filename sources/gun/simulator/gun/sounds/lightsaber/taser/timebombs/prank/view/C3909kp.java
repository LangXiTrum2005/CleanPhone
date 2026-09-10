package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.kp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3909kp implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f4618a;
    public final File b;
    public final File c;
    public final File d;
    public final long f;
    public BufferedWriter i;
    public int k;
    public long h = 0;
    public final LinkedHashMap j = new LinkedHashMap(0, 0.75f, true);
    public long l = 0;
    public final ThreadPoolExecutor m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC3206cp());
    public final CallableC3118bp n = new CallableC3118bp(this);
    public final int e = 1;
    public final int g = 1;

    public C3909kp(File file, long j) {
        this.f4618a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.d = new File(file, "journal.bkp");
        this.f = j;
    }

    public static void a(C3909kp c3909kp, C3877kY c3877kY, boolean z) {
        synchronized (c3909kp) {
            C3471fp c3471fp = (C3471fp) c3877kY.c;
            if (c3471fp.f != c3877kY) {
                throw new IllegalStateException();
            }
            if (z && !c3471fp.e) {
                for (int i = 0; i < c3909kp.g; i++) {
                    if (!((boolean[]) c3877kY.d)[i]) {
                        c3877kY.c();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!c3471fp.d[i].exists()) {
                        c3877kY.c();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < c3909kp.g; i2++) {
                File file = c3471fp.d[i2];
                if (!z) {
                    c(file);
                } else if (file.exists()) {
                    File file2 = c3471fp.c[i2];
                    file.renameTo(file2);
                    long j = c3471fp.b[i2];
                    long length = file2.length();
                    c3471fp.b[i2] = length;
                    c3909kp.h = (c3909kp.h - j) + length;
                }
            }
            c3909kp.k++;
            c3471fp.f = null;
            if (c3471fp.e || z) {
                c3471fp.e = true;
                c3909kp.i.append((CharSequence) "CLEAN");
                c3909kp.i.append(' ');
                c3909kp.i.append((CharSequence) c3471fp.f4387a);
                c3909kp.i.append((CharSequence) c3471fp.a());
                c3909kp.i.append('\n');
                if (z) {
                    long j2 = c3909kp.l;
                    c3909kp.l = 1 + j2;
                    c3471fp.g = j2;
                }
            } else {
                c3909kp.j.remove(c3471fp.f4387a);
                c3909kp.i.append((CharSequence) "REMOVE");
                c3909kp.i.append(' ');
                c3909kp.i.append((CharSequence) c3471fp.f4387a);
                c3909kp.i.append('\n');
            }
            f(c3909kp.i);
            if (c3909kp.h > c3909kp.f || c3909kp.h()) {
                c3909kp.m.submit(c3909kp.n);
            }
        }
    }

    public static void b(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void c(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void f(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static C3909kp i(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                p(file2, file3, false);
            }
        }
        C3909kp c3909kp = new C3909kp(file, j);
        if (c3909kp.b.exists()) {
            try {
                c3909kp.m();
                c3909kp.k();
                return c3909kp;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                c3909kp.close();
                Wg0.a(c3909kp.f4618a);
            }
        }
        file.mkdirs();
        C3909kp c3909kp2 = new C3909kp(file, j);
        c3909kp2.o();
        return c3909kp2;
    }

    public static void p(File file, File file2, boolean z) throws IOException {
        if (z) {
            c(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.i == null) {
                return;
            }
            Iterator it = new ArrayList(this.j.values()).iterator();
            while (it.hasNext()) {
                C3877kY c3877kY = ((C3471fp) it.next()).f;
                if (c3877kY != null) {
                    c3877kY.c();
                }
            }
            q();
            b(this.i);
            this.i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final C3877kY e(String str) {
        synchronized (this) {
            try {
                if (this.i == null) {
                    throw new IllegalStateException("cache is closed");
                }
                C3471fp c3471fp = (C3471fp) this.j.get(str);
                if (c3471fp == null) {
                    c3471fp = new C3471fp(this, str);
                    this.j.put(str, c3471fp);
                } else if (c3471fp.f != null) {
                    return null;
                }
                C3877kY c3877kY = new C3877kY(this, c3471fp, 0);
                c3471fp.f = c3877kY;
                this.i.append((CharSequence) "DIRTY");
                this.i.append(' ');
                this.i.append((CharSequence) str);
                this.i.append('\n');
                f(this.i);
                return c3877kY;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, long[]] */
    public final synchronized C3647hp g(String str) {
        if (this.i == null) {
            throw new IllegalStateException("cache is closed");
        }
        C3471fp c3471fp = (C3471fp) this.j.get(str);
        if (c3471fp == null) {
            return null;
        }
        if (!c3471fp.e) {
            return null;
        }
        for (File file : c3471fp.c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.k++;
        this.i.append((CharSequence) "READ");
        this.i.append(' ');
        this.i.append((CharSequence) str);
        this.i.append('\n');
        if (h()) {
            this.m.submit(this.n);
        }
        long j = c3471fp.g;
        File[] fileArr = c3471fp.c;
        ?? r0 = c3471fp.b;
        C3647hp c3647hp = new C3647hp();
        c3647hp.b = this;
        c3647hp.c = str;
        c3647hp.f4473a = j;
        c3647hp.e = fileArr;
        c3647hp.d = r0;
        return c3647hp;
    }

    public final boolean h() {
        int i = this.k;
        return i >= 2000 && i >= this.j.size();
    }

    public final void k() throws IOException {
        c(this.c);
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            C3471fp c3471fp = (C3471fp) it.next();
            C3877kY c3877kY = c3471fp.f;
            int i = this.g;
            int i2 = 0;
            if (c3877kY == null) {
                while (i2 < i) {
                    this.h += c3471fp.b[i2];
                    i2++;
                }
            } else {
                c3471fp.f = null;
                while (i2 < i) {
                    c(c3471fp.c[i2]);
                    c(c3471fp.d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void m() {
        File file = this.b;
        S90 s90 = new S90(new FileInputStream(file), Wg0.f3932a);
        try {
            String strH = s90.h();
            String strH2 = s90.h();
            String strH3 = s90.h();
            String strH4 = s90.h();
            String strH5 = s90.h();
            if (!"libcore.io.DiskLruCache".equals(strH) || !"1".equals(strH2) || !Integer.toString(this.e).equals(strH3) || !Integer.toString(this.g).equals(strH4) || !"".equals(strH5)) {
                throw new IOException("unexpected journal header: [" + strH + ", " + strH2 + ", " + strH4 + ", " + strH5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    n(s90.h());
                    i++;
                } catch (EOFException unused) {
                    this.k = i - this.j.size();
                    if (s90.e == -1) {
                        o();
                    } else {
                        this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), Wg0.f3932a));
                    }
                    try {
                        s90.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                s90.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void n(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.j;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C3471fp c3471fp = (C3471fp) linkedHashMap.get(strSubstring);
        if (c3471fp == null) {
            c3471fp = new C3471fp(this, strSubstring);
            linkedHashMap.put(strSubstring, c3471fp);
        }
        int i2 = 0;
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c3471fp.f = new C3877kY(this, c3471fp, i2);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        c3471fp.e = true;
        c3471fp.f = null;
        if (strArrSplit.length != c3471fp.h.g) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        while (i2 < strArrSplit.length) {
            try {
                c3471fp.b[i2] = Long.parseLong(strArrSplit[i2]);
                i2++;
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void o() {
        try {
            BufferedWriter bufferedWriter = this.i;
            if (bufferedWriter != null) {
                b(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), Wg0.f3932a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.g));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (C3471fp c3471fp : this.j.values()) {
                    if (c3471fp.f != null) {
                        bufferedWriter2.write("DIRTY " + c3471fp.f4387a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + c3471fp.f4387a + c3471fp.a() + '\n');
                    }
                }
                b(bufferedWriter2);
                if (this.b.exists()) {
                    p(this.b, this.d, true);
                }
                p(this.c, this.b, false);
                this.d.delete();
                this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), Wg0.f3932a));
            } catch (Throwable th) {
                b(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void q() {
        while (this.h > this.f) {
            String str = (String) ((Map.Entry) this.j.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.i == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    C3471fp c3471fp = (C3471fp) this.j.get(str);
                    if (c3471fp != null && c3471fp.f == null) {
                        for (int i = 0; i < this.g; i++) {
                            File file = c3471fp.c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.h;
                            long[] jArr = c3471fp.b;
                            this.h = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.k++;
                        this.i.append((CharSequence) "REMOVE");
                        this.i.append(' ');
                        this.i.append((CharSequence) str);
                        this.i.append('\n');
                        this.j.remove(str);
                        if (h()) {
                            this.m.submit(this.n);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}

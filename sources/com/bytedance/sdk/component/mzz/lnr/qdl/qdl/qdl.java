package com.bytedance.sdk.component.mzz.lnr.qdl.qdl;

import android.support.v4.media.a;
import android.util.Log;
import com.bytedance.sdk.component.utils.to;
import com.p004ironsource.d9;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.thinkup.core.common.n.mo;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class qdl implements Closeable {
    private Writer fs;
    private final int jpc;
    private final File mml;
    private final File mo;
    private final File mzz;
    private int rdp;
    private final int to;
    private long tvp;
    final ExecutorService ud;
    private final File wd;
    static final Pattern qdl = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final OutputStream lnr = new OutputStream() { // from class: com.bytedance.sdk.component.mzz.lnr.qdl.qdl.qdl.2
        @Override // java.io.OutputStream
        public void write(int i2) throws IOException {
        }
    };
    private long rq = 0;
    private final LinkedHashMap<String, ud> exu = new LinkedHashMap<>(0, 0.75f, true);
    private long bjy = -1;
    private long jtx = 0;
    private final Callable<Void> yt = new Callable<Void>() { // from class: com.bytedance.sdk.component.mzz.lnr.qdl.qdl.qdl.1
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (qdl.this) {
                try {
                    if (qdl.this.fs == null) {
                        return null;
                    }
                    qdl.this.jpc();
                    if (qdl.this.mo()) {
                        qdl.this.mzz();
                        qdl.this.rdp = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    public final class lnr implements Closeable {
        private final long lnr;
        private final InputStream[] mml;
        private final long[] mzz;
        private final String ud;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.mml) {
                to.qdl(inputStream);
            }
        }

        public InputStream qdl(int i2) {
            return this.mml[i2];
        }

        private lnr(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.ud = str;
            this.lnr = j;
            this.mml = inputStreamArr;
            this.mzz = jArr;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.mzz.lnr.qdl.qdl.qdl$qdl, reason: collision with other inner class name */
    public final class C0087qdl {
        private final boolean[] lnr;
        private boolean mml;
        private boolean mzz;
        private final ud ud;

        /* JADX INFO: renamed from: com.bytedance.sdk.component.mzz.lnr.qdl.qdl.qdl$qdl$qdl, reason: collision with other inner class name */
        public class C0088qdl extends FilterOutputStream {
            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    C0087qdl.this.mml = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    C0087qdl.this.mml = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i2) {
                try {
                    ((FilterOutputStream) this).out.write(i2);
                } catch (IOException unused) {
                    C0087qdl.this.mml = true;
                }
            }

            private C0088qdl(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i2, int i3) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i2, i3);
                } catch (IOException unused) {
                    C0087qdl.this.mml = true;
                }
            }
        }

        private C0087qdl(ud udVar) {
            this.ud = udVar;
            this.lnr = udVar.mml ? null : new boolean[qdl.this.to];
        }

        public void ud() throws IOException {
            qdl.this.qdl(this, false);
        }

        public OutputStream qdl(int i2) throws IOException {
            FileOutputStream fileOutputStream;
            C0088qdl c0088qdl;
            if (i2 >= 0 && i2 < qdl.this.to) {
                synchronized (qdl.this) {
                    try {
                        if (this.ud.mzz == this) {
                            if (!this.ud.mml) {
                                this.lnr[i2] = true;
                            }
                            File fileUd = this.ud.ud(i2);
                            try {
                                fileOutputStream = new FileOutputStream(fileUd);
                            } catch (FileNotFoundException unused) {
                                qdl.this.mml.mkdirs();
                                try {
                                    fileOutputStream = new FileOutputStream(fileUd);
                                } catch (FileNotFoundException unused2) {
                                    return qdl.lnr;
                                }
                            }
                            c0088qdl = new C0088qdl(fileOutputStream);
                        } else {
                            throw new IllegalStateException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c0088qdl;
            }
            StringBuilder sbU = a.u(i2, "Expected index ", " to be greater than 0 and less than the maximum value count of ");
            sbU.append(qdl.this.to);
            throw new IllegalArgumentException(sbU.toString());
        }

        public void qdl() throws IOException {
            if (this.mml) {
                qdl.this.qdl(this, false);
                qdl.this.lnr(this.ud.ud);
            } else {
                qdl.this.qdl(this, true);
            }
            this.mzz = true;
        }
    }

    public final class ud {
        private final long[] lnr;
        private boolean mml;
        private long mo;
        private C0087qdl mzz;
        private final String ud;

        private ud(String str) {
            this.ud = str;
            this.lnr = new long[qdl.this.to];
        }

        private IOException ud(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File ud(int i2) {
            return new File(qdl.this.mml, this.ud + mo.ono + i2 + ".tmp");
        }

        public String qdl() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.lnr) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qdl(String[] strArr) throws IOException {
            if (strArr.length == qdl.this.to) {
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    try {
                        this.lnr[i2] = Long.parseLong(strArr[i2]);
                    } catch (NumberFormatException unused) {
                        throw ud(strArr);
                    }
                }
                return;
            }
            throw ud(strArr);
        }

        public File qdl(int i2) {
            return new File(qdl.this.mml, this.ud + mo.ono + i2);
        }
    }

    private qdl(File file, int i2, int i3, long j, ExecutorService executorService) {
        this.mml = file;
        this.jpc = i2;
        this.mzz = new File(file, "journal");
        this.mo = new File(file, "journal.tmp");
        this.wd = new File(file, "journal.bkp");
        this.to = i3;
        this.tvp = j;
        this.ud = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpc() throws IOException {
        long j = this.tvp;
        long j2 = this.bjy;
        if (j2 >= 0) {
            j = j2;
        }
        while (this.rq > j) {
            lnr(this.exu.entrySet().iterator().next().getKey());
        }
        this.bjy = -1L;
    }

    private void wd() {
        if (this.fs == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.fs == null) {
                return;
            }
            for (ud udVar : new ArrayList(this.exu.values())) {
                if (udVar.mzz != null) {
                    udVar.mzz.ud();
                }
            }
            jpc();
            this.fs.close();
            this.fs = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void lnr() throws IOException {
        com.bytedance.sdk.component.mzz.lnr.qdl.qdl.lnr lnrVar = new com.bytedance.sdk.component.mzz.lnr.qdl.qdl.lnr(new FileInputStream(this.mzz), mml.qdl);
        try {
            String strQdl = lnrVar.qdl();
            String strQdl2 = lnrVar.qdl();
            String strQdl3 = lnrVar.qdl();
            String strQdl4 = lnrVar.qdl();
            String strQdl5 = lnrVar.qdl();
            if (!"libcore.io.DiskLruCache".equals(strQdl) || !"1".equals(strQdl2) || !Integer.toString(this.jpc).equals(strQdl3) || !Integer.toString(this.to).equals(strQdl4) || !"".equals(strQdl5)) {
                throw new IOException("unexpected journal header: [" + strQdl + ", " + strQdl2 + ", " + strQdl4 + ", " + strQdl5 + d9.i.f24752e);
            }
            int i2 = 0;
            while (true) {
                try {
                    mml(lnrVar.qdl());
                    i2++;
                } catch (EOFException unused) {
                    this.rdp = i2 - this.exu.size();
                    if (lnrVar.ud()) {
                        mzz();
                    } else {
                        this.fs = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.mzz, true), mml.qdl));
                    }
                    to.qdl(lnrVar);
                    return;
                }
            }
        } catch (Throwable th) {
            to.qdl(lnrVar);
            throw th;
        }
    }

    private void mml(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i2 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i2);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i2);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.exu.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i2, iIndexOf2);
        }
        ud udVar = this.exu.get(strSubstring);
        if (udVar == null) {
            udVar = new ud(strSubstring);
            this.exu.put(strSubstring, udVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            udVar.mml = true;
            udVar.mzz = null;
            udVar.qdl(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            udVar.mzz = new C0087qdl(udVar);
        } else if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean mo() {
        int i2 = this.rdp;
        return i2 >= 2000 && i2 >= this.exu.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void mzz() throws IOException {
        try {
            Writer writer = this.fs;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.mo), mml.qdl));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter.write("1");
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter.write(Integer.toString(this.jpc));
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter.write(Integer.toString(this.to));
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                for (ud udVar : this.exu.values()) {
                    if (udVar.mzz != null) {
                        bufferedWriter.write("DIRTY " + udVar.ud + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + udVar.ud + udVar.qdl() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.mzz.exists()) {
                    qdl(this.mzz, this.wd, true);
                }
                qdl(this.mo, this.mzz, false);
                this.wd.delete();
                this.fs = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.mzz, true), mml.qdl));
            } catch (Throwable th) {
                bufferedWriter.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public C0087qdl ud(String str) throws IOException {
        return qdl(str, -1L);
    }

    public void ud() throws IOException {
        close();
        mml.qdl(this.mml);
    }

    public static qdl qdl(File file, int i2, int i3, long j, ExecutorService executorService) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i3 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    qdl(file2, file3, false);
                }
            }
            qdl qdlVar = new qdl(file, i2, i3, j, executorService);
            if (qdlVar.mzz.exists()) {
                try {
                    qdlVar.lnr();
                    qdlVar.mml();
                    return qdlVar;
                } catch (IOException e2) {
                    Log.w("DiskLruCache ", file + " is corrupt: " + e2.getMessage() + ", removing");
                    qdlVar.ud();
                }
            }
            file.mkdirs();
            qdl qdlVar2 = new qdl(file, i2, i3, j, executorService);
            qdlVar2.mzz();
            return qdlVar2;
        }
        throw new IllegalArgumentException("valueCount <= 0");
    }

    public synchronized boolean lnr(String str) throws IOException {
        try {
            wd();
            mzz(str);
            ud udVar = this.exu.get(str);
            if (udVar != null && udVar.mzz == null) {
                for (int i2 = 0; i2 < this.to; i2++) {
                    File fileQdl = udVar.qdl(i2);
                    if (fileQdl.exists() && !fileQdl.delete()) {
                        throw new IOException("failed to delete ".concat(String.valueOf(fileQdl)));
                    }
                    this.rq -= udVar.lnr[i2];
                    udVar.lnr[i2] = 0;
                }
                this.rdp++;
                this.fs.append((CharSequence) ("REMOVE " + str + '\n'));
                this.exu.remove(str);
                if (mo()) {
                    this.ud.submit(this.yt);
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void mml() throws IOException {
        qdl(this.mo);
        Iterator<ud> it = this.exu.values().iterator();
        while (it.hasNext()) {
            ud next = it.next();
            int i2 = 0;
            if (next.mzz != null) {
                next.mzz = null;
                while (i2 < this.to) {
                    qdl(next.qdl(i2));
                    qdl(next.ud(i2));
                    i2++;
                }
                it.remove();
            } else {
                while (i2 < this.to) {
                    this.rq += next.lnr[i2];
                    i2++;
                }
            }
        }
    }

    private static void qdl(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void qdl(File file, File file2, boolean z2) throws IOException {
        if (z2) {
            qdl(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private void mzz(String str) {
        if (!qdl.matcher(str).matches()) {
            throw new IllegalArgumentException(a.n("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    public synchronized lnr qdl(String str) throws Throwable {
        Throwable th;
        InputStream inputStream;
        try {
            wd();
            mzz(str);
            ud udVar = this.exu.get(str);
            if (udVar == null) {
                return null;
            }
            if (!udVar.mml) {
                return null;
            }
            InputStream[] inputStreamArr = new InputStream[this.to];
            for (int i2 = 0; i2 < this.to; i2++) {
                try {
                    try {
                        try {
                            inputStreamArr[i2] = new FileInputStream(udVar.qdl(i2));
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (FileNotFoundException unused) {
                        for (int i3 = 0; i3 < this.to && (inputStream = inputStreamArr[i3]) != null; i3++) {
                            to.qdl(inputStream);
                        }
                        return null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                }
            }
            this.rdp++;
            this.fs.append((CharSequence) ("READ " + str + '\n'));
            if (mo()) {
                this.ud.submit(this.yt);
            }
            return new lnr(str, udVar.mo, inputStreamArr, udVar.lnr);
        } catch (Throwable th4) {
            th = th4;
        }
        th = th;
        throw th;
    }

    private synchronized C0087qdl qdl(String str, long j) throws IOException {
        wd();
        mzz(str);
        ud udVar = this.exu.get(str);
        if (j != -1 && (udVar == null || udVar.mo != j)) {
            return null;
        }
        if (udVar != null) {
            if (udVar.mzz != null) {
                return null;
            }
        } else {
            udVar = new ud(str);
            this.exu.put(str, udVar);
        }
        C0087qdl c0087qdl = new C0087qdl(udVar);
        udVar.mzz = c0087qdl;
        this.fs.write("DIRTY " + str + '\n');
        this.fs.flush();
        return c0087qdl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void qdl(C0087qdl c0087qdl, boolean z2) throws IOException {
        ud udVar = c0087qdl.ud;
        if (udVar.mzz == c0087qdl) {
            if (z2 && !udVar.mml) {
                for (int i2 = 0; i2 < this.to; i2++) {
                    if (c0087qdl.lnr[i2]) {
                        if (!udVar.ud(i2).exists()) {
                            c0087qdl.ud();
                            return;
                        }
                    } else {
                        c0087qdl.ud();
                        throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i2)));
                    }
                }
            }
            for (int i3 = 0; i3 < this.to; i3++) {
                File fileUd = udVar.ud(i3);
                if (z2) {
                    if (fileUd.exists()) {
                        File fileQdl = udVar.qdl(i3);
                        fileUd.renameTo(fileQdl);
                        long j = udVar.lnr[i3];
                        long length = fileQdl.length();
                        udVar.lnr[i3] = length;
                        this.rq = (this.rq - j) + length;
                    }
                } else {
                    qdl(fileUd);
                }
            }
            this.rdp++;
            udVar.mzz = null;
            if (!(udVar.mml | z2)) {
                this.exu.remove(udVar.ud);
                this.fs.write("REMOVE " + udVar.ud + '\n');
            } else {
                udVar.mml = true;
                this.fs.write("CLEAN " + udVar.ud + udVar.qdl() + '\n');
                if (z2) {
                    long j2 = this.jtx;
                    this.jtx = 1 + j2;
                    udVar.mo = j2;
                }
            }
            this.fs.flush();
            if (this.rq > this.tvp || mo()) {
                this.ud.submit(this.yt);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public synchronized void qdl() throws IOException {
        wd();
        jpc();
        this.fs.flush();
    }
}

package com.thinkup.core.common.res;

import android.support.v4.media.a;
import com.p004ironsource.d9;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.thinkup.core.common.n.mo;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements Closeable {
    static final String m = "journal.tmp";
    private static final String m0 = "REMOVE";
    private static final Charset mm = Charset.forName("UTF-8");
    private static final int mn = 8192;
    private static final String mo = "READ";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final String f42367n = "libcore.io.DiskLruCache";
    static final String o = "journal";
    static final String o0 = "1";
    private static final String om = "CLEAN";
    private static final String on = "DIRTY";
    static final long oo = -1;
    private final File n0;
    private final File nm;
    private final File no;
    private final long o00;
    private Writer o0n;
    private int ooo;
    private long o0m = 0;
    private final LinkedHashMap<String, m> oo0 = new LinkedHashMap<>(0, 0.75f, true);
    private long oom = 0;
    private final ExecutorService oon = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final Callable<Void> om0 = new Callable<Void>() { // from class: com.thinkup.core.common.res.o.1
        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (o.this) {
                try {
                    if (o.this.o0n == null) {
                        return null;
                    }
                    o.this.n0();
                    if (o.this.m0()) {
                        o.this.o0();
                        o.oo(o.this);
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };
    private final int nn = 1;
    private final int o0o = 1;

    public final class m {
        private final String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long[] f42368n;
        private boolean o0;
        private long om;
        private C0693o oo;

        public /* synthetic */ m(o oVar, String str, byte b2) {
            this(str);
        }

        private m(String str) {
            this.m = str;
            this.f42368n = new long[o.this.o0o];
        }

        private static IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public static /* synthetic */ boolean o(m mVar) {
            mVar.o0 = true;
            return true;
        }

        public final File m(int i2) {
            return new File(o.this.n0, this.m + mo.ono + i2 + ".tmp");
        }

        public final String o() {
            StringBuilder sb = new StringBuilder();
            for (long j : this.f42368n) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        private void o(String[] strArr) throws IOException {
            if (strArr.length == o.this.o0o) {
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    try {
                        this.f42368n[i2] = Long.parseLong(strArr[i2]);
                    } catch (NumberFormatException unused) {
                        throw m(strArr);
                    }
                }
                return;
            }
            throw m(strArr);
        }

        public final File o(int i2) {
            return new File(o.this.n0, this.m + mo.ono + i2);
        }

        public static /* synthetic */ void o(m mVar, String[] strArr) throws IOException {
            if (strArr.length == o.this.o0o) {
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    try {
                        mVar.f42368n[i2] = Long.parseLong(strArr[i2]);
                    } catch (NumberFormatException unused) {
                        throw m(strArr);
                    }
                }
                return;
            }
            throw m(strArr);
        }
    }

    public final class n implements Closeable {
        private final String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f42369n;
        private final InputStream[] o0;

        public /* synthetic */ n(o oVar, String str, long j, InputStream[] inputStreamArr, byte b2) {
            this(str, j, inputStreamArr);
        }

        private C0693o m() {
            return o.this.o(this.m, this.f42369n);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.o0) {
                o.o((Closeable) inputStream);
            }
        }

        public final InputStream o() {
            return this.o0[0];
        }

        private n(String str, long j, InputStream[] inputStreamArr) {
            this.m = str;
            this.f42369n = j;
            this.o0 = inputStreamArr;
        }

        private String o(int i2) {
            return o.o(this.o0[i2]);
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.res.o$o, reason: collision with other inner class name */
    public final class C0693o {
        private final m m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f42370n;

        /* JADX INFO: renamed from: com.thinkup.core.common.res.o$o$o, reason: collision with other inner class name */
        public class C0694o extends FilterOutputStream {
            public /* synthetic */ C0694o(C0693o c0693o, OutputStream outputStream, byte b2) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    C0693o.m(C0693o.this);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public final void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    C0693o.m(C0693o.this);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(int i2) {
                try {
                    ((FilterOutputStream) this).out.write(i2);
                } catch (IOException unused) {
                    C0693o.m(C0693o.this);
                }
            }

            private C0694o(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(byte[] bArr, int i2, int i3) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i2, i3);
                } catch (IOException unused) {
                    C0693o.m(C0693o.this);
                }
            }
        }

        public /* synthetic */ C0693o(o oVar, m mVar, byte b2) {
            this(mVar);
        }

        public static /* synthetic */ boolean m(C0693o c0693o) {
            c0693o.f42370n = true;
            return true;
        }

        private String n(int i2) {
            InputStream inputStreamM = m(i2);
            if (inputStreamM != null) {
                return o.o(inputStreamM);
            }
            return null;
        }

        private C0693o(m mVar) {
            this.m = mVar;
        }

        private InputStream m(int i2) {
            synchronized (o.this) {
                try {
                    if (this.m.oo != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.m.o0) {
                        return null;
                    }
                    return new FileInputStream(this.m.o(i2));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final OutputStream o(int i2) {
            C0694o c0694o;
            synchronized (o.this) {
                try {
                    if (this.m.oo != this) {
                        throw new IllegalStateException();
                    }
                    c0694o = new C0694o(this, new FileOutputStream(this.m.m(i2)), (byte) 0);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c0694o;
        }

        private void o(int i2, String str) throws Throwable {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(o(i2), o.mm);
                try {
                    outputStreamWriter2.write(str);
                    o.o(outputStreamWriter2);
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter = outputStreamWriter2;
                    o.o(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public final void m() {
            o.this.o(this, false);
        }

        public final void o() {
            if (this.f42370n) {
                o.this.o(this, false);
                o.this.n(this.m.m);
            } else {
                o.this.o(this, true);
            }
        }
    }

    private o(File file, long j) {
        this.n0 = file;
        this.no = new File(file, o);
        this.nm = new File(file, m);
        this.o00 = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m0() {
        int i2 = this.ooo;
        return i2 >= 2000 && i2 >= this.oo0.size();
    }

    private void mm() {
        if (this.o0n == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private synchronized void mn() {
        mm();
        n0();
        this.o0n.flush();
    }

    private boolean mo() {
        return this.o0n == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0() {
        while (this.o0m > this.o00) {
            n(this.oo0.entrySet().iterator().next().getKey());
        }
    }

    private void no() throws IOException {
        close();
        o(this.n0);
    }

    public static /* synthetic */ int oo(o oVar) {
        oVar.ooo = 0;
        return 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.o0n == null) {
                return;
            }
            for (m mVar : new ArrayList(this.oo0.values())) {
                if (mVar.oo != null) {
                    mVar.oo.m();
                }
            }
            n0();
            this.o0n.close();
            this.o0n = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private static String m(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder(80);
        while (true) {
            int i2 = inputStream.read();
            if (i2 == -1) {
                throw new EOFException();
            }
            if (i2 == 10) {
                int length = sb.length();
                if (length > 0) {
                    int i3 = length - 1;
                    if (sb.charAt(i3) == '\r') {
                        sb.setLength(i3);
                    }
                }
                return sb.toString();
            }
            sb.append((char) i2);
        }
    }

    private void n() throws IOException {
        m(this.nm);
        Iterator<m> it = this.oo0.values().iterator();
        while (it.hasNext()) {
            m next = it.next();
            int i2 = 0;
            if (next.oo == null) {
                while (i2 < this.o0o) {
                    this.o0m += next.f42368n[i2];
                    i2++;
                }
            } else {
                next.oo = null;
                while (i2 < this.o0o) {
                    m(next.o(i2));
                    m(next.m(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    private void o0(String str) throws IOException {
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length < 2) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        String str2 = strArrSplit[1];
        byte b2 = 0;
        if (strArrSplit[0].equals(m0) && strArrSplit.length == 2) {
            this.oo0.remove(str2);
            return;
        }
        m mVar = this.oo0.get(str2);
        if (mVar == null) {
            mVar = new m(this, str2, b2);
            this.oo0.put(str2, mVar);
        }
        if (!strArrSplit[0].equals(om) || strArrSplit.length != this.o0o + 2) {
            if (strArrSplit[0].equals(on) && strArrSplit.length == 2) {
                mVar.oo = new C0693o(this, mVar, b2);
                return;
            } else {
                if (!strArrSplit[0].equals(mo) || strArrSplit.length != 2) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        m.o(mVar);
        mVar.oo = null;
        int length = strArrSplit.length;
        int length2 = strArrSplit.length;
        if (2 > length) {
            throw new IllegalArgumentException();
        }
        if (2 > length2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = length - 2;
        int iMin = Math.min(i2, length2 - 2);
        Object[] objArr = (Object[]) Array.newInstance(strArrSplit.getClass().getComponentType(), i2);
        System.arraycopy(strArrSplit, 2, objArr, 0, iMin);
        m.o(mVar, (String[]) objArr);
    }

    private long om() {
        return this.o00;
    }

    private synchronized long on() {
        return this.o0m;
    }

    private File oo() {
        return this.n0;
    }

    private static void oo(String str) {
        if (str.contains(" ") || str.contains(IOUtils.LINE_SEPARATOR_UNIX) || str.contains("\r")) {
            throw new IllegalArgumentException(a.n("keys must not contain spaces or newlines: \"", str, "\""));
        }
    }

    private static <T> T[] o(T[] tArr, int i2) {
        int length = tArr.length;
        if (2 > i2) {
            throw new IllegalArgumentException();
        }
        if (2 <= length) {
            int i3 = i2 - 2;
            int iMin = Math.min(i3, length - 2);
            T[] tArr2 = (T[]) ((Object[]) a.e(i3, tArr));
            System.arraycopy(tArr, 2, tArr2, 0, iMin);
            return tArr2;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    private void m() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.no), 8192);
        try {
            String strM = m(bufferedInputStream);
            String strM2 = m(bufferedInputStream);
            String strM3 = m(bufferedInputStream);
            String strM4 = m(bufferedInputStream);
            String strM5 = m(bufferedInputStream);
            if (!f42367n.equals(strM) || !"1".equals(strM2) || !Integer.toString(this.nn).equals(strM3) || !Integer.toString(this.o0o).equals(strM4) || !"".equals(strM5)) {
                throw new IOException("unexpected journal header: [" + strM + ", " + strM2 + ", " + strM4 + ", " + strM5 + d9.i.f24752e);
            }
            while (true) {
                try {
                    String strM6 = m(bufferedInputStream);
                    String[] strArrSplit = strM6.split(" ");
                    if (strArrSplit.length >= 2) {
                        String str = strArrSplit[1];
                        byte b2 = 0;
                        if (strArrSplit[0].equals(m0) && strArrSplit.length == 2) {
                            this.oo0.remove(str);
                        } else {
                            m mVar = this.oo0.get(str);
                            if (mVar == null) {
                                mVar = new m(this, str, b2);
                                this.oo0.put(str, mVar);
                            }
                            if (strArrSplit[0].equals(om) && strArrSplit.length == this.o0o + 2) {
                                m.o(mVar);
                                mVar.oo = null;
                                int length = strArrSplit.length;
                                int length2 = strArrSplit.length;
                                if (2 > length) {
                                    throw new IllegalArgumentException();
                                }
                                if (2 <= length2) {
                                    int i2 = length - 2;
                                    int iMin = Math.min(i2, length2 - 2);
                                    Object[] objArr = (Object[]) Array.newInstance(strArrSplit.getClass().getComponentType(), i2);
                                    System.arraycopy(strArrSplit, 2, objArr, 0, iMin);
                                    m.o(mVar, (String[]) objArr);
                                } else {
                                    throw new ArrayIndexOutOfBoundsException();
                                }
                            } else if (strArrSplit[0].equals(on) && strArrSplit.length == 2) {
                                mVar.oo = new C0693o(this, mVar, b2);
                            } else if (!strArrSplit[0].equals(mo) || strArrSplit.length != 2) {
                                throw new IOException("unexpected journal line: ".concat(strM6));
                            }
                        }
                    } else {
                        throw new IOException("unexpected journal line: ".concat(strM6));
                    }
                } catch (EOFException unused) {
                    o((Closeable) bufferedInputStream);
                    return;
                }
            }
        } catch (Throwable th) {
            o((Closeable) bufferedInputStream);
            throw th;
        }
    }

    public final synchronized boolean n(String str) {
        try {
            mm();
            oo(str);
            m mVar = this.oo0.get(str);
            if (mVar != null && mVar.oo == null) {
                for (int i2 = 0; i2 < this.o0o; i2++) {
                    File fileO = mVar.o(i2);
                    if (fileO.delete()) {
                        this.o0m -= mVar.f42368n[i2];
                        mVar.f42368n[i2] = 0;
                    } else {
                        throw new IOException("failed to delete ".concat(String.valueOf(fileO)));
                    }
                }
                this.ooo++;
                this.o0n.append((CharSequence) ("REMOVE " + str + '\n'));
                this.oo0.remove(str);
                if (m0()) {
                    this.oon.submit(this.om0);
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private static String o(Reader reader) throws IOException {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int i2 = reader.read(cArr);
                if (i2 != -1) {
                    stringWriter.write(cArr, 0, i2);
                } else {
                    return stringWriter.toString();
                }
            }
        } finally {
            reader.close();
        }
    }

    public static void o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    private static void o(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    o(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: ".concat(String.valueOf(file2)));
                }
            }
            return;
        }
        throw new IllegalArgumentException("not a directory: ".concat(String.valueOf(file)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o0() {
        try {
            Writer writer = this.o0n;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.nm), 8192);
            bufferedWriter.write(f42367n);
            bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
            bufferedWriter.write("1");
            bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
            bufferedWriter.write(Integer.toString(this.nn));
            bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
            bufferedWriter.write(Integer.toString(this.o0o));
            bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
            bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
            for (m mVar : this.oo0.values()) {
                if (mVar.oo != null) {
                    bufferedWriter.write("DIRTY " + mVar.m + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + mVar.m + mVar.o() + '\n');
                }
            }
            bufferedWriter.close();
            this.nm.renameTo(this.no);
            this.o0n = new BufferedWriter(new FileWriter(this.no, true), 8192);
        } catch (Throwable th) {
            throw th;
        }
    }

    private static String n(InputStream inputStream) {
        return o((Reader) new InputStreamReader(inputStream, mm));
    }

    public static o o(File file, long j) throws IOException {
        if (j > 0) {
            o oVar = new o(file, j);
            if (oVar.no.exists()) {
                try {
                    oVar.m();
                    oVar.n();
                    oVar.o0n = new BufferedWriter(new FileWriter(oVar.no, true), 8192);
                    return oVar;
                } catch (IOException unused) {
                    oVar.close();
                    o(oVar.n0);
                }
            }
            file.mkdirs();
            o oVar2 = new o(file, j);
            oVar2.o0();
            return oVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final synchronized n o(String str) throws Throwable {
        Throwable th;
        try {
            try {
                mm();
                oo(str);
                m mVar = this.oo0.get(str);
                if (mVar == null) {
                    return null;
                }
                if (!mVar.o0) {
                    return null;
                }
                InputStream[] inputStreamArr = new InputStream[this.o0o];
                for (int i2 = 0; i2 < this.o0o; i2++) {
                    try {
                        try {
                            inputStreamArr[i2] = new FileInputStream(mVar.o(i2));
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                }
                this.ooo++;
                this.o0n.append((CharSequence) ("READ " + str + '\n'));
                if (m0()) {
                    this.oon.submit(this.om0);
                }
                this.o0n.flush();
                return new n(this, str, mVar.om, inputStreamArr, (byte) 0);
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    private static void m(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public final C0693o m(String str) {
        return o(str, -1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized C0693o o(String str, long j) {
        mm();
        oo(str);
        m mVar = this.oo0.get(str);
        if (j != -1 && (mVar == null || mVar.om != j)) {
            return null;
        }
        byte b2 = 0;
        if (mVar != null) {
            if (mVar.oo != null) {
                return null;
            }
        } else {
            mVar = new m(this, str, b2);
            this.oo0.put(str, mVar);
        }
        C0693o c0693o = new C0693o(this, mVar, b2);
        mVar.oo = c0693o;
        this.o0n.write("DIRTY " + str + '\n');
        this.o0n.flush();
        return c0693o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o(C0693o c0693o, boolean z2) {
        try {
            m mVar = c0693o.m;
            if (mVar.oo == c0693o) {
                if (z2 && !mVar.o0) {
                    for (int i2 = 0; i2 < this.o0o; i2++) {
                        if (!mVar.m(i2).exists()) {
                            c0693o.m();
                            throw new IllegalStateException("edit didn't create file ".concat(String.valueOf(i2)));
                        }
                    }
                }
                for (int i3 = 0; i3 < this.o0o; i3++) {
                    File fileM = mVar.m(i3);
                    if (z2) {
                        if (fileM.exists()) {
                            File fileO = mVar.o(i3);
                            fileM.renameTo(fileO);
                            long j = mVar.f42368n[i3];
                            long length = fileO.length();
                            mVar.f42368n[i3] = length;
                            this.o0m = (this.o0m - j) + length;
                        }
                    } else {
                        m(fileM);
                    }
                }
                this.ooo++;
                mVar.oo = null;
                if (!(mVar.o0 | z2)) {
                    this.oo0.remove(mVar.m);
                    this.o0n.write("REMOVE " + mVar.m + '\n');
                } else {
                    m.o(mVar);
                    this.o0n.write("CLEAN " + mVar.m + mVar.o() + '\n');
                    if (z2) {
                        long j2 = this.oom;
                        this.oom = 1 + j2;
                        mVar.om = j2;
                    }
                }
                this.o0n.flush();
                if (this.o0m > this.o00 || m0()) {
                    this.oon.submit(this.om0);
                }
            } else {
                throw new IllegalStateException();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ String o(InputStream inputStream) {
        return o((Reader) new InputStreamReader(inputStream, mm));
    }
}

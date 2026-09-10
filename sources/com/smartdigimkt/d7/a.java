package com.smartdigimkt.d7;

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

/* JADX INFO: loaded from: classes5.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final String f34457n = "journal";
    static final String o = "journal.tmp";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final String f34458p = "libcore.io.DiskLruCache";
    static final String q = "1";
    static final long r = -1;
    private static final String s = "CLEAN";
    private static final String t = "DIRTY";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f34459u = "REMOVE";
    private static final String v = "READ";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Charset f34460w = Charset.forName("UTF-8");
    private static final int x = 8192;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f34461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f34462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f34463c;
    private final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f34464e;
    private final int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Writer f34465h;
    private int j;
    private long g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final LinkedHashMap<String, c> f34466i = new LinkedHashMap<>(0, 0.75f, true);
    private long k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ExecutorService f34467l = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final Callable<Void> m = new CallableC0458a();

    /* JADX INFO: renamed from: com.smartdigimkt.d7.a$a, reason: collision with other inner class name */
    public class CallableC0458a implements Callable<Void> {
        public CallableC0458a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (a.this) {
                try {
                    if (a.this.f34465h == null) {
                        return null;
                    }
                    a.this.m();
                    if (a.this.g()) {
                        a.this.k();
                        a.this.j = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f34469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f34470b;

        /* JADX INFO: renamed from: com.smartdigimkt.d7.a$b$a, reason: collision with other inner class name */
        public class C0459a extends FilterOutputStream {
            public /* synthetic */ C0459a(b bVar, OutputStream outputStream, CallableC0458a callableC0458a) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    b.this.f34470b = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    b.this.f34470b = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i2) {
                try {
                    ((FilterOutputStream) this).out.write(i2);
                } catch (IOException unused) {
                    b.this.f34470b = true;
                }
            }

            private C0459a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i2, int i3) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i2, i3);
                } catch (IOException unused) {
                    b.this.f34470b = true;
                }
            }
        }

        public /* synthetic */ b(a aVar, c cVar, CallableC0458a callableC0458a) {
            this(cVar);
        }

        public InputStream b(int i2) throws IOException {
            synchronized (a.this) {
                try {
                    if (this.f34469a.d != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f34469a.f34475c) {
                        return null;
                    }
                    return new FileInputStream(this.f34469a.a(i2));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public OutputStream c(int i2) throws IOException {
            C0459a c0459a;
            synchronized (a.this) {
                try {
                    if (this.f34469a.d != this) {
                        throw new IllegalStateException();
                    }
                    c0459a = new C0459a(this, new FileOutputStream(this.f34469a.b(i2)), null);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c0459a;
        }

        private b(c cVar) {
            this.f34469a = cVar;
        }

        public String a(int i2) throws IOException {
            InputStream inputStreamB = b(i2);
            if (inputStreamB != null) {
                return a.b(inputStreamB);
            }
            return null;
        }

        public void a(int i2, String str) throws Throwable {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(c(i2), a.f34460w);
                try {
                    outputStreamWriter2.write(str);
                    a.a(outputStreamWriter2);
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter = outputStreamWriter2;
                    a.a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public void b() throws IOException {
            if (this.f34470b) {
                a.this.a(this, false);
                a.this.d(this.f34469a.f34473a);
            } else {
                a.this.a(this, true);
            }
        }

        public void a() throws IOException {
            a.this.a(this, false);
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f34473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f34474b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f34475c;
        private b d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f34476e;

        public /* synthetic */ c(a aVar, String str, CallableC0458a callableC0458a) {
            this(str);
        }

        private c(String str) {
            this.f34473a = str;
            this.f34474b = new long[a.this.f];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String[] strArr) throws IOException {
            if (strArr.length != a.this.f) {
                throw a(strArr);
            }
            for (int i2 = 0; i2 < strArr.length; i2++) {
                try {
                    this.f34474b[i2] = Long.parseLong(strArr[i2]);
                } catch (NumberFormatException unused) {
                    throw a(strArr);
                }
            }
        }

        public String a() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.f34474b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        public File b(int i2) {
            return new File(a.this.f34461a, this.f34473a + mo.ono + i2 + ".tmp");
        }

        private IOException a(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File a(int i2) {
            return new File(a.this.f34461a, this.f34473a + mo.ono + i2);
        }
    }

    public final class d implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f34477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f34478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InputStream[] f34479c;

        public /* synthetic */ d(a aVar, String str, long j, InputStream[] inputStreamArr, CallableC0458a callableC0458a) {
            this(str, j, inputStreamArr);
        }

        public b a() throws IOException {
            return a.this.a(this.f34477a, this.f34478b);
        }

        public String b(int i2) throws IOException {
            return a.b(a(i2));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.f34479c) {
                a.a((Closeable) inputStream);
            }
        }

        private d(String str, long j, InputStream[] inputStreamArr) {
            this.f34477a = str;
            this.f34478b = j;
            this.f34479c = inputStreamArr;
        }

        public InputStream a(int i2) {
            return this.f34479c[i2];
        }
    }

    private a(File file, int i2, int i3, long j) {
        this.f34461a = file;
        this.d = i2;
        this.f34462b = new File(file, f34457n);
        this.f34463c = new File(file, o);
        this.f = i3;
        this.f34464e = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        int i2 = this.j;
        return i2 >= 2000 && i2 >= this.f34466i.size();
    }

    private void i() throws IOException {
        b(this.f34463c);
        Iterator<c> it = this.f34466i.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            int i2 = 0;
            if (next.d == null) {
                while (i2 < this.f) {
                    this.g += next.f34474b[i2];
                    i2++;
                }
            } else {
                next.d = null;
                while (i2 < this.f) {
                    b(next.a(i2));
                    b(next.b(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    private void j() throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.f34462b), 8192);
        try {
            String strC = c(bufferedInputStream);
            String strC2 = c(bufferedInputStream);
            String strC3 = c(bufferedInputStream);
            String strC4 = c(bufferedInputStream);
            String strC5 = c(bufferedInputStream);
            if (!f34458p.equals(strC) || !"1".equals(strC2) || !Integer.toString(this.d).equals(strC3) || !Integer.toString(this.f).equals(strC4) || !"".equals(strC5)) {
                throw new IOException("unexpected journal header: [" + strC + ", " + strC2 + ", " + strC4 + ", " + strC5 + d9.i.f24752e);
            }
            while (true) {
                try {
                    c(c(bufferedInputStream));
                } catch (EOFException unused) {
                    a((Closeable) bufferedInputStream);
                    return;
                }
            }
        } catch (Throwable th) {
            a((Closeable) bufferedInputStream);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void k() throws IOException {
        try {
            Writer writer = this.f34465h;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.f34463c), 8192);
            bufferedWriter.write(f34458p);
            bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
            bufferedWriter.write("1");
            bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
            bufferedWriter.write(Integer.toString(this.d));
            bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
            bufferedWriter.write(Integer.toString(this.f));
            bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
            bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
            for (c cVar : this.f34466i.values()) {
                if (cVar.d != null) {
                    bufferedWriter.write("DIRTY " + cVar.f34473a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + cVar.f34473a + cVar.a() + '\n');
                }
            }
            bufferedWriter.close();
            this.f34463c.renameTo(this.f34462b);
            this.f34465h = new BufferedWriter(new FileWriter(this.f34462b, true), 8192);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() throws IOException {
        while (this.g > this.f34464e) {
            d(this.f34466i.entrySet().iterator().next().getKey());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f34465h == null) {
                return;
            }
            for (c cVar : new ArrayList(this.f34466i.values())) {
                if (cVar.d != null) {
                    cVar.d.a();
                }
            }
            m();
            this.f34465h.close();
            this.f34465h = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public long h() {
        return this.f34464e;
    }

    public synchronized long l() {
        return this.g;
    }

    private static void b(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static String c(InputStream inputStream) throws IOException {
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

    public synchronized boolean d(String str) throws IOException {
        try {
            b();
            e(str);
            c cVar = this.f34466i.get(str);
            if (cVar != null && cVar.d == null) {
                for (int i2 = 0; i2 < this.f; i2++) {
                    File fileA = cVar.a(i2);
                    if (!fileA.delete()) {
                        throw new IOException("failed to delete " + fileA);
                    }
                    this.g -= cVar.f34474b[i2];
                    cVar.f34474b[i2] = 0;
                }
                this.j++;
                this.f34465h.append((CharSequence) ("REMOVE " + str + '\n'));
                this.f34466i.remove(str);
                if (g()) {
                    this.f34467l.submit(this.m);
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public File e() {
        return this.f34461a;
    }

    public boolean f() {
        return this.f34465h == null;
    }

    private void e(String str) {
        if (str.contains(" ") || str.contains(IOUtils.LINE_SEPARATOR_UNIX) || str.contains("\r")) {
            throw new IllegalArgumentException(android.support.v4.media.a.n("keys must not contain spaces or newlines: \"", str, "\""));
        }
    }

    public synchronized d b(String str) throws Throwable {
        Throwable th;
        try {
            try {
                b();
                e(str);
                c cVar = this.f34466i.get(str);
                if (cVar == null) {
                    return null;
                }
                if (!cVar.f34475c) {
                    return null;
                }
                InputStream[] inputStreamArr = new InputStream[this.f];
                for (int i2 = 0; i2 < this.f; i2++) {
                    try {
                        try {
                            inputStreamArr[i2] = new FileInputStream(cVar.a(i2));
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                }
                this.j++;
                this.f34465h.append((CharSequence) ("READ " + str + '\n'));
                if (g()) {
                    this.f34467l.submit(this.m);
                }
                this.f34465h.flush();
                return new d(this, str, cVar.f34476e, inputStreamArr, null);
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

    private static <T> T[] a(T[] tArr, int i2, int i3) {
        int length = tArr.length;
        if (i2 > i3) {
            throw new IllegalArgumentException();
        }
        if (i2 >= 0 && i2 <= length) {
            int i4 = i3 - i2;
            int iMin = Math.min(i4, length - i2);
            T[] tArr2 = (T[]) ((Object[]) android.support.v4.media.a.e(i4, tArr));
            System.arraycopy(tArr, i2, tArr2, 0, iMin);
            return tArr2;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    private void c(String str) throws IOException {
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length >= 2) {
            String str2 = strArrSplit[1];
            if (strArrSplit[0].equals(f34459u) && strArrSplit.length == 2) {
                this.f34466i.remove(str2);
                return;
            }
            c cVar = this.f34466i.get(str2);
            CallableC0458a callableC0458a = null;
            if (cVar == null) {
                cVar = new c(this, str2, callableC0458a);
                this.f34466i.put(str2, cVar);
            }
            if (strArrSplit[0].equals(s) && strArrSplit.length == this.f + 2) {
                cVar.f34475c = true;
                cVar.d = null;
                cVar.b((String[]) a(strArrSplit, 2, strArrSplit.length));
                return;
            } else if (strArrSplit[0].equals(t) && strArrSplit.length == 2) {
                cVar.d = new b(this, cVar, callableC0458a);
                return;
            } else {
                if (!strArrSplit[0].equals(v) || strArrSplit.length != 2) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public static String a(Reader reader) throws IOException {
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

    private void b() {
        if (this.f34465h == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public synchronized void d() throws IOException {
        b();
        m();
        this.f34465h.flush();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(InputStream inputStream) throws IOException {
        return a((Reader) new InputStreamReader(inputStream, f34460w));
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void a(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    a(file2);
                }
                if (!file2.delete()) {
                    throw new IOException(android.support.v4.media.a.l(file2, "failed to delete file: "));
                }
            }
            return;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.l(file, "not a directory: "));
    }

    public void c() throws IOException {
        close();
        a(this.f34461a);
    }

    public static a a(File file, int i2, int i3, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i3 > 0) {
            a aVar = new a(file, i2, i3, j);
            if (aVar.f34462b.exists()) {
                try {
                    aVar.j();
                    aVar.i();
                    aVar.f34465h = new BufferedWriter(new FileWriter(aVar.f34462b, true), 8192);
                    return aVar;
                } catch (IOException unused) {
                    aVar.c();
                }
            }
            file.mkdirs();
            a aVar2 = new a(file, i2, i3, j);
            aVar2.k();
            return aVar2;
        }
        throw new IllegalArgumentException("valueCount <= 0");
    }

    public b a(String str) throws IOException {
        return a(str, -1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized b a(String str, long j) throws IOException {
        b();
        e(str);
        c cVar = this.f34466i.get(str);
        CallableC0458a callableC0458a = null;
        if (j != -1 && (cVar == null || cVar.f34476e != j)) {
            return null;
        }
        if (cVar != null) {
            if (cVar.d != null) {
                return null;
            }
        } else {
            cVar = new c(this, str, callableC0458a);
            this.f34466i.put(str, cVar);
        }
        b bVar = new b(this, cVar, callableC0458a);
        cVar.d = bVar;
        this.f34465h.write("DIRTY " + str + '\n');
        this.f34465h.flush();
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(b bVar, boolean z2) throws IOException {
        try {
            c cVar = bVar.f34469a;
            if (cVar.d == bVar) {
                if (z2 && !cVar.f34475c) {
                    for (int i2 = 0; i2 < this.f; i2++) {
                        if (!cVar.b(i2).exists()) {
                            bVar.a();
                            throw new IllegalStateException("edit didn't create file " + i2);
                        }
                    }
                }
                for (int i3 = 0; i3 < this.f; i3++) {
                    File fileB = cVar.b(i3);
                    if (z2) {
                        if (fileB.exists()) {
                            File fileA = cVar.a(i3);
                            fileB.renameTo(fileA);
                            long j = cVar.f34474b[i3];
                            long length = fileA.length();
                            cVar.f34474b[i3] = length;
                            this.g = (this.g - j) + length;
                        }
                    } else {
                        b(fileB);
                    }
                }
                this.j++;
                cVar.d = null;
                if (!(cVar.f34475c | z2)) {
                    this.f34466i.remove(cVar.f34473a);
                    this.f34465h.write("REMOVE " + cVar.f34473a + '\n');
                } else {
                    cVar.f34475c = true;
                    this.f34465h.write("CLEAN " + cVar.f34473a + cVar.a() + '\n');
                    if (z2) {
                        long j2 = this.k;
                        this.k = 1 + j2;
                        cVar.f34476e = j2;
                    }
                }
                this.f34465h.flush();
                if (this.g > this.f34464e || g()) {
                    this.f34467l.submit(this.m);
                }
            } else {
                throw new IllegalStateException();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

package gondola;

import android.os.Build;
import android.os.StrictMode;
import com.ironsource.X3;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: DiskLruCache.java */
/* JADX INFO: loaded from: classes2.dex */
public final class saneness implements Closeable {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final int f27358adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final File f27359arytenoidectomy;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public Writer f27363gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public long f27364graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final File f27365kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final int f27366molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final File f27367monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final File f27368polloi;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public int f27369preprohormone;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public long f27362dovishness = 0;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final LinkedHashMap<String, wireman> f27370rotuma = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public long f27360cord = 0;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public final ThreadPoolExecutor f27361cuirassed = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0623saneness(null));

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public final Callable<Void> f27371stratoscope = new attabal();

    /* JADX INFO: compiled from: DiskLruCache.java */
    public class attabal implements Callable<Void> {
        public attabal() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (saneness.this) {
                try {
                    if (saneness.this.f27363gintrap == null) {
                        return null;
                    }
                    saneness.this.nosophobia();
                    if (saneness.this.privatdozent()) {
                        saneness.this.milliradian();
                        saneness.this.f27369preprohormone = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.java */
    public final class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final wireman f27373attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public boolean f27374dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final boolean[] f27375saneness;

        public /* synthetic */ dern(saneness sanenessVar, wireman wiremanVar, attabal attabalVar) {
            this(wiremanVar);
        }

        public void attabal() throws IOException {
            saneness.this.cuirassed(this, false);
        }

        public File beachfront(int i) throws IOException {
            File fileApical;
            synchronized (saneness.this) {
                try {
                    if (this.f27373attabal.f27383beachfront != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f27373attabal.f27387marial) {
                        this.f27375saneness[i] = true;
                    }
                    fileApical = this.f27373attabal.apical(i);
                    saneness.this.f27365kowloon.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return fileApical;
        }

        public void marial() throws IOException {
            saneness.this.cuirassed(this, true);
            this.f27374dern = true;
        }

        public void saneness() {
            if (this.f27374dern) {
                return;
            }
            try {
                attabal();
            } catch (IOException unused) {
            }
        }

        public dern(wireman wiremanVar) {
            this.f27373attabal = wiremanVar;
            this.f27375saneness = wiremanVar.f27387marial ? null : new boolean[saneness.this.f27358adultoid];
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.java */
    public final class marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f27377attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final long[] f27378dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final long f27380saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final File[] f27381wireman;

        public /* synthetic */ marial(saneness sanenessVar, String str, long j, File[] fileArr, long[] jArr, attabal attabalVar) {
            this(str, j, fileArr, jArr);
        }

        public File attabal(int i) {
            return this.f27381wireman[i];
        }

        public marial(String str, long j, File[] fileArr, long[] jArr) {
            this.f27377attabal = str;
            this.f27380saneness = j;
            this.f27381wireman = fileArr;
            this.f27378dern = jArr;
        }
    }

    /* JADX INFO: renamed from: gondola.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DiskLruCache.java */
    public static final class ThreadFactoryC0623saneness implements ThreadFactory {
        public ThreadFactoryC0623saneness() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        public /* synthetic */ ThreadFactoryC0623saneness(attabal attabalVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.java */
    public final class wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f27382attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public dern f27383beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public long f27384competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public File[] f27385dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public boolean f27387marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final long[] f27388saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public File[] f27389wireman;

        public /* synthetic */ wireman(saneness sanenessVar, String str, attabal attabalVar) {
            this(str);
        }

        public File apical(int i) {
            return this.f27389wireman[i];
        }

        public File cutely(int i) {
            return this.f27385dern[i];
        }

        public String formularize() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.f27388saneness) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        public final IOException impassible(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final void triweekly(String[] strArr) throws IOException {
            if (strArr.length != saneness.this.f27358adultoid) {
                throw impassible(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.f27388saneness[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw impassible(strArr);
                }
            }
        }

        public wireman(String str) {
            this.f27382attabal = str;
            this.f27388saneness = new long[saneness.this.f27358adultoid];
            this.f27385dern = new File[saneness.this.f27358adultoid];
            this.f27389wireman = new File[saneness.this.f27358adultoid];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < saneness.this.f27358adultoid; i++) {
                sb.append(i);
                this.f27385dern[i] = new File(saneness.this.f27365kowloon, sb.toString());
                sb.append(".tmp");
                this.f27389wireman[i] = new File(saneness.this.f27365kowloon, sb.toString());
                sb.setLength(length);
            }
        }
    }

    public saneness(File file, int i, int i2, long j) {
        this.f27365kowloon = file;
        this.f27366molybdenite = i;
        this.f27359arytenoidectomy = new File(file, "journal");
        this.f27367monoploid = new File(file, "journal.tmp");
        this.f27368polloi = new File(file, "journal.bkp");
        this.f27358adultoid = i2;
        this.f27364graveside = j;
    }

    public static saneness creditor(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                lerp(file2, file3, false);
            }
        }
        saneness sanenessVar = new saneness(file, i, i2, j);
        if (sanenessVar.f27359arytenoidectomy.exists()) {
            try {
                sanenessVar.dent();
                sanenessVar.starveling();
                return sanenessVar;
            } catch (IOException e) {
                PrintStream printStream = System.out;
                Objects.toString(file);
                e.getMessage();
                printStream.getClass();
                sanenessVar.kattegat();
            }
        }
        file.mkdirs();
        saneness sanenessVar2 = new saneness(file, i, i2, j);
        sanenessVar2.milliradian();
        return sanenessVar2;
    }

    public static void lerp(File file, File file2, boolean z) throws IOException {
        if (z) {
            restrictive(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void restrictive(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void rotuma(Writer writer) throws IOException {
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

    public static void seminary(Writer writer) throws IOException {
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f27363gintrap == null) {
                return;
            }
            for (wireman wiremanVar : new ArrayList(this.f27370rotuma.values())) {
                if (wiremanVar.f27383beachfront != null) {
                    wiremanVar.f27383beachfront.attabal();
                }
            }
            nosophobia();
            rotuma(this.f27363gintrap);
            this.f27363gintrap = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void cuirassed(dern dernVar, boolean z) throws IOException {
        wireman wiremanVar = dernVar.f27373attabal;
        if (wiremanVar.f27383beachfront != dernVar) {
            throw new IllegalStateException();
        }
        if (z && !wiremanVar.f27387marial) {
            for (int i = 0; i < this.f27358adultoid; i++) {
                if (!dernVar.f27375saneness[i]) {
                    dernVar.attabal();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!wiremanVar.apical(i).exists()) {
                    dernVar.attabal();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.f27358adultoid; i2++) {
            File fileApical = wiremanVar.apical(i2);
            if (!z) {
                restrictive(fileApical);
            } else if (fileApical.exists()) {
                File fileCutely = wiremanVar.cutely(i2);
                fileApical.renameTo(fileCutely);
                long j = wiremanVar.f27388saneness[i2];
                long length = fileCutely.length();
                wiremanVar.f27388saneness[i2] = length;
                this.f27362dovishness = (this.f27362dovishness - j) + length;
            }
        }
        this.f27369preprohormone++;
        wiremanVar.f27383beachfront = null;
        if (wiremanVar.f27387marial || z) {
            wiremanVar.f27387marial = true;
            this.f27363gintrap.append((CharSequence) "CLEAN");
            this.f27363gintrap.append(' ');
            this.f27363gintrap.append((CharSequence) wiremanVar.f27382attabal);
            this.f27363gintrap.append((CharSequence) wiremanVar.formularize());
            this.f27363gintrap.append('\n');
            if (z) {
                long j2 = this.f27360cord;
                this.f27360cord = 1 + j2;
                wiremanVar.f27384competently = j2;
            }
        } else {
            this.f27370rotuma.remove(wiremanVar.f27382attabal);
            this.f27363gintrap.append((CharSequence) "REMOVE");
            this.f27363gintrap.append(' ');
            this.f27363gintrap.append((CharSequence) wiremanVar.f27382attabal);
            this.f27363gintrap.append('\n');
        }
        seminary(this.f27363gintrap);
        if (this.f27362dovishness > this.f27364graveside || privatdozent()) {
            this.f27361cuirassed.submit(this.f27371stratoscope);
        }
    }

    public final void dent() throws IOException {
        gondola.dern dernVar = new gondola.dern(new FileInputStream(this.f27359arytenoidectomy), gondola.wireman.f27390attabal);
        try {
            String strMarial = dernVar.marial();
            String strMarial2 = dernVar.marial();
            String strMarial3 = dernVar.marial();
            String strMarial4 = dernVar.marial();
            String strMarial5 = dernVar.marial();
            if (!"libcore.io.DiskLruCache".equals(strMarial) || !"1".equals(strMarial2) || !Integer.toString(this.f27366molybdenite).equals(strMarial3) || !Integer.toString(this.f27358adultoid).equals(strMarial4) || !"".equals(strMarial5)) {
                throw new IOException("unexpected journal header: [" + strMarial + ", " + strMarial2 + ", " + strMarial4 + ", " + strMarial5 + X3.j.e);
            }
            int i = 0;
            while (true) {
                try {
                    timberyard(dernVar.marial());
                    i++;
                } catch (EOFException unused) {
                    this.f27369preprohormone = i - this.f27370rotuma.size();
                    if (dernVar.dern()) {
                        milliradian();
                    } else {
                        this.f27363gintrap = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f27359arytenoidectomy, true), gondola.wireman.f27390attabal));
                    }
                    gondola.wireman.attabal(dernVar);
                    return;
                }
            }
        } catch (Throwable th) {
            gondola.wireman.attabal(dernVar);
            throw th;
        }
    }

    public final void dovishness() {
        if (this.f27363gintrap == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public synchronized boolean itchy(String str) throws IOException {
        try {
            dovishness();
            wireman wiremanVar = this.f27370rotuma.get(str);
            if (wiremanVar != null && wiremanVar.f27383beachfront == null) {
                for (int i = 0; i < this.f27358adultoid; i++) {
                    File fileCutely = wiremanVar.cutely(i);
                    if (fileCutely.exists() && !fileCutely.delete()) {
                        throw new IOException("failed to delete " + fileCutely);
                    }
                    this.f27362dovishness -= wiremanVar.f27388saneness[i];
                    wiremanVar.f27388saneness[i] = 0;
                }
                this.f27369preprohormone++;
                this.f27363gintrap.append((CharSequence) "REMOVE");
                this.f27363gintrap.append(' ');
                this.f27363gintrap.append((CharSequence) str);
                this.f27363gintrap.append('\n');
                this.f27370rotuma.remove(str);
                if (privatdozent()) {
                    this.f27361cuirassed.submit(this.f27371stratoscope);
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void kattegat() throws IOException {
        close();
        gondola.wireman.saneness(this.f27365kowloon);
    }

    public dern merc(String str) throws IOException {
        return polder(str, -1L);
    }

    public final synchronized void milliradian() throws IOException {
        try {
            Writer writer = this.f27363gintrap;
            if (writer != null) {
                rotuma(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f27367monoploid), gondola.wireman.f27390attabal));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f27366molybdenite));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f27358adultoid));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (wireman wiremanVar : this.f27370rotuma.values()) {
                    if (wiremanVar.f27383beachfront != null) {
                        bufferedWriter.write("DIRTY " + wiremanVar.f27382attabal + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + wiremanVar.f27382attabal + wiremanVar.formularize() + '\n');
                    }
                }
                rotuma(bufferedWriter);
                if (this.f27359arytenoidectomy.exists()) {
                    lerp(this.f27359arytenoidectomy, this.f27368polloi, true);
                }
                lerp(this.f27367monoploid, this.f27359arytenoidectomy, false);
                this.f27368polloi.delete();
                this.f27363gintrap = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f27359arytenoidectomy, true), gondola.wireman.f27390attabal));
            } catch (Throwable th) {
                rotuma(bufferedWriter);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void nosophobia() throws IOException {
        while (this.f27362dovishness > this.f27364graveside) {
            itchy(this.f27370rotuma.entrySet().iterator().next().getKey());
        }
    }

    public final synchronized dern polder(String str, long j) throws IOException {
        dovishness();
        wireman wiremanVar = this.f27370rotuma.get(str);
        attabal attabalVar = null;
        if (j != -1 && (wiremanVar == null || wiremanVar.f27384competently != j)) {
            return null;
        }
        if (wiremanVar == null) {
            wiremanVar = new wireman(this, str, attabalVar);
            this.f27370rotuma.put(str, wiremanVar);
        } else if (wiremanVar.f27383beachfront != null) {
            return null;
        }
        dern dernVar = new dern(this, wiremanVar, attabalVar);
        wiremanVar.f27383beachfront = dernVar;
        this.f27363gintrap.append((CharSequence) "DIRTY");
        this.f27363gintrap.append(' ');
        this.f27363gintrap.append((CharSequence) str);
        this.f27363gintrap.append('\n');
        seminary(this.f27363gintrap);
        return dernVar;
    }

    public final boolean privatdozent() {
        int i = this.f27369preprohormone;
        return i >= 2000 && i >= this.f27370rotuma.size();
    }

    public synchronized marial saran(String str) throws IOException {
        Throwable th;
        try {
            try {
                dovishness();
                wireman wiremanVar = this.f27370rotuma.get(str);
                if (wiremanVar == null) {
                    return null;
                }
                if (!wiremanVar.f27387marial) {
                    return null;
                }
                for (File file : wiremanVar.f27385dern) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                this.f27369preprohormone++;
                this.f27363gintrap.append((CharSequence) "READ");
                this.f27363gintrap.append(' ');
                this.f27363gintrap.append((CharSequence) str);
                this.f27363gintrap.append('\n');
                if (privatdozent()) {
                    this.f27361cuirassed.submit(this.f27371stratoscope);
                }
                return new marial(this, str, wiremanVar.f27384competently, wiremanVar.f27385dern, wiremanVar.f27388saneness, null);
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

    public final void starveling() throws IOException {
        restrictive(this.f27367monoploid);
        Iterator<wireman> it = this.f27370rotuma.values().iterator();
        while (it.hasNext()) {
            wireman next = it.next();
            int i = 0;
            if (next.f27383beachfront == null) {
                while (i < this.f27358adultoid) {
                    this.f27362dovishness += next.f27388saneness[i];
                    i++;
                }
            } else {
                next.f27383beachfront = null;
                while (i < this.f27358adultoid) {
                    restrictive(next.cutely(i));
                    restrictive(next.apical(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void timberyard(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f27370rotuma.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        wireman wiremanVar = this.f27370rotuma.get(strSubstring);
        attabal attabalVar = null;
        if (wiremanVar == null) {
            wiremanVar = new wireman(this, strSubstring, attabalVar);
            this.f27370rotuma.put(strSubstring, wiremanVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            wiremanVar.f27387marial = true;
            wiremanVar.f27383beachfront = null;
            wiremanVar.triweekly(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            wiremanVar.f27383beachfront = new dern(this, wiremanVar, attabalVar);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }
}

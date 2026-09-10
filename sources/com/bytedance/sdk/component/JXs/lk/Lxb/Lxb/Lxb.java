package com.bytedance.sdk.component.JXs.lk.Lxb.Lxb;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
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
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class Lxb implements Closeable {
    static final Pattern Lxb = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final OutputStream lk = new OutputStream() { // from class: com.bytedance.sdk.component.JXs.lk.Lxb.Lxb.Lxb.2
        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
        }
    };
    private final File JXs;
    final ExecutorService LD;
    private final int OY;
    private long QAg;
    private int STP;
    private final File ZU;
    private final File ebl;
    private final File lc;
    private final int nBu;
    private Writer sLN;
    private long JVA = 0;
    private final LinkedHashMap<String, LD> NXR = new LinkedHashMap<>(0, 0.75f, true);
    private long IeN = -1;
    private long VVE = 0;
    private final Callable<Void> kqm = new Callable<Void>() { // from class: com.bytedance.sdk.component.JXs.lk.Lxb.Lxb.Lxb.1
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (Lxb.this) {
                try {
                    if (Lxb.this.sLN == null) {
                        return null;
                    }
                    Lxb.this.OY();
                    if (Lxb.this.lc()) {
                        Lxb.this.JXs();
                        Lxb.this.STP = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    public final class LD {
        private C0044Lxb JXs;
        private final String LD;
        private boolean ZU;
        private long lc;
        private final long[] lk;

        private LD(String str) {
            this.LD = str;
            this.lk = new long[Lxb.this.nBu];
        }

        private IOException LD(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File LD(int i) {
            return new File(Lxb.this.ZU, this.LD + "." + i + ".tmp");
        }

        public String Lxb() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.lk) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Lxb(String[] strArr) throws IOException {
            if (strArr.length == Lxb.this.nBu) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.lk[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw LD(strArr);
                    }
                }
                return;
            }
            throw LD(strArr);
        }

        public File Lxb(int i) {
            return new File(Lxb.this.ZU, this.LD + "." + i);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.JXs.lk.Lxb.Lxb.Lxb$Lxb, reason: collision with other inner class name */
    public final class C0044Lxb {
        private boolean JXs;
        private final LD LD;
        private boolean ZU;
        private final boolean[] lk;

        /* JADX INFO: renamed from: com.bytedance.sdk.component.JXs.lk.Lxb.Lxb.Lxb$Lxb$Lxb, reason: collision with other inner class name */
        public class C0045Lxb extends FilterOutputStream {
            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    C0044Lxb.this.ZU = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    C0044Lxb.this.ZU = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException unused) {
                    C0044Lxb.this.ZU = true;
                }
            }

            private C0045Lxb(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C0044Lxb.this.ZU = true;
                }
            }
        }

        private C0044Lxb(LD ld) {
            this.LD = ld;
            this.lk = ld.ZU ? null : new boolean[Lxb.this.nBu];
        }

        public void LD() throws IOException {
            Lxb.this.Lxb(this, false);
        }

        public OutputStream Lxb(int i) throws IOException {
            FileOutputStream fileOutputStream;
            C0045Lxb c0045Lxb;
            if (i >= 0 && i < Lxb.this.nBu) {
                synchronized (Lxb.this) {
                    try {
                        if (this.LD.JXs == this) {
                            if (!this.LD.ZU) {
                                this.lk[i] = true;
                            }
                            File fileLD = this.LD.LD(i);
                            try {
                                fileOutputStream = new FileOutputStream(fileLD);
                            } catch (FileNotFoundException unused) {
                                Lxb.this.ZU.mkdirs();
                                try {
                                    fileOutputStream = new FileOutputStream(fileLD);
                                } catch (FileNotFoundException unused2) {
                                    return Lxb.lk;
                                }
                            }
                            c0045Lxb = new C0045Lxb(fileOutputStream);
                        } else {
                            throw new IllegalStateException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c0045Lxb;
            }
            StringBuilder sbQ = AbstractC5044xl.q("Expected index ", i, " to be greater than 0 and less than the maximum value count of ");
            sbQ.append(Lxb.this.nBu);
            throw new IllegalArgumentException(sbQ.toString());
        }

        public void Lxb() throws IOException {
            if (this.ZU) {
                Lxb.this.Lxb(this, false);
                Lxb.this.lk(this.LD.LD);
            } else {
                Lxb.this.Lxb(this, true);
            }
            this.JXs = true;
        }
    }

    public final class lk implements Closeable {
        private final long[] JXs;
        private final String LD;
        private final InputStream[] ZU;
        private final long lk;

        public InputStream Lxb(int i) {
            return this.ZU[i];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.ZU) {
                com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(inputStream);
            }
        }

        private lk(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.LD = str;
            this.lk = j;
            this.ZU = inputStreamArr;
            this.JXs = jArr;
        }
    }

    private Lxb(File file, int i, int i2, long j, ExecutorService executorService) {
        this.ZU = file;
        this.OY = i;
        this.JXs = new File(file, "journal");
        this.lc = new File(file, "journal.tmp");
        this.ebl = new File(file, "journal.bkp");
        this.nBu = i2;
        this.QAg = j;
        this.LD = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OY() throws IOException {
        long j = this.QAg;
        long j2 = this.IeN;
        if (j2 >= 0) {
            j = j2;
        }
        while (this.JVA > j) {
            lk(this.NXR.entrySet().iterator().next().getKey());
        }
        this.IeN = -1L;
    }

    private void ebl() {
        if (this.sLN == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.sLN == null) {
                return;
            }
            for (LD ld : new ArrayList(this.NXR.values())) {
                if (ld.JXs != null) {
                    ld.JXs.LD();
                }
            }
            OY();
            this.sLN.close();
            this.sLN = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void JXs() throws IOException {
        try {
            Writer writer = this.sLN;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.lc), ZU.Lxb));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.OY));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.nBu));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (LD ld : this.NXR.values()) {
                    if (ld.JXs != null) {
                        bufferedWriter.write("DIRTY " + ld.LD + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + ld.LD + ld.Lxb() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.JXs.exists()) {
                    Lxb(this.JXs, this.ebl, true);
                }
                Lxb(this.lc, this.JXs, false);
                this.ebl.delete();
                this.sLN = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.JXs, true), ZU.Lxb));
            } catch (Throwable th) {
                bufferedWriter.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void ZU(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.NXR.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        LD ld = this.NXR.get(strSubstring);
        if (ld == null) {
            ld = new LD(strSubstring);
            this.NXR.put(strSubstring, ld);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            ld.ZU = true;
            ld.JXs = null;
            ld.Lxb(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            ld.JXs = new C0044Lxb(ld);
        } else if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean lc() {
        int i = this.STP;
        return i >= 2000 && i >= this.NXR.size();
    }

    private void lk() throws IOException {
        com.bytedance.sdk.component.JXs.lk.Lxb.Lxb.lk lkVar = new com.bytedance.sdk.component.JXs.lk.Lxb.Lxb.lk(new FileInputStream(this.JXs), ZU.Lxb);
        try {
            String strLxb = lkVar.Lxb();
            String strLxb2 = lkVar.Lxb();
            String strLxb3 = lkVar.Lxb();
            String strLxb4 = lkVar.Lxb();
            String strLxb5 = lkVar.Lxb();
            if (!"libcore.io.DiskLruCache".equals(strLxb) || !"1".equals(strLxb2) || !Integer.toString(this.OY).equals(strLxb3) || !Integer.toString(this.nBu).equals(strLxb4) || !"".equals(strLxb5)) {
                throw new IOException("unexpected journal header: [" + strLxb + ", " + strLxb2 + ", " + strLxb4 + ", " + strLxb5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    ZU(lkVar.Lxb());
                    i++;
                } catch (EOFException unused) {
                    this.STP = i - this.NXR.size();
                    if (lkVar.LD()) {
                        JXs();
                    } else {
                        this.sLN = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.JXs, true), ZU.Lxb));
                    }
                    com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(lkVar);
                    return;
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(lkVar);
            throw th;
        }
    }

    public C0044Lxb LD(String str) throws IOException {
        return Lxb(str, -1L);
    }

    public void LD() throws IOException {
        close();
        ZU.Lxb(this.ZU);
    }

    public static Lxb Lxb(File file, int i, int i2, long j, ExecutorService executorService) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    Lxb(file2, file3, false);
                }
            }
            Lxb lxb = new Lxb(file, i, i2, j, executorService);
            if (lxb.JXs.exists()) {
                try {
                    lxb.lk();
                    lxb.ZU();
                    return lxb;
                } catch (IOException e) {
                    Objects.toString(file);
                    e.getMessage();
                    lxb.LD();
                }
            }
            file.mkdirs();
            Lxb lxb2 = new Lxb(file, i, i2, j, executorService);
            lxb2.JXs();
            return lxb2;
        }
        throw new IllegalArgumentException("valueCount <= 0");
    }

    public synchronized boolean lk(String str) throws IOException {
        try {
            ebl();
            JXs(str);
            LD ld = this.NXR.get(str);
            if (ld != null && ld.JXs == null) {
                for (int i = 0; i < this.nBu; i++) {
                    File fileLxb = ld.Lxb(i);
                    if (fileLxb.exists() && !fileLxb.delete()) {
                        throw new IOException("failed to delete ".concat(String.valueOf(fileLxb)));
                    }
                    this.JVA -= ld.lk[i];
                    ld.lk[i] = 0;
                }
                this.STP++;
                this.sLN.append((CharSequence) ("REMOVE " + str + '\n'));
                this.NXR.remove(str);
                if (lc()) {
                    this.LD.submit(this.kqm);
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private static void Lxb(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private void ZU() throws IOException {
        Lxb(this.lc);
        Iterator<LD> it = this.NXR.values().iterator();
        while (it.hasNext()) {
            LD next = it.next();
            int i = 0;
            if (next.JXs != null) {
                next.JXs = null;
                while (i < this.nBu) {
                    Lxb(next.Lxb(i));
                    Lxb(next.LD(i));
                    i++;
                }
                it.remove();
            } else {
                while (i < this.nBu) {
                    this.JVA += next.lk[i];
                    i++;
                }
            }
        }
    }

    private static void Lxb(File file, File file2, boolean z) throws IOException {
        if (z) {
            Lxb(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private void JXs(String str) {
        if (!Lxb.matcher(str).matches()) {
            throw new IllegalArgumentException(DM.B("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    public synchronized lk Lxb(String str) throws IOException {
        InputStream inputStream;
        ebl();
        JXs(str);
        LD ld = this.NXR.get(str);
        if (ld == null) {
            return null;
        }
        if (!ld.ZU) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.nBu];
        for (int i = 0; i < this.nBu; i++) {
            try {
                inputStreamArr[i] = new FileInputStream(ld.Lxb(i));
            } catch (FileNotFoundException unused) {
                for (int i2 = 0; i2 < this.nBu && (inputStream = inputStreamArr[i2]) != null; i2++) {
                    com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(inputStream);
                }
                return null;
            }
        }
        this.STP++;
        this.sLN.append((CharSequence) ("READ " + str + '\n'));
        if (lc()) {
            this.LD.submit(this.kqm);
        }
        return new lk(str, ld.lc, inputStreamArr, ld.lk);
    }

    private synchronized C0044Lxb Lxb(String str, long j) throws IOException {
        ebl();
        JXs(str);
        LD ld = this.NXR.get(str);
        if (j != -1 && (ld == null || ld.lc != j)) {
            return null;
        }
        if (ld != null) {
            if (ld.JXs != null) {
                return null;
            }
        } else {
            ld = new LD(str);
            this.NXR.put(str, ld);
        }
        C0044Lxb c0044Lxb = new C0044Lxb(ld);
        ld.JXs = c0044Lxb;
        this.sLN.write("DIRTY " + str + '\n');
        this.sLN.flush();
        return c0044Lxb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void Lxb(C0044Lxb c0044Lxb, boolean z) throws IOException {
        LD ld = c0044Lxb.LD;
        if (ld.JXs == c0044Lxb) {
            if (z && !ld.ZU) {
                for (int i = 0; i < this.nBu; i++) {
                    if (c0044Lxb.lk[i]) {
                        if (!ld.LD(i).exists()) {
                            c0044Lxb.LD();
                            return;
                        }
                    } else {
                        c0044Lxb.LD();
                        throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i)));
                    }
                }
            }
            for (int i2 = 0; i2 < this.nBu; i2++) {
                File fileLD = ld.LD(i2);
                if (z) {
                    if (fileLD.exists()) {
                        File fileLxb = ld.Lxb(i2);
                        fileLD.renameTo(fileLxb);
                        long j = ld.lk[i2];
                        long length = fileLxb.length();
                        ld.lk[i2] = length;
                        this.JVA = (this.JVA - j) + length;
                    }
                } else {
                    Lxb(fileLD);
                }
            }
            this.STP++;
            ld.JXs = null;
            if (!(ld.ZU | z)) {
                this.NXR.remove(ld.LD);
                this.sLN.write("REMOVE " + ld.LD + '\n');
            } else {
                ld.ZU = true;
                this.sLN.write("CLEAN " + ld.LD + ld.Lxb() + '\n');
                if (z) {
                    long j2 = this.VVE;
                    this.VVE = 1 + j2;
                    ld.lc = j2;
                }
            }
            this.sLN.flush();
            if (this.JVA > this.QAg || lc()) {
                this.LD.submit(this.kqm);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public synchronized void Lxb() throws IOException {
        ebl();
        OY();
        this.sLN.flush();
    }
}

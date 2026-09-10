package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class tb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f20279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Serializable f20281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f20282d;

    public tb(String str, int i10, String str2, long j10) {
        this.f20279a = j10;
        this.f20281c = str;
        this.f20282d = str2;
        this.f20280b = i10;
    }

    public static byte[] e(rb rbVar, long j10) throws IOException {
        long j11 = rbVar.f19496b - rbVar.f19497c;
        if (j10 >= 0 && j10 <= j11) {
            int i10 = (int) j10;
            if (i10 == j10) {
                byte[] bArr = new byte[i10];
                new DataInputStream(rbVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 33 + String.valueOf(j11).length());
        q4.a.r(sb2, "streamToBytes length=", j10, ", maxLength=");
        sb2.append(j11);
        throw new IOException(sb2.toString());
    }

    public static void f(BufferedOutputStream bufferedOutputStream, int i10) throws IOException {
        bufferedOutputStream.write(i10 & 255);
        bufferedOutputStream.write((i10 >> 8) & 255);
        bufferedOutputStream.write((i10 >> 16) & 255);
        bufferedOutputStream.write((i10 >> 24) & 255);
    }

    public static int g(rb rbVar) {
        return (m(rbVar) << 24) | m(rbVar) | (m(rbVar) << 8) | (m(rbVar) << 16);
    }

    public static void h(BufferedOutputStream bufferedOutputStream, long j10) throws IOException {
        bufferedOutputStream.write((byte) j10);
        bufferedOutputStream.write((byte) (j10 >>> 8));
        bufferedOutputStream.write((byte) (j10 >>> 16));
        bufferedOutputStream.write((byte) (j10 >>> 24));
        bufferedOutputStream.write((byte) (j10 >>> 32));
        bufferedOutputStream.write((byte) (j10 >>> 40));
        bufferedOutputStream.write((byte) (j10 >>> 48));
        bufferedOutputStream.write((byte) (j10 >>> 56));
    }

    public static long i(rb rbVar) {
        return (((long) m(rbVar)) & 255) | ((((long) m(rbVar)) & 255) << 8) | ((((long) m(rbVar)) & 255) << 16) | ((((long) m(rbVar)) & 255) << 24) | ((((long) m(rbVar)) & 255) << 32) | ((((long) m(rbVar)) & 255) << 40) | ((((long) m(rbVar)) & 255) << 48) | ((((long) m(rbVar)) & 255) << 56);
    }

    public static void j(BufferedOutputStream bufferedOutputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        h(bufferedOutputStream, length);
        bufferedOutputStream.write(bytes, 0, length);
    }

    public static String k(rb rbVar) {
        return new String(e(rbVar, i(rbVar)), "UTF-8");
    }

    public static int m(rb rbVar) throws IOException {
        int i10 = rbVar.read();
        if (i10 != -1) {
            return i10;
        }
        throw new EOFException();
    }

    public static final String n(String str) {
        int length = str.length() >> 1;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    public synchronized wa a(String str) {
        qb qbVar = (qb) ((LinkedHashMap) this.f20281c).get(str);
        if (qbVar == null) {
            return null;
        }
        File fileD = d(str);
        try {
            rb rbVar = new rb(new BufferedInputStream(new FileInputStream(fileD)), fileD.length());
            try {
                String str2 = qb.a(rbVar).f19015b;
                if (!TextUtils.equals(str, str2)) {
                    ob.b("%s: key=%s, found=%s", fileD.getAbsolutePath(), str, str2);
                    qb qbVar2 = (qb) ((LinkedHashMap) this.f20281c).remove(str);
                    if (qbVar2 != null) {
                        this.f20279a -= qbVar2.f19014a;
                    }
                    rbVar.close();
                    return null;
                }
                byte[] bArrE = e(rbVar, rbVar.f19496b - rbVar.f19497c);
                wa waVar = new wa();
                waVar.f21469a = bArrE;
                waVar.f21470b = qbVar.f19016c;
                waVar.f21471c = qbVar.f19017d;
                waVar.f21472d = qbVar.f19018e;
                waVar.f21473e = qbVar.f19019f;
                waVar.f21474f = qbVar.f19020g;
                List<bb> list = qbVar.f19021h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (bb bbVar : list) {
                    treeMap.put(bbVar.f12707a, bbVar.f12708b);
                }
                waVar.f21475g = treeMap;
                waVar.f21476h = Collections.unmodifiableList(list);
                rbVar.close();
                return waVar;
            } catch (Throwable th2) {
                rbVar.close();
                throw th2;
            }
        } catch (IOException e10) {
            ob.b("%s: %s", fileD.getAbsolutePath(), e10.toString());
            synchronized (this) {
                boolean zDelete = d(str).delete();
                qb qbVar3 = (qb) ((LinkedHashMap) this.f20281c).remove(str);
                if (qbVar3 != null) {
                    this.f20279a -= qbVar3.f19014a;
                }
                if (!zDelete) {
                    ob.b("Could not delete cache entry for key=%s, filename=%s", str, n(str));
                }
                return null;
            }
        }
    }

    public synchronized void b(String str, wa waVar) {
        try {
            long j10 = this.f20279a;
            int length = waVar.f21469a.length;
            long j11 = j10 + ((long) length);
            int i10 = this.f20280b;
            float f10 = 0.9f;
            if (j11 <= i10 || length <= i10 * 0.9f) {
                File fileD = d(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileD));
                    qb qbVar = new qb(str, waVar);
                    try {
                        f(bufferedOutputStream, 538247942);
                        j(bufferedOutputStream, str);
                        String str2 = qbVar.f19016c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        j(bufferedOutputStream, str2);
                        h(bufferedOutputStream, qbVar.f19017d);
                        h(bufferedOutputStream, qbVar.f19018e);
                        h(bufferedOutputStream, qbVar.f19019f);
                        h(bufferedOutputStream, qbVar.f19020g);
                        List<bb> list = qbVar.f19021h;
                        if (list != null) {
                            f(bufferedOutputStream, list.size());
                            for (bb bbVar : list) {
                                j(bufferedOutputStream, bbVar.f12707a);
                                j(bufferedOutputStream, bbVar.f12708b);
                            }
                        } else {
                            f(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(waVar.f21469a);
                        bufferedOutputStream.close();
                        qbVar.f19014a = fileD.length();
                        l(str, qbVar);
                        long j12 = this.f20279a;
                        int i11 = this.f20280b;
                        if (j12 >= i11) {
                            boolean z10 = ob.f18214a;
                            if (z10) {
                                ob.a("Pruning old cache entries.", new Object[0]);
                            }
                            long j13 = this.f20279a;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = ((LinkedHashMap) this.f20281c).entrySet().iterator();
                            int i12 = 0;
                            while (it.hasNext()) {
                                qb qbVar2 = (qb) ((Map.Entry) it.next()).getValue();
                                String str3 = qbVar2.f19015b;
                                if (d(str3).delete()) {
                                    this.f20279a -= qbVar2.f19014a;
                                } else {
                                    ob.b("Could not delete cache entry for key=%s, filename=%s", str3, n(str3));
                                }
                                it.remove();
                                i12++;
                                if (this.f20279a < i11 * f10) {
                                    break;
                                } else {
                                    f10 = f10;
                                }
                            }
                            if (z10) {
                                ob.a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i12), Long.valueOf(this.f20279a - j13), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                            }
                        }
                    } catch (IOException e10) {
                        ob.b("%s", e10.toString());
                        bufferedOutputStream.close();
                        ob.b("Failed to write header for %s", fileD.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!fileD.delete()) {
                        ob.b("Could not clean up file %s", fileD.getAbsolutePath());
                    }
                    if (!((sb) this.f20282d).mo166zza().exists()) {
                        ob.b("Re-initializing cache after external clearing.", new Object[0]);
                        ((LinkedHashMap) this.f20281c).clear();
                        this.f20279a = 0L;
                        c();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void c() {
        File fileMo166zza = ((sb) this.f20282d).mo166zza();
        if (fileMo166zza.exists()) {
            File[] fileArrListFiles = fileMo166zza.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        rb rbVar = new rb(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            qb qbVarA = qb.a(rbVar);
                            qbVarA.f19014a = length;
                            l(qbVarA.f19015b, qbVarA);
                            rbVar.close();
                        } catch (Throwable th2) {
                            rbVar.close();
                            throw th2;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!fileMo166zza.mkdirs()) {
            ob.c("Unable to create cache dir %s", fileMo166zza.getAbsolutePath());
        }
    }

    public File d(String str) {
        return new File(((sb) this.f20282d).mo166zza(), n(str));
    }

    public void l(String str, qb qbVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f20281c;
        if (linkedHashMap.containsKey(str)) {
            this.f20279a = (qbVar.f19014a - ((qb) linkedHashMap.get(str)).f19014a) + this.f20279a;
        } else {
            this.f20279a += qbVar.f19014a;
        }
        linkedHashMap.put(str, qbVar);
    }

    public tb(lj1 lj1Var) {
        this.f20281c = new LinkedHashMap(16, 0.75f, true);
        this.f20279a = 0L;
        this.f20282d = lj1Var;
        this.f20280b = 5242880;
    }

    public tb(File file) {
        this.f20281c = new LinkedHashMap(16, 0.75f, true);
        this.f20279a = 0L;
        this.f20282d = new vf(5, this, file);
        this.f20280b = 20971520;
    }
}

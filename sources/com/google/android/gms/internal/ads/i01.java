package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nh f15463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f15464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f15465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f15466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f15467e;

    public i01(nh nhVar, File file, File file2, File file3) {
        this.f15463a = nhVar;
        this.f15464b = file;
        this.f15465c = file3;
        this.f15466d = file2;
    }

    public final byte[] a() throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrH;
        FileInputStream fileInputStream2 = null;
        if (this.f15467e == null) {
            try {
                fileInputStream = new FileInputStream(this.f15466d);
                try {
                    as1 as1Var = cs1.f13248b;
                    ArrayList arrayList = new ArrayList();
                    int iMin = NotificationCompat.FLAG_LOCAL_ONLY;
                    while (true) {
                        byte[] bArr = new byte[iMin];
                        int i10 = 0;
                        while (i10 < iMin) {
                            int i11 = fileInputStream.read(bArr, i10, iMin - i10);
                            if (i11 == -1) {
                                break;
                            }
                            i10 += i11;
                        }
                        as1 as1VarD = i10 == 0 ? null : cs1.D(bArr, 0, i10);
                        if (as1VarD == null) {
                            break;
                        }
                        arrayList.add(as1VarD);
                        iMin = Math.min(iMin + iMin, Segment.SIZE);
                    }
                    bArrH = cs1.F(arrayList).h();
                    p9.c.d(fileInputStream);
                } catch (IOException unused) {
                    p9.c.d(fileInputStream);
                    bArrH = null;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    p9.c.d(fileInputStream2);
                    throw th;
                }
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
            }
            this.f15467e = bArrH;
        }
        byte[] bArr2 = this.f15467e;
        if (bArr2 == null) {
            return null;
        }
        return Arrays.copyOf(bArr2, bArr2.length);
    }
}

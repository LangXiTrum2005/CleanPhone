package com.mbridge.msdk.thrid.okhttp.internal.publicsuffix;

import com.mbridge.msdk.thrid.okhttp.internal.c;
import com.mbridge.msdk.thrid.okhttp.internal.platform.g;
import com.mbridge.msdk.thrid.okio.e;
import com.mbridge.msdk.thrid.okio.j;
import com.mbridge.msdk.thrid.okio.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f36597e = {42};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f36598f = new String[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f36599g = {"*"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final PublicSuffixDatabase f36600h = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f36601a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CountDownLatch f36602b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f36603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f36604d;

    public static PublicSuffixDatabase a() {
        return f36600h;
    }

    private void b() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(com.applovin.shadow.okhttp3.internal.publicsuffix.PublicSuffixDatabase.PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream == null) {
            return;
        }
        e eVarA = l.a(new j(l.a(resourceAsStream)));
        try {
            byte[] bArr = new byte[eVarA.readInt()];
            eVarA.readFully(bArr);
            byte[] bArr2 = new byte[eVarA.readInt()];
            eVarA.readFully(bArr2);
            c.a(eVarA);
            synchronized (this) {
                this.f36603c = bArr;
                this.f36604d = bArr2;
            }
            this.f36602b.countDown();
        } catch (Throwable th2) {
            c.a(eVarA);
            throw th2;
        }
    }

    private void c() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    b();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e10) {
                    g.d().a(5, "Failed to read public suffix list", e10);
                    if (z10) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public String a(String str) {
        int length;
        int length2;
        if (str == null) {
            throw new NullPointerException("domain == null");
        }
        String[] strArrSplit = IDN.toUnicode(str).split("\\.");
        String[] strArrA = a(strArrSplit);
        if (strArrSplit.length == strArrA.length && strArrA[0].charAt(0) != '!') {
            return null;
        }
        if (strArrA[0].charAt(0) == '!') {
            length = strArrSplit.length;
            length2 = strArrA.length;
        } else {
            length = strArrSplit.length;
            length2 = strArrA.length + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        String[] strArrSplit2 = str.split("\\.");
        for (int i10 = length - length2; i10 < strArrSplit2.length; i10++) {
            sb2.append(strArrSplit2[i10]);
            sb2.append('.');
        }
        sb2.deleteCharAt(sb2.length() - 1);
        return sb2.toString();
    }

    private String[] a(String[] strArr) {
        String str;
        String strA;
        String strA2;
        if (!this.f36601a.get() && this.f36601a.compareAndSet(false, true)) {
            c();
        } else {
            try {
                this.f36602b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        synchronized (this) {
            if (this.f36603c == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length][];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            bArr[i10] = strArr[i10].getBytes(c.f36267j);
        }
        int i11 = 0;
        while (true) {
            str = null;
            if (i11 >= length) {
                strA = null;
                break;
            }
            strA = a(this.f36603c, bArr, i11);
            if (strA != null) {
                break;
            }
            i11++;
        }
        if (length <= 1) {
            strA2 = null;
            break;
        }
        byte[][] bArr2 = (byte[][]) bArr.clone();
        int i12 = 0;
        while (true) {
            if (i12 >= bArr2.length - 1) {
                strA2 = null;
                break;
            }
            bArr2[i12] = f36597e;
            strA2 = a(this.f36603c, bArr2, i12);
            if (strA2 != null) {
                break;
            }
            i12++;
        }
        if (strA2 != null) {
            for (int i13 = 0; i13 < length - 1; i13++) {
                String strA3 = a(this.f36604d, bArr, i13);
                if (strA3 != null) {
                    str = strA3;
                    break;
                }
            }
        }
        if (str != null) {
            return "!".concat(str).split("\\.");
        }
        if (strA == null && strA2 == null) {
            return f36599g;
        }
        String[] strArrSplit = strA != null ? strA.split("\\.") : f36598f;
        String[] strArrSplit2 = strA2 != null ? strA2.split("\\.") : f36598f;
        return strArrSplit.length > strArrSplit2.length ? strArrSplit : strArrSplit2;
    }

    private static String a(byte[] bArr, byte[][] bArr2, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        int length = bArr.length;
        int i14 = 0;
        while (i14 < length) {
            int i15 = (i14 + length) / 2;
            while (i15 > -1 && bArr[i15] != 10) {
                i15--;
            }
            int i16 = i15 + 1;
            int i17 = 1;
            while (true) {
                i11 = i16 + i17;
                if (bArr[i11] == 10) {
                    break;
                }
                i17++;
            }
            int i18 = i11 - i16;
            int i19 = i10;
            boolean z11 = false;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                if (z11) {
                    i12 = 46;
                    z10 = false;
                } else {
                    z10 = z11;
                    i12 = bArr2[i19][i20] & 255;
                }
                i13 = i12 - (bArr[i16 + i21] & 255);
                if (i13 == 0) {
                    i21++;
                    i20++;
                    if (i21 == i18) {
                        break;
                    }
                    if (bArr2[i19].length != i20) {
                        z11 = z10;
                    } else {
                        if (i19 == bArr2.length - 1) {
                            break;
                        }
                        i19++;
                        i20 = -1;
                        z11 = true;
                    }
                } else {
                    break;
                }
            }
            if (i13 >= 0) {
                if (i13 <= 0) {
                    int i22 = i18 - i21;
                    int length2 = bArr2[i19].length - i20;
                    while (true) {
                        i19++;
                        if (i19 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i19].length;
                    }
                    if (length2 >= i22) {
                        if (length2 <= i22) {
                            return new String(bArr, i16, i18, c.f36267j);
                        }
                    }
                }
                i14 = i11 + 1;
            }
            length = i15;
        }
        return null;
    }
}

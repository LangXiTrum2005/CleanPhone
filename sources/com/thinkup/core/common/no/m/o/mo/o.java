package com.thinkup.core.common.no.m.o.mo;

import com.inmobi.commons.core.configs.AdConfig;
import com.thinkup.core.common.no.m.o.on.n;
import com.thinkup.core.common.no.n.n0;
import com.thinkup.core.common.no.n.nm;
import com.thinkup.core.common.no.n.oo;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class o {
    public static final String o = "publicsuffixes.gz";
    private static final byte oo = 33;
    private byte[] mm;
    private byte[] mo;
    private static final byte[] m = {42};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String[] f42025n = new String[0];
    private static final String[] o0 = {"*"};
    private static final o om = new o();
    private final AtomicBoolean on = new AtomicBoolean(false);
    private final CountDownLatch m0 = new CountDownLatch(1);

    private void m() {
        boolean z2 = false;
        while (true) {
            try {
                try {
                    n();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z2 = true;
                } catch (IOException e2) {
                    n.oo().o(5, "Failed to read public suffix list", e2);
                    if (!z2) {
                        return;
                    }
                }
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (!z2) {
            return;
        }
        Thread.currentThread().interrupt();
    }

    private void n() {
        InputStream resourceAsStream = o.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        oo ooVarO = nm.o(new n0(nm.o(resourceAsStream)));
        try {
            byte[] bArr = new byte[ooVarO.no()];
            ooVarO.m(bArr);
            byte[] bArr2 = new byte[ooVarO.no()];
            ooVarO.m(bArr2);
            ooVarO.close();
            synchronized (this) {
                this.mo = bArr;
                this.mm = bArr2;
            }
            this.m0.countDown();
        } catch (Throwable th) {
            try {
                ooVarO.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static o o() {
        return om;
    }

    public final String o(String str) {
        int length;
        int length2;
        if (str == null) {
            throw new NullPointerException("domain == null");
        }
        String[] strArrSplit = IDN.toUnicode(str).split("\\.");
        String[] strArrO = o(strArrSplit);
        if (strArrSplit.length == strArrO.length && strArrO[0].charAt(0) != '!') {
            return null;
        }
        if (strArrO[0].charAt(0) == '!') {
            length = strArrSplit.length;
            length2 = strArrO.length;
        } else {
            length = strArrSplit.length;
            length2 = strArrO.length + 1;
        }
        StringBuilder sb = new StringBuilder();
        String[] strArrSplit2 = str.split("\\.");
        for (int i2 = length - length2; i2 < strArrSplit2.length; i2++) {
            sb.append(strArrSplit2[i2]);
            sb.append('.');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private String[] o(String[] strArr) {
        String str;
        String strO;
        String strO2;
        String[] strArrSplit;
        String[] strArrSplit2;
        if (this.on.get() || !this.on.compareAndSet(false, true)) {
            try {
                this.m0.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z2 = false;
            while (true) {
                try {
                    try {
                        try {
                            n();
                            break;
                        } catch (InterruptedIOException unused2) {
                            Thread.interrupted();
                            z2 = true;
                        }
                    } catch (IOException e2) {
                        n.oo().o(5, "Failed to read public suffix list", e2);
                        if (z2) {
                        }
                    }
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
        synchronized (this) {
            if (this.mo == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length][];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            bArr[i2] = strArr[i2].getBytes(StandardCharsets.UTF_8);
        }
        int i3 = 0;
        while (true) {
            str = null;
            if (i3 >= length) {
                strO = null;
                break;
            }
            strO = o(this.mo, bArr, i3);
            if (strO != null) {
                break;
            }
            i3++;
        }
        if (length <= 1) {
            strO2 = null;
            break;
        }
        byte[][] bArr2 = (byte[][]) bArr.clone();
        int i4 = 0;
        while (true) {
            if (i4 >= bArr2.length - 1) {
                strO2 = null;
                break;
            }
            bArr2[i4] = m;
            strO2 = o(this.mo, bArr2, i4);
            if (strO2 != null) {
                break;
            }
            i4++;
        }
        if (strO2 != null) {
            for (int i5 = 0; i5 < length - 1; i5++) {
                String strO3 = o(this.mm, bArr, i5);
                if (strO3 != null) {
                    str = strO3;
                    break;
                }
            }
        }
        if (str != null) {
            return "!".concat(str).split("\\.");
        }
        if (strO == null && strO2 == null) {
            return o0;
        }
        if (strO != null) {
            strArrSplit = strO.split("\\.");
        } else {
            strArrSplit = f42025n;
        }
        if (strO2 != null) {
            strArrSplit2 = strO2.split("\\.");
        } else {
            strArrSplit2 = f42025n;
        }
        return strArrSplit.length > strArrSplit2.length ? strArrSplit : strArrSplit2;
    }

    private static String o(byte[] bArr, byte[][] bArr2, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        int length = bArr.length;
        int i6 = 0;
        while (i6 < length) {
            int i7 = (i6 + length) / 2;
            while (i7 >= 0 && bArr[i7] != 10) {
                i7--;
            }
            int i8 = i7 + 1;
            int i9 = 1;
            while (true) {
                i3 = i8 + i9;
                if (bArr[i3] == 10) {
                    break;
                }
                i9++;
            }
            int i10 = i3 - i8;
            int i11 = i2;
            boolean z3 = false;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (z3) {
                    i4 = 46;
                    z2 = false;
                } else {
                    z2 = z3;
                    i4 = bArr2[i11][i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                }
                i5 = i4 - (bArr[i8 + i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                if (i5 != 0) {
                    break;
                }
                i13++;
                i12++;
                if (i13 == i10) {
                    break;
                }
                if (bArr2[i11].length != i12) {
                    z3 = z2;
                } else {
                    if (i11 == bArr2.length - 1) {
                        break;
                    }
                    i11++;
                    i12 = -1;
                    z3 = true;
                }
            }
            if (i5 >= 0) {
                if (i5 <= 0) {
                    int i14 = i10 - i13;
                    int length2 = bArr2[i11].length - i12;
                    while (true) {
                        i11++;
                        if (i11 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i11].length;
                    }
                    if (length2 >= i14) {
                        if (length2 <= i14) {
                            return new String(bArr, i8, i10, StandardCharsets.UTF_8);
                        }
                    }
                }
                i6 = i3 + 1;
            }
            length = i7;
        }
        return null;
    }

    private void o(byte[] bArr, byte[] bArr2) {
        this.mo = bArr;
        this.mm = bArr2;
        this.on.set(true);
        this.m0.countDown();
    }
}

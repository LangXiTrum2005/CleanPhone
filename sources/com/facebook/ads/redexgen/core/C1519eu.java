package com.facebook.ads.redexgen.core;

import com.umeng.analytics.pro.cw;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1519eu {
    public static byte[] A02;
    public final File A00;
    public final File A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 43);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{66, 22, cw.k, 66, 0, 3, 1, 9, 23, 18, 66, 4, 11, cw.l, 7, 66, 60, 112, 115, 121, 89, 108, 119, 117, 113, 123, 94, 113, 116, 125, 83, 127, 101, 124, 116, 126, 55, 100, 48, 115, 98, 117, 113, 100, 117, 48, 18, 62, 36, 61, 53, 63, 118, 37, 113, 35, 52, 63, 48, 60, 52, 113, 55, 56, 61, 52, 113};
    }

    public C1519eu(File file) {
        this.A01 = file;
        this.A00 = new File(file.getPath() + A00(16, 4, 57));
    }

    private void A01() {
        if (this.A00.exists()) {
            this.A01.delete();
            this.A00.renameTo(this.A01);
        }
    }

    public final C1518et A03() throws IOException {
        if (this.A01.exists()) {
            if (!this.A00.exists()) {
                if (!this.A01.renameTo(this.A00)) {
                    AbstractC1561fb.A07(A00(20, 10, 51), A00(46, 21, 122) + this.A01 + A00(0, 16, 73) + this.A00);
                }
            } else {
                this.A01.delete();
            }
        }
        try {
            return new C1518et(this.A01);
        } catch (FileNotFoundException e) {
            File parentFile = this.A01.getParentFile();
            String strA00 = A00(30, 16, 59);
            if (parentFile != null && parentFile.mkdirs()) {
                try {
                    File parent = this.A01;
                    return new C1518et(parent);
                } catch (FileNotFoundException e2) {
                    throw new IOException(strA00 + this.A01, e2);
                }
            }
            throw new IOException(strA00 + this.A01, e);
        }
    }

    public final InputStream A04() throws FileNotFoundException {
        A01();
        return new FileInputStream(this.A01);
    }

    public final void A05() {
        this.A01.delete();
        this.A00.delete();
    }

    public final void A06(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.A00.delete();
    }

    public final boolean A07() {
        return this.A01.exists() || this.A00.exists();
    }
}

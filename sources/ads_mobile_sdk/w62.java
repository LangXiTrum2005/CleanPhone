package ads_mobile_sdk;

import com.google.android.gms.common.util.IOUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class w62 {
    public final j72 a;
    public final File b;
    public final File c;
    public final File d;
    public byte[] e;

    public w62(j72 j72Var, File file, File file2, File file3) {
        this.a = j72Var;
        this.b = file;
        this.c = file3;
        this.d = file2;
    }

    public final byte[] a() throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrC;
        FileInputStream fileInputStream2 = null;
        if (this.e == null) {
            try {
                fileInputStream = new FileInputStream(this.d);
                try {
                    bArrC = kn.a(fileInputStream).c();
                    IOUtils.closeQuietly(fileInputStream);
                } catch (IOException unused) {
                    IOUtils.closeQuietly(fileInputStream);
                    bArrC = null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    IOUtils.closeQuietly(fileInputStream2);
                    throw th;
                }
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            this.e = bArrC;
        }
        byte[] bArr = this.e;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}

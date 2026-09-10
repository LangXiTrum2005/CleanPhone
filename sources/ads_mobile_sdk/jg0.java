package ads_mobile_sdk;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import saneness.caparison;

/* JADX INFO: loaded from: classes.dex */
public final class jg0 implements caparison {
    public final byte[] a;

    public jg0(byte[] bArr) {
        this.a = bArr;
    }

    @Override // saneness.caparison
    public final Object a() {
        return this.a;
    }

    @Override // saneness.caparison
    public final Object a(FileInputStream fileInputStream) {
        try {
            return kaif.dern.wireman(fileInputStream);
        } catch (IOException e) {
            throw new kg0("Cannot read bytes.", e);
        }
    }

    @Override // saneness.caparison
    public final void a(Object obj, FileOutputStream fileOutputStream) throws IOException {
        fileOutputStream.write((byte[]) obj);
    }
}

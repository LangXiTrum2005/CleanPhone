package v1;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import n1.z;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n1.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1.h f52290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f52291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f52292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CipherInputStream f52293d;

    public a(n1.h hVar, byte[] bArr, byte[] bArr2) {
        this.f52290a = hVar;
        this.f52291b = bArr;
        this.f52292c = bArr2;
    }

    @Override // n1.h
    public final long C(n1.k kVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f52291b, "AES"), new IvParameterSpec(this.f52292c));
                n1.j jVar = new n1.j(this.f52290a, kVar);
                this.f52293d = new CipherInputStream(jVar, cipher);
                if (jVar.f46366d) {
                    return -1L;
                }
                jVar.f46363a.C(jVar.f46364b);
                jVar.f46366d = true;
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // n1.h
    public final void c(z zVar) {
        zVar.getClass();
        this.f52290a.c(zVar);
    }

    @Override // n1.h
    public final void close() {
        if (this.f52293d != null) {
            this.f52293d = null;
            this.f52290a.close();
        }
    }

    @Override // n1.h
    public final Map getResponseHeaders() {
        return this.f52290a.getResponseHeaders();
    }

    @Override // n1.h
    public final Uri getUri() {
        return this.f52290a.getUri();
    }

    @Override // i1.i
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        this.f52293d.getClass();
        int i12 = this.f52293d.read(bArr, i10, i11);
        if (i12 < 0) {
            return -1;
        }
        return i12;
    }
}

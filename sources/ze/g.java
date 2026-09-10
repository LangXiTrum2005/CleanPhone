package ze;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Cipher f54924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SecureRandom f54925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Key f54926e;

    public g(Context context, a aVar, ye.e eVar, int i10) {
        this.f54922a = i10;
        switch (i10) {
            case 1:
                String strB = eVar.b();
                this.f54923b = strB;
                SecureRandom secureRandom = new SecureRandom();
                this.f54925d = secureRandom;
                SharedPreferences sharedPreferences = context.getSharedPreferences(strB, 0);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                String string = sharedPreferences.getString("AESVGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK", null);
                this.f54924c = Cipher.getInstance("AES/GCM/NoPadding");
                if (string == null) {
                    byte[] bArr = new byte[16];
                    secureRandom.nextBytes(bArr);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                    this.f54926e = secretKeySpec;
                    editorEdit.putString("AESVGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK", Base64.encodeToString(aVar.g(secretKeySpec), 0));
                    editorEdit.apply();
                } else {
                    this.f54926e = aVar.e(Base64.decode(string, 0));
                }
                break;
            default:
                String strB2 = eVar.b();
                this.f54923b = strB2;
                SecureRandom secureRandom2 = new SecureRandom();
                this.f54925d = secureRandom2;
                SharedPreferences sharedPreferences2 = context.getSharedPreferences(strB2, 0);
                SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                String string2 = sharedPreferences2.getString("VGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK", null);
                this.f54924c = Cipher.getInstance("AES/CBC/PKCS7Padding");
                if (string2 == null) {
                    byte[] bArr2 = new byte[16];
                    secureRandom2.nextBytes(bArr2);
                    SecretKeySpec secretKeySpec2 = new SecretKeySpec(bArr2, "AES");
                    this.f54926e = secretKeySpec2;
                    editorEdit2.putString("VGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK", Base64.encodeToString(aVar.g(secretKeySpec2), 0));
                    editorEdit2.apply();
                } else {
                    this.f54926e = aVar.e(Base64.decode(string2, 0));
                }
                break;
        }
    }

    @Override // ze.e
    public final byte[] a(byte[] bArr) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, InvalidAlgorithmParameterException {
        switch (this.f54922a) {
            case 0:
                byte[] bArr2 = new byte[16];
                this.f54925d.nextBytes(bArr2);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
                Key key = this.f54926e;
                Cipher cipher = this.f54924c;
                cipher.init(1, key, ivParameterSpec);
                byte[] bArrDoFinal = cipher.doFinal(bArr);
                byte[] bArr3 = new byte[bArrDoFinal.length + 16];
                System.arraycopy(bArr2, 0, bArr3, 0, 16);
                System.arraycopy(bArrDoFinal, 0, bArr3, 16, bArrDoFinal.length);
                return bArr3;
            default:
                byte[] bArr4 = new byte[12];
                this.f54925d.nextBytes(bArr4);
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr4);
                Key key2 = this.f54926e;
                Cipher cipher2 = this.f54924c;
                cipher2.init(1, key2, gCMParameterSpec);
                byte[] bArrDoFinal2 = cipher2.doFinal(bArr);
                byte[] bArr5 = new byte[bArrDoFinal2.length + 12];
                System.arraycopy(bArr4, 0, bArr5, 0, 12);
                System.arraycopy(bArrDoFinal2, 0, bArr5, 12, bArrDoFinal2.length);
                return bArr5;
        }
    }

    @Override // ze.e
    public final byte[] c(byte[] bArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        switch (this.f54922a) {
            case 0:
                byte[] bArr2 = new byte[16];
                System.arraycopy(bArr, 0, bArr2, 0, 16);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
                int length = bArr.length - 16;
                byte[] bArr3 = new byte[length];
                System.arraycopy(bArr, 16, bArr3, 0, length);
                Key key = this.f54926e;
                Cipher cipher = this.f54924c;
                cipher.init(2, key, ivParameterSpec);
                return cipher.doFinal(bArr3);
            default:
                byte[] bArr4 = new byte[12];
                System.arraycopy(bArr, 0, bArr4, 0, 12);
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr4);
                int length2 = bArr.length - 12;
                byte[] bArr5 = new byte[length2];
                System.arraycopy(bArr, 12, bArr5, 0, length2);
                Key key2 = this.f54926e;
                Cipher cipher2 = this.f54924c;
                cipher2.init(2, key2, gCMParameterSpec);
                return cipher2.doFinal(bArr5);
        }
    }

    @Override // ze.e
    public final void d(Context context) {
        switch (this.f54922a) {
            case 0:
                context.getSharedPreferences(this.f54923b, 0).edit().remove("VGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK").apply();
                break;
            default:
                context.getSharedPreferences(this.f54923b, 0).edit().remove("AESVGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK").apply();
                break;
        }
    }
}

package ads_mobile_sdk;

import android.util.Base64;
import com.google.common.base.formularize;
import com.google.common.base.kowloon;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import saneness.brighton;
import saneness.twas;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public MessageDigest a;
    public final u13 b;
    public final Object c = new Object();
    public boolean d = false;
    public SecureRandom e;

    public a(u13 u13Var) {
        this.b = u13Var;
    }

    public final byte[] a(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (this.c) {
            this.a.reset();
            this.a.update(bArr);
            bArrDigest = this.a.digest();
        }
        return bArrDigest;
    }

    public final byte[] a(byte[] bArr, String str, boolean z) {
        byte[] bytes;
        int i = z ? 239 : 255;
        formularize.wireman(bArr.length <= i);
        ByteBuffer byteBufferPut = ByteBuffer.allocate(i + 1).put((byte) bArr.length);
        if (bArr.length < i) {
            int length = i - bArr.length;
            byte[] bArr2 = new byte[length];
            this.e.nextBytes(bArr2);
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length + length);
            System.arraycopy(bArr2, 0, bArrCopyOf, bArr.length, length);
            bArr = bArrCopyOf;
        }
        byte[] bArrArray = byteBufferPut.put(bArr).array();
        if (z) {
            bArrArray = ByteBuffer.allocate(256).put(a(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        for (brighton brightonVar : new qe0().K2) {
            brightonVar.a(bArrArray, bArr3);
        }
        if (!kowloon.saneness(str)) {
            if (str.length() > 32) {
                bytes = str.substring(0, 32).getBytes(StandardCharsets.UTF_8);
            } else {
                bytes = str.getBytes(StandardCharsets.UTF_8);
            }
            c cVar = new c(bytes);
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < 256; i4++) {
                i2 = (i2 + 1) & 255;
                byte[] bArr4 = cVar.a;
                byte b = bArr4[i2];
                i3 = (i3 + b) & 255;
                bArr4[i2] = bArr4[i3];
                bArr4[i3] = b;
                bArr3[i4] = (byte) (bArr4[(bArr4[i2] + b) & 255] ^ bArr3[i4]);
            }
        }
        return bArr3;
    }

    public final String a(ra raVar, String str) {
        try {
            return Base64.encodeToString(((nb) a(str, raVar.a()).a()).a(), 11);
        } catch (IllegalArgumentException unused) {
            return a(ga.PSN_ENCODE_SIZE_FAIL, str);
        }
    }

    public final twas a(String str, byte[] bArr) {
        twas twasVarO = nb.o();
        byte[] bArrA = a(bArr);
        twasVarO.wireman(kn.a(bArrA, 0, bArrA.length));
        int length = ((bArr.length - 1) / 255) + 1;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            int i2 = i * 255;
            int length2 = i2 + 255;
            if (bArr.length <= length2) {
                length2 = bArr.length;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i2, length2));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            twasVarO.dern(kn.a(a((byte[]) it.next(), str, false), 0, 256));
        }
        return twasVarO;
    }

    public final String a(ga gaVar, String str) {
        return Base64.encodeToString(a(((ra) ra.t().timberyard(gaVar.a).a()).a(), str, true), 11);
    }

    public final void a() {
        boolean z;
        synchronized (this) {
            z = this.d;
        }
        if (z) {
            return;
        }
        a(new SecureRandom());
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0033: INVOKE (r2 I:ads_mobile_sdk.v03) VIRTUAL call: ads_mobile_sdk.v03.a():void A[Catch: all -> 0x0031, MD:():void (m), TRY_ENTER] (LINE:72), block:B:20:0x0033 */
    public final synchronized void a(SecureRandom secureRandom) {
        v03 v03VarA;
        try {
            u13 u13Var = this.b;
            v03 v03Var = new v03(gf0.EVENT_ID_FALLBACK_INIT_OBFUSCATOR, u13Var.b, u13Var.a);
            try {
                v03Var.b();
                this.e = secureRandom;
                this.a = MessageDigest.getInstance(SameMD5.TAG);
                this.d = true;
            } catch (NoSuchAlgorithmException e) {
                v03Var.a(e);
            } catch (Throwable th) {
                v03Var.a(th);
                throw th;
            }
            v03Var.a();
        } catch (Throwable th2) {
            v03VarA.a();
            throw th2;
        }
    }
}

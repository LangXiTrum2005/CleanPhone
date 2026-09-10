package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MessageDigest f22093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a71 f22094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f22095c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22096d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SecureRandom f22097e;

    public y31(a71 a71Var) {
        this.f22094b = a71Var;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0039: INVOKE (r1 I:com.google.android.gms.internal.ads.y61) VIRTUAL call: com.google.android.gms.internal.ads.y61.c():void A[Catch: all -> 0x0037, MD:():void (m), TRY_ENTER] (LINE:58), block:B:25:0x0039 */
    public final void a() {
        boolean z10;
        y61 y61VarC;
        synchronized (this) {
            z10 = this.f22096d;
        }
        if (z10) {
            return;
        }
        SecureRandom secureRandom = new SecureRandom();
        synchronized (this) {
            try {
                y61 y61VarA = this.f22094b.a(InterfaceC0435l1.c.b.f29097c);
                try {
                    y61VarA.a();
                    this.f22097e = secureRandom;
                    this.f22093a = MessageDigest.getInstance(SameMD5.TAG);
                    this.f22096d = true;
                } catch (NoSuchAlgorithmException e10) {
                    y61VarA.b(e10);
                } catch (Throwable th2) {
                    y61VarA.b(th2);
                    throw th2;
                }
                y61VarA.c();
            } catch (Throwable th3) {
                y61VarC.c();
                throw th3;
            }
        }
    }

    public final byte[] b(byte[] bArr, String str, boolean z10) {
        int length = bArr.length;
        int i10 = true != z10 ? 255 : 239;
        ps1.v(length <= i10);
        ByteBuffer byteBufferPut = ByteBuffer.allocate(i10 + 1).put((byte) length);
        if (length < i10) {
            int i11 = i10 - length;
            byte[] bArr2 = new byte[i11];
            this.f22097e.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i11);
            System.arraycopy(bArr2, 0, bArr, length, i11);
        }
        byte[] bArrArray = byteBufferPut.put(bArr).array();
        if (z10) {
            bArrArray = ByteBuffer.allocate(NotificationCompat.FLAG_LOCAL_ONLY).put(c(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
        z31[] z31VarArr = (z31[]) new lf(1).K2;
        int length2 = z31VarArr.length;
        for (int i12 = 0; i12 < 12; i12++) {
            z31VarArr[i12].a(bArrArray, bArr3);
        }
        if (!pi1.l(str)) {
            uo0 uo0Var = new uo0(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8));
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < 256; i15++) {
                byte[] bArr4 = (byte[]) uo0Var.f20839b;
                i13 = (i13 + 1) & 255;
                byte b10 = bArr4[i13];
                i14 = (i14 + b10) & 255;
                bArr4[i13] = bArr4[i14];
                bArr4[i14] = b10;
                bArr3[i15] = (byte) (bArr4[(bArr4[i13] + b10) & 255] ^ bArr3[i15]);
            }
        }
        return bArr3;
    }

    public final byte[] c(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (this.f22095c) {
            this.f22093a.reset();
            this.f22093a.update(bArr);
            bArrDigest = this.f22093a.digest();
        }
        return bArrDigest;
    }

    public final ue d(String str, byte[] bArr) {
        ue ueVarZ = ve.z();
        byte[] bArrC = c(bArr);
        as1 as1Var = cs1.f13248b;
        as1 as1VarD = cs1.D(bArrC, 0, bArrC.length);
        ueVarZ.b();
        ((ve) ueVarZ.f19193b).B(as1VarD);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            int length = bArr.length;
            if (i10 >= ((length - 1) / 255) + 1) {
                break;
            }
            int i11 = i10 * 255;
            int i12 = i11 + 255;
            if (length > i12) {
                length = i12;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i11, length));
            i10++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            as1 as1VarD2 = cs1.D(b((byte[]) it.next(), str, false), 0, NotificationCompat.FLAG_LOCAL_ONLY);
            ueVarZ.b();
            ((ve) ueVarZ.f19193b).A(as1VarD2);
        }
        return ueVarZ;
    }
}

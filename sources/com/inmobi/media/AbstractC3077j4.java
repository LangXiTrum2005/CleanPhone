package com.inmobi.media;

import android.util.Base64;
import android.util.Log;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: com.inmobi.media.j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3077j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23714a = 0;

    public static byte[] a(String str) {
        int i2;
        if (str != null) {
            int length = str.length() % 4;
            i2 = length + ((((length ^ 4) & ((-length) | length)) >> 31) & 4);
        } else {
            i2 = 0;
        }
        String strValueOf = String.valueOf(str != null ? new StringBuilder((CharSequence) str).reverse().toString() : null);
        for (int i3 = 0; i3 < i2; i3++) {
            strValueOf = strValueOf + com.p004ironsource.dc.T;
        }
        byte[] bytes = strValueOf.getBytes(Charsets.f44691a);
        Intrinsics.e(bytes, "this as java.lang.String).getBytes(charset)");
        return Base64.decode(bytes, 2);
    }

    public static String a(String data, byte[] bArr) {
        byte[] bArrDoFinal;
        Intrinsics.f(data, "data");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
            Intrinsics.e(cipher, "getInstance(...)");
            cipher.init(1, secretKeySpec);
            byte[] bytes = data.getBytes(Charsets.f44691a);
            Intrinsics.e(bytes, "this as java.lang.String).getBytes(charset)");
            bArrDoFinal = cipher.doFinal(bytes);
        } catch (Throwable th) {
            Log.d("j4", "SDK encountered unexpected error in getting encrypted AES bytes; " + th.getMessage());
            bArrDoFinal = null;
        }
        byte[] bArrEncode = Base64.encode(bArrDoFinal, 2);
        Intrinsics.e(bArrEncode, "encode(...)");
        return new String(bArrEncode, Charsets.f44691a);
    }
}

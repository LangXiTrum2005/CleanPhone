package com.inmobi.media;

import android.util.Base64;
import java.util.BitSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2927a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BitSet f23424a;

    public final void a(String b64String) {
        byte[] bArrDecode;
        BitSet bitSetValueOf;
        Intrinsics.f(b64String, "b64String");
        try {
            bArrDecode = Base64.decode(b64String, 0);
        } catch (Exception e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
            bArrDecode = null;
        }
        if (bArrDecode != null) {
            if (L3.f22938a.F()) {
                bitSetValueOf = BitSet.valueOf(bArrDecode);
            } else {
                BitSet bitSet = new BitSet(bArrDecode.length * 8);
                int i2 = 0;
                for (byte b2 : bArrDecode) {
                    int i3 = 0;
                    while (i3 < 8) {
                        int i4 = i2 + 1;
                        bitSet.set(i2, ((b2 >> ((byte) i3)) & 1) == 1);
                        i3++;
                        i2 = i4;
                    }
                }
                bitSetValueOf = bitSet;
            }
            this.f23424a = bitSetValueOf;
        }
    }
}

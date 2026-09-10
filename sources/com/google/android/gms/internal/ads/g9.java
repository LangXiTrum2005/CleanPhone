package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f14798a = Collections.EMPTY_LIST;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    public List a(pb pbVar) {
        String str;
        int i10;
        List listSingletonList;
        np0 np0Var = new np0((byte[]) pbVar.f18584c);
        ArrayList arrayList = this.f14798a;
        while (np0Var.B() > 0) {
            int iK = np0Var.K();
            int iK2 = np0Var.f17881b + np0Var.K();
            if (iK == 134) {
                arrayList = new ArrayList();
                int iK3 = np0Var.K() & 31;
                for (int i11 = 0; i11 < iK3; i11++) {
                    String strK = np0Var.k(3, StandardCharsets.UTF_8);
                    int iK4 = np0Var.K();
                    boolean z10 = (iK4 & 128) != 0;
                    if (z10) {
                        i10 = iK4 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i10 = 1;
                    }
                    byte bK = (byte) np0Var.K();
                    np0Var.G(1);
                    if (z10) {
                        int i12 = bK & 64;
                        byte[] bArr = re0.f19567a;
                        listSingletonList = Collections.singletonList(i12 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    i12 i12Var = new i12();
                    i12Var.e(str);
                    i12Var.f15502d = strK;
                    i12Var.L = i10;
                    i12Var.f15514q = listSingletonList;
                    arrayList.add(new g22(i12Var));
                }
            }
            np0Var.E(iK2);
            arrayList = arrayList;
        }
        return arrayList;
    }
}

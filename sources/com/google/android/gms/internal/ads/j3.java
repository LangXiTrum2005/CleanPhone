package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dc1 f15942a = new dc1(new int[]{0, 2, 1}, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final dc1 f15943b = new dc1(new int[]{0, 2, 1, 3, 4}, 5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final dc1 f15944c = new dc1(new int[]{0, 2, 1, 5, 3, 4}, 6);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final dc1 f15945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final dc1 f15946e;

    static {
        int[] iArr = new int[7];
        iArr[0] = 0;
        System.arraycopy(new int[]{2, 1, 6, 5, 3, 4}, 0, iArr, 1, 6);
        f15945d = new dc1(iArr, 7);
        int[] iArr2 = new int[8];
        iArr2[0] = 0;
        System.arraycopy(new int[]{2, 1, 7, 5, 6, 3, 4}, 0, iArr2, 1, 7);
        f15946e = new dc1(iArr2, 8);
    }

    public static s8 a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            String str2 = uu0.f20901a;
            String[] strArrSplit = str.split(X3.j.f27830b, 2);
            if (strArrSplit.length != 2) {
                v71.y("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(p4.b(new np0(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e10) {
                    v71.B("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new i5(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new s8(arrayList);
    }
}

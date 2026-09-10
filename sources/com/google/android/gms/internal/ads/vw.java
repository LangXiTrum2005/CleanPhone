package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final vw f21303b = new vw(new a[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f21304c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a[] f21305a;

    static {
        a aVar = new a(-1, new int[0], new f5[0], new long[0], new String[0], new hf[0]);
        int[] iArr = aVar.f11787d;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = aVar.f11788e;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, C.TIME_UNSET);
        f5[] f5VarArr = (f5[]) Arrays.copyOf(aVar.f11786c, 0);
        String[] strArr = (String[]) Arrays.copyOf(aVar.f11789f, 0);
        hf[] hfVarArr = aVar.f11790g;
        f21304c = new a(0, iArrCopyOf, f5VarArr, jArrCopyOf, strArr, (hf[]) Arrays.copyOf(hfVarArr, Math.max(0, hfVarArr.length)));
        String str = uu0.f20901a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public vw(a[] aVarArr) {
        this.f21305a = aVarArr;
    }

    public final a a(int i10) {
        return i10 < 0 ? f21304c : this.f21305a[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && vw.class == obj.getClass() && Arrays.equals(this.f21305a, ((vw) obj).f21305a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f21305a) + (((int) C.TIME_UNSET) * 961);
    }

    public final String toString() {
        return defpackage.e.n("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }
}

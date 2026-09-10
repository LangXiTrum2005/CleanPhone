package i1;

import android.text.TextUtils;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p[] f42662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42663e;

    static {
        l1.y.G(0);
        l1.y.G(1);
    }

    public q0(String str, p... pVarArr) {
        go.k.i(pVarArr.length > 0);
        this.f42660b = str;
        this.f42662d = pVarArr;
        this.f42659a = pVarArr.length;
        String str2 = pVarArr[0].f42643n;
        this.f42661c = TextUtils.isEmpty(str2) ? d0.h(pVarArr[0].f42642m) : d0.h(str2);
        String str3 = pVarArr[0].f42634d;
        str3 = (str3 == null || str3.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str3;
        int i10 = pVarArr[0].f42636f | Http2.INITIAL_MAX_FRAME_SIZE;
        for (int i11 = 1; i11 < pVarArr.length; i11++) {
            String str4 = pVarArr[i11].f42634d;
            if (!str3.equals((str4 == null || str4.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str4)) {
                b(i11, "languages", pVarArr[0].f42634d, pVarArr[i11].f42634d);
                return;
            } else {
                if (i10 != (pVarArr[i11].f42636f | Http2.INITIAL_MAX_FRAME_SIZE)) {
                    b(i11, "role flags", Integer.toBinaryString(pVarArr[0].f42636f), Integer.toBinaryString(pVarArr[i11].f42636f));
                    return;
                }
            }
        }
    }

    public static void b(int i10, String str, String str2, String str3) {
        StringBuilder sbV = defpackage.e.v("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbV.append(str3);
        sbV.append("' (track ");
        sbV.append(i10);
        sbV.append(")");
        l1.a.f("TrackGroup", "", new IllegalStateException(sbV.toString()));
    }

    public final int a(p pVar) {
        int i10 = 0;
        while (true) {
            p[] pVarArr = this.f42662d;
            if (i10 >= pVarArr.length) {
                return -1;
            }
            if (pVar == pVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q0.class == obj.getClass()) {
            q0 q0Var = (q0) obj;
            if (this.f42660b.equals(q0Var.f42660b) && Arrays.equals(this.f42662d, q0Var.f42662d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f42663e == 0) {
            this.f42663e = Arrays.hashCode(this.f42662d) + d5.u.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f42660b);
        }
        return this.f42663e;
    }

    public final String toString() {
        return this.f42660b + ": " + Arrays.toString(this.f42662d);
    }
}

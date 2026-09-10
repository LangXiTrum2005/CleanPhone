package og;

import b2.z;
import d5.u;
import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f47413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f47414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f47415d;

    public final String d() {
        return d0.c.t(this.f47412a, this.f47413b, this.f47414c, this.f47415d);
    }

    public final void h(int i10) {
        int i11 = this.f47412a;
        int[] iArr = this.f47413b;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new aa.b("Nesting too deep at " + d(), 16);
            }
            this.f47413b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f47414c;
            this.f47414c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f47415d;
            this.f47415d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f47413b;
        int i12 = this.f47412a;
        this.f47412a = i12 + 1;
        iArr3[i12] = i10;
    }

    public final void j(String str) {
        StringBuilder sbJ = u.j(str, " at path ");
        sbJ.append(d());
        throw new z(sbJ.toString());
    }
}

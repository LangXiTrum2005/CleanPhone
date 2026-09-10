package xl;

import java.util.Arrays;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends vl.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f53902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f53903h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f53904f;

    static {
        f fVar = new f(new int[]{1, 8, 0}, false);
        f53902g = fVar;
        int i10 = fVar.f52624c;
        int i11 = fVar.f52623b;
        f53903h = (i11 == 1 && i10 == 9) ? new f(new int[]{2, 0, 0}, false) : new f(new int[]{i11, i10 + 1, 0}, false);
        new f(new int[0], false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int[] versionArray, boolean z10) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        n.f(versionArray, "versionArray");
        this.f53904f = z10;
    }

    public final boolean b(f metadataVersionFromLanguageVersion) {
        n.f(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        f fVar = f53902g;
        int i10 = this.f52624c;
        int i11 = this.f52623b;
        if (i11 == 2 && i10 == 0 && fVar.f52623b == 1 && fVar.f52624c == 8) {
            return true;
        }
        if (!this.f53904f) {
            fVar = f53903h;
        }
        int i12 = fVar.f52623b;
        int i13 = metadataVersionFromLanguageVersion.f52623b;
        if (i12 > i13 || (i12 >= i13 && fVar.f52624c > metadataVersionFromLanguageVersion.f52624c)) {
            metadataVersionFromLanguageVersion = fVar;
        }
        boolean z10 = false;
        if ((i11 == 1 && i10 == 0) || i11 == 0) {
            return false;
        }
        int i14 = metadataVersionFromLanguageVersion.f52623b;
        if (i11 > i14 || (i11 >= i14 && i10 > metadataVersionFromLanguageVersion.f52624c)) {
            z10 = true;
        }
        return !z10;
    }
}

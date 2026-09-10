package k6;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f44334b = new b0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44335a;

    public /* synthetic */ b0(int i10) {
        this.f44335a = i10;
    }

    @Override // k6.r
    public final boolean a(Object obj) {
        switch (this.f44335a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // k6.r
    public final q b(Object obj, int i10, int i11, e6.i iVar) {
        switch (this.f44335a) {
            case 0:
                return new q(new z6.d(obj), new d(obj, 1));
            case 1:
                File file = (File) obj;
                return new q(new z6.d(file), new d(file, 0));
            default:
                return null;
        }
    }
}

package k6;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f44337b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f44336a = i10;
        this.f44337b = obj;
    }

    @Override // k6.r
    public final boolean a(Object obj) {
        switch (this.f44336a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // k6.r
    public final q b(Object obj, int i10, int i11, e6.i iVar) {
        switch (this.f44336a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new q(new z6.d(bArr), new m(1, bArr, (a0) this.f44337b));
            case 1:
                return new q(new z6.d(obj), new f6.b(1, obj.toString(), (a0) this.f44337b));
            default:
                File file = (File) obj;
                return new q(new z6.d(file), new f6.b(2, file, (a0) this.f44337b));
        }
    }
}

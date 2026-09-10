package l2;

import android.util.Base64;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements na.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44903a;

    @Override // na.r
    public final Object get() {
        switch (this.f44903a) {
            case 0:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
            case 1:
                throw new IllegalStateException();
            case 2:
                return new p1.f();
            default:
                byte[] bArr = new byte[12];
                q1.h.f48546i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
        }
    }
}

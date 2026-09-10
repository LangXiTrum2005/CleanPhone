package u3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import l1.x;
import l1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f51825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1.q f51826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f51827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f51828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f51829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f51830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f51831h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f51832i;

    public o(int i10) {
        this.f51824a = i10;
        switch (i10) {
            case 1:
                this.f51825b = new x(0L);
                this.f51830g = C.TIME_UNSET;
                this.f51831h = C.TIME_UNSET;
                this.f51832i = C.TIME_UNSET;
                this.f51826c = new l1.q();
                break;
            default:
                this.f51825b = new x(0L);
                this.f51830g = C.TIME_UNSET;
                this.f51831h = C.TIME_UNSET;
                this.f51832i = C.TIME_UNSET;
                this.f51826c = new l1.q();
                break;
        }
    }

    public static int b(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static long c(l1.q qVar) {
        int i10 = qVar.f44814b;
        if (qVar.a() < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        qVar.k(bArr, 0, 9);
        qVar.M(i10);
        byte b10 = bArr[0];
        if ((b10 & 196) == 68) {
            byte b11 = bArr[2];
            if ((b11 & 4) == 4) {
                byte b12 = bArr[4];
                if ((b12 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j10 = b10;
                    long j11 = b11;
                    return ((j11 & 3) << 13) | ((j10 & 3) << 28) | (((56 & j10) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j11 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b12) & 248) >> 3);
                }
            }
        }
        return C.TIME_UNSET;
    }

    public final void a(n2.l lVar) {
        switch (this.f51824a) {
            case 0:
                byte[] bArr = y.f44831b;
                l1.q qVar = this.f51826c;
                qVar.getClass();
                qVar.K(bArr, bArr.length);
                this.f51827d = true;
                lVar.resetPeekPosition();
                break;
            default:
                byte[] bArr2 = y.f44831b;
                l1.q qVar2 = this.f51826c;
                qVar2.getClass();
                qVar2.K(bArr2, bArr2.length);
                this.f51827d = true;
                lVar.resetPeekPosition();
                break;
        }
    }
}

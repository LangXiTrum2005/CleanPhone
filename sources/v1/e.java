package v1;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends g2.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f52303j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f52304k;
    public byte[] l;

    @Override // j2.j
    public final void cancelLoad() {
        this.f52304k = true;
    }

    @Override // j2.j
    public final void load() {
        try {
            this.f41374i.C(this.f41367b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f52304k) {
                byte[] bArr = this.f52303j;
                if (bArr.length < i11 + Http2.INITIAL_MAX_FRAME_SIZE) {
                    this.f52303j = Arrays.copyOf(bArr, bArr.length + Http2.INITIAL_MAX_FRAME_SIZE);
                }
                i10 = this.f41374i.read(this.f52303j, i11, Http2.INITIAL_MAX_FRAME_SIZE);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f52304k) {
                this.l = Arrays.copyOf(this.f52303j, i11);
            }
        } finally {
            com.google.android.gms.internal.auth.i.e(this.f41374i);
        }
    }
}

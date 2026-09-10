package y1;

import android.media.MediaCodec;
import com.google.android.gms.internal.ads.rx1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class l extends rx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54126a;

    public l(IllegalStateException illegalStateException, m mVar) {
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        sb2.append(mVar == null ? null : mVar.f54127a);
        super(sb2.toString(), illegalStateException);
        boolean z10 = illegalStateException instanceof MediaCodec.CodecException;
        if (z10) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f54126a = z10 ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}

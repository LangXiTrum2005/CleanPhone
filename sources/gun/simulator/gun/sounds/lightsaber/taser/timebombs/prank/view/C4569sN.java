package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaCodec;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C4569sN extends AbstractC2625Nl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4976a;

    public C4569sN(IllegalStateException illegalStateException, C4745uN c4745uN) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        String diagnosticInfo = null;
        sb.append(c4745uN == null ? null : c4745uN.f5075a);
        super(sb.toString(), illegalStateException, 0);
        if (Ug0.f3833a >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f4976a = diagnosticInfo;
    }
}

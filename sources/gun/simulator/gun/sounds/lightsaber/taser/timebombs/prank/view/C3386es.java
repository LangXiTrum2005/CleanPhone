package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.es, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3386es extends FW {
    public static EventMessage k0(JT jt) {
        String strO = jt.o();
        strO.getClass();
        String strO2 = jt.o();
        strO2.getClass();
        return new EventMessage(strO, strO2, jt.n(), jt.n(), Arrays.copyOfRange(jt.f3266a, jt.b, jt.c));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FW
    public final Metadata z(C4747uP c4747uP, ByteBuffer byteBuffer) {
        return new Metadata(k0(new JT(byteBuffer.array(), byteBuffer.limit())));
    }
}

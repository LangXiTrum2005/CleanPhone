package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class F80 extends FW {
    public final JT g = new JT();
    public final Uh0 h = new Uh0();
    public Mc0 i;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FW
    public final Metadata z(C4747uP c4747uP, ByteBuffer byteBuffer) {
        Metadata.Entry spliceNullCommand;
        Mc0 mc0 = this.i;
        if (mc0 == null || c4747uP.j != mc0.d()) {
            Mc0 mc1 = new Mc0(c4747uP.f);
            this.i = mc1;
            mc1.a(c4747uP.f - c4747uP.j);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        JT jt = this.g;
        jt.C(bArrArray, iLimit);
        Uh0 uh0 = this.h;
        uh0.o(bArrArray, iLimit);
        uh0.s(39);
        long jI = (((long) uh0.i(1)) << 32) | ((long) uh0.i(32));
        uh0.s(20);
        int i = uh0.i(12);
        int i2 = uh0.i(8);
        jt.F(14);
        if (i2 == 0) {
            spliceNullCommand = new SpliceNullCommand();
        } else if (i2 == 255) {
            spliceNullCommand = PrivateCommand.b(jt, i, jI);
        } else if (i2 == 4) {
            spliceNullCommand = SpliceScheduleCommand.b(jt);
        } else if (i2 != 5) {
            spliceNullCommand = i2 != 6 ? null : TimeSignalCommand.b(jt, jI, this.i);
        } else {
            spliceNullCommand = SpliceInsertCommand.b(jt, jI, this.i);
        }
        return spliceNullCommand == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(spliceNullCommand);
    }
}

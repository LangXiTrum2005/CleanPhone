package lg;

import java.nio.ShortBuffer;
import java.util.Random;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Random f45332a = new Random();

    @Override // lg.a
    public final void e(ShortBuffer shortBuffer, ShortBuffer shortBuffer2, int i10) {
        if (shortBuffer.remaining() >= shortBuffer2.remaining()) {
            throw new IllegalArgumentException("Illegal use of AudioStretcher.INSERT");
        }
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(d.e(i10, "Illegal use of AudioStretcher.INSERT. Channels:"));
        }
        int iRemaining = shortBuffer.remaining() / i10;
        int iFloor = (int) Math.floor(((double) (shortBuffer2.remaining() - shortBuffer.remaining())) / ((double) i10));
        float f10 = iRemaining;
        float f11 = f10 / f10;
        float f12 = iFloor;
        float f13 = f12 / f12;
        while (iRemaining > 0 && iFloor > 0) {
            if (f11 >= f13) {
                shortBuffer2.put(shortBuffer.get());
                if (i10 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                iRemaining--;
                f11 = iRemaining / f10;
            } else {
                Random random = f45332a;
                shortBuffer2.put((short) random.nextInt(300));
                if (i10 == 2) {
                    shortBuffer2.put((short) random.nextInt(300));
                }
                iFloor--;
                f13 = iFloor / f10;
            }
        }
    }
}

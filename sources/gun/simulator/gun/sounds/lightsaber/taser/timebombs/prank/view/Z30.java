package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Z30 extends X30 {
    public final BR j;
    public final BR k;
    public final long l;

    public Z30(C3614hX c3614hX, long j, long j2, long j3, long j4, long j5, List list, long j6, BR br, BR br2, long j7, long j8) {
        super(c3614hX, j, j2, j3, j5, list, j6, j7, j8);
        this.j = br;
        this.k = br2;
        this.l = j4;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3139c40
    public final C3614hX a(FY fy) {
        BR br = this.j;
        if (br == null) {
            return this.f4203a;
        }
        C4619sw c4619sw = fy.f3070a;
        return new C3614hX(br.b(c4619sw.h, c4619sw.f5005a, 0L, 0L), 0L, -1L);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X30
    public final long d(long j) {
        List list = this.f;
        if (list != null) {
            return list.size();
        }
        long j2 = this.l;
        if (j2 != -1) {
            return (j2 - this.d) + 1;
        }
        if (j == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.b));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = AbstractC4670ta.f5038a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X30
    public final C3614hX h(long j, FY fy) {
        long j2 = this.d;
        List list = this.f;
        long j3 = list != null ? ((C2962a40) list.get((int) (j - j2))).f4107a : (j - j2) * this.e;
        C4619sw c4619sw = fy.f3070a;
        return new C3614hX(this.k.b(c4619sw.h, c4619sw.f5005a, j, j3), 0L, -1L);
    }
}

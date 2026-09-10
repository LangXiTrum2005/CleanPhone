package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class D5 extends FW {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FW
    public final Metadata z(C4747uP c4747uP, ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 116) {
            return null;
        }
        Uh0 uh0 = new Uh0(byteBuffer.array(), byteBuffer.limit());
        uh0.s(12);
        int iF = (uh0.f() + uh0.i(12)) - 4;
        uh0.s(44);
        uh0.t(uh0.i(12));
        uh0.s(16);
        ArrayList arrayList = new ArrayList();
        while (uh0.f() < iF) {
            uh0.s(48);
            int i = uh0.i(8);
            uh0.s(4);
            int iF2 = uh0.f() + uh0.i(12);
            String str = null;
            String str2 = null;
            while (uh0.f() < iF2) {
                int i2 = uh0.i(8);
                int i3 = uh0.i(8);
                int iF3 = uh0.f() + i3;
                if (i2 == 2) {
                    int i4 = uh0.i(16);
                    uh0.s(8);
                    if (i4 == 3) {
                        while (uh0.f() < iF3) {
                            int i5 = uh0.i(8);
                            Charset charset = AbstractC2333Ce.f2932a;
                            byte[] bArr = new byte[i5];
                            uh0.k(bArr, i5);
                            str = new String(bArr, charset);
                            int i6 = uh0.i(8);
                            for (int i7 = 0; i7 < i6; i7++) {
                                uh0.t(uh0.i(8));
                            }
                        }
                    }
                } else if (i2 == 21) {
                    Charset charset2 = AbstractC2333Ce.f2932a;
                    byte[] bArr2 = new byte[i3];
                    uh0.k(bArr2, i3);
                    str2 = new String(bArr2, charset2);
                }
                uh0.p(iF3 * 8);
            }
            uh0.p(iF2 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new AppInfoTable(i, str.concat(str2)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }
}

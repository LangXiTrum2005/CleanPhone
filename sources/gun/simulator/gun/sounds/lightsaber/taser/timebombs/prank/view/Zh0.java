package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Base64;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.vorbis.VorbisComment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Zh0 {
    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static Metadata b(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = Ug0.f3833a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                "Failed to parse Vorbis comment: ".concat(str);
                AbstractC4038mJ.f();
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.b(new JT(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    AbstractC4038mJ.g("Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new VorbisComment(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static A70 c(JT jt, boolean z, boolean z2) throws KT {
        if (z) {
            d(3, jt, false);
        }
        String strR = jt.r((int) jt.k(), AbstractC2333Ce.c);
        int length = strR.length();
        long jK = jt.k();
        String[] strArr = new String[(int) jK];
        int length2 = length + 15;
        for (int i = 0; i < jK; i++) {
            String strR2 = jt.r((int) jt.k(), AbstractC2333Ce.c);
            strArr[i] = strR2;
            length2 = length2 + 4 + strR2.length();
        }
        if (z2 && (jt.t() & 1) == 0) {
            throw KT.a("framing bit expected to be set", null);
        }
        return new A70(strR, strArr, length2 + 1);
    }

    public static boolean d(int i, JT jt, boolean z) throws KT {
        if (jt.a() < 7) {
            if (z) {
                return false;
            }
            throw KT.a("too short header: " + jt.a(), null);
        }
        if (jt.t() != i) {
            if (z) {
                return false;
            }
            throw KT.a("expected header type " + Integer.toHexString(i), null);
        }
        if (jt.t() == 118 && jt.t() == 111 && jt.t() == 114 && jt.t() == 98 && jt.t() == 105 && jt.t() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw KT.a("expected characters 'vorbis'", null);
    }
}

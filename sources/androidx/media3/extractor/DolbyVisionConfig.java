package androidx.media3.extractor;

import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.util.ParsableByteArray;
import com.thinkup.core.common.n.mo;

/* JADX INFO: loaded from: classes.dex */
public final class DolbyVisionConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6747a;

    public DolbyVisionConfig(String str) {
        this.f6747a = str;
    }

    public static DolbyVisionConfig a(ParsableByteArray parsableByteArray) {
        String str;
        parsableByteArray.H(2);
        int iU = parsableByteArray.u();
        int i2 = iU >> 1;
        int iU2 = ((parsableByteArray.u() >> 3) & 31) | ((iU & 1) << 5);
        if (i2 == 4 || i2 == 5 || i2 == 7) {
            str = "dvhe";
        } else if (i2 == 8) {
            str = "hev1";
        } else {
            if (i2 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i2);
        return new DolbyVisionConfig(a.g(iU2, iU2 >= 10 ? mo.ono : ".0", sb));
    }
}

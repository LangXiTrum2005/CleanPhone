package sg.bigo.ads.common.h.b;

import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes7.dex */
final class j {
    public static String a(float f) {
        String str;
        if (f >= 1048576.0f) {
            f = (f / 1024.0f) / 1024.0f;
            str = "mb/s";
        } else if (f >= 1024.0f) {
            f /= 1024.0f;
            str = "kb/s";
        } else {
            str = "b/s";
        }
        return android.support.v4.media.a.m(new DecimalFormat("0.00").format(f), str);
    }
}

package androidx.media3.extractor.text.ssa;

import android.text.TextUtils;
import androidx.media3.common.util.Assertions;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes.dex */
final class SsaDialogueFormat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7327c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7328e;

    public SsaDialogueFormat(int i2, int i3, int i4, int i5, int i6) {
        this.f7325a = i2;
        this.f7326b = i3;
        this.f7327c = i4;
        this.d = i5;
        this.f7328e = i6;
    }

    public static SsaDialogueFormat a(String str) {
        Assertions.b(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < strArrSplit.length; i6++) {
            String strB = Ascii.b(strArrSplit[i6].trim());
            strB.getClass();
            switch (strB) {
                case "end":
                    i3 = i6;
                    break;
                case "text":
                    i5 = i6;
                    break;
                case "start":
                    i2 = i6;
                    break;
                case "style":
                    i4 = i6;
                    break;
            }
        }
        if (i2 == -1 || i3 == -1 || i5 == -1) {
            return null;
        }
        return new SsaDialogueFormat(i2, i3, i4, i5, strArrSplit.length);
    }
}

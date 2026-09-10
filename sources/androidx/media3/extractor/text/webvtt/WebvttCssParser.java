package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.util.ParsableByteArray;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class WebvttCssParser {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f7396c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f7397a = new ParsableByteArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f7398b = new StringBuilder();

    public static String a(ParsableByteArray parsableByteArray, StringBuilder sb) {
        boolean z2 = false;
        sb.setLength(0);
        int i2 = parsableByteArray.f5668b;
        int i3 = parsableByteArray.f5669c;
        while (i2 < i3 && !z2) {
            char c2 = (char) parsableByteArray.f5667a[i2];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z2 = true;
            } else {
                i2++;
                sb.append(c2);
            }
        }
        parsableByteArray.H(i2 - parsableByteArray.f5668b);
        return sb.toString();
    }

    public static String b(ParsableByteArray parsableByteArray, StringBuilder sb) {
        c(parsableByteArray);
        if (parsableByteArray.a() == 0) {
            return null;
        }
        String strA = a(parsableByteArray, sb);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) parsableByteArray.u());
    }

    public static void c(ParsableByteArray parsableByteArray) {
        while (true) {
            for (boolean z2 = true; parsableByteArray.a() > 0 && z2; z2 = false) {
                int i2 = parsableByteArray.f5668b;
                byte[] bArr = parsableByteArray.f5667a;
                byte b2 = bArr[i2];
                char c2 = (char) b2;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    parsableByteArray.H(1);
                } else {
                    int i3 = parsableByteArray.f5669c;
                    int i4 = i2 + 2;
                    if (i4 <= i3) {
                        int i5 = i2 + 1;
                        if (b2 == 47 && bArr[i5] == 42) {
                            while (true) {
                                int i6 = i4 + 1;
                                if (i6 >= i3) {
                                    break;
                                }
                                if (((char) bArr[i4]) == '*' && ((char) bArr[i6]) == '/') {
                                    i4 += 2;
                                    i3 = i4;
                                } else {
                                    i4 = i6;
                                }
                            }
                            parsableByteArray.H(i3 - parsableByteArray.f5668b);
                        }
                    }
                }
            }
            return;
        }
    }
}

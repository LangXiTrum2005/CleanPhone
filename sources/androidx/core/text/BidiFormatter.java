package androidx.core.text;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class BidiFormatter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TextDirectionHeuristicCompat f4384c = TextDirectionHeuristicsCompat.f4399c;
    public static final String d = Character.toString(8206);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f4385e = Character.toString(8207);
    public static final BidiFormatter f = new BidiFormatter(false);
    public static final BidiFormatter g = new BidiFormatter(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristicCompat f4387b;

    public static final class Builder {
    }

    public static class DirectionalityEstimator {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final byte[] f4388e = new byte[1792];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharSequence f4389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4391c;
        public char d;

        static {
            for (int i2 = 0; i2 < 1792; i2++) {
                f4388e[i2] = Character.getDirectionality(i2);
            }
        }

        public DirectionalityEstimator(CharSequence charSequence) {
            this.f4389a = charSequence;
            this.f4390b = charSequence.length();
        }

        public final byte a() {
            int i2 = this.f4391c - 1;
            CharSequence charSequence = this.f4389a;
            char cCharAt = charSequence.charAt(i2);
            this.d = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(charSequence, this.f4391c);
                this.f4391c -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f4391c--;
            char c2 = this.d;
            return c2 < 1792 ? f4388e[c2] : Character.getDirectionality(c2);
        }
    }

    public BidiFormatter(boolean z2) {
        TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.f4399c;
        this.f4386a = z2;
        this.f4387b = textDirectionHeuristicCompat;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        DirectionalityEstimator directionalityEstimator = new DirectionalityEstimator(charSequence);
        directionalityEstimator.f4391c = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = directionalityEstimator.f4391c;
            if (i5 < directionalityEstimator.f4390b && i2 == 0) {
                CharSequence charSequence2 = directionalityEstimator.f4389a;
                char cCharAt = charSequence2.charAt(i5);
                directionalityEstimator.d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, directionalityEstimator.f4391c);
                    directionalityEstimator.f4391c = Character.charCount(iCodePointAt) + directionalityEstimator.f4391c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    directionalityEstimator.f4391c++;
                    char c2 = directionalityEstimator.d;
                    directionality = c2 < 1792 ? DirectionalityEstimator.f4388e[c2] : Character.getDirectionality(c2);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i4 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i4++;
                                i3 = -1;
                                continue;
                            case 16:
                            case 17:
                                i4++;
                                i3 = 1;
                                continue;
                            case 18:
                                i4--;
                                i3 = 0;
                                continue;
                        }
                    }
                } else if (i4 == 0) {
                    return -1;
                }
                i2 = i4;
            }
        }
        if (i2 != 0) {
            if (i3 == 0) {
                while (directionalityEstimator.f4391c > 0) {
                    switch (directionalityEstimator.a()) {
                        case 14:
                        case 15:
                            if (i2 == i4) {
                                return -1;
                            }
                            i4--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i4) {
                                return 1;
                            }
                            i4--;
                            break;
                        case 18:
                            i4++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i3;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        DirectionalityEstimator directionalityEstimator = new DirectionalityEstimator(charSequence);
        directionalityEstimator.f4391c = directionalityEstimator.f4390b;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            while (directionalityEstimator.f4391c > 0) {
                byte bA = directionalityEstimator.a();
                if (bA == 0) {
                    if (i2 == 0) {
                        return -1;
                    }
                    if (i3 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i2 == 0) {
                        return 1;
                    }
                    if (i3 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case 15:
                            if (i3 == i2) {
                                return -1;
                            }
                            i2--;
                            break;
                        case 16:
                        case 17:
                            if (i3 == i2) {
                                return 1;
                            }
                            i2--;
                            break;
                        case 18:
                            i2++;
                            break;
                        default:
                            if (i3 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public static BidiFormatter c() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? g : f;
    }

    public final SpannableStringBuilder d(CharSequence charSequence) {
        String str;
        TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.f4399c;
        if (charSequence == null) {
            return null;
        }
        boolean zA = ((TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl) textDirectionHeuristicCompat).a(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zA2 = ((TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl) (zA ? TextDirectionHeuristicsCompat.f4398b : TextDirectionHeuristicsCompat.f4397a)).a(charSequence, charSequence.length());
        String str2 = "";
        String str3 = f4385e;
        String str4 = d;
        boolean z2 = this.f4386a;
        if (z2 || !(zA2 || a(charSequence) == 1)) {
            str = (!z2 || (zA2 && a(charSequence) != -1)) ? "" : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zA != z2) {
            spannableStringBuilder.append(zA ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zA3 = ((TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl) (zA ? TextDirectionHeuristicsCompat.f4398b : TextDirectionHeuristicsCompat.f4397a)).a(charSequence, charSequence.length());
        if (!z2 && (zA3 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z2 && (!zA3 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}

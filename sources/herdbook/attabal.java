package herdbook;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* JADX INFO: compiled from: BidiFormatter.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final String f27672beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final attabal f27673competently;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final attabal f27674impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final String f27675marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final polloi f27676wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final boolean f27677attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final polloi f27678dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f27679saneness;

    /* JADX INFO: renamed from: herdbook.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BidiFormatter.java */
    public static final class C0632attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public boolean f27680attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public polloi f27681dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f27682saneness;

        public C0632attabal() {
            dern(attabal.marial(Locale.getDefault()));
        }

        public static attabal saneness(boolean z) {
            return z ? attabal.f27674impromptu : attabal.f27673competently;
        }

        public attabal attabal() {
            return (this.f27682saneness == 2 && this.f27681dern == attabal.f27676wireman) ? saneness(this.f27680attabal) : new attabal(this.f27680attabal, this.f27682saneness, this.f27681dern);
        }

        public final void dern(boolean z) {
            this.f27680attabal = z;
            this.f27681dern = attabal.f27676wireman;
            this.f27682saneness = 2;
        }
    }

    /* JADX INFO: compiled from: BidiFormatter.java */
    public static class saneness {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public static final byte[] f27683beachfront = new byte[1792];

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final CharSequence f27684attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f27685dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public char f27686marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final boolean f27687saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f27688wireman;

        static {
            for (int i = 0; i < 1792; i++) {
                f27683beachfront[i] = Character.getDirectionality(i);
            }
        }

        public saneness(CharSequence charSequence, boolean z) {
            this.f27684attabal = charSequence;
            this.f27687saneness = z;
            this.f27685dern = charSequence.length();
        }

        public static byte dern(char c) {
            return c < 1792 ? f27683beachfront[c] : Character.getDirectionality(c);
        }

        public byte attabal() {
            char cCharAt = this.f27684attabal.charAt(this.f27688wireman - 1);
            this.f27686marial = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f27684attabal, this.f27688wireman);
                this.f27688wireman -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f27688wireman--;
            byte bDern = dern(this.f27686marial);
            if (!this.f27687saneness) {
                return bDern;
            }
            char c = this.f27686marial;
            if (c == '>') {
                return impromptu();
            }
            return c == ';' ? beachfront() : bDern;
        }

        public final byte beachfront() {
            char cCharAt;
            int i = this.f27688wireman;
            do {
                int i2 = this.f27688wireman;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f27684attabal;
                int i3 = i2 - 1;
                this.f27688wireman = i3;
                cCharAt = charSequence.charAt(i3);
                this.f27686marial = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f27688wireman = i;
            this.f27686marial = ';';
            return (byte) 13;
        }

        public final byte competently() {
            char cCharAt;
            do {
                int i = this.f27688wireman;
                if (i >= this.f27685dern) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f27684attabal;
                this.f27688wireman = i + 1;
                cCharAt = charSequence.charAt(i);
                this.f27686marial = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        public final byte impromptu() {
            char cCharAt;
            int i = this.f27688wireman;
            while (true) {
                int i2 = this.f27688wireman;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f27684attabal;
                int i3 = i2 - 1;
                this.f27688wireman = i3;
                char cCharAt2 = charSequence.charAt(i3);
                this.f27686marial = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i4 = this.f27688wireman;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f27684attabal;
                        int i5 = i4 - 1;
                        this.f27688wireman = i5;
                        cCharAt = charSequence2.charAt(i5);
                        this.f27686marial = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f27688wireman = i;
            this.f27686marial = '>';
            return (byte) 13;
        }

        public int marial() {
            this.f27688wireman = this.f27685dern;
            int i = 0;
            while (true) {
                int i2 = i;
                while (this.f27688wireman > 0) {
                    byte bAttabal = attabal();
                    if (bAttabal == 0) {
                        if (i == 0) {
                            return -1;
                        }
                        if (i2 == 0) {
                        }
                    } else if (bAttabal == 1 || bAttabal == 2) {
                        if (i == 0) {
                            return 1;
                        }
                        if (i2 == 0) {
                        }
                    } else if (bAttabal != 9) {
                        switch (bAttabal) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
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

        public byte saneness() {
            char cCharAt = this.f27684attabal.charAt(this.f27688wireman);
            this.f27686marial = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f27684attabal, this.f27688wireman);
                this.f27688wireman += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f27688wireman++;
            byte bDern = dern(this.f27686marial);
            if (!this.f27687saneness) {
                return bDern;
            }
            char c = this.f27686marial;
            if (c == '<') {
                return taiyuan();
            }
            return c == '&' ? competently() : bDern;
        }

        public final byte taiyuan() {
            char cCharAt;
            int i = this.f27688wireman;
            while (true) {
                int i2 = this.f27688wireman;
                if (i2 >= this.f27685dern) {
                    this.f27688wireman = i;
                    this.f27686marial = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f27684attabal;
                this.f27688wireman = i2 + 1;
                char cCharAt2 = charSequence.charAt(i2);
                this.f27686marial = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i3 = this.f27688wireman;
                        if (i3 >= this.f27685dern) {
                            break;
                        }
                        CharSequence charSequence2 = this.f27684attabal;
                        this.f27688wireman = i3 + 1;
                        cCharAt = charSequence2.charAt(i3);
                        this.f27686marial = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        public int wireman() {
            this.f27688wireman = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f27688wireman < this.f27685dern && i == 0) {
                byte bSaneness = saneness();
                if (bSaneness != 0) {
                    if (bSaneness == 1 || bSaneness == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (bSaneness != 9) {
                        switch (bSaneness) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f27688wireman > 0) {
                switch (attabal()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                    default:
                        continue;
                }
                i3--;
            }
            return 0;
        }
    }

    static {
        polloi polloiVar = molybdenite.f27691dern;
        f27676wireman = polloiVar;
        f27675marial = Character.toString((char) 8206);
        f27672beachfront = Character.toString((char) 8207);
        f27673competently = new attabal(false, 2, polloiVar);
        f27674impromptu = new attabal(true, 2, polloiVar);
    }

    public attabal(boolean z, int i, polloi polloiVar) {
        this.f27677attabal = z;
        this.f27679saneness = i;
        this.f27678dern = polloiVar;
    }

    public static int attabal(CharSequence charSequence) {
        return new saneness(charSequence, false).wireman();
    }

    public static attabal dern() {
        return new C0632attabal().attabal();
    }

    public static boolean marial(Locale locale) {
        return graveside.attabal(locale) == 1;
    }

    public static int saneness(CharSequence charSequence) {
        return new saneness(charSequence, false).marial();
    }

    public String apical(String str, polloi polloiVar, boolean z) {
        if (str == null) {
            return null;
        }
        return taiyuan(str, polloiVar, z).toString();
    }

    public final String beachfront(CharSequence charSequence, polloi polloiVar) {
        boolean zIsRtl = polloiVar.isRtl(charSequence, 0, charSequence.length());
        if (!this.f27677attabal && (zIsRtl || saneness(charSequence) == 1)) {
            return f27675marial;
        }
        if (this.f27677attabal) {
            return (!zIsRtl || saneness(charSequence) == -1) ? f27672beachfront : "";
        }
        return "";
    }

    public final String competently(CharSequence charSequence, polloi polloiVar) {
        boolean zIsRtl = polloiVar.isRtl(charSequence, 0, charSequence.length());
        if (!this.f27677attabal && (zIsRtl || attabal(charSequence) == 1)) {
            return f27675marial;
        }
        if (this.f27677attabal) {
            return (!zIsRtl || attabal(charSequence) == -1) ? f27672beachfront : "";
        }
        return "";
    }

    public String cutely(String str) {
        return apical(str, this.f27678dern, true);
    }

    public CharSequence impromptu(CharSequence charSequence) {
        return taiyuan(charSequence, this.f27678dern, true);
    }

    public CharSequence taiyuan(CharSequence charSequence, polloi polloiVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = polloiVar.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (wireman() && z) {
            spannableStringBuilder.append((CharSequence) competently(charSequence, zIsRtl ? molybdenite.f27693saneness : molybdenite.f27689attabal));
        }
        if (zIsRtl != this.f27677attabal) {
            spannableStringBuilder.append(zIsRtl ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) beachfront(charSequence, zIsRtl ? molybdenite.f27693saneness : molybdenite.f27689attabal));
        }
        return spannableStringBuilder;
    }

    public boolean wireman() {
        return (this.f27679saneness & 2) != 0;
    }
}

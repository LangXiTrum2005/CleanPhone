package astrogate;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.google.common.primitives.Ints;
import decarock.grimness;
import decarock.triweekly;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: SsaStyle.java */
/* JADX INFO: loaded from: classes.dex */
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f14509attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final boolean f14510beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final boolean f14511competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Integer f14512dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final boolean f14513impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final boolean f14514marial;
    public final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Integer f14515saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final int f14516taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final float f14517wireman;

    /* JADX INFO: compiled from: SsaStyle.java */
    public static final class attabal {

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public final int f14518apical;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f14519attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final int f14520beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final int f14521competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public final int f14522cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f14523dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final int f14524impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final int f14525marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f14526saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public final int f14527taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int f14528wireman;

        public attabal(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.f14519attabal = i;
            this.f14526saneness = i2;
            this.f14523dern = i3;
            this.f14528wireman = i4;
            this.f14525marial = i5;
            this.f14520beachfront = i6;
            this.f14521competently = i7;
            this.f14524impromptu = i8;
            this.f14527taiyuan = i9;
            this.f14522cutely = i10;
            this.f14518apical = i11;
        }

        public static attabal attabal(String str) {
            String[] strArrSplit = TextUtils.split(str.substring(7), ",");
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                String strBeachfront = com.google.common.base.attabal.beachfront(strArrSplit[i11].trim());
                strBeachfront.getClass();
                switch (strBeachfront) {
                    case "italic":
                        i7 = i11;
                        break;
                    case "underline":
                        i8 = i11;
                        break;
                    case "strikeout":
                        i9 = i11;
                        break;
                    case "primarycolour":
                        i3 = i11;
                        break;
                    case "bold":
                        i6 = i11;
                        break;
                    case "name":
                        i = i11;
                        break;
                    case "fontsize":
                        i5 = i11;
                        break;
                    case "borderstyle":
                        i10 = i11;
                        break;
                    case "alignment":
                        i2 = i11;
                        break;
                    case "outlinecolour":
                        i4 = i11;
                        break;
                }
            }
            if (i != -1) {
                return new attabal(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, strArrSplit.length);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: SsaStyle.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f14533attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final PointF f14534saneness;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final Pattern f14530dern = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final Pattern f14532wireman = Pattern.compile(grimness.sealless("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public static final Pattern f14531marial = Pattern.compile(grimness.sealless("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public static final Pattern f14529beachfront = Pattern.compile("\\\\an(\\d+)");

        public saneness(int i, PointF pointF) {
            this.f14533attabal = i;
            this.f14534saneness = pointF;
        }

        public static int attabal(String str) {
            Matcher matcher = f14529beachfront.matcher(str);
            if (matcher.find()) {
                return dern.marial((String) decarock.attabal.marial(matcher.group(1)));
            }
            return -1;
        }

        public static PointF dern(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f14532wireman.matcher(str);
            Matcher matcher2 = f14531marial.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    triweekly.beachfront("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) decarock.attabal.marial(strGroup)).trim()), Float.parseFloat(((String) decarock.attabal.marial(strGroup2)).trim()));
        }

        public static saneness saneness(String str) {
            Matcher matcher = f14530dern.matcher(str);
            PointF pointF = null;
            int i = -1;
            while (matcher.find()) {
                String str2 = (String) decarock.attabal.marial(matcher.group(1));
                try {
                    PointF pointFDern = dern(str2);
                    if (pointFDern != null) {
                        pointF = pointFDern;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iAttabal = attabal(str2);
                    if (iAttabal != -1) {
                        i = iAttabal;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new saneness(i, pointF);
        }

        public static String wireman(String str) {
            return f14530dern.matcher(str).replaceAll("");
        }
    }

    public dern(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.name = str;
        this.f14509attabal = i;
        this.f14515saneness = num;
        this.f14512dern = num2;
        this.f14517wireman = f;
        this.f14514marial = z;
        this.f14510beachfront = z2;
        this.f14511competently = z3;
        this.f14513impromptu = z4;
        this.f14516taiyuan = i2;
    }

    public static boolean beachfront(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            triweekly.taiyuan("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    public static int competently(String str) {
        try {
            int i = Integer.parseInt(str.trim());
            if (wireman(i)) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        triweekly.impromptu("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    public static boolean dern(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    public static Integer impromptu(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            decarock.attabal.attabal(j <= 4294967295L);
            return Integer.valueOf(Color.argb(Ints.wireman(((j >> 24) & 255) ^ 255), Ints.wireman(j & 255), Ints.wireman((j >> 8) & 255), Ints.wireman((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            triweekly.taiyuan("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    public static int marial(String str) {
        try {
            int i = Integer.parseInt(str.trim());
            if (dern(i)) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        triweekly.impromptu("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    public static dern saneness(String str, attabal attabalVar) {
        decarock.attabal.attabal(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i = attabalVar.f14518apical;
        if (length != i) {
            triweekly.impromptu("SsaStyle", grimness.sealless("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[attabalVar.f14519attabal].trim();
            int i2 = attabalVar.f14526saneness;
            int iMarial = i2 != -1 ? marial(strArrSplit[i2].trim()) : -1;
            int i3 = attabalVar.f14523dern;
            Integer numImpromptu = i3 != -1 ? impromptu(strArrSplit[i3].trim()) : null;
            int i4 = attabalVar.f14528wireman;
            Integer numImpromptu2 = i4 != -1 ? impromptu(strArrSplit[i4].trim()) : null;
            int i5 = attabalVar.f14525marial;
            float fTaiyuan = i5 != -1 ? taiyuan(strArrSplit[i5].trim()) : -3.4028235E38f;
            int i6 = attabalVar.f14520beachfront;
            boolean z = false;
            boolean z2 = true;
            if (i6 != -1 && beachfront(strArrSplit[i6].trim())) {
                z = true;
            }
            int i7 = attabalVar.f14521competently;
            if (i7 == -1 || !beachfront(strArrSplit[i7].trim())) {
                z2 = false;
            }
            int i8 = attabalVar.f14524impromptu;
            if (i8 == -1 || !beachfront(strArrSplit[i8].trim())) {
                z2 = false;
            }
            int i9 = attabalVar.f14527taiyuan;
            boolean z3 = i9 != -1 && beachfront(strArrSplit[i9].trim());
            int i10 = attabalVar.f14522cutely;
            return new dern(strTrim, iMarial, numImpromptu, numImpromptu2, fTaiyuan, z, z2, z2, z3, i10 != -1 ? competently(strArrSplit[i10].trim()) : -1);
        } catch (RuntimeException e) {
            triweekly.taiyuan("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e);
            return null;
        }
    }

    public static float taiyuan(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            triweekly.taiyuan("SsaStyle", "Failed to parse font size: '" + str + "'", e);
            return -3.4028235E38f;
        }
    }

    public static boolean wireman(int i) {
        return i == 1 || i == 3;
    }
}

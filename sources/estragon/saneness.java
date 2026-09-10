package estragon;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import decarock.grimness;
import decarock.stratoscope;
import decarock.triweekly;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: WebvttCssParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Pattern f25994dern = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Pattern f25995wireman = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final stratoscope f25996attabal = new stratoscope();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final StringBuilder f25997saneness = new StringBuilder();

    public static char apical(stratoscope stratoscopeVar, int i) {
        return (char) stratoscopeVar.marial()[i];
    }

    public static String beachfront(stratoscope stratoscopeVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int iBeachfront = stratoscopeVar.beachfront();
        int iCompetently = stratoscopeVar.competently();
        while (iBeachfront < iCompetently && !z) {
            char c = (char) stratoscopeVar.marial()[iBeachfront];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                iBeachfront++;
                sb.append(c);
            }
        }
        stratoscopeVar.splinterproof(iBeachfront - stratoscopeVar.beachfront());
        return sb.toString();
    }

    public static String competently(stratoscope stratoscopeVar, StringBuilder sb) {
        triweekly(stratoscopeVar);
        if (stratoscopeVar.attabal() == 0) {
            return null;
        }
        String strBeachfront = beachfront(stratoscopeVar, sb);
        if (!"".equals(strBeachfront)) {
            return strBeachfront;
        }
        return "" + ((char) stratoscopeVar.supplicat());
    }

    public static void cutely(stratoscope stratoscopeVar, dern dernVar, StringBuilder sb) {
        triweekly(stratoscopeVar);
        String strBeachfront = beachfront(stratoscopeVar, sb);
        if (!"".equals(strBeachfront) && ":".equals(competently(stratoscopeVar, sb))) {
            triweekly(stratoscopeVar);
            String strImpromptu = impromptu(stratoscopeVar, sb);
            if (strImpromptu == null || "".equals(strImpromptu)) {
                return;
            }
            int iBeachfront = stratoscopeVar.beachfront();
            String strCompetently = competently(stratoscopeVar, sb);
            if (!";".equals(strCompetently)) {
                if (!"}".equals(strCompetently)) {
                    return;
                } else {
                    stratoscopeVar.mathsort(iBeachfront);
                }
            }
            if ("color".equals(strBeachfront)) {
                dernVar.monoploid(decarock.beachfront.saneness(strImpromptu));
                return;
            }
            if ("background-color".equals(strBeachfront)) {
                dernVar.triweekly(decarock.beachfront.saneness(strImpromptu));
                return;
            }
            boolean z = true;
            if ("ruby-position".equals(strBeachfront)) {
                if ("over".equals(strImpromptu)) {
                    dernVar.dovishness(1);
                    return;
                } else {
                    if ("under".equals(strImpromptu)) {
                        dernVar.dovishness(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(strBeachfront)) {
                if (!"all".equals(strImpromptu) && !strImpromptu.startsWith("digits")) {
                    z = false;
                }
                dernVar.arytenoidectomy(z);
                return;
            }
            if ("text-decoration".equals(strBeachfront)) {
                if (TtmlNode.UNDERLINE.equals(strImpromptu)) {
                    dernVar.cuirassed(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(strBeachfront)) {
                dernVar.polloi(strImpromptu);
                return;
            }
            if ("font-weight".equals(strBeachfront)) {
                if (TtmlNode.BOLD.equals(strImpromptu)) {
                    dernVar.kowloon(true);
                }
            } else if ("font-style".equals(strBeachfront)) {
                if (TtmlNode.ITALIC.equals(strImpromptu)) {
                    dernVar.adultoid(true);
                }
            } else if ("font-size".equals(strBeachfront)) {
                marial(strImpromptu, dernVar);
            }
        }
    }

    public static boolean dern(stratoscope stratoscopeVar) {
        char cApical = apical(stratoscopeVar, stratoscopeVar.beachfront());
        if (cApical != '\t' && cApical != '\n' && cApical != '\f' && cApical != '\r' && cApical != ' ') {
            return false;
        }
        stratoscopeVar.splinterproof(1);
        return true;
    }

    public static String formularize(stratoscope stratoscopeVar) {
        int iBeachfront = stratoscopeVar.beachfront();
        int iCompetently = stratoscopeVar.competently();
        boolean z = false;
        while (iBeachfront < iCompetently && !z) {
            int i = iBeachfront + 1;
            z = ((char) stratoscopeVar.marial()[iBeachfront]) == ')';
            iBeachfront = i;
        }
        return stratoscopeVar.yemenite((iBeachfront - 1) - stratoscopeVar.beachfront()).trim();
    }

    public static void impassible(stratoscope stratoscopeVar) {
        while (!TextUtils.isEmpty(stratoscopeVar.molybdenite())) {
        }
    }

    public static String impromptu(stratoscope stratoscopeVar, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int iBeachfront = stratoscopeVar.beachfront();
            String strCompetently = competently(stratoscopeVar, sb);
            if (strCompetently == null) {
                return null;
            }
            if ("}".equals(strCompetently) || ";".equals(strCompetently)) {
                stratoscopeVar.mathsort(iBeachfront);
                z = true;
            } else {
                sb2.append(strCompetently);
            }
        }
        return sb2.toString();
    }

    public static void marial(String str, dern dernVar) {
        Matcher matcher = f25995wireman.matcher(com.google.common.base.attabal.beachfront(str));
        if (!matcher.matches()) {
            triweekly.impromptu("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) decarock.attabal.marial(matcher.group(2));
        str2.getClass();
        switch (str2) {
            case "%":
                dernVar.graveside(3);
                break;
            case "em":
                dernVar.graveside(2);
                break;
            case "px":
                dernVar.graveside(1);
                break;
            default:
                throw new IllegalStateException();
        }
        dernVar.molybdenite(Float.parseFloat((String) decarock.attabal.marial(matcher.group(1))));
    }

    public static boolean saneness(stratoscope stratoscopeVar) {
        int iBeachfront = stratoscopeVar.beachfront();
        int iCompetently = stratoscopeVar.competently();
        byte[] bArrMarial = stratoscopeVar.marial();
        if (iBeachfront + 2 > iCompetently) {
            return false;
        }
        int i = iBeachfront + 1;
        if (bArrMarial[iBeachfront] != 47) {
            return false;
        }
        int i2 = iBeachfront + 2;
        if (bArrMarial[i] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iCompetently) {
                stratoscopeVar.splinterproof(iCompetently - stratoscopeVar.beachfront());
                return true;
            }
            if (((char) bArrMarial[i2]) == '*' && ((char) bArrMarial[i3]) == '/') {
                i2 += 2;
                iCompetently = i2;
            } else {
                i2 = i3;
            }
        }
    }

    public static String taiyuan(stratoscope stratoscopeVar, StringBuilder sb) {
        triweekly(stratoscopeVar);
        if (stratoscopeVar.attabal() < 5 || !"::cue".equals(stratoscopeVar.yemenite(5))) {
            return null;
        }
        int iBeachfront = stratoscopeVar.beachfront();
        String strCompetently = competently(stratoscopeVar, sb);
        if (strCompetently == null) {
            return null;
        }
        if ("{".equals(strCompetently)) {
            stratoscopeVar.mathsort(iBeachfront);
            return "";
        }
        String strFormularize = "(".equals(strCompetently) ? formularize(stratoscopeVar) : null;
        if (")".equals(competently(stratoscopeVar, sb))) {
            return strFormularize;
        }
        return null;
    }

    public static void triweekly(stratoscope stratoscopeVar) {
        while (true) {
            for (boolean z = true; stratoscopeVar.attabal() > 0 && z; z = false) {
                if (!dern(stratoscopeVar) && !saneness(stratoscopeVar)) {
                }
            }
            return;
        }
    }

    public final void attabal(dern dernVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f25994dern.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                dernVar.cord((String) decarock.attabal.marial(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrOsteal = grimness.osteal(str, "\\.");
        String str2 = strArrOsteal[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            dernVar.preprohormone(str2.substring(0, iIndexOf2));
            dernVar.rotuma(str2.substring(iIndexOf2 + 1));
        } else {
            dernVar.preprohormone(str2);
        }
        if (strArrOsteal.length > 1) {
            dernVar.gintrap((String[]) grimness.attendance(strArrOsteal, 1, strArrOsteal.length));
        }
    }

    public List<dern> wireman(stratoscope stratoscopeVar) {
        this.f25997saneness.setLength(0);
        int iBeachfront = stratoscopeVar.beachfront();
        impassible(stratoscopeVar);
        this.f25996attabal.walach(stratoscopeVar.marial(), stratoscopeVar.beachfront());
        this.f25996attabal.mathsort(iBeachfront);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strTaiyuan = taiyuan(this.f25996attabal, this.f25997saneness);
            if (strTaiyuan == null || !"{".equals(competently(this.f25996attabal, this.f25997saneness))) {
                break;
            }
            dern dernVar = new dern();
            attabal(dernVar, strTaiyuan);
            String str = null;
            boolean z = false;
            while (!z) {
                int iBeachfront2 = this.f25996attabal.beachfront();
                String strCompetently = competently(this.f25996attabal, this.f25997saneness);
                boolean z2 = strCompetently == null || "}".equals(strCompetently);
                if (!z2) {
                    this.f25996attabal.mathsort(iBeachfront2);
                    cutely(this.f25996attabal, dernVar, this.f25997saneness);
                }
                str = strCompetently;
                z = z2;
            }
            if ("}".equals(str)) {
                arrayList.add(dernVar);
            }
        }
        return arrayList;
    }
}

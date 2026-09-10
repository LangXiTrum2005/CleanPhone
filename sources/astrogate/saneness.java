package astrogate;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import decarock.grimness;
import decarock.impromptu;
import decarock.stratoscope;
import decarock.triweekly;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import strother.marial;
import strother.polloi;

/* JADX INFO: compiled from: SsaParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness implements polloi {

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final Pattern f14535competently = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final boolean f14536attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final attabal f14540saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public Map<String, dern> f14541wireman;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public float f14539marial = -3.4028235E38f;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public float f14537beachfront = -3.4028235E38f;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final stratoscope f14538dern = new stratoscope();

    public saneness(List<byte[]> list) {
        if (list == null || list.isEmpty()) {
            this.f14536attabal = false;
            this.f14540saneness = null;
            return;
        }
        this.f14536attabal = true;
        String strKattegat = grimness.kattegat(list.get(0));
        decarock.attabal.attabal(strKattegat.startsWith("Format:"));
        this.f14540saneness = (attabal) decarock.attabal.marial(attabal.attabal(strKattegat));
        cutely(new stratoscope(list.get(1)), com.google.common.base.dern.f21534dern);
    }

    public static Layout.Alignment arytenoidectomy(int i) {
        switch (i) {
            case -1:
                return null;
            case 0:
            default:
                triweekly.impromptu("SsaParser", "Unknown alignment: " + i);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    public static libya.attabal beachfront(String str, dern dernVar, dern.saneness sanenessVar, float f, float f2) {
        SpannableString spannableString = new SpannableString(str);
        libya.attabal.saneness sanenessVarKowloon = new libya.attabal.saneness().kowloon(spannableString);
        if (dernVar != null) {
            if (dernVar.f14515saneness != null) {
                spannableString.setSpan(new ForegroundColorSpan(dernVar.f14515saneness.intValue()), 0, spannableString.length(), 33);
            }
            if (dernVar.f14516taiyuan == 3 && dernVar.f14512dern != null) {
                spannableString.setSpan(new BackgroundColorSpan(dernVar.f14512dern.intValue()), 0, spannableString.length(), 33);
            }
            float f3 = dernVar.f14517wireman;
            if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                sanenessVarKowloon.monoploid(f3 / f2, 1);
            }
            boolean z = dernVar.f14514marial;
            if (z && dernVar.f14510beachfront) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (dernVar.f14510beachfront) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (dernVar.f14511competently) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (dernVar.f14513impromptu) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i = sanenessVar.f14533attabal;
        if (i == -1) {
            i = dernVar != null ? dernVar.f14509attabal : -1;
        }
        sanenessVarKowloon.arytenoidectomy(arytenoidectomy(i)).formularize(kowloon(i)).taiyuan(triweekly(i));
        PointF pointF = sanenessVar.f14534saneness;
        if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
            sanenessVarKowloon.apical(marial(sanenessVarKowloon.wireman()));
            sanenessVarKowloon.impromptu(marial(sanenessVarKowloon.dern()), 0);
        } else {
            sanenessVarKowloon.apical(pointF.x / f);
            sanenessVarKowloon.impromptu(sanenessVar.f14534saneness.y / f2, 0);
        }
        return sanenessVarKowloon.attabal();
    }

    public static Map<String, dern> formularize(stratoscope stratoscopeVar, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        dern.attabal attabalVarAttabal = null;
        while (true) {
            String strGraveside = stratoscopeVar.graveside(charset);
            if (strGraveside == null || (stratoscopeVar.attabal() != 0 && stratoscopeVar.impromptu(charset) == '[')) {
                break;
            }
            if (strGraveside.startsWith("Format:")) {
                attabalVarAttabal = dern.attabal.attabal(strGraveside);
            } else if (strGraveside.startsWith("Style:")) {
                if (attabalVarAttabal == null) {
                    triweekly.impromptu("SsaParser", "Skipping 'Style:' line before 'Format:' line: " + strGraveside);
                } else {
                    dern dernVarSaneness = dern.saneness(strGraveside, attabalVarAttabal);
                    if (dernVarSaneness != null) {
                        linkedHashMap.put(dernVarSaneness.name, dernVarSaneness);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static long impassible(String str) {
        Matcher matcher = f14535competently.matcher(str.trim());
        return !matcher.matches() ? C.TIME_UNSET : (Long.parseLong((String) grimness.impromptu(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) grimness.impromptu(matcher.group(2))) * 60000000) + (Long.parseLong((String) grimness.impromptu(matcher.group(3))) * 1000000) + (Long.parseLong((String) grimness.impromptu(matcher.group(4))) * Ua.s);
    }

    public static int kowloon(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                triweekly.impromptu("SsaParser", "Unknown alignment: " + i);
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    public static float marial(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    public static int triweekly(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                triweekly.impromptu("SsaParser", "Unknown alignment: " + i);
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    public static int wireman(long j, List<Long> list, List<List<libya.attabal>> list2) {
        int i;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (list.get(size).longValue() == j) {
                return size;
            }
            if (list.get(size).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList(list2.get(i - 1)));
        return i;
    }

    public final void apical(stratoscope stratoscopeVar, Charset charset) {
        while (true) {
            String strGraveside = stratoscopeVar.graveside(charset);
            if (strGraveside == null) {
                return;
            }
            if (stratoscopeVar.attabal() != 0 && stratoscopeVar.impromptu(charset) == '[') {
                return;
            }
            String[] strArrSplit = strGraveside.split(":");
            if (strArrSplit.length == 2) {
                String strBeachfront = com.google.common.base.attabal.beachfront(strArrSplit[0].trim());
                strBeachfront.getClass();
                if (strBeachfront.equals("playresx")) {
                    this.f14539marial = Float.parseFloat(strArrSplit[1].trim());
                } else if (strBeachfront.equals("playresy")) {
                    try {
                        this.f14537beachfront = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    public final Charset competently(stratoscope stratoscopeVar) {
        Charset charsetCreditor = stratoscopeVar.creditor();
        return charsetCreditor != null ? charsetCreditor : com.google.common.base.dern.f21534dern;
    }

    public final void cutely(stratoscope stratoscopeVar, Charset charset) {
        while (true) {
            String strGraveside = stratoscopeVar.graveside(charset);
            if (strGraveside == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strGraveside)) {
                apical(stratoscopeVar, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strGraveside)) {
                this.f14541wireman = formularize(stratoscopeVar, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(strGraveside)) {
                triweekly.beachfront("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strGraveside)) {
                return;
            }
        }
    }

    @Override // strother.polloi
    public int dern() {
        return 1;
    }

    public final void impromptu(String str, attabal attabalVar, List<List<libya.attabal>> list, List<Long> list2) {
        int i;
        decarock.attabal.attabal(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(",", attabalVar.f14506marial);
        if (strArrSplit.length != attabalVar.f14506marial) {
            triweekly.impromptu("SsaParser", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long jImpassible = impassible(strArrSplit[attabalVar.f14504attabal]);
        if (jImpassible == C.TIME_UNSET) {
            triweekly.impromptu("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        long jImpassible2 = impassible(strArrSplit[attabalVar.f14507saneness]);
        if (jImpassible2 == C.TIME_UNSET) {
            triweekly.impromptu("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        Map<String, dern> map = this.f14541wireman;
        dern dernVar = (map == null || (i = attabalVar.f14505dern) == -1) ? null : map.get(strArrSplit[i].trim());
        String str2 = strArrSplit[attabalVar.f14508wireman];
        libya.attabal attabalVarBeachfront = beachfront(dern.saneness.wireman(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), dernVar, dern.saneness.saneness(str2), this.f14539marial, this.f14537beachfront);
        int iWireman = wireman(jImpassible2, list2, list);
        for (int iWireman2 = wireman(jImpassible, list2, list); iWireman2 < iWireman; iWireman2++) {
            list.get(iWireman2).add(attabalVarBeachfront);
        }
    }

    @Override // strother.polloi
    public void saneness(byte[] bArr, int i, int i2, polloi.saneness sanenessVar, impromptu<marial> impromptuVar) {
        long j;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f14538dern.walach(bArr, i + i2);
        this.f14538dern.mathsort(i);
        Charset charsetCompetently = competently(this.f14538dern);
        if (!this.f14536attabal) {
            cutely(this.f14538dern, charsetCompetently);
        }
        taiyuan(this.f14538dern, arrayList, arrayList2, charsetCompetently);
        long j2 = sanenessVar.f38204attabal;
        long j3 = C.TIME_UNSET;
        ArrayList arrayList3 = (j2 == C.TIME_UNSET || !sanenessVar.f38205saneness) ? null : new ArrayList();
        int i3 = 0;
        while (i3 < arrayList.size()) {
            List<libya.attabal> list = arrayList.get(i3);
            if (list.isEmpty() && i3 != 0) {
                j = j3;
            } else {
                if (i3 == arrayList.size() - 1) {
                    throw new IllegalStateException();
                }
                long jLongValue = arrayList2.get(i3).longValue();
                long jLongValue2 = arrayList2.get(i3 + 1).longValue() - arrayList2.get(i3).longValue();
                j = j3;
                long j4 = sanenessVar.f38204attabal;
                if (j4 == j || jLongValue >= j4) {
                    impromptuVar.accept(new marial(list, jLongValue, jLongValue2));
                } else if (arrayList3 != null) {
                    arrayList3.add(new marial(list, jLongValue, jLongValue2));
                }
            }
            i3++;
            j3 = j;
        }
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                impromptuVar.accept((marial) it.next());
            }
        }
    }

    public final void taiyuan(stratoscope stratoscopeVar, List<List<libya.attabal>> list, List<Long> list2, Charset charset) {
        attabal attabalVarAttabal = this.f14536attabal ? this.f14540saneness : null;
        while (true) {
            String strGraveside = stratoscopeVar.graveside(charset);
            if (strGraveside == null) {
                return;
            }
            if (strGraveside.startsWith("Format:")) {
                attabalVarAttabal = attabal.attabal(strGraveside);
            } else if (strGraveside.startsWith("Dialogue:")) {
                if (attabalVarAttabal == null) {
                    triweekly.impromptu("SsaParser", "Skipping dialogue line before complete format: " + strGraveside);
                } else {
                    impromptu(strGraveside, attabalVarAttabal, list, list2);
                }
            }
        }
    }
}

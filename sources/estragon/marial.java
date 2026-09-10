package estragon;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import decarock.grimness;
import decarock.stratoscope;
import decarock.triweekly;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: WebvttCueParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class marial {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Map<String, Integer> f25972dern;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Map<String, Integer> f25974wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Pattern f25971attabal = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Pattern f25973saneness = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: compiled from: WebvttCueParser.java */
    public static final class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f25975attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final Set<String> f25976dern;
        public final String name;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final String f25977saneness;

        public dern(String str, int i, String str2, Set<String> set) {
            this.f25975attabal = i;
            this.name = str;
            this.f25977saneness = str2;
            this.f25976dern = set;
        }

        public static dern attabal(String str, int i) {
            String str2;
            String strTrim = str.trim();
            decarock.attabal.attabal(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrOsteal = grimness.osteal(strTrim, "\\.");
            String str3 = strArrOsteal[0];
            HashSet hashSet = new HashSet();
            for (int i2 = 1; i2 < strArrOsteal.length; i2++) {
                hashSet.add(strArrOsteal[i2]);
            }
            return new dern(str3, i, str2, hashSet);
        }

        public static dern saneness() {
            return new dern("", 0, "", Collections.EMPTY_SET);
        }
    }

    /* JADX INFO: renamed from: estragon.marial$marial, reason: collision with other inner class name */
    /* JADX INFO: compiled from: WebvttCueParser.java */
    public static final class C0604marial {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public CharSequence f25983dern;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public long f25979attabal = 0;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public long f25986saneness = 0;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f25988wireman = 2;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public float f25985marial = -3.4028235E38f;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public int f25980beachfront = 1;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public int f25981competently = 0;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public float f25984impromptu = -3.4028235E38f;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public int f25987taiyuan = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public float f25982cutely = 1.0f;

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public int f25978apical = Integer.MIN_VALUE;

        public static int beachfront(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 3) {
                return 2;
            }
            if (i != 4) {
                return i != 5 ? 1 : 2;
            }
            return 0;
        }

        public static Layout.Alignment dern(int i) {
            if (i != 1) {
                if (i == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            triweekly.impromptu("WebvttCueParser", "Unknown textAlignment: " + i);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        public static float marial(int i) {
            if (i != 4) {
                return i != 5 ? 0.5f : 1.0f;
            }
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        public static float saneness(float f, int i) {
            if (f != -3.4028235E38f && i == 0 && (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f > 1.0f)) {
                return 1.0f;
            }
            if (f != -3.4028235E38f) {
                return f;
            }
            return i == 0 ? 1.0f : -3.4028235E38f;
        }

        public static float wireman(int i, float f) {
            if (i == 0) {
                return 1.0f - f;
            }
            if (i == 1) {
                return f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
            }
            if (i == 2) {
                return f;
            }
            throw new IllegalStateException(String.valueOf(i));
        }

        public estragon.wireman attabal() {
            return new estragon.wireman(competently().attabal(), this.f25979attabal, this.f25986saneness);
        }

        public libya.attabal.saneness competently() {
            float fMarial = this.f25984impromptu;
            if (fMarial == -3.4028235E38f) {
                fMarial = marial(this.f25988wireman);
            }
            int iBeachfront = this.f25987taiyuan;
            if (iBeachfront == Integer.MIN_VALUE) {
                iBeachfront = beachfront(this.f25988wireman);
            }
            libya.attabal.saneness sanenessVarPolloi = new libya.attabal.saneness().arytenoidectomy(dern(this.f25988wireman)).impromptu(saneness(this.f25985marial, this.f25980beachfront), this.f25980beachfront).taiyuan(this.f25981competently).apical(fMarial).formularize(iBeachfront).triweekly(Math.min(this.f25982cutely, wireman(iBeachfront, fMarial))).polloi(this.f25978apical);
            CharSequence charSequence = this.f25983dern;
            if (charSequence != null) {
                sanenessVarPolloi.kowloon(charSequence);
            }
            return sanenessVarPolloi;
        }
    }

    /* JADX INFO: compiled from: WebvttCueParser.java */
    public static class saneness {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final Comparator<saneness> f25989dern = new Comparator() { // from class: estragon.beachfront
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((marial.saneness) obj).f25990attabal.f25975attabal, ((marial.saneness) obj2).f25990attabal.f25975attabal);
            }
        };

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final dern f25990attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f25991saneness;

        public saneness(dern dernVar, int i) {
            this.f25990attabal = dernVar;
            this.f25991saneness = i;
        }
    }

    /* JADX INFO: compiled from: WebvttCueParser.java */
    public static final class wireman implements Comparable<wireman> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final estragon.dern f25992arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final int f25993kowloon;

        public wireman(int i, estragon.dern dernVar) {
            this.f25993kowloon = i;
            this.f25992arytenoidectomy = dernVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public int compareTo(wireman wiremanVar) {
            return Integer.compare(this.f25993kowloon, wiremanVar.f25993kowloon);
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f25972dern = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f25974wireman = Collections.unmodifiableMap(map2);
    }

    public static void adultoid(String str, C0604marial c0604marial) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c0604marial.f25987taiyuan = graveside(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        c0604marial.f25984impromptu = impromptu.saneness(str);
    }

    public static boolean apical(String str) {
        str.getClass();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    public static void arytenoidectomy(String str, C0604marial c0604marial) {
        Matcher matcher = f25973saneness.matcher(str);
        while (matcher.find()) {
            String str2 = (String) decarock.attabal.marial(matcher.group(1));
            String str3 = (String) decarock.attabal.marial(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    molybdenite(str3, c0604marial);
                } else if ("align".equals(str2)) {
                    c0604marial.f25988wireman = dovishness(str3);
                } else if (X3.i.L.equals(str2)) {
                    adultoid(str3, c0604marial);
                } else if ("size".equals(str2)) {
                    c0604marial.f25982cutely = impromptu.saneness(str3);
                } else if ("vertical".equals(str2)) {
                    c0604marial.f25978apical = gintrap(str3);
                } else {
                    triweekly.impromptu("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                triweekly.impromptu("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static void attabal(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i, int i2) {
        for (String str : set) {
            Map<String, Integer> map = f25972dern;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i, i2, 33);
            } else {
                Map<String, Integer> map2 = f25974wireman;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i, i2, 33);
                }
            }
        }
    }

    public static int beachfront(String str, int i) {
        int iIndexOf = str.indexOf(62, i);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    public static int competently(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        throw new IllegalArgumentException();
    }

    public static String cutely(String str) {
        String strTrim = str.trim();
        decarock.attabal.attabal(!strTrim.isEmpty());
        return grimness.licking(strTrim, "[ \\.]")[0];
    }

    public static void dern(SpannableStringBuilder spannableStringBuilder, String str, dern dernVar, List<saneness> list, List<estragon.dern> list2) {
        int iTaiyuan = taiyuan(list2, str, dernVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, saneness.f25989dern);
        int i = dernVar.f25975attabal;
        int length = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if ("rt".equals(((saneness) arrayList.get(i2)).f25990attabal.name)) {
                saneness sanenessVar = (saneness) arrayList.get(i2);
                int iCompetently = competently(taiyuan(list2, str, sanenessVar.f25990attabal), iTaiyuan, 1);
                int i3 = sanenessVar.f25990attabal.f25975attabal - length;
                int i4 = sanenessVar.f25991saneness - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i3, i4);
                spannableStringBuilder.delete(i3, i4);
                spannableStringBuilder.setSpan(new libya.marial(charSequenceSubSequence.toString(), iCompetently), i, i3, 33);
                length += charSequenceSubSequence.length();
                i = i3;
            }
        }
    }

    public static int dovishness(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                triweekly.impromptu("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    public static libya.attabal formularize(CharSequence charSequence) {
        C0604marial c0604marial = new C0604marial();
        c0604marial.f25983dern = charSequence;
        return c0604marial.competently().attabal();
    }

    public static int gintrap(String str) {
        str.getClass();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        triweekly.impromptu("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }

    public static int graveside(String str) {
        str.getClass();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                triweekly.impromptu("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    public static estragon.wireman impassible(stratoscope stratoscopeVar, List<estragon.dern> list) {
        String strMolybdenite = stratoscopeVar.molybdenite();
        if (strMolybdenite == null) {
            return null;
        }
        Pattern pattern = f25971attabal;
        Matcher matcher = pattern.matcher(strMolybdenite);
        if (matcher.matches()) {
            return triweekly(null, matcher, stratoscopeVar, list);
        }
        String strMolybdenite2 = stratoscopeVar.molybdenite();
        if (strMolybdenite2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strMolybdenite2);
        if (matcher2.matches()) {
            return triweekly(strMolybdenite.trim(), matcher2, stratoscopeVar, list);
        }
        return null;
    }

    public static List<wireman> impromptu(List<estragon.dern> list, String str, dern dernVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            estragon.dern dernVar2 = list.get(i);
            int iImpromptu = dernVar2.impromptu(str, dernVar.name, dernVar.f25976dern, dernVar.f25977saneness);
            if (iImpromptu > 0) {
                arrayList.add(new wireman(iImpromptu, dernVar2));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static libya.attabal.saneness kowloon(String str) {
        C0604marial c0604marial = new C0604marial();
        arytenoidectomy(str, c0604marial);
        return c0604marial.competently();
    }

    public static void marial(SpannableStringBuilder spannableStringBuilder, estragon.dern dernVar, int i, int i2) {
        if (dernVar == null) {
            return;
        }
        if (dernVar.taiyuan() != -1) {
            libya.beachfront.saneness(spannableStringBuilder, new StyleSpan(dernVar.taiyuan()), i, i2, 33);
        }
        if (dernVar.formularize()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (dernVar.impassible()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (dernVar.apical()) {
            libya.beachfront.saneness(spannableStringBuilder, new ForegroundColorSpan(dernVar.dern()), i, i2, 33);
        }
        if (dernVar.cutely()) {
            libya.beachfront.saneness(spannableStringBuilder, new BackgroundColorSpan(dernVar.attabal()), i, i2, 33);
        }
        if (dernVar.wireman() != null) {
            libya.beachfront.saneness(spannableStringBuilder, new TypefaceSpan(dernVar.wireman()), i, i2, 33);
        }
        int iBeachfront = dernVar.beachfront();
        if (iBeachfront == 1) {
            libya.beachfront.saneness(spannableStringBuilder, new AbsoluteSizeSpan((int) dernVar.marial(), true), i, i2, 33);
        } else if (iBeachfront == 2) {
            libya.beachfront.saneness(spannableStringBuilder, new RelativeSizeSpan(dernVar.marial()), i, i2, 33);
        } else if (iBeachfront == 3) {
            libya.beachfront.saneness(spannableStringBuilder, new RelativeSizeSpan(dernVar.marial() / 100.0f), i, i2, 33);
        }
        if (dernVar.saneness()) {
            spannableStringBuilder.setSpan(new libya.wireman(), i, i2, 33);
        }
    }

    public static void molybdenite(String str, C0604marial c0604marial) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c0604marial.f25981competently = polloi(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c0604marial.f25985marial = impromptu.saneness(str);
            c0604marial.f25980beachfront = 0;
        } else {
            c0604marial.f25985marial = Integer.parseInt(str);
            c0604marial.f25980beachfront = 1;
        }
    }

    public static SpannedString monoploid(String str, String str2, List<estragon.dern> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    saneness(str2.substring(i, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i++;
            } else {
                int iBeachfront = i + 1;
                if (iBeachfront < str2.length()) {
                    boolean z = str2.charAt(iBeachfront) == '/';
                    iBeachfront = beachfront(str2, iBeachfront);
                    int i2 = iBeachfront - 2;
                    boolean z2 = str2.charAt(i2) == '/';
                    int i3 = i + (z ? 2 : 1);
                    if (!z2) {
                        i2 = iBeachfront - 1;
                    }
                    String strSubstring = str2.substring(i3, i2);
                    if (!strSubstring.trim().isEmpty()) {
                        String strCutely = cutely(strSubstring);
                        if (apical(strCutely)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    dern dernVar = (dern) arrayDeque.pop();
                                    wireman(str, dernVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new saneness(dernVar, spannableStringBuilder.length()));
                                    }
                                    if (dernVar.name.equals(strCutely)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(dern.attabal(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i = iBeachfront;
            }
        }
        while (!arrayDeque.isEmpty()) {
            wireman(str, (dern) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        wireman(str, dern.saneness(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    public static int polloi(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                triweekly.impromptu("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    public static void saneness(String str, SpannableStringBuilder spannableStringBuilder) {
        str.getClass();
        switch (str) {
            case "gt":
                spannableStringBuilder.append('>');
                break;
            case "lt":
                spannableStringBuilder.append('<');
                break;
            case "amp":
                spannableStringBuilder.append('&');
                break;
            case "nbsp":
                spannableStringBuilder.append(' ');
                break;
            default:
                triweekly.impromptu("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    public static int taiyuan(List<estragon.dern> list, String str, dern dernVar) {
        List<wireman> listImpromptu = impromptu(list, str, dernVar);
        for (int i = 0; i < listImpromptu.size(); i++) {
            estragon.dern dernVar2 = listImpromptu.get(i).f25992arytenoidectomy;
            if (dernVar2.competently() != -1) {
                return dernVar2.competently();
            }
        }
        return -1;
    }

    public static estragon.wireman triweekly(String str, Matcher matcher, stratoscope stratoscopeVar, List<estragon.dern> list) {
        C0604marial c0604marial = new C0604marial();
        try {
            c0604marial.f25979attabal = impromptu.dern((String) decarock.attabal.marial(matcher.group(1)));
            c0604marial.f25986saneness = impromptu.dern((String) decarock.attabal.marial(matcher.group(2)));
            arytenoidectomy((String) decarock.attabal.marial(matcher.group(3)), c0604marial);
            StringBuilder sb = new StringBuilder();
            String strMolybdenite = stratoscopeVar.molybdenite();
            while (!TextUtils.isEmpty(strMolybdenite)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strMolybdenite.trim());
                strMolybdenite = stratoscopeVar.molybdenite();
            }
            c0604marial.f25983dern = monoploid(str, sb.toString(), list);
            return c0604marial.attabal();
        } catch (NumberFormatException unused) {
            triweekly.impromptu("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static void wireman(String str, dern dernVar, List<saneness> list, SpannableStringBuilder spannableStringBuilder, List<estragon.dern> list2) {
        int i = dernVar.f25975attabal;
        int length = spannableStringBuilder.length();
        String str2 = dernVar.name;
        str2.getClass();
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case "c":
                attabal(spannableStringBuilder, dernVar.f25976dern, i, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case "ruby":
                dern(spannableStringBuilder, str, dernVar, list, list2);
                break;
            default:
                return;
        }
        List<wireman> listImpromptu = impromptu(list2, str, dernVar);
        for (int i2 = 0; i2 < listImpromptu.size(); i2++) {
            marial(spannableStringBuilder, listImpromptu.get(i2).f25992arytenoidectomy, i, length);
        }
    }
}

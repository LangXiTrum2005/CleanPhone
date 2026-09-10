package rsp;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import decarock.grimness;
import decarock.triweekly;
import java.util.ArrayDeque;
import java.util.Map;

/* JADX INFO: compiled from: TtmlRenderUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class beachfront {
    public static void attabal(Spannable spannable, int i, int i2, competently competentlyVar, dern dernVar, Map<String, competently> map, int i3) {
        dern dernVarMarial;
        competently competentlyVarBeachfront;
        int i4;
        if (competentlyVar.formularize() != -1) {
            spannable.setSpan(new StyleSpan(competentlyVar.formularize()), i, i2, 33);
        }
        if (competentlyVar.molybdenite()) {
            spannable.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (competentlyVar.graveside()) {
            spannable.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (competentlyVar.monoploid()) {
            libya.beachfront.saneness(spannable, new ForegroundColorSpan(competentlyVar.dern()), i, i2, 33);
        }
        if (competentlyVar.arytenoidectomy()) {
            libya.beachfront.saneness(spannable, new BackgroundColorSpan(competentlyVar.saneness()), i, i2, 33);
        }
        if (competentlyVar.wireman() != null) {
            libya.beachfront.saneness(spannable, new TypefaceSpan(competentlyVar.wireman()), i, i2, 33);
        }
        if (competentlyVar.kowloon() != null) {
            saneness sanenessVar = (saneness) decarock.attabal.marial(competentlyVar.kowloon());
            int i5 = sanenessVar.f36987attabal;
            if (i5 == -1) {
                i5 = (i3 == 2 || i3 == 1) ? 3 : 1;
                i4 = 1;
            } else {
                i4 = sanenessVar.f36989saneness;
            }
            int i6 = sanenessVar.f36988dern;
            if (i6 == -2) {
                i6 = 1;
            }
            libya.beachfront.saneness(spannable, new libya.competently(i5, i4, i6), i, i2, 33);
        }
        int iCutely = competentlyVar.cutely();
        if (iCutely == 2) {
            dern dernVarWireman = wireman(dernVar, map);
            if (dernVarWireman != null && (dernVarMarial = marial(dernVarWireman, map)) != null) {
                if (dernVarMarial.competently() != 1 || dernVarMarial.beachfront(0).f36964saneness == null) {
                    triweekly.beachfront("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) grimness.impromptu(dernVarMarial.beachfront(0).f36964saneness);
                    competently competentlyVarBeachfront2 = beachfront(dernVarMarial.f36956beachfront, dernVarMarial.formularize(), map);
                    int iTaiyuan = competentlyVarBeachfront2 != null ? competentlyVarBeachfront2.taiyuan() : -1;
                    if (iTaiyuan == -1 && (competentlyVarBeachfront = beachfront(dernVarWireman.f36956beachfront, dernVarWireman.formularize(), map)) != null) {
                        iTaiyuan = competentlyVarBeachfront.taiyuan();
                    }
                    spannable.setSpan(new libya.marial(str, iTaiyuan), i, i2, 33);
                }
            }
        } else if (iCutely == 3 || iCutely == 4) {
            spannable.setSpan(new attabal(), i, i2, 33);
        }
        if (competentlyVar.triweekly()) {
            libya.beachfront.saneness(spannable, new libya.wireman(), i, i2, 33);
        }
        int iBeachfront = competentlyVar.beachfront();
        if (iBeachfront == 1) {
            libya.beachfront.saneness(spannable, new AbsoluteSizeSpan((int) competentlyVar.marial(), true), i, i2, 33);
        } else if (iBeachfront == 2) {
            libya.beachfront.saneness(spannable, new RelativeSizeSpan(competentlyVar.marial()), i, i2, 33);
        } else {
            if (iBeachfront != 3) {
                return;
            }
            libya.beachfront.attabal(spannable, competentlyVar.marial() / 100.0f, i, i2, 33);
        }
    }

    public static competently beachfront(competently competentlyVar, String[] strArr, Map<String, competently> map) {
        int i = 0;
        if (competentlyVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                competently competentlyVar2 = new competently();
                int length = strArr.length;
                while (i < length) {
                    competentlyVar2.attabal(map.get(strArr[i]));
                    i++;
                }
                return competentlyVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return competentlyVar.attabal(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    competentlyVar.attabal(map.get(strArr[i]));
                    i++;
                }
            }
        }
        return competentlyVar;
    }

    public static void dern(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    public static dern marial(dern dernVar, Map<String, competently> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(dernVar);
        while (!arrayDeque.isEmpty()) {
            dern dernVar2 = (dern) arrayDeque.pop();
            competently competentlyVarBeachfront = beachfront(dernVar2.f36956beachfront, dernVar2.formularize(), map);
            if (competentlyVarBeachfront != null && competentlyVarBeachfront.cutely() == 3) {
                return dernVar2;
            }
            for (int iCompetently = dernVar2.competently() - 1; iCompetently >= 0; iCompetently--) {
                arrayDeque.push(dernVar2.beachfront(iCompetently));
            }
        }
        return null;
    }

    public static String saneness(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    public static dern wireman(dern dernVar, Map<String, competently> map) {
        while (dernVar != null) {
            competently competentlyVarBeachfront = beachfront(dernVar.f36956beachfront, dernVar.formularize(), map);
            if (competentlyVarBeachfront != null && competentlyVarBeachfront.cutely() == 1) {
                return dernVar;
            }
            dernVar = dernVar.f36958cutely;
        }
        return null;
    }
}

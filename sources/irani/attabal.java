package irani;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.common.base.dern;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import decarock.impromptu;
import decarock.stratoscope;
import decarock.triweekly;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import strother.marial;
import strother.polloi;

/* JADX INFO: compiled from: SubripParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal implements polloi {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Pattern f28988wireman = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final Pattern f28987marial = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final StringBuilder f28989attabal = new StringBuilder();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ArrayList<String> f28991saneness = new ArrayList<>();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final stratoscope f28990dern = new stratoscope();

    public static float beachfront(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    public static long competently(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L) + (Long.parseLong((String) decarock.attabal.marial(matcher.group(i + 2))) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) + (Long.parseLong((String) decarock.attabal.marial(matcher.group(i + 3))) * 1000);
        String strGroup2 = matcher.group(i + 4);
        if (strGroup2 != null) {
            j += Long.parseLong(strGroup2);
        }
        return j * 1000;
    }

    private Charset marial(stratoscope stratoscopeVar) {
        Charset charsetCreditor = stratoscopeVar.creditor();
        return charsetCreditor != null ? charsetCreditor : dern.f21534dern;
    }

    @Override // strother.polloi
    public int dern() {
        return 1;
    }

    public final String impromptu(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb = new StringBuilder(strTrim);
        Matcher matcher = f28987marial.matcher(strTrim);
        int i = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i;
            int length = strGroup.length();
            sb.replace(iStart, iStart + length, "");
            i += length;
        }
        return sb.toString();
    }

    @Override // strother.polloi
    public void saneness(byte[] bArr, int i, int i2, polloi.saneness sanenessVar, impromptu<marial> impromptuVar) {
        long j;
        String str;
        this.f28990dern.walach(bArr, i + i2);
        this.f28990dern.mathsort(i);
        Charset charsetMarial = marial(this.f28990dern);
        long j2 = sanenessVar.f38204attabal;
        long j3 = C.TIME_UNSET;
        ArrayList arrayList = (j2 == C.TIME_UNSET || !sanenessVar.f38205saneness) ? null : new ArrayList();
        while (true) {
            String strGraveside = this.f28990dern.graveside(charsetMarial);
            if (strGraveside == null) {
                break;
            }
            if (strGraveside.length() != 0) {
                try {
                    Integer.parseInt(strGraveside);
                    String strGraveside2 = this.f28990dern.graveside(charsetMarial);
                    if (strGraveside2 == null) {
                        triweekly.impromptu("SubripParser", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f28988wireman.matcher(strGraveside2);
                    if (matcher.matches()) {
                        long jCompetently = competently(matcher, 1);
                        long jCompetently2 = competently(matcher, 6);
                        int i3 = 0;
                        this.f28989attabal.setLength(0);
                        this.f28991saneness.clear();
                        String strGraveside3 = this.f28990dern.graveside(charsetMarial);
                        while (!TextUtils.isEmpty(strGraveside3)) {
                            if (this.f28989attabal.length() > 0) {
                                this.f28989attabal.append("<br>");
                            }
                            this.f28989attabal.append(impromptu(strGraveside3, this.f28991saneness));
                            strGraveside3 = this.f28990dern.graveside(charsetMarial);
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.f28989attabal.toString());
                        while (true) {
                            if (i3 >= this.f28991saneness.size()) {
                                str = null;
                                break;
                            }
                            str = this.f28991saneness.get(i3);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        j = j3;
                        long j4 = sanenessVar.f38204attabal;
                        if (j4 == j || jCompetently >= j4) {
                            impromptuVar.accept(new marial(ImmutableList.of(wireman(spannedFromHtml, str)), jCompetently, jCompetently2 - jCompetently));
                        } else if (arrayList != null) {
                            arrayList.add(new marial(ImmutableList.of(wireman(spannedFromHtml, str)), jCompetently, jCompetently2 - jCompetently));
                        }
                    } else {
                        j = j3;
                        triweekly.impromptu("SubripParser", "Skipping invalid timing: " + strGraveside2);
                    }
                    j3 = j;
                } catch (NumberFormatException unused) {
                    j = j3;
                    triweekly.impromptu("SubripParser", "Skipping invalid index: " + strGraveside);
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                impromptuVar.accept((marial) it.next());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b6  */
    public final libya.attabal wireman(Spanned spanned, String str) {
        libya.attabal.saneness sanenessVarKowloon = new libya.attabal.saneness().kowloon(spanned);
        if (str == null) {
            return sanenessVarKowloon.attabal();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    sanenessVarKowloon.formularize(1);
                } else {
                    sanenessVarKowloon.formularize(0);
                }
                break;
            case -685620679:
                str.equals("{\\an2}");
                sanenessVarKowloon.formularize(1);
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    sanenessVarKowloon.formularize(1);
                } else {
                    sanenessVarKowloon.formularize(2);
                }
                break;
            case -685620617:
                if (!str.equals("{\\an4}")) {
                    sanenessVarKowloon.formularize(1);
                } else {
                    sanenessVarKowloon.formularize(0);
                }
                break;
            case -685620586:
                str.equals("{\\an5}");
                sanenessVarKowloon.formularize(1);
                break;
            case -685620555:
                if (!str.equals("{\\an6}")) {
                    sanenessVarKowloon.formularize(1);
                } else {
                    sanenessVarKowloon.formularize(2);
                }
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    sanenessVarKowloon.formularize(1);
                } else {
                    sanenessVarKowloon.formularize(0);
                }
                break;
            case -685620493:
                str.equals("{\\an8}");
                sanenessVarKowloon.formularize(1);
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    sanenessVarKowloon.formularize(1);
                } else {
                    sanenessVarKowloon.formularize(2);
                }
                break;
            default:
                sanenessVarKowloon.formularize(1);
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    sanenessVarKowloon.taiyuan(1);
                } else {
                    sanenessVarKowloon.taiyuan(2);
                }
                break;
            case -685620679:
                if (!str.equals("{\\an2}")) {
                    sanenessVarKowloon.taiyuan(1);
                } else {
                    sanenessVarKowloon.taiyuan(2);
                }
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    sanenessVarKowloon.taiyuan(1);
                } else {
                    sanenessVarKowloon.taiyuan(2);
                }
                break;
            case -685620617:
                str.equals("{\\an4}");
                sanenessVarKowloon.taiyuan(1);
                break;
            case -685620586:
                str.equals("{\\an5}");
                sanenessVarKowloon.taiyuan(1);
                break;
            case -685620555:
                str.equals("{\\an6}");
                sanenessVarKowloon.taiyuan(1);
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    sanenessVarKowloon.taiyuan(1);
                } else {
                    sanenessVarKowloon.taiyuan(0);
                }
                break;
            case -685620493:
                if (!str.equals("{\\an8}")) {
                    sanenessVarKowloon.taiyuan(1);
                } else {
                    sanenessVarKowloon.taiyuan(0);
                }
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    sanenessVarKowloon.taiyuan(1);
                } else {
                    sanenessVarKowloon.taiyuan(0);
                }
                break;
            default:
                sanenessVarKowloon.taiyuan(1);
                break;
        }
        return sanenessVarKowloon.apical(beachfront(sanenessVarKowloon.wireman())).impromptu(beachfront(sanenessVarKowloon.dern()), 0).attabal();
    }
}

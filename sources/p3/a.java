package p3;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.unity3d.services.UnityAdsConstants;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k1.b;
import k3.l;
import k3.m;
import l1.g;
import l1.q;
import oa.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f48250d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f48251e = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f48252a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f48253b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f48254c = new q();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c3  */
    public static b a(Spanned spanned, String str) {
        int i10;
        int i11;
        float f10;
        if (str == null) {
            return new b(spanned, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                break;
            case -685620679:
                str.equals("{\\an2}");
                i10 = 1;
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                break;
            case -685620617:
                if (!str.equals("{\\an4}")) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                break;
            case -685620586:
                str.equals("{\\an5}");
                i10 = 1;
                break;
            case -685620555:
                if (!str.equals("{\\an6}")) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                break;
            case -685620493:
                str.equals("{\\an8}");
                i10 = 1;
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                break;
            default:
                i10 = 1;
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                break;
            case -685620679:
                if (!str.equals("{\\an2}")) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                break;
            case -685620617:
                str.equals("{\\an4}");
                i11 = 1;
                break;
            case -685620586:
                str.equals("{\\an5}");
                i11 = 1;
                break;
            case -685620555:
                str.equals("{\\an6}");
                i11 = 1;
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                break;
            case -685620493:
                if (!str.equals("{\\an8}")) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                break;
            default:
                i11 = 1;
                break;
        }
        float f11 = 0.08f;
        if (i10 == 0) {
            f10 = 0.08f;
        } else if (i10 == 1) {
            f10 = 0.5f;
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            f10 = 0.92f;
        }
        if (i11 != 0) {
            if (i11 == 1) {
                f11 = 0.5f;
            } else {
                if (i11 != 2) {
                    throw new IllegalArgumentException();
                }
                f11 = 0.92f;
            }
        }
        return new b(spanned, null, null, null, f11, 0, i11, f10, i10, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
    }

    public static long b(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i10 + 2);
        strGroup2.getClass();
        long j11 = (Long.parseLong(strGroup2) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) + j10;
        String strGroup3 = matcher.group(i10 + 3);
        strGroup3.getClass();
        long j12 = (Long.parseLong(strGroup3) * 1000) + j11;
        String strGroup4 = matcher.group(i10 + 4);
        if (strGroup4 != null) {
            j12 += Long.parseLong(strGroup4);
        }
        return j12 * 1000;
    }

    @Override // k3.m
    public final void e(byte[] bArr, int i10, int i11, l lVar, g gVar) {
        String str;
        a aVar = this;
        long j10 = lVar.f44296a;
        q qVar = aVar.f48254c;
        qVar.K(bArr, i10 + i11);
        qVar.M(i10);
        Charset charsetI = qVar.I();
        if (charsetI == null) {
            charsetI = StandardCharsets.UTF_8;
        }
        long j11 = C.TIME_UNSET;
        ArrayList arrayList = (j10 == C.TIME_UNSET || !lVar.f44297b) ? null : new ArrayList();
        while (true) {
            String strN = qVar.n(charsetI);
            if (strN == null) {
                break;
            }
            if (!strN.isEmpty()) {
                try {
                    Integer.parseInt(strN);
                    String strN2 = qVar.n(charsetI);
                    if (strN2 == null) {
                        l1.a.s("SubripParser", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f48250d.matcher(strN2);
                    if (matcher.matches()) {
                        long jB = b(matcher, 1);
                        long jB2 = b(matcher, 6);
                        StringBuilder sb2 = aVar.f48252a;
                        sb2.setLength(0);
                        long j12 = j11;
                        ArrayList arrayList2 = aVar.f48253b;
                        arrayList2.clear();
                        for (String strN3 = qVar.n(charsetI); !TextUtils.isEmpty(strN3); strN3 = qVar.n(charsetI)) {
                            if (sb2.length() > 0) {
                                sb2.append("<br>");
                            }
                            String strTrim = strN3.trim();
                            StringBuilder sb3 = new StringBuilder(strTrim);
                            Matcher matcher2 = f48251e.matcher(strTrim);
                            int i12 = 0;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList2.add(strGroup);
                                int iStart = matcher2.start() - i12;
                                int length = strGroup.length();
                                sb3.replace(iStart, iStart + length, "");
                                i12 += length;
                                j10 = j10;
                            }
                            sb2.append(sb3.toString());
                        }
                        long j13 = j10;
                        Spanned spannedFromHtml = Html.fromHtml(sb2.toString());
                        int i13 = 0;
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                str = null;
                                break;
                            }
                            str = (String) arrayList2.get(i13);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        if (j13 == j12 || jB2 >= j13) {
                            gVar.accept(new k3.a(j0.B(a(spannedFromHtml, str)), jB, jB2 - jB));
                        } else if (arrayList != null) {
                            arrayList.add(new k3.a(j0.B(a(spannedFromHtml, str)), jB, jB2 - jB));
                        }
                        aVar = this;
                        j11 = j12;
                        j10 = j13;
                    } else {
                        l1.a.s("SubripParser", "Skipping invalid timing: ".concat(strN2));
                        aVar = this;
                    }
                } catch (NumberFormatException unused) {
                    l1.a.s("SubripParser", "Skipping invalid index: ".concat(strN));
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                gVar.accept((k3.a) it.next());
            }
        }
    }

    @Override // k3.m
    public final int i() {
        return 1;
    }
}

package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.unity3d.services.UnityAdsConstants;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g8 implements q7 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f14791d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f14792e = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f14793a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f14794b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final np0 f14795c = new np0();

    public static long a(Matcher matcher, int i10) {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:55:0x0134  */
    /* JADX WARN: Code duplicated, block: B:58:0x013c  */
    /* JADX WARN: Code duplicated, block: B:59:0x013e  */
    /* JADX WARN: Code duplicated, block: B:71:0x015d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0175  */
    /* JADX WARN: Code duplicated, block: B:81:0x0177  */
    @Override // com.google.android.gms.internal.ads.q7
    public final void b(int i10, int i11, b2.d0 d0Var, byte[] bArr) {
        String str;
        int i12;
        int i13;
        float f10;
        l80 l80Var;
        g8 g8Var = this;
        np0 np0Var = g8Var.f14795c;
        np0Var.z(i10 + i11, bArr);
        np0Var.E(i10);
        Charset charsetQ = np0Var.q();
        if (charsetQ == null) {
            charsetQ = StandardCharsets.UTF_8;
        }
        while (true) {
            String strN = np0Var.n(charsetQ);
            if (strN == null) {
                return;
            }
            if (!strN.isEmpty()) {
                try {
                    Integer.parseInt(strN);
                    String strN2 = np0Var.n(charsetQ);
                    if (strN2 == null) {
                        v71.y("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = f14791d.matcher(strN2);
                    if (matcher.matches()) {
                        long jA = a(matcher, 1);
                        long jA2 = a(matcher, 6);
                        StringBuilder sb2 = g8Var.f14793a;
                        int i14 = 0;
                        sb2.setLength(0);
                        ArrayList arrayList = g8Var.f14794b;
                        arrayList.clear();
                        String strN3 = np0Var.n(charsetQ);
                        while (!TextUtils.isEmpty(strN3)) {
                            if (sb2.length() > 0) {
                                sb2.append("<br>");
                            }
                            String strTrim = strN3.trim();
                            StringBuilder sb3 = new StringBuilder(strTrim);
                            Matcher matcher2 = f14792e.matcher(strTrim);
                            int i15 = i14;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList.add(strGroup);
                                int iStart = matcher2.start() - i15;
                                int length = strGroup.length();
                                sb3.replace(iStart, iStart + length, "");
                                i15 += length;
                            }
                            sb2.append(sb3.toString());
                            strN3 = np0Var.n(charsetQ);
                            i14 = 0;
                        }
                        Spanned spannedFromHtml = Html.fromHtml(sb2.toString());
                        int i16 = 0;
                        while (true) {
                            if (i16 < arrayList.size()) {
                                str = (String) arrayList.get(i16);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i16++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        if (str == null) {
                            l80Var = new l80(spannedFromHtml, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                        } else {
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (!str.equals("{\\an1}")) {
                                        i12 = 1;
                                    } else {
                                        i12 = 0;
                                    }
                                    break;
                                case -685620648:
                                    if (!str.equals("{\\an3}")) {
                                        i12 = 1;
                                    } else {
                                        i12 = 2;
                                    }
                                    break;
                                case -685620617:
                                    if (!str.equals("{\\an4}")) {
                                        i12 = 1;
                                    } else {
                                        i12 = 0;
                                    }
                                    break;
                                case -685620555:
                                    if (!str.equals("{\\an6}")) {
                                        i12 = 1;
                                    } else {
                                        i12 = 2;
                                    }
                                    break;
                                case -685620524:
                                    if (!str.equals("{\\an7}")) {
                                        i12 = 1;
                                    } else {
                                        i12 = 0;
                                    }
                                    break;
                                case -685620462:
                                    if (!str.equals("{\\an9}")) {
                                        i12 = 1;
                                    } else {
                                        i12 = 2;
                                    }
                                    break;
                                default:
                                    i12 = 1;
                                    break;
                            }
                            switch (str) {
                                case "{\an1}":
                                case "{\an2}":
                                case "{\an3}":
                                    i13 = 2;
                                    break;
                                case "{\an7}":
                                case "{\an8}":
                                case "{\an9}":
                                    i13 = 0;
                                    break;
                                default:
                                    i13 = 1;
                                    break;
                            }
                            float f11 = 0.08f;
                            if (i12 == 0) {
                                f10 = 0.08f;
                            } else if (i12 == 1) {
                                f10 = 0.5f;
                            } else {
                                if (i12 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                f10 = 0.92f;
                            }
                            if (i13 != 0) {
                                if (i13 == 1) {
                                    f11 = 0.5f;
                                } else {
                                    if (i13 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    f11 = 0.92f;
                                }
                            }
                            l80Var = new l80(spannedFromHtml, null, null, null, f11, 0, i13, f10, i12, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                        }
                        d0Var.mo161zza(new m7(ca1.u(l80Var), jA, jA2 - jA));
                    } else {
                        v71.y("SubripParser", "Skipping invalid timing: ".concat(strN2));
                    }
                } catch (NumberFormatException unused) {
                    v71.y("SubripParser", "Skipping invalid index: ".concat(strN));
                }
            }
            g8Var = this;
        }
    }
}

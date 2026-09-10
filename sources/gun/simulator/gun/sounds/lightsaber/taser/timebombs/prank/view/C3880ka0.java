package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ka0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3880ka0 extends R60 {
    public static final Pattern o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern p = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder m = new StringBuilder();
    public final ArrayList n = new ArrayList();

    public static long e(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = (Long.parseLong(strGroup2) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) + j;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = (Long.parseLong(strGroup3) * 1000) + j2;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:115:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:70:0x016e  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.R60
    public final InterfaceC4495ra0 b(byte[] bArr, int i, boolean z) {
        String str;
        byte b;
        byte b2;
        int i2;
        int i3;
        int i4;
        float f;
        float f2;
        C2417Fk c2417Fk;
        this = this;
        ArrayList arrayList = new ArrayList();
        C2329Ca c2329Ca = new C2329Ca(5);
        JT jt = new JT(bArr, i);
        Charset charsetA = jt.A();
        if (charsetA == null) {
            charsetA = AbstractC2333Ce.c;
        }
        while (true) {
            String strG = jt.g(charsetA);
            if (strG != null) {
                if (strG.length() != 0) {
                    try {
                        Integer.parseInt(strG);
                        String strG2 = jt.g(charsetA);
                        if (strG2 == null) {
                            AbstractC4038mJ.f();
                        } else {
                            Matcher matcher = o.matcher(strG2);
                            if (matcher.matches()) {
                                c2329Ca.a(e(matcher, 1));
                                c2329Ca.a(e(matcher, 6));
                                StringBuilder sb = this.m;
                                sb.setLength(0);
                                ArrayList arrayList2 = this.n;
                                arrayList2.clear();
                                for (String strG3 = jt.g(charsetA); !TextUtils.isEmpty(strG3); strG3 = jt.g(charsetA)) {
                                    if (sb.length() > 0) {
                                        sb.append("<br>");
                                    }
                                    String strTrim = strG3.trim();
                                    StringBuilder sb2 = new StringBuilder(strTrim);
                                    Matcher matcher2 = p.matcher(strTrim);
                                    int i5 = 0;
                                    while (matcher2.find()) {
                                        String strGroup = matcher2.group();
                                        arrayList2.add(strGroup);
                                        int iStart = matcher2.start() - i5;
                                        int length = strGroup.length();
                                        sb2.replace(iStart, iStart + length, "");
                                        i5 += length;
                                    }
                                    sb.append(sb2.toString());
                                }
                                Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                                int i6 = 0;
                                while (true) {
                                    if (i6 < arrayList2.size()) {
                                        str = (String) arrayList2.get(i6);
                                        if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                            i6++;
                                        }
                                    } else {
                                        str = null;
                                    }
                                }
                                if (str == null) {
                                    c2417Fk = new C2417Fk(spannedFromHtml, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, ViewCompat.MEASURED_STATE_MASK, Integer.MIN_VALUE, 0.0f);
                                } else {
                                    switch (str) {
                                        case "{\an1}":
                                            b = 0;
                                            break;
                                        case "{\an2}":
                                            b = 6;
                                            break;
                                        case "{\an3}":
                                            b = 3;
                                            break;
                                        case "{\an4}":
                                            b = 1;
                                            break;
                                        case "{\an5}":
                                            b = 7;
                                            break;
                                        case "{\an6}":
                                            b = 4;
                                            break;
                                        case "{\an7}":
                                            b = 2;
                                            break;
                                        case "{\an8}":
                                            b = 8;
                                            break;
                                        case "{\an9}":
                                            b = 5;
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    int i7 = (b == 0 || b == 1 || b == 2) ? 0 : (b == 3 || b == 4 || b == 5) ? 2 : 1;
                                    switch (str) {
                                        case "{\an1}":
                                            b2 = 0;
                                            break;
                                        case "{\an2}":
                                            b2 = 1;
                                            break;
                                        case "{\an3}":
                                            b2 = 2;
                                            break;
                                        case "{\an4}":
                                            b2 = 6;
                                            break;
                                        case "{\an5}":
                                            b2 = 7;
                                            break;
                                        case "{\an6}":
                                            b2 = 8;
                                            break;
                                        case "{\an7}":
                                            b2 = 3;
                                            break;
                                        case "{\an8}":
                                            b2 = 4;
                                            break;
                                        case "{\an9}":
                                            b2 = 5;
                                            break;
                                        default:
                                            b2 = -1;
                                            break;
                                    }
                                    if (b2 == 0 || b2 == 1 || b2 == 2) {
                                        i2 = 2;
                                    } else {
                                        if (b2 != 3 && b2 != 4) {
                                            if (b2 != 5) {
                                                i2 = 1;
                                            }
                                        }
                                        i2 = 0;
                                    }
                                    if (i7 != 0) {
                                        i3 = 1;
                                        if (i7 != 1) {
                                            i4 = 2;
                                            if (i7 != 2) {
                                                throw new IllegalArgumentException();
                                            }
                                            f = 0.92f;
                                        } else {
                                            i4 = 2;
                                            f = 0.5f;
                                        }
                                    } else {
                                        i3 = 1;
                                        i4 = 2;
                                        f = 0.08f;
                                    }
                                    if (i2 == 0) {
                                        f2 = 0.08f;
                                    } else if (i2 == i3) {
                                        f2 = 0.5f;
                                    } else {
                                        if (i2 != i4) {
                                            throw new IllegalArgumentException();
                                        }
                                        f2 = 0.92f;
                                    }
                                    c2417Fk = new C2417Fk(spannedFromHtml, null, null, null, f2, 0, i2, f, i7, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, ViewCompat.MEASURED_STATE_MASK, Integer.MIN_VALUE, 0.0f);
                                }
                                arrayList.add(c2417Fk);
                                arrayList.add(C2417Fk.r);
                                jt = jt;
                            } else {
                                "Skipping invalid timing: ".concat(strG2);
                                AbstractC4038mJ.f();
                            }
                        }
                    } catch (NumberFormatException unused) {
                        "Skipping invalid index: ".concat(strG);
                        AbstractC4038mJ.f();
                    }
                }
            }
        }
        return new C3326e90(1, (C2417Fk[]) arrayList.toArray(new C2417Fk[0]), Arrays.copyOf((long[]) c2329Ca.b, c2329Ca.f2927a));
    }
}

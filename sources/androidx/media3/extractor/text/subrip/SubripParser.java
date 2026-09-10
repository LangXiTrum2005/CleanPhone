package androidx.media3.extractor.text.subrip;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.thinkup.core.common.om.n;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class SubripParser implements SubtitleParser {
    public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f7348e = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f7349a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7350b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ParsableByteArray f7351c = new ParsableByteArray();

    public static Cue d(Spanned spanned, String str) {
        byte b2;
        byte b3;
        float f;
        Cue.Builder builder = new Cue.Builder();
        builder.f5604a = spanned;
        if (str == null) {
            return builder.a();
        }
        switch (str) {
            case "{\an1}":
                b2 = 0;
                break;
            case "{\an2}":
                b2 = 6;
                break;
            case "{\an3}":
                b2 = 3;
                break;
            case "{\an4}":
                b2 = 1;
                break;
            case "{\an5}":
                b2 = 7;
                break;
            case "{\an6}":
                b2 = 4;
                break;
            case "{\an7}":
                b2 = 2;
                break;
            case "{\an8}":
                b2 = 8;
                break;
            case "{\an9}":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0 || b2 == 1 || b2 == 2) {
            builder.f5609i = 0;
        } else if (b2 == 3 || b2 == 4 || b2 == 5) {
            builder.f5609i = 2;
        } else {
            builder.f5609i = 1;
        }
        switch (str) {
            case "{\an1}":
                b3 = 0;
                break;
            case "{\an2}":
                b3 = 1;
                break;
            case "{\an3}":
                b3 = 2;
                break;
            case "{\an4}":
                b3 = 6;
                break;
            case "{\an5}":
                b3 = 7;
                break;
            case "{\an6}":
                b3 = 8;
                break;
            case "{\an7}":
                b3 = 3;
                break;
            case "{\an8}":
                b3 = 4;
                break;
            case "{\an9}":
                b3 = 5;
                break;
            default:
                b3 = -1;
                break;
        }
        if (b3 == 0 || b3 == 1 || b3 == 2) {
            builder.g = 2;
        } else if (b3 == 3 || b3 == 4 || b3 == 5) {
            builder.g = 0;
        } else {
            builder.g = 1;
        }
        int i2 = builder.f5609i;
        float f2 = 0.08f;
        if (i2 == 0) {
            f = 0.08f;
        } else if (i2 == 1) {
            f = 0.5f;
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException();
            }
            f = 0.92f;
        }
        builder.f5608h = f;
        int i3 = builder.g;
        if (i3 != 0) {
            if (i3 == 1) {
                f2 = 0.5f;
            } else {
                if (i3 != 2) {
                    throw new IllegalArgumentException();
                }
                f2 = 0.92f;
            }
        }
        builder.f5607e = f2;
        builder.f = 0;
        return builder.a();
    }

    public static long e(Matcher matcher, int i2) {
        String strGroup = matcher.group(i2 + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * n.m : 0L;
        String strGroup2 = matcher.group(i2 + 2);
        strGroup2.getClass();
        long j2 = (Long.parseLong(strGroup2) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) + j;
        String strGroup3 = matcher.group(i2 + 3);
        strGroup3.getClass();
        long j3 = (Long.parseLong(strGroup3) * 1000) + j2;
        String strGroup4 = matcher.group(i2 + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final void a(byte[] bArr, int i2, int i3, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        String str;
        SubripParser subripParser = this;
        ParsableByteArray parsableByteArray = subripParser.f7351c;
        parsableByteArray.E(bArr, i2 + i3);
        parsableByteArray.G(i2);
        Charset charsetC = parsableByteArray.C();
        if (charsetC == null) {
            charsetC = Charsets.f19705c;
        }
        long j = outputOptions.f7217a;
        long j2 = -9223372036854775807L;
        ArrayList arrayList = (j == -9223372036854775807L || !outputOptions.f7218b) ? null : new ArrayList();
        while (true) {
            String strH = parsableByteArray.h(charsetC);
            if (strH == null) {
                break;
            }
            if (strH.length() != 0) {
                try {
                    Integer.parseInt(strH);
                    String strH2 = parsableByteArray.h(charsetC);
                    if (strH2 == null) {
                        Log.g("SubripParser", "Unexpected end");
                        break;
                    }
                    Matcher matcher = d.matcher(strH2);
                    if (matcher.matches()) {
                        long jE = e(matcher, 1);
                        long jE2 = e(matcher, 6);
                        StringBuilder sb = subripParser.f7349a;
                        sb.setLength(0);
                        long j3 = j2;
                        ArrayList arrayList2 = subripParser.f7350b;
                        arrayList2.clear();
                        String strH3 = parsableByteArray.h(charsetC);
                        while (!TextUtils.isEmpty(strH3)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String strTrim = strH3.trim();
                            StringBuilder sb2 = new StringBuilder(strTrim);
                            Matcher matcher2 = f7348e.matcher(strTrim);
                            int i4 = 0;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList2.add(strGroup);
                                int iStart = matcher2.start() - i4;
                                int length = strGroup.length();
                                sb2.replace(iStart, iStart + length, "");
                                i4 += length;
                                j = j;
                            }
                            sb.append(sb2.toString());
                            strH3 = parsableByteArray.h(charsetC);
                            j = j;
                        }
                        long j4 = j;
                        Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                        int i5 = 0;
                        while (true) {
                            if (i5 >= arrayList2.size()) {
                                str = null;
                                break;
                            }
                            str = (String) arrayList2.get(i5);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        if (j4 == j3 || jE >= j4) {
                            consumer.accept(new CuesWithTiming(ImmutableList.z(d(spannedFromHtml, str)), jE, jE2 - jE));
                        } else if (arrayList != null) {
                            arrayList.add(new CuesWithTiming(ImmutableList.z(d(spannedFromHtml, str)), jE, jE2 - jE));
                        }
                        subripParser = this;
                        j2 = j3;
                        j = j4;
                    } else {
                        Log.g("SubripParser", "Skipping invalid timing: ".concat(strH2));
                        subripParser = this;
                    }
                } catch (NumberFormatException unused) {
                    Log.g("SubripParser", "Skipping invalid index: ".concat(strH));
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                consumer.accept((CuesWithTiming) it.next());
            }
        }
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final int c() {
        return 1;
    }
}

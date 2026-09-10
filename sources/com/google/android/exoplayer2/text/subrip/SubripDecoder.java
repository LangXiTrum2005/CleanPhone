package com.google.android.exoplayer2.text.subrip;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.base.Charsets;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.thinkup.core.common.om.n;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class SubripDecoder extends SimpleSubtitleDecoder {
    public static final Pattern q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern r = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f18588p;

    public SubripDecoder() {
        super("SubripDecoder");
        this.o = new StringBuilder();
        this.f18588p = new ArrayList();
    }

    public static long f(Matcher matcher, int i2) {
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

    /* JADX WARN: Code duplicated, block: B:135:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:137:0x01f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:141:0x0201  */
    /* JADX WARN: Code duplicated, block: B:142:0x0203  */
    /* JADX WARN: Code duplicated, block: B:145:0x020a  */
    /* JADX WARN: Code duplicated, block: B:147:0x020d  */
    /* JADX WARN: Code duplicated, block: B:149:0x0210  */
    /* JADX WARN: Code duplicated, block: B:152:0x0218  */
    /* JADX WARN: Code duplicated, block: B:165:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0212 A[SYNTHETIC] */
    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public final Subtitle e(byte[] bArr, int i2, boolean z2) {
        String str;
        byte b2;
        byte b3;
        int i3;
        int i4;
        float f;
        float f2;
        int i5;
        Cue cueA;
        SubripDecoder subripDecoder = this;
        ArrayList arrayList = new ArrayList();
        LongArray longArray = new LongArray();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i2);
        Charset charsetB = parsableByteArray.B();
        if (charsetB == null) {
            charsetB = Charsets.f19705c;
        }
        while (true) {
            String strH = parsableByteArray.h(charsetB);
            int i6 = 0;
            if (strH != null) {
                if (strH.length() != 0) {
                    try {
                        Integer.parseInt(strH);
                        String strH2 = parsableByteArray.h(charsetB);
                        if (strH2 == null) {
                            Log.g("SubripDecoder", "Unexpected end");
                        } else {
                            Matcher matcher = q.matcher(strH2);
                            if (matcher.matches()) {
                                longArray.a(f(matcher, 1));
                                longArray.a(f(matcher, 6));
                                StringBuilder sb = subripDecoder.o;
                                sb.setLength(0);
                                ArrayList arrayList2 = subripDecoder.f18588p;
                                arrayList2.clear();
                                String strH3 = parsableByteArray.h(charsetB);
                                while (!TextUtils.isEmpty(strH3)) {
                                    if (sb.length() > 0) {
                                        sb.append("<br>");
                                    }
                                    String strTrim = strH3.trim();
                                    StringBuilder sb2 = new StringBuilder(strTrim);
                                    Matcher matcher2 = r.matcher(strTrim);
                                    int i7 = i6;
                                    while (matcher2.find()) {
                                        String strGroup = matcher2.group();
                                        arrayList2.add(strGroup);
                                        int iStart = matcher2.start() - i7;
                                        int length = strGroup.length();
                                        sb2.replace(iStart, iStart + length, "");
                                        i7 += length;
                                    }
                                    sb.append(sb2.toString());
                                    strH3 = parsableByteArray.h(charsetB);
                                    i6 = 0;
                                }
                                Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                                int i8 = 0;
                                while (true) {
                                    if (i8 < arrayList2.size()) {
                                        str = (String) arrayList2.get(i8);
                                        if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                            i8++;
                                        }
                                    } else {
                                        str = null;
                                    }
                                }
                                Cue.Builder builder = new Cue.Builder();
                                builder.f18454a = spannedFromHtml;
                                if (str == null) {
                                    cueA = builder.a();
                                } else {
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
                                        builder.f18459i = 0;
                                    } else if (b2 == 3 || b2 == 4 || b2 == 5) {
                                        builder.f18459i = 2;
                                    } else {
                                        builder.f18459i = 1;
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
                                    if (b3 == 0 || b3 == 1) {
                                        i3 = 2;
                                    } else {
                                        if (b3 != 2) {
                                            if (b3 == 3 || b3 == 4 || b3 == 5) {
                                                builder.g = 0;
                                            } else {
                                                builder.g = 1;
                                            }
                                            i3 = 2;
                                        } else {
                                            i3 = 2;
                                        }
                                        i4 = builder.f18459i;
                                        f = 0.08f;
                                        if (i4 != 0) {
                                            f2 = 0.08f;
                                        } else if (i4 != 1) {
                                            f2 = 0.5f;
                                        } else {
                                            if (i4 == i3) {
                                                throw new IllegalArgumentException();
                                            }
                                            f2 = 0.92f;
                                        }
                                        builder.f18458h = f2;
                                        i5 = builder.g;
                                        if (i5 != 0) {
                                            if (i5 != 1) {
                                                f = 0.5f;
                                            } else {
                                                if (i5 == 2) {
                                                    throw new IllegalArgumentException();
                                                }
                                                f = 0.92f;
                                            }
                                        }
                                        builder.f18457e = f;
                                        builder.f = 0;
                                        cueA = builder.a();
                                    }
                                    builder.g = i3;
                                    i4 = builder.f18459i;
                                    f = 0.08f;
                                    if (i4 != 0) {
                                        f2 = 0.08f;
                                    } else if (i4 != 1) {
                                        f2 = 0.5f;
                                    } else {
                                        if (i4 == i3) {
                                            throw new IllegalArgumentException();
                                        }
                                        f2 = 0.92f;
                                    }
                                    builder.f18458h = f2;
                                    i5 = builder.g;
                                    if (i5 != 0) {
                                        if (i5 != 1) {
                                            f = 0.5f;
                                        } else {
                                            if (i5 == 2) {
                                                throw new IllegalArgumentException();
                                            }
                                            f = 0.92f;
                                        }
                                    }
                                    builder.f18457e = f;
                                    builder.f = 0;
                                    cueA = builder.a();
                                }
                                arrayList.add(cueA);
                                arrayList.add(Cue.s0);
                                subripDecoder = this;
                                parsableByteArray = parsableByteArray;
                                charsetB = charsetB;
                            } else {
                                Log.g("SubripDecoder", "Skipping invalid timing: ".concat(strH2));
                                subripDecoder = this;
                            }
                        }
                    } catch (NumberFormatException unused) {
                        Log.g("SubripDecoder", "Skipping invalid index: ".concat(strH));
                    }
                }
            }
        }
        return new SubripSubtitle((Cue[]) arrayList.toArray(new Cue[0]), Arrays.copyOf(longArray.f18923b, longArray.f18922a));
    }
}

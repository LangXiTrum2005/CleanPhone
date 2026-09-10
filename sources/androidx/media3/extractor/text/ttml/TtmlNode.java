package androidx.media3.extractor.text.ttml;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.HorizontalTextInVerticalContextSpan;
import androidx.media3.common.text.RubySpan;
import androidx.media3.common.text.SpanUtil;
import androidx.media3.common.text.TextEmphasisSpan;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
final class TtmlNode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7359c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7360e;
    public final TtmlStyle f;
    public final String[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f7361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f7362i;
    public final TtmlNode j;
    public final HashMap k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f7363l;
    public ArrayList m;

    public TtmlNode(String str, String str2, long j, long j2, TtmlStyle ttmlStyle, String[] strArr, String str3, String str4, TtmlNode ttmlNode) {
        this.f7357a = str;
        this.f7358b = str2;
        this.f7362i = str4;
        this.f = ttmlStyle;
        this.g = strArr;
        this.f7359c = str2 != null;
        this.d = j;
        this.f7360e = j2;
        str3.getClass();
        this.f7361h = str3;
        this.j = ttmlNode;
        this.k = new HashMap();
        this.f7363l = new HashMap();
    }

    public static TtmlNode a(String str) {
        return new TtmlNode(null, str.replaceAll(IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX).replaceAll(" *\n *", IOUtils.LINE_SEPARATOR_UNIX).replaceAll(IOUtils.LINE_SEPARATOR_UNIX, " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            Cue.Builder builder = new Cue.Builder();
            builder.f5604a = new SpannableStringBuilder();
            treeMap.put(str, builder);
        }
        CharSequence charSequence = ((Cue.Builder) treeMap.get(str)).f5604a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final TtmlNode b(int i2) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (TtmlNode) arrayList.get(i2);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z2) {
        String str = this.f7357a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_DIV.equals(str);
        if (z2 || zEquals || (zEquals2 && this.f7362i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f7360e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            ((TtmlNode) this.m.get(i2)).d(treeSet, z2 || zEquals);
        }
    }

    public final boolean f(long j) {
        long j2 = this.d;
        long j3 = this.f7360e;
        if (j2 == -9223372036854775807L && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 <= j && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= j3) {
            return j2 <= j && j < j3;
        }
        return true;
    }

    public final void g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f7361h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j) && com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_DIV.equals(this.f7357a) && (str2 = this.f7362i) != null) {
            a.z(str, str2, arrayList);
            return;
        }
        for (int i2 = 0; i2 < c(); i2++) {
            b(i2).g(j, str, arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0215  */
    /* JADX WARN: Code duplicated, block: B:146:0x0223  */
    /* JADX WARN: Code duplicated, block: B:148:0x0226  */
    /* JADX WARN: Code duplicated, block: B:150:0x0229  */
    /* JADX WARN: Code duplicated, block: B:151:0x022f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0240  */
    /* JADX WARN: Code duplicated, block: B:166:0x0270  */
    /* JADX WARN: Code duplicated, block: B:169:0x0288  */
    /* JADX WARN: Code duplicated, block: B:170:0x0297  */
    /* JADX WARN: Code duplicated, block: B:173:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:175:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:178:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:181:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:194:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b9  */
    public final void h(long j, Map map, HashMap map2, String str, TreeMap treeMap) {
        Iterator it;
        int i2;
        TtmlNode ttmlNode;
        int i3;
        int i4;
        TtmlStyle ttmlStyleA;
        int i5;
        float f;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        float sizeChange;
        RelativeSizeSpan[] relativeSizeSpanArr;
        int length;
        int i6;
        RelativeSizeSpan relativeSizeSpan;
        int i7;
        int i8;
        int i9;
        int i10;
        byte b2 = -1;
        int i11 = 1;
        if (f(j)) {
            String str2 = this.f7361h;
            String str3 = "".equals(str2) ? str : str2;
            Iterator it2 = this.f7363l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap map3 = this.k;
                int iIntValue = map3.containsKey(str4) ? ((Integer) map3.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    Cue.Builder builder = (Cue.Builder) treeMap.get(str4);
                    builder.getClass();
                    TtmlRegion ttmlRegion = (TtmlRegion) map2.get(str3);
                    ttmlRegion.getClass();
                    TtmlStyle ttmlStyleA2 = TtmlRenderUtil.a(this.f, this.g, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) builder.f5604a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        builder.f5604a = spannableStringBuilder;
                    }
                    if (ttmlStyleA2 != null) {
                        int i12 = ttmlStyleA2.f7385h;
                        if (((i12 == b2 && ttmlStyleA2.f7386i == b2) ? b2 : (i12 == i11 ? i11 : 0) | (ttmlStyleA2.f7386i == i11 ? 2 : 0)) != b2) {
                            int i13 = ttmlStyleA2.f7385h;
                            if (i13 != b2) {
                                if (i13 == i11) {
                                    i8 = i11;
                                } else {
                                    i8 = 0;
                                }
                                if (ttmlStyleA2.f7386i == i11) {
                                    i9 = 2;
                                } else {
                                    i9 = 0;
                                }
                                i10 = i8 | i9;
                            } else if (ttmlStyleA2.f7386i == b2) {
                                i10 = b2;
                                i11 = 1;
                            } else {
                                i11 = 1;
                                if (i13 == i11) {
                                    i8 = i11;
                                } else {
                                    i8 = 0;
                                }
                                if (ttmlStyleA2.f7386i == i11) {
                                    i9 = 2;
                                } else {
                                    i9 = 0;
                                }
                                i10 = i8 | i9;
                            }
                            StyleSpan styleSpan = new StyleSpan(i10);
                            i2 = 33;
                            spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                        } else {
                            i2 = 33;
                        }
                        if (ttmlStyleA2.f == i11) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i2);
                        }
                        if (ttmlStyleA2.g == i11) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i2);
                        }
                        if (ttmlStyleA2.f7383c) {
                            if (!ttmlStyleA2.f7383c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            SpanUtil.a(spannableStringBuilder, new ForegroundColorSpan(ttmlStyleA2.f7382b), iIntValue, iIntValue2);
                        }
                        if (ttmlStyleA2.f7384e) {
                            if (!ttmlStyleA2.f7384e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            SpanUtil.a(spannableStringBuilder, new BackgroundColorSpan(ttmlStyleA2.d), iIntValue, iIntValue2);
                        }
                        if (ttmlStyleA2.f7381a != null) {
                            SpanUtil.a(spannableStringBuilder, new TypefaceSpan(ttmlStyleA2.f7381a), iIntValue, iIntValue2);
                        }
                        TextEmphasis textEmphasis = ttmlStyleA2.r;
                        if (textEmphasis != null) {
                            int i14 = textEmphasis.f7354a;
                            if (i14 == b2) {
                                int i15 = ttmlRegion.j;
                                i14 = (i15 == 2 || i15 == 1) ? 3 : 1;
                                i7 = 1;
                            } else {
                                i7 = textEmphasis.f7355b;
                            }
                            int i16 = textEmphasis.f7356c;
                            if (i16 == -2) {
                                i16 = 1;
                            }
                            SpanUtil.a(spannableStringBuilder, new TextEmphasisSpan(i14, i7, i16), iIntValue, iIntValue2);
                        }
                        int i17 = ttmlStyleA2.m;
                        if (i17 == 2) {
                            TtmlNode ttmlNode2 = this.j;
                            while (true) {
                                if (ttmlNode2 == null) {
                                    ttmlNode2 = null;
                                    break;
                                }
                                TtmlStyle ttmlStyleA3 = TtmlRenderUtil.a(ttmlNode2.f, ttmlNode2.g, map);
                                if (ttmlStyleA3 != null && ttmlStyleA3.m == 1) {
                                    break;
                                } else {
                                    ttmlNode2 = ttmlNode2.j;
                                }
                            }
                            if (ttmlNode2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(ttmlNode2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        ttmlNode = null;
                                        break;
                                    }
                                    TtmlNode ttmlNode3 = (TtmlNode) arrayDeque.pop();
                                    TtmlStyle ttmlStyleA4 = TtmlRenderUtil.a(ttmlNode3.f, ttmlNode3.g, map);
                                    if (ttmlStyleA4 != null && ttmlStyleA4.m == 3) {
                                        ttmlNode = ttmlNode3;
                                        break;
                                    }
                                    for (int iC = ttmlNode3.c() - 1; iC >= 0; iC--) {
                                        arrayDeque.push(ttmlNode3.b(iC));
                                    }
                                }
                                if (ttmlNode != null) {
                                    if (ttmlNode.c() != 1 || ttmlNode.b(0).f7358b == null) {
                                        Log.f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = ttmlNode.b(0).f7358b;
                                        int i18 = Util.f5683a;
                                        TtmlStyle ttmlStyleA5 = TtmlRenderUtil.a(ttmlNode.f, ttmlNode.g, map);
                                        if (ttmlStyleA5 != null) {
                                            i3 = ttmlStyleA5.f7388n;
                                            i4 = b2;
                                        } else {
                                            i3 = b2;
                                            i4 = i3;
                                        }
                                        if (i3 == i4 && (ttmlStyleA = TtmlRenderUtil.a(ttmlNode2.f, ttmlNode2.g, map)) != null) {
                                            i3 = ttmlStyleA.f7388n;
                                        }
                                        spannableStringBuilder.setSpan(new RubySpan(str5, i3), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                            if (ttmlStyleA2.q == 1) {
                                SpanUtil.a(spannableStringBuilder, new HorizontalTextInVerticalContextSpan(), iIntValue, iIntValue2);
                            }
                            i5 = ttmlStyleA2.j;
                            if (i5 != 1) {
                                it = it2;
                                SpanUtil.a(spannableStringBuilder, new AbsoluteSizeSpan((int) ttmlStyleA2.k, true), iIntValue, iIntValue2);
                            } else if (i5 != 2) {
                                it = it2;
                                SpanUtil.a(spannableStringBuilder, new RelativeSizeSpan(ttmlStyleA2.k), iIntValue, iIntValue2);
                            } else if (i5 != 3) {
                                it = it2;
                            } else {
                                sizeChange = ttmlStyleA2.k / 100.0f;
                                relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                length = relativeSizeSpanArr.length;
                                i6 = 0;
                                while (i6 < length) {
                                    relativeSizeSpan = relativeSizeSpanArr[i6];
                                    Iterator it3 = it2;
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                        sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                    }
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) != iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) == iIntValue2) {
                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                        }
                                    }
                                    i6++;
                                    it2 = it3;
                                }
                                it = it2;
                                spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                            }
                            if ("p".equals(this.f7357a)) {
                                f = ttmlStyleA2.s;
                                if (f != Float.MAX_VALUE) {
                                    builder.q = (f * (-90.0f)) / 100.0f;
                                }
                                alignment = ttmlStyleA2.o;
                                if (alignment != null) {
                                    builder.f5606c = alignment;
                                }
                                alignment2 = ttmlStyleA2.f7389p;
                                if (alignment2 != null) {
                                    builder.d = alignment2;
                                }
                            }
                        } else if (i17 == 3 || i17 == 4) {
                            spannableStringBuilder.setSpan(new DeleteTextSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (ttmlStyleA2.q == 1) {
                            SpanUtil.a(spannableStringBuilder, new HorizontalTextInVerticalContextSpan(), iIntValue, iIntValue2);
                        }
                        i5 = ttmlStyleA2.j;
                        if (i5 != 1) {
                            it = it2;
                            SpanUtil.a(spannableStringBuilder, new AbsoluteSizeSpan((int) ttmlStyleA2.k, true), iIntValue, iIntValue2);
                        } else if (i5 != 2) {
                            it = it2;
                            SpanUtil.a(spannableStringBuilder, new RelativeSizeSpan(ttmlStyleA2.k), iIntValue, iIntValue2);
                        } else if (i5 != 3) {
                            it = it2;
                        } else {
                            sizeChange = ttmlStyleA2.k / 100.0f;
                            relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                            length = relativeSizeSpanArr.length;
                            i6 = 0;
                            while (i6 < length) {
                                relativeSizeSpan = relativeSizeSpanArr[i6];
                                Iterator it4 = it2;
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue) {
                                    sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                }
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) != iIntValue) {
                                }
                                i6++;
                                it2 = it4;
                            }
                            it = it2;
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                        }
                        if ("p".equals(this.f7357a)) {
                            f = ttmlStyleA2.s;
                            if (f != Float.MAX_VALUE) {
                                builder.q = (f * (-90.0f)) / 100.0f;
                            }
                            alignment = ttmlStyleA2.o;
                            if (alignment != null) {
                                builder.f5606c = alignment;
                            }
                            alignment2 = ttmlStyleA2.f7389p;
                            if (alignment2 != null) {
                                builder.d = alignment2;
                            }
                        }
                    }
                    it2 = it;
                    b2 = -1;
                    i11 = 1;
                }
                it = it2;
                it2 = it;
                b2 = -1;
                i11 = 1;
            }
            for (int i19 = 0; i19 < c(); i19++) {
                b(i19).h(j, map, map2, str3, treeMap);
            }
        }
    }

    public final void i(long j, boolean z2, String str, TreeMap treeMap) {
        HashMap map = this.k;
        map.clear();
        HashMap map2 = this.f7363l;
        map2.clear();
        String str2 = this.f7357a;
        if (com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA.equals(str2)) {
            return;
        }
        String str3 = this.f7361h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f7359c && z2) {
            SpannableStringBuilder spannableStringBuilderE = e(str4, treeMap);
            String str5 = this.f7358b;
            str5.getClass();
            spannableStringBuilderE.append((CharSequence) str5);
            return;
        }
        if (com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_BR.equals(str2) && z2) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((Cue.Builder) entry.getValue()).f5604a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i2 = 0; i2 < c(); i2++) {
                b(i2).i(j, z2 || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderE2 = e(str4, treeMap);
                int length = spannableStringBuilderE2.length() - 1;
                while (length >= 0 && spannableStringBuilderE2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderE2.charAt(length) != '\n') {
                    spannableStringBuilderE2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((Cue.Builder) entry2.getValue()).f5604a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}

package com.google.android.exoplayer2.text.ttml;

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
import androidx.media3.extractor.text.ttml.a;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.span.HorizontalTextInVerticalContextSpan;
import com.google.android.exoplayer2.text.span.RubySpan;
import com.google.android.exoplayer2.text.span.SpanUtil;
import com.google.android.exoplayer2.text.span.TextEmphasisSpan;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
final class TtmlNode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18605c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18606e;
    public final TtmlStyle f;
    public final String[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f18607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f18608i;
    public final TtmlNode j;
    public final HashMap k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f18609l;
    public ArrayList m;

    public TtmlNode(String str, String str2, long j, long j2, TtmlStyle ttmlStyle, String[] strArr, String str3, String str4, TtmlNode ttmlNode) {
        this.f18603a = str;
        this.f18604b = str2;
        this.f18608i = str4;
        this.f = ttmlStyle;
        this.g = strArr;
        this.f18605c = str2 != null;
        this.d = j;
        this.f18606e = j2;
        str3.getClass();
        this.f18607h = str3;
        this.j = ttmlNode;
        this.k = new HashMap();
        this.f18609l = new HashMap();
    }

    public static TtmlNode a(String str) {
        return new TtmlNode(null, str.replaceAll(IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX).replaceAll(" *\n *", IOUtils.LINE_SEPARATOR_UNIX).replaceAll(IOUtils.LINE_SEPARATOR_UNIX, " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            Cue.Builder builder = new Cue.Builder();
            builder.f18454a = new SpannableStringBuilder();
            treeMap.put(str, builder);
        }
        CharSequence charSequence = ((Cue.Builder) treeMap.get(str)).f18454a;
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
        String str = this.f18603a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_DIV.equals(str);
        if (z2 || zEquals || (zEquals2 && this.f18608i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f18606e;
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
        long j3 = this.f18606e;
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
        String str3 = this.f18607h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j) && com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_DIV.equals(this.f18603a) && (str2 = this.f18608i) != null) {
            a.z(str, str2, arrayList);
            return;
        }
        for (int i2 = 0; i2 < c(); i2++) {
            b(i2).g(j, str, arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0204  */
    /* JADX WARN: Code duplicated, block: B:134:0x0206  */
    /* JADX WARN: Code duplicated, block: B:136:0x0209  */
    /* JADX WARN: Code duplicated, block: B:139:0x0218  */
    /* JADX WARN: Code duplicated, block: B:141:0x021b  */
    /* JADX WARN: Code duplicated, block: B:144:0x021f  */
    /* JADX WARN: Code duplicated, block: B:145:0x022b  */
    /* JADX WARN: Code duplicated, block: B:146:0x0236  */
    /* JADX WARN: Code duplicated, block: B:149:0x024c  */
    /* JADX WARN: Code duplicated, block: B:151:0x0255  */
    /* JADX WARN: Code duplicated, block: B:154:0x025f  */
    /* JADX WARN: Code duplicated, block: B:157:0x0265  */
    /* JADX WARN: Code duplicated, block: B:170:0x026d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x026d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b9  */
    public final void h(long j, Map map, HashMap map2, String str, TreeMap treeMap) {
        int i2;
        int i3;
        int i4;
        TtmlNode ttmlNode;
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        float f;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i7;
        int i8;
        int i9;
        Map map3 = map;
        int i10 = -1;
        int i11 = 1;
        if (f(j)) {
            String str2 = this.f18607h;
            String str3 = "".equals(str2) ? str : str2;
            for (Map.Entry entry : this.f18609l.entrySet()) {
                String str4 = (String) entry.getKey();
                HashMap map4 = this.k;
                int iIntValue = map4.containsKey(str4) ? ((Integer) map4.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    Cue.Builder builder = (Cue.Builder) treeMap.get(str4);
                    builder.getClass();
                    TtmlRegion ttmlRegion = (TtmlRegion) map2.get(str3);
                    ttmlRegion.getClass();
                    TtmlStyle ttmlStyleA = TtmlRenderUtil.a(this.f, this.g, map3);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) builder.f18454a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        builder.f18454a = spannableStringBuilder;
                    }
                    if (ttmlStyleA != null) {
                        int i12 = ttmlStyleA.f18620h;
                        if (((i12 == i10 && ttmlStyleA.f18621i == i10) ? i10 : (i12 == i11 ? i11 : 0) | (ttmlStyleA.f18621i == i11 ? 2 : 0)) != i10) {
                            int i13 = ttmlStyleA.f18620h;
                            if (i13 != i10) {
                                if (i13 == i11) {
                                    i7 = i11;
                                } else {
                                    i7 = 0;
                                }
                                if (ttmlStyleA.f18621i == i11) {
                                    i8 = 2;
                                } else {
                                    i8 = 0;
                                }
                                i9 = i7 | i8;
                            } else if (ttmlStyleA.f18621i == i10) {
                                i9 = i10;
                                i11 = 1;
                            } else {
                                i11 = 1;
                                if (i13 == i11) {
                                    i7 = i11;
                                } else {
                                    i7 = 0;
                                }
                                if (ttmlStyleA.f18621i == i11) {
                                    i8 = 2;
                                } else {
                                    i8 = 0;
                                }
                                i9 = i7 | i8;
                            }
                            StyleSpan styleSpan = new StyleSpan(i9);
                            i3 = 33;
                            spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                        } else {
                            i3 = 33;
                        }
                        if (ttmlStyleA.f == i11) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i3);
                        }
                        if (ttmlStyleA.g == i11) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i3);
                        }
                        if (ttmlStyleA.f18618c) {
                            if (!ttmlStyleA.f18618c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            SpanUtil.a(spannableStringBuilder, new ForegroundColorSpan(ttmlStyleA.f18617b), iIntValue, iIntValue2);
                        }
                        if (ttmlStyleA.f18619e) {
                            if (!ttmlStyleA.f18619e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            SpanUtil.a(spannableStringBuilder, new BackgroundColorSpan(ttmlStyleA.d), iIntValue, iIntValue2);
                        }
                        if (ttmlStyleA.f18616a != null) {
                            SpanUtil.a(spannableStringBuilder, new TypefaceSpan(ttmlStyleA.f18616a), iIntValue, iIntValue2);
                        }
                        TextEmphasis textEmphasis = ttmlStyleA.r;
                        if (textEmphasis != null) {
                            if (textEmphasis.f18593a == i10 && ttmlRegion.j != 2) {
                            }
                            SpanUtil.a(spannableStringBuilder, new TextEmphasisSpan(), iIntValue, iIntValue2);
                        }
                        int i14 = ttmlStyleA.m;
                        if (i14 == 2) {
                            TtmlNode ttmlNode2 = this.j;
                            while (true) {
                                if (ttmlNode2 == null) {
                                    ttmlNode2 = null;
                                    break;
                                }
                                TtmlStyle ttmlStyleA2 = TtmlRenderUtil.a(ttmlNode2.f, ttmlNode2.g, map3);
                                if (ttmlStyleA2 != null && ttmlStyleA2.m == 1) {
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
                                        i4 = i10;
                                        ttmlNode = null;
                                        break;
                                    }
                                    TtmlNode ttmlNode3 = (TtmlNode) arrayDeque.pop();
                                    i4 = i10;
                                    TtmlStyle ttmlStyleA3 = TtmlRenderUtil.a(ttmlNode3.f, ttmlNode3.g, map3);
                                    if (ttmlStyleA3 != null && ttmlStyleA3.m == 3) {
                                        ttmlNode = ttmlNode3;
                                        break;
                                    }
                                    for (int iC = ttmlNode3.c() - 1; iC >= 0; iC--) {
                                        arrayDeque.push(ttmlNode3.b(iC));
                                    }
                                    i10 = i4;
                                }
                                if (ttmlNode == null) {
                                    i2 = i4;
                                } else {
                                    if (ttmlNode.c() == 1) {
                                        z2 = false;
                                        if (ttmlNode.b(0).f18604b != null) {
                                            String str5 = ttmlNode.b(0).f18604b;
                                            int i15 = Util.f18979a;
                                            TtmlStyle ttmlStyleA4 = TtmlRenderUtil.a(ttmlNode.f, ttmlNode.g, map3);
                                            if (ttmlStyleA4 != null) {
                                                i5 = ttmlStyleA4.f18623n;
                                                i2 = i4;
                                            } else {
                                                i5 = i4;
                                                i2 = i5;
                                            }
                                            if (i5 == i2) {
                                                TtmlRenderUtil.a(ttmlNode2.f, ttmlNode2.g, map3);
                                            }
                                            spannableStringBuilder.setSpan(new RubySpan(), iIntValue, iIntValue2, 33);
                                        }
                                    } else {
                                        z2 = false;
                                    }
                                    i2 = i4;
                                    Log.f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                }
                                if (ttmlStyleA.q == 1) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if (z3) {
                                    SpanUtil.a(spannableStringBuilder, new HorizontalTextInVerticalContextSpan(), iIntValue, iIntValue2);
                                }
                                i6 = ttmlStyleA.j;
                                if (i6 == 1) {
                                    SpanUtil.a(spannableStringBuilder, new AbsoluteSizeSpan((int) ttmlStyleA.k, true), iIntValue, iIntValue2);
                                } else if (i6 == 2) {
                                    SpanUtil.a(spannableStringBuilder, new RelativeSizeSpan(ttmlStyleA.k), iIntValue, iIntValue2);
                                } else if (i6 == 3) {
                                    SpanUtil.a(spannableStringBuilder, new RelativeSizeSpan(ttmlStyleA.k / 100.0f), iIntValue, iIntValue2);
                                }
                                if ("p".equals(this.f18603a)) {
                                    f = ttmlStyleA.s;
                                    if (f != Float.MAX_VALUE) {
                                        builder.q = (f * (-90.0f)) / 100.0f;
                                    }
                                    alignment = ttmlStyleA.o;
                                    if (alignment != null) {
                                        builder.f18456c = alignment;
                                    }
                                    alignment2 = ttmlStyleA.f18624p;
                                    if (alignment2 != null) {
                                        builder.d = alignment2;
                                    }
                                }
                            }
                            z2 = false;
                            if (ttmlStyleA.q == 1) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (z3) {
                                SpanUtil.a(spannableStringBuilder, new HorizontalTextInVerticalContextSpan(), iIntValue, iIntValue2);
                            }
                            i6 = ttmlStyleA.j;
                            if (i6 == 1) {
                                SpanUtil.a(spannableStringBuilder, new AbsoluteSizeSpan((int) ttmlStyleA.k, true), iIntValue, iIntValue2);
                            } else if (i6 == 2) {
                                SpanUtil.a(spannableStringBuilder, new RelativeSizeSpan(ttmlStyleA.k), iIntValue, iIntValue2);
                            } else if (i6 == 3) {
                                SpanUtil.a(spannableStringBuilder, new RelativeSizeSpan(ttmlStyleA.k / 100.0f), iIntValue, iIntValue2);
                            }
                            if ("p".equals(this.f18603a)) {
                                f = ttmlStyleA.s;
                                if (f != Float.MAX_VALUE) {
                                    builder.q = (f * (-90.0f)) / 100.0f;
                                }
                                alignment = ttmlStyleA.o;
                                if (alignment != null) {
                                    builder.f18456c = alignment;
                                }
                                alignment2 = ttmlStyleA.f18624p;
                                if (alignment2 != null) {
                                    builder.d = alignment2;
                                }
                            }
                        } else if (i14 == 3 || i14 == 4) {
                            spannableStringBuilder.setSpan(new DeleteTextSpan(), iIntValue, iIntValue2, 33);
                        }
                        i2 = i10;
                        z2 = false;
                        if (ttmlStyleA.q == 1) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (z3) {
                            SpanUtil.a(spannableStringBuilder, new HorizontalTextInVerticalContextSpan(), iIntValue, iIntValue2);
                        }
                        i6 = ttmlStyleA.j;
                        if (i6 == 1) {
                            SpanUtil.a(spannableStringBuilder, new AbsoluteSizeSpan((int) ttmlStyleA.k, true), iIntValue, iIntValue2);
                        } else if (i6 == 2) {
                            SpanUtil.a(spannableStringBuilder, new RelativeSizeSpan(ttmlStyleA.k), iIntValue, iIntValue2);
                        } else if (i6 == 3) {
                            SpanUtil.a(spannableStringBuilder, new RelativeSizeSpan(ttmlStyleA.k / 100.0f), iIntValue, iIntValue2);
                        }
                        if ("p".equals(this.f18603a)) {
                            f = ttmlStyleA.s;
                            if (f != Float.MAX_VALUE) {
                                builder.q = (f * (-90.0f)) / 100.0f;
                            }
                            alignment = ttmlStyleA.o;
                            if (alignment != null) {
                                builder.f18456c = alignment;
                            }
                            alignment2 = ttmlStyleA.f18624p;
                            if (alignment2 != null) {
                                builder.d = alignment2;
                            }
                        }
                    }
                    i10 = i2;
                    i11 = 1;
                }
                i2 = i10;
                i10 = i2;
                i11 = 1;
            }
            int i16 = 0;
            while (i16 < c()) {
                b(i16).h(j, map3, map2, str3, treeMap);
                i16++;
                map3 = map;
            }
        }
    }

    public final void i(long j, boolean z2, String str, TreeMap treeMap) {
        HashMap map = this.k;
        map.clear();
        HashMap map2 = this.f18609l;
        map2.clear();
        String str2 = this.f18603a;
        if (com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA.equals(str2)) {
            return;
        }
        String str3 = this.f18607h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f18605c && z2) {
            SpannableStringBuilder spannableStringBuilderE = e(str4, treeMap);
            String str5 = this.f18604b;
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
                CharSequence charSequence = ((Cue.Builder) entry.getValue()).f18454a;
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
                CharSequence charSequence2 = ((Cue.Builder) entry2.getValue()).f18454a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}

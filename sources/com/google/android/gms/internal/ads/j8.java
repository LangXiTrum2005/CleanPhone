package com.google.android.gms.internal.ads;

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
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f16013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n8 f16014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f16015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f16016h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f16017i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j8 f16018j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f16019k;
    public final HashMap l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f16020m;

    public j8(String str, String str2, long j10, long j11, n8 n8Var, String[] strArr, String str3, String str4, j8 j8Var) {
        this.f16009a = str;
        this.f16010b = str2;
        this.f16017i = str4;
        this.f16014f = n8Var;
        this.f16015g = strArr;
        this.f16011c = str2 != null;
        this.f16012d = j10;
        this.f16013e = j11;
        str3.getClass();
        this.f16016h = str3;
        this.f16018j = j8Var;
        this.f16019k = new HashMap();
        this.l = new HashMap();
    }

    public static j8 a(String str) {
        return new j8(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), C.TIME_UNSET, C.TIME_UNSET, null, null, "", null, null);
    }

    public static j8 b(String str, long j10, long j11, n8 n8Var, String[] strArr, String str2, String str3, j8 j8Var) {
        return new j8(str, null, j10, j11, n8Var, strArr, str2, str3, j8Var);
    }

    public static SpannableStringBuilder i(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            z70 z70Var = new z70();
            z70Var.f22533a = new SpannableStringBuilder();
            z70Var.f22534b = null;
            treeMap.put(str, z70Var);
        }
        CharSequence charSequence = ((z70) treeMap.get(str)).f22533a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final boolean c(long j10) {
        long j11 = this.f16012d;
        long j12 = this.f16013e;
        if (j11 == C.TIME_UNSET) {
            if (j12 == C.TIME_UNSET) {
                return true;
            }
            j11 = -9223372036854775807L;
        }
        if (j11 <= j10 && j12 == C.TIME_UNSET) {
            return true;
        }
        if (j11 != C.TIME_UNSET || j10 >= j12) {
            return j11 <= j10 && j10 < j12;
        }
        return true;
    }

    public final j8 d(int i10) {
        ArrayList arrayList = this.f16020m;
        if (arrayList != null) {
            return (j8) arrayList.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int e() {
        ArrayList arrayList = this.f16020m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void f(TreeSet treeSet, boolean z10) {
        String str = this.f16009a;
        boolean zEquals = TtmlNode.TAG_P.equals(str);
        if (z10 || zEquals || (TtmlNode.TAG_DIV.equals(str) && this.f16017i != null)) {
            long j10 = this.f16012d;
            if (j10 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f16013e;
            if (j11 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f16020m != null) {
            for (int i10 = 0; i10 < this.f16020m.size(); i10++) {
                j8 j8Var = (j8) this.f16020m.get(i10);
                boolean z11 = true;
                if (!z10 && !zEquals) {
                    z11 = false;
                }
                j8Var.f(treeSet, z11);
            }
        }
    }

    public final void g(long j10, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f16016h;
        boolean zEquals = "".equals(str3);
        boolean zC = c(j10);
        if (true != zEquals) {
            str = str3;
        }
        if (zC && TtmlNode.TAG_DIV.equals(this.f16009a) && (str2 = this.f16017i) != null) {
            l1.d.n(str, str2, arrayList);
            return;
        }
        for (int i10 = 0; i10 < e(); i10++) {
            d(i10).g(j10, str, arrayList);
        }
    }

    public final void h(long j10, boolean z10, String str, TreeMap treeMap) {
        HashMap map = this.f16019k;
        map.clear();
        HashMap map2 = this.l;
        map2.clear();
        String str2 = this.f16009a;
        if (TtmlNode.TAG_METADATA.equals(str2)) {
            return;
        }
        String str3 = this.f16016h;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.f16011c && z10) {
            SpannableStringBuilder spannableStringBuilderI = i(str4, treeMap);
            String str5 = this.f16010b;
            str5.getClass();
            spannableStringBuilderI.append((CharSequence) str5);
            return;
        }
        if (TtmlNode.TAG_BR.equals(str2) && z10) {
            i(str4, treeMap).append('\n');
            return;
        }
        if (c(j10)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((z70) entry.getValue()).f22533a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = TtmlNode.TAG_P.equals(str2);
            for (int i10 = 0; i10 < e(); i10++) {
                d(i10).h(j10, z10 || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderI2 = i(str4, treeMap);
                int length = spannableStringBuilderI2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderI2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderI2.charAt(length) != '\n') {
                    spannableStringBuilderI2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((z70) entry2.getValue()).f22533a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:139:0x0211  */
    /* JADX WARN: Code duplicated, block: B:142:0x021f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0222  */
    /* JADX WARN: Code duplicated, block: B:146:0x0225  */
    /* JADX WARN: Code duplicated, block: B:148:0x022c  */
    /* JADX WARN: Code duplicated, block: B:150:0x023a  */
    /* JADX WARN: Code duplicated, block: B:162:0x026c  */
    /* JADX WARN: Code duplicated, block: B:165:0x0286  */
    /* JADX WARN: Code duplicated, block: B:166:0x0295  */
    /* JADX WARN: Code duplicated, block: B:169:0x02af  */
    /* JADX WARN: Code duplicated, block: B:171:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:174:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:177:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00be  */
    public final void j(long j10, Map map, HashMap map2, String str, TreeMap treeMap) {
        int i10;
        j8 j8Var;
        int i11;
        int i12;
        int i13;
        n8 n8VarD;
        int i14;
        float f10;
        Iterator it;
        float f11;
        int i15;
        float f12;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        float sizeChange;
        RelativeSizeSpan[] relativeSizeSpanArr;
        int length;
        RelativeSizeSpan relativeSizeSpan;
        float f13;
        int i16;
        int i17;
        int i18;
        int i19;
        Map map3 = map;
        if (c(j10)) {
            String str2 = this.f16016h;
            int i20 = 1;
            String str3 = true != "".equals(str2) ? str2 : str;
            Iterator it2 = this.l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap map4 = this.f16019k;
                int iIntValue = map4.containsKey(str4) ? ((Integer) map4.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    z70 z70Var = (z70) treeMap.get(str4);
                    z70Var.getClass();
                    m8 m8Var = (m8) map2.get(str3);
                    m8Var.getClass();
                    int i21 = m8Var.f17333j;
                    n8 n8VarD2 = pi1.d(this.f16014f, this.f16015g, map3);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) z70Var.f22533a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        z70Var.f22533a = spannableStringBuilder;
                        z70Var.f22534b = null;
                    }
                    if (n8VarD2 != null) {
                        int i22 = n8VarD2.f17699h;
                        int i23 = -1;
                        if (((i22 == -1 && n8VarD2.f17700i == -1) ? -1 : (i22 == i20 ? i20 : 0) | (n8VarD2.f17700i == i20 ? 2 : 0)) != -1) {
                            int i24 = n8VarD2.f17699h;
                            if (i24 != -1) {
                                if (i24 == i20) {
                                    i17 = i20;
                                } else {
                                    i17 = 0;
                                }
                                if (n8VarD2.f17700i == i20) {
                                    i18 = 2;
                                } else {
                                    i18 = 0;
                                }
                                i19 = i17 | i18;
                            } else if (n8VarD2.f17700i == -1) {
                                i19 = -1;
                                i20 = 1;
                            } else {
                                i20 = 1;
                                if (i24 == i20) {
                                    i17 = i20;
                                } else {
                                    i17 = 0;
                                }
                                if (n8VarD2.f17700i == i20) {
                                    i18 = 2;
                                } else {
                                    i18 = 0;
                                }
                                i19 = i17 | i18;
                            }
                            StyleSpan styleSpan = new StyleSpan(i19);
                            i10 = 33;
                            spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                        } else {
                            i10 = 33;
                        }
                        if (n8VarD2.f17697f == i20) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i10);
                        }
                        if (n8VarD2.f17698g == i20) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i10);
                        }
                        if (n8VarD2.f17694c) {
                            if (!n8VarD2.f17694c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            ps1.u(spannableStringBuilder, new ForegroundColorSpan(n8VarD2.f17693b), iIntValue, iIntValue2);
                        }
                        if (n8VarD2.f17696e) {
                            if (!n8VarD2.f17696e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            ps1.u(spannableStringBuilder, new BackgroundColorSpan(n8VarD2.f17695d), iIntValue, iIntValue2);
                        }
                        if (n8VarD2.f17692a != null) {
                            ps1.u(spannableStringBuilder, new TypefaceSpan(n8VarD2.f17692a), iIntValue, iIntValue2);
                        }
                        i8 i8Var = n8VarD2.f17708r;
                        if (i8Var != null) {
                            int i25 = i8Var.f15653a;
                            if (i25 == -1) {
                                i25 = (i21 == 2 || i21 == 1) ? 3 : 1;
                                i16 = 1;
                            } else {
                                i16 = i8Var.f15654b;
                            }
                            int i26 = i8Var.f15655c;
                            if (i26 == -2) {
                                i26 = 1;
                            }
                            ps1.u(spannableStringBuilder, new ab0(i25, i16, i26), iIntValue, iIntValue2);
                        } else {
                            i23 = -1;
                        }
                        int i27 = n8VarD2.f17703m;
                        if (i27 == 2) {
                            j8 j8Var2 = this.f16018j;
                            while (true) {
                                if (j8Var2 == null) {
                                    j8Var2 = null;
                                    break;
                                }
                                n8 n8VarD3 = pi1.d(j8Var2.f16014f, j8Var2.f16015g, map3);
                                if (n8VarD3 != null && n8VarD3.f17703m == 1) {
                                    break;
                                } else {
                                    j8Var2 = j8Var2.f16018j;
                                }
                            }
                            if (j8Var2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(j8Var2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        j8Var = null;
                                        break;
                                    }
                                    j8 j8Var3 = (j8) arrayDeque.pop();
                                    n8 n8VarD4 = pi1.d(j8Var3.f16014f, j8Var3.f16015g, map3);
                                    if (n8VarD4 != null && n8VarD4.f17703m == 3) {
                                        j8Var = j8Var3;
                                        break;
                                    }
                                    for (int iE = j8Var3.e() - 1; iE >= 0; iE--) {
                                        arrayDeque.push(j8Var3.d(iE));
                                    }
                                }
                                if (j8Var != null) {
                                    if (j8Var.e() == 1) {
                                        i11 = 0;
                                        if (j8Var.d(0).f16010b != null) {
                                            String str5 = j8Var.d(0).f16010b;
                                            String str6 = uu0.f20901a;
                                            n8 n8VarD5 = pi1.d(j8Var.f16014f, j8Var.f16015g, map3);
                                            if (n8VarD5 != null) {
                                                i12 = n8VarD5.f17704n;
                                                i13 = i23;
                                            } else {
                                                i12 = i23;
                                                i13 = i12;
                                            }
                                            if (i12 == i13 && (n8VarD = pi1.d(j8Var2.f16014f, j8Var2.f16015g, map3)) != null) {
                                                i12 = n8VarD.f17704n;
                                            }
                                            spannableStringBuilder.setSpan(new ea0(str5, i12), iIntValue, iIntValue2, 33);
                                        }
                                    } else {
                                        i11 = 0;
                                    }
                                    v71.r("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                }
                            }
                            if (n8VarD2.f17707q == 1) {
                                ps1.u(spannableStringBuilder, new p90(), iIntValue, iIntValue2);
                            }
                            i14 = n8VarD2.f17701j;
                            f10 = 100.0f;
                            if (i14 != 1) {
                                if (i14 != 2) {
                                    it = it2;
                                    f11 = 100.0f;
                                    ps1.u(spannableStringBuilder, new RelativeSizeSpan(n8VarD2.f17702k), iIntValue, iIntValue2);
                                } else if (i14 != 3) {
                                    it = it2;
                                    f11 = 100.0f;
                                } else {
                                    sizeChange = n8VarD2.f17702k / 100.0f;
                                    relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                    length = relativeSizeSpanArr.length;
                                    while (i11 < length) {
                                        float f14 = f10;
                                        relativeSizeSpan = relativeSizeSpanArr[i11];
                                        Iterator it3 = it2;
                                        if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                            sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                        }
                                        if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue || spannableStringBuilder.getSpanEnd(relativeSizeSpan) != iIntValue2) {
                                            f13 = sizeChange;
                                        } else {
                                            f13 = sizeChange;
                                            if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                                spannableStringBuilder.removeSpan(relativeSizeSpan);
                                            }
                                        }
                                        i11++;
                                        f10 = f14;
                                        it2 = it3;
                                        sizeChange = f13;
                                    }
                                    it = it2;
                                    f11 = f10;
                                    spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                                }
                                i15 = 1;
                            } else {
                                it = it2;
                                f11 = 100.0f;
                                i15 = 1;
                                ps1.u(spannableStringBuilder, new AbsoluteSizeSpan((int) n8VarD2.f17702k, true), iIntValue, iIntValue2);
                            }
                            if (TtmlNode.TAG_P.equals(this.f16009a)) {
                                f12 = n8VarD2.f17709s;
                                if (f12 != Float.MAX_VALUE) {
                                    z70Var.f22546o = (f12 * (-90.0f)) / f11;
                                }
                                alignment = n8VarD2.f17705o;
                                if (alignment != null) {
                                    z70Var.f22535c = alignment;
                                }
                                alignment2 = n8VarD2.f17706p;
                                if (alignment2 != null) {
                                    z70Var.f22536d = alignment2;
                                }
                            }
                            i20 = i15;
                            it2 = it;
                        } else if (i27 == 3 || i27 == 4) {
                            spannableStringBuilder.setSpan(new h8(), iIntValue, iIntValue2, 33);
                        }
                        i11 = 0;
                        if (n8VarD2.f17707q == 1) {
                            ps1.u(spannableStringBuilder, new p90(), iIntValue, iIntValue2);
                        }
                        i14 = n8VarD2.f17701j;
                        f10 = 100.0f;
                        if (i14 != 1) {
                            if (i14 != 2) {
                                it = it2;
                                f11 = 100.0f;
                                ps1.u(spannableStringBuilder, new RelativeSizeSpan(n8VarD2.f17702k), iIntValue, iIntValue2);
                            } else if (i14 != 3) {
                                it = it2;
                                f11 = 100.0f;
                            } else {
                                sizeChange = n8VarD2.f17702k / 100.0f;
                                relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                length = relativeSizeSpanArr.length;
                                while (i11 < length) {
                                    float f15 = f10;
                                    relativeSizeSpan = relativeSizeSpanArr[i11];
                                    Iterator it4 = it2;
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue) {
                                        sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                    }
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue) {
                                        f13 = sizeChange;
                                    } else {
                                        f13 = sizeChange;
                                    }
                                    i11++;
                                    f10 = f15;
                                    it2 = it4;
                                    sizeChange = f13;
                                }
                                it = it2;
                                f11 = f10;
                                spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                            }
                            i15 = 1;
                        } else {
                            it = it2;
                            f11 = 100.0f;
                            i15 = 1;
                            ps1.u(spannableStringBuilder, new AbsoluteSizeSpan((int) n8VarD2.f17702k, true), iIntValue, iIntValue2);
                        }
                        if (TtmlNode.TAG_P.equals(this.f16009a)) {
                            f12 = n8VarD2.f17709s;
                            if (f12 != Float.MAX_VALUE) {
                                z70Var.f22546o = (f12 * (-90.0f)) / f11;
                            }
                            alignment = n8VarD2.f17705o;
                            if (alignment != null) {
                                z70Var.f22535c = alignment;
                            }
                            alignment2 = n8VarD2.f17706p;
                            if (alignment2 != null) {
                                z70Var.f22536d = alignment2;
                            }
                        }
                        i20 = i15;
                        it2 = it;
                    } else {
                        continue;
                    }
                }
            }
            int i28 = 0;
            while (i28 < e()) {
                d(i28).j(j10, map3, map2, str3, treeMap);
                i28++;
                map3 = map;
            }
        }
    }
}

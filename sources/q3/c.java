package q3;

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
import k1.g;
import l1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f48595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f48596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f48597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f48598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f48599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f48600h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f48601i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f48602j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f48603k;
    public final HashMap l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f48604m;

    public c(String str, String str2, long j10, long j11, f fVar, String[] strArr, String str3, String str4, c cVar) {
        this.f48593a = str;
        this.f48594b = str2;
        this.f48601i = str4;
        this.f48598f = fVar;
        this.f48599g = strArr;
        this.f48595c = str2 != null;
        this.f48596d = j10;
        this.f48597e = j11;
        str3.getClass();
        this.f48600h = str3;
        this.f48602j = cVar;
        this.f48603k = new HashMap();
        this.l = new HashMap();
    }

    public static c a(String str) {
        return new c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), C.TIME_UNSET, C.TIME_UNSET, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            k1.a aVar = new k1.a();
            aVar.f44201a = new SpannableStringBuilder();
            aVar.f44202b = null;
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((k1.a) treeMap.get(str)).f44201a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final c b(int i10) {
        ArrayList arrayList = this.f48604m;
        if (arrayList != null) {
            return (c) arrayList.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f48604m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z10) {
        String str = this.f48593a;
        boolean zEquals = TtmlNode.TAG_P.equals(str);
        boolean zEquals2 = TtmlNode.TAG_DIV.equals(str);
        if (z10 || zEquals || (zEquals2 && this.f48601i != null)) {
            long j10 = this.f48596d;
            if (j10 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f48597e;
            if (j11 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f48604m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f48604m.size(); i10++) {
            ((c) this.f48604m.get(i10)).d(treeSet, z10 || zEquals);
        }
    }

    public final boolean f(long j10) {
        long j11 = this.f48596d;
        long j12 = this.f48597e;
        if (j11 == C.TIME_UNSET && j12 == C.TIME_UNSET) {
            return true;
        }
        if (j11 <= j10 && j12 == C.TIME_UNSET) {
            return true;
        }
        if (j11 != C.TIME_UNSET || j10 >= j12) {
            return j11 <= j10 && j10 < j12;
        }
        return true;
    }

    public final void g(long j10, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f48600h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j10) && TtmlNode.TAG_DIV.equals(this.f48593a) && (str2 = this.f48601i) != null) {
            l1.d.n(str, str2, arrayList);
            return;
        }
        for (int i10 = 0; i10 < c(); i10++) {
            b(i10).g(j10, str, arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x020e  */
    /* JADX WARN: Code duplicated, block: B:146:0x021c  */
    /* JADX WARN: Code duplicated, block: B:148:0x021f  */
    /* JADX WARN: Code duplicated, block: B:150:0x0222  */
    /* JADX WARN: Code duplicated, block: B:151:0x0228  */
    /* JADX WARN: Code duplicated, block: B:153:0x023b  */
    /* JADX WARN: Code duplicated, block: B:165:0x026d  */
    /* JADX WARN: Code duplicated, block: B:168:0x0285  */
    /* JADX WARN: Code duplicated, block: B:169:0x0294  */
    /* JADX WARN: Code duplicated, block: B:172:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:174:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:177:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:180:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:193:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00be  */
    public final void h(long j10, Map map, HashMap map2, String str, TreeMap treeMap) {
        Iterator it;
        int i10;
        c cVar;
        int i11;
        f fVarJ;
        int i12;
        float f10;
        float f11;
        float f12;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        RelativeSizeSpan[] relativeSizeSpanArr;
        int length;
        float sizeChange;
        int i13;
        RelativeSizeSpan relativeSizeSpan;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Map map3 = map;
        if (f(j10)) {
            String str2 = this.f48600h;
            String str3 = "".equals(str2) ? str : str2;
            Iterator it2 = this.l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap map4 = this.f48603k;
                int iIntValue = map4.containsKey(str4) ? ((Integer) map4.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    k1.a aVar = (k1.a) treeMap.get(str4);
                    aVar.getClass();
                    e eVar = (e) map2.get(str3);
                    eVar.getClass();
                    int i19 = eVar.f48623j;
                    f fVarJ2 = d0.c.J(this.f48598f, this.f48599g, map3);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) aVar.f44201a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        aVar.f44201a = spannableStringBuilder;
                        aVar.f44202b = null;
                    }
                    if (fVarJ2 != null) {
                        int i20 = fVarJ2.f48631h;
                        int i21 = 1;
                        if (((i20 == -1 && fVarJ2.f48632i == -1) ? -1 : (i20 == 1 ? (char) 1 : (char) 0) | (fVarJ2.f48632i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i22 = fVarJ2.f48631h;
                            if (i22 != -1) {
                                if (i22 == i21) {
                                    i16 = i21;
                                } else {
                                    i16 = 0;
                                }
                                if (fVarJ2.f48632i == i21) {
                                    i17 = 2;
                                } else {
                                    i17 = 0;
                                }
                                i18 = i16 | i17;
                            } else if (fVarJ2.f48632i == -1) {
                                i18 = -1;
                                i21 = 1;
                            } else {
                                i21 = 1;
                                if (i22 == i21) {
                                    i16 = i21;
                                } else {
                                    i16 = 0;
                                }
                                if (fVarJ2.f48632i == i21) {
                                    i17 = 2;
                                } else {
                                    i17 = 0;
                                }
                                i18 = i16 | i17;
                            }
                            StyleSpan styleSpan = new StyleSpan(i18);
                            i10 = 33;
                            spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                        } else {
                            i10 = 33;
                        }
                        if (fVarJ2.f48629f == i21) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i10);
                        }
                        if (fVarJ2.f48630g == i21) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i10);
                        }
                        if (fVarJ2.f48626c) {
                            if (!fVarJ2.f48626c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            no.b.c(spannableStringBuilder, new ForegroundColorSpan(fVarJ2.f48625b), iIntValue, iIntValue2);
                        }
                        if (fVarJ2.f48628e) {
                            if (!fVarJ2.f48628e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            no.b.c(spannableStringBuilder, new BackgroundColorSpan(fVarJ2.f48627d), iIntValue, iIntValue2);
                        }
                        if (fVarJ2.f48624a != null) {
                            no.b.c(spannableStringBuilder, new TypefaceSpan(fVarJ2.f48624a), iIntValue, iIntValue2);
                        }
                        b bVar = fVarJ2.f48640r;
                        if (bVar != null) {
                            int i23 = bVar.f48590a;
                            if (i23 == -1) {
                                i23 = (i19 == 2 || i19 == 1) ? 3 : 1;
                                i15 = 1;
                            } else {
                                i15 = bVar.f48591b;
                            }
                            int i24 = bVar.f48592c;
                            if (i24 == -2) {
                                i24 = 1;
                            }
                            no.b.c(spannableStringBuilder, new g(i23, i15, i24), iIntValue, iIntValue2);
                        }
                        int i25 = fVarJ2.f48635m;
                        if (i25 == 2) {
                            c cVar2 = this.f48602j;
                            while (true) {
                                if (cVar2 == null) {
                                    cVar2 = null;
                                    break;
                                }
                                f fVarJ3 = d0.c.J(cVar2.f48598f, cVar2.f48599g, map3);
                                if (fVarJ3 != null && fVarJ3.f48635m == 1) {
                                    break;
                                } else {
                                    cVar2 = cVar2.f48602j;
                                }
                            }
                            if (cVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(cVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        cVar = null;
                                        break;
                                    }
                                    c cVar3 = (c) arrayDeque.pop();
                                    f fVarJ4 = d0.c.J(cVar3.f48598f, cVar3.f48599g, map3);
                                    if (fVarJ4 != null && fVarJ4.f48635m == 3) {
                                        cVar = cVar3;
                                        break;
                                    }
                                    for (int iC = cVar3.c() - 1; iC >= 0; iC--) {
                                        arrayDeque.push(cVar3.b(iC));
                                    }
                                }
                                if (cVar != null) {
                                    if (cVar.c() == 1) {
                                        i11 = 0;
                                        if (cVar.b(0).f48594b != null) {
                                            String str5 = cVar.b(0).f48594b;
                                            String str6 = y.f44830a;
                                            f fVarJ5 = d0.c.J(cVar.f48598f, cVar.f48599g, map3);
                                            int i26 = fVarJ5 != null ? fVarJ5.f48636n : -1;
                                            if (i26 == -1 && (fVarJ = d0.c.J(cVar2.f48598f, cVar2.f48599g, map3)) != null) {
                                                i26 = fVarJ.f48636n;
                                            }
                                            spannableStringBuilder.setSpan(new k1.f(str5, i26), iIntValue, iIntValue2, 33);
                                        }
                                    } else {
                                        i11 = 0;
                                    }
                                    l1.a.j("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                }
                            }
                            if (fVarJ2.f48639q == 1) {
                                no.b.c(spannableStringBuilder, new k1.e(), iIntValue, iIntValue2);
                            }
                            i12 = fVarJ2.f48633j;
                            f10 = 100.0f;
                            if (i12 != 1) {
                                it = it2;
                                f11 = 100.0f;
                                no.b.c(spannableStringBuilder, new AbsoluteSizeSpan((int) fVarJ2.f48634k, true), iIntValue, iIntValue2);
                            } else if (i12 != 2) {
                                it = it2;
                                f11 = 100.0f;
                                no.b.c(spannableStringBuilder, new RelativeSizeSpan(fVarJ2.f48634k), iIntValue, iIntValue2);
                            } else if (i12 != 3) {
                                it = it2;
                                f11 = 100.0f;
                            } else {
                                float f13 = fVarJ2.f48634k / 100.0f;
                                relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                length = relativeSizeSpanArr.length;
                                int i27 = i11;
                                sizeChange = f13;
                                i13 = i27;
                                while (i13 < length) {
                                    float f14 = f10;
                                    relativeSizeSpan = relativeSizeSpanArr[i13];
                                    Iterator it3 = it2;
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                        sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                    }
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue || spannableStringBuilder.getSpanEnd(relativeSizeSpan) != iIntValue2) {
                                        i14 = i13;
                                    } else {
                                        i14 = i13;
                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                        }
                                    }
                                    i13 = i14 + 1;
                                    f10 = f14;
                                    it2 = it3;
                                }
                                it = it2;
                                f11 = f10;
                                spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                            }
                            if (TtmlNode.TAG_P.equals(this.f48593a)) {
                                f12 = fVarJ2.f48641s;
                                if (f12 != Float.MAX_VALUE) {
                                    aVar.f44216q = (f12 * (-90.0f)) / f11;
                                }
                                alignment = fVarJ2.f48637o;
                                if (alignment != null) {
                                    aVar.f44203c = alignment;
                                }
                                alignment2 = fVarJ2.f48638p;
                                if (alignment2 != null) {
                                    aVar.f44204d = alignment2;
                                }
                            }
                        } else if (i25 == 3 || i25 == 4) {
                            spannableStringBuilder.setSpan(new a(), iIntValue, iIntValue2, 33);
                        }
                        i11 = 0;
                        if (fVarJ2.f48639q == 1) {
                            no.b.c(spannableStringBuilder, new k1.e(), iIntValue, iIntValue2);
                        }
                        i12 = fVarJ2.f48633j;
                        f10 = 100.0f;
                        if (i12 != 1) {
                            it = it2;
                            f11 = 100.0f;
                            no.b.c(spannableStringBuilder, new AbsoluteSizeSpan((int) fVarJ2.f48634k, true), iIntValue, iIntValue2);
                        } else if (i12 != 2) {
                            it = it2;
                            f11 = 100.0f;
                            no.b.c(spannableStringBuilder, new RelativeSizeSpan(fVarJ2.f48634k), iIntValue, iIntValue2);
                        } else if (i12 != 3) {
                            it = it2;
                            f11 = 100.0f;
                        } else {
                            float f15 = fVarJ2.f48634k / 100.0f;
                            relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                            length = relativeSizeSpanArr.length;
                            int i28 = i11;
                            sizeChange = f15;
                            i13 = i28;
                            while (i13 < length) {
                                float f16 = f10;
                                relativeSizeSpan = relativeSizeSpanArr[i13];
                                Iterator it4 = it2;
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue) {
                                    sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                }
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue) {
                                    i14 = i13;
                                } else {
                                    i14 = i13;
                                }
                                i13 = i14 + 1;
                                f10 = f16;
                                it2 = it4;
                            }
                            it = it2;
                            f11 = f10;
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                        }
                        if (TtmlNode.TAG_P.equals(this.f48593a)) {
                            f12 = fVarJ2.f48641s;
                            if (f12 != Float.MAX_VALUE) {
                                aVar.f44216q = (f12 * (-90.0f)) / f11;
                            }
                            alignment = fVarJ2.f48637o;
                            if (alignment != null) {
                                aVar.f44203c = alignment;
                            }
                            alignment2 = fVarJ2.f48638p;
                            if (alignment2 != null) {
                                aVar.f44204d = alignment2;
                            }
                        }
                    }
                    it2 = it;
                }
                it = it2;
                it2 = it;
            }
            int i29 = 0;
            while (i29 < c()) {
                b(i29).h(j10, map3, map2, str3, treeMap);
                i29++;
                map3 = map;
            }
        }
    }

    public final void i(long j10, boolean z10, String str, TreeMap treeMap) {
        HashMap map = this.f48603k;
        map.clear();
        HashMap map2 = this.l;
        map2.clear();
        String str2 = this.f48593a;
        if (TtmlNode.TAG_METADATA.equals(str2)) {
            return;
        }
        String str3 = this.f48600h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f48595c && z10) {
            SpannableStringBuilder spannableStringBuilderE = e(str4, treeMap);
            String str5 = this.f48594b;
            str5.getClass();
            spannableStringBuilderE.append((CharSequence) str5);
            return;
        }
        if (TtmlNode.TAG_BR.equals(str2) && z10) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j10)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((k1.a) entry.getValue()).f44201a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = TtmlNode.TAG_P.equals(str2);
            for (int i10 = 0; i10 < c(); i10++) {
                b(i10).i(j10, z10 || zEquals, str4, treeMap);
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
                CharSequence charSequence2 = ((k1.a) entry2.getValue()).f44201a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}

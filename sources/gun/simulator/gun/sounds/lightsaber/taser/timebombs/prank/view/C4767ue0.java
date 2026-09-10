package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

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
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ue0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4767ue0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5091a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final C4943we0 f;
    public final String[] g;
    public final String h;
    public final String i;
    public final C4767ue0 j;
    public final HashMap k;
    public final HashMap l;
    public ArrayList m;

    public C4767ue0(String str, String str2, long j, long j2, C4943we0 c4943we0, String[] strArr, String str3, String str4, C4767ue0 c4767ue0) {
        this.f5091a = str;
        this.b = str2;
        this.i = str4;
        this.f = c4943we0;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        str3.getClass();
        this.h = str3;
        this.j = c4767ue0;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public static C4767ue0 a(String str) {
        return new C4767ue0(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C2391Ek c2391Ek = new C2391Ek();
            c2391Ek.f3034a = new SpannableStringBuilder();
            treeMap.put(str, c2391Ek);
        }
        CharSequence charSequence = ((C2391Ek) treeMap.get(str)).f3034a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final C4767ue0 b(int i) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (C4767ue0) arrayList.get(i);
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

    public final void d(TreeSet treeSet, boolean z) {
        String str = this.f5091a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = TtmlNode.TAG_DIV.equals(str);
        if (z || zEquals || (zEquals2 && this.i != null)) {
            long j = this.d;
            if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i = 0; i < this.m.size(); i++) {
            ((C4767ue0) this.m.get(i)).d(treeSet, z || zEquals);
        }
    }

    public final boolean f(long j) {
        long j2 = this.e;
        long j3 = this.d;
        return (j3 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && j2 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) || (j3 <= j && j2 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) || ((j3 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && j < j2) || (j3 <= j && j < j2));
    }

    public final void g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j) && TtmlNode.TAG_DIV.equals(this.f5091a) && (str2 = this.i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < c(); i++) {
            b(i).g(j, str, arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b8  */
    public final void h(long j, Map map, Map map2, String str, TreeMap treeMap) {
        int i;
        C4767ue0 c4767ue0;
        C4943we0 c4943we0W;
        int i2;
        int i3;
        int i4;
        int i5;
        if (f(j)) {
            String str2 = this.h;
            String str3 = "".equals(str2) ? str : str2;
            for (Map.Entry entry : this.l.entrySet()) {
                String str4 = (String) entry.getKey();
                HashMap map3 = this.k;
                int iIntValue = map3.containsKey(str4) ? ((Integer) map3.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    C2391Ek c2391Ek = (C2391Ek) treeMap.get(str4);
                    c2391Ek.getClass();
                    C4855ve0 c4855ve0 = (C4855ve0) map2.get(str3);
                    c4855ve0.getClass();
                    C4943we0 c4943we0W2 = FW.W(this.f, this.g, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c2391Ek.f3034a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        c2391Ek.f3034a = spannableStringBuilder;
                    }
                    if (c4943we0W2 != null) {
                        int i6 = c4943we0W2.h;
                        int i7 = 1;
                        if (((i6 == -1 && c4943we0W2.i == -1) ? -1 : (i6 == 1 ? (char) 1 : (char) 0) | (c4943we0W2.i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i8 = c4943we0W2.h;
                            if (i8 != -1) {
                                if (i8 == i7) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                if (c4943we0W2.i == i7) {
                                    i4 = 2;
                                } else {
                                    i4 = 0;
                                }
                                i5 = i3 | i4;
                            } else if (c4943we0W2.i == -1) {
                                i5 = -1;
                                i7 = 1;
                            } else {
                                i7 = 1;
                                if (i8 == i7) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                if (c4943we0W2.i == i7) {
                                    i4 = 2;
                                } else {
                                    i4 = 0;
                                }
                                i5 = i3 | i4;
                            }
                            StyleSpan styleSpan = new StyleSpan(i5);
                            i = 33;
                            spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                        } else {
                            i = 33;
                        }
                        if (c4943we0W2.f == i7) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i);
                        }
                        if (c4943we0W2.g == i7) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i);
                        }
                        if (c4943we0W2.c) {
                            if (!c4943we0W2.c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            AbstractC2995aW.g(spannableStringBuilder, new ForegroundColorSpan(c4943we0W2.b), iIntValue, iIntValue2);
                        }
                        if (c4943we0W2.e) {
                            if (!c4943we0W2.e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            AbstractC2995aW.g(spannableStringBuilder, new BackgroundColorSpan(c4943we0W2.d), iIntValue, iIntValue2);
                        }
                        if (c4943we0W2.f5190a != null) {
                            AbstractC2995aW.g(spannableStringBuilder, new TypefaceSpan(c4943we0W2.f5190a), iIntValue, iIntValue2);
                        }
                        Kb0 kb0 = c4943we0W2.r;
                        if (kb0 != null) {
                            int i9 = kb0.f3319a;
                            if (i9 == -1) {
                                int i10 = c4855ve0.j;
                                i9 = (i10 == 2 || i10 == 1) ? 3 : 1;
                                i2 = 1;
                            } else {
                                i2 = kb0.b;
                            }
                            int i11 = kb0.c;
                            if (i11 == -2) {
                                i11 = 1;
                            }
                            AbstractC2995aW.g(spannableStringBuilder, new Lb0(i9, i2, i11), iIntValue, iIntValue2);
                        }
                        int i12 = c4943we0W2.m;
                        if (i12 == 2) {
                            C4767ue0 c4767ue1 = this.j;
                            while (true) {
                                if (c4767ue1 == null) {
                                    c4767ue1 = null;
                                    break;
                                }
                                C4943we0 c4943we0W3 = FW.W(c4767ue1.f, c4767ue1.g, map);
                                if (c4943we0W3 != null && c4943we0W3.m == 1) {
                                    break;
                                } else {
                                    c4767ue1 = c4767ue1.j;
                                }
                            }
                            if (c4767ue1 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(c4767ue1);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        c4767ue0 = null;
                                        break;
                                    }
                                    C4767ue0 c4767ue2 = (C4767ue0) arrayDeque.pop();
                                    C4943we0 c4943we0W4 = FW.W(c4767ue2.f, c4767ue2.g, map);
                                    if (c4943we0W4 != null && c4943we0W4.m == 3) {
                                        c4767ue0 = c4767ue2;
                                        break;
                                    }
                                    for (int iC = c4767ue2.c() - 1; iC >= 0; iC--) {
                                        arrayDeque.push(c4767ue2.b(iC));
                                    }
                                }
                                if (c4767ue0 != null) {
                                    if (c4767ue0.c() != 1 || c4767ue0.b(0).b == null) {
                                        AbstractC4038mJ.e();
                                    } else {
                                        String str5 = c4767ue0.b(0).b;
                                        int i13 = Ug0.f3833a;
                                        C4943we0 c4943we0W5 = FW.W(c4767ue0.f, c4767ue0.g, map);
                                        int i14 = c4943we0W5 != null ? c4943we0W5.n : -1;
                                        if (i14 == -1 && (c4943we0W = FW.W(c4767ue1.f, c4767ue1.g, map)) != null) {
                                            i14 = c4943we0W.n;
                                        }
                                        spannableStringBuilder.setSpan(new C3836k10(str5, i14), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                        } else if (i12 == 3 || i12 == 4) {
                            spannableStringBuilder.setSpan(new C4698to(), iIntValue, iIntValue2, 33);
                        }
                        if (c4943we0W2.q == 1) {
                            AbstractC2995aW.g(spannableStringBuilder, new C3679iA(), iIntValue, iIntValue2);
                        }
                        int i15 = c4943we0W2.j;
                        if (i15 == 1) {
                            AbstractC2995aW.g(spannableStringBuilder, new AbsoluteSizeSpan((int) c4943we0W2.k, true), iIntValue, iIntValue2);
                        } else if (i15 == 2) {
                            AbstractC2995aW.g(spannableStringBuilder, new RelativeSizeSpan(c4943we0W2.k), iIntValue, iIntValue2);
                        } else if (i15 == 3) {
                            AbstractC2995aW.g(spannableStringBuilder, new RelativeSizeSpan(c4943we0W2.k / 100.0f), iIntValue, iIntValue2);
                        }
                        if ("p".equals(this.f5091a)) {
                            float f = c4943we0W2.s;
                            if (f != Float.MAX_VALUE) {
                                c2391Ek.q = (f * (-90.0f)) / 100.0f;
                            }
                            Layout.Alignment alignment = c4943we0W2.o;
                            if (alignment != null) {
                                c2391Ek.c = alignment;
                            }
                            Layout.Alignment alignment2 = c4943we0W2.p;
                            if (alignment2 != null) {
                                c2391Ek.d = alignment2;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            for (int i16 = 0; i16 < c(); i16++) {
                b(i16).h(j, map, map2, str3, treeMap);
            }
        }
    }

    public final void i(long j, boolean z, String str, TreeMap treeMap) {
        HashMap map = this.k;
        map.clear();
        HashMap map2 = this.l;
        map2.clear();
        String str2 = this.f5091a;
        if (TtmlNode.TAG_METADATA.equals(str2)) {
            return;
        }
        String str3 = this.h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.c && z) {
            SpannableStringBuilder spannableStringBuilderE = e(str4, treeMap);
            String str5 = this.b;
            str5.getClass();
            spannableStringBuilderE.append((CharSequence) str5);
            return;
        }
        if (TtmlNode.TAG_BR.equals(str2) && z) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((C2391Ek) entry.getValue()).f3034a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i = 0; i < c(); i++) {
                b(i).i(j, z || zEquals, str4, treeMap);
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
                CharSequence charSequence2 = ((C2391Ek) entry2.getValue()).f3034a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}

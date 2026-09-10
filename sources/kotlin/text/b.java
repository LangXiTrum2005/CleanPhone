package kotlin.text;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f44717Y;

    public /* synthetic */ b(Object obj, int i2) {
        this.X = i2;
        this.f44717Y = obj;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0099 A[LOOP:0: B:20:0x0063->B:31:0x0099, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0037 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0037  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        int i3;
        int i4;
        Object next;
        Pair pair;
        Object next2;
        String str;
        String str2;
        switch (this.X) {
            case 0:
                CharSequence DelimitedRangesSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                Intrinsics.f(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                int iE = StringsKt__StringsKt.e(DelimitedRangesSequence, (char[]) this.f44717Y, iIntValue, false);
                if (iE < 0) {
                    return null;
                }
                return new Pair(Integer.valueOf(iE), 1);
            default:
                CharSequence DelimitedRangesSequence2 = (CharSequence) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                Intrinsics.f(DelimitedRangesSequence2, "$this$DelimitedRangesSequence");
                List list = (List) this.f44717Y;
                if (list.size() == 1) {
                    String str3 = (String) CollectionsKt.V(list);
                    int iV = StringsKt.v(DelimitedRangesSequence2, str3, iIntValue2, false, 4);
                    if (iV < 0) {
                        pair = null;
                    } else {
                        pair = new Pair(Integer.valueOf(iV), str3);
                    }
                } else {
                    if (iIntValue2 < 0) {
                        iIntValue2 = 0;
                    }
                    IntRange intRange = new IntRange(iIntValue2, DelimitedRangesSequence2.length(), 1);
                    boolean z2 = DelimitedRangesSequence2 instanceof String;
                    int i5 = intRange.Z;
                    int i6 = intRange.f43343Y;
                    if (z2) {
                        if ((i5 <= 0 || iIntValue2 > i6) && (i5 >= 0 || i6 > iIntValue2)) {
                            pair = null;
                        } else {
                            int i7 = iIntValue2;
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        str2 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str = (String) next2;
                                    if (str != null) {
                                        pair = new Pair(Integer.valueOf(i7), str);
                                    } else if (i7 != i6) {
                                        i7 += i5;
                                    } else {
                                        pair = null;
                                    }
                                } while (!StringsKt.C(str2, 0, (String) DelimitedRangesSequence2, i7, str2.length(), false));
                                str = (String) next2;
                                if (str != null) {
                                    pair = new Pair(Integer.valueOf(i7), str);
                                } else if (i7 != i6) {
                                    i7 += i5;
                                } else {
                                    pair = null;
                                }
                            }
                        }
                    } else if ((i5 <= 0 || iIntValue2 > i6) && (i5 >= 0 || i6 > iIntValue2)) {
                        pair = null;
                    } else {
                        while (true) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    int i8 = i6;
                                    String str4 = (String) next;
                                    int i9 = i5;
                                    i2 = iIntValue2;
                                    i3 = i9;
                                    i4 = i8;
                                    if (!StringsKt__StringsKt.f(str4, 0, DelimitedRangesSequence2, i2, str4.length(), false)) {
                                        i5 = i3;
                                        iIntValue2 = i2;
                                        i6 = i4;
                                    }
                                } else {
                                    int i10 = i5;
                                    i2 = iIntValue2;
                                    i3 = i10;
                                    i4 = i6;
                                    next = null;
                                }
                            }
                            String str5 = (String) next;
                            if (str5 != null) {
                                pair = new Pair(Integer.valueOf(i2), str5);
                            } else if (i2 != i4) {
                                int i11 = i2 + i3;
                                i5 = i3;
                                iIntValue2 = i11;
                                i6 = i4;
                            } else {
                                pair = null;
                            }
                        }
                    }
                }
                if (pair == null) {
                    return null;
                }
                return new Pair(pair.X, Integer.valueOf(((String) pair.f43249Y).length()));
        }
    }
}

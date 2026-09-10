package p002kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.CollectionsKt___CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Indent.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\u0003\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u000e2\u0006\u0010\r\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "marginPrefix", "apical", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "newIndent", "taiyuan", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "cutely", "(Ljava/lang/String;)Ljava/lang/String;", "impromptu", "", "competently", "(Ljava/lang/String;)I", "indent", "Lkotlin/Function1;", "wireman", "(Ljava/lang/String;)Lkotlin/jvm/functions/Function1;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class arytenoidectomy extends impassible {
    public static final String apical(String str, String marginPrefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        return taiyuan(str, "", marginPrefix);
    }

    public static final String beachfront(String str, String line) {
        Intrinsics.checkNotNullParameter(line, "line");
        return str + line;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    /* JADX WARN: Code duplicated, block: B:13:0x001e A[RETURN] */
    public static final int competently(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (!CharsKt__CharJVMKt.saneness(str.charAt(i))) {
                if (i == -1) {
                    return str.length();
                }
                return i;
            }
            i++;
        }
        i = -1;
        if (i == -1) {
            return str.length();
        }
        return i;
    }

    public static String cutely(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return impromptu(str, "");
    }

    public static /* synthetic */ String formularize(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return apical(str, str2);
    }

    public static final String impromptu(String str, String newIndent) {
        String strInvoke;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        List<String> listIgbo = StringsKt__StringsKt.igbo(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listIgbo) {
            if (!StringsKt__StringsKt.empress((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(dovishness.gintrap(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(competently((String) it.next())));
        }
        Integer num = (Integer) CollectionsKt.lightstruck(arrayList2);
        int i = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listIgbo.size());
        Function1<String, String> function1Wireman = wireman(newIndent);
        int iTriweekly = adultoid.triweekly(listIgbo);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listIgbo) {
            int i2 = i + 1;
            if (i < 0) {
                adultoid.dovishness();
            }
            String str2 = (String) obj2;
            if ((i == 0 || i == iTriweekly) && StringsKt__StringsKt.empress(str2)) {
                str2 = null;
            } else {
                String strDecarock = cord.decarock(str2, iIntValue);
                if (strDecarock != null && (strInvoke = function1Wireman.invoke(strDecarock)) != null) {
                    str2 = strInvoke;
                }
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i = i2;
        }
        return ((StringBuilder) CollectionsKt___CollectionsKt.czestochowa(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static final String marial(String line) {
        Intrinsics.checkNotNullParameter(line, "line");
        return line;
    }

    public static final String taiyuan(String str, String newIndent, String marginPrefix) {
        String str2;
        String strInvoke;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        if (StringsKt__StringsKt.empress(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List<String> listIgbo = StringsKt__StringsKt.igbo(str);
        int length = str.length() + (newIndent.length() * listIgbo.size());
        Function1<String, String> function1Wireman = wireman(newIndent);
        int iTriweekly = adultoid.triweekly(listIgbo);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listIgbo) {
            int i2 = i + 1;
            if (i < 0) {
                adultoid.dovishness();
            }
            String str3 = (String) obj;
            String strSubstring = null;
            if ((i == 0 || i == iTriweekly) && StringsKt__StringsKt.empress(str3)) {
                str2 = marginPrefix;
                str3 = null;
            } else {
                int length2 = str3.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!CharsKt__CharJVMKt.saneness(str3.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 == -1) {
                    str2 = marginPrefix;
                } else {
                    int i4 = i3;
                    str2 = marginPrefix;
                    if (dovishness.creditor(str3, str2, i4, false, 4, null)) {
                        int length3 = str2.length() + i4;
                        Intrinsics.competently(str3, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str3.substring(length3);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (strInvoke = function1Wireman.invoke(strSubstring)) != null) {
                    str3 = strInvoke;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i = i2;
            marginPrefix = str2;
        }
        return ((StringBuilder) CollectionsKt___CollectionsKt.czestochowa(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static final Function1<String, String> wireman(final String str) {
        return str.length() == 0 ? new Function1() { // from class: kotlin.text.triweekly
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return arytenoidectomy.marial((String) obj);
            }
        } : new Function1() { // from class: kotlin.text.kowloon
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return arytenoidectomy.beachfront(str, (String) obj);
            }
        };
    }
}

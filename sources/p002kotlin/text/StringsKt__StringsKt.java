package p002kotlin.text;

import com.ironsource.C3414a2;
import com.ironsource.mediationsdk.metadata.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.arytenoidectomy;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.graveside;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;
import p002kotlin.ranges.wireman;
import p002kotlin.sequences.Sequence;
import p002kotlin.sequences.SequencesKt___SequencesKt;
import patroclinal.formularize;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0010\u000e\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0013\u001a\u001d\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0011\u001a\u00020\u0010*\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0015\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a#\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a#\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u001d\u0010\u001a\u001a#\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u001e\u0010\u001c\u001a#\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u001f\u0010\u001c\u001a#\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b \u0010\u001a\u001a#\u0010!\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b!\u0010\u001c\u001a)\u0010%\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&\u001a\u0019\u0010(\u001a\u00020\u0000*\u00020\u00002\u0006\u0010'\u001a\u00020\u0006¢\u0006\u0004\b(\u0010)\u001a\u0019\u0010+\u001a\u00020\u0000*\u00020\u00002\u0006\u0010*\u001a\u00020\u0006¢\u0006\u0004\b+\u0010)\u001a!\u0010,\u001a\u00020\u0000*\u00020\u00002\u0006\u0010'\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006¢\u0006\u0004\b,\u0010-\u001a\u0019\u0010.\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b.\u0010)\u001a;\u00103\u001a\u00020\u0010*\u00020\u00062\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u00102\u001a\u00020\u0010H\u0000¢\u0006\u0004\b3\u00104\u001a#\u00106\u001a\u00020\u0010*\u00020\u00062\u0006\u00105\u001a\u00020\u00022\b\b\u0002\u00102\u001a\u00020\u0010¢\u0006\u0004\b6\u00107\u001a#\u00108\u001a\u00020\u0010*\u00020\u00062\u0006\u00105\u001a\u00020\u00022\b\b\u0002\u00102\u001a\u00020\u0010¢\u0006\u0004\b8\u00107\u001a#\u00109\u001a\u00020\u0010*\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0010¢\u0006\u0004\b9\u0010:\u001a#\u0010;\u001a\u00020\u0010*\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0010¢\u0006\u0004\b;\u0010:\u001a-\u0010<\u001a\u00020\t*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020\t2\b\b\u0002\u00102\u001a\u00020\u0010¢\u0006\u0004\b<\u0010=\u001a-\u0010>\u001a\u00020\t*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020\t2\b\b\u0002\u00102\u001a\u00020\u0010¢\u0006\u0004\b>\u0010=\u001a=\u0010@\u001a\u00020\t*\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u00102\u001a\u00020\u00102\b\b\u0002\u0010?\u001a\u00020\u0010H\u0002¢\u0006\u0004\b@\u0010A\u001aG\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0000\u0018\u00010D*\u00020\u00062\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00000B2\u0006\u0010\"\u001a\u00020\t2\u0006\u00102\u001a\u00020\u00102\u0006\u0010?\u001a\u00020\u0010H\u0002¢\u0006\u0004\bE\u0010F\u001a-\u0010G\u001a\u00020\t*\u00020\u00062\u0006\u00105\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\t2\b\b\u0002\u00102\u001a\u00020\u0010¢\u0006\u0004\bG\u0010H\u001a-\u0010J\u001a\u00020\t*\u00020\u00062\u0006\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\t2\b\b\u0002\u00102\u001a\u00020\u0010¢\u0006\u0004\bJ\u0010K\u001a-\u0010L\u001a\u00020\t*\u00020\u00062\u0006\u00105\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\t2\b\b\u0002\u00102\u001a\u00020\u0010¢\u0006\u0004\bL\u0010H\u001a-\u0010M\u001a\u00020\t*\u00020\u00062\u0006\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\t2\b\b\u0002\u00102\u001a\u00020\u0010¢\u0006\u0004\bM\u0010K\u001a&\u0010N\u001a\u00020\u0010*\u00020\u00062\u0006\u00100\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\bN\u0010:\u001a&\u0010O\u001a\u00020\u0010*\u00020\u00062\u0006\u00105\u001a\u00020\u00022\b\b\u0002\u00102\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\bO\u00107\u001a?\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00130R*\u00020\u00062\u0006\u0010P\u001a\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020\t2\b\b\u0002\u00102\u001a\u00020\u00102\b\b\u0002\u0010Q\u001a\u00020\tH\u0002¢\u0006\u0004\bS\u0010T\u001aG\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00130R*\u00020\u00062\u000e\u0010P\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000U2\b\b\u0002\u0010\"\u001a\u00020\t2\b\b\u0002\u00102\u001a\u00020\u00102\b\b\u0002\u0010Q\u001a\u00020\tH\u0002¢\u0006\u0004\bV\u0010W\u001a\u0017\u0010Y\u001a\u00020X2\u0006\u0010Q\u001a\u00020\tH\u0000¢\u0006\u0004\bY\u0010Z\u001a?\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00000[*\u00020\u00062\u0012\u0010P\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000U\"\u00020\u00002\b\b\u0002\u00102\u001a\u00020\u00102\b\b\u0002\u0010Q\u001a\u00020\t¢\u0006\u0004\b\\\u0010]\u001a7\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00000[*\u00020\u00062\n\u0010P\u001a\u00020\u0001\"\u00020\u00022\b\b\u0002\u00102\u001a\u00020\u00102\b\b\u0002\u0010Q\u001a\u00020\t¢\u0006\u0004\b^\u0010_\u001a1\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00000[*\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u00102\u0006\u0010Q\u001a\u00020\tH\u0002¢\u0006\u0004\b`\u0010a\u001a\u0017\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00000R*\u00020\u0006¢\u0006\u0004\bb\u0010c\u001a\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00000[*\u00020\u0006¢\u0006\u0004\bd\u0010e\u001a\u0015\u0010f\u001a\u0004\u0018\u00010\u0010*\u00020\u0000H\u0007¢\u0006\u0004\bf\u0010g\"\u0015\u0010j\u001a\u00020\u0013*\u00020\u00068F¢\u0006\u0006\u001a\u0004\bh\u0010i\"\u0015\u0010m\u001a\u00020\t*\u00020\u00068F¢\u0006\u0006\u001a\u0004\bk\u0010l¨\u0006n"}, d2 = {"", "", "", "chars", "libya", "(Ljava/lang/String;[C)Ljava/lang/String;", "", "stupefactive", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "", "length", "padChar", "gusty", "(Ljava/lang/CharSequence;IC)Ljava/lang/CharSequence;", "picketboat", "(Ljava/lang/String;IC)Ljava/lang/String;", "", "empress", "(Ljava/lang/CharSequence;)Z", "Lkotlin/ranges/IntRange;", "range", "sakeen", "(Ljava/lang/CharSequence;Lkotlin/ranges/IntRange;)Ljava/lang/String;", "delimiter", "missingDelimiterValue", "cosy", "(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;", "pruinose", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "immediately", "basify", "demilitarize", "osteal", "licking", "startIndex", "endIndex", "replacement", "dhss", "(Ljava/lang/CharSequence;IILjava/lang/CharSequence;)Ljava/lang/CharSequence;", "prefix", "hardpan", "(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;", "suffix", "herdbook", "outmarry", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "technofreak", "thisOffset", C3414a2.d, "otherOffset", "ignoreCase", "claque", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z", "char", "lampshade", "(Ljava/lang/CharSequence;CZ)Z", "clubfoot", "libyan", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z", "dent", "sayid", "(Ljava/lang/CharSequence;[CIZ)I", "preterite", "last", "coffeecake", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I", "", "strings", "Lkotlin/Pair;", "premeiotic", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)Lkotlin/Pair;", "treadless", "(Ljava/lang/CharSequence;CIZ)I", "string", "itchy", "(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I", "coi", "czestochowa", "mathsort", "peridotite", "delimiters", "limit", "Lkotlin/sequences/Sequence;", "palmyra", "(Ljava/lang/CharSequence;[CIZI)Lkotlin/sequences/Sequence;", "", "lightstruck", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "", "vesuvio", "(I)V", "", "mastfed", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "setterwort", "(Ljava/lang/CharSequence;[CZI)Ljava/util/List;", "attendance", "(Ljava/lang/CharSequence;Ljava/lang/String;ZI)Ljava/util/List;", "wostteth", "(Ljava/lang/CharSequence;)Lkotlin/sequences/Sequence;", "igbo", "(Ljava/lang/CharSequence;)Ljava/util/List;", "linendraper", "(Ljava/lang/String;)Ljava/lang/Boolean;", "timberyard", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "indices", "milliradian", "(Ljava/lang/CharSequence;)I", "lastIndex", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class StringsKt__StringsKt extends dovishness {

    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kotlin/text/StringsKt__StringsKt$attabal", "Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal implements Sequence<String> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ CharSequence f32009attabal;

        public attabal(CharSequence charSequence) {
            this.f32009attabal = charSequence;
        }

        @Override // p002kotlin.sequences.Sequence
        public Iterator<String> iterator() {
            return new competently(this.f32009attabal);
        }
    }

    public static final Pair achondroplasia(char[] cArr, boolean z, CharSequence DelimitedRangesSequence, int i) {
        Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        int iSayid = sayid(DelimitedRangesSequence, cArr, i, z);
        if (iSayid < 0) {
            return null;
        }
        return formularize.attabal(Integer.valueOf(iSayid), 1);
    }

    public static final List<String> attendance(CharSequence charSequence, String str, boolean z, int i) {
        vesuvio(i);
        int length = 0;
        int iItchy = itchy(charSequence, str, 0, z);
        if (iItchy == -1 || i == 1) {
            return graveside.marial(charSequence.toString());
        }
        boolean z2 = i > 0;
        ArrayList arrayList = new ArrayList(z2 ? wireman.competently(i, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iItchy).toString());
            length = str.length() + iItchy;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            iItchy = itchy(charSequence, str, length, z);
        } while (iItchy != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static String basify(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLotta = lotta(str, delimiter, 0, false, 6, null);
        if (iLotta == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iLotta + delimiter.length(), str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String cig(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return pruinose(str, str2, str3);
    }

    public static final boolean claque(CharSequence charSequence, int i, CharSequence other, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > other.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!p002kotlin.text.attabal.dern(charSequence.charAt(i + i4), other.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean clubfoot(CharSequence charSequence, char c, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && p002kotlin.text.attabal.dern(charSequence.charAt(milliradian(charSequence)), c, z);
    }

    public static final int coffeecake(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        p002kotlin.ranges.attabal intRange = !z2 ? new IntRange(wireman.wireman(i, 0), wireman.competently(i2, charSequence.length())) : wireman.kowloon(wireman.competently(i, milliradian(charSequence)), wireman.wireman(i2, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iBeachfront = intRange.getFirst();
            int iCompetently = intRange.getLast();
            int iImpromptu = intRange.getStep();
            if ((iImpromptu <= 0 || iBeachfront > iCompetently) && (iImpromptu >= 0 || iCompetently > iBeachfront)) {
                return -1;
            }
            int i3 = iBeachfront;
            while (true) {
                String str = (String) charSequence2;
                boolean z3 = z;
                if (dovishness.yemenite(str, 0, (String) charSequence, i3, str.length(), z3)) {
                    return i3;
                }
                if (i3 == iCompetently) {
                    return -1;
                }
                i3 += iImpromptu;
                z = z3;
            }
        } else {
            boolean z4 = z;
            int iBeachfront2 = intRange.getFirst();
            int iCompetently2 = intRange.getLast();
            int iImpromptu2 = intRange.getStep();
            if ((iImpromptu2 <= 0 || iBeachfront2 > iCompetently2) && (iImpromptu2 >= 0 || iCompetently2 > iBeachfront2)) {
                return -1;
            }
            int i4 = iBeachfront2;
            while (true) {
                boolean z5 = z4;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z4 = z5;
                if (claque(charSequence4, 0, charSequence3, i4, charSequence2.length(), z5)) {
                    return i4;
                }
                if (i4 == iCompetently2) {
                    return -1;
                }
                i4 += iImpromptu2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    public static final int coi(CharSequence charSequence, char c, int i, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? preterite(charSequence, new char[]{c}, i, z) : ((String) charSequence).lastIndexOf(c, i);
    }

    public static final String cosy(String str, char c, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iNosophobia = nosophobia(str, c, 0, false, 6, null);
        if (iNosophobia == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iNosophobia);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean cultivated(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return dent(charSequence, charSequence2, z);
    }

    public static final int czestochowa(CharSequence charSequence, String string, int i, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z || !(charSequence instanceof String)) ? coffeecake(charSequence, string, i, 0, z, true) : ((String) charSequence).lastIndexOf(string, i);
    }

    public static /* synthetic */ boolean deadwork(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return lampshade(charSequence, c, z);
    }

    public static String demilitarize(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iUnderbelly = underbelly(str, delimiter, 0, false, 6, null);
        if (iUnderbelly == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iUnderbelly);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean dent(CharSequence charSequence, CharSequence suffix, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return (!z && (charSequence instanceof String) && (suffix instanceof String)) ? dovishness.cuirassed((String) charSequence, (String) suffix, false, 2, null) : claque(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z);
    }

    public static final CharSequence dhss(CharSequence charSequence, int i, int i2, CharSequence replacement) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append(replacement);
            sb.append(charSequence, i2, charSequence.length());
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
    }

    public static boolean empress(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!CharsKt__CharJVMKt.saneness(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String fastrack(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return licking(str, str2, str3);
    }

    public static final CharSequence gusty(CharSequence charSequence, int i, char c) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        }
        if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i);
        int length = i - charSequence.length();
        int i2 = 1;
        if (1 <= length) {
            while (true) {
                sb.append(c);
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        sb.append(charSequence);
        return sb;
    }

    public static String hardpan(String str, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!molet(str, prefix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String herdbook(String str, CharSequence suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!cultivated(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ List homozygous(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return setterwort(charSequence, cArr, z, i);
    }

    public static final List<String> igbo(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return SequencesKt___SequencesKt.hydrovane(wostteth(charSequence));
    }

    public static String immediately(String str, char c, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iNosophobia = nosophobia(str, c, 0, false, 6, null);
        if (iNosophobia == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iNosophobia + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int itchy(CharSequence charSequence, String string, int i, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z || !(charSequence instanceof String)) ? lerp(charSequence, string, i, charSequence.length(), z, false, 16, null) : ((String) charSequence).indexOf(string, i);
    }

    public static /* synthetic */ Sequence julian(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return lightstruck(charSequence, strArr, i, z, i2);
    }

    public static final boolean lampshade(CharSequence charSequence, char c, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && p002kotlin.text.attabal.dern(charSequence.charAt(0), c, z);
    }

    public static /* synthetic */ int lerp(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return coffeecake(charSequence, charSequence2, i, i2, z, z2);
    }

    public static String libya(String str, char... chars) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zSupplicat = polloi.supplicat(chars, str.charAt(!z ? i : length));
            if (z) {
                if (!zSupplicat) {
                    break;
                }
                length--;
            } else if (zSupplicat) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    public static final boolean libyan(CharSequence charSequence, CharSequence prefix, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return (!z && (charSequence instanceof String) && (prefix instanceof String)) ? dovishness.starveling((String) charSequence, (String) prefix, false, 2, null) : claque(charSequence, 0, prefix, 0, prefix.length(), z);
    }

    public static final String licking(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iUnderbelly = underbelly(str, delimiter, 0, false, 6, null);
        if (iUnderbelly == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iUnderbelly + delimiter.length(), str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final Sequence<IntRange> lightstruck(CharSequence charSequence, String[] strArr, int i, final boolean z, int i2) {
        vesuvio(i2);
        final List listWireman = arytenoidectomy.wireman(strArr);
        return new saneness(charSequence, i, i2, new Function2() { // from class: kotlin.text.rotuma
            @Override // p002kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return StringsKt__StringsKt.unconsolidated(listWireman, z, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    public static Boolean linendraper(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.wireman(str, a.g)) {
            return Boolean.TRUE;
        }
        if (Intrinsics.wireman(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static /* synthetic */ int lotta(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return itchy(charSequence, str, i, z);
    }

    public static final List<String> mastfed(CharSequence charSequence, String[] delimiters, boolean z, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return attendance(charSequence, str, z, i);
            }
        }
        Iterable iterableDovishness = SequencesKt___SequencesKt.dovishness(julian(charSequence, delimiters, 0, z, i, 2, null));
        ArrayList arrayList = new ArrayList(dovishness.gintrap(iterableDovishness, 10));
        Iterator it = iterableDovishness.iterator();
        while (it.hasNext()) {
            arrayList.add(sakeen(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static boolean mathsort(CharSequence charSequence, CharSequence other, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof String) {
            return lotta(charSequence, (String) other, 0, z, 2, null) >= 0;
        }
        return lerp(charSequence, other, 0, charSequence.length(), z, false, 16, null) >= 0;
    }

    public static /* synthetic */ String microchemistry(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return osteal(str, c, str2);
    }

    public static int milliradian(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static /* synthetic */ boolean molet(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return libyan(charSequence, charSequence2, z);
    }

    public static /* synthetic */ Sequence monroe(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return palmyra(charSequence, cArr, i, z, i2);
    }

    public static /* synthetic */ int nosophobia(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return treadless(charSequence, c, i, z);
    }

    public static String osteal(String str, char c, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iSensatory = sensatory(str, c, 0, false, 6, null);
        if (iSensatory == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iSensatory + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String outmarry(String str, CharSequence prefix, CharSequence suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !molet(str, prefix, false, 2, null) || !cultivated(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length(), str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean overspeculate(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return mathsort(charSequence, charSequence2, z);
    }

    public static final Sequence<IntRange> palmyra(CharSequence charSequence, final char[] cArr, int i, final boolean z, int i2) {
        vesuvio(i2);
        return new saneness(charSequence, i, i2, new Function2() { // from class: kotlin.text.gintrap
            @Override // p002kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return StringsKt__StringsKt.achondroplasia(cArr, z, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    public static final boolean peridotite(CharSequence charSequence, char c, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return nosophobia(charSequence, c, 0, z, 2, null) >= 0;
    }

    public static /* synthetic */ boolean permissivist(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return clubfoot(charSequence, c, z);
    }

    public static String picketboat(String str, int i, char c) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return gusty(str, i, c).toString();
    }

    public static /* synthetic */ String prefect(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return basify(str, str2, str3);
    }

    public static final Pair<Integer, String> premeiotic(CharSequence charSequence, Collection<String> collection2, int i, boolean z, boolean z2) {
        CharSequence charSequence2;
        Object next;
        boolean z3;
        Object next2;
        if (!z && collection2.size() == 1) {
            String str = (String) CollectionsKt.hardpan(collection2);
            int iLotta = !z2 ? lotta(charSequence, str, i, false, 4, null) : underbelly(charSequence, str, i, false, 4, null);
            if (iLotta < 0) {
                return null;
            }
            return formularize.attabal(Integer.valueOf(iLotta), str);
        }
        CharSequence charSequence3 = charSequence;
        p002kotlin.ranges.attabal intRange = !z2 ? new IntRange(wireman.wireman(i, 0), charSequence3.length()) : wireman.kowloon(wireman.competently(i, milliradian(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int iBeachfront = intRange.getFirst();
            int iCompetently = intRange.getLast();
            int iImpromptu = intRange.getStep();
            if ((iImpromptu > 0 && iBeachfront <= iCompetently) || (iImpromptu < 0 && iCompetently <= iBeachfront)) {
                int i2 = iBeachfront;
                while (true) {
                    Iterator<T> it = collection2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z3 = z;
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        z3 = z;
                        if (dovishness.yemenite(str2, 0, (String) charSequence3, i2, str2.length(), z3)) {
                            break;
                        }
                        z = z3;
                    }
                    String str3 = (String) next2;
                    if (str3 != null) {
                        return formularize.attabal(Integer.valueOf(i2), str3);
                    }
                    if (i2 != iCompetently) {
                        i2 += iImpromptu;
                        z = z3;
                    }
                }
            }
        } else {
            boolean z4 = z;
            int iBeachfront2 = intRange.getFirst();
            int iCompetently2 = intRange.getLast();
            int iImpromptu2 = intRange.getStep();
            if ((iImpromptu2 > 0 && iBeachfront2 <= iCompetently2) || (iImpromptu2 < 0 && iCompetently2 <= iBeachfront2)) {
                int i3 = iBeachfront2;
                while (true) {
                    Iterator<T> it2 = collection2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            charSequence2 = charSequence3;
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        boolean z5 = z4;
                        charSequence2 = charSequence3;
                        z4 = z5;
                        if (claque(str4, 0, charSequence2, i3, str4.length(), z5)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) next;
                    if (str5 != null) {
                        return formularize.attabal(Integer.valueOf(i3), str5);
                    }
                    if (i3 != iCompetently2) {
                        i3 += iImpromptu2;
                        charSequence3 = charSequence2;
                    }
                }
            }
        }
        return null;
    }

    public static final int preterite(CharSequence charSequence, char[] chars, int i, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(polloi.coi(chars), i);
        }
        for (int iCompetently = wireman.competently(i, milliradian(charSequence)); -1 < iCompetently; iCompetently--) {
            char cCharAt = charSequence.charAt(iCompetently);
            for (char c : chars) {
                if (p002kotlin.text.attabal.dern(c, cCharAt, z)) {
                    return iCompetently;
                }
            }
        }
        return -1;
    }

    public static final String pruinose(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLotta = lotta(str, delimiter, 0, false, 6, null);
        if (iLotta == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iLotta);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String sakeen(CharSequence charSequence, IntRange range) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.wireman().intValue(), range.marial().intValue() + 1).toString();
    }

    public static final int sayid(CharSequence charSequence, char[] chars, int i, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(polloi.coi(chars), i);
        }
        int iWireman = wireman.wireman(i, 0);
        int iMilliradian = milliradian(charSequence);
        if (iWireman > iMilliradian) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iWireman);
            for (char c : chars) {
                if (p002kotlin.text.attabal.dern(c, cCharAt, z)) {
                    return iWireman;
                }
            }
            if (iWireman == iMilliradian) {
                return -1;
            }
            iWireman++;
        }
    }

    public static /* synthetic */ int sensatory(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = milliradian(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return coi(charSequence, c, i, z);
    }

    public static final List<String> setterwort(CharSequence charSequence, char[] delimiters, boolean z, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return attendance(charSequence, String.valueOf(delimiters[0]), z, i);
        }
        Iterable iterableDovishness = SequencesKt___SequencesKt.dovishness(monroe(charSequence, delimiters, 0, z, i, 2, null));
        ArrayList arrayList = new ArrayList(dovishness.gintrap(iterableDovishness, 10));
        Iterator it = iterableDovishness.iterator();
        while (it.hasNext()) {
            arrayList.add(sakeen(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ boolean splinterproof(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return peridotite(charSequence, c, z);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return mastfed(charSequence, strArr, z, i);
    }

    public static CharSequence stupefactive(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zSaneness = CharsKt__CharJVMKt.saneness(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zSaneness) {
                    break;
                }
                length--;
            } else if (zSaneness) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static /* synthetic */ String sultanate(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return demilitarize(str, str2, str3);
    }

    public static /* synthetic */ String tarboosh(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return cosy(str, c, str2);
    }

    public static String technofreak(String str, CharSequence delimiter) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        return outmarry(str, delimiter, delimiter);
    }

    public static /* synthetic */ String tectonization(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return immediately(str, c, str2);
    }

    public static IntRange timberyard(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new IntRange(0, charSequence.length() - 1);
    }

    public static final int treadless(CharSequence charSequence, char c, int i, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? sayid(charSequence, new char[]{c}, i, z) : ((String) charSequence).indexOf(c, i);
    }

    public static final Pair unconsolidated(List list, boolean z, CharSequence DelimitedRangesSequence, int i) {
        Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        Pair<Integer, String> pairPremeiotic = premeiotic(DelimitedRangesSequence, list, i, z, false);
        if (pairPremeiotic != null) {
            return formularize.attabal(pairPremeiotic.getFirst(), Integer.valueOf(pairPremeiotic.getSecond().length()));
        }
        return null;
    }

    public static /* synthetic */ int underbelly(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = milliradian(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return czestochowa(charSequence, str, i, z);
    }

    public static final void vesuvio(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
    }

    public static Sequence<String> wostteth(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new attabal(charSequence);
    }
}

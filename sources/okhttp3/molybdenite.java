package okhttp3;

import com.ironsource.C3414a2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: Headers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\b\u0018\u0000 (2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002)\tB\u0017\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00100\"¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b'\u0010\u001f¨\u0006*"}, d2 = {"Lokhttp3/molybdenite;", "", "Lkotlin/Pair;", "", "", "namesAndValues", "<init>", "([Ljava/lang/String;)V", "name", "saneness", "(Ljava/lang/String;)Ljava/lang/String;", "", "index", "wireman", "(I)Ljava/lang/String;", "impromptu", "", "taiyuan", "(Ljava/lang/String;)Ljava/util/List;", "", "iterator", "()Ljava/util/Iterator;", "Lokhttp3/molybdenite$attabal;", "marial", "()Lokhttp3/molybdenite$attabal;", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "", "competently", "()Ljava/util/Map;", "kowloon", "[Ljava/lang/String;", "size", "arytenoidectomy", "attabal", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class molybdenite implements Iterable<Pair<? extends String, ? extends String>>, unready.attabal {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final String[] namesAndValues;

    /* JADX INFO: compiled from: Headers.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u000bJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0007J \u0010\u0012\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lokhttp3/molybdenite$attabal;", "", "<init>", "()V", "", "line", "dern", "(Ljava/lang/String;)Lokhttp3/molybdenite$attabal;", "name", "value", "attabal", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/molybdenite$attabal;", "Lokhttp3/molybdenite;", "headers", "saneness", "(Lokhttp3/molybdenite;)Lokhttp3/molybdenite$attabal;", "wireman", "impromptu", "taiyuan", "beachfront", "(Ljava/lang/String;)Ljava/lang/String;", "marial", "()Lokhttp3/molybdenite;", "", "Ljava/util/List;", "competently", "()Ljava/util/List;", "namesAndValues", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final List<String> namesAndValues = new ArrayList(20);

        public final attabal attabal(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Companion companion = molybdenite.INSTANCE;
            companion.wireman(name);
            companion.marial(value, name);
            wireman(name, value);
            return this;
        }

        public final String beachfront(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int size = this.namesAndValues.size() - 2;
            int iDern = dessertspoon.dern.dern(size, 0, -2);
            if (iDern > size) {
                return null;
            }
            while (true) {
                int i = size - 2;
                if (p002kotlin.text.dovishness.stratoscope(name, this.namesAndValues.get(size), true)) {
                    return this.namesAndValues.get(size + 1);
                }
                if (size == iDern) {
                    return null;
                }
                size = i;
            }
        }

        public final List<String> competently() {
            return this.namesAndValues;
        }

        public final attabal dern(String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            int iNosophobia = StringsKt.nosophobia(line, ':', 1, false, 4, null);
            if (iNosophobia != -1) {
                String strSubstring = line.substring(0, iNosophobia);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iNosophobia + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                wireman(strSubstring, strSubstring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                wireman("", line);
                return this;
            }
            String strSubstring3 = line.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
            wireman("", strSubstring3);
            return this;
        }

        public final attabal impromptu(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int i = 0;
            while (i < competently().size()) {
                if (p002kotlin.text.dovishness.stratoscope(name, competently().get(i), true)) {
                    competently().remove(i);
                    competently().remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final molybdenite marial() {
            Object[] array = this.namesAndValues.toArray(new String[0]);
            if (array != null) {
                return new molybdenite((String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final attabal saneness(molybdenite headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                wireman(headers.wireman(i), headers.impromptu(i));
            }
            return this;
        }

        public final attabal taiyuan(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Companion companion = molybdenite.INSTANCE;
            companion.wireman(name);
            companion.marial(value, name);
            impromptu(name);
            wireman(name, value);
            return this;
        }

        public final attabal wireman(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            competently().add(name);
            competently().add(StringsKt.stupefactive(value).toString());
            return this;
        }
    }

    /* JADX INFO: renamed from: okhttp3.molybdenite$saneness, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Headers.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u0007*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lokhttp3/molybdenite$saneness;", "", "<init>", "()V", "", "", "namesAndValues", "Lokhttp3/molybdenite;", "impromptu", "([Ljava/lang/String;)Lokhttp3/molybdenite;", "", "competently", "(Ljava/util/Map;)Lokhttp3/molybdenite;", "name", "beachfront", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "wireman", "(Ljava/lang/String;)V", "value", "marial", "(Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String beachfront(String[] namesAndValues, String name) {
            int length = namesAndValues.length - 2;
            int iDern = dessertspoon.dern.dern(length, 0, -2);
            if (iDern > length) {
                return null;
            }
            while (true) {
                int i = length - 2;
                if (p002kotlin.text.dovishness.stratoscope(name, namesAndValues[length], true)) {
                    return namesAndValues[length + 1];
                }
                if (length == iDern) {
                    return null;
                }
                length = i;
            }
        }

        public final molybdenite competently(Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String string = StringsKt.stupefactive(key).toString();
                String string2 = StringsKt.stupefactive(value).toString();
                wireman(string);
                marial(string2, string);
                strArr[i] = string;
                strArr[i + 1] = string2;
                i += 2;
            }
            return new molybdenite(strArr, null);
        }

        public final molybdenite impromptu(String... namesAndValues) {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i = 0;
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                String str = strArr[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr[i2] = StringsKt.stupefactive(str).toString();
                i2 = i3;
            }
            int iDern = dessertspoon.dern.dern(0, strArr.length - 1, 2);
            if (iDern >= 0) {
                while (true) {
                    int i4 = i + 2;
                    String str2 = strArr[i];
                    String str3 = strArr[i + 1];
                    wireman(str2);
                    marial(str3, str2);
                    if (i == iDern) {
                        break;
                    }
                    i = i4;
                }
            }
            return new molybdenite(strArr, null);
        }

        public final void marial(String value, String name) {
            int length = value.length();
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                char cCharAt = value.charAt(i);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    throw new IllegalArgumentException(Intrinsics.arytenoidectomy(hereditist.wireman.graveside("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), name), hereditist.wireman.supplicat(name) ? "" : Intrinsics.arytenoidectomy(": ", value)).toString());
                }
                i = i2;
            }
        }

        public final void wireman(String name) {
            if (name.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = name.length();
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                char cCharAt = name.charAt(i);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(hereditist.wireman.graveside("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), name).toString());
                }
                i = i2;
            }
        }

        public Companion() {
        }
    }

    public /* synthetic */ molybdenite(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }

    public static final molybdenite beachfront(String... strArr) {
        return INSTANCE.impromptu(strArr);
    }

    public final Map<String, List<String>> competently() {
        TreeMap treeMap = new TreeMap(p002kotlin.text.dovishness.oilcan(p002kotlin.jvm.internal.gintrap.f29390attabal));
        int size = size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            String strWireman = wireman(i);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = strWireman.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(impromptu(i));
            i = i2;
        }
        return treeMap;
    }

    public boolean equals(Object other) {
        return (other instanceof molybdenite) && Arrays.equals(this.namesAndValues, ((molybdenite) other).namesAndValues);
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    public final String impromptu(int index) {
        return this.namesAndValues[(index * 2) + 1];
    }

    @Override // java.lang.Iterable
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = patroclinal.formularize.attabal(wireman(i), impromptu(i));
        }
        return p002kotlin.jvm.internal.saneness.attabal(pairArr);
    }

    public final attabal marial() {
        attabal attabalVar = new attabal();
        p002kotlin.collections.cord.trm(attabalVar.competently(), this.namesAndValues);
        return attabalVar;
    }

    public final String saneness(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return INSTANCE.beachfront(this.namesAndValues, name);
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final List<String> taiyuan(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int size = size();
        ArrayList arrayList = null;
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (p002kotlin.text.dovishness.stratoscope(name, wireman(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(impromptu(i));
            }
            i = i2;
        }
        if (arrayList == null) {
            return p002kotlin.collections.adultoid.formularize();
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            String strWireman = wireman(i);
            String strImpromptu = impromptu(i);
            sb.append(strWireman);
            sb.append(": ");
            if (hereditist.wireman.supplicat(strWireman)) {
                strImpromptu = "██";
            }
            sb.append(strImpromptu);
            sb.append("\n");
            i = i2;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String wireman(int index) {
        return this.namesAndValues[index * 2];
    }

    public molybdenite(String[] strArr) {
        this.namesAndValues = strArr;
    }
}

package foreshot;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.IndexedValue;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.polder;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;

/* JADX INFO: compiled from: JvmNameResolverBase.kt */
/* JADX INFO: loaded from: classes5.dex */
public class competently implements genesis.dern {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final List<String> f26268beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final Map<String, Integer> f26269competently;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final String f26270marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final attabal f26271wireman = new attabal(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String[] f26272attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final List<JvmProtoBuf.StringTableTypes.Record> f26273dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Set<Integer> f26274saneness;

    /* JADX INFO: compiled from: JvmNameResolverBase.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public attabal() {
        }
    }

    /* JADX INFO: compiled from: JvmNameResolverBase.kt */
    public /* synthetic */ class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f26275attabal;

        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f26275attabal = iArr;
        }
    }

    static {
        String strPreterite = CollectionsKt.preterite(adultoid.kowloon('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);
        f26270marial = strPreterite;
        List<String> listKowloon = adultoid.kowloon(strPreterite + "/Any", strPreterite + "/Nothing", strPreterite + "/Unit", strPreterite + "/Throwable", strPreterite + "/Number", strPreterite + "/Byte", strPreterite + "/Double", strPreterite + "/Float", strPreterite + "/Int", strPreterite + "/Long", strPreterite + "/Short", strPreterite + "/Boolean", strPreterite + "/Char", strPreterite + "/CharSequence", strPreterite + "/String", strPreterite + "/Comparable", strPreterite + "/Enum", strPreterite + "/Array", strPreterite + "/ByteArray", strPreterite + "/DoubleArray", strPreterite + "/FloatArray", strPreterite + "/IntArray", strPreterite + "/LongArray", strPreterite + "/ShortArray", strPreterite + "/BooleanArray", strPreterite + "/CharArray", strPreterite + "/Cloneable", strPreterite + "/Annotation", strPreterite + "/collections/Iterable", strPreterite + "/collections/MutableIterable", strPreterite + "/collections/Collection", strPreterite + "/collections/MutableCollection", strPreterite + "/collections/List", strPreterite + "/collections/MutableList", strPreterite + "/collections/Set", strPreterite + "/collections/MutableSet", strPreterite + "/collections/Map", strPreterite + "/collections/MutableMap", strPreterite + "/collections/Map.Entry", strPreterite + "/collections/MutableMap.MutableEntry", strPreterite + "/collections/Iterator", strPreterite + "/collections/MutableIterator", strPreterite + "/collections/ListIterator", strPreterite + "/collections/MutableListIterator");
        f26268beachfront = listKowloon;
        Iterable<IndexedValue> iterableLicking = CollectionsKt.licking(listKowloon);
        LinkedHashMap linkedHashMap = new LinkedHashMap(p002kotlin.ranges.wireman.wireman(polder.marial(dovishness.gintrap(iterableLicking, 10)), 16));
        for (IndexedValue indexedValue : iterableLicking) {
            linkedHashMap.put((String) indexedValue.wireman(), Integer.valueOf(indexedValue.dern()));
        }
        f26269competently = linkedHashMap;
    }

    public competently(String[] strings, Set<Integer> localNameIndices, List<JvmProtoBuf.StringTableTypes.Record> records) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(localNameIndices, "localNameIndices");
        Intrinsics.checkNotNullParameter(records, "records");
        this.f26272attabal = strings;
        this.f26274saneness = localNameIndices;
        this.f26273dern = records;
    }

    @Override // genesis.dern
    public boolean attabal(int i) {
        return this.f26274saneness.contains(Integer.valueOf(i));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    @Override // genesis.dern
    public String getString(int i) {
        String strSubstring;
        JvmProtoBuf.StringTableTypes.Record record = this.f26273dern.get(i);
        if (record.hasString()) {
            strSubstring = record.getString();
        } else if (record.hasPredefinedIndex()) {
            List<String> list = f26268beachfront;
            int size = list.size();
            int predefinedIndex = record.getPredefinedIndex();
            if (predefinedIndex < 0 || predefinedIndex >= size) {
                strSubstring = this.f26272attabal[i];
            } else {
                strSubstring = list.get(record.getPredefinedIndex());
            }
        } else {
            strSubstring = this.f26272attabal[i];
        }
        if (record.getSubstringIndexCount() >= 2) {
            List<Integer> substringIndexList = record.getSubstringIndexList();
            Intrinsics.beachfront(substringIndexList);
            Integer num = substringIndexList.get(0);
            Integer num2 = substringIndexList.get(1);
            Intrinsics.beachfront(num);
            if (num.intValue() >= 0) {
                int iIntValue = num.intValue();
                Intrinsics.beachfront(num2);
                if (iIntValue <= num2.intValue() && num2.intValue() <= strSubstring.length()) {
                    Intrinsics.beachfront(strSubstring);
                    strSubstring = strSubstring.substring(num.intValue(), num2.intValue());
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                }
            }
        }
        String strMerc = strSubstring;
        if (record.getReplaceCharCount() >= 2) {
            List<Integer> replaceCharList = record.getReplaceCharList();
            Intrinsics.beachfront(replaceCharList);
            Integer num3 = replaceCharList.get(0);
            Integer num4 = replaceCharList.get(1);
            Intrinsics.beachfront(strMerc);
            strMerc = p002kotlin.text.dovishness.merc(strMerc, (char) num3.intValue(), (char) num4.intValue(), false, 4, null);
        }
        String strMerc2 = strMerc;
        JvmProtoBuf.StringTableTypes.Record.Operation operation = record.getOperation();
        if (operation == null) {
            operation = JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
        }
        int i2 = saneness.f26275attabal[operation.ordinal()];
        if (i2 == 2) {
            Intrinsics.beachfront(strMerc2);
            strMerc2 = p002kotlin.text.dovishness.merc(strMerc2, '$', '.', false, 4, null);
        } else if (i2 == 3) {
            if (strMerc2.length() >= 2) {
                Intrinsics.beachfront(strMerc2);
                strMerc2 = strMerc2.substring(1, strMerc2.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strMerc2, "substring(...)");
            }
            String str = strMerc2;
            Intrinsics.beachfront(str);
            strMerc2 = p002kotlin.text.dovishness.merc(str, '$', '.', false, 4, null);
        }
        Intrinsics.beachfront(strMerc2);
        return strMerc2;
    }

    @Override // genesis.dern
    public String saneness(int i) {
        return getString(i);
    }
}

package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import android.support.v4.media.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.IndexingIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public class JvmNameResolverBase implements NameResolver {
    public static final List d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f44155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f44156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f44157c;

    public static final class Companion {
    }

    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        String strD = CollectionsKt.D(CollectionsKt.I('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List listI = CollectionsKt.I(a.m(strD, "/Any"), a.m(strD, "/Nothing"), a.m(strD, "/Unit"), a.m(strD, "/Throwable"), a.m(strD, "/Number"), a.m(strD, "/Byte"), a.m(strD, "/Double"), a.m(strD, "/Float"), a.m(strD, "/Int"), a.m(strD, "/Long"), a.m(strD, "/Short"), a.m(strD, "/Boolean"), a.m(strD, "/Char"), a.m(strD, "/CharSequence"), a.m(strD, "/String"), a.m(strD, "/Comparable"), a.m(strD, "/Enum"), a.m(strD, "/Array"), a.m(strD, "/ByteArray"), a.m(strD, "/DoubleArray"), a.m(strD, "/FloatArray"), a.m(strD, "/IntArray"), a.m(strD, "/LongArray"), a.m(strD, "/ShortArray"), a.m(strD, "/BooleanArray"), a.m(strD, "/CharArray"), a.m(strD, "/Cloneable"), a.m(strD, "/Annotation"), a.m(strD, "/collections/Iterable"), a.m(strD, "/collections/MutableIterable"), a.m(strD, "/collections/Collection"), a.m(strD, "/collections/MutableCollection"), a.m(strD, "/collections/List"), a.m(strD, "/collections/MutableList"), a.m(strD, "/collections/Set"), a.m(strD, "/collections/MutableSet"), a.m(strD, "/collections/Map"), a.m(strD, "/collections/MutableMap"), a.m(strD, "/collections/Map.Entry"), a.m(strD, "/collections/MutableMap.MutableEntry"), a.m(strD, "/collections/Iterator"), a.m(strD, "/collections/MutableIterator"), a.m(strD, "/collections/ListIterator"), a.m(strD, "/collections/MutableListIterator"));
        d = listI;
        IndexingIterable indexingIterableM0 = CollectionsKt.m0(listI);
        int iH = MapsKt.h(CollectionsKt.n(indexingIterableM0, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        Iterator it = indexingIterableM0.iterator();
        while (true) {
            IndexingIterator indexingIterator = (IndexingIterator) it;
            if (!indexingIterator.X.hasNext()) {
                return;
            }
            IndexedValue indexedValue = (IndexedValue) indexingIterator.next();
            linkedHashMap.put((String) indexedValue.f43275b, Integer.valueOf(indexedValue.f43274a));
        }
    }

    public JvmNameResolverBase(String[] strings, Set set, ArrayList arrayList) {
        Intrinsics.f(strings, "strings");
        this.f44155a = strings;
        this.f44156b = set;
        this.f44157c = arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public final boolean a(int i2) {
        return this.f44156b.contains(Integer.valueOf(i2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public final String b(int i2) {
        return getString(i2);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public final String getString(int i2) {
        String string;
        JvmProtoBuf.StringTableTypes.Record record = (JvmProtoBuf.StringTableTypes.Record) this.f44157c.get(i2);
        int i3 = record.f44144Y;
        if ((i3 & 4) == 4) {
            Object obj = record.f0;
            if (obj instanceof String) {
                string = (String) obj;
            } else {
                ByteString byteString = (ByteString) obj;
                String strV = byteString.v();
                if (byteString.i()) {
                    record.f0 = strV;
                }
                string = strV;
            }
        } else if ((i3 & 2) == 2) {
            List list = d;
            int size = list.size();
            int i4 = record.e0;
            if (i4 < 0 || i4 >= size) {
                string = this.f44155a[i2];
            } else {
                string = (String) list.get(i4);
            }
        } else {
            string = this.f44155a[i2];
        }
        if (record.h0.size() >= 2) {
            List substringIndexList = record.h0;
            Intrinsics.e(substringIndexList, "substringIndexList");
            Integer begin = (Integer) substringIndexList.get(0);
            Integer end = (Integer) substringIndexList.get(1);
            Intrinsics.e(begin, "begin");
            if (begin.intValue() >= 0) {
                int iIntValue = begin.intValue();
                Intrinsics.e(end, "end");
                if (iIntValue <= end.intValue() && end.intValue() <= string.length()) {
                    string = string.substring(begin.intValue(), end.intValue());
                    Intrinsics.e(string, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
        }
        if (record.j0.size() >= 2) {
            List replaceCharList = record.j0;
            Intrinsics.e(replaceCharList, "replaceCharList");
            Integer num = (Integer) replaceCharList.get(0);
            Integer num2 = (Integer) replaceCharList.get(1);
            Intrinsics.e(string, "string");
            string = StringsKt.H(string, (char) num.intValue(), (char) num2.intValue());
        }
        JvmProtoBuf.StringTableTypes.Record.Operation operation = record.g0;
        if (operation == null) {
            operation = JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
        }
        int iOrdinal = operation.ordinal();
        if (iOrdinal == 1) {
            Intrinsics.e(string, "string");
            string = StringsKt.H(string, '$', '.');
        } else if (iOrdinal == 2) {
            if (string.length() >= 2) {
                string = string.substring(1, string.length() - 1);
                Intrinsics.e(string, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            string = StringsKt.H(string, '$', '.');
        }
        Intrinsics.e(string, "string");
        return string;
    }
}

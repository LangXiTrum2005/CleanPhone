package androidx.room.util;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TableInfoKt {
    public static final boolean a(String current, String str) {
        Intrinsics.f(current, "current");
        if (current.equals(str)) {
            return true;
        }
        if (current.length() != 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < current.length()) {
                char cCharAt = current.charAt(i2);
                int i5 = i4 + 1;
                if (i4 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i3++;
                    } else if (cCharAt == ')' && (i3 = i3 - 1) == 0 && i4 != current.length() - 1) {
                    }
                    i2++;
                    i4 = i5;
                }
            }
            if (i3 == 0) {
                String strSubstring = current.substring(1, current.length() - 1);
                Intrinsics.e(strSubstring, "substring(...)");
                return Intrinsics.a(StringsKt.a0(strSubstring).toString(), str);
            }
        }
        return false;
    }

    public static final String b(Collection collection) {
        Intrinsics.f(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return StringsKt.B(CollectionsKt.D(collection, ",\n", IOUtils.LINE_SEPARATOR_UNIX, IOUtils.LINE_SEPARATOR_UNIX, null, 56)) + "},";
    }

    public static final String c(Collection collection) {
        return StringsKt.B(CollectionsKt.D(collection, ",", null, null, null, 62)) + StringsKt.B(" }");
    }

    public static final String d(Collection collection) {
        return StringsKt.B(CollectionsKt.D(collection, ",", null, null, null, 62)) + StringsKt.B("},");
    }
}

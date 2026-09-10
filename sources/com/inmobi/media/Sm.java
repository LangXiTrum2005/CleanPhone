package com.inmobi.media;

import androidx.media3.common.dovishness;
import androidx.media3.exoplayer.overspeculate;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Sm {
    public static final void a(String str) {
        try {
            int i = overspeculate.f12177unconsolidated;
            if (str == null || str.length() == 0) {
                return;
            }
            String str2 = null;
            try {
                HashSet<String> hashSet = dovishness.f10840attabal;
                Field declaredField = dovishness.class.getDeclaredField("VERSION");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                String str3 = obj instanceof String ? (String) obj : null;
                if (str3 != null && !StringsKt.empress(str3)) {
                    str2 = str3;
                }
            } catch (Throwable unused) {
            }
            if (str2 == null) {
                throw new C3203rg(8800);
            }
            Mi miB = b(str2);
            if (miB == null) {
                throw new C3203rg(8802);
            }
            Mi miB2 = b(str);
            if (miB2 == null) {
                throw new C3203rg(8803);
            }
            int i2 = miB.a;
            int i3 = miB2.a;
            if (i2 >= i3) {
                if (i2 != i3 || miB.b > miB2.b) {
                    throw new C3203rg(8804);
                }
            }
        } catch (ClassNotFoundException unused2) {
            throw new C3203rg(8800);
        }
    }

    public static final Mi b(String str) {
        List listSplit$default = StringsKt.split$default(str, new String[]{"."}, false, 3, 2, null);
        if (listSplit$default.size() < 2) {
            return null;
        }
        int iC = c((String) listSplit$default.get(0));
        int iC2 = c((String) listSplit$default.get(1));
        int iC3 = listSplit$default.size() >= 3 ? c((String) listSplit$default.get(2)) : 0;
        if (iC < 0 || iC2 < 0) {
            return null;
        }
        return new Mi(iC, iC2, iC3);
    }

    public static final int c(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                str = str.substring(0, i);
                Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
                break;
            }
        }
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }
}

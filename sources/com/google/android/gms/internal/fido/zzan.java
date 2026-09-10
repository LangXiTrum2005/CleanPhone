package com.google.android.gms.internal.fido;

import android.support.v4.media.a;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zzan {
    public static String zza(@CheckForNull String str, @CheckForNull Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strN;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i3 >= length) {
                break;
            }
            Object obj = objArr[i3];
            if (obj == null) {
                strN = AbstractJsonLexerKt.NULL;
            } else {
                try {
                    strN = obj.toString();
                } catch (Exception e2) {
                    String strD = a.D(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strD), (Throwable) e2);
                    strN = androidx.datastore.preferences.protobuf.a.n("<", strD, " threw ", e2.getClass().getName(), ">");
                }
            }
            objArr[i3] = strN;
            i3++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i4 = 0;
        while (true) {
            length2 = objArr.length;
            if (i2 >= length2 || (iIndexOf = str.indexOf("%s", i4)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i4, iIndexOf);
            sb.append(objArr[i2]);
            i2++;
            i4 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i4, str.length());
        if (i2 < length2) {
            sb.append(" [");
            sb.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb.append(", ");
                sb.append(objArr[i5]);
            }
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }
}

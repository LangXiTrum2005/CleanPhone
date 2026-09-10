package saneness;

import ads_mobile_sdk.dg2;
import ads_mobile_sdk.zt0;
import android.webkit.WebResourceResponse;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class creditor {
    /* JADX WARN: Code duplicated, block: B:40:0x00be A[PHI: r0
  0x00be: PHI (r0v5 java.lang.String) = 
  (r0v4 java.lang.String)
  (r0v9 java.lang.String)
  (r0v9 java.lang.String)
  (r0v9 java.lang.String)
  (r0v9 java.lang.String)
  (r0v9 java.lang.String)
 binds: [B:14:0x003f, B:31:0x0097, B:33:0x009f, B:35:0x00a9, B:37:0x00b6, B:39:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    public static final WebResourceResponse attabal(zt0 zt0Var) {
        Object next;
        String str;
        String str2;
        Object next2;
        String strBasify;
        String string;
        Intrinsics.checkNotNullParameter(zt0Var, "<this>");
        Iterator it = zt0Var.c.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p002kotlin.text.dovishness.stratoscope((String) ((Map.Entry) next).getKey(), "Content-Type", true));
        Map.Entry entry = (Map.Entry) next;
        String str3 = entry != null ? (String) entry.getValue() : null;
        String str4 = "text/html";
        if (str3 != null) {
            List listSplit$default = StringsKt.split$default(str3, new String[]{";"}, false, 0, 6, null);
            String str5 = (String) CollectionsKt.firstOrNull(listSplit$default);
            String string2 = str5 != null ? StringsKt.stupefactive(str5).toString() : null;
            if (string2 != null && StringsKt.overspeculate(string2, "/", false, 2, null)) {
                str4 = string2;
            }
            Iterator it2 = CollectionsKt.premeiotic(listSplit$default, 1).iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!p002kotlin.text.dovishness.privatdozent(StringsKt.stupefactive((String) next2).toString(), "charset=", true));
            String str6 = (String) next2;
            if (str6 == null || (strBasify = StringsKt.basify(str6, X3.j.b, str6)) == null || (string = StringsKt.stupefactive(strBasify).toString()) == null) {
                str = str4;
                str2 = C.UTF8_NAME;
            } else {
                String upperCase = string.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                if (upperCase == null || upperCase.length() == 0) {
                    str = str4;
                    str2 = C.UTF8_NAME;
                } else {
                    str = str4;
                    str2 = upperCase;
                }
            }
        } else {
            str = str4;
            str2 = C.UTF8_NAME;
        }
        int i = zt0Var.a;
        String str7 = zt0Var.b;
        if (str7 == null || str7.length() == 0) {
            str7 = "OK";
        }
        String str8 = str7;
        Map map = zt0Var.c;
        dg2 dg2Var = zt0Var.d;
        return new WebResourceResponse(str, str2, i, str8, map, dg2Var != null ? new ByteArrayInputStream(dg2Var.a) : null);
    }
}

package saneness;

import ads_mobile_sdk.cb1;
import ads_mobile_sdk.k7;
import ads_mobile_sdk.m7;
import com.google.android.libraries.ads.mobile.sdk.common.PrecisionType;
import com.google.gson.JsonObject;
import com.ironsource.X3;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class sequal {
    public static k7 attabal(JsonObject json) {
        PrecisionType precisionType;
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            haemocyte haemocyteVar = m7.b;
            Intrinsics.checkNotNullParameter(json, "<this>");
            Intrinsics.checkNotNullParameter("type_num", X3.i.W);
            int asInt = json.get("type_num").getAsInt();
            haemocyteVar.getClass();
            m7 m7VarAttabal = haemocyte.attabal(asInt);
            Intrinsics.checkNotNullParameter(json, "<this>");
            Intrinsics.checkNotNullParameter("value", X3.i.W);
            long asLong = json.get("value").getAsLong();
            Intrinsics.checkNotNullParameter(json, "<this>");
            Intrinsics.checkNotNullParameter("precision_num", X3.i.W);
            int asInt2 = json.get("precision_num").getAsInt();
            if (asInt2 == 1) {
                precisionType = PrecisionType.ESTIMATED;
            } else if (asInt2 != 2) {
                precisionType = asInt2 != 3 ? PrecisionType.UNKNOWN : PrecisionType.PRECISE;
            } else {
                precisionType = PrecisionType.PUBLISHER_PROVIDED;
            }
            PrecisionType precisionType2 = precisionType;
            Intrinsics.checkNotNullParameter(json, "<this>");
            Intrinsics.checkNotNullParameter("currency", X3.i.W);
            String asString = json.get("currency").getAsString();
            Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
            return new k7(m7VarAttabal, asLong, precisionType2, asString);
        } catch (Exception e) {
            List list = rajahmundry.attabal(e, "t", e).s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            Intrinsics.beachfront(message);
            list.add(message);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:40:0x0094  */
    public static k7 saneness(JsonObject json) {
        m7 m7Var;
        PrecisionType precisionType;
        Intrinsics.checkNotNullParameter(json, "json");
        String strA = cb1.a(json, "type", "");
        String strA2 = cb1.a(json, "precision", "");
        String strA3 = cb1.a(json, "currency", "");
        long jE = cb1.e(json, "value");
        int iHashCode = strA.hashCode();
        if (iHashCode != 66934) {
            if (iHashCode != 66944) {
                if (iHashCode == 1349395245 && strA.equals("ONE_PIXEL")) {
                    jE /= (long) 1000;
                    m7Var = m7.ONE_PIXEL;
                } else {
                    m7Var = m7.UNKNOWN;
                }
            } else if (strA.equals("CPM")) {
                m7Var = m7.CPM;
            } else {
                m7Var = m7.UNKNOWN;
            }
        } else if (strA.equals("CPC")) {
            m7Var = m7.CPC;
        } else {
            m7Var = m7.UNKNOWN;
        }
        m7 m7Var2 = m7Var;
        long j = jE;
        int iHashCode2 = strA2.hashCode();
        if (iHashCode2 != -2131980260) {
            if (iHashCode2 != 399232571) {
                if (iHashCode2 == 1271254246 && strA2.equals("PUBLISHER_PROVIDED")) {
                    precisionType = PrecisionType.PUBLISHER_PROVIDED;
                } else {
                    precisionType = PrecisionType.UNKNOWN;
                }
            } else if (strA2.equals("PRECISE")) {
                precisionType = PrecisionType.PRECISE;
            } else {
                precisionType = PrecisionType.UNKNOWN;
            }
        } else if (strA2.equals("ESTIMATED")) {
            precisionType = PrecisionType.ESTIMATED;
        } else {
            precisionType = PrecisionType.UNKNOWN;
        }
        return new k7(m7Var2, j, precisionType, strA3);
    }
}

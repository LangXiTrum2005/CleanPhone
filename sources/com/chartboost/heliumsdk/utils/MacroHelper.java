package com.chartboost.heliumsdk.utils;

import android.net.Uri;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/chartboost/heliumsdk/utils/MacroHelper;", "", "timestamp", "", "customData", "", "adRevenue", "", "cpmPrice", "networkName", "(JLjava/lang/String;DDLjava/lang/String;)V", "prettyPrintDouble", "value", "useNullValues", "", "replaceMacros", "data", "urlEncode", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MacroHelper {
    private static final String AD_REVENUE_MACRO = "%%AD_REVENUE%%";
    private static final String CPM_PRICE_MACRO = "%%CPM_PRICE%%";
    private static final String CUSTOM_DATA_MACRO = "%%CUSTOM_DATA%%";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String NETWORK_NAME_MACRO = "%%NETWORK_NAME%%";
    private static final String SDK_TIMESTAMP_MACRO = "%%SDK_TIMESTAMP%%";
    private final double adRevenue;
    private final double cpmPrice;
    private final String customData;
    private final String networkName;
    private final long timestamp;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/chartboost/heliumsdk/utils/MacroHelper$Companion;", "", "()V", "AD_REVENUE_MACRO", "", "CPM_PRICE_MACRO", "CUSTOM_DATA_MACRO", "NETWORK_NAME_MACRO", "SDK_TIMESTAMP_MACRO", "scrubNulls", "", "json", "Lorg/json/JSONObject;", "scrubNullsJsonArray", "array", "Lorg/json/JSONArray;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void scrubNullsJsonArray(JSONArray array) {
            int i2 = 0;
            while (i2 < array.length()) {
                Object objOpt = array.opt(i2);
                if (objOpt == null || JSONObject.NULL.equals(objOpt)) {
                    array.remove(i2);
                } else {
                    if (objOpt instanceof JSONObject) {
                        scrubNulls((JSONObject) objOpt);
                    } else if (objOpt instanceof JSONArray) {
                        scrubNullsJsonArray((JSONArray) objOpt);
                    }
                    i2++;
                }
            }
        }

        public final void scrubNulls(JSONObject json) {
            Intrinsics.f(json, "json");
            Iterator<String> itKeys = json.keys();
            while (itKeys.hasNext()) {
                Object objOpt = json.opt(itKeys.next());
                if (objOpt == null || JSONObject.NULL.equals(objOpt)) {
                    itKeys.remove();
                } else if (objOpt instanceof JSONObject) {
                    scrubNulls((JSONObject) objOpt);
                } else if (objOpt instanceof JSONArray) {
                    scrubNullsJsonArray((JSONArray) objOpt);
                }
            }
        }

        private Companion() {
        }
    }

    public MacroHelper(long j, String str, double d, double d2, String networkName) {
        Intrinsics.f(networkName, "networkName");
        this.timestamp = j;
        this.customData = str;
        this.adRevenue = d;
        this.cpmPrice = d2;
        this.networkName = networkName;
    }

    private final String prettyPrintDouble(double value, boolean useNullValues) {
        if (Double.isNaN(value) || Double.isInfinite(value)) {
            return useNullValues ? AbstractJsonLexerKt.NULL : "";
        }
        return String.valueOf(value);
    }

    public static /* synthetic */ String replaceMacros$default(MacroHelper macroHelper, String str, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return macroHelper.replaceMacros(str, z2);
    }

    public final String replaceMacros(String data, boolean urlEncode) {
        Intrinsics.f(data, "data");
        String strI = StringsKt.I(data, SDK_TIMESTAMP_MACRO, String.valueOf(this.timestamp));
        String strEncode = this.customData;
        if (urlEncode) {
            strEncode = Uri.encode(strEncode);
        }
        if (strEncode == null) {
            strEncode = "";
        }
        String strI2 = StringsKt.I(strI, CUSTOM_DATA_MACRO, strEncode);
        boolean z2 = !urlEncode;
        String strI3 = StringsKt.I(StringsKt.I(strI2, AD_REVENUE_MACRO, prettyPrintDouble(this.adRevenue, z2)), CPM_PRICE_MACRO, prettyPrintDouble(this.cpmPrice, z2));
        String strEncode2 = urlEncode ? Uri.encode(this.networkName) : this.networkName;
        return StringsKt.I(strI3, NETWORK_NAME_MACRO, strEncode2 != null ? strEncode2 : "");
    }
}

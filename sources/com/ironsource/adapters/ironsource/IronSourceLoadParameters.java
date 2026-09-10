package com.ironsource.adapters.ironsource;

import com.ironsource.X3;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface IronSourceLoadParameters {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Base implements IronSourceLoadParameters {
        private final JSONObject loadConfig;
        private final String serverData;

        public Base(JSONObject loadConfig, String str) {
            n.f(loadConfig, "loadConfig");
            this.loadConfig = loadConfig;
            this.serverData = str;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public JSONObject config() {
            return this.loadConfig;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public boolean demandOnly() {
            return this.loadConfig.optBoolean(Constants.DEMAND_ONLY, false);
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public HashMap<String, String> value() {
            HashMap<String, String> map = new HashMap<>();
            map.put("isOneFlow", String.valueOf(this.loadConfig.optBoolean("isOneFlow")));
            if (this.serverData != null) {
                String strA = d.b().a(this.serverData);
                n.e(strA, "getInstance().getAdmFromServerData(serverData)");
                map.put("adm", strA);
                map.putAll(d.b().b(this.serverData));
            }
            return map;
        }

        public /* synthetic */ Base(JSONObject jSONObject, String str, int i10, g gVar) {
            this(jSONObject, (i10 & 2) != 0 ? null : str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Constants {
        public static final String ADM_KEY = "adm";
        public static final String DEMAND_ONLY = "demandOnly";
        public static final Constants INSTANCE = new Constants();
        public static final String ONE_FLOW_KEY = "isOneFlow";

        private Constants() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class WithLog implements IronSourceLoadParameters {
        private final IronSourceLoadParameters loadParameters;

        public WithLog(IronSourceLoadParameters loadParameters) {
            n.f(loadParameters, "loadParameters");
            this.loadParameters = loadParameters;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public JSONObject config() {
            return this.loadParameters.config();
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public boolean demandOnly() {
            return this.loadParameters.demandOnly();
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public HashMap<String, String> value() {
            HashMap<String, String> mapValue = this.loadParameters.value();
            if (!mapValue.isEmpty()) {
                IronLog.ADAPTER_API.verbose("instance extra params:");
                for (String str : mapValue.keySet()) {
                    IronLog.ADAPTER_API.verbose(str + X3.j.f27830b + ((Object) mapValue.get(str)));
                }
            }
            return mapValue;
        }
    }

    JSONObject config();

    boolean demandOnly();

    HashMap<String, String> value();
}

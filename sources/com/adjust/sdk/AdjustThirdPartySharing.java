package com.adjust.sdk;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AdjustThirdPartySharing {
    Boolean isEnabled;
    Map<String, Map<String, String>> granularOptions = new HashMap();
    Map<String, Map<String, Boolean>> partnerSharingSettings = new HashMap();

    public AdjustThirdPartySharing(Boolean bool) {
        this.isEnabled = bool;
    }

    public void addGranularOption(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            AdjustFactory.getLogger().error("Cannot add granular option with any null value", new Object[0]);
            return;
        }
        Map<String, String> map = this.granularOptions.get(str);
        if (map == null) {
            map = new HashMap<>();
            this.granularOptions.put(str, map);
        }
        map.put(str2, str3);
    }

    public void addPartnerSharingSetting(String str, String str2, boolean z10) {
        if (str == null || str2 == null) {
            AdjustFactory.getLogger().error("Cannot add partner sharing setting with any null value", new Object[0]);
            return;
        }
        Map<String, Boolean> map = this.partnerSharingSettings.get(str);
        if (map == null) {
            map = new HashMap<>();
            this.partnerSharingSettings.put(str, map);
        }
        map.put(str2, Boolean.valueOf(z10));
    }

    public Boolean getEnabled() {
        return this.isEnabled;
    }

    public Map<String, Map<String, String>> getGranularOptions() {
        return this.granularOptions;
    }

    public Map<String, Map<String, Boolean>> getPartnerSharingSettings() {
        return this.partnerSharingSettings;
    }
}

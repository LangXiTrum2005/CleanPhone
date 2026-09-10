package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AdjustThirdPartySharingResult {
    private final String thirdPartySharingSettingsJson;

    public AdjustThirdPartySharingResult(String str) {
        this.thirdPartySharingSettingsJson = str;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdjustThirdPartySharingResult) {
            return Util.equalString(this.thirdPartySharingSettingsJson, ((AdjustThirdPartySharingResult) obj).thirdPartySharingSettingsJson);
        }
        return false;
    }

    public String getThirdPartySharingSettingsJson() {
        return this.thirdPartySharingSettingsJson;
    }

    public int hashCode() {
        String str = this.thirdPartySharingSettingsJson;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}

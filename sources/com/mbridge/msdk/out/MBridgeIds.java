package com.mbridge.msdk.out;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.mbridge.msdk.system.NoProGuard;
import defpackage.e;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBridgeIds implements Serializable, NoProGuard {
    private String contextId;
    private String placementId;
    private String requestId;
    private String unitId;
    private String bidToken = "";
    private boolean isCache = false;

    public MBridgeIds() {
    }

    public String getBidToken() {
        if (TextUtils.isEmpty(this.bidToken)) {
            this.bidToken = "";
        }
        return this.bidToken;
    }

    public String getContextId() {
        return this.contextId;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public String getRequestId() {
        return TextUtils.isEmpty(this.requestId) ? "" : this.requestId;
    }

    public String getUnitId() {
        return this.unitId;
    }

    public boolean isCache() {
        return this.isCache;
    }

    public void setBidToken(String str) {
        this.bidToken = str;
    }

    public void setCache(boolean z10) {
        this.isCache = z10;
    }

    public void setContextId(String str) {
        this.contextId = str;
    }

    public void setPlacementId(String str) {
        this.placementId = str;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MBridgeIds{placementId='");
        sb2.append(this.placementId);
        sb2.append("', unitId='");
        sb2.append(this.unitId);
        sb2.append("', bidToken='");
        return e.q(this.bidToken, "'}", sb2);
    }

    public MBridgeIds(String str, String str2) {
        this.placementId = str;
        this.unitId = str2;
    }

    public MBridgeIds(String str, String str2, String str3) {
        this.placementId = str;
        this.unitId = str2;
        this.requestId = str3;
    }
}

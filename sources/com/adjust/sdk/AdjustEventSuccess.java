package com.adjust.sdk;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AdjustEventSuccess {
    public String adid;
    public String callbackId;
    public String eventToken;
    public JSONObject jsonResponse;
    public String message;
    public String timestamp;

    public String toString() {
        return Util.formatString("Event Success msg:%s time:%s adid:%s event:%s cid:%s json:%s", this.message, this.timestamp, this.adid, this.eventToken, this.callbackId, this.jsonResponse);
    }
}

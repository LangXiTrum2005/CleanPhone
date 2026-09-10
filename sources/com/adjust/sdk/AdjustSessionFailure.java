package com.adjust.sdk;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AdjustSessionFailure {
    public String adid;
    public JSONObject jsonResponse;
    public String message;
    public String timestamp;
    public boolean willRetry;

    public String toString() {
        return Util.formatString("Session Failure msg:%s time:%s adid:%s retry:%b json:%s", this.message, this.timestamp, this.adid, Boolean.valueOf(this.willRetry), this.jsonResponse);
    }
}

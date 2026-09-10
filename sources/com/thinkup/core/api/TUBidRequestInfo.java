package com.thinkup.core.api;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TUBidRequestInfo {
    public static final String BIDDING_REQUEST_TIMEOUT_TYPE = "Request Timeout.";
    public static final String BIDTOKEN_EMPTY_ERROR_TYPE = "Network BidToken or Custom bid info is Empty.";
    public static final String BIDTOKEN_OBTAIN_TIMEOUT_TYPE = "Request Token or Custom bid info Timeout.";
    public static final String BID_TYPE_ERROR_TYPE = "cpc bid type";
    public static final String INIT_ERROR_TYPE = "Network init error.";
    public static final String JAD_PRICE_EXCEPTION_TYPE = "JAD returns unusually high prices";
    public static final String LESS_THAN_BID_FLOOR_TYPE = "less than bid floor";
    public static final String NO_ADAPTER_ERROR_TYPE = "There is no Network Adapter.";
    public static final String NO_SUPPORT_BIDDING_TYPE = "This network don't support header bidding in current TopOn's version.";
    public static final String RETURN_PARAMS_ERROR_TYPE = "The parameter is abnormal.";

    public abstract JSONObject toRequestJSONObject();
}

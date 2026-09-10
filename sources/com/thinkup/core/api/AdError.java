package com.thinkup.core.api;

import android.support.v4.media.a;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class AdError {
    protected String code;
    protected String desc;
    protected String itemsErrorInfo = "";
    protected String platformCode;
    protected String platformMSG;

    public AdError(String str, String str2, String str3, String str4) {
        this.code = str;
        this.desc = str2;
        this.platformCode = str3;
        this.platformMSG = str4;
    }

    public String getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getFullErrorInfo() {
        if (!TextUtils.isEmpty(this.itemsErrorInfo)) {
            StringBuilder sb = new StringBuilder("\ncode[ ");
            sb.append(this.code);
            sb.append(" ]\ndesc[ ");
            sb.append(this.desc);
            sb.append(" ]\ndetail[ ");
            return a.r(sb, this.itemsErrorInfo, " \n]");
        }
        StringBuilder sb2 = new StringBuilder("code:[ ");
        sb2.append(this.code);
        sb2.append(" ]desc:[ ");
        sb2.append(this.desc);
        sb2.append(" ]platformCode:[ ");
        sb2.append(this.platformCode);
        sb2.append(" ]platformMSG:[ ");
        return a.r(sb2, this.platformMSG, " ]");
    }

    public String getPlatformCode() {
        return this.platformCode;
    }

    public String getPlatformMSG() {
        return this.platformMSG;
    }

    public String printStackTrace() {
        StringBuilder sb = new StringBuilder("code:[ ");
        sb.append(this.code);
        sb.append(" ]desc:[ ");
        sb.append(this.desc);
        sb.append(" ]platformCode:[ ");
        sb.append(this.platformCode);
        sb.append(" ]platformMSG:[ ");
        return a.r(sb, this.platformMSG, " ]");
    }

    public void putNetworkErrorMsg(String str, int i2, String str2, AdError adError) {
        this.platformCode = adError.platformCode;
        this.platformMSG = adError.platformMSG;
        StringBuilder sb = new StringBuilder();
        androidx.media3.extractor.text.ttml.a.C(sb, this.itemsErrorInfo, "\n  { ad_source_id[ ", str, " ];network_firm_id[ ");
        sb.append(i2);
        sb.append(" ];network_name=[ ");
        sb.append(str2);
        sb.append(" ];network_error:[ ");
        sb.append(adError.printStackTrace());
        sb.append(" ] }");
        this.itemsErrorInfo = sb.toString();
    }

    public String toString() {
        return printStackTrace();
    }
}

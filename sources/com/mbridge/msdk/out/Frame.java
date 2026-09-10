package com.mbridge.msdk.out;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class Frame {
    private List<CampaignEx> campaigns;
    private String parentSessionId;
    private String sessionId;
    private int template;

    public List<CampaignEx> getCampaigns() {
        return this.campaigns;
    }

    public String getParentSessionId() {
        return this.parentSessionId;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public int getTemplate() {
        return this.template;
    }

    public void setCampaigns(List<CampaignEx> list) {
        this.campaigns = list;
    }

    public void setParentSessionId(String str) {
        this.parentSessionId = str;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public void setTemplate(int i10) {
        this.template = i10;
    }
}

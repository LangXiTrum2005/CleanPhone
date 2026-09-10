package com.bytedance.sdk.openadsdk.api;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class PAGRequest {
    private Bundle lnr = null;
    private String qdl;
    private Map<String, Object> ud;

    public final void addNetworkExtrasBundle(Class<?> cls, Bundle bundle) {
        if (this.lnr == null) {
            this.lnr = new Bundle();
        }
        this.lnr.putBundle(cls.getName(), bundle);
    }

    public String getAdString() {
        return this.qdl;
    }

    public Map<String, Object> getExtraInfo() {
        return this.ud;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.lnr;
    }

    public void setAdString(String str) {
        this.qdl = str;
    }

    public void setExtraInfo(Map<String, Object> map) {
        this.ud = map;
    }
}

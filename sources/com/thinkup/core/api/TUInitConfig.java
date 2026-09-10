package com.thinkup.core.api;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TUInitConfig {
    protected TUInitMediation initMediation;
    protected Map<String, Object> paramMap = new HashMap(4);

    public final TUInitMediation getInitMediation() {
        return this.initMediation;
    }

    public final Map<String, Object> getRequestParamMap() {
        return this.paramMap;
    }
}

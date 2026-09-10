package com.startapp.sdk.adsbase;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseResponse implements Serializable {
    private static final long serialVersionUID = 3276484898993249723L;
    protected Map<String, String> parameters = new HashMap();
    private boolean validResponse = true;
    private String errorMessage = null;

    public final String a() {
        return this.errorMessage;
    }

    public final boolean b() {
        return this.validResponse;
    }
}

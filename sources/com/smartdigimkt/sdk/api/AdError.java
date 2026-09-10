package com.smartdigimkt.sdk.api;

import android.support.v4.media.a;

/* JADX INFO: loaded from: classes6.dex */
public class AdError {
    protected String code;
    protected String message;

    public AdError(String str, String str2) {
        this.code = str;
        this.message = str2;
    }

    public String getCode() {
        return this.code;
    }

    public String getErrorInfo() {
        StringBuilder sb = new StringBuilder("{code='");
        sb.append(this.code);
        sb.append("', message='");
        return a.r(sb, this.message, "'}");
    }

    public String getMessage() {
        return this.message;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdError{code='");
        sb.append(this.code);
        sb.append("', message='");
        return a.r(sb, this.message, "'}");
    }
}

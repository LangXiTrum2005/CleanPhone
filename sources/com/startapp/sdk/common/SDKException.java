package com.startapp.sdk.common;

import android.net.Uri;
import android.support.v4.media.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class SDKException extends Exception {
    private static final long serialVersionUID = 1203685012128929267L;
    private String method;
    private boolean retry;
    private int statusCode;
    private Uri uri;

    public SDKException(String str, Uri uri, int i2, boolean z2, IOException iOException) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        sb.append(uri);
        sb.append(i2 != 0 ? a.h(i2, ", status ") : "");
        sb.append(z2 ? ", retry" : "");
        super(sb.toString(), iOException);
        this.method = str;
        this.uri = uri;
        this.statusCode = i2;
        this.retry = z2;
    }

    public final int a() {
        return this.statusCode;
    }

    public SDKException() {
    }

    public SDKException(String str) {
        super(str);
    }

    public SDKException(String str, Exception exc) {
        super(str, exc);
    }
}

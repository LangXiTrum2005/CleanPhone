package com.thinkup.core.common.on;

import android.text.TextUtils;
import com.thinkup.core.api.TUBaseAdAdapter;

/* JADX INFO: loaded from: classes6.dex */
public final class nm {
    private Throwable m;
    public TUBaseAdAdapter o;

    public nm(TUBaseAdAdapter tUBaseAdAdapter) {
        this.o = tUBaseAdAdapter;
    }

    public final String o(String str) {
        Throwable th = this.m;
        if (th != null && !(th instanceof ClassNotFoundException)) {
            String message = th.getMessage();
            if (!TextUtils.isEmpty(message)) {
                return message;
            }
            String message2 = this.m.getCause() != null ? this.m.getCause().getMessage() : "";
            if (!TextUtils.isEmpty(message2)) {
                return message2;
            }
        }
        return str;
    }

    public nm(Throwable th) {
        this.m = th;
    }
}

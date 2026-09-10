package com.bytedance.sdk.openadsdk.ka.ri;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes2.dex */
public class ka implements com.bytedance.sdk.component.di.ri.ri.fi {
    public static final ka ri = new ka();
    private volatile SQLiteDatabase lr;

    @Override // com.bytedance.sdk.component.di.ri.ri.fi
    public String di() {
        return null;
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.fi
    public String fi() {
        return "logstatsbatch";
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.fi
    public String ik() {
        return null;
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.fi
    public String ka() {
        return "logstats";
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.fi
    public String lr() {
        return "adevent";
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.fi
    public SQLiteDatabase ri(Context context) {
        if (this.lr == null) {
            synchronized (this) {
                try {
                    if (this.lr == null) {
                        this.lr = com.bytedance.sdk.openadsdk.core.di.ri(context).ri().ri();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.lr;
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.fi
    public String ri() {
        return "loghighpriority";
    }
}

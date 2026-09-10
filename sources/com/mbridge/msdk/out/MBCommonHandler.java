package com.mbridge.msdk.out;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class MBCommonHandler {
    protected Context context;
    protected Map<String, Object> properties;

    public MBCommonHandler() {
    }

    public abstract boolean load();

    public abstract void release();

    public MBCommonHandler(Map<String, Object> map, Context context) {
        this.properties = map;
        this.context = context;
    }
}

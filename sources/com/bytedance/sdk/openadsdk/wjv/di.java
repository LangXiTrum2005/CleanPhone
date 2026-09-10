package com.bytedance.sdk.openadsdk.wjv;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface di {
    JSONObject di();

    String fi();

    String ik();

    Handler ka();

    Context lr();

    boolean mj();

    HandlerThread ri(String str, int i);

    ExecutorService ri();

    JSONObject ri(JSONObject jSONObject);

    Map<String, String> xha();
}

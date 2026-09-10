package com.thinkup.core.basead.adx.api;

import android.content.Context;
import com.thinkup.core.basead.o.o0;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class TUAdxAPI {
    public static final String KEY_A_WF_INFO = "key_a_wf_info";

    public static void getAdxAdapterConfig(Context context, String str, Map<String, Object> map, TUAdxAdapterConfigListener tUAdxAdapterConfigListener) {
        o0.o().o(context, str, map, tUAdxAdapterConfigListener);
    }
}

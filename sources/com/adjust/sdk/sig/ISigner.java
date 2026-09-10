package com.adjust.sdk.sig;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface ISigner {
    void onResume();

    void sign(Context context, Map<String, String> map, String str, String str2);

    void sign(Context context, Map<String, String> map, Map<String, String> map2, Map<String, String> map3);
}

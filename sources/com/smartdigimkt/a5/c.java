package com.smartdigimkt.a5;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.smartdigimkt.w6.l;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface c {
    View a(Context context);

    com.smartdigimkt.b5.d a(Context context, l lVar, com.smartdigimkt.v6.a aVar, boolean z2);

    void a(Activity activity, Map<String, Object> map, String str, String str2, String str3);

    void a(ViewGroup viewGroup, Map<String, Object> map, boolean z2);

    void a(com.smartdigimkt.f5.a aVar);

    void b(Activity activity, Map<String, Object> map, String str, String str2, String str3);

    void destroy();

    boolean isAdReady();
}

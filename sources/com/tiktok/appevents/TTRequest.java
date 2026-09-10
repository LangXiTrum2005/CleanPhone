package com.tiktok.appevents;

import android.support.v4.media.a;
import com.mbridge.msdk.foundation.download.Command;
import com.smartdigimkt.o0.b;
import com.tiktok.TikTokBusinessSdk;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes6.dex */
class TTRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f42666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f42667b;

    static {
        String str = TikTokBusinessSdk.f42660a;
        new TreeSet();
        new ArrayList();
        HashMap map = new HashMap();
        f42666a = map;
        f42667b = new HashMap();
        map.put("Content-Type", "application/json");
        map.put("Connection", b.f37292c);
        try {
            Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
        } catch (Throwable unused) {
        }
        String strC = a.C("tiktok-business-android-sdk/1.5.0/", TikTokBusinessSdk.f42660a);
        f42666a.put(Command.HTTP_HEADER_USER_AGENT, strC);
        HashMap map2 = f42667b;
        map2.put("Connection", b.f37292c);
        map2.put(Command.HTTP_HEADER_USER_AGENT, strC);
        map2.put("Content-Type", "application/json");
    }
}

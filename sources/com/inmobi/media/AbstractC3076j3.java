package com.inmobi.media;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.inmobi.media.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3076j3 {
    public static JSONArray a(C3060i3 it, List skipList) {
        Intrinsics.f(it, "it");
        Intrinsics.f(skipList, "skipList");
        JSONArray jSONArray = new JSONArray();
        List list = C3060i3.j;
        if (!skipList.contains("ac")) {
            jSONArray.put(it.f23682a);
        }
        if (!skipList.contains("bid")) {
            jSONArray.put(it.f23683b);
        }
        if (!skipList.contains("its")) {
            jSONArray.put(it.f23684c);
        }
        if (!skipList.contains("vtm")) {
            jSONArray.put(it.d);
        }
        if (!skipList.contains("plid")) {
            jSONArray.put(it.f23685e);
        }
        if (!skipList.contains("catid")) {
            jSONArray.put(it.f);
        }
        if (!skipList.contains("hcd")) {
            jSONArray.put(it.g);
        }
        if (!skipList.contains("hsv")) {
            jSONArray.put(it.f23686h);
        }
        if (!skipList.contains("hcv")) {
            jSONArray.put(it.f23687i);
        }
        return jSONArray;
    }
}

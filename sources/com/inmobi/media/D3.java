package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class D3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f22758a = new HashMap();

    public static Config a(String str, String type) {
        Intrinsics.f(type, "type");
        String strB = b(str, type);
        HashMap map = f22758a;
        Object objA = map.get(strB);
        if (objA == null) {
            Config.Companion.getClass();
            objA = G2.a(type, str);
            map.put(strB, objA);
        }
        return (Config) objA;
    }

    public static String b(String str, String type) {
        Intrinsics.f(type, "type");
        return str + '-' + type;
    }
}

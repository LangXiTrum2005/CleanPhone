package com.blankj.utilcode.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: GsonUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Map<String, Gson> f17493attabal = new ConcurrentHashMap();

    public static Gson attabal() {
        return new GsonBuilder().serializeNulls().disableHtmlEscaping().create();
    }

    public static Gson beachfront() {
        Map<String, Gson> map = f17493attabal;
        Gson gson = map.get("delegateGson");
        if (gson != null) {
            return gson;
        }
        Gson gson2 = map.get("defaultGson");
        if (gson2 != null) {
            return gson2;
        }
        Gson gsonAttabal = attabal();
        map.put("defaultGson", gsonAttabal);
        return gsonAttabal;
    }

    public static void competently(Gson gson) {
        if (gson == null) {
            return;
        }
        f17493attabal.put("delegateGson", gson);
    }

    public static <T> T dern(Gson gson, String str, Type type) {
        return (T) gson.fromJson(str, type);
    }

    public static String impromptu(Gson gson, Object obj) {
        return gson.toJson(obj);
    }

    public static <T> T marial(String str, Type type) {
        return (T) dern(beachfront(), str, type);
    }

    public static <T> T saneness(Gson gson, String str, Class<T> cls) {
        return (T) gson.fromJson(str, (Class) cls);
    }

    public static String taiyuan(Object obj) {
        return impromptu(beachfront(), obj);
    }

    public static <T> T wireman(String str, Class<T> cls) {
        return (T) saneness(beachfront(), str, cls);
    }
}

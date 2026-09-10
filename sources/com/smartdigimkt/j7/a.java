package com.smartdigimkt.j7;

import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f36104a = "a";

    public static void a(com.smartdigimkt.v6.a aVar, Map<String, Object> map) {
        for (Field field : aVar.getClass().getDeclaredFields()) {
            Object obj = map.get(field.getName());
            if (obj != null) {
                try {
                    Class<?> type = field.getType();
                    if (type == Integer.TYPE && (obj instanceof Number)) {
                        field.setInt(aVar, ((Number) obj).intValue());
                    } else if (type == Boolean.TYPE && (obj instanceof Boolean)) {
                        field.setBoolean(aVar, ((Boolean) obj).booleanValue());
                    } else if (type == Long.TYPE && (obj instanceof Number)) {
                        field.setLong(aVar, ((Number) obj).longValue());
                    } else if (type == String.class && (obj instanceof String)) {
                        field.set(aVar, obj);
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }
    }
}

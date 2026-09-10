package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d3 {
    public static Class a(String str) {
        str.getClass();
        switch (str) {
            case "String":
            case "string":
                return String.class;
            case "double":
                return Double.TYPE;
            case "int":
                return Integer.TYPE;
            case "byte":
                return Byte.TYPE;
            case "char":
                return Character.TYPE;
            case "long":
                return Long.TYPE;
            case "boolean":
                return Boolean.TYPE;
            case "float":
                return Float.TYPE;
            case "short":
                return Short.TYPE;
            default:
                return Class.forName(str);
        }
    }

    public static Object a(Class cls, Object obj) {
        if (cls == Byte.TYPE) {
            if (obj instanceof Number) {
                return Byte.valueOf(((Number) obj).byteValue());
            }
        } else if (cls == Short.TYPE) {
            if (obj instanceof Number) {
                return Short.valueOf(((Number) obj).shortValue());
            }
        } else if (cls == Integer.TYPE) {
            if (obj instanceof Number) {
                return Integer.valueOf(((Number) obj).intValue());
            }
        } else if (cls == Long.TYPE) {
            if (obj instanceof Number) {
                return Long.valueOf(((Number) obj).longValue());
            }
        } else if (cls == Float.TYPE) {
            if (obj instanceof Number) {
                return Float.valueOf(((Number) obj).floatValue());
            }
        } else if (cls == Double.TYPE) {
            if (obj instanceof Number) {
                return Double.valueOf(((Number) obj).doubleValue());
            }
        } else if (cls == String.class) {
            if (obj != null) {
                return obj.toString();
            }
        } else if (cls == Boolean.TYPE && (obj instanceof Boolean)) {
            return obj;
        }
        if (obj == null) {
            return null;
        }
        if (cls.isAssignableFrom(obj.getClass())) {
            return cls.cast(obj);
        }
        return cls.getConstructor(obj.getClass()).newInstance(obj);
    }
}

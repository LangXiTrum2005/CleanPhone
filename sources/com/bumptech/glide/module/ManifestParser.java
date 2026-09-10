package com.bumptech.glide.module;

import androidx.datastore.preferences.protobuf.a;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class ManifestParser {
    public static GlideModule a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (objNewInstance instanceof GlideModule) {
                    return (GlideModule) objNewInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
            } catch (IllegalAccessException e2) {
                b(cls, e2);
                throw null;
            } catch (InstantiationException e3) {
                b(cls, e3);
                throw null;
            } catch (NoSuchMethodException e4) {
                b(cls, e4);
                throw null;
            } catch (InvocationTargetException e5) {
                b(cls, e5);
                throw null;
            }
        } catch (ClassNotFoundException e6) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e6);
        }
    }

    public static void b(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(a.j(cls, "Unable to instantiate GlideModule implementation for "), reflectiveOperationException);
    }
}

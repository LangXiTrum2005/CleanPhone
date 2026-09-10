package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: ExtensionRegistryFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class triweekly {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Class<?> f22385attabal = dern();

    public static kowloon attabal() {
        kowloon kowloonVarSaneness = saneness("getEmptyRegistry");
        return kowloonVarSaneness != null ? kowloonVarSaneness : kowloon.f22235dern;
    }

    public static Class<?> dern() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final kowloon saneness(String str) {
        Class<?> cls = f22385attabal;
        if (cls == null) {
            return null;
        }
        try {
            return (kowloon) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }
}

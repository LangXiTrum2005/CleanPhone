package ads_mobile_sdk;

/* JADX INFO: loaded from: classes.dex */
public abstract class uf0 {
    public static final Class a;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        a = cls;
    }

    public static final vf0 a(String str) {
        Class cls = a;
        if (cls == null) {
            return null;
        }
        try {
            return (vf0) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }
}

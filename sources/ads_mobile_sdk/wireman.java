package ads_mobile_sdk;

import saneness.archipelagic;
import saneness.kartik;

/* JADX INFO: loaded from: classes.dex */
public abstract class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final kartik f3292attabal = new kartik();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final archipelagic f3293saneness;

    static {
        archipelagic archipelagicVar = null;
        if (!sb.b) {
            try {
                archipelagicVar = (archipelagic) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
            } catch (Exception unused) {
            }
        }
        f3293saneness = archipelagicVar;
    }
}

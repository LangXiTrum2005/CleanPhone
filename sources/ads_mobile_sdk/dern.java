package ads_mobile_sdk;

import saneness.iridectome;
import saneness.salmi;

/* JADX INFO: loaded from: classes.dex */
public abstract class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final salmi f3283attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final iridectome f3284saneness;

    static {
        salmi salmiVar = null;
        if (!sb.b) {
            try {
                salmiVar = (salmi) Class.forName("com.google.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
            } catch (Exception unused) {
            }
        }
        f3283attabal = salmiVar;
        f3284saneness = new iridectome();
    }
}

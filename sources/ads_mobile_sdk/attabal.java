package ads_mobile_sdk;

import saneness.ferrovanadium;
import saneness.imparkation;

/* JADX INFO: loaded from: classes.dex */
public abstract class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final imparkation f3280attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final ferrovanadium f3281saneness;

    static {
        imparkation imparkationVar = null;
        if (!sb.b) {
            try {
                imparkationVar = (imparkation) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
            } catch (Exception unused) {
            }
        }
        f3280attabal = imparkationVar;
        f3281saneness = new ferrovanadium();
    }
}

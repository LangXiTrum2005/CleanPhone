package ads_mobile_sdk;

import saneness.bubbles;
import saneness.extensively;

/* JADX INFO: loaded from: classes.dex */
public abstract class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final bubbles f3290attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final extensively f3291saneness;

    static {
        bubbles bubblesVar = null;
        if (!sb.b) {
            try {
                bubblesVar = (bubbles) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
            } catch (Exception unused) {
            }
        }
        f3290attabal = bubblesVar;
        f3291saneness = new extensively();
    }
}

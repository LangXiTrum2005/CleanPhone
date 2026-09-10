package ads_mobile_sdk;

import java.util.concurrent.ConcurrentHashMap;
import p002kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes.dex */
public final class c7 {
    public static final long e;
    public final Object a = new Object();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    static {
        p002kotlin.time.saneness.Companion attabalVar = p002kotlin.time.saneness.INSTANCE;
        e = p002kotlin.time.dern.molybdenite(-1, DurationUnit.MILLISECONDS);
    }
}

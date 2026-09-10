package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Yt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2919Yt {
    public static final String FILENAME = "settings_vungle";
    public static final String GENERIC_TPAT_FAILED_FILENAME = "failedGenericTpats";
    public static final String TPAT_FAILED_FILENAME = "failedTpats";
    private final File file;
    private final Executor ioExecutor;
    private final ConcurrentHashMap<String, Object> values;
    public static final C2893Xt Companion = new C2893Xt(null);
    private static final ConcurrentHashMap<String, C2919Yt> filePreferenceMap = new ConcurrentHashMap<>();

    public /* synthetic */ C2919Yt(Executor executor, ZT zt, String str, int i, AbstractC2471Hm abstractC2471Hm) {
        this(executor, zt, (i & 4) != 0 ? FILENAME : str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: apply$lambda-0, reason: not valid java name */
    public static final void m225apply$lambda0(C2919Yt c2919Yt, Serializable serializable) {
        AbstractC2995aW.q(c2919Yt, "this$0");
        AbstractC2995aW.q(serializable, "$serializable");
        C3300du.writeSerializable(c2919Yt.file, serializable);
    }

    public static final synchronized C2919Yt get(Executor executor, ZT zt, String str) {
        return Companion.get(executor, zt, str);
    }

    public final void apply() {
        this.ioExecutor.execute(new Ff0(15, this, new HashMap(this.values)));
    }

    public final Boolean getBoolean(String str) {
        AbstractC2995aW.q(str, "key");
        Object obj = this.values.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    public final int getInt(String str, int i) {
        AbstractC2995aW.q(str, "key");
        Object obj = this.values.get(str);
        return obj instanceof Integer ? ((Number) obj).intValue() : i;
    }

    public final long getLong(String str, long j) {
        AbstractC2995aW.q(str, "key");
        Object obj = this.values.get(str);
        return obj instanceof Long ? ((Number) obj).longValue() : j;
    }

    public final String getString(String str) {
        AbstractC2995aW.q(str, "key");
        Object obj = this.values.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final HashSet<String> getStringSet(String str, HashSet<String> hashSet) {
        AbstractC2995aW.q(str, "key");
        AbstractC2995aW.q(hashSet, "defaultValue");
        Object obj = this.values.get(str);
        return obj instanceof HashSet ? C2723Rf.getNewHashSet((HashSet) obj) : hashSet;
    }

    public final C2919Yt put(String str, int i) {
        AbstractC2995aW.q(str, "key");
        this.values.put(str, Integer.valueOf(i));
        return this;
    }

    public final C2919Yt remove(String str) {
        AbstractC2995aW.q(str, "key");
        if (this.values.containsKey(str)) {
            this.values.remove(str);
        }
        return this;
    }

    public final C2919Yt put(String str, long j) {
        AbstractC2995aW.q(str, "key");
        this.values.put(str, Long.valueOf(j));
        return this;
    }

    public /* synthetic */ C2919Yt(Executor executor, ZT zt, String str, AbstractC2471Hm abstractC2471Hm) {
        this(executor, zt, str);
    }

    public final boolean getBoolean(String str, boolean z) {
        AbstractC2995aW.q(str, "key");
        Object obj = this.values.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z;
    }

    public final String getString(String str, String str2) {
        AbstractC2995aW.q(str, "key");
        AbstractC2995aW.q(str2, "defaultValue");
        Object obj = this.values.get(str);
        return obj instanceof String ? (String) obj : str2;
    }

    private C2919Yt(Executor executor, ZT zt, String str) {
        this.ioExecutor = executor;
        File file = new File(zt.getSharedPrefsDir(), str);
        this.file = file;
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        this.values = concurrentHashMap;
        Object serializable = C3300du.readSerializable(file);
        if (serializable instanceof HashMap) {
            concurrentHashMap.putAll((HashMap) serializable);
        }
    }

    public final C2919Yt put(String str, String str2) {
        AbstractC2995aW.q(str, "key");
        AbstractC2995aW.q(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.values.put(str, str2);
        return this;
    }

    public final C2919Yt put(String str, HashSet<String> hashSet) {
        AbstractC2995aW.q(str, "key");
        this.values.put(str, C2723Rf.getNewHashSet(hashSet));
        return this;
    }

    public final C2919Yt put(String str, boolean z) {
        AbstractC2995aW.q(str, "key");
        this.values.put(str, Boolean.valueOf(z));
        return this;
    }
}

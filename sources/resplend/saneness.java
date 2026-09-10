package resplend;

import com.ironsource.X3;
import com.vungle.ads.internal.util.marial;
import com.vungle.ads.internal.util.polloi;
import com.vungle.ads.internal.util.taiyuan;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FilePreferences.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\u00020\u0001:\u00011B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0015J\u001d\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001bJ\u001d\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u001c¢\u0006\u0004\b\u0010\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010 j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`!¢\u0006\u0004\b\u0010\u0010\"J=\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00060 j\b\u0012\u0004\u0012\u00020\u0006`!2\u0006\u0010\r\u001a\u00020\u00062\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00060 j\b\u0012\u0004\u0012\u00020\u0006`!¢\u0006\u0004\b#\u0010$J\u001d\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020%¢\u0006\u0004\b\u0010\u0010&J\u001d\u0010'\u001a\u00020%2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lresplend/saneness;", "", "Ljava/util/concurrent/Executor;", "ioExecutor", "Lcom/vungle/ads/internal/util/polloi;", "pathProvider", "", "filename", "<init>", "(Ljava/util/concurrent/Executor;Lcom/vungle/ads/internal/util/polloi;Ljava/lang/String;)V", "", "apply", "()V", X3.i.W, "", "value", "put", "(Ljava/lang/String;Z)Lresplend/saneness;", "defaultValue", "getBoolean", "(Ljava/lang/String;Z)Z", "(Ljava/lang/String;)Ljava/lang/Boolean;", "(Ljava/lang/String;Ljava/lang/String;)Lresplend/saneness;", "remove", "(Ljava/lang/String;)Lresplend/saneness;", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "(Ljava/lang/String;)Ljava/lang/String;", "", "(Ljava/lang/String;I)Lresplend/saneness;", "getInt", "(Ljava/lang/String;I)I", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "(Ljava/lang/String;Ljava/util/HashSet;)Lresplend/saneness;", "getStringSet", "(Ljava/lang/String;Ljava/util/HashSet;)Ljava/util/HashSet;", "", "(Ljava/lang/String;J)Lresplend/saneness;", "getLong", "(Ljava/lang/String;J)J", "Ljava/util/concurrent/Executor;", "Ljava/io/File;", X3.i.b, "Ljava/io/File;", "Ljava/util/concurrent/ConcurrentHashMap;", "values", "Ljava/util/concurrent/ConcurrentHashMap;", "Companion", "attabal", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class saneness {
    public static final String FILENAME = "settings_vungle";
    public static final String TPAT_FAILED_FILENAME = "vngFailedTpats";
    private final File file;
    private final Executor ioExecutor;
    private final ConcurrentHashMap<String, Object> values;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ConcurrentHashMap<String, saneness> filePreferenceMap = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: resplend.saneness$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: FilePreferences.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087T¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0003R\u0014\u0010\u0010\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lresplend/saneness$attabal;", "", "<init>", "()V", "Ljava/util/concurrent/Executor;", "ioExecutor", "Lcom/vungle/ads/internal/util/polloi;", "pathProvider", "", "filename", "Lresplend/saneness;", "get", "(Ljava/util/concurrent/Executor;Lcom/vungle/ads/internal/util/polloi;Ljava/lang/String;)Lresplend/saneness;", "FILENAME", "Ljava/lang/String;", "getFILENAME$annotations", "TPAT_FAILED_FILENAME", "Ljava/util/concurrent/ConcurrentHashMap;", "filePreferenceMap", "Ljava/util/concurrent/ConcurrentHashMap;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ saneness get$default(Companion companion, Executor executor, polloi polloiVar, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = saneness.FILENAME;
            }
            return companion.get(executor, polloiVar, str);
        }

        public final synchronized saneness get(Executor ioExecutor, polloi pathProvider, String filename) {
            Object sanenessVar;
            Object objPutIfAbsent;
            try {
                Intrinsics.checkNotNullParameter(ioExecutor, "ioExecutor");
                Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
                Intrinsics.checkNotNullParameter(filename, "filename");
                ConcurrentHashMap concurrentHashMap = saneness.filePreferenceMap;
                sanenessVar = concurrentHashMap.get(filename);
                if (sanenessVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(filename, (sanenessVar = new saneness(ioExecutor, pathProvider, filename, null)))) != null) {
                    sanenessVar = objPutIfAbsent;
                }
                Intrinsics.checkNotNullExpressionValue(sanenessVar, "filePreferenceMap.getOrP…, filename)\n            }");
            } catch (Throwable th) {
                throw th;
            }
            return (saneness) sanenessVar;
        }

        private Companion() {
        }

        public static /* synthetic */ void getFILENAME$annotations() {
        }
    }

    public /* synthetic */ saneness(Executor executor, polloi polloiVar, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(executor, polloiVar, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: apply$lambda-0, reason: not valid java name */
    public static final void m3368apply$lambda0(saneness this$0, Serializable serializable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(serializable, "$serializable");
        taiyuan.writeSerializable(this$0.file, serializable);
    }

    public static final synchronized saneness get(Executor executor, polloi polloiVar, String str) {
        return INSTANCE.get(executor, polloiVar, str);
    }

    public final void apply() {
        final HashMap map = new HashMap(this.values);
        this.ioExecutor.execute(new Runnable() { // from class: resplend.attabal
            @Override // java.lang.Runnable
            public final void run() {
                saneness.m3368apply$lambda0(this.f36244kowloon, map);
            }
        });
    }

    public final boolean getBoolean(String key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : defaultValue;
    }

    public final int getInt(String key, int defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        return obj instanceof Integer ? ((Number) obj).intValue() : defaultValue;
    }

    public final long getLong(String key, long defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        return obj instanceof Long ? ((Number) obj).longValue() : defaultValue;
    }

    public final String getString(String key, String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Object obj = this.values.get(key);
        return obj instanceof String ? (String) obj : defaultValue;
    }

    public final HashSet<String> getStringSet(String key, HashSet<String> defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Object obj = this.values.get(key);
        return obj instanceof HashSet ? marial.getNewHashSet((HashSet) obj) : defaultValue;
    }

    public final saneness put(String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.values.put(key, Boolean.valueOf(value));
        return this;
    }

    public final saneness remove(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.values.containsKey(key)) {
            this.values.remove(key);
        }
        return this;
    }

    private saneness(Executor executor, polloi polloiVar, String str) {
        this.ioExecutor = executor;
        File file = new File(polloiVar.getSharedPrefsDir(), str);
        this.file = file;
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        this.values = concurrentHashMap;
        Object serializable = taiyuan.readSerializable(file);
        if (serializable instanceof HashMap) {
            concurrentHashMap.putAll((HashMap) serializable);
        }
    }

    public final saneness put(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.values.put(key, value);
        return this;
    }

    public final Boolean getBoolean(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    public final String getString(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final saneness put(String key, int value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.values.put(key, Integer.valueOf(value));
        return this;
    }

    public final saneness put(String key, HashSet<String> value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.values.put(key, marial.getNewHashSet(value));
        return this;
    }

    public final saneness put(String key, long value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.values.put(key, Long.valueOf(value));
        return this;
    }

    public /* synthetic */ saneness(Executor executor, polloi polloiVar, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(executor, polloiVar, (i & 4) != 0 ? FILENAME : str);
    }
}

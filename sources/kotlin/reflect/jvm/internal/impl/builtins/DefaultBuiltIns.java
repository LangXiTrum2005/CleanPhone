package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* JADX INFO: loaded from: classes7.dex */
public final class DefaultBuiltIns extends KotlinBuiltIns {
    public static final DefaultBuiltIns g;

    public static final class Companion {
    }

    static {
        DefaultBuiltIns defaultBuiltIns = new DefaultBuiltIns(new LockBasedStorageManager("DefaultBuiltIns"));
        defaultBuiltIns.c(false);
        g = defaultBuiltIns;
    }
}

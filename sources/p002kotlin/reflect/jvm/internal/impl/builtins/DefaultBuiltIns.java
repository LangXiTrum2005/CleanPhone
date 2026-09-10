package p002kotlin.reflect.jvm.internal.impl.builtins;

import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: DefaultBuiltIns.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DefaultBuiltIns extends beachfront {

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final attabal f29624impromptu = new attabal(null);

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final taiyuan<DefaultBuiltIns> f29625taiyuan = saneness.saneness(new Function0<DefaultBuiltIns>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns$Companion$Instance$2
        @Override // p002kotlin.jvm.functions.Function0
        public final DefaultBuiltIns invoke() {
            return new DefaultBuiltIns(false, 1, null);
        }
    });

    /* JADX INFO: compiled from: DefaultBuiltIns.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DefaultBuiltIns attabal() {
            return (DefaultBuiltIns) DefaultBuiltIns.f29625taiyuan.getValue();
        }

        public attabal() {
        }
    }

    public DefaultBuiltIns() {
        this(false, 1, null);
    }

    public DefaultBuiltIns(boolean z) {
        super(new LockBasedStorageManager("DefaultBuiltIns"));
        if (z) {
            beachfront(false);
        }
    }

    public /* synthetic */ DefaultBuiltIns(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}

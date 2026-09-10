package squalor;

import java.util.concurrent.ConcurrentHashMap;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: addToStdlib.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ConcurrentHashMap<Function0<?>, Object> f38056attabal = new ConcurrentHashMap<>();

    public static final Void attabal(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new IllegalStateException(message.toString());
    }

    public static /* synthetic */ Void saneness(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "should not be called";
        }
        return attabal(str);
    }
}

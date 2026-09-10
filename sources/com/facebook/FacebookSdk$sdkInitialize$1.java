package com.facebook;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/io/File;", "kotlin.jvm.PlatformType", NotificationCompat.CATEGORY_CALL}, k = 3, mv = {1, 5, 1})
final class FacebookSdk$sdkInitialize$1<V> implements Callable {
    public static final FacebookSdk$sdkInitialize$1 X = new FacebookSdk$sdkInitialize$1();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Context context = FacebookSdk.f15920i;
        if (context != null) {
            return context.getCacheDir();
        }
        Intrinsics.m("applicationContext");
        throw null;
    }
}

package androidx.webkit.internal;

import android.webkit.SafeBrowsingResponse;
import dalvik.system.DelegateLastClassLoader;
import dalvik.system.InMemoryDexClassLoader;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ SafeBrowsingResponse b(Object obj) {
        return (SafeBrowsingResponse) obj;
    }

    public static /* synthetic */ DelegateLastClassLoader c(ClassLoader classLoader, String str) {
        return new DelegateLastClassLoader(str, classLoader);
    }

    public static /* synthetic */ InMemoryDexClassLoader d(ByteBuffer[] byteBufferArr, ClassLoader classLoader) {
        return new InMemoryDexClassLoader(byteBufferArr, classLoader);
    }

    public static /* synthetic */ void e() {
    }
}

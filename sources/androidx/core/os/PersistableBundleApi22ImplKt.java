package androidx.core.os;

import android.os.PersistableBundle;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/core/os/PersistableBundleApi22ImplKt;", "", "Landroid/os/PersistableBundle;", "persistableBundle", "", "key", "", "value", "", "a", "(Landroid/os/PersistableBundle;Ljava/lang/String;Z)V", "", "b", "(Landroid/os/PersistableBundle;Ljava/lang/String;[Z)V", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PersistableBundleApi22ImplKt {
    @JvmStatic
    public static final void a(PersistableBundle persistableBundle, String key, boolean value) {
        persistableBundle.putBoolean(key, value);
    }

    @JvmStatic
    public static final void b(PersistableBundle persistableBundle, String key, boolean[] value) {
        persistableBundle.putBooleanArray(key, value);
    }
}

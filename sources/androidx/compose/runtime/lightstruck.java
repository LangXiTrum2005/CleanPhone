package androidx.compose.runtime;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: Preconditions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"", PglCryptUtils.KEY_MESSAGE, "", "attabal", "(Ljava/lang/String;)V", "saneness", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class lightstruck {
    public static final void attabal(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void saneness(String str) {
        throw new IllegalStateException(str);
    }
}

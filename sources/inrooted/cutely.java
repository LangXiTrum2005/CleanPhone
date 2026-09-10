package inrooted;

import android.os.Bundle;
import com.ironsource.X3;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SavedStateWriter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u000b2\n\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006\u0015"}, d2 = {"Linrooted/cutely;", "", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "source", "attabal", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "", X3.i.W, "", "value", "", "wireman", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "dern", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;)V", "from", "saneness", "(Landroid/os/Bundle;Landroid/os/Bundle;)V", "marial", "(Landroid/os/Bundle;Ljava/lang/String;)V", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class cutely {
    public static Bundle attabal(Bundle source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return source;
    }

    public static final void dern(Bundle bundle, String key, Bundle value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putBundle(key, value);
    }

    public static final void marial(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.remove(key);
    }

    public static final void saneness(Bundle bundle, Bundle from) {
        Intrinsics.checkNotNullParameter(from, "from");
        bundle.putAll(from);
    }

    public static final void wireman(Bundle bundle, String key, List<String> value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putStringArrayList(key, apical.attabal(value));
    }
}

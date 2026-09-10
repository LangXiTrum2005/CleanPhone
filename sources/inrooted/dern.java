package inrooted;

import android.os.Bundle;
import com.ironsource.X3;
import java.util.List;
import java.util.Map;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.collections.polder;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SavedStateReader.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006\u0017"}, d2 = {"Linrooted/dern;", "", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "source", "attabal", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "", X3.i.W, "", "marial", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "dern", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;", "wireman", "", "beachfront", "(Landroid/os/Bundle;)Z", "saneness", "(Landroid/os/Bundle;Ljava/lang/String;)Z", "", "competently", "(Landroid/os/Bundle;)Ljava/util/Map;", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class dern {
    public static Bundle attabal(Bundle source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return source;
    }

    public static final boolean beachfront(Bundle bundle) {
        return bundle.isEmpty();
    }

    public static final Map<String, Object> competently(Bundle bundle) {
        Map mapWireman = polder.wireman(bundle.size());
        for (String str : bundle.keySet()) {
            Intrinsics.beachfront(str);
            mapWireman.put(str, bundle.get(str));
        }
        return polder.saneness(mapWireman);
    }

    public static final Bundle dern(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        wireman.attabal(key);
        throw new KotlinNothingValueException();
    }

    public static final List<String> marial(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getStringArrayList(key);
    }

    public static final boolean saneness(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.containsKey(key);
    }

    public static final Bundle wireman(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getBundle(key);
    }
}

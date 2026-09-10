package androidx.p001lifecycle;

import com.ironsource.X3;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ViewModelStore.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0003R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/mathsort;", "", "<init>", "()V", "", X3.i.W, "Landroidx/lifecycle/starveling;", "viewModel", "", "wireman", "(Ljava/lang/String;Landroidx/lifecycle/starveling;)V", "saneness", "(Ljava/lang/String;)Landroidx/lifecycle/starveling;", "", "dern", "()Ljava/util/Set;", "attabal", "", "Ljava/util/Map;", "map", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class mathsort {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Map<String, starveling> map = new LinkedHashMap();

    public final void attabal() {
        Iterator<starveling> it = this.map.values().iterator();
        while (it.hasNext()) {
            it.next().saneness();
        }
        this.map.clear();
    }

    public final Set<String> dern() {
        return new HashSet(this.map.keySet());
    }

    public final starveling saneness(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.map.get(key);
    }

    public final void wireman(String key, starveling viewModel) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        starveling starvelingVarPut = this.map.put(key, viewModel);
        if (starvelingVarPut != null) {
            starvelingVarPut.saneness();
        }
    }
}

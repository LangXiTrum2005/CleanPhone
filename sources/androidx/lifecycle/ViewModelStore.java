package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelStore;", "", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ViewModelStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5292a = new LinkedHashMap();

    public final void a() {
        for (ViewModel viewModel : this.f5292a.values()) {
            viewModel.f5281c = true;
            HashMap map = viewModel.f5279a;
            if (map != null) {
                synchronized (map) {
                    try {
                        Iterator it = viewModel.f5279a.values().iterator();
                        while (it.hasNext()) {
                            ViewModel.a(it.next());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            LinkedHashSet linkedHashSet = viewModel.f5280b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = viewModel.f5280b.iterator();
                        while (it2.hasNext()) {
                            ViewModel.a((Closeable) it2.next());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            viewModel.b();
        }
        this.f5292a.clear();
    }
}

package androidx.datastore.core;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.android.HandlerContext;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements DisposableHandle {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f4697Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ a(int i2, Object obj, Object obj2) {
        this.X = i2;
        this.f4697Y = obj;
        this.Z = obj2;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        switch (this.X) {
            case 0:
                String str = (String) this.f4697Y;
                Function1 function1 = (Function1) this.Z;
                synchronized (MulticastFileObserver.f4672b) {
                    LinkedHashMap linkedHashMap = MulticastFileObserver.f4673c;
                    MulticastFileObserver multicastFileObserver = (MulticastFileObserver) linkedHashMap.get(str);
                    if (multicastFileObserver != null) {
                        multicastFileObserver.f4674a.remove(function1);
                        if (multicastFileObserver.f4674a.isEmpty()) {
                            linkedHashMap.remove(str);
                            multicastFileObserver.stopWatching();
                        }
                    }
                    break;
                }
                return;
            default:
                ((HandlerContext) this.f4697Y).f44773Y.removeCallbacks((Runnable) this.Z);
                return;
        }
    }
}

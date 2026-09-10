package androidx.room;

import android.os.RemoteException;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/room/MultiInstanceInvalidationService$binder$1", "Landroidx/room/IMultiInstanceInvalidationService$Stub;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MultiInstanceInvalidationService$binder$1 extends IMultiInstanceInvalidationService.Stub {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f8201Y;

    public MultiInstanceInvalidationService$binder$1(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f8201Y = multiInstanceInvalidationService;
        attachInterface(this, IMultiInstanceInvalidationService.O8);
    }

    @Override // androidx.room.IMultiInstanceInvalidationService
    public final int E(IMultiInstanceInvalidationCallback callback, String str) {
        Intrinsics.f(callback, "callback");
        int i2 = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f8201Y;
        synchronized (multiInstanceInvalidationService.Z) {
            try {
                int i3 = multiInstanceInvalidationService.X + 1;
                multiInstanceInvalidationService.X = i3;
                if (multiInstanceInvalidationService.Z.register(callback, Integer.valueOf(i3))) {
                    multiInstanceInvalidationService.f8200Y.put(Integer.valueOf(i3), str);
                    i2 = i3;
                } else {
                    multiInstanceInvalidationService.X--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2;
    }

    @Override // androidx.room.IMultiInstanceInvalidationService
    public final void Z(IMultiInstanceInvalidationCallback callback, int i2) {
        Intrinsics.f(callback, "callback");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f8201Y;
        synchronized (multiInstanceInvalidationService.Z) {
            multiInstanceInvalidationService.Z.unregister(callback);
        }
    }

    @Override // androidx.room.IMultiInstanceInvalidationService
    public final void y(int i2, String[] tables) {
        Intrinsics.f(tables, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f8201Y;
        synchronized (multiInstanceInvalidationService.Z) {
            try {
                String str = (String) multiInstanceInvalidationService.f8200Y.get(Integer.valueOf(i2));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.Z.beginBroadcast();
                for (int i3 = 0; i3 < iBeginBroadcast; i3++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.Z.getBroadcastCookie(i3);
                        Intrinsics.d(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.f8200Y.get(num);
                        if (i2 != iIntValue && str.equals(str2)) {
                            try {
                                multiInstanceInvalidationService.Z.getBroadcastItem(i3).f(tables);
                            } catch (RemoteException e2) {
                                Log.w("ROOM", "Error invoking a remote callback", e2);
                            }
                        }
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.Z.finishBroadcast();
                        throw th;
                    }
                }
                multiInstanceInvalidationService.Z.finishBroadcast();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

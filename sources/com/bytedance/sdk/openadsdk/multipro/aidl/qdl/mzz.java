package com.bytedance.sdk.openadsdk.multipro.aidl.qdl;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import androidx.datastore.preferences.protobuf.a;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class mzz extends qdl {
    private static final Map<String, RemoteCallbackList<IFullScreenVideoAdInteractionListener>> qdl = a.r();
    private static volatile mzz ud;

    public static mzz qdl() {
        if (ud == null) {
            synchronized (mzz.class) {
                try {
                    if (ud == null) {
                        ud = new mzz();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ud;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeFullVideoCallback(String str, String str2) throws RemoteException {
        qdl(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerFullVideoListener(String str, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws RemoteException {
        RemoteCallbackList<IFullScreenVideoAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iFullScreenVideoAdInteractionListener);
        qdl.put(str, remoteCallbackList);
    }

    private synchronized void qdl(String str, String str2) {
        RemoteCallbackList<IFullScreenVideoAdInteractionListener> remoteCallbackListRemove;
        try {
            Map<String, RemoteCallbackList<IFullScreenVideoAdInteractionListener>> map = qdl;
            if (map != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackListRemove = map.remove(str);
                } else {
                    remoteCallbackListRemove = map.get(str);
                }
                if (remoteCallbackListRemove != null) {
                    int iBeginBroadcast = remoteCallbackListRemove.beginBroadcast();
                    for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                        try {
                            IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener = (IFullScreenVideoAdInteractionListener) remoteCallbackListRemove.getBroadcastItem(i2);
                            if (iFullScreenVideoAdInteractionListener != null) {
                                if ("onAdShow".equals(str2)) {
                                    iFullScreenVideoAdInteractionListener.onAdShow();
                                } else if ("onAdClose".equals(str2)) {
                                    iFullScreenVideoAdInteractionListener.onAdClose();
                                } else if ("onAdVideoBarClick".equals(str2)) {
                                    iFullScreenVideoAdInteractionListener.onAdVideoBarClick();
                                } else if ("recycleRes".equals(str2)) {
                                    iFullScreenVideoAdInteractionListener.onDestroy();
                                }
                            }
                        } catch (Throwable th) {
                            aaj.qdl("MultiProcess", "fullScreen2 method " + str2 + " throws Exception :", th);
                        }
                    }
                    remoteCallbackListRemove.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackListRemove.kill();
                    }
                }
            }
        } catch (Throwable th2) {
            aaj.qdl("MultiProcess", "fullScreen1 method " + str2 + " throws Exception :", th2);
        }
    }
}

package com.tiktok.appevents;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.tiktok.TikTokBusinessSdk;

/* JADX INFO: loaded from: classes6.dex */
public class TTIdentifierFactory {

    public static class AdIdConnection implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            throw null;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static class AdIdInfo {
    }

    public static class AdIdInterface implements IInterface {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    static {
        String str = TikTokBusinessSdk.f42660a;
    }
}

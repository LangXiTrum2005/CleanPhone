package com.mbridge.msdk.out;

import android.annotation.SuppressLint;
import com.mbridge.msdk.system.MBridgeSDKImpl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBridgeSDKFactory {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile MBridgeSDKImpl instance;

    private MBridgeSDKFactory() {
    }

    public static MBridgeSDKImpl getMBridgeSDK() {
        if (instance == null) {
            synchronized (MBridgeSDKFactory.class) {
                try {
                    if (instance == null) {
                        instance = new MBridgeSDKImpl();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return instance;
    }
}

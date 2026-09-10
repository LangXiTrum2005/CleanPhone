package com.adjust.sdk.sig;

import android.content.Context;
import android.util.Log;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class Signer implements ISigner {
    public static final t2 Companion = new t2();
    public static final String EXCEPTION_MSG_SDK4 = "This version of Adjust Signature is not compatible with Adjust SDK v4. Please upgrade to SDK v5.";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f6917c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeLibHelper f6918a = new NativeLibHelper();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1 f6919b = new t1();

    @Override // com.adjust.sdk.sig.ISigner
    public synchronized void onResume() {
        try {
            if (f6917c) {
                throw new IllegalStateException("sign: Library received error, it has locked down");
            }
            this.f6918a.a();
        } catch (IllegalStateException e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "sign: Incorrect library state";
            }
            Log.e("Signer", message);
        } catch (Exception e11) {
            Log.e("Signer", "sign: Unhandled exception: " + e11.getMessage());
        }
    }

    @Override // com.adjust.sdk.sig.ISigner
    public void sign(Context context, Map<String, String> map, String str, String str2) {
        Log.e("Signer", EXCEPTION_MSG_SDK4);
        throw new UnsupportedOperationException(EXCEPTION_MSG_SDK4);
    }

    @Override // com.adjust.sdk.sig.ISigner
    public synchronized void sign(Context context, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        try {
            try {
                try {
                    try {
                        if (f6917c) {
                            throw new IllegalStateException("sign: Library received error, it has locked down");
                        }
                        if (context != null) {
                            t1 t1Var = this.f6919b;
                            NativeLibHelper nativeLibHelper = this.f6918a;
                            if (map == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            if (map2 == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            if (map3 != null) {
                                new u2(context, t1Var, nativeLibHelper, map, map2, k3.a(map3)).a();
                                return;
                            }
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    } catch (IllegalArgumentException e10) {
                        String message = e10.getMessage();
                        if (message == null) {
                            message = "sign: Required parameter is null";
                        }
                        Log.e("Signer", message);
                    }
                } catch (IllegalStateException e11) {
                    String message2 = e11.getMessage();
                    if (message2 == null) {
                        message2 = "sign: Incorrect library state";
                    }
                    Log.e("Signer", message2);
                }
            } catch (b2 e12) {
                f6917c = true;
                String message3 = e12.getMessage();
                if (message3 == null) {
                    message3 = "sign: Library received error, it has locked down";
                }
                Log.e("Signer", message3);
            }
        } catch (Exception e13) {
            Log.e("Signer", "sign: Unhandled exception: " + e13.getMessage());
        }
    }
}

package com.adjust.sdk.sig;

import android.content.Context;
import android.util.Log;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class NativeLibHelper {
    static {
        try {
            System.loadLibrary("signer");
        } catch (UnsatisfiedLinkError e10) {
            Log.e("NativeLibHelper", "Signer Library could not be loaded: " + e10.getMessage());
        }
    }

    private final native void nOnResume();

    private final native byte[] nSign(Context context, Object obj, byte[] bArr, int i10);

    public final byte[] a(Context context, LinkedHashMap linkedHashMap, byte[] bArr, int i10) {
        return nSign(context, linkedHashMap, bArr, i10);
    }

    public final void a() {
        nOnResume();
    }
}

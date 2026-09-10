package com.facebook.internal;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
final class NativeProtocol$updateAllAvailableProtocolVersionsAsync$1 implements Runnable {
    public static final NativeProtocol$updateAllAvailableProtocolVersionsAsync$1 X = new NativeProtocol$updateAllAvailableProtocolVersionsAsync$1();

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        if (CrashShieldHandler.b(this)) {
            return;
        }
        AtomicBoolean atomicBoolean = null;
        try {
            try {
                ArrayList arrayList2 = NativeProtocol.f16360a;
                if (CrashShieldHandler.b(NativeProtocol.class)) {
                    arrayList = null;
                } else {
                    try {
                        arrayList = NativeProtocol.f16360a;
                    } catch (Throwable th) {
                        CrashShieldHandler.a(NativeProtocol.class, th);
                        arrayList = null;
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((NativeProtocol.NativeAppInfo) it.next()).a(true);
                }
                ArrayList arrayList3 = NativeProtocol.f16360a;
                if (!CrashShieldHandler.b(NativeProtocol.class)) {
                    try {
                        atomicBoolean = NativeProtocol.f16362c;
                    } catch (Throwable th2) {
                        CrashShieldHandler.a(NativeProtocol.class, th2);
                    }
                }
                atomicBoolean.set(false);
            } catch (Throwable th3) {
                CrashShieldHandler.a(this, th3);
            }
        } catch (Throwable th4) {
            ArrayList arrayList4 = NativeProtocol.f16360a;
            if (!CrashShieldHandler.b(NativeProtocol.class)) {
                try {
                    atomicBoolean = NativeProtocol.f16362c;
                } catch (Throwable th5) {
                    CrashShieldHandler.a(NativeProtocol.class, th5);
                }
            }
            atomicBoolean.set(false);
            throw th4;
        }
    }
}

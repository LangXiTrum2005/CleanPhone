package com.google.android.datatransport.runtime;

import android.util.Log;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.runtime.logging.Logging;

/* JADX INFO: loaded from: classes3.dex */
public final class ForcedSender {
    public static void a(Transport transport) {
        Priority priority = Priority.Z;
        if (transport instanceof TransportImpl) {
            TransportRuntime.a().d.a(((TransportImpl) transport).f16839a.e(priority), 1);
        } else {
            String strD = Logging.d("ForcedSender");
            if (Log.isLoggable(strD, 5)) {
                Log.w(strD, String.format("Expected instance of `TransportImpl`, got `%s`.", transport));
            }
        }
    }
}

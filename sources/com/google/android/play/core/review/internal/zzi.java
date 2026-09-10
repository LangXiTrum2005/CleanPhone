package com.google.android.play.core.review.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.datastore.preferences.protobuf.a;
import com.p004ironsource.d9;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class zzi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19651a;

    public zzi(String str) {
        this.f19651a = a.e(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    public static String c(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e2) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e2);
                str2 = androidx.media3.extractor.text.ttml.a.n(str2, " [", TextUtils.join(", ", objArr), d9.i.f24752e);
            }
        }
        return android.support.v4.media.a.D(str, " : ", str2);
    }

    public final void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", c(this.f19651a, str, objArr));
        }
    }

    public final void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", c(this.f19651a, str, objArr));
        }
    }
}

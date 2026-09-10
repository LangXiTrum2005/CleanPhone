package org.greenrobot.eventbus.android;

import android.os.Looper;
import org.greenrobot.eventbus.MainThreadSupport;

/* JADX INFO: loaded from: classes7.dex */
public class DefaultAndroidMainThreadSupport implements MainThreadSupport {
    @Override // org.greenrobot.eventbus.MainThreadSupport
    public final boolean a() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}

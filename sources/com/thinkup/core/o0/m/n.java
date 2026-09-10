package com.thinkup.core.o0.m;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.o0mo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements m {
    private static final String o = "PlacementStatRecWrapper";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final m f42435n = new o0();
    private final Handler m = com.thinkup.core.common.ooo.m.m.o().o(11);

    @Override // com.thinkup.core.o0.m.m
    public final void m(String str) {
        m mVar = this.f42435n;
        if (mVar != null) {
            mVar.m(str);
        }
    }

    @Override // com.thinkup.core.o0.m.m
    public final void o(final String str, final String str2, final int i2, final TUAdRequest tUAdRequest, final o0mm o0mmVar) {
        o(new Runnable() { // from class: com.thinkup.core.o0.m.n.1
            @Override // java.lang.Runnable
            public final void run() {
                if (n.this.f42435n != null) {
                    n.this.f42435n.o(str, str2, i2, tUAdRequest, o0mmVar);
                }
            }
        });
    }

    @Override // com.thinkup.core.o0.m.m
    public final void o(final o0mo o0moVar, final o0mm o0mmVar) {
        o(new Runnable() { // from class: com.thinkup.core.o0.m.n.2
            @Override // java.lang.Runnable
            public final void run() {
                if (n.this.f42435n != null) {
                    n.this.f42435n.o(o0moVar, o0mmVar);
                }
            }
        });
    }

    @Override // com.thinkup.core.o0.m.m
    public final List<com.thinkup.core.o0.o.o> o(int i2, String str, int i3) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Log.w(o, "The getStatisticsBeanList method cannot be called from the main thread.");
        }
        m mVar = this.f42435n;
        return mVar != null ? mVar.o(i2, str, i3) : new ArrayList();
    }

    @Override // com.thinkup.core.o0.m.m
    public final JSONObject o(String str) {
        return o(str, 0);
    }

    @Override // com.thinkup.core.o0.m.m
    public final JSONObject o(String str, int i2) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Log.w(o, "The getUserValueParams method cannot be called from the main thread.");
        }
        m mVar = this.f42435n;
        return mVar != null ? mVar.o(str, i2) : new JSONObject();
    }

    @Override // com.thinkup.core.o0.m.m
    public final JSONObject o(String str, int i2, int i3) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Log.w(o, "The getUserValueParams with count method cannot be called from the main thread.");
        }
        m mVar = this.f42435n;
        return mVar != null ? mVar.o(str, i2, i3) : new JSONObject();
    }

    @Override // com.thinkup.core.o0.m.m
    public final com.thinkup.core.o0.o.o0 o(String str, int i2, com.thinkup.core.oo.om omVar) {
        m mVar = this.f42435n;
        return mVar != null ? mVar.o(str, i2, omVar) : new com.thinkup.core.o0.o.o0();
    }

    private void o(Runnable runnable) {
        Handler handler = this.m;
        if (handler != null) {
            handler.post(runnable);
        }
    }
}

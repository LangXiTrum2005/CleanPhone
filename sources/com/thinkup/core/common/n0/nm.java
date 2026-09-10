package com.thinkup.core.common.n0;

import android.text.TextUtils;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.ErrorCode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class nm extends m {
    private static final String o = "nm";
    private volatile boolean m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final o0o f41951n;
    private volatile boolean on;
    private final Object m = new Object();
    private final AtomicInteger o0 = new AtomicInteger(0);
    private final List<o> oo = new ArrayList();
    private final int om = 2;

    public static class o {
        String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        AdError f41952n;
        int o;

        public o(int i2, String str, AdError adError) {
            this.o = i2;
            this.m = str;
            this.f41952n = adError;
        }
    }

    public nm(o0o o0oVar) {
        this.f41951n = o0oVar;
    }

    private void m() {
        if (this.f41951n == null || this.on) {
            return;
        }
        this.on = true;
        StringBuilder sb = new StringBuilder();
        AdError errorCode = null;
        for (o oVar : new ArrayList(this.oo)) {
            if (oVar != null) {
                if (TextUtils.isEmpty(sb.toString())) {
                    sb.append(oVar.m);
                } else {
                    sb.append(",");
                    sb.append(oVar.m);
                }
                errorCode = oVar.f41952n;
            }
        }
        this.oo.clear();
        if (errorCode == null) {
            errorCode = ErrorCode.getErrorCode(ErrorCode.exception, "", "");
        }
        this.f41951n.onLoadError(0, sb.toString(), errorCode);
    }

    private void o(int i2, Object obj) {
        this.m0 = true;
        if (this.f41951n == null || this.on) {
            return;
        }
        this.on = true;
        this.f41951n.onLoadFinish(i2, obj);
    }

    @Override // com.thinkup.core.common.n0.o0o
    public void onLoadError(int i2, String str, AdError adError) {
        synchronized (this.m) {
            try {
                this.oo.add(new o(i2, str, adError));
                if (this.o0.incrementAndGet() == this.om && this.f41951n != null && !this.on) {
                    this.on = true;
                    StringBuilder sb = new StringBuilder();
                    AdError errorCode = null;
                    for (o oVar : new ArrayList(this.oo)) {
                        if (oVar != null) {
                            if (TextUtils.isEmpty(sb.toString())) {
                                sb.append(oVar.m);
                            } else {
                                sb.append(",");
                                sb.append(oVar.m);
                            }
                            errorCode = oVar.f41952n;
                        }
                    }
                    this.oo.clear();
                    if (errorCode == null) {
                        errorCode = ErrorCode.getErrorCode(ErrorCode.exception, "", "");
                    }
                    this.f41951n.onLoadError(0, sb.toString(), errorCode);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.thinkup.core.common.n0.o0o
    public void onLoadFinish(int i2, Object obj) {
        synchronized (this.m) {
            try {
                this.m0 = true;
                if (this.f41951n != null && !this.on) {
                    this.on = true;
                    this.f41951n.onLoadFinish(i2, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean o() {
        boolean z2;
        synchronized (this.m) {
            z2 = this.m0;
        }
        return z2;
    }
}

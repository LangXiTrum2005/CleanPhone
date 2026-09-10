package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h<T> extends t<T> {
    protected static final String B = "h";
    private boolean A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final long f36924w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Map<String, String> f36925x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Map<String, String> f36926y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private x f36927z;

    public h(int i10, String str, int i11, String str2, long j10) {
        super(i10, str, i11, str2);
        this.A = false;
        if (j10 > 0) {
            this.f36924w = j10;
        } else {
            this.f36924w = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        }
    }

    public void a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        if (this.f36925x == null) {
            this.f36925x = new HashMap();
        }
        try {
            this.f36925x.putAll(map);
        } catch (Exception e10) {
            f2.q(e10, new StringBuilder("addParams error: "), B);
        }
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f36926y == null) {
            this.f36926y = new HashMap();
        }
        try {
            this.f36926y.put(str, str2);
        } catch (Exception e10) {
            f2.q(e10, new StringBuilder("addHeader error: "), B);
        }
    }

    public void d(boolean z10) {
        this.A = z10;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> f() {
        if (this.f36926y == null) {
            this.f36926y = new HashMap();
        }
        this.f36926y.put("Charset", "UTF-8");
        return this.f36926y;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> i() {
        if (this.f36925x == null) {
            this.f36925x = new HashMap();
        }
        return this.f36925x;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public x o() {
        if (this.f36927z == null) {
            this.f36927z = new e(30000, this.f36924w, 3);
        }
        return this.f36927z;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public boolean a() {
        return this.A && com.mbridge.msdk.foundation.same.d.a(p(), t());
    }
}

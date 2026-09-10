package com.thinkup.core.common.n0;

import android.content.Context;
import android.os.SystemClock;
import androidx.media3.extractor.text.ttml.a;
import com.smartdigimkt.o0.b;
import com.thinkup.core.api.AdError;
import com.thinkup.core.common.on.nnn;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class o0m extends o {
    private final nnn m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f41974n;
    private long n0;
    private long no;
    private final Context o;

    public o0m(Context context, nnn nnnVar) {
        this.o = context;
        this.m = nnnVar;
        this.f41974n = com.thinkup.core.common.n.o0n.m().on(nnnVar.o0());
    }

    @Override // com.thinkup.core.common.n0.o
    public final String m() {
        com.thinkup.core.common.mo.o();
        return com.thinkup.core.common.om.n.o().o(com.thinkup.core.common.mo.mo() ? com.thinkup.core.common.n.mo.oo.mo0 : com.thinkup.core.common.n.mo.oo.oom);
    }

    @Override // com.thinkup.core.common.n0.o
    public final Map<String, Object> m0() {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final JSONObject mo() {
        if (this.m == null) {
            return super.mo();
        }
        JSONObject jSONObjectMo = super.mo();
        try {
            jSONObjectMo.put("app_id", this.m.m());
            jSONObjectMo.put("pl_id", this.m.o0());
            jSONObjectMo.put("session_id", this.f41974n);
            jSONObjectMo.put("debug_key", this.m.n0());
        } catch (Throwable unused) {
        }
        return jSONObjectMo;
    }

    @Override // com.thinkup.core.common.n0.o
    public final Map<String, String> n() {
        return a.t("Accept-Encoding", b.d, "Content-Type", "application/json;charset=utf-8");
    }

    @Override // com.thinkup.core.common.n0.o
    public final void n0() {
    }

    @Override // com.thinkup.core.common.n0.o
    public final boolean no() {
        return true;
    }

    @Override // com.thinkup.core.common.n0.o
    public final int o() {
        return 1;
    }

    @Override // com.thinkup.core.common.n0.o
    public final byte[] o0() {
        try {
            return mn().getBytes("utf-8");
        } catch (Exception unused) {
            return mn().getBytes();
        }
    }

    @Override // com.thinkup.core.common.n0.o
    public final Context om() {
        return this.o;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String on() {
        nnn nnnVar = this.m;
        return nnnVar != null ? nnnVar.n() : "";
    }

    @Override // com.thinkup.core.common.n0.o
    public final String oo() {
        nnn nnnVar = this.m;
        return nnnVar != null ? nnnVar.m() : "";
    }

    @Override // com.thinkup.core.common.n0.o
    public final void o(int i2, o0o o0oVar) {
        this.n0 = System.currentTimeMillis();
        this.no = SystemClock.elapsedRealtime();
        super.o(i2, o0oVar);
    }

    @Override // com.thinkup.core.common.n0.o
    public final void o(AdError adError) {
        nnn nnnVar = this.m;
        String strO0 = nnnVar != null ? nnnVar.o0() : "";
        nnn nnnVar2 = this.m;
        com.thinkup.core.common.oo0.oo.o("pl_wf", adError.getPlatformCode(), adError.getPlatformMSG(), m(), strO0, "", "", nnnVar2 != null ? nnnVar2.mm() : null);
    }

    @Override // com.thinkup.core.common.n0.o
    public final Object o(Object obj) {
        nnn nnnVar = this.m;
        String strO0 = nnnVar != null ? nnnVar.o0() : "";
        nnn nnnVar2 = this.m;
        com.thinkup.core.common.oo0.oo.o("pl_wf", strO0, this.n0, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.no, nnnVar2 != null ? nnnVar2.mm() : null);
        return obj;
    }
}

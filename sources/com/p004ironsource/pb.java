package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.metadata.a;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q0.b;
import com.smartdigimkt.y4.g;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/ironsource/pb;", "Lcom/ironsource/xf;", "Lcom/ironsource/xf$a;", "Lorg/json/JSONObject;", b.i0, d9.a.f24634c, "", "a", "", g.f40227p, "", "c", "", "e", "b", "d", f.j, "Lorg/json/JSONObject;", h.f36614b, "()Lorg/json/JSONObject;", qb.f26563a, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class pb implements xf, xf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private JSONObject config = new JSONObject();

    private final JSONObject h() {
        JSONObject jSONObjectOptJSONObject = this.config.optJSONObject(qb.f26563a);
        return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
    }

    @Override // com.ironsource.xf.a
    public void a(JSONObject epConfig) {
        if (epConfig == null) {
            epConfig = this.config;
        }
        this.config = epConfig;
        IronLog.INTERNAL.verbose("setEpConfig: " + this.config);
    }

    @Override // com.p004ironsource.rb
    public long b() {
        String strOptString = h().optString(sb.d);
        Intrinsics.e(strOptString, "traits.optString(LPM_DEL…_TIME_AFTER_INIT_PROCESS)");
        Long lZ = StringsKt.Z(strOptString);
        if (lZ != null) {
            return lZ.longValue();
        }
        return 2000L;
    }

    @Override // com.p004ironsource.rb
    public int c() {
        String strOptString = h().optString(sb.f26791b);
        Intrinsics.e(strOptString, "traits.optString(ISN_CTRL_INIT_DELAY)");
        Integer numY = StringsKt.Y(strOptString);
        if (numY != null) {
            return numY.intValue();
        }
        return 0;
    }

    @Override // com.p004ironsource.xf
    /* JADX INFO: renamed from: config, reason: from getter */
    public JSONObject getConfig() {
        return this.config;
    }

    @Override // com.p004ironsource.rb
    public boolean d() {
        return h().optBoolean(sb.f26793e, true);
    }

    @Override // com.p004ironsource.rb
    public long e() {
        String strOptString = h().optString(sb.f26792c);
        Intrinsics.e(strOptString, "traits.optString(LPM_BN_…FRESH_ANIMATION_DURATION)");
        Long lZ = StringsKt.Z(strOptString);
        if (lZ != null) {
            return lZ.longValue();
        }
        return 0L;
    }

    @Override // com.p004ironsource.rb
    public boolean f() {
        return h().optBoolean(sb.g, true);
    }

    @Override // com.p004ironsource.rb
    public boolean g() {
        String strOptString = h().optString(sb.f26790a);
        Intrinsics.e(strOptString, "traits.optString(IS_EP_CONFIG_ENABLED)");
        String lowerCase = strOptString.toLowerCase(Locale.ROOT);
        Intrinsics.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase.equals(a.g);
    }

    @Override // com.p004ironsource.rb
    public boolean a() {
        return h().optBoolean(sb.f, true);
    }
}

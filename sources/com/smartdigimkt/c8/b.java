package com.smartdigimkt.c8;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class b extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f34344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34345c;
    public final List<String> d;

    public b(Context context, int i2, List<String> list) {
        this.f34344b = context;
        this.f34345c = i2;
        this.d = list;
    }

    @Override // com.smartdigimkt.c8.d
    public JSONObject d() {
        JSONObject jSONObjectD = super.d();
        if (jSONObjectD != null) {
            try {
                jSONObjectD.put("app_id", com.smartdigimkt.m6.b.p().f());
                JSONArray jSONArray = new JSONArray();
                List<String> list = this.d;
                if (list != null && !list.isEmpty()) {
                    for (String str : this.d) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONArray.put(new JSONObject(str));
                        }
                    }
                }
                jSONObjectD.put("data", jSONArray);
            } catch (Throwable unused) {
            }
        }
        return jSONObjectD;
    }

    @Override // com.smartdigimkt.c8.d
    public int e() {
        return 4;
    }

    @Override // com.smartdigimkt.c8.d
    public JSONObject i() {
        JSONObject jSONObjectI = super.i();
        if (jSONObjectI != null) {
            try {
                jSONObjectI.put("tcp_tk_da_type", this.f34345c);
            } catch (Throwable unused) {
            }
        }
        return jSONObjectI;
    }

    @Override // com.smartdigimkt.c8.d
    public byte[] j() {
        return a(k());
    }

    @Override // com.smartdigimkt.c8.d
    public int l() {
        return 1;
    }

    @Override // com.smartdigimkt.c8.d
    public String m() {
        return com.smartdigimkt.w7.d.c();
    }
}

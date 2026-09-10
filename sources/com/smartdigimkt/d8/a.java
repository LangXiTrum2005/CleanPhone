package com.smartdigimkt.d8;

import android.text.TextUtils;
import com.p004ironsource.d9;
import com.smartdigimkt.i7.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f34509i = getClass().getSimpleName();
    List<String> j;
    int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f34510l;

    public a(List<String> list) {
        this.j = list;
        this.k = list.size();
    }

    private String i() {
        JSONObject jSONObjectB = super.b();
        JSONObject jSONObjectE = super.e();
        if (jSONObjectB != null) {
            try {
                jSONObjectB.put("app_id", com.smartdigimkt.m6.b.p().f());
                JSONArray jSONArray = new JSONArray();
                List<String> list = this.j;
                if (list != null && list.size() > 0) {
                    for (String str : this.j) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONArray.put(new JSONObject(str));
                        }
                    }
                }
                jSONObjectB.put("data", jSONArray);
            } catch (Exception unused) {
            }
        }
        if (jSONObjectE != null) {
            try {
                jSONObjectE.put("tcp_tk_da_type", this.f34516a);
                jSONObjectE.put("tcp_rate", this.f34517b);
            } catch (Exception unused2) {
            }
        }
        HashMap map = new HashMap();
        String strB = com.smartdigimkt.n8.b.b(jSONObjectB.toString());
        String strB2 = com.smartdigimkt.n8.b.b(jSONObjectE.toString());
        map.put("api_ver", "1.0");
        map.put("p", strB);
        map.put("p2", strB2);
        ArrayList<String> arrayList = new ArrayList(map.size());
        arrayList.addAll(map.keySet());
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String str2 : arrayList) {
            if (sb.length() > 0) {
                sb.append(d9.i.f24749c);
            }
            sb.append(str2);
            sb.append(d9.i.f24747b);
            sb.append(map.get(str2));
        }
        map.put("sign", com.smartdigimkt.n8.e.a(com.smartdigimkt.m6.b.p().g() + sb.toString()));
        return new JSONObject(map).toString();
    }

    @Override // com.smartdigimkt.d8.c
    public int a() {
        return 2;
    }

    @Override // com.smartdigimkt.d8.c
    public byte[] c() {
        return a(i());
    }

    @Override // com.smartdigimkt.d8.c
    public int d() {
        return 3;
    }

    @Override // com.smartdigimkt.d8.c
    public int f() {
        return 4;
    }

    @Override // com.smartdigimkt.d8.c
    public boolean h() {
        return false;
    }

    public int j() {
        return this.k;
    }

    public void a(boolean z2) {
        this.f34510l = z2;
    }

    @Override // com.smartdigimkt.d8.c
    public void a(String str, String str2, String str3, int i2) {
        if (this.f34510l) {
            h.a().a(3, "", "", i(), com.smartdigimkt.a7.d.a(1001));
        }
    }
}

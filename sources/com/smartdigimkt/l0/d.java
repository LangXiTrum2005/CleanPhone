package com.smartdigimkt.l0;

import com.smartdigimkt.h0.l;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class d extends e<JSONObject> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f36314n = "d";

    public d(int i2, String str, String str2, com.smartdigimkt.h0.e<JSONObject> eVar) {
        super(i2, str, str2, eVar);
    }

    @Override // com.smartdigimkt.h0.j
    public l<JSONObject> a(com.smartdigimkt.n0.c cVar) {
        try {
            return cVar.f36913a == 204 ? l.a(new JSONObject(), cVar) : l.a(new JSONObject(new String(cVar.f36914b, com.smartdigimkt.o0.d.a(cVar.d))), cVar);
        } catch (UnsupportedEncodingException e2) {
            e2.getMessage();
            return l.a(new com.smartdigimkt.i0.a(8, cVar));
        } catch (JSONException e3) {
            e3.getMessage();
            return l.a(new com.smartdigimkt.i0.a(8, cVar));
        }
    }

    public d(int i2, String str, String str2, com.smartdigimkt.h0.e<JSONObject> eVar, boolean z2) {
        super(i2, str, str2, eVar, z2);
    }
}

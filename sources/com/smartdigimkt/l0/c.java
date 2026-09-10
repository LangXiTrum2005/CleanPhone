package com.smartdigimkt.l0;

import com.smartdigimkt.h0.l;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public class c extends e<JSONArray> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f36313n = "c";

    public c(int i2, String str, String str2, com.smartdigimkt.h0.e<JSONArray> eVar) {
        super(i2, str, str2, eVar);
    }

    @Override // com.smartdigimkt.h0.j
    public l<JSONArray> a(com.smartdigimkt.n0.c cVar) {
        try {
            return l.a(new JSONArray(new String(cVar.f36914b, com.smartdigimkt.o0.d.a(cVar.d))), cVar);
        } catch (UnsupportedEncodingException e2) {
            e2.getMessage();
            return l.a(new com.smartdigimkt.i0.a(8, cVar));
        } catch (JSONException e3) {
            e3.getMessage();
            return l.a(new com.smartdigimkt.i0.a(8, cVar));
        }
    }
}

package com.smartdigimkt.c8;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URLEncoder;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class h extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f34355c;

    public h(int i2, com.smartdigimkt.z6.a aVar, String str) {
        String strQ0;
        String str2 = "";
        try {
            switch (i2) {
                case 1:
                    strQ0 = aVar.Q0();
                    str2 = strQ0;
                    break;
                case 2:
                    strQ0 = aVar.N0();
                    str2 = strQ0;
                    break;
                case 3:
                    strQ0 = aVar.O0();
                    str2 = strQ0;
                    break;
                case 4:
                    strQ0 = aVar.P0();
                    str2 = strQ0;
                    break;
                case 5:
                    strQ0 = aVar.M0();
                    str2 = strQ0;
                    break;
                case 6:
                    strQ0 = aVar.F0();
                    str2 = strQ0;
                    break;
                case 7:
                    strQ0 = aVar.E0();
                    str2 = strQ0;
                    break;
                case 8:
                    strQ0 = aVar.G0();
                    str2 = strQ0;
                    break;
                case 9:
                    strQ0 = aVar.D0();
                    str2 = strQ0;
                    break;
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            Uri uri = Uri.parse(aVar.W(str2));
            this.f34354b = uri.getScheme() + "://" + uri.getAuthority() + uri.getPath();
            this.f34355c = new JSONObject();
            for (String str3 : uri.getQueryParameterNames()) {
                this.f34355c.put(str3, URLEncoder.encode(uri.getQueryParameter(str3)));
            }
            this.f34355c.put("req_id", str);
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.c8.d
    public byte[] j() {
        JSONObject jSONObject = this.f34355c;
        if (jSONObject == null) {
            return new byte[0];
        }
        try {
            jSONObject.put("t", String.valueOf(System.currentTimeMillis()));
        } catch (Exception unused) {
        }
        return a(this.f34355c.toString());
    }

    @Override // com.smartdigimkt.c8.d
    public int l() {
        return 1;
    }

    @Override // com.smartdigimkt.c8.d
    public String m() {
        return this.f34354b;
    }

    public String n() {
        return this.f34354b;
    }

    public JSONObject o() {
        return this.f34355c;
    }
}

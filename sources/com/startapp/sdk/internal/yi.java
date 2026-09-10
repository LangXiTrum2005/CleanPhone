package com.startapp.sdk.internal;

import android.text.TextUtils;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.ByteArrayOutputStream;
import java.util.WeakHashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class yi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb f41720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONArray f41722c = new JSONArray();
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f41723e;
    public final boolean f;

    public yi(lb lbVar, String str, String str2, String str3, boolean z2) {
        this.f41720a = lbVar;
        this.f41721b = str;
        this.d = str2;
        this.f41723e = str3;
        this.f = z2;
    }

    public final void a(VASTErrorCodes vASTErrorCodes) {
        if (this.f41722c.length() == 0) {
            return;
        }
        if (!this.f || vASTErrorCodes == VASTErrorCodes.ErrorNone) {
            try {
                String strB = b(vASTErrorCodes);
                if (TextUtils.isEmpty(strB)) {
                    return;
                }
                p8 p8Var = new p8((q8) this.f41720a.a(), this.f41721b);
                byte[] bytes = strB.getBytes();
                WeakHashMap weakHashMap = vi.f41589a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                p8Var.f41355c = new s8(byteArrayOutputStream.toByteArray(), "application/json", com.smartdigimkt.o0.b.d);
                p8Var.b();
            } catch (Throwable th) {
                g9.a(th);
            }
        }
    }

    public final String b(VASTErrorCodes vASTErrorCodes) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("vastDocs", this.f41722c);
        String str = this.d;
        if (str == null) {
            str = "";
        }
        jSONObject.put("partnerResponse", str);
        String str2 = this.f41723e;
        jSONObject.put(HandleInvocationsFromAdViewer.KEY_OM_PARTNER, str2 != null ? str2 : "");
        jSONObject.put("error", vASTErrorCodes.a());
        return jSONObject.toString();
    }
}

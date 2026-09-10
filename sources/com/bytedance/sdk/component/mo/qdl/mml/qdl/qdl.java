package com.bytedance.sdk.component.mo.qdl.mml.qdl;

import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class qdl implements com.bytedance.sdk.component.mo.qdl.mml.qdl {
    private int fs;
    private String jpc;
    private byte lnr;
    private byte mml;
    private long mo;
    private long mzz;
    protected JSONObject qdl;
    private String rq;
    private byte to;
    private String tvp;
    private ud ud;
    private long wd;

    public qdl(String str, JSONObject jSONObject) {
        this.tvp = str;
        this.qdl = jSONObject;
    }

    public static com.bytedance.sdk.component.mo.qdl.mml.qdl lnr(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("type");
            int iOptInt2 = jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            qdl qdlVar = new qdl();
            qdlVar.qdl((byte) iOptInt);
            qdlVar.ud((byte) iOptInt2);
            qdlVar.qdl(jSONObject.optJSONObject("event"));
            qdlVar.qdl(jSONObject.optString("localId"));
            qdlVar.ud(jSONObject.optString("genTime"));
            qdlVar.qdl(jSONObject.optInt("channel"));
            return qdlVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String fs() {
        return this.jpc;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public long jpc() {
        return this.mzz;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public byte mml() {
        return this.lnr;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public String mo() {
        if (TextUtils.isEmpty(this.tvp)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("localId", this.tvp);
            jSONObject.put("event", wd());
            jSONObject.put("genTime", fs());
            jSONObject.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, (int) this.mml);
            jSONObject.put("type", (int) this.lnr);
            jSONObject.put("channel", this.fs);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public byte mzz() {
        return this.mml;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public ud qdl() {
        return this.ud;
    }

    public String rq() {
        return this.rq;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public int to() {
        return this.fs;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public long tvp() {
        return this.mo;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public byte ud() {
        return this.to;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public synchronized JSONObject wd() {
        ud udVar;
        try {
            if (this.qdl == null && (udVar = this.ud) != null) {
                this.qdl = udVar.qdl(rq());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.qdl;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public void qdl(JSONObject jSONObject) {
        this.qdl = jSONObject;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public void ud(String str) {
        this.jpc = str;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public void qdl(byte b2) {
        this.lnr = b2;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public void ud(long j) {
        this.mo = j;
    }

    public qdl(String str, ud udVar) {
        this.tvp = str;
        this.ud = udVar;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public void qdl(String str) {
        this.tvp = str;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public void ud(byte b2) {
        this.mml = b2;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public void qdl(long j) {
        this.mzz = j;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public void qdl(int i2) {
        this.fs = i2;
    }

    private qdl() {
    }

    public void lnr(byte b2) {
        this.to = b2;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public String lnr() {
        return this.tvp;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl
    public void lnr(long j) {
        this.wd = j;
    }
}

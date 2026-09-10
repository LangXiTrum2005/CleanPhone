package com.bytedance.sdk.component.lc.Lxb.ZU.Lxb;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb implements com.bytedance.sdk.component.lc.Lxb.ZU.Lxb {
    private String JVA;
    private long JXs;
    private LD LD;
    protected JSONObject Lxb;
    private String OY;
    private String QAg;
    private byte ZU;
    private long ebl;
    private long lc;
    private byte lk;
    private byte nBu;
    private int sLN;

    public Lxb(String str, JSONObject jSONObject) {
        this.QAg = str;
        this.Lxb = jSONObject;
    }

    public static com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lk(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("type");
            int iOptInt2 = jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            Lxb lxb = new Lxb();
            lxb.Lxb((byte) iOptInt);
            lxb.LD((byte) iOptInt2);
            lxb.Lxb(jSONObject.optJSONObject(NotificationCompat.CATEGORY_EVENT));
            lxb.Lxb(jSONObject.optString("localId"));
            lxb.LD(jSONObject.optString("genTime"));
            lxb.Lxb(jSONObject.optInt("channel"));
            return lxb;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String JVA() {
        return this.JVA;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.ZU.Lxb
    public byte JXs() {
        return this.ZU;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.ZU.Lxb
    public byte LD() {
        return this.nBu;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.ZU.Lxb
    public LD Lxb() {
        return this.LD;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.ZU.Lxb
    public long OY() {
        return this.JXs;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.ZU.Lxb
    public long QAg() {
        return this.lc;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.ZU.Lxb
    public byte ZU() {
        return this.lk;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.ZU.Lxb
    public synchronized JSONObject ebl() {
        LD ld;
        try {
            if (this.Lxb == null && (ld = this.LD) != null) {
                this.Lxb = ld.Lxb(JVA());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.Lxb;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.ZU.Lxb
    public String lc() {
        if (TextUtils.isEmpty(this.QAg)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("localId", this.QAg);
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, ebl());
            jSONObject.put("genTime", sLN());
            jSONObject.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, (int) this.ZU);
            jSONObject.put("type", (int) this.lk);
            jSONObject.put("channel", this.sLN);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.ZU.Lxb
    public int nBu() {
        return this.sLN;
    }

    public String sLN() {
        return this.OY;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.ZU.Lxb
    public void LD(String str) {
        this.OY = str;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.ZU.Lxb
    public void Lxb(JSONObject jSONObject) {
        this.Lxb = jSONObject;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.ZU.Lxb
    public void LD(long j) {
        this.lc = j;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.ZU.Lxb
    public void Lxb(byte b) {
        this.lk = b;
    }

    public Lxb(String str, LD ld) {
        this.QAg = str;
        this.LD = ld;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.ZU.Lxb
    public void LD(byte b) {
        this.ZU = b;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.ZU.Lxb
    public void Lxb(String str) {
        this.QAg = str;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.ZU.Lxb
    public void Lxb(long j) {
        this.JXs = j;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.ZU.Lxb
    public void Lxb(int i) {
        this.sLN = i;
    }

    private Lxb() {
    }

    public void lk(byte b) {
        this.nBu = b;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.ZU.Lxb
    public String lk() {
        return this.QAg;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.ZU.Lxb
    public void lk(long j) {
        this.ebl = j;
    }
}

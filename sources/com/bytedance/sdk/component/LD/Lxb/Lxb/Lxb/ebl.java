package com.bytedance.sdk.component.LD.Lxb.Lxb.Lxb;

import android.text.TextUtils;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.bytedance.sdk.component.LD.Lxb.IeN;
import com.bytedance.sdk.component.LD.Lxb.NXR;
import com.bytedance.sdk.component.LD.Lxb.VVE;
import com.bytedance.sdk.component.LD.Lxb.nBu;
import com.bytedance.sdk.component.LD.Lxb.sLN;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ebl extends IeN {
    public static int Lxb = -1;
    String JXs;
    HttpURLConnection LD;
    int ZU;
    NXR lk;

    public ebl(HttpURLConnection httpURLConnection, NXR nxr) {
        this.ZU = Lxb;
        this.LD = httpURLConnection;
        this.lk = nxr;
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.IeN
    public String JXs() throws IOException {
        return !TextUtils.isEmpty(this.JXs) ? this.JXs : this.LD.getResponseMessage();
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.IeN
    public long LD() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.IeN
    public long Lxb() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.IeN
    public sLN OY() {
        return sLN.HTTP_1_1;
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.IeN
    public nBu QAg() {
        if (nBu() == null || nBu().LD == null) {
            return null;
        }
        return new nBu(nBu().LD);
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.IeN
    public boolean ZU() {
        return lk() >= 200 && lk() < 300;
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.IeN, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            lc().close();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.IeN
    public com.bytedance.sdk.component.LD.Lxb.lc ebl() {
        if (this.LD == null) {
            return new com.bytedance.sdk.component.LD.Lxb.lc(new String[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.LD.getHeaderFields().entrySet()) {
            for (String str : entry.getValue()) {
                if (!HttpResponseHeader.ContentRange.equalsIgnoreCase(entry.getKey()) || lk() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new com.bytedance.sdk.component.LD.Lxb.lc((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.IeN
    public VVE lc() {
        OY oy;
        com.bytedance.sdk.component.lk.Lxb.Lxb lxb;
        com.bytedance.sdk.component.lk.Lxb.Lxb lxb2;
        NXR nxr = this.lk;
        if (nxr != null && (lxb2 = nxr.LD) != null) {
            lxb2.JVA();
        }
        try {
            try {
                oy = new OY(this.LD);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.sLN.LD(th.getMessage());
                oy = null;
            }
        } catch (Exception unused) {
            HttpURLConnection httpURLConnection = this.LD;
            oy = new OY(httpURLConnection, httpURLConnection.getErrorStream());
        }
        NXR nxr2 = this.lk;
        if (nxr2 != null && (lxb = nxr2.LD) != null) {
            lxb.NXR();
        }
        return oy;
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.IeN
    public int lk() {
        try {
            return this.LD.getResponseCode();
        } catch (Exception unused) {
            return this.ZU;
        }
    }

    public NXR nBu() {
        return this.lk;
    }

    public String toString() {
        return "";
    }

    public String Lxb(String str) {
        HttpURLConnection httpURLConnection = this.LD;
        return httpURLConnection == null ? "" : httpURLConnection.getHeaderField(str);
    }

    public ebl(int i, String str, NXR nxr) {
        this.JXs = str;
        this.lk = nxr;
        this.ZU = i;
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.IeN
    public String Lxb(String str, String str2) {
        return !TextUtils.isEmpty(Lxb(str)) ? Lxb(str) : str2;
    }
}

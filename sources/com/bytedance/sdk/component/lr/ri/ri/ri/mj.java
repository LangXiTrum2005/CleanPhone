package com.bytedance.sdk.component.lr.ri.ri.ri;

import android.text.TextUtils;
import com.bytedance.sdk.component.lr.ri.bgr;
import com.bytedance.sdk.component.lr.ri.co;
import com.bytedance.sdk.component.lr.ri.vr;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class mj extends bgr {
    public static int lr = -2;
    public static int ri = -1;
    String di;
    final int fi;
    HttpURLConnection ik;
    co ka;
    String xha;

    public mj(HttpURLConnection httpURLConnection, co coVar, int i) {
        this.ik = httpURLConnection;
        this.ka = coVar;
        this.fi = i;
    }

    @Override // com.bytedance.sdk.component.lr.ri.bgr, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            di().close();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.lr.ri.bgr
    public vr di() {
        jbs jbsVar;
        com.bytedance.sdk.component.ik.ri.ri riVar;
        com.bytedance.sdk.component.ik.ri.ri riVar2;
        co coVar = this.ka;
        if (coVar != null && (riVar2 = coVar.lr) != null) {
            riVar2.sf();
        }
        try {
            try {
                jbsVar = new jbs(this.ik);
            } catch (Throwable th) {
                th.getMessage();
                jbsVar = null;
            }
        } catch (Exception unused) {
            HttpURLConnection httpURLConnection = this.ik;
            jbsVar = new jbs(httpURLConnection, httpURLConnection.getErrorStream());
        }
        co coVar2 = this.ka;
        if (coVar2 != null && (riVar = coVar2.lr) != null) {
            riVar.aw();
        }
        return jbsVar;
    }

    @Override // com.bytedance.sdk.component.lr.ri.bgr
    public String fi() throws IOException {
        return !TextUtils.isEmpty(this.di) ? this.di : this.ik.getResponseMessage();
    }

    @Override // com.bytedance.sdk.component.lr.ri.bgr
    public int ik() {
        return this.fi;
    }

    @Override // com.bytedance.sdk.component.lr.ri.bgr
    public String jbs() {
        return this.xha;
    }

    @Override // com.bytedance.sdk.component.lr.ri.bgr
    public boolean ka() {
        int i = this.fi;
        return i >= 200 && i < 300;
    }

    @Override // com.bytedance.sdk.component.lr.ri.bgr
    public long lr() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.lr.ri.bgr
    public com.bytedance.sdk.component.lr.ri.qt mj() {
        if (qt() == null || qt().lr == null) {
            return null;
        }
        return new com.bytedance.sdk.component.lr.ri.qt(qt().lr);
    }

    public co qt() {
        return this.ka;
    }

    @Override // com.bytedance.sdk.component.lr.ri.bgr
    public long ri() {
        return 0L;
    }

    public String toString() {
        return "";
    }

    @Override // com.bytedance.sdk.component.lr.ri.bgr
    public com.bytedance.sdk.component.lr.ri.di xha() {
        if (this.ik == null) {
            return new com.bytedance.sdk.component.lr.ri.di(new String[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.ik.getHeaderFields().entrySet()) {
            for (String str : entry.getValue()) {
                if (!"Content-Range".equalsIgnoreCase(entry.getKey()) || ik() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new com.bytedance.sdk.component.lr.ri.di((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public void ri(String str) {
        this.xha = str;
    }

    public mj(int i, String str, co coVar) {
        this.di = str;
        this.ka = coVar;
        this.fi = i;
    }

    public mj(int i, String str, co coVar, String str2) {
        this.di = str;
        this.ka = coVar;
        this.fi = i;
        this.xha = str2;
    }
}

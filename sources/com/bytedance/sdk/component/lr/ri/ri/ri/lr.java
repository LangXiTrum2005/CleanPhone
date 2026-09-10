package com.bytedance.sdk.component.lr.ri.ri.ri;

import android.text.TextUtils;
import com.bytedance.sdk.component.lr.ri.aw;
import com.bytedance.sdk.component.lr.ri.bgr;
import com.bytedance.sdk.component.lr.ri.co;
import com.bytedance.sdk.component.lr.ri.sf;
import com.ironsource.C3460cc;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class lr implements com.bytedance.sdk.component.lr.ri.lr {
    private static List<Object> ka;
    private AtomicBoolean ik = new AtomicBoolean(false);
    com.bytedance.sdk.component.lr.ri.ka lr;
    co ri;

    static {
        try {
            ka = new ArrayList();
            Class<?> cls = Class.forName("com.android.okhttp.Protocol");
            Enum enumValueOf = Enum.valueOf(cls, "HTTP_1_1");
            if (enumValueOf != null) {
                ka.add(enumValueOf);
            }
            Enum enumValueOf2 = Enum.valueOf(cls, "HTTP_2");
            if (enumValueOf2 != null) {
                ka.add(enumValueOf2);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public lr(co coVar, com.bytedance.sdk.component.lr.ri.ka kaVar) {
        this.ri = coVar;
        this.lr = kaVar;
    }

    private boolean fi() {
        if (this.ri.di() == null) {
            return false;
        }
        return this.ri.di().containsKey("Content-Type");
    }

    private static void ik(HttpURLConnection httpURLConnection) {
        try {
            Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(httpURLConnection);
            Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            obj2.getClass().getDeclaredMethod("setRetryOnConnectionFailure", Boolean.TYPE).invoke(obj2, Boolean.FALSE);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ka, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.lr.ri.lr clone() {
        return new lr(this.ri, this.lr);
    }

    @Override // com.bytedance.sdk.component.lr.ri.lr
    public bgr lr() throws IOException {
        List<com.bytedance.sdk.component.lr.ri.mj> list;
        com.bytedance.sdk.component.ik.ri.ri riVar;
        co coVar = this.ri;
        if (coVar != null && (riVar = coVar.lr) != null) {
            if (riVar.bgr() == 0) {
                this.ri.lr.vr();
            }
            this.ri.lr.ri();
        }
        this.lr.ik().remove(this);
        this.lr.ka().add(this);
        com.bytedance.sdk.component.lr.ri.ka kaVar = this.lr;
        if ((kaVar instanceof di) && (kaVar.ik().size() + this.lr.ka().size() > this.lr.ri() || this.ik.get())) {
            this.lr.ka().remove(this);
            return new mj(mj.ri, "Maximum number of requests exceeded", this.ri);
        }
        try {
            sf sfVar = this.ri.ri;
            if (sfVar == null || (list = sfVar.ri) == null || list.size() <= 0) {
                bgr bgrVarRi = ri(this.ri);
                this.lr.ka().remove(this);
                return bgrVarRi;
            }
            ArrayList arrayList = new ArrayList(this.ri.ri.ri);
            arrayList.add(new com.bytedance.sdk.component.lr.ri.mj() { // from class: com.bytedance.sdk.component.lr.ri.ri.ri.lr.1
                @Override // com.bytedance.sdk.component.lr.ri.mj
                public bgr ri(com.bytedance.sdk.component.lr.ri.mj.ri riVar2) throws IOException {
                    return lr.this.ri(riVar2.ri());
                }
            });
            bgr bgrVarRi2 = ((com.bytedance.sdk.component.lr.ri.mj) arrayList.get(0)).ri(new ik(arrayList, this.ri));
            this.lr.ka().remove(this);
            return bgrVarRi2;
        } catch (Throwable th) {
            try {
                throw new IOException(th.getMessage());
            } catch (Throwable th2) {
                this.lr.ka().remove(this);
                throw th2;
            }
        }
    }

    @Override // com.bytedance.sdk.component.lr.ri.lr
    public co ri() {
        return this.ri;
    }

    private boolean ri(aw awVar) {
        co coVar;
        byte[] bArr;
        return awVar != null && (coVar = this.ri) != null && C3460cc.b.equalsIgnoreCase(coVar.fi()) && awVar.di == aw.ri.BYTE_ARRAY_TYPE && (bArr = awVar.fi) != null && bArr.length > 0;
    }

    public bgr ri(co coVar) throws IOException {
        return ri(coVar, com.bytedance.sdk.component.xha.ri.fi());
    }

    public bgr ri(co coVar, boolean z) throws IOException {
        boolean zDi = com.bytedance.sdk.component.xha.ri.di();
        List<String> listRi = coVar != null ? coVar.ri() : null;
        boolean z2 = (listRi == null || listRi.isEmpty()) ? false : true;
        if (zDi && z2) {
            return ri(coVar, listRi);
        }
        return lr(coVar, z);
    }

    @Override // com.bytedance.sdk.component.lr.ri.lr
    public void ik() {
        this.ik.set(true);
    }

    private co ri(co coVar, String str) {
        return coVar.sf().lr(str).lr();
    }

    private bgr ri(co coVar, List<String> list) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(list.size() + 1);
        String string = coVar.ka().ri().toString();
        arrayList.add(string);
        for (String str : list) {
            if (str != null && !str.equals(string)) {
                arrayList.add(str);
            }
        }
        long jLr = coVar.lr();
        int size = arrayList.size();
        bgr bgrVar = null;
        int i = 0;
        while (i < size) {
            String str2 = (String) arrayList.get(i);
            if (System.currentTimeMillis() - jCurrentTimeMillis > jLr) {
                return bgrVar != null ? bgrVar : new mj(-1, "Total timeout", coVar, str2);
            }
            if (this.ik.get()) {
                return new mj(mj.lr, "Request canceled", coVar, str2);
            }
            try {
                arrayList.size();
                toString();
                bgr bgrVarLr = lr(i == 0 ? coVar : ri(coVar, str2), com.bytedance.sdk.component.xha.ri.fi());
                if (bgrVarLr instanceof mj) {
                    ((mj) bgrVarLr).ri(str2);
                }
                try {
                    if (bgrVarLr.ka()) {
                        toString();
                    } else if (i == arrayList.size() - 1) {
                        bgrVarLr.ik();
                    } else {
                        bgrVar = bgrVarLr;
                        i++;
                    }
                    return bgrVarLr;
                } catch (IOException e) {
                    e = e;
                    bgrVar = bgrVarLr;
                    e.getMessage();
                    if (i == arrayList.size() - 1) {
                        e.getMessage();
                    }
                }
            } catch (IOException e2) {
                e = e2;
            }
        }
        return bgrVar != null ? bgrVar : new mj(mj.ri, "No URLs to try", coVar, (String) arrayList.get(arrayList.size() - 1));
    }

    private boolean lr(aw awVar) {
        co coVar;
        return (awVar == null || (coVar = this.ri) == null || !C3460cc.b.equalsIgnoreCase(coVar.fi()) || awVar.di != aw.ri.STRING_TYPE || TextUtils.isEmpty(awVar.ka)) ? false : true;
    }

    private bgr lr(co coVar, boolean z) throws IOException {
        HttpURLConnection httpURLConnection;
        IOException e;
        String strRi;
        int i = mj.ri;
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(coVar.ka().ri().toString()).openConnection();
            if (z) {
                try {
                    if (!"setting".equals(coVar.mj()) && !"gecko".equals(coVar.mj()) && !"load_ug_t".equals(coVar.mj())) {
                        lr(httpURLConnection);
                    }
                } catch (IOException e2) {
                    e = e2;
                    if (i == -1 && z) {
                        coVar.ka().ri().toString();
                        return lr(coVar, false);
                    }
                    strRi = ri(httpURLConnection, e);
                } catch (Exception e3) {
                    e = e3;
                    httpURLConnection2 = httpURLConnection;
                    strRi = ri(httpURLConnection2, e);
                }
            }
            if (coVar.di() != null && !coVar.di().isEmpty()) {
                for (Map.Entry<String, List<String>> entry : coVar.di().entrySet()) {
                    String key = entry.getKey();
                    for (String str : entry.getValue()) {
                        if ("_disable_retry".equals(key) && "1".equals(str)) {
                            ik(httpURLConnection);
                        } else {
                            httpURLConnection.addRequestProperty(key, str);
                        }
                    }
                }
            }
            sf sfVar = coVar.ri;
            if (sfVar != null) {
                TimeUnit timeUnit = sfVar.ik;
                if (timeUnit != null) {
                    httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(sfVar.lr));
                }
                sf sfVar2 = coVar.ri;
                TimeUnit timeUnit2 = sfVar2.fi;
                if (timeUnit2 != null) {
                    httpURLConnection.setReadTimeout((int) timeUnit2.toMillis(sfVar2.ka));
                }
            }
            if (coVar.qt() == null) {
                httpURLConnection.setRequestMethod(C3460cc.a);
            } else {
                if (!fi() && coVar.qt().ik != null) {
                    httpURLConnection.addRequestProperty("Content-Type", coVar.qt().ik.ri());
                }
                httpURLConnection.setRequestMethod(coVar.fi());
                if (C3460cc.b.equalsIgnoreCase(coVar.fi())) {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    if (ri(coVar.qt())) {
                        outputStream.write(coVar.qt().fi);
                    } else if (lr(coVar.qt())) {
                        outputStream.write(coVar.qt().ka.getBytes());
                    }
                    outputStream.flush();
                    outputStream.close();
                }
            }
            com.bytedance.sdk.component.ik.ri.ri riVar = coVar.lr;
            if (riVar != null) {
                riVar.lr();
            }
            httpURLConnection.connect();
            com.bytedance.sdk.component.ik.ri.ri riVar2 = coVar.lr;
            if (riVar2 != null) {
                riVar2.ik();
            }
            int responseCode = httpURLConnection.getResponseCode();
            com.bytedance.sdk.component.ik.ri.ri riVar3 = coVar.lr;
            if (riVar3 != null) {
                riVar3.fi();
            }
            if (this.ik.get()) {
                i = mj.lr;
                ri(httpURLConnection);
                strRi = "internal error";
                return new mj(i, strRi, coVar);
            }
            return new mj(httpURLConnection, coVar, responseCode);
        } catch (IOException e4) {
            httpURLConnection = null;
            e = e4;
        } catch (Exception e5) {
            e = e5;
        }
    }

    private void ri(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    private static String ri(HttpURLConnection httpURLConnection, Exception exc) {
        try {
            return httpURLConnection.getErrorStream().toString();
        } catch (Throwable unused) {
            return exc.getMessage();
        }
    }

    @Override // com.bytedance.sdk.component.lr.ri.lr
    public void ri(final com.bytedance.sdk.component.lr.ri.ik ikVar) {
        com.bytedance.sdk.component.ik.ri.ri riVar;
        co coVar = this.ri;
        if (coVar != null && (riVar = coVar.lr) != null) {
            riVar.vr();
        }
        this.lr.lr().submit(new com.bytedance.sdk.component.mj.lr.ik(this.ri.mj(), this.ri.jbs()) { // from class: com.bytedance.sdk.component.lr.ri.ri.ri.lr.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    bgr bgrVarLr = lr.this.lr();
                    if (bgrVarLr == null) {
                        ikVar.ri(lr.this, new IOException("response is null"));
                    } else {
                        ikVar.ri(lr.this, bgrVarLr);
                    }
                } catch (IOException e) {
                    ikVar.ri(lr.this, e);
                }
            }
        });
    }

    private static void lr(HttpURLConnection httpURLConnection) {
        try {
            Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(httpURLConnection);
            Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (ka.size() == 2) {
                obj2.getClass().getDeclaredMethod("setProtocols", List.class).invoke(obj2, ka);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}

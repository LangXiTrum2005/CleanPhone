package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class Ob {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f26791a;

    public Ob(String str) {
        this.f26791a = str;
    }

    private C0693z8 a() throws Exception {
        C0693z8 c0693z8 = new C0693z8(this.f26791a, "metadata.json");
        if (!c0693z8.exists()) {
            a(c0693z8);
        }
        return c0693z8;
    }

    public synchronized JSONObject b() throws Exception {
        return new JSONObject(IronSourceStorageUtils.readFile(a()));
    }

    private void a(C0693z8 c0693z8) throws Exception {
        IronSourceStorageUtils.saveFile(new JSONObject().toString().getBytes(), c0693z8.getPath());
    }

    public synchronized boolean b(String str, JSONObject jSONObject) throws Exception {
        JSONObject jSONObjectB;
        try {
            jSONObjectB = b();
            JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject(str);
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectOptJSONObject.putOpt(next, jSONObject.opt(next));
                }
            } else {
                jSONObjectB.putOpt(str, jSONObject);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return a(jSONObjectB);
    }

    private boolean a(JSONObject jSONObject) throws Exception {
        return IronSourceStorageUtils.saveFile(jSONObject.toString().getBytes(), a().getPath()) != 0;
    }

    public synchronized boolean a(String str, JSONObject jSONObject) throws Exception {
        JSONObject jSONObjectB;
        jSONObjectB = b();
        jSONObjectB.put(str, jSONObject);
        return a(jSONObjectB);
    }

    public synchronized boolean a(String str) throws Exception {
        JSONObject jSONObjectB = b();
        if (!jSONObjectB.has(str)) {
            return true;
        }
        jSONObjectB.remove(str);
        return a(jSONObjectB);
    }

    public boolean a(ArrayList<C0693z8> arrayList) throws Exception {
        Iterator<C0693z8> it = arrayList.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            if (!a(it.next().getName())) {
                z10 = false;
            }
        }
        return z10;
    }
}

package com.p004ironsource;

import com.p004ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class rn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f26682a;

    public rn(String str) {
        this.f26682a = str;
    }

    private vh a() throws Exception {
        vh vhVar = new vh(this.f26682a, "metadata.json");
        if (!vhVar.exists()) {
            a(vhVar);
        }
        return vhVar;
    }

    public synchronized JSONObject b() throws Exception {
        return new JSONObject(IronSourceStorageUtils.readFile(a()));
    }

    private void a(vh vhVar) throws Exception {
        IronSourceStorageUtils.saveFile(new JSONObject().toString().getBytes(), vhVar.getPath());
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
        } catch (Throwable th) {
            throw th;
        }
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

    public synchronized boolean a(String str, JSONObject jSONObject) throws Exception {
        JSONObject jSONObjectB;
        jSONObjectB = b();
        jSONObjectB.put(str, jSONObject);
        return a(jSONObjectB);
    }

    public boolean a(ArrayList<vh> arrayList) throws Exception {
        Iterator<vh> it = arrayList.iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            if (!a(it.next().getName())) {
                z2 = false;
            }
        }
        return z2;
    }

    private boolean a(JSONObject jSONObject) throws Exception {
        return IronSourceStorageUtils.saveFile(jSONObject.toString().getBytes(), a().getPath()) != 0;
    }
}

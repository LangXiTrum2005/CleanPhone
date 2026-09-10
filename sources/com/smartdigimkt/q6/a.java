package com.smartdigimkt.q6;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.smartdigimkt.u6.d;
import com.smartdigimkt.u6.l;
import com.smartdigimkt.w6.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    l f37941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f37942c;
    private final Object d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37940a = "DirectlyAdRecord";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, String> f37943e = new ConcurrentHashMap();
    private Map<String, j> f = new ConcurrentHashMap();

    public a(Context context) {
        this.f37941b = l.a(d.a(context));
        Object obj = new Object();
        this.d = obj;
        this.f37942c = a();
        synchronized (obj) {
            try {
                List<j> listA = this.f37941b.a(this.f37942c);
                if (!listA.isEmpty()) {
                    for (int i2 = 0; i2 < listA.size(); i2++) {
                        j jVar = listA.get(i2);
                        this.f.put(jVar.e(), jVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int a() {
        return 1;
    }

    public List<j> b() {
        return this.f37941b.b(this.f37942c);
    }

    public void a(String str, int i2, int i3) {
        synchronized (this.d) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    j jVar = this.f.get(str);
                    StringBuilder sb = new StringBuilder("updateOfferActionCountRecord before: ");
                    sb.append(jVar != null ? jVar.f() : "");
                    Log.d("DirectlyAdRecord", sb.toString());
                    j jVarA = this.f37941b.a(this.f37942c, jVar, str, i2, i3);
                    if (jVarA != null) {
                        if (com.smartdigimkt.m6.b.p().D()) {
                            Log.i("DirectlyAdRecord", "updateOfferActionCountRecord " + jVarA.f());
                        }
                        this.f.put(str, jVarA);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(String str, long j) {
        synchronized (this.d) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    j jVar = this.f.get(str);
                    StringBuilder sb = new StringBuilder("updateActionRecordExpireTime before: ");
                    sb.append(jVar != null ? jVar.f() : "");
                    Log.d("DirectlyAdRecord", sb.toString());
                    j jVarA = this.f37941b.a(this.f37942c, jVar, str, j);
                    if (jVarA != null) {
                        if (com.smartdigimkt.m6.b.p().D()) {
                            Log.i("DirectlyAdRecord", "updateActionRecordExpireTime " + jVarA.f());
                        }
                        this.f.put(str, jVarA);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(String str, String str2) {
        synchronized (this.d) {
            this.f37943e.put(str, str2);
            this.f37941b.c(str, this.f37942c, str2);
        }
    }

    public List<j> a(List<String> list) {
        synchronized (this.d) {
            try {
                ArrayList arrayList = new ArrayList();
                if (list != null && !list.isEmpty()) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        String str = list.get(i2);
                        if (!TextUtils.isEmpty(str)) {
                            String str2 = this.f37943e.get(str);
                            if (!TextUtils.isEmpty(str2)) {
                                j jVar = this.f.get(str2);
                                if (com.smartdigimkt.m6.b.p().D()) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("getUnexpiredRecordListWithAdSounrceIds offerId: ");
                                    sb.append(str2);
                                    sb.append(",itemInfo: ");
                                    sb.append(jVar != null ? jVar.f() : AbstractJsonLexerKt.NULL);
                                    Log.w("DirectlyAdRecord", sb.toString());
                                }
                                if (jVar != null && System.currentTimeMillis() < jVar.b()) {
                                    if (com.smartdigimkt.m6.b.p().D()) {
                                        Log.e("DirectlyAdRecord", "getUnexpiredRecordListWithAdSounrceIds: " + str + "," + jVar.c() + "," + jVar.a() + "," + jVar.b());
                                    }
                                    arrayList.add(jVar);
                                }
                            }
                        }
                    }
                    return arrayList;
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

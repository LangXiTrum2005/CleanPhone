package com.mbridge.msdk.setting;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<String, f> f35665b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final e f35666a = new e();
    }

    public static e a() {
        return b.f35666a;
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.f35665b == null) {
                this.f35665b = new HashMap<>();
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObject.getString(next);
                f fVar = new f();
                fVar.a(next);
                fVar.b(string);
                this.f35665b.put(next, fVar);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private e() {
        this.f35664a = 6;
        this.f35665b = new HashMap<>();
    }

    public int a(String str) {
        HashMap<String, f> map;
        f fVar;
        int i10;
        if (TextUtils.isEmpty(str) || (map = this.f35665b) == null || !map.containsKey(str) || (fVar = this.f35665b.get(str)) == null) {
            return 0;
        }
        if (fVar.b()) {
            i10 = 1;
        } else {
            i10 = fVar.a() >= this.f35664a ? 2 : 0;
        }
        fVar.a(false);
        return i10;
    }
}

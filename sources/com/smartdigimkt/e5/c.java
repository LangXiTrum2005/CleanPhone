package com.smartdigimkt.e5;

import android.content.Context;
import com.smartdigimkt.n8.p;
import com.smartdigimkt.w6.f;
import com.smartdigimkt.w6.g;
import com.smartdigimkt.w6.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile c f34613c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f34615b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ConcurrentHashMap<String, ArrayList<String>> f34614a = new ConcurrentHashMap<>();

    public class a implements Runnable {
        final /* synthetic */ g X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f34616Y;
        final /* synthetic */ Context Z;
        final /* synthetic */ f e0;

        public a(g gVar, String str, Context context, f fVar) {
            this.X = gVar;
            this.f34616Y = str;
            this.Z = context;
            this.e0 = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.this.f34615b) {
                m mVar = (m) this.X;
                ArrayList<String> arrayList = c.this.f34614a.get(this.f34616Y);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    try {
                        JSONArray jSONArray = new JSONArray(p.a(this.Z, com.smartdigimkt.g8.b.C0495b.f35533i, this.f34616Y, ""));
                        if (jSONArray.length() > 0) {
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                arrayList.add(jSONArray.optString(i2));
                            }
                        }
                    } catch (Exception unused) {
                    }
                    c.this.f34614a.put(this.f34616Y, arrayList);
                }
                if (arrayList.size() >= mVar.T1()) {
                    arrayList.remove(arrayList.size() - 1);
                }
                arrayList.add(0, this.e0.L());
                p.b(this.Z, com.smartdigimkt.g8.b.C0495b.f35533i, this.f34616Y, new JSONArray((Collection) arrayList).toString());
            }
        }
    }

    private c() {
    }

    public static String a(String str, String str2) {
        return android.support.v4.media.a.m(str, str2);
    }

    public static c a() {
        if (f34613c == null) {
            synchronized (c.class) {
                try {
                    if (f34613c == null) {
                        f34613c = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f34613c;
    }

    public void a(Context context, String str, f fVar, g gVar) {
        if (fVar.O() == 3 && (gVar instanceof m) && ((m) gVar).T1() > 0) {
            com.smartdigimkt.l7.b.a().g(new a(gVar, str, context, fVar));
        }
    }

    public String[] a(Context context, String str) {
        ArrayList<String> arrayList = this.f34614a.get(str);
        if (arrayList == null) {
            try {
                JSONArray jSONArray = new JSONArray(p.a(context, com.smartdigimkt.g8.b.C0495b.f35533i, str, ""));
                if (jSONArray.length() > 0) {
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        try {
                            arrayList2.add(jSONArray.optString(i2));
                        } catch (Exception unused) {
                        }
                    }
                    arrayList = arrayList2;
                }
            } catch (Exception unused2) {
            }
        }
        if (arrayList == null) {
            return null;
        }
        this.f34614a.put(str, arrayList);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }
}

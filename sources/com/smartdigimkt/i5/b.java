package com.smartdigimkt.i5;

import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.l8.e;
import com.smartdigimkt.v3.c;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class b {
    private static volatile b d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f35850a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, c> f35852c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SimpleDateFormat f35851b = new SimpleDateFormat("yyyyMMdd");

    public class a implements Runnable {
        final /* synthetic */ c X;

        public a(c cVar) {
            this.X = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.smartdigimkt.u3.a.a(b.this.f35850a).a(this.X.f);
            com.smartdigimkt.u3.a.a(b.this.f35850a).a(this.X);
        }
    }

    private b(Context context) {
        this.f35850a = context.getApplicationContext();
    }

    public boolean b(com.smartdigimkt.z6.a aVar) {
        return aVar.I0() != -1 && a(aVar).d >= aVar.I0();
    }

    public boolean c(com.smartdigimkt.z6.a aVar) {
        return System.currentTimeMillis() - a(aVar).f39083e <= aVar.J0();
    }

    public void d(com.smartdigimkt.z6.a aVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.f35851b.format(new Date(jCurrentTimeMillis));
        c cVarA = a(aVar);
        if (cVarA.f.equals(str)) {
            cVarA.d++;
        } else {
            cVarA.d = 1;
            cVarA.f = str;
        }
        cVarA.f39083e = jCurrentTimeMillis;
        com.smartdigimkt.l7.b.a().g(new a(cVarA));
    }

    public static b a(Context context) {
        if (d == null) {
            synchronized (b.class) {
                try {
                    if (d == null) {
                        d = new b(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public String a() {
        List<c> listD = com.smartdigimkt.u3.a.a(this.f35850a).d(this.f35851b.format(new Date(System.currentTimeMillis())));
        JSONArray jSONArray = new JSONArray();
        if (listD != null) {
            Iterator<c> it = listD.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().f39080a);
            }
        }
        return jSONArray.toString();
    }

    public boolean a(String str) {
        List<com.smartdigimkt.z6.a> listC;
        e eVarA = com.smartdigimkt.k8.c.a().a(str);
        if (eVarA != null && (listC = eVarA.C()) != null && listC.size() > 0) {
            Iterator<com.smartdigimkt.z6.a> it = listC.iterator();
            while (it.hasNext()) {
                if (!b(it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    public c a(com.smartdigimkt.z6.a aVar) {
        String str = this.f35851b.format(new Date(System.currentTimeMillis()));
        c cVarC = this.f35852c.get(aVar.L());
        if (cVarC == null) {
            cVarC = com.smartdigimkt.u3.a.a(this.f35850a).c(aVar.L());
            if (cVarC == null) {
                cVarC = new c();
                cVarC.f39080a = aVar.L();
                cVarC.f39081b = aVar.I0();
                cVarC.f39082c = aVar.J0();
                cVarC.f39083e = 0L;
                cVarC.d = 0;
                cVarC.f = str;
            }
            this.f35852c.put(aVar.L(), cVarC);
        }
        if (!TextUtils.equals(str, cVarC.f)) {
            cVarC.f = str;
            cVarC.d = 0;
        }
        return cVarC;
    }
}

package com.smartdigimkt.y7;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class f implements h {
    private static final String d = "HttpLoaderInterceptor";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f40268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, h> f40269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f40270c;

    public f(Context context) {
        context = context instanceof Activity ? context.getApplicationContext() : context;
        this.f40268a = context;
        this.f40269b = new ConcurrentHashMap();
        this.f40270c = new a(context);
    }

    @Override // com.smartdigimkt.y7.h
    public com.smartdigimkt.x7.e a(com.smartdigimkt.x7.c cVar) {
        h hVarA;
        com.smartdigimkt.x7.e eVarA = null;
        if (this.f40268a != null && cVar != null) {
            try {
                a aVar = this.f40270c;
                eVarA = aVar != null ? aVar.a(cVar) : null;
                return ((eVarA == null || !eVarA.g()) && (hVarA = a(this.f40268a, cVar)) != null) ? hVarA.a(cVar) : eVarA;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return eVarA;
    }

    @Override // com.smartdigimkt.y7.h
    public void a(com.smartdigimkt.x7.e eVar, com.smartdigimkt.x7.c cVar) {
        if (this.f40268a == null || eVar == null || cVar == null) {
            return;
        }
        try {
            a aVar = this.f40270c;
            if (aVar != null) {
                aVar.a(eVar, cVar);
            }
            h hVarA = a(this.f40268a, cVar);
            if (hVarA != null) {
                hVarA.a(eVar, cVar);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private h a(Context context, com.smartdigimkt.x7.c cVar) {
        h hVarA;
        if (cVar == null || this.f40269b == null) {
            return null;
        }
        String strC = cVar.c();
        h hVar = this.f40269b.get(strC);
        if (hVar != null) {
            return hVar;
        }
        synchronized (this) {
            hVarA = a(context, strC);
        }
        return hVarA;
    }

    private h a(Context context, String str) {
        h bVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        switch (str) {
            case "app_strategy":
                bVar = new b(context);
                break;
            case "eu_traffic":
                bVar = new e(context);
                break;
            case "get_area":
                bVar = new c(context);
                break;
        }
        if (bVar != null) {
            this.f40269b.put(str, bVar);
        }
        return bVar;
    }
}

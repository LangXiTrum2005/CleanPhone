package com.smartdigimkt.i5;

import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.l8.e;
import com.smartdigimkt.m3.j;
import com.smartdigimkt.v3.c;
import com.smartdigimkt.v3.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f35847b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f35848a;

    /* JADX INFO: renamed from: com.smartdigimkt.i5.a$a, reason: collision with other inner class name */
    public class C0507a implements Comparator<c> {
        public C0507a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            return Integer.valueOf(cVar.d).compareTo(Integer.valueOf(cVar2.d));
        }
    }

    private a(Context context) {
        this.f35848a = context.getApplicationContext();
    }

    public static a a(Context context) {
        if (f35847b == null) {
            f35847b = new a(context);
        }
        return f35847b;
    }

    public void a(String str, JSONObject jSONObject) {
        List<com.smartdigimkt.z6.a> listC;
        com.smartdigimkt.z6.c cVarD;
        e eVarA = com.smartdigimkt.k8.c.a().a(str);
        if (eVarA == null && jSONObject != null) {
            eVarA = e.b(str, jSONObject);
            com.smartdigimkt.k8.c.a().a(str, eVarA, null, 0);
        }
        if (eVarA == null || (listC = eVarA.C()) == null || (cVarD = eVarA.D()) == null) {
            return;
        }
        j.a().a(str, listC, cVarD);
    }

    public com.smartdigimkt.z6.a a(String str, String str2) {
        e eVarA = com.smartdigimkt.k8.c.a().a(str);
        if (eVarA == null) {
            return null;
        }
        return eVarA.b(str2);
    }

    public String a(String str) {
        e eVarA = com.smartdigimkt.k8.c.a().a(str);
        if (eVarA == null) {
            return "";
        }
        List<com.smartdigimkt.z6.a> listC = eVarA.C();
        ArrayList arrayList = new ArrayList();
        if (listC == null || listC.size() == 0) {
            return "";
        }
        for (int size = listC.size() - 1; size >= 0; size--) {
            com.smartdigimkt.z6.a aVar = listC.get(size);
            if (!j.a().a(aVar, eVarA.v(), eVarA.D())) {
                listC.remove(size);
            } else {
                arrayList.add(b.a(this.f35848a).a(aVar));
            }
        }
        if (arrayList.size() == 0) {
            return "";
        }
        Collections.sort(arrayList, new C0507a());
        return ((c) arrayList.get(0)).f39080a;
    }

    public void a(String str, com.smartdigimkt.z6.a aVar, com.smartdigimkt.v6.a aVar2, com.smartdigimkt.r3.c.h hVar) {
        if (a(aVar)) {
            if (hVar != null) {
                hVar.a(i.a("20006", "The cross-promotion offer was filtered for exclude offers."));
            }
        } else if (b.a(this.f35848a).b(aVar)) {
            if (hVar != null) {
                hVar.a(i.a("20003", "Ad is out of cap!"));
            }
        } else if (!b.a(this.f35848a).c(aVar)) {
            j.a().a(str, aVar, aVar2, hVar);
        } else if (hVar != null) {
            hVar.a(i.a("20004", "Ad is in pacing!"));
        }
    }

    private boolean a(com.smartdigimkt.z6.a aVar) {
        List<String> listD = com.smartdigimkt.m6.b.p().d();
        if (listD == null) {
            return false;
        }
        Iterator<String> it = listD.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(aVar.X(), it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean a(com.smartdigimkt.z6.a aVar, com.smartdigimkt.v6.a aVar2, boolean z2) {
        if (this.f35848a == null || aVar == null || a(aVar)) {
            return false;
        }
        if (z2) {
            return j.a().a(aVar, aVar2);
        }
        return (b.a(this.f35848a).b(aVar) || b.a(this.f35848a).c(aVar) || !j.a().a(aVar, aVar2)) ? false : true;
    }
}

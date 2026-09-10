package com.smartdigimkt.i7;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f extends g<com.smartdigimkt.a7.c> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile f f35880h;

    private f(Context context) {
        super(context);
    }

    public static f a(Context context) {
        if (f35880h == null) {
            synchronized (f.class) {
                try {
                    if (f35880h == null) {
                        f35880h = new f(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f35880h;
    }

    @Override // com.smartdigimkt.i7.g
    public void a(List<com.smartdigimkt.a7.c> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<com.smartdigimkt.a7.c> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a().toString());
        }
        com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
        if (aVarB != null) {
            if (aVarB.A0() != 1) {
                com.smartdigimkt.b8.c cVar = new com.smartdigimkt.b8.c(this.d, aVarB.A0(), arrayList);
                cVar.a(true);
                cVar.a(0, (com.smartdigimkt.w7.c) null);
                return;
            } else {
                com.smartdigimkt.d8.a aVar = new com.smartdigimkt.d8.a(arrayList);
                aVar.a(1, aVarB.z0());
                aVar.a(true);
                aVar.a((com.smartdigimkt.d8.c.a) null);
                return;
            }
        }
        com.smartdigimkt.b8.c cVar2 = new com.smartdigimkt.b8.c(this.d, 0, arrayList);
        cVar2.a(true);
        cVar2.a(0, (com.smartdigimkt.w7.c) null);
    }
}

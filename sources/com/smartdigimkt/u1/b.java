package com.smartdigimkt.u1;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class b implements com.smartdigimkt.s1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.smartdigimkt.f1.d f38780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f38781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f38782c;
    private String d;

    public b(c cVar) {
        this.f38781b = cVar;
    }

    public void a(com.smartdigimkt.f1.d dVar) {
        this.f38780a = dVar;
    }

    public void a(String str) {
        this.d = str;
    }

    @Override // com.smartdigimkt.s1.c
    public void a(com.smartdigimkt.x.d dVar, int i2) {
        c cVar;
        c cVar2 = this.f38781b;
        if (cVar2 == null || !cVar2.g() || dVar == null) {
            return;
        }
        com.smartdigimkt.f1.d dVar2 = this.f38780a;
        if (dVar2 != null) {
            dVar2.onLoadSuccessed(i2);
            this.f38780a.isSupportZoomOut(dVar.D0() == 1);
        }
        this.f38781b.c(false);
        new ArrayList().add(dVar);
        if (i2 != 2 || (cVar = this.f38781b) == null) {
            return;
        }
        cVar.b(dVar, 0, true);
    }

    @Override // com.smartdigimkt.s1.c
    public void a(com.smartdigimkt.y.c cVar, int i2) {
        c cVar2 = this.f38781b;
        if (cVar2 == null || !cVar2.g()) {
            return;
        }
        String str = "";
        if (cVar != null) {
            String strJ = cVar.j();
            if (!TextUtils.isEmpty(strJ)) {
                str = strJ;
            }
        }
        com.smartdigimkt.f1.d dVar = this.f38780a;
        if (dVar != null) {
            dVar.onLoadFailed(str, i2);
        }
        this.f38781b.c(false);
    }

    public void a() {
        if (this.f38780a != null) {
            this.f38780a = null;
        }
    }
}

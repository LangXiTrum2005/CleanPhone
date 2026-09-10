package com.smartdigimkt.f;

import android.text.TextUtils;
import com.smartdigimkt.f1.p;
import com.smartdigimkt.x.h;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class b implements com.smartdigimkt.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p f34948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f34949b;

    public b(c cVar) {
        this.f34949b = cVar;
    }

    public void a(String str) {
    }

    public void a(p pVar) {
        this.f34948a = pVar;
    }

    @Override // com.smartdigimkt.d.a
    public void a(com.smartdigimkt.x.d dVar, int i2) {
        c cVar;
        c cVar2 = this.f34949b;
        if (cVar2 == null || !cVar2.h() || dVar == null) {
            return;
        }
        p pVar = this.f34948a;
        if (pVar != null && this.f34949b != null) {
            pVar.onLoadSuccessed();
        }
        this.f34949b.a(false);
        new ArrayList().add(dVar);
        if (i2 != 2 || (cVar = this.f34949b) == null) {
            return;
        }
        cVar.a(dVar, true);
    }

    public void a(h hVar, int i2, com.smartdigimkt.x.d dVar) {
        c cVar = this.f34949b;
        if (cVar == null || !cVar.h()) {
            return;
        }
        p pVar = this.f34948a;
        if (pVar != null) {
            pVar.onLoadFailed(hVar != null ? hVar.f() : "");
        }
        this.f34949b.a(false);
    }

    @Override // com.smartdigimkt.d.a
    public void a(com.smartdigimkt.y.c cVar, int i2) {
        c cVar2 = this.f34949b;
        if (cVar2 == null || !cVar2.h()) {
            return;
        }
        String str = "";
        if (cVar != null) {
            String strJ = cVar.j();
            if (!TextUtils.isEmpty(strJ)) {
                str = strJ;
            }
        }
        p pVar = this.f34948a;
        if (pVar != null) {
            pVar.onLoadFailed(str);
        }
        this.f34949b.a(false);
    }

    public void a() {
        if (this.f34948a != null) {
            this.f34948a = null;
        }
        if (this.f34949b != null) {
            this.f34949b = null;
        }
    }
}

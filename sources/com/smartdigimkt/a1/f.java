package com.smartdigimkt.a1;

import com.smartdigimkt.c3.i;

/* JADX INFO: loaded from: classes5.dex */
public class f implements i.c {
    private static final String d = "f";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.smartdigimkt.b1.b f33594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.smartdigimkt.x.d f33596c;

    public f(com.smartdigimkt.b1.b bVar, String str, com.smartdigimkt.x.d dVar) {
        this.f33594a = bVar;
        this.f33595b = str;
        this.f33596c = dVar;
    }

    @Override // com.smartdigimkt.c3.i.b
    public void a(String str, String str2, boolean z2) {
        com.smartdigimkt.b1.b bVar = this.f33594a;
        if (bVar != null) {
            bVar.a(this.f33595b, 3, str, true, this.f33596c);
        }
    }

    @Override // com.smartdigimkt.c3.i.b
    public void b(String str, String str2) {
        com.smartdigimkt.b1.b bVar = this.f33594a;
        if (bVar != null) {
            bVar.a(this.f33595b, 3, str, false, this.f33596c);
        }
    }
}

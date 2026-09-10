package com.smartdigimkt.r3;

import com.smartdigimkt.m3.j;
import com.smartdigimkt.v3.i;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
class f extends com.smartdigimkt.f7.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f38059i;
    private boolean j;
    private String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f38060l;
    private com.smartdigimkt.w6.f m;

    public f(String str, boolean z2, com.smartdigimkt.w6.f fVar, String str2) {
        super(str2);
        this.m = fVar;
        this.f38059i = str;
        this.j = z2;
        this.k = fVar.L();
        this.f38060l = fVar.O();
    }

    @Override // com.smartdigimkt.f7.b
    public void a(String str, String str2) {
    }

    @Override // com.smartdigimkt.f7.b
    public void b(String str, String str2) {
        e.a().a(this.f35253b, i.a(str, str2));
    }

    @Override // com.smartdigimkt.f7.b
    public void d() {
        e.a().a(this.f35253b, 100);
    }

    @Override // com.smartdigimkt.f7.b
    public Map<String, String> e() {
        return null;
    }

    @Override // com.smartdigimkt.f7.b
    public boolean a(InputStream inputStream) {
        return j.a().a(this.f35253b, inputStream);
    }

    @Override // com.smartdigimkt.f7.b
    public void a(com.smartdigimkt.l7.d dVar) {
        if (this.j) {
            com.smartdigimkt.l7.b.a().a(dVar, 5);
        } else {
            com.smartdigimkt.l7.b.a().a(dVar, 4);
        }
    }
}

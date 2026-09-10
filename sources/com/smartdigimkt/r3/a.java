package com.smartdigimkt.r3;

import com.smartdigimkt.m3.j;
import com.smartdigimkt.v3.i;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class a extends com.smartdigimkt.f7.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f38027i;

    public a(String str) {
        super(str);
        this.f38027i = getClass().getSimpleName();
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
    }

    @Override // com.smartdigimkt.f7.b
    public Map<String, String> e() {
        return null;
    }

    @Override // com.smartdigimkt.f7.b
    public boolean a(InputStream inputStream) {
        return j.a().a(this.f35253b, inputStream, 3);
    }

    @Override // com.smartdigimkt.f7.b
    public void a(com.smartdigimkt.l7.d dVar) {
        com.smartdigimkt.l7.b.a().a(dVar, 5);
    }
}

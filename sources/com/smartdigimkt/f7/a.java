package com.smartdigimkt.f7;

import com.smartdigimkt.d7.d;
import com.smartdigimkt.d7.e;
import com.smartdigimkt.n8.l;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class a extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    e f35251i;
    InterfaceC0483a j;

    /* JADX INFO: renamed from: com.smartdigimkt.f7.a$a, reason: collision with other inner class name */
    public interface InterfaceC0483a {
        void a(e eVar);

        void a(e eVar, String str);
    }

    public a(e eVar) {
        super(eVar.f34508b);
        this.f35251i = eVar;
    }

    @Override // com.smartdigimkt.f7.b
    public void a(String str, String str2) {
    }

    @Override // com.smartdigimkt.f7.b
    public void b(String str, String str2) {
        InterfaceC0483a interfaceC0483a = this.j;
        if (interfaceC0483a != null) {
            interfaceC0483a.a(this.f35251i, str2);
        }
    }

    @Override // com.smartdigimkt.f7.b
    public void d() {
        InterfaceC0483a interfaceC0483a = this.j;
        if (interfaceC0483a != null) {
            interfaceC0483a.a(this.f35251i);
        }
    }

    @Override // com.smartdigimkt.f7.b
    public Map<String, String> e() {
        return null;
    }

    public void a(InterfaceC0483a interfaceC0483a) {
        this.j = interfaceC0483a;
    }

    @Override // com.smartdigimkt.f7.b
    public boolean a(InputStream inputStream) {
        d dVarC = d.c();
        e eVar = this.f35251i;
        return dVarC.a(eVar.f34507a, l.b(eVar.f34508b), inputStream);
    }

    @Override // com.smartdigimkt.f7.b
    public void a(com.smartdigimkt.l7.d dVar) {
        com.smartdigimkt.l7.b.a().a(dVar, 4);
    }
}

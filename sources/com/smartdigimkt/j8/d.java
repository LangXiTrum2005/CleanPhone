package com.smartdigimkt.j8;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class d implements com.smartdigimkt.g8.a {
    private static final String f = "d";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f36120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f36121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.smartdigimkt.g8.d f36122c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36123e;

    public d(com.smartdigimkt.g8.d dVar) {
        this.f36122c = dVar;
        a(dVar);
        dVar.d();
    }

    private void c(String str) {
        b bVarA = a();
        if (bVarA != null) {
            bVarA.remove(str);
        }
    }

    @Override // com.smartdigimkt.g8.a
    public <V> void a(String str, V v) {
        com.smartdigimkt.g8.d dVar = this.f36122c;
        if (dVar != null) {
            a(str, v, dVar.d());
        } else {
            a(str, v, 1);
        }
    }

    @Override // com.smartdigimkt.g8.a
    public <V> V b(String str, V v) {
        e eVar;
        if (b(str)) {
            return (V) c(str, v);
        }
        if (this.f36123e == 0 && (eVar = this.f36121b) != null) {
            return (V) eVar.b(str, v);
        }
        b bVar = this.f36120a;
        if (bVar == null) {
            return v;
        }
        V v2 = (V) bVar.b(str, v);
        if (v2 != null && v2 != v) {
            return v2;
        }
        e eVar2 = this.f36121b;
        if (eVar2 != null) {
            return (V) eVar2.b(str, v);
        }
        return null;
    }

    @Override // com.smartdigimkt.g8.a
    public void clear() {
        b bVar;
        if (this.f36123e == 1 && (bVar = this.f36120a) != null) {
            bVar.clear();
            return;
        }
        e eVar = this.f36121b;
        if (eVar != null) {
            eVar.clear();
        }
    }

    @Override // com.smartdigimkt.g8.a
    public boolean contains(String str) {
        b bVar;
        if (b(str)) {
            return a(str);
        }
        if (this.f36123e == 1 && (bVar = this.f36120a) != null) {
            return bVar.contains(str);
        }
        e eVar = this.f36121b;
        if (eVar != null) {
            return eVar.contains(str);
        }
        return false;
    }

    @Override // com.smartdigimkt.g8.a
    public Map<String, Object> getAll() {
        b bVar;
        if (this.f36123e == 1 && (bVar = this.f36120a) != null) {
            return bVar.getAll();
        }
        e eVar = this.f36121b;
        if (eVar != null) {
            return eVar.getAll();
        }
        return null;
    }

    @Override // com.smartdigimkt.g8.a
    public void remove(String str) {
        b bVar;
        if (b(str)) {
            c(str);
            return;
        }
        if (this.f36123e == 1 && (bVar = this.f36120a) != null) {
            bVar.remove(str);
            return;
        }
        e eVar = this.f36121b;
        if (eVar != null) {
            eVar.remove(str);
        }
    }

    private <V> V c(String str, V v) {
        b bVarA = a();
        return bVarA != null ? (V) bVarA.b(str, v) : v;
    }

    @Override // com.smartdigimkt.g8.a
    public <V> void a(String str, V v, int i2) {
        b bVar;
        if (b(str)) {
            b(str, v, i2);
            return;
        }
        if (this.f36123e == 1 && (bVar = this.f36120a) != null) {
            bVar.a(str, v, i2);
            return;
        }
        e eVar = this.f36121b;
        if (eVar != null) {
            eVar.a(str, v, i2);
        }
    }

    private boolean b(String str) {
        return com.smartdigimkt.g8.c.a().b(str) && "sdm_sdk".equals(this.d);
    }

    private <V> void b(String str, V v, int i2) {
        b bVarA = a(i2);
        if (bVarA != null) {
            bVarA.a(str, v);
        }
    }

    public void a(com.smartdigimkt.g8.d dVar) {
        this.d = dVar.b();
        this.f36123e = dVar.c();
        this.f36120a = c.a(dVar);
        this.f36121b = c.c(dVar);
    }

    private b a(int i2) {
        if (this.f36122c == null) {
            return null;
        }
        return c.a(new com.smartdigimkt.g8.d.b().a(this.f36122c.a()).a(com.smartdigimkt.g8.b.C0495b.q).a(this.f36122c.c()).b(i2).a());
    }

    private b a() {
        com.smartdigimkt.g8.d dVar = this.f36122c;
        if (dVar != null) {
            return a(dVar.d());
        }
        return null;
    }

    private boolean a(String str) {
        b bVarA = a();
        return bVarA != null && bVarA.contains(str);
    }
}

package be;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements com.google.gson.u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f5652c = new k(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f5653d = new k(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eb.d0 f5654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f5655b = new ConcurrentHashMap();

    public l(eb.d0 d0Var) {
        this.f5654a = d0Var;
    }

    public final com.google.gson.t a(eb.d0 d0Var, com.google.gson.d dVar, fe.a aVar, zd.a aVar2, boolean z10) {
        com.google.gson.t tVarCreate;
        Object objD = d0Var.T0(new fe.a(aVar2.value()), true).d();
        boolean zNullSafe = aVar2.nullSafe();
        if (objD instanceof com.google.gson.t) {
            tVarCreate = (com.google.gson.t) objD;
        } else if (objD instanceof com.google.gson.u) {
            com.google.gson.u uVar = (com.google.gson.u) objD;
            if (z10) {
                com.google.gson.u uVar2 = (com.google.gson.u) this.f5655b.putIfAbsent(aVar.f40809a, uVar);
                if (uVar2 != null) {
                    uVar = uVar2;
                }
            }
            tVarCreate = uVar.create(dVar, aVar);
        } else {
            if (!(objD instanceof com.google.gson.f)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objD.getClass().getName() + " as a @JsonAdapter for " + ae.i.l(aVar.f40810b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            e0 e0Var = new e0((com.google.gson.f) objD, dVar, aVar, z10 ? f5652c : f5653d, zNullSafe);
            zNullSafe = false;
            tVarCreate = e0Var;
        }
        return (tVarCreate == null || !zNullSafe) ? tVarCreate : tVarCreate.a();
    }

    @Override // com.google.gson.u
    public final com.google.gson.t create(com.google.gson.d dVar, fe.a aVar) {
        zd.a aVar2 = (zd.a) aVar.f40809a.getAnnotation(zd.a.class);
        if (aVar2 == null) {
            return null;
        }
        return a(this.f5654a, dVar, aVar, aVar2, true);
    }
}

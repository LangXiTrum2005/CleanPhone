package com.mbridge.msdk.newreward.function.command;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f1616a;
    private Object b;
    private Object c;

    public f a() {
        return this.f1616a;
    }

    public Object b() {
        return this.b;
    }

    public Object c() {
        return this.c;
    }

    public void a(f fVar) {
        this.f1616a = fVar;
    }

    public void a(Object obj) {
        this.b = obj;
    }

    public void a(b bVar) {
        if (bVar != null) {
            this.c = bVar.c();
            this.f1616a = bVar.a();
            this.b = bVar.b();
        }
    }
}

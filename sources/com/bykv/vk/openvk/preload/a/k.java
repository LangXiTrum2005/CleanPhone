package com.bykv.vk.openvk.preload.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class k<IN, OUT> extends d<IN, OUT> {
    private IN d;

    @Override // com.bykv.vk.openvk.preload.a.d
    public final Object a(b<OUT> bVar, IN in) throws Throwable {
        this.d = in;
        try {
            return bVar.a(a());
        } catch (i.a e2) {
            return a((b) bVar, e2.getCause());
        } catch (Throwable th) {
            return a((b) bVar, th);
        }
    }

    public abstract boolean a(Throwable th);

    public final IN g() {
        return this.d;
    }

    private Object a(b<OUT> bVar, Throwable th) throws Throwable {
        while (a(th)) {
            try {
                return bVar.a(a());
            } catch (i.a e2) {
                th = e2.getCause();
            }
        }
        throw th;
    }

    public OUT a() {
        return this.d;
    }
}

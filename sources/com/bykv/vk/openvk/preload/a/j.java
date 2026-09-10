package com.bykv.vk.openvk.preload.a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class j<IN, OUT> extends l<IN, OUT> {
    private String d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.d
    public final Object a(b<OUT> bVar, IN in) throws Throwable {
        new m(bVar);
        this.d = a(in);
        l.a aVar = a().get(this.d);
        while (aVar != null) {
            List<h> list = aVar.f12878a;
            try {
                Object objA = c.a(list, bVar.f12875a, this).a(in);
                return !l.a(list) ? objA : bVar.a(objA);
            } catch (i.a e2) {
                Throwable cause = e2.getCause();
                new m(bVar);
                this.d = a(in, cause, this.d);
                aVar = a().get(this.d);
            } catch (Throwable th) {
                new m(bVar);
                this.d = a(in, th, this.d);
                aVar = a().get(this.d);
            }
        }
        throw new IllegalArgumentException("can not found branch，branch name is：" + this.d);
    }

    public abstract String a(IN in);

    public abstract String a(IN in, Throwable th, String str);
}

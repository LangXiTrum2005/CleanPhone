package com.bykv.vk.openvk.preload.b;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<IN, OUT> extends l<IN, OUT> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.b.d
    public final Object a(b<OUT> bVar, IN in) throws Exception {
        new c(bVar);
        String strA = a(in);
        l.a aVar = a().get(strA);
        if (aVar == null) {
            throw new IllegalArgumentException("can not found branch, branch name is：".concat(String.valueOf(strA)));
        }
        List<h> list = aVar.f313a;
        Object objA = c.a(list, ((i) bVar).f312a, this).a(in);
        return !l.a(list) ? objA : bVar.a(objA);
    }

    public abstract String a(IN in);
}

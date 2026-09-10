package com.smartdigimkt.m3;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f36617a = "j";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile j f36618b;

    private j() {
    }

    public static j a() {
        if (f36618b == null) {
            synchronized (j.class) {
                try {
                    if (f36618b == null) {
                        f36618b = new j();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f36618b;
    }

    public FileInputStream b(int i2, String str) {
        return com.smartdigimkt.d7.d.c().b(i2, com.smartdigimkt.n8.l.b(str));
    }

    public boolean a(String str, InputStream inputStream) {
        return a(str, inputStream, 1);
    }

    public boolean a(String str, InputStream inputStream, int i2) {
        if (str == null || inputStream == null) {
            return false;
        }
        return com.smartdigimkt.d7.d.c().a(i2, com.smartdigimkt.n8.l.b(str), inputStream);
    }

    public void a(String str, List<com.smartdigimkt.z6.a> list, com.smartdigimkt.z6.c cVar) {
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.smartdigimkt.v6.a aVar = new com.smartdigimkt.v6.a();
            aVar.t = cVar;
            aVar.m = com.smartdigimkt.m6.b.p().j();
            a(str, true, list.get(i2), aVar, null);
        }
    }

    public void a(String str, com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, com.smartdigimkt.r3.c.h hVar) {
        a(str, false, fVar, aVar, hVar);
    }

    public void a(String str, boolean z2, com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, com.smartdigimkt.r3.c.h hVar) {
        new com.smartdigimkt.r3.c(str, z2, fVar, aVar).a(hVar);
    }

    public boolean a(com.smartdigimkt.z6.a aVar, com.smartdigimkt.v6.a aVar2) {
        return com.smartdigimkt.r3.d.a(aVar, aVar2);
    }

    public boolean a(com.smartdigimkt.z6.a aVar, int i2, com.smartdigimkt.w6.g gVar) {
        return com.smartdigimkt.r3.d.a(aVar, i2, gVar);
    }

    public String a(int i2, String str) {
        return com.smartdigimkt.d7.d.c().d(i2, com.smartdigimkt.n8.l.b(str));
    }
}

package com.smartdigimkt.j8;

import com.smartdigimkt.h8.h;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile boolean f36119a = false;

    public static class a implements com.smartdigimkt.i8.c {
        @Override // com.smartdigimkt.i8.c
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.i8.c
        public void b(String str, Exception exc) {
            exc.getMessage();
        }

        @Override // com.smartdigimkt.i8.c
        public void a(String str, Exception exc) {
            exc.getMessage();
        }
    }

    private static void a() {
        if (f36119a) {
            return;
        }
        f36119a = true;
        h.a(com.smartdigimkt.l7.b.a().b());
        h.a(new a());
    }

    public static com.smartdigimkt.g8.a b(com.smartdigimkt.g8.d dVar) {
        if (dVar != null) {
            return new d(dVar);
        }
        return null;
    }

    public static e c(com.smartdigimkt.g8.d dVar) {
        if (dVar != null) {
            return new e(dVar);
        }
        return null;
    }

    public static b a(com.smartdigimkt.g8.d dVar) {
        if (dVar == null) {
            return null;
        }
        a();
        return new b(dVar);
    }
}

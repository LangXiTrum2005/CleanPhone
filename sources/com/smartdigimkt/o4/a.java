package com.smartdigimkt.o4;

import java.io.File;
import java.io.IOException;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public interface a {

    /* JADX INFO: renamed from: com.smartdigimkt.o4.a$a, reason: collision with other inner class name */
    public static class C0559a extends IOException {
        public C0559a(String str) {
            super(str);
        }

        public C0559a(Throwable th) {
            super(th);
        }
    }

    public interface b {
        void a(a aVar, e eVar);

        void a(a aVar, e eVar, e eVar2);

        void b(a aVar, e eVar);
    }

    long a();

    i a(String str);

    File a(String str, long j, long j2) throws C0559a;

    void a(e eVar) throws C0559a;

    void a(File file) throws C0559a;

    void a(String str, long j) throws C0559a;

    void a(String str, b bVar);

    void a(String str, k kVar) throws C0559a;

    long b(String str);

    e b(String str, long j) throws InterruptedException, C0559a;

    NavigableSet<e> b(String str, b bVar);

    Set<String> b();

    void b(e eVar);

    boolean b(String str, long j, long j2);

    long c(String str, long j, long j2);

    e c(String str, long j) throws C0559a;

    NavigableSet<e> c(String str);

    void release() throws C0559a;
}

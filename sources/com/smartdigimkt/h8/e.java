package com.smartdigimkt.h8;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, c> f35741a = androidx.datastore.preferences.protobuf.a.r();

    public class a extends c {
        public a(String str, b bVar) {
            super(str, bVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f35742Y.a(this.Z);
            } finally {
                e.this.f35741a.remove(this.X);
            }
        }
    }

    public interface b {
        void a(AtomicBoolean atomicBoolean);
    }

    public static abstract class c implements Runnable {
        final String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final b f35742Y;
        AtomicBoolean Z = new AtomicBoolean();

        public c(String str, b bVar) {
            this.X = str;
            this.f35742Y = bVar;
        }
    }

    private c b(String str, b bVar) {
        return new a(str, bVar);
    }

    public void a(String str, b bVar) {
        c cVarB = b(str, bVar);
        this.f35741a.put(str, cVarB);
        h.a().execute(cVarB);
    }

    public boolean a() {
        return !this.f35741a.isEmpty();
    }

    public boolean a(String str) {
        c cVar = this.f35741a.get(str);
        if (cVar == null) {
            return false;
        }
        cVar.Z.set(true);
        return true;
    }
}

package com.smartdigimkt.a4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.smartdigimkt.a4.i;
import com.smartdigimkt.p4.f0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class d<T extends i> implements g<T>, com.smartdigimkt.a4.b.c<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f33625n = "PRCustomData";
    public static final int o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f33626p = 1;
    public static final int q = 2;
    public static final int r = 3;
    public static final int s = 3;
    private static final String t = "DefaultDrmSessionMgr";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UUID f33627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j<T> f33628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f33629c;
    private final HashMap<String, String> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.smartdigimkt.a4.c.a f33630e;
    private final boolean f;
    private final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<com.smartdigimkt.a4.b<T>> f33631h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<com.smartdigimkt.a4.b<T>> f33632i;
    private Looper j;
    private int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte[] f33633l;
    volatile d<T>.HandlerC0432d m;

    @Deprecated
    public interface b extends com.smartdigimkt.a4.c {
    }

    public class c implements j.f<T> {
        private c() {
        }

        @Override // com.smartdigimkt.a4.j.f
        public void a(j<? extends T> jVar, byte[] bArr, int i2, int i3, byte[] bArr2) {
            if (d.this.k == 0) {
                d.this.m.obtainMessage(i2, bArr).sendToTarget();
            }
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.a4.d$d, reason: collision with other inner class name */
    public class HandlerC0432d extends Handler {
        public HandlerC0432d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            for (com.smartdigimkt.a4.b bVar : d.this.f33631h) {
                if (bVar.b(bArr)) {
                    bVar.a(message.what);
                    return;
                }
            }
        }
    }

    public static final class e extends Exception {
        private e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    @Deprecated
    public d(UUID uuid, j<T> jVar, n nVar, HashMap<String, String> map, Handler handler, com.smartdigimkt.a4.c cVar) {
        this(uuid, jVar, nVar, map);
        if (handler == null || cVar == null) {
            return;
        }
        a(handler, cVar);
    }

    @Deprecated
    public static d<k> a(n nVar, HashMap<String, String> map, Handler handler, com.smartdigimkt.a4.c cVar) throws o {
        d<k> dVarA = a(nVar, map);
        if (handler != null && cVar != null) {
            dVarA.a(handler, cVar);
        }
        return dVarA;
    }

    public final String b(String str) {
        return this.f33628b.b(str);
    }

    public d(UUID uuid, j<T> jVar, n nVar, HashMap<String, String> map) {
        this(uuid, (j) jVar, nVar, map, false, 3);
    }

    @Deprecated
    public d(UUID uuid, j<T> jVar, n nVar, HashMap<String, String> map, Handler handler, com.smartdigimkt.a4.c cVar, boolean z2) {
        this(uuid, jVar, nVar, map, z2);
        if (handler == null || cVar == null) {
            return;
        }
        a(handler, cVar);
    }

    public static d<k> a(n nVar, HashMap<String, String> map) throws o {
        return a(com.smartdigimkt.w3.b.k1, nVar, map);
    }

    @Deprecated
    public static d<k> a(n nVar, String str, Handler handler, com.smartdigimkt.a4.c cVar) throws o {
        d<k> dVarA = a(nVar, str);
        if (handler != null && cVar != null) {
            dVarA.a(handler, cVar);
        }
        return dVarA;
    }

    public d(UUID uuid, j<T> jVar, n nVar, HashMap<String, String> map, boolean z2) {
        this(uuid, jVar, nVar, map, z2, 3);
    }

    @Deprecated
    public d(UUID uuid, j<T> jVar, n nVar, HashMap<String, String> map, Handler handler, com.smartdigimkt.a4.c cVar, boolean z2, int i2) {
        this(uuid, jVar, nVar, map, z2, i2);
        if (handler == null || cVar == null) {
            return;
        }
        a(handler, cVar);
    }

    public static d<k> a(n nVar, String str) throws o {
        return a(com.smartdigimkt.w3.b.l1, nVar, (HashMap<String, String>) (!TextUtils.isEmpty(str) ? androidx.media3.extractor.text.ttml.a.s("PRCustomData", str) : null));
    }

    public d(UUID uuid, j<T> jVar, n nVar, HashMap<String, String> map, boolean z2, int i2) {
        com.smartdigimkt.p4.a.a(uuid);
        com.smartdigimkt.p4.a.a(jVar);
        com.smartdigimkt.p4.a.a(!com.smartdigimkt.w3.b.i1.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f33627a = uuid;
        this.f33628b = jVar;
        this.f33629c = nVar;
        this.d = map;
        this.f33630e = new com.smartdigimkt.a4.c.a();
        this.f = z2;
        this.g = i2;
        this.k = 0;
        this.f33631h = new ArrayList();
        this.f33632i = new ArrayList();
        if (z2) {
            jVar.a("sessionSharing", com.p004ironsource.mediationsdk.metadata.a.j);
        }
        jVar.a(new c());
    }

    @Deprecated
    public static d<k> a(UUID uuid, n nVar, HashMap<String, String> map, Handler handler, com.smartdigimkt.a4.c cVar) throws o {
        d<k> dVarA = a(uuid, nVar, map);
        if (handler != null && cVar != null) {
            dVarA.a(handler, cVar);
        }
        return dVarA;
    }

    public static d<k> a(UUID uuid, n nVar, HashMap<String, String> map) throws o {
        return new d<>(uuid, (j) l.a(uuid), nVar, map, false, 3);
    }

    public final void a(Handler handler, com.smartdigimkt.a4.c cVar) {
        this.f33630e.a(handler, cVar);
    }

    public final void a(com.smartdigimkt.a4.c cVar) {
        this.f33630e.a(cVar);
    }

    public final void a(String str, String str2) {
        this.f33628b.a(str, str2);
    }

    public final byte[] a(String str) {
        return this.f33628b.a(str);
    }

    public final void a(String str, byte[] bArr) {
        this.f33628b.a(str, bArr);
    }

    public void a(int i2, byte[] bArr) {
        com.smartdigimkt.p4.a.b(this.f33631h.isEmpty());
        if (i2 == 1 || i2 == 3) {
            com.smartdigimkt.p4.a.a(bArr);
        }
        this.k = i2;
        this.f33633l = bArr;
    }

    @Override // com.smartdigimkt.a4.g
    public boolean a(com.smartdigimkt.a4.e eVar) {
        if (this.f33633l != null) {
            return true;
        }
        if (a(eVar, this.f33627a, true) == null) {
            if (eVar.d != 1 || !eVar.a(0).a(com.smartdigimkt.w3.b.i1)) {
                return false;
            }
            Log.w(t, "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f33627a);
        }
        String str = eVar.f33638c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return !("cbc1".equals(str) || "cbcs".equals(str) || "cens".equals(str)) || f0.f37540a >= 25;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.smartdigimkt.a4.d$a] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.smartdigimkt.a4.b, com.smartdigimkt.a4.f<T extends com.smartdigimkt.a4.i>] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.smartdigimkt.a4.b] */
    @Override // com.smartdigimkt.a4.g
    public com.smartdigimkt.a4.f<T> a(Looper looper, com.smartdigimkt.a4.e eVar) {
        com.smartdigimkt.a4.e.b bVar;
        ?? r2;
        Looper looper2 = this.j;
        com.smartdigimkt.p4.a.b(looper2 == null || looper2 == looper);
        if (this.f33631h.isEmpty()) {
            this.j = looper;
            if (this.m == null) {
                this.m = new HandlerC0432d(looper);
            }
        }
        com.smartdigimkt.a4.b<T> bVar2 = 0;
        bVar2 = 0;
        if (this.f33633l == null) {
            com.smartdigimkt.a4.e.b bVarA = a(eVar, this.f33627a, false);
            if (bVarA == null) {
                e eVar2 = new e(this.f33627a);
                this.f33630e.a(eVar2);
                return new h(new com.smartdigimkt.a4.f.a(eVar2));
            }
            bVar = bVarA;
        } else {
            bVar = null;
        }
        if (!this.f) {
            if (!this.f33631h.isEmpty()) {
                bVar2 = this.f33631h.get(0);
            }
        } else {
            byte[] bArr = bVar != null ? bVar.f33642e : null;
            for (com.smartdigimkt.a4.b<T> bVar3 : this.f33631h) {
                if (bVar3.a(bArr)) {
                    bVar2 = bVar3;
                    break;
                }
            }
        }
        if (bVar2 == 0) {
            com.smartdigimkt.a4.b<T> bVar4 = new com.smartdigimkt.a4.b<>(this.f33627a, this.f33628b, this, bVar, this.k, this.f33633l, this.d, this.f33629c, looper, this.f33630e, this.g);
            this.f33631h.add(bVar4);
            r2 = bVar4;
        } else {
            r2 = bVar2;
        }
        ((com.smartdigimkt.a4.b) r2).a();
        return (com.smartdigimkt.a4.f<T>) r2;
    }

    @Override // com.smartdigimkt.a4.g
    public void a(com.smartdigimkt.a4.f<T> fVar) {
        if (fVar instanceof h) {
            return;
        }
        com.smartdigimkt.a4.b<T> bVar = (com.smartdigimkt.a4.b) fVar;
        if (bVar.l()) {
            this.f33631h.remove(bVar);
            if (this.f33632i.size() > 1 && this.f33632i.get(0) == bVar) {
                this.f33632i.get(1).k();
            }
            this.f33632i.remove(bVar);
        }
    }

    @Override // com.smartdigimkt.a4.b.c
    public void a(com.smartdigimkt.a4.b<T> bVar) {
        this.f33632i.add(bVar);
        if (this.f33632i.size() == 1) {
            bVar.k();
        }
    }

    @Override // com.smartdigimkt.a4.b.c
    public void a() {
        Iterator<com.smartdigimkt.a4.b<T>> it = this.f33632i.iterator();
        while (it.hasNext()) {
            it.next().j();
        }
        this.f33632i.clear();
    }

    @Override // com.smartdigimkt.a4.b.c
    public void a(Exception exc) {
        Iterator<com.smartdigimkt.a4.b<T>> it = this.f33632i.iterator();
        while (it.hasNext()) {
            it.next().c(exc);
        }
        this.f33632i.clear();
    }

    private static com.smartdigimkt.a4.e.b a(com.smartdigimkt.a4.e eVar, UUID uuid, boolean z2) {
        ArrayList arrayList = new ArrayList(eVar.d);
        for (int i2 = 0; i2 < eVar.d; i2++) {
            com.smartdigimkt.a4.e.b bVarA = eVar.a(i2);
            if ((bVarA.a(uuid) || (com.smartdigimkt.w3.b.j1.equals(uuid) && bVarA.a(com.smartdigimkt.w3.b.i1))) && (bVarA.f33642e != null || z2)) {
                arrayList.add(bVarA);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (com.smartdigimkt.w3.b.k1.equals(uuid)) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                com.smartdigimkt.a4.e.b bVar = (com.smartdigimkt.a4.e.b) arrayList.get(i3);
                int iC = bVar.a() ? com.smartdigimkt.c4.h.c(bVar.f33642e) : -1;
                int i4 = f0.f37540a;
                if ((i4 < 23 && iC == 0) || (i4 >= 23 && iC == 1)) {
                    return bVar;
                }
            }
        }
        return (com.smartdigimkt.a4.e.b) arrayList.get(0);
    }
}

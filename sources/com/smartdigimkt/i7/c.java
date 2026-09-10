package com.smartdigimkt.i7;

import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.b8.p;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class c extends g<com.smartdigimkt.a7.b> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile c f35860h;

    public class a implements Runnable {
        final /* synthetic */ int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.a7.a f35861Y;
        final /* synthetic */ long Z;

        public a(int i2, com.smartdigimkt.a7.a aVar, long j) {
            this.X = i2;
            this.f35861Y = aVar;
            this.Z = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.smartdigimkt.a7.b bVarB = c.this.b(this.X, this.f35861Y, this.Z);
            if (bVarB == null) {
                return;
            }
            c cVar = c.this;
            c.super.a(bVarB, cVar.c(this.X, this.f35861Y));
        }
    }

    private c(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.smartdigimkt.a7.b b(int i2, com.smartdigimkt.a7.a aVar, long j) {
        com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
        com.smartdigimkt.a7.b bVar = new com.smartdigimkt.a7.b();
        bVar.f33748a = i2;
        bVar.f33749b = aVar;
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        bVar.f33750c = j;
        if (a(i2, aVar, aVarB)) {
            return null;
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(int i2, com.smartdigimkt.a7.a aVar) {
        if (aVar.W() == 67 || i2 == 4 || i2 == 6) {
            return true;
        }
        if (aVar.W() == 0 || TextUtils.isEmpty(aVar.I())) {
            return false;
        }
        if (!TextUtils.isEmpty(aVar.y()) || !TextUtils.isEmpty(aVar.x())) {
            return true;
        }
        Map<String, String> mapA = com.smartdigimkt.k8.a.e().b().a(i2);
        if (mapA != null) {
            if (mapA.containsKey("0")) {
                String str = mapA.get("0");
                return !TextUtils.isEmpty(str) && str.contains(aVar.I());
            }
            if (mapA.containsKey(String.valueOf(aVar.W()))) {
                String str2 = mapA.get(String.valueOf(aVar.W()));
                if (!TextUtils.isEmpty(str2) && str2.contains(aVar.I())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static c a(Context context) {
        if (f35860h == null) {
            synchronized (c.class) {
                try {
                    if (f35860h == null) {
                        f35860h = new c(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f35860h;
    }

    private void b(int i2, com.smartdigimkt.a7.a aVar) {
        if (i2 == 4) {
            aVar.i0();
        } else if (i2 == 6) {
            aVar.h0();
        }
        b.b().a(i2, aVar);
    }

    public void a(int i2, com.smartdigimkt.a7.a aVar) {
        a(i2, aVar, -1L);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0027 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r8, com.smartdigimkt.a7.a r9, long r10) throws java.lang.Throwable {
        /*
            r7 = this;
            if (r9 != 0) goto L3
            goto L21
        L3:
            int r0 = r9.W()
            r1 = 66
            if (r0 == r1) goto Lc
            goto L21
        Lc:
            monitor-enter(r9)
            r7.b(r8, r9)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L22
            android.os.Handler r0 = r7.f35884e
            if (r0 == 0) goto L21
            com.smartdigimkt.i7.c$a r1 = new com.smartdigimkt.i7.c$a
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>(r3, r4, r5)
            r0.post(r1)
        L21:
            return
        L22:
            r0 = move-exception
            r4 = r9
        L24:
            r8 = r0
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L27
            throw r8
        L27:
            r0 = move-exception
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smartdigimkt.i7.c.a(int, com.smartdigimkt.a7.a, long):void");
    }

    private boolean a(int i2, com.smartdigimkt.a7.a aVar, com.smartdigimkt.l8.a aVar2) {
        if (com.smartdigimkt.m6.b.p().C()) {
            return true;
        }
        String strG0 = aVar2.G0();
        if (!TextUtils.isEmpty(strG0)) {
            try {
                JSONArray jSONArray = new JSONArray(strG0);
                int length = jSONArray.length();
                String strValueOf = String.valueOf(aVar.W());
                for (int i3 = 0; i3 < length; i3++) {
                    if (TextUtils.equals(strValueOf, jSONArray.optString(i3))) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        Map<String, String> mapF0 = aVar2.F0();
        if (mapF0 != null && mapF0.containsKey(String.valueOf(i2))) {
            String str = mapF0.get(String.valueOf(i2));
            if (!TextUtils.isEmpty(str)) {
                String strI = aVar.I();
                if (TextUtils.isEmpty(strI) || str.contains(strI)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.smartdigimkt.i7.g
    public void a(List<com.smartdigimkt.a7.b> list) {
        com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
        if (aVarB != null) {
            int iA0 = aVarB.A0();
            if (iA0 == 1) {
                com.smartdigimkt.d8.e eVar = new com.smartdigimkt.d8.e(list);
                eVar.a(1, aVarB.z0());
                eVar.a((com.smartdigimkt.d8.c.a) null);
                return;
            } else {
                if (iA0 != 2) {
                    new p(this.d, aVarB.A0(), list).a(0, (com.smartdigimkt.w7.c) null);
                    return;
                }
                new p(this.d, aVarB.A0(), list).a(0, (com.smartdigimkt.w7.c) null);
                com.smartdigimkt.d8.e eVar2 = new com.smartdigimkt.d8.e(list);
                eVar2.a(2, aVarB.z0());
                eVar2.a((com.smartdigimkt.d8.c.a) null);
                return;
            }
        }
        new p(this.d, 0, list).a(0, (com.smartdigimkt.w7.c) null);
    }
}

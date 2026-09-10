package com.bumptech.glide;

import a7.p;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import androidx.datastore.preferences.protobuf.i1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import t6.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends w6.a {
    public boolean A;
    public boolean B;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Context f10490q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f10491r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f10493t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a f10494u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f10495v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f10496w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i f10497x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public i f10498y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f10499z = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Class f10492s = Bitmap.class;

    static {
    }

    public i(b bVar, k kVar, Context context) {
        w6.f fVar;
        this.f10491r = kVar;
        this.f10490q = context;
        x.e eVar = kVar.f10503a.f10460d.f10470e;
        a aVar = (a) eVar.get(Bitmap.class);
        if (aVar == null) {
            for (Map.Entry entry : (i1) eVar.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(Bitmap.class)) {
                    aVar = (a) entry.getValue();
                }
            }
        }
        this.f10494u = aVar == null ? e.f10465j : aVar;
        this.f10493t = bVar.f10460d;
        Iterator it = kVar.f10511i.iterator();
        while (it.hasNext()) {
            r((w6.e) it.next());
        }
        synchronized (kVar) {
            fVar = kVar.f10512j;
        }
        a(fVar);
    }

    @Override // w6.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return super.equals(iVar) && Objects.equals(this.f10492s, iVar.f10492s) && this.f10494u.equals(iVar.f10494u) && Objects.equals(this.f10495v, iVar.f10495v) && Objects.equals(this.f10496w, iVar.f10496w) && Objects.equals(this.f10497x, iVar.f10497x) && Objects.equals(this.f10498y, iVar.f10498y) && this.f10499z == iVar.f10499z && this.A == iVar.A;
    }

    @Override // w6.a
    public final int hashCode() {
        return p.g(this.A ? 1 : 0, p.g(this.f10499z ? 1 : 0, p.h(p.h(p.h(p.h(p.h(p.h(p.h(super.hashCode(), this.f10492s), this.f10494u), this.f10495v), this.f10496w), this.f10497x), this.f10498y), null)));
    }

    public final i r(w6.e eVar) {
        if (this.f52942n) {
            return clone().r(eVar);
        }
        if (eVar != null) {
            if (this.f10496w == null) {
                this.f10496w = new ArrayList();
            }
            this.f10496w.add(eVar);
        }
        j();
        return this;
    }

    @Override // w6.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final i a(w6.a aVar) {
        a7.h.b(aVar);
        return (i) super.a(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final w6.c t(Object obj, x6.a aVar, w6.e eVar, w6.d dVar, a aVar2, f fVar, int i10, int i11, w6.a aVar3, Executor executor) {
        w6.d dVar2;
        w6.d bVar;
        w6.a aVar4;
        w6.c gVar;
        f fVar2;
        if (this.f10498y != null) {
            bVar = new w6.b(obj, dVar);
            dVar2 = bVar;
        } else {
            dVar2 = null;
            bVar = dVar;
        }
        i iVar = this.f10497x;
        if (iVar == null) {
            Context context = this.f10490q;
            e eVar2 = this.f10493t;
            aVar4 = aVar3;
            gVar = new w6.g(context, eVar2, obj, this.f10495v, this.f10492s, aVar4, i10, i11, fVar, aVar, eVar, this.f10496w, bVar, eVar2.f10471f, aVar2.f10454a, executor);
        } else {
            if (this.B) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            a aVar5 = iVar.f10499z ? aVar2 : iVar.f10494u;
            if (w6.a.f(iVar.f52930a, 8)) {
                fVar2 = this.f10497x.f52932c;
            } else {
                int iOrdinal = fVar.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    fVar2 = f.f10475a;
                } else if (iOrdinal == 2) {
                    fVar2 = f.f10476b;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.f52932c);
                    }
                    fVar2 = f.f10477c;
                }
            }
            f fVar3 = fVar2;
            i iVar2 = this.f10497x;
            int i12 = iVar2.f52935f;
            int i13 = iVar2.f52934e;
            if (p.i(i10, i11)) {
                i iVar3 = this.f10497x;
                if (!p.i(iVar3.f52935f, iVar3.f52934e)) {
                    i12 = aVar3.f52935f;
                    i13 = aVar3.f52934e;
                }
            }
            int i14 = i13;
            int i15 = i12;
            w6.h hVar = new w6.h(obj, bVar);
            Context context2 = this.f10490q;
            e eVar3 = this.f10493t;
            w6.h hVar2 = hVar;
            w6.g gVar2 = new w6.g(context2, eVar3, obj, this.f10495v, this.f10492s, aVar3, i10, i11, fVar, aVar, eVar, this.f10496w, hVar2, eVar3.f10471f, aVar2.f10454a, executor);
            this.B = true;
            i iVar4 = this.f10497x;
            w6.c cVarT = iVar4.t(obj, aVar, eVar, hVar2, aVar5, fVar3, i15, i14, iVar4, executor);
            this.B = false;
            hVar2.f52986c = gVar2;
            hVar2.f52987d = cVarT;
            aVar4 = aVar3;
            gVar = hVar2;
        }
        if (dVar2 == null) {
            return gVar;
        }
        i iVar5 = this.f10498y;
        int i16 = iVar5.f52935f;
        int i17 = iVar5.f52934e;
        if (p.i(i10, i11)) {
            i iVar6 = this.f10498y;
            if (!p.i(iVar6.f52935f, iVar6.f52934e)) {
                i16 = aVar4.f52935f;
                i17 = aVar4.f52934e;
            }
        }
        i iVar7 = this.f10498y;
        w6.b bVar2 = dVar2;
        w6.c cVarT2 = iVar7.t(obj, aVar, eVar, bVar2, iVar7.f10494u, iVar7.f52932c, i16, i17, iVar7, executor);
        bVar2.f52947c = gVar;
        bVar2.f52948d = cVarT2;
        return bVar2;
    }

    @Override // w6.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final i clone() {
        i iVar = (i) super.clone();
        iVar.f10494u = iVar.f10494u.clone();
        if (iVar.f10496w != null) {
            iVar.f10496w = new ArrayList(iVar.f10496w);
        }
        i iVar2 = iVar.f10497x;
        if (iVar2 != null) {
            iVar.f10497x = iVar2.clone();
        }
        i iVar3 = iVar.f10498y;
        if (iVar3 != null) {
            iVar.f10498y = iVar3.clone();
        }
        return iVar;
    }

    public final void v(x6.a aVar, w6.e eVar, Executor executor) {
        a7.h.b(aVar);
        if (!this.A) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        w6.c cVarT = t(new Object(), aVar, eVar, null, this.f10494u, this.f52932c, this.f52935f, this.f52934e, this, executor);
        w6.c cVarD = aVar.d();
        if (cVarT.c(cVarD) && (this.f52933d || !cVarD.h())) {
            a7.h.c(cVarD, "Argument must not be null");
            if (cVarD.isRunning()) {
                return;
            }
            cVarD.j();
            return;
        }
        this.f10491r.i(aVar);
        aVar.b(cVarT);
        k kVar = this.f10491r;
        synchronized (kVar) {
            kVar.f10508f.f50552a.add(aVar);
            l lVar = kVar.f10506d;
            ((Set) lVar.f50550c).add(cVarT);
            if (lVar.f50549b) {
                cVarT.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((HashSet) lVar.f50551d).add(cVarT);
            } else {
                cVarT.j();
            }
        }
    }

    public final i w(Uri uri) {
        PackageInfo packageInfo;
        i iVarX = x(uri);
        if (!"android.resource".equals(uri.getScheme())) {
            return iVarX;
        }
        Context context = this.f10490q;
        i iVar = (i) iVarX.n(context.getTheme());
        ConcurrentHashMap concurrentHashMap = z6.b.f54651a;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = z6.b.f54651a;
        e6.f fVar = (e6.f) concurrentHashMap2.get(packageName);
        if (fVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e10);
                packageInfo = null;
            }
            z6.d dVar = new z6.d(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            e6.f fVar2 = (e6.f) concurrentHashMap2.putIfAbsent(packageName, dVar);
            fVar = fVar2 == null ? dVar : fVar2;
        }
        return (i) iVar.l(new z6.a(context.getResources().getConfiguration().uiMode & 48, fVar));
    }

    public final i x(Object obj) {
        if (this.f52942n) {
            return clone().x(obj);
        }
        this.f10495v = obj;
        this.A = true;
        j();
        return this;
    }
}

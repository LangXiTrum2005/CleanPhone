package com.google.android.gms.internal.consent_sdk;

import android.accounts.Account;
import android.app.Application;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.applovin.impl.ca;
import com.google.android.gms.internal.ads.aj0;
import com.google.android.gms.internal.measurement.ce;
import com.google.android.gms.internal.measurement.dg;
import com.google.android.gms.internal.measurement.ff;
import com.google.android.gms.internal.measurement.tg;
import com.google.android.gms.internal.measurement.ue;
import com.google.android.gms.internal.measurement.wd;
import com.google.android.gms.internal.measurement.wf;
import com.google.android.gms.internal.measurement.xe;
import com.google.android.gms.internal.measurement.xf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.O6;
import com.storage.androidcleaner.R;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements k7, lm.a, lm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f23260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f23261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f23262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f23263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f23264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f23265f;

    public x(g6 g6Var, j7 j7Var, j7 j7Var2, g gVar, g6 g6Var2, j7 j7Var3) {
        this.f23260a = g6Var;
        this.f23264e = j7Var;
        this.f23261b = j7Var2;
        this.f23262c = gVar;
        this.f23265f = g6Var2;
        this.f23263d = j7Var3;
    }

    public static final dm.g a(x xVar, yl.f fVar, Object obj) {
        dm.g gVarB = dm.h.b((cl.f0) xVar.f23262c, obj);
        if (gVarB != null) {
            return gVarB;
        }
        String message = "Unsupported annotation argument: " + fVar;
        kotlin.jvm.internal.n.f(message, "message");
        return new dm.j(message);
    }

    public static boolean c(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList e(Context context, int i10) {
        int iC = p.n2.c(context, R.attr.colorControlHighlight);
        int iB = p.n2.b(context, R.attr.colorButtonNormal);
        int[] iArr = p.n2.f47741b;
        int[] iArr2 = p.n2.f47743d;
        int iB2 = f0.a.b(iC, i10);
        return new ColorStateList(new int[][]{iArr, iArr2, p.n2.f47742c, p.n2.f47745f}, new int[]{iB, iB2, f0.a.b(iC, i10), i10});
    }

    public static /* synthetic */ List g(x xVar, lm.u uVar, rl.o oVar, Boolean bool, boolean z10, int i10) {
        boolean z11 = (i10 & 4) == 0;
        if ((i10 & 16) != 0) {
            bool = null;
        }
        return xVar.f(uVar, oVar, z11, false, bool, (i10 & 32) != 0 ? false : z10);
    }

    public static f2.c0 h(i1.k0 k0Var, oa.j0 j0Var, f2.c0 c0Var, i1.n0 n0Var) {
        p1.b0 b0Var = (p1.b0) k0Var;
        i1.p0 p0VarQ0 = b0Var.Q0();
        int iN0 = b0Var.N0();
        Object objL = p0VarQ0.p() ? null : p0VarQ0.l(iN0);
        int iB = (b0Var.W0() || p0VarQ0.p()) ? -1 : p0VarQ0.f(iN0, n0Var, false).b(l1.y.M(b0Var.O0()) - n0Var.f42586e);
        for (int i10 = 0; i10 < j0Var.size(); i10++) {
            f2.c0 c0Var2 = (f2.c0) j0Var.get(i10);
            if (o(c0Var2, objL, b0Var.W0(), b0Var.K0(), b0Var.L0(), iB)) {
                return c0Var2;
            }
        }
        if (j0Var.isEmpty() && c0Var != null && o(c0Var, objL, b0Var.W0(), b0Var.K0(), b0Var.L0(), iB)) {
            return c0Var;
        }
        return null;
    }

    public static rl.o j(zl.a proto, vl.f nameResolver, l3.i iVar, int i10, boolean z10) {
        kotlin.jvm.internal.n.f(proto, "proto");
        kotlin.jvm.internal.n.f(nameResolver, "nameResolver");
        d5.u.n(i10, "kind");
        if (proto instanceof tl.l) {
            zl.g gVar = xl.h.f53909a;
            xl.e eVarA = xl.h.a((tl.l) proto, nameResolver, iVar);
            if (eVarA != null) {
                return d0.c.k(eVarA);
            }
        } else if (proto instanceof tl.y) {
            zl.g gVar2 = xl.h.f53909a;
            xl.e eVarC = xl.h.c((tl.y) proto, nameResolver, iVar);
            if (eVarC != null) {
                return d0.c.k(eVarC);
            }
        } else if (proto instanceof tl.g0) {
            zl.m propertySignature = wl.k.f53469d;
            kotlin.jvm.internal.n.e(propertySignature, "propertySignature");
            wl.e eVar = (wl.e) com.google.android.gms.internal.auth.i.u((zl.k) proto, propertySignature);
            if (eVar != null) {
                int iC = v0.i.c(i10);
                if (iC == 1) {
                    return com.google.android.gms.internal.auth.i.w((tl.g0) proto, nameResolver, iVar, true, true, z10);
                }
                if (iC == 2) {
                    if ((eVar.f53422b & 4) != 4) {
                        return null;
                    }
                    wl.c cVar = eVar.f53425e;
                    kotlin.jvm.internal.n.e(cVar, "signature.getter");
                    return new rl.o(nameResolver.getString(cVar.f53409c).concat(nameResolver.getString(cVar.f53410d)));
                }
                if (iC != 3 || (eVar.f53422b & 8) != 8) {
                    return null;
                }
                wl.c cVar2 = eVar.f53426f;
                kotlin.jvm.internal.n.e(cVar2, "signature.setter");
                return new rl.o(nameResolver.getString(cVar2.f53409c).concat(nameResolver.getString(cVar2.f53410d)));
            }
        }
        return null;
    }

    public static LayerDrawable k(p.h2 h2Var, Context context, int i10) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
        Drawable drawableC = h2Var.c(context, R.drawable.abc_star_black_48dp);
        Drawable drawableC2 = h2Var.c(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableC;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableC2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static boolean o(f2.c0 c0Var, Object obj, boolean z10, int i10, int i11, int i12) {
        Object obj2 = c0Var.f40307a;
        int i13 = c0Var.f40308b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z10 && i13 == i10 && c0Var.f40309c == i11) {
            return true;
        }
        return !z10 && i13 == -1 && c0Var.f40311e == i12;
    }

    public static void z(Drawable drawable, int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterE;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = p.t.f47811b;
        }
        PorterDuff.Mode mode2 = p.t.f47811b;
        synchronized (p.t.class) {
            porterDuffColorFilterE = p.h2.e(i10, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterE);
    }

    public void A(int i10) {
        if (i10 < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
        }
        this.f23263d = Integer.valueOf(i10);
    }

    @Override // lm.c
    public List B(lm.u container, tl.t tVar) {
        kotlin.jvm.internal.n.f(container, "container");
        String string = container.f45591a.getString(tVar.f51467d);
        String desc = xl.b.b(((lm.s) container).f45587f.c());
        kotlin.jvm.internal.n.f(desc, "desc");
        return g(this, container, new rl.o(string + '#' + desc), null, false, 60);
    }

    public Task C(String str, boolean z10, Bundle bundle) {
        int i10;
        try {
            v(str, z10, bundle);
            h9.c cVar = (h9.c) this.f23262c;
            a7.g gVar = a7.g.f3425b;
            a7.b bVar = cVar.f42260c;
            if (bVar.f() < 12000000) {
                if (bVar.e() == 0) {
                    return Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
                }
                return cVar.b(bundle).continueWithTask(gVar, new ea.f2(cVar, false, bundle, 17));
            }
            h9.k kVarE = h9.k.e(cVar.f42259b);
            synchronized (kVarE) {
                i10 = kVarE.f42286a;
                kVarE.f42286a = i10 + 1;
            }
            return kVarE.g(new h9.j(i10, 1, bundle, 1)).continueWith(gVar, ea.a0.f39201n);
        } catch (InterruptedException | ExecutionException e10) {
            return Tasks.forException(e10);
        }
    }

    public void D(i1.p0 p0Var) {
        b2.p pVarD = oa.o0.d();
        if (((oa.j0) this.f23261b).isEmpty()) {
            b(pVarD, (f2.c0) this.f23264e, p0Var);
            if (!Objects.equals((f2.c0) this.f23265f, (f2.c0) this.f23264e)) {
                b(pVarD, (f2.c0) this.f23265f, p0Var);
            }
            if (!Objects.equals((f2.c0) this.f23263d, (f2.c0) this.f23264e) && !Objects.equals((f2.c0) this.f23263d, (f2.c0) this.f23265f)) {
                b(pVarD, (f2.c0) this.f23263d, p0Var);
            }
        } else {
            for (int i10 = 0; i10 < ((oa.j0) this.f23261b).size(); i10++) {
                b(pVarD, (f2.c0) ((oa.j0) this.f23261b).get(i10), p0Var);
            }
            if (!((oa.j0) this.f23261b).contains((f2.c0) this.f23263d)) {
                b(pVarD, (f2.c0) this.f23263d, p0Var);
            }
        }
        this.f23262c = pVarD.c(true);
    }

    @Override // com.google.android.gms.internal.consent_sdk.l7
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public w zzb() {
        Application application = (Application) ((l7) this.f23260a).zzb();
        u uVar = (u) ((j7) this.f23264e).zzb();
        Handler handler = h0.f23034a;
        j0.c(handler);
        g0 g0Var = h0.f23035b;
        j0.c(g0Var);
        return new w(application, uVar, handler, g0Var, (t0) ((l7) this.f23261b).zzb(), ((g) ((l7) this.f23262c)).zzb(), (m) ((g6) this.f23265f).zzb(), (h) ((l7) this.f23263d).zzb());
    }

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
    public ta.r F() {
        AtomicLong atomicLong;
        long j10;
        final int i10;
        ListenableFuture listenableFutureA;
        ta.c0 c0Var = ta.c0.f50592a;
        ta.v0 v0Var = (ta.v0) this.f23265f;
        if (v0Var.isDone()) {
            return v0Var;
        }
        do {
            atomicLong = (AtomicLong) this.f23261b;
            j10 = atomicLong.get();
            i10 = (int) (j10 >>> 32);
        } while (!atomicLong.compareAndSet(j10, (((long) (((int) j10) + 1)) & 4294967295L) | (((long) i10) << 32)));
        AtomicReference atomicReference = (AtomicReference) this.f23263d;
        ta.v0 v0Var2 = new ta.v0();
        ListenableFuture listenableFuture = (ListenableFuture) atomicReference.getAndSet(v0Var2);
        if (listenableFuture == null) {
            com.google.android.gms.internal.measurement.h6 h6VarA = tg.a(new b2.w(i10, 9, this));
            ta.x0 x0Var = new ta.x0();
            x0Var.f50672i = new ta.w0(x0Var, h6VarA);
            c0Var.execute(x0Var);
            listenableFutureA = x0Var;
        } else {
            ta.z zVar = new ta.z() { // from class: com.google.android.gms.internal.measurement.vf
                @Override // ta.z
                public final /* synthetic */ ListenableFuture apply(Object obj) {
                    return this.f24098a.J(i10);
                }
            };
            int i11 = tg.f23998a;
            listenableFutureA = ta.k0.a(listenableFuture, Throwable.class, new ce(4, dg.a(), zVar), (ta.u0) this.f23264e);
        }
        v0Var2.o(listenableFutureA);
        wf wfVar = new wf(this, i10);
        v0Var2.addListener(new com.google.android.gms.common.api.internal.m0(this, v0Var2, wfVar, false, 3), c0Var);
        return wfVar;
    }

    @Override // lm.a
    public Object F0(lm.u uVar, tl.g0 proto, pm.y yVar) {
        kotlin.jvm.internal.n.f(proto, "proto");
        return r(uVar, proto, 3, yVar, rl.b.f49617f);
    }

    public void G(String str) {
        com.google.android.gms.internal.measurement.h.e(xe.f24149a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        com.google.android.gms.internal.measurement.h.e(!xe.f24151c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.f23262c = str;
    }

    public void H(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = xe.f24149a;
        this.f23264e = str;
    }

    public Uri I() {
        String strJ;
        String str = (String) this.f23261b;
        String str2 = (String) this.f23262c;
        Account account = ue.f24047a;
        Account account2 = (Account) this.f23263d;
        com.google.android.gms.internal.measurement.h.e(account2.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        com.google.android.gms.internal.measurement.h.e(account2.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        com.google.android.gms.internal.measurement.h.e(account2.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (ue.f24047a.equals(account2)) {
            strJ = "shared";
        } else {
            String str3 = account2.type;
            String str4 = account2.name;
            strJ = q4.a.j(new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length()), str3, ":", str4);
        }
        String str5 = (String) this.f23264e;
        StringBuilder sb2 = new StringBuilder(ca.i(ca.i(str.length() + 2, 1, str2), 1, strJ) + String.valueOf(str5).length());
        d5.u.r(sb2, "/", str, "/", str2);
        String strH = d5.u.h(sb2, "/", strJ, "/", str5);
        oa.n1 n1VarG = ((oa.e0) this.f23265f).g();
        Pattern pattern = ff.f23467a;
        return new Uri.Builder().scheme("android").authority((String) this.f23260a).path(strH).encodedFragment(n1VarG.isEmpty() ? null : "transform=".concat(String.valueOf(new na.g("+").C(n1VarG)))).build();
    }

    public ta.r J(int i10) {
        ta.c0 c0Var;
        AtomicLong atomicLong = (AtomicLong) this.f23261b;
        if (((int) (atomicLong.get() >>> 32)) > i10) {
            ta.l0 l0Var = ta.l0.f50626h;
            return l0Var != null ? l0Var : new ta.l0();
        }
        xf xfVar = new xf(i10);
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.f23262c;
            xf xfVar2 = (xf) atomicReference.get();
            if (xfVar2 != null && xfVar2.f24153h > i10) {
                ta.l0 l0Var2 = ta.l0.f50626h;
                return l0Var2 != null ? l0Var2 : new ta.l0();
            }
            do {
                if (atomicReference.compareAndSet(xfVar2, xfVar)) {
                    if (((int) (atomicLong.get() >>> 32)) > i10) {
                        xfVar.cancel(true);
                        while (!atomicReference.compareAndSet(xfVar, null) && atomicReference.get() == xfVar) {
                        }
                        return xfVar;
                    }
                    wd wdVar = (wd) this.f23260a;
                    ta.y yVar = (ta.y) wdVar.f24119b;
                    if (yVar == null || (c0Var = (ta.c0) wdVar.f24120c) == null) {
                        xfVar.o((ta.v0) this.f23265f);
                        return xfVar;
                    }
                    com.google.android.gms.internal.measurement.h6 h6VarA = tg.a(yVar);
                    ta.x0 x0Var = new ta.x0();
                    x0Var.f50672i = new ta.w0(x0Var, h6VarA);
                    c0Var.execute(x0Var);
                    xfVar.o(x0Var);
                    return xfVar;
                }
            } while (atomicReference.get() == xfVar2);
        }
    }

    @Override // lm.c
    public ArrayList O(tl.v0 proto, vl.f nameResolver) {
        kotlin.jvm.internal.n.f(proto, "proto");
        kotlin.jvm.internal.n.f(nameResolver, "nameResolver");
        Object objN = proto.n(wl.k.f53473h);
        kotlin.jvm.internal.n.e(objN, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<tl.g> iterable = (Iterable) objN;
        ArrayList arrayList = new ArrayList(xj.p.W(iterable, 10));
        for (tl.g it : iterable) {
            kotlin.jvm.internal.n.e(it, "it");
            arrayList.add(((ea.f2) this.f23264e).d(it, nameResolver));
        }
        return arrayList;
    }

    @Override // lm.c
    public List P(lm.u uVar, zl.a proto, int i10) {
        kotlin.jvm.internal.n.f(proto, "proto");
        d5.u.n(i10, "kind");
        rl.o oVarJ = j(proto, uVar.f45591a, uVar.f45592b, i10, false);
        if (oVarJ == null) {
            return xj.v.f53866a;
        }
        return g(this, uVar, new rl.o(defpackage.e.q(oVarJ.f49644a, "@0", new StringBuilder())), null, false, 60);
    }

    @Override // lm.c
    public ArrayList Q(tl.q0 proto, vl.f nameResolver) {
        kotlin.jvm.internal.n.f(proto, "proto");
        kotlin.jvm.internal.n.f(nameResolver, "nameResolver");
        Object objN = proto.n(wl.k.f53471f);
        kotlin.jvm.internal.n.e(objN, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<tl.g> iterable = (Iterable) objN;
        ArrayList arrayList = new ArrayList(xj.p.W(iterable, 10));
        for (tl.g it : iterable) {
            kotlin.jvm.internal.n.e(it, "it");
            arrayList.add(((ea.f2) this.f23264e).d(it, nameResolver));
        }
        return arrayList;
    }

    public void b(b2.p pVar, f2.c0 c0Var, i1.p0 p0Var) {
        if (c0Var == null) {
            return;
        }
        if (p0Var.b(c0Var.f40307a) != -1) {
            pVar.l(c0Var, p0Var);
            return;
        }
        i1.p0 p0Var2 = (i1.p0) ((oa.s1) this.f23262c).get(c0Var);
        if (p0Var2 != null) {
            pVar.l(c0Var, p0Var2);
        }
    }

    public wa.i d() {
        if (((Integer) this.f23260a) == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (((Integer) this.f23261b) == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (((Integer) this.f23262c) == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = (Integer) this.f23263d;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((wa.h) this.f23264e) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (((wa.h) this.f23265f) == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        int iIntValue = num.intValue();
        wa.h hVar = (wa.h) this.f23264e;
        if (hVar == wa.h.f53045c) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (hVar == wa.h.f53046d) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (hVar == wa.h.f53047e) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (hVar == wa.h.f53048f) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (hVar != wa.h.f53049g) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new wa.i(((Integer) this.f23260a).intValue(), ((Integer) this.f23261b).intValue(), ((Integer) this.f23262c).intValue(), ((Integer) this.f23263d).intValue(), (wa.h) this.f23265f, (wa.h) this.f23264e);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0023  */
    public List f(lm.u uVar, rl.o oVar, boolean z10, boolean z11, Boolean bool, boolean z12) {
        List list;
        el.b bVarL = l(uVar, z10, z11, bool, z12);
        if (bVarL == null) {
            if (uVar instanceof lm.s) {
                zk.j0 j0Var = ((lm.s) uVar).f45593c;
                rl.n nVar = j0Var instanceof rl.n ? (rl.n) j0Var : null;
                if (nVar != null) {
                    bVarL = nVar.f49643a;
                } else {
                    bVarL = null;
                }
            } else {
                bVarL = null;
            }
        }
        return (bVarL == null || (list = (List) ((rl.a) ((om.e) this.f23261b).invoke(bVarL)).f49614a.get(oVar)) == null) ? xj.v.f53866a : list;
    }

    @Override // lm.c
    public List i(lm.u uVar, zl.a proto, int i10) {
        kotlin.jvm.internal.n.f(proto, "proto");
        d5.u.n(i10, "kind");
        if (i10 == 2) {
            return s(uVar, (tl.g0) proto, 1);
        }
        rl.o oVarJ = j(proto, uVar.f45591a, uVar.f45592b, i10, false);
        return oVarJ == null ? xj.v.f53866a : g(this, uVar, oVarJ, null, false, 60);
    }

    public el.b l(lm.u container, boolean z10, boolean z11, Boolean bool, boolean z12) {
        lm.s sVar;
        tl.i iVar;
        el.c cVar = (el.c) this.f23260a;
        kotlin.jvm.internal.n.f(container, "container");
        zk.j0 j0Var = container.f45593c;
        tl.i iVar2 = tl.i.INTERFACE;
        if (z10) {
            if (bool == null) {
                throw new IllegalStateException(("isConst should not be null for property (container=" + container + ')').toString());
            }
            if (container instanceof lm.s) {
                lm.s sVar2 = (lm.s) container;
                if (sVar2.f45588g == iVar2) {
                    return com.google.android.gms.internal.play_billing.q1.n(cVar, sVar2.f45587f.d(yl.f.e("DefaultImpls")), (xl.f) this.f23265f);
                }
            }
            if (bool.booleanValue() && (container instanceof lm.t)) {
                rl.f fVar = j0Var instanceof rl.f ? (rl.f) j0Var : null;
                gm.b bVar = fVar != null ? fVar.f49630b : null;
                if (bVar != null) {
                    String strE = bVar.e();
                    kotlin.jvm.internal.n.e(strE, "facadeClassName.internalName");
                    return com.google.android.gms.internal.play_billing.q1.n(cVar, yl.b.j(new yl.c(an.p.m0(strE, '/', '.'))), (xl.f) this.f23265f);
                }
            }
        }
        if (z11 && (container instanceof lm.s)) {
            lm.s sVar3 = (lm.s) container;
            if (sVar3.f45588g == tl.i.COMPANION_OBJECT && (sVar = sVar3.f45586e) != null && ((iVar = sVar.f45588g) == tl.i.CLASS || iVar == tl.i.ENUM_CLASS || (z12 && (iVar == iVar2 || iVar == tl.i.ANNOTATION_CLASS)))) {
                zk.j0 j0Var2 = sVar.f45593c;
                rl.n nVar = j0Var2 instanceof rl.n ? (rl.n) j0Var2 : null;
                if (nVar != null) {
                    return nVar.f49643a;
                }
                return null;
            }
        }
        if (!(container instanceof lm.t) || !(j0Var instanceof rl.f)) {
            return null;
        }
        rl.f fVar2 = (rl.f) j0Var;
        el.b bVar2 = fVar2.f49631c;
        return bVar2 == null ? com.google.android.gms.internal.play_billing.q1.n(cVar, fVar2.a(), (xl.f) this.f23265f) : bVar2;
    }

    public ColorStateList m(Context context, int i10) {
        if (i10 == R.drawable.abc_edit_text_material) {
            return com.google.android.gms.internal.auth.o.h(context, R.color.abc_tint_edittext);
        }
        if (i10 == 2131230796) {
            return com.google.android.gms.internal.auth.o.h(context, R.color.abc_tint_switch_track);
        }
        if (i10 != R.drawable.abc_switch_thumb_material) {
            if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
                return e(context, p.n2.c(context, R.attr.colorButtonNormal));
            }
            if (i10 == R.drawable.abc_btn_borderless_material) {
                return e(context, 0);
            }
            if (i10 == R.drawable.abc_btn_colored_material) {
                return e(context, p.n2.c(context, R.attr.colorAccent));
            }
            if (i10 == 2131230791 || i10 == R.drawable.abc_spinner_textfield_background_material) {
                return com.google.android.gms.internal.auth.o.h(context, R.color.abc_tint_spinner);
            }
            if (c(i10, (int[]) this.f23261b)) {
                return p.n2.d(context, R.attr.colorControlNormal);
            }
            if (c(i10, (int[]) this.f23264e)) {
                return com.google.android.gms.internal.auth.o.h(context, R.color.abc_tint_default);
            }
            if (c(i10, (int[]) this.f23265f)) {
                return com.google.android.gms.internal.auth.o.h(context, R.color.abc_tint_btn_checkable);
            }
            if (i10 == R.drawable.abc_seekbar_thumb_material) {
                return com.google.android.gms.internal.auth.o.h(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = p.n2.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = p.n2.f47741b;
            iArr2[0] = p.n2.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = p.n2.f47744e;
            iArr2[1] = p.n2.c(context, R.attr.colorControlActivated);
            iArr[2] = p.n2.f47745f;
            iArr2[2] = p.n2.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = p.n2.f47741b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = p.n2.f47744e;
            iArr2[1] = p.n2.c(context, R.attr.colorControlActivated);
            iArr[2] = p.n2.f47745f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public boolean n(yl.b bVar) {
        el.b bVarN;
        if (bVar.f() != null && kotlin.jvm.internal.n.a(bVar.i().b(), "Container") && (bVarN = com.google.android.gms.internal.play_billing.q1.n((el.c) this.f23260a, bVar, (xl.f) this.f23265f)) != null) {
            LinkedHashSet linkedHashSet = vk.a.f52620a;
            Class klass = bVarN.f40112a;
            kotlin.jvm.internal.n.f(klass, "klass");
            Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
            kotlin.jvm.internal.n.e(declaredAnnotations, "klass.declaredAnnotations");
            boolean z10 = false;
            for (Annotation annotation : declaredAnnotations) {
                kotlin.jvm.internal.n.e(annotation, "annotation");
                if (fl.c.a(d0.c.p(d0.c.l(annotation))).equals(il.x.f43119b)) {
                    z10 = true;
                }
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    @Override // lm.c
    public List n0(lm.u uVar, zl.a callableProto, int i10, int i11, tl.y0 y0Var) {
        kotlin.jvm.internal.n.f(callableProto, "callableProto");
        d5.u.n(i10, "kind");
        int i12 = 0;
        rl.o oVarJ = j(callableProto, uVar.f45591a, uVar.f45592b, i10, false);
        if (oVarJ == null) {
            return xj.v.f53866a;
        }
        if (callableProto instanceof tl.y) {
            int i13 = ((tl.y) callableProto).f51551c;
            if ((i13 & 32) == 32 || (i13 & 64) == 64) {
                i12 = 1;
            }
        } else if (callableProto instanceof tl.g0) {
            int i14 = ((tl.g0) callableProto).f51239c;
            if ((i14 & 32) == 32 || (i14 & 64) == 64) {
                i12 = 1;
            }
        } else {
            if (!(callableProto instanceof tl.l)) {
                throw new UnsupportedOperationException("Unsupported message: " + callableProto.getClass());
            }
            lm.s sVar = (lm.s) uVar;
            if (sVar.f45588g == tl.i.ENUM_CLASS) {
                i12 = 2;
            } else if (sVar.f45589h) {
                i12 = 1;
            }
        }
        return g(this, uVar, new rl.o(oVarJ.f49644a + '@' + (i11 + i12)), null, false, 60);
    }

    public fc.f p(yl.b bVar, zk.j0 j0Var, List result) {
        kotlin.jvm.internal.n.f(result, "result");
        return new fc.f(this, zk.u.f((cl.f0) this.f23262c, bVar, (zc.u) this.f23263d), bVar, result, j0Var);
    }

    public fc.f q(yl.b bVar, el.a aVar, List result) {
        kotlin.jvm.internal.n.f(result, "result");
        if (vk.a.f52620a.contains(bVar)) {
            return null;
        }
        return p(bVar, aVar, result);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    public Object r(lm.u uVar, tl.g0 g0Var, int i10, pm.y yVar, jk.c cVar) {
        Object objInvoke;
        el.b bVarL = l(uVar, true, true, vl.e.A.c(g0Var.f51240d), xl.h.d(g0Var));
        if (bVarL == null) {
            if (uVar instanceof lm.s) {
                zk.j0 j0Var = ((lm.s) uVar).f45593c;
                rl.n nVar = j0Var instanceof rl.n ? (rl.n) j0Var : null;
                if (nVar != null) {
                    bVarL = nVar.f49643a;
                } else {
                    bVarL = null;
                }
            } else {
                bVarL = null;
            }
        }
        if (bVarL != null) {
            xl.f fVar = (xl.f) bVarL.f40113b.f40198d;
            xl.f version = rl.d.f49624e;
            kotlin.jvm.internal.n.f(version, "version");
            rl.o oVarJ = j(g0Var, uVar.f45591a, uVar.f45592b, i10, fVar.a(version.f52623b, version.f52624c, version.f52625d));
            if (oVarJ != null && (objInvoke = cVar.invoke(((om.e) this.f23261b).invoke(bVarL), oVarJ)) != null) {
                if (wk.q.a(yVar)) {
                    objInvoke = (dm.g) objInvoke;
                    if (objInvoke instanceof dm.d) {
                        return new dm.y(((Number) ((dm.d) objInvoke).f38953a).byteValue());
                    }
                    if (objInvoke instanceof dm.v) {
                        return new dm.y(((Number) ((dm.v) objInvoke).f38953a).shortValue());
                    }
                    if (objInvoke instanceof dm.k) {
                        return new dm.y(((Number) ((dm.k) objInvoke).f38953a).intValue());
                    }
                    if (objInvoke instanceof dm.t) {
                        return new dm.y(((Number) ((dm.t) objInvoke).f38953a).longValue());
                    }
                }
                return objInvoke;
            }
        }
        return null;
    }

    public List s(lm.u uVar, tl.g0 g0Var, int i10) {
        l3.i iVar = uVar.f45592b;
        vl.f fVar = uVar.f45591a;
        Boolean boolC = vl.e.A.c(g0Var.f51240d);
        boolean zD = xl.h.d(g0Var);
        if (i10 == 1) {
            rl.o oVarW = com.google.android.gms.internal.auth.i.w(g0Var, fVar, iVar, (40 & 8) == 0, (40 & 16) == 0, true);
            if (oVarW != null) {
                return g(this, uVar, oVarW, boolC, zD, 8);
            }
        } else {
            rl.o oVarW2 = com.google.android.gms.internal.auth.i.w(g0Var, fVar, iVar, (40 & 8) == 0, (40 & 16) == 0, true);
            if (oVarW2 != null) {
                if (an.h.q0(oVarW2.f49644a, "$delegate", false) == (i10 == 3)) {
                    return f(uVar, oVarW2, true, true, boolC, zD);
                }
            }
        }
        return xj.v.f53866a;
    }

    @Override // lm.c
    public List t(lm.u uVar, tl.g0 proto) {
        kotlin.jvm.internal.n.f(proto, "proto");
        return s(uVar, proto, 3);
    }

    public void u(int i10) {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.f23260a = Integer.valueOf(i10);
    }

    @Override // lm.c
    public ArrayList u0(lm.s container) {
        kotlin.jvm.internal.n.f(container, "container");
        zk.j0 j0Var = container.f45593c;
        rl.n nVar = j0Var instanceof rl.n ? (rl.n) j0Var : null;
        el.b bVar = nVar != null ? nVar.f49643a : null;
        if (bVar == null) {
            throw new IllegalStateException(("Class for loading annotations is not found: " + container.f45587f.b()).toString());
        }
        ArrayList arrayList = new ArrayList(1);
        Class klass = bVar.f40112a;
        kotlin.jvm.internal.n.f(klass, "klass");
        Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
        kotlin.jvm.internal.n.e(declaredAnnotations, "klass.declaredAnnotations");
        for (Annotation annotation : declaredAnnotations) {
            kotlin.jvm.internal.n.e(annotation, "annotation");
            Class clsP = d0.c.p(d0.c.l(annotation));
            fc.f fVarQ = q(fl.c.a(clsP), new el.a(annotation), arrayList);
            if (fVarQ != null) {
                j1.f.G(fVarQ, annotation, clsP);
            }
        }
        return arrayList;
    }

    public void v(String str, boolean z10, Bundle bundle) {
        String str2;
        String strEncodeToString;
        boolean zE;
        int i10;
        bundle.putString("scope", "*");
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        mb.g gVar = (mb.g) this.f23260a;
        gVar.a();
        bundle.putString("gmp_app_id", gVar.f45930c.f45944b);
        bundle.putString("gmsv", Integer.toString(((aj0) this.f23261b).d()));
        bundle.putString(O6.G, Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((aj0) this.f23261b).a());
        aj0 aj0Var = (aj0) this.f23261b;
        synchronized (aj0Var) {
            try {
                if (((String) aj0Var.f12045d) == null) {
                    aj0Var.g();
                }
                str2 = (String) aj0Var.f12045d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle.putString("app_ver_name", str2);
        mb.g gVar2 = (mb.g) this.f23260a;
        gVar2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(gVar2.f45929b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        if (z10) {
            mb.g gVar3 = (mb.g) this.f23260a;
            gVar3.a();
            bundle.putString("Goog-Api-Key", gVar3.f45930c.f45943a);
        }
        try {
            String str3 = ((uc.a) Tasks.await(((uc.c) ((uc.d) this.f23265f)).d())).f51979a;
            if (TextUtils.isEmpty(str3)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str3);
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e10);
        }
        bundle.putString("appid", (String) Tasks.await(((uc.c) ((uc.d) this.f23265f)).c()));
        bundle.putString("cliv", "fcm-25.1.2");
        rc.f fVar = (rc.f) ((tc.b) this.f23264e).get();
        od.b bVar = (od.b) ((tc.b) this.f23263d).get();
        if (fVar == null || bVar == null) {
            return;
        }
        rc.c cVar = (rc.c) fVar;
        synchronized (cVar) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            rc.i iVar = (rc.i) cVar.f49534a.get();
            synchronized (iVar) {
                zE = iVar.e(rc.i.f49563b, jCurrentTimeMillis);
            }
            if (zE) {
                synchronized (iVar) {
                    iVar.f49566a.a(new com.ironsource.sdk.controller.y(iVar, rc.i.b(System.currentTimeMillis())));
                }
                i10 = 3;
            } else {
                i10 = 1;
            }
        }
        if (i10 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(v0.i.c(i10)));
            bundle.putString("Firebase-Client", bVar.a());
        }
    }

    public void w(int i10) {
        if (i10 < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i10)));
        }
        this.f23261b = Integer.valueOf(i10);
    }

    @Override // lm.c
    public List w0(lm.u uVar, tl.g0 proto) {
        kotlin.jvm.internal.n.f(proto, "proto");
        return s(uVar, proto, 2);
    }

    @Override // lm.a
    public Object x(lm.u uVar, tl.g0 proto, pm.y yVar) {
        kotlin.jvm.internal.n.f(proto, "proto");
        return r(uVar, proto, 2, yVar, rl.b.f49618g);
    }

    public void y(int i10) {
        if (i10 < 12 || i10 > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i10)));
        }
        this.f23262c = Integer.valueOf(i10);
    }

    public /* synthetic */ x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.f23260a = obj;
        this.f23261b = obj2;
        this.f23262c = obj3;
        this.f23263d = obj4;
        this.f23264e = obj5;
        this.f23265f = obj6;
    }

    public /* synthetic */ x(Context context) {
        this.f23261b = "files";
        this.f23262c = "common";
        this.f23263d = xe.f24150b;
        this.f23264e = "";
        this.f23265f = oa.j0.u();
        com.google.android.gms.internal.measurement.h.e(context != null, "Context cannot be null", new Object[0]);
        this.f23260a = context.getPackageName();
    }

    public x(ta.y yVar) {
        long j10 = Integer.MIN_VALUE;
        this.f23261b = new AtomicLong((j10 & 4294967295L) | (j10 << 32));
        this.f23262c = new AtomicReference(null);
        this.f23263d = new AtomicReference(null);
        ta.c0 c0Var = ta.c0.f50592a;
        this.f23264e = new ta.u0(c0Var);
        ta.v0 v0Var = new ta.v0();
        this.f23265f = v0Var;
        wd wdVar = new wd();
        wdVar.f24119b = yVar;
        wdVar.f24120c = c0Var;
        this.f23260a = wdVar;
        v0Var.addListener(wdVar, c0Var);
    }

    public x(String str, String str2, Set set) {
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f23260a = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f23262c = str;
        this.f23263d = str2;
        this.f23264e = ha.a.f42291a;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f23261b = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw com.google.android.gms.internal.measurement.f2.j(it);
    }
}

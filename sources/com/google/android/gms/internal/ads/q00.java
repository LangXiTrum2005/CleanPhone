package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.IBinder;
import android.view.MenuItem;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.AEADBadTagException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q00 implements k6.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f18847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f18848b;

    public q00(lj1 lj1Var, zzg zzgVar) {
        this.f18848b = lj1Var;
        this.f18847a = zzgVar;
    }

    public static byte[] k(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining % 16;
        int i11 = (i10 == 0 ? iRemaining : (iRemaining + 16) - i10) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i11 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i11);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    @Override // k6.s
    public k6.r M(k6.x xVar) {
        Context context = (Context) this.f18847a;
        Class cls = (Class) this.f18848b;
        return new l6.d(context, xVar.b(File.class, cls), xVar.b(Uri.class, cls), cls);
    }

    public void c() {
        q7.c cVar = (q7.c) this.f18847a;
        if (cVar != null) {
            try {
                ((k.v) this.f18848b).f44172k.unregisterReceiver(cVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f18847a = null;
        }
    }

    public abstract IntentFilter d();

    public byte[] e(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((jh1) this.f18848b).a(0, bArr).get(bArr4);
            if (!MessageDigest.isEqual(d0.c.c(bArr4, k(bArr2, byteBuffer)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            jh1 jh1Var = (jh1) this.f18847a;
            jh1Var.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            jh1Var.d(bArr, byteBufferAllocate, byteBuffer);
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e10) {
            throw new AEADBadTagException(e10.toString());
        }
    }

    public void f(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBuffer.position();
        jh1 jh1Var = (jh1) this.f18847a;
        jh1Var.getClass();
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        jh1Var.d(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        ByteBuffer byteBufferA = ((jh1) this.f18848b).a(0, bArr);
        byte[] bArr4 = new byte[32];
        byteBufferA.get(bArr4);
        byte[] bArrC = d0.c.c(bArr4, k(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArrC);
    }

    public abstract int g();

    public MenuItem h(MenuItem menuItem) {
        if (!(menuItem instanceof h0.a)) {
            return menuItem;
        }
        h0.a aVar = (h0.a) menuItem;
        if (((x.i) this.f18848b) == null) {
            this.f18848b = new x.i(0);
        }
        MenuItem menuItem2 = (MenuItem) ((x.i) this.f18848b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        o.t tVar = new o.t((Context) this.f18847a, aVar);
        ((x.i) this.f18848b).put(aVar, tVar);
        return tVar;
    }

    public abstract Object i(IBinder iBinder);

    public Object j(Context context) throws s9.c {
        Context contextCreatePackageContext;
        if (this.f18848b == null) {
            k9.c0.h(context);
            int i10 = i9.h.f42935e;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext == null) {
                throw new s9.c("Could not get remote context.");
            }
            try {
                this.f18848b = i((IBinder) contextCreatePackageContext.getClassLoader().loadClass((String) this.f18847a).newInstance());
            } catch (ClassNotFoundException e10) {
                throw new s9.c("Could not load creator class.", e10);
            } catch (IllegalAccessException e11) {
                throw new s9.c("Could not access creator.", e11);
            } catch (InstantiationException e12) {
                throw new s9.c("Could not instantiate creator.", e12);
            }
        }
        return this.f18848b;
    }

    public abstract jh1 l(int i10, byte[] bArr);

    public abstract void m();

    public void n() {
        c();
        IntentFilter intentFilterD = d();
        if (intentFilterD.countActions() == 0) {
            return;
        }
        if (((q7.c) this.f18847a) == null) {
            this.f18847a = new q7.c(this, 9);
        }
        ((k.v) this.f18848b).f44172k.registerReceiver((q7.c) this.f18847a, intentFilterD);
    }

    public abstract jh1 o(int i10, byte[] bArr);

    public byte[] p(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((jh1) this.f18848b).g(0, bArr).get(bArr4);
            int length = bArr2.length;
            int i10 = length & 15;
            int i11 = i10 == 0 ? length : (length + 16) - i10;
            int iRemaining = byteBuffer.remaining();
            int i12 = iRemaining % 16;
            int i13 = (i12 == 0 ? iRemaining : (iRemaining + 16) - i12) + i11;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i13 + 16).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put(bArr2);
            byteBufferOrder.position(i11);
            byteBufferOrder.put(byteBuffer);
            byteBufferOrder.position(i13);
            byteBufferOrder.putLong(length);
            byteBufferOrder.putLong(iRemaining);
            if (!MessageDigest.isEqual(gc1.d(bArr4, byteBufferOrder.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            jh1 jh1Var = (jh1) this.f18847a;
            jh1Var.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            if (bArr.length != jh1Var.f()) {
                int iF = jh1Var.f();
                throw new GeneralSecurityException(l1.d.k(new StringBuilder(String.valueOf(iF).length() + 36), "The nonce length (in bytes) must be ", iF));
            }
            int iRemaining2 = byteBuffer.remaining();
            int i14 = iRemaining2 / 64;
            for (int i15 = 0; i15 < i14 + 1; i15++) {
                ByteBuffer byteBufferG = jh1Var.g(jh1Var.f16099b + i15, bArr);
                if (i15 == i14) {
                    jc1.i(byteBufferAllocate, byteBuffer, byteBufferG, iRemaining2 % 64);
                } else {
                    jc1.i(byteBufferAllocate, byteBuffer, byteBufferG, 64);
                }
            }
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e10) {
            throw new AEADBadTagException(e10.toString());
        }
    }

    public void q(p00 p00Var, o00 o00Var) {
        lj1 lj1Var = new lj1(this, p00Var, o00Var, 12);
        m00 m00Var = (m00) this.f18847a;
        m00Var.addListener(new zd1(0, m00Var, lj1Var), l00.f16615h);
    }

    public void r() {
        ((m00) this.f18847a).zzd(new Exception());
    }

    public void s(String str, Throwable th2) {
        ((m00) this.f18847a).zzd(th2);
        if (((Boolean) zzba.zzc().a(am.L8)).booleanValue()) {
            zzt.zzh().e(str, th2);
        }
    }

    public /* synthetic */ q00(Object obj) {
        this.f18847a = obj;
    }

    public q00() {
        m00 m00Var = new m00();
        this.f18847a = m00Var;
        this.f18848b = new AtomicInteger(0);
        vf vfVar = new vf(this, 12);
        m00Var.addListener(new zd1(0, m00Var, vfVar), l00.f16615h);
    }

    public q00(byte[] bArr, int i10) throws GeneralSecurityException {
        switch (i10) {
            case 7:
                if (defpackage.e.c(1)) {
                    this.f18847a = l(1, bArr);
                    this.f18848b = l(0, bArr);
                    return;
                }
                throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
            default:
                if (jc1.e(1)) {
                    this.f18847a = o(1, bArr);
                    this.f18848b = o(0, bArr);
                    return;
                }
                throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
    }

    public q00(Context context, Class cls) {
        this.f18847a = context;
        this.f18848b = cls;
    }

    public q00(k.v vVar) {
        this.f18848b = vVar;
    }
}

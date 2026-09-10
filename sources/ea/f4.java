package ea;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.internal.measurement.nf;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f4 implements k6.s, k6.f, a7.i, x0.f, y1.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f39414b;

    @Override // k6.s
    public k6.r M(k6.x xVar) {
        switch (this.f39413a) {
            case 1:
                return new k6.b(this.f39414b, this);
            default:
                return new k6.b(this.f39414b, xVar.b(Integer.class, AssetFileDescriptor.class));
        }
    }

    @Override // k6.f
    public Class a() {
        return Drawable.class;
    }

    @Override // k6.f
    public Object b(Resources.Theme theme, Resources resources, int i10) {
        Context context = this.f39414b;
        return x7.a.v(context, context, i10, theme);
    }

    @Override // x0.f
    public void c(com.bumptech.glide.c cVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ch.b("EmojiCompatInitializer", 3));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new ld.f(this, cVar, threadPoolExecutor, 10));
    }

    @Override // y1.i
    public y1.j d(com.google.android.gms.internal.consent_sdk.x xVar) {
        Context context;
        if (Build.VERSION.SDK_INT < 31 && ((context = this.f39414b) == null || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new v1.j(11).d(xVar);
        }
        int iH = i1.d0.h(((i1.p) xVar.f23262c).f42643n);
        l1.a.j("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + l1.y.E(iH));
        t6.l lVar = new t6.l(new y1.b(iH, 0), new y1.b(iH, 1));
        lVar.f50549b = true;
        return lVar.d(xVar);
    }

    @Override // k6.f
    public /* bridge */ /* synthetic */ void e(Object obj) {
    }

    public r8.j f() {
        Context context = this.f39414b;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        r8.j jVar = new r8.j();
        jVar.f49492a = t8.a.a(r8.m.f49500a);
        qj.x xVar = new qj.x(context, 9);
        jVar.f49493b = xVar;
        jVar.f49494c = t8.a.a(new m5.k(16, xVar, new qj.x(xVar, 6)));
        qj.x xVar2 = jVar.f49493b;
        jVar.f49495d = new qj.x(xVar2, 25);
        vj.a aVarA = t8.a.a(new wi.b(false, jVar.f49495d, t8.a.a(new xh.e(xVar2))));
        jVar.f49496e = aVarA;
        un.a aVar = new un.a(3);
        qj.x xVar3 = jVar.f49493b;
        qd.i iVar = new qd.i(xVar3, aVarA, aVar, 8);
        vj.a aVar2 = jVar.f49492a;
        vj.a aVar3 = jVar.f49494c;
        jVar.f49497f = t8.a.a(new qd.i(new nf(aVar2, aVar3, iVar, aVarA, aVarA, 8), new fc.f(xVar3, aVar3, aVarA, iVar, aVar2, aVarA, aVarA, 13), new zc.u(aVar2, aVarA, iVar, aVarA, 22), 2));
        return jVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v2 int, still in use, count: 2, list:
          (r11v2 int) from 0x0031: IF  (r11v2 int) < (100 int)  -> B:72:0x0036 A[HIDDEN] (LINE:50)
          (r11v2 int) from 0x0036: PHI (r11 I:??) = (r11v2 int) binds: [B:10:0x0031] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:133)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public java.lang.String g(java.lang.String r24, java.lang.Double r25, java.lang.Double r26, int r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.f4.g(java.lang.String, java.lang.Double, java.lang.Double, int):java.lang.String");
    }

    @Override // a7.i
    public Object get() {
        return (ConnectivityManager) this.f39414b.getSystemService("connectivity");
    }

    public File h(Bitmap bitmap, Double d10, Double d11, int i10, String str) throws IOException {
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, d10.intValue(), d11.intValue(), false);
        String strN = defpackage.e.n("/scaled_", str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean zHasAlpha = bitmapCreateScaledBitmap.hasAlpha();
        if (zHasAlpha) {
            Log.d("ImageResizer", "image_picker: compressing is not supported for type PNG. Returning the image with original quality");
        }
        bitmapCreateScaledBitmap.compress(zHasAlpha ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, i10, byteArrayOutputStream);
        File file = new File(this.f39414b.getCacheDir(), strN);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.close();
        return file;
    }

    public /* synthetic */ f4(Context context, int i10, boolean z10) {
        this.f39413a = i10;
        this.f39414b = context;
    }

    public f4(Context context, int i10) {
        this.f39413a = i10;
        switch (i10) {
            case 6:
                this.f39414b = context.getApplicationContext();
                break;
            default:
                k9.c0.h(context);
                Context applicationContext = context.getApplicationContext();
                k9.c0.h(applicationContext);
                this.f39414b = applicationContext;
                break;
        }
    }

    public f4(Activity activity, j2.n nVar) {
        this.f39413a = 3;
        this.f39414b = activity;
    }
}

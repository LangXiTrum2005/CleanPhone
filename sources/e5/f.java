package e5;

import android.content.Context;
import android.text.TextUtils;
import ea.f2;
import k6.n;
import k6.r;
import k6.s;
import k6.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements k4.a, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f39094b;

    public /* synthetic */ f(Context context, int i10) {
        this.f39093a = i10;
        this.f39094b = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(i1.p r5) {
        /*
            java.lang.String r0 = r5.f42643n
            r1 = 0
            if (r0 == 0) goto L7f
            boolean r0 = i1.d0.k(r0)
            if (r0 != 0) goto Ld
            goto L7f
        Ld:
            java.lang.String r5 = r5.f42643n
            java.lang.String r0 = l1.y.f44830a
            r5.getClass()
            int r0 = r5.hashCode()
            r2 = 4
            r3 = 1
            r4 = -1
            switch(r0) {
                case -1487656890: goto L61;
                case -1487464693: goto L56;
                case -1487464690: goto L4b;
                case -1487394660: goto L40;
                case -1487018032: goto L35;
                case -879272239: goto L2a;
                case -879258763: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L6b
        L1f:
            java.lang.String r0 = "image/png"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L28
            goto L6b
        L28:
            r4 = 6
            goto L6b
        L2a:
            java.lang.String r0 = "image/bmp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L33
            goto L6b
        L33:
            r4 = 5
            goto L6b
        L35:
            java.lang.String r0 = "image/webp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L3e
            goto L6b
        L3e:
            r4 = r2
            goto L6b
        L40:
            java.lang.String r0 = "image/jpeg"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L49
            goto L6b
        L49:
            r4 = 3
            goto L6b
        L4b:
            java.lang.String r0 = "image/heif"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L54
            goto L6b
        L54:
            r4 = 2
            goto L6b
        L56:
            java.lang.String r0 = "image/heic"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L5f
            goto L6b
        L5f:
            r4 = r3
            goto L6b
        L61:
            java.lang.String r0 = "image/avif"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L6a
            goto L6b
        L6a:
            r4 = r1
        L6b:
            switch(r4) {
                case 0: goto L6f;
                case 1: goto L75;
                case 2: goto L75;
                case 3: goto L75;
                case 4: goto L75;
                case 5: goto L75;
                case 6: goto L75;
                default: goto L6e;
            }
        L6e:
            goto L7a
        L6f:
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r5 < r0) goto L7a
        L75:
            int r5 = p1.a.c(r2, r1, r1, r1)
            return r5
        L7a:
            int r5 = p1.a.c(r3, r1, r1, r1)
            return r5
        L7f:
            int r5 = p1.a.c(r1, r1, r1, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.f.a(i1.p):int");
    }

    @Override // k6.s
    public r M(x xVar) {
        switch (this.f39093a) {
            case 1:
                return new n(this.f39094b, 0);
            default:
                return new n(this.f39094b, 2);
        }
    }

    @Override // k4.a
    public k4.b n(bc.s sVar) {
        String str = (String) sVar.f5582c;
        f2 f2Var = (f2) sVar.f5583d;
        if (f2Var == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        Context context = this.f39094b;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        bc.s sVar2 = new bc.s(context, str, f2Var, true);
        return new l4.e((Context) sVar2.f5581b, (String) sVar2.f5582c, (f2) sVar2.f5583d, sVar2.f5580a);
    }

    public f(Context context) {
        this.f39093a = 3;
        context.getClass();
        this.f39094b = context;
    }
}

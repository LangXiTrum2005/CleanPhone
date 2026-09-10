package pc;

import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements mc.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f48311f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final mc.c f48312g = new mc.c(X3.i.W, q4.a.m(q4.a.l(e.class, new a(1))));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final mc.c f48313h = new mc.c(X3.i.X, q4.a.m(q4.a.l(e.class, new a(2))));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final oc.a f48314i = new oc.a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f48315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f48316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f48317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mc.d f48318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f48319e = new h(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, mc.d dVar) {
        this.f48315a = byteArrayOutputStream;
        this.f48316b = map;
        this.f48317c = map2;
        this.f48318d = dVar;
    }

    public static int j(mc.c cVar) {
        e eVar = (e) ((Annotation) cVar.f45952b.get(e.class));
        if (eVar != null) {
            return ((a) eVar).f48307b;
        }
        throw new mc.b("Field has no @Protobuf config");
    }

    @Override // mc.e
    public final mc.e a(mc.c cVar, Object obj) {
        h(cVar, obj, true);
        return this;
    }

    public final void b(mc.c cVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return;
        }
        k((j(cVar) << 3) | 1);
        this.f48315a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d10).array());
    }

    @Override // mc.e
    public final mc.e c(mc.c cVar, boolean z10) {
        d(cVar, z10 ? 1 : 0, true);
        return this;
    }

    public final void d(mc.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.f45952b.get(e.class));
        if (eVar == null) {
            throw new mc.b("Field has no @Protobuf config");
        }
        k(((a) eVar).f48307b << 3);
        k(i10);
    }

    @Override // mc.e
    public final mc.e e(mc.c cVar, int i10) {
        d(cVar, i10, true);
        return this;
    }

    @Override // mc.e
    public final mc.e f(mc.c cVar, long j10) throws IOException {
        if (j10 == 0) {
            return this;
        }
        e eVar = (e) ((Annotation) cVar.f45952b.get(e.class));
        if (eVar == null) {
            throw new mc.b("Field has no @Protobuf config");
        }
        k(((a) eVar).f48307b << 3);
        l(j10);
        return this;
    }

    @Override // mc.e
    public final mc.e g(mc.c cVar, double d10) throws IOException {
        b(cVar, d10, true);
        return this;
    }

    public final void h(mc.c cVar, Object obj, boolean z10) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f48311f);
            k(bytes.length);
            this.f48315a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                h(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                i(f48314i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            b(cVar, ((Double) obj).doubleValue(), z10);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z10 && fFloatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            k((j(cVar) << 3) | 5);
            this.f48315a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z10 && jLongValue == 0) {
                return;
            }
            e eVar = (e) ((Annotation) cVar.f45952b.get(e.class));
            if (eVar == null) {
                throw new mc.b("Field has no @Protobuf config");
            }
            k(((a) eVar).f48307b << 3);
            l(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            d(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            k(bArr.length);
            this.f48315a.write(bArr);
            return;
        }
        mc.d dVar = (mc.d) this.f48316b.get(obj.getClass());
        if (dVar != null) {
            i(dVar, cVar, obj, z10);
            return;
        }
        mc.f fVar = (mc.f) this.f48317c.get(obj.getClass());
        if (fVar != null) {
            h hVar = this.f48319e;
            hVar.f48321a = false;
            hVar.f48323c = cVar;
            hVar.f48322b = z10;
            fVar.a(obj, hVar);
            return;
        }
        if (obj instanceof c) {
            d(cVar, ((c) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            d(cVar, ((Enum) obj).ordinal(), true);
        } else {
            i(this.f48318d, cVar, obj, z10);
        }
    }

    public final void i(mc.d dVar, mc.c cVar, Object obj, boolean z10) throws IOException {
        b bVar = new b();
        bVar.f48308a = 0L;
        try {
            OutputStream outputStream = this.f48315a;
            this.f48315a = bVar;
            try {
                dVar.a(obj, this);
                this.f48315a = outputStream;
                long j10 = bVar.f48308a;
                bVar.close();
                if (z10 && j10 == 0) {
                    return;
                }
                k((j(cVar) << 3) | 2);
                l(j10);
                dVar.a(obj, this);
            } catch (Throwable th2) {
                this.f48315a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                bVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void k(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f48315a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f48315a.write(i10 & 127);
    }

    public final void l(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f48315a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f48315a.write(((int) j10) & 127);
    }
}

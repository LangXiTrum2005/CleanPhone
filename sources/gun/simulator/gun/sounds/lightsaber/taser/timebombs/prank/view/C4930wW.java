package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4930wW implements InterfaceC3609hS {
    public static final Charset f = Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
    public static final C2530Jt g;
    public static final C2530Jt h;
    public static final C3420fF i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f5183a;
    public final Map b;
    public final Map c;
    public final InterfaceC3521gS d;
    public final C5018xW e = new C5018xW(this);

    static {
        C2329Ca c2329CaD = C2329Ca.d();
        c2329CaD.f2927a = 1;
        g = new C2530Jt("key", DM.u(DM.s(InterfaceC4842vW.class, c2329CaD.b())));
        C2329Ca c2329CaD2 = C2329Ca.d();
        c2329CaD2.f2927a = 2;
        h = new C2530Jt(AppMeasurementSdk.ConditionalUserProperty.VALUE, DM.u(DM.s(InterfaceC4842vW.class, c2329CaD2.b())));
        i = new C3420fF(1);
    }

    public C4930wW(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, InterfaceC3521gS interfaceC3521gS) {
        this.f5183a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
        this.d = interfaceC3521gS;
    }

    public static int h(C2530Jt c2530Jt) {
        InterfaceC4842vW interfaceC4842vW = (InterfaceC4842vW) ((Annotation) c2530Jt.b.get(InterfaceC4842vW.class));
        if (interfaceC4842vW != null) {
            return ((K6) interfaceC4842vW).f3301a;
        }
        throw new C3823jr("Field has no @Protobuf config");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3609hS
    public final InterfaceC3609hS a(C2530Jt c2530Jt, int i2) {
        d(c2530Jt, i2, true);
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3609hS
    public final InterfaceC3609hS b(C2530Jt c2530Jt, long j) throws IOException {
        e(c2530Jt, j, true);
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3609hS
    public final InterfaceC3609hS c(C2530Jt c2530Jt, Object obj) {
        f(c2530Jt, obj, true);
        return this;
    }

    public final void d(C2530Jt c2530Jt, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        InterfaceC4842vW interfaceC4842vW = (InterfaceC4842vW) ((Annotation) c2530Jt.b.get(InterfaceC4842vW.class));
        if (interfaceC4842vW == null) {
            throw new C3823jr("Field has no @Protobuf config");
        }
        K6 k6 = (K6) interfaceC4842vW;
        int iOrdinal = k6.b.ordinal();
        int i3 = k6.f3301a;
        if (iOrdinal == 0) {
            i(i3 << 3);
            i(i2);
        } else if (iOrdinal == 1) {
            i(i3 << 3);
            i((i2 << 1) ^ (i2 >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            i((i3 << 3) | 5);
            this.f5183a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i2).array());
        }
    }

    public final void e(C2530Jt c2530Jt, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        InterfaceC4842vW interfaceC4842vW = (InterfaceC4842vW) ((Annotation) c2530Jt.b.get(InterfaceC4842vW.class));
        if (interfaceC4842vW == null) {
            throw new C3823jr("Field has no @Protobuf config");
        }
        K6 k6 = (K6) interfaceC4842vW;
        int iOrdinal = k6.b.ordinal();
        int i2 = k6.f3301a;
        if (iOrdinal == 0) {
            i(i2 << 3);
            j(j);
        } else if (iOrdinal == 1) {
            i(i2 << 3);
            j((j >> 63) ^ (j << 1));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            i((i2 << 3) | 1);
            this.f5183a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void f(C2530Jt c2530Jt, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            i((h(c2530Jt) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            i(bytes.length);
            this.f5183a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                f(c2530Jt, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                g(i, c2530Jt, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z && dDoubleValue == 0.0d) {
                return;
            }
            i((h(c2530Jt) << 3) | 1);
            this.f5183a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            i((h(c2530Jt) << 3) | 5);
            this.f5183a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            e(c2530Jt, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            d(c2530Jt, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            i((h(c2530Jt) << 3) | 2);
            i(bArr.length);
            this.f5183a.write(bArr);
            return;
        }
        InterfaceC3521gS interfaceC3521gS = (InterfaceC3521gS) this.b.get(obj.getClass());
        if (interfaceC3521gS != null) {
            g(interfaceC3521gS, c2530Jt, obj, z);
            return;
        }
        InterfaceC3191ch0 interfaceC3191ch0 = (InterfaceC3191ch0) this.c.get(obj.getClass());
        if (interfaceC3191ch0 != null) {
            C5018xW c5018xW = this.e;
            c5018xW.f5225a = false;
            c5018xW.c = c2530Jt;
            c5018xW.b = z;
            interfaceC3191ch0.a(obj, c5018xW);
            return;
        }
        if (obj instanceof InterfaceC4578sW) {
            d(c2530Jt, ((InterfaceC4578sW) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            d(c2530Jt, ((Enum) obj).ordinal(), true);
        } else {
            g(this.d, c2530Jt, obj, z);
        }
    }

    public final void g(InterfaceC3521gS interfaceC3521gS, C2530Jt c2530Jt, Object obj, boolean z) throws IOException {
        C4212oH c4212oH = new C4212oH();
        c4212oH.f4786a = 0L;
        try {
            OutputStream outputStream = this.f5183a;
            this.f5183a = c4212oH;
            try {
                interfaceC3521gS.a(obj, this);
                this.f5183a = outputStream;
                long j = c4212oH.f4786a;
                c4212oH.close();
                if (z && j == 0) {
                    return;
                }
                i((h(c2530Jt) << 3) | 2);
                j(j);
                interfaceC3521gS.a(obj, this);
            } catch (Throwable th) {
                this.f5183a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c4212oH.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void i(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            this.f5183a.write((i2 & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128);
            i2 >>>= 7;
        }
        this.f5183a.write(i2 & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
    }

    public final void j(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f5183a.write((((int) j) & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128);
            j >>>= 7;
        }
        this.f5183a.write(((int) j) & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
    }
}

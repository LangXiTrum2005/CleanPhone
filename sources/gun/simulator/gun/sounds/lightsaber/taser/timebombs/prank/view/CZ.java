package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CZ implements Closeable {
    public static final BZ Companion = new BZ();
    private Reader reader;

    public static final CZ create(InterfaceC2460Hb interfaceC2460Hb, RO ro, long j) {
        Companion.getClass();
        return BZ.a(interfaceC2460Hb, ro, j);
    }

    public final InputStream byteStream() {
        return source().Q();
    }

    public final C3971lc byteString() throws IllegalAccessException, IOException, InvocationTargetException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(AbstractC2995aW.v0(Long.valueOf(jContentLength), "Cannot buffer entire body for content length: "));
        }
        InterfaceC2460Hb interfaceC2460HbSource = source();
        try {
            C3971lc c3971lcN = interfaceC2460HbSource.N();
            AbstractC3375el.n(interfaceC2460HbSource, null);
            int iC = c3971lcN.c();
            if (jContentLength == -1 || jContentLength == iC) {
                return c3971lcN;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iC + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3375el.n(interfaceC2460HbSource, th);
                throw th2;
            }
        }
    }

    public final byte[] bytes() throws IllegalAccessException, IOException, InvocationTargetException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(AbstractC2995aW.v0(Long.valueOf(jContentLength), "Cannot buffer entire body for content length: "));
        }
        InterfaceC2460Hb interfaceC2460HbSource = source();
        try {
            byte[] bArrJ = interfaceC2460HbSource.J();
            AbstractC3375el.n(interfaceC2460HbSource, null);
            int length = bArrJ.length;
            if (jContentLength == -1 || jContentLength == length) {
                return bArrJ;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3375el.n(interfaceC2460HbSource, th);
                throw th2;
            }
        }
    }

    public final Reader charStream() {
        Reader c5197zZ = this.reader;
        if (c5197zZ == null) {
            InterfaceC2460Hb interfaceC2460HbSource = source();
            RO roContentType = contentType();
            Charset charsetA = roContentType == null ? null : roContentType.a(AbstractC2307Be.f2881a);
            if (charsetA == null) {
                charsetA = AbstractC2307Be.f2881a;
            }
            c5197zZ = new C5197zZ(interfaceC2460HbSource, charsetA);
            this.reader = c5197zZ;
        }
        return c5197zZ;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Vg0.c(source());
    }

    public abstract long contentLength();

    public abstract RO contentType();

    public abstract InterfaceC2460Hb source();

    public final String string() throws IllegalAccessException, IOException, InvocationTargetException {
        InterfaceC2460Hb interfaceC2460HbSource = source();
        try {
            RO roContentType = contentType();
            Charset charsetA = roContentType == null ? null : roContentType.a(AbstractC2307Be.f2881a);
            if (charsetA == null) {
                charsetA = AbstractC2307Be.f2881a;
            }
            String strL = interfaceC2460HbSource.L(Vg0.r(interfaceC2460HbSource, charsetA));
            AbstractC3375el.n(interfaceC2460HbSource, null);
            return strL;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3375el.n(interfaceC2460HbSource, th);
                throw th2;
            }
        }
    }

    public static final CZ create(C3971lc c3971lc, RO ro) {
        Companion.getClass();
        AbstractC2995aW.q(c3971lc, "<this>");
        C4848vb c4848vb = new C4848vb();
        c4848vb.x(c3971lc);
        return BZ.a(c4848vb, ro, c3971lc.c());
    }

    public static final CZ create(RO ro, long j, InterfaceC2460Hb interfaceC2460Hb) {
        Companion.getClass();
        AbstractC2995aW.q(interfaceC2460Hb, "content");
        return BZ.a(interfaceC2460Hb, ro, j);
    }

    public static final CZ create(RO ro, C3971lc c3971lc) {
        Companion.getClass();
        AbstractC2995aW.q(c3971lc, "content");
        C4848vb c4848vb = new C4848vb();
        c4848vb.x(c3971lc);
        return BZ.a(c4848vb, ro, c3971lc.c());
    }

    public static final CZ create(RO ro, String str) {
        Companion.getClass();
        AbstractC2995aW.q(str, "content");
        return BZ.b(str, ro);
    }

    public static final CZ create(RO ro, byte[] bArr) {
        Companion.getClass();
        AbstractC2995aW.q(bArr, "content");
        return BZ.c(bArr, ro);
    }

    public static final CZ create(String str, RO ro) {
        Companion.getClass();
        return BZ.b(str, ro);
    }

    public static final CZ create(byte[] bArr, RO ro) {
        Companion.getClass();
        return BZ.c(bArr, ro);
    }
}

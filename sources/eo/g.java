package eo;

import b2.p;
import bo.k;
import com.google.android.gms.internal.ads.ws;
import com.google.android.gms.internal.auth.i;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import kotlin.jvm.internal.n;
import lo.r;
import lo.t;
import xn.l;
import xn.m;
import xn.q;
import xn.s;
import xn.v;
import xn.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements co.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40195a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f40197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f40198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f40199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f40200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f40201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f40202h;

    public g(sl.a kind, xl.f fVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i10) {
        n.f(kind, "kind");
        this.f40197c = kind;
        this.f40198d = fVar;
        this.f40199e = strArr;
        this.f40200f = strArr2;
        this.f40201g = strArr3;
        this.f40202h = str;
        this.f40196b = i10;
    }

    @Override // co.e
    public t a(w wVar) {
        if (!co.f.a(wVar)) {
            return e(0L);
        }
        if ("chunked".equalsIgnoreCase(w.a("Transfer-Encoding", wVar))) {
            m mVar = wVar.f54081a.f54060a;
            if (this.f40196b == 4) {
                this.f40196b = 5;
                return new c(this, mVar);
            }
            throw new IllegalStateException(("state: " + this.f40196b).toString());
        }
        long j10 = yn.a.j(wVar);
        if (j10 != -1) {
            return e(j10);
        }
        if (this.f40196b == 4) {
            this.f40196b = 5;
            ((k) this.f40198d).k();
            return new f(this);
        }
        throw new IllegalStateException(("state: " + this.f40196b).toString());
    }

    @Override // co.e
    public r b(s sVar, long j10) {
        if ("chunked".equalsIgnoreCase(sVar.f54062c.b("Transfer-Encoding"))) {
            if (this.f40196b == 1) {
                this.f40196b = 2;
                return new b(this);
            }
            throw new IllegalStateException(("state: " + this.f40196b).toString());
        }
        if (j10 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f40196b == 1) {
            this.f40196b = 2;
            return new e(this);
        }
        throw new IllegalStateException(("state: " + this.f40196b).toString());
    }

    @Override // co.e
    public long c(w wVar) {
        if (!co.f.a(wVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(w.a("Transfer-Encoding", wVar))) {
            return -1L;
        }
        return yn.a.j(wVar);
    }

    @Override // co.e
    public void cancel() {
        Socket socket = ((k) this.f40198d).f5802c;
        if (socket != null) {
            yn.a.e(socket);
        }
    }

    @Override // co.e
    public void d(s sVar) {
        Proxy.Type type = ((k) this.f40198d).f5801b.f54096b.type();
        n.e(type, "connection.route().proxy.type()");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sVar.f54061b);
        sb2.append(' ');
        m mVar = sVar.f54060a;
        if (mVar.f53997i || type != Proxy.Type.HTTP) {
            String strB = mVar.b();
            String strD = mVar.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb2.append(strB);
        } else {
            sb2.append(mVar);
        }
        sb2.append(" HTTP/1.1");
        String string = sb2.toString();
        n.e(string, "StringBuilder().apply(builderAction).toString()");
        f(sVar.f54062c, string);
    }

    public d e(long j10) {
        if (this.f40196b == 4) {
            this.f40196b = 5;
            return new d(this, j10);
        }
        throw new IllegalStateException(("state: " + this.f40196b).toString());
    }

    public void f(l lVar, String requestLine) {
        lo.f fVar = (lo.f) this.f40200f;
        n.f(requestLine, "requestLine");
        if (this.f40196b != 0) {
            throw new IllegalStateException(("state: " + this.f40196b).toString());
        }
        fVar.writeUtf8(requestLine).writeUtf8("\r\n");
        int size = lVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            fVar.writeUtf8(lVar.h(i10)).writeUtf8(": ").writeUtf8(lVar.q(i10)).writeUtf8("\r\n");
        }
        fVar.writeUtf8("\r\n");
        this.f40196b = 1;
    }

    @Override // co.e
    public void finishRequest() {
        ((lo.f) this.f40200f).flush();
    }

    @Override // co.e
    public void flushRequest() {
        ((lo.f) this.f40200f).flush();
    }

    @Override // co.e
    public k getConnection() {
        return (k) this.f40198d;
    }

    @Override // co.e
    public v readResponseHeaders(boolean z10) {
        androidx.recyclerview.widget.c cVar = (androidx.recyclerview.widget.c) this.f40201g;
        int i10 = this.f40196b;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.f40196b).toString());
        }
        ws wsVar = null;
        try {
            String utf8LineStrict = ((lo.g) cVar.f4729c).readUtf8LineStrict(cVar.f4728b);
            cVar.f4728b -= (long) utf8LineStrict.length();
            p pVarA = i.A(utf8LineStrict);
            int i11 = pVarA.f5363b;
            v vVar = new v();
            vVar.f54070b = (xn.r) pVarA.f5364c;
            vVar.f54071c = i11;
            vVar.f54072d = (String) pVarA.f5365d;
            vVar.f54074f = cVar.I().m();
            if (z10 && i11 == 100) {
                return null;
            }
            if (i11 == 100) {
                this.f40196b = 3;
                return vVar;
            }
            if (102 > i11 || i11 >= 200) {
                this.f40196b = 4;
                return vVar;
            }
            this.f40196b = 3;
            return vVar;
        } catch (EOFException e10) {
            m mVar = ((k) this.f40198d).f5801b.f54095a.f53917h;
            mVar.getClass();
            try {
                ws wsVar2 = new ws();
                wsVar2.c(mVar, "/...");
                wsVar = wsVar2;
            } catch (IllegalArgumentException unused) {
            }
            n.c(wsVar);
            wsVar.f21596d = xn.b.b("", 0, 0, 251, " \"':;<=>@[]^`{}|/\\?#");
            wsVar.f21597e = xn.b.b("", 0, 0, 251, " \"':;<=>@[]^`{}|/\\?#");
            throw new IOException("unexpected end of stream on ".concat(wsVar.a().f53996h), e10);
        }
    }

    public String toString() {
        switch (this.f40195a) {
            case 1:
                return ((sl.a) this.f40197c) + " version=" + ((xl.f) this.f40198d);
            default:
                return super.toString();
        }
    }

    public g(q qVar, k kVar, lo.n source, lo.m sink) {
        n.f(source, "source");
        n.f(sink, "sink");
        this.f40197c = qVar;
        this.f40198d = kVar;
        this.f40199e = source;
        this.f40200f = sink;
        this.f40201g = new androidx.recyclerview.widget.c(source);
    }
}

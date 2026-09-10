package com.smartdigimkt.e8;

import com.smartdigimkt.l7.d;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c {
    private static final int g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f34649h = 7;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34652c;
    protected Socket d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34650a = getClass().getSimpleName();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f34653e = null;
    private final byte[] f = new byte[1];

    public class a extends d {
        final /* synthetic */ com.smartdigimkt.d8.c j0;
        final /* synthetic */ com.smartdigimkt.d8.c.a k0;

        public a(com.smartdigimkt.d8.c cVar, com.smartdigimkt.d8.c.a aVar) {
            this.j0 = cVar;
            this.k0 = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0074  */
        /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
        @Override // com.smartdigimkt.l7.d
        public void d() {
            com.smartdigimkt.d8.c.a aVar;
            try {
                c.this.b(this.j0);
                c.this.a(this.j0, this.k0);
            } catch (SocketException e2) {
                String unused = c.this.f34650a;
                e2.getMessage();
                this.j0.toString();
                c.this.a();
                try {
                    c.this.b(this.j0);
                    c.this.a(this.j0, this.k0);
                } catch (Throwable th) {
                    String unused2 = c.this.f34650a;
                    e2.getMessage();
                    this.j0.toString();
                    th = th;
                    String unused3 = c.this.f34650a;
                    th.toString();
                    this.j0.a("", th + "", c.this.f34651b, c.this.f34652c);
                    aVar = this.k0;
                    if (aVar != null) {
                        aVar.a(th);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                String unused4 = c.this.f34650a;
                th.toString();
                this.j0.a("", th + "", c.this.f34651b, c.this.f34652c);
                aVar = this.k0;
                if (aVar != null) {
                    aVar.a(th);
                }
            }
        }
    }

    public abstract void a(com.smartdigimkt.d8.c cVar, com.smartdigimkt.d8.c.a aVar) throws Exception;

    private boolean b() {
        Socket socket = this.d;
        return (socket == null || !socket.isConnected() || this.d.isClosed()) ? false : true;
    }

    private void a(com.smartdigimkt.d8.c cVar) throws Exception {
        synchronized (this) {
            try {
                if (this.d == null) {
                    Socket socket = new Socket();
                    this.d = socket;
                    socket.setSoTimeout(60000);
                }
                com.smartdigimkt.f8.b bVarG = cVar.g();
                if (bVarG != null) {
                    this.f34651b = bVarG.a();
                    this.f34652c = bVarG.b();
                    this.d.connect(new InetSocketAddress(this.f34651b, this.f34652c), 30000);
                } else {
                    throw new IllegalArgumentException("The domain must not can be null or empty.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(com.smartdigimkt.d8.c cVar, com.smartdigimkt.d8.c.a aVar) {
        a aVar2 = new a(cVar, aVar);
        if (cVar.a() == 6) {
            com.smartdigimkt.l7.b.a().a((d) aVar2, 2);
        } else {
            com.smartdigimkt.l7.b.a().a((d) aVar2, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(com.smartdigimkt.d8.c cVar) throws Exception {
        try {
            if (!b()) {
                a(cVar);
            }
            byte[] bArrC = cVar.c();
            if (bArrC != null) {
                int length = bArrC.length;
                if (bArrC.length == 0) {
                    return;
                }
                int i2 = length + 7;
                byte[] bArr = this.f34653e;
                if (bArr == null || bArr.length < i2) {
                    this.f34653e = new byte[i2];
                }
                byte[] bArr2 = this.f34653e;
                bArr2[0] = 0;
                bArr2[1] = (byte) cVar.d();
                this.f34653e[2] = (byte) cVar.a();
                byte[] bArr3 = this.f34653e;
                bArr3[3] = (byte) ((length >>> 24) & 255);
                bArr3[4] = (byte) ((length >>> 16) & 255);
                bArr3[5] = (byte) ((length >>> 8) & 255);
                bArr3[6] = (byte) (length & 255);
                System.arraycopy(bArrC, 0, bArr3, 7, bArrC.length);
                OutputStream outputStream = this.d.getOutputStream();
                outputStream.write(this.f34653e, 0, i2);
                outputStream.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        synchronized (this) {
            try {
                Socket socket = this.d;
                if (socket != null) {
                    socket.close();
                    this.d = null;
                }
            } catch (Exception unused) {
            }
        }
    }

    public int a(InputStream inputStream) throws Exception {
        if (inputStream.read(this.f, 0, 1) != -1) {
            byte[] bArr = this.f;
            byte b2 = bArr[0];
            bArr[0] = 0;
            return b2;
        }
        throw new SocketException("Socket.InputStream read length = -1!");
    }
}

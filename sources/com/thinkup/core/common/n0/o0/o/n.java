package com.thinkup.core.common.n0.o0.o;

import com.thinkup.core.common.n0.m.m0;
import com.thinkup.core.common.n0.o0.o0;
import com.thinkup.core.common.ooo.o00;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f41969n = 0;
    private static final int o0 = 7;
    protected Socket o;
    private int om;
    private String oo;
    private final String m = getClass().getSimpleName();
    private byte[] on = null;
    private final byte[] m0 = new byte[1];

    private boolean m() {
        Socket socket = this.o;
        return (socket == null || !socket.isConnected() || this.o.isClosed()) ? false : true;
    }

    public abstract void o(o0 o0Var, o0.o oVar);

    public final void m(final o0 o0Var, final o0.o oVar) {
        com.thinkup.core.common.ooo.m.o0 o0Var2 = new com.thinkup.core.common.ooo.m.o0() { // from class: com.thinkup.core.common.n0.o0.o.n.1
            /* JADX WARN: Code duplicated, block: B:16:0x008c  */
            /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
            @Override // com.thinkup.core.common.ooo.m.o0
            public final void o() {
                o0.o oVar2;
                try {
                    n.this.m(o0Var);
                    n.this.o(o0Var, oVar);
                } catch (SocketException e2) {
                    String unused = n.this.m;
                    e2.getMessage();
                    o0Var.toString();
                    n.m(n.this);
                    try {
                        n.this.m(o0Var);
                        n.this.o(o0Var, oVar);
                    } catch (Throwable th) {
                        String unused2 = n.this.m;
                        e2.getMessage();
                        o0Var.toString();
                        th = th;
                        String str = th.getMessage() + "," + o00.o(th.getStackTrace());
                        String unused3 = n.this.m;
                        o0Var.o("", str, n.this.oo, n.this.om);
                        oVar2 = oVar;
                        if (oVar2 != null) {
                            oVar2.o(th);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    String unused4 = n.this.m;
                    th.getMessage();
                    String str2 = th.getMessage() + "," + o00.o(th.getStackTrace());
                    String unused5 = n.this.m;
                    o0Var.o("", str2, n.this.oo, n.this.om);
                    oVar2 = oVar;
                    if (oVar2 != null) {
                        oVar2.o(th);
                    }
                }
            }
        };
        if (o0Var.n() == 6) {
            com.thinkup.core.common.ooo.m.m.o().o(o0Var2, 2);
        } else {
            com.thinkup.core.common.ooo.m.m.o().o(o0Var2, 3);
        }
    }

    private void o(o0 o0Var) {
        synchronized (this) {
            try {
                if (this.o == null) {
                    Socket socket = new Socket();
                    this.o = socket;
                    socket.setSoTimeout(60000);
                }
                m0 m0VarC_ = o0Var.c_();
                if (m0VarC_ != null) {
                    this.oo = m0VarC_.o();
                    this.om = m0VarC_.m();
                    this.o.connect(new InetSocketAddress(this.oo, this.om), 30000);
                } else {
                    throw new IllegalArgumentException("The domain must not can be null or empty.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void m(o0 o0Var) {
        try {
            Socket socket = this.o;
            if (socket == null || !socket.isConnected() || this.o.isClosed()) {
                synchronized (this) {
                    try {
                        if (this.o == null) {
                            Socket socket2 = new Socket();
                            this.o = socket2;
                            socket2.setSoTimeout(60000);
                        }
                        m0 m0VarC_ = o0Var.c_();
                        if (m0VarC_ != null) {
                            this.oo = m0VarC_.o();
                            this.om = m0VarC_.m();
                            this.o.connect(new InetSocketAddress(this.oo, this.om), 30000);
                        } else {
                            throw new IllegalArgumentException("The domain must not can be null or empty.");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            byte[] bArrOo = o0Var.oo();
            if (bArrOo != null) {
                int length = bArrOo.length;
                if (bArrOo.length == 0) {
                    return;
                }
                int i2 = length + 7;
                byte[] bArr = this.on;
                if (bArr == null || bArr.length < i2) {
                    this.on = new byte[i2];
                }
                byte[] bArr2 = this.on;
                bArr2[0] = 0;
                bArr2[1] = 3;
                bArr2[2] = (byte) o0Var.n();
                byte[] bArr3 = this.on;
                bArr3[3] = (byte) ((length >>> 24) & 255);
                bArr3[4] = (byte) ((length >>> 16) & 255);
                bArr3[5] = (byte) ((length >>> 8) & 255);
                bArr3[6] = (byte) (length & 255);
                System.arraycopy(bArrOo, 0, bArr3, 7, bArrOo.length);
                OutputStream outputStream = this.o.getOutputStream();
                outputStream.write(this.on, 0, i2);
                outputStream.flush();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void o() {
        synchronized (this) {
            try {
                Socket socket = this.o;
                if (socket != null) {
                    socket.close();
                    this.o = null;
                }
            } catch (Exception unused) {
            }
        }
    }

    public final int o(InputStream inputStream) throws SocketException {
        if (inputStream.read(this.m0, 0, 1) != -1) {
            byte[] bArr = this.m0;
            byte b2 = bArr[0];
            bArr[0] = 0;
            return b2;
        }
        throw new SocketException("Socket.InputStream read length = -1!");
    }

    public static /* synthetic */ void m(n nVar) {
        synchronized (nVar) {
            try {
                Socket socket = nVar.o;
                if (socket != null) {
                    socket.close();
                    nVar.o = null;
                }
            } catch (Exception unused) {
            }
        }
    }
}

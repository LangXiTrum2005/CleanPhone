package sg.bigo.ads.core.player.a;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ServerSocket f48748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f48749c;
    private Thread f;
    private h g;
    private final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final sg.bigo.ads.common.n.e f48747a = new sg.bigo.ads.common.n.e("Play", 3, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, e> f48750e = new ConcurrentHashMap();

    public final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Socket f48752b;

        public a(Socket socket) {
            this.f48752b = socket;
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            StringBuilder sb;
            String string;
            d dVar = d.this;
            Socket socket = this.f48752b;
            int i2 = 3;
            int i3 = 0;
            try {
                try {
                    try {
                        sg.bigo.ads.core.player.a.b bVarA = sg.bigo.ads.core.player.a.b.a(socket.getInputStream());
                        if (bVarA == null) {
                            d.a(socket);
                            string = "Opened connections: " + dVar.b();
                        } else {
                            sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Request to cache proxy:request=".concat(String.valueOf(bVarA)));
                            String strF = q.f(bVarA.f48743a);
                            if ("ping".equals(strF)) {
                                try {
                                    OutputStream outputStream = socket.getOutputStream();
                                    outputStream.write("HTTP/1.1 200 OK\n\n".getBytes());
                                    outputStream.write("ping ok".getBytes());
                                } catch (IOException e2) {
                                    sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Pinger#responseToPing, error message is : " + e2.toString());
                                }
                            } else {
                                if (!TextUtils.isEmpty(strF)) {
                                    final e eVarA = dVar.a(strF);
                                    try {
                                        if (eVarA.a()) {
                                            try {
                                                if (SystemClock.elapsedRealtime() - eVarA.f48758e > 300000) {
                                                    int andSet = eVarA.f.getAndSet(0);
                                                    eVarA.f48758e = SystemClock.elapsedRealtime();
                                                    sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "reset resetRetryCount=".concat(String.valueOf(andSet)));
                                                }
                                                eVarA.f48755a.incrementAndGet();
                                                if (eVarA.f48757c != null && eVarA.f48757c.j != 1 && !eVarA.f48757c.b() && SystemClock.elapsedRealtime() - eVarA.d > MBInterstitialActivity.WEB_LOAD_TIME && eVarA.f.getAndIncrement() < 3) {
                                                    sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "keepDownloadTaskAlive retryCount=" + eVarA.f.get());
                                                    eVarA.d = SystemClock.elapsedRealtime();
                                                    sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.a.e.1
                                                        public AnonymousClass1() {
                                                        }

                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            sg.bigo.ads.core.player.b.a().g.a(e.this.f48757c, true);
                                                        }
                                                    });
                                                }
                                                c cVar = eVarA.f48756b;
                                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
                                                String strF2 = q.f(bVarA.f48743a);
                                                MimeTypeMap singleton = MimeTypeMap.getSingleton();
                                                String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(strF2);
                                                String mimeTypeFromExtension = TextUtils.isEmpty(fileExtensionFromUrl) ? null : singleton.getMimeTypeFromExtension(fileExtensionFromUrl);
                                                boolean zIsEmpty = TextUtils.isEmpty(mimeTypeFromExtension);
                                                long jA = cVar.f48746a.c() ? cVar.f48746a.a() : cVar.f48746a.f48740b.f47256i;
                                                boolean z2 = jA >= 0;
                                                boolean z3 = bVarA.f48745c;
                                                long j = z3 ? jA - bVarA.f48744b : jA;
                                                boolean z4 = z2 && z3;
                                                StringBuilder sb2 = new StringBuilder();
                                                try {
                                                    sb2.append(bVarA.f48745c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
                                                    sb2.append("Accept-Ranges: bytes\n");
                                                    String strA = "";
                                                    if (z2) {
                                                        strA = c.a("Content-Length: %d\n", Long.valueOf(j));
                                                    }
                                                    sb2.append(strA);
                                                    sb2.append(z4 ? c.a("Content-Range: bytes %d-%d/%d\n", Long.valueOf(bVarA.f48744b), Long.valueOf(jA - 1), Long.valueOf(jA)) : strA);
                                                    sb2.append(!zIsEmpty ? c.a("Content-Type: %s\n", mimeTypeFromExtension) : "");
                                                    sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                                                    String string2 = sb2.toString();
                                                    sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "newResponseHeaders =".concat(String.valueOf(string2)));
                                                    bufferedOutputStream.write(string2.getBytes("UTF-8"));
                                                    cVar.a(bufferedOutputStream, bVarA.f48744b);
                                                    eVarA.b();
                                                } catch (Throwable th) {
                                                    th = th;
                                                    eVarA.b();
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                        } else {
                                            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "startProcessRequest failed");
                                            eVarA.b();
                                        }
                                    } catch (SocketException unused) {
                                        i3 = 0;
                                        sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Closing socket… Socket is closed by client.");
                                        d.a(socket);
                                        sb = new StringBuilder("Opened connections: ");
                                        sb.append(dVar.b());
                                        string = sb.toString();
                                        i2 = 3;
                                    } catch (IOException e3) {
                                        e = e3;
                                        i3 = 0;
                                        sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error processing request, error message is : " + e.toString());
                                        d.a(socket);
                                        sb = new StringBuilder("Opened connections: ");
                                        sb.append(dVar.b());
                                        string = sb.toString();
                                        i2 = 3;
                                    } catch (j e4) {
                                        e = e4;
                                        i3 = 0;
                                        sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error processing request, error message is : " + e.toString());
                                        d.a(socket);
                                        sb = new StringBuilder("Opened connections: ");
                                        sb.append(dVar.b());
                                        string = sb.toString();
                                        i2 = 3;
                                    }
                                }
                                d.a(socket);
                                string = "Opened connections: " + dVar.b();
                                i2 = 3;
                                i3 = 0;
                            }
                            d.a(socket);
                            string = "Opened connections: " + dVar.b();
                            i2 = 3;
                            i3 = 0;
                        }
                    } catch (j e5) {
                        e = e5;
                        i3 = 0;
                        sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error processing request, error message is : " + e.toString());
                        d.a(socket);
                        sb = new StringBuilder("Opened connections: ");
                        sb.append(dVar.b());
                        string = sb.toString();
                        i2 = 3;
                        sg.bigo.ads.common.t.a.a(i3, i2, "ProxyCache", string);
                    } catch (Throwable th3) {
                        th = th3;
                        d.a(socket);
                        sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Opened connections: " + dVar.b());
                        throw th;
                    }
                } catch (SocketException unused2) {
                } catch (IOException e6) {
                    e = e6;
                    i3 = 0;
                    sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error processing request, error message is : " + e.toString());
                    d.a(socket);
                    sb = new StringBuilder("Opened connections: ");
                    sb.append(dVar.b());
                    string = sb.toString();
                    i2 = 3;
                    sg.bigo.ads.common.t.a.a(i3, i2, "ProxyCache", string);
                }
                sg.bigo.ads.common.t.a.a(i3, i2, "ProxyCache", string);
            } catch (Throwable th4) {
                th = th4;
                d.a(socket);
                sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Opened connections: " + dVar.b());
                throw th;
            }
        }
    }

    public final class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CountDownLatch f48754b;

        public b(CountDownLatch countDownLatch) {
            this.f48754b = countDownLatch;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f48754b.countDown();
            d dVar = d.this;
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Socket socketAccept = dVar.f48748b.accept();
                    sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Accept new socket socket=".concat(String.valueOf(socketAccept)));
                    dVar.f48747a.submit(dVar.new a(socketAccept));
                } catch (Throwable th) {
                    sg.bigo.ads.core.d.b.a(3005, 10111, th.toString());
                    sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error during waiting connection, error message is : " + th.toString());
                    return;
                }
            }
        }
    }

    public d() {
        try {
            ServerSocket serverSocket = new ServerSocket(0, 8, InetAddress.getByName("127.0.0.1"));
            this.f48748b = serverSocket;
            int localPort = serverSocket.getLocalPort();
            this.f48749c = localPort;
            f.a("127.0.0.1", localPort);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Thread thread = new Thread(new b(countDownLatch));
            this.f = thread;
            thread.setName("BGAd-Conn");
            this.f.start();
            countDownLatch.await();
            this.g = new h("127.0.0.1", this.f48749c);
            sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Proxy cache server started. Is it alive? " + a());
        } catch (IOException | InterruptedException e2) {
            this.f48747a.shutdown();
            sg.bigo.ads.core.d.b.a(3005, 10110, "Error starting local proxy server, error message is : " + e2.toString());
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error starting local proxy server, error message is : " + e2.toString());
        }
    }

    public final e a(String str) {
        e eVar;
        synchronized (this.d) {
            try {
                eVar = this.f48750e.get(str);
                if (eVar == null) {
                    eVar = new e(str);
                    this.f48750e.put(str, eVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public final int b() {
        int i2;
        synchronized (this.d) {
            try {
                Iterator<e> it = this.f48750e.values().iterator();
                i2 = 0;
                while (it.hasNext()) {
                    i2 += it.next().f48755a.get();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2;
    }

    public static void a(Socket socket) {
        String str;
        try {
            if (!socket.isInputShutdown()) {
                socket.shutdownInput();
            }
        } catch (SocketException unused) {
            str = "Releasing input stream… Socket is closed by client.";
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", str);
        } catch (IOException e2) {
            str = "Error closing socket input stream, error message is " + e2.getMessage();
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", str);
        }
        try {
            if (!socket.isOutputShutdown()) {
                socket.shutdownOutput();
            }
        } catch (IOException e3) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Failed to close socket on proxy side: {}. It seems client have already closed connection." + e3.getMessage());
        }
        try {
            if (socket.isClosed()) {
                return;
            }
            socket.close();
        } catch (IOException e4) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error closing socket" + e4.getMessage());
        }
    }

    public final boolean a() {
        h hVar = this.g;
        return hVar != null && hVar.a();
    }
}

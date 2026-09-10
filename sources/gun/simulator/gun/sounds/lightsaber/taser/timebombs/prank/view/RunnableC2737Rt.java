package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Rt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC2737Rt implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f3686a;
    public final /* synthetic */ InterfaceC2763St b;
    public final /* synthetic */ String c;
    public final /* synthetic */ File d;
    public final /* synthetic */ Object e;

    public RunnableC2737Rt(File file, InterfaceC2763St interfaceC2763St, String str, File file2, Object obj) {
        this.f3686a = file;
        this.b = interfaceC2763St;
        this.c = str;
        this.d = file2;
        this.e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x018d A[Catch: IOException -> 0x0191, TRY_ENTER, TryCatch #1 {IOException -> 0x0191, blocks: (B:97:0x017b, B:98:0x017d, B:102:0x018d, B:106:0x0195, B:108:0x019a, B:112:0x01a0, B:99:0x017e, B:100:0x018a), top: B:123:0x017b, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0195 A[Catch: IOException -> 0x0191, TryCatch #1 {IOException -> 0x0191, blocks: (B:97:0x017b, B:98:0x017d, B:102:0x018d, B:106:0x0195, B:108:0x019a, B:112:0x01a0, B:99:0x017e, B:100:0x018a), top: B:123:0x017b, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x019a A[Catch: IOException -> 0x0191, TRY_LEAVE, TryCatch #1 {IOException -> 0x0191, blocks: (B:97:0x017b, B:98:0x017d, B:102:0x018d, B:106:0x0195, B:108:0x019a, B:112:0x01a0, B:99:0x017e, B:100:0x018a), top: B:123:0x017b, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0153 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x017e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0104 A[Catch: all -> 0x010a, TryCatch #4 {all -> 0x010a, blocks: (B:67:0x00f9, B:69:0x0104, B:72:0x010c, B:76:0x0128, B:77:0x0137), top: B:124:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0127  */
    /* JADX WARN: Code duplicated, block: B:83:0x0162 A[Catch: IOException -> 0x0166, TRY_ENTER, TryCatch #13 {IOException -> 0x0166, blocks: (B:78:0x0150, B:79:0x0152, B:83:0x0162, B:87:0x016a, B:89:0x016f, B:93:0x0175, B:80:0x0153, B:81:0x015f), top: B:131:0x0150, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x016a A[Catch: IOException -> 0x0166, TryCatch #13 {IOException -> 0x0166, blocks: (B:78:0x0150, B:79:0x0152, B:83:0x0162, B:87:0x016a, B:89:0x016f, B:93:0x0175, B:80:0x0153, B:81:0x015f), top: B:131:0x0150, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x016f A[Catch: IOException -> 0x0166, TRY_LEAVE, TryCatch #13 {IOException -> 0x0166, blocks: (B:78:0x0150, B:79:0x0152, B:83:0x0162, B:87:0x016a, B:89:0x016f, B:93:0x0175, B:80:0x0153, B:81:0x015f), top: B:131:0x0150, inners: #10 }] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        byte[] bArr;
        byte[] bArr2;
        int i;
        int i2;
        try {
            this.f3686a.createNewFile();
            InputStream inputStream2 = null;
            try {
                httpURLConnection = (HttpURLConnection) new URL(this.c).openConnection();
                try {
                    try {
                        httpURLConnection.setRequestMethod(Qm0.D(new byte[]{54, 81, 28}, new byte[]{113, 20, 72, -28, -26, -13, -98, 79}));
                        httpURLConnection.connect();
                        if (httpURLConnection.getResponseCode() == 200) {
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                fileOutputStream = new FileOutputStream(this.f3686a);
                                try {
                                    byte[] bArr3 = new byte[1024];
                                    while (true) {
                                        int i3 = inputStream.read(bArr3);
                                        if (i3 == -1) {
                                            break;
                                        } else {
                                            fileOutputStream.write(bArr3, 0, i3);
                                        }
                                    }
                                    this.f3686a.renameTo(this.d);
                                    InterfaceC2763St interfaceC2763St = this.b;
                                    this.d.getAbsolutePath();
                                    interfaceC2763St.n();
                                    inputStream2 = inputStream;
                                } catch (Exception e) {
                                    e = e;
                                    inputStream2 = inputStream;
                                    try {
                                        e.printStackTrace();
                                        if (this.f3686a.exists()) {
                                            this.f3686a.delete();
                                        }
                                        InterfaceC2763St interfaceC2763St2 = this.b;
                                        StringBuilder sb = new StringBuilder();
                                        bArr = new byte[]{-11, 22, 28, -33, 74, 81, 117, -10, -111, 31, 10, -40, 74, 91, 112, -88, -111};
                                        bArr2 = new byte[]{-79, 121, 107, -79, 38, 62, 20, -110};
                                        i = 0;
                                        i2 = 0;
                                        while (i < 17) {
                                            if (i2 >= 8) {
                                                i2 = 0;
                                            }
                                            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                                            i++;
                                            i2++;
                                        }
                                        sb.append(new String(bArr, StandardCharsets.UTF_8));
                                        sb.append(e.getMessage());
                                        new IOException(sb.toString());
                                        interfaceC2763St2.getClass();
                                        try {
                                            synchronized (this.e) {
                                                AbstractC2789Tt.b.remove(this.c);
                                                this.e.notifyAll();
                                            }
                                            if (inputStream2 != null) {
                                                inputStream2.close();
                                            }
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            if (httpURLConnection != null) {
                                                httpURLConnection.disconnect();
                                            }
                                        } catch (IOException e2) {
                                            e2.printStackTrace();
                                            return;
                                        }
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        th = th2;
                                        try {
                                            synchronized (this.e) {
                                                AbstractC2789Tt.b.remove(this.c);
                                                this.e.notifyAll();
                                            }
                                            if (inputStream2 != null) {
                                                inputStream2.close();
                                            }
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            if (httpURLConnection != null) {
                                                throw th;
                                            }
                                            httpURLConnection.disconnect();
                                            throw th;
                                        } catch (IOException e3) {
                                            e3.printStackTrace();
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th2 = th4;
                                    inputStream2 = inputStream;
                                    th = th2;
                                    synchronized (this.e) {
                                        AbstractC2789Tt.b.remove(this.c);
                                        this.e.notifyAll();
                                        if (inputStream2 != null) {
                                            inputStream2.close();
                                        }
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                        if (httpURLConnection != null) {
                                            throw th;
                                        }
                                        httpURLConnection.disconnect();
                                        throw th;
                                    }
                                }
                            } catch (Exception e4) {
                                e = e4;
                                fileOutputStream = null;
                                inputStream2 = inputStream;
                                e.printStackTrace();
                                if (this.f3686a.exists()) {
                                    this.f3686a.delete();
                                }
                                InterfaceC2763St interfaceC2763St3 = this.b;
                                StringBuilder sb2 = new StringBuilder();
                                bArr = new byte[]{-11, 22, 28, -33, 74, 81, 117, -10, -111, 31, 10, -40, 74, 91, 112, -88, -111};
                                bArr2 = new byte[]{-79, 121, 107, -79, 38, 62, 20, -110};
                                i = 0;
                                i2 = 0;
                                while (i < 17) {
                                    if (i2 >= 8) {
                                        i2 = 0;
                                    }
                                    bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                                    i++;
                                    i2++;
                                }
                                sb2.append(new String(bArr, StandardCharsets.UTF_8));
                                sb2.append(e.getMessage());
                                new IOException(sb2.toString());
                                interfaceC2763St3.getClass();
                                synchronized (this.e) {
                                    AbstractC2789Tt.b.remove(this.c);
                                    this.e.notifyAll();
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                th = th;
                                fileOutputStream = null;
                                inputStream2 = inputStream;
                                synchronized (this.e) {
                                    AbstractC2789Tt.b.remove(this.c);
                                    this.e.notifyAll();
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                    if (httpURLConnection != null) {
                                        throw th;
                                    }
                                    httpURLConnection.disconnect();
                                    throw th;
                                }
                            }
                        } else {
                            if (this.f3686a.exists()) {
                                this.f3686a.delete();
                            }
                            InterfaceC2763St interfaceC2763St4 = this.b;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(Qm0.D(new byte[]{com.umeng.analytics.pro.cw.l, -34, 85, -118, -115, 35, -31, 105, 41, -8, 33, -71, -62, 2, -10, 33, 102}, new byte[]{70, -118, 1, -38, -83, 102, -109, 27}));
                            sb3.append(httpURLConnection.getResponseCode());
                            new IOException(sb3.toString());
                            interfaceC2763St4.getClass();
                            fileOutputStream = null;
                        }
                        try {
                            synchronized (this.e) {
                                AbstractC2789Tt.b.remove(this.c);
                                this.e.notifyAll();
                            }
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            httpURLConnection.disconnect();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    } catch (Exception e6) {
                        e = e6;
                        inputStream = null;
                    } catch (Throwable th6) {
                        th = th6;
                        inputStream = null;
                    }
                } catch (Exception e7) {
                    e = e7;
                    fileOutputStream = null;
                    e.printStackTrace();
                    if (this.f3686a.exists()) {
                        this.f3686a.delete();
                    }
                    InterfaceC2763St interfaceC2763St5 = this.b;
                    StringBuilder sb4 = new StringBuilder();
                    bArr = new byte[]{-11, 22, 28, -33, 74, 81, 117, -10, -111, 31, 10, -40, 74, 91, 112, -88, -111};
                    bArr2 = new byte[]{-79, 121, 107, -79, 38, 62, 20, -110};
                    i = 0;
                    i2 = 0;
                    while (i < 17) {
                        if (i2 >= 8) {
                            i2 = 0;
                        }
                        bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                        i++;
                        i2++;
                    }
                    sb4.append(new String(bArr, StandardCharsets.UTF_8));
                    sb4.append(e.getMessage());
                    new IOException(sb4.toString());
                    interfaceC2763St5.getClass();
                    synchronized (this.e) {
                        AbstractC2789Tt.b.remove(this.c);
                        this.e.notifyAll();
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    fileOutputStream = null;
                    synchronized (this.e) {
                        AbstractC2789Tt.b.remove(this.c);
                        this.e.notifyAll();
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (httpURLConnection != null) {
                            throw th;
                        }
                        httpURLConnection.disconnect();
                        throw th;
                    }
                }
            } catch (Exception e8) {
                e = e8;
                httpURLConnection = null;
                inputStream = null;
            } catch (Throwable th8) {
                th = th8;
                httpURLConnection = null;
                inputStream = null;
            }
        } catch (IOException e9) {
            e9.printStackTrace();
            InterfaceC2763St interfaceC2763St6 = this.b;
            StringBuilder sb5 = new StringBuilder();
            byte[] bArr4 = {-26, 99, 101, -73, 113, -6, 122, 45, -126, 106, 115, -80, 113, -16, 127, 115, -126};
            byte[] bArr5 = {-94, 12, 18, -39, 29, -107, 27, 73};
            int i4 = 0;
            int i5 = 0;
            while (i4 < 17) {
                if (i5 >= 8) {
                    i5 = 0;
                }
                bArr4[i4] = (byte) (bArr4[i4] ^ bArr5[i5]);
                i4++;
                i5++;
            }
            sb5.append(new String(bArr4, StandardCharsets.UTF_8));
            sb5.append(e9.getMessage());
            new IOException(sb5.toString());
            interfaceC2763St6.getClass();
        }
    }
}

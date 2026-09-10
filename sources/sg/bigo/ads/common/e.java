package sg.bigo.ads.common;

import android.content.Context;
import android.os.Parcel;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f47131b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f47130a = new Runnable() { // from class: sg.bigo.ads.common.e.1
        @Override // java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            eVar.c(eVar.f47131b);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f47132c = false;
    protected boolean d = false;

    public e(Context context) {
        this.f47131b = context;
    }

    private void B() {
        this.f47132c = true;
        sg.bigo.ads.common.t.a.a(0, 3, b(), "onDataSaved, ".concat(String.valueOf(this)));
    }

    public abstract String a();

    public final void a(long j) {
        sg.bigo.ads.common.n.d.a(this.f47130a);
        if (j <= 0) {
            sg.bigo.ads.common.n.d.a(1, this.f47130a);
        } else {
            sg.bigo.ads.common.n.d.a(1, this.f47130a, j);
        }
    }

    public abstract String b();

    public final synchronized void b(Context context) {
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            try {
                File file = new File(o.a(context), a());
                this.d = file.exists();
                byte[] bArrB = sg.bigo.ads.common.utils.g.b(file);
                if (bArrB == null) {
                    sg.bigo.ads.common.t.a.a(0, 4, b(), "data file not exist");
                    a(context);
                    return;
                }
                byte[] bArrB2 = sg.bigo.ads.common.utils.o.b(bArrB);
                if (bArrB2 == null) {
                    sg.bigo.ads.common.t.a.a(0, b(), "data decrypt failed length=" + bArrB.length);
                    file.delete();
                    a(context);
                    return;
                }
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrB2);
                try {
                    int iAvailable = byteArrayInputStream2.available();
                    byte[] bArr = new byte[iAvailable];
                    byteArrayInputStream2.read(bArr);
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.unmarshall(bArr, 0, iAvailable);
                    parcelObtain.setDataPosition(0);
                    b(parcelObtain);
                    try {
                        byteArrayInputStream2.close();
                    } catch (IOException unused) {
                        sg.bigo.ads.common.t.a.a(0, 5, b(), "close data input stream failed");
                    }
                    a(context);
                } catch (Exception unused2) {
                    byteArrayInputStream = byteArrayInputStream2;
                    sg.bigo.ads.common.t.a.a(0, 5, b(), "DataFile load failed");
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused3) {
                            sg.bigo.ads.common.t.a.a(0, 5, b(), "close data input stream failed");
                        }
                    }
                    a(context);
                } catch (Throwable th) {
                    th = th;
                    byteArrayInputStream = byteArrayInputStream2;
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused4) {
                            sg.bigo.ads.common.t.a.a(0, 5, b(), "close data input stream failed");
                        }
                    }
                    a(context);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused5) {
        }
    }

    public final synchronized void c(Context context) {
        String str;
        String str2;
        sg.bigo.ads.common.n.d.a(this.f47130a);
        ByteArrayOutputStream byteArrayOutputStream = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream = null;
        byteArrayOutputStream = null;
        try {
            try {
                Parcel parcelObtain = Parcel.obtain();
                a(parcelObtain);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    byteArrayOutputStream2.write(parcelObtain.marshall());
                    byteArrayOutputStream2.flush();
                    byte[] bArrA = sg.bigo.ads.common.utils.o.a(byteArrayOutputStream2.toByteArray());
                    if (bArrA == null) {
                        sg.bigo.ads.common.t.a.a(0, b(), "## data encrypt failed.");
                        try {
                            byteArrayOutputStream2.close();
                        } catch (IOException unused) {
                            sg.bigo.ads.common.t.a.a(0, 5, b(), "close output stream failed");
                        }
                        this.d = true;
                        B();
                        return;
                    }
                    File file = new File(o.a(context), a());
                    File fileA = sg.bigo.ads.common.utils.g.a(file);
                    if (file.exists()) {
                        if (fileA.exists()) {
                            if (!file.delete()) {
                                str = "IOUtils";
                                str2 = "delete locked file failed: " + file.getName();
                                sg.bigo.ads.common.t.a.a(0, str, str2);
                            }
                        } else if (!file.renameTo(fileA)) {
                            str = "IOUtils";
                            str2 = "rename locked file failed: " + file.getName();
                            sg.bigo.ads.common.t.a.a(0, str, str2);
                        }
                    }
                    try {
                        try {
                            try {
                                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                                try {
                                    fileOutputStream2.write(bArrA);
                                    fileOutputStream2.getFD().sync();
                                    if (fileA.exists() && !fileA.delete()) {
                                        sg.bigo.ads.common.t.a.a(0, "IOUtils", "delete backup file failed: " + fileA.getName());
                                    }
                                    fileOutputStream2.close();
                                } catch (Exception unused2) {
                                    fileOutputStream = fileOutputStream2;
                                    sg.bigo.ads.common.t.a.a(0, "IOUtils", "write file " + file.getPath() + " failed");
                                    if (file.exists() && !file.delete()) {
                                        sg.bigo.ads.common.t.a.a(0, "IOUtils", "delete locked file with exception failed: " + file.getName());
                                    }
                                    if (fileOutputStream == null) {
                                        sg.bigo.ads.common.t.a.a(0, 4, b(), "data saved:".concat(String.valueOf(this)));
                                        byteArrayOutputStream2.close();
                                        this.d = true;
                                        B();
                                        return;
                                    }
                                    fileOutputStream.close();
                                    throw th;
                                } catch (Throwable th) {
                                    th = th;
                                    fileOutputStream = fileOutputStream2;
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (IOException unused3) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Exception unused4) {
                            }
                        } catch (IOException unused5) {
                        }
                        sg.bigo.ads.common.t.a.a(0, 4, b(), "data saved:".concat(String.valueOf(this)));
                        try {
                            byteArrayOutputStream2.close();
                        } catch (IOException unused6) {
                            sg.bigo.ads.common.t.a.a(0, 5, b(), "close output stream failed");
                        }
                        this.d = true;
                        B();
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception unused7) {
                    byteArrayOutputStream = byteArrayOutputStream2;
                    sg.bigo.ads.common.t.a.a(0, 5, b(), "data save failed");
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException unused8) {
                            sg.bigo.ads.common.t.a.a(0, 5, b(), "close output stream failed");
                        }
                    }
                    this.d = true;
                    B();
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException unused9) {
                            sg.bigo.ads.common.t.a.a(0, 5, b(), "close output stream failed");
                        }
                    }
                    this.d = true;
                    B();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception unused10) {
        }
        throw th;
    }

    public void a(Context context) {
        this.f47132c = true;
        sg.bigo.ads.common.t.a.a(0, 3, b(), "onDataLoaded, ".concat(String.valueOf(this)));
    }
}

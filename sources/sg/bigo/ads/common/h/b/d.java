package sg.bigo.ads.common.h.b;

import android.content.Context;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f47284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InputStream f47285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f47286c;
    private final Context d;

    public d(Context context, a aVar) {
        this.d = context;
        this.f47284a = aVar;
        sg.bigo.ads.common.h.a aVar2 = aVar.f47280b;
        this.f47286c = new File(aVar2.f47253c, sg.bigo.ads.common.utils.f.c(aVar2.d));
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0162  */
    /* JADX WARN: Code duplicated, block: B:72:0x0168  */
    /* JADX WARN: Code duplicated, block: B:78:0x0184  */
    /* JADX WARN: Code duplicated, block: B:79:0x0186  */
    /* JADX WARN: Code duplicated, block: B:80:0x0188  */
    private void a() throws Throwable {
        long j;
        int i2;
        String str = "the download file has a invalid size.";
        a("startDownloadTask");
        if (this.f47285b == null) {
            b("downloadStream is null");
            return;
        }
        this.f47284a.f47282e = h.d;
        f.a().a(this.f47284a.f47279a);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f47285b);
        byte[] bArr = new byte[1048576];
        boolean z2 = false;
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.f47286c, "rwd");
            try {
                long j2 = this.f47284a.f47280b.g;
                randomAccessFile2.seek(j2);
                j = 0;
                try {
                    sg.bigo.ads.common.t.a.a(0, 3, IDownloadTask.TAG, this.f47284a.f47279a + " startDownloadTask.");
                    while (true) {
                        int i3 = this.f47284a.f47282e;
                        i2 = h.d;
                        if (i3 != i2) {
                            break;
                        }
                        int i4 = bufferedInputStream.read(bArr, 0, 1048576);
                        if (i4 == -1) {
                            if (j2 <= 0 || this.f47286c.length() != j2 || this.f47284a.f47282e != i2) {
                                break;
                            }
                            File file = this.f47286c;
                            sg.bigo.ads.common.h.a aVar = this.f47284a.f47280b;
                            file.renameTo(new File(aVar.f47253c, aVar.d));
                            this.f47284a.f47282e = h.f;
                            z2 = true;
                            f.a().a(this.f47284a.f47279a);
                            a("download is over.");
                            sg.bigo.ads.common.utils.g.a(randomAccessFile2);
                            sg.bigo.ads.common.utils.g.a((Closeable) bufferedInputStream);
                            sg.bigo.ads.common.utils.g.a((Closeable) this.f47285b);
                        }
                        randomAccessFile2.write(bArr, 0, i4);
                        j2 += (long) i4;
                        this.f47284a.b(j2);
                        f.a().a(this.f47284a.f47279a);
                    }
                    if (!q.a((CharSequence) "")) {
                        str = "";
                    } else if (this.f47284a.f47280b.g > 0 && this.f47286c.length() > 0) {
                        str = this.f47284a.f47282e != i2 ? "the download task error and download state is not loading." : "the download stream has not been read completely.";
                    }
                    b("Failed to download due to: ".concat(str));
                    sg.bigo.ads.common.utils.g.a(randomAccessFile2);
                    sg.bigo.ads.common.utils.g.a((Closeable) bufferedInputStream);
                    sg.bigo.ads.common.utils.g.a((Closeable) this.f47285b);
                } catch (Exception e2) {
                    e = e2;
                    randomAccessFile = randomAccessFile2;
                    try {
                        String message = e.getMessage();
                        if (!z2) {
                            if (!q.a((CharSequence) message)) {
                                str = message;
                            } else if (this.f47284a.f47280b.g > j && this.f47286c.length() > j) {
                                str = this.f47284a.f47282e != h.d ? "the download task error and download state is not loading." : "the download stream has not been read completely.";
                            }
                            b("Failed to download due to: ".concat(String.valueOf(str)));
                        }
                        sg.bigo.ads.common.utils.g.a(randomAccessFile);
                        sg.bigo.ads.common.utils.g.a((Closeable) bufferedInputStream);
                        sg.bigo.ads.common.utils.g.a((Closeable) this.f47285b);
                    } catch (Throwable th) {
                        th = th;
                        if (!z2) {
                            if (q.a((CharSequence) "")) {
                                str = "";
                            } else if (this.f47284a.f47280b.g > j && this.f47286c.length() > j) {
                                if (this.f47284a.f47282e != h.d) {
                                    str = "the download task error and download state is not loading.";
                                } else {
                                    str = "the download stream has not been read completely.";
                                }
                            }
                            b("Failed to download due to: ".concat(str));
                        }
                        sg.bigo.ads.common.utils.g.a(randomAccessFile);
                        sg.bigo.ads.common.utils.g.a((Closeable) bufferedInputStream);
                        sg.bigo.ads.common.utils.g.a((Closeable) this.f47285b);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    randomAccessFile = randomAccessFile2;
                    if (!z2) {
                        if (q.a((CharSequence) "")) {
                            str = "";
                        } else if (this.f47284a.f47280b.g > j) {
                            if (this.f47284a.f47282e != h.d) {
                                str = "the download task error and download state is not loading.";
                            } else {
                                str = "the download stream has not been read completely.";
                            }
                        }
                        b("Failed to download due to: ".concat(str));
                    }
                    sg.bigo.ads.common.utils.g.a(randomAccessFile);
                    sg.bigo.ads.common.utils.g.a((Closeable) bufferedInputStream);
                    sg.bigo.ads.common.utils.g.a((Closeable) this.f47285b);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                j = 0;
            } catch (Throwable th3) {
                th = th3;
                j = 0;
            }
        } catch (Exception e4) {
            e = e4;
            j = 0;
        } catch (Throwable th4) {
            th = th4;
            j = 0;
        }
    }

    private void b(String str) {
        StringBuilder sbX = android.support.v4.media.a.x(str, " , ");
        sbX.append(this.f47284a.f47279a);
        sbX.append(" has a error ! ");
        sbX.append(this.f47284a.toString());
        sg.bigo.ads.common.t.a.a(0, IDownloadTask.TAG, sbX.toString());
        a aVar = this.f47284a;
        aVar.f = str;
        aVar.f47282e = h.g;
        f.a().a(this.f47284a.f47279a);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String str;
        while (true) {
            sg.bigo.ads.common.u.b.a aVar = new sg.bigo.ads.common.u.b.a(sg.bigo.ads.common.y.a.a(), new sg.bigo.ads.common.u.b.d(this.f47284a.f47280b.f47252b), this.f47284a.f47280b.q, this.d);
            aVar.k = sg.bigo.ads.common.u.a.e.h();
            String strJ = android.support.v4.media.a.j(this.f47284a.f47280b.g, TokenBuilder.TOKEN_DELIMITER, new StringBuilder("bytes="));
            aVar.a(Command.HTTP_HEADER_RANGE, strJ);
            a("Range = ".concat(String.valueOf(strJ)));
            sg.bigo.ads.common.u.c<sg.bigo.ads.common.u.c.a> cVarA = sg.bigo.ads.common.u.g.a(aVar);
            T t = cVarA.f47475a;
            if (t != 0) {
                sg.bigo.ads.common.u.c.b bVarA = sg.bigo.ads.common.u.c.b.a(((sg.bigo.ads.common.u.c.a) t).a("Content-Range"));
                long jA = bVarA != null ? bVarA.f47482b : 0L;
                if (jA <= 0) {
                    jA = ((sg.bigo.ads.common.u.c.a) cVarA.f47475a).a();
                }
                this.f47284a.a(jA);
                T t2 = cVarA.f47475a;
                this.f47285b = ((sg.bigo.ads.common.u.c.a) t2).f47478b;
                this.f47284a.f47280b.f47259p = ((sg.bigo.ads.common.u.c.a) t2).a("Content-Type");
                if (!this.f47286c.exists()) {
                    break;
                }
                sg.bigo.ads.common.h.a aVar2 = this.f47284a.f47280b;
                long j = aVar2.g;
                long j2 = bVarA != null ? bVarA.f47481a : 0L;
                if (j <= 0 || j != j2) {
                    a("Delete tmp file.");
                    if (!sg.bigo.ads.common.utils.f.a(this.f47286c)) {
                        b("Failed to delete temp file.");
                        return;
                    }
                    this.f47284a.b(0L);
                    if (j2 <= 0) {
                        break;
                    }
                    sg.bigo.ads.common.utils.g.a((Closeable) this.f47285b);
                    this.f47285b = null;
                } else {
                    aVar2.o = true;
                }
                this.f47284a.f47282e = h.f47293c;
                f.a().a(this.f47284a.f47279a);
                a();
            }
            if (cVarA.f47476b != null) {
                str = "Failed to request url. Error code: " + cVarA.f47476b.f47491a + ", error msg: " + cVarA.f47476b.getMessage();
            } else {
                str = "Failed to request url.";
            }
            b(str);
            return;
        }
        if (!sg.bigo.ads.common.utils.f.c(this.f47286c)) {
            b("Failed to create temp file.");
            return;
        }
        this.f47284a.f47282e = h.f47293c;
        f.a().a(this.f47284a.f47279a);
        a();
    }

    private void a(String str) {
        StringBuilder sbX = android.support.v4.media.a.x(str, ",taskId=");
        sbX.append(this.f47284a.f47279a);
        sbX.append(", downloadinfo = ");
        sbX.append(this.f47284a.toString());
        sg.bigo.ads.common.t.a.a(0, 3, IDownloadTask.TAG, sbX.toString());
    }
}

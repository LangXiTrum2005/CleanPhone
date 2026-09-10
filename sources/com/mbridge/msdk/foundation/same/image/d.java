package com.mbridge.msdk.foundation.same.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.File;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f33783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f33784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f33785c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f33786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.same.image.c f33787b;

        /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.image.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class RunnableC0124a implements Runnable {
            public RunnableC0124a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                aVar.f33787b.onFailedLoad("create download request error", aVar.f33786a);
            }
        }

        public a(String str, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
            this.f33786a = str;
            this.f33787b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadRequest downloadRequestA = d.this.a(o0.d(this.f33786a), this.f33786a, null, this.f33787b);
            if (downloadRequestA != null) {
                downloadRequestA.start();
                return;
            }
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonImageLoaderRefactor", "createDownloadRequest error");
            }
            if (this.f33787b == null) {
                return;
            }
            d.this.f33784b.post(new RunnableC0124a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f33790a = new d(null);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c implements OnDownloadStateListener<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f33791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f33792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f33793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f33794d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f33795e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final com.mbridge.msdk.foundation.same.image.c f33796f;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.a();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f33798a;

            public b(String str) {
                this.f33798a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    c.this.f33796f.onFailedLoad(c.this.f33795e, this.f33798a);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("CommonImageLoaderRefactor", "callbackForFailed error", e10);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.image.d$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class RunnableC0125c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bitmap f33800a;

            public RunnableC0125c(Bitmap bitmap) {
                this.f33800a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    c.this.f33796f.onSuccessLoad(this.f33800a, c.this.f33795e);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("CommonImageLoaderRefactor", "callbackForSuccess error", e10);
                    }
                }
            }
        }

        public c(Handler handler, ThreadPoolExecutor threadPoolExecutor, String str, String str2, String str3, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
            this.f33792b = handler;
            this.f33791a = threadPoolExecutor;
            this.f33795e = str;
            this.f33793c = str2;
            this.f33794d = str3;
            this.f33796f = cVar;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage<Object> downloadMessage) {
            b();
            this.f33791a.execute(new a());
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage<Object> downloadMessage, DownloadError downloadError) {
            if (MBridgeConstans.DEBUG) {
                q0.a("CommonImageLoaderRefactor", "onDownloadError imageUrl = " + downloadError.getException().getLocalizedMessage());
            }
            a(downloadError.getException().getLocalizedMessage());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (this.f33796f == null) {
                return;
            }
            try {
                Bitmap bitmapB = d.b(this.f33793c + this.f33794d);
                if (bitmapB == null) {
                    a("bitmap decode failed");
                    return;
                }
                Bitmap bitmapA = a(bitmapB, null);
                if (bitmapA == null) {
                    a("bitmap transformation failed");
                } else {
                    a(bitmapA);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.a("CommonImageLoaderRefactor", "onDownloadComplete decodeBitmap error = " + e10.getLocalizedMessage());
                }
                a("bitmap decode failed");
            }
        }

        private void b() {
            File file;
            if (MBridgeConstans.DEBUG) {
                q0.a("CommonImageLoaderRefactor", "onDownloadComplete imageUrl = " + this.f33795e + " imagePath = " + this.f33793c + this.f33794d);
                try {
                    file = new File(this.f33793c + this.f33794d);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("CommonImageLoaderRefactor", "onDownloadComplete error", e10);
                    }
                    file = null;
                }
                if (file == null || !file.isFile() || !file.exists()) {
                    q0.b("CommonImageLoaderRefactor", "onDownloadComplete file not exist");
                    return;
                }
                q0.a("CommonImageLoaderRefactor", "onDownloadComplete file size = " + file.length());
            }
        }

        private void a(String str) {
            if (this.f33796f == null) {
                return;
            }
            this.f33792b.post(new b(str));
        }

        private Bitmap a(Bitmap bitmap, g gVar) {
            if (gVar != null) {
                try {
                    return gVar.a(bitmap);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("CommonImageLoaderRefactor", "handlerImageTransformation error", e10);
                    }
                }
            }
            return bitmap;
        }

        private void a(Bitmap bitmap) {
            if (this.f33796f == null) {
                return;
            }
            this.f33792b.post(new RunnableC0125c(bitmap));
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage<Object> downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage<Object> downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage<Object> downloadMessage) {
        }
    }

    public /* synthetic */ d(a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap b(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inDither = true;
        return BitmapFactory.decodeFile(str, options);
    }

    public Bitmap c(String str) {
        if (MBridgeConstans.DEBUG) {
            f2.z("getImageBitmapByUrl imageUrl = ", str, "CommonImageLoaderRefactor");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strQ = defpackage.e.q(this.f33785c, o0.d(str), new StringBuilder());
        File file = new File(strQ);
        if (file.isFile() && file.exists()) {
            try {
                return b(strQ);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonImageLoaderRefactor", "getImageBitmapByUrl error", e10);
                }
            }
        }
        return null;
    }

    public boolean d(String str) {
        File file;
        if (MBridgeConstans.DEBUG) {
            f2.z("isImageFileExists imageUrl = ", str, "CommonImageLoaderRefactor");
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            try {
                file = new File(this.f33785c + o0.d(str));
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonImageLoaderRefactor", "isImageFileExists error", e10);
                }
                file = null;
            }
            return file != null && file.isFile() && file.exists();
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonImageLoaderRefactor", "isImageFileExists error", e11);
            }
            return false;
        }
    }

    private d() {
        this.f33784b = new Handler(Looper.getMainLooper());
        this.f33785c = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_IMG) + File.separator;
        this.f33783a = f.b();
    }

    public static d a() {
        return b.f33790a;
    }

    private Runnable a(String str, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
        return new a(str, gVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DownloadRequest<?> a(String str, String str2, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
        try {
            return MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str2, str, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_IMAGE)).withReadTimeout(com.mbridge.msdk.foundation.same.a.f33734u).withConnectTimeout(com.mbridge.msdk.foundation.same.a.f33733t).withWriteTimeout(com.mbridge.msdk.foundation.same.a.f33732s).withDownloadPriority(DownloadPriority.LOW).withHttpRetryCounter(1).withDirectoryPathInternal(this.f33785c).withDownloadStateListener(new c(this.f33784b, this.f33783a, str2, this.f33785c, str, gVar, cVar)).with("download_scene", "download_image").withProgressStateListener(null).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).with("do_us_fi_re", Boolean.FALSE.toString()).build();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonImageLoaderRefactor", "createDownloadRequest error", e10);
            }
            return null;
        }
    }

    public void b(String str, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
        try {
            this.f33783a.execute(a(str, gVar, cVar));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonImageLoaderRefactor", "loadImage error", e10);
            }
        }
    }
}

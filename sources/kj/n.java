package kj;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ea.f4;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements xi.r, xi.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f44689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f4 f44690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f7.a f44691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final od.c f44692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s4.i f44693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jj.d f44694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f44695h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f44696i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Uri f44697j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v9.e f44698k;
    public final Object l;

    public n(Activity activity, f4 f4Var, f7.a aVar) {
        od.c cVar = new od.c(activity, 18);
        s4.i iVar = new s4.i(activity);
        jj.d dVar = new jj.d(9);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.l = new Object();
        this.f44689b = activity;
        this.f44690c = f4Var;
        this.f44688a = activity.getPackageName() + ".flutter.image_provider";
        this.f44692e = cVar;
        this.f44693f = iVar;
        this.f44694g = dVar;
        this.f44691d = aVar;
        this.f44695h = executorServiceNewSingleThreadExecutor;
    }

    public static void a(jk.b bVar) {
        com.bumptech.glide.c.d(bVar, new d("already_active", "Image picker is already active"));
    }

    public final void b(String str, String str2) {
        jk.b bVar;
        synchronized (this.l) {
            v9.e eVar = this.f44698k;
            bVar = eVar != null ? (jk.b) eVar.f52505d : null;
            this.f44698k = null;
        }
        if (bVar == null) {
            this.f44691d.h(str, str2, null);
        } else {
            com.bumptech.glide.c.d(bVar, new d(str, str2));
        }
    }

    public final void c(ArrayList arrayList) {
        jk.b bVar;
        synchronized (this.l) {
            v9.e eVar = this.f44698k;
            bVar = eVar != null ? (jk.b) eVar.f52505d : null;
            this.f44698k = null;
        }
        if (bVar == null) {
            this.f44691d.h(null, null, arrayList);
        } else {
            bVar.invoke(new wj.h(arrayList));
        }
    }

    public final void d(String str) {
        jk.b bVar;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        synchronized (this.l) {
            v9.e eVar = this.f44698k;
            bVar = eVar != null ? (jk.b) eVar.f52505d : null;
            this.f44698k = null;
        }
        if (bVar != null) {
            bVar.invoke(new wj.h(arrayList));
        } else {
            if (arrayList.isEmpty()) {
                return;
            }
            this.f44691d.h(null, null, arrayList);
        }
    }

    public final ArrayList e(Intent intent, boolean z10) {
        ArrayList arrayList = new ArrayList();
        Uri data = intent.getData();
        jj.d dVar = this.f44694g;
        Activity activity = this.f44689b;
        if (data != null) {
            dVar.getClass();
            String strZ = jj.d.z(activity, data);
            if (strZ != null) {
                arrayList.add(new m(strZ, null));
                return arrayList;
            }
        } else if (intent.getClipData() != null) {
            for (int i10 = 0; i10 < intent.getClipData().getItemCount(); i10++) {
                Uri uri = intent.getClipData().getItemAt(i10).getUri();
                if (uri != null) {
                    dVar.getClass();
                    String strZ2 = jj.d.z(activity, uri);
                    if (strZ2 != null) {
                        arrayList.add(new m(strZ2, z10 ? activity.getContentResolver().getType(uri) : null));
                    }
                }
            }
            return arrayList;
        }
        return null;
    }

    public final void f(Intent intent, Uri uri) {
        Activity activity = this.f44689b;
        PackageManager packageManager = activity.getPackageManager();
        Iterator<ResolveInfo> it = (Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(65536L)) : packageManager.queryIntentActivities(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE)).iterator();
        while (it.hasNext()) {
            activity.grantUriPermission(it.next().activityInfo.packageName, uri, 3);
        }
    }

    public final void g(ArrayList arrayList) throws Throwable {
        q qVar;
        synchronized (this.l) {
            v9.e eVar = this.f44698k;
            qVar = eVar != null ? (q) eVar.f52503b : null;
        }
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        if (qVar == null) {
            while (i10 < arrayList.size()) {
                arrayList2.add(((m) arrayList.get(i10)).f44686a);
                i10++;
            }
            c(arrayList2);
            return;
        }
        while (i10 < arrayList.size()) {
            m mVar = (m) arrayList.get(i10);
            String strG = mVar.f44686a;
            String str = mVar.f44687b;
            if (str == null || !str.startsWith("video/")) {
                strG = this.f44690c.g(mVar.f44686a, qVar.f44703a, qVar.f44704b, (int) qVar.f44705c);
            }
            arrayList2.add(strG);
            i10++;
        }
        c(arrayList2);
    }

    public final void h() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (this.f44696i == 2) {
            intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
            intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
        }
        String string = UUID.randomUUID().toString();
        Activity activity = this.f44689b;
        File cacheDir = activity.getCacheDir();
        try {
            cacheDir.mkdirs();
            File fileCreateTempFile = File.createTempFile(string, ".jpg", cacheDir);
            this.f44697j = Uri.parse("file:" + fileCreateTempFile.getAbsolutePath());
            Uri uriForFile = FileProvider.getUriForFile((Activity) this.f44693f.f50111a, this.f44688a, fileCreateTempFile);
            intent.putExtra("output", uriForFile);
            f(intent, uriForFile);
            try {
                try {
                    activity.startActivityForResult(intent, 2343);
                } catch (ActivityNotFoundException unused) {
                    fileCreateTempFile.delete();
                    b("no_available_camera", "No cameras available for taking pictures.");
                }
            } catch (SecurityException e10) {
                e10.printStackTrace();
                b("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final void i() {
        v vVar;
        Long l;
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        synchronized (this.l) {
            v9.e eVar = this.f44698k;
            vVar = eVar != null ? (v) eVar.f52504c : null;
        }
        if (vVar != null && (l = vVar.f44715a) != null) {
            intent.putExtra("android.intent.extra.durationLimit", l.intValue());
        }
        if (this.f44696i == 2) {
            intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
            intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
        }
        String string = UUID.randomUUID().toString();
        File cacheDir = this.f44689b.getCacheDir();
        try {
            cacheDir.mkdirs();
            File fileCreateTempFile = File.createTempFile(string, ".mp4", cacheDir);
            this.f44697j = Uri.parse("file:" + fileCreateTempFile.getAbsolutePath());
            Uri uriForFile = FileProvider.getUriForFile((Activity) this.f44693f.f50111a, this.f44688a, fileCreateTempFile);
            intent.putExtra("output", uriForFile);
            f(intent, uriForFile);
            try {
                try {
                    this.f44689b.startActivityForResult(intent, 2353);
                } catch (ActivityNotFoundException unused) {
                    fileCreateTempFile.delete();
                    b("no_available_camera", "No cameras available for taking pictures.");
                }
            } catch (SecurityException e10) {
                e10.printStackTrace();
                b("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final boolean j(q qVar, v vVar, jk.b bVar) {
        synchronized (this.l) {
            try {
                if (this.f44698k != null) {
                    return false;
                }
                this.f44698k = new v9.e(qVar, vVar, bVar, false, 20);
                this.f44691d.c();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // xi.r
    public final boolean onActivityResult(int i10, final int i11, final Intent intent) {
        Runnable runnable;
        if (i10 == 2342) {
            final int i12 = 0;
            runnable = new Runnable(this) { // from class: kj.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f44677b;

                {
                    this.f44677b = this;
                }

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    Intent intent2;
                    Intent intent3;
                    Intent intent4;
                    Intent intent5;
                    Intent intent6;
                    switch (i12) {
                        case 0:
                            n nVar = this.f44677b;
                            nVar.getClass();
                            if (i11 == -1 && (intent2 = intent) != null) {
                                ArrayList arrayListE = nVar.e(intent2, false);
                                if (arrayListE != null) {
                                    nVar.g(arrayListE);
                                } else {
                                    nVar.b("no_valid_image_uri", "Cannot find the selected image.");
                                }
                            } else {
                                nVar.d(null);
                            }
                            break;
                        case 1:
                            n nVar2 = this.f44677b;
                            nVar2.getClass();
                            if (i11 == -1 && (intent3 = intent) != null) {
                                ArrayList arrayListE2 = nVar2.e(intent3, false);
                                if (arrayListE2 != null) {
                                    nVar2.g(arrayListE2);
                                } else {
                                    nVar2.b("missing_valid_image_uri", "Cannot find at least one of the selected images.");
                                }
                            } else {
                                nVar2.d(null);
                            }
                            break;
                        case 2:
                            n nVar3 = this.f44677b;
                            nVar3.getClass();
                            if (i11 == -1 && (intent4 = intent) != null) {
                                ArrayList arrayListE3 = nVar3.e(intent4, false);
                                if (arrayListE3 != null) {
                                    nVar3.g(arrayListE3);
                                } else {
                                    nVar3.b("missing_valid_video_uri", "Cannot find at least one of the selected videos.");
                                }
                            } else {
                                nVar3.d(null);
                            }
                            break;
                        case 3:
                            n nVar4 = this.f44677b;
                            nVar4.getClass();
                            if (i11 == -1 && (intent5 = intent) != null) {
                                ArrayList arrayListE4 = nVar4.e(intent5, true);
                                if (arrayListE4 != null) {
                                    nVar4.g(arrayListE4);
                                } else {
                                    nVar4.b("no_valid_media_uri", "Cannot find the selected media.");
                                }
                            } else {
                                nVar4.d(null);
                            }
                            break;
                        default:
                            n nVar5 = this.f44677b;
                            nVar5.getClass();
                            if (i11 == -1 && (intent6 = intent) != null) {
                                ArrayList arrayListE5 = nVar5.e(intent6, false);
                                if (arrayListE5 != null && arrayListE5.size() >= 1) {
                                    nVar5.d(((m) arrayListE5.get(0)).f44686a);
                                } else {
                                    nVar5.b("no_valid_video_uri", "Cannot find the selected video.");
                                }
                            } else {
                                nVar5.d(null);
                            }
                            break;
                    }
                }
            };
        } else if (i10 == 2343) {
            final int i13 = 0;
            runnable = new Runnable(this) { // from class: kj.j

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f44681b;

                {
                    this.f44681b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            int i14 = i11;
                            n nVar = this.f44681b;
                            if (i14 != -1) {
                                nVar.d(null);
                            } else {
                                Uri uri = nVar.f44697j;
                                s4.i iVar = nVar.f44693f;
                                if (uri == null) {
                                    uri = Uri.parse(nVar.f44691d.f40681b.getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", ""));
                                }
                                final k kVar = new k(nVar, 0);
                                MediaScannerConnection.scanFile((Activity) iVar.f50111a, new String[]{uri != null ? uri.getPath() : ""}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: kj.l
                                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                                    public final void onScanCompleted(String str, Uri uri2) throws Throwable {
                                        q qVar;
                                        k kVar2 = kVar;
                                        int i15 = kVar2.f44683a;
                                        n nVar2 = kVar2.f44684b;
                                        switch (i15) {
                                            case 0:
                                                synchronized (nVar2.l) {
                                                    v9.e eVar = nVar2.f44698k;
                                                    qVar = eVar != null ? (q) eVar.f52503b : null;
                                                    break;
                                                }
                                                if (qVar == null) {
                                                    nVar2.d(str);
                                                    return;
                                                }
                                                String strG = nVar2.f44690c.g(str, qVar.f44703a, qVar.f44704b, (int) qVar.f44705c);
                                                if (strG != null && !strG.equals(str)) {
                                                    new File(str).delete();
                                                }
                                                nVar2.d(strG);
                                                return;
                                            default:
                                                nVar2.d(str);
                                                return;
                                        }
                                    }
                                });
                            }
                            break;
                        default:
                            int i15 = i11;
                            n nVar2 = this.f44681b;
                            if (i15 != -1) {
                                nVar2.d(null);
                            } else {
                                Uri uri2 = nVar2.f44697j;
                                s4.i iVar2 = nVar2.f44693f;
                                if (uri2 == null) {
                                    uri2 = Uri.parse(nVar2.f44691d.f40681b.getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", ""));
                                }
                                final k kVar2 = new k(nVar2, 1);
                                MediaScannerConnection.scanFile((Activity) iVar2.f50111a, new String[]{uri2 != null ? uri2.getPath() : ""}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: kj.l
                                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                                    public final void onScanCompleted(String str, Uri uri3) throws Throwable {
                                        q qVar;
                                        k kVar3 = kVar2;
                                        int i16 = kVar3.f44683a;
                                        n nVar3 = kVar3.f44684b;
                                        switch (i16) {
                                            case 0:
                                                synchronized (nVar3.l) {
                                                    v9.e eVar = nVar3.f44698k;
                                                    qVar = eVar != null ? (q) eVar.f52503b : null;
                                                    break;
                                                }
                                                if (qVar == null) {
                                                    nVar3.d(str);
                                                    return;
                                                }
                                                String strG = nVar3.f44690c.g(str, qVar.f44703a, qVar.f44704b, (int) qVar.f44705c);
                                                if (strG != null && !strG.equals(str)) {
                                                    new File(str).delete();
                                                }
                                                nVar3.d(strG);
                                                return;
                                            default:
                                                nVar3.d(str);
                                                return;
                                        }
                                    }
                                });
                            }
                            break;
                    }
                }
            };
        } else if (i10 == 2352) {
            final int i14 = 4;
            runnable = new Runnable(this) { // from class: kj.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f44677b;

                {
                    this.f44677b = this;
                }

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    Intent intent2;
                    Intent intent3;
                    Intent intent4;
                    Intent intent5;
                    Intent intent6;
                    switch (i14) {
                        case 0:
                            n nVar = this.f44677b;
                            nVar.getClass();
                            if (i11 == -1 && (intent2 = intent) != null) {
                                ArrayList arrayListE = nVar.e(intent2, false);
                                if (arrayListE != null) {
                                    nVar.g(arrayListE);
                                } else {
                                    nVar.b("no_valid_image_uri", "Cannot find the selected image.");
                                }
                            } else {
                                nVar.d(null);
                            }
                            break;
                        case 1:
                            n nVar2 = this.f44677b;
                            nVar2.getClass();
                            if (i11 == -1 && (intent3 = intent) != null) {
                                ArrayList arrayListE2 = nVar2.e(intent3, false);
                                if (arrayListE2 != null) {
                                    nVar2.g(arrayListE2);
                                } else {
                                    nVar2.b("missing_valid_image_uri", "Cannot find at least one of the selected images.");
                                }
                            } else {
                                nVar2.d(null);
                            }
                            break;
                        case 2:
                            n nVar3 = this.f44677b;
                            nVar3.getClass();
                            if (i11 == -1 && (intent4 = intent) != null) {
                                ArrayList arrayListE3 = nVar3.e(intent4, false);
                                if (arrayListE3 != null) {
                                    nVar3.g(arrayListE3);
                                } else {
                                    nVar3.b("missing_valid_video_uri", "Cannot find at least one of the selected videos.");
                                }
                            } else {
                                nVar3.d(null);
                            }
                            break;
                        case 3:
                            n nVar4 = this.f44677b;
                            nVar4.getClass();
                            if (i11 == -1 && (intent5 = intent) != null) {
                                ArrayList arrayListE4 = nVar4.e(intent5, true);
                                if (arrayListE4 != null) {
                                    nVar4.g(arrayListE4);
                                } else {
                                    nVar4.b("no_valid_media_uri", "Cannot find the selected media.");
                                }
                            } else {
                                nVar4.d(null);
                            }
                            break;
                        default:
                            n nVar5 = this.f44677b;
                            nVar5.getClass();
                            if (i11 == -1 && (intent6 = intent) != null) {
                                ArrayList arrayListE5 = nVar5.e(intent6, false);
                                if (arrayListE5 != null && arrayListE5.size() >= 1) {
                                    nVar5.d(((m) arrayListE5.get(0)).f44686a);
                                } else {
                                    nVar5.b("no_valid_video_uri", "Cannot find the selected video.");
                                }
                            } else {
                                nVar5.d(null);
                            }
                            break;
                    }
                }
            };
        } else if (i10 != 2353) {
            switch (i10) {
                case 2346:
                    final int i15 = 1;
                    runnable = new Runnable(this) { // from class: kj.i

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ n f44677b;

                        {
                            this.f44677b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            Intent intent2;
                            Intent intent3;
                            Intent intent4;
                            Intent intent5;
                            Intent intent6;
                            switch (i15) {
                                case 0:
                                    n nVar = this.f44677b;
                                    nVar.getClass();
                                    if (i11 == -1 && (intent2 = intent) != null) {
                                        ArrayList arrayListE = nVar.e(intent2, false);
                                        if (arrayListE != null) {
                                            nVar.g(arrayListE);
                                        } else {
                                            nVar.b("no_valid_image_uri", "Cannot find the selected image.");
                                        }
                                    } else {
                                        nVar.d(null);
                                    }
                                    break;
                                case 1:
                                    n nVar2 = this.f44677b;
                                    nVar2.getClass();
                                    if (i11 == -1 && (intent3 = intent) != null) {
                                        ArrayList arrayListE2 = nVar2.e(intent3, false);
                                        if (arrayListE2 != null) {
                                            nVar2.g(arrayListE2);
                                        } else {
                                            nVar2.b("missing_valid_image_uri", "Cannot find at least one of the selected images.");
                                        }
                                    } else {
                                        nVar2.d(null);
                                    }
                                    break;
                                case 2:
                                    n nVar3 = this.f44677b;
                                    nVar3.getClass();
                                    if (i11 == -1 && (intent4 = intent) != null) {
                                        ArrayList arrayListE3 = nVar3.e(intent4, false);
                                        if (arrayListE3 != null) {
                                            nVar3.g(arrayListE3);
                                        } else {
                                            nVar3.b("missing_valid_video_uri", "Cannot find at least one of the selected videos.");
                                        }
                                    } else {
                                        nVar3.d(null);
                                    }
                                    break;
                                case 3:
                                    n nVar4 = this.f44677b;
                                    nVar4.getClass();
                                    if (i11 == -1 && (intent5 = intent) != null) {
                                        ArrayList arrayListE4 = nVar4.e(intent5, true);
                                        if (arrayListE4 != null) {
                                            nVar4.g(arrayListE4);
                                        } else {
                                            nVar4.b("no_valid_media_uri", "Cannot find the selected media.");
                                        }
                                    } else {
                                        nVar4.d(null);
                                    }
                                    break;
                                default:
                                    n nVar5 = this.f44677b;
                                    nVar5.getClass();
                                    if (i11 == -1 && (intent6 = intent) != null) {
                                        ArrayList arrayListE5 = nVar5.e(intent6, false);
                                        if (arrayListE5 != null && arrayListE5.size() >= 1) {
                                            nVar5.d(((m) arrayListE5.get(0)).f44686a);
                                        } else {
                                            nVar5.b("no_valid_video_uri", "Cannot find the selected video.");
                                        }
                                    } else {
                                        nVar5.d(null);
                                    }
                                    break;
                            }
                        }
                    };
                    break;
                case 2347:
                    final int i16 = 3;
                    runnable = new Runnable(this) { // from class: kj.i

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ n f44677b;

                        {
                            this.f44677b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            Intent intent2;
                            Intent intent3;
                            Intent intent4;
                            Intent intent5;
                            Intent intent6;
                            switch (i16) {
                                case 0:
                                    n nVar = this.f44677b;
                                    nVar.getClass();
                                    if (i11 == -1 && (intent2 = intent) != null) {
                                        ArrayList arrayListE = nVar.e(intent2, false);
                                        if (arrayListE != null) {
                                            nVar.g(arrayListE);
                                        } else {
                                            nVar.b("no_valid_image_uri", "Cannot find the selected image.");
                                        }
                                    } else {
                                        nVar.d(null);
                                    }
                                    break;
                                case 1:
                                    n nVar2 = this.f44677b;
                                    nVar2.getClass();
                                    if (i11 == -1 && (intent3 = intent) != null) {
                                        ArrayList arrayListE2 = nVar2.e(intent3, false);
                                        if (arrayListE2 != null) {
                                            nVar2.g(arrayListE2);
                                        } else {
                                            nVar2.b("missing_valid_image_uri", "Cannot find at least one of the selected images.");
                                        }
                                    } else {
                                        nVar2.d(null);
                                    }
                                    break;
                                case 2:
                                    n nVar3 = this.f44677b;
                                    nVar3.getClass();
                                    if (i11 == -1 && (intent4 = intent) != null) {
                                        ArrayList arrayListE3 = nVar3.e(intent4, false);
                                        if (arrayListE3 != null) {
                                            nVar3.g(arrayListE3);
                                        } else {
                                            nVar3.b("missing_valid_video_uri", "Cannot find at least one of the selected videos.");
                                        }
                                    } else {
                                        nVar3.d(null);
                                    }
                                    break;
                                case 3:
                                    n nVar4 = this.f44677b;
                                    nVar4.getClass();
                                    if (i11 == -1 && (intent5 = intent) != null) {
                                        ArrayList arrayListE4 = nVar4.e(intent5, true);
                                        if (arrayListE4 != null) {
                                            nVar4.g(arrayListE4);
                                        } else {
                                            nVar4.b("no_valid_media_uri", "Cannot find the selected media.");
                                        }
                                    } else {
                                        nVar4.d(null);
                                    }
                                    break;
                                default:
                                    n nVar5 = this.f44677b;
                                    nVar5.getClass();
                                    if (i11 == -1 && (intent6 = intent) != null) {
                                        ArrayList arrayListE5 = nVar5.e(intent6, false);
                                        if (arrayListE5 != null && arrayListE5.size() >= 1) {
                                            nVar5.d(((m) arrayListE5.get(0)).f44686a);
                                        } else {
                                            nVar5.b("no_valid_video_uri", "Cannot find the selected video.");
                                        }
                                    } else {
                                        nVar5.d(null);
                                    }
                                    break;
                            }
                        }
                    };
                    break;
                case 2348:
                    final int i17 = 2;
                    runnable = new Runnable(this) { // from class: kj.i

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ n f44677b;

                        {
                            this.f44677b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            Intent intent2;
                            Intent intent3;
                            Intent intent4;
                            Intent intent5;
                            Intent intent6;
                            switch (i17) {
                                case 0:
                                    n nVar = this.f44677b;
                                    nVar.getClass();
                                    if (i11 == -1 && (intent2 = intent) != null) {
                                        ArrayList arrayListE = nVar.e(intent2, false);
                                        if (arrayListE != null) {
                                            nVar.g(arrayListE);
                                        } else {
                                            nVar.b("no_valid_image_uri", "Cannot find the selected image.");
                                        }
                                    } else {
                                        nVar.d(null);
                                    }
                                    break;
                                case 1:
                                    n nVar2 = this.f44677b;
                                    nVar2.getClass();
                                    if (i11 == -1 && (intent3 = intent) != null) {
                                        ArrayList arrayListE2 = nVar2.e(intent3, false);
                                        if (arrayListE2 != null) {
                                            nVar2.g(arrayListE2);
                                        } else {
                                            nVar2.b("missing_valid_image_uri", "Cannot find at least one of the selected images.");
                                        }
                                    } else {
                                        nVar2.d(null);
                                    }
                                    break;
                                case 2:
                                    n nVar3 = this.f44677b;
                                    nVar3.getClass();
                                    if (i11 == -1 && (intent4 = intent) != null) {
                                        ArrayList arrayListE3 = nVar3.e(intent4, false);
                                        if (arrayListE3 != null) {
                                            nVar3.g(arrayListE3);
                                        } else {
                                            nVar3.b("missing_valid_video_uri", "Cannot find at least one of the selected videos.");
                                        }
                                    } else {
                                        nVar3.d(null);
                                    }
                                    break;
                                case 3:
                                    n nVar4 = this.f44677b;
                                    nVar4.getClass();
                                    if (i11 == -1 && (intent5 = intent) != null) {
                                        ArrayList arrayListE4 = nVar4.e(intent5, true);
                                        if (arrayListE4 != null) {
                                            nVar4.g(arrayListE4);
                                        } else {
                                            nVar4.b("no_valid_media_uri", "Cannot find the selected media.");
                                        }
                                    } else {
                                        nVar4.d(null);
                                    }
                                    break;
                                default:
                                    n nVar5 = this.f44677b;
                                    nVar5.getClass();
                                    if (i11 == -1 && (intent6 = intent) != null) {
                                        ArrayList arrayListE5 = nVar5.e(intent6, false);
                                        if (arrayListE5 != null && arrayListE5.size() >= 1) {
                                            nVar5.d(((m) arrayListE5.get(0)).f44686a);
                                        } else {
                                            nVar5.b("no_valid_video_uri", "Cannot find the selected video.");
                                        }
                                    } else {
                                        nVar5.d(null);
                                    }
                                    break;
                            }
                        }
                    };
                    break;
                default:
                    return false;
            }
        } else {
            final int i18 = 1;
            runnable = new Runnable(this) { // from class: kj.j

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f44681b;

                {
                    this.f44681b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i18) {
                        case 0:
                            int i19 = i11;
                            n nVar = this.f44681b;
                            if (i19 != -1) {
                                nVar.d(null);
                            } else {
                                Uri uri = nVar.f44697j;
                                s4.i iVar = nVar.f44693f;
                                if (uri == null) {
                                    uri = Uri.parse(nVar.f44691d.f40681b.getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", ""));
                                }
                                final k kVar = new k(nVar, 0);
                                MediaScannerConnection.scanFile((Activity) iVar.f50111a, new String[]{uri != null ? uri.getPath() : ""}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: kj.l
                                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                                    public final void onScanCompleted(String str, Uri uri3) throws Throwable {
                                        q qVar;
                                        k kVar3 = kVar;
                                        int i110 = kVar3.f44683a;
                                        n nVar3 = kVar3.f44684b;
                                        switch (i110) {
                                            case 0:
                                                synchronized (nVar3.l) {
                                                    v9.e eVar = nVar3.f44698k;
                                                    qVar = eVar != null ? (q) eVar.f52503b : null;
                                                    break;
                                                }
                                                if (qVar == null) {
                                                    nVar3.d(str);
                                                    return;
                                                }
                                                String strG = nVar3.f44690c.g(str, qVar.f44703a, qVar.f44704b, (int) qVar.f44705c);
                                                if (strG != null && !strG.equals(str)) {
                                                    new File(str).delete();
                                                }
                                                nVar3.d(strG);
                                                return;
                                            default:
                                                nVar3.d(str);
                                                return;
                                        }
                                    }
                                });
                            }
                            break;
                        default:
                            int i110 = i11;
                            n nVar2 = this.f44681b;
                            if (i110 != -1) {
                                nVar2.d(null);
                            } else {
                                Uri uri2 = nVar2.f44697j;
                                s4.i iVar2 = nVar2.f44693f;
                                if (uri2 == null) {
                                    uri2 = Uri.parse(nVar2.f44691d.f40681b.getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", ""));
                                }
                                final k kVar2 = new k(nVar2, 1);
                                MediaScannerConnection.scanFile((Activity) iVar2.f50111a, new String[]{uri2 != null ? uri2.getPath() : ""}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: kj.l
                                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                                    public final void onScanCompleted(String str, Uri uri3) throws Throwable {
                                        q qVar;
                                        k kVar3 = kVar2;
                                        int i111 = kVar3.f44683a;
                                        n nVar3 = kVar3.f44684b;
                                        switch (i111) {
                                            case 0:
                                                synchronized (nVar3.l) {
                                                    v9.e eVar = nVar3.f44698k;
                                                    qVar = eVar != null ? (q) eVar.f52503b : null;
                                                    break;
                                                }
                                                if (qVar == null) {
                                                    nVar3.d(str);
                                                    return;
                                                }
                                                String strG = nVar3.f44690c.g(str, qVar.f44703a, qVar.f44704b, (int) qVar.f44705c);
                                                if (strG != null && !strG.equals(str)) {
                                                    new File(str).delete();
                                                }
                                                nVar3.d(strG);
                                                return;
                                            default:
                                                nVar3.d(str);
                                                return;
                                        }
                                    }
                                });
                            }
                            break;
                    }
                }
            };
        }
        this.f44695h.execute(runnable);
        return true;
    }

    @Override // xi.t
    public final boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        boolean z10 = iArr.length > 0 && iArr[0] == 0;
        if (i10 != 2345) {
            if (i10 != 2355) {
                return false;
            }
            if (z10) {
                i();
            }
        } else if (z10) {
            h();
        }
        if (!z10 && (i10 == 2345 || i10 == 2355)) {
            b("camera_access_denied", "The user did not allow camera access.");
        }
        return true;
    }
}

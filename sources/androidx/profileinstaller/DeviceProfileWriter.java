package androidx.profileinstaller;

import A.RunnableC0914v;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class DeviceProfileWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f7966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProfileInstaller.DiagnosticsCallback f7967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f7968c;
    public final File d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7969e;
    public boolean f = false;
    public DexProfileData[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f7970h;

    public DeviceProfileWriter(AssetManager assetManager, Executor executor, ProfileInstaller.DiagnosticsCallback diagnosticsCallback, String str, File file) {
        this.f7966a = executor;
        this.f7967b = diagnosticsCallback;
        this.f7969e = str;
        this.d = file;
        int i2 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 <= 33) {
            switch (i2) {
                case 24:
                case 25:
                    bArr = ProfileVersion.f7992e;
                    break;
                case 26:
                    bArr = ProfileVersion.d;
                    break;
                case 27:
                    bArr = ProfileVersion.f7991c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = ProfileVersion.f7990b;
                    break;
                case 31:
                case 32:
                case 33:
                    bArr = ProfileVersion.f7989a;
                    break;
            }
        }
        this.f7968c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f7967b.b();
            return null;
        }
    }

    public final void b(int i2, Serializable serializable) {
        this.f7966a.execute(new RunnableC0914v(this, i2, serializable, 2));
    }
}

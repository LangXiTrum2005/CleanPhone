package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import garter.impromptu;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: DeviceProfileWriter.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public byte[] f13178apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final AssetManager f13179attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final String f13180beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final String f13181competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public garter.saneness[] f13182cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final dern.InterfaceC0095dern f13183dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final String f13184impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final File f13185marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Executor f13186saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public boolean f13187taiyuan = false;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final byte[] f13188wireman = wireman();

    public saneness(AssetManager assetManager, Executor executor, dern.InterfaceC0095dern interfaceC0095dern, String str, String str2, String str3, File file) {
        this.f13179attabal = assetManager;
        this.f13186saneness = executor;
        this.f13183dern = interfaceC0095dern;
        this.f13180beachfront = str;
        this.f13181competently = str2;
        this.f13184impromptu = str3;
        this.f13185marial = file;
    }

    public static boolean cutely() {
        int i = Build.VERSION.SDK_INT;
        return i >= 31 || i == 24 || i == 25;
    }

    public static byte[] wireman() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return impromptu.f26555attabal;
        }
        switch (i) {
            case 24:
            case 25:
                return impromptu.f26559marial;
            case 26:
                return impromptu.f26561wireman;
            case 27:
                return impromptu.f26558dern;
            case 28:
            case 29:
            case 30:
                return impromptu.f26560saneness;
            default:
                return null;
        }
    }

    public final void apical(final int i, final Object obj) {
        this.f13186saneness.execute(new Runnable() { // from class: garter.attabal
            @Override // java.lang.Runnable
            public final void run() {
                this.f26551kowloon.f13183dern.attabal(i, obj);
            }
        });
    }

    public final InputStream beachfront(AssetManager assetManager) {
        try {
            return competently(assetManager, this.f13181competently);
        } catch (FileNotFoundException e) {
            this.f13183dern.attabal(6, e);
            return null;
        } catch (IOException e2) {
            this.f13183dern.attabal(7, e2);
            return null;
        }
    }

    public final InputStream competently(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f13183dern.saneness(5, null);
            }
            return null;
        }
    }

    public final void dern() {
        if (!this.f13187taiyuan) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    public saneness formularize() {
        garter.saneness[] sanenessVarArr = this.f13182cutely;
        byte[] bArr = this.f13188wireman;
        if (sanenessVarArr != null && bArr != null) {
            dern();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    wireman.sealless(byteArrayOutputStream, bArr);
                    if (!wireman.trm(byteArrayOutputStream, bArr, sanenessVarArr)) {
                        this.f13183dern.attabal(5, null);
                        this.f13182cutely = null;
                        byteArrayOutputStream.close();
                        return this;
                    }
                    this.f13178apical = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.f13182cutely = null;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                this.f13183dern.attabal(7, e);
            } catch (IllegalStateException e2) {
                this.f13183dern.attabal(8, e2);
            }
        }
        return this;
    }

    public boolean impassible() {
        byte[] bArr = this.f13178apical;
        if (bArr == null) {
            return false;
        }
        dern();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f13185marial);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock fileLockTryLock = channel.tryLock();
                            try {
                                garter.dern.formularize(byteArrayInputStream, fileOutputStream, fileLockTryLock);
                                apical(1, null);
                                if (fileLockTryLock != null) {
                                    fileLockTryLock.close();
                                }
                                channel.close();
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                this.f13178apical = null;
                                this.f13182cutely = null;
                                return true;
                            } catch (Throwable th) {
                                if (fileLockTryLock != null) {
                                    try {
                                        fileLockTryLock.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            if (channel != null) {
                                try {
                                    channel.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                    throw th7;
                }
            } catch (FileNotFoundException e) {
                apical(6, e);
                this.f13178apical = null;
                this.f13182cutely = null;
                return false;
            } catch (IOException e2) {
                apical(7, e2);
                this.f13178apical = null;
                this.f13182cutely = null;
                return false;
            }
        } catch (Throwable th9) {
            this.f13178apical = null;
            this.f13182cutely = null;
            throw th9;
        }
    }

    public saneness impromptu() {
        saneness sanenessVarSaneness;
        dern();
        if (this.f13188wireman != null) {
            InputStream inputStreamBeachfront = beachfront(this.f13179attabal);
            if (inputStreamBeachfront != null) {
                this.f13182cutely = taiyuan(inputStreamBeachfront);
            }
            garter.saneness[] sanenessVarArr = this.f13182cutely;
            if (sanenessVarArr != null && cutely() && (sanenessVarSaneness = saneness(sanenessVarArr, this.f13188wireman)) != null) {
                return sanenessVarSaneness;
            }
        }
        return this;
    }

    public boolean marial() {
        if (this.f13188wireman == null) {
            apical(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f13185marial.exists()) {
            try {
                if (!this.f13185marial.createNewFile()) {
                    apical(4, null);
                    return false;
                }
            } catch (IOException unused) {
                apical(4, null);
                return false;
            }
        } else if (!this.f13185marial.canWrite()) {
            apical(4, null);
            return false;
        }
        this.f13187taiyuan = true;
        return true;
    }

    public final saneness saneness(garter.saneness[] sanenessVarArr, byte[] bArr) {
        try {
            InputStream inputStreamCompetently = competently(this.f13179attabal, this.f13184impromptu);
            if (inputStreamCompetently == null) {
                if (inputStreamCompetently != null) {
                    inputStreamCompetently.close();
                }
                return null;
            }
            try {
                this.f13182cutely = wireman.polloi(inputStreamCompetently, wireman.arytenoidectomy(inputStreamCompetently, wireman.f13190saneness), bArr, sanenessVarArr);
                inputStreamCompetently.close();
                return this;
            } catch (Throwable th) {
                try {
                    inputStreamCompetently.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException e) {
            this.f13183dern.attabal(9, e);
        } catch (IOException e2) {
            this.f13183dern.attabal(7, e2);
        } catch (IllegalStateException e3) {
            this.f13182cutely = null;
            this.f13183dern.attabal(8, e3);
        }
    }

    public final garter.saneness[] taiyuan(InputStream inputStream) {
        try {
            try {
                try {
                    garter.saneness[] sanenessVarArrRotuma = wireman.rotuma(inputStream, wireman.arytenoidectomy(inputStream, wireman.f13189attabal), this.f13180beachfront);
                    try {
                        inputStream.close();
                        return sanenessVarArrRotuma;
                    } catch (IOException e) {
                        this.f13183dern.attabal(7, e);
                        return sanenessVarArrRotuma;
                    }
                } catch (IOException e2) {
                    this.f13183dern.attabal(7, e2);
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        this.f13183dern.attabal(7, e3);
                    }
                    return null;
                }
            } catch (IllegalStateException e4) {
                this.f13183dern.attabal(8, e4);
                inputStream.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                this.f13183dern.attabal(7, e5);
            }
            throw th;
        }
    }
}

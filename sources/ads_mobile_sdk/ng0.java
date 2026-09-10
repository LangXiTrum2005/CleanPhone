package ads_mobile_sdk;

import com.google.common.base.marial;
import com.google.common.util.concurrent.adultoid;
import com.google.common.util.concurrent.arytenoidectomy;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import kaif.competently;
import saneness.caparison;

/* JADX INFO: loaded from: classes.dex */
public final class ng0 extends pv2 {
    public final ExecutorService b;
    public final caparison c;
    public final marial d;

    public ng0(File file, ExecutorService executorService, caparison caparisonVar, marial marialVar) {
        super(file);
        this.b = executorService;
        this.c = caparisonVar;
        this.d = marialVar;
    }

    @Override // ads_mobile_sdk.pv2
    public final adultoid a() {
        return arytenoidectomy.apical(new Callable() { // from class: saneness.babyless
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f37069kowloon.b();
            }
        }, this.b);
    }

    public final /* synthetic */ Object b() {
        Object objA;
        synchronized (this) {
            try {
                try {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(this.a);
                        try {
                            objA = this.c.a(fileInputStream);
                            fileInputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (kg0 e) {
                        return this.d.apply(e);
                    }
                } catch (FileNotFoundException unused) {
                    return this.c.a();
                }
            } catch (IOException e2) {
                return this.d.apply(new kg0(e2));
            }
        }
        return objA;
    }

    @Override // ads_mobile_sdk.pv2
    public final adultoid a(final Object obj) {
        return arytenoidectomy.apical(new Callable() { // from class: saneness.bto
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f37082kowloon.b(obj);
            }
        }, this.b);
    }

    public final /* synthetic */ Void b(Object obj) {
        synchronized (this) {
            competently.wireman(this.a);
            File file = new File(this.a.getParent(), this.a.getName() + ".temp");
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    this.c.a(obj, fileOutputStream);
                    fileOutputStream.close();
                    if (!file.renameTo(this.a)) {
                        throw new IOException("Failed to rename file.");
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                file.delete();
                throw e;
            }
        }
        return null;
    }
}

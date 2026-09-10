package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.WorkerThread;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3080bS {
    public static final C2991aS Companion = new C2991aS(null);
    private static final String OM_SDK_JS = "omsdk.js";
    private static final String OM_SESSION_JS = "omsdk-session.js";
    private final AtomicReference<Context> contextRef;
    private final Handler uiHandler;

    public C3080bS(Context context) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        this.uiHandler = new Handler(Looper.getMainLooper());
        this.contextRef = new AtomicReference<>(context.getApplicationContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-2, reason: not valid java name */
    public static final void m233init$lambda2(C3080bS c3080bS) {
        Object objV;
        AbstractC2995aW.q(c3080bS, "this$0");
        try {
            C5049xn0 c5049xn0 = AbstractC2340Cl.e;
            if (!c5049xn0.b()) {
                c5049xn0.a(c3080bS.contextRef.get().getApplicationContext());
            }
            objV = C5033xf0.f5238a;
        } catch (Throwable th) {
            objV = AbstractC3375el.v(th);
        }
        Throwable thA = IZ.a(objV);
        if (thA != null) {
            C4917wJ.Companion.e("OMSDK", "error: " + thA.getLocalizedMessage());
        }
    }

    private final File writeToFile(String str, File file) throws IllegalAccessException, IOException, InvocationTargetException {
        if (str == null) {
            throw new IOException("omsdk js must not be null");
        }
        FileWriter fileWriter = new FileWriter(file);
        try {
            fileWriter.write(str);
            fileWriter.flush();
            AbstractC3375el.n(fileWriter, null);
            return file;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3375el.n(fileWriter, th);
                throw th2;
            }
        }
    }

    public final void init() {
        this.uiHandler.post(new RunnableC2928Zc(this, 28));
    }

    @WorkerThread
    public final List<File> injectJsFiles$vungle_ads_release(File file) {
        AbstractC2995aW.q(file, "dir");
        ArrayList arrayList = new ArrayList();
        C2998aZ c2998aZ = C2998aZ.INSTANCE;
        arrayList.add(writeToFile(c2998aZ.getOM_JS$vungle_ads_release(), new File(file, OM_SDK_JS)));
        arrayList.add(writeToFile(c2998aZ.getOM_SESSION_JS$vungle_ads_release(), new File(file, OM_SESSION_JS)));
        return arrayList;
    }
}

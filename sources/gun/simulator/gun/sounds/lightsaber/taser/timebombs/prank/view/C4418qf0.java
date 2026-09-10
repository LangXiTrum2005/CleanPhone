package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4418qf0 {
    private static final String FILENAME = "unclosed_ad";
    private final Context context;
    private final InterfaceC4615ss executors;
    private File file;
    private final ZT pathProvider;
    private final String sessionId;
    private final CopyOnWriteArrayList<C4154nf0> unclosedAdList;
    public static final C4330pf0 Companion = new C4330pf0(null);
    private static final VE json = WD.b(C4242of0.INSTANCE);

    public C4418qf0(Context context, String str, InterfaceC4615ss interfaceC4615ss, ZT zt) throws IOException {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(str, JsonStorageKeyNames.SESSION_ID_KEY);
        AbstractC2995aW.q(interfaceC4615ss, "executors");
        AbstractC2995aW.q(zt, "pathProvider");
        this.context = context;
        this.sessionId = str;
        this.executors = interfaceC4615ss;
        this.pathProvider = zt;
        this.file = zt.getUnclosedAdFile(FILENAME);
        this.unclosedAdList = new CopyOnWriteArrayList<>();
        File file = this.file;
        if (file == null || file.exists()) {
            return;
        }
        this.file.createNewFile();
    }

    private final <T> T decodeJson(String str) {
        M40 m40 = json.b;
        AbstractC2995aW.w0();
        throw null;
    }

    private final List<C4154nf0> readUnclosedAdFromFile() {
        return (List) new FutureC4796ux(((C4893w20) this.executors).getIoExecutor().submit(new CallableC4668tY(this, 3))).get(1000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readUnclosedAdFromFile$lambda-2, reason: not valid java name */
    public static final List m268readUnclosedAdFromFile$lambda2(C4418qf0 c4418qf0) {
        List arrayList;
        AbstractC2995aW.q(c4418qf0, "this$0");
        try {
            String string = C3300du.INSTANCE.readString(c4418qf0.file);
            if (string == null || string.length() == 0) {
                arrayList = new ArrayList();
            } else {
                VE ve = json;
                M40 m40 = ve.b;
                int i = C4387qG.c;
                C4387qG c4387qGE = C2443Gk.e(AbstractC3263dY.d(C4154nf0.class));
                C3186cf c3186cfA = AbstractC3263dY.a(List.class);
                List listSingletonList = Collections.singletonList(c4387qGE);
                AbstractC3263dY.f4274a.getClass();
                arrayList = (List) ve.a(AbstractC3375el.V(m40, C3351eY.b(c3186cfA, listSingletonList)), string);
            }
            return arrayList;
        } catch (Exception e) {
            C4917wJ.Companion.e("UnclosedAdDetector", "Fail to read unclosed ad file " + e.getMessage());
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: retrieveUnclosedAd$lambda-1, reason: not valid java name */
    public static final void m269retrieveUnclosedAd$lambda1(C4418qf0 c4418qf0) {
        AbstractC2995aW.q(c4418qf0, "this$0");
        try {
            C3300du.deleteAndLogIfFailed(c4418qf0.file);
        } catch (Exception e) {
            C4917wJ.Companion.e("UnclosedAdDetector", "Fail to delete file " + e.getMessage());
        }
    }

    private final void writeUnclosedAdToFile(List<C4154nf0> list) {
        try {
            VE ve = json;
            M40 m40 = ve.b;
            int i = C4387qG.c;
            C4387qG c4387qGE = C2443Gk.e(AbstractC3263dY.d(C4154nf0.class));
            C3186cf c3186cfA = AbstractC3263dY.a(List.class);
            List listSingletonList = Collections.singletonList(c4387qGE);
            AbstractC3263dY.f4274a.getClass();
            ((C4893w20) this.executors).getIoExecutor().execute(new Ff0(17, this, ve.b(AbstractC3375el.V(m40, C3351eY.b(c3186cfA, listSingletonList)), list)));
        } catch (Throwable th) {
            C4917wJ.Companion.e("UnclosedAdDetector", "Fail to write unclosed ad file " + th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: writeUnclosedAdToFile$lambda-3, reason: not valid java name */
    public static final void m270writeUnclosedAdToFile$lambda3(C4418qf0 c4418qf0, String str) {
        AbstractC2995aW.q(c4418qf0, "this$0");
        AbstractC2995aW.q(str, "$jsonContent");
        C3300du.INSTANCE.writeString(c4418qf0.file, str);
    }

    public final void addUnclosedAd(C4154nf0 c4154nf0) {
        AbstractC2995aW.q(c4154nf0, com.umeng.analytics.pro.bc.aC);
        c4154nf0.setSessionId(this.sessionId);
        this.unclosedAdList.add(c4154nf0);
        writeUnclosedAdToFile(this.unclosedAdList);
    }

    public final Context getContext() {
        return this.context;
    }

    public final InterfaceC4615ss getExecutors() {
        return this.executors;
    }

    public final ZT getPathProvider() {
        return this.pathProvider;
    }

    public final void removeUnclosedAd(C4154nf0 c4154nf0) {
        AbstractC2995aW.q(c4154nf0, com.umeng.analytics.pro.bc.aC);
        if (this.unclosedAdList.contains(c4154nf0)) {
            this.unclosedAdList.remove(c4154nf0);
            writeUnclosedAdToFile(this.unclosedAdList);
        }
    }

    public final List<C4154nf0> retrieveUnclosedAd() {
        ArrayList arrayList = new ArrayList();
        List<C4154nf0> unclosedAdFromFile = readUnclosedAdFromFile();
        if (unclosedAdFromFile != null) {
            arrayList.addAll(unclosedAdFromFile);
        }
        ((C4893w20) this.executors).getIoExecutor().execute(new RunnableC2928Zc(this, 29));
        return arrayList;
    }
}

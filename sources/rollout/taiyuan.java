package rollout;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: compiled from: QueueFileLogStore.java */
/* JADX INFO: loaded from: classes3.dex */
public class taiyuan implements wireman {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Charset f36790wireman = Charset.forName(C.UTF8_NAME);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final File f36791attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public impromptu f36792dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f36793saneness;

    /* JADX INFO: compiled from: QueueFileLogStore.java */
    public class attabal implements impromptu.wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ byte[] f36794attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ int[] f36796saneness;

        public attabal(byte[] bArr, int[] iArr) {
            this.f36794attabal = bArr;
            this.f36796saneness = iArr;
        }

        @Override // rollout.impromptu.wireman
        public void attabal(InputStream inputStream, int i) throws IOException {
            try {
                inputStream.read(this.f36794attabal, this.f36796saneness[0], i);
                int[] iArr = this.f36796saneness;
                iArr[0] = iArr[0] + i;
            } finally {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: compiled from: QueueFileLogStore.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final byte[] f36797attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f36798saneness;

        public saneness(byte[] bArr, int i) {
            this.f36797attabal = bArr;
            this.f36798saneness = i;
        }
    }

    public taiyuan(File file, int i) {
        this.f36791attabal = file;
        this.f36793saneness = i;
    }

    @Override // rollout.wireman
    public void attabal() {
        CommonUtils.beachfront(this.f36792dern, "There was a problem closing the Crashlytics log file.");
        this.f36792dern = null;
    }

    public final void beachfront(long j, String str) {
        if (this.f36792dern == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i = this.f36793saneness / 4;
            if (str.length() > i) {
                str = "..." + str.substring(str.length() - i);
            }
            this.f36792dern.cutely(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f36790wireman));
            while (!this.f36792dern.cuirassed() && this.f36792dern.timberyard() > this.f36793saneness) {
                this.f36792dern.privatdozent();
            }
        } catch (IOException e) {
            gelandelaufer.competently.beachfront().marial("There was a problem writing to the Crashlytics log.", e);
        }
    }

    public final saneness competently() {
        if (!this.f36791attabal.exists()) {
            return null;
        }
        impromptu();
        impromptu impromptuVar = this.f36792dern;
        if (impromptuVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[impromptuVar.timberyard()];
        try {
            this.f36792dern.dovishness(new attabal(bArr, iArr));
        } catch (IOException e) {
            gelandelaufer.competently.beachfront().marial("A problem occurred while reading the Crashlytics log file.", e);
        }
        return new saneness(bArr, iArr[0]);
    }

    @Override // rollout.wireman
    public byte[] dern() {
        saneness sanenessVarCompetently = competently();
        if (sanenessVarCompetently == null) {
            return null;
        }
        int i = sanenessVarCompetently.f36798saneness;
        byte[] bArr = new byte[i];
        System.arraycopy(sanenessVarCompetently.f36797attabal, 0, bArr, 0, i);
        return bArr;
    }

    public final void impromptu() {
        if (this.f36792dern == null) {
            try {
                this.f36792dern = new impromptu(this.f36791attabal);
            } catch (IOException e) {
                gelandelaufer.competently.beachfront().marial("Could not open log file: " + this.f36791attabal, e);
            }
        }
    }

    @Override // rollout.wireman
    public void marial(long j, String str) {
        impromptu();
        beachfront(j, str);
    }

    @Override // rollout.wireman
    public String saneness() {
        byte[] bArrDern = dern();
        if (bArrDern != null) {
            return new String(bArrDern, f36790wireman);
        }
        return null;
    }

    @Override // rollout.wireman
    public void wireman() {
        attabal();
        this.f36791attabal.delete();
    }
}

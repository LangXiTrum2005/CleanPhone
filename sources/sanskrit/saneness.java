package sanskrit;

import android.content.Context;
import com.bykv.vk.openvk.ri.ri.ri.ik.ik;
import com.bytedance.sdk.component.lr.ri.bgr;
import com.bytedance.sdk.component.lr.ri.co;
import com.bytedance.sdk.component.lr.ri.lr;
import com.bytedance.sdk.component.lr.ri.sf;
import com.bytedance.sdk.component.lr.ri.vr;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public Context f37370attabal;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public File f37374marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public ik f37375saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public File f37376wireman;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public volatile boolean f37373dern = false;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final List<laky.saneness.attabal> f37371beachfront = new ArrayList();

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public volatile boolean f37372competently = false;

    public saneness(Context context, ik ikVar) {
        this.f37376wireman = null;
        this.f37374marial = null;
        this.f37370attabal = context;
        this.f37375saneness = ikVar;
        this.f37376wireman = benzoyl.attabal.saneness(ikVar.fi(), ikVar.bu());
        this.f37374marial = benzoyl.attabal.attabal(ikVar.fi(), ikVar.bu());
    }

    public ik apical() {
        return this.f37375saneness;
    }

    public void arytenoidectomy(laky.saneness.attabal attabalVar) {
        if (this.f37372competently) {
            synchronized (laky.saneness.attabal.class) {
                this.f37371beachfront.add(attabalVar);
            }
            return;
        }
        this.f37371beachfront.add(attabalVar);
        if (cutely()) {
            this.f37375saneness.mj(1);
            impassible(this.f37375saneness, 200);
            sanskrit.attabal.saneness(this.f37375saneness);
        } else {
            this.f37372competently = true;
            this.f37375saneness.mj(0);
            dern();
        }
    }

    public final void attabal() {
        try {
            if (this.f37376wireman.renameTo(this.f37374marial)) {
                return;
            }
            throw new IOException("Error renaming file " + this.f37376wireman + " to " + this.f37374marial + " for completion!");
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public final boolean cutely() {
        if (this.f37374marial.exists()) {
            return true;
        }
        if (!this.f37375saneness.aw()) {
            if (this.f37376wireman.length() >= this.f37375saneness.di()) {
                return true;
            }
            if (this.f37375saneness.ka() > 0 && this.f37376wireman.length() >= this.f37375saneness.ka()) {
                return true;
            }
        }
        return false;
    }

    public final void dern() {
        sf.ri riVarLr = logician.attabal.saneness() != null ? logician.attabal.saneness().lr() : new sf.ri("v_preload");
        long jTan = this.f37375saneness.tan();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        riVarLr.ri(jTan, timeUnit).lr(this.f37375saneness.ac(), timeUnit).ik(this.f37375saneness.ihz(), timeUnit);
        sf sfVarRi = riVarLr.ri();
        co.ri riVar = new co.ri();
        long length = this.f37376wireman.length();
        int iDi = this.f37375saneness.di();
        boolean zAw = this.f37375saneness.aw();
        int iKa = this.f37375saneness.ka();
        if (iKa > 0) {
            if (iKa >= this.f37375saneness.co()) {
                zAw = true;
            } else {
                iDi = iKa;
            }
        }
        riVar.ri("videoPreload").ri(6);
        if (zAw) {
            riVar.ri("RANGE", "bytes=" + length + "-").lr(this.f37375saneness.slm()).ri().lr();
        } else {
            riVar.ri("RANGE", "bytes=" + length + "-" + iDi).lr(this.f37375saneness.slm()).ri().lr();
        }
        sfVarRi.ri(riVar.lr()).ri(new attabal(length));
    }

    public void graveside(boolean z) {
        this.f37373dern = z;
    }

    public final void impassible(ik ikVar, int i) {
        synchronized (laky.saneness.attabal.class) {
            try {
                for (laky.saneness.attabal attabalVar : this.f37371beachfront) {
                    if (attabalVar != null) {
                        attabalVar.ri(ikVar, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void impromptu(ik ikVar, int i) {
        synchronized (laky.saneness.attabal.class) {
            try {
                for (laky.saneness.attabal attabalVar : this.f37371beachfront) {
                    if (attabalVar != null) {
                        attabalVar.lr(ikVar, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void kowloon(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public final void marial() {
        try {
            this.f37374marial.delete();
            this.f37376wireman.delete();
        } catch (Throwable unused) {
        }
    }

    public final void triweekly(ik ikVar, int i, String str) {
        synchronized (laky.saneness.attabal.class) {
            try {
                for (laky.saneness.attabal attabalVar : this.f37371beachfront) {
                    if (attabalVar != null) {
                        attabalVar.ri(ikVar, i, str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public class attabal implements com.bytedance.sdk.component.lr.ri.ik {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ long f37377attabal;

        public attabal(long j) {
            this.f37377attabal = j;
        }

        @Override // com.bytedance.sdk.component.lr.ri.ik
        public void ri(lr lrVar, IOException iOException) {
            saneness sanenessVar = saneness.this;
            sanenessVar.triweekly(sanenessVar.f37375saneness, 601, iOException.getMessage());
            sanskrit.attabal.saneness(saneness.this.f37375saneness);
        }

        @Override // com.bytedance.sdk.component.lr.ri.ik
        public void ri(lr lrVar, bgr bgrVar) throws IOException {
            InputStream inputStreamIk;
            RandomAccessFile randomAccessFile;
            vr vrVarDi;
            long jRi;
            long j = this.f37377attabal;
            vr vrVar = null;
            vrVar = null;
            randomAccessFile = null;
            randomAccessFile = null;
            RandomAccessFile randomAccessFile2 = null;
            try {
                if (bgrVar != null) {
                    boolean zKa = bgrVar.ka();
                    if (!zKa) {
                        saneness sanenessVar = saneness.this;
                        sanenessVar.triweekly(sanenessVar.f37375saneness, bgrVar.ik(), bgrVar.fi());
                        saneness.this.kowloon(null);
                        saneness.this.kowloon(null);
                        saneness.this.kowloon(vrVar);
                    }
                    vrVarDi = bgrVar.di();
                    try {
                        vrVarDi = bgrVar.di();
                        if (!zKa || vrVarDi == null) {
                            inputStreamIk = null;
                            jRi = 0;
                        } else {
                            jRi = this.f37377attabal + vrVarDi.ri();
                            inputStreamIk = vrVarDi.ik();
                        }
                        try {
                            if (inputStreamIk == null) {
                                saneness sanenessVar2 = saneness.this;
                                sanenessVar2.triweekly(sanenessVar2.f37375saneness, bgrVar.ik(), bgrVar.fi());
                            } else {
                                randomAccessFile = new RandomAccessFile(saneness.this.f37376wireman, "rw");
                                try {
                                    int iApical = phytopathogen.attabal.apical();
                                    byte[] bArr = new byte[iApical];
                                    int i = 0;
                                    long j2 = 0;
                                    while (true) {
                                        int i2 = inputStreamIk.read(bArr, i, iApical - i);
                                        if (i2 != -1) {
                                            if (saneness.this.f37373dern) {
                                                saneness sanenessVar3 = saneness.this;
                                                sanenessVar3.impromptu(sanenessVar3.f37375saneness, bgrVar.ik());
                                                saneness.this.kowloon(randomAccessFile);
                                            } else {
                                                i += i2;
                                                j2 += (long) i2;
                                                if (j2 % ((long) iApical) == 0 || j2 == jRi - this.f37377attabal) {
                                                    benzoyl.attabal.wireman(randomAccessFile, bArr, Long.valueOf(j).intValue(), i, saneness.this.f37375saneness.bu());
                                                    j += (long) i;
                                                    i = 0;
                                                }
                                            }
                                        } else {
                                            if (saneness.this.f37375saneness.aw() && jRi == saneness.this.f37376wireman.length()) {
                                                saneness.this.attabal();
                                            }
                                            saneness sanenessVar4 = saneness.this;
                                            sanenessVar4.impassible(sanenessVar4.f37375saneness, bgrVar.ik());
                                            randomAccessFile2 = randomAccessFile;
                                        }
                                        saneness.this.kowloon(inputStreamIk);
                                        saneness.this.kowloon(vrVarDi);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    vrVar = vrVarDi;
                                    try {
                                        saneness.this.marial();
                                        saneness sanenessVar5 = saneness.this;
                                        sanenessVar5.triweekly(sanenessVar5.f37375saneness, bgrVar != null ? bgrVar.ik() : 601, th.getMessage());
                                        saneness.this.kowloon(randomAccessFile);
                                        saneness.this.kowloon(inputStreamIk);
                                        saneness.this.kowloon(vrVar);
                                    } finally {
                                        saneness.this.kowloon(randomAccessFile);
                                        saneness.this.kowloon(inputStreamIk);
                                        saneness.this.kowloon(vrVar);
                                        saneness.this.kowloon(bgrVar);
                                        saneness.this.f37375saneness.slm();
                                        saneness.this.f37375saneness.di();
                                        sanskrit.attabal.saneness(saneness.this.f37375saneness);
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            randomAccessFile = randomAccessFile2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamIk = null;
                        randomAccessFile = null;
                    }
                } else {
                    saneness sanenessVar6 = saneness.this;
                    sanenessVar6.triweekly(sanenessVar6.f37375saneness, 601, "Network link failed.");
                    vrVarDi = null;
                    inputStreamIk = null;
                }
                saneness.this.kowloon(randomAccessFile2);
                saneness.this.kowloon(inputStreamIk);
                saneness.this.kowloon(vrVarDi);
            } catch (Throwable th4) {
                th = th4;
                inputStreamIk = null;
                randomAccessFile = null;
            }
        }
    }
}

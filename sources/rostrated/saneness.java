package rostrated;

import com.bykv.vk.openvk.ri.ri.ri.ik.ik;
import com.bytedance.sdk.component.lr.ri.bgr;
import com.bytedance.sdk.component.lr.ri.co;
import com.bytedance.sdk.component.lr.ri.lr;
import com.bytedance.sdk.component.lr.ri.sf;
import com.bytedance.sdk.component.lr.ri.vr;
import com.bytedance.sdk.component.utils.ac;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class saneness implements rostrated.attabal {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public RandomAccessFile f36809apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public boolean f36810attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public long f36811beachfront;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final ik f36815formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public volatile long f36816impassible;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public File f36818marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public File f36821wireman;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public volatile long f36819saneness = -2147483648L;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Object f36814dern = new Object();

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public volatile long f36812competently = -1;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public volatile int f36817impromptu = -100;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public volatile boolean f36820taiyuan = false;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public volatile boolean f36813cutely = false;

    public class attabal implements com.bytedance.sdk.component.lr.ri.ik {
        public attabal() {
        }

        @Override // com.bytedance.sdk.component.lr.ri.ik
        public void ri(lr lrVar, IOException iOException) {
            saneness.this.kowloon(30000, iOException.getMessage());
        }

        /* JADX WARN: Code duplicated, block: B:85:0x01cc A[Catch: all -> 0x01f3, TryCatch #0 {all -> 0x01f3, blocks: (B:83:0x01c7, B:85:0x01cc, B:86:0x01cf, B:88:0x01da, B:90:0x01ee), top: B:96:0x01c7 }] */
        @Override // com.bytedance.sdk.component.lr.ri.ik
        public void ri(lr lrVar, bgr bgrVar) throws IOException {
            vr vrVarDi;
            if (bgrVar == null) {
                saneness.this.kowloon(Sdk$SDKError.Reason.AD_INTERNAL_INTEGRATION_ERROR_VALUE, "response is empty");
                return;
            }
            InputStream inputStreamIk = null;
            try {
                try {
                    saneness.this.f36813cutely = bgrVar.ka();
                    if (saneness.this.f36813cutely) {
                        vrVarDi = bgrVar.di();
                        try {
                            if (saneness.this.f36813cutely && vrVarDi != null) {
                                saneness.this.f36819saneness = vrVarDi.ri() + saneness.this.f36811beachfront;
                                inputStreamIk = vrVarDi.ik();
                            }
                            if (inputStreamIk == null) {
                                saneness.this.kowloon(Sdk$SDKError.Reason.CONFIG_NOT_FOUND_ERROR_VALUE, "input_stream is empty");
                                if (inputStreamIk != null) {
                                    inputStreamIk.close();
                                }
                                if (vrVarDi != null) {
                                    vrVarDi.close();
                                }
                                bgrVar.close();
                                if (!saneness.this.f36813cutely || saneness.this.f36821wireman.length() != saneness.this.f36819saneness) {
                                    return;
                                }
                            } else {
                                int iApical = phytopathogen.attabal.apical();
                                byte[] bArr = new byte[iApical];
                                long j = saneness.this.f36811beachfront;
                                long unused = saneness.this.f36819saneness;
                                long unused2 = saneness.this.f36811beachfront;
                                saneness.this.f36815formularize.slm();
                                long j2 = 0;
                                long j3 = 0;
                                int i = 0;
                                while (true) {
                                    int i2 = inputStreamIk.read(bArr, i, iApical - i);
                                    if (i2 == -1) {
                                        break;
                                    }
                                    i += i2;
                                    j3 += (long) i2;
                                    boolean z = j3 % ((long) iApical) == j2 || j3 == saneness.this.f36819saneness - saneness.this.f36811beachfront;
                                    long unused3 = saneness.this.f36819saneness;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(j3);
                                    sb.append(", waitingAtPost=");
                                    long unused4 = saneness.this.f36816impassible;
                                    if (z) {
                                        synchronized (saneness.this.f36814dern) {
                                            try {
                                                benzoyl.attabal.wireman(saneness.this.f36809apical, bArr, Long.valueOf(j).intValue(), i, saneness.this.f36815formularize.bu());
                                                if (saneness.this.f36810attabal && saneness.this.f36816impassible > -1 && saneness.this.f36811beachfront + j3 >= saneness.this.f36816impassible) {
                                                    saneness.this.f36814dern.notify();
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        j += (long) i;
                                        i = 0;
                                    }
                                    j2 = 0;
                                }
                                long unused5 = saneness.this.f36811beachfront;
                                long unused6 = saneness.this.f36819saneness;
                                long unused7 = saneness.this.f36819saneness;
                                long unused8 = saneness.this.f36811beachfront;
                            }
                            saneness.this.dern();
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                saneness.this.kowloon(Sdk$SDKError.Reason.AD_PUBLISHER_MISMATCH_VALUE, th.getMessage());
                                if (inputStreamIk != null) {
                                    inputStreamIk.close();
                                }
                                if (vrVarDi != null) {
                                    vrVarDi.close();
                                }
                                bgrVar.close();
                                if (saneness.this.f36813cutely && saneness.this.f36821wireman.length() == saneness.this.f36819saneness) {
                                    saneness.this.dern();
                                    return;
                                }
                                return;
                            } catch (Throwable th3) {
                                if (inputStreamIk != null) {
                                    try {
                                        inputStreamIk.close();
                                        if (vrVarDi != null) {
                                            vrVarDi.close();
                                        }
                                        bgrVar.close();
                                        if (saneness.this.f36813cutely && saneness.this.f36821wireman.length() == saneness.this.f36819saneness) {
                                            saneness.this.dern();
                                        }
                                    } catch (Throwable unused9) {
                                        throw th3;
                                    }
                                } else {
                                    if (vrVarDi != null) {
                                        vrVarDi.close();
                                    }
                                    bgrVar.close();
                                    if (saneness.this.f36813cutely) {
                                        saneness.this.dern();
                                    }
                                }
                                throw th3;
                            }
                        }
                    }
                    saneness.this.kowloon(bgrVar.ik(), bgrVar.fi());
                    vrVarDi = null;
                    if (inputStreamIk != null) {
                        inputStreamIk.close();
                    }
                    if (vrVarDi != null) {
                        vrVarDi.close();
                    }
                    bgrVar.close();
                    if (!saneness.this.f36813cutely || saneness.this.f36821wireman.length() != saneness.this.f36819saneness) {
                        return;
                    }
                    saneness.this.dern();
                } catch (Throwable th4) {
                    th = th4;
                    vrVarDi = null;
                }
            } catch (Throwable unused10) {
            }
        }
    }

    public saneness(ik ikVar) {
        this.f36811beachfront = 0L;
        this.f36809apical = null;
        this.f36815formularize = ikVar;
        try {
            String strFi = ikVar.fi();
            String strBu = ikVar.bu();
            this.f36821wireman = benzoyl.attabal.saneness(strFi, strBu);
            this.f36818marial = benzoyl.attabal.attabal(strFi, strBu);
            if (taiyuan()) {
                this.f36809apical = new RandomAccessFile(this.f36818marial, "r");
            } else {
                this.f36809apical = new RandomAccessFile(this.f36821wireman, "rw");
            }
            if (!taiyuan()) {
                this.f36811beachfront = this.f36821wireman.length();
                triweekly();
            }
            this.f36810attabal = phytopathogen.attabal.attabal() == 2;
        } catch (Throwable unused) {
            ikVar.slm();
        }
    }

    @Override // rostrated.attabal
    public int attabal(long j, byte[] bArr, int i, int i2) throws IOException {
        try {
            if (j == this.f36819saneness) {
                return -1;
            }
            int i3 = 0;
            int i4 = 0;
            while (!this.f36820taiyuan) {
                synchronized (this.f36814dern) {
                    try {
                        if (j < wireman()) {
                            this.f36809apical.seek(j);
                            i4 = this.f36809apical.read(bArr, i, i2);
                        } else {
                            i3 += 33;
                            this.f36816impassible = j;
                            this.f36814dern.wait(33L);
                            this.f36816impassible = -1L;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i4 > 0) {
                    return i4;
                }
                ik ikVar = this.f36815formularize;
                if (ikVar != null && ikVar.ri() && this.f36817impromptu != -100 && (!this.f36813cutely || this.f36819saneness == this.f36812competently)) {
                    throw new IOException();
                }
                if (i3 >= 20000) {
                    throw new SocketTimeoutException();
                }
            }
            return -1;
        } catch (Throwable th2) {
            if (th2 instanceof IOException) {
                throw th2;
            }
            throw new IOException();
        }
    }

    public final void dern() throws IOException {
        synchronized (this.f36814dern) {
            if (taiyuan()) {
                this.f36815formularize.slm();
                this.f36815formularize.bu();
                return;
            }
            try {
                if (!this.f36821wireman.renameTo(this.f36818marial)) {
                    throw new IOException("Error renaming file " + this.f36821wireman + " to " + this.f36818marial + " for completion!");
                }
                RandomAccessFile randomAccessFile = this.f36809apical;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f36809apical = new RandomAccessFile(this.f36818marial, "rw");
                this.f36815formularize.bu();
                this.f36815formularize.slm();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    @Override // rostrated.attabal
    public long ik() throws IOException {
        if (taiyuan()) {
            this.f36819saneness = this.f36818marial.length();
        } else {
            synchronized (this.f36814dern) {
                int i = 0;
                while (this.f36819saneness == -2147483648L && !this.f36820taiyuan) {
                    try {
                        i += 15;
                        try {
                            this.f36814dern.wait(5L);
                            if (i > 20000) {
                                return -1L;
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("total length InterruptException");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return this.f36819saneness;
    }

    public final void kowloon(int i, String str) {
        JSONObject jSONObjectIk;
        this.f36813cutely = false;
        this.f36817impromptu = i;
        this.f36819saneness = this.f36812competently;
        ac.lr("CSJ_MediaDLPlay", "handleFailResponse: ", Integer.valueOf(i), " ", str);
        ik ikVar = this.f36815formularize;
        if (ikVar == null || !ikVar.ri() || (jSONObjectIk = this.f36815formularize.ik()) == null) {
            return;
        }
        try {
            jSONObjectIk.put("error_real_code", i);
            jSONObjectIk.put("error_real_msg", str);
        } catch (Throwable th) {
            ac.ri("CSJ_MediaDLPlay", "handleFailResponse: ", th);
        }
    }

    @Override // rostrated.attabal
    public void lr() {
        try {
            if (!this.f36820taiyuan) {
                this.f36809apical.close();
            }
            File file = this.f36821wireman;
            if (file != null) {
                file.setLastModified(System.currentTimeMillis());
            }
            File file2 = this.f36818marial;
            if (file2 != null) {
                file2.setLastModified(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
        this.f36820taiyuan = true;
    }

    public final boolean taiyuan() {
        return this.f36818marial.exists();
    }

    public void triweekly() {
        sf.ri riVarLr = logician.attabal.saneness() != null ? logician.attabal.saneness().lr() : new sf.ri("v_cache");
        long jTan = this.f36815formularize.tan();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        riVarLr.ri(jTan, timeUnit).lr(this.f36815formularize.ac(), timeUnit).ik(this.f36815formularize.ihz(), timeUnit);
        sf sfVarRi = riVarLr.ri();
        this.f36815formularize.bu();
        sfVarRi.ri(new co.ri().ri("RANGE", "bytes=" + this.f36811beachfront + "-").lr(this.f36815formularize.slm()).ri().ri("videoLoadWhenPlaying").ri(9).lr()).ri(new attabal());
    }

    public final long wireman() {
        return taiyuan() ? this.f36818marial.length() : this.f36821wireman.length();
    }
}

package com.bytedance.sdk.component.ebl.LD;

import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.bytedance.sdk.component.LD.Lxb.IeN;
import com.bytedance.sdk.component.LD.Lxb.JVA;
import com.bytedance.sdk.component.LD.Lxb.NXR;
import com.bytedance.sdk.component.LD.Lxb.lc;
import com.efs.sdk.base.Constants;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb extends lk {
    public File LD;
    public File Lxb;
    private volatile boolean nBu;

    public Lxb(JVA jva) {
        super(jva);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean JXs(Map<String, String> map) {
        if (TextUtils.equals(map.get(HttpResponseHeader.AcceptRanges), "bytes") || TextUtils.equals(map.get("accept-ranges"), "bytes")) {
            return true;
        }
        String str = map.get(HttpResponseHeader.ContentRange);
        if (TextUtils.isEmpty(str)) {
            str = map.get("content-range");
        }
        return str != null && str.startsWith("bytes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZU() {
        try {
            this.Lxb.delete();
        } catch (Throwable unused) {
        }
        try {
            this.LD.delete();
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean ebl(Map<String, String> map) {
        return TextUtils.equals(map.get(HttpResponseHeader.ContentEncoding), Constants.CP_GZIP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long lc(Map<String, String> map) {
        String str;
        if (map.containsKey("content-length")) {
            str = map.get("content-length");
        } else {
            str = map.containsKey("Content-Length") ? map.get("Content-Length") : null;
        }
        if (TextUtils.isEmpty(str) || str == null) {
            return 0L;
        }
        try {
            return Long.valueOf(str).longValue();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bytedance.sdk.component.ebl.LD.lk
    public void LD() {
        this.nBu = true;
        super.LD();
    }

    public void Lxb(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.Lxb = new File(str, str2);
        this.LD = new File(str, DM.h(str2, ".temp"));
    }

    public void Lxb(final com.bytedance.sdk.component.ebl.Lxb.Lxb lxb) {
        File file = this.Lxb;
        if (file == null || this.LD == null) {
            if (lxb != null) {
                lxb.Lxb(this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
                return;
            }
            return;
        }
        if (file.exists() && this.Lxb.length() != 0 && lxb != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.ebl.LD ld = new com.bytedance.sdk.component.ebl.LD(true, 200, "Success", null, null, jCurrentTimeMillis, jCurrentTimeMillis);
            ld.Lxb(this.Lxb);
            lxb.Lxb(this, ld);
            return;
        }
        long length = this.LD.length();
        final long j = length >= 0 ? length : 0L;
        NXR.Lxb lxb2 = new NXR.Lxb();
        lxb2.Lxb((Object) lk());
        LD("Range", "bytes=" + j + "-");
        if (TextUtils.isEmpty(this.OY)) {
            lxb.Lxb(this, new IOException("Url is Empty"));
            return;
        }
        try {
            lxb2.LD(this.OY);
            if (!TextUtils.isEmpty(this.JXs)) {
                lxb2.Lxb(this.JXs);
            }
            int i = this.lc;
            if (i > 0) {
                lxb2.Lxb(i);
            }
            Lxb(lxb2);
            this.lk.Lxb(lxb2.Lxb().LD()).Lxb(new com.bytedance.sdk.component.LD.Lxb.lk() { // from class: com.bytedance.sdk.component.ebl.LD.Lxb.1
                @Override // com.bytedance.sdk.component.LD.Lxb.lk
                public void Lxb(com.bytedance.sdk.component.LD.Lxb.LD ld2, IOException iOException) {
                    com.bytedance.sdk.component.ebl.Lxb.Lxb lxb3 = lxb;
                    if (lxb3 != null) {
                        lxb3.Lxb(Lxb.this, iOException);
                    }
                    Lxb.this.ZU();
                }

                @Override // com.bytedance.sdk.component.LD.Lxb.lk
                public void Lxb(com.bytedance.sdk.component.LD.Lxb.LD ld2, IeN ieN) throws IOException {
                    RandomAccessFile randomAccessFile;
                    long j2;
                    InputStream inputStreamLk;
                    byte[] bArr;
                    long j3;
                    int i2;
                    if (lxb == null) {
                        return;
                    }
                    HashMap map = new HashMap();
                    if (ieN == null) {
                        return;
                    }
                    lc lcVarEbl = ieN.ebl();
                    if (lcVarEbl != null) {
                        for (int i3 = 0; i3 < lcVarEbl.Lxb(); i3++) {
                            map.put(lcVarEbl.Lxb(i3), lcVarEbl.LD(i3));
                        }
                    }
                    com.bytedance.sdk.component.ebl.LD ld3 = new com.bytedance.sdk.component.ebl.LD(ieN.ZU(), ieN.lk(), ieN.JXs(), map, null, ieN.LD(), ieN.Lxb());
                    if (ieN.ZU()) {
                        long jLxb = ieN.lc().Lxb();
                        if (jLxb <= 0) {
                            jLxb = Lxb.lc(map);
                        }
                        boolean zJXs = Lxb.JXs(map);
                        int i4 = -1;
                        if (zJXs) {
                            jLxb += j;
                            String str = (String) map.get(HttpResponseHeader.ContentRange);
                            if (!TextUtils.isEmpty(str)) {
                                String str2 = "bytes " + j + "-" + (jLxb - 1);
                                if (TextUtils.indexOf(str, str2) == -1) {
                                    Lxb.this.ZU();
                                    com.bytedance.sdk.component.ebl.Lxb.Lxb lxb3 = lxb;
                                    Lxb lxb4 = Lxb.this;
                                    StringBuilder sbR = DM.r("The Content-Range Header is invalid Assume[", str2, "] vs Real[", str, "], please remove the temporary file [");
                                    sbR.append(Lxb.this.LD);
                                    sbR.append("].");
                                    lxb3.Lxb(lxb4, new IOException(sbR.toString()));
                                    return;
                                }
                            }
                        }
                        String str3 = "Rename fail";
                        if (jLxb > 0 && Lxb.this.LD.exists() && Lxb.this.LD.length() == jLxb) {
                            Lxb lxb5 = Lxb.this;
                            if (!lxb5.LD.renameTo(lxb5.Lxb)) {
                                lxb.Lxb(Lxb.this, new IOException("Rename fail"));
                                return;
                            } else {
                                ld3.Lxb(Lxb.this.Lxb);
                                lxb.Lxb(Lxb.this, ld3);
                                return;
                            }
                        }
                        InputStream inputStream = null;
                        try {
                            try {
                                randomAccessFile = new RandomAccessFile(Lxb.this.LD, "rw");
                                try {
                                    if (zJXs) {
                                        randomAccessFile.seek(j);
                                        j2 = j;
                                    } else {
                                        randomAccessFile.setLength(0L);
                                        j2 = 0;
                                    }
                                    while (true) {
                                        int i5 = inputStreamLk.read(bArr, i2, 16384 - i2);
                                        if (i5 != i4) {
                                            i2 += i5;
                                            String str4 = str3;
                                            j3 += (long) i5;
                                            if (j3 % PlaybackStateCompat.ACTION_PREPARE == 0 || j3 == jLxb - j) {
                                                randomAccessFile.seek(j2);
                                                randomAccessFile.write(bArr, 0, i2);
                                                j2 += (long) i2;
                                                i2 = 0;
                                            }
                                            if (Lxb.this.nBu) {
                                                throw new IOException("net is cancel");
                                            }
                                            str3 = str4;
                                            i4 = -1;
                                        } else {
                                            String str5 = str3;
                                            if (i2 != 0) {
                                                randomAccessFile.seek(j2);
                                                randomAccessFile.write(bArr, 0, i2);
                                            }
                                            if (!zJXs) {
                                                jLxb = Lxb.this.LD.length();
                                            }
                                            if (jLxb > 0 && Lxb.this.LD.exists() && Lxb.this.LD.length() == jLxb) {
                                                Lxb lxb6 = Lxb.this;
                                                if (lxb6.LD.renameTo(lxb6.Lxb)) {
                                                    ld3.Lxb(Lxb.this.Lxb);
                                                    lxb.Lxb(Lxb.this, ld3);
                                                } else {
                                                    lxb.Lxb(Lxb.this, new IOException(str5));
                                                }
                                            } else {
                                                com.bytedance.sdk.component.ebl.Lxb.Lxb lxb7 = lxb;
                                                Lxb lxb8 = Lxb.this;
                                                StringBuilder sb = new StringBuilder(" tempFile.length() == fileSize is");
                                                sb.append(Lxb.this.LD.length() == jLxb);
                                                lxb7.Lxb(lxb8, new IOException(sb.toString()));
                                            }
                                            try {
                                                inputStreamLk.close();
                                            } catch (Throwable unused) {
                                            }
                                            try {
                                                randomAccessFile.close();
                                                return;
                                            } catch (Throwable unused2) {
                                                return;
                                            }
                                        }
                                    }
                                } catch (Throwable unused3) {
                                }
                            } catch (Throwable unused4) {
                                randomAccessFile = null;
                            }
                            inputStreamLk = ieN.lc().lk();
                            if (Lxb.ebl(map) && !(inputStreamLk instanceof GZIPInputStream)) {
                                inputStreamLk = new GZIPInputStream(inputStreamLk);
                            }
                            bArr = new byte[16384];
                            j3 = 0;
                            i2 = 0;
                        } catch (Throwable th) {
                            try {
                                lxb.Lxb(Lxb.this, new IOException(th.getMessage()));
                                if (!zJXs) {
                                    Lxb.this.ZU();
                                }
                            } finally {
                                if (0 != 0) {
                                    try {
                                        inputStream.close();
                                    } catch (Throwable unused5) {
                                    }
                                }
                                try {
                                    randomAccessFile.close();
                                } catch (Throwable unused6) {
                                }
                            }
                        }
                    } else {
                        lxb.Lxb(Lxb.this, ld3);
                    }
                }
            });
        } catch (IllegalArgumentException unused) {
            lxb.Lxb(this, new IOException("Url is not a valid HTTP or HTTPS URL"));
        }
    }

    public com.bytedance.sdk.component.ebl.LD Lxb() {
        RandomAccessFile randomAccessFile;
        long j;
        InputStream inputStream;
        File file = this.Lxb;
        if (file == null || this.LD == null) {
            return null;
        }
        long j2 = 0;
        if (file.exists() && this.Lxb.length() != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.ebl.LD ld = new com.bytedance.sdk.component.ebl.LD(true, 200, "Success", null, null, jCurrentTimeMillis, jCurrentTimeMillis);
            ld.Lxb(this.Lxb);
            return ld;
        }
        long length = this.LD.length();
        if (length < 0) {
            length = 0;
        }
        NXR.Lxb lxb = new NXR.Lxb();
        lxb.Lxb((Object) lk());
        LD("Range", "bytes=" + length + "-");
        if (TextUtils.isEmpty(this.OY)) {
            return null;
        }
        try {
            lxb.LD(this.OY);
            Lxb(lxb);
            try {
                IeN ieNLD = this.lk.Lxb(lxb.Lxb().LD()).LD();
                if (ieNLD != null && ieNLD.ZU()) {
                    HashMap map = new HashMap();
                    lc lcVarEbl = ieNLD.ebl();
                    if (lcVarEbl != null) {
                        for (int i = 0; i < lcVarEbl.Lxb(); i++) {
                            map.put(lcVarEbl.Lxb(i), lcVarEbl.LD(i));
                        }
                    }
                    com.bytedance.sdk.component.ebl.LD ld2 = new com.bytedance.sdk.component.ebl.LD(ieNLD.ZU(), ieNLD.lk(), ieNLD.JXs(), map, null, ieNLD.LD(), ieNLD.Lxb());
                    long jLxb = ieNLD.lc().Lxb();
                    if (jLxb <= 0) {
                        jLxb = lc(map);
                    }
                    long length2 = this.LD.length();
                    boolean zJXs = JXs(map);
                    int i2 = -1;
                    if (zJXs) {
                        jLxb += length2;
                        String str = (String) map.get(HttpResponseHeader.ContentRange);
                        if (!TextUtils.isEmpty(str)) {
                            if (TextUtils.indexOf(str, "bytes " + length2 + "-" + (jLxb - 1)) == -1) {
                                Objects.toString(this.LD);
                                ZU();
                                return null;
                            }
                        }
                        j2 = 0;
                    }
                    if (jLxb > j2 && this.LD.exists() && this.LD.length() == jLxb) {
                        if (!this.LD.renameTo(this.Lxb)) {
                            return null;
                        }
                        ld2.Lxb(this.Lxb);
                        return ld2;
                    }
                    com.bytedance.sdk.component.ebl.LD ld3 = ld2;
                    try {
                        randomAccessFile = new RandomAccessFile(this.LD, "rw");
                        try {
                            if (zJXs) {
                                randomAccessFile.seek(length);
                                j = length;
                            } else {
                                randomAccessFile.setLength(0L);
                                j = 0;
                            }
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        randomAccessFile = null;
                    }
                    try {
                        InputStream inputStreamLk = ieNLD.lc().lk();
                        try {
                            if (ebl(map) && !(inputStreamLk instanceof GZIPInputStream)) {
                                inputStreamLk = new GZIPInputStream(inputStreamLk);
                            }
                            byte[] bArr = new byte[16384];
                            int i3 = 0;
                            long j3 = 0;
                            while (true) {
                                int i4 = inputStreamLk.read(bArr, i3, 16384 - i3);
                                if (i4 != i2) {
                                    i3 += i4;
                                    com.bytedance.sdk.component.ebl.LD ld4 = ld3;
                                    j3 += (long) i4;
                                    if (j3 % PlaybackStateCompat.ACTION_PREPARE == 0 || j3 == jLxb - length) {
                                        randomAccessFile.seek(j);
                                        randomAccessFile.write(bArr, 0, i3);
                                        j += (long) i3;
                                        i3 = 0;
                                    }
                                    if (this.nBu) {
                                        throw new IOException("net is cancel");
                                    }
                                    ld3 = ld4;
                                    i2 = -1;
                                } else {
                                    com.bytedance.sdk.component.ebl.LD ld5 = ld3;
                                    if (i4 != 0) {
                                        randomAccessFile.seek(j);
                                        randomAccessFile.write(bArr, 0, i3);
                                    }
                                    if (!zJXs || length == 0) {
                                        jLxb = this.LD.length();
                                    }
                                    if (jLxb > 0 && this.LD.exists() && this.LD.length() == jLxb) {
                                        if (this.LD.renameTo(this.Lxb)) {
                                            ld5.Lxb(this.Lxb);
                                            try {
                                                inputStreamLk.close();
                                            } catch (Throwable unused3) {
                                            }
                                            try {
                                                randomAccessFile.close();
                                            } catch (Throwable unused4) {
                                            }
                                            return ld5;
                                        }
                                        try {
                                            inputStreamLk.close();
                                        } catch (Throwable unused5) {
                                        }
                                        try {
                                            randomAccessFile.close();
                                            return null;
                                        } catch (Throwable unused6) {
                                            return null;
                                        }
                                    }
                                    this.LD.length();
                                    try {
                                        inputStreamLk.close();
                                    } catch (Throwable unused7) {
                                    }
                                    try {
                                        randomAccessFile.close();
                                        return null;
                                    } catch (Throwable unused8) {
                                        return null;
                                    }
                                }
                            }
                        } catch (Throwable unused9) {
                            inputStream = inputStreamLk;
                            if (!zJXs) {
                                try {
                                    ZU();
                                } finally {
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable unused10) {
                                        }
                                    }
                                    try {
                                        randomAccessFile.close();
                                    } catch (Throwable unused11) {
                                    }
                                }
                            }
                            try {
                                return null;
                            } catch (Throwable unused12) {
                                return null;
                            }
                        }
                    } catch (Throwable unused13) {
                        inputStream = null;
                    }
                }
            } catch (IOException unused14) {
                ZU();
            }
            return null;
        } catch (IllegalArgumentException unused15) {
            return null;
        }
    }
}
